package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.idtracking.h;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜܺ᩺, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C7263 extends BroadcastReceiver {
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C1297 c1297;
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
            C13974 c13974M34055 = C13974.m34055();
            if (h.d.equals(stringExtra)) {
                c1297 = c13974M34055.f44315;
            } else if ("vaid".equals(stringExtra)) {
                c1297 = c13974M34055.f44316;
            } else if ("aaid".equals(stringExtra)) {
                c1297 = c13974M34055.f44312;
            } else {
                c1297 = "udid".equals(stringExtra) ? c13974M34055.f44311 : null;
            }
            if (c1297 == null) {
                return;
            }
            c1297.f4633 = 0L;
        }
    }
}
