package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.ۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P5AI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9908 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int[] f33854;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f33855;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f33856;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ViewParent f33857;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ViewParent f33858;

    public C9908(ViewGroup viewGroup) {
        this.f33856 = viewGroup;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25100(boolean z) {
        if (this.f33855) {
            int i = C5031.f17539;
            C17398.m40545(this.f33856);
        }
        this.f33855 = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m25098(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM25097;
        int i6;
        int i7;
        int[] iArr3;
        if (this.f33855 && (viewParentM25097 = m25097(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.f33856;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.f33854 == null) {
                        this.f33854 = new int[2];
                    }
                    int[] iArr4 = this.f33854;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM25097 instanceof InterfaceC4697) {
                    ((InterfaceC4697) viewParentM25097).onNestedScroll(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentM25097 instanceof InterfaceC3556) {
                        ((InterfaceC3556) viewParentM25097).onNestedScroll(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            C8560.m22315(viewParentM25097, viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError unused) {
                            C13638.toString(viewParentM25097);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25101() {
        return this.f33855;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25102(float f, float f2) {
        ViewParent viewParentM25097;
        if (this.f33855 && (viewParentM25097 = m25097(0)) != null) {
            try {
                return C8560.m22318(viewParentM25097, this.f33856, f, f2);
            } catch (AbstractMethodError unused) {
                C13638.toString(viewParentM25097);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25103(float f, float f2, boolean z) {
        ViewParent viewParentM25097;
        if (this.f33855 && (viewParentM25097 = m25097(0)) != null) {
            try {
                return C8560.m22319(viewParentM25097, this.f33856, f, f2, z);
            } catch (AbstractMethodError unused) {
                C13638.toString(viewParentM25097);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25108(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentM25097;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f33855 || (viewParentM25097 = m25097(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f33856;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f33854 == null) {
                this.f33854 = new int[2];
            }
            iArr3 = this.f33854;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM25097 instanceof InterfaceC3556) {
            ((InterfaceC3556) viewParentM25097).onNestedPreScroll(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                C8560.m22316(viewParentM25097, viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                C13638.toString(viewParentM25097);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25104(int i) {
        return m25097(i) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25105(int i, int i2) {
        boolean zM22320;
        if (!m25104(i2)) {
            if (this.f33855) {
                ViewGroup viewGroup = this.f33856;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC3556;
                    if (z) {
                        zM22320 = ((InterfaceC3556) parent).onStartNestedScroll(view, viewGroup, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zM22320 = C8560.m22320(parent, view, viewGroup, i);
                        } catch (AbstractMethodError unused) {
                            C13638.toString(parent);
                            zM22320 = false;
                        }
                    } else {
                        zM22320 = false;
                    }
                    if (zM22320) {
                        if (i2 == 0) {
                            this.f33857 = parent;
                        } else if (i2 == 1) {
                            this.f33858 = parent;
                        }
                        if (z) {
                            ((InterfaceC3556) parent).onNestedScrollAccepted(view, viewGroup, i, i2);
                        } else if (i2 == 0) {
                            try {
                                C8560.m22317(parent, view, viewGroup, i);
                            } catch (AbstractMethodError unused2) {
                                C13638.toString(parent);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25109(int i) {
        ViewParent viewParentM25097 = m25097(i);
        if (viewParentM25097 != null) {
            boolean z = viewParentM25097 instanceof InterfaceC3556;
            ViewGroup viewGroup = this.f33856;
            if (z) {
                ((InterfaceC3556) viewParentM25097).onStopNestedScroll(viewGroup, i);
            } else if (i == 0) {
                try {
                    C8560.m22314(viewParentM25097, viewGroup);
                } catch (AbstractMethodError unused) {
                    C13638.toString(viewParentM25097);
                }
            }
            if (i == 0) {
                this.f33857 = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f33858 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25106(int i, int i2, int i3, int i4, int[] iArr) {
        return m25098(i, i2, i3, i4, iArr, 0, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25107(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m25098(i, i2, i3, i4, iArr, i5, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25099(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m25098(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private ViewParent m25097(int i) {
        if (i == 0) {
            return this.f33857;
        }
        if (i != 1) {
            return null;
        }
        return this.f33858;
    }
}
