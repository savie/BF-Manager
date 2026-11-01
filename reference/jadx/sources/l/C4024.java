package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8NB */
/* JADX INFO: loaded from: classes3.dex */
public final class C4024 extends AbstractC22370 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f14882;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f14883;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f14884;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f14885;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f14886;

    public C4024(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super("MLLT");
        this.f14886 = i;
        this.f14885 = i2;
        this.f14882 = i3;
        this.f14884 = iArr;
        this.f14883 = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4024.class == obj.getClass()) {
            C4024 c4024 = (C4024) obj;
            if (this.f14886 == c4024.f14886 && this.f14885 == c4024.f14885 && this.f14882 == c4024.f14882 && Arrays.equals(this.f14884, c4024.f14884) && Arrays.equals(this.f14883, c4024.f14883)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14883) + ((Arrays.hashCode(this.f14884) + ((((((this.f14886 + 527) * 31) + this.f14885) * 31) + this.f14882) * 31)) * 31);
    }
}
