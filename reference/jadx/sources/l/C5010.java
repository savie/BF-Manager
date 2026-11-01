package l;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 45OX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5010 extends AbstractC10697 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC19849 f17427;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f17428;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public View f17429;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC19535 f17430;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2187 f17431;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Context f17432;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C2187 f17433;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f17434;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f17435;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f17436;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C10738 f17437;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f17438;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C13829 f17439;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20615 f17440;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f17441;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f17442;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15616 f17443;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f17444;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayList f17445;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Context f17446;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC15616 f17447;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f17448;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C19910 f17449;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC16300 f17450;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final AccelerateInterpolator f17426 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final DecelerateInterpolator f17425 = new DecelerateInterpolator();

    public C5010(Activity activity, boolean z) {
        new ArrayList();
        this.f17445 = new ArrayList();
        this.f17428 = 0;
        this.f17438 = true;
        this.f17436 = true;
        this.f17443 = new C4304(this);
        this.f17447 = new C13478(this);
        this.f17427 = new C11361(this);
        View decorView = activity.getWindow().getDecorView();
        m13881(decorView);
        if (z) {
            return;
        }
        this.f17429 = decorView.findViewById(R.id.content);
    }

    public C5010(Dialog dialog) {
        new ArrayList();
        this.f17445 = new ArrayList();
        this.f17428 = 0;
        this.f17438 = true;
        this.f17436 = true;
        this.f17443 = new C4304(this);
        this.f17447 = new C13478(this);
        this.f17427 = new C11361(this);
        m13881(dialog.getWindow().getDecorView());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13881(View view) {
        InterfaceC19535 wrapper;
        C10738 c10738 = (C10738) view.findViewById(bin.mt.plus.R.id.MT_Protector);
        this.f17437 = c10738;
        if (c10738 != null) {
            c10738.m26973(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(bin.mt.plus.R.id.MT_Protector);
        if (callbackFindViewById instanceof InterfaceC19535) {
            wrapper = (InterfaceC19535) callbackFindViewById;
        } else if (callbackFindViewById instanceof C6938) {
            wrapper = ((C6938) callbackFindViewById).getWrapper();
        } else {
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
        }
        this.f17430 = wrapper;
        this.f17449 = (C19910) view.findViewById(bin.mt.plus.R.id.MT_Protector);
        C20615 c20615 = (C20615) view.findViewById(bin.mt.plus.R.id.MT_Protector);
        this.f17440 = c20615;
        InterfaceC19535 interfaceC19535 = this.f17430;
        if (interfaceC19535 == null || this.f17449 == null || c20615 == null) {
            throw new IllegalStateException("WindowDecorActionBar can only be used with a compatible window decor layout");
        }
        this.f17432 = interfaceC19535.getContext();
        if ((this.f17430.mo44630() & 4) != 0) {
            this.f17441 = true;
        }
        C0071 c0071M993 = C0071.m993(this.f17432);
        c0071M993.m995();
        this.f17430.getClass();
        m13880(c0071M993.m999());
        TypedArray typedArrayObtainStyledAttributes = this.f17432.obtainStyledAttributes(null, C12108.f40515, bin.mt.plus.R.attr.MT_Protector, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            if (!this.f17437.m26972()) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f17444 = true;
            this.f17437.m26977(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            C5031.m13982(this.f17440, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo13899() {
        m13880(C0071.m993(this.f17432).m999());
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m13880(boolean z) {
        if (!z) {
            this.f17430.mo44620();
            this.f17440.getClass();
        } else {
            this.f17440.getClass();
            this.f17430.mo44620();
        }
        this.f17430.getClass();
        this.f17430.mo44627(false);
        this.f17437.m26974(false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13896(int i) {
        this.f17428 = i;
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo13884(boolean z) {
        C13829 c13829;
        this.f17434 = z;
        if (z || (c13829 = this.f17439) == null) {
            return;
        }
        c13829.m33651();
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13890(boolean z) {
        if (z == this.f17435) {
            return;
        }
        this.f17435 = z;
        ArrayList arrayList = this.f17445;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC5757) arrayList.get(i)).m15850();
        }
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13889(CharSequence charSequence) {
        this.f17430.mo44626(charSequence);
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo13895(boolean z) {
        int i = z ? 4 : 0;
        int iMo44630 = this.f17430.mo44630();
        this.f17441 = true;
        this.f17430.mo44622((i & 4) | (iMo44630 & (-5)));
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo13894() {
        return this.f17430.mo44630();
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12067 mo13886(InterfaceC16300 interfaceC16300) {
        C2187 c2187 = this.f17431;
        if (c2187 != null) {
            c2187.mo6784();
        }
        this.f17437.m26977(false);
        this.f17449.m45195();
        C2187 c2188 = new C2187(this, this.f17449.getContext(), interfaceC16300);
        if (!c2188.m6795()) {
            return null;
        }
        this.f17431 = c2188;
        c2188.mo6783();
        this.f17449.m45193(c2188);
        m13892(true);
        return c2188;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m13900(boolean z) {
        this.f17438 = z;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m13892(boolean z) {
        C20554 c20554Mo44621;
        C20554 c20554M45189;
        if (z) {
            if (!this.f17442) {
                this.f17442 = true;
                m13882(false);
            }
        } else if (this.f17442) {
            this.f17442 = false;
            m13882(false);
        }
        if (!this.f17440.isLaidOut()) {
            if (z) {
                this.f17430.setVisibility(4);
                this.f17449.setVisibility(0);
                return;
            } else {
                this.f17430.setVisibility(0);
                this.f17449.setVisibility(8);
                return;
            }
        }
        if (z) {
            c20554M45189 = this.f17430.mo44621(4, 100L);
            c20554Mo44621 = this.f17449.m45189(0, 200L);
        } else {
            c20554Mo44621 = this.f17430.mo44621(0, 200L);
            c20554M45189 = this.f17449.m45189(8, 100L);
        }
        C13829 c13829 = new C13829();
        c13829.m33655(c20554M45189, c20554Mo44621);
        c13829.m33650();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m13901() {
        if (this.f17448) {
            this.f17448 = false;
            m13882(true);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m13885() {
        if (this.f17448) {
            return;
        }
        this.f17448 = true;
        m13882(true);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m13882(boolean z) {
        boolean z2 = this.f17448;
        boolean z3 = this.f17442;
        InterfaceC19849 interfaceC19849 = this.f17427;
        View view = this.f17429;
        if (z3 || !z2) {
            if (this.f17436) {
                return;
            }
            this.f17436 = true;
            C13829 c13829 = this.f17439;
            if (c13829 != null) {
                c13829.m33651();
            }
            this.f17440.setVisibility(0);
            int i = this.f17428;
            InterfaceC15616 interfaceC15616 = this.f17447;
            if (i == 0 && (this.f17434 || z)) {
                this.f17440.setTranslationY(0.0f);
                float f = -this.f17440.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.f17440.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                this.f17440.setTranslationY(f);
                C13829 c138210 = new C13829();
                C20554 c20554M13980 = C5031.m13980(this.f17440);
                c20554M13980.m46330(0.0f);
                c20554M13980.m46327(interfaceC19849);
                c138210.m33654(c20554M13980);
                if (this.f17438 && view != null) {
                    view.setTranslationY(f);
                    C20554 c20554M13981 = C5031.m13980(view);
                    c20554M13981.m46330(0.0f);
                    c138210.m33654(c20554M13981);
                }
                c138210.m33652(f17425);
                c138210.m33656();
                c138210.m33653((C10336) interfaceC15616);
                this.f17439 = c138210;
                c138210.m33650();
            } else {
                this.f17440.setAlpha(1.0f);
                this.f17440.setTranslationY(0.0f);
                if (this.f17438 && view != null) {
                    view.setTranslationY(0.0f);
                }
                ((C13478) interfaceC15616).onAnimationEnd();
            }
            C10738 c10738 = this.f17437;
            if (c10738 != null) {
                C5031.m14002(c10738);
                return;
            }
            return;
        }
        if (this.f17436) {
            this.f17436 = false;
            C13829 c138211 = this.f17439;
            if (c138211 != null) {
                c138211.m33651();
            }
            int i2 = this.f17428;
            InterfaceC15616 interfaceC15617 = this.f17443;
            if (i2 == 0 && (this.f17434 || z)) {
                this.f17440.setAlpha(1.0f);
                this.f17440.m46480(true);
                C13829 c138212 = new C13829();
                float f2 = -this.f17440.getHeight();
                if (z) {
                    int[] iArr2 = {0, 0};
                    this.f17440.getLocationInWindow(iArr2);
                    f2 -= iArr2[1];
                }
                C20554 c20554M13982 = C5031.m13980(this.f17440);
                c20554M13982.m46330(f2);
                c20554M13982.m46327(interfaceC19849);
                c138212.m33654(c20554M13982);
                if (this.f17438 && view != null) {
                    C20554 c20554M13983 = C5031.m13980(view);
                    c20554M13983.m46330(f2);
                    c138212.m33654(c20554M13983);
                }
                c138212.m33652(f17426);
                c138212.m33656();
                c138212.m33653((C10336) interfaceC15617);
                this.f17439 = c138212;
                c138212.m33650();
                return;
            }
            ((C4304) interfaceC15617).onAnimationEnd();
        }
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Context mo13883() {
        if (this.f17446 == null) {
            TypedValue typedValue = new TypedValue();
            this.f17432.getTheme().resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f17446 = new ContextThemeWrapper(this.f17432, i);
            } else {
                this.f17446 = this.f17432;
            }
        }
        return this.f17446;
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13888(Drawable drawable) {
        this.f17430.mo44623(drawable);
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13887(int i) {
        this.f17430.mo44633(i);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m13893() {
        C13829 c13829 = this.f17439;
        if (c13829 != null) {
            c13829.m33651();
            this.f17439 = null;
        }
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo13898() {
        InterfaceC19535 interfaceC19535 = this.f17430;
        if (interfaceC19535 == null || !interfaceC19535.mo44618()) {
            return false;
        }
        this.f17430.collapseActionView();
        return true;
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo13897(boolean z) {
        if (this.f17441) {
            return;
        }
        mo13895(z);
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo13891(int i, KeyEvent keyEvent) {
        C12418 c12418Mo6791;
        C2187 c2187 = this.f17431;
        if (c2187 == null || (c12418Mo6791 = c2187.mo6791()) == null) {
            return false;
        }
        c12418Mo6791.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return c12418Mo6791.performShortcut(i, keyEvent, 0);
    }
}
