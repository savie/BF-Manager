package l;

import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6637 extends AbstractC2432 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f22163;

    public C6637(ActivityC22957 activityC22957) {
        this.f22163 = activityC22957;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f22163, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        ActivityC22957 activityC22957 = this.f22163;
        C7382 c7382 = activityC22957.f74569;
        int i = C14584.f45961;
        c7382.f24299 = C14584.m35190(activityC22957.getIntent());
        activityC22957.f74569.f24317 = new C24738(activityC22957.f74569.f24299.mo4290());
        for (C4072 c4072 : activityC22957.f74569.f24317.f80105.m38078()) {
            activityC22957.f74569.f24316.put(C1402.m5124(1, 1, c4072.m13151().m46860()), c4072);
        }
        C7382 c7383 = activityC22957.f74569;
        Set setKeySet = activityC22957.f74569.f24316.keySet();
        C5057 c5057 = new C5057();
        c5057.f17636 = new C22211(activityC22957, "", "", null);
        c5057.m15303(setKeySet);
        c7383.f24310 = c5057;
        ActivityC22957.m51768(activityC22957);
        activityC22957.f74569.f24302 = true;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ActivityC22957 activityC22957 = this.f22163;
        ListView listView = activityC22957.f74570;
        C5349 c5349 = new C5349(new C1416(activityC22957));
        activityC22957.f74574 = c5349;
        listView.setAdapter((ListAdapter) c5349);
        activityC22957.f74570.setOnScrollListener(new C12602(this));
        activityC22957.f74574.m45065(activityC22957.f74570);
        activityC22957.f74574.m36199(true);
        activityC22957.f74574.m36200();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f22163.m40402((Throwable) exc, true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
