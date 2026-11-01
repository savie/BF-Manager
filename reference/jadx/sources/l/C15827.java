package l;

/* JADX INFO: renamed from: l.ܺۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8SE */
/* JADX INFO: loaded from: classes4.dex */
public final class C15827 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f51227;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19643 f51228 = new C19643();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f51229;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f51230;

    public C15827(Object obj) {
        this.f51230 = obj;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37610(InterfaceC20765 interfaceC20765) {
        this.f51227 = true;
        if (this.f51229) {
            this.f51229 = false;
            interfaceC20765.mo8979(this.f51230, this.f51228.m44758());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37608(int i, InterfaceC7359 interfaceC7359) {
        if (this.f51227) {
            return;
        }
        if (i != -1) {
            this.f51228.m44759(i);
        }
        this.f51229 = true;
        interfaceC7359.invoke(this.f51230);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37609(InterfaceC20765 interfaceC20765) {
        if (this.f51227 || !this.f51229) {
            return;
        }
        C9060 c9060M44758 = this.f51228.m44758();
        this.f51228 = new C19643();
        this.f51229 = false;
        interfaceC20765.mo8979(this.f51230, c9060M44758);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15827.class != obj.getClass()) {
            return false;
        }
        return this.f51230.equals(((C15827) obj).f51230);
    }

    public final int hashCode() {
        return this.f51230.hashCode();
    }
}
