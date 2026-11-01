package l;

import android.widget.Spinner;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes2.dex */
public final class C6824 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Spinner f22997;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C15721 f22998;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Runnable f22999;

    public C6824(Spinner spinner) {
        this.f22997 = spinner;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18426(C6824 c6824, int i) {
        if (i >= 0) {
            ArrayList arrayList = C23053.f74904;
            if (i >= arrayList.size()) {
                return;
            }
            c6824.m18429((AbstractC17131) arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18428(C6824 c6824) {
        int selectedItemPosition = c6824.f22997.getSelectedItemPosition();
        if (selectedItemPosition < 0) {
            return false;
        }
        ArrayList arrayList = C23053.f74904;
        if (selectedItemPosition >= arrayList.size()) {
            return false;
        }
        return c6824.m18429((AbstractC17131) arrayList.get(selectedItemPosition));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m18425(C6824 c6824) {
        int selectedItemPosition = c6824.f22997.getSelectedItemPosition();
        if (selectedItemPosition >= 0) {
            ArrayList arrayList = C23053.f74904;
            if (selectedItemPosition < arrayList.size()) {
                c6824.m18429((AbstractC17131) arrayList.get(selectedItemPosition));
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m18430(C6824 c6824) {
        return c6824.f22998 != null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C15721 m18431(C6824 c6824) {
        return c6824.f22998;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18427(C6824 c6824, Runnable runnable) {
        c6824.f22999 = runnable;
        runnable.run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m18429(AbstractC17131 abstractC17131) {
        abstractC17131.mo40010();
        this.f22998 = abstractC17131 instanceof C19954 ? ((C19954) abstractC17131).m45250() : null;
        Runnable runnable = this.f22999;
        if (runnable != null) {
            runnable.run();
        }
        return this.f22998 != null;
    }
}
