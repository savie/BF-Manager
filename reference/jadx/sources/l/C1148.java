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
import android.widget.TextView;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes.dex */
public final class C1148 {

    /* JADX INFO: renamed from: ۢ᩷۟, reason: not valid java name and contains not printable characters */
    public static int f5161;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int f5162;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5163 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5819 f5164;

    /* JADX INFO: renamed from: ֫᩷᩹, reason: not valid java name and contains not printable characters */
    public static boolean m4218(Object obj, Object obj2) {
        return ((C5342) obj).mo7854((C5342) obj2);
    }

    /* JADX INFO: renamed from: ۗۢ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m4219(Object obj) {
        return ((AbstractC20745) obj).m46728();
    }

    /* JADX INFO: renamed from: ۙۢ᩵, reason: not valid java name and contains not printable characters */
    public static Boolean m4221(boolean z) {
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ۚᩳ۠, reason: not valid java name and contains not printable characters */
    public static C2724 m4222(int i) {
        return C2724.m8305(i);
    }

    /* JADX INFO: renamed from: ۜܳۜ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m4223(Object obj, Object obj2) {
        return ((StringBuilder) obj).append((String) obj2);
    }

    /* JADX INFO: renamed from: ۟ۜ᩺, reason: not valid java name and contains not printable characters */
    public static void m4224(Object obj, int i) {
        ((C8067) obj).m21253(i);
    }

    /* JADX INFO: renamed from: ۢۖۗ, reason: not valid java name and contains not printable characters */
    public static void m4225(Object obj, int i) {
        ((TextView) obj).setTextColor(i);
    }

    /* JADX INFO: renamed from: ۨ۫ܽ, reason: not valid java name and contains not printable characters */
    public static byte[] m4226(Object obj, Object obj2, Object obj3) {
        return ((C2455) obj).m7475((C12107) obj2, (C8516) obj3);
    }

    /* JADX INFO: renamed from: ܰܶ᩵, reason: not valid java name and contains not printable characters */
    public static void m4227(Object obj, int i) throws IOException {
        ((DataOutputStream) obj).writeInt(i);
    }

    /* JADX INFO: renamed from: ܰ᩺ܺ, reason: not valid java name and contains not printable characters */
    public static void m4228(Object obj, int i, Object obj2) {
        ((C17212) obj).m40149(i, obj2);
    }

    /* JADX INFO: renamed from: ܶ᩷᩹, reason: not valid java name and contains not printable characters */
    public static void m4229(Object obj, int i) {
        ((C6753) obj).m18256(i);
    }

    /* JADX INFO: renamed from: ܺۖ۫, reason: not valid java name and contains not printable characters */
    public static String m4230(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܽܰ֡, reason: not valid java name and contains not printable characters */
    public static boolean m4231(Object obj) {
        return ((AbstractC20745) obj).mo33975();
    }

    /* JADX INFO: renamed from: ᩴۡ᩺, reason: not valid java name and contains not printable characters */
    public static int m4232() {
        return 1999298910;
    }

    /* JADX INFO: renamed from: ᩴۧ۫, reason: not valid java name and contains not printable characters */
    public static void m4233() {
        C21094.m47530();
    }

    /* JADX INFO: renamed from: ᩸ܽ֨, reason: not valid java name and contains not printable characters */
    public static Integer m4234(int i) {
        return Integer.valueOf(i);
    }

    public C1148(ServiceC17701 serviceC17701) {
        ComponentName componentName;
        if (TextUtils.isEmpty("MusicService")) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        int i = C14683.f48000;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(serviceC17701.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = serviceC17701.getPackageManager().queryBroadcastReceivers(intent, 0);
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
            broadcast = PendingIntent.getBroadcast(serviceC17701, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f5164 = new C1585(serviceC17701);
        } else if (i2 >= 28) {
            this.f5164 = new C23459(serviceC17701);
        } else if (i2 >= 22) {
            this.f5164 = new C10759(serviceC17701);
        } else {
            this.f5164 = new C5819(serviceC17701);
        }
        m4238(new C15698(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.f5164.f19778.setMediaButtonReceiver(broadcast);
        new C20636(serviceC17701, this.f5164.f19774);
        if (f5162 == 0) {
            f5162 = (int) (TypedValue.applyDimension(1, 320.0f, serviceC17701.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4238(AbstractC16403 abstractC16403, Handler handler) {
        C5819 c5819 = this.f5164;
        if (handler == null) {
            handler = new Handler();
        }
        synchronized (c5819.f19773) {
            c5819.f19775 = abstractC16403;
            c5819.f19778.setCallback(abstractC16403 == null ? null : abstractC16403.f52773, handler);
            if (abstractC16403 != null) {
                abstractC16403.m38615(c5819, handler);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4239(boolean z) {
        this.f5164.f19778.setActive(z);
        Iterator it = this.f5163.iterator();
        while (it.hasNext()) {
            ((InterfaceC9348) it.next()).m23997();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22316 m4235() {
        return this.f5164.f19774;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4236(C8205 c8205) {
        C5819 c5819 = this.f5164;
        c5819.f19780 = c8205;
        synchronized (c5819.f19773) {
            int iBeginBroadcast = c5819.f19779.beginBroadcast();
            while (true) {
                iBeginBroadcast--;
                if (iBeginBroadcast >= 0) {
                    try {
                        ((InterfaceC3701) c5819.f19779.getBroadcastItem(iBeginBroadcast)).mo10868(c8205);
                    } catch (RemoteException unused) {
                    }
                } else {
                    c5819.f19779.finishBroadcast();
                }
            }
        }
        c5819.f19778.setPlaybackState(c8205.m21493());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4220(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C1148.class.getClassLoader());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m4240() {
        C5819 c5819 = this.f5164;
        MediaSession mediaSession = c5819.f19778;
        c5819.f19779.kill();
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
        c5819.f19777.m39963();
        mediaSession.release();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4237(C13581 c13581) {
        C5819 c5819 = this.f5164;
        c5819.f19776 = c13581;
        c5819.f19778.setMetadata(c13581.m33200());
    }
}
