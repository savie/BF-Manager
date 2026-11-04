package l;

/* JADX INFO: renamed from: l.ᩳ۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: IIVL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18916 implements InterfaceC11851 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21943 f61371;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21943 f61372;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18959 f61373;

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean mo1794() {
        return false;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C11457.f36017;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֡ */
    public final String mo1790() {
        return toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43920(C16721 c16721, C18959 c18959) {
        C21943 c21943M39487 = c16721.m39487();
        C21943 c21943M39488 = c16721.m39488();
        C18916 c18916 = new C18916(c21943M39487, c21943M39488, c18959);
        C11457 c11457 = C11457.f36017;
        if (!c21943M39487.mo17861(c11457).contains(c18916)) {
            c21943M39487.mo17863(c11457, c18916);
        }
        if (c21943M39488.mo17861(c11457).contains(c18916)) {
            return;
        }
        c21943M39488.mo17863(c11457, c18916);
    }

    public C18916(C21943 c21943, C21943 c21944, C18959 c18959) {
        this.f61372 = c21943;
        this.f61371 = c21944;
        this.f61373 = c18959;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21943 m43922() {
        return this.f61372;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m43921() {
        return this.f61371;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18959 m43923() {
        return this.f61373;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18916.class != obj.getClass()) {
            return false;
        }
        C18916 c18916 = (C18916) obj;
        return this.f61372.equals(c18916.f61372) && this.f61371.equals(c18916.f61371) && this.f61373.m44036(c18916.f61373);
    }

    public final int hashCode() {
        return C17359.hash(this.f61372, this.f61371, this.f61373);
    }

    public final String toString() {
        return "EDGE_INSN: " + this.f61372 + "->" + this.f61371 + ' ' + this.f61373;
    }
}
