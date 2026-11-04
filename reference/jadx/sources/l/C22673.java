package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩸۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XI */
/* JADX INFO: loaded from: classes.dex */
public final class C22673 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static WeakReference f73638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Toast f73639;

    public C22673(Toast toast) {
        this.f73639 = toast;
        if (Build.VERSION.SDK_INT == 25) {
            try {
                Field declaredField = Toast.class.getDeclaredField("mTN");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(toast);
                Field declaredField2 = obj.getClass().getDeclaredField("mHandler");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, new HandlerC10738((Handler) declaredField2.get(obj)));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22673 m51154(CharSequence charSequence) {
        C22673 c22673M51153 = m51153(0, charSequence);
        c22673M51153.m51163();
        return c22673M51153;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51155(String str) {
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
        m51153(i, str).m51163();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22673 m51152(int i) {
        C22673 c22673M51158 = m51158(i, 0);
        c22673M51158.m51163();
        return c22673M51158;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51160(CharSequence charSequence) {
        m51153(1, charSequence).m51163();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51159(int i) {
        m51158(i, 1).m51163();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22673 m51153(int i, CharSequence charSequence) {
        Toast toastMakeText;
        try {
            toastMakeText = Toast.makeText(C21576.m49084(), "", i);
            toastMakeText.setText(charSequence);
        } catch (RuntimeException unused) {
            toastMakeText = Toast.makeText(C21576.m49084(), charSequence, i);
        }
        return new C22673(toastMakeText);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C22673 m51158(int i, int i2) {
        Toast toastMakeText;
        try {
            toastMakeText = Toast.makeText(C21576.m49084(), "", i2);
            toastMakeText.setText(i);
        } catch (RuntimeException unused) {
            toastMakeText = Toast.makeText(C21576.m49084(), i, i2);
        }
        return new C22673(toastMakeText);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m51157() {
        WeakReference weakReference = f73638;
        Toast toast = null;
        if (weakReference != null) {
            Toast toast2 = (Toast) weakReference.get();
            f73638 = null;
            toast = toast2;
        }
        if (toast != null) {
            try {
                toast.cancel();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51163() {
        RunnableC4773 runnableC4773 = new RunnableC4773(0, this);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnableC4773.run();
        } else {
            C21576.m49068(runnableC4773);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51156(C22673 c22673) {
        Toast toast = c22673.f73639;
        m51157();
        try {
            toast.show();
            f73638 = new WeakReference(toast);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51162(int i, int i2) {
        this.f73639.setGravity(i, 0, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51161() {
        try {
            this.f73639.cancel();
        } catch (Throwable unused) {
        }
    }
}
