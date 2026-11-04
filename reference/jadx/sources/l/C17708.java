package l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܽܽۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17708 extends AbstractC9481 {
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17708(AbstractC12487 abstractC12487, int i, long j, long j2) {
        super(abstractC12487, i);
        this.s = j;
        this.t = j2;
    }

    @Override // l.AbstractC15470
    public final InterfaceC8409 o0(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409) {
        long j;
        long j2;
        long jR = abstractC15470.R(interfaceC8409);
        if (jR > 0 && interfaceC8409.hasCharacteristics(16384)) {
            InterfaceC3012 interfaceC3012 = (InterfaceC3012) abstractC15470.h0(interfaceC8409);
            long j3 = this.s;
            return new C1499(interfaceC3012, j3, AbstractC16918.c(j3, this.t));
        }
        if (EnumC21614.ORDERED.p(abstractC15470.m)) {
            return ((InterfaceC13409) new C4986(this, abstractC15470, interfaceC8409, new C13189(22), this.s, this.t).invoke()).spliterator();
        }
        InterfaceC3012 interfaceC3013 = (InterfaceC3012) abstractC15470.h0(interfaceC8409);
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
        return new C16172(interfaceC3013, j, j2);
    }

    @Override // l.AbstractC15470
    public final InterfaceC13409 n0(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, IntFunction intFunction) {
        long j;
        long j2;
        long jR = abstractC13956.R(interfaceC8409);
        if (jR > 0 && interfaceC8409.hasCharacteristics(16384)) {
            AbstractC15470 abstractC15470 = (AbstractC15470) abstractC13956;
            while (abstractC15470.f82078l > 0) {
                abstractC15470 = abstractC15470.i;
            }
            return AbstractC13956.I(abstractC13956, AbstractC16918.b(abstractC15470.m0(), interfaceC8409, this.s, this.t), true);
        }
        if (!EnumC21614.ORDERED.p(((AbstractC15470) abstractC13956).m)) {
            InterfaceC3012 interfaceC3012 = (InterfaceC3012) abstractC13956.h0(interfaceC8409);
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
            return AbstractC13956.I(this, new C16172(interfaceC3012, j2, j), true);
        }
        return (InterfaceC13409) new C4986(this, abstractC13956, interfaceC8409, intFunction, this.s, this.t).invoke();
    }

    @Override // l.AbstractC15470
    public final InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143) {
        return new C22184(this, interfaceC15143);
    }
}
