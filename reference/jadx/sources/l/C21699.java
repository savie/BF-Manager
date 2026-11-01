package l;

/* JADX INFO: renamed from: l.᩸ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6OY */
/* JADX INFO: loaded from: classes4.dex */
public final class C21699 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48445(CharSequence charSequence, C12052 c12052, C5701 c5701, EnumC16990 enumC16990, boolean z, C18503 c18503) {
        C23289 c23289M18499;
        try {
            C3894.m11326();
            C1467 c1467 = new C1467(new C3894(charSequence));
            c1467.m43805();
            C15350 c15350 = new C15350(c1467);
            c15350.m13728();
            int iMax = 0;
            for (InterfaceC19761 interfaceC19761 : c15350.m13723()) {
                C3894.m11326();
                int type = interfaceC19761.getType();
                if (type == 15 || type == 19 || type == 8 || type == 17) {
                    iMax++;
                    if (iMax > 128) {
                        throw new IllegalArgumentException("Source nesting exceeds formatter limit");
                    }
                } else if (type == 16 || type == 20 || type == 18) {
                    iMax = Math.max(0, iMax - 1);
                }
            }
            C6882 c6882 = new C6882(c15350);
            c6882.m43805();
            int i = C23111.f75071[enumC16990.ordinal()];
            if (i == 1) {
                c23289M18499 = c6882.m18499();
            } else if (i == 2) {
                c23289M18499 = c6882.m18493();
            } else {
                if (i != 3) {
                    throw new IncompatibleClassChangeError();
                }
                c23289M18499 = c6882.m18495();
            }
            C14169 c14169 = new C14169(charSequence, c15350, c23289M18499, c12052, c5701, z, c18503);
            c14169.m34253(enumC16990);
            c14169.m34252();
        } catch (StackOverflowError e) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit", e);
        } catch (C13068 unused) {
            throw new InterruptedException("Code transformation cancelled");
        }
    }
}
