"use strict";

import { User } from "./User";

const API_URL = 'https://reqres.in/api/users?page=2';

export function makeGETRequest(url) {
  var xhr;

  if (window.XMLHttpRequest) {
    xhr = new XMLHttpRequest();
  } else if (window.ActiveXObject) {
    xhr = new ActiveXObject("Microsoft.XMLHTTP");
  }

  return new Promise((resolve, reject) => {
    if (xhr) {
      xhr.onreadystatechange = function () {
        if (xhr.readyState === 4) {
          resolve(xhr.responseText);
        }
      }
      xhr.open('GET', url, true);
      xhr.send();
    } else {
      reject('error');
    }
  })
}

export function makePOSTRequest(url, data) {
  var xhr;

  if (window.XMLHttpRequest) {
    xhr = new XMLHttpRequest();
  } else if (window.ActiveXObject) {
    xhr = new ActiveXObject("Microsoft.XMLHTTP");
  }

  return new Promise((resolve, reject) => {
    if (xhr) {
      xhr.onreadystatechange = function () {
        if (xhr.readyState === 4) {
          resolve(xhr.responseText);
        }
      }
      xhr.open('POST', url, true);
      xhr.setRequestHeader('Content-Type', 'application/json; charset=UTF-8');
      xhr.send(data);
    } else {
      reject('error');
    }
  })
}

export class Users {
  constructor() {
    this.users = [];
  }

  putArticle(article) {
    this.users.push(article);
  }

  fetchArticles = (cb) => {
    makeGETRequest(`${API_URL}/api/users?page=2`).then((articles) => {
      this.users = JSON.parse(articles);
    })
  }

  userData() {
    this.users.forEach(article => {
      const user = new User();
      user.setEmail(user.email);
      user.setFirstName(user.first_name);
      user.setLastName(user.last_name);
      user.setAvatar(user.avatar);
      this.arr.push(articleItem);
    })
    return this.arr;
  }
}
