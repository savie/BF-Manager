package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۛۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes3.dex */
public final class C6130 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24030 f20934;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Iterator f20935;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C24030 f20936;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f20937 = false;

    public C6130(C24030 c24030, C24030 c24031) {
        this.f20934 = c24030;
        this.f20936 = c24031;
        this.f20935 = c24031.f77746.iterator();
    }

    @Override // java.util.Iterator
    public final C18062 next() {
        if (!this.f20937) {
            Iterator it = this.f20935;
            if (it.hasNext()) {
                return (C18062) it.next();
            }
            this.f20937 = true;
        }
        C24030 c24030 = this.f20936;
        if (c24030.f77748.hasNext()) {
            InterfaceC8540 interfaceC8540 = (InterfaceC8540) c24030.f77748.next();
            C24030 c24031 = this.f20934;
            C18808 c18808 = c24031.f77747;
            C18808 c18809 = c24031.f77747;
            C18062 c18062 = new C18062(interfaceC8540, c18808.f61095, c18808.f61112, c18808.f61099, EnumC3666.f12544.m11915(c18809.f61112), c18809, c18809.f61107);
            c24030.f77746.add(c18062);
            return c18062;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z = this.f20937;
        C24030 c24030 = this.f20936;
        if (z) {
            return c24030.f77748.hasNext();
        }
        return this.f20935.hasNext() || c24030.f77748.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
