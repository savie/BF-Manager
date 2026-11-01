package l;

/* JADX INFO: renamed from: l.ᩴۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: KARP */
/* JADX INFO: loaded from: classes5.dex */
public class C18515 implements InterfaceC17809 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8472 f58966;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC19761 f58967;

    @Override // l.InterfaceC14988
    public final int getChildCount() {
        return 0;
    }

    @Override // l.InterfaceC14988
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14988 mo22136(int i) {
        return null;
    }

    public C18515(InterfaceC19761 interfaceC19761) {
        this.f58967 = interfaceC19761;
    }

    @Override // l.InterfaceC17809
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC19761 mo41396() {
        return this.f58967;
    }

    @Override // l.InterfaceC14988
    public final String getText() {
        return this.f58967.getText();
    }

    public final String toString() {
        InterfaceC19761 interfaceC19761 = this.f58967;
        return interfaceC19761.getType() == -1 ? "<EOF>" : interfaceC19761.getText();
    }
}
