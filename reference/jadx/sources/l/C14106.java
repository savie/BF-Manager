package l;

import java.util.Locale;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۬᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public class C14106 extends AbstractC22970 implements InterfaceC6042 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC17836 f44616;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C24550 f44617;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C2920 f44618;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC19728 f44619;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC15976 f44620;

    @Override // l.AbstractC11781, l.InterfaceC13564
    /* JADX INFO: renamed from: ܶ */
    public final int mo2973() {
        return 20;
    }

    public C14106(AbstractC19728 abstractC19728, AbstractC11781 abstractC11781) {
        super(EnumC13603.f43219, 0L, abstractC19728, null, abstractC11781);
        this.f44616 = null;
        this.f44619 = AbstractC22970.m51843(abstractC19728, abstractC11781);
        this.f38067 = new C20207(this, C14458.f45498);
    }

    @Override // l.AbstractC11781
    public String toString() {
        return this.f44619.toString();
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۬ */
    public final AbstractC19728 mo29582() {
        return this.f44619;
    }

    @Override // l.InterfaceC6042
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC19728 mo9562() {
        return this.f44619;
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34259() {
        return this.f38072.isEmpty() && this.f38069 != null;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۛۙ */
    public final AbstractC17836 mo29571() {
        mo29590();
        return this.f44616;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ᩳ */
    public final long mo29591() {
        mo29590();
        return this.f38071;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۙۙ */
    public final C14769 mo29568() {
        mo29590();
        C24550 c24550 = this.f44617;
        if (c24550 != null) {
            c24550.mo29590();
            if (this.f38068 == null && this.f44617.f38068 != null) {
                C25208 c25208 = new C25208(this);
                this.f38068 = c25208;
                c25208.m56192(this.f44617.f38068);
            }
        }
        return super.mo29568();
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo7873() {
        return (this.f38071 & X931RNG.BLOCK128_RESEED_MAX) != 0;
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ۙ */
    public final EnumC5296 mo9558() {
        return EnumC5296.PACKAGE;
    }

    @Override // l.AbstractC22970, l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11781 mo16951() {
        C2920 c2920 = this.f44618;
        if (c2920 == null) {
            return null;
        }
        c2920.getClass();
        if (c2920 instanceof C6562) {
            return null;
        }
        return this.f44618;
    }

    @Override // l.InterfaceC12753
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7871(AbstractC9024 abstractC9024, Object obj) {
        return abstractC9024.mo24077(this, obj);
    }

    @Override // l.AbstractC22970, l.AbstractC11781
    /* JADX INFO: renamed from: ۙ */
    public final Object mo16953(InterfaceC2087 interfaceC2087, Locale locale) {
        return interfaceC2087.mo7181(this, (Object) locale);
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final void m34260() {
        this.f38068 = null;
    }
}
