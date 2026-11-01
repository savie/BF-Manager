package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.ۙᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D9XS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4829 extends AbstractC2712 {
    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۘ */
    public final int mo6397(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۬ */
    public final int mo6399(int i, byte[] bArr) {
        return 0;
    }

    public C4829(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601, (byte) 37, (byte) 0);
        this.f10436 = new String("\\PIPE\\LANMAN");
        this.f10440 = 8;
        this.f10432 = 0;
        this.f10428 = OpenAuthTask.Duplex;
    }

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۨ */
    public final int mo6398(byte[] bArr) {
        try {
            byte[] bytes = "WrLeh\u0000B13BWz\u0000".getBytes("ASCII");
            C4850.m13546(0L, 0, bArr);
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            int length = bytes.length;
            C4850.m13546(1L, 2 + length, bArr);
            C4850.m13546(this.f10424, length + 4, bArr);
            return length + 6;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // l.AbstractC2712, l.AbstractC14792
    public final String toString() {
        return new String(C22697.m50267(new StringBuilder("NetShareEnum["), super.toString(), "]"));
    }
}
