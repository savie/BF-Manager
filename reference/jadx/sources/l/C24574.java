package l;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: renamed from: l.᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: TB8W */
/* JADX INFO: loaded from: classes.dex */
public final class C24574 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Intent f79646;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f79647;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f79648;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final IntentSender f79649;

    public C24574(IntentSender intentSender) {
        C15243.m36590(intentSender, "intentSender");
        this.f79649 = intentSender;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54892(Intent intent) {
        this.f79646 = intent;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54891(int i, int i2) {
        this.f79647 = i;
        this.f79648 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14876 m54890() {
        return new C14876(this.f79649, this.f79646, this.f79648, this.f79647);
    }
}
