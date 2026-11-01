package l;

import java.util.NoSuchElementException;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۬ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2GI */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13284 extends AbstractC0500 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f44122;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f44123;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo17135();

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo17136(int i);

    /* JADX INFO: renamed from: ܰ */
    public abstract long mo17137(int i);

    public AbstractC13284(int i) {
        this.f44123 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44123 < mo17135();
    }

    @Override // l.InterfaceC12932
    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f44123;
        this.f44123 = i + 1;
        this.f44122 = i;
        return mo17137(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f44122;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo17136(i);
        int i2 = this.f44122;
        int i3 = this.f44123;
        if (i2 < i3) {
            this.f44123 = i3 - 1;
        }
        this.f44122 = -1;
    }

    @Override // l.AbstractC0500, l.InterfaceC12932
    public void forEachRemaining(LongConsumer longConsumer) {
        while (this.f44123 < mo17135()) {
            int i = this.f44123;
            this.f44123 = i + 1;
            this.f44122 = i;
            longConsumer.accept(mo17137(i));
        }
    }
}
