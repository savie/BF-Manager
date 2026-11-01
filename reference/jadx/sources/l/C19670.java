package l;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes5.dex */
public class C19670 extends AbstractC0618 implements InterfaceC5576 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C21825 f63134;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21825 f63135;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4290 f63136;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final EnumSet f63137;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4290 f63138;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C22492 f63139;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C21825 f63140;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public C7675 f63141;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C21825 f63142;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4290 f63143;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final EnumSet f63144;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C21825 f63145;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C21825 f63146;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC13320 f63147;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public Map f63148;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC11242 f63149;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f63150;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public C21825 f63151;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC4290 f63152;

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final C22492 mo44804() {
        return null;
    }

    @Override // l.AbstractC23903, l.InterfaceC15767
    /* JADX INFO: renamed from: ᩳ */
    public final int mo1941() {
        return 19;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo44803() {
        return (this.f77447 & 18014398509481984L) != 0;
    }

    @Override // l.InterfaceC5576, l.InterfaceC4164
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC11242 mo11809() {
        return this.f77453;
    }

    public C19670(AbstractC11242 abstractC11242) {
        super(EnumC10477.f35868, 0L, abstractC11242, null, null);
        this.f63135 = C21825.m48588();
        this.f63147 = InterfaceC13320.f44208;
        this.f63137 = EnumSet.noneOf(EnumC18964.class);
        this.f63144 = EnumSet.noneOf(EnumC8381.class);
        C6171.m17171(abstractC11242);
        this.f77449 = new C11640(this, C3794.f13674);
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 mo2883() {
        return C17281.m40243(this.f77453);
    }

    @Override // l.AbstractC0618, l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC11242 mo2883() {
        return C17281.m40243(this.f77453);
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44806() {
        return this.f77453.isEmpty() && this.f77448 == null;
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ۙ */
    public final EnumC1923 mo17325() {
        return EnumC1923.MODULE;
    }

    @Override // l.AbstractC23903
    public String toString() {
        AbstractC11242 abstractC11242 = this.f77453;
        if (abstractC11242 == null) {
            return "<unknown>";
        }
        return abstractC11242.isEmpty() ? "<unnamed>" : String.valueOf(this.f77453);
    }

    @Override // l.InterfaceC14625
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3841(AbstractC7693 abstractC7693, Object obj) {
        return abstractC7693.mo20329(this, obj);
    }

    @Override // l.AbstractC0618, l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ܶ */
    public final C21825 mo2882() {
        C21825 c21825M48588 = C21825.m48588();
        for (AbstractC23903 abstractC23903 : this.f63135) {
            if (abstractC23903.mo20272().mo9330(new C18798(1))) {
                c21825M48588 = c21825M48588.m48597(abstractC23903);
            }
        }
        return c21825M48588;
    }
}
