package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11998 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Iterator f40213;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13409 f40214;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C20464 f40215;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Iterator f40216;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20464 f40217;

    public C11998(InterfaceC13409 interfaceC13409) {
        this.f40214 = interfaceC13409;
        Iterator itMo11890 = interfaceC13409.mo11890();
        this.f40213 = itMo11890;
        Iterator itMo11888 = interfaceC13409.mo11888();
        this.f40216 = itMo11888;
        this.f40215 = itMo11890.hasNext() ? (C20464) itMo11890.next() : null;
        this.f40217 = itMo11888.hasNext() ? (C20464) itMo11888.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return (this.f40215 == null && this.f40217 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C20464 c20464;
        C20464 c20465 = this.f40215;
        if (c20465 == null || ((c20464 = this.f40217) != null && (c20464.f66401 < c20465.f66401 || c20464.f66399 < c20465.f66399))) {
            C20464 c20466 = this.f40217;
            Iterator it = this.f40216;
            this.f40217 = it.hasNext() ? (C20464) it.next() : null;
            return new C17641(c20466, Boolean.TRUE);
        }
        Iterator it2 = this.f40213;
        this.f40215 = it2.hasNext() ? (C20464) it2.next() : null;
        return new C17641(c20465, Boolean.FALSE);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
