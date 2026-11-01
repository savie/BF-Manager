package l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.ۙۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4353 extends CountedCompleter {
    public final AbstractC22686 a;
    public InterfaceC20693 b;
    public final long c;
    public final ConcurrentMapC13783 d;
    public final AbstractC0389 e;
    public final C4353 f;
    public InterfaceC8616 g;

    public C4353(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, AbstractC0389 abstractC0389) {
        super(null);
        this.a = abstractC22686;
        this.b = interfaceC20693;
        this.c = AbstractC17269.e(interfaceC20693.estimateSize());
        this.d = new ConcurrentMapC13783(Math.max(16, AbstractC17269.g << 1));
        this.e = abstractC0389;
        this.f = null;
    }

    public C4353(C4353 c4353, InterfaceC20693 interfaceC20693, C4353 c4354) {
        super(c4353);
        this.a = c4353.a;
        this.b = interfaceC20693;
        this.c = c4353.c;
        this.d = c4353.d;
        this.e = c4353.e;
        this.f = c4354;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC20693 interfaceC20693TrySplit;
        InterfaceC20693 interfaceC20693 = this.b;
        long j = this.c;
        boolean z = false;
        C4353 c4353 = this;
        while (interfaceC20693.estimateSize() > j && (interfaceC20693TrySplit = interfaceC20693.trySplit()) != null) {
            C4353 c4354 = new C4353(c4353, interfaceC20693TrySplit, c4353.f);
            C4353 c4355 = new C4353(c4353, interfaceC20693, c4354);
            c4353.addToPendingCount(1);
            c4355.addToPendingCount(1);
            c4353.d.put(c4354, c4355);
            if (c4353.f != null) {
                c4354.addToPendingCount(1);
                if (c4353.d.replace(c4353.f, c4353, c4354)) {
                    c4353.addToPendingCount(-1);
                } else {
                    c4354.addToPendingCount(-1);
                }
            }
            if (z) {
                interfaceC20693 = interfaceC20693TrySplit;
                c4353 = c4354;
                c4354 = c4355;
            } else {
                c4353 = c4355;
            }
            z = !z;
            c4354.fork();
        }
        if (c4353.getPendingCount() > 0) {
            C13858 c13858 = new C13858(19);
            AbstractC22686 abstractC22686 = c4353.a;
            InterfaceC23280 interfaceC23280C0 = abstractC22686.c0(abstractC22686.R(interfaceC20693), c13858);
            c4353.a.f0(interfaceC20693, interfaceC23280C0);
            c4353.g = interfaceC23280C0.build();
            c4353.b = null;
        }
        c4353.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        InterfaceC8616 interfaceC8616 = this.g;
        if (interfaceC8616 != null) {
            interfaceC8616.forEach(this.e);
            this.g = null;
        } else {
            InterfaceC20693 interfaceC20693 = this.b;
            if (interfaceC20693 != null) {
                this.a.f0(interfaceC20693, this.e);
                this.b = null;
            }
        }
        C4353 c4353 = (C4353) this.d.remove(this);
        if (c4353 != null) {
            c4353.tryComplete();
        }
    }
}
