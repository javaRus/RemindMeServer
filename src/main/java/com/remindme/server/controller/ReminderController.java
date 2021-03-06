package com.remindme.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/reminder")
public class ReminderController {

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getReminder(ModelMap model) {
        return "My Reminder";
    }
}
