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

/* JADX INFO: renamed from: l.᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H56R */
/* JADX INFO: loaded from: classes5.dex */
public final class C21755 implements InterfaceC19535 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Drawable f70497;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Drawable f70498;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f70499;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5175 f70500;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f70501;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Drawable f70502;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f70503;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Drawable f70504;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public View f70505;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public CharSequence f70506;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C6938 f70507;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Window.Callback f70508;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f70509;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public CharSequence f70510;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public CharSequence f70511;

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ۘ */
    public final void mo44620() {
    }

    public C21755(C6938 c6938, boolean z) {
        Drawable drawable;
        this.f70503 = 0;
        this.f70507 = c6938;
        this.f70506 = c6938.getTitle();
        this.f70511 = c6938.getSubtitle();
        this.f70509 = this.f70506 != null;
        this.f70502 = c6938.getNavigationIcon();
        C1977 c1977M6353 = C1977.m6353(c6938.getContext(), null, C12108.f40515, R.attr.MT_Protector, 0);
        int i = 15;
        this.f70498 = c1977M6353.m6370(15);
        if (z) {
            CharSequence charSequenceM6368 = c1977M6353.m6368(27);
            if (!TextUtils.isEmpty(charSequenceM6368)) {
                this.f70509 = true;
                this.f70506 = charSequenceM6368;
                if ((this.f70501 & 8) != 0) {
                    c6938.setTitle(charSequenceM6368);
                    if (this.f70509) {
                        C5031.m13986(c6938.getRootView(), charSequenceM6368);
                    }
                }
            }
            CharSequence charSequenceM6369 = c1977M6353.m6368(25);
            if (!TextUtils.isEmpty(charSequenceM6369)) {
                this.f70511 = charSequenceM6369;
                if ((this.f70501 & 8) != 0) {
                    c6938.setSubtitle(charSequenceM6369);
                }
            }
            Drawable drawableM6370 = c1977M6353.m6370(20);
            if (drawableM6370 != null) {
                this.f70504 = drawableM6370;
                m48517();
            }
            Drawable drawableM6371 = c1977M6353.m6370(17);
            if (drawableM6371 != null) {
                this.f70497 = drawableM6371;
                m48517();
            }
            if (this.f70502 == null && (drawable = this.f70498) != null) {
                mo44623(drawable);
            }
            mo44622(c1977M6353.m6381(10, 0));
            int iM6387 = c1977M6353.m6387(9, 0);
            if (iM6387 != 0) {
                View viewInflate = LayoutInflater.from(c6938.getContext()).inflate(iM6387, (ViewGroup) c6938, false);
                View view = this.f70505;
                if (view != null && (this.f70501 & 16) != 0) {
                    c6938.removeView(view);
                }
                this.f70505 = viewInflate;
                if (viewInflate != null && (this.f70501 & 16) != 0) {
                    c6938.addView(viewInflate);
                }
                mo44622(this.f70501 | 16);
            }
            int iM6377 = c1977M6353.m6377(13, 0);
            if (iM6377 > 0) {
                ViewGroup.LayoutParams layoutParams = c6938.getLayoutParams();
                layoutParams.height = iM6377;
                c6938.setLayoutParams(layoutParams);
            }
            int iM6374 = c1977M6353.m6374(7, -1);
            int iM6375 = c1977M6353.m6374(3, -1);
            if (iM6374 >= 0 || iM6375 >= 0) {
                c6938.setContentInsetsRelative(Math.max(iM6374, 0), Math.max(iM6375, 0));
            }
            int iM6388 = c1977M6353.m6387(28, 0);
            if (iM6388 != 0) {
                c6938.setTitleTextAppearance(c6938.getContext(), iM6388);
            }
            int iM6389 = c1977M6353.m6387(26, 0);
            if (iM6389 != 0) {
                c6938.setSubtitleTextAppearance(c6938.getContext(), iM6389);
            }
            int iM63810 = c1977M6353.m6387(22, 0);
            if (iM63810 != 0) {
                c6938.setPopupTheme(iM63810);
            }
        } else {
            if (c6938.getNavigationIcon() != null) {
                this.f70498 = c6938.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f70501 = i;
        }
        c1977M6353.m6379();
        if (R.string.MT_Protector != this.f70503) {
            this.f70503 = R.string.MT_Protector;
            if (TextUtils.isEmpty(c6938.getNavigationContentDescription())) {
                mo44633(this.f70503);
            }
        }
        this.f70510 = c6938.getNavigationContentDescription();
        c6938.setNavigationOnClickListener(new ViewOnClickListenerC23167(this));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C6938 m48520() {
        return this.f70507;
    }

    @Override // l.InterfaceC19535
    public final Context getContext() {
        return this.f70507.getContext();
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ܰ */
    public final void mo44633(int i) {
        this.f70510 = i == 0 ? null : this.f70507.getContext().getString(i);
        m48518();
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo44618() {
        return this.f70507.hasExpandedActionView();
    }

    @Override // l.InterfaceC19535
    public final void collapseActionView() {
        this.f70507.collapseActionView();
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ۙ */
    public final void mo44625(Window.Callback callback) {
        this.f70508 = callback;
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ۙ */
    public final void mo44626(CharSequence charSequence) {
        if (this.f70509) {
            return;
        }
        this.f70506 = charSequence;
        if ((this.f70501 & 8) != 0) {
            C6938 c6938 = this.f70507;
            c6938.setTitle(charSequence);
            if (this.f70509) {
                C5031.m13986(c6938.getRootView(), charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m48517() {
        Drawable drawable;
        int i = this.f70501;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f70504) == null) {
            drawable = this.f70497;
        }
        this.f70507.setLogo(drawable);
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo44628() {
        return this.f70507.canShowOverflowMenu();
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo44619() {
        return this.f70507.isOverflowMenuShowing();
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo44635() {
        return this.f70507.isOverflowMenuShowPending();
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo44631() {
        return this.f70507.showOverflowMenu();
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo44634() {
        return this.f70507.hideOverflowMenu();
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ۚ */
    public final void mo44629() {
        this.f70499 = true;
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ۙ */
    public final void mo44624(Menu menu, InterfaceC5092 interfaceC5092) {
        C5175 c5175 = this.f70500;
        C6938 c6938 = this.f70507;
        if (c5175 == null) {
            C5175 c5176 = new C5175(c6938.getContext());
            this.f70500 = c5176;
            c5176.m50864(R.id.MT_Protector);
        }
        this.f70500.setCallback(interfaceC5092);
        c6938.setMenu((C12418) menu, this.f70500);
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ۬ */
    public final void mo44632() {
        this.f70507.dismissPopupMenus();
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ۜ */
    public final int mo44630() {
        return this.f70501;
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ۙ */
    public final void mo44622(int i) {
        View view;
        int i2 = this.f70501 ^ i;
        this.f70501 = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            C6938 c6938 = this.f70507;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    m48518();
                }
                if ((this.f70501 & 4) != 0) {
                    Drawable drawable = this.f70502;
                    if (drawable == null) {
                        drawable = this.f70498;
                    }
                    c6938.setNavigationIcon(drawable);
                } else {
                    c6938.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m48517();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    c6938.setTitle(this.f70506);
                    c6938.setSubtitle(this.f70511);
                } else {
                    c6938.setTitle((CharSequence) null);
                    c6938.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f70505) == null) {
                return;
            }
            if ((i & 16) != 0) {
                c6938.addView(view);
            } else {
                c6938.removeView(view);
            }
        }
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ۙ */
    public final void mo44627(boolean z) {
        this.f70507.setCollapsible(z);
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ۙ */
    public final C20554 mo44621(int i, long j) {
        C20554 c20554M13980 = C5031.m13980(this.f70507);
        c20554M13980.m46323(i == 0 ? 1.0f : 0.0f);
        c20554M13980.m46324(j);
        c20554M13980.m46326(new C15406(this, i));
        return c20554M13980;
    }

    @Override // l.InterfaceC19535
    /* JADX INFO: renamed from: ۙ */
    public final void mo44623(Drawable drawable) {
        this.f70502 = drawable;
        int i = this.f70501 & 4;
        C6938 c6938 = this.f70507;
        if (i == 0) {
            c6938.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = this.f70498;
        }
        c6938.setNavigationIcon(drawable);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m48518() {
        if ((this.f70501 & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f70510);
            C6938 c6938 = this.f70507;
            if (zIsEmpty) {
                c6938.setNavigationContentDescription(this.f70503);
            } else {
                c6938.setNavigationContentDescription(this.f70510);
            }
        }
    }

    @Override // l.InterfaceC19535
    public final void setVisibility(int i) {
        this.f70507.setVisibility(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48519(InterfaceC5092 interfaceC5092, InterfaceC0422 interfaceC0422) {
        this.f70507.setMenuCallbacks(interfaceC5092, interfaceC0422);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Menu m48521() {
        return this.f70507.getMenu();
    }
}
