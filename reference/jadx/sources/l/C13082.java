package l;

/* JADX INFO: renamed from: l.۫ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8SE */
/* JADX INFO: loaded from: classes4.dex */
public final class C13082 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11173 f41824 = new C11173();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f41825;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f41826;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f41827;

    public C13082(Object obj) {
        this.f41826 = obj;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32556(InterfaceC15319 interfaceC15319) {
        this.f41827 = true;
        if (this.f41825) {
            this.f41825 = false;
            interfaceC15319.mo8292(this.f41826, this.f41824.m28143());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32554(int i, InterfaceC19795 interfaceC19795) {
        if (this.f41827) {
            return;
        }
        if (i != -1) {
            this.f41824.m28144(i);
        }
        this.f41825 = true;
        interfaceC19795.invoke(this.f41826);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32555(InterfaceC15319 interfaceC15319) {
        if (this.f41827 || !this.f41825) {
            return;
        }
        C23108 c23108M28143 = this.f41824.m28143();
        this.f41824 = new C11173();
        this.f41825 = false;
        interfaceC15319.mo8292(this.f41826, c23108M28143);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13082.class != obj.getClass()) {
            return false;
        }
        return this.f41826.equals(((C13082) obj).f41826);
    }

    public final int hashCode() {
        return this.f41826.hashCode();
    }
}
