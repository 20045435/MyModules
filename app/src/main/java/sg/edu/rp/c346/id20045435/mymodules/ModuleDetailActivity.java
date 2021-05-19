package sg.edu.rp.c346.id20045435.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode, tvName, tvYear, tvSemester, tvCredit, tvVenue;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSemester = findViewById(R.id.textViewSemester);
        tvCredit = findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);

        Intent intentReceived = getIntent();

        String moduleCode = intentReceived.getStringExtra("ModuleCode");
        String moduleName = intentReceived.getStringExtra("ModuleName");
        int academicYear = intentReceived.getIntExtra("AcademicYear", 2020);
        int semester = intentReceived.getIntExtra("Semester", 0);
        int moduleCredit = intentReceived.getIntExtra("ModuleCredit", 0);
        String venue = intentReceived.getStringExtra("Venue");

        tvCode.setText("Module Code: " + moduleCode);
        tvName.setText("Module Name: " + moduleName);
        tvYear.setText("Academic Year: " + academicYear);
        tvSemester.setText("Semester: " + semester);
        tvCredit.setText("Module Credit: " + moduleCredit);
        tvVenue.setText("Venue: " + venue);

        // ENHANCEMENT
        btnReturn = findViewById(R.id.buttonReturn);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}