package com.lst11.learnpolish.databinding;
import com.lst11.learnpolish.R;
import com.lst11.learnpolish.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomeBindingLandImpl extends ActivityHomeBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.background, 1);
        sViewsWithIds.put(R.id.guidelineLeft, 2);
        sViewsWithIds.put(R.id.guidelineRight, 3);
        sViewsWithIds.put(R.id.guidelineBottom, 4);
        sViewsWithIds.put(R.id.activityName, 5);
        sViewsWithIds.put(R.id.imageView, 6);
        sViewsWithIds.put(R.id.cardTranslate, 7);
        sViewsWithIds.put(R.id.cardDictionary, 8);
        sViewsWithIds.put(R.id.cardCardsTraining, 9);
        sViewsWithIds.put(R.id.cardTimeTraining, 10);
        sViewsWithIds.put(R.id.cardTranslationTraining, 11);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomeBindingLandImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityHomeBindingLandImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.lst11.learnpolish.presentation.utils.TopBarView) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[9]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[8]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[10]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[7]
            , (com.lst11.learnpolish.presentation.utils.CardView) bindings[11]
            , (android.support.constraint.Guideline) bindings[4]
            , (android.support.constraint.Guideline) bindings[2]
            , (android.support.constraint.Guideline) bindings[3]
            , (com.lst11.learnpolish.presentation.utils.CustomProgressBar) bindings[6]
            , null
            );
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}