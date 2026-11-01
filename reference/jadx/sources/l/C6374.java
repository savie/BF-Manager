package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۛ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DC36 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6374 implements InterfaceC13431, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f21649;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24014 f21650;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f21651;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f21652;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15070 f21653;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21654 = -1;

    @Override // l.InterfaceC13431, l.InterfaceC22104, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C6374(C24014 c24014) {
        this.f21650 = c24014;
        this.f21652 = c24014.f77812;
        this.f21651 = c24014.f77813;
        this.f21649 = c24014.f77815;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21651 != 0;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        int i;
        int i2;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f21651--;
        C24014 c24014 = this.f21650;
        int[] iArr = c24014.f77811;
        if (this.f21649) {
            this.f21649 = false;
            int i3 = c24014.f77812;
            this.f21654 = i3;
            return iArr[i3];
        }
        do {
            i = this.f21652 - 1;
            this.f21652 = i;
            if (i < 0) {
                this.f21654 = Integer.MIN_VALUE;
                return this.f21653.getInt((-i) - 1);
            }
            i2 = iArr[i];
        } while (i2 == 0);
        this.f21654 = i;
        return i2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        int i2 = this.f21654;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C24014 c24014 = this.f21650;
        int i3 = c24014.f77812;
        if (i2 == i3) {
            c24014.f77815 = false;
            c24014.f77811[i3] = 0;
        } else {
            int i4 = this.f21652;
            if (i4 >= 0) {
                int[] iArr = c24014.f77811;
                loop0: while (true) {
                    int i5 = (i2 + 1) & c24014.f77816;
                    while (true) {
                        i = iArr[i5];
                        if (i != 0) {
                            int iM25125 = C9927.m25125(i);
                            int i6 = c24014.f77816;
                            int i7 = iM25125 & i6;
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
                        if (this.f21653 == null) {
                            this.f21653 = new C15070(2);
                        }
                        this.f21653.add(iArr[i5]);
                    }
                    iArr[i2] = i;
                    i2 = i5;
                }
                iArr[i2] = 0;
            } else {
                c24014.remove(this.f21653.getInt((-i4) - 1));
                this.f21654 = -1;
                return;
            }
        }
        c24014.f77813--;
        this.f21654 = -1;
    }

    @Override // l.InterfaceC3758
    public final void forEachRemaining(IntConsumer intConsumer) {
        C24014 c24014 = this.f21650;
        int[] iArr = c24014.f77811;
        if (this.f21649) {
            this.f21649 = false;
            int i = c24014.f77812;
            this.f21654 = i;
            intConsumer.accept(iArr[i]);
            this.f21651--;
        }
        while (this.f21651 != 0) {
            int i2 = this.f21652 - 1;
            this.f21652 = i2;
            if (i2 < 0) {
                this.f21654 = Integer.MIN_VALUE;
                intConsumer.accept(this.f21653.getInt((-i2) - 1));
                this.f21651--;
            } else {
                int i3 = iArr[i2];
                if (i3 != 0) {
                    this.f21654 = i2;
                    intConsumer.accept(i3);
                    this.f21651--;
                }
            }
        }
    }
}
