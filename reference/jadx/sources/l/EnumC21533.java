package l;

/* JADX INFO: renamed from: l.᩶᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7IW */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC21533 implements InterfaceC12582 {
    OVERRIDE_READ_ONLY;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48976(InterfaceC12582[] interfaceC12582Arr) {
        byte[] bArr = C5125.f17846;
        if ((interfaceC12582Arr == null ? 0 : interfaceC12582Arr.length) == 0) {
            return false;
        }
        return C23654.of((Object[]) interfaceC12582Arr).anyMatch(new C9582(1));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m48978(InterfaceC12582 interfaceC12582) {
        return OVERRIDE_READ_ONLY == interfaceC12582;
    }
}
