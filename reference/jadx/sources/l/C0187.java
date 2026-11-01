package l;

import java.util.List;

/* JADX INFO: renamed from: l.֡ۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18OR */
/* JADX INFO: loaded from: classes2.dex */
public final class C0187 implements InterfaceC19445 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f1307;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f1308;

    public C0187(List list, List list2) {
        int i = AbstractC22433.f73217;
        C4793 c4793 = new C4793();
        C2023.m6507(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            c4793.m52163(new C19944((InterfaceC19445) list.get(i2), (List) list2.get(i2)));
        }
        this.f1308 = c4793.m13309();
        this.f1307 = -9223372036854775807L;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long mo1391() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            AbstractC22433 abstractC22433 = this.f1308;
            if (i >= abstractC22433.size()) {
                break;
            }
            C19944 c19944 = (C19944) abstractC22433.get(i);
            long jMo1391 = c19944.mo1391();
            if ((c19944.m45239().contains(1) || c19944.m45239().contains(2) || c19944.m45239().contains(4)) && jMo1391 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo1391);
            }
            if (jMo1391 != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jMo1391);
            }
            i++;
        }
        if (jMin != C17492.FOREVER_NS) {
            this.f1307 = jMin;
            return jMin;
        }
        if (jMin2 == C17492.FOREVER_NS) {
            return Long.MIN_VALUE;
        }
        long j = this.f1307;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long mo1392() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            AbstractC22433 abstractC22433 = this.f1308;
            if (i >= abstractC22433.size()) {
                break;
            }
            long jMo1392 = ((C19944) abstractC22433.get(i)).mo1392();
            if (jMo1392 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo1392);
            }
            i++;
        }
        if (jMin == C17492.FOREVER_NS) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo1393(long j) {
        int i = 0;
        while (true) {
            AbstractC22433 abstractC22433 = this.f1308;
            if (i >= abstractC22433.size()) {
                return;
            }
            ((C19944) abstractC22433.get(i)).mo1393(j);
            i++;
        }
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1390(C14643 c14643) {
        boolean zMo1390;
        boolean z = false;
        do {
            long jMo1392 = mo1392();
            if (jMo1392 == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zMo1390 = false;
            while (true) {
                AbstractC22433 abstractC22433 = this.f1308;
                if (i >= abstractC22433.size()) {
                    break;
                }
                long jMo1393 = ((C19944) abstractC22433.get(i)).mo1392();
                boolean z2 = jMo1393 != Long.MIN_VALUE && jMo1393 <= c14643.f47886;
                if (jMo1393 == jMo1392 || z2) {
                    zMo1390 |= ((C19944) abstractC22433.get(i)).mo1390(c14643);
                }
                i++;
            }
            z |= zMo1390;
        } while (zMo1390);
        return z;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1389() {
        int i = 0;
        while (true) {
            AbstractC22433 abstractC22433 = this.f1308;
            if (i >= abstractC22433.size()) {
                return false;
            }
            if (((C19944) abstractC22433.get(i)).mo1389()) {
                return true;
            }
            i++;
        }
    }
}
