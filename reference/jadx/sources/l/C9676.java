package l;

/* JADX INFO: renamed from: l.ۡ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: K6OY */
/* JADX INFO: loaded from: classes3.dex */
public final class C9676 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25249(CharSequence charSequence, C13406 c13406, C11914 c11914, EnumC2220 enumC2220, boolean z, C11228 c11228) {
        C7998 c7998M44812;
        try {
            C18870.m43769();
            C23849 c23849 = new C23849(new C18870(charSequence));
            c23849.m24869();
            C9919 c9919 = c13406.m33048() ? new C9919(charSequence) : null;
            if (c9919 != null) {
                c23849.m24868(c9919);
            }
            C1474 c1474 = new C1474(c23849);
            c1474.m11532();
            int iMax = 0;
            for (InterfaceC8743 interfaceC8743 : c1474.m11539()) {
                C18870.m43769();
                int type = interfaceC8743.getType();
                if (c9919 != null) {
                    int iMo23442 = interfaceC8743.mo23442();
                    int iMo23440 = interfaceC8743.mo23440();
                    if (type == 6 && !C9919.m25741(iMo23442, iMo23440, charSequence)) {
                        c9919.m25743(iMo23442, "Unterminated CSS string");
                    } else if (type == 2 && (iMo23440 - iMo23442 < 3 || charSequence.charAt(iMo23440 - 1) != '*' || charSequence.charAt(iMo23440) != '/')) {
                        c9919.m25743(iMo23442, "Unterminated CSS comment");
                    }
                }
                if (type == 15 || type == 19 || type == 8 || type == 17) {
                    iMax++;
                    if (iMax > 128) {
                        throw new IllegalArgumentException("Source nesting exceeds formatter limit");
                    }
                } else if (type == 16 || type == 20 || type == 18) {
                    iMax = Math.max(0, iMax - 1);
                }
            }
            C19373 c19373 = new C19373(c1474);
            c19373.m24869();
            if (c9919 != null) {
                c19373.m24868(c9919);
            }
            int i = C10422.f33133[enumC2220.ordinal()];
            if (i == 1) {
                c7998M44812 = c19373.m44812();
            } else if (i == 2) {
                c7998M44812 = c19373.m44811();
            } else {
                if (i != 3) {
                    throw new IncompatibleClassChangeError();
                }
                c7998M44812 = c19373.m44808();
            }
            C7998 c7998 = c7998M44812;
            if (c9919 != null) {
                c9919.m25744();
            }
            C16389 c16389 = new C16389(charSequence, c1474, c7998, c13406, c11914, z, c11228);
            c16389.m38893(enumC2220);
            c16389.m38892();
        } catch (StackOverflowError e) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit", e);
        } catch (C7683 unused) {
            throw new InterruptedException("Code transformation cancelled");
        }
    }
}
