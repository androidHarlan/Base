package com.tentcoo.base.view;

import com.tentcoo.baselibrary.base.BasePresenter;
import com.tentcoo.baselibrary.base.BaseView;

/**
 * Created by huangdiudiu on 2018/4/4.
 */

public class MainView {
    public interface View extends BaseView {
        void showView();

    }
    public interface Presenter extends BasePresenter<View> {
       void getnetworkData();

    }
}
