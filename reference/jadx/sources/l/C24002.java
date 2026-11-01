package l;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: renamed from: l.᩻᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 763R */
/* JADX INFO: loaded from: classes.dex */
public final class C24002 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52832(Activity activity, EnumC1651 enumC1651) {
        C13465.m32966(enumC1651, "event");
        if (activity instanceof InterfaceC7068) {
            ((InterfaceC7068) activity).getLifecycle().m11902(enumC1651);
        } else if (activity instanceof InterfaceC1423) {
            AbstractC3062 lifecycle = ((InterfaceC1423) activity).getLifecycle();
            if (lifecycle instanceof C4245) {
                ((C4245) lifecycle).m11902(enumC1651);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52831(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C2128.f7794.getClass();
            C14830.m35509(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC9891(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
