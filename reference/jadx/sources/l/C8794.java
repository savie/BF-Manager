package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۡۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C8794 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22912(int i) {
        return i == 102 || i == 2 || i == 3 || i == -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22910(CharSequence charSequence, boolean z, int i, C18503 c18503) throws InterruptedException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
        if (charSequence.length() > 1048576) {
            throw m22909(EnumC19377.LIMIT, "Source length limit exceeded");
        }
        C21493 c21493 = new C21493();
        try {
            try {
                m22911(charSequence, z, i, c21493, c18503);
            } catch (C18671 e) {
                try {
                    if (e.f60607 != EnumC19377.SYNTAX) {
                        throw e;
                    }
                    C20677.m46517(charSequence, z, i, c21493, c18503);
                } catch (C18671 e2) {
                    if (!Thread.currentThread().isInterrupted()) {
                        throw e2;
                    }
                    throw new InterruptedException();
                }
            }
        } catch (StackOverflowError unused) {
            throw m22909(EnumC19377.LIMIT, "Parser stack limit exceeded");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22911(CharSequence charSequence, boolean z, int i, C21493 c21493, C18503 c18503) {
        C8088 c8088M22908 = m22908(charSequence, c21493);
        new C17149(charSequence, c8088M22908.f28340, c8088M22908.f28339, c21493).m40077(z, Math.max(1, Math.min(16, i)), c18503);
        if (c18503.length() > 1048576) {
            throw m22909(EnumC19377.LIMIT, "Formatted source length limit exceeded");
        }
        c21493.m48131();
        boolean z2 = c18503.length() == charSequence.length();
        for (int i2 = 0; z2 && i2 < charSequence.length(); i2++) {
            if ((i2 & 1023) == 0) {
                c21493.m48131();
            }
            z2 = c18503.charAt(i2) == charSequence.charAt(i2);
        }
        if (z2) {
            return;
        }
        try {
            C8088 c8088M22909 = m22908(c18503, c21493);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque.push(c8088M22908.f28339);
            arrayDeque2.push(c8088M22909.f28339);
            while (!arrayDeque.isEmpty() && !arrayDeque2.isEmpty()) {
                c21493.m48131();
                InterfaceC14988 interfaceC14988 = (InterfaceC14988) arrayDeque.pop();
                InterfaceC14988 interfaceC14989 = (InterfaceC14988) arrayDeque2.pop();
                if (interfaceC14988 instanceof C23289) {
                    C23289 c23289 = (C23289) interfaceC14988;
                    if (interfaceC14989 instanceof C23289) {
                        C23289 c232810 = (C23289) interfaceC14989;
                        if (c23289.mo1058() != c232810.mo1058() || c23289.getChildCount() != c232810.getChildCount()) {
                            throw m22909(EnumC19377.CHANGED, "Syntax structure changed during formatting");
                        }
                        for (int childCount = c23289.getChildCount() - 1; childCount >= 0; childCount--) {
                            arrayDeque.push(c23289.mo22136(childCount));
                            arrayDeque2.push(c232810.mo22136(childCount));
                        }
                    }
                }
                if (interfaceC14988 instanceof InterfaceC17809) {
                    InterfaceC17809 interfaceC17809 = (InterfaceC17809) interfaceC14988;
                    if (interfaceC14989 instanceof InterfaceC17809) {
                        InterfaceC19761 interfaceC19761Mo41396 = interfaceC17809.mo41396();
                        InterfaceC19761 interfaceC19761Mo41397 = ((InterfaceC17809) interfaceC14989).mo41396();
                        if (interfaceC19761Mo41396.getType() != interfaceC19761Mo41397.getType() || (!m22912(interfaceC19761Mo41396.getType()) && !interfaceC19761Mo41396.getText().equals(interfaceC19761Mo41397.getText()))) {
                            throw m22909(EnumC19377.CHANGED, "Token content changed during formatting");
                        }
                    }
                }
                throw m22909(EnumC19377.CHANGED, "Syntax node changed during formatting");
            }
            if (arrayDeque.isEmpty() && arrayDeque2.isEmpty()) {
                c21493.m48131();
                return;
            }
            throw m22909(EnumC19377.CHANGED, "Syntax length changed");
        } catch (C18671 e) {
            if (e.f60607 != EnumC19377.SYNTAX) {
                throw e;
            }
            throw m22909(EnumC19377.CHANGED, "Formatted output could not be parsed: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8088 m22908(CharSequence charSequence, C21493 c21493) {
        C3853 c3853 = new C3853();
        C6676 c6676 = new C6676(new C17965(new C14325(charSequence, new RunnableC13027(c21493)), c21493), c21493);
        c6676.m43805();
        c6676.m43803(c3853);
        C22905 c22905 = new C22905(c6676, c21493);
        c22905.m13728();
        C15144 c15144 = new C15144(c22905, c21493);
        c15144.m43805();
        c15144.m43803(c3853);
        return new C8088(c22905.m13723(), c15144.m25553());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18671 m22909(EnumC19377 enumC19377, String str) {
        return new C18671(enumC19377, 1, 0, str);
    }
}
