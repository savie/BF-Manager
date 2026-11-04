package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12514 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f40177;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC24449 f40178;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18099 f40179;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12514(ActivityC24449 activityC24449, AbstractActivityC17204 abstractActivityC17204, String str, C18099 c18099) {
        super(abstractActivityC17204, -1);
        this.f40178 = activityC24449;
        this.f40177 = str;
        this.f40179 = c18099;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (strM22914.length() == 0 || strM22914.equalsIgnoreCase(this.f40177)) {
            m22951();
            return;
        }
        AbstractC22044 abstractC22044M42219 = this.f40179.m42219();
        AbstractC22044 abstractC22044M49868 = abstractC22044M42219.m49868(strM22914.concat(".mtd"));
        if (abstractC22044M49868.mo2934()) {
            m22952(R.string.MT_Protector);
            return;
        }
        abstractC22044M42219.mo4301(abstractC22044M49868);
        ActivityC24449.m54696(this.f40178);
        m22951();
    }
}
