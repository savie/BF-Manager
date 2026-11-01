package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1MJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10795 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC17144 f36760;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f36761;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f36762;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f36763;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f36764;

    public C10795(InterfaceC17144 interfaceC17144, int i, int i2) {
        this.f36762 = 0;
        this.f36764 = 0;
        this.f36760 = interfaceC17144;
        this.f36763 = i;
        this.f36761 = i2;
        if (interfaceC17144.mo34577() && interfaceC17144.mo34576() == 0 && interfaceC17144.mo34578() == 0) {
            this.f36762 = interfaceC17144.mo34579();
            this.f36764 = interfaceC17144.mo34580();
            interfaceC17144.next();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return (!this.f36760.mo34577() && this.f36762 == this.f36763 && this.f36764 == this.f36761) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC17144 interfaceC17144 = this.f36760;
        if (interfaceC17144.mo34577()) {
            C20464 c20464 = new C20464(this.f36762, interfaceC17144.mo34576(), this.f36764, interfaceC17144.mo34578());
            this.f36762 = interfaceC17144.mo34579();
            this.f36764 = interfaceC17144.mo34580();
            interfaceC17144.next();
            return c20464;
        }
        int i = this.f36762;
        int i2 = this.f36764;
        int i3 = this.f36763;
        int i4 = this.f36761;
        C20464 c20465 = new C20464(i, i3, i2, i4);
        this.f36762 = i3;
        this.f36764 = i4;
        return c20465;
    }
}
