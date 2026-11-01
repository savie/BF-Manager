package l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۡ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBC3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8904 implements InterfaceC19653, Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C19136 f30552;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20255 f30553;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f30553.compareTo(((C8904) obj).f30553);
    }

    public C8904(C20255 c20255, C19136 c19136) {
        this.f30553 = c20255;
        this.f30552 = c19136;
    }

    public final int hashCode() {
        return this.f30553.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8904)) {
            return false;
        }
        return this.f30553.equals(((C8904) obj).f30553);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23165(C4669 c4669) {
        C15960 c15960M12884 = c4669.m12884();
        C16665 c16665M12878 = c4669.m12878();
        c15960M12884.m37947(this.f30553);
        this.f30552 = (C19136) c16665M12878.m39130(this.f30552);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23166(C4669 c4669, C2718 c2718) {
        C15960 c15960M12884 = c4669.m12884();
        C20255 c20255 = this.f30553;
        int iM37944 = c15960M12884.m37944((AbstractC11788) c20255);
        int iM30904 = this.f30552.m30904();
        if (c2718.m8288()) {
            c2718.m8283(0, ASN1Dump.TAB + c20255.mo2376());
            c2718.m8283(4, "      method_idx:      ".concat(C22475.m49978(iM37944)));
            c2718.m8283(4, "      annotations_off: ".concat(C22475.m49978(iM30904)));
        }
        c2718.m8289(iM37944);
        c2718.m8289(iM30904);
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return this.f30553.mo2376() + ": " + this.f30552;
    }
}
