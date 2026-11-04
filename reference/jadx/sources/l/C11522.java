package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6E4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11522 extends C18959 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f36265;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C1828 f36266;

    public C11522(int i, AbstractC16481 abstractC16481) {
        super(EnumC24203.FILL_ARRAY, 1);
        this.f36265 = i;
        mo44014(abstractC16481);
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final int m29012() {
        return this.f36265;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29010(C1828 c1828) {
        this.f36266 = c1828;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        if ((c18959 instanceof C11522) && super.mo4075(c18959)) {
            return C17359.equals(this.f36266, ((C11522) c18959).f36266);
        }
        return false;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public final C18959 mo4072() {
        C11522 c11522 = new C11522(this.f36265, mo44035(0));
        m44033(c11522);
        return c11522;
    }

    @Override // l.C18959
    public final String toString() {
        return super.toString() + ", data: " + this.f36266;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final int m29014() {
        return this.f36266.m6319();
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m29011() {
        return this.f36266.m6320();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m29009(AbstractC1566 abstractC1566) {
        return this.f36266.m6318(abstractC1566);
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final String m29013() {
        return C17359.toString(this.f36266);
    }
}
