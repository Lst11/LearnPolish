package com.lst11.learnpolish.databinding;
import com.lst11.learnpolish.R;
import com.lst11.learnpolish.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomeBindingImpl extends ActivityHomeBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.background, 7);
        sViewsWithIds.put(R.id.guidelineLeft, 8);
        sViewsWithIds.put(R.id.guidelineRight, 9);
        sViewsWithIds.put(R.id.guidelineBottom, 10);
        sViewsWithIds.put(R.id.imageView, 11);
        sViewsWithIds.put(R.id.trainingsTextView, 12);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomeBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityHomeBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.lst11.learnpolish.presentation.utils.TopBarView) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[4]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[3]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[5]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[2]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[6]
            , (android.support.constraint.Guideline) bindings[10]
            , (android.support.constraint.Guideline) bindings[8]
            , (android.support.constraint.Guideline) bindings[9]
            , (com.lst11.learnpolish.presentation.utils.CustomProgressBar) bindings[11]
            , (android.widget.TextView) bindings[12]
            );
        this.activityName.setTag(null);
        this.cardCardsTraining.setTag(null);
        this.cardDictionary.setTag(null);
        this.cardTimeTraining.setTag(null);
        this.cardTranslate.setTag(null);
        this.cardTranslationTraining.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback6 = new android.databinding.generated.callback.OnClickListener(this, 5);
        mCallback5 = new android.databinding.generated.callback.OnClickListener(this, 4);
        mCallback4 = new android.databinding.generated.callback.OnClickListener(this, 3);
        mCallback3 = new android.databinding.generated.callback.OnClickListener(this, 2);
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

        if ((dirtyFlags & 0x3L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.activityName.setViewModel(viewModel);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.cardCardsTraining.setOnClickListener(mCallback4);
            this.cardDictionary.setOnClickListener(mCallback3);
            this.cardTimeTraining.setOnClickListener(mCallback5);
            this.cardTranslate.setOnClickListener(mCallback2);
            this.cardTranslationTraining.setOnClickListener(mCallback6);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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