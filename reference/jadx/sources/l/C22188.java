package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VFO */
/* JADX INFO: loaded from: classes.dex */
public final class C22188 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f72581;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13016 f72582;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f72583;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f72584;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C8387 f72585;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f72586 = -1;

    public C22188(C13016 c13016) {
        this.f72582 = c13016;
        this.f72584 = c13016.f43409;
        this.f72583 = c13016.f43410;
        this.f72581 = c13016.f43412;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f72583 != 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        Object obj;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f72583--;
        C13016 c13016 = this.f72582;
        Object[] objArr = c13016.f43408;
        if (this.f72581) {
            this.f72581 = false;
            int i2 = c13016.f43409;
            this.f72586 = i2;
            return objArr[i2];
        }
        do {
            i = this.f72584 - 1;
            this.f72584 = i;
            if (i < 0) {
                this.f72586 = Integer.MIN_VALUE;
                return this.f72585.get((-i) - 1);
            }
            obj = objArr[i];
        } while (obj == null);
        this.f72586 = i;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Object obj;
        int i = this.f72586;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C13016 c13016 = this.f72582;
        int i2 = c13016.f43409;
        if (i == i2) {
            c13016.f43412 = false;
            c13016.f43408[i2] = null;
        } else {
            int i3 = this.f72584;
            if (i3 >= 0) {
                Object[] objArr = c13016.f43408;
                loop0: while (true) {
                    int i4 = (i + 1) & c13016.f43413;
                    while (true) {
                        obj = objArr[i4];
                        if (obj != null) {
                            int iM25125 = C9927.m25125(c13016.f43416.mo3246(obj));
                            int i5 = c13016.f43413;
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
                        if (this.f72585 == null) {
                            this.f72585 = new C8387(2);
                        }
                        this.f72585.add(objArr[i4]);
                    }
                    objArr[i] = obj;
                    i = i4;
                }
                objArr[i] = null;
            } else {
                c13016.remove(this.f72585.set((-i3) - 1, null));
                this.f72586 = -1;
                return;
            }
        }
        c13016.f43410--;
        this.f72586 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C13016 c13016 = this.f72582;
        Object[] objArr = c13016.f43408;
        if (this.f72581) {
            this.f72581 = false;
            int i = c13016.f43409;
            this.f72586 = i;
            consumer.accept(objArr[i]);
            this.f72583--;
        }
        while (this.f72583 != 0) {
            int i2 = this.f72584 - 1;
            this.f72584 = i2;
            if (i2 < 0) {
                this.f72586 = Integer.MIN_VALUE;
                consumer.accept(this.f72585.get((-i2) - 1));
                this.f72583--;
            } else {
                Object obj = objArr[i2];
                if (obj != null) {
                    this.f72586 = i2;
                    consumer.accept(obj);
                    this.f72583--;
                }
            }
        }
    }
}
