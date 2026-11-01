package l;

/* JADX INFO: renamed from: l.֫᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: F9JY */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2162 {
    SMB2_NEGOTIATE(0),
    SMB2_SESSION_SETUP(1),
    SMB2_LOGOFF(2),
    SMB2_TREE_CONNECT(3),
    SMB2_TREE_DISCONNECT(4),
    SMB2_CREATE(5),
    SMB2_CLOSE(6),
    SMB2_FLUSH(7),
    SMB2_READ(8),
    SMB2_WRITE(9),
    SMB2_LOCK(10),
    SMB2_IOCTL(11),
    SMB2_CANCEL(12),
    SMB2_ECHO(13),
    SMB2_QUERY_DIRECTORY(14),
    SMB2_CHANGE_NOTIFY(15),
    SMB2_QUERY_INFO(16),
    SMB2_SET_INFO(17),
    SMB2_OPLOCK_BREAK(18);


    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC2162[] f7843 = new EnumC2162[19];

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f7859;

    static {
        for (EnumC2162 enumC2162 : values()) {
            f7843[enumC2162.getValue()] = enumC2162;
        }
    }

    EnumC2162(int i) {
        this.f7859 = i;
    }

    public int getValue() {
        return this.f7859;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC2162 m6727(int i) {
        return f7843[i];
    }
}
