package l;

/* JADX INFO: renamed from: l.᩻ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: FAXN */
/* JADX INFO: loaded from: classes.dex */
public final class C23798 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Integer f76931;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof Integer ? (Integer) obj : null;
        } catch (Throwable unused) {
        }
        if (num != null && num.intValue() > 0) {
            num2 = num;
        }
        f76931 = num2;
    }
}
