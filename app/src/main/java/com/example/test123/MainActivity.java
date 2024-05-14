package com.example.test123;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private Fragment_one fragment_one;
    private Fragment_two fragment_two;
    private Fragment_three fragment_three;
    private Fragment_four fragment_four;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    Button bt_f1, bt_f2, bt_f3,bt_f4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_f1 = findViewById(R.id.bt_f1);
        bt_f2 = findViewById(R.id.bt_f2);
        bt_f3 = findViewById(R.id.bt_f3);
        bt_f4 = findViewById(R.id.bt_f4);
        fragmentManager = getSupportFragmentManager();
        bt_f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction = fragmentManager.beginTransaction();
                if (fragment_one == null){
                    fragment_one = new Fragment_one();
                }
                if (fragment_two != null){
                    fragmentTransaction.hide(fragment_two);
                }
                if (fragment_three != null){
                    fragmentTransaction.hide(fragment_three);
                }

                if (fragment_four != null){
                    fragmentTransaction.hide(fragment_four);
                }
                if (fragment_one.isAdded()){
                    fragmentTransaction.show(fragment_one);
                } else{
                    fragmentTransaction.add(R.id.fragmentContainerView, fragment_one).show(fragment_one);
                }
                fragmentTransaction.commit();
            }
        });
        bt_f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction = fragmentManager.beginTransaction();
                if (fragment_two == null){
                    fragment_two = new Fragment_two();
                }
                if (fragment_one != null){
                    fragmentTransaction.hide(fragment_one);
                }
                if (fragment_three != null){
                    fragmentTransaction.hide(fragment_three);
                }
                if (fragment_four != null){
                    fragmentTransaction.hide(fragment_four);
                }
                if (fragment_two.isAdded()){
                    fragmentTransaction.show(fragment_two);
                } else{
                    fragmentTransaction.add(R.id.fragmentContainerView, fragment_two).show(fragment_two);
                }
                fragmentTransaction.commit();
            }
        });
        bt_f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction = fragmentManager.beginTransaction();
                if (fragment_three == null){
                    fragment_three = new Fragment_three();
                }
                if (fragment_four != null){
                    fragmentTransaction.hide(fragment_four);
                }
                if (fragment_one != null){
                    fragmentTransaction.hide(fragment_one);
                }
                if (fragment_two != null){
                    fragmentTransaction.hide(fragment_two);
                }

                if (fragment_three.isAdded()){
                    fragmentTransaction.show(fragment_three);
                } else{
                    fragmentTransaction.add(R.id.fragmentContainerView, fragment_three).show(fragment_three);
                }
                fragmentTransaction.commit();
            }
        });
        bt_f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction = fragmentManager.beginTransaction();
                if (fragment_four == null){
                    fragment_four = new Fragment_four();
                }
                if (fragment_one != null){
                    fragmentTransaction.hide(fragment_one);
                }
                if (fragment_two != null){
                    fragmentTransaction.hide(fragment_two);
                }
                if (fragment_three != null){
                    fragmentTransaction.hide(fragment_three);
                }

                if (fragment_four.isAdded()){
                    fragmentTransaction.show(fragment_four);
                } else{
                    fragmentTransaction.add(R.id.fragmentContainerView, fragment_four).show(fragment_four);
                }
                fragmentTransaction.commit();
            }
        });
    }
}