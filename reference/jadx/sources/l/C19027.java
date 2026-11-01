package l;

/* JADX INFO: renamed from: l.ᩴ᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I3KA */
/* JADX INFO: loaded from: classes5.dex */
public class C19027 extends C8444 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18321 f61553;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43758(C18321 c18321, C8753 c8753) {
        this.f61553 = c18321;
        try {
            c18321.m42559().mo1800(this, c8753);
        } finally {
            this.f61553 = null;
        }
    }

    @Override // l.C8444
    /* JADX INFO: renamed from: ۙ */
    public Object mo22105(InterfaceC17428 interfaceC17428, Object obj) {
        if (interfaceC17428 == null) {
            return null;
        }
        C18321 c18321 = this.f61553;
        this.f61553 = new C18321(c18321, interfaceC17428);
        try {
            return interfaceC17428.mo1800(this, obj);
        } finally {
            this.f61553 = c18321;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18321 m43757() {
        return this.f61553;
    }
}
