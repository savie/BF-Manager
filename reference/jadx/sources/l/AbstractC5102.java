package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۚۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1T1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5102 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final short[][] f17777;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final short[][] f17778;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final short[] f17779;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final short[] f17780;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final short[] f17781;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f17782;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final short[][] f17783;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final short[] f17784;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final short[][] f17785;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final short[] f17787;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int[] f17788 = new int[4];

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C19214 f17786 = new C19214();

    public AbstractC5102(int i) {
        Class cls = Short.TYPE;
        this.f17778 = (short[][]) Array.newInstance((Class<?>) cls, 12, 16);
        this.f17781 = new short[12];
        this.f17787 = new short[12];
        this.f17784 = new short[12];
        this.f17779 = new short[12];
        this.f17777 = (short[][]) Array.newInstance((Class<?>) cls, 12, 16);
        this.f17785 = (short[][]) Array.newInstance((Class<?>) cls, 4, 64);
        this.f17783 = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
        this.f17780 = new short[16];
        this.f17782 = (1 << i) - 1;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10858() {
        int[] iArr = this.f17788;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.f17786.m44135();
        int i2 = 0;
        while (true) {
            short[][] sArr = this.f17778;
            if (i2 >= sArr.length) {
                break;
            }
            AbstractC12807.m31803(sArr[i2]);
            i2++;
        }
        AbstractC12807.m31803(this.f17781);
        AbstractC12807.m31803(this.f17787);
        AbstractC12807.m31803(this.f17784);
        AbstractC12807.m31803(this.f17779);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.f17777;
            if (i3 >= sArr2.length) {
                break;
            }
            AbstractC12807.m31803(sArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.f17785;
            if (i4 >= sArr3.length) {
                break;
            }
            AbstractC12807.m31803(sArr3[i4]);
            i4++;
        }
        while (true) {
            short[][] sArr4 = this.f17783;
            if (i < sArr4.length) {
                AbstractC12807.m31803(sArr4[i]);
                i++;
            } else {
                AbstractC12807.m31803(this.f17780);
                return;
            }
        }
    }
}
