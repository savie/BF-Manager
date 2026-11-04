package l;

/* JADX INFO: renamed from: l.ܽ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 46PA */
/* JADX INFO: loaded from: classes4.dex */
public final class C17596 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41261(CharSequence charSequence, EnumC7440 enumC7440, C13406 c13406, C14151 c14151, boolean z, C11228 c11228) throws InterruptedException {
        try {
            C7155.m19727();
            C4700 c4700M41259 = m41259(charSequence, enumC7440, c14151, c13406.m33048());
            if (c4700M41259 == null) {
                c11228.append(charSequence);
            } else {
                C7155.m19727();
                new C9391(c4700M41259, c13406, c14151, z, c11228).m24718();
            }
        } catch (StackOverflowError e) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit", e);
        } catch (C8646 unused) {
            throw new InterruptedException("Code transformation cancelled");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4700 m41259(CharSequence charSequence, EnumC7440 enumC7440, C14151 c14151, boolean z) {
        C16850 c16850M41260;
        C9919 c9919 = z ? new C9919(charSequence) : null;
        C16850 c16850M41261 = m41260(charSequence, enumC7440, c14151, null, c9919);
        if (c16850M41261 != null && enumC7440 != EnumC7440.JSON && C14612.m35252(c16850M41261.f54327.m11539())) {
            C14612 c14612 = c16850M41261.f54324;
            int i = 0;
            while (true) {
                if (i >= 3 || (c16850M41260 = m41260(charSequence, enumC7440, c14151, c14612, c9919)) == null) {
                    c16850M41261 = null;
                    break;
                }
                C14612 c14613 = c16850M41260.f54324;
                if (c14612.m35255(c14613, c16850M41260.f54327.m11539())) {
                    c16850M41261 = c16850M41260;
                    break;
                }
                i++;
                c14612 = c14613;
            }
        }
        if (c9919 != null) {
            c9919.m25744();
        }
        if (c16850M41261 == null) {
            return null;
        }
        C4700 c4700 = c16850M41261.f54326;
        c4700.m14589(c16850M41261.f54325);
        c4700.m14590(c4700.f16593);
        return c4700;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16850 m41260(CharSequence charSequence, EnumC7440 enumC7440, C14151 c14151, C14612 c14612, C9919 c9919) {
        if (c9919 != null) {
            c9919.m25742();
        }
        C7155 c7155 = new C7155(charSequence);
        C5115 c5115 = new C5115(c7155);
        c5115.m35377(new C10665(c5115, c7155));
        c5115.m51910(enumC7440 == EnumC7440.JSON);
        c5115.m51909(c14612);
        c5115.m24869();
        if (c9919 != null) {
            c5115.m24868(c9919);
        }
        C25056 c25056 = new C25056(c5115, charSequence.length());
        c25056.m11532();
        if (c9919 != null) {
            for (InterfaceC8743 interfaceC8743 : c25056.m11539()) {
                C7155.m19727();
                int type = interfaceC8743.getType();
                int iMo23442 = interfaceC8743.mo23442();
                int iMo23440 = interfaceC8743.mo23440();
                if (type == 6 && !C9919.m25741(iMo23442, iMo23440, charSequence)) {
                    c9919.m25743(iMo23442, "Unterminated string literal");
                } else if (type == 4 && (iMo23440 - iMo23442 < 3 || charSequence.charAt(iMo23440 - 1) != '*' || charSequence.charAt(iMo23440) != '/')) {
                    c9919.m25743(iMo23442, "Unterminated block comment");
                }
            }
        }
        C4700 c4700 = new C4700(charSequence, c25056, enumC7440, c14151.m34373(), c14612);
        EnumC7440 enumC7441 = EnumC7440.JSON;
        AbstractC11629 c6410 = enumC7440 == enumC7441 ? new C6410(c25056) : new C1935(c25056);
        c6410.m24867(new C1189(c6410, new C0443(c6410.mo6669())));
        c6410.m29204(enumC7440 == EnumC7440.TYPESCRIPT);
        c6410.m29203(c14612);
        c6410.m24869();
        if (c9919 != null) {
            c6410.m24868(c9919);
        }
        c6410.m24868(c4700);
        c6410.m2515(new C18342());
        boolean z = enumC7440 != enumC7441 && C14612.m35252(c25056.m11539());
        C21326 c21326 = new C21326(enumC7440 == enumC7441, (c14612 == null && z) ? false : true, z);
        c6410.m2519();
        c6410.m2514(c21326);
        try {
            if (c6410 instanceof C6410) {
                ((C6410) c6410).m18173();
            } else {
                while (c25056.mo11537(1) != -1) {
                    int iIndex = c25056.index();
                    ((C1935) c6410).m6710();
                    if (c25056.index() == iIndex) {
                        c25056.mo11538();
                    }
                }
            }
            return new C16850(c25056, c4700, c21326);
        } catch (C13866 unused) {
            return null;
        }
    }
}
