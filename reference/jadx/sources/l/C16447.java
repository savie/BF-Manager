package l;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes4.dex */
public final class C16447 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Paint f52885;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52886;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3040 f52887;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f52888;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f52889;

    public C16447(C3040 c3040) {
        this.f52887 = c3040;
        Paint paint = new Paint();
        this.f52885 = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setPathEffect(new DashPathEffect(new float[]{C13932.m33769(5.0f), C13932.m33769(2.5f)}, 0.0f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38715(C6111 c6111, C6111 c6112, boolean z) {
        C3040 c3040 = this.f52887;
        List list = c3040.f11378;
        int size = 0;
        if (list == null || !C3040.m9088(c3040)) {
            return false;
        }
        C3662 c3662 = c6111.f20764.f41308;
        int iM17066 = ((int) (c6111.m17066() / c6111.f20794.m17870())) + m38714(c6111);
        if (iM17066 >= 0) {
            size = iM17066 >= c3662.size() ? c3662.size() - 1 : iM17066;
        }
        C14435 c14435 = c3662.get(size);
        int iM9078 = C3040.m9078(z, c14435.f47316, c6111.m17000().length(), c6112.m17000().length(), list);
        int iM9079 = C3040.m9078(z, c14435.f47317 + 1, c6111.m17000().length(), c6112.m17000().length(), list);
        int iM30744 = c6112.f20764.m30744(iM9078);
        int iM30745 = iM9078 == iM9079 ? iM30744 : c6112.f20764.m30744(iM9079);
        this.f52886 = size;
        this.f52888 = iM30744;
        this.f52889 = iM30745;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38714(C6111 c6111) {
        return (int) (((int) Math.ceil((c6111.m16814() / c6111.f20794.m17870()) + 1.0f)) * (this.f52887.f11361 ? 0.4f : 0.33f));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m38716(C6111 c6111) {
        return m38714(c6111) * c6111.f20794.m17870();
    }
}
