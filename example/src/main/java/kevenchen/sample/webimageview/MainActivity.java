package kevenchen.sample.webimageview;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;

import kevenchen.utils.WebImageView;


public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private SamplePagerAdapter mAdapter;
    private ArrayList<Integer> mImages;
    private ArrayList<String> mTitleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showWebImageView();
    }

    private void showWebImageView() {

        ((PagerTabStrip) findViewById(R.id.pagertitle)).setTabIndicatorColorResource(R.color.green);

        mImages = new ArrayList<>();
        mImages.add(R.layout.view_pager_item1);
        mImages.add(R.layout.view_pager_item2);
        mImages.add(R.layout.view_pager_item3);
        mImages.add(R.layout.view_pager_item4);
        mImages.add(R.layout.view_pager_item5);
        mImages.add(R.layout.view_pager_item6);
        mImages.add(R.layout.view_pager_item7);

        mTitleList = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.type)));

        mAdapter = new SamplePagerAdapter();
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mViewPager.setAdapter(mAdapter);
        mViewPager.setOffscreenPageLimit(7); // how many images to load into memory, set 1 to avoid out of memory
    }

    private class SamplePagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return mImages.size();
        }

        @Override
        public View instantiateItem(ViewGroup container, int position) {
            if (mImages != null && position < mImages.size()) {
                ViewGroup group = (ViewGroup)getLayoutInflater().inflate(mImages.get(position), container, false);
                WebImageView photoView = (WebImageView)group.findViewById(R.id.image);
                if (photoView != null)  {
                    //photoView.showImageUrl("http://pic1.win4000.com/wallpaper/5/54055707675cb.jpg");
                    //photoView.showLocalImage(R.raw.local_image);
                    photoView.setScrollParentView(mViewPager);
                }
                container.addView(group);
                return group;
            } else {
                return null;
            }
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitleList.get(position);
        }
    }
}