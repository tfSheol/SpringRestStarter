package controller;

import com.google.gson.Gson;
import entity.HomeObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sheol on 9/26/17 at 4:47 PM
 * @project SpringRestStarter
 */
@RestController
public class Home {
    @RequestMapping("/")
    public String home() {
        Gson gson = new Gson();
        HomeObj homeObj = new HomeObj();
        homeObj.setId(1);
        homeObj.setTest("test");
        return gson.toJson(homeObj);
    }
}
