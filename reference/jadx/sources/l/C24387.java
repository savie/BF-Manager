package l;

import android.graphics.Point;
import android.view.Display;

/* JADX INFO: renamed from: l.᩺ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6IU */
/* JADX INFO: loaded from: classes.dex */
public final class C24387 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f79110;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Point f79111;

    public C24387(Display display) {
        Point point = new Point();
        this.f79111 = point;
        this.f79110 = display.getRotation();
        display.getRealSize(point);
    }
}
