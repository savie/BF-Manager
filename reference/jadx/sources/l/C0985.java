package l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.֨ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BE7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0985 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f3579;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f3580;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f3581;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC6951 f3582;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f3583;

    public C0985(int i, int i2, int i3, AbstractC6951 abstractC6951, boolean z) {
        if (!C8311.m22392(i)) {
            throw new IllegalArgumentException("bogus opcode");
        }
        if (!C8311.m22392(i2)) {
            throw new IllegalArgumentException("bogus family");
        }
        if (!C8311.m22392(i3)) {
            throw new IllegalArgumentException("bogus nextOpcode");
        }
        if (abstractC6951 == null) {
            throw new NullPointerException("format == null");
        }
        this.f3581 = i;
        this.f3579 = i2;
        this.f3583 = i3;
        this.f3582 = abstractC6951;
        this.f3580 = z;
    }

    public final String toString() {
        return m3864();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m3867() {
        return this.f3581;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3863() {
        return this.f3579;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC6951 m3868() {
        return this.f3582;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m3865() {
        return this.f3580;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m3864() {
        return C17083.m40215(this.f3581).m56468();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m3869() {
        return this.f3583;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0985 m3866() {
        switch (this.f3581) {
            case 50:
                return C9187.f29919;
            case 51:
                return C9187.f29929;
            case 52:
                return C9187.f29835;
            case 53:
                return C9187.f29795;
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                return C9187.f29934;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                return C9187.f29820;
            case 56:
                return C9187.f29860;
            case 57:
                return C9187.f29875;
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                return C9187.f29954;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                return C9187.f29845;
            case 60:
                return C9187.f29914;
            case 61:
                return C9187.f29889;
            default:
                throw new IllegalArgumentException("bogus opcode: " + this);
        }
    }
}
