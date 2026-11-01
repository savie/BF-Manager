package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۚۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: MA3Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C5254 implements InterfaceC14924, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f18225;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23482 f18226;

    public C5254(String str, C23482 c23482) {
        this.f18225 = str;
        this.f18226 = c23482;
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۨ */
    public final Object mo7338() {
        return this.f18225;
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۖ */
    public final Object mo7335() {
        return this.f18226;
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ᩹ */
    public final Object mo7339() {
        return this.f18226;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof InterfaceC14924)) {
            return false;
        }
        InterfaceC14924 interfaceC14924 = (InterfaceC14924) obj;
        return C13638.equals(this.f18225, interfaceC14924.mo7338()) && this.f18226.equals(interfaceC14924.mo7339());
    }

    public final int hashCode() {
        Object obj = this.f18225;
        return this.f18226.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 19);
    }

    public final String toString() {
        return "<" + this.f18225 + "," + this.f18226 + ">";
    }

    @Override // l.InterfaceC14924
    public final Object first() {
        return mo7338();
    }
}
