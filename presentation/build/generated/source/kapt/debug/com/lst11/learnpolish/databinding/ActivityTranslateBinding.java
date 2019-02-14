package com.lst11.learnpolish.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ActivityTranslateBinding extends ViewDataBinding {
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
    protected com.lst11.learnpolish.presentation.screen.translator.TranslateViewModel mViewModel;
    protected ActivityTranslateBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.ImageView background1
        , android.widget.ImageView clearButton1
        , android.widget.TextView fromLanguageTextView1
        , android.support.constraint.Guideline guidelineBottom1
        , android.support.constraint.Guideline guidelineLeft1
        , android.support.constraint.Guideline guidelineRight1
        , android.widget.ImageView imageView21
        , android.support.v7.widget.RecyclerView recyclerView1
        , android.widget.ImageView searchButton1
        , android.widget.TextView toLanguageTextView1
        , com.lst11.learnpolish.presentation.utils.TopBarView topBar1
        , android.widget.EditText translateEditText1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.background = background1;
        this.clearButton = clearButton1;
        this.fromLanguageTextView = fromLanguageTextView1;
        this.guidelineBottom = guidelineBottom1;
        this.guidelineLeft = guidelineLeft1;
        this.guidelineRight = guidelineRight1;
        this.imageView2 = imageView21;
        this.recyclerView = recyclerView1;
        this.searchButton = searchButton1;
        this.toLanguageTextView = toLanguageTextView1;
        this.topBar = topBar1;
        this.translateEditText = translateEditText1;
    }
    //getters and abstract setters
    public abstract void setViewModel(@Nullable com.lst11.learnpolish.presentation.screen.translator.TranslateViewModel ViewModel);
    @Nullable
    public com.lst11.learnpolish.presentation.screen.translator.TranslateViewModel getViewModel() {
        return mViewModel;
    }
    @NonNull
    public static ActivityTranslateBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityTranslateBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityTranslateBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityTranslateBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityTranslateBinding>inflate(inflater, com.lst11.learnpolish.R.layout.activity_translate, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityTranslateBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityTranslateBinding>inflate(inflater, com.lst11.learnpolish.R.layout.activity_translate, null, false, bindingComponent);
    }
    @NonNull
    public static ActivityTranslateBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ActivityTranslateBinding)bind(bindingComponent, view, com.lst11.learnpolish.R.layout.activity_translate);
    }
}