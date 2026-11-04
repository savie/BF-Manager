package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۘ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes3.dex */
public class C4417 extends C24555 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumSet f15854;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14528 f15855;

    public C4417(C14528 c14528, C8274 c8274, EnumC0816 enumC0816, EnumC0816... enumC0816Arr) {
        this(c14528, c8274, EnumSet.of(enumC0816, enumC0816Arr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4417(C14528 c14528, C8274 c8274, EnumSet enumSet) {
        super(c14528, c8274, c8274.m22338(), EnumC0816.f3094);
        this.f15855 = c14528;
        this.f15854 = enumSet;
    }

    @Override // l.C24555, l.AbstractC21988
    /* JADX INFO: renamed from: ۙ */
    public AbstractC21988 mo13163(C8274 c8274) {
        return new C4417(this.f15855, c8274, this.f15854);
    }

    @Override // l.C24555
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumSet mo14041() {
        return this.f15854;
    }

    @Override // l.C24555
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14042(EnumC0816 enumC0816, EnumC0816 enumC0817) {
        C19991 c19991 = this.f15855.f45702;
        int i = C23809.f77128[enumC0817.ordinal()];
        C8274 c8274 = this.f70943;
        if (i == 1) {
            AbstractC22664 abstractC22664M22338 = c8274.m22338();
            C14769 c14769M22332 = c8274.m22332(enumC0817);
            C15515 c15515 = C19859.f63823;
            throw C14528.m35046(c19991.m45975(new C15515("compiler", "inferred.do.not.conform.to.eq.bounds", abstractC22664M22338, c14769M22332)));
        }
        if (i == 2) {
            AbstractC22664 abstractC22664M22339 = c8274.m22338();
            C14769 c14769M22333 = c8274.m22332(enumC0817);
            C15515 c15516 = C19859.f63823;
            throw C14528.m35046(c19991.m45975(new C15515("compiler", "inferred.do.not.conform.to.lower.bounds", abstractC22664M22339, c14769M22333)));
        }
        if (i != 3) {
            return;
        }
        AbstractC22664 abstractC22664M223310 = c8274.m22338();
        C14769 c14769M22334 = c8274.m22332(enumC0817);
        C15515 c15517 = C19859.f63823;
        throw C14528.m35046(c19991.m45975(new C15515("compiler", "inferred.do.not.conform.to.upper.bounds", abstractC22664M223310, c14769M22334)));
    }
}
