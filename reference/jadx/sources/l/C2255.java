package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1MJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2255 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5984 f7375;

    public C2255(InterfaceC5984 interfaceC5984) {
        this.f7375 = interfaceC5984;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7375.mo17407();
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC5984 interfaceC5984 = this.f7375;
        C22547 c22547 = new C22547(interfaceC5984.mo17411(), interfaceC5984.mo17408(), interfaceC5984.mo17409(), interfaceC5984.mo17410());
        interfaceC5984.next();
        return c22547;
    }
}
