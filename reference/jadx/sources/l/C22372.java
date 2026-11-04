package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩷᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7NB */
/* JADX INFO: loaded from: classes.dex */
public final class C22372 extends AbstractC3726 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f72434;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC23864 f72435;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f72436;

    @Override // l.AbstractC3726
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12126() {
        return this.f72434;
    }

    public C22372(boolean z, boolean z2, EnumC23864 enumC23864) {
        this.f72434 = z;
        this.f72436 = z2;
        this.f72435 = enumC23864;
    }

    @Override // l.AbstractC3726
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo12128() {
        return this.f72436;
    }

    @Override // l.AbstractC3726
    /* JADX INFO: renamed from: ۤ */
    public final EnumC23864 mo12127() {
        return this.f72435;
    }

    public final String toString() {
        return "JavaFormatterOptions{formatJavadoc=" + this.f72434 + ", reorderModifiers=" + this.f72436 + ", style=" + this.f72435 + l.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3726)) {
            return false;
        }
        AbstractC3726 abstractC3726 = (AbstractC3726) obj;
        return this.f72434 == abstractC3726.mo12126() && this.f72436 == abstractC3726.mo12128() && this.f72435.equals(abstractC3726.mo12127());
    }

    public final int hashCode() {
        return (((((this.f72434 ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.f72436 ? 1231 : 1237)) * 1000003) ^ this.f72435.hashCode();
    }
}
