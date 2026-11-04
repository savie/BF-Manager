package l;

/* JADX INFO: renamed from: l.᩵ᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35R0 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20768 {
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


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f66542;

    EnumC20768(int i) {
        this.f66542 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m47514() {
        return (this.f66542 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m47517() {
        return (this.f66542 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m47516() {
        return (this.f66542 & 4) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m47513() {
        return (this.f66542 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean m47515() {
        return (this.f66542 & 8) != 0;
    }
}
