package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A8NB */
/* JADX INFO: loaded from: classes4.dex */
public final class C9738 extends AbstractC19435 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f31413;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f31414;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f31415;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f31416;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f31417;

    public C9738(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super("MLLT");
        this.f31414 = i;
        this.f31416 = i2;
        this.f31417 = i3;
        this.f31413 = iArr;
        this.f31415 = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9738.class == obj.getClass()) {
            C9738 c9738 = (C9738) obj;
            if (this.f31414 == c9738.f31414 && this.f31416 == c9738.f31416 && this.f31417 == c9738.f31417 && Arrays.equals(this.f31413, c9738.f31413) && Arrays.equals(this.f31415, c9738.f31415)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f31415) + ((Arrays.hashCode(this.f31413) + ((((((this.f31414 + 527) * 31) + this.f31416) * 31) + this.f31417) * 31)) * 31);
    }
}
