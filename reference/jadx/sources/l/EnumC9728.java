package l;

import java.util.HashMap;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۢܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77EG */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9728 {
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


    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static HashMap f32735;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static HashMap f32741;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static HashMap f32743;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Integer f32748;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f32749;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f32750;

    EnumC9728(Integer num, String str, String str2) {
        this.f32748 = num;
        this.f32750 = str;
        this.f32749 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24685(int i) {
        return i >= ITEM_Bogus.f32748.intValue() && i <= ITEM_NewObject.f32748.intValue();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC9728 m24686(String str) {
        if (f32741 == null) {
            f32741 = (HashMap) C20318.stream(values()).collect(C1890.toMap(new C7497(7), C4277.identity()));
        }
        return (EnumC9728) f32741.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC9728 m24684(String str) {
        if (f32743 == null) {
            f32743 = (HashMap) C20318.stream(values()).collect(C1890.toMap(new C3105(7), C4277.identity()));
        }
        EnumC9728 enumC9728 = (EnumC9728) f32743.get(str);
        return enumC9728 == null ? ITEM_UNKNOWN : enumC9728;
    }

    public static EnumC9728 get(int i) {
        if (f32735 == null) {
            f32735 = (HashMap) C20318.stream(values()).collect(C1890.toMap(new C16485(9), C4277.identity()));
        }
        return (EnumC9728) f32735.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m24687() {
        return this.f32749;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String m24689() {
        return this.f32750;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Integer m24688() {
        return this.f32748;
    }
}
