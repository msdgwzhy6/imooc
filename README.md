# imooc
![home_page](https://cloud.githubusercontent.com/assets/19148112/24736050/7473d40a-1ab8-11e7-9314-945b02cf0493.jpg)

>1、组件化开发  

**新建module，已将Okhttp，Universal-imageloader封装成为公用的组件**    </br>
可封装成sdk，供其他app使用。封装的思想会贯穿整个开发。

>2、home界面开发。  </br>

**viewpager+fragment结构**   左右滑动切换界面   </br>

**a、home tab页面的开发**     </br>

RecyclerView控件，封装公用的Adapter统一首次加载，加载下一页，没有数据的UI展示。  </br>
```
public class BaseRecyclerViewAdapter extends RecyclerView.Adapter {

    private static final int VIEW_TYPE_NODATA = 0;
    private static final int VIEW_TYPE_FIRST_LOADING = 1;
    private static final int VIEW_TYPE_NEXT_LOADING = 2;
... ...
}
```
**单图和多图的item封装自定义view。  **</br>

**轮播图片采用三方开源库：AutoScrollViewPager和CirclePageIndicator。 ** </br>
**分割线参用自定义RecyclerView.ItemDecoration。**  </br>


>3、点击反馈，Android5.0后的点击波浪纹效果。  </br>

>4、优化  </br>

>5、服务器数据：暂时采用Charles代理请求json。  </br>
