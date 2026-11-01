package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1FB */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11209 extends AbstractC1993 implements InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f37928;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f37929;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract int mo28151();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract void mo28152(int i);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract Object mo28153(int i);

    public AbstractC11209(int i) {
        this.f37929 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37929 < mo28151();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f37929;
        this.f37929 = i + 1;
        this.f37928 = i;
        return mo28153(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f37928;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo28152(i);
        int i2 = this.f37928;
        int i3 = this.f37929;
        if (i2 < i3) {
            this.f37929 = i3 - 1;
        }
        this.f37928 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public void forEachRemaining(Consumer consumer) {
        while (this.f37929 < mo28151()) {
            int i = this.f37929;
            this.f37929 = i + 1;
            this.f37928 = i;
            consumer.accept(mo28153(i));
        }
    }
}
