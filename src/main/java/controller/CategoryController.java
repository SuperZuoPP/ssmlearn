package controller;

import entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import services.ICategoryService;

import java.util.List;

@Controller
@RequestMapping("")
public class CategoryController {

    @Autowired
    ICategoryService iCategoryService;

    @RequestMapping("listCategory")
    public ModelAndView listCategory(){
        ModelAndView mav = new ModelAndView();
        List<Category> cs = iCategoryService.list();
        mav.addObject("cs",cs);
        mav.setViewName("listCategory");
        return mav;
    }

}
