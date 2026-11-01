package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8HS */
/* JADX INFO: loaded from: classes2.dex */
public final class C0830 implements InterfaceC5064 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AbstractC10959 f3463 = AbstractC10959.m27714().m27720(new C9576()).m27719(AbstractC10959.m27714().mo27718().m27720(new C17745(5)));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f3464 = new ArrayList();

    @Override // l.InterfaceC5064
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo3424(C17513 c17513, long j) {
        long j2 = c17513.f55685;
        C2023.m6507(j2 != -9223372036854775807L);
        C2023.m6507(c17513.f55688 != -9223372036854775807L);
        boolean z = j2 <= j && j < c17513.f55687;
        ArrayList arrayList = this.f3464;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C17513) arrayList.get(size)).f55685) {
                arrayList.add(size + 1, c17513);
                return z;
            }
        }
        arrayList.add(0, c17513);
        return z;
    }

    @Override // l.InterfaceC5064
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 mo3423(long j) {
        ArrayList arrayList = this.f3464;
        if (!arrayList.isEmpty()) {
            if (j >= ((C17513) arrayList.get(0)).f55685) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    C17513 c17513 = (C17513) arrayList.get(i);
                    if (j >= c17513.f55685 && j < c17513.f55687) {
                        arrayList2.add(c17513);
                    }
                    if (j < c17513.f55685) {
                        break;
                    }
                }
                AbstractC22433 abstractC22433M49798 = AbstractC22433.m49798(f3463, arrayList2);
                C4793 c4793 = new C4793();
                for (int i2 = 0; i2 < abstractC22433M49798.size(); i2++) {
                    c4793.m52162((List) ((C17513) abstractC22433M49798.get(i2)).f55686);
                }
                return c4793.m13309();
            }
        }
        return AbstractC22433.of();
    }

    @Override // l.InterfaceC5064
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo3422(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3464;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((C17513) arrayList.get(i)).f55685;
            if (j > j2 && j > ((C17513) arrayList.get(i)).f55687) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // l.InterfaceC5064
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long mo3426(long j) {
        ArrayList arrayList = this.f3464;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((C17513) arrayList.get(0)).f55685) {
            return -9223372036854775807L;
        }
        long jMax = ((C17513) arrayList.get(0)).f55685;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((C17513) arrayList.get(i)).f55685;
            long j3 = ((C17513) arrayList.get(i)).f55687;
            if (j3 <= j) {
                jMax = Math.max(jMax, j3);
            } else {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            }
        }
        return jMax;
    }

    @Override // l.InterfaceC5064
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long mo3425(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f3464;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((C17513) arrayList.get(i)).f55685;
            long j3 = ((C17513) arrayList.get(i)).f55687;
            if (j < j2) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // l.InterfaceC5064
    public final void clear() {
        this.f3464.clear();
    }
}
