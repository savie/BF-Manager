package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4G0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1365 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static ExecutorC19264 f4859 = new ExecutorC19264(new ExecutorC10313());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static int f4858 = -100;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C12266 f4862 = null;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static C12266 f4861 = null;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static Boolean f4860 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f4865 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C18037 f4863 = new C18037(0);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Object f4866 = new Object();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Object f4864 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo5025();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Context mo5026(Context context) {
        return context;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract View mo5027(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo5028() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo5029(Configuration configuration);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo5030(View view);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo5031(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo5032(CharSequence charSequence);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo5033(C16390 c16390);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract void mo5034();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Context mo5035() {
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract void mo5036(int i);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo5037();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public abstract void mo5038();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC2944 mo5039();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public abstract void mo5040();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public abstract void mo5041();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract void mo5042();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public abstract MenuInflater mo5043();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void mo5044(int i) {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo5045(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract boolean mo5046();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract boolean mo5047(int i);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int mo5048() {
        return -100;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract void mo5049(int i);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public abstract void mo5050();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m5019(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && f4858 != i) {
            f4858 = i;
            synchronized (f4866) {
                Iterator it = f4863.iterator();
                while (true) {
                    AbstractC7596 abstractC7596 = (AbstractC7596) it;
                    if (abstractC7596.hasNext()) {
                        AbstractC1365 abstractC1365 = (AbstractC1365) ((WeakReference) abstractC7596.next()).get();
                        if (abstractC1365 != null) {
                            abstractC1365.mo5046();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5014(C12266 c12266) {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM5020 = m5020();
            if (objM5020 != null) {
                C0619.m2754(objM5020, C18518.m43105(c12266.m30641()));
                return;
            }
            return;
        }
        if (c12266.equals(f4862)) {
            return;
        }
        synchronized (f4866) {
            f4862 = c12266;
            Iterator it = f4863.iterator();
            while (true) {
                AbstractC7596 abstractC7596 = (AbstractC7596) it;
                if (abstractC7596.hasNext()) {
                    AbstractC1365 abstractC1365 = (AbstractC1365) ((WeakReference) abstractC7596.next()).get();
                    if (abstractC1365 != null) {
                        abstractC1365.mo5028();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C12266 m5024() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM5020 = m5020();
            if (objM5020 != null) {
                return C12266.m30635(C0619.m2753(objM5020));
            }
        } else {
            C12266 c12266 = f4862;
            if (c12266 != null) {
                return c12266;
            }
        }
        return C12266.m30638();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static int m5012() {
        return f4858;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C12266 m5018() {
        return f4862;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static C12266 m5015() {
        return f4861;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static Object m5020() {
        Context contextMo5035;
        Iterator it = f4863.iterator();
        while (true) {
            AbstractC7596 abstractC7596 = (AbstractC7596) it;
            if (!abstractC7596.hasNext()) {
                return null;
            }
            AbstractC1365 abstractC1365 = (AbstractC1365) ((WeakReference) abstractC7596.next()).get();
            if (abstractC1365 != null && (contextMo5035 = abstractC1365.mo5035()) != null) {
                return contextMo5035.getSystemService("locale");
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5017(Context context) {
        if (f4860 == null) {
            try {
                int i = ServiceC7945.f26418;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ServiceC7945.class), Build.VERSION.SDK_INT >= 24 ? C0487.m2353() | 128 : 640).metaData;
                if (bundle != null) {
                    f4860 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f4860 = Boolean.FALSE;
            }
        }
        return f4860.booleanValue();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m5023(Context context) {
        if (m5017(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f4865) {
                    return;
                }
                f4859.execute(new RunnableC7909(1, context));
                return;
            }
            synchronized (f4864) {
                C12266 c12266 = f4862;
                if (c12266 == null) {
                    if (f4861 == null) {
                        f4861 = C12266.m30636(C10357.m26634(context));
                    }
                    if (f4861.m30640()) {
                    } else {
                        f4862 = f4861;
                    }
                } else if (!c12266.equals(f4861)) {
                    C12266 c12267 = f4862;
                    f4861 = c12267;
                    C10357.m26635(context, c12267.m30641());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5013(AbstractC1365 abstractC1365) {
        synchronized (f4866) {
            m5016(abstractC1365);
            f4863.add(new WeakReference(abstractC1365));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m5022(AbstractC1365 abstractC1365) {
        synchronized (f4866) {
            m5016(abstractC1365);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m5021(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m5024().m30640()) {
                    String strM26634 = C10357.m26634(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        C0619.m2754(systemService, C18518.m43105(strM26634));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
        f4865 = true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m5016(AbstractC1365 abstractC1365) {
        synchronized (f4866) {
            Iterator it = f4863.iterator();
            while (true) {
                AbstractC7596 abstractC7596 = (AbstractC7596) it;
                if (abstractC7596.hasNext()) {
                    AbstractC1365 abstractC1366 = (AbstractC1365) ((WeakReference) abstractC7596.next()).get();
                    if (abstractC1366 == abstractC1365 || abstractC1366 == null) {
                        abstractC7596.remove();
                    }
                }
            }
        }
    }
}
