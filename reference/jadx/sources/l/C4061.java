package l;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۘܽ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C4061 extends C18173 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m11590(C11824 c11824) {
        C13941 c13941 = new C13941(c11824);
        if (c13941.hasNext()) {
            return c13941.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC22407 m11592(View view, InterfaceC15456 interfaceC15456) {
        if (view == null) {
            return C4767.f16782;
        }
        return new C5473(new C15352(view), interfaceC15456);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m11591(InterfaceC22407 interfaceC22407) {
        Iterator it = interfaceC22407.iterator();
        if (!it.hasNext()) {
            return C23238.f75405;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C4892.m13617(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
