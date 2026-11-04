package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘ᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C4377 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] f15783 = new char[8];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f15784;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4377 m13986(C0407 c0407) {
        int i;
        if (!(c0407 instanceof C8106)) {
            return null;
        }
        C4377 c4377 = new C4377();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0407);
        while (!arrayList.isEmpty()) {
            C0407 c0408 = (C0407) C18011.m41990(arrayList, 1);
            if (c0408 instanceof C8106) {
                C8106 c8106 = (C8106) c0408;
                for (int i2 = c8106.f26769 - 1; i2 >= 0; i2--) {
                    C0407 c0409 = c8106.f26768[i2];
                    if (c0409 == null) {
                        return null;
                    }
                    arrayList.add(c0409);
                }
            } else {
                Class<?> cls = c0408.getClass();
                int i3 = 0;
                char[] cArr = c4377.f15783;
                if (cls == C19624.class) {
                    int[] iArr = ((C19624) c0408).f19048;
                    if (iArr.length == 0 || (i = iArr[0]) > 65535) {
                        return null;
                    }
                    char c = (char) i;
                    while (true) {
                        int i4 = c4377.f15784;
                        if (i3 >= i4) {
                            if (i4 != cArr.length) {
                                c4377.f15784 = i4 + 1;
                                cArr[i4] = c;
                                break;
                            }
                            return null;
                        }
                        if (cArr[i3] == c) {
                            break;
                        }
                        i3++;
                    }
                } else if (c0408 instanceof C6615) {
                    int iM33751 = C13830.m33751((C6615) c0408);
                    if (iM33751 < 0) {
                        return null;
                    }
                    char c2 = (char) iM33751;
                    while (true) {
                        int i5 = c4377.f15784;
                        if (i3 >= i5) {
                            if (i5 != cArr.length) {
                                c4377.f15784 = i5 + 1;
                                cArr[i5] = c2;
                                break;
                            }
                            return null;
                        }
                        if (cArr[i3] == c2) {
                            break;
                        }
                        i3++;
                    }
                } else {
                    if (!(c0408 instanceof C22782)) {
                        return null;
                    }
                    C22782 c22782 = (C22782) c0408;
                    C0407 c04010 = c22782.f73901;
                    if (c22782.f73902 <= 0) {
                        return null;
                    }
                    if (c04010.getClass() != C19624.class && !(c04010 instanceof C6615)) {
                        return null;
                    }
                    arrayList.add(c04010);
                }
            }
        }
        if (c4377.f15784 > 1) {
            return c4377;
        }
        return null;
    }
}
