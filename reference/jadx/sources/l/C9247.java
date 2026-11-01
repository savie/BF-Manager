package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9247 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13125 f31453;

    public C9247(ActivityC13125 activityC13125) {
        this.f31453 = activityC13125;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f31453, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        ActivityC13125 activityC13125 = this.f31453;
        C1129 c1129 = activityC13125.f43713;
        int i = C5553.f19060;
        c1129.f5087 = C5553.m15309(activityC13125.getIntent());
        C1129 c11210 = activityC13125.f43713;
        c11210.f5091 = C22785.m50437(c11210.f5087.m46727(), EnumC6556.CREATE);
        Iterator it = activityC13125.f43713.f5091.mo17615().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((InterfaceC17721) it.next()).mo19112().iterator();
            while (it2.hasNext()) {
                ((InterfaceC19133) it2.next()).mo1531();
            }
        }
        C1129 c11211 = activityC13125.f43713;
        c11211.f5097 = new C6037(0, c11211.f5091);
        C1129 c11212 = activityC13125.f43713;
        c11212.f5092 = c11212.f5091.mo5139();
        activityC13125.f43713.f5086 = true;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f31453.m32479();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f31453.m31003((Throwable) exc, true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
