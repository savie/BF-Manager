package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۟֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C94 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7527 implements InterfaceC8273, InterfaceC19597 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18714 f24852;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f24854;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f24851 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f24853 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f24855 = 0;

    @Override // l.InterfaceC8273
    public final /* synthetic */ void add(int i) {
        C2307.m7789();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo12329((Integer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC6036, l.InterfaceC20343, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12001.m30186(this, consumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo12332((Integer) obj);
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo12327(int i) {
        C2307.m7792();
        throw null;
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo12329(Integer num) {
        C2307.m7790((InterfaceC8273) this, num);
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo12332(Integer num) {
        C2307.m7793((InterfaceC8273) this, num);
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        return Integer.valueOf(mo12330());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C12001.m30185(this);
    }

    public C7527(C18714 c18714) {
        this.f24852 = c18714;
        this.f24854 = c18714.f60844;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f24854 != -1;
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f24851 != -1;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f24854;
        this.f24853 = i;
        C18714 c18714 = this.f24852;
        this.f24854 = (int) c18714.f60845[i];
        this.f24851 = i;
        int i2 = this.f24855;
        if (i2 >= 0) {
            this.f24855 = i2 + 1;
        }
        return c18714.f60836[i];
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ܽۙ */
    public final int mo12330() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f24851;
        this.f24853 = i;
        C18714 c18714 = this.f24852;
        this.f24851 = (int) (c18714.f60845[i] >>> 32);
        this.f24854 = i;
        int i2 = this.f24855;
        if (i2 >= 0) {
            this.f24855 = i2 - 1;
        }
        return c18714.f60836[i];
    }

    @Override // l.InterfaceC24073
    public final void forEachRemaining(IntConsumer intConsumer) {
        C18714 c18714 = this.f24852;
        int[] iArr = c18714.f60836;
        long[] jArr = c18714.f60845;
        while (true) {
            int i = this.f24854;
            if (i == -1) {
                return;
            }
            this.f24853 = i;
            this.f24854 = (int) jArr[i];
            this.f24851 = i;
            int i2 = this.f24855;
            if (i2 >= 0) {
                this.f24855 = i2 + 1;
            }
            intConsumer.accept(iArr[i]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m20595() {
        if (this.f24855 >= 0) {
            return;
        }
        if (this.f24851 == -1) {
            this.f24855 = 0;
            return;
        }
        int i = this.f24854;
        C18714 c18714 = this.f24852;
        if (i == -1) {
            this.f24855 = c18714.f60840;
            return;
        }
        int i2 = c18714.f60844;
        this.f24855 = 1;
        while (i2 != this.f24851) {
            i2 = (int) c18714.f60845[i2];
            this.f24855++;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m20595();
        return this.f24855;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m20595();
        return this.f24855 - 1;
    }

    @Override // l.InterfaceC8273, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        m20595();
        int i2 = this.f24853;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        int i3 = this.f24851;
        C18714 c18714 = this.f24852;
        if (i2 == i3) {
            this.f24855--;
            this.f24851 = (int) (c18714.f60845[i2] >>> 32);
        } else {
            this.f24854 = (int) c18714.f60845[i2];
        }
        c18714.f60840--;
        int i4 = this.f24851;
        if (i4 == -1) {
            c18714.f60844 = this.f24854;
        } else {
            long[] jArr = c18714.f60845;
            long j = jArr[i4];
            jArr[i4] = j ^ (((((long) this.f24854) & 4294967295L) ^ j) & 4294967295L);
        }
        int i5 = this.f24854;
        if (i5 == -1) {
            c18714.f60839 = i4;
        } else {
            long[] jArr2 = c18714.f60845;
            long j2 = jArr2[i5];
            jArr2[i5] = ((((4294967295L & ((long) i4)) << 32) ^ j2) & (-4294967296L)) ^ j2;
        }
        this.f24853 = -1;
        int i6 = c18714.f60838;
        if (i2 == i6) {
            c18714.f60843 = false;
            c18714.f60836[i6] = 0;
            return;
        }
        int[] iArr = c18714.f60836;
        while (true) {
            int i7 = (i2 + 1) & c18714.f60842;
            while (true) {
                i = iArr[i7];
                if (i == 0) {
                    iArr[i2] = 0;
                    return;
                }
                int iM30015 = C11972.m30015(i);
                int i8 = c18714.f60842;
                int i9 = iM30015 & i8;
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
            if (this.f24854 == i7) {
                this.f24854 = i2;
            }
            if (this.f24851 == i7) {
                this.f24851 = i2;
            }
            c18714.m43525(i7, i2);
            i2 = i7;
        }
    }
}
