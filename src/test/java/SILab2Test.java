import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SILab2Test {
    @Test
    public void everyBranchTest(){

        //1
        List<Item> Items= null;
        assertThrows(RuntimeException.class,()->SILab2.checkCart(Items,100));

        //2
        Item itemCase2=new Item(null,"1D82",100,0);
        List<Item> Items2 =List.of(itemCase2);
        assertThrows(RuntimeException.class,()->SILab2.checkCart(Items2,200));

        //3
        Item itemCase3 =new Item("random",null,100,0);
        List<Item>Items3=List.of(itemCase3);
        assertThrows(RuntimeException.class,()->SILab2.checkCart(Items3,300));

        //4
        Item item1Case4=new Item("random1","1234",100,0);
        Item item2Case4=new Item("random2","0234",100, 0.5F);
        List<Item>Items4=List.of(item1Case4,item2Case4);
        assertTrue(SILab2.checkCart(Items4,500));

        //5
        Item item1Case5=new Item("random1","1234",100,0);
        Item item2Case5=new Item("random2","0234",100, 0.5F);
        List<Item>Items5=List.of(item1Case5,item2Case5);
        assertFalse(SILab2.checkCart(Items4,0));

    }
    @Test
    public void multipleConditionTest(){
        // TESTING NODE - S
        //[S:FXX]
        Item itemCase6_1=new Item("random","1234",100,0);
        List<Item>Items6_1=List.of(itemCase6_1);
        assertFalse(SILab2.checkCart(Items6_1,500));

        //[S:TFX]
        Item itemCase6_2=new Item("random","1234",320,0);
        List<Item>Items6_2=List.of(itemCase6_2);
        assertTrue(SILab2.checkCart(Items6_2,500));

        //[S:TTF]
        Item itemCase6_3=new Item("random","1234",320,(float)0.5);
        List<Item>Items6_3=List.of(itemCase6_3);
        assertTrue(SILab2.checkCart(Items6_3,500));

        //[S:TTT]
        Item itemCase6_4=new Item("random","0234",320,(float)0.5);
        List<Item>Items6_4=List.of(itemCase6_4);
        assertTrue(SILab2.checkCart(Items6_4,500));
    }


}
