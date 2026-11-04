package l;

/* JADX INFO: renamed from: l.ۡ᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F62O */
/* JADX INFO: loaded from: classes4.dex */
public class C9730 extends AbstractC10476 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9730 f31383;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC21665 f31384;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f31387 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f31385 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f31386 = -1;

    public C9730() {
    }

    public C9730(InterfaceC21665 interfaceC21665) {
        this.f31384 = interfaceC21665;
    }

    @Override // l.InterfaceC22915
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9730 mo25322() {
        C9730 c9730 = new C9730();
        c9730.f31387 = -1;
        c9730.f31385 = -1;
        c9730.f31386 = -1;
        c9730.f31384 = this.f31384;
        c9730.f31387 = this.f31387;
        c9730.f31385 = this.f31385;
        return c9730;
    }

    @Override // l.AbstractC10476, l.InterfaceC22915
    /* JADX INFO: renamed from: ᩸ */
    public boolean mo5415() {
        return this.f31384 == null;
    }

    @Override // l.InterfaceC22915
    public int getType() {
        InterfaceC21665 interfaceC21665 = this.f31384;
        if (interfaceC21665 == null) {
            return 0;
        }
        return interfaceC21665.getType();
    }

    @Override // l.InterfaceC22915
    public String getText() {
        InterfaceC21665 interfaceC21665 = this.f31384;
        if (interfaceC21665 == null) {
            return null;
        }
        return interfaceC21665.getText();
    }

    @Override // l.AbstractC10476, l.InterfaceC22915
    public final int getLine() {
        InterfaceC21665 interfaceC21665 = this.f31384;
        if (interfaceC21665 == null || interfaceC21665.getLine() == 0) {
            if (getChildCount() > 0) {
                return mo26898(0).getLine();
            }
            return 0;
        }
        return interfaceC21665.getLine();
    }

    @Override // l.AbstractC10476, l.InterfaceC22915
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo25318() {
        InterfaceC21665 interfaceC21665 = this.f31384;
        if (interfaceC21665 == null || interfaceC21665.mo33097() == -1) {
            if (getChildCount() > 0) {
                return mo26898(0).mo25318();
            }
            return 0;
        }
        return interfaceC21665.mo33097();
    }

    @Override // l.InterfaceC22915
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo25321() {
        InterfaceC21665 interfaceC21665;
        int i = this.f31387;
        return (i != -1 || (interfaceC21665 = this.f31384) == null) ? i : interfaceC21665.mo33100();
    }

    @Override // l.InterfaceC22915
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo25320(int i) {
        this.f31387 = i;
    }

    @Override // l.InterfaceC22915
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo25319() {
        InterfaceC21665 interfaceC21665;
        int i = this.f31385;
        return (i != -1 || (interfaceC21665 = this.f31384) == null) ? i : interfaceC21665.mo33100();
    }

    @Override // l.InterfaceC22915
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo25324(int i) {
        this.f31385 = i;
    }

    @Override // l.AbstractC10476, l.InterfaceC22915
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo25323() {
        return this.f31386;
    }

    @Override // l.AbstractC10476, l.InterfaceC22915
    public final InterfaceC22915 getParent() {
        return this.f31383;
    }

    @Override // l.AbstractC10476, l.InterfaceC22915
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo25325(InterfaceC22915 interfaceC22915) {
        this.f31383 = (C9730) interfaceC22915;
    }

    @Override // l.AbstractC10476, l.InterfaceC22915
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo25326(int i) {
        this.f31386 = i;
    }

    public String toString() {
        if (mo5415()) {
            return "nil";
        }
        if (getType() == 0) {
            return "<errornode>";
        }
        InterfaceC21665 interfaceC21665 = this.f31384;
        if (interfaceC21665 == null) {
            return null;
        }
        return interfaceC21665.getText();
    }
}
