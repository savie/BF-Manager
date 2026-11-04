package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܶᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes5.dex */
public final class C16277 implements InterfaceC12285, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f52868 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3599 f52869;

    @Override // l.InterfaceC6173, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C20490.m46990(this, consumer);
    }

    @Override // java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    public C16277(C3599 c3599) {
        this.f52869 = c3599;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f52868 < this.f52869.f12304.f15714;
    }

    @Override // l.InterfaceC6173
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f52869.f12304.f15719;
        int i = this.f52868;
        this.f52868 = i + 1;
        return jArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f52868;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C3599 c3599 = this.f52869;
        C4345 c4345 = c3599.f12304;
        int i2 = c4345.f15714 - i;
        long[] jArr = c4345.f15719;
        System.arraycopy(jArr, i, jArr, i - 1, i2);
        Object[] objArr = c3599.f12304.f15715;
        int i3 = this.f52868;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C4345 c4346 = c3599.f12304;
        int i4 = c4346.f15714 - 1;
        c4346.f15714 = i4;
        this.f52868--;
        c4346.f15715[i4] = null;
    }

    @Override // l.InterfaceC24073
    public final void forEachRemaining(LongConsumer longConsumer) {
        C4345 c4345 = this.f52869.f12304;
        long[] jArr = c4345.f15719;
        int i = c4345.f15714;
        while (true) {
            int i2 = this.f52868;
            if (i2 >= i) {
                return;
            }
            this.f52868 = i2 + 1;
            longConsumer.accept(jArr[i2]);
        }
    }
}
