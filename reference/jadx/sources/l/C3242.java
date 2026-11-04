package l;

/* JADX INFO: renamed from: l.ۗۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q89H */
/* JADX INFO: loaded from: classes3.dex */
public final class C3242 extends C23380 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f10571;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C24126 f10572;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m10599() {
        return this.f10571;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24126 m10600() {
        return this.f10572;
    }

    @Override // l.C20396, l.InterfaceC9996
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo10601(C0302 c0302) {
        super.mo10601(c0302);
        this.f10571 = (int) c0302.m1885();
        if (c0302.m1884() != 0) {
            this.f10572 = new C24126();
        } else {
            this.f10572 = null;
        }
    }

    @Override // l.C20396, l.InterfaceC9996
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10598(C0302 c0302) {
        super.mo10598(c0302);
        C24126 c24126 = this.f10572;
        if (c24126 != null) {
            c0302.m1881(c24126);
        }
    }

    @Override // l.C20396
    public final int hashCode() {
        return C17359.hash(Integer.valueOf(this.f10571), this.f10572) + (super.hashCode() * 31);
    }

    @Override // l.C20396
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3242)) {
            return false;
        }
        C3242 c3242 = (C3242) obj;
        return super.equals(obj) && this.f10571 == c3242.f10571 && C17359.equals(this.f10572, c3242.f10572);
    }

    public final String toString() {
        return String.format("SHARE_INFO_1{shi1_netname: %s, shi1_type: %d, shi1_remark: %s}", m46797(), Integer.valueOf(this.f10571), this.f10572);
    }
}
