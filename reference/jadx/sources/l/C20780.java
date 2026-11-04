package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩵᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20780 extends AbstractC19047 implements InterfaceC13080 {
    public final double[] h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC2946.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC13080
    public final /* synthetic */ void n(Double d) {
        AbstractC13956.n(this, d);
    }

    public C20780(InterfaceC8409 interfaceC8409, AbstractC13956 abstractC13956, double[] dArr) {
        super(interfaceC8409, abstractC13956, dArr.length);
        this.h = dArr;
    }

    public C20780(C20780 c20780, InterfaceC8409 interfaceC8409, long j, long j2) {
        super(c20780, interfaceC8409, j, j2, c20780.h.length);
        this.h = c20780.h;
    }

    @Override // l.AbstractC19047
    public final AbstractC19047 a(InterfaceC8409 interfaceC8409, long j, long j2) {
        return new C20780(this, interfaceC8409, j, j2);
    }

    @Override // l.AbstractC19047, l.InterfaceC15143, l.InterfaceC13080, java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }
}
