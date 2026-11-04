package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֡᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0770 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f2785;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1516 f2786;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f2787;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f2788;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14763 f2789;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f2790 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo3146(int i, Object obj);

    public AbstractC0770(C1516 c1516) {
        this.f2786 = c1516;
        this.f2785 = c1516.f5288;
        this.f2787 = c1516.f5292;
        this.f2788 = c1516.f5294;
    }

    public final boolean hasNext() {
        return this.f2787 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3145() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2787--;
        boolean z = this.f2788;
        C1516 c1516 = this.f2786;
        if (z) {
            this.f2788 = false;
            int i2 = c1516.f5288;
            this.f2790 = i2;
            return i2;
        }
        int[] iArr = c1516.f5295;
        do {
            i = this.f2785 - 1;
            this.f2785 = i;
            if (i < 0) {
                this.f2790 = Integer.MIN_VALUE;
                int i3 = this.f2789.getInt((-i) - 1);
                int iM30015 = C11972.m30015(i3);
                int i4 = c1516.f5290;
                while (true) {
                    int i5 = iM30015 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM30015 = i5 + 1;
                    i4 = c1516.f5290;
                }
            }
        } while (iArr[i] == 0);
        this.f2790 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f2788;
        C1516 c1516 = this.f2786;
        if (z) {
            this.f2788 = false;
            int i2 = c1516.f5288;
            this.f2790 = i2;
            mo3146(i2, obj);
            this.f2787--;
        }
        int[] iArr = c1516.f5295;
        while (this.f2787 != 0) {
            int i3 = this.f2785 - 1;
            this.f2785 = i3;
            if (i3 < 0) {
                this.f2790 = Integer.MIN_VALUE;
                int i4 = this.f2789.getInt((-i3) - 1);
                int iM30015 = C11972.m30015(i4);
                int i5 = c1516.f5290;
                while (true) {
                    i = iM30015 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM30015 = i + 1;
                    i5 = c1516.f5290;
                }
                mo3146(i, obj);
                this.f2787--;
            } else if (iArr[i3] != 0) {
                this.f2790 = i3;
                mo3146(i3, obj);
                this.f2787--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f2790;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C1516 c1516 = this.f2786;
        if (i2 == c1516.f5288) {
            c1516.f5294 = false;
        } else {
            int i3 = this.f2785;
            if (i3 >= 0) {
                int[] iArr = c1516.f5295;
                byte[] bArr = c1516.f5289;
                loop0: while (true) {
                    int i4 = (i2 + 1) & c1516.f5290;
                    while (true) {
                        i = iArr[i4];
                        if (i != 0) {
                            int iM30015 = C11972.m30015(i);
                            int i5 = c1516.f5290;
                            int i6 = iM30015 & i5;
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
                        if (this.f2789 == null) {
                            this.f2789 = new C14763(2);
                        }
                        this.f2789.add(iArr[i4]);
                    }
                    iArr[i2] = i;
                    bArr[i2] = bArr[i4];
                    i2 = i4;
                }
                iArr[i2] = 0;
            } else {
                c1516.remove(this.f2789.getInt((-i3) - 1));
                this.f2790 = -1;
                return;
            }
        }
        c1516.f5292--;
        this.f2790 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
