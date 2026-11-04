package l;

/* JADX INFO: renamed from: l.ᩳܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 5ISK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19148 implements InterfaceC12435 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14022 f61966;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f61967;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3319 f61968;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1610 f61969;

    public C19148(C1610 c1610, C3319 c3319, AbstractC1566 abstractC1566) {
        this.f61969 = c1610;
        this.f61968 = c3319;
        this.f61966 = (C14022) c3319.m10937();
        this.f61967 = abstractC1566;
    }

    @Override // l.InterfaceC20640
    /* JADX INFO: renamed from: ۙ */
    public final EnumC15418 mo2468() {
        return EnumC15418.ASSIGN;
    }

    @Override // l.InterfaceC20640
    public final AbstractC1566 getType() {
        AbstractC1566 type = this.f61968.mo44035(0).getType();
        C3101 c3101M5692 = this.f61969.m5692();
        AbstractC1566 abstractC1566 = this.f61967;
        AbstractC1566 abstractC1566M10106 = c3101M5692.m10106(type, type, abstractC1566);
        return (abstractC1566M10106 == null || abstractC1566M10106.m5540()) ? abstractC1566 : abstractC1566M10106;
    }

    @Override // l.InterfaceC12435
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC1566 mo2467(C7150 c7150) {
        AbstractC1566 abstractC1566M19714 = c7150.m19714(this.f61968.mo44035(0));
        C3101 c3101M5692 = this.f61969.m5692();
        AbstractC1566 abstractC1566 = this.f61967;
        AbstractC1566 abstractC1566M10106 = c3101M5692.m10106(abstractC1566M19714, abstractC1566M19714, abstractC1566);
        return (abstractC1566M10106 == null || abstractC1566M10106.m5540()) ? abstractC1566 : abstractC1566M10106;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19148.class != obj.getClass()) {
            return false;
        }
        return this.f61968.equals(((C19148) obj).f61968);
    }

    public final int hashCode() {
        return this.f61968.hashCode();
    }

    public final String toString() {
        return "FieldGetAssign{" + this.f61966 + ", type=" + getType() + ", instanceArg=" + this.f61968.mo44035(0) + '}';
    }
}
