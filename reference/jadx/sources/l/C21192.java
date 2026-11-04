package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C59 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21192 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f67661;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0309 f67662;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f67663;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f67664;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C9829 f67665;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f67666 = -1;

    public C21192(C0309 c0309) {
        this.f67662 = c0309;
        this.f67661 = c0309.f1660;
        this.f67663 = c0309.f1658;
        this.f67664 = c0309.f1661;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67663 != 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        Object obj;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f67663--;
        C0309 c0309 = this.f67662;
        Object[] objArr = c0309.f1662;
        if (this.f67664) {
            this.f67664 = false;
            int i2 = c0309.f1660;
            this.f67666 = i2;
            return objArr[i2];
        }
        do {
            i = this.f67661 - 1;
            this.f67661 = i;
            if (i < 0) {
                this.f67666 = Integer.MIN_VALUE;
                return this.f67665.get((-i) - 1);
            }
            obj = objArr[i];
        } while (obj == null);
        this.f67666 = i;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Object obj;
        int i = this.f67666;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C0309 c0309 = this.f67662;
        int i2 = c0309.f1660;
        if (i == i2) {
            c0309.f1661 = false;
            c0309.f1662[i2] = null;
        } else {
            int i3 = this.f67661;
            if (i3 >= 0) {
                Object[] objArr = c0309.f1662;
                loop0: while (true) {
                    int i4 = (i + 1) & c0309.f1657;
                    while (true) {
                        obj = objArr[i4];
                        if (obj != null) {
                            int iM30015 = C11972.m30015(obj.hashCode());
                            int i5 = c0309.f1657;
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
                        if (this.f67665 == null) {
                            this.f67665 = new C9829(2);
                        }
                        this.f67665.add(objArr[i4]);
                    }
                    objArr[i] = obj;
                    i = i4;
                }
                objArr[i] = null;
            } else {
                c0309.remove(this.f67665.set((-i3) - 1, null));
                this.f67666 = -1;
                return;
            }
        }
        c0309.f1658--;
        this.f67666 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        C0309 c0309 = this.f67662;
        Object[] objArr = c0309.f1662;
        if (this.f67664) {
            this.f67664 = false;
            int i = c0309.f1660;
            this.f67666 = i;
            consumer.n(objArr[i]);
            this.f67663--;
        }
        while (this.f67663 != 0) {
            int i2 = this.f67661 - 1;
            this.f67661 = i2;
            if (i2 < 0) {
                this.f67666 = Integer.MIN_VALUE;
                consumer.n(this.f67665.get((-i2) - 1));
                this.f67663--;
            } else {
                Object obj = objArr[i2];
                if (obj != null) {
                    this.f67666 = i2;
                    consumer.n(obj);
                    this.f67663--;
                }
            }
        }
    }
}
