package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1FB */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12987 extends AbstractC1583 implements InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f41622;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f41623;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo1291();

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo1293(int i);

    /* JADX INFO: renamed from: ᩷ */
    public abstract Object mo1294(int i);

    public AbstractC12987(int i) {
        this.f41623 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41623 < mo1291();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f41623;
        this.f41623 = i + 1;
        this.f41622 = i;
        return mo1294(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f41622;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo1293(i);
        int i2 = this.f41622;
        int i3 = this.f41623;
        if (i2 < i3) {
            this.f41623 = i3 - 1;
        }
        this.f41622 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public void forEachRemaining(Consumer consumer) {
        while (this.f41623 < mo1291()) {
            int i = this.f41623;
            this.f41623 = i + 1;
            this.f41622 = i;
            consumer.accept(mo1294(i));
        }
    }
}
