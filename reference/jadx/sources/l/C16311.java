package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4W0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16311 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15606[] m38457(C15606[] c15606Arr) {
        if (c15606Arr != null && c15606Arr.length > 1) {
            int i = 0;
            while (i < c15606Arr.length) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < c15606Arr.length; i3++) {
                    if (m38456(c15606Arr[i], c15606Arr[i3])) {
                        ArrayList arrayList = new ArrayList(Arrays.asList(c15606Arr));
                        while (true) {
                            int i4 = 0;
                            while (i4 < arrayList.size()) {
                                int i5 = i4 + 1;
                                int i6 = i5;
                                while (true) {
                                    if (i6 < arrayList.size()) {
                                        C15606 c15606 = (C15606) arrayList.get(i4);
                                        C15606 c15607 = (C15606) arrayList.get(i6);
                                        boolean zM38456 = m38456(c15606, c15607);
                                        String str = c15606.f50740;
                                        int i7 = c15606.f50739;
                                        String str2 = c15607.f50740;
                                        int i8 = c15607.f50739;
                                        if (zM38456) {
                                            int i9 = c15606.f50741;
                                            int i10 = c15607.f50741;
                                            if (i9 < i10) {
                                                arrayList.set(i6, new C15606(str2, i10, i7));
                                                arrayList.add(i6 + 1, new C15606(str2, i7, i8));
                                            } else {
                                                arrayList.set(i4, new C15606(str, i9, i8));
                                                arrayList.add(i5, new C15606(str, i8, i7));
                                            }
                                        } else {
                                            i6++;
                                        }
                                    } else {
                                        i4 = i5;
                                    }
                                }
                            }
                            return (C15606[]) arrayList.toArray(new C15606[0]);
                        }
                    }
                }
                i = i2;
            }
        }
        return c15606Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38456(C15606 c15606, C15606 c15607) {
        int i = c15606.f50741;
        int i2 = c15606.f50739;
        int i3 = c15607.f50741;
        int i4 = c15607.f50739;
        if (i >= i3 || i3 >= i2 || i2 >= i4) {
            return i3 < i && i < i4 && i4 < i2;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C15606[] m38458(C15606[] c15606Arr) {
        if (c15606Arr == null || c15606Arr.length <= 1) {
            return c15606Arr;
        }
        HashMap map = new HashMap();
        for (C15606 c15606 : c15606Arr) {
            ((List) C9735.computeIfAbsent(map, c15606.f50740, new C19839(0))).add(c15606);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            List list = (List) map.get(str);
            C13638.requireNonNull(list);
            List list2 = list;
            C23846.sort(list2, C7618.comparingInt(new C0082()));
            int i = ((C15606) list2.get(0)).f50741;
            int iMax = ((C15606) list2.get(0)).f50739;
            for (int i2 = 1; i2 < list2.size(); i2++) {
                C15606 c15607 = (C15606) list2.get(i2);
                int i3 = c15607.f50741;
                int i4 = c15607.f50739;
                if (i3 <= iMax) {
                    iMax = Math.max(iMax, i4);
                } else {
                    arrayList.add(new C15606(str, i, iMax));
                    i = c15607.f50741;
                    iMax = i4;
                }
            }
            arrayList.add(new C15606(str, i, iMax));
        }
        return (C15606[]) arrayList.toArray(new C15606[0]);
    }
}
