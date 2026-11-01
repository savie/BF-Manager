package l;

/* JADX INFO: renamed from: l.᩵᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BBC */
/* JADX INFO: loaded from: classes5.dex */
public final class C19758 extends AbstractC10586 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C20671[] f63492;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4129 f63493;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C20671 f63494;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f63495;

    public C19758(C11312 c11312, C20671 c20671, C4129 c4129, C20671[] c20671Arr) {
        super(c11312, C0727.f3015);
        if (c20671 == null) {
            throw new NullPointerException("user == null");
        }
        if (c4129 == null) {
            throw new NullPointerException("cases == null");
        }
        if (c20671Arr == null) {
            throw new NullPointerException("targets == null");
        }
        int size = c4129.size();
        if (size != c20671Arr.length) {
            throw new IllegalArgumentException("cases / targets mismatch");
        }
        if (size > 65535) {
            throw new IllegalArgumentException("too many cases");
        }
        this.f63494 = c20671;
        this.f63493 = c4129;
        this.f63492 = c20671Arr;
        boolean z = true;
        if (c4129.size() >= 2) {
            long jM44950 = m44950(c4129);
            long size2 = (((long) c4129.size()) * 4) + 2;
            if (jM44950 < 0 || jM44950 > (size2 * 5) / 4) {
                z = false;
            }
        }
        this.f63495 = z;
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ܰ */
    public final int mo15536() {
        boolean z = this.f63495;
        C4129 c4129 = this.f63493;
        return (int) (z ? m44950(c4129) : (((long) c4129.size()) * 4) + 2);
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final void mo15535(C2718 c2718) {
        int iM38698;
        int iM38699 = this.f63494.m38698();
        int iMo3096 = C5854.f19832.m40073().mo3096();
        C20671[] c20671Arr = this.f63492;
        int length = c20671Arr.length;
        boolean z = this.f63495;
        C4129 c4129 = this.f63493;
        int i = 0;
        if (z) {
            int i2 = length == 0 ? 0 : c4129.get(0);
            int i3 = ((length == 0 ? 0 : c4129.get(length - 1)) - i2) + 1;
            c2718.m8297(256);
            c2718.m8297(i3);
            c2718.m8289(i2);
            int i4 = 0;
            while (i < i3) {
                if (c4129.get(i4) > i2 + i) {
                    iM38698 = iMo3096;
                } else {
                    iM38698 = c20671Arr[i4].m38698() - iM38699;
                    i4++;
                }
                c2718.m8289(iM38698);
                i++;
            }
            return;
        }
        c2718.m8297(512);
        c2718.m8297(length);
        for (int i5 = 0; i5 < length; i5++) {
            c2718.m8289(c4129.get(i5));
        }
        while (i < length) {
            c2718.m8289(c20671Arr[i].m38698() - iM38699);
            i++;
        }
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16438 mo8569(C0727 c0727) {
        return new C19758(m38701(), this.f63494, this.f63493, this.f63492);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m44951() {
        return this.f63495;
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final String mo8568() {
        StringBuilder sb = new StringBuilder(100);
        C20671[] c20671Arr = this.f63492;
        int length = c20671Arr.length;
        for (int i = 0; i < length; i++) {
            sb.append("\n    ");
            sb.append(this.f63493.get(i));
            sb.append(": ");
            sb.append(c20671Arr[i]);
        }
        return sb.toString();
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ܶ */
    public final String mo15537() {
        int iM38698 = this.f63494.m38698();
        StringBuilder sb = new StringBuilder(100);
        C20671[] c20671Arr = this.f63492;
        int length = c20671Arr.length;
        sb.append(this.f63495 ? "packed" : "sparse");
        sb.append("-switch-payload // for switch @ ");
        sb.append(C22475.m49982(iM38698));
        for (int i = 0; i < length; i++) {
            int iM38699 = c20671Arr[i].m38698();
            sb.append("\n  ");
            sb.append(this.f63493.get(i));
            sb.append(": ");
            sb.append(C22475.m49978(iM38699));
            sb.append(" // ");
            sb.append(C22475.m49979(iM38699 - iM38698));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m44950(C4129 c4129) {
        long j = (((((long) c4129.get(c4129.size() - 1)) - ((long) c4129.get(0))) + 1) * 2) + 4;
        if (j <= 2147483647L) {
            return j;
        }
        return -1L;
    }
}
