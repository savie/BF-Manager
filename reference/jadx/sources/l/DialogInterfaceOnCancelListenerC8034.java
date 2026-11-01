package l;

import android.content.DialogInterface;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۠۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnCancelListenerC8034 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18284 f28137;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f28138;

    public DialogInterfaceOnCancelListenerC8034(InterfaceC18284 interfaceC18284, JSONObject jSONObject) {
        this.f28137 = interfaceC18284;
        this.f28138 = jSONObject;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        InterfaceC18284 interfaceC18284 = this.f28137;
        if (interfaceC18284 != null) {
            interfaceC18284.mo16215(this.f28138);
        }
    }
}
