package l;

import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩹ۙ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R7EK */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23323 {
    T_INT(10, ClassTransform.INTEGER),
    T_LONG(11, ClassTransform.LONG),
    T_FLOAT(6, ClassTransform.FLOAT),
    T_DOUBLE(7, ClassTransform.DOUBLE),
    T_CLASS(2, Name.LABEL),
    T_BOOLEAN(4, ClassTransform.BOOLEAN),
    T_CHAR(5, ClassTransform.CHARACTER),
    T_BYTE(8, ClassTransform.BYTE),
    T_SHORT(9, ClassTransform.SHORT);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f75555;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Integer f75556;

    EnumC23323(Integer num, String str) {
        this.f75556 = num;
        this.f75555 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m52474() {
        return this.f75555;
    }
}
