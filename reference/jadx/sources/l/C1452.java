package l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֨᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes2.dex */
public class C1452 extends AbstractC11766 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f5934;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String[] f5929 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Property f5932 = new C1784(PointF.class, "topLeft");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Property f5927 = new C9547(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Property f5933 = new C3195(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Property f5930 = new C4980(PointF.class, "topLeft");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Property f5931 = new C14154(PointF.class, "position");

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C10626 f5928 = new C10626();

    @Override // l.AbstractC11766
    public final boolean isSeekingSupported() {
        return true;
    }

    public C1452() {
        this.f5934 = false;
    }

    public C1452(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5934 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21208.f69014);
        boolean z = C12398.m30837((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes.getBoolean(0, false) : false;
        typedArrayObtainStyledAttributes.recycle();
        this.f5934 = z;
    }

    @Override // l.AbstractC11766
    public final String[] getTransitionProperties() {
        return f5929;
    }

    private void captureValues(C8238 c8238) {
        View view = c8238.f28685;
        HashMap map = c8238.f28686;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c8238.f28685.getParent());
        if (this.f5934) {
            map.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // l.AbstractC11766
    public final void captureStartValues(C8238 c8238) {
        Rect rect;
        captureValues(c8238);
        if (!this.f5934 || (rect = (Rect) c8238.f28685.getTag(R.id.MT_Protector)) == null) {
            return;
        }
        c8238.f28686.put("android:changeBounds:clip", rect);
    }

    @Override // l.AbstractC11766
    public final void captureEndValues(C8238 c8238) {
        captureValues(c8238);
    }

    @Override // l.AbstractC11766
    public final Animator createAnimator(ViewGroup viewGroup, C8238 c8238, C8238 c8239) {
        int i;
        View view;
        ObjectAnimator objectAnimatorM22236;
        int i2;
        ObjectAnimator objectAnimator;
        Animator animator;
        Path path;
        Property property;
        ObjectAnimator objectAnimatorM22237;
        if (c8238 != null) {
            HashMap map = c8238.f28686;
            if (c8239 != null) {
                HashMap map2 = c8239.f28686;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view2 = c8239.f28685;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i3 = rect.left;
                    int i4 = rect2.left;
                    int i5 = rect.top;
                    int i6 = rect2.top;
                    int i7 = rect.right;
                    int i8 = rect2.right;
                    int i9 = rect.bottom;
                    int i10 = rect2.bottom;
                    int i11 = i7 - i3;
                    int i12 = i9 - i5;
                    int i13 = i8 - i4;
                    int i14 = i10 - i6;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                        i = 0;
                    } else {
                        i = (i3 == i4 && i5 == i6) ? 0 : 1;
                        if (i7 != i8 || i9 != i10) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i15 = i;
                    if (i15 > 0) {
                        boolean z = this.f5934;
                        Property property2 = f5931;
                        if (z) {
                            C16000.m37979(view, i3, i5, Math.max(i11, i13) + i3, i5 + Math.max(i12, i14));
                            if (i3 == i4 && i5 == i6) {
                                objectAnimatorM22236 = null;
                            } else {
                                view = view2;
                                objectAnimatorM22236 = C8509.m22236(view, property2, getPathMotion().getPath(i3, i5, i4, i6));
                            }
                            boolean z2 = rect3 == null;
                            if (z2) {
                                i2 = 0;
                                rect3 = new Rect(0, 0, i11, i12);
                            } else {
                                i2 = 0;
                            }
                            boolean z3 = rect4 == null;
                            Rect rect5 = z3 ? new Rect(i2, i2, i13, i14) : rect4;
                            if (rect3.equals(rect5)) {
                                objectAnimator = null;
                            } else {
                                view.setClipBounds(rect3);
                                Object[] objArr = new Object[2];
                                objArr[i2] = rect3;
                                objArr[1] = rect5;
                                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f5928, objArr);
                                C2863 c2863 = new C2863(view, rect3, z2, rect5, z3, i3, i5, i7, i9, i4, i6, i8, i10);
                                objectAnimatorOfObject.addListener(c2863);
                                addListener(c2863);
                                objectAnimator = objectAnimatorOfObject;
                            }
                            int i16 = C18821.f60997;
                            animator = objectAnimatorM22236;
                            if (objectAnimatorM22236 == null) {
                                animator = objectAnimator;
                            } else if (objectAnimator != null) {
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(objectAnimatorM22236, objectAnimator);
                                animator = animatorSet;
                            }
                        } else {
                            C16000.m37979(view2, i3, i5, i7, i9);
                            if (i15 != 2) {
                                if (i3 == i4 && i5 == i6) {
                                    path = getPathMotion().getPath(i7, i9, i8, i10);
                                    property = f5933;
                                } else {
                                    path = getPathMotion().getPath(i3, i5, i4, i6);
                                    property = f5930;
                                }
                                objectAnimatorM22237 = C8509.m22236(view2, property, path);
                            } else if (i11 == i13 && i12 == i14) {
                                objectAnimatorM22237 = C8509.m22236(view2, property2, getPathMotion().getPath(i3, i5, i4, i6));
                            } else {
                                C22620 c22620 = new C22620(view2);
                                ObjectAnimator objectAnimatorM22238 = C8509.m22236(c22620, f5932, getPathMotion().getPath(i3, i5, i4, i6));
                                ObjectAnimator objectAnimatorM22239 = C8509.m22236(c22620, f5927, getPathMotion().getPath(i7, i9, i8, i10));
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(objectAnimatorM22238, objectAnimatorM22239);
                                animatorSet2.addListener(new C12037(c22620));
                                view = view2;
                                animator = animatorSet2;
                            }
                            view = view2;
                            animator = objectAnimatorM22237;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            C10355.m26251(viewGroup4, true);
                            getRootTransition().addListener(new C5686(viewGroup4));
                        }
                        return animator;
                    }
                }
            }
        }
        return null;
    }
}
