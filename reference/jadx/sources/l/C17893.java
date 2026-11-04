package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* JADX INFO: renamed from: l.ܽ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6CW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17893 extends View {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Paint f58624;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16401 f58625;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Path f58626;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17893(C16401 c16401, Context context) {
        super(context);
        this.f58625 = c16401;
        this.f58624 = new Paint(1);
        this.f58626 = new Path();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C16401 c16401 = this.f58625;
        float fM38951 = c16401.m38951((c16401.f53219 * 16) + 12);
        float height = getHeight() / 2.0f;
        float fM38952 = c16401.m38951(7);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f58624;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setColor(-12367019);
        paint.setStrokeWidth(c16401.m38951(1));
        for (int i = 0; i < c16401.f53219; i++) {
            if ((c16401.f53228 & (1 << i)) != 0) {
                float fM38953 = c16401.m38951((i * 16) + 12);
                canvas.drawLine(fM38953, 0.0f, fM38953, getHeight(), paint);
            }
        }
        if (c16401.f53220) {
            if (c16401.f53225) {
                float fM38954 = fM38951 - c16401.m38951(16);
                canvas.drawLine(fM38954, 0.0f, fM38954, c16401.f53221 ? height : getHeight(), paint);
                canvas.drawLine(fM38954, height, fM38951 - fM38952, height, paint);
            } else {
                canvas.drawLine(fM38951, 0.0f, fM38951, height - fM38952, paint);
            }
        }
        if (c16401.f53229 && c16401.f53223) {
            canvas.drawLine(fM38951, height + fM38952, fM38951, getHeight(), paint);
        }
        paint.setColor(c16401.f53230);
        if (!c16401.f53229) {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(fM38951, height, getResources().getDisplayMetrics().density * 1.5f, paint);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getResources().getDisplayMetrics().density * 1.5f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        Path path = this.f58626;
        path.reset();
        if (c16401.f53223) {
            path.moveTo(fM38951 - c16401.m38951(4), height - c16401.m38951(2));
            path.lineTo(fM38951, c16401.m38951(2) + height);
            path.lineTo(fM38951 + c16401.m38951(4), height - c16401.m38951(2));
        } else {
            path.moveTo(fM38951 - c16401.m38951(2), height - c16401.m38951(4));
            path.lineTo(c16401.m38951(2) + fM38951, height);
            path.lineTo(fM38951 - c16401.m38951(2), height + c16401.m38951(4));
        }
        canvas.drawPath(path, paint);
    }
}
