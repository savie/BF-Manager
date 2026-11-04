package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۤۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 7CAF */
/* JADX INFO: loaded from: classes4.dex */
public final class C10793 implements InterfaceC12285, InterfaceC19597 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19744 f34252;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f34251 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f34253 = 0;

    @Override // l.InterfaceC6173, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C20490.m46990(this, consumer);
    }

    @Override // java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    public C10793(C19744 c19744) {
        this.f34252 = c19744;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34253 < this.f34252.f63567;
    }

    @Override // l.InterfaceC6173
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f34252.f63566;
        int i = this.f34253;
        this.f34253 = i + 1;
        this.f34251 = i;
        return jArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f34251 == -1) {
            throw new IllegalStateException();
        }
        this.f34251 = -1;
        C19744 c19744 = this.f34252;
        int i = c19744.f63567;
        c19744.f63567 = i - 1;
        int i2 = this.f34253;
        int i3 = i2 - 1;
        this.f34253 = i3;
        long[] jArr = c19744.f63566;
        System.arraycopy(jArr, i2, jArr, i3, i - i2);
    }

    @Override // l.InterfaceC24073
    public final void forEachRemaining(LongConsumer longConsumer) {
        C19744 c19744 = this.f34252;
        long[] jArr = c19744.f63566;
        while (true) {
            int i = this.f34253;
            if (i >= c19744.f63567) {
                return;
            }
            this.f34253 = i + 1;
            longConsumer.accept(jArr[i]);
        }
    }
}
