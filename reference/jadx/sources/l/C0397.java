package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes3.dex */
public final class C0397 implements InterfaceC12124, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10982 f1884;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f1885 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f1886;

    @Override // java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C8596.m22379(this, consumer);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo2132(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        return Float.valueOf(mo2134());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    public C0397(C10982 c10982, int i) {
        this.f1884 = c10982;
        this.f1886 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1886 < this.f1884.f37399;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f1886 > 0;
    }

    @Override // l.InterfaceC10007
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        float[] fArr = this.f1884.f37398;
        int i = this.f1886;
        this.f1886 = i + 1;
        this.f1885 = i;
        return fArr[i];
    }

    @Override // l.InterfaceC12124
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float mo2134() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        float[] fArr = this.f1884.f37398;
        int i = this.f1886 - 1;
        this.f1886 = i;
        this.f1885 = i;
        return fArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1886;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1886 - 1;
    }

    @Override // l.InterfaceC12124
    public final void add(float f) {
        int i = this.f1886;
        this.f1886 = i + 1;
        this.f1884.mo26069(f, i);
        this.f1885 = -1;
    }

    @Override // l.InterfaceC12124
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo2132(float f) {
        int i = this.f1885;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f1884.mo26064(f, i);
    }

    @Override // l.InterfaceC12124, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f1885;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f1884.mo26070(i);
        int i2 = this.f1885;
        int i3 = this.f1886;
        if (i2 < i3) {
            this.f1886 = i3 - 1;
        }
        this.f1885 = -1;
    }

    @Override // l.InterfaceC3758
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void forEachRemaining(InterfaceC17767 interfaceC17767) {
        C10982 c10982 = this.f1884;
        float[] fArr = c10982.f37398;
        while (true) {
            int i = this.f1886;
            if (i >= c10982.f37399) {
                return;
            }
            this.f1886 = i + 1;
            this.f1885 = i;
            interfaceC17767.mo35707(fArr[i]);
        }
    }
}
