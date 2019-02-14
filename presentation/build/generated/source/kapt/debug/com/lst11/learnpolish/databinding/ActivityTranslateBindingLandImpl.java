package com.lst11.learnpolish.databinding;
import com.lst11.learnpolish.R;
import com.lst11.learnpolish.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTranslateBindingLandImpl extends ActivityTranslateBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.background, 5);
        sViewsWithIds.put(R.id.imageView2, 6);
        sViewsWithIds.put(R.id.toLanguageTextView, 7);
        sViewsWithIds.put(R.id.guidelineLeft, 8);
        sViewsWithIds.put(R.id.guidelineRight, 9);
        sViewsWithIds.put(R.id.guidelineBottom, 10);
        sViewsWithIds.put(R.id.fromLanguageTextView, 11);
        sViewsWithIds.put(R.id.recyclerView, 12);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
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

    public ActivityTranslateBindingLandImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityTranslateBindingLandImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[11]
            , (android.support.constraint.Guideline) bindings[10]
            , (android.support.constraint.Guideline) bindings[8]
            , (android.support.constraint.Guideline) bindings[9]
            , (android.widget.ImageView) bindings[6]
            , (android.support.v7.widget.RecyclerView) bindings[12]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (com.lst11.learnpolish.presentation.utils.TopBarView) bindings[1]
            , (android.widget.EditText) bindings[4]
            );
        this.clearButton.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.searchButton.setTag(null);
        this.topBar.setTag(null);
        this.translateEditText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new android.databinding.generated.callback.OnClickListener(this, 2);
        mCallback5 = new android.databinding.generated.callback.OnClickListener(this, 1);
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

            this.clearButton.setOnClickListener(mCallback6);
            this.searchButton.setOnClickListener(mCallback5);
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.wordPl
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}