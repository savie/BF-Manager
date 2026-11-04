package l;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16060 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38217(CharSequence charSequence, C13406 c13406, C11228 c11228) throws InterruptedException {
        try {
            C25012 c25012 = new C25012();
            c25012.m55844();
            if (charSequence.length() > 1048576) {
                throw m38214(EnumC4590.LIMIT, "Source length limit exceeded");
            }
            if (c11228.length() != 0) {
                throw new IllegalArgumentException("Output must be empty");
            }
            String strM47087 = C20536.m47087(charSequence, c25012);
            C11228 c11228M28291 = c11228.m28291();
            int i = 0;
            try {
                try {
                    m38216(charSequence, c13406, strM47087, c25012, false, c11228M28291);
                } catch (C21744 e) {
                    if (e.f69354 != EnumC4590.SYNTAX) {
                        throw e;
                    }
                    if (c13406.m33048()) {
                        throw new C5949(e.f69355, e.f69353 + 1, e.getMessage());
                    }
                    c11228M28291.m28293(0);
                    C13077.m32553(charSequence, c13406, strM47087, c25012, c11228M28291);
                }
                while (i < c11228M28291.length()) {
                    c25012.m55844();
                    int i2 = i + 4096;
                    c11228.m28292(i, Math.min(c11228M28291.length(), i2), c11228M28291);
                    i = i2;
                }
                c25012.m55844();
                c11228M28291.close();
            } catch (Throwable th) {
                try {
                    c11228M28291.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (StackOverflowError unused) {
            throw m38214(EnumC4590.LIMIT, "Parser stack limit exceeded");
        } catch (C7683 unused2) {
            throw new InterruptedException("Code formatting cancelled");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX WARN: Code duplicated, block: B:23:0x0080 A[LOOP:1: B:21:0x007c->B:23:0x0080, LOOP_END] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38216(CharSequence charSequence, C13406 c13406, String str, C25012 c25012, boolean z, C11228 c11228) {
        int childCount;
        C17552 c17552M38218 = m38218(charSequence, c25012);
        new C20536(charSequence, c17552M38218.f57047, c17552M38218.f57046, c13406, str, c25012).m47094(c11228, z);
        try {
            C17552 c17552M38219 = m38218(c11228, c25012);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque.push(c17552M38218.f57046);
            arrayDeque2.push(c17552M38219.f57046);
            while (!arrayDeque.isEmpty() && !arrayDeque2.isEmpty()) {
                c25012.m55844();
                InterfaceC19383 interfaceC19383 = (InterfaceC19383) arrayDeque.pop();
                InterfaceC19383 interfaceC19384 = (InterfaceC19383) arrayDeque2.pop();
                if (interfaceC19383.getChildCount() == interfaceC19384.getChildCount()) {
                    boolean z2 = interfaceC19383 instanceof C7998;
                    if (z2) {
                        C7998 c7998 = (C7998) interfaceC19383;
                        if ((interfaceC19384 instanceof C7998) && c7998.mo1229() == ((C7998) interfaceC19384).mo1229()) {
                            if (!z2 || !(interfaceC19384 instanceof C7998)) {
                                childCount = interfaceC19383.getChildCount();
                                while (true) {
                                    childCount--;
                                    if (childCount >= 0) {
                                        arrayDeque.push(interfaceC19383.mo9151(childCount));
                                        arrayDeque2.push(interfaceC19384.mo9151(childCount));
                                    }
                                }
                            }
                        }
                    } else {
                        if (!z2) {
                        }
                        childCount = interfaceC19383.getChildCount();
                        while (true) {
                            childCount--;
                            if (childCount >= 0) {
                                arrayDeque.push(interfaceC19383.mo9151(childCount));
                                arrayDeque2.push(interfaceC19384.mo9151(childCount));
                            }
                        }
                    }
                }
                throw m38214(EnumC4590.CHANGED, "Syntax structure changed during formatting");
            }
            if (!arrayDeque.isEmpty() || !arrayDeque2.isEmpty()) {
                throw m38214(EnumC4590.CHANGED, "Syntax length changed");
            }
            m38215(charSequence, c17552M38218.f57047, c11228, c17552M38219.f57047, c25012);
        } catch (C21744 e) {
            if (e.f69354 == EnumC4590.SYNTAX) {
                throw m38214(EnumC4590.CHANGED, "Formatted output could not be parsed");
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3523 m38213(CharSequence charSequence, C25012 c25012) {
        C22490 c22490 = new C22490(new C18870(new C16806(charSequence, c25012)));
        c22490.m24869();
        c22490.m24868(new C5620());
        C1891 c1891 = new C1891(c22490, c25012);
        c1891.m11532();
        if (c1891.m11534(c1891.size() - 1).getType() == -1) {
            return c1891;
        }
        throw m38214(EnumC4590.LIMIT, "Token count limit exceeded");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17552 m38218(CharSequence charSequence, C25012 c25012) {
        C3523 c3523M38213 = m38213(charSequence, c25012);
        C11585 c11585 = new C11585(c3523M38213, c25012);
        c11585.m24869();
        c11585.m24868(new C5620());
        return new C17552(c3523M38213.m11539(), c11585.m51362());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38215(CharSequence charSequence, List list, C11228 c11228, List list2, C25012 c25012) {
        Iterator it = list.iterator();
        InterfaceC8743 interfaceC8743 = null;
        InterfaceC8743 interfaceC8744 = null;
        int i = 0;
        while (it.hasNext()) {
            InterfaceC8743 interfaceC8745 = (InterfaceC8743) it.next();
            c25012.m55844();
            if (interfaceC8745.getType() != 65) {
                while (i < list2.size() && ((InterfaceC8743) list2.get(i)).getType() == 65) {
                    i++;
                }
                if (i == list2.size()) {
                    throw m38214(EnumC4590.CHANGED, "Token count changed");
                }
                int i2 = i + 1;
                InterfaceC8743 interfaceC8746 = (InterfaceC8743) list2.get(i);
                int iMo23440 = (interfaceC8745.mo23440() - interfaceC8745.mo23442()) + 1;
                if (interfaceC8745.getType() != interfaceC8746.getType() || iMo23440 != (interfaceC8746.mo23440() - interfaceC8746.mo23442()) + 1) {
                    throw m38214(EnumC4590.CHANGED, "Token content changed");
                }
                for (int i3 = 0; i3 < iMo23440; i3++) {
                    if ((i3 & 1023) == 0) {
                        c25012.m55844();
                    }
                    if (charSequence.charAt(interfaceC8745.mo23442() + i3) != c11228.charAt(interfaceC8746.mo23442() + i3)) {
                        throw m38214(EnumC4590.CHANGED, "Token content changed");
                    }
                }
                if (interfaceC8743 != null && ((C20536.m47092(interfaceC8745) || C20536.m47092(interfaceC8743)) && C20536.m47091(interfaceC8743.mo23440() + 1, interfaceC8745.mo23442(), charSequence) != C20536.m47091(interfaceC8744.mo23440() + 1, interfaceC8746.mo23442(), c11228))) {
                    throw m38214(EnumC4590.CHANGED, "Comment ownership changed");
                }
                interfaceC8744 = interfaceC8746;
                interfaceC8743 = interfaceC8745;
                i = i2;
            }
        }
        if (i != list2.size()) {
            throw m38214(EnumC4590.CHANGED, "Token count changed");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21744 m38214(EnumC4590 enumC4590, String str) {
        return new C21744(enumC4590, 1, 0, str);
    }
}
