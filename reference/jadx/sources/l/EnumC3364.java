package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.UMConfigure;
import java.util.HashMap;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.ۗܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E5S4 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3364 {
    PUBLIC(1, "public", true, true, true),
    PRIVATE(2, "private", true, true, true),
    PROTECTED(4, "protected", true, true, true),
    STATIC(8, "static", true, true, true),
    FINAL(16, "final", true, true, true),
    SYNCHRONIZED(32, MessageHandler.Properties.IsSynchronized, false, true, false),
    VOLATILE(64, "volatile", false, false, true),
    BRIDGE(64, "bridge", false, true, false),
    TRANSIENT(128, "transient", false, false, true),
    VARARGS(128, "varargs", false, true, false),
    NATIVE(256, UMConfigure.WRAPER_TYPE_NATIVE, false, true, false),
    INTERFACE(512, "interface", true, false, false),
    ABSTRACT(1024, "abstract", true, true, false),
    STRICTFP(2048, "strictfp", false, true, false),
    SYNTHETIC(4096, "synthetic", true, true, true),
    ANNOTATION(8192, "annotation", true, false, false),
    ENUM(16384, "enum", true, false, true),
    CONSTRUCTOR(65536, "constructor", false, true, false),
    DECLARED_SYNCHRONIZED(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, "declared-synchronized", false, true, false);


    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC3364[] f12466;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap f12467;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f12471;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f12472;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f12473;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f12474;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f12475;

    static {
        EnumC3364[] enumC3364ArrValues = values();
        f12466 = enumC3364ArrValues;
        f12467 = new HashMap();
        for (EnumC3364 enumC3364 : enumC3364ArrValues) {
            f12467.put(enumC3364.f12473, enumC3364);
        }
    }

    EnumC3364(int i, String str, boolean z, boolean z2, boolean z3) {
        this.f12472 = i;
        this.f12473 = str;
        this.f12475 = z;
        this.f12474 = z2;
        this.f12471 = z3;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static EnumC3364[] m10021(int i) {
        int i2 = 0;
        for (EnumC3364 enumC3364 : f12466) {
            if (enumC3364.f12475 && (enumC3364.f12472 & i) != 0) {
                i2++;
            }
        }
        EnumC3364[] enumC3364Arr = new EnumC3364[i2];
        int i3 = 0;
        for (EnumC3364 enumC3365 : f12466) {
            if (enumC3365.f12475 && (enumC3365.f12472 & i) != 0) {
                enumC3364Arr[i3] = enumC3365;
                i3++;
            }
        }
        return enumC3364Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m10018(EnumC3364[] enumC3364Arr) {
        int length = 0;
        for (EnumC3364 enumC3364 : enumC3364Arr) {
            length += enumC3364.toString().length() + 1;
        }
        StringBuilder sb = new StringBuilder(length);
        for (EnumC3364 enumC3365 : enumC3364Arr) {
            sb.append(enumC3365.toString());
            sb.append(" ");
        }
        if (enumC3364Arr.length > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m10017(int i) {
        return m10018(m10021(i));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static EnumC3364[] m10015(int i) {
        int i2 = 0;
        for (EnumC3364 enumC3364 : f12466) {
            if (enumC3364.f12474 && (enumC3364.f12472 & i) != 0) {
                i2++;
            }
        }
        EnumC3364[] enumC3364Arr = new EnumC3364[i2];
        int i3 = 0;
        for (EnumC3364 enumC3365 : f12466) {
            if (enumC3365.f12474 && (enumC3365.f12472 & i) != 0) {
                enumC3364Arr[i3] = enumC3365;
                i3++;
            }
        }
        return enumC3364Arr;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m10016(int i) {
        return m10018(m10015(i));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static EnumC3364[] m10023(int i) {
        int i2 = 0;
        for (EnumC3364 enumC3364 : f12466) {
            if (enumC3364.f12471 && (enumC3364.f12472 & i) != 0) {
                i2++;
            }
        }
        EnumC3364[] enumC3364Arr = new EnumC3364[i2];
        int i3 = 0;
        for (EnumC3364 enumC3365 : f12466) {
            if (enumC3365.f12471 && (enumC3365.f12472 & i) != 0) {
                enumC3364Arr[i3] = enumC3365;
                i3++;
            }
        }
        return enumC3364Arr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m10022(int i) {
        return m10018(m10023(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC3364 m10019(String str) {
        return (EnumC3364) f12467.get(str);
    }

    public int getValue() {
        return this.f12472;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f12473;
    }
}
