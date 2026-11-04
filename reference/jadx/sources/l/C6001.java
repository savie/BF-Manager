package l;

/* JADX INFO: renamed from: l.ۚ᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: A63D */
/* JADX INFO: loaded from: classes3.dex */
public final class C6001 implements InterfaceC22760 {
    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public final void mo1200(C19929 c19929) {
        C14270 c14270 = new C14270();
        try {
            C22935 c22935 = (C22935) ((C14270) c19929.m45858()).m34634();
            c14270.m34619((((long) c22935.m51695()) & 255) | ((((long) c22935.m51695()) & 255) << 8) | ((((long) c22935.m51695()) & 255) << 16) | ((((long) c22935.m51695()) & 255) << 24) | ((((long) c22935.m51695()) & 255) << 32) | ((((long) c22935.m51695()) & 255) << 40) | ((((long) c22935.m51695()) & 255) << 48) | ((255 & ((long) c22935.m51695())) << 56));
        } catch (Exception unused) {
            c14270.m34619(0L);
        }
        c19929.m45857(c14270);
    }
}
