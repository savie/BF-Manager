package l;

/* JADX INFO: renamed from: l.۟᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79JV */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC8243 implements InterfaceC22896 {
    SMB2_SHARE_CAP_DFS(8),
    SMB2_SHARE_CAP_CONTINUOUS_AVAILABILITY(16),
    SMB2_SHARE_CAP_SCALEOUT(32),
    SMB2_SHARE_CAP_CLUSTER(64),
    SMB2_SHARE_CAP_ASYMMETRIC(128);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f27112;

    EnumC8243(long j) {
        this.f27112 = j;
    }

    @Override // l.InterfaceC22896
    public long getValue() {
        return this.f27112;
    }
}
