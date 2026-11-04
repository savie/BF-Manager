package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩶᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21565 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f68875;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19327 f68876;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f68877;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f68878;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14763 f68879;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f68880 = -1;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo2970(int i, Object obj);

    public AbstractC21565(C19327 c19327) {
        this.f68876 = c19327;
        this.f68875 = c19327.f62435;
        this.f68877 = c19327.f62431;
        this.f68878 = c19327.f62437;
    }

    public final boolean hasNext() {
        return this.f68877 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m49040() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f68877--;
        boolean z = this.f68878;
        C19327 c19327 = this.f68876;
        if (z) {
            this.f68878 = false;
            int i2 = c19327.f62435;
            this.f68880 = i2;
            return i2;
        }
        int[] iArr = c19327.f62429;
        do {
            i = this.f68875 - 1;
            this.f68875 = i;
            if (i < 0) {
                this.f68880 = Integer.MIN_VALUE;
                int i3 = this.f68879.getInt((-i) - 1);
                int iM30015 = C11972.m30015(i3);
                int i4 = c19327.f62439;
                while (true) {
                    int i5 = iM30015 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM30015 = i5 + 1;
                    i4 = c19327.f62439;
                }
            }
        } while (iArr[i] == 0);
        this.f68880 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f68878;
        C19327 c19327 = this.f68876;
        if (z) {
            this.f68878 = false;
            int i2 = c19327.f62435;
            this.f68880 = i2;
            mo2970(i2, obj);
            this.f68877--;
        }
        int[] iArr = c19327.f62429;
        while (this.f68877 != 0) {
            int i3 = this.f68875 - 1;
            this.f68875 = i3;
            if (i3 < 0) {
                this.f68880 = Integer.MIN_VALUE;
                int i4 = this.f68879.getInt((-i3) - 1);
                int iM30015 = C11972.m30015(i4);
                int i5 = c19327.f62439;
                while (true) {
                    i = iM30015 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM30015 = i + 1;
                    i5 = c19327.f62439;
                }
                mo2970(i, obj);
                this.f68877--;
            } else if (iArr[i3] != 0) {
                this.f68880 = i3;
                mo2970(i3, obj);
                this.f68877--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f68880;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C19327 c19327 = this.f68876;
        int i3 = c19327.f62435;
        if (i2 == i3) {
            c19327.f62437 = false;
            c19327.f62434[i3] = null;
        } else {
            int i4 = this.f68875;
            if (i4 >= 0) {
                int[] iArr = c19327.f62429;
                Object[] objArr = c19327.f62434;
                loop0: while (true) {
                    int i5 = (i2 + 1) & c19327.f62439;
                    while (true) {
                        i = iArr[i5];
                        if (i != 0) {
                            int iM30015 = C11972.m30015(i);
                            int i6 = c19327.f62439;
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
                        if (this.f68879 == null) {
                            this.f68879 = new C14763(2);
                        }
                        this.f68879.add(iArr[i5]);
                    }
                    iArr[i2] = i;
                    objArr[i2] = objArr[i5];
                    i2 = i5;
                }
                iArr[i2] = 0;
                objArr[i2] = null;
            } else {
                c19327.remove(this.f68879.getInt((-i4) - 1));
                this.f68880 = -1;
                return;
            }
        }
        c19327.f62431--;
        this.f68880 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
