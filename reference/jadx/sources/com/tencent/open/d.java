package com.tencent.open;

import android.os.Bundle;
import android.webkit.WebView;
import l.C21587;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class d extends c {
    @Override // com.tencent.open.c, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        getWindow().setSoftInputMode(1);
        throw null;
    }

    @Override // com.tencent.open.c
    /* JADX INFO: renamed from: ۙ */
    public final void mo918(String str) {
        C21587.m49111("openSDK_LOG.PKDialog", "--onConsoleMessage--");
        try {
            this.f895.mo47661((WebView) null, str);
        } catch (Exception unused) {
        }
    }
}
