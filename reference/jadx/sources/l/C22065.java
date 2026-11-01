package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩹ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M7NB */
/* JADX INFO: loaded from: classes.dex */
public final class C22065 extends AbstractC7248 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f71493;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC10071 f71494;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f71495;

    @Override // l.AbstractC7248
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19378() {
        return this.f71493;
    }

    public C22065(boolean z, boolean z2, EnumC10071 enumC10071) {
        this.f71493 = z;
        this.f71495 = z2;
        this.f71494 = enumC10071;
    }

    @Override // l.AbstractC7248
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo19380() {
        return this.f71495;
    }

    @Override // l.AbstractC7248
    /* JADX INFO: renamed from: ۨ */
    public final EnumC10071 mo19379() {
        return this.f71494;
    }

    public final String toString() {
        return "JavaFormatterOptions{formatJavadoc=" + this.f71493 + ", reorderModifiers=" + this.f71495 + ", style=" + this.f71494 + l.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7248)) {
            return false;
        }
        AbstractC7248 abstractC7248 = (AbstractC7248) obj;
        return this.f71493 == abstractC7248.mo19378() && this.f71495 == abstractC7248.mo19380() && this.f71494.equals(abstractC7248.mo19379());
    }

    public final int hashCode() {
        return (((((this.f71493 ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.f71495 ? 1231 : 1237)) * 1000003) ^ this.f71494.hashCode();
    }
}
