Александар Јовановски 223135

2.CFG 
![333907778-a9c40373-9b51-46b5-bf3d-6e9ab4a2522c](https://github.com/Aleksandarj03/SI_2024_lab2_223135/assets/138524804/9d9a6044-513f-43fb-9e4c-6f8ac514e6b2)
![333907800-396ffd95-49be-471a-bb9f-972100a42231](https://github.com/Aleksandarj03/SI_2024_lab2_223135/assets/138524804/caeaf6a3-2292-4a58-b2c8-d6201900753d)
![333907862-700a9577-5337-4406-8952-d9fa2f4f02fc](https://github.com/Aleksandarj03/SI_2024_lab2_223135/assets/138524804/28af4e0a-ca83-4eeb-9872-2bf6fc5216f8)


3.Цикломатската комплексност на овој граф изнесува 10 добиена како 9(број на предикатни јазли)+1.


4.Објаснување на напишаните тестови 
![333908160-92f6b64f-f2b6-4db7-b418-a476a7e0f673](https://github.com/Aleksandarj03/SI_2024_lab2_223135/assets/138524804/6d4c87af-45c6-4691-b7af-926105f37e19)

1. Items=null, payment=any

Се праќа null елемент и се очекува RuntimeException

2. Items=new Item(null,"1D82",100,0, payment=any

Се праќа елемент каде баркодот содржи невалиден карактер и се очекува RuntimeException().

3. Items=( new Item("random",null,100,0)), payment=any

Се праќа елемент каде баркодот е null и се очекува RuntimeException().

4. Items=(new Item("random1","1234",100,0), new Item("random2","0234",100, 0.5F)),payment=500

Се испраќаат елементи чиј збир на цените со пресметан попуст е помал од payment и се очекува True.

5. Items=(new Item("random2","1234",100, 0.5F),new Item("random2","0234",100, 0.5F)), payment=0

Се испраќаат истите елементи како претходно но сега payment e 0 па се очекува false.

5.Oбјаснување на напишаните тестови

if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')

1. Комбинација FXX:

Се испраќа елемент каде price<300, се очекува изразот да врати false бидејќи ако било кој од условите во изразот е false и самиот израз ќе врати false.

2. Комбинација TFX:

Се испраќа елемент каде price>300 но discount=0 и се очекува изразот повторно да врати false.

3. Комбинација TTF:

Се испраќа елемент каде price>300 и discount=0 но првиот карактер од баркодот е различен од 0, се очекува повторно изразот да врати false.

4. Комбинација TTT:

Се испраќа елемент каде price>300 и discount=0 и првиот карактер од баркодот е 0, се очекува овој израз да врати true.
