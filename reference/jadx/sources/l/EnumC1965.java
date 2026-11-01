package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.֫ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77EG */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1965 {
    UNKNOWN_TYPE(-1, -1, "unknown", false, false, false),
    SAME_FRAME(0, 63, "same", false, false, false),
    SAME_LOCALS_1_STACK_ITEM_FRAME(64, 127, "stack1", false, true, false),
    RESERVED(128, 245, "reserved", false, false, false),
    EARLY_LARVAL(246, 246, "early_larval", false, false, true),
    SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED(247, 247, "stack1_ex", false, true, false),
    CHOP_1_FRAME(250, 250, "chop1", false, false, false),
    CHOP_2_FRAME(249, 249, "chop2", false, false, false),
    CHOP_3_FRAME(248, 248, "chop3", false, false, false),
    SAME_FRAME_EXTENDED(251, 251, "same_ex", false, false, false),
    APPEND_FRAME(252, Scalar25519.TARGET_LENGTH, "append", true, false, false),
    FULL_FRAME(255, 255, "full", true, true, false);


    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap f7391;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f7393;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C3937 f7394;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f7395;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f7396;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f7397;

    EnumC1965(int i, int i2, String str, boolean z, boolean z2, boolean z3) {
        this.f7394 = new C3937(Integer.valueOf(i), Integer.valueOf(i2));
        this.f7396 = str;
        this.f7397 = z;
        this.f7393 = z2;
        this.f7395 = z3;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m6341() {
        return this.f7397;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean m6337() {
        return this.f7393;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m6343() {
        return this.f7395;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC1965 m6334(String str) {
        if (f7391 == null) {
            f7391 = (HashMap) C20318.stream(values()).collect(C1890.toMap(new C4686(6), C4277.identity()));
        }
        EnumC1965 enumC1965 = (EnumC1965) f7391.get(str);
        return enumC1965 == null ? UNKNOWN_TYPE : enumC1965;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC1965 m6335(int i) {
        for (EnumC1965 enumC1965 : values()) {
            if (enumC1965.m6340(i)) {
                return enumC1965;
            }
        }
        return UNKNOWN_TYPE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m6339() {
        return ((Integer) this.f7394.m11411()).intValue();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String m6342() {
        return this.f7396;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String m6338() {
        String strReplace = name().toLowerCase().replace("_frame", "");
        return strReplace.startsWith("chop") ? this.f7396 : strReplace;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m6340(int i) {
        return this.f7394.m11412(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m6333(int i) {
        Object[] objArr = {UNKNOWN_TYPE, RESERVED};
        HashSet hashSet = new HashSet(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj = objArr[i2];
            C13638.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        Iterator it = C0561.unmodifiableSet(hashSet).iterator();
        while (it.hasNext()) {
            if (((EnumC1965) it.next()).m6340(i)) {
                return false;
            }
        }
        return true;
    }
}
