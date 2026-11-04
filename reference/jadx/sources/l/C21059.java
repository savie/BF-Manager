package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩶ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9VO */
/* JADX INFO: loaded from: classes5.dex */
public final class C21059 extends AbstractC20313 implements InterfaceC23297 {

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f67298 = C16980.m40037(C21059.class);

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f67299;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final String f67300;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f67301;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) {
        return 0;
    }

    public C21059(InterfaceC5878 interfaceC5878, byte[] bArr, String str) {
        super(interfaceC5878, 6);
        this.f67301 = bArr;
        this.f67300 = str;
    }

    public C21059(InterfaceC5878 interfaceC5878, byte[] bArr) {
        this(interfaceC5878, bArr, "");
    }

    @Override // l.InterfaceC23297
    /* JADX INFO: renamed from: ۙ */
    public final void mo3727(byte[] bArr) {
        this.f67301 = bArr;
    }

    public C21059(String str, InterfaceC5878 interfaceC5878) {
        this(interfaceC5878, C6143.f20968, str);
    }

    @Override // l.AbstractC20313
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC12108 mo1465(InterfaceC23032 interfaceC23032) {
        return new C18075(interfaceC23032.mo2875(), this.f67301, this.f67300);
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final void m48132() {
        this.f67299 = 1;
    }

    @Override // l.InterfaceC21299
    public final int size() {
        return AbstractC3159.m10300(88);
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        C0481.m2319(24L, i, bArr);
        C0481.m2319(this.f67299, i + 2, bArr);
        System.arraycopy(this.f67301, 0, bArr, i + 8, 16);
        int i2 = i + 24;
        InterfaceC25186 interfaceC25186 = f67298;
        if (interfaceC25186.mo13707()) {
            byte[] bArr2 = this.f67301;
            interfaceC25186.mo13721(C3188.m10404("Closing ", C6033.m17504(bArr2, 0, bArr2.length), " (", this.f67300, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        return i2 - i;
    }
}
