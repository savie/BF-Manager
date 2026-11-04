package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5AI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13735 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f43590;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ViewParent f43591;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f43592;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ViewParent f43593;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f43594;

    public C13735(ViewGroup viewGroup) {
        this.f43592 = viewGroup;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33559(boolean z) {
        if (this.f43590) {
            int i = C22666.f73603;
            C9810.m25549(this.f43592);
        }
        this.f43590 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m33557(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM33556;
        int i6;
        int i7;
        int[] iArr3;
        if (this.f43590 && (viewParentM33556 = m33556(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.f43592;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.f43594 == null) {
                        this.f43594 = new int[2];
                    }
                    int[] iArr4 = this.f43594;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM33556 instanceof InterfaceC21745) {
                    ((InterfaceC21745) viewParentM33556).onNestedScroll(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentM33556 instanceof InterfaceC4591) {
                        ((InterfaceC4591) viewParentM33556).onNestedScroll(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            C20428.m46847(viewParentM33556, viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError unused) {
                            C17359.toString(viewParentM33556);
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
    public final boolean m33560() {
        return this.f43590;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33561(float f, float f2) {
        ViewParent viewParentM33556;
        if (this.f43590 && (viewParentM33556 = m33556(0)) != null) {
            try {
                return C20428.m46850(viewParentM33556, this.f43592, f, f2);
            } catch (AbstractMethodError unused) {
                C17359.toString(viewParentM33556);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33562(float f, float f2, boolean z) {
        ViewParent viewParentM33556;
        if (this.f43590 && (viewParentM33556 = m33556(0)) != null) {
            try {
                return C20428.m46851(viewParentM33556, this.f43592, f, f2, z);
            } catch (AbstractMethodError unused) {
                C17359.toString(viewParentM33556);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33567(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentM33556;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f43590 || (viewParentM33556 = m33556(i3)) == null) {
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
        ViewGroup viewGroup = this.f43592;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f43594 == null) {
                this.f43594 = new int[2];
            }
            iArr3 = this.f43594;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM33556 instanceof InterfaceC4591) {
            ((InterfaceC4591) viewParentM33556).onNestedPreScroll(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                C20428.m46848(viewParentM33556, viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                C17359.toString(viewParentM33556);
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
    public final boolean m33563(int i) {
        return m33556(i) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33564(int i, int i2) {
        boolean zM46852;
        if (!m33563(i2)) {
            if (this.f43590) {
                ViewGroup viewGroup = this.f43592;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC4591;
                    if (z) {
                        zM46852 = ((InterfaceC4591) parent).onStartNestedScroll(view, viewGroup, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zM46852 = C20428.m46852(parent, view, viewGroup, i);
                        } catch (AbstractMethodError unused) {
                            C17359.toString(parent);
                            zM46852 = false;
                        }
                    } else {
                        zM46852 = false;
                    }
                    if (zM46852) {
                        if (i2 == 0) {
                            this.f43591 = parent;
                        } else if (i2 == 1) {
                            this.f43593 = parent;
                        }
                        if (z) {
                            ((InterfaceC4591) parent).onNestedScrollAccepted(view, viewGroup, i, i2);
                        } else if (i2 == 0) {
                            try {
                                C20428.m46849(parent, view, viewGroup, i);
                            } catch (AbstractMethodError unused2) {
                                C17359.toString(parent);
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33568(int i) {
        ViewParent viewParentM33556 = m33556(i);
        if (viewParentM33556 != null) {
            boolean z = viewParentM33556 instanceof InterfaceC4591;
            ViewGroup viewGroup = this.f43592;
            if (z) {
                ((InterfaceC4591) viewParentM33556).onStopNestedScroll(viewGroup, i);
            } else if (i == 0) {
                try {
                    C20428.m46846(viewParentM33556, viewGroup);
                } catch (AbstractMethodError unused) {
                    C17359.toString(viewParentM33556);
                }
            }
            if (i == 0) {
                this.f43591 = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f43593 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33565(int i, int i2, int i3, int i4, int[] iArr) {
        return m33557(i, i2, i3, i4, iArr, 0, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33566(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m33557(i, i2, i3, i4, iArr, i5, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33558(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m33557(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private ViewParent m33556(int i) {
        if (i == 0) {
            return this.f43591;
        }
        if (i != 1) {
            return null;
        }
        return this.f43593;
    }
}
