package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10134 extends AbstractC6323 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22597 f32431;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10134(ActivityC22597 activityC22597) {
        super(true);
        this.f32431 = activityC22597;
    }

    @Override // l.AbstractC6323
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2768() {
        EnumC3951 enumC3951;
        ActivityC22597 activityC22597 = this.f32431;
        EnumC3951 enumC3951M27171 = activityC22597.f73046.m27171();
        C10662 c10662 = activityC22597.f73046;
        if (c10662.f33817 && (enumC3951M27171 == (enumC3951 = EnumC3951.STRING_POOL) || enumC3951M27171 == EnumC3951.CONFIG)) {
            c10662.f33817 = false;
            if (enumC3951M27171 == enumC3951) {
                activityC22597.m40418(R.string.MT_Protector);
            } else {
                activityC22597.setTitle(c10662.f33818.mo9077());
            }
            activityC22597.f73050.notifyDataSetChanged();
            return;
        }
        activityC22597.m50921();
    }
}
