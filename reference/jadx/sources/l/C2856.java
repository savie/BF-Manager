package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۖ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2856 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10789;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10790;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5679 f10791;

    public C2856(C5679 c5679, int i, int i2) {
        this.f10791 = c5679;
        this.f10790 = i;
        this.f10789 = i2;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f10791.f19386.f73693, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = this.f10790;
        int i2 = this.f10789;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(4, 131));
        C22613 c22613 = this.f10791.f19386;
        c22613.f73694.setBounds(0, 0, i, i2);
        c22613.f73694.draw(canvas);
        OutputStream outputStreamMo33976 = c22613.f73690.mo33976(false);
        try {
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamMo33976);
            if (outputStreamMo33976 != null) {
                outputStreamMo33976.close();
            }
        } catch (Throwable th) {
            if (outputStreamMo33976 != null) {
                try {
                    outputStreamMo33976.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C22613 c22613 = this.f10791.f19386;
        c22613.f73692.m28787(c22613.f73690);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f10791.f19386.f73693.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
        C21094.m47530();
    }
}
