package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes2.dex */
public class C1439 extends LinearLayout {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f5892 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f5893;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View f5894;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C21195 f5895;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public CharSequence f5896;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ImageView f5897;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f5898;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC5673 f5899;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ImageView f5900;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f5901;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f5902;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public SparseArray f5903;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f5904;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f5905;

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    public C1439(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1439(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5896 = "";
        this.f5893 = false;
        this.f5902 = true;
        setOrientation(0);
        setGravity(16);
        LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f5900 = imageView;
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f5894 = viewFindViewById;
        this.f5897 = (ImageView) findViewById(R.id.MT_Protector);
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f5904 = imageView2;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.hint, android.R.attr.text});
        CharSequence text = typedArrayObtainStyledAttributes.getText(0);
        if (text != null) {
            this.f5898 = text.toString();
        }
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(1);
        if (text2 != null) {
            this.f5896 = TextUtils.stringOrSpannedString(text2);
            this.f5902 = text2.length() == 0;
        }
        typedArrayObtainStyledAttributes.recycle();
        imageView.setOnClickListener(new ViewOnClickListenerC14141(0, this));
        imageView2.setOnClickListener(new ViewOnClickListenerC12024(0, this));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.ۢۜ᩺
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1439.m5017(this.f31935);
            }
        });
        m5027();
        if (!this.f5902) {
            m5023();
        }
        m5025();
        m5021(false);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m5023() {
        if (this.f5895 != null) {
            return;
        }
        this.f5905 = true;
        try {
            this.f5895 = (C21195) ((ViewStub) findViewById(R.id.MT_Protector)).inflate();
            m5016();
            this.f5895.m16962(this.f5898);
            m5020();
        } finally {
            this.f5905 = false;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m5020() {
        SparseArray<Parcelable> sparseArray = this.f5903;
        if (sparseArray != null) {
            this.f5895.restoreHierarchyState(sparseArray);
            this.f5903 = null;
        } else {
            this.f5895.mo16989(this.f5896);
            C21195 c21195 = this.f5895;
            c21195.mo17029(c21195.m16842());
        }
        this.f5896 = "";
        m5014();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m5016() {
        this.f5895.setBackground(null);
        this.f5895.m27484(524289);
        this.f5895.m27476(true);
        this.f5895.m27481(3);
        this.f5895.m47653(new C3078(0, this));
        this.f5895.setOnKeyListener(new View.OnKeyListener() { // from class: l.ۙ᩺᩺
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return C1439.m5019(this.f17340, i, keyEvent);
            }
        });
        this.f5895.m16853(new C2850(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m5018(C1439 c1439, int i) {
        InterfaceC5673 interfaceC5673;
        if ((i != 3 && i != 6 && i != 5 && i != 0) || (interfaceC5673 = c1439.f5899) == null) {
            return false;
        }
        interfaceC5673.mo2812(c1439.m5032().toString());
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m5019(C1439 c1439, int i, KeyEvent keyEvent) {
        InterfaceC5673 interfaceC5673;
        if (keyEvent.getAction() != 0 || i != 66 || (interfaceC5673 = c1439.f5899) == null) {
            return false;
        }
        interfaceC5673.mo2812(c1439.m5032().toString());
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5027() {
        ColorStateList colorStateListM38189 = C16135.m38189(getContext().getTheme(), android.R.attr.colorControlNormal);
        int defaultColor = C16135.m38189(getContext().getTheme(), android.R.attr.textColorPrimary).getDefaultColor();
        this.f5900.setImageTintList(colorStateListM38189);
        this.f5897.setImageTintList(colorStateListM38189);
        this.f5904.setImageTintList(colorStateListM38189);
        m5014();
        View view = this.f5894;
        Drawable background = view.getBackground();
        if (background != null) {
            Drawable drawableM20139 = C7603.m20139(background.mutate());
            C7603.m20129(drawableM20139, ColorStateList.valueOf(defaultColor));
            view.setBackground(drawableM20139);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m5014() {
        if (this.f5895 == null) {
            return;
        }
        this.f5895.m27474(C16135.m38189(getContext().getTheme(), android.R.attr.textColorPrimary).getDefaultColor());
        this.f5895.mo16959();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5030(boolean z) {
        this.f5893 = z;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m5035() {
        return this.f5893;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5029(InterfaceC5673 interfaceC5673) {
        this.f5899 = interfaceC5673;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5028(String str) {
        InterfaceC5673 interfaceC5673;
        if (str == null) {
            str = "";
        }
        C21195 c21195 = this.f5895;
        if (c21195 == null) {
            boolean z = (this.f5896.length() == 0 && str.length() == 0) ? false : true;
            this.f5896 = TextUtils.stringOrSpannedString(str);
            this.f5903 = null;
            m5025();
            if (!z || (interfaceC5673 = this.f5899) == null) {
                return;
            }
            interfaceC5673.mo2810(this.f5896.toString());
            return;
        }
        c21195.mo16989((CharSequence) str);
        C21195 c21196 = this.f5895;
        c21196.mo17029(c21196.m17000().length());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CharSequence m5032() {
        C21195 c21195 = this.f5895;
        return c21195 == null ? this.f5896 : c21195.m17000();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m5034(boolean z) {
        boolean z2;
        InterfaceC5673 interfaceC5673;
        m5023();
        boolean z3 = true;
        if (getVisibility() != 0) {
            setVisibility(0);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f5902) {
            this.f5902 = false;
            m5021(true);
        } else {
            z3 = z2;
        }
        if (z3 && (interfaceC5673 = this.f5899) != null) {
            interfaceC5673.mo2811(EnumC22607.EXPANDED);
        }
        C21195 c21195 = this.f5895;
        if (c21195 != null) {
            c21195.requestFocus();
            C21195 c21196 = this.f5895;
            c21196.mo17029(c21196.m17000().length());
        }
        if (z) {
            C16737.m39284(this.f5895);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m5026() {
        if (getVisibility() != 8) {
            clearFocus();
            setVisibility(8);
            InterfaceC5673 interfaceC5673 = this.f5899;
            if (interfaceC5673 != null) {
                interfaceC5673.mo2811(EnumC22607.HIDDEN);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m5033() {
        if (!this.f5893) {
            if (this.f5902) {
                return;
            }
            this.f5902 = true;
            m5021(true);
            clearFocus();
            InterfaceC5673 interfaceC5673 = this.f5899;
            if (interfaceC5673 != null) {
                interfaceC5673.mo2811(EnumC22607.COLLAPSED);
                return;
            }
            return;
        }
        m5026();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m5031() {
        return getVisibility() == 0 && !this.f5902;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f5902 && getVisibility() != 8) {
            int mode = View.MeasureSpec.getMode(i);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.MT_Protector);
            if (mode == Integer.MIN_VALUE) {
                i = View.MeasureSpec.makeMeasureSpec(Math.min(dimensionPixelSize, View.MeasureSpec.getSize(i)), 1073741824);
            } else if (mode == 0) {
                i = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
            }
        }
        super.onMeasure(i, i2);
        if (this.f5902 || getVisibility() == 8) {
            return;
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.MT_Protector);
        int measuredHeight = getMeasuredHeight();
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(Math.max(dimensionPixelSize2, measuredHeight), size);
        } else if (mode2 != 1073741824) {
            size = Math.max(dimensionPixelSize2, measuredHeight);
        }
        if (size != measuredHeight) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f5901 = true;
        super.clearFocus();
        C21195 c21195 = this.f5895;
        if (c21195 != null) {
            c21195.clearFocus();
            this.f5895.m17028();
        }
        this.f5901 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        C21195 c21195;
        if (this.f5901) {
            return false;
        }
        if (this.f5902 || (c21195 = this.f5895) == null || !c21195.requestFocus(i, rect)) {
            return super.requestFocus(i, rect);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5017(C1439 c1439) {
        C21195 c21195 = c1439.f5895;
        if (c21195 == null) {
            return;
        }
        c21195.requestFocus();
        C21195 c21196 = c1439.f5895;
        c21196.mo17029(c21196.m17000().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void m5025() {
        this.f5897.setVisibility(!this.f5902 && m5032().length() == 0 && TextUtils.isEmpty(this.f5898) ? 0 : 8);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m5021(boolean z) {
        this.f5900.setVisibility(this.f5902 ? 0 : 8);
        this.f5894.setVisibility(this.f5902 ? 8 : 0);
        m5025();
        if (z) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        bundle.putCharSequence("query", TextUtils.stringOrSpannedString(m5032()));
        SparseArray<Parcelable> sparseArray = this.f5903;
        if (this.f5895 != null) {
            sparseArray = new SparseArray<>();
            this.f5895.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("editor", sparseArray);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("parent"));
        this.f5896 = bundle.getCharSequence("query", "");
        this.f5903 = bundle.getSparseParcelableArray("editor");
        if (this.f5895 != null) {
            this.f5905 = true;
            try {
                m5020();
                this.f5905 = false;
            } catch (Throwable th) {
                this.f5905 = false;
                throw th;
            }
        } else if (m5031()) {
            m5023();
        }
        m5021(true);
    }
}
