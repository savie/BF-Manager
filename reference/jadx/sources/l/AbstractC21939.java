package l;

/* JADX INFO: renamed from: l.᩹֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC21939 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC18762.values().length];
        a = iArr;
        try {
            iArr[EnumC18762.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EnumC18762.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[EnumC18762.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[EnumC18762.YEAR_OF_ERA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[EnumC18762.PROLEPTIC_MONTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[EnumC18762.YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[EnumC18762.ERA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
