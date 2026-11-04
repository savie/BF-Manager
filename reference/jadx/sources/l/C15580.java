package l;

/* JADX INFO: renamed from: l.ܳ᩶ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 855A */
/* JADX INFO: loaded from: classes5.dex */
public final class C15580 extends AbstractC17072 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C15580 f50679 = new C15580(EnumC23040.ENCODED_NULL, "null");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC23040 f50680;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f50681;

    public C15580(EnumC23040 enumC23040, Object obj) {
        this.f50680 = enumC23040;
        this.f50681 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC23040 m37317() {
        return this.f50680;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m37318() {
        return this.f50681;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15580.class == obj.getClass()) {
            C15580 c15580 = (C15580) obj;
            if (this.f50680 == c15580.f50680 && C17359.equals(this.f50681, c15580.f50681)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2157 mo1791() {
        return C25278.f81643;
    }

    public final int hashCode() {
        return C17359.hash(this.f50680, this.f50681);
    }

    public final String toString() {
        int[] iArr = C20056.f64454;
        EnumC23040 enumC23040 = this.f50680;
        int i = iArr[enumC23040.ordinal()];
        if (i == 1) {
            return "null";
        }
        Object obj = this.f50681;
        if (i == 2) {
            return "[" + obj + "]";
        }
        if (i == 3) {
            return "{STRING: \"" + obj + "\"}";
        }
        return "{" + enumC23040.toString().substring(8) + ": " + obj + '}';
    }
}
