package l;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/* JADX INFO: renamed from: l.ᩴۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45YJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18592 implements InterfaceC21414 {
    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public final void mo3144(C15313 c15313) {
        String strM34493 = ((C14277) c15313.m36673()).m34493();
        C14277 c14277 = new C14277();
        c14277.m34465(new BufferedInputStream(new FileInputStream(strM34493)));
        c15313.m36672(c14277);
    }
}
