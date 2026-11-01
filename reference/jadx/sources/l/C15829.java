package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܺۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15829 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static WeakReference f51232;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Toast f51233;

    public C15829(Toast toast) {
        this.f51233 = toast;
        if (Build.VERSION.SDK_INT == 25) {
            try {
                Field declaredField = Toast.class.getDeclaredField("mTN");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(toast);
                Field declaredField2 = obj.getClass().getDeclaredField("mHandler");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, new HandlerC20767((Handler) declaredField2.get(obj)));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15829 m37613(CharSequence charSequence) {
        C15829 c15829M37612 = m37612(0, charSequence);
        c15829M37612.m37622();
        return c15829M37612;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37614(String str) {
        int i;
        int i2 = 0;
        while (Pattern.compile("\\w").matcher(str).find()) {
            i2++;
        }
        if (i2 <= 40) {
            int i3 = 0;
            while (Pattern.compile("[\\u4e00-\\u9fa5]").matcher(str).find()) {
                i3++;
            }
            i = (i3 > 40 || str.length() > 60) ? 1 : 0;
        }
        m37612(i, str).m37622();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15829 m37611(int i) {
        C15829 c15829M37617 = m37617(i, 0);
        c15829M37617.m37622();
        return c15829M37617;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m37619(CharSequence charSequence) {
        m37612(1, charSequence).m37622();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m37618(int i) {
        m37617(i, 1).m37622();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15829 m37612(int i, CharSequence charSequence) {
        Toast toastMakeText;
        try {
            toastMakeText = Toast.makeText(C16737.m39277(), "", i);
            toastMakeText.setText(charSequence);
        } catch (RuntimeException unused) {
            toastMakeText = Toast.makeText(C16737.m39277(), charSequence, i);
        }
        return new C15829(toastMakeText);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C15829 m37617(int i, int i2) {
        Toast toastMakeText;
        try {
            toastMakeText = Toast.makeText(C16737.m39277(), "", i2);
            toastMakeText.setText(i);
        } catch (RuntimeException unused) {
            toastMakeText = Toast.makeText(C16737.m39277(), i, i2);
        }
        return new C15829(toastMakeText);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m37616() {
        WeakReference weakReference = f51232;
        Toast toast = null;
        if (weakReference != null) {
            Toast toast2 = (Toast) weakReference.get();
            f51232 = null;
            toast = toast2;
        }
        if (toast != null) {
            try {
                toast.cancel();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37622() {
        RunnableC7361 runnableC7361 = new RunnableC7361(0, this);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnableC7361.run();
        } else {
            C16737.m39273(runnableC7361);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37615(C15829 c15829) {
        Toast toast = c15829.f51233;
        m37616();
        try {
            toast.show();
            f51232 = new WeakReference(toast);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37621(int i, int i2) {
        this.f51233.setGravity(i, 0, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37620() {
        try {
            this.f51233.cancel();
        } catch (Throwable unused) {
        }
    }
}
