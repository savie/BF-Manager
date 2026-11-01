package l;

/* JADX INFO: renamed from: l.ۡ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 89EN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8577 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int[] f29653;

    static {
        int[] iArr = new int[EnumC7165.values().length];
        f29653 = iArr;
        try {
            iArr[EnumC7165.SMB2_PREAUTH_INTEGRITY_CAPABILITIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f29653[EnumC7165.SMB2_ENCRYPTION_CAPABILITIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f29653[EnumC7165.SMB2_COMPRESSION_CAPABILITIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f29653[EnumC7165.SMB2_NETNAME_NEGOTIATE_CONTEXT_ID.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
