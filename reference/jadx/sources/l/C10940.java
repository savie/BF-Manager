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

/* JADX INFO: renamed from: l.ۧۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7JY */
/* JADX INFO: loaded from: classes4.dex */
public final class C10940 extends AbstractC16584 {

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f37201 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f37202;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f37203;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f37204;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public LinearLayout f37205;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f37206;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArgbEvaluator f37207;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10940(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C13465.m32966(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10940(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13465.m32966(context, d.R);
        this.f37207 = new ArgbEvaluator();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f37205 = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.f37205;
        if (linearLayout2 == null) {
            C13465.m32968("linearLayout");
            throw null;
        }
        addView(linearLayout2, -2, -2);
        this.f37202 = 2.5f;
        if (attributeSet != null) {
            Context context2 = getContext();
            C13465.m32967(context2, "getContext(...)");
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C21963.f71260, 0, 0);
            this.f37204 = typedArrayObtainStyledAttributes.getColor(8, -16711681);
            m39019();
            float f = typedArrayObtainStyledAttributes.getFloat(6, 2.5f);
            this.f37202 = f;
            if (f < 1.0f) {
                this.f37202 = 1.0f;
            }
            this.f37203 = typedArrayObtainStyledAttributes.getBoolean(7, false);
            this.f37206 = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            m39016(0, 5);
            m39014();
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m27459() {
        return this.f37204;
    }

    @Override // l.AbstractC16584
    /* JADX INFO: renamed from: ۙ */
    public final void mo7257(final int i) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.MT_Protector);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        C13465.m32963((Object) layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        viewInflate.setLayoutDirection(0);
        int iM39018 = (int) m39018();
        layoutParams2.height = iM39018;
        layoutParams2.width = iM39018;
        layoutParams2.setMargins((int) m39022(), 0, (int) m39022(), 0);
        C12351 c12351 = new C12351();
        c12351.setCornerRadius(m39013());
        if (isInEditMode()) {
            c12351.setColor(i == 0 ? this.f37204 : m39020());
        } else {
            InterfaceC20112 interfaceC20112M39012 = m39012();
            C13465.m32962(interfaceC20112M39012);
            c12351.setColor(((C3799) interfaceC20112M39012).m11089() == i ? this.f37204 : m39020());
        }
        imageView.setBackground(c12351);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.ܿۤᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C10940.f37201;
                C10940 c10940 = this.f55049;
                if (c10940.m39021()) {
                    InterfaceC20112 interfaceC20112M39013 = c10940.m39012();
                    int iM11084 = interfaceC20112M39013 != null ? ((C3799) interfaceC20112M39013).m11084() : 0;
                    int i3 = i;
                    if (i3 < iM11084) {
                        InterfaceC20112 interfaceC20112M39014 = c10940.m39012();
                        C13465.m32962(interfaceC20112M39014);
                        ((C3799) interfaceC20112M39014).m11085(i3);
                    }
                }
            }
        });
        int i2 = (int) (this.f37206 * 0.8f);
        viewInflate.setPadding(i2, viewInflate.getPaddingTop(), i2, viewInflate.getPaddingBottom());
        int i3 = (int) (this.f37206 * 2);
        viewInflate.setPadding(viewInflate.getPaddingLeft(), i3, viewInflate.getPaddingRight(), i3);
        this.f53230.add(imageView);
        LinearLayout linearLayout = this.f37205;
        if (linearLayout != null) {
            linearLayout.addView(viewInflate);
        } else {
            C13465.m32968("linearLayout");
            throw null;
        }
    }

    @Override // l.AbstractC16584
    /* JADX INFO: renamed from: ᩺ */
    public final void mo7260() {
        LinearLayout linearLayout = this.f37205;
        if (linearLayout == null) {
            C13465.m32968("linearLayout");
            throw null;
        }
        if (linearLayout == null) {
            C13465.m32968("linearLayout");
            throw null;
        }
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        C19028.m43762(this.f53230, 1);
    }

    @Override // l.AbstractC16584
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC14468 mo7256() {
        return new C6000(this);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    @Override // l.AbstractC16584
    /* JADX INFO: renamed from: ܰ */
    public final void mo7259(int i) {
        Object obj = this.f53230.get(i);
        C13465.m32967(obj, "get(...)");
        ImageView imageView = (ImageView) obj;
        Drawable background = imageView.getBackground();
        C12351 c12351 = background instanceof C12351 ? (C12351) background : null;
        if (c12351 != null) {
            InterfaceC20112 interfaceC20112M39012 = m39012();
            C13465.m32962(interfaceC20112M39012);
            if (i == ((C3799) interfaceC20112M39012).m11089()) {
                c12351.setColor(this.f37204);
            } else {
                if (this.f37203) {
                    InterfaceC20112 interfaceC20112M39013 = m39012();
                    C13465.m32962(interfaceC20112M39013);
                    if (i < ((C3799) interfaceC20112M39013).m11089()) {
                        c12351.setColor(this.f37204);
                    }
                }
                c12351.setColor(m39020());
            }
        }
        imageView.setBackground(c12351);
        imageView.invalidate();
    }

    @Override // l.AbstractC16584
    /* JADX INFO: renamed from: ۬ */
    public final EnumC0355 mo7258() {
        return EnumC0355.DEFAULT;
    }
}
