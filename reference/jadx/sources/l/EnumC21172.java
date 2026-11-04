package l;

import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩶۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 07Q0 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC21172 {
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


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f67612;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f67613;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f67614;

    EnumC21172() {
        this(0, 0, false);
    }

    EnumC21172(int i, int i2, boolean z) {
        this.f67613 = i2;
        this.f67614 = i;
        this.f67612 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m48308(EnumC21172 enumC21172) {
        return ((this.f67613 & enumC21172.f67614) == 0 || this == enumC21172) ? false : true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m48309(EnumC21172 enumC21172) {
        return (enumC21172.f67614 & this.f67613) != 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int m48304() {
        return UNDETVAR.ordinal() + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC22621 m48306() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return EnumC22621.CHAR_LITERAL;
        }
        if (iOrdinal == 9) {
            return EnumC22621.STRING_LITERAL;
        }
        if (iOrdinal == 18) {
            return EnumC22621.NULL_LITERAL;
        }
        if (iOrdinal == 3) {
            return EnumC22621.LONG_LITERAL;
        }
        if (iOrdinal == 4) {
            return EnumC22621.FLOAT_LITERAL;
        }
        if (iOrdinal == 5) {
            return EnumC22621.INT_LITERAL;
        }
        if (iOrdinal == 6) {
            return EnumC22621.DOUBLE_LITERAL;
        }
        if (iOrdinal == 7) {
            return EnumC22621.BOOLEAN_LITERAL;
        }
        throw new AssertionError("unknown literal kind " + this);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC18720 m48310() {
        switch (this) {
            case BYTE:
                return EnumC18720.BYTE;
            case CHAR:
                return EnumC18720.CHAR;
            case SHORT:
                return EnumC18720.SHORT;
            case LONG:
                return EnumC18720.LONG;
            case FLOAT:
                return EnumC18720.FLOAT;
            case INT:
                return EnumC18720.INT;
            case DOUBLE:
                return EnumC18720.DOUBLE;
            case BOOLEAN:
                return EnumC18720.BOOLEAN;
            case VOID:
                return EnumC18720.VOID;
            default:
                throw new AssertionError("unknown primitive type " + this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m48307(int i) {
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
