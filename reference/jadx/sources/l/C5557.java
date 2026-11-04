package l;

/* JADX INFO: renamed from: l.ۚۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: JIT5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5557 extends C18959 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f19299;

    public C5557(String str) {
        super(EnumC24203.CONST_STR, 0);
        this.f19299 = str;
    }

    public final String getString() {
        return this.f19299;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public final C18959 mo4072() {
        C5557 c5557 = new C5557(this.f19299);
        m44033(c5557);
        return c5557;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        if ((c18959 instanceof C5557) && super.mo4075(c18959)) {
            return this.f19299.equals(((C5557) c18959).f19299);
        }
        return false;
    }

    @Override // l.C18959
    public final String toString() {
        return m44038() + C12326.m30748().m30751(this.f19299) + m44019();
    }
}
