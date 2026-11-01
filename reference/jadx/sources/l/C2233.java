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

/* JADX INFO: renamed from: l.ۖۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R16R */
/* JADX INFO: loaded from: classes2.dex */
public final class C2233 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f8015;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public TextUtils.TruncateAt f8016;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public RectF f8017 = new RectF();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13524 f8018;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f8019;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HandlerC11407 f8020;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public PopupWindow f8021;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f8022;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14499 f8023;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m6867() {
        this.f8016 = TextUtils.TruncateAt.START;
    }

    public C2233(Context context, int i) {
        PopupWindow popupWindow = new PopupWindow(context);
        this.f8021 = popupWindow;
        this.f8020 = new HandlerC11407(popupWindow);
        Drawable drawableM37904 = C15945.m37904(context, R.drawable.MT_Protector);
        if (drawableM37904 != null) {
            drawableM37904 = drawableM37904.mutate();
            drawableM37904.setAlpha(i);
            Rect rect = new Rect();
            drawableM37904.getPadding(rect);
            this.f8022 = rect.top + rect.bottom;
        }
        popupWindow.setBackgroundDrawable(drawableM37904);
        popupWindow.setFocusable(false);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(false);
        C13524 c13524 = new C13524(this, context);
        this.f8018 = c13524;
        C14499 c14499 = new C14499(context);
        this.f8023 = c14499;
        c14499.setAdapter((ListAdapter) c13524);
        c14499.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ۙۖۚ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f15563.f8023.setSelection(0);
            }
        });
        popupWindow.setContentView(c14499);
        View viewInflate = LayoutInflater.from(c14499.getContext()).inflate(R.layout.MT_Protector, (ViewGroup) c14499, false);
        viewInflate.measure(0, 0);
        this.f8019 = c14499.getDividerHeight() + viewInflate.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m6869() {
        return this.f8019;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m6870(int i) {
        this.f8023.m34915(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6863(AdapterView.OnItemClickListener onItemClickListener) {
        this.f8023.setOnItemClickListener(onItemClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6866(C8854 c8854) {
        this.f8023.setOnItemLongClickListener(c8854);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m6868() {
        return this.f8015.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6862() {
        if (this.f8021.isShowing()) {
            this.f8020.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m6860() {
        return this.f8021.isShowing();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m6861(int i) {
        return (CharSequence) this.f8015.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6864(ArrayList arrayList) {
        this.f8015 = arrayList;
        this.f8018.notifyDataSetChanged();
        this.f8023.setSelection(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6865(final C6111 c6111, int i) {
        int iMin;
        this.f8020.removeMessages(0);
        RectF rectF = this.f8017;
        c6111.m16852(rectF, i);
        int[] iArr = new int[2];
        c6111.getLocationOnScreen(iArr);
        final int i2 = iArr[1];
        final int height = c6111.getHeight();
        final View view = (View) c6111.getParent().getParent();
        view.getLocationOnScreen(iArr);
        int i3 = iArr[1];
        int height2 = view.getHeight();
        int iM34914 = this.f8023.m34914();
        if (iM34914 <= 0) {
            iMin = 0;
        } else {
            iMin = Math.min(iM34914, this.f8019 * this.f8018.getCount());
        }
        final int i4 = iMin + this.f8022;
        final int i5 = ((i3 + height2) - i2) - height;
        float fM17066 = c6111.m17066() + c6111.getHeight();
        float f = rectF.bottom;
        if ((fM17066 - f) + i5 <= i4) {
            C16737.m39273(new Runnable() { // from class: l.ۗۨۚ
                @Override // java.lang.Runnable
                public final void run() {
                    C2233.m6856(this.f11999, i4, c6111, i5, height, i2, view);
                }
            });
            return;
        }
        int iM17066 = (int) ((f - c6111.m17066()) - c6111.getHeight());
        c6111.m16951();
        PopupWindow popupWindow = this.f8021;
        if (popupWindow.isShowing()) {
            popupWindow.update(0, height + i2 + iM17066, view.getWidth() - C13932.m33769(32.0f), -2);
            return;
        }
        m6857(c6111);
        popupWindow.setWidth(view.getWidth() - C13932.m33769(32.0f));
        popupWindow.setHeight(-2);
        popupWindow.setAnimationStyle(R.style.MT_Protector);
        popupWindow.showAtLocation(c6111, 49, 0, height + i2 + iM17066);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6856(C2233 c2233, int i, C6111 c6111, int i2, int i3, int i4, View view) {
        c6111.m16921(-1, (int) (((c2233.f8017.bottom + i) - c6111.getHeight()) - i2));
        int i5 = i2 - i;
        c6111.m16951();
        PopupWindow popupWindow = c2233.f8021;
        if (popupWindow.isShowing()) {
            popupWindow.update(0, i3 + i4 + i5, view.getWidth() - C13932.m33769(32.0f), -2);
            return;
        }
        c2233.m6857(c6111);
        popupWindow.setWidth(view.getWidth() - C13932.m33769(32.0f));
        popupWindow.setHeight(-2);
        popupWindow.setAnimationStyle(R.style.MT_Protector);
        popupWindow.showAtLocation(c6111, 49, 0, i3 + i4 + i5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6857(C6111 c6111) {
        C15844 c15844M13974 = C5031.m13974(c6111);
        PopupWindow popupWindow = this.f8021;
        if (c15844M13974 != null && c15844M13974.m37688()) {
            C13954 c13954M37673 = c15844M13974.m37673(8);
            if (c13954M37673.f45913 == 0 && c13954M37673.f45912 == 0 && c13954M37673.f45915 == 0 && c13954M37673.f45914 == 0) {
                popupWindow.setInputMethodMode(1);
                return;
            }
        }
        popupWindow.setInputMethodMode(2);
    }
}
