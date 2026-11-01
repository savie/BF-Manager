package l;

/* JADX INFO: renamed from: l.ۧۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes4.dex */
public final enum C10787 extends EnumC23487 {
    public /* synthetic */ C10787() {
        this("REVERSE", 1);
    }

    public C10787(String str, int i) {
        super(str, i, 0);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public int compare(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801) {
        return interfaceC3801.getFileName().compareTo(interfaceC3800.getFileName());
    }
}
