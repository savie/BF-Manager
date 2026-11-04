package l;

/* JADX INFO: renamed from: l.ۛ֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6041 extends AbstractC16481 implements InterfaceC3057 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C17973 f20666;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f20667;

    public C6041(int i, AbstractC1566 abstractC1566) {
        this.f976 = abstractC1566;
        this.f20667 = i;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final int m17532() {
        return this.f20667;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6041 m17533(AbstractC1566 abstractC1566) {
        return m17523(this.f20667, abstractC1566, this.f20666);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6041 m17524(int i, C17973 c17973) {
        return m17523(i, this.f976, c17973);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6041 m17525(C2551 c2551) {
        C6041 c6041M17523 = m17523(this.f20667, this.f976, (C17973) null);
        c2551.m8497(c6041M17523);
        return c6041M17523;
    }

    @Override // l.AbstractC16481
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C6041 mo17528() {
        return m17523(this.f20667, this.f976, this.f20666);
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m17531() {
        return this.f976;
    }

    @Override // l.AbstractC0074
    public final AbstractC1566 getType() {
        C17973 c17973 = this.f20666;
        if (c17973 != null) {
            return c17973.m41943().m51445();
        }
        return AbstractC1566.f5420;
    }

    @Override // l.AbstractC0074
    /* JADX INFO: renamed from: ۙ */
    public final void mo1130(AbstractC1566 abstractC1566) {
        C17973 c17973 = this.f20666;
        if (c17973 == null) {
            throw new C8597("Can't change type for register without SSA variable: " + this);
        }
        c17973.m41948(abstractC1566);
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m17537() {
        C17973 c17973 = this.f20666;
        if (c17973 != null) {
            return c17973.m41941();
        }
        if (mo17865(EnumC1763.IMMUTABLE_TYPE)) {
            return this.f976;
        }
        return null;
    }

    @Override // l.AbstractC0074
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1129() {
        C17973 c17973 = this.f20666;
        if (c17973 != null) {
            return c17973.m41942();
        }
        return mo17865(EnumC1763.IMMUTABLE_TYPE);
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final C17973 m17530() {
        return this.f20666;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m17534(C6041 c6041) {
        return this.f20666.m41945() == c6041.f20666.m41945();
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17536() {
        return this.f20666.m41945().m28519().size() > 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17526(C17973 c17973) {
        this.f20666 = c17973;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final void m17522() {
        this.f20666 = null;
    }

    @Override // l.InterfaceC3057
    public final String getName() {
        if (mo17865(EnumC1763.SUPER)) {
            return "super";
        }
        if (mo17865(EnumC1763.THIS)) {
            return "this";
        }
        C17973 c17973 = this.f20666;
        if (c17973 == null) {
            return null;
        }
        return c17973.getName();
    }

    @Override // l.InterfaceC3057
    public final void setName(String str) {
        C17973 c17973 = this.f20666;
        if (c17973 == null || str == null) {
            return;
        }
        c17973.m41931(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6041 m17523(int i, AbstractC1566 abstractC1566, C17973 c17973) {
        C6041 c6041 = new C6041(i, abstractC1566);
        if (c17973 != null) {
            c6041.f20666 = c17973;
        }
        c6041.m39414((AbstractC16678) this);
        c6041.mo39114(this.f53443);
        return c6041;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C18959 m17529() {
        C17973 c17973 = this.f20666;
        if (c17973 == null) {
            return null;
        }
        return c17973.m41930().f53443;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m17535(AbstractC16481 abstractC16481) {
        if (this == abstractC16481) {
            return true;
        }
        abstractC16481.getClass();
        if (!(abstractC16481 instanceof C6041)) {
            return false;
        }
        C6041 c6041 = (C6041) abstractC16481;
        return this.f20667 == c6041.f20667 && C17359.equals(this.f20666, c6041.f20666);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17527(AbstractC16481 abstractC16481) {
        abstractC16481.getClass();
        if (abstractC16481 instanceof C6041) {
            return this.f20667 == ((C6041) abstractC16481).f20667;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20667;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6041)) {
            return false;
        }
        C6041 c6041 = (C6041) obj;
        return this.f20667 == c6041.f20667 && C17359.equals(this.f20666, c6041.f20666);
    }

    @Override // l.AbstractC16678
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String mo17521() {
        StringBuilder sb = new StringBuilder("r");
        sb.append(this.f20667);
        if (this.f20666 != null) {
            sb.append('v');
            sb.append(this.f20666.m41936());
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(r");
        sb.append(this.f20667);
        if (this.f20666 != null) {
            sb.append('v');
            sb.append(this.f20666.m41936());
        }
        if (getName() != null) {
            sb.append(" '");
            sb.append(getName());
            sb.append('\'');
        }
        AbstractC1566 type = this.f20666 != null ? getType() : null;
        if (type != null) {
            sb.append(' ');
            sb.append(type);
        }
        AbstractC1566 abstractC1566 = this.f976;
        if (type == null || (!type.equals(abstractC1566) && !type.mo5564())) {
            sb.append(" I:");
            sb.append(abstractC1566);
        }
        if (!m39417()) {
            sb.append(' ');
            sb.append(m39420());
        }
        sb.append(')');
        return sb.toString();
    }
}
