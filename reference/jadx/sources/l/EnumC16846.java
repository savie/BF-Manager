package l;

/* JADX INFO: renamed from: l.ܽ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBIL */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC16846 {
    ascii,
    utf,
    fallback;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC16846 m39509(String str) {
        if (str.equals("US-ASCII")) {
            return ascii;
        }
        if (str.startsWith("UTF-")) {
            return utf;
        }
        return fallback;
    }
}
