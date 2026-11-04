package l;

import android.os.SystemClock;
import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ۙܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J5HS */
/* JADX INFO: loaded from: classes2.dex */
public final class C5071 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19987 f17676;

    public C5071(C19987 c19987) {
        this.f17676 = c19987;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C19987 c19987 = this.f17676;
        if (i != 0) {
            c19987.f64223 = true;
            c19987.f64231 = SystemClock.uptimeMillis();
        } else {
            c19987.f64219 = SystemClock.uptimeMillis();
            c19987.f64228.sendEmptyMessageDelayed(0, 1500L);
            c19987.f64223 = false;
        }
        if (c19987.f64230 != null) {
            c19987.f64230.onScrollStateChanged(absListView, i);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C19987 c19987 = this.f17676;
        c19987.f64231 = jUptimeMillis;
        if (c19987.f64230 != null) {
            c19987.f64230.onScroll(absListView, i, i2, i3);
        }
    }
}
