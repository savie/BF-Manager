package l;

/* JADX INFO: renamed from: l.۟ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9PX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7806 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC4077 f26011;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C0348 f26012 = new C0348();

    static {
        AbstractC4077 abstractC4077 = null;
        try {
            int i = C21231.f67753;
            abstractC4077 = (AbstractC4077) C21231.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f26011 = abstractC4077;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C0348 m21281() {
        return f26012;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC4077 m21280() {
        AbstractC4077 abstractC4077 = f26011;
        if (abstractC4077 != null) {
            return abstractC4077;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
