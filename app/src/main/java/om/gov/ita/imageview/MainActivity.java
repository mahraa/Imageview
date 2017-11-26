package om.gov.ita.imageview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
   String[] name={"image1","image2","image3","image4",};
   int[] image={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
   ArrayList<HashMap<String,String>> arrayList;
   ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList=new ArrayList<>();
       list=(ListView) findViewById(R.id.simplelistView);
       for (int i=0;i<name.length;i++){
           HashMap<String,String>map=new HashMap();
           map.put("name",name[i]);
           map.put("image",image[i]+"");
           map.put("name1",name[i]);
           map.put("image1",image[i]+"");
           arrayList.add(map);
       }
       String[] nameKey={"name","image","name1","image1"};
        int[] listItem={R.id.textView,R.id.image,R.id.textView1,R.id.image2};
        SimpleAdapter adapter=new SimpleAdapter(this,arrayList,R.layout.list_item,nameKey,listItem);
        list.setAdapter(adapter);
    }
}
