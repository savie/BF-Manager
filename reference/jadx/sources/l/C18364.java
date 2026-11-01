package l;

/* JADX INFO: renamed from: l.ᩳ᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A63D */
/* JADX INFO: loaded from: classes5.dex */
public final class C18364 implements InterfaceC21414 {
    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public final void mo3144(C15313 c15313) {
        C14277 c14277 = new C14277();
        try {
            int iM34486 = ((C14277) c15313.m36673()).m34486();
            C23262 c23262 = (C23262) ((C14277) c15313.m36673()).m34475();
            c23262.getClass();
            byte[] bArr = new byte[iM34486];
            for (int i = 0; i < iM34486; i++) {
                bArr[i] = (byte) (c23262.m51342() & 255);
            }
            c14277.m34465(bArr);
        } catch (Exception unused) {
        }
        c15313.m36672(c14277);
    }
}
