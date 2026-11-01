package l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ᩴ᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19046 extends AbstractC5793 {
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19046(AbstractC7944 abstractC7944, int i, long j, long j2) {
        super(abstractC7944, i);
        this.s = j;
        this.t = j2;
    }

    @Override // l.AbstractC5752
    public final InterfaceC20693 o0(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        long j;
        long j2;
        long jR = abstractC5752.R(interfaceC20693);
        if (jR > 0 && interfaceC20693.hasCharacteristics(16384)) {
            InterfaceC19282 interfaceC19282 = (InterfaceC19282) abstractC5752.h0(interfaceC20693);
            long j3 = this.s;
            return new C18452(interfaceC19282, j3, AbstractC20092.c(j3, this.t));
        }
        if (EnumC2970.ORDERED.s(abstractC5752.m)) {
            return ((InterfaceC8616) new C15153(this, abstractC5752, interfaceC20693, new C1040(21), this.s, this.t).invoke()).spliterator();
        }
        InterfaceC19282 interfaceC19283 = (InterfaceC19282) abstractC5752.h0(interfaceC20693);
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
        return new C21315(interfaceC19283, j, j2);
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
            return AbstractC22686.K(abstractC22686, AbstractC20092.b(abstractC5752.m0(), interfaceC20693, this.s, this.t), true);
        }
        if (!EnumC2970.ORDERED.s(((AbstractC5752) abstractC22686).m)) {
            InterfaceC19282 interfaceC19282 = (InterfaceC19282) abstractC22686.h0(interfaceC20693);
            long j3 = this.s;
            long j4 = this.t;
            if (j3 <= jR) {
                long jMin = jR - j3;
                if (j4 >= 0) {
                    jMin = Math.min(j4, jMin);
                }
                j = jMin;
                j2 = 0;
            } else {
                j = j4;
                j2 = j3;
            }
            return AbstractC22686.K(this, new C21315(interfaceC19282, j2, j), true);
        }
        return (InterfaceC8616) new C15153(this, abstractC22686, interfaceC20693, intFunction, this.s, this.t).invoke();
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        return new C2817(this, interfaceC19171);
    }
}
