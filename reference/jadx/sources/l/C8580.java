package l;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: renamed from: l.ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB8W */
/* JADX INFO: loaded from: classes3.dex */
public final class C8580 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final IntentSender f29659;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Intent f29660;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f29661;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f29662;

    public C8580(IntentSender intentSender) {
        C13465.m32966(intentSender, "intentSender");
        this.f29659 = intentSender;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22353(Intent intent) {
        this.f29660 = intent;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22352(int i, int i2) {
        this.f29661 = i;
        this.f29662 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7168 m22351() {
        return new C7168(this.f29659, this.f29660, this.f29662, this.f29661);
    }
}
