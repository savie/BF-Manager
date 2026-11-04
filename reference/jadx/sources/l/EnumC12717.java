package l;

/* JADX INFO: renamed from: l.ۨ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9JS */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC12717 implements InterfaceC22896 {
    SMB2_FLAGS_SERVER_TO_REDIR(1),
    SMB2_FLAGS_ASYNC_COMMAND(2),
    SMB2_FLAGS_RELATED_OPERATIONS(4),
    SMB2_FLAGS_SIGNED(8),
    SMB2_FLAGS_PRIORITY_MASK(112),
    SMB2_FLAGS_DFS_OPERATIONS(268435456),
    SMB2_FLAGS_REPLAY_OPERATION(536870912);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f40733;

    EnumC12717(long j) {
        this.f40733 = j;
    }

    @Override // l.InterfaceC22896
    public long getValue() {
        return this.f40733;
    }
}
