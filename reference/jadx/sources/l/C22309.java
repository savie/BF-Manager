package l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.᩹۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBAQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22309 implements InterfaceC19653, Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C19136 f72850;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23077 f72851;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f72851.compareTo(((C22309) obj).f72851);
    }

    public C22309(C23077 c23077, C19136 c19136) {
        this.f72851 = c23077;
        this.f72850 = c19136;
    }

    public final int hashCode() {
        return this.f72851.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22309)) {
            return false;
        }
        return this.f72851.equals(((C22309) obj).f72851);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49473(C4669 c4669) {
        C13137 c13137M12889 = c4669.m12889();
        C16665 c16665M12878 = c4669.m12878();
        c13137M12889.m32497(this.f72851);
        this.f72850 = (C19136) c16665M12878.m39130(this.f72850);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49474(C4669 c4669, C2718 c2718) {
        C13137 c13137M12889 = c4669.m12889();
        C23077 c23077 = this.f72851;
        int iM32494 = c13137M12889.m32494(c23077);
        int iM30904 = this.f72850.m30904();
        if (c2718.m8288()) {
            c2718.m8283(0, ASN1Dump.TAB + c23077.mo2376());
            c2718.m8283(4, "      field_idx:       ".concat(C22475.m49978(iM32494)));
            c2718.m8283(4, "      annotations_off: ".concat(C22475.m49978(iM30904)));
        }
        c2718.m8289(iM32494);
        c2718.m8289(iM30904);
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return this.f72851.mo2376() + ": " + this.f72850;
    }
}
