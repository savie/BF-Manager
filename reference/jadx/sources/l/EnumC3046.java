package l;

import com.umeng.analytics.pro.am;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۗۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7EK */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3046 {
    AE_BYTE("B", ClassTransform.BYTE),
    AE_CHAR("C", ClassTransform.CHARACTER),
    AE_SHORT("S", ClassTransform.SHORT),
    AE_INT("I", ClassTransform.INTEGER),
    AE_LONG("J", ClassTransform.LONG),
    AE_FLOAT("F", ClassTransform.FLOAT),
    AE_DOUBLE("D", ClassTransform.DOUBLE),
    AE_BOOLEAN("Z", ClassTransform.BOOLEAN),
    AE_STRING(am.aB, "string"),
    AE_ENUM("e", "enum"),
    AE_CLASS(am.aF, Name.LABEL),
    AE_ANNOTATION("@", "annotation"),
    AE_ARRAY("[", "array"),
    AE_UNKNOWN("U", "unknown"),
    AE_NOT_APPLICABLE("N", "not applicable");


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f11425;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f11426;

    EnumC3046(String str, String str2) {
        this.f11426 = str;
        this.f11425 = str2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String m9141() {
        return this.f11426;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m9140() {
        return this.f11425;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char m9142() {
        return this.f11426.charAt(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9138(char c) {
        return (AE_NOT_APPLICABLE.m9142() == c || AE_UNKNOWN.m9142() == c) ? false : true;
    }
}
