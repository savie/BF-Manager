package l;

/* JADX INFO: renamed from: l.ܿۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: BIWV */
/* JADX INFO: loaded from: classes5.dex */
public final class C18235 extends C21219 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7179 f59529;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C21965 f59530;

    public C18235(C21965 c21965, InterfaceC7377 interfaceC7377, InterfaceC7179 interfaceC7179, C21965 c21966, boolean z) {
        super(c21965, interfaceC7377, EnumC0336.POLYMORPHIC, true, z);
        this.f59529 = interfaceC7179;
        this.f59530 = c21966;
    }

    public C18235(C21965 c21965, int i, InterfaceC7179 interfaceC7179, C21965 c21966) {
        super(c21965, EnumC0336.POLYMORPHIC, i);
        this.f59529 = interfaceC7179;
        this.f59530 = c21966;
    }

    @Override // l.C21219, l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public final C18959 mo4072() {
        C18235 c18235 = new C18235(mo18926(), m44039(), this.f59529, this.f59530);
        m44033(c18235);
        return c18235;
    }

    @Override // l.C21219, l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        if ((c18959 instanceof C18235) && super.mo4075(c18959)) {
            return this.f59529.equals(((C18235) c18959).f59529);
        }
        return false;
    }

    @Override // l.C21219, l.C18959
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C8314.m22396(this.f61471));
        sb.append(": INVOKE_POLYMORPHIC ");
        if (m44027() != null) {
            sb.append(m44027());
            sb.append(" = ");
        }
        if (!m44015(sb)) {
            sb.append('\n');
        }
        m44030(sb);
        sb.append(" base: ");
        sb.append(this.f59530);
        sb.append('\n');
        sb.append(" proto: ");
        sb.append(this.f59529);
        sb.append('\n');
        return sb.toString();
    }
}
