package l;

/* JADX INFO: renamed from: l.᩻ۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16FJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C24949 extends C18959 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f80777;

    public C24949(int i, AbstractC1566 abstractC1566) {
        super(EnumC24203.FILLED_NEW_ARRAY, i);
        this.f80777 = abstractC1566;
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m55705() {
        return this.f80777;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m55706() {
        return AbstractC1566.m5528(this.f80777);
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        return (c18959 instanceof C24949) && super.mo4075(c18959) && this.f80777 == ((C24949) c18959).f80777;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public final C18959 mo4072() {
        C24949 c24949 = new C24949(m44039(), this.f80777);
        m44033(c24949);
        return c24949;
    }

    @Override // l.C18959
    public final String toString() {
        return super.toString() + " elemType: " + this.f80777;
    }
}
