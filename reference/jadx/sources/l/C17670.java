package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܿ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes5.dex */
public class C17670 implements InterfaceC5657 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ WeakReference f56139;

    public C17670(WeakReference weakReference) {
        this.f56139 = weakReference;
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        if (enumC1651 == EnumC1651.ON_DESTROY) {
            interfaceC1423.getLifecycle().mo9172(this);
            C6111 c6111 = (C6111) this.f56139.get();
            if (c6111 != null) {
                c6111.m16940();
            }
        }
    }
}
