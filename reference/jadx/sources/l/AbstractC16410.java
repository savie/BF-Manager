package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ܶ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R1T1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16410 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final short[] f53253 = new short[2];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final short[][] f53254;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final short[] f53255;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final short[][] f53256;

    public AbstractC16410() {
        Class cls = Short.TYPE;
        this.f53254 = (short[][]) Array.newInstance((Class<?>) cls, 16, 8);
        this.f53256 = (short[][]) Array.newInstance((Class<?>) cls, 16, 8);
        this.f53255 = new short[256];
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo35895() {
        AbstractC17076.m40213(this.f53253);
        int i = 0;
        int i2 = 0;
        while (true) {
            short[][] sArr = this.f53254;
            if (i2 >= sArr.length) {
                break;
            }
            AbstractC17076.m40213(sArr[i2]);
            i2++;
        }
        while (true) {
            short[][] sArr2 = this.f53256;
            if (i < sArr2.length) {
                AbstractC17076.m40213(sArr2[i]);
                i++;
            } else {
                AbstractC17076.m40213(this.f53255);
                return;
            }
        }
    }
}
