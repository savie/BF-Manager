package l;

/* JADX INFO: renamed from: l.۟֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M9KH */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7165 implements InterfaceC15861 {
    SMB2_PREAUTH_INTEGRITY_CAPABILITIES(1),
    SMB2_ENCRYPTION_CAPABILITIES(2),
    SMB2_COMPRESSION_CAPABILITIES(4),
    SMB2_NETNAME_NEGOTIATE_CONTEXT_ID(5);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f23947;

    EnumC7165(long j) {
        this.f23947 = j;
    }

    @Override // l.InterfaceC15861
    public long getValue() {
        return this.f23947;
    }
}
