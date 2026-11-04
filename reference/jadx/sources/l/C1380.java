package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֨ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: R16R */
/* JADX INFO: loaded from: classes2.dex */
public final class C1380 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public RectF f4919 = new RectF();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19279 f4920;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public PopupWindow f4921;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HandlerC10328 f4922;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f4923;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14803 f4924;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f4925;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f4926;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public TextUtils.TruncateAt f4927;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m5071() {
        this.f4927 = TextUtils.TruncateAt.START;
    }

    public C1380(Context context, int i) {
        PopupWindow popupWindow = new PopupWindow(context);
        this.f4921 = popupWindow;
        this.f4922 = new HandlerC10328(popupWindow);
        Drawable drawableM2186 = C0385.m2186(context, R.drawable.MT_Protector);
        if (drawableM2186 != null) {
            drawableM2186 = drawableM2186.mutate();
            drawableM2186.setAlpha(i);
            Rect rect = new Rect();
            drawableM2186.getPadding(rect);
            this.f4926 = rect.top + rect.bottom;
        }
        popupWindow.setBackgroundDrawable(drawableM2186);
        popupWindow.setFocusable(false);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(false);
        C19279 c19279 = new C19279(this, context);
        this.f4920 = c19279;
        C14803 c14803 = new C14803(context);
        this.f4924 = c14803;
        c14803.setAdapter((ListAdapter) c19279);
        c14803.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.۟ᩴᩴ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f26756.f4924.setSelection(0);
            }
        });
        popupWindow.setContentView(c14803);
        View viewInflate = LayoutInflater.from(c14803.getContext()).inflate(R.layout.MT_Protector, (ViewGroup) c14803, false);
        viewInflate.measure(0, 0);
        this.f4925 = c14803.getDividerHeight() + viewInflate.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m5072() {
        return this.f4925;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5073(int i) {
        this.f4924.m35644(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5066(AdapterView.OnItemClickListener onItemClickListener) {
        this.f4924.setOnItemClickListener(onItemClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5068(C2126 c2126) {
        this.f4924.setOnItemLongClickListener(c2126);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m5070() {
        return this.f4923.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5065() {
        if (this.f4921.isShowing()) {
            this.f4922.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m5074() {
        return this.f4921.isShowing();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m5064(int i) {
        return (CharSequence) this.f4923.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5067(ArrayList arrayList) {
        this.f4923 = arrayList;
        this.f4920.notifyDataSetChanged();
        this.f4924.setSelection(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5069(final C24132 c24132, int i) {
        int iMin;
        this.f4922.removeMessages(0);
        RectF rectF = this.f4919;
        c24132.m53898(rectF, i);
        int[] iArr = new int[2];
        c24132.getLocationOnScreen(iArr);
        final int i2 = iArr[1];
        final int height = c24132.getHeight();
        final View view = (View) c24132.getParent().getParent();
        view.getLocationOnScreen(iArr);
        int i3 = iArr[1];
        int height2 = view.getHeight();
        int iM35643 = this.f4924.m35643();
        if (iM35643 <= 0) {
            iMin = 0;
        } else {
            iMin = Math.min(iM35643, this.f4925 * this.f4920.getCount());
        }
        final int i4 = iMin + this.f4926;
        final int i5 = ((i3 + height2) - i2) - height;
        float fM54026 = c24132.m54026() + c24132.getHeight();
        float f = rectF.bottom;
        if ((fM54026 - f) + i5 <= i4) {
            C21576.m49068(new Runnable() { // from class: l.֡ᩴᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    C1380.m5060(this.f2479, i4, c24132, i5, height, i2, view);
                }
            });
            return;
        }
        int iM54026 = (int) ((f - c24132.m54026()) - c24132.getHeight());
        c24132.m53881();
        PopupWindow popupWindow = this.f4921;
        if (popupWindow.isShowing()) {
            popupWindow.update(0, height + i2 + iM54026, view.getWidth() - C6907.m19160(32.0f), -2);
            return;
        }
        m5061(c24132);
        popupWindow.setWidth(view.getWidth() - C6907.m19160(32.0f));
        popupWindow.setHeight(-2);
        popupWindow.setAnimationStyle(R.style.MT_Protector);
        popupWindow.showAtLocation(c24132, 49, 0, height + i2 + iM54026);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5060(C1380 c1380, int i, C24132 c24132, int i2, int i3, int i4, View view) {
        c24132.m54106(-1, (int) (((c1380.f4919.bottom + i) - c24132.getHeight()) - i2));
        int i5 = i2 - i;
        c24132.m53881();
        PopupWindow popupWindow = c1380.f4921;
        if (popupWindow.isShowing()) {
            popupWindow.update(0, i3 + i4 + i5, view.getWidth() - C6907.m19160(32.0f), -2);
            return;
        }
        c1380.m5061(c24132);
        popupWindow.setWidth(view.getWidth() - C6907.m19160(32.0f));
        popupWindow.setHeight(-2);
        popupWindow.setAnimationStyle(R.style.MT_Protector);
        popupWindow.showAtLocation(c24132, 49, 0, i3 + i4 + i5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5061(C24132 c24132) {
        C3977 c3977M51078 = C22666.m51078(c24132);
        PopupWindow popupWindow = this.f4921;
        if (c3977M51078 != null && c3977M51078.m12829()) {
            C13275 c13275M12817 = c3977M51078.m12817(8);
            if (c13275M12817.f42405 == 0 && c13275M12817.f42408 == 0 && c13275M12817.f42407 == 0 && c13275M12817.f42406 == 0) {
                popupWindow.setInputMethodMode(1);
                return;
            }
        }
        popupWindow.setInputMethodMode(2);
    }
}
