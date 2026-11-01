package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.۠ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7HH */
/* JADX INFO: loaded from: classes3.dex */
public class C8107 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C16667 f28385 = new C16667();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18690 m21325(int i) {
        C18690 c18690;
        C16667 c16667 = f28385;
        synchronized (c16667) {
            Object c18691 = c16667.get(i);
            if (c18691 == null && !c16667.mo8945(i)) {
                c18691 = new C18690(i);
                c16667.mo8944(i, c18691);
            }
            c18690 = (C18690) c18691;
        }
        return c18690;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21326(int i, int i2, String str) {
        C18690 c18690;
        C16667 c16667 = f28385;
        synchronized (c16667) {
            c18690 = (C18690) c16667.get(i);
        }
        if (c18690 != null) {
            C18690.m43175(c18690, i2, str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("android.content.pm.extra.SESSION_ID", -1);
        int intExtra2 = intent.getIntExtra("android.content.pm.extra.STATUS", -999);
        if (intExtra2 == -1) {
            System.out.println("Requesting user confirmation for installation");
            m21326(intExtra, 1, intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME"));
            Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
            int i = ActivityC17984.f57515;
            Intent intent3 = new Intent(context, (Class<?>) ActivityC17984.class);
            intent3.putExtra("confirmationIntent", intent2);
            intent3.putExtra("sessionID", intExtra);
            intent3.addFlags(268435456);
            context.startActivity(intent3);
            return;
        }
        if (intExtra2 == 0) {
            System.out.println("Installation succeed");
            m21326(intExtra, 0, intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME"));
        } else if (intExtra2 == 3) {
            System.out.println("Installation canceled");
            m21326(intExtra, 2, null);
        } else {
            System.out.println("Installation failed");
            m21326(intExtra, 3, intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE"));
        }
    }
}
