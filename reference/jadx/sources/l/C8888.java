package l;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public final class C8888 extends AbstractC12639 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5577 f29037;

    public C8888(ActivityC5577 activityC5577) {
        this.f29037 = activityC5577;
    }

    @Override // l.AbstractC12639
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23777(int i, AbstractC18606 abstractC18606, Object obj) {
        Bundle bundle;
        ActivityC5577 activityC5577 = this.f29037;
        C21590 c21590Mo3030 = abstractC18606.mo3030(activityC5577, obj);
        if (c21590Mo3030 != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC9633(this, i, c21590Mo3030));
            return;
        }
        Intent intentMo3028 = abstractC18606.mo3028(activityC5577, obj);
        if (intentMo3028.getExtras() != null && intentMo3028.getExtras().getClassLoader() == null) {
            intentMo3028.setExtrasClassLoader(activityC5577.getClassLoader());
        }
        if (intentMo3028.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentMo3028.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo3028.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo3028.getAction())) {
            String[] stringArrayExtra = intentMo3028.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            C14832.m35751(activityC5577, stringArrayExtra, i);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo3028.getAction())) {
            C14876 c14876 = (C14876) intentMo3028.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                activityC5577.startIntentSenderForResult(c14876.m35817(), i, c14876.m35814(), c14876.m35816(), c14876.m35815(), 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new RunnableC2922(this, i, e));
                return;
            }
        }
        activityC5577.startActivityForResult(intentMo3028, i, bundle);
    }
}
