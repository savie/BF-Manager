package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۗᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E9UL */
/* JADX INFO: loaded from: classes3.dex */
public final class C3417 extends AbstractC6240 implements InterfaceC22553 {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f12612 = C13488.m32997(C3417.class);

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public long f12613;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public long f12614;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f12615;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final String f12616;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f12617;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f12618;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        return 0;
    }

    public C3417(InterfaceC10601 interfaceC10601, byte[] bArr, String str) {
        super(interfaceC10601);
        this.f12615 = bArr;
        this.f12616 = str;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final int m10131() {
        return this.f12617;
    }

    @Override // l.InterfaceC22553
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long mo10132() {
        return this.f12613;
    }

    @Override // l.InterfaceC22553
    public final long getSize() {
        return this.f12614;
    }

    @Override // l.InterfaceC22553
    public final int getAttributes() {
        return this.f12618;
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) throws C2796 {
        if (C4850.m13545(i, bArr) != 60) {
            throw new C2796("Expected structureSize = 60");
        }
        this.f12617 = C4850.m13545(i + 2, bArr);
        C4850.m13543(i + 8, bArr);
        C4850.m13543(i + 16, bArr);
        this.f12613 = C4850.m13543(i + 24, bArr);
        C4850.m13543(i + 32, bArr);
        C4850.m13547(i + 40, bArr);
        this.f12614 = C4850.m13547(i + 48, bArr);
        this.f12618 = C4850.m13549(i + 56, bArr);
        int i2 = i + 60;
        InterfaceC4314 interfaceC4314 = f12612;
        if (interfaceC4314.mo12125()) {
            byte[] bArr2 = this.f12615;
            interfaceC4314.mo12135(C0242.m1617("Closed ", C5993.m16281(bArr2, 0, bArr2.length), " (", this.f12616, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        return i2 - i;
    }
}
