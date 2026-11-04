package l;

import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ܰۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6VE */
/* JADX INFO: loaded from: classes4.dex */
public final class C14314 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final int[] f45176 = new int[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3874 f45177;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3874 f45178;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[][] f45179;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[][] f45180;

    public C14314(C3874 c3874, C3874 c3875, int[][] iArr, int[][] iArr2) {
        this.f45178 = c3874;
        this.f45177 = c3875;
        this.f45180 = iArr;
        this.f45179 = iArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14314 m34749(C0648 c0648) {
        C0407 c0407M34748;
        int i;
        C0407 c0407M34749;
        int[] iArr;
        if (c0648 == null || (c0407M34748 = m34748(c0648.f1952)) == null || c0407M34748.getClass() != C8106.class) {
            return null;
        }
        C8106 c8106 = (C8106) c0407M34748;
        C0407 c0407 = c8106.f26771;
        C0407[] c0407Arr = c8106.f26768;
        if (c0407Arr == null || (i = c8106.f26769) < 2 || i > c0407Arr.length || c0407 == null || c0407.getClass() != C19293.class || (c0407M34749 = m34748(c0407.f1952)) == null || c0407M34749.getClass() != C0648.class) {
            return null;
        }
        C0648 c0649 = (C0648) c0407M34749;
        C0407 c0407M347410 = m34748(c0649.f1952);
        if (c0407M347410 == null || c0407M347410.getClass() != C3390.class) {
            return null;
        }
        int i2 = c8106.f26769;
        int[][] iArr2 = new int[i2][];
        int[] iArr3 = new int[128];
        for (int i3 = 0; i3 < c8106.f26769; i3++) {
            C0407 c0408 = c8106.f26768[i3];
            if (c0408 == null || c0408.getClass() != C19624.class || c0408.f1952 != c0407 || (iArr = ((C19624) c0408).f19048) == null || iArr.length == 0) {
                return null;
            }
            for (int i4 : iArr) {
                if (i4 < 0 || i4 > 65535) {
                    return null;
                }
            }
            iArr2[i3] = (int[]) iArr.clone();
            int i5 = iArr[0];
            if (i5 < 128) {
                iArr3[i5] = iArr3[i5] + 1;
            }
        }
        int[][] iArr4 = new int[128][];
        for (int i6 = 0; i6 < 128; i6++) {
            int i7 = iArr3[i6];
            iArr4[i6] = i7 == 0 ? f45176 : new int[i7];
            iArr3[i6] = 0;
        }
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = iArr2[i8][0];
            if (i9 < 128) {
                int[] iArr5 = iArr4[i9];
                int i10 = iArr3[i9];
                iArr3[i9] = i10 + 1;
                iArr5[i10] = i8;
            }
        }
        return new C14314(new C3874(c0648.f2512, c0648.f2511), new C3874(c0649.f2512, c0649.f2511), iArr2, iArr4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0407 m34748(C0407 c0407) {
        C16068 c16068;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        while (c0407 != null) {
            if (c0407.getClass() == C17560.class) {
                C17560 c17560 = (C17560) c0407;
                if (c17560.f57061 || (c16068 = c17560.f57063) == null || c16068.f52070 || c16068.f52069 != 0 || c17560.f57062 != c16068.f52068) {
                    return null;
                }
            } else {
                if (c0407.getClass() != C16068.class) {
                    return c0407;
                }
                C16068 c16069 = (C16068) c0407;
                if (c16069.f52070 || c16069.f52069 != 0) {
                    return null;
                }
            }
            if (identityHashMap.put(c0407, Boolean.TRUE) != null) {
                return null;
            }
            c0407 = c0407.f1952;
        }
        return null;
    }
}
