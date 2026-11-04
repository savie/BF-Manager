package l;

/* JADX INFO: renamed from: l.᩻ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O7FP */
/* JADX INFO: loaded from: classes.dex */
public final class C24818 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f80297;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C11391 f80298;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f80299;

    public C24818(String str, C11391 c11391, long j) {
        this.f80299 = str;
        this.f80298 = c11391;
        this.f80297 = j;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24818 m55335(C20348 c20348) {
        C11391 c11391;
        long j;
        C11391 c11391M40787;
        String strM46758 = c20348.m46758();
        int i = c20348.readByte() & 255;
        int i2 = c20348.readInt();
        String strM46742 = c20348.m46742();
        C11391 c11392 = null;
        if (i != 1) {
            if (i == 2) {
                c11391 = new C11391(EnumC16612.TRACK, i2, null);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("Unknown selection type");
                }
                if (strM46742 != null) {
                    c11392 = new C11391(EnumC16612.FILE, -1, strM46742);
                }
            }
            if (c11392 != null) {
                throw new IllegalArgumentException("Invalid selection data");
            }
            j = c20348.readLong();
            c11391M40787 = C17358.m40787(c11392);
            if (c11391M40787 != null) {
                throw new IllegalArgumentException("Invalid selection payload");
            }
            return new C24818(strM46758, c11391M40787, j);
        }
        c11391 = new C11391(EnumC16612.OFF, -1, null);
        c11392 = c11391;
        if (c11392 != null) {
            throw new IllegalArgumentException("Invalid selection data");
        }
        j = c20348.readLong();
        c11391M40787 = C17358.m40787(c11392);
        if (c11391M40787 != null) {
            throw new IllegalArgumentException("Invalid selection payload");
        }
        return new C24818(strM46758, c11391M40787, j);
    }
}
