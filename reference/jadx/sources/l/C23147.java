package l;

import java.text.StringCharacterIterator;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: YBJ2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23147 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f75031;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f75032;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m52065(String str) throws C13670 {
        if (!str.equals(this.f75032) || this.f75031 == null) {
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
                this.f75032 = str;
                this.f75031 = str.substring(1, i);
            } else {
                throw new C13670("No element name for the tag:\n\t".concat(str));
            }
        }
        return this.f75031;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0149 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5247 m52066(String str) throws C13670 {
        C5247 c5247 = new C5247();
        c5247.m15802(m52065(str));
        ArrayList arrayList = new ArrayList();
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str.substring(m52065(str).length() + 2));
        C11212 c11212 = new C11212();
        c11212.m28252();
        char cFirst = stringCharacterIterator.first();
        StringBuilder sb = null;
        StringBuilder sb2 = null;
        char c = '\"';
        while (stringCharacterIterator.getIndex() < stringCharacterIterator.getEndIndex()) {
            if (cFirst == '\"' || cFirst == '\'') {
                if (c11212.m28256()) {
                    c11212.m28249();
                    sb2 = new StringBuilder(1024);
                    c = cFirst;
                } else if (c11212.m28250() && c == cFirst) {
                    arrayList.add(new C6959(c, sb.toString(), sb2.toString()));
                    c11212.m28252();
                } else {
                    if (!c11212.m28250() || c == cFirst) {
                        throw new C13670("Unexpected '" + cFirst + "' when parsing:\n\t" + str);
                    }
                    sb2.append(cFirst);
                }
            } else if (cFirst == '/') {
                if (c11212.m28250()) {
                    sb2.append(cFirst);
                } else if (c11212.m28255()) {
                    c11212.m28251();
                } else if (c11212.m28254()) {
                    throw new C13670("Unexpected '" + cFirst + "' when parsing:\n\t" + str);
                }
            } else if (cFirst != '=') {
                if (cFirst != '>') {
                    if (c11212.m28250()) {
                        sb2.append(cFirst);
                    } else if (c11212.m28254()) {
                        if (!Character.isWhitespace(cFirst)) {
                            throw new C13670("Unexpected '" + cFirst + "' when parsing:\n\t" + str);
                        }
                    } else if (!Character.isWhitespace(cFirst)) {
                        if (c11212.m28255()) {
                            c11212.m28253();
                            sb = new StringBuilder(255);
                            sb.append(cFirst);
                        } else if (c11212.m28248()) {
                            sb.append(cFirst);
                        }
                    }
                } else if (c11212.m28250()) {
                    sb2.append(cFirst);
                } else if (c11212.m28255()) {
                    c11212.m28251();
                } else if (c11212.m28254()) {
                    throw new C13670("Unexpected '" + cFirst + "' when parsing:\n\t" + str);
                }
            } else if (c11212.m28250()) {
                sb2.append(cFirst);
            } else {
                if (!c11212.m28248()) {
                    throw new C13670("Unexpected '" + cFirst + "' when parsing:\n\t" + str);
                }
                c11212.m28247();
            }
            cFirst = stringCharacterIterator.next();
        }
        if (!c11212.m28254()) {
            throw new C13670("Element did not complete normally.");
        }
        c5247.m15803(arrayList);
        c5247.m15804(str.charAt(str.lastIndexOf(62) - 1) == '/');
        return c5247;
    }
}
