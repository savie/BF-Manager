package l;

/* JADX INFO: renamed from: l.ۧۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7T3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11308 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f35646;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC11308 f35647;

    public AbstractC11308(int i, AbstractC11308 abstractC11308) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C13645.m33382(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C10012.m25861(this);
        }
        this.f35646 = i;
        this.f35647 = abstractC11308;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC3301 mo28578(String str, boolean z) {
        AbstractC11308 abstractC11308 = this.f35647;
        if (abstractC11308 != null) {
            return abstractC11308.mo28578(str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC3301 mo28577(int i, C20259 c20259, String str, boolean z) {
        AbstractC11308 abstractC11308 = this.f35647;
        if (abstractC11308 != null) {
            return abstractC11308.mo28577(i, c20259, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo28580(C24185 c24185) {
        AbstractC11308 abstractC11308 = this.f35647;
        if (abstractC11308 != null) {
            abstractC11308.mo28580(c24185);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo28579() {
        AbstractC11308 abstractC11308 = this.f35647;
        if (abstractC11308 != null) {
            abstractC11308.mo28579();
        }
    }
}
