package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۛܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6096 extends AbstractC2236 implements InterfaceC8857 {
    public final double[] h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC14884.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC8857
    public final /* synthetic */ void n(Double d) {
        AbstractC22686.n(this, d);
    }

    public C6096(InterfaceC20693 interfaceC20693, AbstractC22686 abstractC22686, double[] dArr) {
        super(interfaceC20693, abstractC22686, dArr.length);
        this.h = dArr;
    }

    public C6096(C6096 c6096, InterfaceC20693 interfaceC20693, long j, long j2) {
        super(c6096, interfaceC20693, j, j2, c6096.h.length);
        this.h = c6096.h;
    }

    @Override // l.AbstractC2236
    public final AbstractC2236 a(InterfaceC20693 interfaceC20693, long j, long j2) {
        return new C6096(this, interfaceC20693, j, j2);
    }

    @Override // l.AbstractC2236, l.InterfaceC19171
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
