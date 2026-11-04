package l;

/* JADX INFO: renamed from: l.ۗۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: W4K0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3301 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f10786;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC3301 f10787;

    public AbstractC3301() {
        this(589824, null);
    }

    public AbstractC3301(int i, AbstractC3301 abstractC3301) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C13645.m33382(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C10012.m25861(this);
        }
        this.f10786 = i;
        this.f10787 = abstractC3301;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo7996(Object obj, String str) {
        AbstractC3301 abstractC3301 = this.f10787;
        if (abstractC3301 != null) {
            abstractC3301.mo7996(obj, str);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo7997(String str, String str2, String str3) {
        AbstractC3301 abstractC3301 = this.f10787;
        if (abstractC3301 != null) {
            abstractC3301.mo7997(str, str2, str3);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC3301 mo7994(String str, String str2) {
        AbstractC3301 abstractC3301 = this.f10787;
        if (abstractC3301 != null) {
            return abstractC3301.mo7994(str, str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC3301 mo7993(String str) {
        AbstractC3301 abstractC3301 = this.f10787;
        if (abstractC3301 != null) {
            return abstractC3301.mo7993(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo7995() {
        AbstractC3301 abstractC3301 = this.f10787;
        if (abstractC3301 != null) {
            abstractC3301.mo7995();
        }
    }
}
