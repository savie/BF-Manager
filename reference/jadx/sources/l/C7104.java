package l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۜۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15PL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7104 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m19448(List list, InterfaceC5417 interfaceC5417, Comparable comparable, Comparator comparator, EnumC8595 enumC8595, EnumC7850 enumC7850) {
        AbstractList abstractListM14373 = C4583.m14373(list, interfaceC5417);
        comparator.getClass();
        enumC8595.getClass();
        enumC7850.getClass();
        if (!(abstractListM14373 instanceof RandomAccess)) {
            abstractListM14373 = new ArrayList(abstractListM14373);
        }
        int size = abstractListM14373.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int iCompare = comparator.compare(comparable, abstractListM14373.get(i2));
            if (iCompare < 0) {
                size = i2 - 1;
            } else {
                if (iCompare <= 0) {
                    return i + enumC8595.mo4214(comparator, comparable, abstractListM14373.subList(i, size + 1), i2 - i);
                }
                i = i2 + 1;
            }
        }
        return enumC7850.mo2201(i);
    }
}
