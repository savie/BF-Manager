package l;

/* JADX INFO: renamed from: l.ۢ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W4K0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9812 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f33558;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC9812 f33559;

    public AbstractC9812() {
        this(589824, null);
    }

    public AbstractC9812(int i, AbstractC9812 abstractC9812) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C8479.m22141(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C6409.m17554(this);
        }
        this.f33558 = i;
        this.f33559 = abstractC9812;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10179(Object obj, String str) {
        AbstractC9812 abstractC9812 = this.f33559;
        if (abstractC9812 != null) {
            abstractC9812.mo10179(obj, str);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10180(String str, String str2, String str3) {
        AbstractC9812 abstractC9812 = this.f33559;
        if (abstractC9812 != null) {
            abstractC9812.mo10180(str, str2, str3);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC9812 mo10176(String str, String str2) {
        AbstractC9812 abstractC9812 = this.f33559;
        if (abstractC9812 != null) {
            return abstractC9812.mo10176(str, str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC9812 mo10175(String str) {
        AbstractC9812 abstractC9812 = this.f33559;
        if (abstractC9812 != null) {
            return abstractC9812.mo10175(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10177() {
        AbstractC9812 abstractC9812 = this.f33559;
        if (abstractC9812 != null) {
            abstractC9812.mo10177();
        }
    }
}
