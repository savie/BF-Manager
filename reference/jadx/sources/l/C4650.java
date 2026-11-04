package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۙۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7HH */
/* JADX INFO: loaded from: classes2.dex */
public class C4650 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C22311 f16450 = new C22311();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14189 m14503(int i) {
        C14189 c14189;
        C22311 c22311 = f16450;
        synchronized (c22311) {
            Object c141810 = c22311.get(i);
            if (c141810 == null && !c22311.mo13467(i)) {
                c141810 = new C14189(i);
                c22311.mo13466(i, c141810);
            }
            c14189 = (C14189) c141810;
        }
        return c14189;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14505(int i, int i2, String str) {
        C14189 c14189;
        C22311 c22311 = f16450;
        synchronized (c22311) {
            c14189 = (C14189) c22311.get(i);
        }
        if (c14189 != null) {
            C14189.m34480(c14189, i2, str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("android.content.pm.extra.SESSION_ID", -1);
        int intExtra2 = intent.getIntExtra("android.content.pm.extra.STATUS", -999);
        if (intExtra2 == -1) {
            System.out.println("Requesting user confirmation for installation");
            m14505(intExtra, 1, intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME"));
            Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
            int i = ActivityC7478.f24749;
            Intent intent3 = new Intent(context, (Class<?>) ActivityC7478.class);
            intent3.putExtra("confirmationIntent", intent2);
            intent3.putExtra("sessionID", intExtra);
            intent3.addFlags(268435456);
            context.startActivity(intent3);
            return;
        }
        if (intExtra2 == 0) {
            System.out.println("Installation succeed");
            m14505(intExtra, 0, intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME"));
        } else if (intExtra2 == 3) {
            System.out.println("Installation canceled");
            m14505(intExtra, 2, null);
        } else {
            System.out.println("Installation failed");
            m14505(intExtra, 3, intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE"));
        }
    }
}
