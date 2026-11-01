package l;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6385 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17526(CharSequence charSequence, C12052 c12052, C18503 c18503) throws InterruptedException {
        try {
            C16969 c16969 = new C16969();
            c16969.m39762();
            if (charSequence.length() > 1048576) {
                throw m17523(EnumC8129.LIMIT, "Source length limit exceeded");
            }
            if (c18503.length() != 0) {
                throw new IllegalArgumentException("Output must be empty");
            }
            String strM35536 = C14853.m35536(charSequence, c16969);
            C18503 c18503M42895 = c18503.m42895();
            int i = 0;
            try {
                try {
                    m17525(charSequence, c12052, strM35536, c16969, c18503M42895);
                } catch (Throwable th) {
                    try {
                        c18503M42895.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (C19418 e) {
                if (e.f62576 != EnumC8129.SYNTAX) {
                    throw e;
                }
                c18503M42895.m42897(0);
                C21202.m47665(charSequence, c12052, strM35536, c16969, c18503M42895);
            }
            while (i < c18503M42895.length()) {
                c16969.m39762();
                int i2 = i + 4096;
                c18503.m42896(i, Math.min(c18503M42895.length(), i2), c18503M42895);
                i = i2;
            }
            c16969.m39762();
            c18503M42895.close();
        } catch (StackOverflowError unused) {
            throw m17523(EnumC8129.LIMIT, "Parser stack limit exceeded");
        } catch (C13068 unused2) {
            throw new InterruptedException("Code formatting cancelled");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX WARN: Code duplicated, block: B:23:0x0080 A[LOOP:1: B:21:0x007c->B:23:0x0080, LOOP_END] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17525(CharSequence charSequence, C12052 c12052, String str, C16969 c16969, C18503 c18503) {
        int childCount;
        C17674 c17674M17527 = m17527(charSequence, c16969);
        new C14853(charSequence, c17674M17527.f56142, c17674M17527.f56141, c12052, str, c16969).m35539(c18503);
        try {
            C17674 c17674M17528 = m17527(c18503, c16969);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque.push(c17674M17527.f56141);
            arrayDeque2.push(c17674M17528.f56141);
            while (!arrayDeque.isEmpty() && !arrayDeque2.isEmpty()) {
                c16969.m39762();
                InterfaceC14988 interfaceC14988 = (InterfaceC14988) arrayDeque.pop();
                InterfaceC14988 interfaceC14989 = (InterfaceC14988) arrayDeque2.pop();
                if (interfaceC14988.getChildCount() == interfaceC14989.getChildCount()) {
                    boolean z = interfaceC14988 instanceof C23289;
                    if (z) {
                        C23289 c23289 = (C23289) interfaceC14988;
                        if ((interfaceC14989 instanceof C23289) && c23289.mo1058() == ((C23289) interfaceC14989).mo1058()) {
                            if (!z || !(interfaceC14989 instanceof C23289)) {
                                childCount = interfaceC14988.getChildCount();
                                while (true) {
                                    childCount--;
                                    if (childCount >= 0) {
                                        arrayDeque.push(interfaceC14988.mo22136(childCount));
                                        arrayDeque2.push(interfaceC14989.mo22136(childCount));
                                    }
                                }
                            }
                        }
                    } else {
                        if (!z) {
                        }
                        childCount = interfaceC14988.getChildCount();
                        while (true) {
                            childCount--;
                            if (childCount >= 0) {
                                arrayDeque.push(interfaceC14988.mo22136(childCount));
                                arrayDeque2.push(interfaceC14989.mo22136(childCount));
                            }
                        }
                    }
                }
                throw m17523(EnumC8129.CHANGED, "Syntax structure changed during formatting");
            }
            if (!arrayDeque.isEmpty() || !arrayDeque2.isEmpty()) {
                throw m17523(EnumC8129.CHANGED, "Syntax length changed");
            }
            m17524(charSequence, c17674M17527.f56142, c18503, c17674M17528.f56142, c16969);
        } catch (C19418 e) {
            if (e.f62576 == EnumC8129.SYNTAX) {
                throw m17523(EnumC8129.CHANGED, "Formatted output could not be parsed");
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4943 m17522(CharSequence charSequence, C16969 c16969) {
        C10246 c10246 = new C10246(new C3894(new C12736(charSequence, c16969)));
        c10246.m43805();
        c10246.m43803(new C16264());
        C20497 c20497 = new C20497(c10246, c16969);
        c20497.m13728();
        if (c20497.m13722(c20497.size() - 1).getType() == -1) {
            return c20497;
        }
        throw m17523(EnumC8129.LIMIT, "Token count limit exceeded");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17674 m17527(CharSequence charSequence, C16969 c16969) {
        C4943 c4943M17522 = m17522(charSequence, c16969);
        C0740 c0740 = new C0740(c4943M17522, c16969);
        c0740.m43805();
        c0740.m43803(new C16264());
        return new C17674(c4943M17522.m13723(), c0740.m23672());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17524(CharSequence charSequence, List list, C18503 c18503, List list2, C16969 c16969) {
        Iterator it = list.iterator();
        InterfaceC19761 interfaceC19761 = null;
        InterfaceC19761 interfaceC19762 = null;
        int i = 0;
        while (it.hasNext()) {
            InterfaceC19761 interfaceC19763 = (InterfaceC19761) it.next();
            c16969.m39762();
            if (interfaceC19763.getType() != 65) {
                while (i < list2.size() && ((InterfaceC19761) list2.get(i)).getType() == 65) {
                    i++;
                }
                if (i == list2.size()) {
                    throw m17523(EnumC8129.CHANGED, "Token count changed");
                }
                int i2 = i + 1;
                InterfaceC19761 interfaceC19764 = (InterfaceC19761) list2.get(i);
                int iMo22510 = (interfaceC19763.mo22510() - interfaceC19763.mo22508()) + 1;
                if (interfaceC19763.getType() != interfaceC19764.getType() || iMo22510 != (interfaceC19764.mo22510() - interfaceC19764.mo22508()) + 1) {
                    throw m17523(EnumC8129.CHANGED, "Token content changed");
                }
                for (int i3 = 0; i3 < iMo22510; i3++) {
                    if ((i3 & 1023) == 0) {
                        c16969.m39762();
                    }
                    if (charSequence.charAt(interfaceC19763.mo22508() + i3) != c18503.charAt(interfaceC19764.mo22508() + i3)) {
                        throw m17523(EnumC8129.CHANGED, "Token content changed");
                    }
                }
                if (interfaceC19761 != null && ((C14853.m35538(interfaceC19763) || C14853.m35538(interfaceC19761)) && C14853.m35537(interfaceC19761.mo22510() + 1, interfaceC19763.mo22508(), charSequence) != C14853.m35537(interfaceC19762.mo22510() + 1, interfaceC19764.mo22508(), c18503))) {
                    throw m17523(EnumC8129.CHANGED, "Comment ownership changed");
                }
                interfaceC19762 = interfaceC19764;
                interfaceC19761 = interfaceC19763;
                i = i2;
            }
        }
        if (i != list2.size()) {
            throw m17523(EnumC8129.CHANGED, "Token count changed");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19418 m17523(EnumC8129 enumC8129, String str) {
        return new C19418(enumC8129, 1, 0, str);
    }
}
