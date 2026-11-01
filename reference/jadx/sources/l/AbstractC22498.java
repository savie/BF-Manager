package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22498 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f73444;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6975 f73445;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f73446;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f73447;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C8387 f73448;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f73449 = -1;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo5667(int i, Object obj);

    public AbstractC22498(C6975 c6975) {
        this.f73445 = c6975;
        this.f73447 = c6975.f23479;
        this.f73446 = c6975.f23474;
        this.f73444 = c6975.f23475;
    }

    public final boolean hasNext() {
        return this.f73446 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50014() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f73446--;
        boolean z = this.f73444;
        C6975 c6975 = this.f73445;
        if (z) {
            this.f73444 = false;
            int i2 = c6975.f23479;
            this.f73449 = i2;
            return i2;
        }
        Object[] objArr = c6975.f23476;
        do {
            i = this.f73447 - 1;
            this.f73447 = i;
            if (i < 0) {
                this.f73449 = Integer.MIN_VALUE;
                Object obj = this.f73448.get((-i) - 1);
                int iM25125 = C9927.m25125(c6975.f23468.mo3246(obj));
                int i3 = c6975.f23477;
                while (true) {
                    int i4 = iM25125 & i3;
                    if (c6975.f23468.mo3247(obj, objArr[i4])) {
                        return i4;
                    }
                    iM25125 = i4 + 1;
                    i3 = c6975.f23477;
                }
            }
        } while (objArr[i] == null);
        this.f73449 = i;
        return i;
    }

    public void forEachRemaining(Consumer consumer) {
        int i;
        boolean z = this.f73444;
        C6975 c6975 = this.f73445;
        if (z) {
            this.f73444 = false;
            int i2 = c6975.f23479;
            this.f73449 = i2;
            mo5667(i2, consumer);
            this.f73446--;
        }
        Object[] objArr = c6975.f23476;
        while (this.f73446 != 0) {
            int i3 = this.f73447 - 1;
            this.f73447 = i3;
            if (i3 < 0) {
                this.f73449 = Integer.MIN_VALUE;
                Object obj = this.f73448.get((-i3) - 1);
                int iM25125 = C9927.m25125(c6975.f23468.mo3246(obj));
                int i4 = c6975.f23477;
                while (true) {
                    i = iM25125 & i4;
                    if (c6975.f23468.mo3247(obj, objArr[i])) {
                        break;
                    }
                    iM25125 = i + 1;
                    i4 = c6975.f23477;
                }
                mo5667(i, consumer);
                this.f73446--;
            } else if (objArr[i3] != null) {
                this.f73449 = i3;
                mo5667(i3, consumer);
                this.f73446--;
            }
        }
    }

    public void remove() {
        Object obj;
        int i = this.f73449;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C6975 c6975 = this.f73445;
        int i2 = c6975.f23479;
        if (i == i2) {
            c6975.f23475 = false;
            c6975.f23476[i2] = null;
            c6975.f23471[i2] = null;
        } else {
            int i3 = this.f73447;
            if (i3 >= 0) {
                Object[] objArr = c6975.f23476;
                Object[] objArr2 = c6975.f23471;
                loop0: while (true) {
                    int i4 = (i + 1) & c6975.f23477;
                    while (true) {
                        obj = objArr[i4];
                        if (obj != null) {
                            int iM25125 = C9927.m25125(c6975.f23468.mo3246(obj));
                            int i5 = c6975.f23477;
                            int i6 = iM25125 & i5;
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
                        if (this.f73448 == null) {
                            this.f73448 = new C8387(2);
                        }
                        this.f73448.add(objArr[i4]);
                    }
                    objArr[i] = obj;
                    objArr2[i] = objArr2[i4];
                    i = i4;
                }
                objArr[i] = null;
                objArr2[i] = null;
            } else {
                c6975.remove(this.f73448.set((-i3) - 1, null));
                this.f73449 = -1;
                return;
            }
        }
        c6975.f23474--;
        this.f73449 = -1;
    }
}
