package l;

import android.content.DialogInterface;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۢ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnCancelListenerC10149 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19020 f32506;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f32507;

    public DialogInterfaceOnCancelListenerC10149(InterfaceC19020 interfaceC19020, JSONObject jSONObject) {
        this.f32506 = interfaceC19020;
        this.f32507 = jSONObject;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        InterfaceC19020 interfaceC19020 = this.f32506;
        if (interfaceC19020 != null) {
            interfaceC19020.mo2048(this.f32507);
        }
    }
}
