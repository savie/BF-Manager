package l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.ܶۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14938 extends CountedCompleter {
    public InterfaceC20693 a;
    public final InterfaceC19171 b;
    public final AbstractC22686 c;
    public long d;

    public C14938(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, InterfaceC19171 interfaceC19171) {
        super(null);
        this.b = interfaceC19171;
        this.c = abstractC22686;
        this.a = interfaceC20693;
        this.d = 0L;
    }

    public C14938(C14938 c14938, InterfaceC20693 interfaceC20693) {
        super(c14938);
        this.a = interfaceC20693;
        this.b = c14938.b;
        this.d = c14938.d;
        this.c = c14938.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC20693 interfaceC20693TrySplit;
        InterfaceC20693 interfaceC20693 = this.a;
        long jEstimateSize = interfaceC20693.estimateSize();
        long jE = this.d;
        if (jE == 0) {
            jE = AbstractC17269.e(jEstimateSize);
            this.d = jE;
        }
        boolean zS = EnumC2970.SHORT_CIRCUIT.s(((AbstractC5752) this.c).m);
        InterfaceC19171 interfaceC19171 = this.b;
        boolean z = false;
        C14938 c14938 = this;
        while (true) {
            if (zS && interfaceC19171.f()) {
                break;
            }
            if (jEstimateSize <= jE || (interfaceC20693TrySplit = interfaceC20693.trySplit()) == null) {
                c14938.c.M(interfaceC20693, interfaceC19171);
                break;
            }
            C14938 c14939 = new C14938(c14938, interfaceC20693TrySplit);
            c14938.addToPendingCount(1);
            if (z) {
                interfaceC20693 = interfaceC20693TrySplit;
            } else {
                C14938 c149310 = c14938;
                c14938 = c14939;
                c14939 = c149310;
            }
            z = !z;
            c14938.fork();
            c14938 = c14939;
            jEstimateSize = interfaceC20693.estimateSize();
        }
        c14938.a = null;
        c14938.propagateCompletion();
    }
}
