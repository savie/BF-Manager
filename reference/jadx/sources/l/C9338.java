package l;

import android.app.Application;

/* JADX INFO: renamed from: l.ۢۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9338 implements InterfaceC21414 {
    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public final void mo3144(C15313 c15313) {
        C14277 c14277 = new C14277();
        String strM34493 = ((C14277) c15313.m36673()).m34493();
        try {
            Application applicationM39277 = C16737.m39277();
            c14277.m34466((String) applicationM39277.getClass().getMethod(strM34493, null).invoke(applicationM39277, null));
        } catch (Exception unused) {
        }
        c15313.m36672(c14277);
    }
}
