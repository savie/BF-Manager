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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۖ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27KL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2388 extends AbstractC16584 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f9583 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ImageView f9584;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15909 f9585;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f9586;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15909 f9587;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f9588;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public float f9589;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ViewGroup f9590;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f9591;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2388(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C13465.m32966(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2388(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13465.m32966(context, d.R);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9588 = linearLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i2 = (int) (getContext().getResources().getDisplayMetrics().density * 24);
        setPadding(i2, 0, i2, 0);
        setClipToPadding(false);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        addView(linearLayout);
        float fM39015 = m39015(2.0f);
        this.f9589 = fM39015;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        int i3 = typedValue.data;
        this.f9591 = i3;
        this.f9586 = i3;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21963.f71261);
            C13465.m32967(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int color = typedArrayObtainStyledAttributes.getColor(1, i3);
            this.f9591 = color;
            this.f9586 = typedArrayObtainStyledAttributes.getColor(5, color);
            this.f9589 = typedArrayObtainStyledAttributes.getDimension(6, fM39015);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            m39016(0, 5);
            addView(m7251(false));
        }
        InterfaceC20112 interfaceC20112M39012 = m39012();
        if (interfaceC20112M39012 == null || !((C3799) interfaceC20112M39012).m11088()) {
            View view = this.f9584;
            if (view != null && indexOfChild(view) != -1) {
                removeView(this.f9584);
            }
            ViewGroup viewGroupM7251 = m7251(false);
            this.f9590 = viewGroupM7251;
            this.f9584 = (ImageView) viewGroupM7251.findViewById(R.id.MT_Protector);
            addView(this.f9590);
            this.f9585 = new C15909(this.f9590, AbstractC10264.f34990);
            C20142 c20142 = new C20142(0.0f);
            c20142.m45501(1.0f);
            c20142.m45503(300.0f);
            C15909 c15909 = this.f9585;
            C13465.m32962(c15909);
            c15909.m37818(c20142);
            this.f9587 = new C15909(this.f9590, new C11562(this));
            C20142 c20143 = new C20142(0.0f);
            c20143.m45501(1.0f);
            c20143.m45503(300.0f);
            C15909 c159010 = this.f9587;
            C13465.m32962(c159010);
            c159010.m37818(c20143);
        }
    }

    @Override // l.AbstractC16584
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7257(final int i) {
        ViewGroup viewGroupM7251 = m7251(true);
        viewGroupM7251.setOnClickListener(new View.OnClickListener() { // from class: l.ۙ۟ᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C2388.f9583;
                C2388 c2388 = this.f16013;
                if (c2388.m39021()) {
                    InterfaceC20112 interfaceC20112M39012 = c2388.m39012();
                    int iM11084 = interfaceC20112M39012 != null ? ((C3799) interfaceC20112M39012).m11084() : 0;
                    int i3 = i;
                    if (i3 < iM11084) {
                        InterfaceC20112 interfaceC20112M39013 = c2388.m39012();
                        C13465.m32962(interfaceC20112M39013);
                        ((C3799) interfaceC20112M39013).m11085(i3);
                    }
                }
            }
        });
        View viewFindViewById = viewGroupM7251.findViewById(R.id.MT_Protector);
        C13465.m32963((Object) viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f53230.add((ImageView) viewFindViewById);
        this.f9588.addView(viewGroupM7251);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final ViewGroup m7251(boolean z) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        C13465.m32963((Object) viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        viewGroup.setLayoutDirection(0);
        View viewFindViewById = viewGroup.findViewById(R.id.MT_Protector);
        viewFindViewById.setBackgroundResource(z ? R.drawable.MT_Protector : R.drawable.MT_Protector);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        C13465.m32963((Object) layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int iM39018 = (int) m39018();
        layoutParams2.height = iM39018;
        layoutParams2.width = iM39018;
        layoutParams2.addRule(15, -1);
        layoutParams2.setMargins((int) m39022(), 0, (int) m39022(), 0);
        m7253(viewFindViewById, z);
        return viewGroup;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m7253(View view, boolean z) {
        Drawable background = view.getBackground();
        C13465.m32963((Object) background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (z) {
            gradientDrawable.setStroke((int) this.f9589, this.f9586);
        } else {
            gradientDrawable.setColor(this.f9591);
        }
        gradientDrawable.setCornerRadius(m39013());
    }

    @Override // l.AbstractC16584
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo7259(int i) {
        Object obj = this.f53230.get(i);
        C13465.m32967(obj, "get(...)");
        m7253((View) obj, true);
    }

    @Override // l.AbstractC16584
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void mo7260() {
        LinearLayout linearLayout = this.f9588;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        C19028.m43762(this.f53230, 1);
    }

    @Override // l.AbstractC16584
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14468 mo7256() {
        return new C13679(this);
    }

    @Override // l.AbstractC16584
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC0355 mo7258() {
        return EnumC0355.WORM;
    }
}
