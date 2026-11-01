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

/* JADX INFO: renamed from: l.ۘ᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5CY */
/* JADX INFO: loaded from: classes3.dex */
public class C4274 extends AbstractC4337 {
    @Override // l.AbstractC11766
    public final boolean isSeekingSupported() {
        return true;
    }

    public C4274(int i) {
        setMode(i);
    }

    public C4274(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21208.f69013);
        setMode(C12398.m30833(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // l.AbstractC4337, l.AbstractC11766
    public final void captureStartValues(C8238 c8238) {
        super.captureStartValues(c8238);
        Float fValueOf = (Float) c8238.f28685.getTag(R.id.MT_Protector);
        if (fValueOf == null) {
            if (c8238.f28685.getVisibility() == 0) {
                fValueOf = Float.valueOf(C16000.m37975(c8238.f28685));
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        c8238.f28686.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ObjectAnimator m12083(float f, float f2, View view) {
        if (f == f2) {
            return null;
        }
        C16000.m37977(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) C16000.f51807, f2);
        C13448 c13448 = new C13448(view);
        objectAnimatorOfFloat.addListener(c13448);
        getRootTransition().addListener(c13448);
        return objectAnimatorOfFloat;
    }

    @Override // l.AbstractC4337
    public final Animator onAppear(ViewGroup viewGroup, View view, C8238 c8238, C8238 c8239) {
        C16000.m37982();
        return m12083(m12082(c8238, 0.0f), 1.0f, view);
    }

    @Override // l.AbstractC4337
    public final Animator onDisappear(ViewGroup viewGroup, View view, C8238 c8238, C8238 c8239) {
        C16000.m37982();
        ObjectAnimator objectAnimatorM12083 = m12083(m12082(c8238, 1.0f), 0.0f, view);
        if (objectAnimatorM12083 == null) {
            C16000.m37977(view, m12082(c8239, 1.0f));
        }
        return objectAnimatorM12083;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m12082(C8238 c8238, float f) {
        Float f2;
        return (c8238 == null || (f2 = (Float) c8238.f28686.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }
}
