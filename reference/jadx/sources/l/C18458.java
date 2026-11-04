package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿܽۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes4.dex */
public final class C18458 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10253 f60080;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f60081;

    public C18458(C10253 c10253, Iterator it) {
        this.f60080 = c10253;
        this.f60081 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f60081.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return C19906.m45835(this.f60080.f32747, this.f60081.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f60081.remove();
    }
}
