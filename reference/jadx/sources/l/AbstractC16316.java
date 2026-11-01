package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܽ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16316 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f52543;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10672 f52544;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f52545;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f52546;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15070 f52547;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f52548 = -1;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo19048(int i, Object obj);

    public AbstractC16316(C10672 c10672) {
        this.f52544 = c10672;
        this.f52546 = c10672.f36416;
        this.f52545 = c10672.f36410;
        this.f52543 = c10672.f36419;
    }

    public final boolean hasNext() {
        return this.f52545 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38482() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f52545--;
        boolean z = this.f52543;
        C10672 c10672 = this.f52544;
        if (z) {
            this.f52543 = false;
            int i2 = c10672.f36416;
            this.f52548 = i2;
            return i2;
        }
        int[] iArr = c10672.f36415;
        do {
            i = this.f52546 - 1;
            this.f52546 = i;
            if (i < 0) {
                this.f52548 = Integer.MIN_VALUE;
                int i3 = this.f52547.getInt((-i) - 1);
                int iM25125 = C9927.m25125(i3);
                int i4 = c10672.f36412;
                while (true) {
                    int i5 = iM25125 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM25125 = i5 + 1;
                    i4 = c10672.f36412;
                }
            }
        } while (iArr[i] == 0);
        this.f52548 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f52543;
        C10672 c10672 = this.f52544;
        if (z) {
            this.f52543 = false;
            int i2 = c10672.f36416;
            this.f52548 = i2;
            mo19048(i2, obj);
            this.f52545--;
        }
        int[] iArr = c10672.f36415;
        while (this.f52545 != 0) {
            int i3 = this.f52546 - 1;
            this.f52546 = i3;
            if (i3 < 0) {
                this.f52548 = Integer.MIN_VALUE;
                int i4 = this.f52547.getInt((-i3) - 1);
                int iM25125 = C9927.m25125(i4);
                int i5 = c10672.f36412;
                while (true) {
                    i = iM25125 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM25125 = i + 1;
                    i5 = c10672.f36412;
                }
                mo19048(i, obj);
                this.f52545--;
            } else if (iArr[i3] != 0) {
                this.f52548 = i3;
                mo19048(i3, obj);
                this.f52545--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f52548;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C10672 c10672 = this.f52544;
        if (i2 == c10672.f36416) {
            c10672.f36419 = false;
        } else {
            int i3 = this.f52546;
            if (i3 >= 0) {
                int[] iArr = c10672.f36415;
                int[] iArr2 = c10672.f36413;
                loop0: while (true) {
                    int i4 = (i2 + 1) & c10672.f36412;
                    while (true) {
                        i = iArr[i4];
                        if (i != 0) {
                            int iM25125 = C9927.m25125(i);
                            int i5 = c10672.f36412;
                            int i6 = iM25125 & i5;
                            if (i2 > i4) {
                                if (i2 >= i6 && i6 > i4) {
                                    break;
                                } else {
                                    i4 = (i4 + 1) & i5;
                                }
                            } else if (i2 >= i6 || i6 > i4) {
                                break;
                            } else {
                                i4 = (i4 + 1) & i5;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    if (i4 < i2) {
                        if (this.f52547 == null) {
                            this.f52547 = new C15070(2);
                        }
                        this.f52547.add(iArr[i4]);
                    }
                    iArr[i2] = i;
                    iArr2[i2] = iArr2[i4];
                    i2 = i4;
                }
                iArr[i2] = 0;
            } else {
                c10672.remove(this.f52547.getInt((-i3) - 1));
                this.f52548 = -1;
                return;
            }
        }
        c10672.f36410--;
        this.f52548 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
