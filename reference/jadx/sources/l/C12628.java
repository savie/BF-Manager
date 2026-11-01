package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.۫᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A92H */
/* JADX INFO: loaded from: classes3.dex */
public final class C12628 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f42190;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f42191;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f42192;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String[] f42193;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Bundle f42194 = new Bundle();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14745 f42195;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f42196;

    public C12628(AbstractActivityC12483 abstractActivityC12483) {
        this.f42192 = abstractActivityC12483;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31413(String str) {
        this.f42191 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31414(C14745 c14745) {
        this.f42195 = c14745;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31416(String[] strArr) {
        this.f42193 = strArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31419(String str) {
        this.f42193 = new String[]{str};
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m31417(String str) {
        this.f42196 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31411() {
        this.f42190 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31415(boolean z) {
        this.f42194.putBoolean("nsIsDir", z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31412(int i) {
        this.f42194.putInt("nsId", i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31418() {
        new C17566(this.f42192, this.f42191, this.f42195, this.f42193, this.f42196, this.f42194, this.f42190);
    }
}
