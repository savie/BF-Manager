package l;

import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.֡᩺۟, reason: contains not printable characters */
/* JADX INFO: compiled from: D445 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0720 {
    NONE,
    CLASS,
    UNSET;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC0720 m3140(String str) {
        if (str == null) {
            return UNSET;
        }
        if (str.equals("none")) {
            return NONE;
        }
        if (str.equals(Name.LABEL)) {
            return CLASS;
        }
        return UNSET;
    }
}
