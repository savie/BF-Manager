package l;

import android.app.Dialog;
import android.view.View;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18617 extends AbstractViewOnClickListenerC19323 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f60375;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18284 f60376;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18617(Dialog dialog, InterfaceC18284 interfaceC18284, JSONObject jSONObject) {
        super(dialog);
        this.f60376 = interfaceC18284;
        this.f60375 = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Dialog dialog = this.f62328;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        InterfaceC18284 interfaceC18284 = this.f60376;
        if (interfaceC18284 != null) {
            interfaceC18284.mo16215(this.f60375);
        }
    }
}
