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

/* JADX INFO: renamed from: l.ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4G0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17129 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f54626 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static ExecutorC16424 f54630 = new ExecutorC16424(new ExecutorC12191());

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int f54624 = -100;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C17855 f54623 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C17855 f54625 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Boolean f54628 = null;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static boolean f54622 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C18623 f54629 = new C18623();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Object f54621 = new Object();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Object f54627 = new Object();

    /* JADX INFO: renamed from: ֨ */
    public abstract void mo23534();

    /* JADX INFO: renamed from: ۖ */
    public int mo23536() {
        return -100;
    }

    /* JADX INFO: renamed from: ۖ */
    public abstract void mo23537(int i);

    /* JADX INFO: renamed from: ۘ */
    public abstract void mo23538();

    /* JADX INFO: renamed from: ۙ */
    public Context mo23542(Context context) {
        return context;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract View mo23543(int i);

    /* JADX INFO: renamed from: ۙ */
    public void mo23545() {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23547(Configuration configuration);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23548(View view);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23549(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23550(CharSequence charSequence);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23551(C6938 c6938);

    /* JADX INFO: renamed from: ۚ */
    public abstract MenuInflater mo23556();

    /* JADX INFO: renamed from: ۚ */
    public void mo23557(int i) {
    }

    /* JADX INFO: renamed from: ۜ */
    public abstract void mo23558();

    /* JADX INFO: renamed from: ۨ */
    public Context mo23561() {
        return null;
    }

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo23562(int i);

    /* JADX INFO: renamed from: ۬ */
    public abstract void mo23564();

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo23566(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: ܰ */
    public abstract boolean mo23567();

    /* JADX INFO: renamed from: ܰ */
    public abstract boolean mo23568(int i);

    /* JADX INFO: renamed from: ܶ */
    public abstract void mo23569();

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo23572();

    /* JADX INFO: renamed from: ᩸ */
    public abstract void mo23575();

    /* JADX INFO: renamed from: ᩹ */
    public abstract AbstractC10697 mo23576();

    /* JADX INFO: renamed from: ᩺ */
    public abstract void mo23577();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m40007(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && f54624 != i) {
            f54624 = i;
            synchronized (f54621) {
                Iterator it = f54629.iterator();
                while (it.hasNext()) {
                    AbstractC17129 abstractC17129 = (AbstractC17129) ((WeakReference) it.next()).get();
                    if (abstractC17129 != null) {
                        abstractC17129.mo23567();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39997(C17855 c17855) {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM40006 = m40006();
            if (objM40006 != null) {
                C19952.m45247(objM40006, C15719.m37442(c17855.m41452()));
                return;
            }
            return;
        }
        if (c17855.equals(f54623)) {
            return;
        }
        synchronized (f54621) {
            f54623 = c17855;
            Iterator it = f54629.iterator();
            while (it.hasNext()) {
                AbstractC17129 abstractC17129 = (AbstractC17129) ((WeakReference) it.next()).get();
                if (abstractC17129 != null) {
                    abstractC17129.mo23545();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C17855 m40005() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM40006 = m40006();
            if (objM40006 != null) {
                return C17855.m41445(C19952.m45246(objM40006));
            }
        } else {
            C17855 c17855 = f54623;
            if (c17855 != null) {
                return c17855;
            }
        }
        return C17855.m41448();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static int m39998() {
        return f54624;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static C17855 m39999() {
        return f54623;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C17855 m40000() {
        return f54625;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static Object m40006() {
        Context contextMo23561;
        Iterator it = f54629.iterator();
        while (it.hasNext()) {
            AbstractC17129 abstractC17129 = (AbstractC17129) ((WeakReference) it.next()).get();
            if (abstractC17129 != null && (contextMo23561 = abstractC17129.mo23561()) != null) {
                return contextMo23561.getSystemService("locale");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m40002(Context context) {
        if (f54628 == null) {
            try {
                int i = ServiceC0692.f2947;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ServiceC0692.class), Build.VERSION.SDK_INT >= 24 ? C20449.m46252() | 128 : 640).metaData;
                if (bundle != null) {
                    f54628 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f54628 = Boolean.FALSE;
            }
        }
        return f54628.booleanValue();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m39995(Context context) {
        if (m40002(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f54622) {
                    return;
                }
                f54630.execute(new RunnableC7856(1, context));
                return;
            }
            synchronized (f54627) {
                C17855 c17855 = f54623;
                if (c17855 == null) {
                    if (f54625 == null) {
                        f54625 = C17855.m41446(C21091.m47525(context));
                    }
                    if (f54625.m41451()) {
                    } else {
                        f54623 = f54625;
                    }
                } else if (!c17855.equals(f54625)) {
                    C17855 c17856 = f54623;
                    f54625 = c17856;
                    C21091.m47526(context, c17856.m41452());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39996(AbstractC17129 abstractC17129) {
        synchronized (f54621) {
            m40001(abstractC17129);
            f54629.add(new WeakReference(abstractC17129));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m40004(AbstractC17129 abstractC17129) {
        synchronized (f54621) {
            m40001(abstractC17129);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m40003(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m40005().m41451()) {
                    String strM47525 = C21091.m47525(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        C19952.m45247(systemService, C15719.m37442(strM47525));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
        f54622 = true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m40001(AbstractC17129 abstractC17129) {
        synchronized (f54621) {
            Iterator it = f54629.iterator();
            while (it.hasNext()) {
                AbstractC17129 abstractC171210 = (AbstractC17129) ((WeakReference) it.next()).get();
                if (abstractC171210 == abstractC17129 || abstractC171210 == null) {
                    it.remove();
                }
            }
        }
    }
}
