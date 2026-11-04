package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۨܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C12515 extends AbstractC2432 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3041 f40180;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
    }

    public C12515(ActivityC3041 activityC3041) {
        this.f40180 = activityC3041;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f40180.f9855.m10021(true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C4866 {
        C20195.m46449();
        boolean zM18963 = C6790.m18963();
        ActivityC3041 activityC3041 = this.f40180;
        if (zM18963) {
            List list = Collections.EMPTY_LIST;
            activityC3041.f9853 = list;
            activityC3041.f9848 = list;
        } else {
            List listM12321 = C3787.m12321();
            ArrayList arrayListM12317 = C3787.m12317();
            activityC3041.f9853 = C4681.unmodifiableList(listM12321);
            activityC3041.f9848 = C4681.unmodifiableList(arrayListM12317);
            new RunnableC14006(activityC3041);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if ((exc instanceof C4866) || (exc instanceof C3090)) {
            C22673.m51154((CharSequence) exc.getMessage());
        } else {
            C22673.m51154((CharSequence) exc.toString());
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        ActivityC3041 activityC3041 = this.f40180;
        activityC3041.f9852.setVisibility(0);
        if (C6790.m18953()) {
            activityC3041.f9852.setText(R.string.MT_Protector);
            activityC3041.f9852.setOnClickListener(new View.OnClickListener() { // from class: l.᩵ܿۧ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivityC3041.m9886(this.f66401.f40180);
                }
            });
            activityC3041.m40418(R.id.MT_Protector).setVisibility(8);
        } else if (C6790.m18963()) {
            activityC3041.f9852.setText(R.string.MT_Protector);
            activityC3041.f9852.setOnClickListener(null);
            activityC3041.m40418(R.id.MT_Protector).setVisibility(8);
        } else {
            activityC3041.f9852.setText(R.string.MT_Protector);
            activityC3041.f9852.setOnClickListener(null);
            activityC3041.m40418(R.id.MT_Protector).setVisibility(0);
        }
        activityC3041.f9857.notifyDataSetChanged();
        activityC3041.f9855.m10021(false);
    }
}
