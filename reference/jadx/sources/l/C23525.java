package l;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: l.᩹ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TX */
/* JADX INFO: loaded from: classes.dex */
public final class C23525 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52728(Context context, C4133 c4133) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            C16065 c16065 = new C16065(c4133);
            telephonyManager.registerTelephonyCallback(c4133.f14021, c16065);
            telephonyManager.unregisterTelephonyCallback(c16065);
        } catch (RuntimeException unused) {
            c4133.m13255(5);
        }
    }
}
