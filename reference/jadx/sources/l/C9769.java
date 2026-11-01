package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۢᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J9VO */
/* JADX INFO: loaded from: classes4.dex */
public final class C9769 extends AbstractC17529 implements InterfaceC16824 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f32856 = C13488.m32997(C9769.class);

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f32857;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final String f32858;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f32859;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) {
        return 0;
    }

    public C9769(InterfaceC10601 interfaceC10601, byte[] bArr, String str) {
        super(interfaceC10601, 6);
        this.f32859 = bArr;
        this.f32858 = str;
    }

    public C9769(InterfaceC10601 interfaceC10601, byte[] bArr) {
        this(interfaceC10601, bArr, "");
    }

    @Override // l.InterfaceC16824
    /* JADX INFO: renamed from: ۙ */
    public final void mo3798(byte[] bArr) {
        this.f32859 = bArr;
    }

    public C9769(String str, InterfaceC10601 interfaceC10601) {
        this(interfaceC10601, C11180.f37872, str);
    }

    @Override // l.AbstractC17529
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC6240 mo3799(InterfaceC19067 interfaceC19067) {
        return new C3417(interfaceC19067.mo29449(), this.f32859, this.f32858);
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final void m24752() {
        this.f32857 = 1;
    }

    @Override // l.InterfaceC3314
    public final int size() {
        return AbstractC12591.m31337(88);
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        C4850.m13546(24L, i, bArr);
        C4850.m13546(this.f32857, i + 2, bArr);
        System.arraycopy(this.f32859, 0, bArr, i + 8, 16);
        int i2 = i + 24;
        InterfaceC4314 interfaceC4314 = f32856;
        if (interfaceC4314.mo12125()) {
            byte[] bArr2 = this.f32859;
            interfaceC4314.mo12135(C0242.m1617("Closing ", C5993.m16281(bArr2, 0, bArr2.length), " (", this.f32858, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        return i2 - i;
    }
}
