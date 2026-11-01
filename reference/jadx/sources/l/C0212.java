package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P5BM */
/* JADX INFO: loaded from: classes2.dex */
public final class C0212 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f1381;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C18557 f1382;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Object f1383;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18557 f1384;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22791 f1385;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f1386;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18557 f1387;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1381) {
            return this.f1383 != null;
        }
        C22791 c22791 = this.f1385;
        if (c22791 != null && c22791.size() > 0) {
            return true;
        }
        Object obj = this.f1386;
        if (obj == null) {
            return false;
        }
        if (((InterfaceC19969) obj).getChildCount() > 0) {
            return true;
        }
        Object obj2 = this.f1386;
        return (obj2 == null ? null : ((InterfaceC19969) obj2).getParent()) != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C18557 c18557 = this.f1387;
        C22791 c22791 = this.f1385;
        if (this.f1381) {
            this.f1381 = false;
            Object obj = this.f1386;
            if ((obj != null ? ((InterfaceC19969) obj).getChildCount() : 0) == 0) {
                c22791.m50451(c18557);
                return this.f1386;
            }
            return this.f1386;
        }
        if (c22791 != null && c22791.size() > 0) {
            return c22791.mo21035();
        }
        Object obj2 = this.f1386;
        if (obj2 == null) {
            return c18557;
        }
        if (((InterfaceC19969) obj2).getChildCount() > 0) {
            Object obj3 = this.f1386;
            InterfaceC19969 interfaceC19969Mo45257 = obj3 != null ? ((InterfaceC19969) obj3).mo45257(0) : null;
            this.f1386 = interfaceC19969Mo45257;
            c22791.m50451(interfaceC19969Mo45257);
            return this.f1384;
        }
        Object obj4 = this.f1386;
        InterfaceC19969 parent = obj4 == null ? null : ((InterfaceC19969) obj4).getParent();
        while (parent != null) {
            Object obj5 = this.f1386;
            if ((obj5 == null ? 0 : ((InterfaceC19969) obj5).mo42958()) + 1 < parent.getChildCount()) {
                break;
            }
            c22791.m50451(this.f1382);
            this.f1386 = parent;
            parent = parent.getParent();
        }
        if (parent == null) {
            this.f1386 = null;
            c22791.m50451(c18557);
            return c22791.mo21035();
        }
        Object obj6 = this.f1386;
        InterfaceC19969 interfaceC19969Mo45258 = parent.mo45257((obj6 != null ? ((InterfaceC19969) obj6).mo42958() : 0) + 1);
        this.f1386 = interfaceC19969Mo45258;
        c22791.m50451(interfaceC19969Mo45258);
        return c22791.mo21035();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
