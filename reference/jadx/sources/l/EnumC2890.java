package l;

/* JADX INFO: renamed from: l.ۗ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 35R0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2890 {
    LOCAL_START(1),
    LOCAL_END(1),
    ASSIGN(17),
    IDENTITY(1),
    LABEL(1),
    LOCK(9),
    NOP(1),
    UNLOCK(9),
    VOID_INVOKE(9),
    FILL_ARRAY_DATA(9),
    RETURN(16),
    RETURN_VOID(0),
    THROW(8),
    GOTO(2),
    IF(19),
    LOOKUP_SWITCH(20),
    TABLE_SWITCH(20);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f10909;

    EnumC2890(int i) {
        this.f10909 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m8695() {
        return (this.f10909 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m8697() {
        return (this.f10909 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m8696() {
        return (this.f10909 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean m8694() {
        return (this.f10909 & 16) != 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean m8693() {
        return (this.f10909 & 8) != 0;
    }
}
