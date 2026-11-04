package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܿۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9UL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18075 extends AbstractC12108 implements InterfaceC1162 {

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f59160 = C16980.m40037(C18075.class);

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public long f59161;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final String f59162;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f59163;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f59164;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f59165;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public long f59166;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        return 0;
    }

    public C18075(InterfaceC5878 interfaceC5878, byte[] bArr, String str) {
        super(interfaceC5878);
        this.f59163 = bArr;
        this.f59162 = str;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final int m42109() {
        return this.f59165;
    }

    @Override // l.InterfaceC1162
    /* JADX INFO: renamed from: ۡ */
    public final long mo4305() {
        return this.f59166;
    }

    @Override // l.InterfaceC1162
    public final long getSize() {
        return this.f59161;
    }

    @Override // l.InterfaceC1162
    public final int getAttributes() {
        return this.f59164;
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) throws C19061 {
        if (C0481.m2318(i, bArr) != 60) {
            throw new C19061("Expected structureSize = 60");
        }
        this.f59165 = C0481.m2318(i + 2, bArr);
        C0481.m2324(i + 8, bArr);
        C0481.m2324(i + 16, bArr);
        this.f59166 = C0481.m2324(i + 24, bArr);
        C0481.m2324(i + 32, bArr);
        C0481.m2320(i + 40, bArr);
        this.f59161 = C0481.m2320(i + 48, bArr);
        this.f59164 = C0481.m2322(i + 56, bArr);
        int i2 = i + 60;
        InterfaceC25186 interfaceC25186 = f59160;
        if (interfaceC25186.mo13707()) {
            byte[] bArr2 = this.f59163;
            interfaceC25186.mo13721(C3188.m10404("Closed ", C6033.m17504(bArr2, 0, bArr2.length), " (", this.f59162, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        return i2 - i;
    }
}
