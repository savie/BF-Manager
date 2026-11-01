package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2540 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13125 f10056;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2540(ActivityC13125 activityC13125, AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483, -1);
        this.f10056 = activityC13125;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        ActivityC13125 activityC13125 = this.f10056;
        if (strM40352.equals(activityC13125.f43713.f5090.mo31757())) {
            m40364();
            return;
        }
        try {
            C15916 c15916M37840 = C15916.m37840(strM40352, activityC13125.f43713.f5083.m1543().mo19107());
            if (c15916M37840.equals(activityC13125.f43713.f5090.mo31747())) {
                return;
            }
            for (InterfaceC12783 interfaceC12783 : activityC13125.f43713.f5083.mo25271()) {
                if (interfaceC12783 != activityC13125.f43713.f5090 && c15916M37840.equals(interfaceC12783.mo31747())) {
                    m40365(R.string.MT_Protector);
                    return;
                }
            }
            m40364();
            activityC13125.f43713.f5090.m47903(c15916M37840);
            activityC13125.f43711.notifyDataSetChanged();
            activityC13125.f43713.f5074 = true;
        } catch (Exception unused) {
            m40365(R.string.MT_Protector);
        }
    }
}
