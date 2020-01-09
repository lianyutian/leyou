package com.leyou.item.controller;

import com.leyou.item.common.result.ResultBean;
import com.leyou.item.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 根据pid查询商品分类
     * @param pid 父商品分类id
     * @return List<Category> 子商品分类
     */
    @GetMapping("/list")
    @ResponseBody
    public ResultBean<List<Category>> queryCategoryByPid(@RequestParam("pid")Long pid) {
        return new ResultBean<List<Category>>(categoryService.queryCategoryByPid(pid));
    }
}
