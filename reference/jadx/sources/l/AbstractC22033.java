package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4WE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22033 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f71060;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String[] f71061;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f71062;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo30872(String str);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m49809(String... strArr) {
        C20782.m47567("Cannot set libraries after loading", !this.f71062);
        this.f71061 = strArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m49810() {
        if (this.f71062) {
            return this.f71060;
        }
        this.f71062 = true;
        try {
            for (String str : this.f71061) {
                mo30872(str);
            }
            this.f71060 = true;
        } catch (UnsatisfiedLinkError unused) {
            C1896.m6517("Failed to load " + Arrays.toString(this.f71061));
        }
        return this.f71060;
    }

    public AbstractC22033(String... strArr) {
        this.f71061 = strArr;
    }
}
