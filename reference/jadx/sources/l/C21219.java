package l;

/* JADX INFO: renamed from: l.᩶ۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6CK */
/* JADX INFO: loaded from: classes5.dex */
public class C21219 extends AbstractC15251 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC0336 f67722;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C21965 f67723;

    public C21219(C21965 c21965, InterfaceC7377 interfaceC7377, EnumC0336 enumC0336, boolean z) {
        this(c21965, interfaceC7377, enumC0336, enumC0336 != EnumC0336.STATIC, z);
    }

    public C21219(C21965 c21965, InterfaceC7377 interfaceC7377, EnumC0336 enumC0336, boolean z, boolean z2) {
        super(EnumC24203.INVOKE, c21965.m49705() + (z ? 1 : 0));
        this.f67723 = c21965;
        this.f67722 = enumC0336;
        int iMo20252 = z2 ? interfaceC7377.mo20252(0) : 0;
        if (z) {
            int iMo20253 = z2 ? iMo20252 : interfaceC7377.mo20252(iMo20252);
            AbstractC1566 type = c21965.m49700().getType();
            int i = AbstractC16481.f53441;
            mo44014((AbstractC16481) new C6041(iMo20253, type));
            iMo20252++;
        }
        for (AbstractC1566 abstractC1566 : c21965.m49702()) {
            int iMo20254 = z2 ? iMo20252 : interfaceC7377.mo20252(iMo20252);
            int i2 = AbstractC16481.f53441;
            mo44014((AbstractC16481) new C6041(iMo20254, abstractC1566));
            iMo20252 += abstractC1566.m5568();
        }
        interfaceC7377.getClass();
    }

    public C21219(C21965 c21965, EnumC0336 enumC0336, int i) {
        super(EnumC24203.INVOKE, i);
        this.f67723 = c21965;
        this.f67722 = enumC0336;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final EnumC0336 m48374() {
        return this.f67722;
    }

    @Override // l.AbstractC15251
    /* JADX INFO: renamed from: ᩵ۙ */
    public final C21965 mo18926() {
        return this.f67723;
    }

    @Override // l.AbstractC15251
    /* JADX INFO: renamed from: ᩺ۙ */
    public AbstractC16481 mo13131() {
        if (this.f67722 == EnumC0336.STATIC || m44039() <= 0) {
            return null;
        }
        return mo44035(0);
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48375() {
        EnumC0336 enumC0336 = EnumC0336.POLYMORPHIC;
        EnumC0336 enumC0337 = this.f67722;
        if (enumC0337 == enumC0336) {
            return true;
        }
        if (enumC0337 != EnumC0336.VIRTUAL) {
            return false;
        }
        C21965 c21965 = this.f67723;
        if (c21965.m49700().m4957().equals("java.lang.invoke.MethodHandle")) {
            return c21965.getName().equals("invoke") || c21965.getName().equals("invokeExact");
        }
        return false;
    }

    @Override // l.AbstractC15251
    /* JADX INFO: renamed from: ۛۙ */
    public int mo13126() {
        return this.f67722 == EnumC0336.STATIC ? 0 : 1;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public C18959 mo4072() {
        C21219 c21219 = new C21219(this.f67723, this.f67722, m44039());
        m44033(c21219);
        return c21219;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        if ((c18959 instanceof C21219) && super.mo4075(c18959)) {
            C21219 c21219 = (C21219) c18959;
            if (this.f67722 == c21219.f67722 && this.f67723.equals(c21219.f67723)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.C18959
    public String toString() {
        return m44038() + " " + this.f67722 + " call: " + this.f67723 + m44019();
    }
}
