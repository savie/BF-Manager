package l;

/* JADX INFO: renamed from: l.ܰ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O89D */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC14471 implements InterfaceC22896 {
    FIRST_FRAGMENT(1),
    LAST_FRAGMENT(2),
    PENDING_CANCEL(4),
    CONCURRENT_MULTIPLEXING(16),
    DID_NOT_EXECUTE(32),
    MAYBE(64),
    OBJECT_UUID(128);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f45541;

    EnumC14471(int i) {
        this.f45541 = i;
    }

    @Override // l.InterfaceC22896
    public long getValue() {
        return this.f45541;
    }
}
