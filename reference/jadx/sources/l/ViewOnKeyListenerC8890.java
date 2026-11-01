package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnKeyListenerC8890 extends AbstractC13560 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f30453;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC5092 f30455;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public PopupWindow.OnDismissListener f30456;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public View f30457;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean f30458;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final Handler f30461;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f30462;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f30463;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final int f30464;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f30468;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f30469;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Context f30470;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public View f30472;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f30473;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f30474;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f30475;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f30476;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f30467 = new ArrayList();

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f30466 = new ArrayList();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f30460 = new ViewTreeObserverOnGlobalLayoutListenerC21589(this);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final View.OnAttachStateChangeListener f30452 = new ViewOnAttachStateChangeListenerC18061(this);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC21839 f30454 = new C8184(this);

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f30459 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f30465 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f30471 = false;

    @Override // l.InterfaceC22026
    public final boolean flagActionItems() {
        return false;
    }

    @Override // l.InterfaceC22026
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // l.InterfaceC22026
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    public ViewOnKeyListenerC8890(Context context, View view, int i, boolean z) {
        this.f30470 = context;
        this.f30472 = view;
        this.f30464 = i;
        this.f30458 = z;
        this.f30468 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f30462 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.MT_Protector));
        this.f30461 = new Handler();
    }

    @Override // l.AbstractC13560
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23043(boolean z) {
        this.f30471 = z;
    }

    @Override // l.InterfaceC6503
    public final void show() {
        if (isShowing()) {
            return;
        }
        ArrayList arrayList = this.f30467;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m23038((C12418) it.next());
        }
        arrayList.clear();
        View view = this.f30472;
        this.f30457 = view;
        if (view != null) {
            boolean z = this.f30475 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f30475 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f30460);
            }
            this.f30457.addOnAttachStateChangeListener(this.f30452);
        }
    }

    @Override // l.InterfaceC6503
    public final void dismiss() {
        ArrayList arrayList = this.f30466;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        C19473[] c19473Arr = (C19473[]) arrayList.toArray(new C19473[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C19473 c19473 = c19473Arr[size];
            if (c19473.f62691.isShowing()) {
                c19473.f62691.dismiss();
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.AbstractC13560
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23042(C12418 c12418) {
        c12418.addMenuPresenter(this, this.f30470);
        if (isShowing()) {
            m23038(c12418);
        } else {
            this.f30467.add(c12418);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:60:0x0135  */
    /* JADX WARN: Code duplicated, block: B:62:0x013a  */
    /* JADX WARN: Code duplicated, block: B:63:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0141  */
    /* JADX WARN: Code duplicated, block: B:69:0x014b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x0163  */
    /* JADX WARN: Code duplicated, block: B:76:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x018b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0192  */
    /* JADX WARN: Code duplicated, block: B:81:0x0196 A[PHI: r5
      0x0196: PHI (r5v17 int) = (r5v16 int), (r5v8 int) binds: [B:80:0x0192, B:76:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0198 A[PHI: r5
      0x0198: PHI (r5v18 int) = (r5v8 int), (r5v19 int) binds: [B:79:0x0190, B:78:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d2  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m23038(C12418 c12418) {
        boolean z;
        C19473 c19473;
        char c;
        View childAt;
        ListView listViewMo17704;
        int[] iArr;
        Rect rect;
        int i;
        boolean z2;
        int[] iArr2;
        int[] iArr3;
        int i2;
        int i3;
        int i4;
        MenuItem item;
        C20179 c20179;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f30470;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C20179 c201710 = new C20179(c12418, layoutInflaterFrom, this.f30458, R.layout.MT_Protector);
        if (!isShowing() && this.f30471) {
            c201710.m45613(true);
        } else if (isShowing()) {
            int size = c12418.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = c12418.getItem(i5);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            c201710.m45613(z);
        }
        int iM33147 = AbstractC13560.m33147(c201710, context, this.f30462);
        C19723 c19723 = new C19723(context, null, this.f30464, 0);
        c19723.m44847(this.f30454);
        c19723.m18831((AdapterView.OnItemClickListener) this);
        c19723.m18834((PopupWindow.OnDismissListener) this);
        c19723.m18830(this.f30472);
        c19723.m18836(this.f30465);
        c19723.m18843();
        c19723.m18841();
        c19723.mo18833(c201710);
        c19723.m18824(iM33147);
        c19723.m18836(this.f30465);
        ArrayList arrayList = this.f30466;
        if (arrayList.size() > 0) {
            c19473 = (C19473) C19084.m43861(arrayList, 1);
            C12418 c12419 = c19473.f62690;
            int size2 = c12419.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    item = null;
                    break;
                }
                item = c12419.getItem(i6);
                if (item.hasSubMenu() && c12418 == item.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (item != null) {
                ListView listViewMo17705 = c19473.f62691.mo17704();
                ListAdapter adapter = listViewMo17705.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c20179 = (C20179) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c20179 = (C20179) adapter;
                    headersCount = 0;
                }
                int count = c20179.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == c20179.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                childAt = (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - listViewMo17705.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewMo17705.getChildCount()) ? listViewMo17705.getChildAt(firstVisiblePosition) : null;
                if (childAt != null) {
                    c19723.m44850();
                    c19723.m44849();
                    listViewMo17704 = ((C19473) arrayList.get(arrayList.size() - 1)).f62691.mo17704();
                    iArr = new int[2];
                    listViewMo17704.getLocationOnScreen(iArr);
                    rect = new Rect();
                    this.f30457.getWindowVisibleDisplayFrame(rect);
                    if (this.f30468 == 1) {
                        if (listViewMo17704.getWidth() + iArr[c] + iM33147 > rect.right) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                    } else if (iArr[c] - iM33147 < 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (i == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f30468 = i;
                    if (Build.VERSION.SDK_INT >= 26) {
                        c19723.m18830(childAt);
                        i3 = 0;
                        i2 = 0;
                    } else {
                        iArr2 = new int[2];
                        this.f30472.getLocationOnScreen(iArr2);
                        iArr3 = new int[2];
                        childAt.getLocationOnScreen(iArr3);
                        if ((this.f30465 & 7) == 5) {
                            iArr2[c] = this.f30472.getWidth() + iArr2[c];
                            iArr3[c] = childAt.getWidth() + iArr3[c];
                        }
                        i2 = iArr3[c] - iArr2[c];
                        i3 = iArr3[1] - iArr2[1];
                    }
                    if ((this.f30465 & 5) == 5) {
                        if (z2) {
                            i4 = i2 + iM33147;
                        } else {
                            iM33147 = childAt.getWidth();
                            i4 = i2 - iM33147;
                        }
                    } else if (z2) {
                        iM33147 = childAt.getWidth();
                        i4 = i2 + iM33147;
                    } else {
                        i4 = i2 - iM33147;
                    }
                    c19723.m18828(i4);
                    c19723.m18842();
                    c19723.m18840(i3);
                } else {
                    if (this.f30463) {
                        c19723.m18828(this.f30469);
                    }
                    if (this.f30476) {
                        c19723.m18840(this.f30473);
                    }
                    c19723.m18829(m33148());
                }
                arrayList.add(new C19473(c19723, c12418, this.f30468));
                c19723.show();
                ListView listViewMo17706 = c19723.mo17704();
                listViewMo17706.setOnKeyListener(this);
                if (c19473 == null || !this.f30453 || c12418.getHeaderTitle() == null) {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.MT_Protector, (ViewGroup) listViewMo17706, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                frameLayout.setEnabled(false);
                textView.setText(c12418.getHeaderTitle());
                listViewMo17706.addHeaderView(frameLayout, null, false);
                c19723.show();
                return;
            }
            c = 0;
            if (childAt != null) {
                c19723.m44850();
                c19723.m44849();
                listViewMo17704 = ((C19473) arrayList.get(arrayList.size() - 1)).f62691.mo17704();
                iArr = new int[2];
                listViewMo17704.getLocationOnScreen(iArr);
                rect = new Rect();
                this.f30457.getWindowVisibleDisplayFrame(rect);
                if (this.f30468 == 1) {
                    if (listViewMo17704.getWidth() + iArr[c] + iM33147 > rect.right) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                } else if (iArr[c] - iM33147 < 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (i == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f30468 = i;
                if (Build.VERSION.SDK_INT >= 26) {
                    c19723.m18830(childAt);
                    i3 = 0;
                    i2 = 0;
                } else {
                    iArr2 = new int[2];
                    this.f30472.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.f30465 & 7) == 5) {
                        iArr2[c] = this.f30472.getWidth() + iArr2[c];
                        iArr3[c] = childAt.getWidth() + iArr3[c];
                    }
                    i2 = iArr3[c] - iArr2[c];
                    i3 = iArr3[1] - iArr2[1];
                }
                if ((this.f30465 & 5) == 5) {
                    if (z2) {
                        i4 = i2 + iM33147;
                    } else {
                        iM33147 = childAt.getWidth();
                        i4 = i2 - iM33147;
                    }
                } else if (z2) {
                    iM33147 = childAt.getWidth();
                    i4 = i2 + iM33147;
                } else {
                    i4 = i2 - iM33147;
                }
                c19723.m18828(i4);
                c19723.m18842();
                c19723.m18840(i3);
            } else {
                if (this.f30463) {
                    c19723.m18828(this.f30469);
                }
                if (this.f30476) {
                    c19723.m18840(this.f30473);
                }
                c19723.m18829(m33148());
            }
            arrayList.add(new C19473(c19723, c12418, this.f30468));
            c19723.show();
            ListView listViewMo17707 = c19723.mo17704();
            listViewMo17707.setOnKeyListener(this);
            if (c19473 == null) {
            }
        }
        c19473 = null;
        c = 0;
        childAt = null;
        if (childAt != null) {
            c19723.m44850();
            c19723.m44849();
            listViewMo17704 = ((C19473) arrayList.get(arrayList.size() - 1)).f62691.mo17704();
            iArr = new int[2];
            listViewMo17704.getLocationOnScreen(iArr);
            rect = new Rect();
            this.f30457.getWindowVisibleDisplayFrame(rect);
            if (this.f30468 == 1) {
                if (listViewMo17704.getWidth() + iArr[c] + iM33147 > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[c] - iM33147 < 0) {
                i = 1;
            } else {
                i = 0;
            }
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f30468 = i;
            if (Build.VERSION.SDK_INT >= 26) {
                c19723.m18830(childAt);
                i3 = 0;
                i2 = 0;
            } else {
                iArr2 = new int[2];
                this.f30472.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f30465 & 7) == 5) {
                    iArr2[c] = this.f30472.getWidth() + iArr2[c];
                    iArr3[c] = childAt.getWidth() + iArr3[c];
                }
                i2 = iArr3[c] - iArr2[c];
                i3 = iArr3[1] - iArr2[1];
            }
            if ((this.f30465 & 5) == 5) {
                if (z2) {
                    i4 = i2 + iM33147;
                } else {
                    iM33147 = childAt.getWidth();
                    i4 = i2 - iM33147;
                }
            } else if (z2) {
                iM33147 = childAt.getWidth();
                i4 = i2 + iM33147;
            } else {
                i4 = i2 - iM33147;
            }
            c19723.m18828(i4);
            c19723.m18842();
            c19723.m18840(i3);
        } else {
            if (this.f30463) {
                c19723.m18828(this.f30469);
            }
            if (this.f30476) {
                c19723.m18840(this.f30473);
            }
            c19723.m18829(m33148());
        }
        arrayList.add(new C19473(c19723, c12418, this.f30468));
        c19723.show();
        ListView listViewMo17708 = c19723.mo17704();
        listViewMo17708.setOnKeyListener(this);
        if (c19473 == null) {
        }
    }

    @Override // l.InterfaceC6503
    public final boolean isShowing() {
        ArrayList arrayList = this.f30466;
        return arrayList.size() > 0 && ((C19473) arrayList.get(0)).f62691.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C19473 c19473;
        ArrayList arrayList = this.f30466;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c19473 = null;
                break;
            }
            c19473 = (C19473) arrayList.get(i);
            if (!c19473.f62691.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c19473 != null) {
            c19473.f62690.close(false);
        }
    }

    @Override // l.InterfaceC22026
    public final void updateMenuView(boolean z) {
        Iterator it = this.f30466.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C19473) it.next()).f62691.mo17704().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C20179) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC22026
    public final void setCallback(InterfaceC5092 interfaceC5092) {
        this.f30455 = interfaceC5092;
    }

    @Override // l.InterfaceC22026
    public final boolean onSubMenuSelected(SubMenuC7915 subMenuC7915) {
        for (C19473 c19473 : this.f30466) {
            if (subMenuC7915 == c19473.f62690) {
                c19473.f62691.mo17704().requestFocus();
                return true;
            }
        }
        if (!subMenuC7915.hasVisibleItems()) {
            return false;
        }
        mo23042(subMenuC7915);
        InterfaceC5092 interfaceC5092 = this.f30455;
        if (interfaceC5092 != null) {
            interfaceC5092.mo3701(subMenuC7915);
        }
        return true;
    }

    @Override // l.InterfaceC22026
    public final void onCloseMenu(C12418 c12418, boolean z) {
        ArrayList arrayList = this.f30466;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c12418 == ((C19473) arrayList.get(i)).f62690) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C19473) arrayList.get(i2)).f62690.close(false);
        }
        C19473 c19473 = (C19473) arrayList.remove(i);
        C12418 c12419 = c19473.f62690;
        C19723 c19723 = c19473.f62691;
        c12419.removeMenuPresenter(this);
        if (this.f30474) {
            c19723.m44848();
            c19723.m18845();
        }
        c19723.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f30468 = ((C19473) arrayList.get(size2 - 1)).f62692;
        } else {
            this.f30468 = this.f30472.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C19473) arrayList.get(0)).f62690.close(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC5092 interfaceC5092 = this.f30455;
        if (interfaceC5092 != null) {
            interfaceC5092.onCloseMenu(c12418, true);
        }
        ViewTreeObserver viewTreeObserver = this.f30475;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f30475.removeGlobalOnLayoutListener(this.f30460);
            }
            this.f30475 = null;
        }
        this.f30457.removeOnAttachStateChangeListener(this.f30452);
        this.f30456.onDismiss();
    }

    @Override // l.AbstractC13560
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23039(int i) {
        if (this.f30459 != i) {
            this.f30459 = i;
            this.f30465 = Gravity.getAbsoluteGravity(i, this.f30472.getLayoutDirection());
        }
    }

    @Override // l.AbstractC13560
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23040(View view) {
        if (this.f30472 != view) {
            this.f30472 = view;
            this.f30465 = Gravity.getAbsoluteGravity(this.f30459, view.getLayoutDirection());
        }
    }

    @Override // l.AbstractC13560
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23041(PopupWindow.OnDismissListener onDismissListener) {
        this.f30456 = onDismissListener;
    }

    @Override // l.InterfaceC6503
    /* JADX INFO: renamed from: ۖ */
    public final ListView mo17704() {
        ArrayList arrayList = this.f30466;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C19473) C19084.m43861(arrayList, 1)).f62691.mo17704();
    }

    @Override // l.AbstractC13560
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo23045(int i) {
        this.f30463 = true;
        this.f30469 = i;
    }

    @Override // l.AbstractC13560
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo23044(int i) {
        this.f30476 = true;
        this.f30473 = i;
    }

    @Override // l.AbstractC13560
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo23046(boolean z) {
        this.f30453 = z;
    }
}
