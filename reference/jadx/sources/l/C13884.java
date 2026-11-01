package l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ܰܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15PL */
/* JADX INFO: loaded from: classes3.dex */
public final class C13884 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m33722(List list, InterfaceC11955 interfaceC11955, Comparable comparable, Comparator comparator, EnumC4710 enumC4710, EnumC11332 enumC11332) {
        AbstractList abstractListM9144 = C3051.m9144(list, interfaceC11955);
        comparator.getClass();
        enumC4710.getClass();
        enumC11332.getClass();
        if (!(abstractListM9144 instanceof RandomAccess)) {
            abstractListM9144 = new ArrayList(abstractListM9144);
        }
        int size = abstractListM9144.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int iCompare = comparator.compare(comparable, abstractListM9144.get(i2));
            if (iCompare < 0) {
                size = i2 - 1;
            } else {
                if (iCompare <= 0) {
                    return i + enumC4710.mo6723(comparator, comparable, abstractListM9144.subList(i, size + 1), i2 - i);
                }
                i = i2 + 1;
            }
        }
        return enumC11332.mo17539(i);
    }
}
