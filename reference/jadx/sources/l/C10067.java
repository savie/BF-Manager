package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C8UT */
/* JADX INFO: loaded from: classes4.dex */
public final class C10067 implements InterfaceC0373 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f32290 = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    @Override // l.InterfaceC0373
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2165(C16187 c16187, long j) {
        boolean z;
        long j2 = c16187.f52544;
        C20782.m47565(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = c16187.f52542;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ArrayList arrayList = this.f32290;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C16187) arrayList.get(size)).f52544) {
                arrayList.add(size + 1, c16187);
                return z;
            }
            if (((C16187) arrayList.get(size)).f52544 <= j) {
                z = false;
            }
        }
        arrayList.add(0, c16187);
        return z;
    }

    @Override // l.InterfaceC0373
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC1928 mo2164(long j) {
        int iM26029 = m26029(j);
        if (iM26029 == 0) {
            return AbstractC1928.of();
        }
        C16187 c16187 = (C16187) this.f32290.get(iM26029 - 1);
        long j2 = c16187.f52542;
        if (j2 == -9223372036854775807L || j < j2) {
            return c16187.f52541;
        }
        return AbstractC1928.of();
    }

    @Override // l.InterfaceC0373
    /* JADX INFO: renamed from: ᩸ */
    public final void mo2168(long j) {
        int iM26029 = m26029(j);
        if (iM26029 == 0) {
            return;
        }
        ArrayList arrayList = this.f32290;
        long j2 = ((C16187) arrayList.get(iM26029 - 1)).f52542;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iM26029--;
        }
        arrayList.subList(0, iM26029).clear();
    }

    @Override // l.InterfaceC0373
    /* JADX INFO: renamed from: ᩷ */
    public final long mo2167(long j) {
        ArrayList arrayList = this.f32290;
        if (arrayList.isEmpty() || j < ((C16187) arrayList.get(0)).f52544) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((C16187) arrayList.get(i)).f52544;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                C16187 c16187 = (C16187) arrayList.get(i - 1);
                long j3 = c16187.f52542;
                return (j3 == -9223372036854775807L || j3 > j) ? c16187.f52544 : j3;
            }
        }
        C16187 c16188 = (C16187) C16625.m39339(arrayList);
        long j4 = c16188.f52542;
        return (j4 == -9223372036854775807L || j < j4) ? c16188.f52544 : j4;
    }

    @Override // l.InterfaceC0373
    /* JADX INFO: renamed from: ۤ */
    public final long mo2166(long j) {
        ArrayList arrayList = this.f32290;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((C16187) arrayList.get(0)).f52544) {
            return ((C16187) arrayList.get(0)).f52544;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            C16187 c16187 = (C16187) arrayList.get(i);
            long j2 = c16187.f52544;
            long j3 = c16187.f52544;
            if (j < j2) {
                long j4 = ((C16187) arrayList.get(i - 1)).f52542;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((C16187) C16625.m39339(arrayList)).f52542;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // l.InterfaceC0373
    public final void clear() {
        this.f32290.clear();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m26029(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f32290;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((C16187) arrayList.get(i)).f52544) {
                return i;
            }
            i++;
        }
    }
}
