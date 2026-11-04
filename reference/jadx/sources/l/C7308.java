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

/* JADX INFO: renamed from: l.ۜܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes3.dex */
public class C7308 extends LinearLayout {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f24048 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f24049;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f24050;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ImageView f24051;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ImageView f24052;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC2833 f24053;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final View f24054;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f24055;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public CharSequence f24056;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C17224 f24057;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f24058;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f24059;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public SparseArray f24060;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f24061;

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    public C7308(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7308(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24056 = "";
        this.f24059 = false;
        this.f24049 = true;
        setOrientation(0);
        setGravity(16);
        LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f24051 = imageView;
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f24054 = viewFindViewById;
        this.f24052 = (ImageView) findViewById(R.id.MT_Protector);
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24061 = imageView2;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.hint, android.R.attr.text});
        CharSequence text = typedArrayObtainStyledAttributes.getText(0);
        if (text != null) {
            this.f24050 = text.toString();
        }
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(1);
        if (text2 != null) {
            this.f24056 = TextUtils.stringOrSpannedString(text2);
            this.f24049 = text2.length() == 0;
        }
        typedArrayObtainStyledAttributes.recycle();
        imageView.setOnClickListener(new ViewOnClickListenerC1342(0, this));
        imageView2.setOnClickListener(new ViewOnClickListenerC24974(1, this));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.۟ܿ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7308.m19994(this.f26681);
            }
        });
        m20005();
        if (!this.f24049) {
            m19997();
        }
        m20004();
        m19998(false);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m19997() {
        if (this.f24057 != null) {
            return;
        }
        this.f24055 = true;
        try {
            this.f24057 = (C17224) ((ViewStub) findViewById(R.id.MT_Protector)).inflate();
            m19993();
            this.f24057.m52337(this.f24050);
            m20000();
        } finally {
            this.f24055 = false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20000() {
        SparseArray<Parcelable> sparseArray = this.f24060;
        if (sparseArray != null) {
            this.f24057.restoreHierarchyState(sparseArray);
            this.f24060 = null;
        } else {
            this.f24057.mo52335(this.f24056);
            C17224 c17224 = this.f24057;
            c17224.mo52339(c17224.m54099());
        }
        this.f24056 = "";
        m20001();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19993() {
        this.f24057.setBackground(null);
        this.f24057.m52326(524289);
        this.f24057.m52296(true);
        this.f24057.m52333(3);
        this.f24057.m40458(new C19241(this));
        this.f24057.setOnKeyListener(new View.OnKeyListener() { // from class: l.ۢܿ᩻
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return C7308.m19996(this.f32863, i, keyEvent);
            }
        });
        this.f24057.m53899(new C9544(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m19995(C7308 c7308, int i) {
        InterfaceC2833 interfaceC2833;
        if ((i != 3 && i != 6 && i != 5 && i != 0) || (interfaceC2833 = c7308.f24053) == null) {
            return false;
        }
        interfaceC2833.mo8155(c7308.m20009().toString());
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m19996(C7308 c7308, int i, KeyEvent keyEvent) {
        InterfaceC2833 interfaceC2833;
        if (keyEvent.getAction() != 0 || i != 66 || (interfaceC2833 = c7308.f24053) == null) {
            return false;
        }
        interfaceC2833.mo8155(c7308.m20009().toString());
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20005() {
        ColorStateList colorStateListM52628 = C23434.m52628(getContext().getTheme(), android.R.attr.colorControlNormal);
        int defaultColor = C23434.m52628(getContext().getTheme(), android.R.attr.textColorPrimary).getDefaultColor();
        this.f24051.setImageTintList(colorStateListM52628);
        this.f24052.setImageTintList(colorStateListM52628);
        this.f24061.setImageTintList(colorStateListM52628);
        m20001();
        View view = this.f24054;
        Drawable background = view.getBackground();
        if (background != null) {
            Drawable drawableM2697 = C0597.m2697(background.mutate());
            C0597.m2690(drawableM2697, ColorStateList.valueOf(defaultColor));
            view.setBackground(drawableM2697);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m20001() {
        if (this.f24057 == null) {
            return;
        }
        this.f24057.m52290(C23434.m52628(getContext().getTheme(), android.R.attr.textColorPrimary).getDefaultColor());
        this.f24057.mo40460();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20008(boolean z) {
        this.f24059 = z;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m20010() {
        return this.f24059;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20007(InterfaceC2833 interfaceC2833) {
        this.f24053 = interfaceC2833;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20006(String str) {
        InterfaceC2833 interfaceC2833;
        if (str == null) {
            str = "";
        }
        C17224 c17224 = this.f24057;
        if (c17224 == null) {
            boolean z = (this.f24056.length() == 0 && str.length() == 0) ? false : true;
            this.f24056 = TextUtils.stringOrSpannedString(str);
            this.f24060 = null;
            m20004();
            if (!z || (interfaceC2833 = this.f24053) == null) {
                return;
            }
            interfaceC2833.mo8153(this.f24056.toString());
            return;
        }
        c17224.mo52335((CharSequence) str);
        C17224 c17225 = this.f24057;
        c17225.mo52339(c17225.m54021().length());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence m20009() {
        C17224 c17224 = this.f24057;
        return c17224 == null ? this.f24056 : c17224.m54021();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20013(boolean z) {
        boolean z2;
        InterfaceC2833 interfaceC2833;
        m19997();
        boolean z3 = true;
        if (getVisibility() != 0) {
            setVisibility(0);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f24049) {
            this.f24049 = false;
            m19998(true);
        } else {
            z3 = z2;
        }
        if (z3 && (interfaceC2833 = this.f24053) != null) {
            interfaceC2833.mo8154(EnumC8799.EXPANDED);
        }
        C17224 c17224 = this.f24057;
        if (c17224 != null) {
            c17224.requestFocus();
            C17224 c17225 = this.f24057;
            c17225.mo52339(c17225.m54021().length());
        }
        if (z) {
            C21576.m49076(this.f24057);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m20014() {
        if (getVisibility() != 8) {
            clearFocus();
            setVisibility(8);
            InterfaceC2833 interfaceC2833 = this.f24053;
            if (interfaceC2833 != null) {
                interfaceC2833.mo8154(EnumC8799.HIDDEN);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20012() {
        if (!this.f24059) {
            if (this.f24049) {
                return;
            }
            this.f24049 = true;
            m19998(true);
            clearFocus();
            InterfaceC2833 interfaceC2833 = this.f24053;
            if (interfaceC2833 != null) {
                interfaceC2833.mo8154(EnumC8799.COLLAPSED);
                return;
            }
            return;
        }
        m20014();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m20011() {
        return getVisibility() == 0 && !this.f24049;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f24049 && getVisibility() != 8) {
            int mode = View.MeasureSpec.getMode(i);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.MT_Protector);
            if (mode == Integer.MIN_VALUE) {
                i = View.MeasureSpec.makeMeasureSpec(Math.min(dimensionPixelSize, View.MeasureSpec.getSize(i)), 1073741824);
            } else if (mode == 0) {
                i = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
            }
        }
        super.onMeasure(i, i2);
        if (this.f24049 || getVisibility() == 8) {
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
        this.f24058 = true;
        super.clearFocus();
        C17224 c17224 = this.f24057;
        if (c17224 != null) {
            c17224.clearFocus();
            this.f24057.m54001();
        }
        this.f24058 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        C17224 c17224;
        if (this.f24058) {
            return false;
        }
        if (this.f24049 || (c17224 = this.f24057) == null || !c17224.requestFocus(i, rect)) {
            return super.requestFocus(i, rect);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19994(C7308 c7308) {
        C17224 c17224 = c7308.f24057;
        if (c17224 == null) {
            return;
        }
        c17224.requestFocus();
        C17224 c17225 = c7308.f24057;
        c17225.mo52339(c17225.m54021().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m20004() {
        this.f24052.setVisibility(!this.f24049 && m20009().length() == 0 && TextUtils.isEmpty(this.f24050) ? 0 : 8);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m19998(boolean z) {
        this.f24051.setVisibility(this.f24049 ? 0 : 8);
        this.f24054.setVisibility(this.f24049 ? 8 : 0);
        m20004();
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
        bundle.putCharSequence("query", TextUtils.stringOrSpannedString(m20009()));
        SparseArray<Parcelable> sparseArray = this.f24060;
        if (this.f24057 != null) {
            sparseArray = new SparseArray<>();
            this.f24057.saveHierarchyState(sparseArray);
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
        this.f24056 = bundle.getCharSequence("query", "");
        this.f24060 = bundle.getSparseParcelableArray("editor");
        if (this.f24057 != null) {
            this.f24055 = true;
            try {
                m20000();
                this.f24055 = false;
            } catch (Throwable th) {
                this.f24055 = false;
                throw th;
            }
        } else if (m20011()) {
            m19997();
        }
        m19998(true);
    }
}
