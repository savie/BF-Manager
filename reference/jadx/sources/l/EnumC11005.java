package l;

/* JADX INFO: renamed from: l.ۤܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9KH */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC11005 implements InterfaceC22896 {
    SMB2_PREAUTH_INTEGRITY_CAPABILITIES(1),
    SMB2_ENCRYPTION_CAPABILITIES(2),
    SMB2_COMPRESSION_CAPABILITIES(4),
    SMB2_NETNAME_NEGOTIATE_CONTEXT_ID(5);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f34767;

    EnumC11005(long j) {
        this.f34767 = j;
    }

    @Override // l.InterfaceC22896
    public long getValue() {
        return this.f34767;
    }
}
