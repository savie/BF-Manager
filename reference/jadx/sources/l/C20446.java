package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.᩵۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: MA3Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C20446 implements InterfaceC0550, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f65491;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0637 f65492;

    public C20446(String str, C0637 c0637) {
        this.f65491 = str;
        this.f65492 = c0637;
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ۤ */
    public final Object mo2556() {
        return this.f65491;
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ܳ */
    public final Object mo2557() {
        return this.f65492;
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2558() {
        return this.f65492;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof InterfaceC0550)) {
            return false;
        }
        InterfaceC0550 interfaceC0550 = (InterfaceC0550) obj;
        return C17359.equals(this.f65491, interfaceC0550.mo2556()) && this.f65492.equals(interfaceC0550.mo2557());
    }

    public final int hashCode() {
        Object obj = this.f65491;
        return this.f65492.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 19);
    }

    public final String toString() {
        return "<" + this.f65491 + "," + this.f65492 + ">";
    }

    @Override // l.InterfaceC0550
    public final Object first() {
        return mo2556();
    }
}
