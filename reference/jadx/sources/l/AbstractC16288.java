package l;

/* JADX INFO: renamed from: l.ܽ֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7T3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16288 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f52464;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC16288 f52465;

    public AbstractC16288(int i, AbstractC16288 abstractC16288) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C8479.m22141(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C6409.m17554(this);
        }
        this.f52464 = i;
        this.f52465 = abstractC16288;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC9812 mo15143(String str, boolean z) {
        AbstractC16288 abstractC16288 = this.f52465;
        if (abstractC16288 != null) {
            return abstractC16288.mo15143(str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC9812 mo15142(int i, C1470 c1470, String str, boolean z) {
        AbstractC16288 abstractC16288 = this.f52465;
        if (abstractC16288 != null) {
            return abstractC16288.mo15142(i, c1470, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo29957(C11349 c11349) {
        AbstractC16288 abstractC16288 = this.f52465;
        if (abstractC16288 != null) {
            abstractC16288.mo29957(c11349);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo29955() {
        AbstractC16288 abstractC16288 = this.f52465;
        if (abstractC16288 != null) {
            abstractC16288.mo29955();
        }
    }
}
