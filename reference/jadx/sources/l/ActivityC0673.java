package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import java.io.IOException;

/* JADX INFO: renamed from: l.֡᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BK7 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC0673 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2819 = 0;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public final int[] f2820;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public int f2821;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public C6883 f2822;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "VectorPreviewActivity";
    }

    public ActivityC0673() {
        this.f2820 = C20368.m45991() ? new int[]{-16777216, -7829368, -1} : new int[]{-1, -7829368, -16777216};
        this.f2821 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x006a  */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C6037 c6037;
        byte[] bArrM41969;
        super.onCreate(bundle);
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        this.f41645 = (C6938) m31016(R.id.MT_Protector);
        this.f2822 = (C6883) m31016(R.id.MT_Protector);
        m31004(this.f41645);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC12024(1, this));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra(e.m);
        final C21111 c21111M47538 = null;
        if (byteArrayExtra == null) {
            try {
                AbstractC20745 abstractC20745M15309 = C5553.m15309(getIntent());
                byte[] bArrM46727 = abstractC20745M15309.m46727();
                String parent = abstractC20745M15309.getParent();
                AbstractC20745 abstractC20745M15313 = parent == null ? null : C5553.m15313(parent, "resources.arsc");
                c6037 = (abstractC20745M15313 == null || !abstractC20745M15313.mo33975()) ? null : new C6037(abstractC20745M15313);
                bArrM41969 = bArrM46727;
            } catch (Exception e) {
                m31003((Throwable) e, true);
                return;
            }
        } else {
            bArrM41969 = C18019.m41969(byteArrayExtra, byteArrayExtra.length);
            String stringExtra = getIntent().getStringExtra("arscPath");
            if (stringExtra != null) {
                AbstractC20745 abstractC20745M15314 = C5553.m15313(stringExtra, new String[0]);
                if (abstractC20745M15314.mo33975()) {
                    try {
                        c6037 = new C6037(abstractC20745M15314);
                    } catch (Throwable unused) {
                        c6037 = null;
                    }
                } else {
                    c6037 = null;
                }
            } else {
                c6037 = null;
            }
        }
        if (c6037 == null) {
            c6037 = new C6037();
        }
        try {
            try {
                c21111M47538 = C21111.m47538(C20945.m47103(bArrM41969).m47106(), c6037, false);
            } catch (Exception unused2) {
            }
            if (c21111M47538 != null) {
                this.f2822.setScaleType(ImageView.ScaleType.CENTER);
                this.f2822.setImageDrawable(c21111M47538);
                this.f2822.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ܺ᩸ۖ
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        ActivityC0673.m3022(this.f52298, c21111M47538);
                    }
                });
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(128, 128, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Rect rectCopyBounds = c21111M47538.copyBounds();
                c21111M47538.setBounds(0, 0, 128, 128);
                c21111M47538.draw(canvas);
                c21111M47538.setBounds(rectCopyBounds);
                int iM9160 = C3057.m9160(bitmapCreateBitmap);
                int[] iArr = this.f2820;
                if (C3057.m9162(iM9160, iArr[0])) {
                    this.f2821 = 1;
                }
                getWindow().getDecorView().setBackgroundColor(iArr[this.f2821]);
            }
        } catch (IOException e2) {
            m31002(e2, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3022(ActivityC0673 activityC0673, C21111 c21111) {
        float[] fArr;
        C6883 c6883 = activityC0673.f2822;
        int intrinsicWidth = c21111.getIntrinsicWidth();
        int intrinsicHeight = c21111.getIntrinsicHeight();
        int i = 0;
        float width = (c6883 == null ? 0 : (c6883.getWidth() - c6883.getPaddingLeft()) - c6883.getPaddingRight()) / intrinsicWidth;
        float height = (c6883 == null ? 0 : (c6883.getHeight() - c6883.getPaddingTop()) - c6883.getPaddingBottom()) / intrinsicHeight;
        float fMin = Math.min(width, height);
        float fMax = Math.max(width, height);
        if (fMin >= fMax) {
            fMax = fMin * 1.5f;
        }
        if (fMin >= 1.0f) {
            fArr = fMin >= 1.5f ? new float[]{1.0f, fMin, fMin} : new float[]{fMin, 2.0f * fMin, fMin};
        } else {
            fArr = new float[]{fMin, Math.max(2.0f * fMin, Math.min(3.0f, fMax)), fMin};
        }
        activityC0673.f2822.m18501(fArr[0], fArr[1]);
        activityC0673.f2822.post(new RunnableC20430(activityC0673, c21111, fArr, i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3023(ActivityC0673 activityC0673, C21111 c21111, float[] fArr) {
        if (c21111.getIntrinsicWidth() > activityC0673.f2822.getWidth() || c21111.getIntrinsicHeight() > activityC0673.f2822.getHeight()) {
            activityC0673.f2822.m18500(fArr[0]);
        } else {
            activityC0673.f2822.m18500(fArr[1]);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setShowAsAction(2);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.string.MT_Protector) {
            return false;
        }
        int i = this.f2821 + 1;
        this.f2821 = i;
        int[] iArr = this.f2820;
        if (i == iArr.length) {
            this.f2821 = 0;
        }
        getWindow().getDecorView().setBackgroundColor(iArr[this.f2821]);
        return true;
    }
}
