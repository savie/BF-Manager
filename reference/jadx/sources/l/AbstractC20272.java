package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20272 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f65087;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3864 f65088;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f65089;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f65090;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C9829 f65091;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f65092 = -1;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo5772(int i, Object obj);

    public AbstractC20272(C3864 c3864) {
        this.f65088 = c3864;
        this.f65087 = c3864.f13187;
        this.f65089 = c3864.f13183;
        this.f65090 = c3864.f13190;
    }

    public final boolean hasNext() {
        return this.f65089 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m46538() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f65089--;
        boolean z = this.f65090;
        C3864 c3864 = this.f65088;
        if (z) {
            this.f65090 = false;
            int i2 = c3864.f13187;
            this.f65092 = i2;
            return i2;
        }
        Object[] objArr = c3864.f13181;
        do {
            i = this.f65087 - 1;
            this.f65087 = i;
            if (i < 0) {
                this.f65092 = Integer.MIN_VALUE;
                Object obj = this.f65091.get((-i) - 1);
                int iM30015 = C11972.m30015(c3864.f13186.mo25785(obj));
                int i3 = c3864.f13192;
                while (true) {
                    int i4 = iM30015 & i3;
                    if (c3864.f13186.mo25786(obj, objArr[i4])) {
                        return i4;
                    }
                    iM30015 = i4 + 1;
                    i3 = c3864.f13192;
                }
            }
        } while (objArr[i] == null);
        this.f65092 = i;
        return i;
    }

    public void forEachRemaining(Consumer consumer) {
        int i;
        boolean z = this.f65090;
        C3864 c3864 = this.f65088;
        if (z) {
            this.f65090 = false;
            int i2 = c3864.f13187;
            this.f65092 = i2;
            mo5772(i2, consumer);
            this.f65089--;
        }
        Object[] objArr = c3864.f13181;
        while (this.f65089 != 0) {
            int i3 = this.f65087 - 1;
            this.f65087 = i3;
            if (i3 < 0) {
                this.f65092 = Integer.MIN_VALUE;
                Object obj = this.f65091.get((-i3) - 1);
                int iM30015 = C11972.m30015(c3864.f13186.mo25785(obj));
                int i4 = c3864.f13192;
                while (true) {
                    i = iM30015 & i4;
                    if (c3864.f13186.mo25786(obj, objArr[i])) {
                        break;
                    }
                    iM30015 = i + 1;
                    i4 = c3864.f13192;
                }
                mo5772(i, consumer);
                this.f65089--;
            } else if (objArr[i3] != null) {
                this.f65092 = i3;
                mo5772(i3, consumer);
                this.f65089--;
            }
        }
    }

    public void remove() {
        Object obj;
        int i = this.f65092;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C3864 c3864 = this.f65088;
        int i2 = c3864.f13187;
        if (i == i2) {
            c3864.f13190 = false;
            c3864.f13181[i2] = null;
            c3864.f13184[i2] = null;
        } else {
            int i3 = this.f65087;
            if (i3 >= 0) {
                Object[] objArr = c3864.f13181;
                Object[] objArr2 = c3864.f13184;
                loop0: while (true) {
                    int i4 = (i + 1) & c3864.f13192;
                    while (true) {
                        obj = objArr[i4];
                        if (obj != null) {
                            int iM30015 = C11972.m30015(c3864.f13186.mo25785(obj));
                            int i5 = c3864.f13192;
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
                        if (this.f65091 == null) {
                            this.f65091 = new C9829(2);
                        }
                        this.f65091.add(objArr[i4]);
                    }
                    objArr[i] = obj;
                    objArr2[i] = objArr2[i4];
                    i = i4;
                }
                objArr[i] = null;
                objArr2[i] = null;
            } else {
                c3864.remove(this.f65091.set((-i3) - 1, null));
                this.f65092 = -1;
                return;
            }
        }
        c3864.f13183--;
        this.f65092 = -1;
    }
}
