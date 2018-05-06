package org.liveipool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liveipool on 2018/5/6.
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping("queryAll")
    @ResponseBody
    public List<Employee> queryAll(){
        List<Employee> list = new ArrayList<Employee>();
        list = employeeRepository.findAll();
        return list;
    }
    @Autowired
    private EmployeeRepository employeeRepository;
}
