package l;

/* JADX INFO: renamed from: l.ܽ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89I2 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC17938 implements InterfaceC22896 {
    SMB2_GLOBAL_CAP_DFS(1),
    SMB2_GLOBAL_CAP_LEASING(2),
    SMB2_GLOBAL_CAP_LARGE_MTU(4),
    SMB2_GLOBAL_CAP_MULTI_CHANNEL(8),
    SMB2_GLOBAL_CAP_PERSISTENT_HANDLES(16),
    SMB2_GLOBAL_CAP_DIRECTORY_LEASING(32),
    SMB2_GLOBAL_CAP_ENCRYPTION(64);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f58772;

    EnumC17938(long j) {
        this.f58772 = j;
    }

    @Override // l.InterfaceC22896
    public long getValue() {
        return this.f58772;
    }
}
