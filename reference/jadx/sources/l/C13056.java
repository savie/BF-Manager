package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes4.dex */
public final class C13056 extends AbstractC17357 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public RunnableC13518 f41778;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f41779;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f41780;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C22753 f41781;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f41782;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C8298 f41783;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C22007 f41784;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f41785;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C6807 f41786;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f41787;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f41788;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f41789;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public Drawable f41790;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f41791;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C10818 f41792;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f41793;

    public C13056(Context context) {
        super(context);
        this.f41779 = new SparseBooleanArray();
        this.f41781 = new C22753(this);
    }

    @Override // l.AbstractC17357, l.InterfaceC5315
    public final void initForMenu(Context context, C9898 c9898) {
        super.initForMenu(context, c9898);
        Resources resources = context.getResources();
        C7880 c7880M21413 = C7880.m21413(context);
        if (!this.f41793) {
            this.f41785 = true;
        }
        this.f41789 = c7880M21413.m21418();
        this.f41780 = c7880M21413.m21415();
        int measuredWidth = this.f41789;
        if (this.f41785) {
            if (this.f41784 == null) {
                C22007 c22007 = new C22007(this, this.f56496);
                this.f41784 = c22007;
                if (this.f41788) {
                    c22007.setImageDrawable(this.f41790);
                    this.f41790 = null;
                    this.f41788 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f41784.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f41784.getMeasuredWidth();
        } else {
            this.f41784 = null;
        }
        this.f41782 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m32539() {
        this.f41780 = C7880.m21413(this.f56503).m21415();
        C9898 c9898 = this.f56497;
        if (c9898 != null) {
            c9898.onItemsChanged(true);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m32537() {
        this.f41785 = true;
        this.f41793 = true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m32538() {
        this.f41787 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32530(Drawable drawable) {
        C22007 c22007 = this.f41784;
        if (c22007 != null) {
            c22007.setImageDrawable(drawable);
        } else {
            this.f41788 = true;
            this.f41790 = drawable;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Drawable m32540() {
        C22007 c22007 = this.f41784;
        if (c22007 != null) {
            return c22007.getDrawable();
        }
        if (this.f41788) {
            return this.f41790;
        }
        return null;
    }

    @Override // l.AbstractC17357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11280 mo32529(ViewGroup viewGroup) {
        InterfaceC11280 interfaceC11280 = this.f56499;
        InterfaceC11280 interfaceC11280Mo32529 = super.mo32529(viewGroup);
        if (interfaceC11280 != interfaceC11280Mo32529) {
            ((C17531) interfaceC11280Mo32529).m41169(this);
        }
        return interfaceC11280Mo32529;
    }

    @Override // l.AbstractC17357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View mo32528(C8407 c8407, View view, ViewGroup viewGroup) {
        View actionView = c8407.getActionView();
        if (actionView == null || c8407.m22594()) {
            actionView = super.mo32528(c8407, view, viewGroup);
        }
        actionView.setVisibility(c8407.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((C17531) viewGroup).getClass();
        if (!(layoutParams instanceof C11564)) {
            actionView.setLayoutParams(C17531.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // l.AbstractC17357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32531(C8407 c8407, InterfaceC1586 interfaceC1586) {
        interfaceC1586.initialize(c8407, 0);
        ViewOnClickListenerC16611 viewOnClickListenerC16611 = (ViewOnClickListenerC16611) interfaceC1586;
        viewOnClickListenerC16611.m39302((C17531) this.f56499);
        if (this.f41786 == null) {
            this.f41786 = new C6807(this);
        }
        viewOnClickListenerC16611.m39303(this.f41786);
    }

    @Override // l.AbstractC17357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo32534(C8407 c8407) {
        return c8407.m22586();
    }

    @Override // l.AbstractC17357, l.InterfaceC5315
    public final void updateMenuView(boolean z) {
        super.updateMenuView(z);
        ((View) this.f56499).requestLayout();
        C9898 c9898 = this.f56497;
        boolean z2 = false;
        if (c9898 != null) {
            ArrayList actionItems = c9898.getActionItems();
            int size = actionItems.size();
            for (int i = 0; i < size; i++) {
                ((C8407) actionItems.get(i)).getClass();
            }
        }
        C9898 c9899 = this.f56497;
        ArrayList nonActionItems = c9899 != null ? c9899.getNonActionItems() : null;
        if (this.f41785 && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z2 = !((C8407) nonActionItems.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f41784 == null) {
                this.f41784 = new C22007(this, this.f56496);
            }
            ViewGroup viewGroup = (ViewGroup) this.f41784.getParent();
            if (viewGroup != this.f56499) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f41784);
                }
                C17531 c17531 = (C17531) this.f56499;
                C22007 c22007 = this.f41784;
                c17531.getClass();
                C11564 c11564GenerateDefaultLayoutParams = C17531.generateDefaultLayoutParams();
                c11564GenerateDefaultLayoutParams.f36360 = true;
                c17531.addView(c22007, c11564GenerateDefaultLayoutParams);
            }
        } else {
            C22007 c22008 = this.f41784;
            if (c22008 != null) {
                Object parent = c22008.getParent();
                Object obj = this.f56499;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f41784);
                }
            }
        }
        ((C17531) this.f56499).m41170(this.f41785);
    }

    @Override // l.AbstractC17357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo32533(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f41784) {
            return false;
        }
        viewGroup.removeViewAt(i);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC17357, l.InterfaceC5315
    public final boolean onSubMenuSelected(SubMenuC12026 subMenuC12026) {
        boolean z = false;
        if (subMenuC12026.hasVisibleItems()) {
            SubMenuC12026 subMenuC12027 = subMenuC12026;
            while (subMenuC12027.getParentMenu() != this.f56497) {
                subMenuC12027 = (SubMenuC12026) subMenuC12027.getParentMenu();
            }
            MenuItem item = subMenuC12027.getItem();
            ViewGroup viewGroup = (ViewGroup) this.f56499;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof InterfaceC1586) && ((InterfaceC1586) childAt).getItemData() == item) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.f41791 = subMenuC12026.getItem().getItemId();
                int size = subMenuC12026.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItem item2 = subMenuC12026.getItem(i2);
                    if (item2.isVisible() && item2.getIcon() != null) {
                        z = true;
                        break;
                    }
                }
                C8298 c8298 = new C8298(this, this.f56503, subMenuC12026, view);
                this.f41783 = c8298;
                c8298.m36145(z);
                if (!this.f41783.m36148()) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                super.onSubMenuSelected(subMenuC12026);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m32535() {
        C9898 c9898;
        if (!this.f41785 || m32541() || (c9898 = this.f56497) == null || this.f56499 == null || this.f41778 != null || c9898.getNonActionItems().isEmpty()) {
            return false;
        }
        RunnableC13518 runnableC13518 = new RunnableC13518(this, new C10818(this, this.f56503, this.f56497, this.f41784));
        this.f41778 = runnableC13518;
        ((View) this.f56499).post(runnableC13518);
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m32536() {
        Object obj;
        RunnableC13518 runnableC13518 = this.f41778;
        if (runnableC13518 != null && (obj = this.f56499) != null) {
            ((View) obj).removeCallbacks(runnableC13518);
            this.f41778 = null;
            return true;
        }
        C10818 c10818 = this.f41792;
        if (c10818 == null) {
            return false;
        }
        c10818.m36140();
        return true;
    }

    @Override // l.AbstractC17357, l.InterfaceC5315
    public final void onCloseMenu(C9898 c9898, boolean z) {
        m32536();
        C8298 c8298 = this.f41783;
        if (c8298 != null) {
            c8298.m36140();
        }
        super.onCloseMenu(c9898, z);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m32541() {
        C10818 c10818 = this.f41792;
        return c10818 != null && c10818.m36151();
    }

    @Override // l.InterfaceC5315
    public final boolean flagActionItems() {
        int size;
        ArrayList visibleItems;
        boolean z;
        C9898 c9898 = this.f56497;
        View view = null;
        if (c9898 != null) {
            visibleItems = c9898.getVisibleItems();
            size = visibleItems.size();
        } else {
            size = 0;
            visibleItems = null;
        }
        int i = this.f41780;
        int i2 = this.f41782;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f56499;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            z = true;
            if (i3 >= size) {
                break;
            }
            C8407 c8407 = (C8407) visibleItems.get(i3);
            if (c8407.mo6060()) {
                i4++;
            } else if (c8407.m22602()) {
                i5++;
            } else {
                z2 = true;
            }
            if (this.f41787 && c8407.isActionViewExpanded()) {
                i = 0;
            }
            i3++;
        }
        if (this.f41785 && (z2 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        SparseBooleanArray sparseBooleanArray = this.f41779;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            C8407 c8408 = (C8407) visibleItems.get(i7);
            if (c8408.mo6060()) {
                View viewMo32528 = mo32528(c8408, view, viewGroup);
                viewMo32528.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewMo32528.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                int groupId = c8408.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, z);
                }
                c8408.m22601(z);
            } else if (c8408.m22602()) {
                int groupId2 = c8408.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i6 > 0 || z3) && i2 > 0;
                if (z4) {
                    View viewMo32529 = mo32528(c8408, view, viewGroup);
                    viewMo32529.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewMo32529.getMeasuredWidth();
                    i2 -= measuredWidth2;
                    if (i8 == 0) {
                        i8 = measuredWidth2;
                    }
                    z4 &= i2 + i8 > 0;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, z);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i9 = 0; i9 < i7; i9++) {
                        C8407 c8409 = (C8407) visibleItems.get(i9);
                        if (c8409.getGroupId() == groupId2) {
                            if (c8409.m22586()) {
                                i6++;
                            }
                            c8409.m22601(false);
                        }
                    }
                }
                if (z4) {
                    i6--;
                }
                c8408.m22601(z4);
            } else {
                c8408.m22601(false);
            }
            i7++;
            view = null;
            z = true;
        }
        return true;
    }

    @Override // l.InterfaceC5315
    public final Parcelable onSaveInstanceState() {
        C15293 c15293 = new C15293();
        c15293.f50002 = this.f41791;
        return c15293;
    }

    @Override // l.InterfaceC5315
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof C15293) && (i = ((C15293) parcelable).f50002) > 0 && (menuItemFindItem = this.f56497.findItem(i)) != null) {
            onSubMenuSelected((SubMenuC12026) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32532(C17531 c17531) {
        this.f56499 = c17531;
        c17531.initialize(this.f56497);
    }
}
