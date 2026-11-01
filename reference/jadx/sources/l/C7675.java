package l;

import java.util.Locale;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۟᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public class C7675 extends AbstractC0618 implements InterfaceC4164 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C19670 f25392;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC2173 f25393;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C22492 f25394;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC9462 f25395;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC11242 f25396;

    @Override // l.AbstractC23903, l.InterfaceC15767
    /* JADX INFO: renamed from: ᩳ */
    public final int mo1941() {
        return 20;
    }

    public C7675(AbstractC11242 abstractC11242, AbstractC23903 abstractC23903) {
        super(EnumC10477.f35867, 0L, abstractC11242, null, abstractC23903);
        this.f25395 = null;
        this.f25396 = AbstractC0618.m2876(abstractC11242, abstractC23903);
        this.f77449 = new C2466(this, C3794.f13674);
    }

    @Override // l.AbstractC23903
    public String toString() {
        return this.f25396.toString();
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 mo20270() {
        return this.f25396;
    }

    @Override // l.InterfaceC4164
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC11242 mo11809() {
        return this.f25396;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20275() {
        return this.f77453.isEmpty() && this.f77448 != null;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9462 mo20272() {
        mo49994();
        return this.f25395;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long mo20276() {
        mo49994();
        return this.f77447;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C21825 mo20271() {
        mo49994();
        C22492 c22492 = this.f25394;
        if (c22492 != null) {
            c22492.mo49994();
            if (this.f77450 == null && this.f25394.f77450 != null) {
                C14731 c14731 = new C14731(this);
                this.f77450 = c14731;
                c14731.m35281(this.f25394.f77450);
            }
        }
        return super.mo20271();
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean mo20273() {
        return (this.f77447 & X931RNG.BLOCK128_RESEED_MAX) != 0;
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ۙ */
    public final EnumC1923 mo17325() {
        return EnumC1923.PACKAGE;
    }

    @Override // l.AbstractC0618, l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ۬ */
    public final AbstractC23903 mo2880() {
        C19670 c19670 = this.f25392;
        if (c19670 == null) {
            return null;
        }
        c19670.getClass();
        if (c19670 instanceof C22182) {
            return null;
        }
        return this.f25392;
    }

    @Override // l.InterfaceC14625
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3841(AbstractC7693 abstractC7693, Object obj) {
        return abstractC7693.mo18689(this, obj);
    }

    @Override // l.AbstractC0618, l.AbstractC23903
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2879(InterfaceC11203 interfaceC11203, Locale locale) {
        return interfaceC11203.mo24874(this, (Object) locale);
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final void m20274() {
        this.f77450 = null;
    }
}
