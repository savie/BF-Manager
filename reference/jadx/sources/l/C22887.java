package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩸ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22887 extends AbstractC14681 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f74358;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22887(C11172 c11172, AbstractC19728 abstractC19728, EnumC3539 enumC3539, EnumSet enumSet) {
        super(c11172, abstractC19728, enumC3539, enumSet);
        this.f74358 = c11172;
    }

    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32705(EnumC4241 enumC4241) {
        return super.mo32705(enumC4241) && this.f74358.f35180;
    }

    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ۙ */
    public final void mo2564(int i, AbstractC11781 abstractC11781) {
        C14769 c14769M43093;
        C14769 c14769M43094;
        if (abstractC11781.f38066 == EnumC13603.f43213) {
            AbstractC11781 abstractC11782 = abstractC11781.f38069;
            if (abstractC11782.f38066 == EnumC13603.f43214) {
                C2920 c2920 = (C2920) abstractC11782;
                EnumSet enumSet = c2920.f9552;
                C18499 c18499 = new C18499();
                C11172 c11172 = this.f74358;
                C22273 c22273 = c11172.f35205;
                char cM28138 = c11172.m28138();
                C15252 c15252 = c11172.f35209;
                C17359.requireNonNull(c15252);
                AbstractC19728 abstractC19728 = (AbstractC19728) c22273.m50344(cM28138, new C18136(c15252));
                AbstractC19728 abstractC19729 = c11172.f35175.f38072;
                if (abstractC19729 != abstractC19728) {
                    throw c11172.m28121("module.name.mismatch", abstractC19728, abstractC19729);
                }
                char cM28139 = c11172.m28138();
                EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC1429.class);
                for (EnumC1429 enumC1429 : EnumC1429.values()) {
                    if ((enumC1429.f5028 & cM28139) != 0) {
                        enumSetNoneOf.add(enumC1429);
                    }
                }
                enumSet.addAll(enumSetNoneOf);
                char cM281310 = c11172.m28138();
                C22273 c22274 = c11172.f35205;
                C17359.requireNonNull(c22274);
                c2920.f9556 = (AbstractC19728) C11172.m28110(cM281310, new C6523(c22274), (Object) null);
                C18499 c184910 = new C18499();
                char cM281311 = c11172.m28138();
                for (int i2 = 0; i2 < cM281311; i2++) {
                    C2920 c2920M50339 = c11172.f35205.m50339(c11172.m28138());
                    char cM281312 = c11172.m28138();
                    EnumSet enumSetNoneOf2 = EnumSet.noneOf(EnumC7638.class);
                    for (EnumC7638 enumC7638 : EnumC7638.values()) {
                        if ((enumC7638.f25206 & cM281312) != 0) {
                            enumSetNoneOf2.add(enumC7638);
                        }
                    }
                    if (c2920M50339 == c11172.f35200.f48304 && c11172.f35215 >= EnumC3539.V54.f12156) {
                        EnumC7638 enumC7639 = EnumC7638.TRANSITIVE;
                        if (enumSetNoneOf2.contains(enumC7639)) {
                            throw c11172.m28121("bad.requires.flag", enumC7639);
                        }
                        EnumC7638 enumC76310 = EnumC7638.STATIC_PHASE;
                        if (enumSetNoneOf2.contains(enumC76310)) {
                            throw c11172.m28121("bad.requires.flag", enumC76310);
                        }
                    }
                    c11172.m28138();
                    c184910.m43089(new C0180(c2920M50339, enumSetNoneOf2));
                }
                C14769 c14769M43095 = c184910.m43093();
                c2920.f9551 = c14769M43095;
                c18499.addAll(c14769M43095);
                C18499 c184911 = new C18499();
                char cM281313 = c11172.m28138();
                for (int i3 = 0; i3 < cM281313; i3++) {
                    C14106 c14106M50341 = c11172.f35205.m50341(c11172.m28138());
                    char cM281314 = c11172.m28138();
                    EnumSet enumSetNoneOf3 = EnumSet.noneOf(EnumC3909.class);
                    for (EnumC3909 enumC3909 : EnumC3909.values()) {
                        if ((enumC3909.f13364 & cM281314) != 0) {
                            enumSetNoneOf3.add(enumC3909);
                        }
                    }
                    char cM281315 = c11172.m28138();
                    if (cM281315 == 0) {
                        c14769M43094 = null;
                    } else {
                        C18499 c184912 = new C18499();
                        for (int i4 = 0; i4 < cM281315; i4++) {
                            c184912.m43089(c11172.f35205.m50339(c11172.m28138()));
                        }
                        c14769M43094 = c184912.m43093();
                    }
                    c184911.m43089(new C24047(c14106M50341, c14769M43094, enumSetNoneOf3));
                }
                C14769 c14769M43096 = c184911.m43093();
                c2920.f9546 = c14769M43096;
                c18499.addAll(c14769M43096);
                C18499 c184913 = new C18499();
                char cM281316 = c11172.m28138();
                if (cM281316 != 0 && enumSet.contains(EnumC1429.OPEN)) {
                    throw c11172.m28121("module.non.zero.opens", c11172.f35175.f38072);
                }
                for (int i5 = 0; i5 < cM281316; i5++) {
                    C14106 c14106M50342 = c11172.f35205.m50341(c11172.m28138());
                    char cM281317 = c11172.m28138();
                    EnumSet enumSetNoneOf4 = EnumSet.noneOf(EnumC21063.class);
                    for (EnumC21063 enumC21063 : EnumC21063.values()) {
                        if ((enumC21063.f67308 & cM281317) != 0) {
                            enumSetNoneOf4.add(enumC21063);
                        }
                    }
                    char cM281318 = c11172.m28138();
                    if (cM281318 == 0) {
                        c14769M43093 = null;
                    } else {
                        C18499 c184914 = new C18499();
                        for (int i6 = 0; i6 < cM281318; i6++) {
                            c184914.m43089(c11172.f35205.m50339(c11172.m28138()));
                        }
                        c14769M43093 = c184914.m43093();
                    }
                    c184913.m43089(new C14349(c14106M50342, c14769M43093, enumSetNoneOf4));
                }
                C14769 c14769M43097 = c184913.m43093();
                c2920.f9558 = c14769M43097;
                c18499.addAll(c14769M43097);
                c2920.f9543 = c18499.m43093();
                C18499 c184915 = new C18499();
                char cM281319 = c11172.m28138();
                for (int i7 = 0; i7 < cM281319; i7++) {
                    c184915.m43089(new C1258((AbstractC19728) c11172.f35205.m50336(c11172.m28138(), new InterfaceC10777() { // from class: l.ۤܶۘ
                        @Override // l.InterfaceC10777
                        /* JADX INFO: renamed from: ۙ */
                        public final Object mo27471(int i8, int i9, byte[] bArr) {
                            return this.f34618.f74358.f35209.m36600(C20693.m47329(i8, i9, bArr));
                        }
                    })));
                }
                c11172.f35208 = c184915.m43093();
                C18499 c184916 = new C18499();
                char cM281320 = c11172.m28138();
                for (int i8 = 0; i8 < cM281320; i8++) {
                    AbstractC19728 abstractC197210 = (AbstractC19728) c11172.f35205.m50336(c11172.m28138(), new InterfaceC10777() { // from class: l.ۤܶۘ
                        @Override // l.InterfaceC10777
                        /* JADX INFO: renamed from: ۙ */
                        public final Object mo27471(int i9, int i10, byte[] bArr) {
                            return this.f34618.f74358.f35209.m36600(C20693.m47329(i9, i10, bArr));
                        }
                    });
                    char cM281321 = c11172.m28138();
                    C18499 c184917 = new C18499();
                    for (int i9 = 0; i9 < cM281321; i9++) {
                        c184917.m43089((AbstractC19728) c11172.f35205.m50336(c11172.m28138(), new InterfaceC10777() { // from class: l.ۤܶۘ
                            @Override // l.InterfaceC10777
                            /* JADX INFO: renamed from: ۙ */
                            public final Object mo27471(int i10, int i11, byte[] bArr) {
                                return this.f34618.f74358.f35209.m36600(C20693.m47329(i10, i11, bArr));
                            }
                        }));
                        c184916.m43089(new C10206(abstractC197210, c184917.m43093()));
                    }
                }
                c11172.f35178 = c184916.m43093();
            }
        }
    }
}
