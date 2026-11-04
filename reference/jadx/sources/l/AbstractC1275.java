package l;

import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: l.֨ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1275 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f4588;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f4589;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo4663(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract byte[] mo4664();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m4665() {
        return this.f4589;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m4666() {
        return this.f4588;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1275 m4662(int i) throws C4258 {
        if (i == 0) {
            C9477 c9477 = new C9477();
            c9477.f4589 = 0;
            c9477.f4588 = "None";
            return c9477;
        }
        if (i == 1) {
            return new C19174();
        }
        if (i == 4) {
            return new C10223();
        }
        if (i == 10) {
            try {
                return new C2766();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        throw new C4258(C13645.m33382(i, "Unsupported Check ID "));
    }
}
