package com.javarush.task.task28.task2810.model;

import com.javarush.task.task28.task2810.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sorre on 10.10.2017.
 */
public class HHStrategy implements Strategy {
    private final String URL_FORMAT = "http://hh.ua/search/vacancy?text=java+%s&page=%d";



    protected Document getDocument(String searchString, int page) throws IOException {
        String url = String.format("%s?text=%s&page=%s",URL_FORMAT, searchString, page);
        return Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.110 Safari/537.36")
                .referrer("")
                .get();
    }


    @Override


    public List<Vacancy> getVacancies(String searchString)


    {
        List<Vacancy> list = new ArrayList<>();

        Document doc = null;
        try {
            for (int i = 0; true; i++) {
                doc = getDocument(searchString, i);

                if (doc == null) break;

                Elements vacancies = doc.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy");

                if (vacancies.size() == 0) break;

                for (Element e : vacancies) {
                    Vacancy vacancy = new Vacancy();
                    vacancy.setTitle(e.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-title").text());

                    vacancy.setSalary(e.getElementsByAttributeValue("data-qa", "class=b-vacancy-list-salary").text());
                    vacancy.setCity(e.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-address").text());

                    vacancy.setCompanyName(e.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-employer").text());
                    vacancy.setSiteName("http://hh.ua");
                    vacancy.setUrl("data-qa=vacancy-serp__vacancy-title");
                    list.add(vacancy);

                    String salary = e.getElementsByAttributeValue("class", "salary").text();
                    vacancy.setSalary(salary.length()==0 ? "" : salary);

                    String city = e.getElementsByAttributeValue("class", "location").text();
                    vacancy.setCity(city.length()==0 ? "" : city);
                }
            }
        } catch (IOException e) {
        } catch (NullPointerException npe) {
        }
        return list;
    }
}
