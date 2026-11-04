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

/* JADX INFO: renamed from: l.᩸۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7JV */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22830 extends FrameLayout {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73994 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f73995;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f73996;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C4184 f73997;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73998;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f73999;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f74000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f74001;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC11641 mo16691();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo16692(int i);

    /* JADX INFO: renamed from: ۚ */
    public abstract EnumC10895 mo16693();

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo16695(int i);

    /* JADX INFO: renamed from: ᩻ */
    public abstract void mo16696();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC22830(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C15243.m36590(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC22830(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C15243.m36590(context, d.R);
        this.f73998 = new ArrayList();
        this.f74001 = true;
        this.f73999 = -16711681;
        float fM51485 = m51485(mo16693().m27646());
        this.f73996 = fM51485;
        float f = fM51485 / 2.0f;
        this.f73995 = f;
        float fM51486 = m51485(mo16693().m27651());
        this.f74000 = fM51486;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mo16693().m27649(), 0, 0);
            this.f73999 = typedArrayObtainStyledAttributes.getColor(mo16693().m27648(), -16711681);
            m51489();
            this.f73996 = typedArrayObtainStyledAttributes.getDimension(mo16693().m27647(), fM51485);
            this.f73995 = typedArrayObtainStyledAttributes.getDimension(mo16693().m27645(), f);
            this.f74000 = typedArrayObtainStyledAttributes.getDimension(mo16693().m27652(), fM51486);
            this.f74001 = typedArrayObtainStyledAttributes.getBoolean(mo16693().m27650(), true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m51493() {
        return this.f74001;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m51488() {
        return this.f73999;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float m51492() {
        return this.f73996;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float m51494() {
        return this.f73995;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m51491() {
        return this.f74000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51487(C4184 c4184) {
        this.f73997 = c4184;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC22084 m51490() {
        return this.f73997;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new RunnableC15052(6, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51483(AbstractC22830 abstractC22830) {
        C4184 c4184 = abstractC22830.f73997;
        C15243.m36586(c4184);
        int iM13362 = c4184.m13362();
        ArrayList arrayList = abstractC22830.f73998;
        if (arrayList.size() < iM13362) {
            abstractC22830.m51486(arrayList.size(), iM13362 - arrayList.size());
        } else if (arrayList.size() > iM13362) {
            int size = arrayList.size() - iM13362;
            for (int i = 0; i < size; i++) {
                abstractC22830.mo16696();
            }
        }
        abstractC22830.m51489();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1947.m6728((int) abstractC22830.f73996, (ImageView) it.next());
        }
        C4184 c4185 = abstractC22830.f73997;
        C15243.m36586(c4185);
        if (c4185.m13368()) {
            C4184 c4186 = abstractC22830.f73997;
            C15243.m36586(c4186);
            c4186.m13366();
            AbstractC11641 abstractC11641Mo16691 = abstractC22830.mo16691();
            C4184 c4187 = abstractC22830.f73997;
            C15243.m36586(c4187);
            c4187.m13364(abstractC11641Mo16691);
            C4184 c4188 = abstractC22830.f73997;
            C15243.m36586(c4188);
            abstractC11641Mo16691.m29248(0.0f, c4188.m13367());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51489() {
        int size = this.f73998.size();
        for (int i = 0; i < size; i++) {
            mo16695(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m51485(float f) {
        return getContext().getResources().getDisplayMetrics().density * f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51486(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            mo16692(i + i3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51484() {
        if (this.f73997 == null) {
            return;
        }
        post(new RunnableC22358(5, this));
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
        post(new RunnableC8143(4, this));
    }
}
