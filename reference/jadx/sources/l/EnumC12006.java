package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۨ֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 83DV */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12006 {
    BOOLEAN("Z", ClassTransform.BOOLEAN, AbstractC1566.m5538("java.lang.Boolean")),
    CHAR("C", ClassTransform.CHARACTER, AbstractC1566.m5538("java.lang.Character")),
    BYTE("B", ClassTransform.BYTE, AbstractC1566.m5538("java.lang.Byte")),
    SHORT("S", ClassTransform.SHORT, AbstractC1566.m5538("java.lang.Short")),
    INT("I", ClassTransform.INTEGER, AbstractC1566.m5538("java.lang.Integer")),
    FLOAT("F", ClassTransform.FLOAT, AbstractC1566.m5538("java.lang.Float")),
    LONG("J", ClassTransform.LONG, AbstractC1566.m5538("java.lang.Long")),
    DOUBLE("D", ClassTransform.DOUBLE, AbstractC1566.m5538("java.lang.Double")),
    OBJECT("L", "OBJECT", AbstractC1566.f5426),
    ARRAY("[", "ARRAY", AbstractC1566.f5435),
    VOID("V", ClassTransform.VOID, AbstractC1566.m5538("java.lang.Void"));


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f38725;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f38726;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f38727;

    EnumC12006(String str, String str2, AbstractC1566 abstractC1566) {
        this.f38726 = str;
        this.f38727 = str2;
        this.f38725 = abstractC1566;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String m30193() {
        return this.f38726;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String m30194() {
        return this.f38727;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC1566 m30191() {
        return this.f38725;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38727;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean m30192() {
        return this == OBJECT || this == ARRAY;
    }
}
