package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ܿ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1PL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17957 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f58825;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f58826;

    public C17957(String str) {
        this.f58826 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41911(int i) {
        this.f58825 = i;
        Intent intent = new Intent("bin.mt.protect.ProtectUploadService.ACTION_PROGRESS_CHANGED");
        intent.putExtra("taskID", this.f58826);
        intent.putExtra("progress", i);
        C21576.m49065(intent);
    }
}
