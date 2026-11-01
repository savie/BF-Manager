package l;

/* JADX INFO: renamed from: l.ۡۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A9TM */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8622 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22400(InterfaceC10033 interfaceC10033, byte[] bArr) {
        int length = bArr.length;
        int i = interfaceC10033.read(bArr, 0, length);
        if (i == -1) {
            return -1;
        }
        int i2 = length - i;
        while (i2 > 0) {
            int i3 = interfaceC10033.read(bArr, i, i2);
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
