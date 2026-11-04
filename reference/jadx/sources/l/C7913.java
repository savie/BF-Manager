package l;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۟۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C7913 extends AbstractViewOnClickListenerC1201 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9403 f26285;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f26286;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19020 f26287;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7913(C9403 c9403, Dialog dialog, InterfaceC19020 interfaceC19020, JSONObject jSONObject) {
        super(dialog);
        this.f26285 = c9403;
        this.f26287 = interfaceC19020;
        this.f26286 = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activity;
        C8658 c8658 = this.f26285.f30523;
        Bundle bundleM17774 = c8658.m17774();
        if (c8658.f28265 != null && (activity = (Activity) c8658.f28265.get()) != null) {
            C14127.m34339(c8658.f21019, activity, bundleM17774);
        }
        Dialog dialog = this.f4370;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        InterfaceC19020 interfaceC19020 = this.f26287;
        if (interfaceC19020 != null) {
            interfaceC19020.mo2048(this.f26286);
        }
    }
}
