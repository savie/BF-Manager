package l;

/* JADX INFO: renamed from: l.ۧܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46PA */
/* JADX INFO: loaded from: classes3.dex */
public final class C11137 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28067(CharSequence charSequence, EnumC18877 enumC18877, C12052 c12052, C8294 c8294, boolean z, C18503 c18503) {
        try {
            C18567.m42975();
            C19273 c19273M28066 = m28066(charSequence, enumC18877, c8294);
            if (c19273M28066 == null) {
                c18503.append(charSequence);
            } else {
                C18567.m42975();
                new C15040(c19273M28066, c12052, c8294, z, c18503).m36028();
            }
        } catch (StackOverflowError e) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit", e);
        } catch (C17861 unused) {
            throw new InterruptedException("Code transformation cancelled");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19273 m28066(CharSequence charSequence, EnumC18877 enumC18877, C8294 c8294) {
        C6197 c6197M28065;
        C6197 c6197M28066 = m28065(charSequence, enumC18877, c8294, null);
        if (c6197M28066 != null && enumC18877 != EnumC18877.JSON && C2338.m7092(c6197M28066.f21078.m13723())) {
            C2338 c2338 = c6197M28066.f21079;
            int i = 0;
            while (true) {
                if (i >= 3 || (c6197M28065 = m28065(charSequence, enumC18877, c8294, c2338)) == null) {
                    c6197M28066 = null;
                    break;
                }
                C2338 c2339 = c6197M28065.f21079;
                if (c2338.m7095(c2339, c6197M28065.f21078.m13723())) {
                    c6197M28066 = c6197M28065;
                    break;
                }
                i++;
                c2338 = c2339;
            }
        }
        if (c6197M28066 == null) {
            return null;
        }
        C19273 c19273 = c6197M28066.f21081;
        c19273.m44244(c6197M28066.f21080);
        c19273.m44245(c19273.f62230);
        return c19273;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6197 m28065(CharSequence charSequence, EnumC18877 enumC18877, C8294 c8294, C2338 c2338) {
        C18567 c18567 = new C18567(charSequence);
        C19583 c19583 = new C19583(c18567);
        c19583.m4949(new C10101(c19583, c18567));
        EnumC18877 enumC18878 = EnumC18877.JSON;
        c19583.m20111(enumC18877 == enumC18878);
        c19583.m20110(c2338);
        c19583.m43805();
        C17486 c17486 = new C17486(c19583, charSequence.length());
        c17486.m13728();
        C19273 c19273 = new C19273(charSequence, c17486, enumC18877, c8294.m21730(), c2338);
        AbstractC12548 c4455 = enumC18877 == enumC18878 ? new C4455(c17486) : new C16781(c17486);
        c4455.m43802(new C22801(c4455, new C0927(c4455.mo5091())));
        c4455.m31225(enumC18877 == EnumC18877.TYPESCRIPT);
        c4455.m31224(c2338);
        c4455.m43805();
        c4455.m43803(c19273);
        c4455.m18910(new C22095());
        boolean z = enumC18877 != enumC18878 && C2338.m7092(c17486.m13723());
        C5161 c5161 = new C5161(enumC18877 == enumC18878, (c2338 == null && z) ? false : true, z);
        c4455.m18917();
        c4455.m18912(c5161);
        try {
            if (c4455 instanceof C4455) {
                ((C4455) c4455).m12435();
            } else {
                while (c17486.mo11332(1) != -1) {
                    int iIndex = c17486.index();
                    ((C16781) c4455).m39376();
                    if (c17486.index() == iIndex) {
                        c17486.mo11333();
                    }
                }
            }
            return new C6197(c17486, c19273, c5161);
        } catch (C7984 unused) {
            return null;
        }
    }
}
