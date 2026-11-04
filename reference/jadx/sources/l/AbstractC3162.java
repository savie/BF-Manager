package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۗۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3162 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f10259;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24046 f10260;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f10261;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f10262;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14763 f10263;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f10264 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo10343(int i, Object obj);

    public AbstractC3162(C24046 c24046) {
        this.f10260 = c24046;
        this.f10259 = c24046.f77774;
        this.f10261 = c24046.f77778;
        this.f10262 = c24046.f77780;
    }

    public final boolean hasNext() {
        return this.f10261 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10342() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f10261--;
        boolean z = this.f10262;
        C24046 c24046 = this.f10260;
        if (z) {
            this.f10262 = false;
            int i2 = c24046.f77774;
            this.f10264 = i2;
            return i2;
        }
        int[] iArr = c24046.f77781;
        do {
            i = this.f10259 - 1;
            this.f10259 = i;
            if (i < 0) {
                this.f10264 = Integer.MIN_VALUE;
                int i3 = this.f10263.getInt((-i) - 1);
                int iM30015 = C11972.m30015(i3);
                int i4 = c24046.f77776;
                while (true) {
                    int i5 = iM30015 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM30015 = i5 + 1;
                    i4 = c24046.f77776;
                }
            }
        } while (iArr[i] == 0);
        this.f10264 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f10262;
        C24046 c24046 = this.f10260;
        if (z) {
            this.f10262 = false;
            int i2 = c24046.f77774;
            this.f10264 = i2;
            mo10343(i2, obj);
            this.f10261--;
        }
        int[] iArr = c24046.f77781;
        while (this.f10261 != 0) {
            int i3 = this.f10259 - 1;
            this.f10259 = i3;
            if (i3 < 0) {
                this.f10264 = Integer.MIN_VALUE;
                int i4 = this.f10263.getInt((-i3) - 1);
                int iM30015 = C11972.m30015(i4);
                int i5 = c24046.f77776;
                while (true) {
                    i = iM30015 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM30015 = i + 1;
                    i5 = c24046.f77776;
                }
                mo10343(i, obj);
                this.f10261--;
            } else if (iArr[i3] != 0) {
                this.f10264 = i3;
                mo10343(i3, obj);
                this.f10261--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f10264;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C24046 c24046 = this.f10260;
        if (i2 == c24046.f77774) {
            c24046.f77780 = false;
        } else {
            int i3 = this.f10259;
            if (i3 >= 0) {
                int[] iArr = c24046.f77781;
                float[] fArr = c24046.f77775;
                loop0: while (true) {
                    int i4 = (i2 + 1) & c24046.f77776;
                    while (true) {
                        i = iArr[i4];
                        if (i != 0) {
                            int iM30015 = C11972.m30015(i);
                            int i5 = c24046.f77776;
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
                        if (this.f10263 == null) {
                            this.f10263 = new C14763(2);
                        }
                        this.f10263.add(iArr[i4]);
                    }
                    iArr[i2] = i;
                    fArr[i2] = fArr[i4];
                    i2 = i4;
                }
                iArr[i2] = 0;
            } else {
                c24046.remove(this.f10263.getInt((-i3) - 1));
                this.f10264 = -1;
                return;
            }
        }
        c24046.f77778--;
        this.f10264 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public /* bridge */ /* synthetic */ void m10344(InterfaceC0419 interfaceC0419) {
        forEachRemaining((Object) interfaceC0419);
    }
}
