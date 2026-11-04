package l;

import android.view.View;
import android.widget.CheckBox;

/* JADX INFO: renamed from: l.ۜۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X81I */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC7061 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23270;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23271;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23272;

    public /* synthetic */ ViewOnClickListenerC7061(int i, Object obj, Object obj2) {
        this.f23270 = i;
        this.f23272 = obj;
        this.f23271 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23270) {
            case 0:
                AbstractC21716.m49287((AbstractC21716) this.f23272, (DialogInterfaceC8327) this.f23271);
                break;
            default:
                ViewOnClickListenerC21202.m48357((ViewOnClickListenerC21202) this.f23272, (CheckBox) this.f23271);
                break;
        }
    }
}
