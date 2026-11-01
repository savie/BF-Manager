package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1484 extends AbstractC19432 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13125 f6017;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1484(ActivityC13125 activityC13125) {
        super(true);
        this.f6017 = activityC13125;
    }

    @Override // l.AbstractC19432
    /* JADX INFO: renamed from: ܰ */
    public final void mo4707() {
        EnumC16653 enumC16653;
        ActivityC13125 activityC13125 = this.f6017;
        EnumC16653 enumC16653M4162 = activityC13125.f43713.m4162();
        C1129 c1129 = activityC13125.f43713;
        if (c1129.f5073 && (enumC16653M4162 == (enumC16653 = EnumC16653.STRING_POOL) || enumC16653M4162 == EnumC16653.CONFIG)) {
            c1129.f5073 = false;
            if (enumC16653M4162 == enumC16653) {
                activityC13125.m31016(R.string.MT_Protector);
            } else {
                activityC13125.setTitle(c1129.f5090.mo31755());
            }
            activityC13125.f43711.notifyDataSetChanged();
            return;
        }
        activityC13125.m32478();
    }
}
