package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import bin.mt.plus.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes5.dex */
public class C20323 extends C4905 implements InterfaceC17005 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final C19618 f65804;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ImageView f65805;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public Rect f65806;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f65807;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final View f65808;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Runnable f65809;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int[] f65810;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f65811;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C21028 f65812;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f65813;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int[] f65814;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public CharSequence f65815;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ImageView f65816;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f65817;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CharSequence f65818;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final View f65819;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final View f65820;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f65821;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f65822;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f65823;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f65824;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final View f65825;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f65826;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f65827;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f65828;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public Rect f65829;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public C16090 f65830;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f65831;

    static {
        f65804 = Build.VERSION.SDK_INT < 29 ? new C19618() : null;
    }

    public C20323(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C20323(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f65829 = new Rect();
        this.f65806 = new Rect();
        this.f65810 = new int[2];
        this.f65814 = new int[2];
        this.f65822 = new RunnableC1272(this);
        this.f65809 = new RunnableC13268(this);
        new WeakHashMap();
        ViewOnClickListenerC23146 viewOnClickListenerC23146 = new ViewOnClickListenerC23146(this);
        ViewOnKeyListenerC15385 viewOnKeyListenerC15385 = new ViewOnKeyListenerC15385(this);
        C21734 c21734 = new C21734(this);
        C18206 c18206 = new C18206(this);
        C18912 c18912 = new C18912(this);
        C22440 c22440 = new C22440(this);
        int[] iArr = C12108.f40535;
        C1977 c1977M6353 = C1977.m6353(context, attributeSet, iArr, i, 0);
        C5031.m13983(this, context, iArr, attributeSet, c1977M6353.m6382(), i);
        LayoutInflater.from(context).inflate(c1977M6353.m6387(19, R.layout.MT_Protector), (ViewGroup) this, true);
        C21028 c21028 = (C21028) findViewById(R.id.MT_Protector);
        this.f65812 = c21028;
        c21028.m47400(this);
        this.f65820 = findViewById(R.id.MT_Protector);
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f65808 = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f65819 = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f65811 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f65816 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.MT_Protector);
        this.f65827 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.MT_Protector);
        this.f65826 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.MT_Protector);
        this.f65805 = imageView5;
        viewFindViewById.setBackground(c1977M6353.m6370(20));
        viewFindViewById2.setBackground(c1977M6353.m6370(25));
        imageView.setImageDrawable(c1977M6353.m6370(23));
        imageView2.setImageDrawable(c1977M6353.m6370(15));
        imageView3.setImageDrawable(c1977M6353.m6370(12));
        imageView4.setImageDrawable(c1977M6353.m6370(28));
        imageView5.setImageDrawable(c1977M6353.m6370(23));
        this.f65817 = c1977M6353.m6370(22);
        C18933.m43611(imageView, getResources().getString(R.string.MT_Protector));
        c1977M6353.m6387(26, R.layout.MT_Protector);
        c1977M6353.m6387(13, 0);
        imageView.setOnClickListener(viewOnClickListenerC23146);
        imageView3.setOnClickListener(viewOnClickListenerC23146);
        imageView2.setOnClickListener(viewOnClickListenerC23146);
        imageView4.setOnClickListener(viewOnClickListenerC23146);
        c21028.setOnClickListener(viewOnClickListenerC23146);
        c21028.addTextChangedListener(c22440);
        c21028.setOnEditorActionListener(c21734);
        c21028.setOnItemClickListener(c18206);
        c21028.setOnItemSelectedListener(c18912);
        c21028.setOnKeyListener(viewOnKeyListenerC15385);
        c21028.setOnFocusChangeListener(new ViewOnFocusChangeListenerC4094(this));
        boolean zM6376 = c1977M6353.m6376(18, true);
        if (this.f65821 != zM6376) {
            this.f65821 = zM6376;
            m45864(zM6376);
            m45865();
        }
        int iM6384 = c1977M6353.m6384(2, -1);
        if (iM6384 != -1) {
            this.f65807 = iM6384;
            requestLayout();
        }
        this.f65818 = c1977M6353.m6368(14);
        this.f65815 = c1977M6353.m6368(21);
        int iM6381 = c1977M6353.m6381(6, -1);
        if (iM6381 != -1) {
            c21028.setImeOptions(iM6381);
        }
        int iM6382 = c1977M6353.m6381(5, -1);
        if (iM6382 != -1) {
            c21028.setInputType(iM6382);
        }
        setFocusable(c1977M6353.m6376(1, true));
        c1977M6353.m6379();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        new Intent("android.speech.action.RECOGNIZE_SPEECH").addFlags(268435456);
        View viewFindViewById3 = findViewById(c21028.getDropDownAnchor());
        this.f65825 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC6917(this));
        }
        m45864(this.f65821);
        m45865();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f65823 || !isFocusable()) {
            return false;
        }
        if (!this.f65831) {
            boolean zRequestFocus = this.f65812.requestFocus(i, rect);
            if (zRequestFocus) {
                m45864(false);
            }
            return zRequestFocus;
        }
        return super.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f65823 = true;
        super.clearFocus();
        C21028 c21028 = this.f65812;
        c21028.clearFocus();
        c21028.m47401(false);
        this.f65823 = false;
    }

    @Override // l.InterfaceC17005
    /* JADX INFO: renamed from: ܰ */
    public final void mo5985() {
        C21028 c21028 = this.f65812;
        c21028.setText("");
        c21028.setSelection(c21028.length());
        this.f65828 = "";
        clearFocus();
        m45864(true);
        c21028.setImeOptions(this.f65824);
        this.f65813 = false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m45865() {
        Drawable drawable;
        CharSequence charSequence;
        CharSequence charSequence2 = this.f65815;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence = this.f65818;
        }
        if (charSequence3 == null) {
            charSequence3 = charSequence;
            charSequence3 = "";
        }
        charSequence3 = charSequence;
        boolean z = this.f65821;
        C21028 c21028 = this.f65812;
        CharSequence charSequence4 = charSequence3;
        if (z && (drawable = this.f65817) != null) {
            charSequence4 = charSequence3;
            int textSize = (int) (((double) c21028.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence3);
            charSequence4 = spannableStringBuilder;
        }
        charSequence4 = charSequence3;
        c21028.setHint(charSequence4);
    }

    @Override // l.C4905, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f65831) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f65807;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getContext().getResources().getDimensionPixelSize(R.dimen.MT_Protector), size);
        } else if (mode == 0) {
            size = this.f65807;
            if (size <= 0) {
                size = getContext().getResources().getDimensionPixelSize(R.dimen.MT_Protector);
            }
        } else if (mode == 1073741824 && (i3 = this.f65807) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getContext().getResources().getDimensionPixelSize(R.dimen.MT_Protector), size2);
        } else if (mode2 == 0) {
            size2 = getContext().getResources().getDimensionPixelSize(R.dimen.MT_Protector);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m45866() {
        m45864(this.f65831);
        post(this.f65822);
        C21028 c21028 = this.f65812;
        if (c21028.hasFocus()) {
            if (Build.VERSION.SDK_INT >= 29) {
                C8329.m21749(c21028);
                return;
            }
            C19618 c19618 = f65804;
            c19618.m44714(c21028);
            c19618.m44712((AutoCompleteTextView) c21028);
        }
    }

    @Override // l.C4905, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            C21028 c21028 = this.f65812;
            int[] iArr = this.f65810;
            c21028.getLocationInWindow(iArr);
            int[] iArr2 = this.f65814;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = c21028.getWidth() + i6;
            int height = c21028.getHeight() + i5;
            Rect rect = this.f65829;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.f65806;
            rect2.set(i7, 0, i8, i9);
            C16090 c16090 = this.f65830;
            if (c16090 == null) {
                C16090 c16091 = new C16090(c21028, rect2, rect);
                this.f65830 = c16091;
                setTouchDelegate(c16091);
                return;
            }
            c16090.m38117(rect2, rect);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45864(boolean z) {
        this.f65831 = z;
        int i = z ? 0 : 8;
        TextUtils.isEmpty(this.f65812.getText());
        this.f65811.setVisibility(i);
        this.f65816.setVisibility(8);
        this.f65820.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f65805;
        imageView.setVisibility((imageView.getDrawable() == null || this.f65821) ? 8 : 0);
        m45863();
        this.f65826.setVisibility(8);
        this.f65819.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m45863() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f65812.getText());
        int i = (!zIsEmpty || (this.f65821 && !this.f65813)) ? 0 : 8;
        ImageView imageView = this.f65827;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m45871() {
        int[] iArr = this.f65812.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f65808.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f65819.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f65822);
        post(this.f65809);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45868(CharSequence charSequence) {
        Editable text = this.f65812.getText();
        this.f65828 = text;
        TextUtils.isEmpty(text);
        this.f65816.setVisibility(8);
        this.f65826.setVisibility(8);
        m45863();
        this.f65819.setVisibility(8);
        charSequence.toString();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m45872() {
        C21028 c21028 = this.f65812;
        Editable text = c21028.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        c21028.m47401(false);
        c21028.dismissDropDown();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m45867() {
        C21028 c21028 = this.f65812;
        if (TextUtils.isEmpty(c21028.getText())) {
            if (this.f65821) {
                clearFocus();
                m45864(true);
                return;
            }
            return;
        }
        c21028.setText("");
        c21028.requestFocus();
        c21028.m47401(true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m45869() {
        m45864(false);
        C21028 c21028 = this.f65812;
        c21028.requestFocus();
        c21028.m47401(true);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f65822);
    }

    @Override // l.InterfaceC17005
    /* JADX INFO: renamed from: ۙ */
    public final void mo5984() {
        if (this.f65813) {
            return;
        }
        this.f65813 = true;
        C21028 c21028 = this.f65812;
        int imeOptions = c21028.getImeOptions();
        this.f65824 = imeOptions;
        c21028.setImeOptions(imeOptions | 33554432);
        c21028.setText("");
        m45869();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C10446 c10446 = new C10446(super.onSaveInstanceState());
        c10446.f35671 = this.f65831;
        return c10446;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C10446)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C10446 c10446 = (C10446) parcelable;
        super.onRestoreInstanceState(c10446.getSuperState());
        m45864(c10446.f35671);
        requestLayout();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m45870() {
        int i;
        View view = this.f65825;
        if (view.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f65808.getPaddingLeft();
            Rect rect = new Rect();
            int i2 = C20344.f65886;
            boolean z = getLayoutDirection() == 1;
            int dimensionPixelSize = this.f65821 ? resources.getDimensionPixelSize(R.dimen.MT_Protector) + resources.getDimensionPixelSize(R.dimen.MT_Protector) : 0;
            C21028 c21028 = this.f65812;
            c21028.getDropDownBackground().getPadding(rect);
            if (z) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            c21028.setDropDownHorizontalOffset(i);
            c21028.setDropDownWidth((((view.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
