package l;

/* JADX INFO: renamed from: l.᩶ܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9FL */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC21426 implements InterfaceC22896 {
    SMB2_SESSION_FLAG_IS_GUEST(1),
    SMB2_SESSION_FLAG_IS_NULL(2),
    SMB2_SESSION_FLAG_ENCRYPT_DATA(4);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f68260;

    EnumC21426(long j) {
        this.f68260 = j;
    }

    @Override // l.InterfaceC22896
    public long getValue() {
        return this.f68260;
    }
}
