package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.֡᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D9XS */
/* JADX INFO: loaded from: classes3.dex */
public final class C0767 extends AbstractC10461 {
    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo3142(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int mo3143(int i, byte[] bArr) {
        return 0;
    }

    public C0767(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878, (byte) 37, (byte) 0);
        this.f33288 = new String("\\PIPE\\LANMAN");
        this.f33281 = 8;
        this.f33287 = 0;
        this.f33285 = OpenAuthTask.Duplex;
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo3144(byte[] bArr) {
        try {
            byte[] bytes = "WrLeh\u0000B13BWz\u0000".getBytes("ASCII");
            C0481.m2319(0L, 0, bArr);
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            int length = bytes.length;
            C0481.m2319(1L, 2 + length, bArr);
            C0481.m2319(this.f33296, length + 4, bArr);
            return length + 6;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // l.AbstractC10461, l.AbstractC3971
    public final String toString() {
        return new String(C8947.m23910(new StringBuilder("NetShareEnum["), super.toString(), "]"));
    }
}
