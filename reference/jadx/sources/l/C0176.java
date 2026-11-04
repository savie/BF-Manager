package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.֡ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0A1O */
/* JADX INFO: loaded from: classes3.dex */
public final class C0176 extends AbstractC20313 implements InterfaceC7874 {

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f1248 = C16980.m40037(C0176.class);

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public String f1249;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f1250;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f1251;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public String f1252;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f1253;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f1254;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public String f1255;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public boolean f1256;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public String f1257;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f1258;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo1470(int i, byte[] bArr) {
        return 0;
    }

    public C0176(String str, InterfaceC5878 interfaceC5878) {
        super(interfaceC5878, 5);
        this.f1254 = 1179785;
        this.f1250 = 3;
        this.f1251 = 1;
        this.f1258 = 0;
        mo1463(str);
    }

    @Override // l.AbstractC20313
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC12108 mo1465(InterfaceC23032 interfaceC23032) {
        return new C7634(this.f1249, interfaceC23032.mo2875());
    }

    @Override // l.InterfaceC7874
    public final String getPath() {
        return "\\" + this.f1249;
    }

    @Override // l.InterfaceC7874
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String mo1460() {
        return this.f1257;
    }

    @Override // l.InterfaceC7874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo1462() {
        return this.f1252;
    }

    @Override // l.InterfaceC7874
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo1471() {
        return this.f1255;
    }

    @Override // l.InterfaceC7874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1464(String str, String str2, String str3) {
        this.f1255 = str;
        this.f1252 = str2;
        this.f1257 = str3;
    }

    @Override // l.InterfaceC7874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1463(String str) {
        if (str.length() > 0 && str.charAt(0) == '\\') {
            str = str.substring(1);
        }
        if (str.length() > 1 && C22313.m50373(1, str) == '\\') {
            str = C1402.m5124(1, 0, str);
        }
        this.f1249 = str;
    }

    @Override // l.InterfaceC7874
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo1466() {
        m10326(268435456);
        this.f1256 = true;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m1467(int i) {
        this.f1254 = i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m1473(int i) {
        this.f1253 = i;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m1461(int i) {
        this.f1250 = i;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m1468(int i) {
        this.f1251 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m1469(int i) {
        this.f1258 = i;
    }

    @Override // l.InterfaceC21299
    public final int size() {
        int length = this.f1249.length() * 2;
        if (length == 0) {
            length++;
        }
        return AbstractC3159.m10300(AbstractC3159.m10300(length) + UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo1472(int i, byte[] bArr) {
        InterfaceC25186 interfaceC25186 = f1248;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Opening " + this.f1249);
            interfaceC25186.mo13721("Flags are ".concat(C6033.m17503(m10332(), 4)));
        }
        C0481.m2319(57L, i, bArr);
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        C0481.m2323(2, i + 4, bArr);
        C0481.m2321(0L, i + 8, bArr);
        C0481.m2323(this.f1254, i + 24, bArr);
        C0481.m2323(this.f1253, i + 28, bArr);
        C0481.m2323(this.f1250, i + 32, bArr);
        C0481.m2323(this.f1251, i + 36, bArr);
        C0481.m2323(this.f1258, i + 40, bArr);
        byte[] bytes = this.f1249.getBytes(StandardCharsets.UTF_16LE);
        C0481.m2319(bytes.length, i + 46, bArr);
        int i2 = i + 48;
        int i3 = i + 52;
        int i4 = i + 56;
        C0481.m2319(i4 - m10327(), i + 44, bArr);
        System.arraycopy(bytes, 0, bArr, i4, bytes.length);
        int length = bytes.length == 0 ? i + 57 : bytes.length + i4;
        int iM10324 = length + m10324(length);
        C0481.m2323(0L, i2, bArr);
        C0481.m2323(0, i3, bArr);
        return iM10324 - i;
    }

    @Override // l.AbstractC3159
    public final String toString() {
        return "[" + super.toString() + ",name=" + this.f1249 + ",resolveDfs=" + this.f1256 + "]";
    }
}
