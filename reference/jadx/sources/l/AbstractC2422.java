package l;

/* JADX INFO: renamed from: l.ۖۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2422 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18499 f7757;

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1509(C10360 c10360) {
    }

    /* JADX INFO: renamed from: ᩸ */
    public abstract void mo1538();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8184(C9133 c9133) {
        this.f7757.m43089(c9133);
        mo1538();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private EnumC5909 m8181(AbstractC8036 abstractC8036, C18499 c18499, EnumC0931 enumC0931) {
        this.f7757 = c18499;
        boolean z = false;
        for (C14769 c14769M43093 = this.f7757.m43093(); c14769M43093.m35550(); c14769M43093 = c14769M43093.f48336) {
            C9133 c9133 = (C9133) c14769M43093.f48335;
            if (c9133.f29691.m21911(enumC0931.f3454) && enumC0931.mo3735(c9133.f29691) == abstractC8036) {
                c9133.mo24276();
                z = true;
            } else {
                this.f7757.m43089(c9133);
            }
        }
        return EnumC5909.m17150(z);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC5909 m8185(AbstractC8036 abstractC8036) {
        return m8181(abstractC8036, new C18499(), EnumC0931.f3450);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC5909 m8182(AbstractC8036 abstractC8036, C18499 c18499) {
        return m8181(abstractC8036, c18499, EnumC0931.f3452);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC5909 m8186(AbstractC8036 abstractC8036, C18499 c18499) {
        return m8181(abstractC8036, c18499, EnumC0931.f3451);
    }

    @Override // l.C23174
    /* JADX INFO: renamed from: ᩷ */
    public void mo5474(AbstractC8036 abstractC8036) {
        if (abstractC8036 != null) {
            AbstractC22664 abstractC22664 = abstractC8036.f26659;
            if (abstractC22664 == null || abstractC22664 != AbstractC22664.f73592) {
                abstractC8036.mo2284(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8183(AbstractC8036 abstractC8036, C15714 c15714) {
        if (abstractC8036.m21911(EnumC21461.f68531)) {
            c15714.f51040 = -1;
            C4307 c4307M37559 = c15714.m37559(null);
            c4307M37559.f15610 = abstractC8036;
            mo5474(c4307M37559);
            return;
        }
        c15714.f51040 = -1;
        C14637 c14637M37525 = c15714.m37525((AbstractC19728) null);
        c14637M37525.f47896 = abstractC8036;
        mo5474(c14637M37525);
    }
}
