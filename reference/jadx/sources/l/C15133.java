package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C59 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15133 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f49449;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17954 f49450;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f49451;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f49452;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C8387 f49453;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f49454 = -1;

    public C15133(C17954 c17954) {
        this.f49450 = c17954;
        this.f49452 = c17954.f57421;
        this.f49451 = c17954.f57422;
        this.f49449 = c17954.f57424;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f49451 != 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        Object obj;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f49451--;
        C17954 c17954 = this.f49450;
        Object[] objArr = c17954.f57420;
        if (this.f49449) {
            this.f49449 = false;
            int i2 = c17954.f57421;
            this.f49454 = i2;
            return objArr[i2];
        }
        do {
            i = this.f49452 - 1;
            this.f49452 = i;
            if (i < 0) {
                this.f49454 = Integer.MIN_VALUE;
                return this.f49453.get((-i) - 1);
            }
            obj = objArr[i];
        } while (obj == null);
        this.f49454 = i;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Object obj;
        int i = this.f49454;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C17954 c17954 = this.f49450;
        int i2 = c17954.f57421;
        if (i == i2) {
            c17954.f57424 = false;
            c17954.f57420[i2] = null;
        } else {
            int i3 = this.f49452;
            if (i3 >= 0) {
                Object[] objArr = c17954.f57420;
                loop0: while (true) {
                    int i4 = (i + 1) & c17954.f57425;
                    while (true) {
                        obj = objArr[i4];
                        if (obj != null) {
                            int iM25125 = C9927.m25125(obj.hashCode());
                            int i5 = c17954.f57425;
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
                        if (this.f49453 == null) {
                            this.f49453 = new C8387(2);
                        }
                        this.f49453.add(objArr[i4]);
                    }
                    objArr[i] = obj;
                    i = i4;
                }
                objArr[i] = null;
            } else {
                c17954.remove(this.f49453.set((-i3) - 1, null));
                this.f49454 = -1;
                return;
            }
        }
        c17954.f57422--;
        this.f49454 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C17954 c17954 = this.f49450;
        Object[] objArr = c17954.f57420;
        if (this.f49449) {
            this.f49449 = false;
            int i = c17954.f57421;
            this.f49454 = i;
            consumer.n(objArr[i]);
            this.f49451--;
        }
        while (this.f49451 != 0) {
            int i2 = this.f49452 - 1;
            this.f49452 = i2;
            if (i2 < 0) {
                this.f49454 = Integer.MIN_VALUE;
                consumer.n(this.f49453.get((-i2) - 1));
                this.f49451--;
            } else {
                Object obj = objArr[i2];
                if (obj != null) {
                    this.f49454 = i2;
                    consumer.n(obj);
                    this.f49451--;
                }
            }
        }
    }
}
