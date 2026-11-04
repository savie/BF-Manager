package l;

import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.᩺ܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAZB */
/* JADX INFO: loaded from: classes.dex */
public final class C24383 extends PatternSyntaxException {
    public static final long serialVersionUID = -3864639126226059218L;

    @Override // java.util.regex.PatternSyntaxException, java.lang.Throwable
    public final String getMessage() {
        int index = getIndex();
        String description = getDescription();
        String pattern = getPattern();
        StringBuilder sbM27333 = C10732.m27333(description);
        if (index >= 0) {
            sbM27333.append(" near index ");
            sbM27333.append(index);
        }
        sbM27333.append(System.lineSeparator());
        sbM27333.append(pattern);
        if (index >= 0 && pattern != null && index < pattern.length()) {
            sbM27333.append(System.lineSeparator());
            for (int i = 0; i < index; i++) {
                char c = '\t';
                if (pattern.charAt(i) != '\t') {
                    c = ' ';
                }
                sbM27333.append(c);
            }
            sbM27333.append('^');
        }
        return sbM27333.toString();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? "PatternSyntaxException: ".concat(localizedMessage) : "PatternSyntaxException";
    }
}
