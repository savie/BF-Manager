package l;

import android.view.View;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: F63S */
/* JADX INFO: loaded from: classes.dex */
public final class C21727 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC11284 f69327 = new C5319();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC11284 f69328;

    static {
        AbstractC11284 abstractC11284 = null;
        try {
            abstractC11284 = (AbstractC11284) FragmentTransitionSupport.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f69328 = abstractC11284;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49295(ArrayList arrayList, int i) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }
}
