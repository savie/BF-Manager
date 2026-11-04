package l;

/* JADX INFO: renamed from: l.ۛۨ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: A9TM */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6377 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m18119(InterfaceC24277 interfaceC24277, byte[] bArr) {
        int length = bArr.length;
        int i = interfaceC24277.read(bArr, 0, length);
        if (i == -1) {
            return -1;
        }
        int i2 = length - i;
        while (i2 > 0) {
            int i3 = interfaceC24277.read(bArr, i, i2);
            if (i3 == -1) {
                return i;
            }
            i += i3;
            i2 -= i3;
        }
        if (i != bArr.length) {
            throw new AssertionError();
        }
        return i;
    }
}
