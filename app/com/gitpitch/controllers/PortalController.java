package com.gitpitch.controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * portal controller
 *
 * @author linux_china
 */
public class PortalController extends Controller {

    public Result index() {
        return ok(com.gitpitch.views.html.index.render());
    }
}
