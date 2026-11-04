package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20468 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f65572;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4060 f65573;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f65574;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f65575;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C9829 f65576;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f65577 = -1;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6300(int i, Object obj);

    public AbstractC20468(C4060 c4060) {
        this.f65573 = c4060;
        this.f65572 = c4060.f13855;
        this.f65574 = c4060.f13851;
        this.f65575 = c4060.f13857;
    }

    public final boolean hasNext() {
        return this.f65574 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m46974() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f65574--;
        boolean z = this.f65575;
        C4060 c4060 = this.f65573;
        if (z) {
            this.f65575 = false;
            int i2 = c4060.f13855;
            this.f65577 = i2;
            return i2;
        }
        Object[] objArr = c4060.f13849;
        do {
            i = this.f65572 - 1;
            this.f65572 = i;
            if (i < 0) {
                this.f65577 = Integer.MIN_VALUE;
                Object obj = this.f65576.get((-i) - 1);
                int iM30015 = C11972.m30015(obj.hashCode());
                int i3 = c4060.f13859;
                while (true) {
                    int i4 = iM30015 & i3;
                    if (obj.equals(objArr[i4])) {
                        return i4;
                    }
                    iM30015 = i4 + 1;
                    i3 = c4060.f13859;
                }
            }
        } while (objArr[i] == null);
        this.f65577 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f65575;
        C4060 c4060 = this.f65573;
        if (z) {
            this.f65575 = false;
            int i2 = c4060.f13855;
            this.f65577 = i2;
            mo6300(i2, obj);
            this.f65574--;
        }
        Object[] objArr = c4060.f13849;
        while (this.f65574 != 0) {
            int i3 = this.f65572 - 1;
            this.f65572 = i3;
            if (i3 < 0) {
                this.f65577 = Integer.MIN_VALUE;
                Object obj2 = this.f65576.get((-i3) - 1);
                int iM30015 = C11972.m30015(obj2.hashCode());
                int i4 = c4060.f13859;
                while (true) {
                    i = iM30015 & i4;
                    if (obj2.equals(objArr[i])) {
                        break;
                    }
                    iM30015 = i + 1;
                    i4 = c4060.f13859;
                }
                mo6300(i, obj);
                this.f65574--;
            } else if (objArr[i3] != null) {
                this.f65577 = i3;
                mo6300(i3, obj);
                this.f65574--;
            }
        }
    }

    public void remove() {
        Object obj;
        int i = this.f65577;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C4060 c4060 = this.f65573;
        int i2 = c4060.f13855;
        if (i == i2) {
            c4060.f13857 = false;
            c4060.f13849[i2] = null;
        } else {
            int i3 = this.f65572;
            if (i3 >= 0) {
                Object[] objArr = c4060.f13849;
                int[] iArr = c4060.f13854;
                loop0: while (true) {
                    int i4 = (i + 1) & c4060.f13859;
                    while (true) {
                        obj = objArr[i4];
                        if (obj != null) {
                            int iM30015 = C11972.m30015(obj.hashCode());
                            int i5 = c4060.f13859;
                            int i6 = iM30015 & i5;
                            if (i > i4) {
                                if (i >= i6 && i6 > i4) {
                                    break;
                                } else {
                                    i4 = (i4 + 1) & i5;
                                }
                            } else if (i >= i6 || i6 > i4) {
                                break;
                            } else {
                                i4 = (i4 + 1) & i5;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    if (i4 < i) {
                        if (this.f65576 == null) {
                            this.f65576 = new C9829(2);
                        }
                        this.f65576.add(objArr[i4]);
                    }
                    objArr[i] = obj;
                    iArr[i] = iArr[i4];
                    i = i4;
                }
                objArr[i] = null;
            } else {
                c4060.mo7846(this.f65576.set((-i3) - 1, null));
                this.f65577 = -1;
                return;
            }
        }
        c4060.f13851--;
        this.f65577 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
