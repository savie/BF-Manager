package l;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۜᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6943 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23358;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23359;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f23360;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23361;

    public /* synthetic */ ViewOnClickListenerC6943(Object obj, Object obj2, DialogInterfaceC19356 dialogInterfaceC19356, int i) {
        this.f23359 = i;
        this.f23361 = obj;
        this.f23358 = obj2;
        this.f23360 = dialogInterfaceC19356;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23359) {
            case 0:
                C0763 c0763 = (C0763) this.f23361;
                TextView textView = (TextView) this.f23358;
                Object tag = view.getTag();
                if (tag != null) {
                    c0763.f3078 = tag.toString();
                    textView.setVisibility(8);
                    this.f23360.m44374().callOnClick();
                }
                break;
            default:
                C8768.m22821((C21467) this.f23361, (C8768) this.f23358, this.f23360);
                break;
        }
    }
}
