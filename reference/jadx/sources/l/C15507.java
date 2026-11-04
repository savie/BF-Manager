package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 152K */
/* JADX INFO: loaded from: classes4.dex */
public final class C15507 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public View f50474;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22661 f50475;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f50476 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19983 f50472 = new C19983();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50473 = new ArrayList();

    public C15507(C22661 c22661) {
        this.f50475 = c22661;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m37148(View view) {
        this.f50473.add(view);
        AbstractC11800 abstractC11800M56274 = C25227.m56274(view);
        if (abstractC11800M56274 != null) {
            abstractC11800M56274.onEnteredHiddenState(this.f50475.f73581);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m37147(View view) {
        AbstractC11800 abstractC11800M56274;
        if (!this.f50473.remove(view) || (abstractC11800M56274 = C25227.m56274(view)) == null) {
            return;
        }
        abstractC11800M56274.onLeftHiddenState(this.f50475.f73581);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37154(View view, int i, boolean z) {
        int iM37149;
        C25227 c25227 = this.f50475.f73581;
        if (i >= 0) {
            iM37149 = m37149(i);
        } else {
            iM37149 = c25227.getChildCount();
        }
        this.f50472.m45921(iM37149, z);
        if (z) {
            m37148(view);
        }
        c25227.addView(view, iM37149);
        c25227.dispatchChildAttached(view);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m37149(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f50475.f73581.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C19983 c19983 = this.f50472;
            int iM45924 = i - (i2 - c19983.m45924(i2));
            if (iM45924 == 0) {
                while (c19983.m45922(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM45924;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m37156(View view) {
        C22661 c22661 = this.f50475;
        int i = this.f50476;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f50476 = 1;
            this.f50474 = view;
            int iIndexOfChild = c22661.f73581.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (this.f50472.m45925(iIndexOfChild)) {
                    m37147(view);
                }
                c22661.m51056(iIndexOfChild);
            }
        } finally {
            this.f50476 = 0;
            this.f50474 = null;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m37161(int i) {
        C22661 c22661 = this.f50475;
        int i2 = this.f50476;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iM37149 = m37149(i);
            View childAt = c22661.f73581.getChildAt(iM37149);
            if (childAt != null) {
                this.f50476 = 1;
                this.f50474 = childAt;
                if (this.f50472.m45925(iM37149)) {
                    m37147(childAt);
                }
                c22661.m51056(iM37149);
            }
        } finally {
            this.f50476 = 0;
            this.f50474 = null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View m37160(int i) {
        return this.f50475.f73581.getChildAt(m37149(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37153(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iM37149;
        C25227 c25227 = this.f50475.f73581;
        if (i >= 0) {
            iM37149 = m37149(i);
        } else {
            iM37149 = c25227.getChildCount();
        }
        this.f50472.m45921(iM37149, z);
        if (z) {
            m37148(view);
        }
        AbstractC11800 abstractC11800M56274 = C25227.m56274(view);
        if (abstractC11800M56274 != null) {
            if (!abstractC11800M56274.isTmpDetached() && !abstractC11800M56274.shouldIgnore()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC11800M56274 + c25227.exceptionLabel());
            }
            if (C25227.sVerboseLoggingEnabled) {
                abstractC11800M56274.toString();
            }
            abstractC11800M56274.clearTmpDetachFlag();
        } else if (C25227.sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + iM37149 + c25227.exceptionLabel());
        }
        c25227.attachViewToParent(view, iM37149, layoutParams);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37150() {
        return this.f50475.f73581.getChildCount() - this.f50473.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m37158() {
        return this.f50475.f73581.getChildCount();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View m37155(int i) {
        return this.f50475.f73581.getChildAt(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37151(int i) {
        int iM37149 = m37149(i);
        this.f50472.m45925(iM37149);
        C25227 c25227 = this.f50475.f73581;
        View childAt = c25227.getChildAt(iM37149);
        if (childAt != null) {
            AbstractC11800 abstractC11800M56274 = C25227.m56274(childAt);
            if (abstractC11800M56274 != null) {
                if (abstractC11800M56274.isTmpDetached() && !abstractC11800M56274.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + abstractC11800M56274 + c25227.exceptionLabel());
                }
                if (C25227.sVerboseLoggingEnabled) {
                    abstractC11800M56274.toString();
                }
                abstractC11800M56274.addFlags(256);
            }
        } else if (C25227.sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No view at offset " + iM37149 + c25227.exceptionLabel());
        }
        c25227.detachViewFromParent(iM37149);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m37159(View view) {
        int iIndexOfChild = this.f50475.f73581.indexOfChild(view);
        if (iIndexOfChild != -1) {
            C19983 c19983 = this.f50472;
            if (!c19983.m45922(iIndexOfChild)) {
                return iIndexOfChild - c19983.m45924(iIndexOfChild);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37152(View view) {
        int iIndexOfChild = this.f50475.f73581.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        this.f50472.m45923(iIndexOfChild);
        m37148(view);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m37157(View view) {
        int iIndexOfChild = this.f50475.f73581.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        C19983 c19983 = this.f50472;
        if (!c19983.m45922(iIndexOfChild)) {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        c19983.m45920(iIndexOfChild);
        m37147(view);
    }

    public final String toString() {
        return this.f50472.toString() + ", hidden list:" + this.f50473.size();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m37162(View view) {
        C19983 c19983 = this.f50472;
        C22661 c22661 = this.f50475;
        int i = this.f50476;
        if (i == 1) {
            if (this.f50474 == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f50476 = 2;
            int iIndexOfChild = c22661.f73581.indexOfChild(view);
            if (iIndexOfChild == -1) {
                m37147(view);
                return true;
            }
            if (!c19983.m45922(iIndexOfChild)) {
                return false;
            }
            c19983.m45925(iIndexOfChild);
            m37147(view);
            c22661.m51056(iIndexOfChild);
            return true;
        } finally {
            this.f50476 = 0;
        }
    }
}
