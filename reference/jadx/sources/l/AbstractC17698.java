package l;

/* JADX INFO: renamed from: l.ᩳ֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5TF */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17698 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f56194;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC17698 f56195;

    public AbstractC17698(int i, AbstractC17698 abstractC17698) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C8479.m22141(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C6409.m17554(this);
        }
        this.f56194 = i;
        this.f56195 = abstractC17698;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC9812 mo13234(String str, boolean z) {
        AbstractC17698 abstractC17698 = this.f56195;
        if (abstractC17698 != null) {
            return abstractC17698.mo13234(str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC9812 mo13233(int i, C1470 c1470, String str, boolean z) {
        if (this.f56194 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC17698 abstractC17698 = this.f56195;
        if (abstractC17698 != null) {
            return abstractC17698.mo13233(i, c1470, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo41227(C11349 c11349) {
        AbstractC17698 abstractC17698 = this.f56195;
        if (abstractC17698 != null) {
            abstractC17698.mo41227(c11349);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo41226() {
        AbstractC17698 abstractC17698 = this.f56195;
        if (abstractC17698 != null) {
            abstractC17698.mo41226();
        }
    }
}
