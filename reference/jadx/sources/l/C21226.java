package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F67X */
/* JADX INFO: loaded from: classes5.dex */
public final class C21226 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18242 f67737;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f67739;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f67738 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f67736 = 0;

    @Override // java.util.Iterator
    public final void remove() {
    }

    public C21226(C0343 c0343) {
        this.f67739 = c0343.m2087();
        this.f67737 = new C18242(c0343.f1835, c0343.m2084());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67738 < this.f67739;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f67736;
        C18242 c18242 = this.f67737;
        c18242.f59555 = i;
        this.f67736 = i + c18242.f59554;
        this.f67738++;
        return c18242;
    }
}
