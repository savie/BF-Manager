package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܶۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14987 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f48906;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7931 f48907;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f48908;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f48909;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15070 f48910;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f48911 = -1;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3497(int i, Object obj);

    public AbstractC14987(C7931 c7931) {
        this.f48907 = c7931;
        this.f48909 = c7931.f26057;
        this.f48908 = c7931.f26052;
        this.f48906 = c7931.f26053;
    }

    public final boolean hasNext() {
        return this.f48908 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35965() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f48908--;
        boolean z = this.f48906;
        C7931 c7931 = this.f48907;
        if (z) {
            this.f48906 = false;
            int i2 = c7931.f26057;
            this.f48911 = i2;
            return i2;
        }
        int[] iArr = c7931.f26054;
        do {
            i = this.f48909 - 1;
            this.f48909 = i;
            if (i < 0) {
                this.f48911 = Integer.MIN_VALUE;
                int i3 = this.f48910.getInt((-i) - 1);
                int iM25125 = C9927.m25125(i3);
                int i4 = c7931.f26055;
                while (true) {
                    int i5 = iM25125 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM25125 = i5 + 1;
                    i4 = c7931.f26055;
                }
            }
        } while (iArr[i] == 0);
        this.f48911 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f48906;
        C7931 c7931 = this.f48907;
        if (z) {
            this.f48906 = false;
            int i2 = c7931.f26057;
            this.f48911 = i2;
            mo3497(i2, obj);
            this.f48908--;
        }
        int[] iArr = c7931.f26054;
        while (this.f48908 != 0) {
            int i3 = this.f48909 - 1;
            this.f48909 = i3;
            if (i3 < 0) {
                this.f48911 = Integer.MIN_VALUE;
                int i4 = this.f48910.getInt((-i3) - 1);
                int iM25125 = C9927.m25125(i4);
                int i5 = c7931.f26055;
                while (true) {
                    i = iM25125 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM25125 = i + 1;
                    i5 = c7931.f26055;
                }
                mo3497(i, obj);
                this.f48908--;
            } else if (iArr[i3] != 0) {
                this.f48911 = i3;
                mo3497(i3, obj);
                this.f48908--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f48911;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C7931 c7931 = this.f48907;
        int i3 = c7931.f26057;
        if (i2 == i3) {
            c7931.f26053 = false;
            c7931.f26047[i3] = null;
        } else {
            int i4 = this.f48909;
            if (i4 >= 0) {
                int[] iArr = c7931.f26054;
                Object[] objArr = c7931.f26047;
                loop0: while (true) {
                    int i5 = (i2 + 1) & c7931.f26055;
                    while (true) {
                        i = iArr[i5];
                        if (i != 0) {
                            int iM25125 = C9927.m25125(i);
                            int i6 = c7931.f26055;
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
                        if (this.f48910 == null) {
                            this.f48910 = new C15070(2);
                        }
                        this.f48910.add(iArr[i5]);
                    }
                    iArr[i2] = i;
                    objArr[i2] = objArr[i5];
                    i2 = i5;
                }
                iArr[i2] = 0;
                objArr[i2] = null;
            } else {
                c7931.remove(this.f48910.getInt((-i4) - 1));
                this.f48911 = -1;
                return;
            }
        }
        c7931.f26052--;
        this.f48911 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
