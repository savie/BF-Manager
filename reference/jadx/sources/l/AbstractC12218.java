package l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: l.ۨ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12218 {
    @Deprecated
    public void onDraw(Canvas canvas, C25227 c25227) {
    }

    @Deprecated
    public void onDrawOver(Canvas canvas, C25227 c25227) {
    }

    public void onDraw(Canvas canvas, C25227 c25227, C15529 c15529) {
        onDraw(canvas, c25227);
    }

    public void onDrawOver(Canvas canvas, C25227 c25227, C15529 c15529) {
        onDrawOver(canvas, c25227);
    }

    @Deprecated
    public void getItemOffsets(Rect rect, int i, C25227 c25227) {
        rect.set(0, 0, 0, 0);
    }

    public void getItemOffsets(Rect rect, View view, C25227 c25227, C15529 c15529) {
        getItemOffsets(rect, ((C18185) view.getLayoutParams()).f59428.getLayoutPosition(), c25227);
    }
}
