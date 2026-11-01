package l;

/* JADX INFO: renamed from: l.᩺ۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1QD */
/* JADX INFO: loaded from: classes.dex */
public final class C22743 implements InterfaceC17803 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C22743 f74077 = new C22743();

    @Override // l.InterfaceC17803
    /* JADX INFO: renamed from: ۙ */
    public final int mo3481(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 + 2;
            if (i3 < i && bArr[i2] == 27 && ((char) bArr[i2 + 1]) == '$' && ((char) bArr[i3]) == 'B') {
                return 100;
            }
        }
        return 0;
    }

    @Override // l.InterfaceC17803
    /* JADX INFO: renamed from: ۙ */
    public final int mo3480() {
        return C22037.f71426;
    }
}
