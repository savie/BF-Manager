package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11714 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13125 f39364;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11714(ActivityC13125 activityC13125, AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483, -1);
        this.f39364 = activityC13125;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        ActivityC13125 activityC13125 = this.f39364;
        try {
            C15916 c15916M37840 = C15916.m37840(m40352(), activityC13125.f43713.f5083.m1543().mo19107());
            Iterator it = activityC13125.f43713.f5083.mo25271().iterator();
            while (it.hasNext()) {
                if (((InterfaceC12783) it.next()).mo31747().equals(c15916M37840)) {
                    m40365(R.string.MT_Protector);
                    return;
                }
            }
            m40364();
            try {
                C1129 c1129 = activityC13125.f43713;
                c1129.f5083.m1529(c1129.f5090, c15916M37840);
                activityC13125.f43711.notifyDataSetChanged();
                activityC13125.f43713.f5074 = true;
            } catch (Exception e) {
                activityC13125.m31002(e, (DialogInterface.OnDismissListener) null);
            }
        } catch (Exception e2) {
            activityC13125.m31002(e2, (DialogInterface.OnDismissListener) null);
        }
    }
}
