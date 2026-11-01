package l;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15377 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f50071;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public SparseArray f50072;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Set f50073;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36813(AbstractC12554 abstractC12554) {
        int itemViewType = abstractC12554.getItemViewType();
        ArrayList arrayList = m36811(itemViewType).f75131;
        if (((C23138) this.f50072.get(itemViewType)).f75133 <= arrayList.size()) {
            C10763.m27066(abstractC12554.itemView);
        } else {
            if (C17492.sDebugAssertionsEnabled && arrayList.contains(abstractC12554)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            abstractC12554.resetInternal();
            arrayList.add(abstractC12554);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36815(int i, long j) {
        C23138 c23138M36811 = m36811(i);
        long j2 = c23138M36811.f75134;
        if (j2 != 0) {
            j = (j / 4) + ((j2 / 4) * 3);
        }
        c23138M36811.f75134 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36812(int i, long j) {
        C23138 c23138M36811 = m36811(i);
        long j2 = c23138M36811.f75132;
        if (j2 != 0) {
            j = (j / 4) + ((j2 / 4) * 3);
        }
        c23138M36811.f75132 = j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m36816(long j, int i, long j2) {
        long j3 = m36811(i).f75134;
        return j3 == 0 || j + j3 < j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36814(long j, int i, long j2) {
        long j3 = m36811(i).f75132;
        return j3 == 0 || j + j3 < j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23138 m36811(int i) {
        SparseArray sparseArray = this.f50072;
        C23138 c23138 = (C23138) sparseArray.get(i);
        if (c23138 != null) {
            return c23138;
        }
        C23138 c23139 = new C23138();
        sparseArray.put(i, c23139);
        return c23139;
    }
}
