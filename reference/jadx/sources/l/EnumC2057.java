package l;

/* JADX INFO: renamed from: l.֫ܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9EC */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2057 implements InterfaceC22896 {
    MsvAvEOL(0),
    MsvAvNbComputerName(1),
    MsvAvNbDomainName(2),
    MsvAvDnsComputerName(3),
    MsvAvDnsDomainName(4),
    MsvAvDnsTreeName(5),
    MsvAvFlags(6),
    MsvAvTimestamp(7),
    MsvAvSingleHost(8),
    MsvAvTargetName(9),
    MsvAvChannelBindings(10);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f6849;

    EnumC2057(long j) {
        this.f6849 = j;
    }

    @Override // l.InterfaceC22896
    public long getValue() {
        return this.f6849;
    }
}
