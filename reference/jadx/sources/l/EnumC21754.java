package l;

/* JADX INFO: renamed from: l.᩷ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5P4 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC21754 {
    DBG_END_SEQUENCE((byte) 0),
    DBG_ADVANCE_PC((byte) 1),
    DBG_ADVANCE_LINE((byte) 2),
    DBG_START_LOCAL((byte) 3),
    DBG_START_LOCAL_EXTENDED((byte) 4),
    DBG_END_LOCAL((byte) 5),
    DBG_RESTART_LOCAL((byte) 6),
    DBG_SET_PROLOGUE_END((byte) 7),
    DBG_SET_EPILOGUE_BEGIN((byte) 8),
    DBG_SET_FILE((byte) 9),
    DBG_SPECIAL_OPCODE((byte) 10);


    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static EnumC21754[] f69380 = new EnumC21754[11];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte f69390;

    static {
        for (EnumC21754 enumC21754 : values()) {
            f69380[enumC21754.f69390 & 255] = enumC21754;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC21754 m49309(byte b) {
        return f69380[(byte) Math.min(b & 255, 10)];
    }

    EnumC21754(byte b) {
        this.f69390 = b;
    }
}
