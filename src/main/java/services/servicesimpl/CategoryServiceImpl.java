package services.servicesimpl;

import entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.ICategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService{

    @Autowired
    ICategoryService iCategoryService;


    public List<Category> list() {
        return iCategoryService.list();
    }
}
