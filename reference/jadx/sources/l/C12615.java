package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C12615 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] f42141 = new char[8];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f42142;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12615 m31397(C23595 c23595) {
        int i;
        if (!(c23595 instanceof C14732)) {
            return null;
        }
        C12615 c12615 = new C12615();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c23595);
        while (!arrayList.isEmpty()) {
            C23595 c23596 = (C23595) C17745.m41308(arrayList, 1);
            if (c23596 instanceof C14732) {
                C14732 c14732 = (C14732) c23596;
                for (int i2 = c14732.f48160 - 1; i2 >= 0; i2--) {
                    C23595 c23597 = c14732.f48161[i2];
                    if (c23597 == null) {
                        return null;
                    }
                    arrayList.add(c23597);
                }
            } else {
                Class<?> cls = c23596.getClass();
                int i3 = 0;
                char[] cArr = c12615.f42141;
                if (cls == C6701.class) {
                    int[] iArr = ((C6701) c23596).f69912;
                    if (iArr.length == 0 || (i = iArr[0]) > 65535) {
                        return null;
                    }
                    char c = (char) i;
                    while (true) {
                        int i4 = c12615.f42142;
                        if (i3 >= i4) {
                            if (i4 != cArr.length) {
                                c12615.f42142 = i4 + 1;
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
                } else if (c23596 instanceof C0619) {
                    int iM14657 = C5290.m14657((C0619) c23596);
                    if (iM14657 < 0) {
                        return null;
                    }
                    char c2 = (char) iM14657;
                    while (true) {
                        int i5 = c12615.f42142;
                        if (i3 >= i5) {
                            if (i5 != cArr.length) {
                                c12615.f42142 = i5 + 1;
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
                    if (!(c23596 instanceof C3837)) {
                        return null;
                    }
                    C3837 c3837 = (C3837) c23596;
                    C23595 c23598 = c3837.f14308;
                    if (c3837.f14305 <= 0) {
                        return null;
                    }
                    if (c23598.getClass() != C6701.class && !(c23598 instanceof C0619)) {
                        return null;
                    }
                    arrayList.add(c23598);
                }
            }
        }
        if (c12615.f42142 > 1) {
            return c12615;
        }
        return null;
    }
}
