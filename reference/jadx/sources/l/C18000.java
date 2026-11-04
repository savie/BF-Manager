package l;

import android.app.Application;

/* JADX INFO: renamed from: l.ܿ֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86A1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18000 implements InterfaceC22760 {
    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public final void mo1200(C19929 c19929) {
        C14270 c14270 = new C14270();
        String strM34647 = ((C14270) c19929.m45858()).m34647();
        try {
            Application applicationM49084 = C21576.m49084();
            c14270.m34621((String) applicationM49084.getClass().getMethod(strM34647, null).invoke(applicationM49084, null));
        } catch (Exception unused) {
        }
        c19929.m45857(c14270);
    }
}
