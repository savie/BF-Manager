package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7ND */
/* JADX INFO: loaded from: classes4.dex */
public final class C11183 extends AbstractC15067 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f35254;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f35255;

    public C11183(AbstractC1928 abstractC1928, AbstractC1928 abstractC1929) {
        if (abstractC1928 == null) {
            throw new NullPointerException("Null declarationModifiers");
        }
        this.f35254 = abstractC1928;
        if (abstractC1929 == null) {
            throw new NullPointerException("Null typeAnnotations");
        }
        this.f35255 = abstractC1929;
    }

    @Override // l.AbstractC15067
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 mo28181() {
        return this.f35254;
    }

    @Override // l.AbstractC15067
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 mo28182() {
        return this.f35255;
    }

    public final String toString() {
        return "DeclarationModifiersAndTypeAnnotations{declarationModifiers=" + this.f35254 + ", typeAnnotations=" + this.f35255 + l.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC15067)) {
            return false;
        }
        AbstractC15067 abstractC15067 = (AbstractC15067) obj;
        return this.f35254.equals(abstractC15067.mo28181()) && this.f35255.equals(abstractC15067.mo28182());
    }

    public final int hashCode() {
        return ((this.f35254.hashCode() ^ 1000003) * 1000003) ^ this.f35255.hashCode();
    }
}
