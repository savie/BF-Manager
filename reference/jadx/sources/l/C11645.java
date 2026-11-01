package l;

/* JADX INFO: renamed from: l.ۨۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q89H */
/* JADX INFO: loaded from: classes4.dex */
public final class C11645 extends C13762 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f39160;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C1060 f39161;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m29099() {
        return this.f39160;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1060 m29100() {
        return this.f39161;
    }

    @Override // l.C2471, l.InterfaceC18659
    /* JADX INFO: renamed from: ܰ */
    public final void mo7580(C15132 c15132) {
        super.mo7580(c15132);
        this.f39160 = (int) c15132.m36287();
        if (c15132.m36288() != 0) {
            this.f39161 = new C1060();
        } else {
            this.f39161 = null;
        }
    }

    @Override // l.C2471, l.InterfaceC18659
    /* JADX INFO: renamed from: ۙ */
    public final void mo7578(C15132 c15132) {
        super.mo7578(c15132);
        C1060 c1060 = this.f39161;
        if (c1060 != null) {
            c15132.m36285(c1060);
        }
    }

    @Override // l.C2471
    public final int hashCode() {
        return C13638.hash(Integer.valueOf(this.f39160), this.f39161) + (super.hashCode() * 31);
    }

    @Override // l.C2471
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11645)) {
            return false;
        }
        C11645 c11645 = (C11645) obj;
        return super.equals(obj) && this.f39160 == c11645.f39160 && C13638.equals(this.f39161, c11645.f39161);
    }

    public final String toString() {
        return String.format("SHARE_INFO_1{shi1_netname: %s, shi1_type: %d, shi1_remark: %s}", m7577(), Integer.valueOf(this.f39160), this.f39161);
    }
}
