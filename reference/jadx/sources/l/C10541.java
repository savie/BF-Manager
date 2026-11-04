package l;

/* JADX INFO: renamed from: l.ۤ֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1QD */
/* JADX INFO: loaded from: classes4.dex */
public final class C10541 implements InterfaceC19492 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C10541 f33517 = new C10541();

    @Override // l.InterfaceC19492
    /* JADX INFO: renamed from: ۙ */
    public final int mo5605(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 + 3;
            if (i3 < i && bArr[i2] == 27 && ((char) bArr[i2 + 1]) == '$' && ((char) bArr[i2 + 2]) == ')' && ((char) bArr[i3]) == 'C') {
                return 100;
            }
        }
        return 0;
    }

    @Override // l.InterfaceC19492
    /* JADX INFO: renamed from: ۙ */
    public final int mo5604() {
        return C2448.f7849;
    }
}
