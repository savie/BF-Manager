package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۚۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5328 extends AbstractC2236 implements InterfaceC10974 {
    public final int[] h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC10974
    public final /* synthetic */ void d(Integer num) {
        AbstractC22686.p(this, num);
    }

    public C5328(InterfaceC20693 interfaceC20693, AbstractC22686 abstractC22686, int[] iArr) {
        super(interfaceC20693, abstractC22686, iArr.length);
        this.h = iArr;
    }

    public C5328(C5328 c5328, InterfaceC20693 interfaceC20693, long j, long j2) {
        super(c5328, interfaceC20693, j, j2, c5328.h.length);
        this.h = c5328.h;
    }

    @Override // l.AbstractC2236
    public final AbstractC2236 a(InterfaceC20693 interfaceC20693, long j, long j2) {
        return new C5328(this, interfaceC20693, j, j2);
    }

    @Override // l.AbstractC2236, l.InterfaceC19171
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }
}
