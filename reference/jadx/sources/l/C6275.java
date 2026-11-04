package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۛ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final class C6275 implements InterfaceC5252 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ WeakReference f21306;

    public C6275(WeakReference weakReference) {
        this.f21306 = weakReference;
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_DESTROY) {
            interfaceC11217.getLifecycle().mo23078(this);
            C24132 c24132 = (C24132) this.f21306.get();
            if (c24132 != null) {
                c24132.m53966();
            }
        }
    }
}
