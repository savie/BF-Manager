package l;

/* JADX INFO: renamed from: l.᩵۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9YW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19337 implements InterfaceC7778 {
    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) throws C2796 {
        if (i2 < 24) {
            throw new C2796("Invalid resume key");
        }
        System.arraycopy(bArr, i, new byte[24], 0, 24);
        C4850.m13549(i + 24, bArr);
        return (i + 28) - i;
    }
}
