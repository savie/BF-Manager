package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1CGN */
/* JADX INFO: loaded from: classes2.dex */
public final class C24922 implements InterfaceC15970, InterfaceC19597 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16716 f80658;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f80660;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f80657 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f80659 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f80661 = 0;

    @Override // l.InterfaceC15970, java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        C18063.m42090();
        throw null;
    }

    @Override // l.InterfaceC15970, java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        C18063.m42091();
        throw null;
    }

    public C24922(C16716 c16716) {
        this.f80658 = c16716;
        this.f80660 = c16716.f54004;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f80660 != -1;
    }

    @Override // l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f80657 != -1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f80660;
        this.f80659 = i;
        C16716 c16716 = this.f80658;
        this.f80660 = (int) c16716.f54005[i];
        this.f80657 = i;
        int i2 = this.f80661;
        if (i2 >= 0) {
            this.f80661 = i2 + 1;
        }
        return c16716.f53995[i];
    }

    @Override // l.InterfaceC6847, java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f80657;
        this.f80659 = i;
        C16716 c16716 = this.f80658;
        this.f80657 = (int) (c16716.f54005[i] >>> 32);
        this.f80660 = i;
        int i2 = this.f80661;
        if (i2 >= 0) {
            this.f80661 = i2 - 1;
        }
        return c16716.f53995[i];
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        C16716 c16716 = this.f80658;
        Object[] objArr = c16716.f53995;
        long[] jArr = c16716.f54005;
        while (true) {
            int i = this.f80660;
            if (i == -1) {
                return;
            }
            this.f80659 = i;
            this.f80660 = (int) jArr[i];
            this.f80657 = i;
            int i2 = this.f80661;
            if (i2 >= 0) {
                this.f80661 = i2 + 1;
            }
            consumer.accept(objArr[i]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m55522() {
        if (this.f80661 >= 0) {
            return;
        }
        if (this.f80657 == -1) {
            this.f80661 = 0;
            return;
        }
        int i = this.f80660;
        C16716 c16716 = this.f80658;
        if (i == -1) {
            this.f80661 = c16716.f54000;
            return;
        }
        int i2 = c16716.f54004;
        this.f80661 = 1;
        while (i2 != this.f80657) {
            i2 = (int) c16716.f54005[i2];
            this.f80661++;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m55522();
        return this.f80661;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m55522();
        return this.f80661 - 1;
    }

    @Override // l.InterfaceC15970, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        Object obj;
        m55522();
        int i = this.f80659;
        if (i == -1) {
            throw new IllegalStateException();
        }
        int i2 = this.f80657;
        C16716 c16716 = this.f80658;
        if (i == i2) {
            this.f80661--;
            this.f80657 = (int) (c16716.f54005[i] >>> 32);
        } else {
            this.f80660 = (int) c16716.f54005[i];
        }
        c16716.f54000--;
        int i3 = this.f80657;
        if (i3 == -1) {
            c16716.f54004 = this.f80660;
        } else {
            long[] jArr = c16716.f54005;
            long j = jArr[i3];
            jArr[i3] = j ^ (((((long) this.f80660) & 4294967295L) ^ j) & 4294967295L);
        }
        int i4 = this.f80660;
        if (i4 == -1) {
            c16716.f53999 = i3;
        } else {
            long[] jArr2 = c16716.f54005;
            long j2 = jArr2[i4];
            jArr2[i4] = ((((4294967295L & ((long) i3)) << 32) ^ j2) & (-4294967296L)) ^ j2;
        }
        this.f80659 = -1;
        int i5 = c16716.f53997;
        if (i == i5) {
            c16716.f54003 = false;
            c16716.f53995[i5] = null;
            return;
        }
        Object[] objArr = c16716.f53995;
        while (true) {
            int i6 = (i + 1) & c16716.f54002;
            while (true) {
                obj = objArr[i6];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int iM30015 = C11972.m30015(c16716.f53998.mo25785(obj));
                int i7 = c16716.f54002;
                int i8 = iM30015 & i7;
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
            if (this.f80660 == i6) {
                this.f80660 = i;
            }
            if (this.f80657 == i6) {
                this.f80657 = i;
            }
            c16716.m39483(i6, i);
            i = i6;
        }
    }
}
