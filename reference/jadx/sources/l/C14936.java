package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.ܰ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1A38 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14936 extends AbstractC10461 {

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public static final String[] f48767 = {"WrLehDO\u0000B16BBDz\u0000", "WrLehDz\u0000B16BBDz\u0000"};

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public int f48768;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public String f48769;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public String f48770;

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ֫ */
    public final int mo3142(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۚ */
    public final int mo3143(int i, byte[] bArr) {
        return 0;
    }

    public C14936(InterfaceC5878 interfaceC5878, String str, int i) {
        super(interfaceC5878, (byte) 37, (byte) 104);
        this.f48769 = null;
        this.f48770 = str;
        this.f48768 = i;
        this.f33288 = "\\PIPE\\LANMAN";
        this.f33281 = 8;
        this.f33296 = 16384;
        this.f33287 = 0;
        this.f33285 = OpenAuthTask.Duplex;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35917(int i, String str) {
        reset();
        this.f48769 = str;
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۤ */
    public final int mo3144(byte[] bArr) {
        char c = m26887() == 104 ? (char) 0 : (char) 1;
        try {
            byte[] bytes = f48767[c].getBytes("ASCII");
            C0481.m2319(m26887() & 255, 0, bArr);
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            int length = bytes.length;
            C0481.m2319(1L, 2 + length, bArr);
            C0481.m2319(this.f33296, length + 4, bArr);
            C0481.m2323(this.f48768, length + 6, bArr);
            int i = length + 10;
            int iM12759 = i + m12759(this.f48770.toUpperCase(), bArr, i, false);
            return c == 1 ? iM12759 + m12759(this.f48769.toUpperCase(), bArr, iM12759, false) : iM12759;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // l.AbstractC10461, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("NetServerEnum2[");
        sb.append(super.toString());
        sb.append(",name=");
        sb.append(this.f33288);
        sb.append(",serverTypes=");
        return new String(C8947.m23910(sb, this.f48768 == -1 ? "SV_TYPE_ALL" : "SV_TYPE_DOMAIN_ENUM", "]"));
    }
}
