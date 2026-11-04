package l;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۚ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7JY */
/* JADX INFO: loaded from: classes3.dex */
public final class C5676 extends AbstractC22830 {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19580 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f19581;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f19582;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public LinearLayout f19583;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f19584;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArgbEvaluator f19585;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f19586;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5676(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C15243.m36590(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5676(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C15243.m36590(context, d.R);
        this.f19585 = new ArgbEvaluator();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f19583 = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.f19583;
        if (linearLayout2 == null) {
            C15243.m36592("linearLayout");
            throw null;
        }
        addView(linearLayout2, -2, -2);
        this.f19584 = 2.5f;
        if (attributeSet != null) {
            Context context2 = getContext();
            C15243.m36591(context2, "getContext(...)");
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C14163.f44787, 0, 0);
            this.f19582 = typedArrayObtainStyledAttributes.getColor(8, -16711681);
            m51489();
            float f = typedArrayObtainStyledAttributes.getFloat(6, 2.5f);
            this.f19584 = f;
            if (f < 1.0f) {
                this.f19584 = 1.0f;
            }
            this.f19586 = typedArrayObtainStyledAttributes.getBoolean(7, false);
            this.f19581 = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            m51486(0, 5);
            m51484();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m16694() {
        return this.f19582;
    }

    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo16692(final int i) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.MT_Protector);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        C15243.m36587((Object) layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        viewInflate.setLayoutDirection(0);
        int iM51492 = (int) m51492();
        layoutParams2.height = iM51492;
        layoutParams2.width = iM51492;
        layoutParams2.setMargins((int) m51491(), 0, (int) m51491(), 0);
        C19846 c19846 = new C19846();
        c19846.setCornerRadius(m51494());
        if (isInEditMode()) {
            c19846.setColor(i == 0 ? this.f19582 : m51488());
        } else {
            InterfaceC22084 interfaceC22084M51490 = m51490();
            C15243.m36586(interfaceC22084M51490);
            c19846.setColor(((C4184) interfaceC22084M51490).m13367() == i ? this.f19582 : m51488());
        }
        imageView.setBackground(c19846);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.ܳ۬ܶ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C5676.f19580;
                C5676 c5676 = this.f50131;
                if (c5676.m51493()) {
                    InterfaceC22084 interfaceC22084M51491 = c5676.m51490();
                    int iM13362 = interfaceC22084M51491 != null ? ((C4184) interfaceC22084M51491).m13362() : 0;
                    int i3 = i;
                    if (i3 < iM13362) {
                        InterfaceC22084 interfaceC22084M51492 = c5676.m51490();
                        C15243.m36586(interfaceC22084M51492);
                        ((C4184) interfaceC22084M51492).m13363(i3);
                    }
                }
            }
        });
        int i2 = (int) (this.f19581 * 0.8f);
        viewInflate.setPadding(i2, viewInflate.getPaddingTop(), i2, viewInflate.getPaddingBottom());
        int i3 = (int) (this.f19581 * 2);
        viewInflate.setPadding(viewInflate.getPaddingLeft(), i3, viewInflate.getPaddingRight(), i3);
        this.f73998.add(imageView);
        LinearLayout linearLayout = this.f19583;
        if (linearLayout != null) {
            linearLayout.addView(viewInflate);
        } else {
            C15243.m36592("linearLayout");
            throw null;
        }
    }

    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo16696() {
        LinearLayout linearLayout = this.f19583;
        if (linearLayout == null) {
            C15243.m36592("linearLayout");
            throw null;
        }
        if (linearLayout == null) {
            C15243.m36592("linearLayout");
            throw null;
        }
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        C2764.m9138(this.f73998, 1);
    }

    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11641 mo16691() {
        return new C13133(this);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo16695(int i) {
        Object obj = this.f73998.get(i);
        C15243.m36591(obj, "get(...)");
        ImageView imageView = (ImageView) obj;
        Drawable background = imageView.getBackground();
        C19846 c19846 = background instanceof C19846 ? (C19846) background : null;
        if (c19846 != null) {
            InterfaceC22084 interfaceC22084M51490 = m51490();
            C15243.m36586(interfaceC22084M51490);
            if (i == ((C4184) interfaceC22084M51490).m13367()) {
                c19846.setColor(this.f19582);
            } else {
                if (this.f19586) {
                    InterfaceC22084 interfaceC22084M51491 = m51490();
                    C15243.m36586(interfaceC22084M51491);
                    if (i < ((C4184) interfaceC22084M51491).m13367()) {
                        c19846.setColor(this.f19582);
                    }
                }
                c19846.setColor(m51488());
            }
        }
        imageView.setBackground(c19846);
        imageView.invalidate();
    }

    @Override // l.AbstractC22830
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC10895 mo16693() {
        return EnumC10895.DEFAULT;
    }
}
