package l;

import android.graphics.Color;

/* JADX INFO: renamed from: l.᩹ܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R12P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23597 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f76607;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f76608;

    /* JADX INFO: renamed from: ᩸ */
    public abstract int mo6775();

    public AbstractC23597(int i) {
        this.f76608 = i;
    }

    /* JADX INFO: renamed from: ۤ */
    public int mo32682() {
        return this.f76608;
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo36859() {
        if (C3296.f10759) {
            int i = this.f76607;
            if (i != 0) {
                return i;
            }
            float[] fArr = {0.0f, 0.0f, 0.9f};
            C19988.m45963(mo6775(), fArr);
            int iM45960 = C19988.m45960(fArr);
            double[] dArr = new double[3];
            C19988.m45961(Color.red(iM45960), Color.green(iM45960), Color.blue(iM45960), dArr);
            int iM45955 = C19988.m45955(dArr[1], dArr[2]);
            this.f76607 = iM45955;
            return iM45955;
        }
        return mo6775();
    }

    /* JADX INFO: renamed from: ᩷ */
    public int mo36860() {
        if (C3296.f10759) {
            return mo6775();
        }
        return C3296.m10878() ? -922746881 : -1;
    }
}
