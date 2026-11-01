package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ᩴۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7YQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18596 extends C17807 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f59160;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8013 f59161;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f59162;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f59163;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18596(C8013 c8013, String str, String str2, int i, byte[] bArr, String str3) {
        super(i, str, str2, str3, bArr);
        this.f59161 = c8013;
        this.f59160 = false;
        this.f59162 = null;
        this.f59163 = null;
        if (!this.f56431.startsWith("|1|") || this.f56431.substring(3).indexOf("|") <= 0) {
            return;
        }
        String strSubstring = this.f56431.substring(3);
        String strSubstring2 = strSubstring.substring(0, strSubstring.indexOf("|"));
        String strSubstring3 = strSubstring.substring(strSubstring.indexOf("|") + 1);
        Charset charset = StandardCharsets.UTF_8;
        this.f59162 = C8491.m22184(0, strSubstring2.length(), C8491.m22175(strSubstring2, charset));
        this.f59163 = C8491.m22184(0, strSubstring3.length(), C8491.m22175(strSubstring3, charset));
        int blockSize = c8013.f26265.getBlockSize();
        if (this.f59162.length != blockSize || this.f59163.length != blockSize) {
            this.f59162 = null;
            this.f59163 = null;
        } else {
            this.f59160 = true;
        }
    }

    @Override // l.C17807
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo41395(String str) {
        boolean zM22174;
        if (!this.f59160) {
            return super.mo41395(str);
        }
        try {
            synchronized (this.f59161.f26265) {
                this.f59161.f26265.init(this.f59162);
                byte[] bArrM22175 = C8491.m22175(str, StandardCharsets.UTF_8);
                this.f59161.f26265.mo3162(bArrM22175.length, bArrM22175);
                byte[] bArr = new byte[this.f59161.f26265.getBlockSize()];
                this.f59161.f26265.mo3164(0, bArr);
                zM22174 = C8491.m22174(this.f59163, bArr);
            }
            return zM22174;
        } catch (Exception unused) {
            this.f59161.f26267.m1333().getClass();
            return false;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m42995() {
        return this.f59160;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42996() {
        Charset charset;
        if (this.f59160) {
            return;
        }
        if (this.f59162 == null) {
            InterfaceC20008 interfaceC20008 = C3073.f11570;
            synchronized (interfaceC20008) {
                int blockSize = this.f59161.f26265.getBlockSize();
                byte[] bArr = new byte[blockSize];
                this.f59162 = bArr;
                interfaceC20008.mo26724(0, blockSize, bArr);
            }
        }
        try {
            synchronized (this.f59161.f26265) {
                this.f59161.f26265.init(this.f59162);
                String str = this.f56431;
                charset = StandardCharsets.UTF_8;
                byte[] bArrM22175 = C8491.m22175(str, charset);
                this.f59161.f26265.mo3162(bArrM22175.length, bArrM22175);
                byte[] bArr2 = new byte[this.f59161.f26265.getBlockSize()];
                this.f59163 = bArr2;
                this.f59161.f26265.mo3164(0, bArr2);
            }
            StringBuilder sb = new StringBuilder("|1|");
            byte[] bArr3 = this.f59162;
            byte[] bArrM22176 = C8491.m22176(bArr3, bArr3.length, true);
            sb.append(new String(bArrM22176, 0, bArrM22176.length, charset));
            sb.append("|");
            byte[] bArr4 = this.f59163;
            byte[] bArrM22177 = C8491.m22176(bArr4, bArr4.length, true);
            sb.append(new String(bArrM22177, 0, bArrM22177.length, charset));
            this.f56431 = sb.toString();
            this.f59160 = true;
        } catch (Exception unused) {
            this.f59161.f26267.m1333().getClass();
            this.f59162 = null;
            this.f59163 = null;
        }
    }
}
