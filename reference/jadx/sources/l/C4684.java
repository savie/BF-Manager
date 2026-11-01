package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۙܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4684 extends AbstractC17269 {
    public final AbstractC5752 h;
    public final IntFunction i;
    public final boolean j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f77960l;

    @Override // l.AbstractC17269, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        InterfaceC8616 interfaceC8616L;
        AbstractC17269 abstractC17269 = this.d;
        if (abstractC17269 != null) {
            if (this.j) {
                C4684 c4684 = (C4684) abstractC17269;
                long j = c4684.f77960l;
                this.f77960l = j;
                if (j == c4684.k) {
                    this.f77960l = j + ((C4684) this.e).f77960l;
                }
            }
            C4684 c4685 = (C4684) abstractC17269;
            long j2 = c4685.k;
            C4684 c4686 = (C4684) this.e;
            this.k = j2 + c4686.k;
            if (c4685.k == 0) {
                interfaceC8616L = (InterfaceC8616) c4686.f;
            } else {
                interfaceC8616L = c4686.k == 0 ? (InterfaceC8616) c4685.f : AbstractC22686.L(this.h.m0(), (InterfaceC8616) ((C4684) this.d).f, (InterfaceC8616) ((C4684) this.e).f);
            }
            InterfaceC8616 interfaceC8616J = interfaceC8616L;
            if (b() && this.j) {
                interfaceC8616J = interfaceC8616J.j(this.f77960l, interfaceC8616J.count(), this.i);
            }
            this.f = interfaceC8616J;
        }
        super.onCompletion(countedCompleter);
    }

    public C4684(AbstractC5752 abstractC5752, AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, IntFunction intFunction) {
        super(abstractC22686, interfaceC20693);
        this.h = abstractC5752;
        this.i = intFunction;
        this.j = EnumC2970.ORDERED.s(((AbstractC5752) abstractC22686).m);
    }

    public C4684(C4684 c4684, InterfaceC20693 interfaceC20693) {
        super(c4684, interfaceC20693);
        this.h = c4684.h;
        this.i = c4684.i;
        this.j = c4684.j;
    }

    @Override // l.AbstractC17269
    public final AbstractC17269 c(InterfaceC20693 interfaceC20693) {
        return new C4684(this, interfaceC20693);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // l.AbstractC17269
    public final Object a() {
        long jR;
        boolean zB = b();
        if (zB || !this.j) {
            jR = -1;
        } else {
            EnumC2970 enumC2970 = EnumC2970.SIZED;
            AbstractC5752 abstractC5752 = this.h;
            int i = abstractC5752.j;
            int i2 = enumC2970.e;
            if ((i & i2) == i2) {
                jR = abstractC5752.R(this.b);
            } else {
                jR = -1;
            }
        }
        InterfaceC23280 interfaceC23280C0 = this.a.c0(jR, this.i);
        InterfaceC0182 interfaceC0182D = ((InterfaceC21349) this.h).d(interfaceC23280C0, this.j && !zB);
        this.a.f0(this.b, interfaceC0182D);
        InterfaceC8616 interfaceC8616Build = interfaceC23280C0.build();
        this.k = interfaceC8616Build.count();
        this.f77960l = interfaceC0182D.h();
        return interfaceC8616Build;
    }
}
