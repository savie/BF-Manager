package l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ۧۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes4.dex */
public final class C11394 extends AbstractC18606 {
    @Override // l.AbstractC18606
    /* JADX INFO: renamed from: ۙ */
    public final Intent mo3028(Context context, Object obj) {
        Bundle bundleExtra;
        C14876 c14876M54890 = (C14876) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intentM35814 = c14876M54890.m35814();
        if (intentM35814 != null && (bundleExtra = intentM35814.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intentM35814.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intentM35814.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                C24574 c24574 = new C24574(c14876M54890.m35817());
                c24574.m54892(null);
                c24574.m54891(c14876M54890.m35815(), c14876M54890.m35816());
                c14876M54890 = c24574.m54890();
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c14876M54890);
        if (AbstractC3191.m10427(2)) {
            intent.toString();
        }
        return intent;
    }

    @Override // l.AbstractC18606
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3029(Intent intent, int i) {
        return new C11893(intent, i);
    }
}
