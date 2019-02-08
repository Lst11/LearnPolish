package com.lst11.learnpolish.databinding;
import com.lst11.learnpolish.R;
import com.lst11.learnpolish.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTranslateBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.background, 5);
        sViewsWithIds.put(R.id.fromLanguageTextView, 6);
        sViewsWithIds.put(R.id.imageView2, 7);
        sViewsWithIds.put(R.id.toLanguageTextView, 8);
        sViewsWithIds.put(R.id.guidelineLeft, 9);
        sViewsWithIds.put(R.id.guidelineRight, 10);
        sViewsWithIds.put(R.id.guidelineBottom, 11);
        sViewsWithIds.put(R.id.recyclerView, 12);
    }
    // views
    @NonNull
    public final android.widget.ImageView background;
    @NonNull
    public final android.widget.ImageView clearButton;
    @NonNull
    public final android.widget.TextView fromLanguageTextView;
    @NonNull
    public final android.support.constraint.Guideline guidelineBottom;
    @NonNull
    public final android.support.constraint.Guideline guidelineLeft;
    @NonNull
    public final android.support.constraint.Guideline guidelineRight;
    @NonNull
    public final android.widget.ImageView imageView2;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView;
    @NonNull
    public final android.widget.ImageView searchButton;
    @NonNull
    public final android.widget.TextView toLanguageTextView;
    @NonNull
    public final com.lst11.learnpolish.presentation.utils.TopBarView topBar;
    @NonNull
    public final android.widget.EditText translateEditText;
    // variables
    @Nullable
    private com.lst11.learnpolish.presentation.screen.translator.TranslateViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener translateEditTextandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.wordPl.get()
            //         is viewModel.wordPl.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(translateEditText);
            // localize variables for thread safety
            // viewModel.wordPl.get()
            java.lang.String viewModelWordPlGet = null;
            // viewModel
            com.lst11.learnpolish.presentation.screen.translator.TranslateViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.wordPl
            android.databinding.ObservableField<java.lang.String> viewModelWordPl = null;
            // viewModel.wordPl != null
            boolean viewModelWordPlJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelWordPl = viewModel.getWordPl();

                viewModelWordPlJavaLangObjectNull = (viewModelWordPl) != (null);
                if (viewModelWordPlJavaLangObjectNull) {




                    viewModelWordPl.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityTranslateBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds);
        this.background = (android.widget.ImageView) bindings[5];
        this.clearButton = (android.widget.ImageView) bindings[4];
        this.clearButton.setTag(null);
        this.fromLanguageTextView = (android.widget.TextView) bindings[6];
        this.guidelineBottom = (android.support.constraint.Guideline) bindings[11];
        this.guidelineLeft = (android.support.constraint.Guideline) bindings[9];
        this.guidelineRight = (android.support.constraint.Guideline) bindings[10];
        this.imageView2 = (android.widget.ImageView) bindings[7];
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[12];
        this.searchButton = (android.widget.ImageView) bindings[3];
        this.searchButton.setTag(null);
        this.toLanguageTextView = (android.widget.TextView) bindings[8];
        this.topBar = (com.lst11.learnpolish.presentation.utils.TopBarView) bindings[1];
        this.topBar.setTag(null);
        this.translateEditText = (android.widget.EditText) bindings[2];
        this.translateEditText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback14 = new android.databinding.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.lst11.learnpolish.presentation.screen.translator.TranslateViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.lst11.learnpolish.presentation.screen.translator.TranslateViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public com.lst11.learnpolish.presentation.screen.translator.TranslateViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelWordPl((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelWordPl(android.databinding.ObservableField<java.lang.String> ViewModelWordPl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelWordPlGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelWordPl = null;
        com.lst11.learnpolish.presentation.screen.translator.TranslateViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.wordPl
                    viewModelWordPl = viewModel.getWordPl();
                }
                updateRegistration(0, viewModelWordPl);


                if (viewModelWordPl != null) {
                    // read viewModel.wordPl.get()
                    viewModelWordPlGet = viewModelWordPl.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.clearButton.setOnClickListener(mCallback14);
            this.searchButton.setOnClickListener(mCallback13);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.translateEditText, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, translateEditTextandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.topBar.setViewModel(viewModel);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.translateEditText, viewModelWordPlGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.lst11.learnpolish.presentation.screen.translator.TranslateViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onClickTranslate();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.lst11.learnpolish.presentation.screen.translator.TranslateViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onClickDelete();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityTranslateBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityTranslateBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityTranslateBinding>inflate(inflater, com.lst11.learnpolish.R.layout.activity_translate, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityTranslateBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityTranslateBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.lst11.learnpolish.R.layout.activity_translate, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityTranslateBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityTranslateBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_translate_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityTranslateBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.wordPl
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}