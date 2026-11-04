package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ܶ۬ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77EG */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC16110 {
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


    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static HashMap f52188;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f52193;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C9990 f52194;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f52195;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f52196;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f52197;

    EnumC16110(int i, int i2, String str, boolean z, boolean z2, boolean z3) {
        this.f52194 = new C9990(Integer.valueOf(i), Integer.valueOf(i2));
        this.f52193 = str;
        this.f52197 = z;
        this.f52196 = z2;
        this.f52195 = z3;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m38279() {
        return this.f52197;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean m38278() {
        return this.f52196;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m38280() {
        return this.f52195;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC16110 m38270(String str) {
        if (f52188 == null) {
            f52188 = (HashMap) C13847.stream(values()).collect(C2025.toMap(new C4527(7), C24247.identity()));
        }
        EnumC16110 enumC16110 = (EnumC16110) f52188.get(str);
        return enumC16110 == null ? UNKNOWN_TYPE : enumC16110;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC16110 m38271(int i) {
        for (EnumC16110 enumC16110 : values()) {
            if (enumC16110.m38276(i)) {
                return enumC16110;
            }
        }
        return UNKNOWN_TYPE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m38275() {
        return ((Integer) this.f52194.m25834()).intValue();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String m38277() {
        return this.f52193;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m38274() {
        String strReplace = name().toLowerCase().replace("_frame", "");
        return strReplace.startsWith("chop") ? this.f52193 : strReplace;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m38276(int i) {
        return this.f52194.m25835(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m38272(int i) {
        Object[] objArr = {UNKNOWN_TYPE, RESERVED};
        HashSet hashSet = new HashSet(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj = objArr[i2];
            C17359.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
            }
        }
        Iterator it = C4681.unmodifiableSet(hashSet).iterator();
        while (it.hasNext()) {
            if (((EnumC16110) it.next()).m38276(i)) {
                return false;
            }
        }
        return true;
    }
}
