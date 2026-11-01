package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.۬ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1PL */
/* JADX INFO: loaded from: classes3.dex */
public final class C13191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f43904;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f43905;

    public C13191(String str) {
        this.f43905 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32665(int i) {
        this.f43904 = i;
        Intent intent = new Intent("bin.mt.protect.ProtectUploadService.ACTION_PROGRESS_CHANGED");
        intent.putExtra("taskID", this.f43905);
        intent.putExtra("progress", i);
        C16737.m39270(intent);
    }
}
