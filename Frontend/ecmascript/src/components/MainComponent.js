"use strict";

const main = document.querySelector(".main__container");

const makeTemplateGenerator = (generator) => {
  const reduceValues = (template, value, index) => {
    template += generator(value, index);
    return template;
  };

  return (values) => values.reduce(reduceValues, ``);
};

const createUserTemplates = makeTemplateGenerator(({ title, price }) => (
  `<ul class="user_list">
    <li class="user__item">
      ${user.email}
      ${user.first_name}
      ${user.last_name}
      ${user.avatar}
    </li>
  </ul>`
));

export class MainComponent {
  getTemplate(users) {
    text.innerHTML = createUserTemplates();
    main.append(users);
  }
}
