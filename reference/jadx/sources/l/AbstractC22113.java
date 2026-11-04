package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩷ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22113 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f71263;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15399 f71264;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f71265;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f71266;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14763 f71267;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f71268 = -1;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo8158(int i, Object obj);

    public AbstractC22113(C15399 c15399) {
        this.f71264 = c15399;
        this.f71263 = c15399.f50194;
        this.f71265 = c15399.f50197;
        this.f71266 = c15399.f50203;
    }

    public final boolean hasNext() {
        return this.f71265 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50066() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f71265--;
        boolean z = this.f71266;
        C15399 c15399 = this.f71264;
        if (z) {
            this.f71266 = false;
            int i2 = c15399.f50194;
            this.f71268 = i2;
            return i2;
        }
        int[] iArr = c15399.f50196;
        do {
            i = this.f71263 - 1;
            this.f71263 = i;
            if (i < 0) {
                this.f71268 = Integer.MIN_VALUE;
                int i3 = this.f71267.getInt((-i) - 1);
                int iM30015 = C11972.m30015(i3);
                int i4 = c15399.f50199;
                while (true) {
                    int i5 = iM30015 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM30015 = i5 + 1;
                    i4 = c15399.f50199;
                }
            }
        } while (iArr[i] == 0);
        this.f71268 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f71266;
        C15399 c15399 = this.f71264;
        if (z) {
            this.f71266 = false;
            int i2 = c15399.f50194;
            this.f71268 = i2;
            mo8158(i2, obj);
            this.f71265--;
        }
        int[] iArr = c15399.f50196;
        while (this.f71265 != 0) {
            int i3 = this.f71263 - 1;
            this.f71263 = i3;
            if (i3 < 0) {
                this.f71268 = Integer.MIN_VALUE;
                int i4 = this.f71267.getInt((-i3) - 1);
                int iM30015 = C11972.m30015(i4);
                int i5 = c15399.f50199;
                while (true) {
                    i = iM30015 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM30015 = i + 1;
                    i5 = c15399.f50199;
                }
                mo8158(i, obj);
                this.f71265--;
            } else if (iArr[i3] != 0) {
                this.f71268 = i3;
                mo8158(i3, obj);
                this.f71265--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f71268;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C15399 c15399 = this.f71264;
        if (i2 == c15399.f50194) {
            c15399.f50203 = false;
        } else {
            int i3 = this.f71263;
            if (i3 >= 0) {
                int[] iArr = c15399.f50196;
                int[] iArr2 = c15399.f50195;
                loop0: while (true) {
                    int i4 = (i2 + 1) & c15399.f50199;
                    while (true) {
                        i = iArr[i4];
                        if (i != 0) {
                            int iM30015 = C11972.m30015(i);
                            int i5 = c15399.f50199;
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
                        if (this.f71267 == null) {
                            this.f71267 = new C14763(2);
                        }
                        this.f71267.add(iArr[i4]);
                    }
                    iArr[i2] = i;
                    iArr2[i2] = iArr2[i4];
                    i2 = i4;
                }
                iArr[i2] = 0;
            } else {
                c15399.remove(this.f71267.getInt((-i3) - 1));
                this.f71268 = -1;
                return;
            }
        }
        c15399.f50197--;
        this.f71268 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
