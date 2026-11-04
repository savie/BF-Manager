package l;

import android.content.DialogInterface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ۬۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2690 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f8564;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Serializable f8565;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8566;

    public /* synthetic */ DialogInterfaceOnClickListenerC2690(Object obj, Serializable serializable, int i) {
        this.f8564 = i;
        this.f8566 = obj;
        this.f8565 = serializable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f8564) {
            case 0:
                C15102.m36360((C15102) this.f8566, (ArrayList) this.f8565);
                break;
            case 1:
                ApplicationC17729.f58258.edit().putString("stid", ((InterfaceC24020) ((List) this.f8566).get(((int[]) this.f8565)[0])).mo12513()).apply();
                dialogInterface.dismiss();
                break;
            default:
                C13903.m33862((C13903) this.f8566, (String) this.f8565);
                break;
        }
    }
}
