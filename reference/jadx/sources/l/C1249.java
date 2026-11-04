package l;

/* JADX INFO: renamed from: l.֨ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6EJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1249 implements InterfaceC12435 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6041 f4512;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC15251 f4513;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f4514;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1610 f4515;

    public C1249(C1610 c1610, AbstractC15251 abstractC15251, C6041 c6041, AbstractC1566 abstractC1566) {
        this.f4515 = c1610;
        this.f4513 = abstractC15251;
        this.f4512 = c6041;
        this.f4514 = abstractC1566;
    }

    @Override // l.InterfaceC20640
    /* JADX INFO: renamed from: ۙ */
    public final EnumC15418 mo2468() {
        return EnumC15418.USE;
    }

    @Override // l.InterfaceC12435
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC1566 mo2467(C7150 c7150) {
        AbstractC1566 abstractC1566M19714 = c7150.m19714(this.f4513.mo13131());
        AbstractC1566 abstractC1566M19715 = c7150.m19714(this.f4512);
        AbstractC1566 abstractC1566M10106 = this.f4515.m5692().m10106(abstractC1566M19714, abstractC1566M19714, this.f4514);
        return abstractC1566M10106 != null ? abstractC1566M10106 : abstractC1566M19715;
    }

    @Override // l.InterfaceC20640
    public final AbstractC1566 getType() {
        AbstractC1566 type = this.f4513.mo13131().getType();
        AbstractC1566 type2 = this.f4512.getType();
        AbstractC1566 abstractC1566M10106 = this.f4515.m5692().m10106(type, type, this.f4514);
        return abstractC1566M10106 != null ? abstractC1566M10106 : type2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1249.class != obj.getClass()) {
            return false;
        }
        return this.f4513.equals(((C1249) obj).f4513);
    }

    public final int hashCode() {
        return this.f4513.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvokeAssign{");
        AbstractC15251 abstractC15251 = this.f4513;
        sb.append(abstractC15251.mo18926().m49701());
        sb.append(", argType=");
        sb.append(this.f4514);
        sb.append(", currentType=");
        sb.append(getType());
        sb.append(", instanceArg=");
        sb.append(abstractC15251.mo13131());
        sb.append('}');
        return sb.toString();
    }
}
