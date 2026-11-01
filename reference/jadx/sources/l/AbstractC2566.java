package l;

import java.util.EnumSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2566 extends AbstractC10329 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f10125;

    /* JADX INFO: renamed from: ܰ */
    public abstract AbstractC23903 mo3562(C4603 c4603, EnumC11678 enumC11678);

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC2566(C20145 c20145, AbstractC11242 abstractC11242, AbstractC16579 abstractC16579, C21825 c21825, C21825 c21826) {
        EnumC11678 enumC11678 = EnumC11678.f39283;
        this.f10125 = c20145;
        super(abstractC11242, abstractC16579, c21825, c21826, enumC11678);
    }

    @Override // l.AbstractC10329
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC23903 mo5434(C4603 c4603, EnumC11678 enumC11678) {
        AbstractC23903 abstractC23903Mo3562 = mo3562(c4603, enumC11678);
        if (abstractC23903Mo3562.f77452 != EnumC10477.f35883) {
            return abstractC23903Mo3562;
        }
        C14294 c14294 = (C14294) abstractC23903Mo3562.mo10880();
        AbstractC16579 abstractC16579 = this.f35427;
        return (AbstractC23903) c14294.f46832.f65444.m52367(c14294.f46831.m48589(), abstractC16579, true).orElse(c14294);
    }

    @Override // l.AbstractC10329
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 mo8017(C4603 c4603, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC23903 abstractC23904) {
        if (!abstractC23904.f77452.m26583()) {
            return abstractC23904;
        }
        AbstractC16579 abstractC16579 = this.f35427;
        C21825 c21825 = this.f35429;
        C20145 c20145 = this.f10125;
        return c20145.m45546(abstractC23904, interfaceC12260, abstractC23903, abstractC16579, this.f35430, true, this.f35428, c21825, (InterfaceC19501) c20145.f65434);
    }

    @Override // l.AbstractC10329
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8018(InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903) {
        C11948 c11948M51910;
        C11948 c11948M51911;
        AbstractC16579 abstractC16579 = this.f35427;
        C20145 c20145 = this.f10125;
        C20414 c20414 = c20145.f65441;
        C3836 c3836 = c20145.f65410;
        C23549 c23549 = c20145.f65420;
        EnumSet enumSet = c20145.f65429;
        boolean zM26583 = abstractC23903.f77452.m26583();
        if (zM26583 || enumSet.contains(EnumC15912.SUCCESS)) {
            if (!zM26583 || enumSet.contains(EnumC15912.FAILURE)) {
                if (abstractC23903.f77453 == c20145.f65436.f77632 && abstractC23903.f77448 == c3836.f14275.f53222 && !enumSet.contains(EnumC15912.OBJECT_INIT)) {
                    return;
                }
                if (abstractC16579 != c3836.f14262.f77449 || enumSet.contains(EnumC15912.PREDEF)) {
                    if (!c20145.f65437.f20638 || enumSet.contains(EnumC15912.INTERNAL)) {
                        C19003 c19003 = new C19003();
                        int i = -1;
                        int i2 = 0;
                        for (C17384 c17384 : c20145.f65437.f20639) {
                            EnumC11678 enumC11678 = c20145.f65437.f20637;
                            EnumC11678 enumC11679 = c17384.f55331;
                            AbstractC23903 abstractC23904 = c17384.f55329;
                            if (enumC11678 != enumC11679 || ((c17384.m40497() && !enumSet.contains(EnumC15912.APPLICABLE)) || !(c17384.m40497() || enumSet.contains(EnumC15912.INAPPLICABLE)))) {
                                enumSet = enumSet;
                            } else {
                                if (c17384.m40497()) {
                                    AbstractC16579 abstractC165710 = c17384.f55332;
                                    if (abstractC23904.f77449.m39001(EnumC6617.FORALL)) {
                                        C14377 c14377 = C14707.f48054;
                                        c11948M51911 = c23549.m51910(new C14377("compiler", "partial.inst.sig", abstractC165710));
                                    } else {
                                        c11948M51911 = null;
                                    }
                                    c11948M51910 = c23549.m51914(c11948M51911 == null ? "applicable.method.found" : "applicable.method.found.1", Integer.valueOf(i2), abstractC23904, c11948M51911);
                                } else {
                                    C11948 c11948 = c17384.f55330;
                                    C14377 c14378 = C14707.f48054;
                                    c11948M51910 = c23549.m51910(new C14377("compiler", "not.applicable.method.found", Integer.valueOf(i2), abstractC23904, c11948));
                                }
                                c19003.m43723(c11948M51910);
                                if (abstractC23904 == abstractC23903) {
                                    i = i2;
                                }
                                i2++;
                            }
                            enumSet = enumSet;
                        }
                        String str = !zM26583 ? "verbose.resolve.multi" : "verbose.resolve.multi.1";
                        C5870 c5870 = c20145.f65438;
                        C13638.requireNonNull(c5870);
                        c20414.mo46176(new C1675(c23549.m51909((EnumC0597) null, EnumSet.noneOf(EnumC0264.class), c20414.m48186(), interfaceC12260, c23549.m51913(str, this.f35430, abstractC16579.f53222, Integer.valueOf(i), c20145.f65437.f20637, c20145.m45522(this.f35428.m48592((Function) new C12221(c5870, EnumC9729.SPECULATIVE, abstractC23903, c20145.f65437.f20637))), c20145.m45522(this.f35429))), c19003.m43726()));
                    }
                }
            }
        }
    }
}
