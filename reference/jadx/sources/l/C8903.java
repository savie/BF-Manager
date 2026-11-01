package l;

import java.nio.FloatBuffer;

/* JADX INFO: renamed from: l.ۡ۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8I9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8903 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f30548;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f30549;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final FloatBuffer f30550;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final FloatBuffer f30551;

    public C8903(C18780 c18780) {
        float[] fArr = c18780.f60892;
        this.f30548 = fArr.length / 3;
        this.f30550 = C17942.m41760(fArr);
        this.f30551 = C17942.m41760(c18780.f60895);
        int i = c18780.f60893;
        if (i == 1) {
            this.f30549 = 5;
        } else if (i == 2) {
            this.f30549 = 6;
        } else {
            this.f30549 = 4;
        }
    }
}
