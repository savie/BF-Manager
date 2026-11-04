package l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۚܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBAQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5699 implements InterfaceC6052, Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C6140 f19677;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16689 f19678;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f19678.compareTo(((C5699) obj).f19678);
    }

    public C5699(C16689 c16689, C6140 c6140) {
        this.f19678 = c16689;
        this.f19677 = c6140;
    }

    public final int hashCode() {
        return this.f19678.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5699)) {
            return false;
        }
        return this.f19678.equals(((C5699) obj).f19678);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16727(C10918 c10918) {
        C11664 c11664M27705 = c10918.m27705();
        C19123 c19123M27703 = c10918.m27703();
        c11664M27705.m29339(this.f19678);
        this.f19677 = (C6140) c19123M27703.m44247(this.f19677);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16728(C10918 c10918, C15000 c15000) {
        C11664 c11664M27705 = c10918.m27705();
        C16689 c16689 = this.f19678;
        int iM29336 = c11664M27705.m29336(c16689);
        int iM26285 = this.f19677.m26285();
        if (c15000.m36116()) {
            c15000.m36111(0, ASN1Dump.TAB + c16689.mo1843());
            c15000.m36111(4, "      field_idx:       ".concat(C5306.m15938(iM29336)));
            c15000.m36111(4, "      annotations_off: ".concat(C5306.m15938(iM26285)));
        }
        c15000.m36124(iM29336);
        c15000.m36124(iM26285);
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return this.f19678.mo1843() + ": " + this.f19677;
    }
}
