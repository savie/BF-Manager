package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ᩴۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19793 extends AbstractC19047 implements InterfaceC1148 {
    public final long[] h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C18279.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC1148
    public final /* synthetic */ void l(Long l2) {
        AbstractC13956.r(this, l2);
    }

    public C19793(InterfaceC8409 interfaceC8409, AbstractC13956 abstractC13956, long[] jArr) {
        super(interfaceC8409, abstractC13956, jArr.length);
        this.h = jArr;
    }

    public C19793(C19793 c19793, InterfaceC8409 interfaceC8409, long j, long j2) {
        super(c19793, interfaceC8409, j, j2, c19793.h.length);
        this.h = c19793.h;
    }

    @Override // l.AbstractC19047
    public final AbstractC19047 a(InterfaceC8409 interfaceC8409, long j, long j2) {
        return new C19793(this, interfaceC8409, j, j2);
    }

    @Override // l.AbstractC19047, l.InterfaceC15143
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }
}
