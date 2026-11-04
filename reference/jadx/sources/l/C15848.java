package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.EOFException;

/* JADX INFO: renamed from: l.ܶۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 498X */
/* JADX INFO: loaded from: classes.dex */
public final class C15848 implements InterfaceC16594 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f51543;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f51545 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC16594 f51544 = m37801();

    static {
        ApplicationC23172.m52091(UMErrorCode.E_UM_BE_EMPTY_URL_PATH);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native InterfaceC12119 m37800(byte[] bArr);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private native InterfaceC16594 m37801();

    public C15848(byte[] bArr) {
        this.f51543 = bArr;
    }

    @Override // l.InterfaceC16594
    public final int read() {
        while (true) {
            InterfaceC16594 interfaceC16594 = this.f51544;
            if (interfaceC16594 == null) {
                return -1;
            }
            int i = interfaceC16594.read();
            if (i != -1) {
                return i;
            }
            this.f51544 = m37801();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte m37802() throws EOFException {
        int i = read();
        if (i != -1) {
            return (byte) (i & 255);
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m37804() {
        return (m37802() & 255) | ((m37802() & 255) << 8) | ((m37802() & 255) << 16) | ((m37802() & 255) << 24);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m37803() {
        return ((m37802() & 255) << 24) | ((m37802() & 255) << 16) | ((m37802() & 255) << 8) | (m37802() & 255);
    }
}
