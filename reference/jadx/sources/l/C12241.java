package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨ۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VFO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12241 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f39392;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24176 f39393;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f39394;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f39395;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C9829 f39396;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f39397 = -1;

    public C12241(C24176 c24176) {
        this.f39393 = c24176;
        this.f39392 = c24176.f78307;
        this.f39394 = c24176.f78304;
        this.f39395 = c24176.f78308;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39394 != 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        Object obj;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f39394--;
        C24176 c24176 = this.f39393;
        Object[] objArr = c24176.f78309;
        if (this.f39395) {
            this.f39395 = false;
            int i2 = c24176.f78307;
            this.f39397 = i2;
            return objArr[i2];
        }
        do {
            i = this.f39392 - 1;
            this.f39392 = i;
            if (i < 0) {
                this.f39397 = Integer.MIN_VALUE;
                return this.f39396.get((-i) - 1);
            }
            obj = objArr[i];
        } while (obj == null);
        this.f39397 = i;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Object obj;
        int i = this.f39397;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C24176 c24176 = this.f39393;
        int i2 = c24176.f78307;
        if (i == i2) {
            c24176.f78308 = false;
            c24176.f78309[i2] = null;
        } else {
            int i3 = this.f39392;
            if (i3 >= 0) {
                Object[] objArr = c24176.f78309;
                loop0: while (true) {
                    int i4 = (i + 1) & c24176.f78303;
                    while (true) {
                        obj = objArr[i4];
                        if (obj != null) {
                            int iM30015 = C11972.m30015(c24176.f78306.mo25785(obj));
                            int i5 = c24176.f78303;
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
                        if (this.f39396 == null) {
                            this.f39396 = new C9829(2);
                        }
                        this.f39396.add(objArr[i4]);
                    }
                    objArr[i] = obj;
                    i = i4;
                }
                objArr[i] = null;
            } else {
                c24176.remove(this.f39396.set((-i3) - 1, null));
                this.f39397 = -1;
                return;
            }
        }
        c24176.f78304--;
        this.f39397 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        C24176 c24176 = this.f39393;
        Object[] objArr = c24176.f78309;
        if (this.f39395) {
            this.f39395 = false;
            int i = c24176.f78307;
            this.f39397 = i;
            consumer.n(objArr[i]);
            this.f39394--;
        }
        while (this.f39394 != 0) {
            int i2 = this.f39392 - 1;
            this.f39392 = i2;
            if (i2 < 0) {
                this.f39397 = Integer.MIN_VALUE;
                consumer.n(this.f39396.get((-i2) - 1));
                this.f39394--;
            } else {
                Object obj = objArr[i2];
                if (obj != null) {
                    this.f39397 = i2;
                    consumer.n(obj);
                    this.f39394--;
                }
            }
        }
    }
}
