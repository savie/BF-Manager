package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H56R */
/* JADX INFO: loaded from: classes5.dex */
public final class C20866 implements InterfaceC6498 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f66784;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13056 f66785;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Drawable f66786;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f66787;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Drawable f66788;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Drawable f66789;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f66790;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C16390 f66791;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public CharSequence f66792;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f66793;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f66794;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public View f66795;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Drawable f66796;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Window.Callback f66797;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public CharSequence f66798;

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ֫ */
    public final void mo18333() {
    }

    public C20866(C16390 c16390, boolean z) {
        Drawable drawable;
        this.f66787 = 0;
        this.f66791 = c16390;
        this.f66792 = c16390.getTitle();
        this.f66798 = c16390.getSubtitle();
        this.f66793 = this.f66792 != null;
        this.f66788 = c16390.getNavigationIcon();
        C5204 c5204M15649 = C5204.m15649(c16390.getContext(), null, C10401.f33061, R.attr.MT_Protector, 0);
        int i = 15;
        this.f66796 = c5204M15649.m15669(15);
        if (z) {
            CharSequence charSequenceM15659 = c5204M15649.m15659(27);
            if (!TextUtils.isEmpty(charSequenceM15659)) {
                this.f66793 = true;
                this.f66792 = charSequenceM15659;
                if ((this.f66794 & 8) != 0) {
                    c16390.setTitle(charSequenceM15659);
                    if (this.f66793) {
                        C22666.m51091(c16390.getRootView(), charSequenceM15659);
                    }
                }
            }
            CharSequence charSequenceM156510 = c5204M15649.m15659(25);
            if (!TextUtils.isEmpty(charSequenceM156510)) {
                this.f66798 = charSequenceM156510;
                if ((this.f66794 & 8) != 0) {
                    c16390.setSubtitle(charSequenceM156510);
                }
            }
            Drawable drawableM15669 = c5204M15649.m15669(20);
            if (drawableM15669 != null) {
                this.f66786 = drawableM15669;
                m47690();
            }
            Drawable drawableM156610 = c5204M15649.m15669(17);
            if (drawableM156610 != null) {
                this.f66789 = drawableM156610;
                m47690();
            }
            if (this.f66788 == null && (drawable = this.f66796) != null) {
                mo18336(drawable);
            }
            mo18335(c5204M15649.m15657(10, 0));
            int iM15660 = c5204M15649.m15660(9, 0);
            if (iM15660 != 0) {
                View viewInflate = LayoutInflater.from(c16390.getContext()).inflate(iM15660, (ViewGroup) c16390, false);
                View view = this.f66795;
                if (view != null && (this.f66794 & 16) != 0) {
                    c16390.removeView(view);
                }
                this.f66795 = viewInflate;
                if (viewInflate != null && (this.f66794 & 16) != 0) {
                    c16390.addView(viewInflate);
                }
                mo18335(this.f66794 | 16);
            }
            int iM15662 = c5204M15649.m15662(13, 0);
            if (iM15662 > 0) {
                ViewGroup.LayoutParams layoutParams = c16390.getLayoutParams();
                layoutParams.height = iM15662;
                c16390.setLayoutParams(layoutParams);
            }
            int iM15652 = c5204M15649.m15652(7, -1);
            int iM15653 = c5204M15649.m15652(3, -1);
            if (iM15652 >= 0 || iM15653 >= 0) {
                c16390.setContentInsetsRelative(Math.max(iM15652, 0), Math.max(iM15653, 0));
            }
            int iM15661 = c5204M15649.m15660(28, 0);
            if (iM15661 != 0) {
                c16390.setTitleTextAppearance(c16390.getContext(), iM15661);
            }
            int iM15663 = c5204M15649.m15660(26, 0);
            if (iM15663 != 0) {
                c16390.setSubtitleTextAppearance(c16390.getContext(), iM15663);
            }
            int iM15664 = c5204M15649.m15660(22, 0);
            if (iM15664 != 0) {
                c16390.setPopupTheme(iM15664);
            }
        } else {
            if (c16390.getNavigationIcon() != null) {
                this.f66796 = c16390.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f66794 = i;
        }
        c5204M15649.m15664();
        if (R.string.MT_Protector != this.f66787) {
            this.f66787 = R.string.MT_Protector;
            if (TextUtils.isEmpty(c16390.getNavigationContentDescription())) {
                mo18348(this.f66787);
            }
        }
        this.f66790 = c16390.getNavigationContentDescription();
        c16390.setNavigationOnClickListener(new ViewOnClickListenerC23850(this));
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C16390 m47693() {
        return this.f66791;
    }

    @Override // l.InterfaceC6498
    public final Context getContext() {
        return this.f66791.getContext();
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ᩷ */
    public final void mo18348(int i) {
        this.f66790 = i == 0 ? null : this.f66791.getContext().getString(i);
        m47691();
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo18345() {
        return this.f66791.hasExpandedActionView();
    }

    @Override // l.InterfaceC6498
    public final void collapseActionView() {
        this.f66791.collapseActionView();
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ۙ */
    public final void mo18338(Window.Callback callback) {
        this.f66797 = callback;
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ۙ */
    public final void mo18339(CharSequence charSequence) {
        if (this.f66793) {
            return;
        }
        this.f66792 = charSequence;
        if ((this.f66794 & 8) != 0) {
            C16390 c16390 = this.f66791;
            c16390.setTitle(charSequence);
            if (this.f66793) {
                C22666.m51091(c16390.getRootView(), charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m47690() {
        Drawable drawable;
        int i = this.f66794;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f66786) == null) {
            drawable = this.f66789;
        }
        this.f66791.setLogo(drawable);
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18341() {
        return this.f66791.canShowOverflowMenu();
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo18350() {
        return this.f66791.isOverflowMenuShowing();
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo18346() {
        return this.f66791.isOverflowMenuShowPending();
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo18343() {
        return this.f66791.showOverflowMenu();
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo18349() {
        return this.f66791.hideOverflowMenu();
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ᩴ */
    public final void mo18347() {
        this.f66784 = true;
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ۙ */
    public final void mo18337(Menu menu, InterfaceC12772 interfaceC12772) {
        C13056 c13056 = this.f66785;
        C16390 c16390 = this.f66791;
        if (c13056 == null) {
            C13056 c13057 = new C13056(c16390.getContext());
            this.f66785 = c13057;
            c13057.m40781(R.id.MT_Protector);
        }
        this.f66785.setCallback(interfaceC12772);
        c16390.setMenu((C9898) menu, this.f66785);
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ۚ */
    public final void mo18342() {
        this.f66791.dismissPopupMenus();
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ۧ */
    public final int mo18344() {
        return this.f66794;
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ۙ */
    public final void mo18335(int i) {
        View view;
        int i2 = this.f66794 ^ i;
        this.f66794 = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            C16390 c16390 = this.f66791;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    m47691();
                }
                if ((this.f66794 & 4) != 0) {
                    Drawable drawable = this.f66788;
                    if (drawable == null) {
                        drawable = this.f66796;
                    }
                    c16390.setNavigationIcon(drawable);
                } else {
                    c16390.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m47690();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    c16390.setTitle(this.f66792);
                    c16390.setSubtitle(this.f66798);
                } else {
                    c16390.setTitle((CharSequence) null);
                    c16390.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f66795) == null) {
                return;
            }
            if ((i & 16) != 0) {
                c16390.addView(view);
            } else {
                c16390.removeView(view);
            }
        }
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ۙ */
    public final void mo18340(boolean z) {
        this.f66791.setCollapsible(z);
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ۙ */
    public final C24158 mo18334(int i, long j) {
        C24158 c24158M51085 = C22666.m51085(this.f66791);
        c24158M51085.m54120(i == 0 ? 1.0f : 0.0f);
        c24158M51085.m54121(j);
        c24158M51085.m54123(new C3712(this, i));
        return c24158M51085;
    }

    @Override // l.InterfaceC6498
    /* JADX INFO: renamed from: ۙ */
    public final void mo18336(Drawable drawable) {
        this.f66788 = drawable;
        int i = this.f66794 & 4;
        C16390 c16390 = this.f66791;
        if (i == 0) {
            c16390.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = this.f66796;
        }
        c16390.setNavigationIcon(drawable);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m47691() {
        if ((this.f66794 & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f66790);
            C16390 c16390 = this.f66791;
            if (zIsEmpty) {
                c16390.setNavigationContentDescription(this.f66787);
            } else {
                c16390.setNavigationContentDescription(this.f66790);
            }
        }
    }

    @Override // l.InterfaceC6498
    public final void setVisibility(int i) {
        this.f66791.setVisibility(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47692(InterfaceC12772 interfaceC12772, InterfaceC7662 interfaceC7662) {
        this.f66791.setMenuCallbacks(interfaceC12772, interfaceC7662);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Menu m47694() {
        return this.f66791.getMenu();
    }
}
