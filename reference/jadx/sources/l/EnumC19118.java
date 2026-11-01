package l;

/* JADX INFO: renamed from: l.᩵֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M5P4 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC19118 {
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
    public static EnumC19118[] f61759 = new EnumC19118[11];

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte f61769;

    static {
        for (EnumC19118 enumC19118 : values()) {
            f61759[enumC19118.f61769 & 255] = enumC19118;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC19118 m43916(byte b) {
        return f61759[(byte) Math.min(b & 255, 10)];
    }

    EnumC19118(byte b) {
        this.f61769 = b;
    }
}
