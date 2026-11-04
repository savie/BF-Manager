package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4W0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17582 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C25042[] m41244(C25042[] c25042Arr) {
        if (c25042Arr != null && c25042Arr.length > 1) {
            int i = 0;
            while (i < c25042Arr.length) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < c25042Arr.length; i3++) {
                    if (m41243(c25042Arr[i], c25042Arr[i3])) {
                        ArrayList arrayList = new ArrayList(Arrays.asList(c25042Arr));
                        while (true) {
                            int i4 = 0;
                            while (i4 < arrayList.size()) {
                                int i5 = i4 + 1;
                                int i6 = i5;
                                while (true) {
                                    if (i6 < arrayList.size()) {
                                        C25042 c25042 = (C25042) arrayList.get(i4);
                                        C25042 c25043 = (C25042) arrayList.get(i6);
                                        boolean zM41243 = m41243(c25042, c25043);
                                        String str = c25042.f81015;
                                        int i7 = c25042.f81014;
                                        String str2 = c25043.f81015;
                                        int i8 = c25043.f81014;
                                        if (zM41243) {
                                            int i9 = c25042.f81016;
                                            int i10 = c25043.f81016;
                                            if (i9 < i10) {
                                                arrayList.set(i6, new C25042(str2, i10, i7));
                                                arrayList.add(i6 + 1, new C25042(str2, i7, i8));
                                            } else {
                                                arrayList.set(i4, new C25042(str, i9, i8));
                                                arrayList.add(i5, new C25042(str, i8, i7));
                                            }
                                        } else {
                                            i6++;
                                        }
                                    } else {
                                        i4 = i5;
                                    }
                                }
                            }
                            return (C25042[]) arrayList.toArray(new C25042[0]);
                        }
                    }
                }
                i = i2;
            }
        }
        return c25042Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41243(C25042 c25042, C25042 c25043) {
        int i = c25042.f81016;
        int i2 = c25042.f81014;
        int i3 = c25043.f81016;
        int i4 = c25043.f81014;
        if (i >= i3 || i3 >= i2 || i2 >= i4) {
            return i3 < i && i < i4 && i4 < i2;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C25042[] m41245(C25042[] c25042Arr) {
        if (c25042Arr == null || c25042Arr.length <= 1) {
            return c25042Arr;
        }
        HashMap map = new HashMap();
        for (C25042 c25042 : c25042Arr) {
            ((List) C11392.computeIfAbsent(map, c25042.f81015, new C3900(1))).add(c25042);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            List list = (List) map.get(str);
            C17359.requireNonNull(list);
            List list2 = list;
            C12884.sort(list2, C2661.comparingInt(new C16836()));
            int i = ((C25042) list2.get(0)).f81016;
            int iMax = ((C25042) list2.get(0)).f81014;
            for (int i2 = 1; i2 < list2.size(); i2++) {
                C25042 c25043 = (C25042) list2.get(i2);
                int i3 = c25043.f81016;
                int i4 = c25043.f81014;
                if (i3 <= iMax) {
                    iMax = Math.max(iMax, i4);
                } else {
                    arrayList.add(new C25042(str, i, iMax));
                    i = c25043.f81016;
                    iMax = i4;
                }
            }
            arrayList.add(new C25042(str, i, iMax));
        }
        return (C25042[]) arrayList.toArray(new C25042[0]);
    }
}
