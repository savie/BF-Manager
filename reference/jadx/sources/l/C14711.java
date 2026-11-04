package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܰܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6IL */
/* JADX INFO: loaded from: classes5.dex */
public final class C14711 implements InterfaceC5252 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WeakReference f48069;

    public C14711(C21425 c21425) {
        this.f48069 = new WeakReference(c21425);
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        C21425 c21425;
        EnumC9330 enumC9331 = EnumC9330.ON_PAUSE;
        WeakReference weakReference = this.f48069;
        if (enumC9330 == enumC9331 && (c21425 = (C21425) weakReference.get()) != null) {
            c21425.f68255 = false;
            c21425.f68244.m7101();
        }
        if (enumC9330 == EnumC9330.ON_DESTROY) {
            C21425 c21426 = (C21425) weakReference.get();
            if (c21426 != null) {
                c21426.f68244.m7104();
            }
            interfaceC11217.getLifecycle().mo23078(this);
            return;
        }
        if (enumC9330 == EnumC9330.ON_RESUME) {
            C21425 c21427 = (C21425) weakReference.get();
            if (c21427 == null) {
                interfaceC11217.getLifecycle().mo23078(this);
            } else if (!c21427.f68252.m22434()) {
                interfaceC11217.getLifecycle().mo23078(this);
            } else {
                c21427.m48745();
            }
        }
    }
}
