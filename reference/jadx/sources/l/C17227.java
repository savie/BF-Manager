package l;

/* JADX INFO: renamed from: l.ܽ֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: VIV4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17227 extends AbstractC16481 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C18959 f56130;

    public C17227(C18959 c18959) {
        C6041 c6041M44027 = c18959.m44027();
        this.f976 = c6041M44027 != null ? c6041M44027.getType() : AbstractC1566.f5420;
        this.f56130 = c18959;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C18959 m40461() {
        return this.f56130;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final C18959 m40462() {
        C18959 c18959Mo4072 = this.f56130.mo4072();
        c18959Mo4072.m39418(EnumC1763.WRAPPED);
        return c18959Mo4072;
    }

    @Override // l.AbstractC16481
    /* JADX INFO: renamed from: ۙ */
    public final void mo39114(C18959 c18959) {
        if (c18959 == this.f56130) {
            throw new C8597("Can't wrap instruction info itself: " + c18959);
        }
        this.f53443 = c18959;
    }

    public final int hashCode() {
        return this.f56130.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17227)) {
            return false;
        }
        C18959 c18959 = ((C17227) obj).f56130;
        C18959 c189510 = this.f56130;
        if (!c189510.mo4075(c18959)) {
            return false;
        }
        int iM44039 = c189510.m44039();
        for (int i = 0; i < iM44039; i++) {
            if (!c189510.mo44035(i).equals(c18959.mo44035(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC16678
    /* JADX INFO: renamed from: ֨ */
    public final String mo17521() {
        C18959 c18959 = this.f56130;
        if (c18959.getType() == EnumC24203.CONST_STR) {
            return "(\"" + ((C5557) c18959).getString() + "\")";
        }
        return "(wrap " + this.f976 + ":" + c18959.getType() + ')';
    }

    public final String toString() {
        C18959 c18959 = this.f56130;
        if (c18959.getType() == EnumC24203.CONST_STR) {
            return "(\"" + ((C5557) c18959).getString() + "\")";
        }
        return "(wrap " + this.f976 + ":" + c18959 + ')';
    }

    @Override // l.AbstractC16481
    /* JADX INFO: renamed from: ۠ */
    public final AbstractC16481 mo17528() {
        C18959 c18959 = this.f56130;
        C18959 c18959Mo4072 = c18959.mo4072();
        if (c18959.m44027() != null && c18959.mo17865(EnumC1763.FORCE_ASSIGN_INLINE)) {
            c18959Mo4072.m44031(c18959.m44027().mo17528());
            c18959.mo17866(EnumC1763.DONT_GENERATE);
        }
        C17227 c17227 = new C17227(c18959Mo4072);
        c17227.f976 = this.f976;
        c17227.m39414(this);
        c17227.mo39114(this.f53443);
        return c17227;
    }
}
