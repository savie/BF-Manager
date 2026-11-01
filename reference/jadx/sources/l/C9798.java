package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1CGN */
/* JADX INFO: loaded from: classes4.dex */
public final class C9798 implements InterfaceC13722, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f33523;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3446 f33524;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f33526 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f33525 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f33527 = 0;

    @Override // l.InterfaceC13722, java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        C17745.m41310();
        throw null;
    }

    @Override // l.InterfaceC13722, java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        C17745.m41312();
        throw null;
    }

    public C9798(C3446 c3446) {
        this.f33524 = c3446;
        this.f33523 = c3446.f12679;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f33523 != -1;
    }

    @Override // l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f33526 != -1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f33523;
        this.f33525 = i;
        C3446 c3446 = this.f33524;
        this.f33523 = (int) c3446.f12688[i];
        this.f33526 = i;
        int i2 = this.f33527;
        if (i2 >= 0) {
            this.f33527 = i2 + 1;
        }
        return c3446.f12687[i];
    }

    @Override // l.InterfaceC21086, java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f33526;
        this.f33525 = i;
        C3446 c3446 = this.f33524;
        this.f33526 = (int) (c3446.f12688[i] >>> 32);
        this.f33523 = i;
        int i2 = this.f33527;
        if (i2 >= 0) {
            this.f33527 = i2 - 1;
        }
        return c3446.f12687[i];
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C3446 c3446 = this.f33524;
        Object[] objArr = c3446.f12687;
        long[] jArr = c3446.f12688;
        while (true) {
            int i = this.f33523;
            if (i == -1) {
                return;
            }
            this.f33525 = i;
            this.f33523 = (int) jArr[i];
            this.f33526 = i;
            int i2 = this.f33527;
            if (i2 >= 0) {
                this.f33527 = i2 + 1;
            }
            consumer.accept(objArr[i]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m24904() {
        if (this.f33527 >= 0) {
            return;
        }
        if (this.f33526 == -1) {
            this.f33527 = 0;
            return;
        }
        int i = this.f33523;
        C3446 c3446 = this.f33524;
        if (i == -1) {
            this.f33527 = c3446.f12680;
            return;
        }
        int i2 = c3446.f12679;
        this.f33527 = 1;
        while (i2 != this.f33526) {
            i2 = (int) c3446.f12688[i2];
            this.f33527++;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m24904();
        return this.f33527;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m24904();
        return this.f33527 - 1;
    }

    @Override // l.InterfaceC13722, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        Object obj;
        m24904();
        int i = this.f33525;
        if (i == -1) {
            throw new IllegalStateException();
        }
        int i2 = this.f33526;
        C3446 c3446 = this.f33524;
        if (i == i2) {
            this.f33527--;
            this.f33526 = (int) (c3446.f12688[i] >>> 32);
        } else {
            this.f33523 = (int) c3446.f12688[i];
        }
        c3446.f12680--;
        int i3 = this.f33526;
        if (i3 == -1) {
            c3446.f12679 = this.f33523;
        } else {
            long[] jArr = c3446.f12688;
            long j = jArr[i3];
            jArr[i3] = j ^ (((((long) this.f33523) & 4294967295L) ^ j) & 4294967295L);
        }
        int i4 = this.f33523;
        if (i4 == -1) {
            c3446.f12684 = i3;
        } else {
            long[] jArr2 = c3446.f12688;
            long j2 = jArr2[i4];
            jArr2[i4] = ((((4294967295L & ((long) i3)) << 32) ^ j2) & (-4294967296L)) ^ j2;
        }
        this.f33525 = -1;
        int i5 = c3446.f12685;
        if (i == i5) {
            c3446.f12686 = false;
            c3446.f12687[i5] = null;
            return;
        }
        Object[] objArr = c3446.f12687;
        while (true) {
            int i6 = (i + 1) & c3446.f12681;
            while (true) {
                obj = objArr[i6];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int iM25125 = C9927.m25125(c3446.f12682.mo3246(obj));
                int i7 = c3446.f12681;
                int i8 = iM25125 & i7;
                if (i > i6) {
                    if (i >= i8 && i8 > i6) {
                        break;
                    } else {
                        i6 = (i6 + 1) & i7;
                    }
                } else if (i >= i8 || i8 > i6) {
                    break;
                } else {
                    i6 = (i6 + 1) & i7;
                }
            }
            objArr[i] = obj;
            if (this.f33523 == i6) {
                this.f33523 = i;
            }
            if (this.f33526 == i6) {
                this.f33526 = i;
            }
            c3446.m10155(i6, i);
            i = i6;
        }
    }
}
