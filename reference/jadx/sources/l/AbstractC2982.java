package l;

/* JADX INFO: renamed from: l.ۗۘ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2982 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22116 f11188;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f11189;

    /* JADX INFO: renamed from: ֨ */
    public int mo7177() {
        return 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo7178() {
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo7179() {
    }

    public AbstractC2982(C22116 c22116, int i) {
        this.f11188 = c22116;
        this.f11189 = i;
    }

    /* JADX INFO: renamed from: ۖ */
    public AbstractC2982 mo5374() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void mo8879() {
        throw new AssertionError("store unsupported: " + this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC2982 mo8878() {
        throw new AssertionError(this);
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo7180(int i) {
        this.f11188.f71611[i].mo7179();
    }

    /* JADX INFO: renamed from: ۚ */
    public C23445 mo5376() {
        mo5374();
        return this.f11188.m49073(EnumC2300.f8185);
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC2982 mo5375(int i) {
        int i2 = this.f11189;
        if (i2 == i) {
            return this;
        }
        mo5374();
        int iM25348 = C10039.m25348(i2);
        int iM25349 = C10039.m25348(i);
        C22116 c22116 = this.f11188;
        if (iM25348 != iM25349) {
            c22116.f71608.m25378((iM25348 * 3) + 133 + (iM25349 > iM25348 ? iM25349 - 1 : iM25349));
        }
        if (i != iM25349) {
            c22116.f71608.m25378(i + 140);
        }
        return c22116.f71611[i];
    }
}
