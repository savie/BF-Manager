package l;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: l.ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes2.dex */
public final class C5694 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19421 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7811 f19422;

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }

    public C5694(Context context, ComponentName componentName, C21216 c21216) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f19422 = new C8517(context, componentName, c21216);
        } else if (i >= 23) {
            this.f19422 = new C19100(context, componentName, c21216);
        } else {
            this.f19422 = new C7811(context, componentName, c21216);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15704() {
        this.f19422.f25707.connect();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22316 m15705() {
        return this.f19422.m20507();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15706() {
        Messenger messenger;
        C7811 c7811 = this.f19422;
        C19806 c19806 = c7811.f25705;
        if (c19806 != null && (messenger = c7811.f25711) != null) {
            try {
                c19806.m45031(messenger);
            } catch (RemoteException unused) {
            }
        }
        c7811.f25707.disconnect();
    }
}
