package l;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: l.᩻ۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TX */
/* JADX INFO: loaded from: classes.dex */
public final class C23588 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52015(Context context, C13751 c13751) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            C10888 c10888 = new C10888(c13751);
            telephonyManager.registerTelephonyCallback(c13751.f45335, c10888);
            telephonyManager.unregisterTelephonyCallback(c10888);
        } catch (RuntimeException unused) {
            c13751.m33495(5);
        }
    }
}
