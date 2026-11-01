package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7JV */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16584 extends FrameLayout {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53226 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f53227;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C3799 f53228;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f53229;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53230;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f53231;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f53232;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f53233;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC14468 mo7256();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo7257(int i);

    /* JADX INFO: renamed from: ۬ */
    public abstract EnumC0355 mo7258();

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo7259(int i);

    /* JADX INFO: renamed from: ᩺ */
    public abstract void mo7260();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC16584(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C13465.m32966(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC16584(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13465.m32966(context, d.R);
        this.f53230 = new ArrayList();
        this.f53233 = true;
        this.f53227 = -16711681;
        float fM39015 = m39015(mo7258().m2060());
        this.f53229 = fM39015;
        float f = fM39015 / 2.0f;
        this.f53231 = f;
        float fM39016 = m39015(mo7258().m2063());
        this.f53232 = fM39016;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mo7258().m2064(), 0, 0);
            this.f53227 = typedArrayObtainStyledAttributes.getColor(mo7258().m2058(), -16711681);
            m39019();
            this.f53229 = typedArrayObtainStyledAttributes.getDimension(mo7258().m2062(), fM39015);
            this.f53231 = typedArrayObtainStyledAttributes.getDimension(mo7258().m2059(), f);
            this.f53232 = typedArrayObtainStyledAttributes.getDimension(mo7258().m2065(), fM39016);
            this.f53233 = typedArrayObtainStyledAttributes.getBoolean(mo7258().m2061(), true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m39021() {
        return this.f53233;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m39020() {
        return this.f53227;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float m39018() {
        return this.f53229;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float m39013() {
        return this.f53231;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float m39022() {
        return this.f53232;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC20112 m39012() {
        return this.f53228;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39017(C3799 c3799) {
        this.f53228 = c3799;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new RunnableC20410(5, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39011(AbstractC16584 abstractC16584) {
        C3799 c3799 = abstractC16584.f53228;
        C13465.m32962(c3799);
        int iM11084 = c3799.m11084();
        ArrayList arrayList = abstractC16584.f53230;
        if (arrayList.size() < iM11084) {
            abstractC16584.m39016(arrayList.size(), iM11084 - arrayList.size());
        } else if (arrayList.size() > iM11084) {
            int size = arrayList.size() - iM11084;
            for (int i = 0; i < size; i++) {
                abstractC16584.mo7260();
            }
        }
        abstractC16584.m39019();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C23640.m52103((int) abstractC16584.f53229, (ImageView) it.next());
        }
        C3799 c37910 = abstractC16584.f53228;
        C13465.m32962(c37910);
        if (c37910.m11083()) {
            C3799 c37911 = abstractC16584.f53228;
            C13465.m32962(c37911);
            c37911.m11087();
            AbstractC14468 abstractC14468Mo7256 = abstractC16584.mo7256();
            C3799 c37912 = abstractC16584.f53228;
            C13465.m32962(c37912);
            c37912.m11086(abstractC14468Mo7256);
            C3799 c37913 = abstractC16584.f53228;
            C13465.m32962(c37913);
            abstractC14468Mo7256.m34870(0.0f, c37913.m11089());
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m39019() {
        int size = this.f53230.size();
        for (int i = 0; i < size; i++) {
            mo7259(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m39015(float f) {
        return getContext().getResources().getDisplayMetrics().density * f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39016(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            mo7257(i + i3);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m39014() {
        if (this.f53228 == null) {
            return;
        }
        post(new RunnableC7856(7, this));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getLayoutDirection() == 1) {
            setLayoutDirection(0);
            setRotation(180.0f);
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        post(new RunnableC17794(8, this));
    }
}
