package l;

import java.util.NoSuchElementException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩺֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23936 extends AbstractC13668 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f77492;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f77493;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo18479();

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo18480(int i);

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo18481(int i);

    public AbstractC23936(int i) {
        this.f77493 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f77493 < mo18479();
    }

    @Override // l.InterfaceC20343
    public int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f77493;
        this.f77493 = i + 1;
        this.f77492 = i;
        return mo18481(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f77492;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo18480(i);
        int i2 = this.f77492;
        int i3 = this.f77493;
        if (i2 < i3) {
            this.f77493 = i3 - 1;
        }
        this.f77492 = -1;
    }

    @Override // l.AbstractC13668, l.InterfaceC20343
    public void forEachRemaining(IntConsumer intConsumer) {
        while (this.f77493 < mo18479()) {
            int i = this.f77493;
            this.f77493 = i + 1;
            this.f77492 = i;
            intConsumer.accept(mo18481(i));
        }
    }
}
