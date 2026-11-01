package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes2.dex */
public final class C2526 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m7899(List list, Object obj) {
        if (list == null) {
            list = new ArrayList(1);
        }
        list.add(obj);
        return list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7898(Object[] objArr) {
        if (objArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7897(int[] iArr) {
        if (iArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7896(int i, Object[] objArr) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(objArr[i2]);
        }
        return arrayList;
    }
}
