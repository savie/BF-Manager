package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۨۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 17MV */
/* JADX INFO: loaded from: classes4.dex */
public final class C11482 extends AbstractC2308 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC20608 f38650;

    public C11482(InterfaceC20608 interfaceC20608) {
        this.f38650 = interfaceC20608;
    }

    @Override // l.AbstractC2308, l.AbstractC5400
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC20608 mo7052() {
        return this.f38650;
    }

    public final String toString() {
        return "AnnotationOrModifier{modifier=" + this.f38650 + l.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC5400) {
            AbstractC5400 abstractC5400 = (AbstractC5400) obj;
            if (EnumC2577.MODIFIER == abstractC5400.mo14963() && this.f38650.equals(abstractC5400.mo7052())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f38650.hashCode();
    }

    @Override // l.AbstractC5400
    /* JADX INFO: renamed from: ܰ */
    public final EnumC2577 mo14963() {
        return EnumC2577.MODIFIER;
    }
}
