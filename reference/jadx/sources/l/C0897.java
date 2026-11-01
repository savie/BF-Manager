package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֨ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U7ND */
/* JADX INFO: loaded from: classes2.dex */
public final class C0897 extends AbstractC23040 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f3619;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f3620;

    public C0897(AbstractC22433 abstractC22433, AbstractC22433 abstractC22434) {
        if (abstractC22433 == null) {
            throw new NullPointerException("Null declarationModifiers");
        }
        this.f3619 = abstractC22433;
        if (abstractC22434 == null) {
            throw new NullPointerException("Null typeAnnotations");
        }
        this.f3620 = abstractC22434;
    }

    @Override // l.AbstractC23040
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 mo3588() {
        return this.f3619;
    }

    @Override // l.AbstractC23040
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 mo3589() {
        return this.f3620;
    }

    public final String toString() {
        return "DeclarationModifiersAndTypeAnnotations{declarationModifiers=" + this.f3619 + ", typeAnnotations=" + this.f3620 + l.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC23040)) {
            return false;
        }
        AbstractC23040 abstractC23040 = (AbstractC23040) obj;
        return this.f3619.equals(abstractC23040.mo3588()) && this.f3620.equals(abstractC23040.mo3589());
    }

    public final int hashCode() {
        return ((this.f3619.hashCode() ^ 1000003) * 1000003) ^ this.f3620.hashCode();
    }
}
