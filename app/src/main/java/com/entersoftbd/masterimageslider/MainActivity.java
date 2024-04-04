package com.entersoftbd.masterimageslider;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.entersoftbd.imageslider_android.ImageSlider;
import com.entersoftbd.imageslider_android.constants.ScaleTypes;
import com.entersoftbd.imageslider_android.models.SlideModel;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageSlider = findViewById(R.id.image_slider);
        ArrayList<SlideModel> imageList = new ArrayList<>(); // Create image list

// imageList.add(new SlideModel("String Url" or R.drawable));
// imageList.add(new SlideModel("String Url" or R.drawable, "title")); You can add title

        imageList.add(new SlideModel("https://th.bing.com/th/id/OIP.sDT2vsZekV4j8-X38whEdgHaCu?rs=1&pid=ImgDetMain", "The Pets & Animals population decreased by 58 percent in 42 years.",ScaleTypes.FIT));
        imageList.add(new SlideModel("https://reddragonsmedia.com/wp-content/uploads/2021/07/Weird-cute-crazy-eyes-15-800x445.jpg", "Red Dragons Media - Creating Beautiful Websites Since 2010",ScaleTypes.FIT));
        imageList.add(new SlideModel("https://th.bing.com/th/id/R.2ba3a2761ff6f70c26ed5a6b652bf9f1?rik=%2fTHpPGhQdwavGg&pid=ImgRaw&r=0", "No two of our Grant's Zebras have the same striping pattern.",ScaleTypes.FIT));
        imageList.add(new SlideModel("https://bit.ly/3fLJf72", "And people do that.",ScaleTypes.FIT));


        imageSlider.setImageList(imageList,ScaleTypes.FIT);


    }
}