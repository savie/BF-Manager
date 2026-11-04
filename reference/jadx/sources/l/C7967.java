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

/* JADX INFO: renamed from: l.۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes4.dex */
public class C7967 extends C10993 implements InterfaceC1168 {

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final C24376 f26467;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f26468;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ImageView f26469;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int[] f26470;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f26471;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f26472;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final View f26473;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public CharSequence f26474;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final CharSequence f26475;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f26476;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f26477;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f26478;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f26479;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int[] f26480;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public Rect f26481;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Runnable f26482;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f26483;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public Rect f26484;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f26485;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f26486;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f26487;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ImageView f26488;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View f26489;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C18408 f26490;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f26491;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final View f26492;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final View f26493;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public C0509 f26494;

    static {
        f26467 = Build.VERSION.SDK_INT < 29 ? new C24376() : null;
    }

    public C7967(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C7967(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26484 = new Rect();
        this.f26481 = new Rect();
        this.f26470 = new int[2];
        this.f26480 = new int[2];
        this.f26486 = new RunnableC11695(this);
        this.f26482 = new RunnableC25122(this);
        new WeakHashMap();
        ViewOnClickListenerC16170 viewOnClickListenerC16170 = new ViewOnClickListenerC16170(this);
        ViewOnKeyListenerC23630 viewOnKeyListenerC23630 = new ViewOnKeyListenerC23630(this);
        C3492 c3492 = new C3492(this);
        C20646 c20646 = new C20646(this);
        C12441 c12441 = new C12441(this);
        C2001 c2001 = new C2001(this);
        int[] iArr = C10401.f33080;
        C5204 c5204M15649 = C5204.m15649(context, attributeSet, iArr, i, 0);
        C22666.m51088(this, context, iArr, attributeSet, c5204M15649.m15658(), i);
        LayoutInflater.from(context).inflate(c5204M15649.m15660(19, R.layout.MT_Protector), (ViewGroup) this, true);
        C18408 c18408 = (C18408) findViewById(R.id.MT_Protector);
        this.f26490 = c18408;
        c18408.m42919(this);
        this.f26492 = findViewById(R.id.MT_Protector);
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f26493 = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f26473 = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f26472 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f26469 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.MT_Protector);
        this.f26491 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.MT_Protector);
        this.f26485 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.MT_Protector);
        this.f26488 = imageView5;
        viewFindViewById.setBackground(c5204M15649.m15669(20));
        viewFindViewById2.setBackground(c5204M15649.m15669(25));
        imageView.setImageDrawable(c5204M15649.m15669(23));
        imageView2.setImageDrawable(c5204M15649.m15669(15));
        imageView3.setImageDrawable(c5204M15649.m15669(12));
        imageView4.setImageDrawable(c5204M15649.m15669(28));
        imageView5.setImageDrawable(c5204M15649.m15669(23));
        this.f26479 = c5204M15649.m15669(22);
        C6696.m18717(imageView, getResources().getString(R.string.MT_Protector));
        c5204M15649.m15660(26, R.layout.MT_Protector);
        c5204M15649.m15660(13, 0);
        imageView.setOnClickListener(viewOnClickListenerC16170);
        imageView3.setOnClickListener(viewOnClickListenerC16170);
        imageView2.setOnClickListener(viewOnClickListenerC16170);
        imageView4.setOnClickListener(viewOnClickListenerC16170);
        c18408.setOnClickListener(viewOnClickListenerC16170);
        c18408.addTextChangedListener(c2001);
        c18408.setOnEditorActionListener(c3492);
        c18408.setOnItemClickListener(c20646);
        c18408.setOnItemSelectedListener(c12441);
        c18408.setOnKeyListener(viewOnKeyListenerC23630);
        c18408.setOnFocusChangeListener(new ViewOnFocusChangeListenerC16916(this));
        boolean zM15654 = c5204M15649.m15654(18, true);
        if (this.f26471 != zM15654) {
            this.f26471 = zM15654;
            m21681(zM15654);
            m21682();
        }
        int iM15665 = c5204M15649.m15665(2, -1);
        if (iM15665 != -1) {
            this.f26476 = iM15665;
            requestLayout();
        }
        this.f26475 = c5204M15649.m15659(14);
        this.f26474 = c5204M15649.m15659(21);
        int iM15657 = c5204M15649.m15657(6, -1);
        if (iM15657 != -1) {
            c18408.setImeOptions(iM15657);
        }
        int iM15658 = c5204M15649.m15657(5, -1);
        if (iM15658 != -1) {
            c18408.setInputType(iM15658);
        }
        setFocusable(c5204M15649.m15654(1, true));
        c5204M15649.m15664();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        new Intent("android.speech.action.RECOGNIZE_SPEECH").addFlags(268435456);
        View viewFindViewById3 = findViewById(c18408.getDropDownAnchor());
        this.f26489 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC17662(this));
        }
        m21681(this.f26471);
        m21682();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f26483 || !isFocusable()) {
            return false;
        }
        if (!this.f26477) {
            boolean zRequestFocus = this.f26490.requestFocus(i, rect);
            if (zRequestFocus) {
                m21681(false);
            }
            return zRequestFocus;
        }
        return super.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f26483 = true;
        super.clearFocus();
        C18408 c18408 = this.f26490;
        c18408.clearFocus();
        c18408.m42920(false);
        this.f26483 = false;
    }

    @Override // l.InterfaceC1168
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4308() {
        C18408 c18408 = this.f26490;
        c18408.setText("");
        c18408.setSelection(c18408.length());
        this.f26487 = "";
        clearFocus();
        m21681(true);
        c18408.setImeOptions(this.f26468);
        this.f26478 = false;
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m21682() {
        Drawable drawable;
        CharSequence charSequence;
        CharSequence charSequence2 = this.f26474;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence = this.f26475;
        }
        if (charSequence3 == null) {
            charSequence3 = charSequence;
            charSequence3 = "";
        }
        charSequence3 = charSequence;
        boolean z = this.f26471;
        C18408 c18408 = this.f26490;
        CharSequence charSequence4 = charSequence3;
        if (z && (drawable = this.f26479) != null) {
            charSequence4 = charSequence3;
            int textSize = (int) (((double) c18408.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence3);
            charSequence4 = spannableStringBuilder;
        }
        charSequence4 = charSequence3;
        c18408.setHint(charSequence4);
    }

    @Override // l.C10993, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f26477) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f26476;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getContext().getResources().getDimensionPixelSize(R.dimen.MT_Protector), size);
        } else if (mode == 0) {
            size = this.f26476;
            if (size <= 0) {
                size = getContext().getResources().getDimensionPixelSize(R.dimen.MT_Protector);
            }
        } else if (mode == 1073741824 && (i3 = this.f26476) > 0) {
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

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m21686() {
        m21681(this.f26477);
        post(this.f26486);
        C18408 c18408 = this.f26490;
        if (c18408.hasFocus()) {
            if (Build.VERSION.SDK_INT >= 29) {
                C6476.m18297(c18408);
                return;
            }
            C24376 c24376 = f26467;
            c24376.m54496(c18408);
            c24376.m54494((AutoCompleteTextView) c18408);
        }
    }

    @Override // l.C10993, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            C18408 c18408 = this.f26490;
            int[] iArr = this.f26470;
            c18408.getLocationInWindow(iArr);
            int[] iArr2 = this.f26480;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = c18408.getWidth() + i6;
            int height = c18408.getHeight() + i5;
            Rect rect = this.f26484;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.f26481;
            rect2.set(i7, 0, i8, i9);
            C0509 c0509 = this.f26494;
            if (c0509 == null) {
                C0509 c05010 = new C0509(c18408, rect2, rect);
                this.f26494 = c05010;
                setTouchDelegate(c05010);
                return;
            }
            c0509.m2476(rect2, rect);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21681(boolean z) {
        this.f26477 = z;
        int i = z ? 0 : 8;
        TextUtils.isEmpty(this.f26490.getText());
        this.f26472.setVisibility(i);
        this.f26469.setVisibility(8);
        this.f26492.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f26488;
        imageView.setVisibility((imageView.getDrawable() == null || this.f26471) ? 8 : 0);
        m21680();
        this.f26485.setVisibility(8);
        this.f26473.setVisibility(8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21680() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f26490.getText());
        int i = (!zIsEmpty || (this.f26471 && !this.f26478)) ? 0 : 8;
        ImageView imageView = this.f26491;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m21684() {
        int[] iArr = this.f26490.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f26493.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f26473.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f26486);
        post(this.f26482);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21683(CharSequence charSequence) {
        Editable text = this.f26490.getText();
        this.f26487 = text;
        TextUtils.isEmpty(text);
        this.f26469.setVisibility(8);
        this.f26485.setVisibility(8);
        m21680();
        this.f26473.setVisibility(8);
        charSequence.toString();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m21687() {
        C18408 c18408 = this.f26490;
        Editable text = c18408.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        c18408.m42920(false);
        c18408.dismissDropDown();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m21689() {
        C18408 c18408 = this.f26490;
        if (TextUtils.isEmpty(c18408.getText())) {
            if (this.f26471) {
                clearFocus();
                m21681(true);
                return;
            }
            return;
        }
        c18408.setText("");
        c18408.requestFocus();
        c18408.m42920(true);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m21688() {
        m21681(false);
        C18408 c18408 = this.f26490;
        c18408.requestFocus();
        c18408.m42920(true);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f26486);
    }

    @Override // l.InterfaceC1168
    /* JADX INFO: renamed from: ۙ */
    public final void mo4307() {
        if (this.f26478) {
            return;
        }
        this.f26478 = true;
        C18408 c18408 = this.f26490;
        int imeOptions = c18408.getImeOptions();
        this.f26468 = imeOptions;
        c18408.setImeOptions(imeOptions | 33554432);
        c18408.setText("");
        m21688();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C14678 c14678 = new C14678(super.onSaveInstanceState());
        c14678.f47982 = this.f26477;
        return c14678;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C14678)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C14678 c14678 = (C14678) parcelable;
        super.onRestoreInstanceState(c14678.getSuperState());
        m21681(c14678.f47982);
        requestLayout();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m21685() {
        int i;
        View view = this.f26489;
        if (view.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f26493.getPaddingLeft();
            Rect rect = new Rect();
            int i2 = C19374.f62602;
            boolean z = getLayoutDirection() == 1;
            int dimensionPixelSize = this.f26471 ? resources.getDimensionPixelSize(R.dimen.MT_Protector) + resources.getDimensionPixelSize(R.dimen.MT_Protector) : 0;
            C18408 c18408 = this.f26490;
            c18408.getDropDownBackground().getPadding(rect);
            if (z) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            c18408.setDropDownHorizontalOffset(i);
            c18408.setDropDownWidth((((view.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
