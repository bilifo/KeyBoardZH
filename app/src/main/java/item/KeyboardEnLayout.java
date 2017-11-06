package item;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.View;

import com.setproject.bilifo.keyboard.R;
import com.setproject.bilifo.keyboard.databinding.EnKeyboardLayoutBinding;


/**
 * Created by PanJunLong on 2017/11/2.
 */

public class KeyboardEnLayout extends ItemXmlClass implements View.OnClickListener {
//    private Button q, w, e, r, t, y, u, i, o, p,
//            a, s, d, f, g, h, j, k, l,
//            z, x, c, v, b, n, m,
//            num1, num2, num3, num4, num5, num6, num7, num8, num9, num0,
//            enter, del, space;

    public KeyboardEnLayout(Context context) {
        super(context);
    }

    private EnKeyboardLayoutBinding en_keyboard;

    @Override
    public void initView(View rootview) {
        //findview简直是灾难,用databinding代替
//        q=rootview.findViewById(R.id.key_q_en);
//        w=rootview.findViewById(R.id.key_w_en);
//        e=rootview.findViewById(R.id.key_e_en);
//        r=rootview.findViewById(R.id.key_r_en);
//        t=rootview.findViewById(R.id.key_t_en);
//        y=rootview.findViewById(R.id.key_y_en);
//        u=rootview.findViewById(R.id.key_u_en);
//        i=rootview.findViewById(R.id.key_i_en);
//        o=rootview.findViewById(R.id.key_o_en);
//        p=rootview.findViewById(R.id.key_p_en);
//
//        a=rootview.findViewById(R.id.key_a_en);
//        s=rootview.findViewById(R.id.key_s_en);
//        d=rootview.findViewById(R.id.key_d_en);
//        f=rootview.findViewById(R.id.key_f_en);
//        g=rootview.findViewById(R.id.key_g_en);
//        h=rootview.findViewById(R.id.key_h_en);
//        j=rootview.findViewById(R.id.key_j_en);
//        k=rootview.findViewById(R.id.key_k_en);
//        l=rootview.findViewById(R.id.key_l_en);
//
//        z=rootview.findViewById(R.id.key_z_en);
//        x=rootview.findViewById(R.id.key_x_en);
//        c=rootview.findViewById(R.id.key_c_en);
//        v=rootview.findViewById(R.id.key_v_en);
//        b=rootview.findViewById(R.id.key_b_en);
//        n=rootview.findViewById(R.id.key_n_en);
//        m=rootview.findViewById(R.id.key_m_en);
//
//        num0=rootview.findViewById(R.id.key_0_en);
//        num1=rootview.findViewById(R.id.key_1_en);
//        num2=rootview.findViewById(R.id.key_2_en);
//        num3=rootview.findViewById(R.id.key_3_en);
//        num4=rootview.findViewById(R.id.key_4_en);
//        num5=rootview.findViewById(R.id.key_5_en);
//        num6=rootview.findViewById(R.id.key_6_en);
//        num7=rootview.findViewById(R.id.key_7_en);
//        num8=rootview.findViewById(R.id.key_8_en);
//        num9=rootview.findViewById(R.id.key_9_en);
//
//        enter=rootview.findViewById(R.id.key_enter_en);
//        del=rootview.findViewById(R.id.key_delele_en);
//        space=rootview.findViewById(R.id.key_space_en);

        en_keyboard = DataBindingUtil.bind(rootview);

    }

    @Override
    public void setData(Object data) {

    }

    @Override
    public int getLayoutId() {
        return R.layout.en_keyboard_layout;
    }

    @Override
    public void onClick(View v) {
        if (v == en_keyboard.key0En) {
        } else if (v == en_keyboard.key1En) {
        } else if (v == en_keyboard.key2En) {
        } else if (v == en_keyboard.key3En) {
        } else if (v == en_keyboard.key4En) {
        } else if (v == en_keyboard.key5En) {
        } else if (v == en_keyboard.key6En) {
        } else if (v == en_keyboard.key7En) {
        } else if (v == en_keyboard.key8En) {
        } else if (v == en_keyboard.key9En) {

        } else if (v == en_keyboard.keyAEn) {
        } else if (v == en_keyboard.keyBEn) {
        } else if (v == en_keyboard.keyCEn) {
        } else if (v == en_keyboard.keyDEn) {
        } else if (v == en_keyboard.keyEEn) {
        } else if (v == en_keyboard.keyFEn) {
        } else if (v == en_keyboard.keyGEn) {
        } else if (v == en_keyboard.keyHEn) {
        } else if (v == en_keyboard.keyIEn) {
        } else if (v == en_keyboard.keyJEn) {
        } else if (v == en_keyboard.keyKEn) {
        } else if (v == en_keyboard.keyLEn) {
        } else if (v == en_keyboard.keyMEn) {
        } else if (v == en_keyboard.keyNEn) {
        } else if (v == en_keyboard.keyOEn) {
        } else if (v == en_keyboard.keyPEn) {
        } else if (v == en_keyboard.keyQEn) {
        } else if (v == en_keyboard.keyREn) {
        } else if (v == en_keyboard.keySEn) {
        } else if (v == en_keyboard.keyTEn) {
        } else if (v == en_keyboard.keyUEn) {
        } else if (v == en_keyboard.keyVEn) {
        } else if (v == en_keyboard.keyWEn) {
        } else if (v == en_keyboard.keyXEn) {
        } else if (v == en_keyboard.keyYEn) {
        } else if (v == en_keyboard.keyZEn) {

        } else if (v == en_keyboard.keyCommaEn) {//逗号
        } else if (v == en_keyboard.keyAddEn) {//加
        } else if (v == en_keyboard.keyDeleleEn) {//删除
        } else if (v == en_keyboard.keyEnterEn) {//回车
        } else if (v == en_keyboard.keyFlowerLeftEn) {//花括号
        } else if (v == en_keyboard.keyFlowerRightEn) {//花括号
        } else if (v == en_keyboard.keyPeriodEn) {//句号
        } else if (v == en_keyboard.keyQuotesLeftEn) {//括号
        } else if (v == en_keyboard.keyQuotesRightEn) {//括号
        } else if (v == en_keyboard.keySpaceEn) {//空格
        } else if (v == en_keyboard.keySlashesEn) {//斜杠
        } else if (v == en_keyboard.keyShiftEn) {//shift
        } else if (v == en_keyboard.keySemicolonEn) {//分号
        } else if (v == en_keyboard.keyReduceEn) {//减
        }
    }

}

