package l;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩶ۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G64W */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21016 extends AbstractC0329 {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    public static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    public int mMode;
    public static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    public static final String PROPNAME_PARENT = "android:visibility:parent";
    public static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    public Animator onAppear(ViewGroup viewGroup, View view, C22508 c22508, C22508 c22509) {
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, C22508 c22508, C22508 c22509) {
        return null;
    }

    public AbstractC21016() {
        this.mMode = 3;
    }

    public AbstractC21016(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1821.f6174);
        int iM8386 = C2506.m8386(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iM8386 != 0) {
            setMode(iM8386);
        }
    }

    public void setMode(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i;
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // l.AbstractC0329
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    private void captureValues(C22508 c22508) {
        int visibility = c22508.f72817.getVisibility();
        HashMap map = c22508.f72818;
        map.put(PROPNAME_VISIBILITY, Integer.valueOf(visibility));
        map.put(PROPNAME_PARENT, c22508.f72817.getParent());
        int[] iArr = new int[2];
        c22508.f72817.getLocationOnScreen(iArr);
        map.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    @Override // l.AbstractC0329
    public void captureStartValues(C22508 c22508) {
        captureValues(c22508);
    }

    @Override // l.AbstractC0329
    public void captureEndValues(C22508 c22508) {
        captureValues(c22508);
    }

    public boolean isVisible(C22508 c22508) {
        if (c22508 == null) {
            return false;
        }
        HashMap map = c22508.f72818;
        return ((Integer) map.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) map.get(PROPNAME_PARENT)) != null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14302 m48036(C22508 c22508, C22508 c22509) {
        C14302 c14302 = new C14302();
        c14302.f45164 = false;
        c14302.f45163 = false;
        if (c22508 != null) {
            HashMap map = c22508.f72818;
            if (map.containsKey(PROPNAME_VISIBILITY)) {
                c14302.f45165 = ((Integer) map.get(PROPNAME_VISIBILITY)).intValue();
                c14302.f45167 = (ViewGroup) map.get(PROPNAME_PARENT);
            } else {
                c14302.f45165 = -1;
                c14302.f45167 = null;
            }
        } else {
            c14302.f45165 = -1;
            c14302.f45167 = null;
        }
        if (c22509 != null) {
            HashMap map2 = c22509.f72818;
            if (map2.containsKey(PROPNAME_VISIBILITY)) {
                c14302.f45166 = ((Integer) map2.get(PROPNAME_VISIBILITY)).intValue();
                c14302.f45162 = (ViewGroup) map2.get(PROPNAME_PARENT);
            } else {
                c14302.f45166 = -1;
                c14302.f45162 = null;
            }
        } else {
            c14302.f45166 = -1;
            c14302.f45162 = null;
        }
        if (c22508 != null && c22509 != null) {
            int i = c14302.f45165;
            int i2 = c14302.f45166;
            if (i != i2 || c14302.f45167 != c14302.f45162) {
                if (i != i2) {
                    if (i == 0) {
                        c14302.f45163 = false;
                        c14302.f45164 = true;
                        return c14302;
                    }
                    if (i2 == 0) {
                        c14302.f45163 = true;
                        c14302.f45164 = true;
                        return c14302;
                    }
                } else {
                    if (c14302.f45162 == null) {
                        c14302.f45163 = false;
                        c14302.f45164 = true;
                        return c14302;
                    }
                    if (c14302.f45167 == null) {
                        c14302.f45163 = true;
                        c14302.f45164 = true;
                        return c14302;
                    }
                }
            }
        } else {
            if (c22508 == null && c14302.f45166 == 0) {
                c14302.f45163 = true;
                c14302.f45164 = true;
                return c14302;
            }
            if (c22509 == null && c14302.f45165 == 0) {
                c14302.f45163 = false;
                c14302.f45164 = true;
            }
        }
        return c14302;
    }

    @Override // l.AbstractC0329
    public Animator createAnimator(ViewGroup viewGroup, C22508 c22508, C22508 c22509) {
        C14302 c14302M48036 = m48036(c22508, c22509);
        if (!c14302M48036.f45164) {
            return null;
        }
        if (c14302M48036.f45167 == null && c14302M48036.f45162 == null) {
            return null;
        }
        if (c14302M48036.f45163) {
            return onAppear(viewGroup, c22508, c14302M48036.f45165, c22509, c14302M48036.f45166);
        }
        return onDisappear(viewGroup, c22508, c14302M48036.f45165, c22509, c14302M48036.f45166);
    }

    public Animator onAppear(ViewGroup viewGroup, C22508 c22508, int i, C22508 c22509, int i2) {
        if ((this.mMode & 1) != 1 || c22509 == null) {
            return null;
        }
        if (c22508 == null) {
            View view = (View) c22509.f72817.getParent();
            if (m48036(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f45164) {
                return null;
            }
        }
        return onAppear(viewGroup, c22509.f72817, c22508, c22509);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public Animator onDisappear(ViewGroup viewGroup, C22508 c22508, int i, C22508 c22509, int i2) {
        View view;
        boolean z;
        View view2;
        boolean z2;
        if ((this.mMode & 2) == 2 && c22508 != null) {
            View view3 = c22508.f72817;
            View viewM27033 = c22509 != null ? c22509.f72817 : null;
            View view4 = (View) view3.getTag(R.id.MT_Protector);
            if (view4 != null) {
                z2 = true;
                view2 = null;
            } else {
                if (viewM27033 == null || viewM27033.getParent() == null) {
                    if (viewM27033 != null) {
                        view = null;
                        z = false;
                    } else {
                        viewM27033 = null;
                        view = null;
                        z = true;
                    }
                } else if (i2 == 4 || view3 == viewM27033) {
                    view = viewM27033;
                    z = false;
                    viewM27033 = null;
                } else {
                    viewM27033 = null;
                    view = null;
                    z = true;
                }
                if (z) {
                    if (view3.getParent() != null) {
                        if (view3.getParent() instanceof View) {
                            View view5 = (View) view3.getParent();
                            if (!m48036(getTransitionValues(view5, true), getMatchedTransitionValues(view5, true)).f45164) {
                                viewM27033 = C10573.m27033(viewGroup, view3, view5);
                            } else {
                                int id = view5.getId();
                                if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.mCanRemoveViews) {
                                }
                            }
                        }
                        view2 = view;
                        view4 = viewM27033;
                        z2 = false;
                    }
                    z2 = false;
                    view2 = view;
                    view4 = view3;
                } else {
                    view2 = view;
                    view4 = viewM27033;
                    z2 = false;
                }
            }
            if (view4 != null) {
                if (!z2) {
                    int[] iArr = (int[]) c22508.f72818.get(PROPNAME_SCREEN_LOCATION);
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view4.offsetLeftAndRight((i3 - iArr2[0]) - view4.getLeft());
                    view4.offsetTopAndBottom((i4 - iArr2[1]) - view4.getTop());
                    viewGroup.getOverlay().add(view4);
                }
                Animator animatorOnDisappear = onDisappear(viewGroup, view4, c22508, c22509);
                if (!z2) {
                    if (animatorOnDisappear == null) {
                        viewGroup.getOverlay().remove(view4);
                        return animatorOnDisappear;
                    }
                    view3.setTag(R.id.MT_Protector, view4);
                    C3862 c3862 = new C3862(this, viewGroup, view4, view3);
                    animatorOnDisappear.addListener(c3862);
                    animatorOnDisappear.addPauseListener(c3862);
                    getRootTransition().addListener(c3862);
                }
                return animatorOnDisappear;
            }
            if (view2 != null) {
                int visibility = view2.getVisibility();
                C11319.m28606(view2, 0);
                Animator animatorOnDisappear2 = onDisappear(viewGroup, view2, c22508, c22509);
                if (animatorOnDisappear2 != null) {
                    C24000 c24000 = new C24000(i2, view2);
                    animatorOnDisappear2.addListener(c24000);
                    getRootTransition().addListener(c24000);
                    return animatorOnDisappear2;
                }
                C11319.m28606(view2, visibility);
                return animatorOnDisappear2;
            }
        }
        return null;
    }

    @Override // l.AbstractC0329
    public boolean isTransitionRequired(C22508 c22508, C22508 c22509) {
        if (c22508 == null && c22509 == null) {
            return false;
        }
        if (c22508 != null && c22509 != null && c22509.f72818.containsKey(PROPNAME_VISIBILITY) != c22508.f72818.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        C14302 c14302M48036 = m48036(c22508, c22509);
        if (c14302M48036.f45164) {
            return c14302M48036.f45165 == 0 || c14302M48036.f45166 == 0;
        }
        return false;
    }
}
