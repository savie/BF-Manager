package l;

/* JADX INFO: renamed from: l.ۛ֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3IRZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6019 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23283 m17484(C24927 c24927) {
        if (c24927.mo17865(EnumC1763.DONT_GENERATE) && !C8314.m22412(c24927)) {
            return InterfaceC23283.f75440;
        }
        C6129 c6129M5681 = c24927.mo8527().m5681();
        C11984 c11984 = new C11984(c24927, null, c6129M5681.m17710(), C8314.m22398(c24927) == EnumC15823.FALLBACK, c6129M5681.m17717(), c6129M5681.m17696());
        try {
            return c11984.m30107();
        } catch (Exception e) {
            EnumC1763 enumC1763 = EnumC1763.RESTART_CODEGEN;
            if (c24927.mo17865(enumC1763)) {
                c24927.m39418(enumC1763);
                try {
                    return c11984.m30107();
                } catch (Exception e2) {
                    throw new C8597("Code generation error after restart", e2);
                }
            }
            throw new C8597("Code generation error", e);
        }
    }
}
