package controllers;

/**
 * Created by maswang on 6/1/2016.
 */
import play.*;
import play.mvc.*;

@Check("admin")
@With(Secure.class)
public class Tags extends CRUD
{
}
