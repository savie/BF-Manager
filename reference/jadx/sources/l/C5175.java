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

/* JADX INFO: renamed from: l.ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes3.dex */
public final class C5175 extends AbstractC23001 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C14266 f17950;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C23438 f17951;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C4469 f17952;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f17953;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public RunnableC1564 f17954;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f17955;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public Drawable f17956;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f17957;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f17958;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C2975 f17959;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final C13643 f17960;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f17961;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f17962;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f17963;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17964;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17965;

    public C5175(Context context) {
        super(context);
        this.f17962 = new SparseBooleanArray();
        this.f17960 = new C13643(this);
    }

    @Override // l.AbstractC23001, l.InterfaceC22026
    public final void initForMenu(Context context, C12418 c12418) {
        super.initForMenu(context, c12418);
        Resources resources = context.getResources();
        C0071 c0071M993 = C0071.m993(context);
        if (!this.f17965) {
            this.f17957 = true;
        }
        this.f17963 = c0071M993.m998();
        this.f17955 = c0071M993.m997();
        int measuredWidth = this.f17963;
        if (this.f17957) {
            if (this.f17959 == null) {
                C2975 c2975 = new C2975(this, this.f74748);
                this.f17959 = c2975;
                if (this.f17964) {
                    c2975.setImageDrawable(this.f17956);
                    this.f17956 = null;
                    this.f17964 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f17959.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f17959.getMeasuredWidth();
        } else {
            this.f17959 = null;
        }
        this.f17958 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m14341() {
        this.f17955 = C0071.m993(this.f74753).m997();
        C12418 c12418 = this.f74749;
        if (c12418 != null) {
            c12418.onItemsChanged(true);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m14332() {
        this.f17957 = true;
        this.f17965 = true;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m14345() {
        this.f17953 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14336(Drawable drawable) {
        C2975 c2975 = this.f17959;
        if (c2975 != null) {
            c2975.setImageDrawable(drawable);
        } else {
            this.f17964 = true;
            this.f17956 = drawable;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Drawable m14344() {
        C2975 c2975 = this.f17959;
        if (c2975 != null) {
            return c2975.getDrawable();
        }
        if (this.f17964) {
            return this.f17956;
        }
        return null;
    }

    @Override // l.AbstractC23001
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12854 mo14335(ViewGroup viewGroup) {
        InterfaceC12854 interfaceC12854 = this.f74747;
        InterfaceC12854 interfaceC12854Mo14335 = super.mo14335(viewGroup);
        if (interfaceC12854 != interfaceC12854Mo14335) {
            ((C22815) interfaceC12854Mo14335).m50497(this);
        }
        return interfaceC12854Mo14335;
    }

    @Override // l.AbstractC23001
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View mo14334(C23707 c23707, View view, ViewGroup viewGroup) {
        View actionView = c23707.getActionView();
        if (actionView == null || c23707.m52167()) {
            actionView = super.mo14334(c23707, view, viewGroup);
        }
        actionView.setVisibility(c23707.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((C22815) viewGroup).getClass();
        if (!(layoutParams instanceof C12937)) {
            actionView.setLayoutParams(C22815.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // l.AbstractC23001
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14338(C23707 c23707, InterfaceC0858 interfaceC0858) {
        interfaceC0858.initialize(c23707, 0);
        ViewOnClickListenerC6772 viewOnClickListenerC6772 = (ViewOnClickListenerC6772) interfaceC0858;
        viewOnClickListenerC6772.m18382((C22815) this.f74747);
        if (this.f17950 == null) {
            this.f17950 = new C14266(this);
        }
        viewOnClickListenerC6772.m18381(this.f17950);
    }

    @Override // l.AbstractC23001
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo14340(C23707 c23707) {
        return c23707.m52170();
    }

    @Override // l.AbstractC23001, l.InterfaceC22026
    public final void updateMenuView(boolean z) {
        super.updateMenuView(z);
        ((View) this.f74747).requestLayout();
        C12418 c12418 = this.f74749;
        boolean z2 = false;
        if (c12418 != null) {
            ArrayList actionItems = c12418.getActionItems();
            int size = actionItems.size();
            for (int i = 0; i < size; i++) {
                ((C23707) actionItems.get(i)).getClass();
            }
        }
        C12418 c12419 = this.f74749;
        ArrayList nonActionItems = c12419 != null ? c12419.getNonActionItems() : null;
        if (this.f17957 && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z2 = !((C23707) nonActionItems.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f17959 == null) {
                this.f17959 = new C2975(this, this.f74748);
            }
            ViewGroup viewGroup = (ViewGroup) this.f17959.getParent();
            if (viewGroup != this.f74747) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f17959);
                }
                C22815 c22815 = (C22815) this.f74747;
                C2975 c2975 = this.f17959;
                c22815.getClass();
                C12937 c12937GenerateDefaultLayoutParams = C22815.generateDefaultLayoutParams();
                c12937GenerateDefaultLayoutParams.f42999 = true;
                c22815.addView(c2975, c12937GenerateDefaultLayoutParams);
            }
        } else {
            C2975 c2976 = this.f17959;
            if (c2976 != null) {
                Object parent = c2976.getParent();
                Object obj = this.f74747;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f17959);
                }
            }
        }
        ((C22815) this.f74747).m50498(this.f17957);
    }

    @Override // l.AbstractC23001
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo14339(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f17959) {
            return false;
        }
        viewGroup.removeViewAt(i);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC23001, l.InterfaceC22026
    public final boolean onSubMenuSelected(SubMenuC7915 subMenuC7915) {
        boolean z = false;
        if (subMenuC7915.hasVisibleItems()) {
            SubMenuC7915 subMenuC7916 = subMenuC7915;
            while (subMenuC7916.getParentMenu() != this.f74749) {
                subMenuC7916 = (SubMenuC7915) subMenuC7916.getParentMenu();
            }
            MenuItem item = subMenuC7916.getItem();
            ViewGroup viewGroup = (ViewGroup) this.f74747;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof InterfaceC0858) && ((InterfaceC0858) childAt).getItemData() == item) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.f17961 = subMenuC7915.getItem().getItemId();
                int size = subMenuC7915.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItem item2 = subMenuC7915.getItem(i2);
                    if (item2.isVisible() && item2.getIcon() != null) {
                        z = true;
                        break;
                    }
                }
                C23438 c23438 = new C23438(this, this.f74753, subMenuC7915, view);
                this.f17951 = c23438;
                c23438.m6959(z);
                if (!this.f17951.m6952()) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                super.onSubMenuSelected(subMenuC7915);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m14343() {
        C12418 c12418;
        if (!this.f17957 || m14333() || (c12418 = this.f74749) == null || this.f74747 == null || this.f17954 != null || c12418.getNonActionItems().isEmpty()) {
            return false;
        }
        RunnableC1564 runnableC1564 = new RunnableC1564(this, new C4469(this, this.f74753, this.f74749, this.f17959));
        this.f17954 = runnableC1564;
        ((View) this.f74747).post(runnableC1564);
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m14342() {
        Object obj;
        RunnableC1564 runnableC1564 = this.f17954;
        if (runnableC1564 != null && (obj = this.f74747) != null) {
            ((View) obj).removeCallbacks(runnableC1564);
            this.f17954 = null;
            return true;
        }
        C4469 c4469 = this.f17952;
        if (c4469 == null) {
            return false;
        }
        c4469.m6954();
        return true;
    }

    @Override // l.AbstractC23001, l.InterfaceC22026
    public final void onCloseMenu(C12418 c12418, boolean z) {
        m14342();
        C23438 c23438 = this.f17951;
        if (c23438 != null) {
            c23438.m6954();
        }
        super.onCloseMenu(c12418, z);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m14333() {
        C4469 c4469 = this.f17952;
        return c4469 != null && c4469.m6953();
    }

    @Override // l.InterfaceC22026
    public final boolean flagActionItems() {
        int size;
        ArrayList visibleItems;
        boolean z;
        C12418 c12418 = this.f74749;
        View view = null;
        if (c12418 != null) {
            visibleItems = c12418.getVisibleItems();
            size = visibleItems.size();
        } else {
            size = 0;
            visibleItems = null;
        }
        int i = this.f17955;
        int i2 = this.f17958;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f74747;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            z = true;
            if (i3 >= size) {
                break;
            }
            C23707 c23707 = (C23707) visibleItems.get(i3);
            if (c23707.mo4159()) {
                i4++;
            } else if (c23707.m52183()) {
                i5++;
            } else {
                z2 = true;
            }
            if (this.f17953 && c23707.isActionViewExpanded()) {
                i = 0;
            }
            i3++;
        }
        if (this.f17957 && (z2 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        SparseBooleanArray sparseBooleanArray = this.f17962;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            C23707 c23708 = (C23707) visibleItems.get(i7);
            if (c23708.mo4159()) {
                View viewMo14334 = mo14334(c23708, view, viewGroup);
                viewMo14334.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewMo14334.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                int groupId = c23708.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, z);
                }
                c23708.m52169(z);
            } else if (c23708.m52183()) {
                int groupId2 = c23708.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i6 > 0 || z3) && i2 > 0;
                if (z4) {
                    View viewMo14335 = mo14334(c23708, view, viewGroup);
                    viewMo14335.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewMo14335.getMeasuredWidth();
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
                        C23707 c23709 = (C23707) visibleItems.get(i9);
                        if (c23709.getGroupId() == groupId2) {
                            if (c23709.m52170()) {
                                i6++;
                            }
                            c23709.m52169(false);
                        }
                    }
                }
                if (z4) {
                    i6--;
                }
                c23708.m52169(z4);
            } else {
                c23708.m52169(false);
            }
            i7++;
            view = null;
            z = true;
        }
        return true;
    }

    @Override // l.InterfaceC22026
    public final Parcelable onSaveInstanceState() {
        C2352 c2352 = new C2352();
        c2352.f8300 = this.f17961;
        return c2352;
    }

    @Override // l.InterfaceC22026
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof C2352) && (i = ((C2352) parcelable).f8300) > 0 && (menuItemFindItem = this.f74749.findItem(i)) != null) {
            onSubMenuSelected((SubMenuC7915) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14337(C22815 c22815) {
        this.f74747 = c22815;
        c22815.initialize(this.f74749);
    }
}
