package l;

/* JADX INFO: renamed from: l.᩸ۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 177I */
/* JADX INFO: loaded from: classes4.dex */
public final class C21291 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m47740(String str) {
        int length = str.length();
        while (length > 0) {
            char cCharAt = str.charAt(length - 1);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            length--;
        }
        return length == str.length() ? str : str.substring(0, length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m47741(InterfaceC12783 interfaceC12783) {
        String strMo31757 = interfaceC12783.mo31757();
        return (strMo31757 == null || strMo31757.isEmpty()) ? "default" : strMo31757;
    }
}
