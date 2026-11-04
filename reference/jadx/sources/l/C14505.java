package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܰۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6G8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14505 extends C21219 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C21219 f45635;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public List f45636;

    @Override // l.C21219, l.AbstractC15251
    /* JADX INFO: renamed from: ۛۙ */
    public final int mo13126() {
        return 0;
    }

    @Override // l.C21219, l.AbstractC15251
    /* JADX INFO: renamed from: ᩺ۙ */
    public final AbstractC16481 mo13131() {
        return null;
    }

    public C14505(C21219 c21219, C21965 c21965, InterfaceC7377 interfaceC7377, boolean z) {
        super(c21965, interfaceC7377, EnumC0336.CUSTOM_RAW, false, z);
        this.f45635 = c21219;
    }

    public C14505(C21219 c21219, C21965 c21965, EnumC0336 enumC0336, int i) {
        super(c21965, enumC0336, i);
        this.f45635 = c21219;
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final C21219 m35014() {
        return this.f45635;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35016(List list) {
        this.f45636 = list;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final List m35015() {
        return this.f45636;
    }

    @Override // l.C21219, l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public final C18959 mo4072() {
        C14505 c14505 = new C14505(this.f45635, mo18926(), m48374(), m44039());
        m44033(c14505);
        c14505.f45636 = this.f45636;
        return c14505;
    }

    @Override // l.C21219, l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        if ((c18959 instanceof C14505) && super.mo4075(c18959)) {
            if (this.f45635.mo4075(((C14505) c18959).f45635)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.C21219, l.C18959
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C8314.m22396(this.f61471));
        sb.append(": INVOKE_CUSTOM ");
        if (m44027() != null) {
            sb.append(m44027());
            sb.append(" = ");
        }
        if (!m44015(sb)) {
            sb.append('\n');
        }
        m44030(sb);
        sb.append(" call-site: \n  ");
        sb.append(C4123.m13221(this.f45636, "\n  "));
        sb.append('\n');
        return sb.toString();
    }
}
