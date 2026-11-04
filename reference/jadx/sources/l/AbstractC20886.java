package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.᩵᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R1T1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20886 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final short[] f66841;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final short[] f66842;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final short[] f66843;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final short[][] f66844;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f66845;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final short[][] f66846;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final short[] f66847;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final short[] f66849;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final short[][] f66850;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final short[][] f66851;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f66852 = new int[4];

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1495 f66848 = new C1495();

    public AbstractC20886(int i) {
        Class cls = Short.TYPE;
        this.f66851 = (short[][]) Array.newInstance((Class<?>) cls, 12, 16);
        this.f66849 = new short[12];
        this.f66847 = new short[12];
        this.f66843 = new short[12];
        this.f66841 = new short[12];
        this.f66846 = (short[][]) Array.newInstance((Class<?>) cls, 12, 16);
        this.f66850 = (short[][]) Array.newInstance((Class<?>) cls, 4, 64);
        this.f66844 = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
        this.f66842 = new short[16];
        this.f66845 = (1 << i) - 1;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo3090() {
        int[] iArr = this.f66852;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.f66848.m5324();
        int i2 = 0;
        while (true) {
            short[][] sArr = this.f66851;
            if (i2 >= sArr.length) {
                break;
            }
            AbstractC17076.m40213(sArr[i2]);
            i2++;
        }
        AbstractC17076.m40213(this.f66849);
        AbstractC17076.m40213(this.f66847);
        AbstractC17076.m40213(this.f66843);
        AbstractC17076.m40213(this.f66841);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.f66846;
            if (i3 >= sArr2.length) {
                break;
            }
            AbstractC17076.m40213(sArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.f66850;
            if (i4 >= sArr3.length) {
                break;
            }
            AbstractC17076.m40213(sArr3[i4]);
            i4++;
        }
        while (true) {
            short[][] sArr4 = this.f66844;
            if (i < sArr4.length) {
                AbstractC17076.m40213(sArr4[i]);
                i++;
            } else {
                AbstractC17076.m40213(this.f66842);
                return;
            }
        }
    }
}
