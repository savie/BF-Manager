package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩳ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18348 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f58528;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9177 f58529;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f58530;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f58531;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15070 f58532;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f58533 = -1;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo11891(int i, Object obj);

    public AbstractC18348(C9177 c9177) {
        this.f58529 = c9177;
        this.f58531 = c9177.f31231;
        this.f58530 = c9177.f31238;
        this.f58528 = c9177.f31234;
    }

    public final boolean hasNext() {
        return this.f58530 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m42607() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f58530--;
        boolean z = this.f58528;
        C9177 c9177 = this.f58529;
        if (z) {
            this.f58528 = false;
            int i2 = c9177.f31231;
            this.f58533 = i2;
            return i2;
        }
        int[] iArr = c9177.f31228;
        do {
            i = this.f58531 - 1;
            this.f58531 = i;
            if (i < 0) {
                this.f58533 = Integer.MIN_VALUE;
                int i3 = this.f58532.getInt((-i) - 1);
                int iM25125 = C9927.m25125(i3);
                int i4 = c9177.f31232;
                while (true) {
                    int i5 = iM25125 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM25125 = i5 + 1;
                    i4 = c9177.f31232;
                }
            }
        } while (iArr[i] == 0);
        this.f58533 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f58528;
        C9177 c9177 = this.f58529;
        if (z) {
            this.f58528 = false;
            int i2 = c9177.f31231;
            this.f58533 = i2;
            mo11891(i2, obj);
            this.f58530--;
        }
        int[] iArr = c9177.f31228;
        while (this.f58530 != 0) {
            int i3 = this.f58531 - 1;
            this.f58531 = i3;
            if (i3 < 0) {
                this.f58533 = Integer.MIN_VALUE;
                int i4 = this.f58532.getInt((-i3) - 1);
                int iM25125 = C9927.m25125(i4);
                int i5 = c9177.f31232;
                while (true) {
                    i = iM25125 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM25125 = i + 1;
                    i5 = c9177.f31232;
                }
                mo11891(i, obj);
                this.f58530--;
            } else if (iArr[i3] != 0) {
                this.f58533 = i3;
                mo11891(i3, obj);
                this.f58530--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f58533;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C9177 c9177 = this.f58529;
        if (i2 == c9177.f31231) {
            c9177.f31234 = false;
        } else {
            int i3 = this.f58531;
            if (i3 >= 0) {
                int[] iArr = c9177.f31228;
                byte[] bArr = c9177.f31233;
                loop0: while (true) {
                    int i4 = (i2 + 1) & c9177.f31232;
                    while (true) {
                        i = iArr[i4];
                        if (i != 0) {
                            int iM25125 = C9927.m25125(i);
                            int i5 = c9177.f31232;
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
                        if (this.f58532 == null) {
                            this.f58532 = new C15070(2);
                        }
                        this.f58532.add(iArr[i4]);
                    }
                    iArr[i2] = i;
                    bArr[i2] = bArr[i4];
                    i2 = i4;
                }
                iArr[i2] = 0;
            } else {
                c9177.remove(this.f58532.getInt((-i3) - 1));
                this.f58533 = -1;
                return;
            }
        }
        c9177.f31238--;
        this.f58533 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
