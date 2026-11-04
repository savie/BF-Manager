package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.֡ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A92H */
/* JADX INFO: loaded from: classes2.dex */
public final class C0364 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f1878;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Bundle f1879 = new Bundle();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f1880;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f1881;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String[] f1882;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C9312 f1883;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f1884;

    public C0364(AbstractActivityC17204 abstractActivityC17204) {
        this.f1878 = abstractActivityC17204;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2131(String str) {
        this.f1884 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2132(C9312 c9312) {
        this.f1883 = c9312;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2134(String[] strArr) {
        this.f1882 = strArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2137(String str) {
        this.f1882 = new String[]{str};
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m2135(String str) {
        this.f1881 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2129() {
        this.f1880 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2133(boolean z) {
        this.f1879.putBoolean("nsIsDir", z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2130(int i) {
        this.f1879.putInt("nsId", i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2136() {
        new C7822(this.f1878, this.f1884, this.f1883, this.f1882, this.f1881, this.f1879, this.f1880);
    }
}
