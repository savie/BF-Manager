package l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۗۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes2.dex */
public final class C3051 {
    @SafeVarargs
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m9146(Object... objArr) {
        int length = objArr.length;
        C20296.m45806(length, "arraySize");
        ArrayList arrayList = new ArrayList(C17039.m39822(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m9145(Iterator it) {
        ArrayList arrayList = new ArrayList();
        C16458.m38723(arrayList, it);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractList m9144(List list, InterfaceC11955 interfaceC11955) {
        if (list instanceof RandomAccess) {
            return new C14342(list, interfaceC11955);
        }
        return new C9403(list, interfaceC11955);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m9147(List list) {
        if (list instanceof AbstractC22433) {
            return ((AbstractC22433) list).mo29543();
        }
        if (list instanceof C10814) {
            return ((C10814) list).m27121();
        }
        if (!(list instanceof RandomAccess)) {
            return new C10814(list);
        }
        return new C17163(list);
    }
}
