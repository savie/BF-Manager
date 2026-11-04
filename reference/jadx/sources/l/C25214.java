package l;

/* JADX INFO: renamed from: l.᩻ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8L1 */
/* JADX INFO: loaded from: classes.dex */
public final class C25214 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8402 f81458;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f81459;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f81460;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f81461;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17008 f81462;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f81463;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f81464;

    public C25214(C17008 c17008, String str, int i, C8402 c8402) {
        this.f81462 = c17008;
        this.f81464 = str;
        this.f81461 = i;
        this.f81460 = c8402 == null ? -1L : c8402.f27518;
        if (c8402 == null || !c8402.m22581()) {
            return;
        }
        this.f81458 = c8402;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m56225(AbstractC24755 abstractC24755, AbstractC24755 abstractC24756) {
        C8402 c8402;
        int i = this.f81461;
        if (i >= abstractC24755.mo16022()) {
            if (i >= abstractC24756.mo16022()) {
                i = -1;
                break;
            }
        } else {
            C17008 c17008 = this.f81462;
            abstractC24755.m55263(i, c17008.f55570);
            int i2 = c17008.f55570.f35697;
            while (true) {
                if (i2 > c17008.f55570.f35687) {
                    i = -1;
                    break;
                }
                int iMo1588 = abstractC24756.mo1588(abstractC24755.mo1589(i2));
                if (iMo1588 != -1) {
                    i = abstractC24756.mo1591(iMo1588, c17008.f55572, false).f5657;
                    break;
                }
                i2++;
            }
        }
        this.f81461 = i;
        return i != -1 && ((c8402 = this.f81458) == null || abstractC24756.mo1588(c8402.f27520) != -1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m56223(int i, C8402 c8402) {
        if (c8402 == null) {
            return i == this.f81461;
        }
        long j = c8402.f27518;
        C8402 c8403 = this.f81458;
        if (c8403 == null) {
            return !c8402.m22581() && j == this.f81460;
        }
        return j == c8403.f27518 && c8402.f27516 == c8403.f27516 && c8402.f27519 == c8403.f27519;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56226(int i, C8402 c8402) {
        if (this.f81460 == -1 && i == this.f81461 && c8402 != null) {
            long j = c8402.f27518;
            if (j >= this.f81462.m40097()) {
                this.f81460 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m56224(C11041 c11041) {
        C8402 c8402 = c11041.f34850;
        AbstractC24755 abstractC24755 = c11041.f34846;
        if (c8402 == null) {
            return this.f81461 != c11041.f34848;
        }
        long j = this.f81460;
        if (j == -1) {
            return false;
        }
        if (c8402.f27518 > j) {
            return true;
        }
        C8402 c8403 = this.f81458;
        if (c8403 == null) {
            return false;
        }
        int i = c8403.f27516;
        int iMo1588 = abstractC24755.mo1588(c8402.f27520);
        int iMo1589 = abstractC24755.mo1588(c8403.f27520);
        if (c8402.f27518 < c8403.f27518 || iMo1588 < iMo1589) {
            return false;
        }
        if (iMo1588 > iMo1589) {
            return true;
        }
        if (c8402.m22581()) {
            int i2 = c8402.f27516;
            int i3 = c8402.f27519;
            if (i2 <= i) {
                return i2 == i && i3 > c8403.f27519;
            }
            return true;
        }
        int i4 = c8402.f27517;
        return i4 == -1 || i4 > i;
    }
}
