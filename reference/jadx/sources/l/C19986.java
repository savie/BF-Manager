package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C19986 implements InterfaceC23659 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f63977;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f63978;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f63979;

    public C19986(Iterator it) {
        it.getClass();
        this.f63979 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63978 || this.f63979.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f63978) {
            return this.f63979.next();
        }
        Object obj = this.f63977;
        this.f63978 = false;
        this.f63977 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C18304.m42522("Can't remove after you've peeked at next", !this.f63978);
        this.f63979.remove();
    }

    @Override // l.InterfaceC23659
    public final Object peek() {
        if (!this.f63978) {
            this.f63977 = this.f63979.next();
            this.f63978 = true;
        }
        return this.f63977;
    }
}
