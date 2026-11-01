package l;

/* JADX INFO: renamed from: l.᩷֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 38C6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20573 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f67033;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Integer f67034;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m46419() {
        String str = this.f67033;
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m46421() {
        return this.f67033;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46416(String str) {
        this.f67033 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46415(Integer num) {
        this.f67034 = num;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m46414() {
        return this.f67034 != null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m46420() {
        Integer num = this.f67034;
        C13638.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46417(byte[] bArr) {
        C17367 c17367 = new C17367(bArr);
        byte b = c17367.readByte();
        if ((b & 1) != 0) {
            this.f67033 = c17367.m40458();
        } else {
            this.f67033 = null;
        }
        if ((b & 2) != 0) {
            this.f67034 = Integer.valueOf(c17367.m40462() & 4095);
        } else {
            this.f67034 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m46418() {
        C11018 c11018 = new C11018();
        boolean zM46419 = m46419();
        int i = zM46419;
        if (m46414()) {
            i = (zM46419 ? 1 : 0) | 2;
        }
        c11018.writeByte(i);
        if (m46419()) {
            c11018.m27786(this.f67033);
        }
        if (m46414()) {
            c11018.mo24508(m46420() & 4095);
        }
        return c11018.m27773();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MTUnixExtraData{link='");
        sb.append(this.f67033);
        sb.append("', permissions=");
        Integer num = this.f67034;
        sb.append(num == null ? null : Integer.toOctalString(num.intValue()));
        sb.append('}');
        return sb.toString();
    }
}
