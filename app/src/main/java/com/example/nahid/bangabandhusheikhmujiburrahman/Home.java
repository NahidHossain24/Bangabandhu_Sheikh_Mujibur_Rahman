package com.example.nahid.bangabandhusheikhmujiburrahman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button bith, edu, poli, per,war, me, death;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bith=findViewById(R.id.btn_birth);
        bith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birth();
            }
        });

        poli=findViewById(R.id.btn_politics);
        poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Polii();
            }
        });

        per=findViewById(R.id.btn_personal);
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pers();
            }
        });

        war=findViewById(R.id.btn_mutkijuddho);
        war.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                War();
            }
        });

        me=findViewById(R.id.btn_me);
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AkashMe();
            }
        });

        death=findViewById(R.id.btn_mrittu);
        death.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Death();
            }
        });

        edu=findViewById(R.id.btn_education);
        edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Edu();
            }
        });
    }

    private void AkashMe() {
        Intent maskas=new Intent(this, Me.class);
        startActivity( maskas);
    }


    private void Death() {
        Intent mit=new Intent(this, Child.class);
        startActivity(mit);
    }

    private void War() {
        Intent war=new Intent(this, Indenpents.class);
        startActivity(war);
    }

    private void Pers() {
        Intent per=new Intent(this, MainActivity.class);
        startActivity(per);
    }

    private void Polii() {
        Intent pou=new Intent(this, Politics.class);
        startActivity(pou);

    }

    private void Edu() {
        Intent eduu=new Intent(this, Education.class);
        startActivity(eduu);
    }

    private void birth() {
        Intent bith=new Intent(this, nahid.class);
        startActivity(bith);
    }
}
