package l;

/* JADX INFO: renamed from: l.ۗۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3IVQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C3319 extends C18959 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Object f10829;

    public C3319(EnumC24203 enumC24203, Object obj, int i) {
        super(enumC24203, i);
        this.f10829 = obj;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final Object m10937() {
        return this.f10829;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10935(AbstractC1566 abstractC1566) {
        this.f10829 = abstractC1566;
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m10936() {
        return (AbstractC1566) this.f10829;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public final C18959 mo4072() {
        C3319 c3319 = new C3319(this.f61472, this.f10829, m44039());
        m44033(c3319);
        return c3319;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        if ((c18959 instanceof C3319) && super.mo4075(c18959)) {
            return C17359.equals(this.f10829, ((C3319) c18959).f10829);
        }
        return false;
    }

    @Override // l.C18959
    public final String toString() {
        int[] iArr = C23457.f75909;
        EnumC24203 enumC24203 = this.f61472;
        int i = iArr[enumC24203.ordinal()];
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(C8314.m22396(this.f61471));
            sb.append(": ");
            sb.append(enumC24203);
            sb.append(' ');
            if (m44027() != null) {
                sb.append(m44027());
                sb.append(" = ");
            }
            sb.append('(');
            sb.append(C8314.m22397(this.f10829));
            sb.append(") ");
            sb.append(C4123.m13221(m44026(), ", "));
            return sb.toString();
        }
        return super.toString() + ' ' + C8314.m22397(this.f10829);
    }
}
