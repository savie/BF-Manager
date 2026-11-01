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

/* JADX INFO: renamed from: l.ۙ֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G64W */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4337 extends AbstractC11766 {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    public static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    public int mMode;
    public static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    public static final String PROPNAME_PARENT = "android:visibility:parent";
    public static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    public Animator onAppear(ViewGroup viewGroup, View view, C8238 c8238, C8238 c8239) {
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, C8238 c8238, C8238 c8239) {
        return null;
    }

    public AbstractC4337() {
        this.mMode = 3;
    }

    public AbstractC4337(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21208.f69009);
        int iM30833 = C12398.m30833(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iM30833 != 0) {
            setMode(iM30833);
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

    @Override // l.AbstractC11766
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    private void captureValues(C8238 c8238) {
        int visibility = c8238.f28685.getVisibility();
        HashMap map = c8238.f28686;
        map.put(PROPNAME_VISIBILITY, Integer.valueOf(visibility));
        map.put(PROPNAME_PARENT, c8238.f28685.getParent());
        int[] iArr = new int[2];
        c8238.f28685.getLocationOnScreen(iArr);
        map.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    @Override // l.AbstractC11766
    public void captureStartValues(C8238 c8238) {
        captureValues(c8238);
    }

    @Override // l.AbstractC11766
    public void captureEndValues(C8238 c8238) {
        captureValues(c8238);
    }

    public boolean isVisible(C8238 c8238) {
        if (c8238 == null) {
            return false;
        }
        HashMap map = c8238.f28686;
        return ((Integer) map.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) map.get(PROPNAME_PARENT)) != null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3298 m12173(C8238 c8238, C8238 c8239) {
        C3298 c3298 = new C3298();
        c3298.f12206 = false;
        c3298.f12204 = false;
        if (c8238 != null) {
            HashMap map = c8238.f28686;
            if (map.containsKey(PROPNAME_VISIBILITY)) {
                c3298.f12203 = ((Integer) map.get(PROPNAME_VISIBILITY)).intValue();
                c3298.f12201 = (ViewGroup) map.get(PROPNAME_PARENT);
            } else {
                c3298.f12203 = -1;
                c3298.f12201 = null;
            }
        } else {
            c3298.f12203 = -1;
            c3298.f12201 = null;
        }
        if (c8239 != null) {
            HashMap map2 = c8239.f28686;
            if (map2.containsKey(PROPNAME_VISIBILITY)) {
                c3298.f12205 = ((Integer) map2.get(PROPNAME_VISIBILITY)).intValue();
                c3298.f12202 = (ViewGroup) map2.get(PROPNAME_PARENT);
            } else {
                c3298.f12205 = -1;
                c3298.f12202 = null;
            }
        } else {
            c3298.f12205 = -1;
            c3298.f12202 = null;
        }
        if (c8238 != null && c8239 != null) {
            int i = c3298.f12203;
            int i2 = c3298.f12205;
            if (i != i2 || c3298.f12201 != c3298.f12202) {
                if (i != i2) {
                    if (i == 0) {
                        c3298.f12204 = false;
                        c3298.f12206 = true;
                        return c3298;
                    }
                    if (i2 == 0) {
                        c3298.f12204 = true;
                        c3298.f12206 = true;
                        return c3298;
                    }
                } else {
                    if (c3298.f12202 == null) {
                        c3298.f12204 = false;
                        c3298.f12206 = true;
                        return c3298;
                    }
                    if (c3298.f12201 == null) {
                        c3298.f12204 = true;
                        c3298.f12206 = true;
                        return c3298;
                    }
                }
            }
        } else {
            if (c8238 == null && c3298.f12205 == 0) {
                c3298.f12204 = true;
                c3298.f12206 = true;
                return c3298;
            }
            if (c8239 == null && c3298.f12203 == 0) {
                c3298.f12204 = false;
                c3298.f12206 = true;
            }
        }
        return c3298;
    }

    @Override // l.AbstractC11766
    public Animator createAnimator(ViewGroup viewGroup, C8238 c8238, C8238 c8239) {
        C3298 c3298M12173 = m12173(c8238, c8239);
        if (!c3298M12173.f12206) {
            return null;
        }
        if (c3298M12173.f12201 == null && c3298M12173.f12202 == null) {
            return null;
        }
        if (c3298M12173.f12204) {
            return onAppear(viewGroup, c8238, c3298M12173.f12203, c8239, c3298M12173.f12205);
        }
        return onDisappear(viewGroup, c8238, c3298M12173.f12203, c8239, c3298M12173.f12205);
    }

    public Animator onAppear(ViewGroup viewGroup, C8238 c8238, int i, C8238 c8239, int i2) {
        if ((this.mMode & 1) != 1 || c8239 == null) {
            return null;
        }
        if (c8238 == null) {
            View view = (View) c8239.f28685.getParent();
            if (m12173(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f12206) {
                return null;
            }
        }
        return onAppear(viewGroup, c8239.f28685, c8238, c8239);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public Animator onDisappear(ViewGroup viewGroup, C8238 c8238, int i, C8238 c8239, int i2) {
        View view;
        boolean z;
        View view2;
        boolean z2;
        if ((this.mMode & 2) == 2 && c8238 != null) {
            View view3 = c8238.f28685;
            View viewM43427 = c8239 != null ? c8239.f28685 : null;
            View view4 = (View) view3.getTag(R.id.MT_Protector);
            if (view4 != null) {
                z2 = true;
                view2 = null;
            } else {
                if (viewM43427 == null || viewM43427.getParent() == null) {
                    if (viewM43427 != null) {
                        view = null;
                        z = false;
                    } else {
                        viewM43427 = null;
                        view = null;
                        z = true;
                    }
                } else if (i2 == 4 || view3 == viewM43427) {
                    view = viewM43427;
                    z = false;
                    viewM43427 = null;
                } else {
                    viewM43427 = null;
                    view = null;
                    z = true;
                }
                if (z) {
                    if (view3.getParent() != null) {
                        if (view3.getParent() instanceof View) {
                            View view5 = (View) view3.getParent();
                            if (!m12173(getTransitionValues(view5, true), getMatchedTransitionValues(view5, true)).f12206) {
                                viewM43427 = C18821.m43427(viewGroup, view3, view5);
                            } else {
                                int id = view5.getId();
                                if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.mCanRemoveViews) {
                                }
                            }
                        }
                        view2 = view;
                        view4 = viewM43427;
                        z2 = false;
                    }
                    z2 = false;
                    view2 = view;
                    view4 = view3;
                } else {
                    view2 = view;
                    view4 = viewM43427;
                    z2 = false;
                }
            }
            if (view4 != null) {
                if (!z2) {
                    int[] iArr = (int[]) c8238.f28686.get(PROPNAME_SCREEN_LOCATION);
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view4.offsetLeftAndRight((i3 - iArr2[0]) - view4.getLeft());
                    view4.offsetTopAndBottom((i4 - iArr2[1]) - view4.getTop());
                    viewGroup.getOverlay().add(view4);
                }
                Animator animatorOnDisappear = onDisappear(viewGroup, view4, c8238, c8239);
                if (!z2) {
                    if (animatorOnDisappear == null) {
                        viewGroup.getOverlay().remove(view4);
                        return animatorOnDisappear;
                    }
                    view3.setTag(R.id.MT_Protector, view4);
                    C9650 c9650 = new C9650(this, viewGroup, view4, view3);
                    animatorOnDisappear.addListener(c9650);
                    animatorOnDisappear.addPauseListener(c9650);
                    getRootTransition().addListener(c9650);
                }
                return animatorOnDisappear;
            }
            if (view2 != null) {
                int visibility = view2.getVisibility();
                C16000.m37978(view2, 0);
                Animator animatorOnDisappear2 = onDisappear(viewGroup, view2, c8238, c8239);
                if (animatorOnDisappear2 != null) {
                    C1887 c1887 = new C1887(i2, view2);
                    animatorOnDisappear2.addListener(c1887);
                    getRootTransition().addListener(c1887);
                    return animatorOnDisappear2;
                }
                C16000.m37978(view2, visibility);
                return animatorOnDisappear2;
            }
        }
        return null;
    }

    @Override // l.AbstractC11766
    public boolean isTransitionRequired(C8238 c8238, C8238 c8239) {
        if (c8238 == null && c8239 == null) {
            return false;
        }
        if (c8238 != null && c8239 != null && c8239.f28686.containsKey(PROPNAME_VISIBILITY) != c8238.f28686.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        C3298 c3298M12173 = m12173(c8238, c8239);
        if (c3298M12173.f12206) {
            return c3298M12173.f12203 == 0 || c3298M12173.f12205 == 0;
        }
        return false;
    }
}
