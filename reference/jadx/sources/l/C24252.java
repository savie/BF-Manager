package l;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: l.᩺ۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: E67S */
/* JADX INFO: loaded from: classes.dex */
public final class C24252 implements InterfaceC22760 {
    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public final void mo1200(C19929 c19929) {
        byte[] bArr = (byte[]) ((C14270) c19929.m45858()).m34634();
        C14270 c14270 = new C14270();
        try {
            c14270.m34620(new ByteArrayInputStream(bArr));
        } catch (Exception unused) {
        }
        c19929.m45857(c14270);
    }
}
