package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.UMConfigure;
import java.util.HashMap;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.ۖ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5S4 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2536 {
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


    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC2536[] f8105;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static HashMap f8107;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f8113;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f8114;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f8115;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f8116;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f8117;

    static {
        EnumC2536[] enumC2536ArrValues = values();
        f8105 = enumC2536ArrValues;
        f8107 = new HashMap();
        for (EnumC2536 enumC2536 : enumC2536ArrValues) {
            f8107.put(enumC2536.f8115, enumC2536);
        }
    }

    EnumC2536(int i, String str, boolean z, boolean z2, boolean z3) {
        this.f8114 = i;
        this.f8115 = str;
        this.f8117 = z;
        this.f8113 = z2;
        this.f8116 = z3;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static EnumC2536[] m8454(int i) {
        int i2 = 0;
        for (EnumC2536 enumC2536 : f8105) {
            if (enumC2536.f8117 && (enumC2536.f8114 & i) != 0) {
                i2++;
            }
        }
        EnumC2536[] enumC2536Arr = new EnumC2536[i2];
        int i3 = 0;
        for (EnumC2536 enumC2537 : f8105) {
            if (enumC2537.f8117 && (enumC2537.f8114 & i) != 0) {
                enumC2536Arr[i3] = enumC2537;
                i3++;
            }
        }
        return enumC2536Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m8450(EnumC2536[] enumC2536Arr) {
        int length = 0;
        for (EnumC2536 enumC2536 : enumC2536Arr) {
            length += enumC2536.toString().length() + 1;
        }
        StringBuilder sb = new StringBuilder(length);
        for (EnumC2536 enumC2537 : enumC2536Arr) {
            sb.append(enumC2537.toString());
            sb.append(" ");
        }
        if (enumC2536Arr.length > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m8456(int i) {
        return m8450(m8454(i));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static EnumC2536[] m8452(int i) {
        int i2 = 0;
        for (EnumC2536 enumC2536 : f8105) {
            if (enumC2536.f8113 && (enumC2536.f8114 & i) != 0) {
                i2++;
            }
        }
        EnumC2536[] enumC2536Arr = new EnumC2536[i2];
        int i3 = 0;
        for (EnumC2536 enumC2537 : f8105) {
            if (enumC2537.f8113 && (enumC2537.f8114 & i) != 0) {
                enumC2536Arr[i3] = enumC2537;
                i3++;
            }
        }
        return enumC2536Arr;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m8455(int i) {
        return m8450(m8452(i));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static EnumC2536[] m8453(int i) {
        int i2 = 0;
        for (EnumC2536 enumC2536 : f8105) {
            if (enumC2536.f8116 && (enumC2536.f8114 & i) != 0) {
                i2++;
            }
        }
        EnumC2536[] enumC2536Arr = new EnumC2536[i2];
        int i3 = 0;
        for (EnumC2536 enumC2537 : f8105) {
            if (enumC2537.f8116 && (enumC2537.f8114 & i) != 0) {
                enumC2536Arr[i3] = enumC2537;
                i3++;
            }
        }
        return enumC2536Arr;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m8457(int i) {
        return m8450(m8453(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC2536 m8451(String str) {
        return (EnumC2536) f8107.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m8459(int i) {
        return (i & this.f8114) != 0;
    }

    public int getValue() {
        return this.f8114;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f8115;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m8458() {
        return this.f8115;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m8462() {
        return this.f8117;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m8461() {
        return this.f8116;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean m8460() {
        return this.f8113;
    }
}
