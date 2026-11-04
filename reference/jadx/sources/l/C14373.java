package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4IH */
/* JADX INFO: loaded from: classes5.dex */
public class C14373 extends LinearLayout implements InterfaceC1586, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f45308;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public LayoutInflater f45309;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f45310;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public ImageView f45311;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public TextView f45312;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ImageView f45313;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public RadioButton f45314;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C8407 f45315;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ImageView f45316;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public Context f45317;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Drawable f45318;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Drawable f45319;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public LinearLayout f45320;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f45321;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public CheckBox f45322;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f45323;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public TextView f45324;

    @Override // l.InterfaceC1586
    public final boolean prefersCondensedTitle() {
        return false;
    }

    public C14373(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C14373(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C5204 c5204M15649 = C5204.m15649(getContext(), attributeSet, C10401.f33084, i, 0);
        this.f45319 = c5204M15649.m15669(5);
        this.f45323 = c5204M15649.m15660(1, -1);
        this.f45310 = c5204M15649.m15654(7, false);
        this.f45317 = context;
        this.f45318 = c5204M15649.m15669(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.MT_Protector, 0);
        this.f45321 = typedArrayObtainStyledAttributes.hasValue(0);
        c5204M15649.m15664();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f45319);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f45324 = textView;
        int i = this.f45323;
        if (i != -1) {
            textView.setTextAppearance(this.f45317, i);
        }
        this.f45312 = (TextView) findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f45311 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f45318);
        }
        this.f45313 = (ImageView) findViewById(R.id.MT_Protector);
        this.f45320 = (LinearLayout) findViewById(R.id.MT_Protector);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0105  */
    @Override // l.InterfaceC1586
    public final void initialize(C8407 c8407, int i) {
        CompoundButton compoundButton;
        View view;
        int i2;
        ImageView imageView;
        this.f45315 = c8407;
        setVisibility(c8407.isVisible() ? 0 : 8);
        CharSequence charSequenceM22587 = c8407.m22587(this);
        if (charSequenceM22587 != null) {
            this.f45324.setText(charSequenceM22587);
            if (this.f45324.getVisibility() != 0) {
                this.f45324.setVisibility(0);
            }
        } else if (this.f45324.getVisibility() != 8) {
            this.f45324.setVisibility(8);
        }
        boolean zIsCheckable = c8407.isCheckable();
        if (zIsCheckable || this.f45314 != null || this.f45322 != null) {
            if (this.f45315.m22593()) {
                if (this.f45314 == null) {
                    if (this.f45309 == null) {
                        this.f45309 = LayoutInflater.from(getContext());
                    }
                    RadioButton radioButton = (RadioButton) this.f45309.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
                    this.f45314 = radioButton;
                    LinearLayout linearLayout = this.f45320;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f45314;
                view = this.f45322;
            } else {
                if (this.f45322 == null) {
                    if (this.f45309 == null) {
                        this.f45309 = LayoutInflater.from(getContext());
                    }
                    CheckBox checkBox = (CheckBox) this.f45309.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
                    this.f45322 = checkBox;
                    LinearLayout linearLayout2 = this.f45320;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f45322;
                view = this.f45314;
            }
            if (zIsCheckable) {
                compoundButton.setChecked(this.f45315.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                }
            } else {
                CheckBox checkBox2 = this.f45322;
                if (checkBox2 != null) {
                    checkBox2.setVisibility(8);
                }
                RadioButton radioButton2 = this.f45314;
                if (radioButton2 != null) {
                    radioButton2.setVisibility(8);
                }
            }
        }
        boolean z = true;
        boolean z2 = c8407.f27552.isShortcutsVisible() && c8407.m22597() != 0;
        c8407.m22597();
        if (z2) {
            C8407 c8408 = this.f45315;
            if (!c8408.f27552.isShortcutsVisible() || c8408.m22597() == 0) {
                i2 = 8;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 8;
        }
        if (i2 == 0) {
            this.f45312.setText(this.f45315.m22595());
        }
        if (this.f45312.getVisibility() != i2) {
            this.f45312.setVisibility(i2);
        }
        Drawable icon = c8407.getIcon();
        if (!this.f45315.f27552.getOptionalIconsVisible() && !this.f45308) {
            z = false;
        }
        if ((z || this.f45310) && ((imageView = this.f45316) != null || icon != null || this.f45310)) {
            if (imageView == null) {
                if (this.f45309 == null) {
                    this.f45309 = LayoutInflater.from(getContext());
                }
                ImageView imageView2 = (ImageView) this.f45309.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
                this.f45316 = imageView2;
                LinearLayout linearLayout3 = this.f45320;
                if (linearLayout3 != null) {
                    linearLayout3.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (icon != null || this.f45310) {
                ImageView imageView3 = this.f45316;
                if (!z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f45316.getVisibility() != 0) {
                    this.f45316.setVisibility(0);
                }
            } else {
                this.f45316.setVisibility(8);
            }
        }
        setEnabled(c8407.isEnabled());
        boolean zHasSubMenu = c8407.hasSubMenu();
        ImageView imageView4 = this.f45311;
        if (imageView4 != null) {
            imageView4.setVisibility(zHasSubMenu ? 0 : 8);
        }
        setContentDescription(c8407.getContentDescription());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34812() {
        this.f45308 = true;
        this.f45310 = true;
    }

    @Override // l.InterfaceC1586
    public final C8407 getItemData() {
        return this.f45315;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f45316 != null && this.f45310) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f45316.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34813(boolean z) {
        ImageView imageView = this.f45313;
        if (imageView != null) {
            imageView.setVisibility((this.f45321 || !z) ? 8 : 0);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f45313;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f45313.getLayoutParams();
        rect.top = this.f45313.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }
}
