package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.۠᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A1UM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8909 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29096;

    /* JADX INFO: renamed from: ۙ */
    public abstract double mo1150(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract double mo1151(int i, double d);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo1152();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo17251(int i, int i2, byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo23817(int i, byte[] bArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo23818(String str);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract void mo23819();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public abstract void mo23820();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int mo23821() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract void mo23823();

    public String toString() {
        switch (this.f29096) {
            case 5:
                return getClass().getSimpleName();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m23822(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        mo23817(bytes.length, bytes);
    }
}
