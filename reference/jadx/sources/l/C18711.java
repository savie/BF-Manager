package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩴۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes5.dex */
public class C18711 implements InterfaceC5657 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public WeakReference f60689;

    public C18711(DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128) {
        this.f60689 = new WeakReference(dialogInterfaceOnClickListenerC8128);
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128 = (DialogInterfaceOnClickListenerC8128) this.f60689.get();
        if (dialogInterfaceOnClickListenerC8128 == null) {
            interfaceC1423.getLifecycle().mo9172(this);
        } else if (enumC1651 == EnumC1651.ON_RESUME) {
            dialogInterfaceOnClickListenerC8128.m21417();
        }
    }
}
