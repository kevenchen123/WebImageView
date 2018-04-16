package keven_chen.webimageviewlib;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class ViewPagerForWebImageView extends ViewPager {

    private boolean needResetTouch;

    public ViewPagerForWebImageView(Context context) {
        super(context);
    }

    public ViewPagerForWebImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                needResetTouch = true;
                break;
            }
            case MotionEvent.ACTION_MOVE: {
                if (needResetTouch) {
                    needResetTouch = false;
                    event.setAction(MotionEvent.ACTION_DOWN);
                }
                break;
            }
        }
        return super.onInterceptTouchEvent(event);
    }
}