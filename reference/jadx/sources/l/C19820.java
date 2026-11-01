package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 152K */
/* JADX INFO: loaded from: classes4.dex */
public final class C19820 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public View f63623;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7470 f63625;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f63621 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15587 f63622 = new C15587();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f63624 = new ArrayList();

    public C19820(C7470 c7470) {
        this.f63625 = c7470;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m45059(View view) {
        this.f63624.add(view);
        AbstractC12554 abstractC12554M40745 = C17492.m40745(view);
        if (abstractC12554M40745 != null) {
            abstractC12554M40745.onEnteredHiddenState(this.f63625.f24878);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m45057(View view) {
        AbstractC12554 abstractC12554M40745;
        if (!this.f63624.remove(view) || (abstractC12554M40745 = C17492.m40745(view)) == null) {
            return;
        }
        abstractC12554M40745.onLeftHiddenState(this.f63625.f24878);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45066(View view, int i, boolean z) {
        int iM45058;
        C17492 c17492 = this.f63625.f24878;
        if (i >= 0) {
            iM45058 = m45058(i);
        } else {
            iM45058 = c17492.getChildCount();
        }
        this.f63622.m37249(iM45058, z);
        if (z) {
            m45059(view);
        }
        c17492.addView(view, iM45058);
        c17492.dispatchChildAttached(view);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m45058(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f63625.f24878.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C15587 c15587 = this.f63622;
            int iM37252 = i - (i2 - c15587.m37252(i2));
            if (iM37252 == 0) {
                while (c15587.m37251(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM37252;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m45069(View view) {
        C7470 c7470 = this.f63625;
        int i = this.f63621;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f63621 = 1;
            this.f63623 = view;
            int iIndexOfChild = c7470.f24878.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (this.f63622.m37246(iIndexOfChild)) {
                    m45057(view);
                }
                c7470.m19959(iIndexOfChild);
            }
        } finally {
            this.f63621 = 0;
            this.f63623 = null;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m45060(int i) {
        C7470 c7470 = this.f63625;
        int i2 = this.f63621;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iM45058 = m45058(i);
            View childAt = c7470.f24878.getChildAt(iM45058);
            if (childAt != null) {
                this.f63621 = 1;
                this.f63623 = childAt;
                if (this.f63622.m37246(iM45058)) {
                    m45057(childAt);
                }
                c7470.m19959(iM45058);
            }
        } finally {
            this.f63621 = 0;
            this.f63623 = null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View m45072(int i) {
        return this.f63625.f24878.getChildAt(m45058(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45065(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iM45058;
        C17492 c17492 = this.f63625.f24878;
        if (i >= 0) {
            iM45058 = m45058(i);
        } else {
            iM45058 = c17492.getChildCount();
        }
        this.f63622.m37249(iM45058, z);
        if (z) {
            m45059(view);
        }
        AbstractC12554 abstractC12554M40745 = C17492.m40745(view);
        if (abstractC12554M40745 != null) {
            if (!abstractC12554M40745.isTmpDetached() && !abstractC12554M40745.shouldIgnore()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC12554M40745 + c17492.exceptionLabel());
            }
            if (C17492.sVerboseLoggingEnabled) {
                abstractC12554M40745.toString();
            }
            abstractC12554M40745.clearTmpDetachFlag();
        } else if (C17492.sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + iM45058 + c17492.exceptionLabel());
        }
        c17492.attachViewToParent(view, iM45058, layoutParams);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45062() {
        return this.f63625.f24878.getChildCount() - this.f63624.size();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m45070() {
        return this.f63625.f24878.getChildCount();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final View m45068(int i) {
        return this.f63625.f24878.getChildAt(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45063(int i) {
        int iM45058 = m45058(i);
        this.f63622.m37246(iM45058);
        C17492 c17492 = this.f63625.f24878;
        View childAt = c17492.getChildAt(iM45058);
        if (childAt != null) {
            AbstractC12554 abstractC12554M40745 = C17492.m40745(childAt);
            if (abstractC12554M40745 != null) {
                if (abstractC12554M40745.isTmpDetached() && !abstractC12554M40745.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + abstractC12554M40745 + c17492.exceptionLabel());
                }
                if (C17492.sVerboseLoggingEnabled) {
                    abstractC12554M40745.toString();
                }
                abstractC12554M40745.addFlags(256);
            }
        } else if (C17492.sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No view at offset " + iM45058 + c17492.exceptionLabel());
        }
        c17492.detachViewFromParent(iM45058);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m45071(View view) {
        int iIndexOfChild = this.f63625.f24878.indexOfChild(view);
        if (iIndexOfChild != -1) {
            C15587 c15587 = this.f63622;
            if (!c15587.m37251(iIndexOfChild)) {
                return iIndexOfChild - c15587.m37252(iIndexOfChild);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45064(View view) {
        int iIndexOfChild = this.f63625.f24878.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        this.f63622.m37250(iIndexOfChild);
        m45059(view);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m45067(View view) {
        int iIndexOfChild = this.f63625.f24878.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        C15587 c15587 = this.f63622;
        if (!c15587.m37251(iIndexOfChild)) {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        c15587.m37248(iIndexOfChild);
        m45057(view);
    }

    public final String toString() {
        return this.f63622.toString() + ", hidden list:" + this.f63624.size();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m45061(View view) {
        C15587 c15587 = this.f63622;
        C7470 c7470 = this.f63625;
        int i = this.f63621;
        if (i == 1) {
            if (this.f63623 == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f63621 = 2;
            int iIndexOfChild = c7470.f24878.indexOfChild(view);
            if (iIndexOfChild == -1) {
                m45057(view);
                return true;
            }
            if (!c15587.m37251(iIndexOfChild)) {
                return false;
            }
            c15587.m37246(iIndexOfChild);
            m45057(view);
            c7470.m19959(iIndexOfChild);
            return true;
        } finally {
            this.f63621 = 0;
        }
    }
}
