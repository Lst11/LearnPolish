package com.lst11.learnpolish.databinding;
import com.lst11.learnpolish.R;
import com.lst11.learnpolish.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomeBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guidelineLeft, 1);
        sViewsWithIds.put(R.id.guidelineRight, 2);
        sViewsWithIds.put(R.id.guidelineBottom, 3);
        sViewsWithIds.put(R.id.activityName, 4);
        sViewsWithIds.put(R.id.imageView, 5);
        sViewsWithIds.put(R.id.cardTranslate, 6);
        sViewsWithIds.put(R.id.cardDictionary, 7);
        sViewsWithIds.put(R.id.trainingsTextView, 8);
        sViewsWithIds.put(R.id.cardCardsTraining, 9);
        sViewsWithIds.put(R.id.cardTimeTraining, 10);
        sViewsWithIds.put(R.id.cardTranslationTraining, 11);
    }
    // views
    @NonNull
    public final android.widget.TextView activityName;
    @NonNull
    public final com.lst11.learnpolish.presentation.utils.CardView cardCardsTraining;
    @NonNull
    public final com.lst11.learnpolish.presentation.utils.CardView cardDictionary;
    @NonNull
    public final com.lst11.learnpolish.presentation.utils.CardView cardTimeTraining;
    @NonNull
    public final com.lst11.learnpolish.presentation.utils.CardView cardTranslate;
    @NonNull
    public final com.lst11.learnpolish.presentation.utils.CardView cardTranslationTraining;
    @NonNull
    public final android.support.constraint.Guideline guidelineBottom;
    @NonNull
    public final android.support.constraint.Guideline guidelineLeft;
    @NonNull
    public final android.support.constraint.Guideline guidelineRight;
    @NonNull
    public final android.widget.ImageView imageView;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    public final android.widget.TextView trainingsTextView;
    // variables
    @Nullable
    private com.lst11.learnpolish.presentation.screen.HomeViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomeBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds);
        this.activityName = (android.widget.TextView) bindings[4];
        this.cardCardsTraining = (com.lst11.learnpolish.presentation.utils.CardView) bindings[9];
        this.cardDictionary = (com.lst11.learnpolish.presentation.utils.CardView) bindings[7];
        this.cardTimeTraining = (com.lst11.learnpolish.presentation.utils.CardView) bindings[10];
        this.cardTranslate = (com.lst11.learnpolish.presentation.utils.CardView) bindings[6];
        this.cardTranslationTraining = (com.lst11.learnpolish.presentation.utils.CardView) bindings[11];
        this.guidelineBottom = (android.support.constraint.Guideline) bindings[3];
        this.guidelineLeft = (android.support.constraint.Guideline) bindings[1];
        this.guidelineRight = (android.support.constraint.Guideline) bindings[2];
        this.imageView = (android.widget.ImageView) bindings[5];
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.trainingsTextView = (android.widget.TextView) bindings[8];
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
    @Nullable
    public com.lst11.learnpolish.presentation.screen.HomeViewModel getViewModel() {
        return mViewModel;
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

    @NonNull
    public static ActivityHomeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHomeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityHomeBinding>inflate(inflater, com.lst11.learnpolish.R.layout.activity_home, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityHomeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHomeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.lst11.learnpolish.R.layout.activity_home, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityHomeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHomeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_home_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityHomeBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}