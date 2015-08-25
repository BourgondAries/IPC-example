#include <iostream>
#include <fstream>

int main()
{
	std::fstream fifo("fifo", std::ios::in);
	int character;
	while ((character = fifo.get()) != -1)
	{
		std::cout << static_cast<char>(character);
	}
}
