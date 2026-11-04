package l;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes.dex */
public final class C21959 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f70876;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f70877;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24943 f70878;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f70879;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Paint f70880;

    public C21959(C24943 c24943) {
        this.f70878 = c24943;
        Paint paint = new Paint();
        this.f70880 = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setPathEffect(new DashPathEffect(new float[]{C6907.m19160(5.0f), C6907.m19160(2.5f)}, 0.0f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49686(C24132 c24132, C24132 c24133, boolean z) {
        C24943 c24943 = this.f70878;
        List list = c24943.f80732;
        int size = 0;
        if (list == null || !C24943.m55654(c24943)) {
            return false;
        }
        C6909 c6909 = c24132.f78022.f43643;
        int iM54026 = ((int) (c24132.m54026() / c24132.f78066.m16189())) + m49685(c24132);
        if (iM54026 >= 0) {
            size = iM54026 >= c6909.size() ? c6909.size() - 1 : iM54026;
        }
        C14366 c14366 = c6909.get(size);
        int iM55659 = C24943.m55659(z, c14366.f45295, c24132.m54021().length(), c24133.m54021().length(), list);
        int iM556510 = C24943.m55659(z, c14366.f45294 + 1, c24132.m54021().length(), c24133.m54021().length(), list);
        int iM33646 = c24133.f78022.m33646(iM55659);
        int iM33647 = iM55659 == iM556510 ? iM33646 : c24133.f78022.m33646(iM556510);
        this.f70876 = size;
        this.f70877 = iM33646;
        this.f70879 = iM33647;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m49685(C24132 c24132) {
        return (int) (((int) Math.ceil((c24132.m53993() / c24132.f78066.m16189()) + 1.0f)) * (this.f70878.f80748 ? 0.4f : 0.33f));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m49687(C24132 c24132) {
        return m49685(c24132) * c24132.f78066.m16189();
    }
}
