
package android.databinding;
import com.lst11.learnpolish.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.lst11.learnpolish.R.layout.top_bar_view:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/top_bar_view_0".equals(tag)) {
                            return new com.lst11.learnpolish.databinding.TopBarViewBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for top_bar_view is invalid. Received: " + tag);
                }
                case com.lst11.learnpolish.R.layout.item_word_translated:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_word_translated_0".equals(tag)) {
                            return new com.lst11.learnpolish.databinding.ItemWordTranslatedBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_word_translated is invalid. Received: " + tag);
                }
                case com.lst11.learnpolish.R.layout.activity_translate:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout-land/activity_translate_0".equals(tag)) {
                            return new com.lst11.learnpolish.databinding.ActivityTranslateBindingLandImpl(bindingComponent, view);
                    }
                    if ("layout/activity_translate_0".equals(tag)) {
                            return new com.lst11.learnpolish.databinding.ActivityTranslateBindingImpl(bindingComponent, view);
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
            case -543100559: {
                if(tag.equals("layout/top_bar_view_0")) {
                    return com.lst11.learnpolish.R.layout.top_bar_view;
                }
                break;
            }
            case 1495754869: {
                if(tag.equals("layout/item_word_translated_0")) {
                    return com.lst11.learnpolish.R.layout.item_word_translated;
                }
                break;
            }
            case -1061413616: {
                if(tag.equals("layout-land/activity_translate_0")) {
                    return com.lst11.learnpolish.R.layout.activity_translate;
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