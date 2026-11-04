package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۘۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes3.dex */
public final class C3860 implements InterfaceC5252 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public WeakReference f13172;

    public C3860(DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300) {
        this.f13172 = new WeakReference(dialogInterfaceOnClickListenerC14300);
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300 = (DialogInterfaceOnClickListenerC14300) this.f13172.get();
        if (dialogInterfaceOnClickListenerC14300 == null) {
            interfaceC11217.getLifecycle().mo23078(this);
        } else if (enumC9330 == EnumC9330.ON_RESUME) {
            dialogInterfaceOnClickListenerC14300.m34726();
        }
    }
}
