package l;

import android.content.DialogInterface;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC13771 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45390;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f45391;

    public /* synthetic */ DialogInterfaceOnClickListenerC13771(int i, Object obj) {
        this.f45390 = i;
        this.f45391 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f45390;
        Object obj = this.f45391;
        switch (i2) {
            case 0:
                ActivityC5677.m15573((ActivityC5677) obj);
                break;
            case 1:
                AbstractActivityC5788 abstractActivityC5788 = (AbstractActivityC5788) obj;
                int i3 = AbstractActivityC5788.f19654;
                Iterator it = abstractActivityC5788.m15953().iterator();
                while (it.hasNext()) {
                    ((C22722) it.next()).m50367((String) null);
                }
                abstractActivityC5788.m15952();
                abstractActivityC5788.m15957();
                break;
            case 2:
                C19001.m43713(Collections.singleton(((C18295) obj).f58374));
                C21094.m47530();
                break;
            default:
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) obj;
                abstractActivityC12483.mo30999(abstractActivityC12483.getPackageName());
                break;
        }
    }
}
