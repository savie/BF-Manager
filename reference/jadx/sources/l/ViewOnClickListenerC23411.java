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

/* JADX INFO: renamed from: l.᩹۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 34MM */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC23411 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f75781;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public LayoutInflater f75783;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C10247 f75784;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f75785;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC17204 f75786;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public View f75789;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final int f75780 = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int f75779 = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f75782 = new ArrayList(10);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC15951 f75787 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16818 f75788 = null;

    public ViewOnClickListenerC23411(Main main, View view) {
        this.f75786 = main;
        this.f75789 = view;
        this.f75783 = LayoutInflater.from(main);
        this.f75785 = main.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52599(View view, C17443 c17443) {
        if (c17443 != null) {
            CharSequence charSequence = c17443.f56735;
            boolean z = c17443.f56737;
            view.setTag(c17443);
            TextView textView = (TextView) view.findViewById(R.id.title);
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            imageView.setImageTintList(C3296.f10740);
            textView.setText(charSequence);
            if (z) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) "￼");
                float textSize = textView.getTextSize();
                spannableStringBuilder.setSpan(new C16697(Math.max(C6907.m19160(4.0f), Math.round(0.28f * textSize)), Math.max(C6907.m19160(4.0f), Math.round(0.14f * textSize)), Math.max(1, Math.round(textSize * 0.02f))), length, length + 1, 33);
                charSequence = spannableStringBuilder;
            }
            textView.setText(charSequence);
            textView.setEllipsize(z ? TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.END);
            int i = c17443.f56736;
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageResource(i);
            }
            if (c17443.f56733) {
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m52601() {
        if (!ApplicationC17729.f58258.getBoolean("sdrmlct", true)) {
            return false;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f75782;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((C17443) arrayList.get(i)).f56737) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52598(final View view) {
        view.findViewById(R.id.MT_Protector).setVisibility(0);
        TextView textView = (TextView) view.findViewById(R.id.double_row_menu_tip_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.double_row_menu_tip_close);
        textView.setTextColor(C3296.f10741);
        String string = this.f75786.getString(R.string.MT_Protector, "￼");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iIndexOf = string.indexOf("￼");
        if (iIndexOf >= 0) {
            float textSize = textView.getTextSize();
            int iMax = Math.max(C6907.m19160(4.0f), Math.round(0.28f * textSize));
            int iMax2 = Math.max(C6907.m19160(2.0f), Math.round(textSize * 0.06f));
            spannableStringBuilder.setSpan(new C16697(iMax, iMax2, iMax2), iIndexOf, iIndexOf + 1, 33);
        }
        textView.setText(spannableStringBuilder);
        imageView.setColorFilter(C3296.f10741);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.᩻۟᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewOnClickListenerC23411.m52600(this.f80582, view);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52600(ViewOnClickListenerC23411 viewOnClickListenerC23411, View view) {
        C10247 c10247;
        ApplicationC17729.f58258.edit().putBoolean("sdrmlct", false).apply();
        view.findViewById(R.id.MT_Protector).setVisibility(8);
        if (Build.VERSION.SDK_INT > 22 || (c10247 = viewOnClickListenerC23411.f75784) == null || !c10247.isShowing()) {
            return;
        }
        View viewFindViewById = viewOnClickListenerC23411.f75784.getContentView().findViewById(R.id.double_row_menu_tip_text);
        C10247 c10248 = viewOnClickListenerC23411.f75784;
        c10248.setHeight((c10248.getHeight() - viewFindViewById.getHeight()) - 1);
        C10247 c10249 = viewOnClickListenerC23411.f75784;
        c10249.update(c10249.getWidth(), viewOnClickListenerC23411.f75784.getHeight());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52602() {
        int i;
        int i2;
        int i3;
        int iMakeMeasureSpec;
        C17443 c17443;
        int i4;
        AbstractActivityC17204 abstractActivityC17204 = this.f75786;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        LinearLayout linearLayout = (LinearLayout) viewM40395.findViewById(R.id.linearLayout);
        C10247 c10247 = new C10247(abstractActivityC17204, null, R.attr.MT_Protector);
        this.f75784 = c10247;
        Drawable background = c10247.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            background.getPadding(rect);
            i = rect.left + rect.right;
            i2 = rect.top + rect.bottom;
        } else {
            i = 0;
            i2 = 0;
        }
        int i5 = this.f75785 - i;
        int i6 = 0;
        int measuredHeight = 0;
        int i7 = 0;
        int measuredHeight2 = 0;
        while (true) {
            ArrayList arrayList = this.f75782;
            int size = arrayList.size();
            i3 = f75779;
            iMakeMeasureSpec = f75780;
            if (i6 >= size) {
                break;
            }
            int i8 = i6 + 1;
            C17443 c17444 = (C17443) arrayList.get(i6);
            int i9 = i2;
            if (i8 != arrayList.size()) {
                i4 = i6 + 2;
                c17443 = (C17443) arrayList.get(i8);
            } else {
                c17443 = null;
                i4 = i8;
            }
            int i10 = i4;
            View viewInflate = this.f75783.inflate(R.layout.MT_Protector, (ViewGroup) linearLayout, false);
            if (measuredHeight == 0) {
                viewInflate.measure(iMakeMeasureSpec, i3);
                measuredHeight = viewInflate.getMeasuredHeight();
            }
            View viewFindViewById = viewInflate.findViewById(R.id.MT_Protector);
            View viewFindViewById2 = viewInflate.findViewById(R.id.MT_Protector);
            m52599(viewFindViewById, c17444);
            m52599(viewFindViewById2, c17443);
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
        boolean zM52601 = m52601();
        if (zM52601) {
            m52598(viewM40395);
        }
        this.f75784.setContentView(viewM40395);
        if (Build.VERSION.SDK_INT <= 22) {
            if (zM52601) {
                if (i7 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                }
                viewM40395.measure(iMakeMeasureSpec, i3);
                measuredHeight2 = viewM40395.getMeasuredHeight();
            }
            this.f75784.setWidth(i7 + i);
            int identifier = abstractActivityC17204.getResources().getIdentifier("status_bar_height", "dimen", "android");
            this.f75784.setHeight(Math.min(measuredHeight2 + i11, (abstractActivityC17204.getWindow().getDecorView().getHeight() - (identifier > 0 ? abstractActivityC17204.getResources().getDimensionPixelSize(identifier) : 0)) - i11));
        }
        this.f75784.setOutsideTouchable(true);
        this.f75784.setFocusable(true);
        this.f75784.setInputMethodMode(2);
        ((FrameLayout) abstractActivityC17204.m40418(android.R.id.content)).getChildAt(0).getWindowVisibleDisplayFrame(new Rect());
        View view = this.f75789;
        view.getLocationInWindow(new int[2]);
        this.f75784.showAtLocation(view, 17, 0, 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52608() {
        C17443 c17443;
        AbstractActivityC17204 abstractActivityC17204 = this.f75786;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        LinearLayout linearLayout = (LinearLayout) viewM40395.findViewById(R.id.linearLayout);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f75782;
            if (i >= arrayList.size()) {
                break;
            }
            int i2 = i + 1;
            C17443 c17444 = (C17443) arrayList.get(i);
            if (i2 != arrayList.size()) {
                i += 2;
                c17443 = (C17443) arrayList.get(i2);
            } else {
                c17443 = null;
                i = i2;
            }
            View viewInflate = this.f75783.inflate(R.layout.MT_Protector, (ViewGroup) linearLayout, false);
            View viewFindViewById = viewInflate.findViewById(R.id.MT_Protector);
            View viewFindViewById2 = viewInflate.findViewById(R.id.MT_Protector);
            m52599(viewFindViewById, c17444);
            m52599(viewFindViewById2, c17443);
            linearLayout.addView(viewInflate);
        }
        if (m52601()) {
            m52598(viewM40395);
        }
        int i3 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        this.f75781 = c2361.m8016();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m52607() {
        AbstractActivityC17204 abstractActivityC17204 = this.f75786;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        ViewGroup.LayoutParams layoutParams = viewM40395.getLayoutParams();
        layoutParams.width = -1;
        viewM40395.setLayoutParams(layoutParams);
        View viewFindViewById = viewM40395.findViewById(R.id.MT_Protector);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
        layoutParams2.width = 0;
        viewFindViewById.setLayoutParams(layoutParams2);
        LinearLayout linearLayout = (LinearLayout) viewM40395.findViewById(R.id.linearLayout);
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        layoutParams3.width = -1;
        linearLayout.setLayoutParams(layoutParams3);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f75782;
            if (i >= arrayList.size()) {
                break;
            }
            int i2 = i + 1;
            C17443 c17443 = (C17443) arrayList.get(i);
            View viewInflate = this.f75783.inflate(R.layout.MT_Protector, (ViewGroup) linearLayout, false);
            m52599(viewInflate, c17443);
            linearLayout.addView(viewInflate);
            i = i2;
        }
        if (m52601()) {
            m52598(viewM40395);
        }
        int i3 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        this.f75781 = c2361.m8016();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        C17359.requireNonNull(tag);
        C17443 c17443 = (C17443) tag;
        if (c17443.f56733) {
            InterfaceC15951 interfaceC15951 = this.f75787;
            if (interfaceC15951 != null) {
                interfaceC15951.mo38065(c17443.f56734);
            }
            C10247 c10247 = this.f75784;
            if (c10247 != null) {
                c10247.dismiss();
                this.f75784 = null;
            }
            DialogInterfaceC8327 dialogInterfaceC8327 = this.f75781;
            if (dialogInterfaceC8327 != null) {
                dialogInterfaceC8327.dismiss();
                this.f75781 = null;
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C16818 c16818;
        Object tag = view.getTag();
        C17359.requireNonNull(tag);
        C17443 c17443 = (C17443) tag;
        if (!c17443.f56737 || (c16818 = this.f75788) == null) {
            return false;
        }
        if (!C8614.m23157(c16818.f54260, c16818.f54262, c16818.f54261, c16818.f54263, c17443.f56734)) {
            return false;
        }
        C10247 c10247 = this.f75784;
        if (c10247 != null) {
            c10247.dismiss();
            this.f75784 = null;
        }
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f75781;
        if (dialogInterfaceC8327 == null) {
            return true;
        }
        dialogInterfaceC8327.dismiss();
        this.f75781 = null;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52603(int i, int i2) {
        this.f75782.add(new C17443(this.f75786.getString(i), i2, 0, true, false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52604(String str, int i, int i2, boolean z, boolean z2) {
        this.f75782.add(new C17443(str, i, i2, z, z2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52605(InterfaceC15951 interfaceC15951) {
        this.f75787 = interfaceC15951;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52606(C16818 c16818) {
        this.f75788 = c16818;
    }
}
