package com.tencent.open;

import android.R;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import l.C12636;
import l.C20841;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends Dialog {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20841 f895;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    @SuppressLint({"NewApi"})
    public final WebChromeClient f896;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo918(String str);

    public c(Context context) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f896 = new C12636(this);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f895 = new C20841();
    }
}
