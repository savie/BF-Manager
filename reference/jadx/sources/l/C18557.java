package l;

/* JADX INFO: renamed from: l.ᩴۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F62O */
/* JADX INFO: loaded from: classes5.dex */
public class C18557 extends AbstractC21379 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C18557 f59040;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC12913 f59042;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f59038 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f59039 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f59041 = -1;

    public C18557() {
    }

    public C18557(InterfaceC12913 interfaceC12913) {
        this.f59042 = interfaceC12913;
    }

    @Override // l.InterfaceC19969
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C18557 mo42955() {
        C18557 c18557 = new C18557();
        c18557.f59038 = -1;
        c18557.f59039 = -1;
        c18557.f59041 = -1;
        c18557.f59042 = this.f59042;
        c18557.f59038 = this.f59038;
        c18557.f59039 = this.f59039;
        return c18557;
    }

    @Override // l.AbstractC21379, l.InterfaceC19969
    /* JADX INFO: renamed from: ۖ */
    public boolean mo41440() {
        return this.f59042 == null;
    }

    @Override // l.InterfaceC19969
    public int getType() {
        InterfaceC12913 interfaceC12913 = this.f59042;
        if (interfaceC12913 == null) {
            return 0;
        }
        return interfaceC12913.getType();
    }

    @Override // l.InterfaceC19969
    public String getText() {
        InterfaceC12913 interfaceC12913 = this.f59042;
        if (interfaceC12913 == null) {
            return null;
        }
        return interfaceC12913.getText();
    }

    @Override // l.AbstractC21379, l.InterfaceC19969
    public final int getLine() {
        InterfaceC12913 interfaceC12913 = this.f59042;
        if (interfaceC12913 == null || interfaceC12913.getLine() == 0) {
            if (getChildCount() > 0) {
                return mo45257(0).getLine();
            }
            return 0;
        }
        return interfaceC12913.getLine();
    }

    @Override // l.AbstractC21379, l.InterfaceC19969
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo42954() {
        InterfaceC12913 interfaceC12913 = this.f59042;
        if (interfaceC12913 == null || interfaceC12913.mo30176() == -1) {
            if (getChildCount() > 0) {
                return mo45257(0).mo42954();
            }
            return 0;
        }
        return interfaceC12913.mo30176();
    }

    @Override // l.InterfaceC19969
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int mo42961() {
        InterfaceC12913 interfaceC12913;
        int i = this.f59038;
        return (i != -1 || (interfaceC12913 = this.f59042) == null) ? i : interfaceC12913.mo30180();
    }

    @Override // l.InterfaceC19969
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo42957(int i) {
        this.f59038 = i;
    }

    @Override // l.InterfaceC19969
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo42956() {
        InterfaceC12913 interfaceC12913;
        int i = this.f59039;
        return (i != -1 || (interfaceC12913 = this.f59042) == null) ? i : interfaceC12913.mo30180();
    }

    @Override // l.InterfaceC19969
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo42959(int i) {
        this.f59039 = i;
    }

    @Override // l.AbstractC21379, l.InterfaceC19969
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo42958() {
        return this.f59041;
    }

    @Override // l.AbstractC21379, l.InterfaceC19969
    public final InterfaceC19969 getParent() {
        return this.f59040;
    }

    @Override // l.AbstractC21379, l.InterfaceC19969
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo42960(InterfaceC19969 interfaceC19969) {
        this.f59040 = (C18557) interfaceC19969;
    }

    @Override // l.AbstractC21379, l.InterfaceC19969
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo42953(int i) {
        this.f59041 = i;
    }

    public String toString() {
        if (mo41440()) {
            return "nil";
        }
        if (getType() == 0) {
            return "<errornode>";
        }
        InterfaceC12913 interfaceC12913 = this.f59042;
        if (interfaceC12913 == null) {
            return null;
        }
        return interfaceC12913.getText();
    }
}
