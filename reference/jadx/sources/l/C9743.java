package l;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: l.ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes3.dex */
public final class C9743 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f31425 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3032 f31426;

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }

    public C9743(Context context, ComponentName componentName, C17202 c17202) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f31426 = new C11981(context, componentName, c17202);
        } else if (i >= 23) {
            this.f31426 = new C20186(context, componentName, c17202);
        } else {
            this.f31426 = new C3032(context, componentName, c17202);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25370() {
        this.f31426.f9823.connect();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15600 m25371() {
        return this.f31426.m9841();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25372() {
        Messenger messenger;
        C3032 c3032 = this.f31426;
        C20932 c20932 = c3032.f9826;
        if (c20932 != null && (messenger = c3032.f9829) != null) {
            try {
                c20932.m47862(messenger);
            } catch (RemoteException unused) {
            }
        }
        c3032.f9823.disconnect();
    }
}
