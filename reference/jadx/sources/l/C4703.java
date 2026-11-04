package l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.ۙۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4703 extends CountedCompleter {
    public final AbstractC13956 a;
    public InterfaceC8409 b;
    public final long c;
    public final ConcurrentMapC17249 d;
    public final AbstractC18301 e;
    public final C4703 f;
    public InterfaceC13409 g;

    public C4703(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, AbstractC18301 abstractC18301) {
        super(null);
        this.a = abstractC13956;
        this.b = interfaceC8409;
        this.c = AbstractC19902.e(interfaceC8409.estimateSize());
        this.d = new ConcurrentMapC17249(Math.max(16, AbstractC19902.g << 1));
        this.e = abstractC18301;
        this.f = null;
    }

    public C4703(C4703 c4703, InterfaceC8409 interfaceC8409, C4703 c4704) {
        super(c4703);
        this.a = c4703.a;
        this.b = interfaceC8409;
        this.c = c4703.c;
        this.d = c4703.d;
        this.e = c4703.e;
        this.f = c4704;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC8409 interfaceC8409TrySplit;
        InterfaceC8409 interfaceC8409 = this.b;
        long j = this.c;
        boolean z = false;
        C4703 c4703 = this;
        while (interfaceC8409.estimateSize() > j && (interfaceC8409TrySplit = interfaceC8409.trySplit()) != null) {
            C4703 c4704 = new C4703(c4703, interfaceC8409TrySplit, c4703.f);
            C4703 c4705 = new C4703(c4703, interfaceC8409, c4704);
            c4703.addToPendingCount(1);
            c4705.addToPendingCount(1);
            c4703.d.put(c4704, c4705);
            if (c4703.f != null) {
                c4704.addToPendingCount(1);
                if (c4703.d.replace(c4703.f, c4703, c4704)) {
                    c4703.addToPendingCount(-1);
                } else {
                    c4704.addToPendingCount(-1);
                }
            }
            if (z) {
                interfaceC8409 = interfaceC8409TrySplit;
                c4703 = c4704;
                c4704 = c4705;
            } else {
                c4703 = c4705;
            }
            z = !z;
            c4704.fork();
        }
        if (c4703.getPendingCount() > 0) {
            C22272 c22272 = new C22272(19);
            AbstractC13956 abstractC13956 = c4703.a;
            InterfaceC4262 interfaceC4262C0 = abstractC13956.c0(abstractC13956.R(interfaceC8409), c22272);
            c4703.a.f0(interfaceC8409, interfaceC4262C0);
            c4703.g = interfaceC4262C0.build();
            c4703.b = null;
        }
        c4703.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        InterfaceC13409 interfaceC13409 = this.g;
        if (interfaceC13409 != null) {
            interfaceC13409.forEach(this.e);
            this.g = null;
        } else {
            InterfaceC8409 interfaceC8409 = this.b;
            if (interfaceC8409 != null) {
                this.a.f0(interfaceC8409, this.e);
                this.b = null;
            }
        }
        C4703 c4703 = (C4703) this.d.remove(this);
        if (c4703 != null) {
            c4703.tryComplete();
        }
    }
}
