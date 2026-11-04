package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DC36 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19679 implements InterfaceC6036, InterfaceC19597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f63370;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12966 f63371;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f63372;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f63373;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14763 f63374;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f63375 = -1;

    @Override // l.InterfaceC6036, l.InterfaceC20343, java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12001.m30186(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C19679(C12966 c12966) {
        this.f63371 = c12966;
        this.f63370 = c12966.f41568;
        this.f63372 = c12966.f41566;
        this.f63373 = c12966.f41569;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63372 != 0;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        int i;
        int i2;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f63372--;
        C12966 c12966 = this.f63371;
        int[] iArr = c12966.f41570;
        if (this.f63373) {
            this.f63373 = false;
            int i3 = c12966.f41568;
            this.f63375 = i3;
            return iArr[i3];
        }
        do {
            i = this.f63370 - 1;
            this.f63370 = i;
            if (i < 0) {
                this.f63375 = Integer.MIN_VALUE;
                return this.f63374.getInt((-i) - 1);
            }
            i2 = iArr[i];
        } while (i2 == 0);
        this.f63375 = i;
        return i2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        int i2 = this.f63375;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C12966 c12966 = this.f63371;
        int i3 = c12966.f41568;
        if (i2 == i3) {
            c12966.f41569 = false;
            c12966.f41570[i3] = 0;
        } else {
            int i4 = this.f63370;
            if (i4 >= 0) {
                int[] iArr = c12966.f41570;
                loop0: while (true) {
                    int i5 = (i2 + 1) & c12966.f41565;
                    while (true) {
                        i = iArr[i5];
                        if (i != 0) {
                            int iM30015 = C11972.m30015(i);
                            int i6 = c12966.f41565;
                            int i7 = iM30015 & i6;
                            if (i2 > i5) {
                                if (i2 >= i7 && i7 > i5) {
                                    break;
                                } else {
                                    i5 = (i5 + 1) & i6;
                                }
                            } else if (i2 >= i7 || i7 > i5) {
                                break;
                            } else {
                                i5 = (i5 + 1) & i6;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    if (i5 < i2) {
                        if (this.f63374 == null) {
                            this.f63374 = new C14763(2);
                        }
                        this.f63374.add(iArr[i5]);
                    }
                    iArr[i2] = i;
                    i2 = i5;
                }
                iArr[i2] = 0;
            } else {
                c12966.remove(this.f63374.getInt((-i4) - 1));
                this.f63375 = -1;
                return;
            }
        }
        c12966.f41566--;
        this.f63375 = -1;
    }

    @Override // l.InterfaceC24073
    public final void forEachRemaining(IntConsumer intConsumer) {
        C12966 c12966 = this.f63371;
        int[] iArr = c12966.f41570;
        if (this.f63373) {
            this.f63373 = false;
            int i = c12966.f41568;
            this.f63375 = i;
            intConsumer.accept(iArr[i]);
            this.f63372--;
        }
        while (this.f63372 != 0) {
            int i2 = this.f63370 - 1;
            this.f63370 = i2;
            if (i2 < 0) {
                this.f63375 = Integer.MIN_VALUE;
                intConsumer.accept(this.f63374.getInt((-i2) - 1));
                this.f63372--;
            } else {
                int i3 = iArr[i2];
                if (i3 != 0) {
                    this.f63375 = i2;
                    intConsumer.accept(i3);
                    this.f63372--;
                }
            }
        }
    }
}
