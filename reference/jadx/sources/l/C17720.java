package l;

/* JADX INFO: renamed from: l.ᩳ֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1T5 */
/* JADX INFO: loaded from: classes4.dex */
public class C17720 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static volatile C17720 f56256;

    /* JADX INFO: renamed from: ۙ */
    public void mo25181(byte[] bArr) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo25182(int[] iArr) {
    }

    static {
        C17720 c17720 = new C17720();
        String property = System.getProperty("org.tukaani.xz.ArrayCache");
        if (property == null) {
            property = "Dummy";
        }
        if (property.equals("Basic")) {
            f56256 = C8549.f29574;
        } else {
            if (!property.equals("Dummy")) {
                throw new Error(C16523.m38890("Unsupported value '", property, "' in the system property org.tukaani.xz.ArrayCache. Supported values: Dummy, Basic"));
            }
            f56256 = c17720;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17720 m41263() {
        return f56256;
    }

    /* JADX INFO: renamed from: ۙ */
    public byte[] mo25183(int i) {
        return new byte[i];
    }

    /* JADX INFO: renamed from: ۙ */
    public int[] mo25184(int i, boolean z) {
        return new int[i];
    }
}
