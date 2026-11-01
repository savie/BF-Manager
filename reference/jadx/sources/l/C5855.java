package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1MJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5855 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17144 f19998;

    public C5855(InterfaceC17144 interfaceC17144) {
        this.f19998 = interfaceC17144;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19998.mo34577();
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC17144 interfaceC17144 = this.f19998;
        C20464 c20464 = new C20464(interfaceC17144.mo34576(), interfaceC17144.mo34579(), interfaceC17144.mo34578(), interfaceC17144.mo34580());
        interfaceC17144.next();
        return c20464;
    }
}
