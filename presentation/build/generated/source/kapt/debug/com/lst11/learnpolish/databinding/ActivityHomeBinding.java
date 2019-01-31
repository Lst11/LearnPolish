package com.lst11.learnpolish.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ActivityHomeBinding extends ViewDataBinding {
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
    public final com.lst11.learnpolish.presentation.utils.CustomProgressBar imageView;
    @Nullable
    public final android.widget.TextView trainingsTextView;
    // variables
    protected com.lst11.learnpolish.presentation.screen.HomeViewModel mViewModel;
    protected ActivityHomeBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.TextView activityName1
        , com.lst11.learnpolish.presentation.utils.CardView cardCardsTraining1
        , com.lst11.learnpolish.presentation.utils.CardView cardDictionary1
        , com.lst11.learnpolish.presentation.utils.CardView cardTimeTraining1
        , com.lst11.learnpolish.presentation.utils.CardView cardTranslate1
        , com.lst11.learnpolish.presentation.utils.CardView cardTranslationTraining1
        , android.support.constraint.Guideline guidelineBottom1
        , android.support.constraint.Guideline guidelineLeft1
        , android.support.constraint.Guideline guidelineRight1
        , com.lst11.learnpolish.presentation.utils.CustomProgressBar imageView1
        , android.widget.TextView trainingsTextView1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.activityName = activityName1;
        this.cardCardsTraining = cardCardsTraining1;
        this.cardDictionary = cardDictionary1;
        this.cardTimeTraining = cardTimeTraining1;
        this.cardTranslate = cardTranslate1;
        this.cardTranslationTraining = cardTranslationTraining1;
        this.guidelineBottom = guidelineBottom1;
        this.guidelineLeft = guidelineLeft1;
        this.guidelineRight = guidelineRight1;
        this.imageView = imageView1;
        this.trainingsTextView = trainingsTextView1;
    }
    //getters and abstract setters
    public abstract void setViewModel(@Nullable com.lst11.learnpolish.presentation.screen.HomeViewModel ViewModel);
    @Nullable
    public com.lst11.learnpolish.presentation.screen.HomeViewModel getViewModel() {
        return mViewModel;
    }
    @NonNull
    public static ActivityHomeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHomeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHomeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHomeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityHomeBinding>inflate(inflater, com.lst11.learnpolish.R.layout.activity_home, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityHomeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityHomeBinding>inflate(inflater, com.lst11.learnpolish.R.layout.activity_home, null, false, bindingComponent);
    }
    @NonNull
    public static ActivityHomeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ActivityHomeBinding)bind(bindingComponent, view, com.lst11.learnpolish.R.layout.activity_home);
    }
}