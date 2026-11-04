package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۜܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17MV */
/* JADX INFO: loaded from: classes4.dex */
public final class C7235 extends AbstractC13946 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20660 f23859;

    public C7235(InterfaceC20660 interfaceC20660) {
        this.f23859 = interfaceC20660;
    }

    @Override // l.AbstractC13946, l.AbstractC14166
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20660 mo19836() {
        return this.f23859;
    }

    public final String toString() {
        return "AnnotationOrModifier{modifier=" + this.f23859 + l.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC14166) {
            AbstractC14166 abstractC14166 = (AbstractC14166) obj;
            if (EnumC7455.MODIFIER == abstractC14166.mo19837() && this.f23859.equals(abstractC14166.mo19836())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f23859.hashCode();
    }

    @Override // l.AbstractC14166
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC7455 mo19837() {
        return EnumC7455.MODIFIER;
    }
}
