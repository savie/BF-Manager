package l;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ܳ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC14204 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f46585;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46586;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f46587;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f46588;

    public /* synthetic */ ViewOnClickListenerC14204(Object obj, Object obj2, Object obj3, int i) {
        this.f46586 = i;
        this.f46588 = obj;
        this.f46585 = obj2;
        this.f46587 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f46586) {
            case 0:
                C2913.m8716((C2913) this.f46588, (AbstractActivityC12483) this.f46585, (PopupWindow) this.f46587, view);
                break;
            default:
                C1315.m4696((C11900) this.f46588, (C1315) this.f46585, (DialogInterfaceC19356) this.f46587);
                break;
        }
    }
}
