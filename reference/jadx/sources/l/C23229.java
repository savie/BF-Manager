package l;

import android.content.ComponentCallbacks2;

/* JADX INFO: renamed from: l.᩺᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6P1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23229 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3062 f75385;

    public C23229(AbstractC3062 abstractC3062) {
        this.f75385 = abstractC3062;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3062 m51235() {
        return this.f75385;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23229 m51233(InterfaceC1423 interfaceC1423) {
        return new C23229(interfaceC1423.getLifecycle());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23229 m51234(C6111 c6111) {
        InterfaceC1423 interfaceC1423M52317 = C23773.m52317(c6111);
        if (interfaceC1423M52317 == null) {
            ComponentCallbacks2 componentCallbacks2M22527 = C8703.m22527(c6111.getContext());
            if (componentCallbacks2M22527 instanceof InterfaceC1423) {
                interfaceC1423M52317 = (InterfaceC1423) componentCallbacks2M22527;
            }
        }
        return new C23229(interfaceC1423M52317 == null ? null : interfaceC1423M52317.getLifecycle());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m51236() {
        AbstractC3062 abstractC3062 = this.f75385;
        return abstractC3062 == null || abstractC3062.mo9170() != EnumC9414.DESTROYED;
    }
}
