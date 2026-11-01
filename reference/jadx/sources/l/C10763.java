package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9NZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10763 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m27066(View view) {
        C13465.m32966(view, "<this>");
        for (View view2 : C19143.m43963(view)) {
            C14291 c14291 = (C14291) view2.getTag(R.id.MT_Protector);
            if (c14291 == null) {
                c14291 = new C14291();
                view2.setTag(R.id.MT_Protector, c14291);
            }
            c14291.m34523();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m27067(C17492 c17492) {
        Iterator it = C18437.m42747(c17492).iterator();
        while (true) {
            C17731 c17731 = (C17731) it;
            if (!c17731.hasNext()) {
                return;
            }
            View view = (View) c17731.next();
            C14291 c14291 = (C14291) view.getTag(R.id.MT_Protector);
            if (c14291 == null) {
                c14291 = new C14291();
                view.setTag(R.id.MT_Protector, c14291);
            }
            c14291.m34523();
        }
    }
}
