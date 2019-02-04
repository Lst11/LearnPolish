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
        sViewsWithIds.put(R.id.background, 2);
        sViewsWithIds.put(R.id.guidelineLeft, 3);
        sViewsWithIds.put(R.id.guidelineRight, 4);
        sViewsWithIds.put(R.id.guidelineBottom, 5);
        sViewsWithIds.put(R.id.activityName, 6);
        sViewsWithIds.put(R.id.imageView, 7);
        sViewsWithIds.put(R.id.cardDictionary, 8);
        sViewsWithIds.put(R.id.trainingsTextView, 9);
        sViewsWithIds.put(R.id.cardCardsTraining, 10);
        sViewsWithIds.put(R.id.cardTimeTraining, 11);
        sViewsWithIds.put(R.id.cardTranslationTraining, 12);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomeBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityHomeBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.lst11.learnpolish.presentation.utils.TopBarView) bindings[6]
            , (android.widget.ImageView) bindings[2]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[10]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[8]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[11]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[1]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[12]
            , (android.support.constraint.Guideline) bindings[5]
            , (android.support.constraint.Guideline) bindings[3]
            , (android.support.constraint.Guideline) bindings[4]
            , (com.lst11.learnpolish.presentation.utils.CustomProgressBar) bindings[7]
            , (android.widget.TextView) bindings[9]
            );
        this.cardTranslate.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
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

            this.cardTranslate.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.lst11.learnpolish.presentation.screen.HomeViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onClickTranslate();
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