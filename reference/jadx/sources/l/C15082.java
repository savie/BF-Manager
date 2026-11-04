package l;

import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15082 extends AbstractC2432 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23288 f49227;

    public C15082(ActivityC23288 activityC23288) {
        this.f49227 = activityC23288;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f49227, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        ActivityC23288 activityC23288 = this.f49227;
        C15828 c15828 = activityC23288.f75446;
        int i = C14584.f45961;
        c15828.f51481 = C14584.m35190(activityC23288.getIntent());
        activityC23288.f75446.f51484 = activityC23288.f75446.f51481.getName();
        activityC23288.f75446.f51488 = C14955.m35975(activityC23288.f75446.f51481);
        activityC23288.f75446.f51489 = new int[activityC23288.f75446.f51488.f48832.size()];
        activityC23288.f75446.f51486 = true;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ActivityC23288 activityC23288 = this.f49227;
        ListView listView = activityC23288.f75447;
        C5349 c5349 = new C5349(new C17320(activityC23288));
        activityC23288.f75448 = c5349;
        listView.setAdapter((ListAdapter) c5349);
        activityC23288.f75447.setOnScrollListener(new C19558(this));
        activityC23288.f75448.m45065(activityC23288.f75447);
        activityC23288.f75448.m36199(true);
        activityC23288.f75448.m36200();
        activityC23288.f75447.setOnItemClickListener(activityC23288);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f49227.m40402((Throwable) exc, true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
