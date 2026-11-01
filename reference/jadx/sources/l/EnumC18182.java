package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;

/* JADX INFO: renamed from: l.ᩳܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ND */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC18182 {
    VALUE_BYTE((byte) 0),
    VALUE_SHORT((byte) 2),
    VALUE_CHAR((byte) 3),
    VALUE_INT((byte) 4),
    VALUE_LONG((byte) 6),
    VALUE_FLOAT((byte) 16),
    VALUE_DOUBLE((byte) 17),
    VALUE_STRING((byte) 23),
    VALUE_TYPE((byte) 24),
    VALUE_FIELD((byte) 25),
    VALUE_METHOD((byte) 26),
    VALUE_ENUM((byte) 27),
    VALUE_ARRAY(ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB),
    VALUE_ANNOTATION((byte) 29),
    VALUE_NULL((byte) 30),
    VALUE_BOOLEAN(bo.j);


    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final C1123 f58126 = new C1123(16);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte f58128;

    static {
        for (EnumC18182 enumC18182 : values()) {
            f58126.m4152(enumC18182.f58128, enumC18182);
        }
    }

    EnumC18182(byte b) {
        this.f58128 = b;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC18182 m42307(byte b) {
        return (EnumC18182) f58126.m4151(b);
    }
}
