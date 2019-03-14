package sdu.cs.eakkapod.animalapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.FormatFlagsConversionMismatchException;

public class GameActivity extends AppCompatActivity {

    //Explicit
    Button      btn1,btn2,btn3,btn4;//ตัวแปลปุ่ม
    ImageView   questionImageView;  //ตัวแปลรูป
    ImageButton volumeImageButton;  //ตัวแปลรูปปุ่ม
    MediaPlayer mediaPlayer;        //ตัวแปลควบคัมการเล่นเสียง
    int         questionCount = 10;  //ตัวแปลกำหนดจำนวนข้อ
    ArrayList<Integer> qid = new ArrayList<>();//ตัวแปล Random โจทย์
    String answer;//ตัวแปลเก็บคำตอบ
    int score = 0;//ตัวแปลเก็บคะแนน


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //ผูกตัวแปรบน Java บน xml
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        questionImageView = findViewById(R.id.imvQuestion);
        volumeImageButton = findViewById(R.id.imbVolume);

        //กำหนดคำสั่งในการ Rendom โจทย์
        for (int i = 1; i <= questionCount; i++) {
            qid.add(i);//จองพื้นที่หน่วยความจำบน Memory
        }//End for
        Collections.shuffle(qid);//Set การ Random โจทย์
        setQeustion(qid.remove(0));//เมื่อ Random โจทย์ออกแล้ว ให้ pop ออกจาก Array

    }//End onCreate



    private void setQeustion(int qid) {//Method setQeution สำหรับคำถาม
        if (qid == 1) {
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.bird);//แสดงเสียงที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปล Choice เป็น Array สำหรับ Random Choice
            choice.add("นก");
            choice.add("หมา");
            choice.add("แมว");
            choice.add("ยุง");
            Collections.shuffle(choice);//กำหนดให้R andom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//End if

        if (qid == 2) {
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.cat);//แสดงเสียงที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปล Choice เป็น Array สำหรับ Random Choice
            choice.add("แมว");
            choice.add("หมา");
            choice.add("ช้าง");
            choice.add("วัว");
            Collections.shuffle(choice);//กำหนดให้R andom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//End if

        if (qid == 3) {
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.cow);//แสดงเสียงที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปล Choice เป็น Array สำหรับ Random Choice
            choice.add("วัว");
            choice.add("ช้าง");
            choice.add("แกะ");
            choice.add("ม้า");
            Collections.shuffle(choice);//กำหนดให้R andom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//End if
        if (qid == 4) {
            answer = "หมา";
            questionImageView.setImageResource(R.drawable.dog);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.dog);//แสดงเสียงที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปล Choice เป็น Array สำหรับ Random Choice
            choice.add("หมา");
            choice.add("ม้า");
            choice.add("แมว");
            choice.add("แกะ");
            Collections.shuffle(choice);//กำหนดให้R andom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//End if
        if (qid == 5) {
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant);//แสดงเสียงที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปล Choice เป็น Array สำหรับ Random Choice
            choice.add("ช้าง");
            choice.add("นก");
            choice.add("สิงโต");
            choice.add("หมู");
            Collections.shuffle(choice);//กำหนดให้R andom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//End if
        if (qid == 6) {
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.horse);//แสดงเสียงที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปล Choice เป็น Array สำหรับ Random Choice
            choice.add("ม้า");
            choice.add("หมา");
            choice.add("แกะ");
            choice.add("สิงโต");
            Collections.shuffle(choice);//กำหนดให้R andom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//End if
        if (qid == 7) {
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.lion);//แสดงเสียงที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปล Choice เป็น Array สำหรับ Random Choice
            choice.add("สิงโต");
            choice.add("ยุง");
            choice.add("แมว");
            choice.add("ช้าง");
            Collections.shuffle(choice);//กำหนดให้R andom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//End if
        if (qid == 8) {
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito);//แสดงเสียงที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปล Choice เป็น Array สำหรับ Random Choice
            choice.add("ยุง");
            choice.add("นก");
            choice.add("หมา");
            choice.add("วัว");
            Collections.shuffle(choice);//กำหนดให้R andom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//End if
        if (qid == 9) {
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.pig);//แสดงเสียงที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปล Choice เป็น Array สำหรับ Random Choice
            choice.add("หมู");
            choice.add("แกะ");
            choice.add("แมว");
            choice.add("ยุง");
            Collections.shuffle(choice);//กำหนดให้R andom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//End if
        if (qid == 10) {
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep);//แสดงเสียงที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปล Choice เป็น Array สำหรับ Random Choice
            choice.add("แกะ");
            choice.add("หมา");
            choice.add("ช้าง");
            choice.add("ม้า");
            Collections.shuffle(choice);//กำหนดให้R andom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//End if

    }//End setQeustion() method


    public void playSound(View view) {//เป็น Method สำหรับแสคงเสียง
        mediaPlayer.start();
    }//End playSound

    public void choiceAns(View view) {//เป็น Method สำหรับตรวจคำตอบ และรวมคะแนน
        Button button = (Button) view;
        String buttonSting = button.getText().toString();//เก็บข้อความบนปุ่มที่เลือก

        if (buttonSting.equals(answer)) {//ถ้าคำตอบที่เลือกตรงกับ answer
            score++;//เพิ่มที่ละ 1 คะแนน
        }

        if (qid.isEmpty()) {//ถ้าทำครบทุกข้อ
            Toast.makeText(getApplicationContext(), "คุณได้" + score + "คะแนน", Toast.LENGTH_SHORT).show();
            dialogboxScore();
        } else {//ถ้ายังทำไม่ครบทั้ง 10 ข้อ ให้ทำต่่อ
            setQeustion(qid.remove(0));

        }


    }//End choiceAns() method

    private void dialogboxScore() {//แสดงคะแนนในรูป dialogbox
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage("คุณได้ " + score + " คะแนน")
            .setCancelable(false)
            .setPositiveButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            })
            .setNegativeButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }//end dialogboxScore() method
}//End Class
