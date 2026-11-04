package l;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.alipay.sdk.m.y.c;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6HO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6996 extends ActionMode {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9898 f23073;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C2849 f23074;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f23081;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final View f23082;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f23085;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final View f23086;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ActionMode.Callback f23087;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f23088;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final RunnableC3547 f23090;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Rect f23077 = new Rect();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Rect f23079 = new Rect();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Rect f23084 = new Rect();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f23076 = new int[2];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f23080 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f23078 = true;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final RunnableC22487 f23089 = new RunnableC22487(1, this);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnPreDrawListenerC1030 f23083 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.֨۟ᩴ
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            this.f3742.m19321();
            return true;
        }
    };

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View.OnAttachStateChangeListener f23075 = new ViewOnAttachStateChangeListenerC2521(this);

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return null;
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return null;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return null;
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19319(C6996 c6996) {
        c6996.f23081 = false;
        c6996.m19321();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.֨۟ᩴ] */
    public C6996(View view, ActionMode.Callback callback, RunnableC3547 runnableC3547) {
        this.f23086 = view;
        this.f23082 = view.getRootView();
        this.f23087 = callback;
        this.f23090 = runnableC3547;
        C9898 c9898 = new C9898(view.getContext());
        this.f23073 = c9898;
        c9898.setDefaultShowAsAction(1);
        c9898.setCallback(new C8487(this, callback));
        C2849 c2849 = new C2849(view.getContext(), view);
        this.f23074 = c2849;
        EnumC8815 enumC8815 = EnumC8815.PREFER_SHOW_TITLE_ONLY;
        c2849.m9404(enumC8815, enumC8815);
        if (Build.VERSION.SDK_INT >= 23) {
            setType(1);
        }
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(new int[]{R.attr.textSelectHandleLeft, R.attr.textSelectHandleRight});
        int minimumHeight = 0;
        try {
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(1);
            int minimumHeight2 = drawable == null ? 0 : drawable.getMinimumHeight();
            if (drawable2 != null) {
                minimumHeight = drawable2.getMinimumHeight();
            }
            int iMax = Math.max(minimumHeight2, minimumHeight);
            typedArrayObtainStyledAttributes.recycle();
            this.f23085 = iMax;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6996 m19317(View view, ActionMode.Callback callback, RunnableC3547 runnableC3547) {
        if (!view.isAttachedToWindow()) {
            return null;
        }
        C6996 c6996 = new C6996(view, callback, runnableC3547);
        if (!callback.onCreateActionMode(c6996, c6996.f23073)) {
            return null;
        }
        view.addOnAttachStateChangeListener(c6996.f23075);
        view.getViewTreeObserver().addOnPreDrawListener(c6996.f23083);
        c6996.invalidate();
        return c6996;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m19323() {
        return this.f23086;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        if (this.f23088) {
            return;
        }
        this.f23087.onPrepareActionMode(this, this.f23073);
        this.f23078 = true;
        invalidateContentRect();
    }

    @Override // android.view.ActionMode
    public final void invalidateContentRect() {
        if (this.f23081 || this.f23088) {
            return;
        }
        View view = this.f23086;
        RunnableC22487 runnableC22487 = this.f23089;
        view.removeCallbacks(runnableC22487);
        view.post(runnableC22487);
    }

    @Override // android.view.ActionMode
    public final void hide(long j) {
        if (this.f23088) {
            return;
        }
        View view = this.f23086;
        RunnableC22487 runnableC22487 = this.f23089;
        view.removeCallbacks(runnableC22487);
        if (j == 0) {
            this.f23081 = false;
            m19321();
        } else {
            this.f23081 = true;
            this.f23074.m9405();
            view.postDelayed(runnableC22487, Math.min((j >= 0 || Build.VERSION.SDK_INT < 23) ? Math.max(0L, j) : ViewConfiguration.getDefaultActionModeHideDuration(), c.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m19321() {
        if (this.f23088) {
            return;
        }
        View view = this.f23086;
        if (view.isAttachedToWindow()) {
            View view2 = this.f23082;
            if (view != view2) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == view2) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
            if (this.f23081) {
                return;
            }
            boolean zIsShown = view.isShown();
            C2849 c2849 = this.f23074;
            if (zIsShown) {
                Rect rect = this.f23079;
                if (view.getLocalVisibleRect(rect)) {
                    int i = Build.VERSION.SDK_INT;
                    int i2 = this.f23085;
                    Rect rect2 = this.f23077;
                    if (i >= 23) {
                        ActionMode.Callback callback = this.f23087;
                        if (callback instanceof ActionMode.Callback2) {
                            ((ActionMode.Callback2) callback).onGetContentRect(this, view, rect2);
                        } else {
                            rect2.set(0, 0, view.getWidth(), view.getHeight() + i2);
                        }
                    } else {
                        rect2.set(0, 0, view.getWidth(), view.getHeight() + i2);
                    }
                    if (!Rect.intersects(rect2, rect)) {
                        c2849.m9405();
                        return;
                    }
                    rect.bottom += i2;
                    rect2.intersect(rect);
                    int[] iArr = this.f23076;
                    view.getLocationOnScreen(iArr);
                    rect2.offset(iArr[0], iArr[1]);
                    view2.getLocationOnScreen(iArr);
                    int i3 = iArr[0];
                    rect.set(i3, iArr[1], view2.getWidth() + i3, view2.getHeight() + iArr[1]);
                    if (!rect2.intersect(rect)) {
                        c2849.m9405();
                        return;
                    }
                    view2.getWindowVisibleDisplayFrame(rect);
                    if (!rect2.intersect(rect)) {
                        c2849.m9405();
                        return;
                    }
                    c2849.m9400(view.getRootView().getAlpha());
                    boolean z = this.f23078;
                    ArrayList arrayList = this.f23080;
                    if (z) {
                        arrayList.clear();
                        m19318(this.f23073);
                    }
                    boolean zIsEmpty = arrayList.isEmpty();
                    Rect rect3 = this.f23084;
                    if (zIsEmpty) {
                        c2849.m9405();
                    } else if (this.f23078 || !rect3.equals(rect2) || !c2849.m9408()) {
                        c2849.m9402(arrayList, new MenuItem.OnMenuItemClickListener() { // from class: l.ۡ۟ᩴ
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) {
                                return this.f30071.f23073.performItemAction(menuItem, 0);
                            }
                        }, rect2);
                    }
                    this.f23078 = false;
                    rect3.set(rect2);
                    return;
                }
            }
            c2849.m9405();
            return;
        }
        finish();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19318(Menu menu) {
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            if (item.isVisible() && item.isEnabled()) {
                if (item.hasSubMenu()) {
                    m19318(item.getSubMenu());
                } else {
                    this.f23080.add(item);
                }
            }
        }
    }

    @Override // android.view.ActionMode
    public final void finish() {
        RunnableC3547 runnableC3547 = this.f23090;
        if (this.f23088) {
            return;
        }
        this.f23088 = true;
        RunnableC22487 runnableC22487 = this.f23089;
        View view = this.f23086;
        view.removeCallbacks(runnableC22487);
        view.removeOnAttachStateChangeListener(this.f23075);
        View view2 = this.f23082;
        if (view2.getViewTreeObserver().isAlive()) {
            view2.getViewTreeObserver().removeOnPreDrawListener(this.f23083);
        }
        this.f23074.m9399();
        try {
            this.f23087.onDestroyActionMode(this);
        } finally {
            runnableC3547.run();
        }
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return this.f23073;
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f23086.getContext());
    }
}
