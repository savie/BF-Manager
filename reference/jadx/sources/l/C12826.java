package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8UT */
/* JADX INFO: loaded from: classes4.dex */
public final class C12826 implements InterfaceC5064 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f42700 = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    @Override // l.InterfaceC5064
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3424(C17513 c17513, long j) {
        boolean z;
        long j2 = c17513.f55685;
        C2023.m6507(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = c17513.f55687;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ArrayList arrayList = this.f42700;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C17513) arrayList.get(size)).f55685) {
                arrayList.add(size + 1, c17513);
                return z;
            }
            if (((C17513) arrayList.get(size)).f55685 <= j) {
                z = false;
            }
        }
        arrayList.add(0, c17513);
        return z;
    }

    @Override // l.InterfaceC5064
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22433 mo3423(long j) {
        int iM31828 = m31828(j);
        if (iM31828 == 0) {
            return AbstractC22433.of();
        }
        C17513 c17513 = (C17513) this.f42700.get(iM31828 - 1);
        long j2 = c17513.f55687;
        if (j2 == -9223372036854775807L || j < j2) {
            return c17513.f55686;
        }
        return AbstractC22433.of();
    }

    @Override // l.InterfaceC5064
    /* JADX INFO: renamed from: ۖ */
    public final void mo3422(long j) {
        int iM31828 = m31828(j);
        if (iM31828 == 0) {
            return;
        }
        ArrayList arrayList = this.f42700;
        long j2 = ((C17513) arrayList.get(iM31828 - 1)).f55687;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iM31828--;
        }
        arrayList.subList(0, iM31828).clear();
    }

    @Override // l.InterfaceC5064
    /* JADX INFO: renamed from: ܰ */
    public final long mo3426(long j) {
        ArrayList arrayList = this.f42700;
        if (arrayList.isEmpty() || j < ((C17513) arrayList.get(0)).f55685) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((C17513) arrayList.get(i)).f55685;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                C17513 c17513 = (C17513) arrayList.get(i - 1);
                long j3 = c17513.f55687;
                return (j3 == -9223372036854775807L || j3 > j) ? c17513.f55685 : j3;
            }
        }
        C17513 c17514 = (C17513) C22808.m50475(arrayList);
        long j4 = c17514.f55687;
        return (j4 == -9223372036854775807L || j < j4) ? c17514.f55685 : j4;
    }

    @Override // l.InterfaceC5064
    /* JADX INFO: renamed from: ۨ */
    public final long mo3425(long j) {
        ArrayList arrayList = this.f42700;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((C17513) arrayList.get(0)).f55685) {
            return ((C17513) arrayList.get(0)).f55685;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            C17513 c17513 = (C17513) arrayList.get(i);
            long j2 = c17513.f55685;
            long j3 = c17513.f55685;
            if (j < j2) {
                long j4 = ((C17513) arrayList.get(i - 1)).f55687;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((C17513) C22808.m50475(arrayList)).f55687;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // l.InterfaceC5064
    public final void clear() {
        this.f42700.clear();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m31828(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f42700;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((C17513) arrayList.get(i)).f55685) {
                return i;
            }
            i++;
        }
    }
}
