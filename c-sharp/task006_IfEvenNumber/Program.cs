﻿// 6) Напишите программу, которая на вход принимает число и выдаёт, является ли число чётным (делится ли оно на два без остатка).

Console.Write("Напишите число:");
int number = int.Parse(Console.ReadLine());

if (number % 2 == 0) {
    Console.WriteLine($"Число {number} чётное");
}

else {
    Console.WriteLine($"Число {number} нечётное");
}
