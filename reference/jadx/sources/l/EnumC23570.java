package l;

import java.util.HashMap;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩹۬ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77EG */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23570 {
    ITEM_UNKNOWN(-1, "??? Unknown verification type", "UNKNOWN"),
    ITEM_Bogus(0, "bogus", "B"),
    ITEM_Integer(1, ClassTransform.INTEGER, "I"),
    ITEM_Float(2, ClassTransform.FLOAT, "F"),
    ITEM_Double(3, ClassTransform.DOUBLE, "D"),
    ITEM_Long(4, ClassTransform.LONG, "L"),
    ITEM_Null(5, "null", "N"),
    ITEM_InitObject(6, "this", "IO"),
    ITEM_Object(7, "CP", "O"),
    ITEM_NewObject(8, "at", "NO");


    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static HashMap f76129;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap f76132;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap f76133;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f76134;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Integer f76135;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f76136;

    EnumC23570(Integer num, String str, String str2) {
        this.f76135 = num;
        this.f76136 = str;
        this.f76134 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52763(int i) {
        return i >= ITEM_Bogus.f76135.intValue() && i <= ITEM_NewObject.f76135.intValue();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC23570 m52765(String str) {
        if (f76129 == null) {
            f76129 = (HashMap) C13847.stream(values()).collect(C2025.toMap(new C3900(9), C24247.identity()));
        }
        return (EnumC23570) f76129.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23570 m52762(String str) {
        if (f76132 == null) {
            f76132 = (HashMap) C13847.stream(values()).collect(C2025.toMap(new C0652(3), C24247.identity()));
        }
        EnumC23570 enumC23570 = (EnumC23570) f76132.get(str);
        return enumC23570 == null ? ITEM_UNKNOWN : enumC23570;
    }

    public static EnumC23570 get(int i) {
        if (f76133 == null) {
            f76133 = (HashMap) C13847.stream(values()).collect(C2025.toMap(new C19705(7), C24247.identity()));
        }
        return (EnumC23570) f76133.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m52766() {
        return this.f76134;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String m52768() {
        return this.f76136;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Integer m52767() {
        return this.f76135;
    }
}
