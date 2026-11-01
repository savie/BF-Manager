package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܽۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16450 implements InterfaceC10597 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52893;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52894;

    public /* synthetic */ C16450(int i, Object obj) {
        this.f52893 = i;
        this.f52894 = obj;
    }

    @Override // l.InterfaceC10597
    /* JADX INFO: renamed from: ۙ */
    public final void mo1473(Object obj) {
        switch (this.f52893) {
            case 0:
                ((DialogInterfaceOnClickListenerC8128) this.f52894).m21417();
                break;
            default:
                ((ActivityC5677) this.f52894).m31002((Throwable) obj, (DialogInterface.OnDismissListener) null);
                break;
        }
    }
}
