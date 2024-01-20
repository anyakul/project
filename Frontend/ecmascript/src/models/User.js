"use strict";

export class User {
  constructor() {
    this.id;
    this.email;
    this.first_name;
    this.last_name;
    this.avatar;
  }

  getId() {
    return this.id;
  }

  getEmail() {
    return this.email;
  }

  getFirstName() {
    return this.first_name;
  }

  getLastName() {
    return this.last_name;
  }

  getAvatar() {
    return this.avatar;
  }

  setId(id) {
    this.id = id;
  }

  setFirstName(name) {
    this.first_name = name;
  }

  setLastName(name) {
    this.last_name = name;
  }

  setAvatar(avatar) {
    this.avatar = avatar;
  }
}
