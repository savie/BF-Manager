package l;

import java.util.EnumSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20344 extends AbstractC8410 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f65269;

    /* JADX INFO: renamed from: ᩷ */
    public abstract AbstractC11781 mo11152(C3168 c3168, EnumC20234 enumC20234);

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC20344(C22010 c22010, AbstractC19728 abstractC19728, AbstractC22664 abstractC22664, C14769 c14769, C14769 c147610) {
        EnumC20234 enumC20234 = EnumC20234.f64935;
        this.f65269 = c22010;
        super(abstractC19728, abstractC22664, c14769, c147610, enumC20234);
    }

    @Override // l.AbstractC8410
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11781 mo22607(C3168 c3168, EnumC20234 enumC20234) {
        AbstractC11781 abstractC11781Mo11152 = mo11152(c3168, enumC20234);
        if (abstractC11781Mo11152.f38066 != EnumC13603.f43209) {
            return abstractC11781Mo11152;
        }
        C11393 c11393 = (C11393) abstractC11781Mo11152.mo10410();
        AbstractC22664 abstractC22664 = this.f27563;
        return (AbstractC11781) c11393.f35853.f71021.m55099(c11393.f35854.m35554(), abstractC22664, true).orElse(c11393);
    }

    @Override // l.AbstractC8410
    /* JADX INFO: renamed from: ۙ */
    public AbstractC11781 mo1198(C3168 c3168, InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, AbstractC11781 abstractC11782) {
        if (!abstractC11782.f38066.m33353()) {
            return abstractC11782;
        }
        AbstractC22664 abstractC22664 = this.f27563;
        C14769 c14769 = this.f27561;
        C22010 c22010 = this.f65269;
        return c22010.m49778(abstractC11782, interfaceC5075, abstractC11781, abstractC22664, this.f27560, true, this.f27559, c14769, (InterfaceC9155) c22010.f71019);
    }

    @Override // l.AbstractC8410
    /* JADX INFO: renamed from: ۙ */
    public final void mo22608(InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781) {
        C17007 c17007M45975;
        C17007 c17007M45976;
        AbstractC22664 abstractC22664 = this.f27563;
        C22010 c22010 = this.f65269;
        C7312 c7312 = c22010.f71001;
        C14764 c14764 = c22010.f71034;
        C19991 c19991 = c22010.f71000;
        EnumSet enumSet = c22010.f71005;
        boolean zM33353 = abstractC11781.f38066.m33353();
        if (zM33353 || enumSet.contains(EnumC4856.SUCCESS)) {
            if (!zM33353 || enumSet.contains(EnumC4856.FAILURE)) {
                if (abstractC11781.f38072 == c22010.f71026.f49865 && abstractC11781.f38069 == c14764.f48286.f73596 && !enumSet.contains(EnumC4856.OBJECT_INIT)) {
                    return;
                }
                if (abstractC22664 != c14764.f48264.f38067 || enumSet.contains(EnumC4856.PREDEF)) {
                    if (!c22010.f71022.f40877 || enumSet.contains(EnumC4856.INTERNAL)) {
                        C18499 c18499 = new C18499();
                        int i = -1;
                        int i2 = 0;
                        for (C15012 c15012 : c22010.f71022.f40880) {
                            EnumC20234 enumC20234 = c22010.f71022.f40879;
                            EnumC20234 enumC20235 = c15012.f49046;
                            AbstractC11781 abstractC11782 = c15012.f49048;
                            if (enumC20234 != enumC20235 || ((c15012.m36160() && !enumSet.contains(EnumC4856.APPLICABLE)) || !(c15012.m36160() || enumSet.contains(EnumC4856.INAPPLICABLE)))) {
                                enumSet = enumSet;
                            } else {
                                if (c15012.m36160()) {
                                    AbstractC22664 abstractC22665 = c15012.f49047;
                                    if (abstractC11782.f38067.m51067(EnumC21172.FORALL)) {
                                        C15515 c15515 = C19859.f63823;
                                        c17007M45976 = c19991.m45975(new C15515("compiler", "partial.inst.sig", abstractC22665));
                                    } else {
                                        c17007M45976 = null;
                                    }
                                    c17007M45975 = c19991.m45980(c17007M45976 == null ? "applicable.method.found" : "applicable.method.found.1", Integer.valueOf(i2), abstractC11782, c17007M45976);
                                } else {
                                    C17007 c17007 = c15012.f49045;
                                    C15515 c15516 = C19859.f63823;
                                    c17007M45975 = c19991.m45975(new C15515("compiler", "not.applicable.method.found", Integer.valueOf(i2), abstractC11782, c17007));
                                }
                                c18499.m43089(c17007M45975);
                                if (abstractC11782 == abstractC11781) {
                                    i = i2;
                                }
                                i2++;
                            }
                            enumSet = enumSet;
                        }
                        String str = !zM33353 ? "verbose.resolve.multi" : "verbose.resolve.multi.1";
                        C12863 c12863 = c22010.f71035;
                        C17359.requireNonNull(c12863);
                        c7312.mo20039(new C13278(c19991.m45976((EnumC19876) null, EnumSet.noneOf(EnumC6984.class), c7312.m34514(), interfaceC5075, c19991.m45979(str, this.f27560, abstractC22664.f73596, Integer.valueOf(i), c22010.f71022.f40879, c22010.m49759(this.f27559.m35547((Function) new C19576(c12863, EnumC16124.SPECULATIVE, abstractC11781, c22010.f71022.f40879))), c22010.m49759(this.f27561))), c18499.m43093()));
                    }
                }
            }
        }
    }
}
