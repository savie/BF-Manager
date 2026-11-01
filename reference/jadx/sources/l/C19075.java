package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C94 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19075 implements InterfaceC21191, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f61644;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8492 f61645;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f61647 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f61646 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f61648 = 0;

    @Override // l.InterfaceC21191
    public final /* synthetic */ void add(int i) {
        C7786.m20456();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo3717((Integer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC13431, l.InterfaceC22104, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo3718((Integer) obj);
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3716(int i) {
        C7786.m20459();
        throw null;
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3717(Integer num) {
        C7786.m20457((InterfaceC21191) this, num);
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo3718(Integer num) {
        C7786.m20460((InterfaceC21191) this, num);
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        return Integer.valueOf(mo3719());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C1435.m5011(this);
    }

    public C19075(C8492 c8492) {
        this.f61645 = c8492;
        this.f61644 = c8492.f29424;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f61644 != -1;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f61647 != -1;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f61644;
        this.f61646 = i;
        C8492 c8492 = this.f61645;
        this.f61644 = (int) c8492.f29432[i];
        this.f61647 = i;
        int i2 = this.f61648;
        if (i2 >= 0) {
            this.f61648 = i2 + 1;
        }
        return c8492.f29431[i];
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ᩸ۙ */
    public final int mo3719() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f61647;
        this.f61646 = i;
        C8492 c8492 = this.f61645;
        this.f61647 = (int) (c8492.f29432[i] >>> 32);
        this.f61644 = i;
        int i2 = this.f61648;
        if (i2 >= 0) {
            this.f61648 = i2 - 1;
        }
        return c8492.f29431[i];
    }

    @Override // l.InterfaceC3758
    public final void forEachRemaining(IntConsumer intConsumer) {
        C8492 c8492 = this.f61645;
        int[] iArr = c8492.f29431;
        long[] jArr = c8492.f29432;
        while (true) {
            int i = this.f61644;
            if (i == -1) {
                return;
            }
            this.f61646 = i;
            this.f61644 = (int) jArr[i];
            this.f61647 = i;
            int i2 = this.f61648;
            if (i2 >= 0) {
                this.f61648 = i2 + 1;
            }
            intConsumer.accept(iArr[i]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m43847() {
        if (this.f61648 >= 0) {
            return;
        }
        if (this.f61647 == -1) {
            this.f61648 = 0;
            return;
        }
        int i = this.f61644;
        C8492 c8492 = this.f61645;
        if (i == -1) {
            this.f61648 = c8492.f29425;
            return;
        }
        int i2 = c8492.f29424;
        this.f61648 = 1;
        while (i2 != this.f61647) {
            i2 = (int) c8492.f29432[i2];
            this.f61648++;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m43847();
        return this.f61648;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m43847();
        return this.f61648 - 1;
    }

    @Override // l.InterfaceC21191, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        m43847();
        int i2 = this.f61646;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        int i3 = this.f61647;
        C8492 c8492 = this.f61645;
        if (i2 == i3) {
            this.f61648--;
            this.f61647 = (int) (c8492.f29432[i2] >>> 32);
        } else {
            this.f61644 = (int) c8492.f29432[i2];
        }
        c8492.f29425--;
        int i4 = this.f61647;
        if (i4 == -1) {
            c8492.f29424 = this.f61644;
        } else {
            long[] jArr = c8492.f29432;
            long j = jArr[i4];
            jArr[i4] = j ^ (((((long) this.f61644) & 4294967295L) ^ j) & 4294967295L);
        }
        int i5 = this.f61644;
        if (i5 == -1) {
            c8492.f29428 = i4;
        } else {
            long[] jArr2 = c8492.f29432;
            long j2 = jArr2[i5];
            jArr2[i5] = ((((4294967295L & ((long) i4)) << 32) ^ j2) & (-4294967296L)) ^ j2;
        }
        this.f61646 = -1;
        int i6 = c8492.f29429;
        if (i2 == i6) {
            c8492.f29430 = false;
            c8492.f29431[i6] = 0;
            return;
        }
        int[] iArr = c8492.f29431;
        while (true) {
            int i7 = (i2 + 1) & c8492.f29426;
            while (true) {
                i = iArr[i7];
                if (i == 0) {
                    iArr[i2] = 0;
                    return;
                }
                int iM25125 = C9927.m25125(i);
                int i8 = c8492.f29426;
                int i9 = iM25125 & i8;
                if (i2 > i7) {
                    if (i2 >= i9 && i9 > i7) {
                        break;
                    } else {
                        i7 = (i7 + 1) & i8;
                    }
                } else if (i2 >= i9 || i9 > i7) {
                    break;
                } else {
                    i7 = (i7 + 1) & i8;
                }
            }
            iArr[i2] = i;
            if (this.f61644 == i7) {
                this.f61644 = i2;
            }
            if (this.f61647 == i7) {
                this.f61647 = i2;
            }
            c8492.m22190(i7, i2);
            i2 = i7;
        }
    }
}
