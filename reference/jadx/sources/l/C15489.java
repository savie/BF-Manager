package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ܳܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15489 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37054(int i) {
        return i == 102 || i == 2 || i == 3 || i == -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37053(CharSequence charSequence, boolean z, int i, boolean z2, C11228 c11228) throws InterruptedException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
        if (charSequence.length() > 1048576) {
            throw m37050(EnumC19965.LIMIT, "Source length limit exceeded");
        }
        C5049 c5049 = new C5049();
        try {
            try {
                m37052(charSequence, z, i, c5049, false, c11228);
            } catch (C11014 e) {
                try {
                    if (e.f34787 != EnumC19965.SYNTAX) {
                        throw e;
                    }
                    if (z2) {
                        throw C9919.m25740(e.getMessage(), charSequence, C9919.m25739(charSequence, e.f34788, e.f34786, true));
                    }
                    C1739.m6146(charSequence, z, i, c5049, c11228);
                } catch (C11014 e2) {
                    if (!Thread.currentThread().isInterrupted()) {
                        throw e2;
                    }
                    throw new InterruptedException();
                }
            }
        } catch (StackOverflowError unused) {
            throw m37050(EnumC19965.LIMIT, "Parser stack limit exceeded");
        } catch (C7683 unused2) {
            throw new InterruptedException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37052(CharSequence charSequence, boolean z, int i, C5049 c5049, boolean z2, C11228 c11228) {
        C22949 c22949M37051 = m37051(charSequence, c5049);
        new C23368(charSequence, c22949M37051.f74561, c22949M37051.f74560, c5049).m52537(z, Math.max(1, Math.min(16, i)), z2, c11228);
        if (c11228.length() > 1048576) {
            throw m37050(EnumC19965.LIMIT, "Formatted source length limit exceeded");
        }
        c5049.m15284();
        boolean z3 = c11228.length() == charSequence.length();
        for (int i2 = 0; z3 && i2 < charSequence.length(); i2++) {
            if ((i2 & 1023) == 0) {
                c5049.m15284();
            }
            z3 = c11228.charAt(i2) == charSequence.charAt(i2);
        }
        if (z3) {
            return;
        }
        try {
            C22949 c22949M37052 = m37051(c11228, c5049);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque.push(c22949M37051.f74560);
            arrayDeque2.push(c22949M37052.f74560);
            while (!arrayDeque.isEmpty() && !arrayDeque2.isEmpty()) {
                c5049.m15284();
                InterfaceC19383 interfaceC19383 = (InterfaceC19383) arrayDeque.pop();
                InterfaceC19383 interfaceC19384 = (InterfaceC19383) arrayDeque2.pop();
                if (interfaceC19383 instanceof C7998) {
                    C7998 c7998 = (C7998) interfaceC19383;
                    if (interfaceC19384 instanceof C7998) {
                        C7998 c7999 = (C7998) interfaceC19384;
                        if (c7998.mo1229() != c7999.mo1229() || c7998.getChildCount() != c7999.getChildCount()) {
                            throw m37050(EnumC19965.CHANGED, "Syntax structure changed during formatting");
                        }
                        for (int childCount = c7998.getChildCount() - 1; childCount >= 0; childCount--) {
                            arrayDeque.push(c7998.mo9151(childCount));
                            arrayDeque2.push(c7999.mo9151(childCount));
                        }
                    }
                }
                if (interfaceC19383 instanceof InterfaceC1484) {
                    InterfaceC1484 interfaceC1484 = (InterfaceC1484) interfaceC19383;
                    if (interfaceC19384 instanceof InterfaceC1484) {
                        InterfaceC8743 interfaceC8743Mo5285 = interfaceC1484.mo5285();
                        InterfaceC8743 interfaceC8743Mo5286 = ((InterfaceC1484) interfaceC19384).mo5285();
                        if (interfaceC8743Mo5285.getType() != interfaceC8743Mo5286.getType() || (!m37054(interfaceC8743Mo5285.getType()) && !interfaceC8743Mo5285.getText().equals(interfaceC8743Mo5286.getText()))) {
                            throw m37050(EnumC19965.CHANGED, "Token content changed during formatting");
                        }
                    }
                }
                throw m37050(EnumC19965.CHANGED, "Syntax node changed during formatting");
            }
            if (arrayDeque.isEmpty() && arrayDeque2.isEmpty()) {
                c5049.m15284();
                return;
            }
            throw m37050(EnumC19965.CHANGED, "Syntax length changed");
        } catch (C11014 e) {
            if (e.f34787 != EnumC19965.SYNTAX) {
                throw e;
            }
            throw m37050(EnumC19965.CHANGED, "Formatted output could not be parsed: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22949 m37051(CharSequence charSequence, C5049 c5049) {
        C2789 c2789 = new C2789();
        C8755 c8755 = new C8755(new C22203(new C16947(charSequence, new RunnableC9500(c5049)), c5049), c5049);
        c8755.m24869();
        c8755.m24868(c2789);
        C7264 c7264 = new C7264(c8755, c5049);
        c7264.m11532();
        C13975 c13975 = new C13975(c7264, c5049);
        c13975.m24869();
        c13975.m24868(c2789);
        return new C22949(c7264.m11539(), c13975.m32123());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11014 m37050(EnumC19965 enumC19965, String str) {
        return new C11014(enumC19965, 1, 0, str);
    }
}
