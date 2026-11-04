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

/* JADX INFO: renamed from: l.۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 45OX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13100 extends AbstractC2944 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AccelerateInterpolator f41858 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final DecelerateInterpolator f41859 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC6498 f41860;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f41861;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4020 f41862;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15337 f41863;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C22579 f41864;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2332 f41865;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f41866;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15337 f41867;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f41868;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f41869;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f41870;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C0094 f41871;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4020 f41872;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f41873;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f41874;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14460 f41875;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Context f41876;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayList f41877;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Context f41878;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C20977 f41879;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public View f41880;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f41881;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f41882;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC19067 f41883;

    public C13100(Activity activity, boolean z) {
        new ArrayList();
        this.f41877 = new ArrayList();
        this.f41869 = 0;
        this.f41866 = true;
        this.f41868 = true;
        this.f41872 = new C10862(this);
        this.f41862 = new C22797(this);
        this.f41875 = new C19813(this);
        View decorView = activity.getWindow().getDecorView();
        m32562(decorView);
        if (z) {
            return;
        }
        this.f41880 = decorView.findViewById(R.id.content);
    }

    public C13100(Dialog dialog) {
        new ArrayList();
        this.f41877 = new ArrayList();
        this.f41869 = 0;
        this.f41866 = true;
        this.f41868 = true;
        this.f41872 = new C10862(this);
        this.f41862 = new C22797(this);
        this.f41875 = new C19813(this);
        m32562(dialog.getWindow().getDecorView());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32562(View view) {
        InterfaceC6498 wrapper;
        C2332 c2332 = (C2332) view.findViewById(bin.mt.plus.R.id.MT_Protector);
        this.f41865 = c2332;
        if (c2332 != null) {
            c2332.m7859(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(bin.mt.plus.R.id.MT_Protector);
        if (callbackFindViewById instanceof InterfaceC6498) {
            wrapper = (InterfaceC6498) callbackFindViewById;
        } else if (callbackFindViewById instanceof C16390) {
            wrapper = ((C16390) callbackFindViewById).getWrapper();
        } else {
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
        }
        this.f41860 = wrapper;
        this.f41871 = (C0094) view.findViewById(bin.mt.plus.R.id.MT_Protector);
        C20977 c20977 = (C20977) view.findViewById(bin.mt.plus.R.id.MT_Protector);
        this.f41879 = c20977;
        InterfaceC6498 interfaceC6498 = this.f41860;
        if (interfaceC6498 == null || this.f41871 == null || c20977 == null) {
            throw new IllegalStateException("WindowDecorActionBar can only be used with a compatible window decor layout");
        }
        this.f41876 = interfaceC6498.getContext();
        if ((this.f41860.mo18344() & 4) != 0) {
            this.f41873 = true;
        }
        C7880 c7880M21413 = C7880.m21413(this.f41876);
        c7880M21413.m21414();
        this.f41860.getClass();
        m32564(c7880M21413.m21416());
        TypedArray typedArrayObtainStyledAttributes = this.f41876.obtainStyledAttributes(null, C10401.f33061, bin.mt.plus.R.attr.MT_Protector, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            if (!this.f41865.m7854()) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f41881 = true;
            this.f41865.m7868(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            C22666.m51087(this.f41879, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ܳ */
    public final void mo9635() {
        m32564(C7880.m21413(this.f41876).m21416());
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m32564(boolean z) {
        if (!z) {
            this.f41860.mo18333();
            this.f41879.getClass();
        } else {
            this.f41879.getClass();
            this.f41860.mo18333();
        }
        this.f41860.getClass();
        this.f41860.mo18340(false);
        this.f41865.m7860(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32569(int i) {
        this.f41869 = i;
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ᩸ */
    public final void mo9640(boolean z) {
        C22579 c22579;
        this.f41882 = z;
        if (z || (c22579 = this.f41864) == null) {
            return;
        }
        c22579.m50898();
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۙ */
    public final void mo9627(boolean z) {
        if (z == this.f41861) {
            return;
        }
        this.f41861 = z;
        ArrayList arrayList = this.f41877;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC9655) arrayList.get(i)).m25172();
        }
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۙ */
    public final void mo9626(CharSequence charSequence) {
        this.f41860.mo18339(charSequence);
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۤ */
    public final void mo9633(boolean z) {
        int i = z ? 4 : 0;
        int iMo18344 = this.f41860.mo18344();
        this.f41873 = true;
        this.f41860.mo18335((i & 4) | (iMo18344 & (-5)));
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۤ */
    public final int mo9632() {
        return this.f41860.mo18344();
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC10116 mo9623(InterfaceC19067 interfaceC19067) {
        C15337 c15337 = this.f41863;
        if (c15337 != null) {
            c15337.mo8800();
        }
        this.f41865.m7868(false);
        this.f41871.m1190();
        C15337 c15338 = new C15337(this, this.f41871.getContext(), interfaceC19067);
        if (!c15338.m36787()) {
            return null;
        }
        this.f41863 = c15338;
        c15338.mo8799();
        this.f41871.m1186(c15338);
        m32568(true);
        return c15338;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m32567(boolean z) {
        this.f41866 = z;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m32568(boolean z) {
        C24158 c24158Mo18334;
        C24158 c24158M1181;
        if (z) {
            if (!this.f41870) {
                this.f41870 = true;
                m32563(false);
            }
        } else if (this.f41870) {
            this.f41870 = false;
            m32563(false);
        }
        if (!this.f41879.isLaidOut()) {
            if (z) {
                this.f41860.setVisibility(4);
                this.f41871.setVisibility(0);
                return;
            } else {
                this.f41860.setVisibility(0);
                this.f41871.setVisibility(8);
                return;
            }
        }
        if (z) {
            c24158M1181 = this.f41860.mo18334(4, 100L);
            c24158Mo18334 = this.f41871.m1181(0, 200L);
        } else {
            c24158Mo18334 = this.f41860.mo18334(0, 200L);
            c24158M1181 = this.f41871.m1181(8, 100L);
        }
        C22579 c22579 = new C22579();
        c22579.m50902(c24158M1181, c24158Mo18334);
        c22579.m50905();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m32570() {
        if (this.f41874) {
            this.f41874 = false;
            m32563(true);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32565() {
        if (this.f41874) {
            return;
        }
        this.f41874 = true;
        m32563(true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m32563(boolean z) {
        boolean z2 = this.f41874;
        boolean z3 = this.f41870;
        InterfaceC14460 interfaceC14460 = this.f41875;
        View view = this.f41880;
        if (z3 || !z2) {
            if (this.f41868) {
                return;
            }
            this.f41868 = true;
            C22579 c22579 = this.f41864;
            if (c22579 != null) {
                c22579.m50898();
            }
            this.f41879.setVisibility(0);
            int i = this.f41869;
            InterfaceC4020 interfaceC4020 = this.f41862;
            if (i == 0 && (this.f41882 || z)) {
                this.f41879.setTranslationY(0.0f);
                float f = -this.f41879.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.f41879.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                this.f41879.setTranslationY(f);
                C22579 c225710 = new C22579();
                C24158 c24158M51085 = C22666.m51085(this.f41879);
                c24158M51085.m54127(0.0f);
                c24158M51085.m54124(interfaceC14460);
                c225710.m50901(c24158M51085);
                if (this.f41866 && view != null) {
                    view.setTranslationY(f);
                    C24158 c24158M51086 = C22666.m51085(view);
                    c24158M51086.m54127(0.0f);
                    c225710.m50901(c24158M51086);
                }
                c225710.m50899(f41859);
                c225710.m50903();
                c225710.m50900((C5596) interfaceC4020);
                this.f41864 = c225710;
                c225710.m50905();
            } else {
                this.f41879.setAlpha(1.0f);
                this.f41879.setTranslationY(0.0f);
                if (this.f41866 && view != null) {
                    view.setTranslationY(0.0f);
                }
                ((C22797) interfaceC4020).onAnimationEnd();
            }
            C2332 c2332 = this.f41865;
            if (c2332 != null) {
                C22666.m51079(c2332);
                return;
            }
            return;
        }
        if (this.f41868) {
            this.f41868 = false;
            C22579 c225711 = this.f41864;
            if (c225711 != null) {
                c225711.m50898();
            }
            int i2 = this.f41869;
            InterfaceC4020 interfaceC4021 = this.f41872;
            if (i2 == 0 && (this.f41882 || z)) {
                this.f41879.setAlpha(1.0f);
                this.f41879.m47954(true);
                C22579 c225712 = new C22579();
                float f2 = -this.f41879.getHeight();
                if (z) {
                    int[] iArr2 = {0, 0};
                    this.f41879.getLocationInWindow(iArr2);
                    f2 -= iArr2[1];
                }
                C24158 c24158M51087 = C22666.m51085(this.f41879);
                c24158M51087.m54127(f2);
                c24158M51087.m54124(interfaceC14460);
                c225712.m50901(c24158M51087);
                if (this.f41866 && view != null) {
                    C24158 c24158M51088 = C22666.m51085(view);
                    c24158M51088.m54127(f2);
                    c225712.m50901(c24158M51088);
                }
                c225712.m50899(f41858);
                c225712.m50903();
                c225712.m50900((C5596) interfaceC4021);
                this.f41864 = c225712;
                c225712.m50905();
                return;
            }
            ((C10862) interfaceC4021).onAnimationEnd();
        }
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ᩸ */
    public final Context mo9639() {
        if (this.f41878 == null) {
            TypedValue typedValue = new TypedValue();
            this.f41876.getTheme().resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f41878 = new ContextThemeWrapper(this.f41876, i);
            } else {
                this.f41878 = this.f41876;
            }
        }
        return this.f41878;
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۙ */
    public final void mo9625(Drawable drawable) {
        this.f41860.mo18336(drawable);
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۙ */
    public final void mo9624(int i) {
        this.f41860.mo18348(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32566() {
        C22579 c22579 = this.f41864;
        if (c22579 != null) {
            c22579.m50898();
            this.f41864 = null;
        }
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo9638() {
        InterfaceC6498 interfaceC6498 = this.f41860;
        if (interfaceC6498 == null || !interfaceC6498.mo18345()) {
            return false;
        }
        this.f41860.collapseActionView();
        return true;
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9637(boolean z) {
        if (this.f41873) {
            return;
        }
        mo9633(z);
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9629(int i, KeyEvent keyEvent) {
        C9898 c9898Mo8805;
        C15337 c15337 = this.f41863;
        if (c15337 == null || (c9898Mo8805 = c15337.mo8805()) == null) {
            return false;
        }
        c9898Mo8805.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return c9898Mo8805.performShortcut(i, keyEvent, 0);
    }
}
