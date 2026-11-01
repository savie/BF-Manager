package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 151T */
/* JADX INFO: loaded from: classes3.dex */
public final class C9896 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC19010 f33825 = new C11307();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11955 f33824 = new C24007();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0390 m25085(AbstractC0934 abstractC0934) {
        Iterator<E> it = abstractC0934.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            if (((C11307) f33825).apply(it.next())) {
                i2 = i;
            }
            i++;
        }
        if (i2 > -1) {
            return new C2133(abstractC0934, i2);
        }
        return null;
    }
}
