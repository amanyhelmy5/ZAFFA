package com.example.mbmbmb.zaffa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mbmbmb on 7/11/2017.
 */
public class Home extends Fragment {
    ImageView imageView,imageView1,image2,image3,image4;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.home, container, false);

        imageView=(ImageView)rootView.findViewById(R.id.image1);
        imageView1=(ImageView)rootView.findViewById(R.id.image);
        image2=(ImageView)rootView.findViewById(R.id.image2);
        image3=(ImageView)rootView.findViewById(R.id.image3);

        textView=(TextView)rootView.findViewById(R.id.text);
image2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        imageView1.setImageResource(R.drawable.twoi);

        textView.setText("من المفترض أن يتم تقييم المبلغ المتوافر، أو الذي سيتوافر قبل موعد الزفاف، وعليه يتم توزيعه على جميع مستلزمات العرس ومن بينها القاعة.\n" +
                "\n" +
                "مع تحديد الميزانية يتم تحديد عدد المعازيم؛ لتبدأ عملية البحث عن القاعة المناسبة من حيث السعر والحجم، يعتمد الكثير من الأشخاص على منظمي الحفلات في هذه المرحلة، أو بإمكانهم الاقتصاد في المصاريف باستبعاد هذه الخطوة");
    }
});
 image3.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         imageView1.setImageResource(R.drawable.threei);
textView.setText("تأكدوا من خلو القاعة من الأعمدة التي تحجب رؤية الحضور، وفي حال وجدت الأعمدة في الصالة تأكدوا من وجود شاشات كبيرة موزعة على كامل أنحاء القاعة؛ كي يتمكن الجميع من الاستمتاع بتفاصيل الحفل، ويجب الابتعاد عن القاعات مع أعمدة في حال كان عدد المعازيم كبيراً.");
     }
 });
imageView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        imageView1.setImageResource(R.drawable.onei);
        textView.setText("الميزانية\n" +
                "\n" +
                "تعد هذه الخطوة هي الأهم، ومن المفترض أن يتم تقييم المبلغ المتوافر، أو الذي سيتوافر قبل موعد الزفاف، وعليه يتم توزيعه على جميع مستلزمات العرس ومن بينها القاعة.\n" +
                "\n" +
                "مع تحديد الميزانية يتم تحديد عدد المعازيم؛ لتبدأ عملية البحث عن القاعة المناسبة من حيث السعر والحجم، يعتمد الكثير من الأشخاص على منظمي الحفلات في هذه المرحلة، أو بإمكانهم الاقتصاد في المصاريف باستبعاد هذه الخطوة.\n" +
                "\n" +
                "البحث عن القاعة\n" +
                "\n" +
                "بعد تحديد العدد التقريبي للمعازيم بالتنسيق مع منظم الحفلات، يبدأ العروسان بحصر الخيارات المتوافرة لديهم من قاعات؛ فلا ضير بجولة سريعة على القاعات المقترحة؛ حيث سيُطرح أول سؤال: كم هو عدد المعازيم؟ وعليه يتم تقييم إن كانت القاعة ستسعهم أم لا.\n" +
                "\n" +
                "ما يجب توافره في القاعة:\n" +
                "\n" +
                "Theme\n" +
                "\n" +
                "يسعى كل عروسين لتمييز حفل زفافهم عما سواه باختيار Theme يطغى على كامل ديكور قاعة الزفاف، مثل الزفاف الكلاسيكي الفاخر، أو الزفاف «الكاجول» الغني بالألوان الفرحة مع ستايل محدد، وغيرها من الخيارات.\n" +
                "\n" +
                "تحديد مكان «الكوشة»\n" +
                "\n" +
                "أولاً، يجب تحديد مكان جلوس العروسين «المنصة أو الكوشة» بحيث تتمركز في صدر القاعة وفي المكان الأكثر جذباً للأنظار؛ بحيث يستطيع جميع الحضور متابعة تفاصيل الحفل بكل راحة. كذلك يجب اختيار المنصة المخصصة للفرقة الموسيقية أو الفنان في حال وجدوا في مكان مناسب.\n" +
                "\n" +
                "الزفة\n" +
                "\n" +
                "تحتوي جميع القاعات غالباً على أكثر من مدخل؛ لذلك ألقوا نظرة على هذه المداخل لاختيار المدخل الأنسب لدخول الزفة؛ بحيث يكون الممر أو المدخل واسعاً بما فيه الكفاية للفرقة والعروسين والأقارب، تأكدوا إن كان مناسباً لما تحلمون به أم لا.");
    }});
        return rootView;
    }


}
