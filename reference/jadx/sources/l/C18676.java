package l;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: renamed from: l.ܿ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P96C */
/* JADX INFO: loaded from: classes4.dex */
public final class C18676 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43427(Activity activity, EnumC9330 enumC9330) {
        C15243.m36590(enumC9330, "event");
        if (activity instanceof InterfaceC15692) {
            ((InterfaceC15692) activity).getLifecycle().m46395(enumC9330);
        } else if (activity instanceof InterfaceC11217) {
            AbstractC8585 lifecycle = ((InterfaceC11217) activity).getLifecycle();
            if (lifecycle instanceof C20168) {
                ((C20168) lifecycle).m46395(enumC9330);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43426(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8235.f27093.getClass();
            C0777.m3177(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC19422(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
