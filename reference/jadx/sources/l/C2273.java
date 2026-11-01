package l;

import android.view.View;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: F63S */
/* JADX INFO: loaded from: classes2.dex */
public final class C2273 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC14975 f8120 = new C6507();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AbstractC14975 f8121;

    static {
        AbstractC14975 abstractC14975 = null;
        try {
            abstractC14975 = (AbstractC14975) FragmentTransitionSupport.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f8121 = abstractC14975;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6972(ArrayList arrayList, int i) {
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
