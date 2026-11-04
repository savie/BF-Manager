package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۤۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10645 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        C19596 c19596 = (C19596) obj;
        C19596 c19597 = (C19596) obj2;
        C15648 c15648M45197 = c19597.m45197();
        int i5 = c15648M45197.f50814;
        long j = -1;
        long j2 = (i5 <= 0 || (i4 = c15648M45197.f50852) <= 0) ? -1L : ((long) i5) * ((long) i4);
        C15648 c15648M45198 = c19596.m45197();
        int i6 = c15648M45198.f50814;
        if (i6 > 0 && (i3 = c15648M45198.f50852) > 0) {
            j = ((long) i6) * ((long) i3);
        }
        int iCompare = Long.compare(j2, j);
        if (iCompare != 0) {
            return iCompare;
        }
        C15648 c15648M45199 = c19597.m45197();
        int i7 = c15648M45199.f50814;
        int iMin = (i7 <= 0 || (i2 = c15648M45199.f50852) <= 0) ? -1 : Math.min(i7, i2);
        C15648 c15648M451910 = c19596.m45197();
        int i8 = c15648M451910.f50814;
        int iCompare2 = Integer.compare(iMin, (i8 <= 0 || (i = c15648M451910.f50852) <= 0) ? -1 : Math.min(i8, i));
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(Math.max(-1, c19597.m45197().f50849), Math.max(-1, c19596.m45197().f50849));
        return iCompare3 != 0 ? iCompare3 : Integer.compare(c19596.m45198(), c19597.m45198());
    }
}
