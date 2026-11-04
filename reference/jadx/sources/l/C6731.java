package l;

/* JADX INFO: renamed from: l.ۛ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BBC */
/* JADX INFO: loaded from: classes3.dex */
public final class C6731 extends AbstractC4493 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21122 f22431;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21122[] f22432;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f22433;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C24698 f22434;

    public C6731(C9012 c9012, C21122 c21122, C24698 c24698, C21122[] c21122Arr) {
        super(c9012, C0063.f947);
        if (c21122 == null) {
            throw new NullPointerException("user == null");
        }
        if (c24698 == null) {
            throw new NullPointerException("cases == null");
        }
        if (c21122Arr == null) {
            throw new NullPointerException("targets == null");
        }
        int size = c24698.size();
        if (size != c21122Arr.length) {
            throw new IllegalArgumentException("cases / targets mismatch");
        }
        if (size > 65535) {
            throw new IllegalArgumentException("too many cases");
        }
        this.f22431 = c21122;
        this.f22434 = c24698;
        this.f22432 = c21122Arr;
        boolean z = true;
        if (c24698.size() >= 2) {
            long jM18811 = m18811(c24698);
            long size2 = (((long) c24698.size()) * 4) + 2;
            if (jM18811 < 0 || jM18811 > (size2 * 5) / 4) {
                z = false;
            }
        }
        this.f22433 = z;
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ᩷ */
    public final int mo8331() {
        boolean z = this.f22433;
        C24698 c24698 = this.f22434;
        return (int) (z ? m18811(c24698) : (((long) c24698.size()) * 4) + 2);
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final void mo8329(C15000 c15000) {
        int iM43804;
        int iM43805 = this.f22431.m43804();
        int iMo3133 = C9187.f29915.m3868().mo3133();
        C21122[] c21122Arr = this.f22432;
        int length = c21122Arr.length;
        boolean z = this.f22433;
        C24698 c24698 = this.f22434;
        int i = 0;
        if (z) {
            int i2 = length == 0 ? 0 : c24698.get(0);
            int i3 = ((length == 0 ? 0 : c24698.get(length - 1)) - i2) + 1;
            c15000.m36123(256);
            c15000.m36123(i3);
            c15000.m36124(i2);
            int i4 = 0;
            while (i < i3) {
                if (c24698.get(i4) > i2 + i) {
                    iM43804 = iMo3133;
                } else {
                    iM43804 = c21122Arr[i4].m43804() - iM43805;
                    i4++;
                }
                c15000.m36124(iM43804);
                i++;
            }
            return;
        }
        c15000.m36123(512);
        c15000.m36123(length);
        for (int i5 = 0; i5 < length; i5++) {
            c15000.m36124(c24698.get(i5));
        }
        while (i < length) {
            c15000.m36124(c21122Arr[i].m43804() - iM43805);
            i++;
        }
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC18884 mo18813(C0063 c0063) {
        return new C6731(m43799(), this.f22431, this.f22434, this.f22432);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m18814() {
        return this.f22433;
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo18812() {
        StringBuilder sb = new StringBuilder(100);
        C21122[] c21122Arr = this.f22432;
        int length = c21122Arr.length;
        for (int i = 0; i < length; i++) {
            sb.append("\n    ");
            sb.append(this.f22434.get(i));
            sb.append(": ");
            sb.append(c21122Arr[i]);
        }
        return sb.toString();
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ܺ */
    public final String mo8330() {
        int iM43804 = this.f22431.m43804();
        StringBuilder sb = new StringBuilder(100);
        C21122[] c21122Arr = this.f22432;
        int length = c21122Arr.length;
        sb.append(this.f22433 ? "packed" : "sparse");
        sb.append("-switch-payload // for switch @ ");
        sb.append(C5306.m15934(iM43804));
        for (int i = 0; i < length; i++) {
            int iM43805 = c21122Arr[i].m43804();
            sb.append("\n  ");
            sb.append(this.f22434.get(i));
            sb.append(": ");
            sb.append(C5306.m15938(iM43805));
            sb.append(" // ");
            sb.append(C5306.m15933(iM43805 - iM43804));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m18811(C24698 c24698) {
        long j = (((((long) c24698.get(c24698.size() - 1)) - ((long) c24698.get(0))) + 1) * 2) + 4;
        if (j <= 2147483647L) {
            return j;
        }
        return -1L;
    }
}
