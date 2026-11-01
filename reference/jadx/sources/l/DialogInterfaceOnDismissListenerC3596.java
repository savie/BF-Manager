package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۘ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC3596 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13230;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13231;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13232;

    public /* synthetic */ DialogInterfaceOnDismissListenerC3596(int i, Object obj, Object obj2) {
        this.f13231 = i;
        this.f13232 = obj;
        this.f13230 = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f13231) {
            case 0:
                ((C11835) this.f13232).f39736 = ((C6606) this.f13230).getFirstVisiblePosition();
                break;
            default:
                C14063.m34012((C14063) this.f13232, (DialogInterfaceC19356) this.f13230);
                break;
        }
    }
}
