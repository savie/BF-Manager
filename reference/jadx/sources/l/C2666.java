package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖ۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4LO */
/* JADX INFO: loaded from: classes3.dex */
public final class C2666 extends AbstractC10408 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC5101 f8484;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f8485;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int[] f8486;

    public C2666(AbstractC5101 abstractC5101, String str, int[] iArr) {
        str.getClass();
        this.f8484 = abstractC5101;
        this.f8485 = str;
        this.f8486 = iArr;
    }

    @Override // l.InterfaceC16090
    public final String getValue() {
        return this.f8485;
    }

    @Override // l.InterfaceC16090
    public final int[] getStyle() {
        return this.f8486;
    }

    @Override // l.InterfaceC16090
    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final C25042[] mo8826() {
        int[] iArr = this.f8486;
        if (iArr == null) {
            return null;
        }
        int length = iArr.length / 3;
        C25042[] c25042Arr = new C25042[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 3;
            c25042Arr[i] = new C25042(this.f8484.m15441(iArr[i2]), iArr[i2 + 1], iArr[i2 + 2] + 1);
        }
        return c25042Arr;
    }

    @Override // l.InterfaceC16090
    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C25042[] mo8824() {
        int[] iArr = this.f8486;
        if (iArr == null || iArr.length % 3 != 0) {
            return null;
        }
        int length = iArr.length / 3;
        C25042[] c25042Arr = new C25042[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 3;
            try {
                c25042Arr[i] = new C25042(this.f8484.mo11156(iArr[i2]).getValue(), iArr[i2 + 1], iArr[i2 + 2] + 1);
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return m26720(c25042Arr);
    }

    @Override // l.InterfaceC16090
    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8825() {
        return this.f8486 != null;
    }

    @Override // l.AbstractC10408
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2666.class == obj.getClass()) {
            C2666 c2666 = (C2666) obj;
            if (this.f8485.equals(c2666.f8485) && Arrays.equals(this.f8486, c2666.f8486)) {
                return true;
            }
        }
        return false;
    }
}
