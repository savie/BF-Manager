package l;

import java.util.NoSuchElementException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۘ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4257 extends AbstractC19968 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f15370;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f15371;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo11024();

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo11026(int i);

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo11027(int i);

    public AbstractC4257(int i) {
        this.f15371 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15371 < mo11024();
    }

    @Override // l.InterfaceC22104
    public int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f15371;
        this.f15371 = i + 1;
        this.f15370 = i;
        return mo11027(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f15370;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo11026(i);
        int i2 = this.f15370;
        int i3 = this.f15371;
        if (i2 < i3) {
            this.f15371 = i3 - 1;
        }
        this.f15370 = -1;
    }

    @Override // l.AbstractC19968, l.InterfaceC22104
    public void forEachRemaining(IntConsumer intConsumer) {
        while (this.f15371 < mo11024()) {
            int i = this.f15371;
            this.f15371 = i + 1;
            this.f15370 = i;
            intConsumer.accept(mo11027(i));
        }
    }
}
