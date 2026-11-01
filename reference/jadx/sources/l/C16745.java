package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܽܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16745 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C9835 c9835 = (C9835) obj;
        C9835 c9836 = (C9835) obj2;
        int iCompare = Long.compare(c9836.f33610, c9835.f33610);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(c9835.f33613, c9836.f33613);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(c9835.f33611, c9836.f33611);
        return iCompare3 != 0 ? iCompare3 : Integer.compare(c9835.f33612, c9836.f33612);
    }
}
