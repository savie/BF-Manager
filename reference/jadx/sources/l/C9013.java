package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: L73L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9013 implements InterfaceC7359 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m23329(IOException iOException, StringBuilder sb) {
        sb.append(iOException.getMessage());
        return sb.toString();
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m23330(int i, String str, String str2) {
        int upperCase;
        int upperCase2;
        int iCharCount = 0;
        while (iCharCount < str2.length()) {
            if (i >= str.length()) {
                return false;
            }
            int iCodePointAt = str.codePointAt(i);
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt != iCodePointAt2 && (upperCase = Character.toUpperCase(iCodePointAt)) != (upperCase2 = Character.toUpperCase(iCodePointAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
            i += Character.charCount(iCodePointAt);
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15130 m23331() {
        return new C15130(2, 1, InterfaceC13302.f44171, new C6694(C17492.FOREVER_NS), new C4149(24));
    }
}
