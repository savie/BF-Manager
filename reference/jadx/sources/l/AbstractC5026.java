package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۚ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5026 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f17525;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3614 f17526;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f17527;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f17528;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15070 f17529;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17530 = -1;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3343(int i, Object obj);

    public AbstractC5026(C3614 c3614) {
        this.f17526 = c3614;
        this.f17528 = c3614.f13287;
        this.f17527 = c3614.f13294;
        this.f17525 = c3614.f13290;
    }

    public final boolean hasNext() {
        return this.f17527 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13969() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f17527--;
        boolean z = this.f17525;
        C3614 c3614 = this.f17526;
        if (z) {
            this.f17525 = false;
            int i2 = c3614.f13287;
            this.f17530 = i2;
            return i2;
        }
        int[] iArr = c3614.f13284;
        do {
            i = this.f17528 - 1;
            this.f17528 = i;
            if (i < 0) {
                this.f17530 = Integer.MIN_VALUE;
                int i3 = this.f17529.getInt((-i) - 1);
                int iM25125 = C9927.m25125(i3);
                int i4 = c3614.f13288;
                while (true) {
                    int i5 = iM25125 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM25125 = i5 + 1;
                    i4 = c3614.f13288;
                }
            }
        } while (iArr[i] == 0);
        this.f17530 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f17525;
        C3614 c3614 = this.f17526;
        if (z) {
            this.f17525 = false;
            int i2 = c3614.f13287;
            this.f17530 = i2;
            mo3343(i2, obj);
            this.f17527--;
        }
        int[] iArr = c3614.f13284;
        while (this.f17527 != 0) {
            int i3 = this.f17528 - 1;
            this.f17528 = i3;
            if (i3 < 0) {
                this.f17530 = Integer.MIN_VALUE;
                int i4 = this.f17529.getInt((-i3) - 1);
                int iM25125 = C9927.m25125(i4);
                int i5 = c3614.f13288;
                while (true) {
                    i = iM25125 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM25125 = i + 1;
                    i5 = c3614.f13288;
                }
                mo3343(i, obj);
                this.f17527--;
            } else if (iArr[i3] != 0) {
                this.f17530 = i3;
                mo3343(i3, obj);
                this.f17527--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f17530;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C3614 c3614 = this.f17526;
        if (i2 == c3614.f13287) {
            c3614.f13290 = false;
        } else {
            int i3 = this.f17528;
            if (i3 >= 0) {
                int[] iArr = c3614.f13284;
                float[] fArr = c3614.f13289;
                loop0: while (true) {
                    int i4 = (i2 + 1) & c3614.f13288;
                    while (true) {
                        i = iArr[i4];
                        if (i != 0) {
                            int iM25125 = C9927.m25125(i);
                            int i5 = c3614.f13288;
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
                        if (this.f17529 == null) {
                            this.f17529 = new C15070(2);
                        }
                        this.f17529.add(iArr[i4]);
                    }
                    iArr[i2] = i;
                    fArr[i2] = fArr[i4];
                    i2 = i4;
                }
                iArr[i2] = 0;
            } else {
                c3614.remove(this.f17529.getInt((-i3) - 1));
                this.f17530 = -1;
                return;
            }
        }
        c3614.f13294--;
        this.f17530 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public /* bridge */ /* synthetic */ void m13970(InterfaceC17767 interfaceC17767) {
        forEachRemaining((Object) interfaceC17767);
    }
}
