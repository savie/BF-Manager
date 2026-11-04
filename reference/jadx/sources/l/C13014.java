package l;

/* JADX INFO: renamed from: l.۫ۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6CE */
/* JADX INFO: loaded from: classes4.dex */
public final class C13014 extends C18959 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f41680;

    public C13014(AbstractC1566 abstractC1566) {
        super(EnumC24203.CONST_CLASS, 0);
        this.f41680 = abstractC1566;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m32420() {
        return this.f41680;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public final C18959 mo4072() {
        C13014 c13014 = new C13014(this.f41680);
        m44033(c13014);
        return c13014;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        if ((c18959 instanceof C13014) && super.mo4075(c18959)) {
            return this.f41680.equals(((C13014) c18959).f41680);
        }
        return false;
    }

    @Override // l.C18959
    public final String toString() {
        return super.toString() + ' ' + this.f41680 + ".class";
    }
}
