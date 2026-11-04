package l;

import java.nio.FloatBuffer;

/* JADX INFO: renamed from: l.᩷ۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8I9 */
/* JADX INFO: loaded from: classes.dex */
public final class C21850 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f69613;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final FloatBuffer f69614;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final FloatBuffer f69615;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f69616;

    public C21850(C7151 c7151) {
        float[] fArr = c7151.f23651;
        this.f69616 = fArr.length / 3;
        this.f69614 = C7357.m20173(fArr);
        this.f69615 = C7357.m20173(c7151.f23650);
        int i = c7151.f23648;
        if (i == 1) {
            this.f69613 = 5;
        } else if (i == 2) {
            this.f69613 = 6;
        } else {
            this.f69613 = 4;
        }
    }
}
