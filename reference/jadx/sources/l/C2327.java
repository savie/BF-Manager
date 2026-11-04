package l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P5CY */
/* JADX INFO: loaded from: classes3.dex */
public class C2327 extends AbstractC21016 {
    @Override // l.AbstractC0329
    public final boolean isSeekingSupported() {
        return true;
    }

    public C2327(int i) {
        setMode(i);
    }

    public C2327(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1821.f6173);
        setMode(C2506.m8386(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // l.AbstractC21016, l.AbstractC0329
    public final void captureStartValues(C22508 c22508) {
        super.captureStartValues(c22508);
        Float fValueOf = (Float) c22508.f72817.getTag(R.id.MT_Protector);
        if (fValueOf == null) {
            if (c22508.f72817.getVisibility() == 0) {
                fValueOf = Float.valueOf(C11319.m28603(c22508.f72817));
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        c22508.f72818.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ObjectAnimator m7835(float f, float f2, View view) {
        if (f == f2) {
            return null;
        }
        C11319.m28605(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) C11319.f35674, f2);
        C9038 c9038 = new C9038(view);
        objectAnimatorOfFloat.addListener(c9038);
        getRootTransition().addListener(c9038);
        return objectAnimatorOfFloat;
    }

    @Override // l.AbstractC21016
    public final Animator onAppear(ViewGroup viewGroup, View view, C22508 c22508, C22508 c22509) {
        C11319.m28610();
        return m7835(m7834(c22508, 0.0f), 1.0f, view);
    }

    @Override // l.AbstractC21016
    public final Animator onDisappear(ViewGroup viewGroup, View view, C22508 c22508, C22508 c22509) {
        C11319.m28610();
        ObjectAnimator objectAnimatorM7835 = m7835(m7834(c22508, 1.0f), 0.0f, view);
        if (objectAnimatorM7835 == null) {
            C11319.m28605(view, m7834(c22509, 1.0f));
        }
        return objectAnimatorM7835;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m7834(C22508 c22508, float f) {
        Float f2;
        return (c22508 == null || (f2 = (Float) c22508.f72818.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }
}
