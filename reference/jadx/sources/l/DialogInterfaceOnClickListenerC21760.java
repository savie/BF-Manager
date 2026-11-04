package l;

import android.content.DialogInterface;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC21760 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69403;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69404;

    public /* synthetic */ DialogInterfaceOnClickListenerC21760(int i, Object obj) {
        this.f69403 = i;
        this.f69404 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f69403;
        Object obj = this.f69404;
        switch (i2) {
            case 0:
                DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300 = (DialogInterfaceOnClickListenerC14300) obj;
                C8224.m22123(dialogInterfaceOnClickListenerC14300.f45154.m23233(), dialogInterfaceOnClickListenerC14300.f45155, dialogInterfaceOnClickListenerC14300.f45158.m28718());
                break;
            case 1:
                AbstractActivityC10144 abstractActivityC10144 = (AbstractActivityC10144) obj;
                int i3 = AbstractActivityC10144.f32485;
                Iterator it = abstractActivityC10144.m26256().iterator();
                while (it.hasNext()) {
                    ((C11636) it.next()).m29225((String) null);
                }
                abstractActivityC10144.m26244();
                abstractActivityC10144.m26255();
                break;
            case 2:
                int i4 = AbstractActivityC22047.f71100;
                ((AbstractActivityC22047) obj).finish();
                break;
            default:
                ActivityC11563.m29085((ActivityC11563) obj);
                break;
        }
    }
}
