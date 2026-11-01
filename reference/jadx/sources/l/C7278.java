package l;

/* JADX INFO: renamed from: l.۟ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6P2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7278 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19416(InterfaceC19761 interfaceC19761, InterfaceC19761 interfaceC19762) {
        String text = interfaceC19761.getText();
        String text2 = interfaceC19762.getText();
        if (!text.isEmpty() && !text2.isEmpty()) {
            char cM9601 = C3184.m9601(1, text);
            char cCharAt = text2.charAt(0);
            boolean z = m19414(cCharAt) || interfaceC19762.getType() == 140 || interfaceC19762.getType() == 139;
            if (((m19414(cM9601) || interfaceC19761.getType() == 140 || interfaceC19761.getType() == 139) && z) || ((interfaceC19761.getType() == 5 && z) || ((interfaceC19761.getType() == 138 && (z || cCharAt == '.')) || ((cM9601 == '+' && cCharAt == '+') || ((cM9601 == '-' && cCharAt == '-') || ((cM9601 == '/' && (cCharAt == '/' || cCharAt == '*')) || ((cM9601 == '<' && cCharAt == '!') || ((cM9601 == '-' && cCharAt == '>') || ((cM9601 == '?' && cCharAt == '.') || ((cM9601 == '.' && cCharAt == '.') || ("+-*/%&|^!=<>?".indexOf(cM9601) >= 0 && "=&|*<>?".indexOf(cCharAt) >= 0))))))))))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19414(char c) {
        return Character.isJavaIdentifierPart(c) || Character.isSurrogate(c) || c == '\\';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19415(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n' || cCharAt == '\r' || cCharAt == 8232 || cCharAt == 8233) {
                return true;
            }
        }
        return false;
    }
}
