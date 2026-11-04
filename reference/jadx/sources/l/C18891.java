package l;

/* JADX INFO: renamed from: l.ᩳۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I3KA */
/* JADX INFO: loaded from: classes5.dex */
public class C18891 extends C9940 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7704 f61309;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43809(C7704 c7704, C7926 c7926) {
        this.f61309 = c7704;
        try {
            c7704.m20984().mo2282(this, c7926);
        } finally {
            this.f61309 = null;
        }
    }

    @Override // l.C9940
    /* JADX INFO: renamed from: ۙ */
    public Object mo5883(InterfaceC19637 interfaceC19637, Object obj) {
        if (interfaceC19637 == null) {
            return null;
        }
        C7704 c7704 = this.f61309;
        this.f61309 = new C7704(c7704, interfaceC19637);
        try {
            return interfaceC19637.mo2282(this, obj);
        } finally {
            this.f61309 = c7704;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7704 m43808() {
        return this.f61309;
    }
}
