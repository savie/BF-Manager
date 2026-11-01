package l;

/* JADX INFO: renamed from: l.֨᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O7FP */
/* JADX INFO: loaded from: classes2.dex */
public final class C1451 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f5924;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22619 f5925;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f5926;

    public C1451(String str, C22619 c22619, long j) {
        this.f5926 = str;
        this.f5925 = c22619;
        this.f5924 = j;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1451 m5041(C17367 c17367) {
        C22619 c22619;
        long j;
        C22619 c22619M12080;
        String strM40458 = c17367.m40458();
        int i = c17367.readByte() & 255;
        int i2 = c17367.readInt();
        String strM40448 = c17367.m40448();
        C22619 c226110 = null;
        if (i != 1) {
            if (i == 2) {
                c22619 = new C22619(EnumC13447.TRACK, i2, null);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("Unknown selection type");
                }
                if (strM40448 != null) {
                    c226110 = new C22619(EnumC13447.FILE, -1, strM40448);
                }
            }
            if (c226110 != null) {
                throw new IllegalArgumentException("Invalid selection data");
            }
            j = c17367.readLong();
            c22619M12080 = C4273.m12080(c226110);
            if (c22619M12080 != null) {
                throw new IllegalArgumentException("Invalid selection payload");
            }
            return new C1451(strM40458, c22619M12080, j);
        }
        c22619 = new C22619(EnumC13447.OFF, -1, null);
        c226110 = c22619;
        if (c226110 != null) {
            throw new IllegalArgumentException("Invalid selection data");
        }
        j = c17367.readLong();
        c22619M12080 = C4273.m12080(c226110);
        if (c22619M12080 != null) {
            throw new IllegalArgumentException("Invalid selection payload");
        }
        return new C1451(strM40458, c22619M12080, j);
    }
}
