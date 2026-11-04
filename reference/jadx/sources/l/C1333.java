package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.֨ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7YQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1333 extends C9623 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9535 f4771;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f4772;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f4773;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f4774;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1333(C9535 c9535, String str, String str2, int i, byte[] bArr, String str3) {
        super(i, str, str2, str3, bArr);
        this.f4771 = c9535;
        this.f4773 = false;
        this.f4772 = null;
        this.f4774 = null;
        if (!this.f31132.startsWith("|1|") || this.f31132.substring(3).indexOf("|") <= 0) {
            return;
        }
        String strSubstring = this.f31132.substring(3);
        String strSubstring2 = strSubstring.substring(0, strSubstring.indexOf("|"));
        String strSubstring3 = strSubstring.substring(strSubstring.indexOf("|") + 1);
        Charset charset = StandardCharsets.UTF_8;
        this.f4772 = C9011.m24064(0, strSubstring2.length(), C9011.m24055(strSubstring2, charset));
        this.f4774 = C9011.m24064(0, strSubstring3.length(), C9011.m24055(strSubstring3, charset));
        int blockSize = c9535.f30874.getBlockSize();
        if (this.f4772.length != blockSize || this.f4774.length != blockSize) {
            this.f4772 = null;
            this.f4774 = null;
        } else {
            this.f4773 = true;
        }
    }

    @Override // l.C9623
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4901(String str) {
        boolean zM24054;
        if (!this.f4773) {
            return super.mo4901(str);
        }
        try {
            synchronized (this.f4771.f30874) {
                this.f4771.f30874.init(this.f4772);
                byte[] bArrM24055 = C9011.m24055(str, StandardCharsets.UTF_8);
                this.f4771.f30874.mo19966(bArrM24055.length, bArrM24055);
                byte[] bArr = new byte[this.f4771.f30874.getBlockSize()];
                this.f4771.f30874.mo19967(0, bArr);
                zM24054 = C9011.m24054(this.f4774, bArr);
            }
            return zM24054;
        } catch (Exception unused) {
            this.f4771.f30876.m45899().getClass();
            return false;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m4902() {
        return this.f4773;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4903() {
        Charset charset;
        if (this.f4773) {
            return;
        }
        if (this.f4772 == null) {
            InterfaceC10502 interfaceC10502 = C15723.f51085;
            synchronized (interfaceC10502) {
                int blockSize = this.f4771.f30874.getBlockSize();
                byte[] bArr = new byte[blockSize];
                this.f4772 = bArr;
                interfaceC10502.mo20077(0, blockSize, bArr);
            }
        }
        try {
            synchronized (this.f4771.f30874) {
                this.f4771.f30874.init(this.f4772);
                String str = this.f31132;
                charset = StandardCharsets.UTF_8;
                byte[] bArrM24055 = C9011.m24055(str, charset);
                this.f4771.f30874.mo19966(bArrM24055.length, bArrM24055);
                byte[] bArr2 = new byte[this.f4771.f30874.getBlockSize()];
                this.f4774 = bArr2;
                this.f4771.f30874.mo19967(0, bArr2);
            }
            StringBuilder sb = new StringBuilder("|1|");
            byte[] bArr3 = this.f4772;
            byte[] bArrM24056 = C9011.m24056(bArr3, bArr3.length, true);
            sb.append(new String(bArrM24056, 0, bArrM24056.length, charset));
            sb.append("|");
            byte[] bArr4 = this.f4774;
            byte[] bArrM24057 = C9011.m24056(bArr4, bArr4.length, true);
            sb.append(new String(bArrM24057, 0, bArrM24057.length, charset));
            this.f31132 = sb.toString();
            this.f4773 = true;
        } catch (Exception unused) {
            this.f4771.f30876.m45899().getClass();
            this.f4772 = null;
            this.f4774 = null;
        }
    }
}
