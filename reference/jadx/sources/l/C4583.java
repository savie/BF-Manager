package l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۙ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4583 {
    @SafeVarargs
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m14375(Object... objArr) {
        int length = objArr.length;
        C19278.m44623(length, "arraySize");
        ArrayList arrayList = new ArrayList(C18444.m42974(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m14374(Iterator it) {
        ArrayList arrayList = new ArrayList();
        C7676.m20914(arrayList, it);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractList m14373(List list, InterfaceC5417 interfaceC5417) {
        if (list instanceof RandomAccess) {
            return new C8421(list, interfaceC5417);
        }
        return new C13641(list, interfaceC5417);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m14376(List list) {
        if (list instanceof AbstractC1928) {
            return ((AbstractC1928) list).mo6620();
        }
        if (list instanceof C9166) {
            return ((C9166) list).m24299();
        }
        if (!(list instanceof RandomAccess)) {
            return new C9166(list);
        }
        return new C9912(list);
    }
}
