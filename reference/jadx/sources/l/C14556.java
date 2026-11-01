package l;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public final class C14556 extends AbstractC7874 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1086 f47659;

    public C14556(ActivityC1086 activityC1086) {
        this.f47659 = activityC1086;
    }

    @Override // l.AbstractC7874
    /* JADX INFO: renamed from: ۙ */
    public final void mo20783(int i, AbstractC15636 abstractC15636, Object obj) {
        Bundle bundle;
        ActivityC1086 activityC1086 = this.f47659;
        C20574 c20574Mo37314 = abstractC15636.mo37314(activityC1086, obj);
        if (c20574Mo37314 != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC11028(this, i, c20574Mo37314));
            return;
        }
        Intent intentMo1151 = abstractC15636.mo1151(activityC1086, obj);
        if (intentMo1151.getExtras() != null && intentMo1151.getExtras().getClassLoader() == null) {
            intentMo1151.setExtrasClassLoader(activityC1086.getClassLoader());
        }
        if (intentMo1151.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentMo1151.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo1151.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo1151.getAction())) {
            String[] stringArrayExtra = intentMo1151.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            C18975.m43674(activityC1086, stringArrayExtra, i);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo1151.getAction())) {
            C7168 c7168 = (C7168) intentMo1151.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                activityC1086.startIntentSenderForResult(c7168.m19097(), i, c7168.m19098(), c7168.m19100(), c7168.m19099(), 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new RunnableC23728(this, i, e));
                return;
            }
        }
        activityC1086.startActivityForResult(intentMo1151, i, bundle);
    }
}
