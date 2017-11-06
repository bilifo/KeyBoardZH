package item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by PanJunLong on 2017/10/19.
 * 用于对应组合控件xml的类,尤其是解决adapter的item布局文件的对应类问题
 *
 * 使用方式:
 *      1/继承该布局,并修改泛型参数T为具体的数据类型
 *      2/实现3个抽象方法.在initView()里初始化各个控件.调用setData()对各个控件进行赋值
 *
 * 在adapter中的使用:
 *      public View getView(int position, View convertView, ViewGroup parent) {
 *          T t = getItem(position);
 *          ItemXmlClass mlistViewItem2 = null;
 *          if (convertView == null) {
 *              mlistViewItem2 = new ListViewItem(mContext);
 *          } else {
 *              mlistViewItem2 = (ListViewItem) convertView.getTag();
 *          }
 *          mlistViewItem2.setData(t);
 *          convertView = mlistViewItem2.getRootView();
 *          convertView.setTag(mlistViewItem2);
 *          return convertView;
 *          }
 */

public abstract class ItemXmlClass<T>  {

    Context mContext;
    int rootLayoutId;
    View rootview=null;


    public ItemXmlClass(Context context){
        mContext=context;
        this.rootLayoutId=getLayoutId();
        //inflate第一个参数就是要加载的布局id，第二个参数是指给该布局的外部再嵌套一层父布局，如果不需要就直接传null。
        rootview= LayoutInflater.from(mContext).inflate(getLayoutId(),null);

        initView(rootview);
    }


    /**
     * 初始化组合控件的各个控件
     *      例:imageview = rootview.findViewById(R.id.fragment_list_item_imageview);
     *          textview =rootview.findViewById(R.id.fragment_list_item_text);
     * @param rootview 组合控件所依存的总布局
     */
    public abstract void initView(View rootview) ;

    /**
     * 对各个控件进行数据处理或特异化处理
     *      例: textview.setText(data.getName());
     * @param data
     */
    public abstract void setData(T data);

    /**
     * 返回组合控件xml的layoutId值
     *      例:return R.layout.fragment_list_item;
     * @return
     */
    public abstract int getLayoutId();

    /**
     * 获得组合控件所依存的总布局
     * @return
     */
    public View getRootView(){
        return rootview;
    }

    /**
     * 获得context
     * @return
     */
    public Context getContext(){
        return mContext;
    }
}
