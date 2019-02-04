
package android.databinding;
import com.lst11.learnpolish.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.lst11.learnpolish.R.layout.activity_home:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_home_0".equals(tag)) {
                            return new com.lst11.learnpolish.databinding.ActivityHomeBindingImpl(bindingComponent, view);
                    }
                    if ("layout-land/activity_home_0".equals(tag)) {
                            return new com.lst11.learnpolish.databinding.ActivityHomeBindingLandImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
                }
                case com.lst11.learnpolish.R.layout.activity_translate:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_translate_0".equals(tag)) {
                            return new com.lst11.learnpolish.databinding.ActivityTranslateBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_translate is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 293647131: {
                if(tag.equals("layout/activity_home_0")) {
                    return com.lst11.learnpolish.R.layout.activity_home;
                }
                break;
            }
            case -751807841: {
                if(tag.equals("layout-land/activity_home_0")) {
                    return com.lst11.learnpolish.R.layout.activity_home;
                }
                break;
            }
            case -1723815404: {
                if(tag.equals("layout/activity_translate_0")) {
                    return com.lst11.learnpolish.R.layout.activity_translate;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"viewModel"};
    }
}