package l;

/* JADX INFO: renamed from: l.ۚ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5616 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f19216;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC13378 f19217;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f19218;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC13378[] f19219;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f19220;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f19221;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f19222;

    public C5616(AbstractC13378 abstractC13378, boolean z) {
        this.f19219 = new AbstractC13378[abstractC13378.f44318];
        this.f19216 = z;
        m15488(abstractC13378);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15491() {
        C14084 c14084 = (C14084) this.f19217;
        int i = this.f19221;
        this.f19221 = i + 1;
        boolean z = this.f19216;
        this.f19219[i] = z ? c14084.f46248 : c14084.f46249;
        m15488(z ? c14084.f46249 : c14084.f46248);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15493() {
        int i = this.f19221;
        if (i == 0) {
            m15488((AbstractC13378) null);
            return;
        }
        int i2 = i - 1;
        this.f19221 = i2;
        AbstractC13378[] abstractC13378Arr = this.f19219;
        AbstractC13378 abstractC13378 = abstractC13378Arr[i2];
        abstractC13378Arr[i2] = null;
        m15488(abstractC13378);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15492(int i) {
        this.f19218 += i;
        int i2 = this.f19222 - i;
        this.f19222 = i2;
        if (i2 != 0) {
            return;
        }
        C1382 c1382 = (C1382) this.f19217;
        int i3 = this.f19220 + (this.f19216 ? -1 : 1);
        this.f19220 = i3;
        if (i3 < 0 || i3 == c1382.f44315) {
            m15493();
        } else {
            this.f19222 = c1382.f5767[i3] & Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15488(AbstractC13378 abstractC13378) {
        this.f19217 = abstractC13378;
        this.f19218 = 0;
        if (abstractC13378 instanceof C1382) {
            C1382 c1382 = (C1382) abstractC13378;
            int i = this.f19216 ? c1382.f44315 - 1 : 0;
            this.f19220 = i;
            this.f19222 = c1382.f5767[i] & Integer.MAX_VALUE;
        }
    }
}
