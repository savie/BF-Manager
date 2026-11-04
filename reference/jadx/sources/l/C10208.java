package l;

/* JADX INFO: renamed from: l.ۢܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 177I */
/* JADX INFO: loaded from: classes3.dex */
public final class C10208 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26336(String str) {
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
    public static String m26337(InterfaceC2731 interfaceC2731) {
        String strMo9074 = interfaceC2731.mo9074();
        return (strMo9074 == null || strMo9074.isEmpty()) ? "default" : strMo9074;
    }
}
