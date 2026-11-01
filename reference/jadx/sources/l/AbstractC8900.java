package l;

import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: l.ۡ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8900 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f30539;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f30540;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo19985(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ۙ */
    public abstract byte[] mo19986();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m23157() {
        return this.f30540;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m23158() {
        return this.f30539;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8900 m23156(int i) throws C6782 {
        if (i == 0) {
            C10311 c10311 = new C10311();
            c10311.f30540 = 0;
            c10311.f30539 = "None";
            return c10311;
        }
        if (i == 1) {
            return new C8194();
        }
        if (i == 4) {
            return new C19483();
        }
        if (i == 10) {
            try {
                return new C7488();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        throw new C6782(C8479.m22141(i, "Unsupported Check ID "));
    }
}
