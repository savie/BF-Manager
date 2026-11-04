package l;

/* JADX INFO: renamed from: l.۟ۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: EIYI */
/* JADX INFO: loaded from: classes4.dex */
public final class C7794 extends C18959 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f25898;

    public C7794(int i, AbstractC1566 abstractC1566) {
        super(EnumC24203.NEW_ARRAY, i);
        this.f25898 = abstractC1566;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m21250() {
        return this.f25898;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        return (c18959 instanceof C7794) && super.mo4075(c18959) && this.f25898 == ((C7794) c18959).f25898;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public final C18959 mo4072() {
        C7794 c7794 = new C7794(m44039(), this.f25898);
        m44033(c7794);
        return c7794;
    }

    @Override // l.C18959
    public final String toString() {
        return super.toString() + " type: " + this.f25898;
    }
}
