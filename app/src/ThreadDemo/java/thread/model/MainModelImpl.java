package thread.model;

import com.plat.sdk.model.IModel;

/**
 * @author ydong
 */
public class MainModelImpl implements IModel {

    @Override
    public String getNavigationData(String str) {
        return str + "，初始化数据获取成功";
    }
}
