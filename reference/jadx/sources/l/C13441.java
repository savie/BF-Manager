package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۬᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13441 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44484;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44485;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4267 f44486;

    public C13441(C4267 c4267, int i, int i2) {
        this.f44486 = c4267;
        this.f44485 = i;
        this.f44484 = i2;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f44486.f15400.f23768.m28824(), R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = this.f44485;
        int i2 = this.f44484;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(4, 131));
        C4267 c4267 = this.f44486;
        canvas.scale(i / c4267.f15401, i2 / c4267.f15402);
        C7090 c7090 = c4267.f15400;
        c7090.f23767.m29090(canvas);
        OutputStream outputStreamMo33976 = c7090.f23770.mo33976(false);
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
        C7090 c7090 = this.f44486.f15400;
        c7090.f23768.m28787(c7090.f23770);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f44486.f15400.f23768.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
        C21094.m47530();
    }
}
