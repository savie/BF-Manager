package l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: l.ۗ۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3236 {
    @Deprecated
    public void onDraw(Canvas canvas, C17492 c17492) {
    }

    @Deprecated
    public void onDrawOver(Canvas canvas, C17492 c17492) {
    }

    public void onDraw(Canvas canvas, C17492 c17492, C16082 c16082) {
        onDraw(canvas, c17492);
    }

    public void onDrawOver(Canvas canvas, C17492 c17492, C16082 c16082) {
        onDrawOver(canvas, c17492);
    }

    @Deprecated
    public void getItemOffsets(Rect rect, int i, C17492 c17492) {
        rect.set(0, 0, 0, 0);
    }

    public void getItemOffsets(Rect rect, View view, C17492 c17492, C16082 c16082) {
        getItemOffsets(rect, ((C22432) view.getLayoutParams()).f73212.getLayoutPosition(), c17492);
    }
}
