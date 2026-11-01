package l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ܿۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BE7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17143 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f54681;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f54682;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f54683;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f54684;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC14322 f54685;

    public C17143(int i, int i2, int i3, AbstractC14322 abstractC14322, boolean z) {
        if (!C4010.m11515(i)) {
            throw new IllegalArgumentException("bogus opcode");
        }
        if (!C4010.m11515(i2)) {
            throw new IllegalArgumentException("bogus family");
        }
        if (!C4010.m11515(i3)) {
            throw new IllegalArgumentException("bogus nextOpcode");
        }
        if (abstractC14322 == null) {
            throw new NullPointerException("format == null");
        }
        this.f54683 = i;
        this.f54682 = i2;
        this.f54681 = i3;
        this.f54685 = abstractC14322;
        this.f54684 = z;
    }

    public final String toString() {
        return m40072();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m40071() {
        return this.f54683;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40070() {
        return this.f54682;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC14322 m40073() {
        return this.f54685;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m40068() {
        return this.f54684;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m40072() {
        return C6517.m17723(this.f54683).m10863();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m40069() {
        return this.f54681;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C17143 m40074() {
        switch (this.f54683) {
            case 50:
                return C5854.f19950;
            case 51:
                return C5854.f19965;
            case 52:
                return C5854.f19900;
            case 53:
                return C5854.f19945;
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                return C5854.f19970;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                return C5854.f19975;
            case 56:
                return C5854.f19870;
            case 57:
                return C5854.f19890;
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                return C5854.f19880;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                return C5854.f19915;
            case 60:
                return C5854.f19831;
            case 61:
                return C5854.f19940;
            default:
                throw new IllegalArgumentException("bogus opcode: " + this);
        }
    }
}
