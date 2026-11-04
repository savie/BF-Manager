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
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC24071 extends AbstractC22469 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Context f77825;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f77826;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public View f77827;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f77828;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean f77829;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f77831;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f77834;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final int f77836;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final Handler f77837;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f77838;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public PopupWindow.OnDismissListener f77839;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f77840;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f77841;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f77842;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public View f77846;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC12772 f77848;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f77849;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f77847 = new ArrayList();

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f77830 = new ArrayList();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f77835 = new ViewTreeObserverOnGlobalLayoutListenerC23325(this);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final View.OnAttachStateChangeListener f77843 = new ViewOnAttachStateChangeListenerC3187(this);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC23674 f77833 = new C12136(this);

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f77845 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f77832 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f77844 = false;

    @Override // l.InterfaceC5315
    public final boolean flagActionItems() {
        return false;
    }

    @Override // l.InterfaceC5315
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // l.InterfaceC5315
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    public ViewOnKeyListenerC24071(Context context, View view, int i, boolean z) {
        this.f77825 = context;
        this.f77846 = view;
        this.f77836 = i;
        this.f77829 = z;
        this.f77828 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f77831 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.MT_Protector));
        this.f77837 = new Handler();
    }

    @Override // l.AbstractC22469
    /* JADX INFO: renamed from: ۙ */
    public final void mo50670(boolean z) {
        this.f77844 = z;
    }

    @Override // l.InterfaceC16501
    public final void show() {
        if (isShowing()) {
            return;
        }
        ArrayList arrayList = this.f77847;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m53624((C9898) it.next());
        }
        arrayList.clear();
        View view = this.f77846;
        this.f77827 = view;
        if (view != null) {
            boolean z = this.f77849 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f77849 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f77835);
            }
            this.f77827.addOnAttachStateChangeListener(this.f77843);
        }
    }

    @Override // l.InterfaceC16501
    public final void dismiss() {
        ArrayList arrayList = this.f77830;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        C6171[] c6171Arr = (C6171[]) arrayList.toArray(new C6171[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C6171 c6171 = c6171Arr[size];
            if (c6171.f21024.isShowing()) {
                c6171.f21024.dismiss();
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

    @Override // l.AbstractC22469
    /* JADX INFO: renamed from: ۙ */
    public final void mo50669(C9898 c9898) {
        c9898.addMenuPresenter(this, this.f77825);
        if (isShowing()) {
            m53624(c9898);
        } else {
            this.f77847.add(c9898);
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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m53624(C9898 c9898) {
        boolean z;
        C6171 c6171;
        char c;
        View childAt;
        ListView listViewMo39127;
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
        C0204 c0204;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f77825;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C0204 c0205 = new C0204(c9898, layoutInflaterFrom, this.f77829, R.layout.MT_Protector);
        if (!isShowing() && this.f77844) {
            c0205.m1606(true);
        } else if (isShowing()) {
            int size = c9898.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = c9898.getItem(i5);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            c0205.m1606(z);
        }
        int iM50663 = AbstractC22469.m50663(c0205, context, this.f77831);
        C6520 c6520 = new C6520(context, null, this.f77836, 0);
        c6520.m18399(this.f77833);
        c6520.m39945((AdapterView.OnItemClickListener) this);
        c6520.m39947((PopupWindow.OnDismissListener) this);
        c6520.m39944(this.f77846);
        c6520.m39958(this.f77832);
        c6520.m39956();
        c6520.m39955();
        c6520.mo18835(c0205);
        c6520.m39961(iM50663);
        c6520.m39958(this.f77832);
        ArrayList arrayList = this.f77830;
        if (arrayList.size() > 0) {
            c6171 = (C6171) j$$ExternalSyntheticOutline0.m(arrayList, 1);
            C9898 c9899 = c6171.f21023;
            int size2 = c9899.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    item = null;
                    break;
                }
                item = c9899.getItem(i6);
                if (item.hasSubMenu() && c9898 == item.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (item != null) {
                ListView listViewMo39128 = c6171.f21024.mo39127();
                ListAdapter adapter = listViewMo39128.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0204 = (C0204) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0204 = (C0204) adapter;
                    headersCount = 0;
                }
                int count = c0204.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == c0204.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                childAt = (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - listViewMo39128.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewMo39128.getChildCount()) ? listViewMo39128.getChildAt(firstVisiblePosition) : null;
                if (childAt != null) {
                    c6520.m18400();
                    c6520.m18401();
                    listViewMo39127 = ((C6171) arrayList.get(arrayList.size() - 1)).f21024.mo39127();
                    iArr = new int[2];
                    listViewMo39127.getLocationOnScreen(iArr);
                    rect = new Rect();
                    this.f77827.getWindowVisibleDisplayFrame(rect);
                    if (this.f77828 == 1) {
                        if (listViewMo39127.getWidth() + iArr[c] + iM50663 > rect.right) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                    } else if (iArr[c] - iM50663 < 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (i == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f77828 = i;
                    if (Build.VERSION.SDK_INT >= 26) {
                        c6520.m39944(childAt);
                        i3 = 0;
                        i2 = 0;
                    } else {
                        iArr2 = new int[2];
                        this.f77846.getLocationOnScreen(iArr2);
                        iArr3 = new int[2];
                        childAt.getLocationOnScreen(iArr3);
                        if ((this.f77832 & 7) == 5) {
                            iArr2[c] = this.f77846.getWidth() + iArr2[c];
                            iArr3[c] = childAt.getWidth() + iArr3[c];
                        }
                        i2 = iArr3[c] - iArr2[c];
                        i3 = iArr3[1] - iArr2[1];
                    }
                    if ((this.f77832 & 5) == 5) {
                        if (z2) {
                            i4 = i2 + iM50663;
                        } else {
                            iM50663 = childAt.getWidth();
                            i4 = i2 - iM50663;
                        }
                    } else if (z2) {
                        iM50663 = childAt.getWidth();
                        i4 = i2 + iM50663;
                    } else {
                        i4 = i2 - iM50663;
                    }
                    c6520.m39942(i4);
                    c6520.m39954();
                    c6520.m39959(i3);
                } else {
                    if (this.f77826) {
                        c6520.m39942(this.f77841);
                    }
                    if (this.f77834) {
                        c6520.m39959(this.f77842);
                    }
                    c6520.m39943(m50664());
                }
                arrayList.add(new C6171(c6520, c9898, this.f77828));
                c6520.show();
                ListView listViewMo39129 = c6520.mo39127();
                listViewMo39129.setOnKeyListener(this);
                if (c6171 == null || !this.f77838 || c9898.getHeaderTitle() == null) {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.MT_Protector, (ViewGroup) listViewMo39129, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                frameLayout.setEnabled(false);
                textView.setText(c9898.getHeaderTitle());
                listViewMo39129.addHeaderView(frameLayout, null, false);
                c6520.show();
                return;
            }
            c = 0;
            if (childAt != null) {
                c6520.m18400();
                c6520.m18401();
                listViewMo39127 = ((C6171) arrayList.get(arrayList.size() - 1)).f21024.mo39127();
                iArr = new int[2];
                listViewMo39127.getLocationOnScreen(iArr);
                rect = new Rect();
                this.f77827.getWindowVisibleDisplayFrame(rect);
                if (this.f77828 == 1) {
                    if (listViewMo39127.getWidth() + iArr[c] + iM50663 > rect.right) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                } else if (iArr[c] - iM50663 < 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (i == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f77828 = i;
                if (Build.VERSION.SDK_INT >= 26) {
                    c6520.m39944(childAt);
                    i3 = 0;
                    i2 = 0;
                } else {
                    iArr2 = new int[2];
                    this.f77846.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.f77832 & 7) == 5) {
                        iArr2[c] = this.f77846.getWidth() + iArr2[c];
                        iArr3[c] = childAt.getWidth() + iArr3[c];
                    }
                    i2 = iArr3[c] - iArr2[c];
                    i3 = iArr3[1] - iArr2[1];
                }
                if ((this.f77832 & 5) == 5) {
                    if (z2) {
                        i4 = i2 + iM50663;
                    } else {
                        iM50663 = childAt.getWidth();
                        i4 = i2 - iM50663;
                    }
                } else if (z2) {
                    iM50663 = childAt.getWidth();
                    i4 = i2 + iM50663;
                } else {
                    i4 = i2 - iM50663;
                }
                c6520.m39942(i4);
                c6520.m39954();
                c6520.m39959(i3);
            } else {
                if (this.f77826) {
                    c6520.m39942(this.f77841);
                }
                if (this.f77834) {
                    c6520.m39959(this.f77842);
                }
                c6520.m39943(m50664());
            }
            arrayList.add(new C6171(c6520, c9898, this.f77828));
            c6520.show();
            ListView listViewMo391210 = c6520.mo39127();
            listViewMo391210.setOnKeyListener(this);
            if (c6171 == null) {
            }
        }
        c6171 = null;
        c = 0;
        childAt = null;
        if (childAt != null) {
            c6520.m18400();
            c6520.m18401();
            listViewMo39127 = ((C6171) arrayList.get(arrayList.size() - 1)).f21024.mo39127();
            iArr = new int[2];
            listViewMo39127.getLocationOnScreen(iArr);
            rect = new Rect();
            this.f77827.getWindowVisibleDisplayFrame(rect);
            if (this.f77828 == 1) {
                if (listViewMo39127.getWidth() + iArr[c] + iM50663 > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[c] - iM50663 < 0) {
                i = 1;
            } else {
                i = 0;
            }
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f77828 = i;
            if (Build.VERSION.SDK_INT >= 26) {
                c6520.m39944(childAt);
                i3 = 0;
                i2 = 0;
            } else {
                iArr2 = new int[2];
                this.f77846.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f77832 & 7) == 5) {
                    iArr2[c] = this.f77846.getWidth() + iArr2[c];
                    iArr3[c] = childAt.getWidth() + iArr3[c];
                }
                i2 = iArr3[c] - iArr2[c];
                i3 = iArr3[1] - iArr2[1];
            }
            if ((this.f77832 & 5) == 5) {
                if (z2) {
                    i4 = i2 + iM50663;
                } else {
                    iM50663 = childAt.getWidth();
                    i4 = i2 - iM50663;
                }
            } else if (z2) {
                iM50663 = childAt.getWidth();
                i4 = i2 + iM50663;
            } else {
                i4 = i2 - iM50663;
            }
            c6520.m39942(i4);
            c6520.m39954();
            c6520.m39959(i3);
        } else {
            if (this.f77826) {
                c6520.m39942(this.f77841);
            }
            if (this.f77834) {
                c6520.m39959(this.f77842);
            }
            c6520.m39943(m50664());
        }
        arrayList.add(new C6171(c6520, c9898, this.f77828));
        c6520.show();
        ListView listViewMo391211 = c6520.mo39127();
        listViewMo391211.setOnKeyListener(this);
        if (c6171 == null) {
        }
    }

    @Override // l.InterfaceC16501
    public final boolean isShowing() {
        ArrayList arrayList = this.f77830;
        return arrayList.size() > 0 && ((C6171) arrayList.get(0)).f21024.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C6171 c6171;
        ArrayList arrayList = this.f77830;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c6171 = null;
                break;
            }
            c6171 = (C6171) arrayList.get(i);
            if (!c6171.f21024.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c6171 != null) {
            c6171.f21023.close(false);
        }
    }

    @Override // l.InterfaceC5315
    public final void updateMenuView(boolean z) {
        Iterator it = this.f77830.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C6171) it.next()).f21024.mo39127().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0204) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC5315
    public final void setCallback(InterfaceC12772 interfaceC12772) {
        this.f77848 = interfaceC12772;
    }

    @Override // l.InterfaceC5315
    public final boolean onSubMenuSelected(SubMenuC12026 subMenuC12026) {
        for (C6171 c6171 : this.f77830) {
            if (subMenuC12026 == c6171.f21023) {
                c6171.f21024.mo39127().requestFocus();
                return true;
            }
        }
        if (!subMenuC12026.hasVisibleItems()) {
            return false;
        }
        mo50669(subMenuC12026);
        InterfaceC12772 interfaceC12772 = this.f77848;
        if (interfaceC12772 != null) {
            interfaceC12772.mo6418(subMenuC12026);
        }
        return true;
    }

    @Override // l.InterfaceC5315
    public final void onCloseMenu(C9898 c9898, boolean z) {
        ArrayList arrayList = this.f77830;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c9898 == ((C6171) arrayList.get(i)).f21023) {
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
            ((C6171) arrayList.get(i2)).f21023.close(false);
        }
        C6171 c6171 = (C6171) arrayList.remove(i);
        C9898 c9899 = c6171.f21023;
        C6520 c6520 = c6171.f21024;
        c9899.removeMenuPresenter(this);
        if (this.f77840) {
            c6520.m18395();
            c6520.m39962();
        }
        c6520.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f77828 = ((C6171) arrayList.get(size2 - 1)).f21025;
        } else {
            this.f77828 = this.f77846.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C6171) arrayList.get(0)).f21023.close(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC12772 interfaceC12772 = this.f77848;
        if (interfaceC12772 != null) {
            interfaceC12772.onCloseMenu(c9898, true);
        }
        ViewTreeObserver viewTreeObserver = this.f77849;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f77849.removeGlobalOnLayoutListener(this.f77835);
            }
            this.f77849 = null;
        }
        this.f77827.removeOnAttachStateChangeListener(this.f77843);
        this.f77839.onDismiss();
    }

    @Override // l.AbstractC22469
    /* JADX INFO: renamed from: ۙ */
    public final void mo50665(int i) {
        if (this.f77845 != i) {
            this.f77845 = i;
            this.f77832 = Gravity.getAbsoluteGravity(i, this.f77846.getLayoutDirection());
        }
    }

    @Override // l.AbstractC22469
    /* JADX INFO: renamed from: ۙ */
    public final void mo50667(View view) {
        if (this.f77846 != view) {
            this.f77846 = view;
            this.f77832 = Gravity.getAbsoluteGravity(this.f77845, view.getLayoutDirection());
        }
    }

    @Override // l.AbstractC22469
    /* JADX INFO: renamed from: ۙ */
    public final void mo50668(PopupWindow.OnDismissListener onDismissListener) {
        this.f77839 = onDismissListener;
    }

    @Override // l.InterfaceC16501
    /* JADX INFO: renamed from: ᩸ */
    public final ListView mo39127() {
        ArrayList arrayList = this.f77830;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C6171) j$$ExternalSyntheticOutline0.m(arrayList, 1)).f21024.mo39127();
    }

    @Override // l.AbstractC22469
    /* JADX INFO: renamed from: ᩷ */
    public final void mo50672(int i) {
        this.f77826 = true;
        this.f77841 = i;
    }

    @Override // l.AbstractC22469
    /* JADX INFO: renamed from: ۤ */
    public final void mo50671(int i) {
        this.f77834 = true;
        this.f77842 = i;
    }

    @Override // l.AbstractC22469
    /* JADX INFO: renamed from: ᩷ */
    public final void mo50673(boolean z) {
        this.f77838 = z;
    }
}
