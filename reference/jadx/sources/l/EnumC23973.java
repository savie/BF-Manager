package l;

/* JADX INFO: renamed from: l.᩺֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9F4 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23973 implements InterfaceC22896 {
    FILE_ACTION_ADDED(1),
    FILE_ACTION_REMOVED(2),
    FILE_ACTION_MODIFIED(3),
    FILE_ACTION_RENAMED_OLD_NAME(4),
    FILE_ACTION_RENAMED_NEW_NAME(5),
    FILE_ACTION_ADDED_STREAM(6),
    FILE_ACTION_REMOVED_STREAM(7),
    FILE_ACTION_MODIFIED_STREAM(8),
    FILE_ACTION_REMOVED_BY_DELETE(9),
    FILE_ACTION_ID_NOT_TUNNELLED(10),
    FILE_ACTION_TUNNELLED_ID_COLLISION(11);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f77588;

    EnumC23973(long j) {
        this.f77588 = j;
    }

    @Override // l.InterfaceC22896
    public long getValue() {
        return this.f77588;
    }
}
