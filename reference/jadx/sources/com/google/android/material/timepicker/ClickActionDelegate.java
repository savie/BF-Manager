package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import l.C19835;
import l.C22687;
import l.C8451;

/* JADX INFO: loaded from: classes.dex */
public class ClickActionDelegate extends C22687 {
    public final C8451 clickAction;

    public ClickActionDelegate(Context context, int i) {
        this.clickAction = new C8451(16, context.getString(i));
    }

    @Override // l.C22687
    public void onInitializeAccessibilityNodeInfo(View view, C19835 c19835) {
        super.onInitializeAccessibilityNodeInfo(view, c19835);
        c19835.m45641(this.clickAction);
    }
}
