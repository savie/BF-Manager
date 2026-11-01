package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34MM */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC16028 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int f51865 = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int f51866 = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f51868;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public LayoutInflater f51870;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC12483 f51871;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f51872;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public View f51874;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16900 f51875;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f51869 = new ArrayList(10);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC20966 f51867 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C17811 f51873 = null;

    public ViewOnClickListenerC16028(Main main, View view) {
        this.f51871 = main;
        this.f51874 = view;
        this.f51870 = LayoutInflater.from(main);
        this.f51868 = main.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38010(View view, C7560 c7560) {
        if (c7560 != null) {
            CharSequence charSequence = c7560.f25071;
            boolean z = c7560.f25069;
            view.setTag(c7560);
            TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            imageView.setImageTintList(C20368.f65987);
            textView.setText(charSequence);
            if (z) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) "￼");
                float textSize = textView.getTextSize();
                spannableStringBuilder.setSpan(new C10383(Math.max(C13932.m33769(4.0f), Math.round(0.28f * textSize)), Math.max(C13932.m33769(4.0f), Math.round(0.14f * textSize)), Math.max(1, Math.round(textSize * 0.02f))), length, length + 1, 33);
                charSequence = spannableStringBuilder;
            }
            textView.setText(charSequence);
            textView.setEllipsize(z ? TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.END);
            int i = c7560.f25073;
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageResource(i);
            }
            if (c7560.f25070) {
                view.setOnClickListener(this);
            } else if (z) {
                imageView.setDuplicateParentStateEnabled(false);
                textView.setDuplicateParentStateEnabled(false);
                imageView.setEnabled(false);
                textView.setEnabled(false);
            } else {
                view.setEnabled(false);
            }
            if (z) {
                view.setOnLongClickListener(this);
                return;
            }
            return;
        }
        view.setVisibility(4);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m38008() {
        if (!ApplicationC0716.f2992.getBoolean("sdrmlct", true)) {
            return false;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f51869;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((C7560) arrayList.get(i)).f25069) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38009(View view) {
        int i = 0;
        view.findViewById(R.id.MT_Protector).setVisibility(0);
        TextView textView = (TextView) view.findViewById(R.id.double_row_menu_tip_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.double_row_menu_tip_close);
        textView.setTextColor(C20368.f65988);
        String string = this.f51871.getString(R.string.MT_Protector, "￼");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iIndexOf = string.indexOf("￼");
        if (iIndexOf >= 0) {
            float textSize = textView.getTextSize();
            int iMax = Math.max(C13932.m33769(4.0f), Math.round(0.28f * textSize));
            int iMax2 = Math.max(C13932.m33769(2.0f), Math.round(textSize * 0.06f));
            spannableStringBuilder.setSpan(new C10383(iMax, iMax2, iMax2), iIndexOf, iIndexOf + 1, 33);
        }
        textView.setText(spannableStringBuilder);
        imageView.setColorFilter(C20368.f65988);
        imageView.setOnClickListener(new ViewOnClickListenerC8972(this, view, i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38011(ViewOnClickListenerC16028 viewOnClickListenerC16028, View view) {
        C16900 c16900;
        ApplicationC0716.f2992.edit().putBoolean("sdrmlct", false).apply();
        view.findViewById(R.id.MT_Protector).setVisibility(8);
        if (Build.VERSION.SDK_INT > 22 || (c16900 = viewOnClickListenerC16028.f51875) == null || !c16900.isShowing()) {
            return;
        }
        View viewFindViewById = viewOnClickListenerC16028.f51875.getContentView().findViewById(R.id.double_row_menu_tip_text);
        C16900 c16901 = viewOnClickListenerC16028.f51875;
        c16901.setHeight((c16901.getHeight() - viewFindViewById.getHeight()) - 1);
        C16900 c16902 = viewOnClickListenerC16028.f51875;
        c16902.update(c16902.getWidth(), viewOnClickListenerC16028.f51875.getHeight());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38012() {
        int i;
        int i2;
        int i3;
        int iMakeMeasureSpec;
        C7560 c7560;
        int i4;
        AbstractActivityC12483 abstractActivityC12483 = this.f51871;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        LinearLayout linearLayout = (LinearLayout) viewM30995.findViewById(R.id.linearLayout);
        C16900 c16900 = new C16900(abstractActivityC12483, null, R.attr.MT_Protector);
        this.f51875 = c16900;
        Drawable background = c16900.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            background.getPadding(rect);
            i = rect.left + rect.right;
            i2 = rect.top + rect.bottom;
        } else {
            i = 0;
            i2 = 0;
        }
        int i5 = this.f51868 - i;
        int i6 = 0;
        int measuredHeight = 0;
        int i7 = 0;
        int measuredHeight2 = 0;
        while (true) {
            ArrayList arrayList = this.f51869;
            int size = arrayList.size();
            i3 = f51866;
            iMakeMeasureSpec = f51865;
            if (i6 >= size) {
                break;
            }
            int i8 = i6 + 1;
            C7560 c7561 = (C7560) arrayList.get(i6);
            int i9 = i2;
            if (i8 != arrayList.size()) {
                i4 = i6 + 2;
                c7560 = (C7560) arrayList.get(i8);
            } else {
                c7560 = null;
                i4 = i8;
            }
            int i10 = i4;
            View viewInflate = this.f51870.inflate(R.layout.MT_Protector, (ViewGroup) linearLayout, false);
            if (measuredHeight == 0) {
                viewInflate.measure(iMakeMeasureSpec, i3);
                measuredHeight = viewInflate.getMeasuredHeight();
            }
            View viewFindViewById = viewInflate.findViewById(R.id.MT_Protector);
            View viewFindViewById2 = viewInflate.findViewById(R.id.MT_Protector);
            m38010(viewFindViewById, c7561);
            m38010(viewFindViewById2, c7560);
            linearLayout.addView(viewInflate);
            measuredHeight2 += measuredHeight;
            if (i7 != i5) {
                int iMax = Math.max(viewFindViewById.getMeasuredWidth(), viewFindViewById2.getMeasuredWidth()) << 1;
                if (iMax > i7) {
                    i7 = iMax;
                }
                if (i7 > i5) {
                    i7 = i5;
                }
            }
            i2 = i9;
            i6 = i10;
        }
        int i11 = i2;
        boolean zM38008 = m38008();
        if (zM38008) {
            m38009(viewM30995);
        }
        this.f51875.setContentView(viewM30995);
        if (Build.VERSION.SDK_INT <= 22) {
            if (zM38008) {
                if (i7 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                }
                viewM30995.measure(iMakeMeasureSpec, i3);
                measuredHeight2 = viewM30995.getMeasuredHeight();
            }
            this.f51875.setWidth(i7 + i);
            int identifier = abstractActivityC12483.getResources().getIdentifier("status_bar_height", "dimen", "android");
            this.f51875.setHeight(Math.min(measuredHeight2 + i11, (abstractActivityC12483.getWindow().getDecorView().getHeight() - (identifier > 0 ? abstractActivityC12483.getResources().getDimensionPixelSize(identifier) : 0)) - i11));
        }
        this.f51875.setOutsideTouchable(true);
        this.f51875.setFocusable(true);
        this.f51875.setInputMethodMode(2);
        ((FrameLayout) abstractActivityC12483.m31016(android.R.id.content)).getChildAt(0).getWindowVisibleDisplayFrame(new Rect());
        View view = this.f51874;
        view.getLocationInWindow(new int[2]);
        this.f51875.showAtLocation(view, 17, 0, 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38018() {
        C7560 c7560;
        AbstractActivityC12483 abstractActivityC12483 = this.f51871;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        LinearLayout linearLayout = (LinearLayout) viewM30995.findViewById(R.id.linearLayout);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f51869;
            if (i >= arrayList.size()) {
                break;
            }
            int i2 = i + 1;
            C7560 c7561 = (C7560) arrayList.get(i);
            if (i2 != arrayList.size()) {
                i += 2;
                c7560 = (C7560) arrayList.get(i2);
            } else {
                c7560 = null;
                i = i2;
            }
            View viewInflate = this.f51870.inflate(R.layout.MT_Protector, (ViewGroup) linearLayout, false);
            View viewFindViewById = viewInflate.findViewById(R.id.MT_Protector);
            View viewFindViewById2 = viewInflate.findViewById(R.id.MT_Protector);
            m38010(viewFindViewById, c7561);
            m38010(viewFindViewById2, c7560);
            linearLayout.addView(viewInflate);
        }
        if (m38008()) {
            m38009(viewM30995);
        }
        int i3 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        this.f51872 = c8067.m21269();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m38017() {
        AbstractActivityC12483 abstractActivityC12483 = this.f51871;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        ViewGroup.LayoutParams layoutParams = viewM30995.getLayoutParams();
        layoutParams.width = -1;
        viewM30995.setLayoutParams(layoutParams);
        View viewFindViewById = viewM30995.findViewById(R.id.MT_Protector);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
        layoutParams2.width = 0;
        viewFindViewById.setLayoutParams(layoutParams2);
        LinearLayout linearLayout = (LinearLayout) viewM30995.findViewById(R.id.linearLayout);
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        layoutParams3.width = -1;
        linearLayout.setLayoutParams(layoutParams3);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f51869;
            if (i >= arrayList.size()) {
                break;
            }
            int i2 = i + 1;
            C7560 c7560 = (C7560) arrayList.get(i);
            View viewInflate = this.f51870.inflate(R.layout.MT_Protector, (ViewGroup) linearLayout, false);
            m38010(viewInflate, c7560);
            linearLayout.addView(viewInflate);
            i = i2;
        }
        if (m38008()) {
            m38009(viewM30995);
        }
        int i3 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        this.f51872 = c8067.m21269();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        C13638.requireNonNull(tag);
        C7560 c7560 = (C7560) tag;
        if (c7560.f25070) {
            InterfaceC20966 interfaceC20966 = this.f51867;
            if (interfaceC20966 != null) {
                interfaceC20966.mo5519(c7560.f25072);
            }
            C16900 c16900 = this.f51875;
            if (c16900 != null) {
                c16900.dismiss();
                this.f51875 = null;
            }
            DialogInterfaceC19356 dialogInterfaceC19356 = this.f51872;
            if (dialogInterfaceC19356 != null) {
                dialogInterfaceC19356.dismiss();
                this.f51872 = null;
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C17811 c17811;
        Object tag = view.getTag();
        C13638.requireNonNull(tag);
        C7560 c7560 = (C7560) tag;
        if (!c7560.f25069 || (c17811 = this.f51873) == null) {
            return false;
        }
        if (!C11545.m28755(c17811.f56437, c17811.f56439, c17811.f56438, c17811.f56436, c7560.f25072)) {
            return false;
        }
        C16900 c16900 = this.f51875;
        if (c16900 != null) {
            c16900.dismiss();
            this.f51875 = null;
        }
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f51872;
        if (dialogInterfaceC19356 == null) {
            return true;
        }
        dialogInterfaceC19356.dismiss();
        this.f51872 = null;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38013(int i, int i2) {
        this.f51869.add(new C7560(this.f51871.getString(i), i2, 0, true, false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38014(String str, int i, int i2, boolean z, boolean z2) {
        this.f51869.add(new C7560(str, i, i2, z, z2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38016(InterfaceC20966 interfaceC20966) {
        this.f51867 = interfaceC20966;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38015(C17811 c17811) {
        this.f51873 = c17811;
    }
}
