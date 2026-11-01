package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۢۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9416 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3541 f31913;

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
    }

    public C9416(ActivityC3541 activityC3541) {
        this.f31913 = activityC3541;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f31913.f13046.m16335(true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C4987 {
        C4723.m13090();
        boolean zM36331 = C15157.m36331();
        ActivityC3541 activityC3541 = this.f31913;
        if (zM36331) {
            List list = Collections.EMPTY_LIST;
            activityC3541.f13045 = list;
            activityC3541.f13040 = list;
        } else {
            List listM15004 = C5429.m15004();
            ArrayList arrayListM15000 = C5429.m15000();
            activityC3541.f13045 = C0561.unmodifiableList(listM15004);
            activityC3541.f13040 = C0561.unmodifiableList(arrayListM15000);
            new RunnableC8482(activityC3541);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if ((exc instanceof C4987) || (exc instanceof C8142)) {
            C15829.m37613((CharSequence) exc.getMessage());
        } else {
            C15829.m37613((CharSequence) exc.toString());
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        ActivityC3541 activityC3541 = this.f31913;
        activityC3541.f13047.setVisibility(0);
        if (C15157.m36349()) {
            activityC3541.f13047.setText(R.string.MT_Protector);
            activityC3541.f13047.setOnClickListener(new View.OnClickListener() { // from class: l.֫ۜۜ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivityC3541.m10452(this.f6607.f31913);
                }
            });
            activityC3541.m31016(R.id.MT_Protector).setVisibility(8);
        } else if (C15157.m36331()) {
            activityC3541.f13047.setText(R.string.MT_Protector);
            activityC3541.f13047.setOnClickListener(null);
            activityC3541.m31016(R.id.MT_Protector).setVisibility(8);
        } else {
            activityC3541.f13047.setText(R.string.MT_Protector);
            activityC3541.f13047.setOnClickListener(null);
            activityC3541.m31016(R.id.MT_Protector).setVisibility(0);
        }
        activityC3541.f13039.notifyDataSetChanged();
        activityC3541.f13046.m16335(false);
    }
}
