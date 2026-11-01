package l;

/* JADX INFO: renamed from: l.۟᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6MK */
/* JADX INFO: loaded from: classes3.dex */
public final class C7716 implements InterfaceC23218 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0617 f25526;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C0617 f25527;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16183 f25528;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25529 = 0;

    public C7716(C16183 c16183, C0617 c0617, C0617 c0618) {
        this.f25528 = c16183;
        this.f25526 = c0617;
        this.f25527 = c0618;
    }

    @Override // l.InterfaceC23218
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo20359(AbstractC14730 abstractC14730, int i) {
        boolean z = abstractC14730 instanceof C0617;
        C16183 c16183 = this.f25528;
        if (z) {
            C0617 c0617 = (C0617) abstractC14730;
            if (c16183.f52262.m17399(c0617.m2833())) {
                C21121 c21121M38269 = C16183.m38269(c16183, c0617);
                C0617 c0618 = c21121M38269.f68786;
                this.f25527.m2855(c0618);
                this.f25529 += c21121M38269.f68787;
                this.f25527 = c0618;
                return;
            }
            if (abstractC14730 != this.f25526) {
                this.f25529++;
                return;
            }
            return;
        }
        if (abstractC14730 instanceof C13715) {
            this.f25527.m2855(new C13715(((C13715) abstractC14730).m28142()));
        } else if ((abstractC14730 instanceof C18963) && c16183.f52262.m17399(abstractC14730.mo2849().mo2863())) {
            this.f25527.m2855(new C18963(((C18963) abstractC14730).m28143()));
        } else {
            this.f25529++;
        }
    }

    @Override // l.InterfaceC23218
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20358(AbstractC14730 abstractC14730, int i) {
        if ((abstractC14730 instanceof C0617) && this.f25528.f52262.m17399(abstractC14730.mo2863())) {
            this.f25527 = this.f25527.mo2849();
        }
    }
}
