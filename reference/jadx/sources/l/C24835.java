package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T5WJ */
/* JADX INFO: loaded from: classes.dex */
public final class C24835 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22597 f80328;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24835(ActivityC22597 activityC22597, ActivityC22597 activityC22598) {
        super(activityC22597, -1);
        this.f80328 = activityC22598;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        ActivityC22597 activityC22597 = this.f80328;
        try {
            C20500 c20500M47000 = C20500.m47000(m22914(), activityC22597.f73046.f33816.m53029().mo27606());
            Iterator it = activityC22597.f73046.f33816.mo33925().iterator();
            while (it.hasNext()) {
                if (((InterfaceC2731) it.next()).mo9073().equals(c20500M47000)) {
                    m22952(R.string.MT_Protector);
                    return;
                }
            }
            m22951();
            try {
                activityC22597.f73046.f33816.m53013(c20500M47000);
                activityC22597.f73050.notifyDataSetChanged();
                activityC22597.f73046.f33806 = true;
            } catch (Exception e) {
                activityC22597.m40401(e, (DialogInterface.OnDismissListener) null);
            }
        } catch (Exception e2) {
            activityC22597.m40401(e2, (DialogInterface.OnDismissListener) null);
        }
    }
}
