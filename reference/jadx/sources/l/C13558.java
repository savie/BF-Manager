package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۬ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E92A */
/* JADX INFO: loaded from: classes4.dex */
public final class C13558 implements InterfaceC4784, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f43047 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f43048 = true;

    @Override // l.InterfaceC0550
    public final Object first() {
        return this.f43047;
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ۤ */
    public final Object mo2556() {
        return this.f43047;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33268(DialogInterfaceC8327 dialogInterfaceC8327) {
        this.f43047 = dialogInterfaceC8327;
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ܳ */
    public final Object mo2557() {
        return Boolean.valueOf(this.f43048);
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo14758() {
        return this.f43048;
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2558() {
        return Boolean.valueOf(this.f43048);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m33269() {
        this.f43048 = false;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof InterfaceC4784) {
            InterfaceC4784 interfaceC4784 = (InterfaceC4784) obj;
            return C17359.equals(this.f43047, interfaceC4784.mo2556()) && this.f43048 == interfaceC4784.mo14758();
        }
        if (!(obj instanceof InterfaceC0550)) {
            return false;
        }
        InterfaceC0550 interfaceC0550 = (InterfaceC0550) obj;
        return C17359.equals(this.f43047, interfaceC0550.mo2556()) && Boolean.valueOf(this.f43048).equals(interfaceC0550.mo2557());
    }

    public final int hashCode() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f43047;
        return ((dialogInterfaceC8327 == null ? 0 : dialogInterfaceC8327.hashCode()) * 19) + (this.f43048 ? 1231 : 1237);
    }

    public final String toString() {
        return "<" + this.f43047 + "," + this.f43048 + ">";
    }
}
