package controllers;

/**
 * Created by maswang on 6/1/2016.
 */

import play.*;
import play.mvc.*;

/**
 * Created by maswang on 6/1/2016.
 */
@Check("admin")
@With(Secure.class)
public class Users extends CRUD {
}
