package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۢۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC10029 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32153;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f32154;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f32155;

    public /* synthetic */ DialogInterfaceOnClickListenerC10029(int i, Object obj, Object obj2) {
        this.f32153 = i;
        this.f32155 = obj;
        this.f32154 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f32153) {
            case 0:
                ViewOnClickListenerC11499.m28929((AbstractC22044) this.f32155, (ViewOnClickListenerC11499) this.f32154);
                break;
            case 1:
                ActivityC5440.m16247((ActivityC5440) this.f32155, (boolean[]) this.f32154);
                break;
            default:
                Main.m93(((C17258) this.f32155).f56221, (String) this.f32154);
                break;
        }
    }
}
