package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۙ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 0A1O */
/* JADX INFO: loaded from: classes3.dex */
public final class C4519 extends AbstractC17529 implements InterfaceC11970 {

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f16080 = C13488.m32997(C4519.class);

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f16081;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public String f16082;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public String f16083;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f16084;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f16085;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f16086;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public String f16087;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16088;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f16089;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f16090;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) {
        return 0;
    }

    public C4519(String str, InterfaceC10601 interfaceC10601) {
        super(interfaceC10601, 5);
        this.f16085 = 1179785;
        this.f16084 = 3;
        this.f16081 = 1;
        this.f16090 = 0;
        mo12623(str);
    }

    @Override // l.AbstractC17529
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC6240 mo3799(InterfaceC19067 interfaceC19067) {
        return new C13693(this.f16082, interfaceC19067.mo29449());
    }

    @Override // l.InterfaceC11970
    public final String getPath() {
        return "\\" + this.f16082;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String mo12625() {
        return this.f16087;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo12622() {
        return this.f16083;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String mo12627() {
        return this.f16089;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12624(String str, String str2, String str3) {
        this.f16089 = str;
        this.f16083 = str2;
        this.f16087 = str3;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12623(String str) {
        if (str.length() > 0 && str.charAt(0) == '\\') {
            str = str.substring(1);
        }
        if (str.length() > 1 && C3184.m9601(1, str) == '\\') {
            str = C20630.m46498(1, 0, str);
        }
        this.f16082 = str;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo12632() {
        m31365(268435456);
        this.f16088 = true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m12629(int i) {
        this.f16085 = i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m12630(int i) {
        this.f16086 = i;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m12626(int i) {
        this.f16084 = i;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m12628(int i) {
        this.f16081 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m12631(int i) {
        this.f16090 = i;
    }

    @Override // l.InterfaceC3314
    public final int size() {
        int length = this.f16082.length() * 2;
        if (length == 0) {
            length++;
        }
        return AbstractC12591.m31337(AbstractC12591.m31337(length) + UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        InterfaceC4314 interfaceC4314 = f16080;
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Opening " + this.f16082);
            interfaceC4314.mo12135("Flags are ".concat(C5993.m16280(m31349(), 4)));
        }
        C4850.m13546(57L, i, bArr);
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        C4850.m13550(2, i + 4, bArr);
        C4850.m13548(0L, i + 8, bArr);
        C4850.m13550(this.f16085, i + 24, bArr);
        C4850.m13550(this.f16086, i + 28, bArr);
        C4850.m13550(this.f16084, i + 32, bArr);
        C4850.m13550(this.f16081, i + 36, bArr);
        C4850.m13550(this.f16090, i + 40, bArr);
        byte[] bytes = this.f16082.getBytes(StandardCharsets.UTF_16LE);
        C4850.m13546(bytes.length, i + 46, bArr);
        int i2 = i + 48;
        int i3 = i + 52;
        int i4 = i + 56;
        C4850.m13546(i4 - m31366(), i + 44, bArr);
        System.arraycopy(bytes, 0, bArr, i4, bytes.length);
        int length = bytes.length == 0 ? i + 57 : bytes.length + i4;
        int iM31338 = length + m31338(length);
        C4850.m13550(0L, i2, bArr);
        C4850.m13550(0, i3, bArr);
        return iM31338 - i;
    }

    @Override // l.AbstractC12591
    public final String toString() {
        return "[" + super.toString() + ",name=" + this.f16082 + ",resolveDfs=" + this.f16088 + "]";
    }
}
