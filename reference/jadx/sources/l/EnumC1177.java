package l;

import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֨ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9Q3 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1177 {
    Array('[', Name.REFER, 1),
    Boolean('Z', ClassTransform.BOOLEAN, 1),
    Byte('B', ClassTransform.BYTE, 1),
    Char('C', ClassTransform.CHARACTER, 1),
    Double('D', ClassTransform.DOUBLE, 2),
    Float('F', ClassTransform.FLOAT, 1),
    Int('I', ClassTransform.INTEGER, 1),
    LReference('L', Name.REFER, 1),
    Long('J', ClassTransform.LONG, 2),
    QReference('Q', Name.REFER, 1),
    Short('S', ClassTransform.SHORT, 1);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f5246;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f5247;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final char f5248;

    EnumC1177(char c, String str, int i) {
        this.f5248 = c;
        this.f5246 = str;
        this.f5247 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC1177 m4308(char c) {
        for (EnumC1177 enumC1177 : values()) {
            if (enumC1177.f5248 == c) {
                return enumC1177;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m4310() {
        return this.f5247;
    }
}
