package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢ᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10337 extends AbstractC19047 implements InterfaceC12334 {
    public final int[] h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C4109.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC12334
    public final /* synthetic */ void d(Integer num) {
        AbstractC13956.p(this, num);
    }

    public C10337(InterfaceC8409 interfaceC8409, AbstractC13956 abstractC13956, int[] iArr) {
        super(interfaceC8409, abstractC13956, iArr.length);
        this.h = iArr;
    }

    public C10337(C10337 c10337, InterfaceC8409 interfaceC8409, long j, long j2) {
        super(c10337, interfaceC8409, j, j2, c10337.h.length);
        this.h = c10337.h;
    }

    @Override // l.AbstractC19047
    public final AbstractC19047 a(InterfaceC8409 interfaceC8409, long j, long j2) {
        return new C10337(this, interfaceC8409, j, j2);
    }

    @Override // l.AbstractC19047, l.InterfaceC15143
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
