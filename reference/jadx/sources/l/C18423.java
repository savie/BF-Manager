package l;

/* JADX INFO: renamed from: l.ܿܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18423 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f59996;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f59997;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f59998;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f59999;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC19169[] f60000;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f60001;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC19169 f60002;

    public C18423(AbstractC19169 abstractC19169, boolean z) {
        this.f60000 = new AbstractC19169[abstractC19169.f62020];
        this.f59998 = z;
        m42942(abstractC19169);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42946() {
        C4253 c4253 = (C4253) this.f60002;
        int i = this.f60001;
        this.f60001 = i + 1;
        boolean z = this.f59998;
        this.f60000[i] = z ? c4253.f15481 : c4253.f15480;
        m42942(z ? c4253.f15480 : c4253.f15481);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m42948() {
        int i = this.f60001;
        if (i == 0) {
            m42942((AbstractC19169) null);
            return;
        }
        int i2 = i - 1;
        this.f60001 = i2;
        AbstractC19169[] abstractC19169Arr = this.f60000;
        AbstractC19169 abstractC19169 = abstractC19169Arr[i2];
        abstractC19169Arr[i2] = null;
        m42942(abstractC19169);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42947(int i) {
        this.f59996 += i;
        int i2 = this.f59999 - i;
        this.f59999 = i2;
        if (i2 != 0) {
            return;
        }
        C7982 c7982 = (C7982) this.f60002;
        int i3 = this.f59997 + (this.f59998 ? -1 : 1);
        this.f59997 = i3;
        if (i3 < 0 || i3 == c7982.f62021) {
            m42948();
        } else {
            this.f59999 = c7982.f26521[i3] & Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42942(AbstractC19169 abstractC19169) {
        this.f60002 = abstractC19169;
        this.f59996 = 0;
        if (abstractC19169 instanceof C7982) {
            C7982 c7982 = (C7982) abstractC19169;
            int i = this.f59998 ? c7982.f62021 - 1 : 0;
            this.f59997 = i;
            this.f59999 = c7982.f26521[i] & Integer.MAX_VALUE;
        }
    }
}
