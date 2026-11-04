package l;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۖ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes5.dex */
public final class C16539 extends C20269 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1624 m39177(View view, InterfaceC3071 interfaceC3071) {
        return new C5353(new C23253(view), interfaceC3071);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m39176(InterfaceC1624 interfaceC1624) {
        Iterator it = interfaceC1624.iterator();
        if (!it.hasNext()) {
            return C22242.f71645;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C7743.m21087(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
