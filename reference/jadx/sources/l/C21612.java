package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.t0.b;

/* JADX INFO: renamed from: l.᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X58Q */
/* JADX INFO: loaded from: classes.dex */
public class C21612 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View f69025;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final WindowManager.LayoutParams f69026;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Rect f69027;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f69028;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f69029;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Context f69030;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TextView f69031;

    public C21612(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f69026 = layoutParams;
        this.f69027 = new Rect();
        this.f69029 = new int[2];
        this.f69028 = new int[2];
        this.f69030 = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f69025 = viewInflate;
        this.f69031 = (TextView) viewInflate.findViewById(R.id.MT_Protector);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = b.c;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.MT_Protector;
        layoutParams.flags = 24;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo4706(View view, int i, int i2, boolean z, CharSequence charSequence) {
        int height;
        int i3;
        if (mo4707()) {
            mo4704();
        }
        this.f69031.setText(charSequence);
        IBinder applicationWindowToken = view.getApplicationWindowToken();
        WindowManager.LayoutParams layoutParams = this.f69026;
        layoutParams.token = applicationWindowToken;
        Context context = this.f69030;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.MT_Protector);
        int width = view.getWidth() >= dimensionPixelOffset ? i : view.getWidth() / 2;
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.MT_Protector);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z ? R.dimen.MT_Protector : R.dimen.MT_Protector);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                if (context2 instanceof Activity) {
                    rootView = ((Activity) context2).getWindow().getDecorView();
                    break;
                }
            }
        }
        View view2 = this.f69025;
        if (rootView != null) {
            Rect rect = this.f69027;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources = context.getResources();
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = this.f69028;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = this.f69029;
            view.getLocationOnScreen(iArr2);
            int i4 = iArr2[0] - iArr[0];
            iArr2[0] = i4;
            iArr2[1] = iArr2[1] - iArr[1];
            layoutParams.x = (i4 + width) - (rootView.getWidth() / 2);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i5 = iArr2[1];
            int i6 = ((i3 + i5) - dimensionPixelOffset3) - measuredHeight;
            int i7 = i5 + height + dimensionPixelOffset3;
            if (z) {
                if (i6 >= 0) {
                    layoutParams.y = i6;
                } else {
                    layoutParams.y = i7;
                }
            } else if (measuredHeight + i7 <= rect.height()) {
                layoutParams.y = i7;
            } else {
                layoutParams.y = i6;
            }
        }
        ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo4704() {
        if (mo4707()) {
            ((WindowManager) this.f69030.getSystemService("window")).removeView(this.f69025);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo4707() {
        return this.f69025.getParent() != null;
    }
}
