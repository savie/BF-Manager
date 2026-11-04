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

/* JADX INFO: renamed from: l.֨֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes3.dex */
public class C0835 extends AbstractC0329 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f3142;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final String[] f3136 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Property f3140 = new C23956(PointF.class, "topLeft");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Property f3139 = new C3818(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Property f3141 = new C14258(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final Property f3137 = new C20972(PointF.class, "topLeft");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Property f3135 = new C17988(PointF.class, "position");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C13007 f3138 = new C13007();

    @Override // l.AbstractC0329
    public final boolean isSeekingSupported() {
        return true;
    }

    public C0835() {
        this.f3142 = false;
    }

    public C0835(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3142 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1821.f6177);
        boolean z = C2506.m8390((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes.getBoolean(0, false) : false;
        typedArrayObtainStyledAttributes.recycle();
        this.f3142 = z;
    }

    @Override // l.AbstractC0329
    public final String[] getTransitionProperties() {
        return f3136;
    }

    private void captureValues(C22508 c22508) {
        View view = c22508.f72817;
        HashMap map = c22508.f72818;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c22508.f72817.getParent());
        if (this.f3142) {
            map.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // l.AbstractC0329
    public final void captureStartValues(C22508 c22508) {
        Rect rect;
        captureValues(c22508);
        if (!this.f3142 || (rect = (Rect) c22508.f72817.getTag(R.id.MT_Protector)) == null) {
            return;
        }
        c22508.f72818.put("android:changeBounds:clip", rect);
    }

    @Override // l.AbstractC0329
    public final void captureEndValues(C22508 c22508) {
        captureValues(c22508);
    }

    @Override // l.AbstractC0329
    public final Animator createAnimator(ViewGroup viewGroup, C22508 c22508, C22508 c22509) {
        int i;
        View view;
        ObjectAnimator objectAnimatorM51187;
        int i2;
        ObjectAnimator objectAnimator;
        Animator animator;
        Path path;
        Property property;
        ObjectAnimator objectAnimatorM51188;
        if (c22508 != null) {
            HashMap map = c22508.f72818;
            if (c22509 != null) {
                HashMap map2 = c22509.f72818;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view2 = c22509.f72817;
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
                        boolean z = this.f3142;
                        Property property2 = f3135;
                        if (z) {
                            C11319.m28607(view, i3, i5, Math.max(i11, i13) + i3, i5 + Math.max(i12, i14));
                            if (i3 == i4 && i5 == i6) {
                                objectAnimatorM51187 = null;
                            } else {
                                view = view2;
                                objectAnimatorM51187 = C22704.m51187(view, property2, getPathMotion().getPath(i3, i5, i4, i6));
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
                                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f3138, objArr);
                                C7547 c7547 = new C7547(view, rect3, z2, rect5, z3, i3, i5, i7, i9, i4, i6, i8, i10);
                                objectAnimatorOfObject.addListener(c7547);
                                addListener(c7547);
                                objectAnimator = objectAnimatorOfObject;
                            }
                            int i16 = C10573.f33589;
                            animator = objectAnimatorM51187;
                            if (objectAnimatorM51187 == null) {
                                animator = objectAnimator;
                            } else if (objectAnimator != null) {
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(objectAnimatorM51187, objectAnimator);
                                animator = animatorSet;
                            }
                        } else {
                            C11319.m28607(view2, i3, i5, i7, i9);
                            if (i15 != 2) {
                                if (i3 == i4 && i5 == i6) {
                                    path = getPathMotion().getPath(i7, i9, i8, i10);
                                    property = f3141;
                                } else {
                                    path = getPathMotion().getPath(i3, i5, i4, i6);
                                    property = f3137;
                                }
                                objectAnimatorM51188 = C22704.m51187(view2, property, path);
                            } else if (i11 == i13 && i12 == i14) {
                                objectAnimatorM51188 = C22704.m51187(view2, property2, getPathMotion().getPath(i3, i5, i4, i6));
                            } else {
                                C9783 c9783 = new C9783(view2);
                                ObjectAnimator objectAnimatorM51189 = C22704.m51187(c9783, f3140, getPathMotion().getPath(i3, i5, i4, i6));
                                ObjectAnimator objectAnimatorM511810 = C22704.m51187(c9783, f3139, getPathMotion().getPath(i7, i9, i8, i10));
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(objectAnimatorM51189, objectAnimatorM511810);
                                animatorSet2.addListener(new C0089(c9783));
                                view = view2;
                                animator = animatorSet2;
                            }
                            view = view2;
                            animator = objectAnimatorM51188;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            C12811.m31773(viewGroup4, true);
                            getRootTransition().addListener(new C18734(viewGroup4));
                        }
                        return animator;
                    }
                }
            }
        }
        return null;
    }
}
