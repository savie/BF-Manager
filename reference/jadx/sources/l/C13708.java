package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAXS */
/* JADX INFO: loaded from: classes4.dex */
public class C13708 extends C8488 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m33503(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC3071 interfaceC3071) {
        C15243.m36590(iterable, "<this>");
        sb.append(charSequence2);
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            if (interfaceC3071 != null) {
                sb.append((CharSequence) interfaceC3071.invoke(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) next.toString());
                }
            }
        }
        sb.append(charSequence3);
    }
}
