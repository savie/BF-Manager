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

/* JADX INFO: renamed from: l.᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C4MC */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC23215 extends AbstractC22469 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9898 f75208;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int f75209;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f75210;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f75211;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public PopupWindow.OnDismissListener f75212;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f75213;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC12772 f75215;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f75216;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C6520 f75217;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f75218;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f75219;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Context f75220;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public View f75221;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0204 f75222;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final int f75223;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f75224;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f75207 = new ViewTreeObserverOnGlobalLayoutListenerC17247(this);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final View.OnAttachStateChangeListener f75206 = new ViewOnAttachStateChangeListenerC15755(this);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f75214 = 0;

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

    @Override // l.AbstractC22469
    /* JADX INFO: renamed from: ۙ */
    public final void mo50669(C9898 c9898) {
    }

    public ViewOnKeyListenerC23215(Context context, C9898 c9898, View view, int i, boolean z) {
        this.f75220 = context;
        this.f75208 = c9898;
        this.f75210 = z;
        this.f75222 = new C0204(c9898, LayoutInflater.from(context), z, R.layout.MT_Protector);
        this.f75223 = i;
        Resources resources = context.getResources();
        this.f75209 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.MT_Protector));
        this.f75219 = view;
        this.f75217 = new C6520(context, null, i, 0);
        c9898.addMenuPresenter(this, context);
    }

    @Override // l.AbstractC22469
    /* JADX INFO: renamed from: ۙ */
    public final void mo50670(boolean z) {
        this.f75222.m1606(z);
    }

    @Override // l.AbstractC22469
    /* JADX INFO: renamed from: ۙ */
    public final void mo50665(int i) {
        this.f75214 = i;
    }

    @Override // l.InterfaceC16501
    public final void show() {
        View view;
        if (isShowing()) {
            return;
        }
        if (!this.f75216 && (view = this.f75219) != null) {
            this.f75221 = view;
            C6520 c6520 = this.f75217;
            c6520.m39947((PopupWindow.OnDismissListener) this);
            c6520.m39945((AdapterView.OnItemClickListener) this);
            c6520.m39956();
            View view2 = this.f75221;
            boolean z = this.f75218 == null;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f75218 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f75207);
            }
            view2.addOnAttachStateChangeListener(this.f75206);
            c6520.m39944(view2);
            c6520.m39958(this.f75214);
            boolean z2 = this.f75213;
            Context context = this.f75220;
            C0204 c0204 = this.f75222;
            if (!z2) {
                this.f75211 = AbstractC22469.m50663(c0204, context, this.f75209);
                this.f75213 = true;
            }
            c6520.m39961(this.f75211);
            c6520.m39955();
            c6520.m39943(m50664());
            c6520.show();
            ListView listViewMo39127 = c6520.mo39127();
            listViewMo39127.setOnKeyListener(this);
            if (this.f75224) {
                C9898 c9898 = this.f75208;
                if (c9898.getHeaderTitle() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) listViewMo39127, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(c9898.getHeaderTitle());
                    }
                    frameLayout.setEnabled(false);
                    listViewMo39127.addHeaderView(frameLayout, null, false);
                }
            }
            c6520.mo18835(c0204);
            c6520.show();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // l.InterfaceC16501
    public final void dismiss() {
        if (isShowing()) {
            this.f75217.dismiss();
        }
    }

    @Override // l.InterfaceC16501
    public final boolean isShowing() {
        return !this.f75216 && this.f75217.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f75216 = true;
        this.f75208.close();
        ViewTreeObserver viewTreeObserver = this.f75218;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f75218 = this.f75221.getViewTreeObserver();
            }
            this.f75218.removeGlobalOnLayoutListener(this.f75207);
            this.f75218 = null;
        }
        this.f75221.removeOnAttachStateChangeListener(this.f75206);
        PopupWindow.OnDismissListener onDismissListener = this.f75212;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // l.InterfaceC5315
    public final void updateMenuView(boolean z) {
        this.f75213 = false;
        C0204 c0204 = this.f75222;
        if (c0204 != null) {
            c0204.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC5315
    public final void setCallback(InterfaceC12772 interfaceC12772) {
        this.f75215 = interfaceC12772;
    }

    @Override // l.InterfaceC5315
    public final boolean onSubMenuSelected(SubMenuC12026 subMenuC12026) {
        boolean z;
        if (subMenuC12026.hasVisibleItems()) {
            C15009 c15009 = new C15009(this.f75220, subMenuC12026, this.f75221, this.f75210, this.f75223, 0);
            c15009.m36144(this.f75215);
            int size = subMenuC12026.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC12026.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c15009.m36145(z);
            c15009.m36143(this.f75212);
            this.f75212 = null;
            this.f75208.close(false);
            C6520 c6520 = this.f75217;
            int iM39941 = c6520.m39941();
            int iM39949 = c6520.m39949();
            if ((Gravity.getAbsoluteGravity(this.f75214, this.f75219.getLayoutDirection()) & 7) == 5) {
                iM39941 += this.f75219.getWidth();
            }
            if (c15009.m36146(iM39941, iM39949)) {
                InterfaceC12772 interfaceC12772 = this.f75215;
                if (interfaceC12772 != null) {
                    interfaceC12772.mo6418(subMenuC12026);
                }
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC5315
    public final void onCloseMenu(C9898 c9898, boolean z) {
        if (c9898 != this.f75208) {
            return;
        }
        dismiss();
        InterfaceC12772 interfaceC12772 = this.f75215;
        if (interfaceC12772 != null) {
            interfaceC12772.onCloseMenu(c9898, z);
        }
    }

    @Override // l.AbstractC22469
    /* JADX INFO: renamed from: ۙ */
    public final void mo50667(View view) {
        this.f75219 = view;
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
    public final void mo50668(PopupWindow.OnDismissListener onDismissListener) {
        this.f75212 = onDismissListener;
    }

    @Override // l.InterfaceC16501
    /* JADX INFO: renamed from: ᩸ */
    public final ListView mo39127() {
        return this.f75217.mo39127();
    }

    @Override // l.AbstractC22469
    /* JADX INFO: renamed from: ᩷ */
    public final void mo50672(int i) {
        this.f75217.m39942(i);
    }

    @Override // l.AbstractC22469
    /* JADX INFO: renamed from: ۤ */
    public final void mo50671(int i) {
        this.f75217.m39959(i);
    }

    @Override // l.AbstractC22469
    /* JADX INFO: renamed from: ᩷ */
    public final void mo50673(boolean z) {
        this.f75224 = z;
    }
}
