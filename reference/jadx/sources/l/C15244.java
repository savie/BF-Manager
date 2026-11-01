package l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܶ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15244 extends AbstractC15636 {
    @Override // l.AbstractC15636
    /* JADX INFO: renamed from: ۙ */
    public final Intent mo1151(Context context, Object obj) {
        Bundle bundleExtra;
        C7168 c7168M22351 = (C7168) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intentM19098 = c7168M22351.m19098();
        if (intentM19098 != null && (bundleExtra = intentM19098.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intentM19098.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intentM19098.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                C8580 c8580 = new C8580(c7168M22351.m19097());
                c8580.m22353(null);
                c8580.m22352(c7168M22351.m19099(), c7168M22351.m19100());
                c7168M22351 = c8580.m22351();
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c7168M22351);
        if (AbstractC8894.m23060(2)) {
            intent.toString();
        }
        return intent;
    }

    @Override // l.AbstractC15636
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1152(Intent intent, int i) {
        return new C12813(intent, i);
    }
}
