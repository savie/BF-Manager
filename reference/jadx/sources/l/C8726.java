package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۠ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17MV */
/* JADX INFO: loaded from: classes4.dex */
public final class C8726 extends AbstractC13946 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11847 f28403;

    public C8726(InterfaceC11847 interfaceC11847) {
        this.f28403 = interfaceC11847;
    }

    @Override // l.AbstractC13946, l.AbstractC14166
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11847 mo23411() {
        return this.f28403;
    }

    public final String toString() {
        return "AnnotationOrModifier{annotation=" + this.f28403 + l.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC14166) {
            AbstractC14166 abstractC14166 = (AbstractC14166) obj;
            if (EnumC7455.ANNOTATION == abstractC14166.mo19837() && this.f28403.equals(abstractC14166.mo23411())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f28403.hashCode();
    }

    @Override // l.AbstractC14166
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC7455 mo19837() {
        return EnumC7455.ANNOTATION;
    }
}
