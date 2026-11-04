package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5BM */
/* JADX INFO: loaded from: classes5.dex */
public final class C19931 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C8240 f64113;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Object f64114;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C9730 f64115;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9730 f64116;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f64117;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Object f64118;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C9730 f64119;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f64117) {
            return this.f64114 != null;
        }
        C8240 c8240 = this.f64113;
        if (c8240 != null && c8240.size() > 0) {
            return true;
        }
        Object obj = this.f64118;
        if (obj == null) {
            return false;
        }
        if (((InterfaceC22915) obj).getChildCount() > 0) {
            return true;
        }
        Object obj2 = this.f64118;
        return (obj2 == null ? null : ((InterfaceC22915) obj2).getParent()) != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C9730 c9730 = this.f64119;
        C8240 c8240 = this.f64113;
        if (this.f64117) {
            this.f64117 = false;
            Object obj = this.f64118;
            if ((obj != null ? ((InterfaceC22915) obj).getChildCount() : 0) == 0) {
                c8240.m22153(c9730);
                return this.f64118;
            }
            return this.f64118;
        }
        if (c8240 != null && c8240.size() > 0) {
            return c8240.mo9832();
        }
        Object obj2 = this.f64118;
        if (obj2 == null) {
            return c9730;
        }
        if (((InterfaceC22915) obj2).getChildCount() > 0) {
            Object obj3 = this.f64118;
            InterfaceC22915 interfaceC22915Mo26898 = obj3 != null ? ((InterfaceC22915) obj3).mo26898(0) : null;
            this.f64118 = interfaceC22915Mo26898;
            c8240.m22153(interfaceC22915Mo26898);
            return this.f64116;
        }
        Object obj4 = this.f64118;
        InterfaceC22915 parent = obj4 == null ? null : ((InterfaceC22915) obj4).getParent();
        while (parent != null) {
            Object obj5 = this.f64118;
            if ((obj5 == null ? 0 : ((InterfaceC22915) obj5).mo25323()) + 1 < parent.getChildCount()) {
                break;
            }
            c8240.m22153(this.f64115);
            this.f64118 = parent;
            parent = parent.getParent();
        }
        if (parent == null) {
            this.f64118 = null;
            c8240.m22153(c9730);
            return c8240.mo9832();
        }
        Object obj6 = this.f64118;
        InterfaceC22915 interfaceC22915Mo26899 = parent.mo26898((obj6 != null ? ((InterfaceC22915) obj6).mo25323() : 0) + 1);
        this.f64118 = interfaceC22915Mo26899;
        c8240.m22153(interfaceC22915Mo26899);
        return c8240.mo9832();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
