package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.widget.CheckBox;

/* JADX INFO: renamed from: l.ۛۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC5864 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20018;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20019;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20020;

    public /* synthetic */ DialogInterfaceOnClickListenerC5864(int i, Object obj, Object obj2) {
        this.f20019 = i;
        this.f20020 = obj;
        this.f20018 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f20019) {
            case 0:
                ActivityC5677.m15590((ActivityC5677) this.f20020, (CheckBox) this.f20018);
                break;
            case 1:
                ActivityC19749.m44932((ActivityC19749) this.f20020, (boolean[]) this.f20018);
                break;
            default:
                String str = (String) this.f20020;
                InterfaceC17421 interfaceC17421 = (InterfaceC17421) this.f20018;
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                intent.setFlags(195);
                String strM34015 = C14063.m34015();
                intent.setPackage(strM34015);
                intent.putExtra("android.provider.extra.INITIAL_URI", C22529.m50043(str + ":", true));
                try {
                    interfaceC17421.mo120(intent);
                    break;
                } catch (Exception e) {
                    if (strM34015 == null) {
                        interfaceC17421.mo31001(e);
                        return;
                    } else {
                        interfaceC17421.mo30999(strM34015);
                    }
                }
                break;
        }
    }
}
