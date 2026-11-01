package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܰۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 17MV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13599 extends AbstractC2308 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC1657 f44859;

    public C13599(InterfaceC1657 interfaceC1657) {
        this.f44859 = interfaceC1657;
    }

    @Override // l.AbstractC2308, l.AbstractC5400
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC1657 mo7051() {
        return this.f44859;
    }

    public final String toString() {
        return "AnnotationOrModifier{annotation=" + this.f44859 + l.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC5400) {
            AbstractC5400 abstractC5400 = (AbstractC5400) obj;
            if (EnumC2577.ANNOTATION == abstractC5400.mo14963() && this.f44859.equals(abstractC5400.mo7051())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f44859.hashCode();
    }

    @Override // l.AbstractC5400
    /* JADX INFO: renamed from: ܰ */
    public final EnumC2577 mo14963() {
        return EnumC2577.ANNOTATION;
    }
}
