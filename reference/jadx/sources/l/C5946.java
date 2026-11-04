package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: KAZI */
/* JADX INFO: loaded from: classes3.dex */
public final class C5946 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f20363;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC24241 f20364;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13183 f20365;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC24241 f20366;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f20367;

    public C5946(C13183 c13183, AbstractC24241 abstractC24241, AbstractC24241 abstractC24242, byte[] bArr, int i) {
        this.f20365 = c13183;
        this.f20366 = abstractC24241;
        this.f20364 = abstractC24242;
        this.f20367 = bArr;
        this.f20363 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5946)) {
            return false;
        }
        C5946 c5946 = (C5946) obj;
        return this.f20365.equals(c5946.f20365) && this.f20366 == c5946.f20366 && this.f20364 == c5946.f20364 && Arrays.equals(this.f20367, c5946.f20367) && this.f20363 == c5946.f20363;
    }
}
