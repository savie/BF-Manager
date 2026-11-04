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

/* JADX INFO: renamed from: l.᩵۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27KL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20592 extends AbstractC22830 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f65919 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ViewGroup f65920;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f65921;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C4089 f65922;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public ImageView f65923;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f65924;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f65925;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C4089 f65926;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public float f65927;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C20592(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C15243.m36590(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20592(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C15243.m36590(context, d.R);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f65925 = linearLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i2 = (int) (getContext().getResources().getDisplayMetrics().density * 24);
        setPadding(i2, 0, i2, 0);
        setClipToPadding(false);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        addView(linearLayout);
        float fM51485 = m51485(2.0f);
        this.f65927 = fM51485;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        int i3 = typedValue.data;
        this.f65924 = i3;
        this.f65921 = i3;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C14163.f44788);
            C15243.m36591(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int color = typedArrayObtainStyledAttributes.getColor(1, i3);
            this.f65924 = color;
            this.f65921 = typedArrayObtainStyledAttributes.getColor(5, color);
            this.f65927 = typedArrayObtainStyledAttributes.getDimension(6, fM51485);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            m51486(0, 5);
            addView(m47179(false));
        }
        InterfaceC22084 interfaceC22084M51490 = m51490();
        if (interfaceC22084M51490 == null || !((C4184) interfaceC22084M51490).m13365()) {
            View view = this.f65923;
            if (view != null && indexOfChild(view) != -1) {
                removeView(this.f65923);
            }
            ViewGroup viewGroupM47179 = m47179(false);
            this.f65920 = viewGroupM47179;
            this.f65923 = (ImageView) viewGroupM47179.findViewById(R.id.MT_Protector);
            addView(this.f65920);
            this.f65926 = new C4089(this.f65920, AbstractC12292.f39512);
            C14529 c14529 = new C14529(0.0f);
            c14529.m35071(1.0f);
            c14529.m35073(300.0f);
            C4089 c4089 = this.f65926;
            C15243.m36586(c4089);
            c4089.m13165(c14529);
            this.f65922 = new C4089(this.f65920, new C3438(this));
            C14529 c145210 = new C14529(0.0f);
            c145210.m35071(1.0f);
            c145210.m35073(300.0f);
            C4089 c40810 = this.f65922;
            C15243.m36586(c40810);
            c40810.m13165(c145210);
        }
    }

    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ۙ */
    public final void mo16692(final int i) {
        ViewGroup viewGroupM47179 = m47179(true);
        viewGroupM47179.setOnClickListener(new View.OnClickListener() { // from class: l.ܶ۬ܶ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C20592.f65919;
                C20592 c20592 = this.f52202;
                if (c20592.m51493()) {
                    InterfaceC22084 interfaceC22084M51490 = c20592.m51490();
                    int iM13362 = interfaceC22084M51490 != null ? ((C4184) interfaceC22084M51490).m13362() : 0;
                    int i3 = i;
                    if (i3 < iM13362) {
                        InterfaceC22084 interfaceC22084M51491 = c20592.m51490();
                        C15243.m36586(interfaceC22084M51491);
                        ((C4184) interfaceC22084M51491).m13363(i3);
                    }
                }
            }
        });
        View viewFindViewById = viewGroupM47179.findViewById(R.id.MT_Protector);
        C15243.m36587((Object) viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f73998.add((ImageView) viewFindViewById);
        this.f65925.addView(viewGroupM47179);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final ViewGroup m47179(boolean z) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        C15243.m36587((Object) viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        viewGroup.setLayoutDirection(0);
        View viewFindViewById = viewGroup.findViewById(R.id.MT_Protector);
        viewFindViewById.setBackgroundResource(z ? R.drawable.MT_Protector : R.drawable.MT_Protector);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        C15243.m36587((Object) layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int iM51492 = (int) m51492();
        layoutParams2.height = iM51492;
        layoutParams2.width = iM51492;
        layoutParams2.addRule(15, -1);
        layoutParams2.setMargins((int) m51491(), 0, (int) m51491(), 0);
        m47181(viewFindViewById, z);
        return viewGroup;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m47181(View view, boolean z) {
        Drawable background = view.getBackground();
        C15243.m36587((Object) background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (z) {
            gradientDrawable.setStroke((int) this.f65927, this.f65921);
        } else {
            gradientDrawable.setColor(this.f65924);
        }
        gradientDrawable.setCornerRadius(m51494());
    }

    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16695(int i) {
        Object obj = this.f73998.get(i);
        C15243.m36591(obj, "get(...)");
        m47181((View) obj, true);
    }

    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ᩻ */
    public final void mo16696() {
        LinearLayout linearLayout = this.f65925;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        C2764.m9138(this.f73998, 1);
    }

    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11641 mo16691() {
        return new C23576(this);
    }

    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ۚ */
    public final EnumC10895 mo16693() {
        return EnumC10895.WORM;
    }
}
