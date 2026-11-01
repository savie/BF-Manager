package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.֨֨۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H78K */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0788 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C5032 c5032 = (C5032) obj;
        C5032 c5033 = (C5032) obj2;
        int iCompareTo = c5032.f17548.compareTo(c5033.f17548);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = c5032.f17547.compareTo(c5033.f17547);
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(c5032.f17546, c5033.f17546);
    }
}
