package l;

import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܰۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X9Q3 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC14545 {
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


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f45844;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f45845;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final char f45846;

    EnumC14545(char c, String str, int i) {
        this.f45846 = c;
        this.f45845 = str;
        this.f45844 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC14545 m35092(char c) {
        for (EnumC14545 enumC14545 : values()) {
            if (enumC14545.f45846 == c) {
                return enumC14545;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m35094() {
        return this.f45844;
    }
}
