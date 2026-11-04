package l;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9234 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f30072;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public SparseArray f30073;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Set f30074;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24424(AbstractC11800 abstractC11800) {
        int itemViewType = abstractC11800.getItemViewType();
        ArrayList arrayList = m24422(itemViewType).f3746;
        if (((C1032) this.f30073.get(itemViewType)).f3744 <= arrayList.size()) {
            C9880.m25687(abstractC11800.itemView);
        } else {
            if (C25227.sDebugAssertionsEnabled && arrayList.contains(abstractC11800)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            abstractC11800.resetInternal();
            arrayList.add(abstractC11800);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24426(int i, long j) {
        C1032 c1032M24422 = m24422(i);
        long j2 = c1032M24422.f3745;
        if (j2 != 0) {
            j = (j / 4) + ((j2 / 4) * 3);
        }
        c1032M24422.f3745 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24423(int i, long j) {
        C1032 c1032M24422 = m24422(i);
        long j2 = c1032M24422.f3743;
        if (j2 != 0) {
            j = (j / 4) + ((j2 / 4) * 3);
        }
        c1032M24422.f3743 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m24427(long j, int i, long j2) {
        long j3 = m24422(i).f3745;
        return j3 == 0 || j + j3 < j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24425(long j, int i, long j2) {
        long j3 = m24422(i).f3743;
        return j3 == 0 || j + j3 < j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1032 m24422(int i) {
        SparseArray sparseArray = this.f30073;
        C1032 c1032 = (C1032) sparseArray.get(i);
        if (c1032 != null) {
            return c1032;
        }
        C1032 c1033 = new C1032();
        sparseArray.put(i, c1033);
        return c1033;
    }
}
