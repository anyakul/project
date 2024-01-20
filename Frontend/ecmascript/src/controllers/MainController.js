"use strict";

import { MainComponent } from "../components/MainComponent";
import { Users } from "../models/Users";

export class MainController {

  do() {
    let users = new Users();
    let users_arr = users.getUserData;

    let mainComponent = new MainComponent();
    mainComponent.getTemplate(users_arr);
  }
}
