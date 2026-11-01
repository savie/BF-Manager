package l;

import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;
import java.util.Set;

/* JADX INFO: renamed from: l.֡᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0640 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f2752;

    public C0640(ActivityC3588 activityC3588) {
        this.f2752 = activityC3588;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f2752, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        ActivityC3588 activityC3588 = this.f2752;
        C2177 c2177 = activityC3588.f13204;
        int i = C5553.f19060;
        c2177.f7905 = C5553.m15309(activityC3588.getIntent());
        activityC3588.f13204.f7900 = new C12063(activityC3588.f13204.f7905.mo33970());
        for (C13929 c13929 : activityC3588.f13204.f7900.f40371.m28059()) {
            activityC3588.f13204.f7902.put(C20630.m46498(1, 1, c13929.m33765().m6314()), c13929);
        }
        C2177 c2178 = activityC3588.f13204;
        Set setKeySet = activityC3588.f13204.f7902.keySet();
        C21934 c21934 = new C21934();
        c21934.f71139 = new C0766(activityC3588, "", "", null);
        c21934.m48752(setKeySet);
        c2178.f7906 = c21934;
        ActivityC3588.m10626(activityC3588);
        activityC3588.f13204.f7901 = true;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ActivityC3588 activityC3588 = this.f2752;
        ListView listView = activityC3588.f13206;
        C5938 c5938 = new C5938(new C3462(activityC3588));
        activityC3588.f13203 = c5938;
        listView.setAdapter((ListAdapter) c5938);
        activityC3588.f13206.setOnScrollListener(new C20397(this));
        activityC3588.f13203.m38885(activityC3588.f13206);
        activityC3588.f13203.m30532(true);
        activityC3588.f13203.m30530();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f2752.m31003((Throwable) exc, true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
