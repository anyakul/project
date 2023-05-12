ПРИЛОЖЕНИЕ СПИСОК ДЕЛ

Д/з 6. Реализуйте по одному паттерну не рассмотренных на этом занятии из каждой группы (один порождающий, один структурный и один поведенческий).

ПАТТЕРН СОЗДАНИЯ ОБЪЕКТА FACTORY METHOD

Factory Method. для создания файлов в формате xml, txt

Использован паттерн Factory. В методе FilePresenter.WriteFile() создаётся объект FileFactory, вызывается его метод GetWriter передавая тип файла (объект наследник AbstractFile).

В FileFactory метод GetWriter возвращает наследника AbstractWriter (TxtWriter или XmlWriter) проверяя переданный объект на принадлежность объекта. Вызывает метод Write от этого наследника.

TxtWriter.write и XmlWriter.write записывает файл в xml и txt формате.

ПАТТЕРН ПОВЕДЕНЧЕСКИЙ STRATEGY

Создан класс ActionReceiver, в котором расписаны методы, создающие классы Actions и вызывающий их методы RunAction и RunChangeAction, и если вызван второй метод - в нём при успешном выполнении вызывается метод FilePresenter.WriteFile для обновления файлов.

В RunAction создан экземпляр ActionReceiver, метод RunAction предлагает пользователю выбрать действие и вызывает соответствующий метод класса ActionReceiver.

д/з 5.

Запускающий файл находится в файле Client/Program.java, в нём запускается метод ClickButton() из файла UI/APP.java.

1) Чтение файла и создание списка дел.

В меоде ClickButton создается экземпляр FilePresenter (Core/MVP/FilePresenter). Вызывается метод LoadFromFile(), который возвращает задачи Tasks (Core/Infrastructure/Tasks.java).

Для этого создаётся экземпляр ListFile (Core/Models/ListFile.java) в котором getReader создает и возвращает объект для чтения файла BufferedReader.

2) Показ меню программы

В файле App.java создается экземпляр RunActions (UI/RunActions), предназначенный для показа и запуска доступных действий. В нём два метода - RunAction и RunAddItemAction. Конструктор принимает FilePresenter, создаётся объект MenuPresenter (Core/MVP/Presenters/MenuPresenter.java).

В Menu (Core/MVP/Models/Menu.java) задаётся список возможных действий (SetMenu).

В MenuPresenter создаётся объект MenuView (Core/MVP/Views/MenuView.java). Метож GetMenuStr показывает список возможных действий из Menu создавая этот объект и вызывая метод getMenu(). Метод GetMenuStrIfEmptyList возможен только один метод - добавление задачи, метод показывает сообщение о добавлении задачи.

В MenuPresenter метод ShowMenu принимает boolean значение и в зависимости от этого вызывает функции getMenu если false и GetMenuStrIfEmpty если true.

Если метод LoadFromFile не возвращает tasks - вызывается метод RunAddItemAction. Этот метод вызывает метод showMenu класса MenuPresenter и передаёт true. В противном случае - вызывается метод RunAction и в showMenu передаёт значение false.

3) Запуск доступных действий и обновление файла с задачами

см. ПАТТЕРН Command вначале

4) Описание доступных действий

Основа для выполняемых действий записана в объекте Tasks - в нём методы поиска задачи, редактирования, добавления, удаления, и списка задач. Строка показывающая информацию о задаче задана в методе Task.toString.

В классе TaskView (Core/MVP/Views/TaskView.java) методы ViewTask и ViewTasks принимают и распечатывает в консоли задачу или список задач.

В абстрактном классе ActionPresenter в конструкторе определяется scanner и tasks. 

Наследники - GetListAction получат список задач (Tasks.getTasks) и передает во ViewTasks

GetItemAction в котором метод GetTask возвращает задачу если она найдена (метод Tasks.getTask) и передаёт её в TaskView. RunAction запускает метод GetTask.

В AddItemActionView метод GetTask предлагает пользователю добавить новую задачу и возвращает её. RunAction вызывает Tasks.AddTask, если успешно - добавляет и сообщает об этом вернув true.

Наследники у GetItemAction - RemoveItemAction. RunAction предлагает пользователю найти задачу для удаления, вызывает метод Tasks.RemoveTask, в случае успешного удаления передаёт в TaskView новый список задач.

В EditItemAction метод EditItemKey - предлагает ввести редактируемый ключ, EditItemVal - новое значение. RunAction предлигоет пользователю найти задачу которую редактировать, если найдена - ввести ключ, если ключ возможен - ввести значение. После вызывает Tasks.EditTask с соответствующими аргументами.

5) Запись файлов

см. ПАТТЕРН Factory Method
