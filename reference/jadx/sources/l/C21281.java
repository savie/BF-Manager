package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAZI */
/* JADX INFO: loaded from: classes4.dex */
public final class C21281 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f69274;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69275;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15513 f69276;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC20845 f69277;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC20845 f69278;

    public C21281(C15513 c15513, AbstractC20845 abstractC20845, AbstractC20845 abstractC20846, byte[] bArr, int i) {
        this.f69276 = c15513;
        this.f69278 = abstractC20845;
        this.f69277 = abstractC20846;
        this.f69274 = bArr;
        this.f69275 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21281)) {
            return false;
        }
        C21281 c21281 = (C21281) obj;
        return this.f69276.equals(c21281.f69276) && this.f69278 == c21281.f69278 && this.f69277 == c21281.f69277 && Arrays.equals(this.f69274, c21281.f69274) && this.f69275 == c21281.f69275;
    }
}
