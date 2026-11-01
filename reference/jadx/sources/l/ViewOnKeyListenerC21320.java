package l;

import android.content.Context;
import android.content.res.Resources;
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
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4MC */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnKeyListenerC21320 extends AbstractC13560 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public View f69369;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f69370;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public PopupWindow.OnDismissListener f69371;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f69372;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C19723 f69373;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int f69374;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public View f69375;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f69377;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC5092 f69379;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f69380;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final int f69381;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12418 f69382;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Context f69384;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20179 f69385;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f69386;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f69387;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f69378 = new ViewTreeObserverOnGlobalLayoutListenerC22732(this);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final View.OnAttachStateChangeListener f69383 = new ViewOnAttachStateChangeListenerC14971(this);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f69376 = 0;

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

    @Override // l.AbstractC13560
    /* JADX INFO: renamed from: ۙ */
    public final void mo23042(C12418 c12418) {
    }

    public ViewOnKeyListenerC21320(Context context, C12418 c12418, View view, int i, boolean z) {
        this.f69384 = context;
        this.f69382 = c12418;
        this.f69377 = z;
        this.f69385 = new C20179(c12418, LayoutInflater.from(context), z, R.layout.MT_Protector);
        this.f69381 = i;
        Resources resources = context.getResources();
        this.f69374 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.MT_Protector));
        this.f69369 = view;
        this.f69373 = new C19723(context, null, i, 0);
        c12418.addMenuPresenter(this, context);
    }

    @Override // l.AbstractC13560
    /* JADX INFO: renamed from: ۙ */
    public final void mo23043(boolean z) {
        this.f69385.m45613(z);
    }

    @Override // l.AbstractC13560
    /* JADX INFO: renamed from: ۙ */
    public final void mo23039(int i) {
        this.f69376 = i;
    }

    @Override // l.InterfaceC6503
    public final void show() {
        View view;
        if (isShowing()) {
            return;
        }
        if (!this.f69370 && (view = this.f69369) != null) {
            this.f69375 = view;
            C19723 c19723 = this.f69373;
            c19723.m18834((PopupWindow.OnDismissListener) this);
            c19723.m18831((AdapterView.OnItemClickListener) this);
            c19723.m18843();
            View view2 = this.f69375;
            boolean z = this.f69386 == null;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f69386 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f69378);
            }
            view2.addOnAttachStateChangeListener(this.f69383);
            c19723.m18830(view2);
            c19723.m18836(this.f69376);
            boolean z2 = this.f69387;
            Context context = this.f69384;
            C20179 c20179 = this.f69385;
            if (!z2) {
                this.f69380 = AbstractC13560.m33147(c20179, context, this.f69374);
                this.f69387 = true;
            }
            c19723.m18824(this.f69380);
            c19723.m18841();
            c19723.m18829(m33148());
            c19723.show();
            ListView listViewMo17704 = c19723.mo17704();
            listViewMo17704.setOnKeyListener(this);
            if (this.f69372) {
                C12418 c12418 = this.f69382;
                if (c12418.getHeaderTitle() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) listViewMo17704, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(c12418.getHeaderTitle());
                    }
                    frameLayout.setEnabled(false);
                    listViewMo17704.addHeaderView(frameLayout, null, false);
                }
            }
            c19723.mo18833(c20179);
            c19723.show();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // l.InterfaceC6503
    public final void dismiss() {
        if (isShowing()) {
            this.f69373.dismiss();
        }
    }

    @Override // l.InterfaceC6503
    public final boolean isShowing() {
        return !this.f69370 && this.f69373.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f69370 = true;
        this.f69382.close();
        ViewTreeObserver viewTreeObserver = this.f69386;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f69386 = this.f69375.getViewTreeObserver();
            }
            this.f69386.removeGlobalOnLayoutListener(this.f69378);
            this.f69386 = null;
        }
        this.f69375.removeOnAttachStateChangeListener(this.f69383);
        PopupWindow.OnDismissListener onDismissListener = this.f69371;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // l.InterfaceC22026
    public final void updateMenuView(boolean z) {
        this.f69387 = false;
        C20179 c20179 = this.f69385;
        if (c20179 != null) {
            c20179.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC22026
    public final void setCallback(InterfaceC5092 interfaceC5092) {
        this.f69379 = interfaceC5092;
    }

    @Override // l.InterfaceC22026
    public final boolean onSubMenuSelected(SubMenuC7915 subMenuC7915) {
        boolean z;
        if (subMenuC7915.hasVisibleItems()) {
            C2269 c2269 = new C2269(this.f69384, subMenuC7915, this.f69375, this.f69377, this.f69381, 0);
            c2269.m6958(this.f69379);
            int size = subMenuC7915.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC7915.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c2269.m6959(z);
            c2269.m6957(this.f69371);
            this.f69371 = null;
            this.f69382.close(false);
            C19723 c19723 = this.f69373;
            int iM18826 = c19723.m18826();
            int iM18838 = c19723.m18838();
            if ((Gravity.getAbsoluteGravity(this.f69376, this.f69369.getLayoutDirection()) & 7) == 5) {
                iM18826 += this.f69369.getWidth();
            }
            if (c2269.m6960(iM18826, iM18838)) {
                InterfaceC5092 interfaceC5092 = this.f69379;
                if (interfaceC5092 != null) {
                    interfaceC5092.mo3701(subMenuC7915);
                }
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC22026
    public final void onCloseMenu(C12418 c12418, boolean z) {
        if (c12418 != this.f69382) {
            return;
        }
        dismiss();
        InterfaceC5092 interfaceC5092 = this.f69379;
        if (interfaceC5092 != null) {
            interfaceC5092.onCloseMenu(c12418, z);
        }
    }

    @Override // l.AbstractC13560
    /* JADX INFO: renamed from: ۙ */
    public final void mo23040(View view) {
        this.f69369 = view;
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
    /* JADX INFO: renamed from: ۙ */
    public final void mo23041(PopupWindow.OnDismissListener onDismissListener) {
        this.f69371 = onDismissListener;
    }

    @Override // l.InterfaceC6503
    /* JADX INFO: renamed from: ۖ */
    public final ListView mo17704() {
        return this.f69373.mo17704();
    }

    @Override // l.AbstractC13560
    /* JADX INFO: renamed from: ܰ */
    public final void mo23045(int i) {
        this.f69373.m18828(i);
    }

    @Override // l.AbstractC13560
    /* JADX INFO: renamed from: ۨ */
    public final void mo23044(int i) {
        this.f69373.m18840(i);
    }

    @Override // l.AbstractC13560
    /* JADX INFO: renamed from: ܰ */
    public final void mo23046(boolean z) {
        this.f69372 = z;
    }
}
