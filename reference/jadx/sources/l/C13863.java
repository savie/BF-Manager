package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13863 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22597 f43985;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13863(ActivityC22597 activityC22597, AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204, -1);
        this.f43985 = activityC22597;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        ActivityC22597 activityC22597 = this.f43985;
        if (strM22914.equals(activityC22597.f73046.f33818.mo9074())) {
            m22951();
            return;
        }
        try {
            C20500 c20500M47000 = C20500.m47000(strM22914, activityC22597.f73046.f33816.m53029().mo27606());
            if (c20500M47000.equals(activityC22597.f73046.f33818.mo9073())) {
                return;
            }
            for (InterfaceC2731 interfaceC2731 : activityC22597.f73046.f33816.mo33925()) {
                if (interfaceC2731 != activityC22597.f73046.f33818 && c20500M47000.equals(interfaceC2731.mo9073())) {
                    m22952(R.string.MT_Protector);
                    return;
                }
            }
            m22951();
            activityC22597.f73046.f33818.m46051(c20500M47000);
            activityC22597.f73050.notifyDataSetChanged();
            activityC22597.f73046.f33806 = true;
        } catch (Exception unused) {
            m22952(R.string.MT_Protector);
        }
    }
}
