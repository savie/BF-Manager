package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.UMConfigure;
import java.util.HashMap;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.ܶ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E5S4 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15236 {
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
    public static final EnumC15236[] f49681;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap f49682;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f49686;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f49687;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f49688;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f49689;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f49690;

    static {
        EnumC15236[] enumC15236ArrValues = values();
        f49681 = enumC15236ArrValues;
        f49682 = new HashMap();
        for (EnumC15236 enumC15236 : enumC15236ArrValues) {
            f49682.put(enumC15236.f49688, enumC15236);
        }
    }

    EnumC15236(int i, String str, boolean z, boolean z2, boolean z3) {
        this.f49687 = i;
        this.f49688 = str;
        this.f49690 = z;
        this.f49689 = z2;
        this.f49686 = z3;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static EnumC15236[] m36498(int i) {
        int i2 = 0;
        for (EnumC15236 enumC15236 : f49681) {
            if (enumC15236.f49690 && (enumC15236.f49687 & i) != 0) {
                i2++;
            }
        }
        EnumC15236[] enumC15236Arr = new EnumC15236[i2];
        int i3 = 0;
        for (EnumC15236 enumC15237 : f49681) {
            if (enumC15237.f49690 && (enumC15237.f49687 & i) != 0) {
                enumC15236Arr[i3] = enumC15237;
                i3++;
            }
        }
        return enumC15236Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36493(EnumC15236[] enumC15236Arr) {
        int length = 0;
        for (EnumC15236 enumC15236 : enumC15236Arr) {
            length += enumC15236.toString().length() + 1;
        }
        StringBuilder sb = new StringBuilder(length);
        for (EnumC15236 enumC15237 : enumC15236Arr) {
            sb.append(enumC15237.toString());
            sb.append(" ");
        }
        if (enumC15236Arr.length > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m36497(int i) {
        return m36493(m36498(i));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static EnumC15236[] m36496(int i) {
        int i2 = 0;
        for (EnumC15236 enumC15236 : f49681) {
            if (enumC15236.f49689 && (enumC15236.f49687 & i) != 0) {
                i2++;
            }
        }
        EnumC15236[] enumC15236Arr = new EnumC15236[i2];
        int i3 = 0;
        for (EnumC15236 enumC15237 : f49681) {
            if (enumC15237.f49689 && (enumC15237.f49687 & i) != 0) {
                enumC15236Arr[i3] = enumC15237;
                i3++;
            }
        }
        return enumC15236Arr;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m36495(int i) {
        return m36493(m36496(i));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static EnumC15236[] m36490(int i) {
        int i2 = 0;
        for (EnumC15236 enumC15236 : f49681) {
            if (enumC15236.f49686 && (enumC15236.f49687 & i) != 0) {
                i2++;
            }
        }
        EnumC15236[] enumC15236Arr = new EnumC15236[i2];
        int i3 = 0;
        for (EnumC15236 enumC15237 : f49681) {
            if (enumC15237.f49686 && (enumC15237.f49687 & i) != 0) {
                enumC15236Arr[i3] = enumC15237;
                i3++;
            }
        }
        return enumC15236Arr;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m36491(int i) {
        return m36493(m36490(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC15236 m36494(String str) {
        return (EnumC15236) f49682.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m36501(int i) {
        return (i & this.f49687) != 0;
    }

    public int getValue() {
        return this.f49687;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f49688;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m36500() {
        return this.f49688;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m36503() {
        return this.f49690;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m36502() {
        return this.f49686;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean m36499() {
        return this.f49689;
    }
}
