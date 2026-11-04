package l;

import android.app.Dialog;
import android.view.View;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19100 extends AbstractViewOnClickListenerC1201 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f61825;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19020 f61826;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19100(Dialog dialog, InterfaceC19020 interfaceC19020, JSONObject jSONObject) {
        super(dialog);
        this.f61826 = interfaceC19020;
        this.f61825 = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Dialog dialog = this.f4370;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        InterfaceC19020 interfaceC19020 = this.f61826;
        if (interfaceC19020 != null) {
            interfaceC19020.mo2048(this.f61825);
        }
    }
}
