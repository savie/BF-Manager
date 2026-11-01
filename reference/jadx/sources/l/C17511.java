package l;

import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ܿᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAZB */
/* JADX INFO: loaded from: classes4.dex */
public final class C17511 extends PatternSyntaxException {
    public static final long serialVersionUID = -3864639126226059218L;

    @Override // java.util.regex.PatternSyntaxException, java.lang.Throwable
    public final String getMessage() {
        int index = getIndex();
        String description = getDescription();
        String pattern = getPattern();
        StringBuilder sbM23356 = C9023.m23356(description);
        if (index >= 0) {
            sbM23356.append(" near index ");
            sbM23356.append(index);
        }
        sbM23356.append(System.lineSeparator());
        sbM23356.append(pattern);
        if (index >= 0 && pattern != null && index < pattern.length()) {
            sbM23356.append(System.lineSeparator());
            for (int i = 0; i < index; i++) {
                char c = '\t';
                if (pattern.charAt(i) != '\t') {
                    c = ' ';
                }
                sbM23356.append(c);
            }
            sbM23356.append('^');
        }
        return sbM23356.toString();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? "PatternSyntaxException: ".concat(localizedMessage) : "PatternSyntaxException";
    }
}
