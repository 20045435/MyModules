package sg.edu.rp.c346.id20045435.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMod1, tvMod2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMod1 = findViewById(R.id.textViewModule1);
        tvMod2 = findViewById(R.id.textViewModule2);

        tvMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);

                intent.putExtra("ModuleCode", "C346");
                intent.putExtra("ModuleName", "Android Programming");
                intent.putExtra("AcademicYear", 2021);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "E62E");

                startActivity(intent);
            }
        });

        tvMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, ModuleDetailActivity.class);

                intent2.putExtra("ModuleCode", "C209");
                intent2.putExtra("ModuleName", "Advanced Object Oriented Programming");
                intent2.putExtra("AcademicYear", 2021);
                intent2.putExtra("Semester", 1);
                intent2.putExtra("ModuleCredit", 5);
                intent2.putExtra("Venue", "W65E");

                startActivity(intent2);
            }
        });
    }
}