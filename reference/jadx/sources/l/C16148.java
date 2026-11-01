package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܺ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: E92A */
/* JADX INFO: loaded from: classes5.dex */
public final class C16148 implements InterfaceC20381, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f52196 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f52197 = true;

    @Override // l.InterfaceC14924
    public final Object first() {
        return this.f52196;
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۨ */
    public final Object mo7338() {
        return this.f52196;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38230(DialogInterfaceC19356 dialogInterfaceC19356) {
        this.f52196 = dialogInterfaceC19356;
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۖ */
    public final Object mo7335() {
        return Boolean.valueOf(this.f52197);
    }

    @Override // l.InterfaceC20381
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo38231() {
        return this.f52197;
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ᩹ */
    public final Object mo7339() {
        return Boolean.valueOf(this.f52197);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m38232() {
        this.f52197 = false;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof InterfaceC20381) {
            InterfaceC20381 interfaceC20381 = (InterfaceC20381) obj;
            return C13638.equals(this.f52196, interfaceC20381.mo7338()) && this.f52197 == interfaceC20381.mo38231();
        }
        if (!(obj instanceof InterfaceC14924)) {
            return false;
        }
        InterfaceC14924 interfaceC14924 = (InterfaceC14924) obj;
        return C13638.equals(this.f52196, interfaceC14924.mo7338()) && Boolean.valueOf(this.f52197).equals(interfaceC14924.mo7339());
    }

    public final int hashCode() {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f52196;
        return ((dialogInterfaceC19356 == null ? 0 : dialogInterfaceC19356.hashCode()) * 19) + (this.f52197 ? 1231 : 1237);
    }

    public final String toString() {
        return "<" + this.f52196 + "," + this.f52197 + ">";
    }
}
