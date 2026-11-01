package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۠ۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8151 extends AbstractC2236 implements InterfaceC21993 {
    public final long[] h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C21917.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC21993
    public final /* synthetic */ void l(Long l2) {
        AbstractC22686.r(this, l2);
    }

    public C8151(InterfaceC20693 interfaceC20693, AbstractC22686 abstractC22686, long[] jArr) {
        super(interfaceC20693, abstractC22686, jArr.length);
        this.h = jArr;
    }

    public C8151(C8151 c8151, InterfaceC20693 interfaceC20693, long j, long j2) {
        super(c8151, interfaceC20693, j, j2, c8151.h.length);
        this.h = c8151.h;
    }

    @Override // l.AbstractC2236
    public final AbstractC2236 a(InterfaceC20693 interfaceC20693, long j, long j2) {
        return new C8151(this, interfaceC20693, j, j2);
    }

    @Override // l.AbstractC2236, l.InterfaceC19171
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
