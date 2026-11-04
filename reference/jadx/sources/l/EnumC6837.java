package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;

/* JADX INFO: renamed from: l.ۜۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ND */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6837 {
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


    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final C7757 f22720 = new C7757(16);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte f22727;

    static {
        for (EnumC6837 enumC6837 : values()) {
            f22720.m21128(enumC6837.f22727, enumC6837);
        }
    }

    EnumC6837(byte b) {
        this.f22727 = b;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC6837 m19053(byte b) {
        return (EnumC6837) f22720.m21127(b);
    }
}
