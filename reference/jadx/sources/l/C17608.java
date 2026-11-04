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

/* JADX INFO: renamed from: l.ܽ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7LE */
/* JADX INFO: loaded from: classes5.dex */
public final class C17608 extends AbstractC22830 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f57138 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f57139;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f57140;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C4089 f57141;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final float f57142;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f57143;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public float f57144;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ViewGroup f57145;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public float f57146;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f57147;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17608(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C15243.m36590(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17608(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C15243.m36590(context, d.R);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f57147 = linearLayout;
        float fM51485 = m51485(24.0f);
        setClipToPadding(false);
        int i2 = (int) fM51485;
        setPadding(i2, 0, i2, 0);
        linearLayout.setOrientation(0);
        addView(linearLayout, -2, -2);
        float fM51486 = m51485(2.0f);
        this.f57146 = fM51486;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        int i3 = typedValue.data;
        this.f57139 = i3;
        this.f57140 = i3;
        this.f57144 = 300.0f;
        this.f57143 = 0.5f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C14163.f44789);
            C15243.m36591(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int color = typedArrayObtainStyledAttributes.getColor(2, i3);
            this.f57139 = color;
            this.f57140 = typedArrayObtainStyledAttributes.getColor(6, color);
            this.f57144 = typedArrayObtainStyledAttributes.getFloat(8, 300.0f);
            this.f57143 = typedArrayObtainStyledAttributes.getFloat(0, 0.5f);
            this.f57146 = typedArrayObtainStyledAttributes.getDimension(7, fM51486);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f57142 = m51492();
        if (isInEditMode()) {
            m51486(0, 5);
            addView(m41264(false));
        }
        InterfaceC22084 interfaceC22084M51490 = m51490();
        if (interfaceC22084M51490 == null || !((C4184) interfaceC22084M51490).m13365()) {
            View view = this.f57145;
            if (view != null && indexOfChild(view) != -1) {
                removeView(this.f57145);
            }
            ViewGroup viewGroupM41264 = m41264(false);
            this.f57145 = viewGroupM41264;
            addView(viewGroupM41264);
            this.f57141 = new C4089(this.f57145, AbstractC12292.f39512);
            C14529 c14529 = new C14529(0.0f);
            c14529.m35071(this.f57143);
            c14529.m35073(this.f57144);
            C4089 c4089 = this.f57141;
            C15243.m36586(c4089);
            c4089.m13165(c14529);
        }
    }

    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ۙ */
    public final void mo16692(final int i) {
        ViewGroup viewGroupM41264 = m41264(true);
        viewGroupM41264.setOnClickListener(new View.OnClickListener() { // from class: l.᩻۬ܶ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C17608.f57138;
                C17608 c17608 = this.f81085;
                if (c17608.m51493()) {
                    InterfaceC22084 interfaceC22084M51490 = c17608.m51490();
                    int iM13362 = interfaceC22084M51490 != null ? ((C4184) interfaceC22084M51490).m13362() : 0;
                    int i3 = i;
                    if (i3 < iM13362) {
                        InterfaceC22084 interfaceC22084M51491 = c17608.m51490();
                        C15243.m36586(interfaceC22084M51491);
                        ((C4184) interfaceC22084M51491).m13363(i3);
                    }
                }
            }
        });
        View viewFindViewById = viewGroupM41264.findViewById(R.id.MT_Protector);
        C15243.m36587((Object) viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f73998.add((ImageView) viewFindViewById);
        this.f57147.addView(viewGroupM41264);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final ViewGroup m41264(boolean z) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        C15243.m36587((Object) viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        viewGroup.setLayoutDirection(0);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.MT_Protector);
        imageView.setBackgroundResource(z ? R.drawable.MT_Protector : R.drawable.MT_Protector);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        C15243.m36587((Object) layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int iM51492 = (int) (z ? m51492() : this.f57142);
        layoutParams2.height = iM51492;
        layoutParams2.width = iM51492;
        layoutParams2.addRule(15, -1);
        layoutParams2.setMargins((int) m51491(), 0, (int) m51491(), 0);
        m41266(imageView, z);
        return viewGroup;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m41266(View view, boolean z) {
        Drawable background = view.findViewById(R.id.MT_Protector).getBackground();
        C15243.m36587((Object) background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (z) {
            gradientDrawable.setStroke((int) this.f57146, this.f57140);
        } else {
            gradientDrawable.setColor(this.f57139);
        }
        gradientDrawable.setCornerRadius(m51494());
    }

    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ᩻ */
    public final void mo16696() {
        LinearLayout linearLayout = this.f57147;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        C2764.m9138(this.f73998, 1);
    }

    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16695(int i) {
        Object obj = this.f73998.get(i);
        C15243.m36591(obj, "get(...)");
        m41266((View) obj, true);
    }

    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11641 mo16691() {
        return new C16862(this);
    }

    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ۚ */
    public final EnumC10895 mo16693() {
        return EnumC10895.SPRING;
    }
}
