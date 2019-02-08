package com.lst11.learnpolish.databinding;
import com.lst11.learnpolish.R;
import com.lst11.learnpolish.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomeBindingLandImpl extends ActivityHomeBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.background, 6);
        sViewsWithIds.put(R.id.guidelineLeft, 7);
        sViewsWithIds.put(R.id.guidelineRight, 8);
        sViewsWithIds.put(R.id.guidelineBottom, 9);
        sViewsWithIds.put(R.id.activityName, 10);
        sViewsWithIds.put(R.id.imageView, 11);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomeBindingLandImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityHomeBindingLandImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.lst11.learnpolish.presentation.utils.TopBarView) bindings[10]
            , (android.widget.ImageView) bindings[6]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[3]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[2]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[4]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[1]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[5]
            , (android.support.constraint.Guideline) bindings[9]
            , (android.support.constraint.Guideline) bindings[7]
            , (android.support.constraint.Guideline) bindings[8]
            , (com.lst11.learnpolish.presentation.utils.CustomProgressBar) bindings[11]
            , null
            );
        this.cardCardsTraining.setTag(null);
        this.cardDictionary.setTag(null);
        this.cardTimeTraining.setTag(null);
        this.cardTranslate.setTag(null);
        this.cardTranslationTraining.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new android.databinding.generated.callback.OnClickListener(this, 3);
        mCallback8 = new android.databinding.generated.callback.OnClickListener(this, 2);
        mCallback7 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback11 = new android.databinding.generated.callback.OnClickListener(this, 5);
        mCallback10 = new android.databinding.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setViewModel((com.lst11.learnpolish.presentation.screen.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.lst11.learnpolish.presentation.screen.HomeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.lst11.learnpolish.presentation.screen.HomeViewModel viewModel = mViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.cardCardsTraining.setOnClickListener(mCallback9);
            this.cardDictionary.setOnClickListener(mCallback8);
            this.cardTimeTraining.setOnClickListener(mCallback10);
            this.cardTranslate.setOnClickListener(mCallback7);
            this.cardTranslationTraining.setOnClickListener(mCallback11);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.lst11.learnpolish.presentation.screen.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onClickCardsTraining();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.lst11.learnpolish.presentation.screen.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onClickDictionary();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.lst11.learnpolish.presentation.screen.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onClickTranslate();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.lst11.learnpolish.presentation.screen.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onClickTranslationTraining();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.lst11.learnpolish.presentation.screen.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onClickTimeTraining();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}