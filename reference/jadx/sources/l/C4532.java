package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۙ֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4532 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16121;

    public /* synthetic */ C4532(int i) {
        this.f16121 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f16121) {
            case 0:
                return ((AbstractC22044) obj).getName().compareToIgnoreCase(((AbstractC22044) obj2).getName());
            default:
                C7694 c7694 = (C7694) obj;
                C7694 c7695 = (C7694) obj2;
                int i = C23706.f76834;
                boolean zStartsWith = c7694.m20965().startsWith("_");
                if (zStartsWith == c7695.m20965().startsWith("_")) {
                    return Integer.compare(c7694.m20966(), c7695.m20966());
                }
                return zStartsWith ? 1 : -1;
        }
    }
}
