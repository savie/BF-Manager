package l;

/* JADX INFO: renamed from: l.ۗ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2888 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC1247.values().length];
        a = iArr;
        try {
            iArr[EnumC1247.EXCEEDS_PAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EnumC1247.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[EnumC1247.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[EnumC1247.NOT_NEGATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
