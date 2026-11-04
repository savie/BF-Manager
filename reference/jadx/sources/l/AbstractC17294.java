package l;

/* JADX INFO: renamed from: l.ܽۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17294 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6108 f56322;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f56323;

    /* JADX INFO: renamed from: ۙ */
    public void mo5778() {
    }

    /* JADX INFO: renamed from: ۫ */
    public int mo5781() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo5783() {
    }

    public AbstractC17294(C6108 c6108, int i) {
        this.f56322 = c6108;
        this.f56323 = i;
    }

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC17294 mo5785() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ܳ */
    public void mo28618() {
        throw new AssertionError("store unsupported: " + this);
    }

    /* JADX INFO: renamed from: ۤ */
    public AbstractC17294 mo28617() {
        throw new AssertionError(this);
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo5784(int i) {
        this.f56322.f20855[i].mo5783();
    }

    /* JADX INFO: renamed from: ᩴ */
    public C1633 mo5782() {
        mo5785();
        return this.f56322.m17624(EnumC24309.f78687);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC17294 mo40623(int i) {
        int i2 = this.f56323;
        if (i2 == i) {
            return this;
        }
        mo5785();
        int iM23859 = C8935.m23859(i2);
        int iM238510 = C8935.m23859(i);
        C6108 c6108 = this.f56322;
        if (iM23859 != iM238510) {
            c6108.f20850.m23883((iM23859 * 3) + 133 + (iM238510 > iM23859 ? iM238510 - 1 : iM238510));
        }
        if (i != iM238510) {
            c6108.f20850.m23883(i + 140);
        }
        return c6108.f20855[i];
    }
}
