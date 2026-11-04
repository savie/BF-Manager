package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.UMConfigure;
import java.util.HashMap;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.ۛ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5S4 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6266 {
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
    public static final EnumC6266[] f21267;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static HashMap f21269;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f21275;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f21276;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f21277;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f21278;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f21279;

    static {
        EnumC6266[] enumC6266ArrValues = values();
        f21267 = enumC6266ArrValues;
        f21269 = new HashMap();
        for (EnumC6266 enumC6266 : enumC6266ArrValues) {
            f21269.put(enumC6266.f21277, enumC6266);
        }
    }

    EnumC6266(int i, String str, boolean z, boolean z2, boolean z3) {
        this.f21276 = i;
        this.f21277 = str;
        this.f21279 = z;
        this.f21275 = z2;
        this.f21278 = z3;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static EnumC6266[] m17923(int i) {
        int i2 = 0;
        for (EnumC6266 enumC6266 : f21267) {
            if (enumC6266.f21279 && (enumC6266.f21276 & i) != 0) {
                i2++;
            }
        }
        EnumC6266[] enumC6266Arr = new EnumC6266[i2];
        int i3 = 0;
        for (EnumC6266 enumC6267 : f21267) {
            if (enumC6267.f21279 && (enumC6267.f21276 & i) != 0) {
                enumC6266Arr[i3] = enumC6267;
                i3++;
            }
        }
        return enumC6266Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m17918(EnumC6266[] enumC6266Arr) {
        int length = 0;
        for (EnumC6266 enumC6266 : enumC6266Arr) {
            length += enumC6266.toString().length() + 1;
        }
        StringBuilder sb = new StringBuilder(length);
        for (EnumC6266 enumC6267 : enumC6266Arr) {
            sb.append(enumC6267.toString());
            sb.append(" ");
        }
        if (enumC6266Arr.length > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m17917(int i) {
        return m17918(m17923(i));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static EnumC6266[] m17921(int i) {
        int i2 = 0;
        for (EnumC6266 enumC6266 : f21267) {
            if (enumC6266.f21275 && (enumC6266.f21276 & i) != 0) {
                i2++;
            }
        }
        EnumC6266[] enumC6266Arr = new EnumC6266[i2];
        int i3 = 0;
        for (EnumC6266 enumC6267 : f21267) {
            if (enumC6267.f21275 && (enumC6267.f21276 & i) != 0) {
                enumC6266Arr[i3] = enumC6267;
                i3++;
            }
        }
        return enumC6266Arr;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m17925(int i) {
        return m17918(m17921(i));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static EnumC6266[] m17922(int i) {
        int i2 = 0;
        for (EnumC6266 enumC6266 : f21267) {
            if (enumC6266.f21278 && (enumC6266.f21276 & i) != 0) {
                i2++;
            }
        }
        EnumC6266[] enumC6266Arr = new EnumC6266[i2];
        int i3 = 0;
        for (EnumC6266 enumC6267 : f21267) {
            if (enumC6267.f21278 && (enumC6267.f21276 & i) != 0) {
                enumC6266Arr[i3] = enumC6267;
                i3++;
            }
        }
        return enumC6266Arr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m17924(int i) {
        return m17918(m17922(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC6266 m17919(String str) {
        return (EnumC6266) f21269.get(str);
    }

    public int getValue() {
        return this.f21276;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f21277;
    }
}
