package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ܰۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1T1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13570 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final short[][] f44765;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final short[] f44766 = new short[2];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final short[][] f44767;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final short[] f44768;

    public AbstractC13570() {
        Class cls = Short.TYPE;
        this.f44767 = (short[][]) Array.newInstance((Class<?>) cls, 16, 8);
        this.f44765 = (short[][]) Array.newInstance((Class<?>) cls, 16, 8);
        this.f44768 = new short[256];
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo17716() {
        AbstractC12807.m31803(this.f44766);
        int i = 0;
        int i2 = 0;
        while (true) {
            short[][] sArr = this.f44767;
            if (i2 >= sArr.length) {
                break;
            }
            AbstractC12807.m31803(sArr[i2]);
            i2++;
        }
        while (true) {
            short[][] sArr2 = this.f44765;
            if (i < sArr2.length) {
                AbstractC12807.m31803(sArr2[i]);
                i++;
            } else {
                AbstractC12807.m31803(this.f44768);
                return;
            }
        }
    }
}
