package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 151T */
/* JADX INFO: loaded from: classes2.dex */
public final class C3389 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6163 f11038 = new C16813();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5417 f11037 = new C17559();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13062 m11106(AbstractC5439 abstractC5439) {
        Iterator<E> it = abstractC5439.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            if (((C16813) f11038).apply(it.next())) {
                i2 = i;
            }
            i++;
        }
        if (i2 > -1) {
            return new C23527(abstractC5439, i2);
        }
        return null;
    }
}
