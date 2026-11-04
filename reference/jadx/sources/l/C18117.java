package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C18117 implements InterfaceC9802 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f59280;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f59281;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f59282;

    public C18117(Iterator it) {
        it.getClass();
        this.f59282 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f59280 || this.f59282.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f59280) {
            return this.f59282.next();
        }
        Object obj = this.f59281;
        this.f59280 = false;
        this.f59281 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C12128.m30314("Can't remove after you've peeked at next", !this.f59280);
        this.f59282.remove();
    }

    @Override // l.InterfaceC9802
    public final Object peek() {
        if (!this.f59280) {
            this.f59281 = this.f59282.next();
            this.f59280 = true;
        }
        return this.f59281;
    }
}
