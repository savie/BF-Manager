package l;

/* JADX INFO: renamed from: l.۠ۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5TF */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8521 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f27847;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC8521 f27848;

    public AbstractC8521(int i, AbstractC8521 abstractC8521) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C13645.m33382(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C10012.m25861(this);
        }
        this.f27847 = i;
        this.f27848 = abstractC8521;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC3301 mo19349(String str, boolean z) {
        AbstractC8521 abstractC8521 = this.f27848;
        if (abstractC8521 != null) {
            return abstractC8521.mo19349(str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC3301 mo19348(int i, C20259 c20259, String str, boolean z) {
        if (this.f27847 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC8521 abstractC8521 = this.f27848;
        if (abstractC8521 != null) {
            return abstractC8521.mo19348(i, c20259, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo19353(C24185 c24185) {
        AbstractC8521 abstractC8521 = this.f27848;
        if (abstractC8521 != null) {
            abstractC8521.mo19353(c24185);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo19350() {
        AbstractC8521 abstractC8521 = this.f27848;
        if (abstractC8521 != null) {
            abstractC8521.mo19350();
        }
    }
}
