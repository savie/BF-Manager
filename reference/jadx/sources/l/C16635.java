package l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.ܺۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16635 extends CountedCompleter {
    public InterfaceC8409 a;
    public final InterfaceC15143 b;
    public final AbstractC13956 c;
    public long d;

    public C16635(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, InterfaceC15143 interfaceC15143) {
        super(null);
        this.b = interfaceC15143;
        this.c = abstractC13956;
        this.a = interfaceC8409;
        this.d = 0L;
    }

    public C16635(C16635 c16635, InterfaceC8409 interfaceC8409) {
        super(c16635);
        this.a = interfaceC8409;
        this.b = c16635.b;
        this.d = c16635.d;
        this.c = c16635.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC8409 interfaceC8409TrySplit;
        InterfaceC8409 interfaceC8409 = this.a;
        long jEstimateSize = interfaceC8409.estimateSize();
        long jE = this.d;
        if (jE == 0) {
            jE = AbstractC19902.e(jEstimateSize);
            this.d = jE;
        }
        boolean zP = EnumC21614.SHORT_CIRCUIT.p(((AbstractC15470) this.c).m);
        InterfaceC15143 interfaceC15143 = this.b;
        boolean z = false;
        C16635 c16635 = this;
        while (true) {
            if (zP && interfaceC15143.f()) {
                break;
            }
            if (jEstimateSize <= jE || (interfaceC8409TrySplit = interfaceC8409.trySplit()) == null) {
                c16635.c.M(interfaceC8409, interfaceC15143);
                break;
            }
            C16635 c16636 = new C16635(c16635, interfaceC8409TrySplit);
            c16635.addToPendingCount(1);
            if (z) {
                interfaceC8409 = interfaceC8409TrySplit;
            } else {
                C16635 c16637 = c16635;
                c16635 = c16636;
                c16636 = c16637;
            }
            z = !z;
            c16635.fork();
            c16635 = c16636;
            jEstimateSize = interfaceC8409.estimateSize();
        }
        c16635.a = null;
        c16635.propagateCompletion();
    }
}
