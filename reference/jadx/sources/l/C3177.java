package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۗۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7LE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3177 extends AbstractC16584 {

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f11937 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float f11938;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f11939;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ViewGroup f11940;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f11941;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15909 f11942;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public float f11943;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public float f11944;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f11945;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f11946;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3177(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C13465.m32966(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3177(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13465.m32966(context, d.R);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f11939 = linearLayout;
        float fM39015 = m39015(24.0f);
        setClipToPadding(false);
        int i2 = (int) fM39015;
        setPadding(i2, 0, i2, 0);
        linearLayout.setOrientation(0);
        addView(linearLayout, -2, -2);
        float fM39016 = m39015(2.0f);
        this.f11944 = fM39016;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        int i3 = typedValue.data;
        this.f11945 = i3;
        this.f11941 = i3;
        this.f11943 = 300.0f;
        this.f11946 = 0.5f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21963.f71262);
            C13465.m32967(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int color = typedArrayObtainStyledAttributes.getColor(2, i3);
            this.f11945 = color;
            this.f11941 = typedArrayObtainStyledAttributes.getColor(6, color);
            this.f11943 = typedArrayObtainStyledAttributes.getFloat(8, 300.0f);
            this.f11946 = typedArrayObtainStyledAttributes.getFloat(0, 0.5f);
            this.f11944 = typedArrayObtainStyledAttributes.getDimension(7, fM39016);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f11938 = m39018();
        if (isInEditMode()) {
            m39016(0, 5);
            addView(m9594(false));
        }
        InterfaceC20112 interfaceC20112M39012 = m39012();
        if (interfaceC20112M39012 == null || !((C3799) interfaceC20112M39012).m11088()) {
            View view = this.f11940;
            if (view != null && indexOfChild(view) != -1) {
                removeView(this.f11940);
            }
            ViewGroup viewGroupM9594 = m9594(false);
            this.f11940 = viewGroupM9594;
            addView(viewGroupM9594);
            this.f11942 = new C15909(this.f11940, AbstractC10264.f34990);
            C20142 c20142 = new C20142(0.0f);
            c20142.m45501(this.f11946);
            c20142.m45503(this.f11943);
            C15909 c15909 = this.f11942;
            C13465.m32962(c15909);
            c15909.m37818(c20142);
        }
    }

    @Override // l.AbstractC16584
    /* JADX INFO: renamed from: ۙ */
    public final void mo7257(final int i) {
        ViewGroup viewGroupM9594 = m9594(true);
        viewGroupM9594.setOnClickListener(new View.OnClickListener() { // from class: l.֫ۤᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C3177.f11937;
                C3177 c3177 = this.f6898;
                if (c3177.m39021()) {
                    InterfaceC20112 interfaceC20112M39012 = c3177.m39012();
                    int iM11084 = interfaceC20112M39012 != null ? ((C3799) interfaceC20112M39012).m11084() : 0;
                    int i3 = i;
                    if (i3 < iM11084) {
                        InterfaceC20112 interfaceC20112M39013 = c3177.m39012();
                        C13465.m32962(interfaceC20112M39013);
                        ((C3799) interfaceC20112M39013).m11085(i3);
                    }
                }
            }
        });
        View viewFindViewById = viewGroupM9594.findViewById(R.id.MT_Protector);
        C13465.m32963((Object) viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f53230.add((ImageView) viewFindViewById);
        this.f11939.addView(viewGroupM9594);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final ViewGroup m9594(boolean z) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        C13465.m32963((Object) viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        viewGroup.setLayoutDirection(0);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.MT_Protector);
        imageView.setBackgroundResource(z ? R.drawable.MT_Protector : R.drawable.MT_Protector);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        C13465.m32963((Object) layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int iM39018 = (int) (z ? m39018() : this.f11938);
        layoutParams2.height = iM39018;
        layoutParams2.width = iM39018;
        layoutParams2.addRule(15, -1);
        layoutParams2.setMargins((int) m39022(), 0, (int) m39022(), 0);
        m9596(imageView, z);
        return viewGroup;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m9596(View view, boolean z) {
        Drawable background = view.findViewById(R.id.MT_Protector).getBackground();
        C13465.m32963((Object) background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (z) {
            gradientDrawable.setStroke((int) this.f11944, this.f11941);
        } else {
            gradientDrawable.setColor(this.f11945);
        }
        gradientDrawable.setCornerRadius(m39013());
    }

    @Override // l.AbstractC16584
    /* JADX INFO: renamed from: ᩺ */
    public final void mo7260() {
        LinearLayout linearLayout = this.f11939;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        C19028.m43762(this.f53230, 1);
    }

    @Override // l.AbstractC16584
    /* JADX INFO: renamed from: ܰ */
    public final void mo7259(int i) {
        Object obj = this.f53230.get(i);
        C13465.m32967(obj, "get(...)");
        m9596((View) obj, true);
    }

    @Override // l.AbstractC16584
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC14468 mo7256() {
        return new C9529(this);
    }

    @Override // l.AbstractC16584
    /* JADX INFO: renamed from: ۬ */
    public final EnumC0355 mo7258() {
        return EnumC0355.SPRING;
    }
}
