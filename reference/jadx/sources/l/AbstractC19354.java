package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4WE */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19354 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f62396;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String[] f62397;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f62398;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6247(String str);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m44359() {
        if (this.f62398) {
            return this.f62396;
        }
        this.f62398 = true;
        try {
            for (String str : this.f62397) {
                mo6247(str);
            }
            this.f62396 = true;
        } catch (UnsatisfiedLinkError unused) {
            C0303.m1848("Failed to load " + Arrays.toString(this.f62397));
        }
        return this.f62396;
    }

    public AbstractC19354(String... strArr) {
        this.f62397 = strArr;
    }
}
