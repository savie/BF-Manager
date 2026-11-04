package l;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/* JADX INFO: renamed from: l.۫ۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45YJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13063 implements InterfaceC22760 {
    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public final void mo1200(C19929 c19929) {
        String strM34647 = ((C14270) c19929.m45858()).m34647();
        C14270 c14270 = new C14270();
        c14270.m34620(new BufferedInputStream(new FileInputStream(strM34647)));
        c19929.m45857(c14270);
    }
}
