package l;

import java.util.NoSuchElementException;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۛۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 2GI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6320 extends AbstractC5091 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f21422;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21423;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract int mo18039();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract void mo18040(int i);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract long mo18041(int i);

    public AbstractC6320(int i) {
        this.f21423 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21423 < mo18039();
    }

    @Override // l.InterfaceC6173
    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f21423;
        this.f21423 = i + 1;
        this.f21422 = i;
        return mo18041(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f21422;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo18040(i);
        int i2 = this.f21422;
        int i3 = this.f21423;
        if (i2 < i3) {
            this.f21423 = i3 - 1;
        }
        this.f21422 = -1;
    }

    @Override // l.AbstractC5091, l.InterfaceC6173
    public void forEachRemaining(LongConsumer longConsumer) {
        while (this.f21423 < mo18039()) {
            int i = this.f21423;
            this.f21423 = i + 1;
            this.f21422 = i;
            longConsumer.accept(mo18041(i));
        }
    }
}
