# Java_is_simple

# 1. 클래스만 사용
- Accounting클래스에서 더블형 변수 공급가액(valueOfSupply), 부가세율(vatRate)를 선언한다.
- getVAT(), getTotal() 메서드를 선언한다.
![image](https://user-images.githubusercontent.com/122009563/225314694-fb836500-5d7a-41c2-a498-21fedc3a108d.png)

- 번거롭고 버그가 걸릴 확률이 높아진다.
![image](https://user-images.githubusercontent.com/122009563/225476194-d1558478-b8b7-4305-ac93-aa65b71ba76d.png)

# 2. 클래스, 인스턴스 사용
- 1번과 마찬가지로 변수,메서드를 선언하고 부가세율(vatRate)를 제외한 나머지 메서드, 변수의 static을 지워준다.
- static을 지워주는 이유는 static은 Accounting클래스 소속인데 이 클래스가 인스턴스 변수인 공급가액(valueOfSupply)와 접근하려면 어떤 인스턴스 변수 공급가액(valueOfSupply)인지 모르기 때문이다.
![image](https://user-images.githubusercontent.com/122009563/225320307-7333c3b0-21d3-4cd6-a425-c6cad0ddb42b.png)
- 인스턴스 변수 a1, a2를 사용하여 1번 코드보다 훨씬 깔끔하고 버그가 걸릴 확률이 줄어든다.
# 3. 클래스, 인스턴스, 생성자, 매개변수 사용
- 1,2번과 같은 변수, 메서드를 선언하고 생성자를 사용한다.
- 생성자는 간단하게 말하면 인스턴스 초기화 메소드이다. 따라서 인스턴스 변수의 초기화 작업에 사용된다.
- Accounting클래스에 생성자를 만들어 매개변수로 공급가액(valueOfSUpply)을 받는다.
- 그러면 생성자에서 변수명이 겹치는데 이때 this를 사용하면 구분하기 쉽다.

![image](https://user-images.githubusercontent.com/122009563/225330016-338082f5-1916-48e0-ba51-a8cff928b7fb.png)
