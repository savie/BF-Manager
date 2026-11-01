package l;

/* JADX INFO: renamed from: l.ۜᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D9PX */
/* JADX INFO: loaded from: classes2.dex */
public final class C6935 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC5524 f23310;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C4112 f23311 = new C4112();

    static {
        AbstractC5524 abstractC5524 = null;
        try {
            int i = C1290.f5538;
            abstractC5524 = (AbstractC5524) C1290.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f23310 = abstractC5524;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C4112 m18596() {
        return f23311;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC5524 m18595() {
        AbstractC5524 abstractC5524 = f23310;
        if (abstractC5524 != null) {
            return abstractC5524;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
