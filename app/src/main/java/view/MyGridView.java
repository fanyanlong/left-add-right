package view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * autour: 樊彦龙
 * date: 2017/10/20 13:29
 * update: 2017/10/20
 */
public class MyGridView extends GridView {
    public MyGridView(Context paramContext, AttributeSet paramAttributeSet) {
        super(paramContext, paramAttributeSet);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //makeMeasureSpec根据提供的大小值和模式创建一个测量值(格式)
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
