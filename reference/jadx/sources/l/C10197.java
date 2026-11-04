package l;

/* JADX INFO: renamed from: l.ۢܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LIYL */
/* JADX INFO: loaded from: classes4.dex */
public final class C10197 implements InterfaceC12435 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f32621;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1610 f32622;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21219 f32623;

    public C10197(C1610 c1610, C21219 c21219, AbstractC1566 abstractC1566) {
        this.f32622 = c1610;
        this.f32623 = c21219;
        this.f32621 = abstractC1566;
    }

    @Override // l.InterfaceC20640
    /* JADX INFO: renamed from: ۙ */
    public final EnumC15418 mo2468() {
        return EnumC15418.ASSIGN;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC1566 m26314(AbstractC1566 abstractC1566) {
        C1610 c1610 = this.f32622;
        C6990 c6990M5683 = c1610.m5683();
        C21219 c21219 = this.f32623;
        InterfaceC21197 interfaceC21197M19301 = c6990M5683.m19301(c21219);
        AbstractC1566 abstractC1566M10106 = c1610.m5692().m10106(abstractC1566, interfaceC21197M19301 != null ? interfaceC21197M19301.mo8532().m49700().getType() : abstractC1566, this.f32621);
        if (abstractC1566M10106 == null) {
            abstractC1566M10106 = null;
        } else if (abstractC1566M10106.m5540()) {
            abstractC1566M10106 = abstractC1566M10106.mo5563();
        }
        return abstractC1566M10106 != null ? abstractC1566M10106 : c21219.mo18926().m49698();
    }

    @Override // l.InterfaceC20640
    public final AbstractC1566 getType() {
        return m26314(this.f32623.mo44035(0).getType());
    }

    @Override // l.InterfaceC12435
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC1566 mo2467(C7150 c7150) {
        return m26314(c7150.m19714(this.f32623.mo44035(0)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10197.class != obj.getClass()) {
            return false;
        }
        return this.f32623.equals(((C10197) obj).f32623);
    }

    public final int hashCode() {
        return this.f32623.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvokeAssign{");
        C21219 c21219 = this.f32623;
        sb.append(c21219.mo18926().m49701());
        sb.append(", returnType=");
        sb.append(this.f32621);
        sb.append(", currentType=");
        sb.append(getType());
        sb.append(", instanceArg=");
        sb.append(c21219.mo44035(0));
        sb.append('}');
        return sb.toString();
    }
}
