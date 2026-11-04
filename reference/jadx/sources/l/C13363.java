package l;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.TypedValue;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes4.dex */
public final class C13363 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int f42604;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f42605 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9876 f42606;

    public C13363(ServiceC4415 serviceC4415) {
        ComponentName componentName;
        if (TextUtils.isEmpty("MusicService")) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        int i = C20650.f66221;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(serviceC4415.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = serviceC4415.getPackageManager().queryBroadcastReceivers(intent, 0);
        PendingIntent broadcast = null;
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            listQueryBroadcastReceivers.size();
            componentName = null;
        }
        if (componentName != null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            broadcast = PendingIntent.getBroadcast(serviceC4415, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f42606 = new C8385(serviceC4415);
        } else if (i2 >= 28) {
            this.f42606 = new C9130(serviceC4415);
        } else if (i2 >= 22) {
            this.f42606 = new C0928(serviceC4415);
        } else {
            this.f42606 = new C9876(serviceC4415);
        }
        m32947(new C14351(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.f42606.f31777.setMediaButtonReceiver(broadcast);
        new C3911(serviceC4415, this.f42606.f31775);
        if (f42604 == 0) {
            f42604 = (int) (TypedValue.applyDimension(1, 320.0f, serviceC4415.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32947(AbstractC0182 abstractC0182, Handler handler) {
        C9876 c9876 = this.f42606;
        if (handler == null) {
            handler = new Handler();
        }
        synchronized (c9876.f31783) {
            c9876.f31776 = abstractC0182;
            c9876.f31777.setCallback(abstractC0182 == null ? null : abstractC0182.f1264, handler);
            if (abstractC0182 != null) {
                abstractC0182.m1484(c9876, handler);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32950(boolean z) {
        this.f42606.f31777.setActive(z);
        Iterator it = this.f42605.iterator();
        while (it.hasNext()) {
            ((InterfaceC6894) it.next()).m19156();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15600 m32946() {
        return this.f42606.f31775;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32948(C3668 c3668) {
        C9876 c9876 = this.f42606;
        c9876.f31780 = c3668;
        synchronized (c9876.f31783) {
            int iBeginBroadcast = c9876.f31782.beginBroadcast();
            while (true) {
                iBeginBroadcast--;
                if (iBeginBroadcast >= 0) {
                    try {
                        ((InterfaceC1674) c9876.f31782.getBroadcastItem(iBeginBroadcast)).mo6013(c3668);
                    } catch (RemoteException unused) {
                    }
                } else {
                    c9876.f31782.finishBroadcast();
                }
            }
        }
        c9876.f31777.setPlaybackState(c3668.m11924());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32945(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C13363.class.getClassLoader());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32951() {
        C9876 c9876 = this.f42606;
        MediaSession mediaSession = c9876.f31777;
        c9876.f31782.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception unused) {
            }
        }
        mediaSession.setCallback(null);
        c9876.f31778.m43686();
        mediaSession.release();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32949(C21811 c21811) {
        C9876 c9876 = this.f42606;
        c9876.f31781 = c21811;
        c9876.f31777.setMetadata(c21811.m49468());
    }
}
