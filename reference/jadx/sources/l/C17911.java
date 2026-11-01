package l;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C17911 extends AbstractViewOnClickListenerC19323 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f56893;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8740 f56894;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18284 f56895;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17911(C8740 c8740, Dialog dialog, InterfaceC18284 interfaceC18284, JSONObject jSONObject) {
        super(dialog);
        this.f56894 = c8740;
        this.f56895 = interfaceC18284;
        this.f56893 = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activity;
        C7328 c7328 = this.f56894.f30035;
        Bundle bundleM4821 = c7328.m4821();
        if (c7328.f24364 != null && (activity = (Activity) c7328.f24364.get()) != null) {
            C16044.m38039(c7328.f5744, activity, bundleM4821);
        }
        Dialog dialog = this.f62328;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        InterfaceC18284 interfaceC18284 = this.f56895;
        if (interfaceC18284 != null) {
            interfaceC18284.mo16215(this.f56893);
        }
    }
}
