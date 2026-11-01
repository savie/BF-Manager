package l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۚۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5142 extends AbstractC3709 {
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5142(AbstractC14295 abstractC14295, int i, long j, long j2) {
        super(abstractC14295, i);
        this.s = j;
        this.t = j2;
    }

    @Override // l.AbstractC5752
    public final InterfaceC20693 o0(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        long j;
        long j2;
        long jR = abstractC5752.R(interfaceC20693);
        if (jR > 0 && interfaceC20693.hasCharacteristics(16384)) {
            InterfaceC20693 interfaceC20693H0 = abstractC5752.h0(interfaceC20693);
            long j3 = this.s;
            return new C11625(interfaceC20693H0, j3, AbstractC20092.c(j3, this.t));
        }
        if (EnumC2970.ORDERED.s(abstractC5752.m)) {
            return ((InterfaceC8616) new C15153(this, abstractC5752, interfaceC20693, new C1040(11), this.s, this.t).invoke()).spliterator();
        }
        InterfaceC20693 interfaceC20693H1 = abstractC5752.h0(interfaceC20693);
        long j4 = this.s;
        long j5 = this.t;
        if (j4 <= jR) {
            long jMin = jR - j4;
            if (j5 >= 0) {
                jMin = Math.min(j5, jMin);
            }
            j2 = jMin;
            j = 0;
        } else {
            j = j4;
            j2 = j5;
        }
        return new C4415(interfaceC20693H1, j, j2);
    }

    @Override // l.AbstractC5752
    public final InterfaceC8616 n0(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, IntFunction intFunction) {
        long j;
        long j2;
        long jR = abstractC22686.R(interfaceC20693);
        if (jR > 0 && interfaceC20693.hasCharacteristics(16384)) {
            AbstractC5752 abstractC5752 = (AbstractC5752) abstractC22686;
            while (abstractC5752.f77961l > 0) {
                abstractC5752 = abstractC5752.i;
            }
            return AbstractC22686.H(abstractC22686, AbstractC20092.b(abstractC5752.m0(), interfaceC20693, this.s, this.t), true, intFunction);
        }
        if (!EnumC2970.ORDERED.s(((AbstractC5752) abstractC22686).m)) {
            InterfaceC20693 interfaceC20693H0 = abstractC22686.h0(interfaceC20693);
            long j3 = this.s;
            long j4 = this.t;
            if (j3 <= jR) {
                long jMin = jR - j3;
                if (j4 >= 0) {
                    jMin = Math.min(j4, jMin);
                }
                j2 = jMin;
                j = 0;
            } else {
                j = j3;
                j2 = j4;
            }
            return AbstractC22686.H(this, new C4415(interfaceC20693H0, j, j2), true, intFunction);
        }
        return (InterfaceC8616) new C15153(this, abstractC22686, interfaceC20693, intFunction, this.s, this.t).invoke();
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        return new C5765(this, interfaceC19171);
    }
}
