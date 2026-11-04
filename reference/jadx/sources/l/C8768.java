package l;

/* JADX INFO: renamed from: l.۠ܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9I7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8768 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC9513 f28507;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC1311 f28508;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC2802 f28509;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f28510;

    public C8768(EnumC9513 enumC9513, EnumC2802 enumC2802, EnumC1311 enumC1311) {
        this.f28507 = enumC9513;
        this.f28509 = enumC2802;
        this.f28510 = 7600;
        this.f28508 = enumC1311;
    }

    public C8768() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23464(C11707 c11707) throws C2013 {
        this.f28507 = (EnumC9513) C10961.m27793(c11707.m56020(), EnumC9513.class, null);
        this.f28509 = (EnumC2802) C10961.m27793(c11707.m56020(), EnumC2802.class, null);
        this.f28510 = c11707.m56017();
        c11707.m56021(3);
        this.f28508 = (EnumC1311) C10961.m27793(c11707.m56020(), EnumC1311.class, null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23465(C11707 c11707) {
        c11707.m56005((byte) this.f28507.f30815);
        c11707.m56005((byte) this.f28509.f9219);
        c11707.m56023(this.f28510);
        c11707.m56007(3, new byte[]{0, 0, 0});
        c11707.m56005((byte) this.f28508.getValue());
    }

    public final String toString() {
        return String.format("WindowsVersion[%s, %s, %d, %s]", this.f28507, this.f28509, Integer.valueOf(this.f28510), this.f28508);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8768.class == obj.getClass()) {
            C8768 c8768 = (C8768) obj;
            if (this.f28510 == c8768.f28510 && this.f28507 == c8768.f28507 && this.f28509 == c8768.f28509 && this.f28508 == c8768.f28508) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(this.f28507, this.f28509, Integer.valueOf(this.f28510), this.f28508);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC1311 m23463() {
        return this.f28508;
    }
}
