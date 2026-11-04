package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1186 extends AbstractC2432 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22597 f4333;

    public C1186(ActivityC22597 activityC22597) {
        this.f4333 = activityC22597;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f4333, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        ActivityC22597 activityC22597 = this.f4333;
        C10662 c10662 = activityC22597.f73046;
        int i = C14584.f45961;
        c10662.f33811 = C14584.m35190(activityC22597.getIntent());
        C10662 c10663 = activityC22597.f73046;
        c10663.f33797 = C23001.m51890(c10663.f33811.m49865(), EnumC11066.CREATE);
        Iterator it = activityC22597.f73046.f33797.mo15672().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((InterfaceC10869) it.next()).mo19822().iterator();
            while (it2.hasNext()) {
                ((InterfaceC15344) it2.next()).mo4333();
            }
        }
        C10662 c10664 = activityC22597.f73046;
        c10664.f33807 = new C21246(0, c10664.f33797);
        C10662 c10665 = activityC22597.f73046;
        c10665.f33813 = c10665.f33797.mo15675();
        activityC22597.f73046.f33812 = true;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f4333.m50922();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f4333.m40402((Throwable) exc, true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
