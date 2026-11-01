package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.֫ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 1A38 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1985 extends AbstractC2712 {

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public static final String[] f7434 = {"WrLehDO\u0000B16BBDz\u0000", "WrLehDz\u0000B16BBDz\u0000"};

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public int f7435;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public String f7436;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public String f7437;

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo6397(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int mo6399(int i, byte[] bArr) {
        return 0;
    }

    public C1985(InterfaceC10601 interfaceC10601, String str, int i) {
        super(interfaceC10601, (byte) 37, (byte) 104);
        this.f7437 = null;
        this.f7436 = str;
        this.f7435 = i;
        this.f10436 = "\\PIPE\\LANMAN";
        this.f10440 = 8;
        this.f10424 = 16384;
        this.f10432 = 0;
        this.f10428 = OpenAuthTask.Duplex;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m6400(int i, String str) {
        reset();
        this.f7437 = str;
    }

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo6398(byte[] bArr) {
        char c = m8267() == 104 ? (char) 0 : (char) 1;
        try {
            byte[] bytes = f7434[c].getBytes("ASCII");
            C4850.m13546(m8267() & 255, 0, bArr);
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            int length = bytes.length;
            C4850.m13546(1L, 2 + length, bArr);
            C4850.m13546(this.f10424, length + 4, bArr);
            C4850.m13550(this.f7435, length + 6, bArr);
            int i = length + 10;
            int iM35441 = i + m35441(this.f7436.toUpperCase(), bArr, i, false);
            return c == 1 ? iM35441 + m35441(this.f7437.toUpperCase(), bArr, iM35441, false) : iM35441;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // l.AbstractC2712, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("NetServerEnum2[");
        sb.append(super.toString());
        sb.append(",name=");
        sb.append(this.f10436);
        sb.append(",serverTypes=");
        return new String(C22697.m50267(sb, this.f7435 == -1 ? "SV_TYPE_ALL" : "SV_TYPE_DOMAIN_ENUM", "]"));
    }
}
