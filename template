#include <iostream>
template<typename T>
bool operator==(T const &x, T const &y) {
  return x.id_number_string == y.id_number_string;
}

struct student {
  std::string name;
  std::string id_number_string;
};

int main() {
  student a = {"Andy", "1234 123123"};
  student b = {"Andrew", "1234 123123"};
  student c = {"Andy", "1234123123"};
  std::cout << std::boolalpha << "Check result is: " << (a == b) << '\n';
  return 0;
}
