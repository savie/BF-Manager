package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۘܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77D */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4201 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C9861 c9861 = (C9861) obj;
        C9861 c9862 = (C9861) obj2;
        int iCompare = Long.compare(c9862.f31732, c9861.f31732);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(c9861.f31735, c9862.f31735);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(c9861.f31734, c9862.f31734);
        return iCompare3 != 0 ? iCompare3 : Integer.compare(c9861.f31733, c9862.f31733);
    }
}
