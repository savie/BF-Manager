package l;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HIXW */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4913 implements Consumer {
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        C17973 c17973 = (C17973) obj;
        for (C18981 c18981 : c17973.m41940()) {
            LinkedHashSet linkedHashSetM51443 = c17973.m41943().m51443();
            linkedHashSetM51443.addAll(c18981.m44027().m17530().m41943().m51443());
            Iterator it = c18981.m44026().iterator();
            while (it.hasNext()) {
                linkedHashSetM51443.addAll(((C6041) ((AbstractC16481) it.next())).m17530().m41943().m51443());
            }
        }
    }
}
