package l;

/* JADX INFO: renamed from: l.ۗܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29H6 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3526 implements InterfaceC22896 {
    SMB2_RESTART_SCANS(1),
    SMB2_RETURN_SINGLE_ENTRY(2),
    SMB2_INDEX_SPECIFIED(4),
    SMB2_REOPEN(16);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f12116;

    EnumC3526(long j) {
        this.f12116 = j;
    }

    @Override // l.InterfaceC22896
    public long getValue() {
        return this.f12116;
    }
}
