package com.lst11.learnpolish.presentation.base.recycler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016\u00a8\u0006\r"}, d2 = {"Lcom/lst11/learnpolish/presentation/base/recycler/BaseItemViewModel;", "Entity", "", "()V", "bindItem", "", "item", "position", "", "isUnique", "", "(Ljava/lang/Object;IZ)V", "onItemClick", "presentation_debug"})
public abstract class BaseItemViewModel<Entity extends java.lang.Object> {
    
    public abstract void bindItem(Entity item, int position, boolean isUnique);
    
    public void onItemClick() {
    }
    
    public BaseItemViewModel() {
        super();
    }
}