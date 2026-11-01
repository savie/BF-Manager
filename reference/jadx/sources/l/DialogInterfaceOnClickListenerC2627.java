package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2627 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10254;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10255;

    public /* synthetic */ DialogInterfaceOnClickListenerC2627(int i, Object obj) {
        this.f10254 = i;
        this.f10255 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f10254;
        Object obj = this.f10255;
        switch (i2) {
            case 0:
                ((Runnable) obj).run();
                break;
            case 1:
                C20409 c20409 = (C20409) obj;
                c20409.m46141((ActivityC11632) c20409.requireActivity(), (DialogInterfaceC7957) dialogInterface);
                break;
            case 2:
                C22418.m49721((C22418) obj);
                break;
            case 3:
                C3947.m11420((C3947) obj);
                break;
            default:
                ViewOnClickListenerC23604 viewOnClickListenerC23604 = (ViewOnClickListenerC23604) obj;
                int i3 = ViewOnClickListenerC23604.f76463;
                C17485 c17485 = new C17485(viewOnClickListenerC23604, R.string.MT_Protector);
                c17485.m40704();
                new Thread(new RunnableC9534(0, viewOnClickListenerC23604, new C13994(c17485, viewOnClickListenerC23604))).start();
                break;
        }
    }
}
