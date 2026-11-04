package l;

/* JADX INFO: renamed from: l.ۘܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38C6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4273 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f15527;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Integer f15528;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m13622() {
        String str = this.f15527;
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m13623() {
        return this.f15527;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13618(String str) {
        this.f15527 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13617(Integer num) {
        this.f15528 = num;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m13624() {
        return this.f15528 != null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m13621() {
        Integer num = this.f15528;
        C17359.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13619(byte[] bArr) {
        C20348 c20348 = new C20348(bArr);
        byte b = c20348.readByte();
        if ((b & 1) != 0) {
            this.f15527 = c20348.m46758();
        } else {
            this.f15527 = null;
        }
        if ((b & 2) != 0) {
            this.f15528 = Integer.valueOf(c20348.m46749() & 4095);
        } else {
            this.f15528 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m13620() {
        C6178 c6178 = new C6178();
        boolean zM13622 = m13622();
        int i = zM13622;
        if (m13624()) {
            i = (zM13622 ? 1 : 0) | 2;
        }
        c6178.writeByte(i);
        if (m13622()) {
            c6178.m17800(this.f15527);
        }
        if (m13624()) {
            c6178.mo17812(m13621() & 4095);
        }
        return c6178.m17796();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MTUnixExtraData{link='");
        sb.append(this.f15527);
        sb.append("', permissions=");
        Integer num = this.f15528;
        sb.append(num == null ? null : Integer.toOctalString(num.intValue()));
        sb.append('}');
        return sb.toString();
    }
}
