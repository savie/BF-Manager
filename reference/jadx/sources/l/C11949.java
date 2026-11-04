package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1MJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11949 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f38484;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f38485;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f38486;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5984 f38487;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f38488;

    public C11949(InterfaceC5984 interfaceC5984, int i, int i2) {
        this.f38486 = 0;
        this.f38488 = 0;
        this.f38487 = interfaceC5984;
        this.f38484 = i;
        this.f38485 = i2;
        if (interfaceC5984.mo17407() && interfaceC5984.mo17411() == 0 && interfaceC5984.mo17409() == 0) {
            this.f38486 = interfaceC5984.mo17408();
            this.f38488 = interfaceC5984.mo17410();
            interfaceC5984.next();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return (!this.f38487.mo17407() && this.f38486 == this.f38484 && this.f38488 == this.f38485) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC5984 interfaceC5984 = this.f38487;
        if (interfaceC5984.mo17407()) {
            C22547 c22547 = new C22547(this.f38486, interfaceC5984.mo17411(), this.f38488, interfaceC5984.mo17409());
            this.f38486 = interfaceC5984.mo17408();
            this.f38488 = interfaceC5984.mo17410();
            interfaceC5984.next();
            return c22547;
        }
        int i = this.f38486;
        int i2 = this.f38488;
        int i3 = this.f38484;
        int i4 = this.f38485;
        C22547 c22548 = new C22547(i, i3, i2, i4);
        this.f38486 = i3;
        this.f38488 = i4;
        return c22548;
    }
}
