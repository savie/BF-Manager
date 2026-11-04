package l;

/* JADX INFO: renamed from: l.֡ܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: L1T5 */
/* JADX INFO: loaded from: classes2.dex */
public class C0573 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static volatile C0573 f2337;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2592(byte[] bArr) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2593(int[] iArr) {
    }

    static {
        C0573 c0573 = new C0573();
        String property = System.getProperty("org.tukaani.xz.ArrayCache");
        if (property == null) {
            property = "Dummy";
        }
        if (property.equals("Basic")) {
            f2337 = C1319.f4750;
        } else {
            if (!property.equals("Dummy")) {
                throw new Error(C14442.m34865("Unsupported value '", property, "' in the system property org.tukaani.xz.ArrayCache. Supported values: Dummy, Basic"));
            }
            f2337 = c0573;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0573 m2591() {
        return f2337;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] mo2594(int i) {
        return new byte[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] mo2595(int i, boolean z) {
        return new int[i];
    }
}
