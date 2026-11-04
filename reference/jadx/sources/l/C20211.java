package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩵֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9IST */
/* JADX INFO: loaded from: classes5.dex */
public final class C20211 extends AbstractC16481 implements InterfaceC3057 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f64886;

    public C20211(AbstractC1566 abstractC1566, String str) {
        this.f64886 = str;
        this.f976 = abstractC1566;
    }

    @Override // l.InterfaceC3057
    public final String getName() {
        return this.f64886;
    }

    @Override // l.InterfaceC3057
    public final void setName(String str) {
        this.f64886 = str;
    }

    @Override // l.AbstractC16481
    /* JADX INFO: renamed from: ۠ */
    public final AbstractC16481 mo17528() {
        C20211 c20211 = new C20211(this.f976, this.f64886);
        c20211.m39414(this);
        c20211.mo39114(this.f53443);
        return c20211;
    }

    public final int hashCode() {
        return this.f64886.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20211) {
            return this.f64886.equals(((C20211) obj).f64886);
        }
        return false;
    }

    @Override // l.AbstractC16678
    /* JADX INFO: renamed from: ֨ */
    public final String mo17521() {
        return this.f64886;
    }

    public final String toString() {
        return MotionUtils.EASING_TYPE_FORMAT_START + this.f64886 + ' ' + this.f976 + ')';
    }
}
