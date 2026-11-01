package l;

import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۜ۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07Q0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6617 {
    BYTE(1, q.h, true),
    CHAR(2, 122, true),
    SHORT(4, 124, true),
    LONG(16, UMErrorCode.E_UM_BE_DEFLATE_FAILED, true),
    FLOAT(32, 96, true),
    INT(8, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, true),
    DOUBLE(64, 64, true),
    BOOLEAN(0, 0, true),
    VOID,
    CLASS,
    ARRAY,
    METHOD,
    PACKAGE,
    MODULE,
    TYPEVAR,
    WILDCARD,
    FORALL,
    DEFERRED,
    BOT,
    NONE,
    ERROR,
    UNKNOWN,
    UNDETVAR,
    UNINITIALIZED_THIS,
    UNINITIALIZED_OBJECT;


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f22296;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f22297;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f22298;

    EnumC6617() {
        this(0, 0, false);
    }

    EnumC6617(int i, int i2, boolean z) {
        this.f22296 = i2;
        this.f22298 = i;
        this.f22297 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m17951(EnumC6617 enumC6617) {
        return ((this.f22296 & enumC6617.f22298) == 0 || this == enumC6617) ? false : true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m17953(EnumC6617 enumC6617) {
        return (enumC6617.f22298 & this.f22296) != 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int m17947() {
        return UNDETVAR.ordinal() + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC12490 m17949() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return EnumC12490.CHAR_LITERAL;
        }
        if (iOrdinal == 9) {
            return EnumC12490.STRING_LITERAL;
        }
        if (iOrdinal == 18) {
            return EnumC12490.NULL_LITERAL;
        }
        if (iOrdinal == 3) {
            return EnumC12490.LONG_LITERAL;
        }
        if (iOrdinal == 4) {
            return EnumC12490.FLOAT_LITERAL;
        }
        if (iOrdinal == 5) {
            return EnumC12490.INT_LITERAL;
        }
        if (iOrdinal == 6) {
            return EnumC12490.DOUBLE_LITERAL;
        }
        if (iOrdinal == 7) {
            return EnumC12490.BOOLEAN_LITERAL;
        }
        throw new AssertionError("unknown literal kind " + this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC19688 m17952() {
        switch (this) {
            case BYTE:
                return EnumC19688.BYTE;
            case CHAR:
                return EnumC19688.CHAR;
            case SHORT:
                return EnumC19688.SHORT;
            case LONG:
                return EnumC19688.LONG;
            case FLOAT:
                return EnumC19688.FLOAT;
            case INT:
                return EnumC19688.INT;
            case DOUBLE:
                return EnumC19688.DOUBLE;
            case BOOLEAN:
                return EnumC19688.BOOLEAN;
            case VOID:
                return EnumC19688.VOID;
            default:
                throw new AssertionError("unknown primitive type " + this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m17950(int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return -128 <= i && i <= 127;
        }
        if (iOrdinal == 1) {
            return i >= 0 && i <= 65535;
        }
        if (iOrdinal == 2) {
            return -32768 <= i && i <= 32767;
        }
        if (iOrdinal == 5) {
            return true;
        }
        if (iOrdinal == 7) {
            return i >= 0 && i <= 1;
        }
        throw new AssertionError();
    }
}
