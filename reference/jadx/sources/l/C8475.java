package l;

import java.text.StringCharacterIterator;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: YBJ2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8475 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f29383;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f29384;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m22137(String str) throws C15531 {
        if (!str.equals(this.f29384) || this.f29383 == null) {
            int i = 1;
            while (true) {
                if (i >= str.length()) {
                    i = -1;
                    break;
                }
                char cCharAt = str.charAt(i);
                if (!Character.isLetterOrDigit(cCharAt) && cCharAt != ':' && cCharAt != '.' && cCharAt != '-' && cCharAt != '_') {
                    break;
                }
                i++;
            }
            if (str.length() > 2 && i > 1) {
                this.f29384 = str;
                this.f29383 = str.substring(1, i);
            } else {
                throw new C15531("No element name for the tag:\n\t".concat(str));
            }
        }
        return this.f29383;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0149 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21880 m22138(String str) throws C15531 {
        C21880 c21880 = new C21880();
        c21880.m48667(m22137(str));
        ArrayList arrayList = new ArrayList();
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str.substring(m22137(str).length() + 2));
        C19058 c19058 = new C19058();
        c19058.m43812();
        char cFirst = stringCharacterIterator.first();
        StringBuilder sb = null;
        StringBuilder sb2 = null;
        char c = '\"';
        while (stringCharacterIterator.getIndex() < stringCharacterIterator.getEndIndex()) {
            if (cFirst == '\"' || cFirst == '\'') {
                if (c19058.m43813()) {
                    c19058.m43819();
                    sb2 = new StringBuilder(1024);
                    c = cFirst;
                } else if (c19058.m43818() && c == cFirst) {
                    arrayList.add(new C23292(sb.toString(), sb2.toString(), c));
                    c19058.m43812();
                } else {
                    if (!c19058.m43818() || c == cFirst) {
                        throw new C15531("Unexpected '" + cFirst + "' when parsing:\n\t" + str);
                    }
                    sb2.append(cFirst);
                }
            } else if (cFirst == '/') {
                if (c19058.m43818()) {
                    sb2.append(cFirst);
                } else if (c19058.m43820()) {
                    c19058.m43817();
                } else if (c19058.m43816()) {
                    throw new C15531("Unexpected '" + cFirst + "' when parsing:\n\t" + str);
                }
            } else if (cFirst != '=') {
                if (cFirst != '>') {
                    if (c19058.m43818()) {
                        sb2.append(cFirst);
                    } else if (c19058.m43816()) {
                        if (!Character.isWhitespace(cFirst)) {
                            throw new C15531("Unexpected '" + cFirst + "' when parsing:\n\t" + str);
                        }
                    } else if (!Character.isWhitespace(cFirst)) {
                        if (c19058.m43820()) {
                            c19058.m43821();
                            sb = new StringBuilder(255);
                            sb.append(cFirst);
                        } else if (c19058.m43815()) {
                            sb.append(cFirst);
                        }
                    }
                } else if (c19058.m43818()) {
                    sb2.append(cFirst);
                } else if (c19058.m43820()) {
                    c19058.m43817();
                } else if (c19058.m43816()) {
                    throw new C15531("Unexpected '" + cFirst + "' when parsing:\n\t" + str);
                }
            } else if (c19058.m43818()) {
                sb2.append(cFirst);
            } else {
                if (!c19058.m43815()) {
                    throw new C15531("Unexpected '" + cFirst + "' when parsing:\n\t" + str);
                }
                c19058.m43814();
            }
            cFirst = stringCharacterIterator.next();
        }
        if (!c19058.m43816()) {
            throw new C15531("Element did not complete normally.");
        }
        c21880.m48668(arrayList);
        c21880.m48669(str.charAt(str.lastIndexOf(62) - 1) == '/');
        return c21880;
    }
}
