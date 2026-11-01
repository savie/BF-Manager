package l;

/* JADX INFO: renamed from: l.۟᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K80R */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7808 implements InterfaceC15861 {
    FILE_SUPERSEDE(0),
    FILE_OPEN(1),
    FILE_CREATE(2),
    FILE_OPEN_IF(3),
    FILE_OVERWRITE(4),
    FILE_OVERWRITE_IF(5);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f25702;

    EnumC7808(long j) {
        this.f25702 = j;
    }

    @Override // l.InterfaceC15861
    public long getValue() {
        return this.f25702;
    }
}
