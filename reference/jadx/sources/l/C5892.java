package l;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: l.ۛۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E67S */
/* JADX INFO: loaded from: classes3.dex */
public final class C5892 implements InterfaceC21414 {
    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public final void mo3144(C15313 c15313) {
        byte[] bArr = (byte[]) ((C14277) c15313.m36673()).m34475();
        C14277 c14277 = new C14277();
        try {
            c14277.m34465(new ByteArrayInputStream(bArr));
        } catch (Exception unused) {
        }
        c15313.m36672(c14277);
    }
}
