package l;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: renamed from: l.ۧۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E67S */
/* JADX INFO: loaded from: classes4.dex */
public final class C10832 implements InterfaceC21414 {
    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public final void mo3144(C15313 c15313) {
        String strM34493 = ((C14277) c15313.m36673()).m34493();
        C14277 c14277 = new C14277();
        try {
            c14277.m34465(new FileInputStream(new File(strM34493)));
        } catch (Exception unused) {
        }
        c15313.m36672(c14277);
    }
}
