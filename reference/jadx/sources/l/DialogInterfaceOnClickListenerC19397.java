package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC19397 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62535;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62536;

    public /* synthetic */ DialogInterfaceOnClickListenerC19397(int i, Object obj) {
        this.f62535 = i;
        this.f62536 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f62535;
        Object obj = this.f62536;
        switch (i2) {
            case 0:
                C17485 c17485 = new C17485((Main) obj, R.string.MT_Protector);
                c17485.m40704();
                C4716.f16636.execute(new RunnableC0860(3, c17485));
                break;
            case 1:
                int i3 = ActivityC10055.f34353;
                ((ActivityC10055) obj).finish();
                break;
            default:
                int i4 = ActivityC19749.f63457;
                ((int[]) obj)[0] = i;
                break;
        }
    }
}
