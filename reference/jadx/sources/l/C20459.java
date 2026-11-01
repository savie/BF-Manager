package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.idtracking.h;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶᩹ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes4.dex */
public final class C20459 extends BroadcastReceiver {
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C10582 c10582;
        if (context == null || intent == null) {
            return;
        }
        boolean zContains = false;
        int intExtra = intent.getIntExtra("openIdNotifyFlag", 0);
        "shouldUpdateId, notifyFlag : ".concat(String.valueOf(intExtra));
        if (intExtra == 1) {
            if (TextUtils.equals(intent.getStringExtra("openIdPackage"), context.getPackageName())) {
                zContains = true;
            }
        } else if (intExtra == 2) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("openIdPackageList");
            if (stringArrayListExtra != null) {
                zContains = stringArrayListExtra.contains(context.getPackageName());
            }
        } else if (intExtra == 0) {
            zContains = true;
        }
        if (zContains) {
            String stringExtra = intent.getStringExtra("openIdType");
            C0702 c0702M3090 = C0702.m3090();
            if (h.d.equals(stringExtra)) {
                c10582 = c0702M3090.f2966;
            } else if ("vaid".equals(stringExtra)) {
                c10582 = c0702M3090.f2962;
            } else if ("aaid".equals(stringExtra)) {
                c10582 = c0702M3090.f2965;
            } else {
                c10582 = "udid".equals(stringExtra) ? c0702M3090.f2963 : null;
            }
            if (c10582 == null) {
                return;
            }
            c10582.f36199 = 0L;
        }
    }
}
