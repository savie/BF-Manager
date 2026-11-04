package l;

/* JADX INFO: renamed from: l.᩸ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6P2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22600 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50935(InterfaceC8743 interfaceC8743, InterfaceC8743 interfaceC8744) {
        String text = interfaceC8743.getText();
        String text2 = interfaceC8744.getText();
        if (!text.isEmpty() && !text2.isEmpty()) {
            char cM50373 = C22313.m50373(1, text);
            char cCharAt = text2.charAt(0);
            boolean z = m50933(cCharAt) || interfaceC8744.getType() == 140 || interfaceC8744.getType() == 139;
            if (((m50933(cM50373) || interfaceC8743.getType() == 140 || interfaceC8743.getType() == 139) && z) || ((interfaceC8743.getType() == 5 && z) || ((interfaceC8743.getType() == 138 && (z || cCharAt == '.')) || ((cM50373 == '+' && cCharAt == '+') || ((cM50373 == '-' && cCharAt == '-') || ((cM50373 == '/' && (cCharAt == '/' || cCharAt == '*')) || ((cM50373 == '<' && cCharAt == '!') || ((cM50373 == '-' && cCharAt == '>') || ((cM50373 == '?' && cCharAt == '.') || ((cM50373 == '.' && cCharAt == '.') || ("+-*/%&|^!=<>?".indexOf(cM50373) >= 0 && "=&|*<>?".indexOf(cCharAt) >= 0))))))))))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50933(char c) {
        return Character.isJavaIdentifierPart(c) || Character.isSurrogate(c) || c == '\\';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50934(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n' || cCharAt == '\r' || cCharAt == 8232 || cCharAt == 8233) {
                return true;
            }
        }
        return false;
    }
}
