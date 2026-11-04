package l;

import android.widget.Spinner;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes.dex */
public final class C24736 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Spinner f80089;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C20774 f80090;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Runnable f80091;

    public C24736(Spinner spinner) {
        this.f80089 = spinner;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55232(C24736 c24736, int i) {
        if (i >= 0) {
            ArrayList arrayList = C16530.f53509;
            if (i >= arrayList.size()) {
                return;
            }
            c24736.m55234((AbstractC14806) arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m55235(C24736 c24736) {
        int selectedItemPosition = c24736.f80089.getSelectedItemPosition();
        if (selectedItemPosition < 0) {
            return false;
        }
        ArrayList arrayList = C16530.f53509;
        if (selectedItemPosition >= arrayList.size()) {
            return false;
        }
        return c24736.m55234((AbstractC14806) arrayList.get(selectedItemPosition));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m55238(C24736 c24736) {
        int selectedItemPosition = c24736.f80089.getSelectedItemPosition();
        if (selectedItemPosition >= 0) {
            ArrayList arrayList = C16530.f53509;
            if (selectedItemPosition < arrayList.size()) {
                c24736.m55234((AbstractC14806) arrayList.get(selectedItemPosition));
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m55236(C24736 c24736) {
        return c24736.f80090 != null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C20774 m55237(C24736 c24736) {
        return c24736.f80090;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55233(C24736 c24736, Runnable runnable) {
        c24736.f80091 = runnable;
        runnable.run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m55234(AbstractC14806 abstractC14806) {
        abstractC14806.mo31285();
        this.f80090 = abstractC14806 instanceof C12569 ? ((C12569) abstractC14806).m31286() : null;
        Runnable runnable = this.f80091;
        if (runnable != null) {
            runnable.run();
        }
        return this.f80090 != null;
    }
}
