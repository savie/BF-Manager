package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۙۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H78K */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4880 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17053;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f17053) {
            case 0:
                C23330 c23330 = (C23330) obj;
                C23330 c23331 = (C23330) obj2;
                int iCompareTo = c23330.f75565.compareTo(c23331.f75565);
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = c23330.f75564.compareTo(c23331.f75564);
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(c23330.f75563, c23331.f75563);
            default:
                C7694 c7694 = (C7694) obj;
                C7694 c7695 = (C7694) obj2;
                int i = C23706.f76834;
                boolean zStartsWith = c7694.m20965().startsWith("_");
                if (zStartsWith == c7695.m20965().startsWith("_")) {
                    return c7694.m20965().compareToIgnoreCase(c7695.m20965());
                }
                return zStartsWith ? 1 : -1;
        }
    }
}
