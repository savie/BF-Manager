package l;

import android.os.SystemClock;
import android.widget.AbsListView;

/* JADX INFO: renamed from: l.᩹ۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J5HS */
/* JADX INFO: loaded from: classes.dex */
public final class C22129 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6606 f71644;

    public C22129(C6606 c6606) {
        this.f71644 = c6606;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C6606 c6606 = this.f71644;
        if (i != 0) {
            c6606.f22240 = true;
            c6606.f22234 = SystemClock.uptimeMillis();
        } else {
            c6606.f22235 = SystemClock.uptimeMillis();
            c6606.f22242.sendEmptyMessageDelayed(0, 1500L);
            c6606.f22240 = false;
        }
        if (c6606.f22231 != null) {
            c6606.f22231.onScrollStateChanged(absListView, i);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C6606 c6606 = this.f71644;
        c6606.f22234 = jUptimeMillis;
        if (c6606.f22231 != null) {
            c6606.f22231.onScroll(absListView, i, i2, i3);
        }
    }
}
