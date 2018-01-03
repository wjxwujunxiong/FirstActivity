package com.example.administered.firstactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initFruits();
        RecyclerView recyclerView =(RecyclerView)findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,
                                                             StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
         for(int i = 0 ; i < 2 ;i++){
             Fruit apple = new Fruit(getRandomLangthName("Apple"),R.drawable.apple_pic);
             fruitList.add(apple);
             Fruit banana = new Fruit(getRandomLangthName("banana"),R.drawable.banana_pic);
             fruitList.add(banana);
             Fruit orange = new Fruit(getRandomLangthName("orange"),R.drawable.orange_pic);
             fruitList.add(orange)
             ;Fruit cherry = new Fruit(getRandomLangthName("cherry"),R.drawable.cherry_pic);
             fruitList.add(cherry);
             Fruit grape = new Fruit(getRandomLangthName("grape"),R.drawable.grape_pic);
             fruitList.add(grape);
             Fruit pear = new Fruit(getRandomLangthName("pear"),R.drawable.pear_pic);
             fruitList.add(pear);
             Fruit peach = new Fruit(getRandomLangthName("peach"),R.drawable.peach_pic);
             fruitList.add(peach);
             Fruit pineapple = new Fruit(getRandomLangthName("Apple"),R.drawable.pineapple_pic);
             fruitList.add(pineapple);
             Fruit watermelon = new Fruit(getRandomLangthName("watermelon"),R.drawable.watermelon_pic);
             fruitList.add(watermelon);
             Fruit strawberry = new Fruit(getRandomLangthName("strawberry"),R.drawable.strawberry_pic);
             fruitList.add(strawberry);
         }
    }

    private String getRandomLangthName(String name){
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < length ; i++){
            builder.append(name);
        }
        return builder.toString();
    }

}
