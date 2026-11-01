package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۢۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9546 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        C4979 c4979 = (C4979) obj;
        C4979 c49710 = (C4979) obj2;
        C7648 c7648M13808 = c49710.m13808();
        int i5 = c7648M13808.f25246;
        long j = -1;
        long j2 = (i5 <= 0 || (i4 = c7648M13808.f25253) <= 0) ? -1L : ((long) i5) * ((long) i4);
        C7648 c7648M13809 = c4979.m13808();
        int i6 = c7648M13809.f25246;
        if (i6 > 0 && (i3 = c7648M13809.f25253) > 0) {
            j = ((long) i6) * ((long) i3);
        }
        int iCompare = Long.compare(j2, j);
        if (iCompare != 0) {
            return iCompare;
        }
        C7648 c7648M138010 = c49710.m13808();
        int i7 = c7648M138010.f25246;
        int iMin = (i7 <= 0 || (i2 = c7648M138010.f25253) <= 0) ? -1 : Math.min(i7, i2);
        C7648 c7648M138011 = c4979.m13808();
        int i8 = c7648M138011.f25246;
        int iCompare2 = Integer.compare(iMin, (i8 <= 0 || (i = c7648M138011.f25253) <= 0) ? -1 : Math.min(i8, i));
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(Math.max(-1, c49710.m13808().f25242), Math.max(-1, c4979.m13808().f25242));
        return iCompare3 != 0 ? iCompare3 : Integer.compare(c4979.m13807(), c49710.m13807());
    }
}
