package l;

import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes.dex */
public final class C23241 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7718 f75406;

    public C23241(ActivityC7718 activityC7718) {
        this.f75406 = activityC7718;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f75406, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        ActivityC7718 activityC7718 = this.f75406;
        C10541 c10541 = activityC7718.f25533;
        int i = C5553.f19060;
        c10541.f36088 = C5553.m15309(activityC7718.getIntent());
        activityC7718.f25533.f36082 = activityC7718.f25533.f36088.getName();
        activityC7718.f25533.f36085 = C20945.m47096(activityC7718.f25533.f36088);
        activityC7718.f25533.f36084 = new int[activityC7718.f25533.f36085.f68265.size()];
        activityC7718.f25533.f36080 = true;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ActivityC7718 activityC7718 = this.f75406;
        ListView listView = activityC7718.f25532;
        C5938 c5938 = new C5938(new C9130(activityC7718));
        activityC7718.f25531 = c5938;
        listView.setAdapter((ListAdapter) c5938);
        activityC7718.f25532.setOnScrollListener(new C7012(this));
        activityC7718.f25531.m38885(activityC7718.f25532);
        activityC7718.f25531.m30532(true);
        activityC7718.f25531.m30530();
        activityC7718.f25532.setOnItemClickListener(activityC7718);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f75406.m31003((Throwable) exc, true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
