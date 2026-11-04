package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes.dex */
public class C24943 extends ViewGroup implements InterfaceC9409 {

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f80720 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C20995 f80721;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final float[] f80722;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f80723;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f80724;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C24132 f80725;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f80726;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f80727;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public EnumC15245 f80728;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final Object f80729;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public boolean f80730;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C19721 f80731;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public List f80732;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C24132 f80733;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f80734;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f80735;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f80736;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C13008 f80737;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f80738;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f80739;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C19721 f80740;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21959 f80741;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f80742;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f80743;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19106 f80744;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f80745;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19106 f80746;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f80747;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean f80748;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public RunnableC24725 f80749;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C17930 f80750;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public boolean f80751;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f80752;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f80753;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C15087 f80754;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f80755;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f80756;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f80757;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final Path f80758;

    public C24943(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C24943(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f80731 = new C19721();
        this.f80740 = new C19721();
        C13008 c13008 = new C13008();
        c13008.f41672 = -1;
        c13008.f41670 = -1;
        c13008.f41673 = -1;
        c13008.f41671 = -1;
        this.f80737 = c13008;
        this.f80729 = new Object();
        this.f80735 = new AtomicInteger();
        this.f80741 = new C21959(this);
        this.f80758 = new Path();
        this.f80722 = new float[4];
        this.f80754 = new C15087();
        this.f80755 = true;
        this.f80750 = new C17930(Boolean.TRUE);
        this.f80724 = true;
        this.f80728 = EnumC15245.DO_NOT_IGNORE;
        this.f80723 = false;
        this.f80748 = false;
        this.f80727 = true;
        this.f80757 = true;
        this.f80738 = 300;
        setMotionEventSplittingEnabled(false);
        C24132 c24132 = new C24132(context, null);
        this.f80725 = c24132;
        C24132 c24133 = new C24132(context, null);
        this.f80733 = c24133;
        addView(c24132);
        addView(c24133);
        c24132.m53899(new C13514(this, true));
        c24133.m53899(new C13514(this, false));
        c24132.m54085();
        c24133.m54085();
        c24132.m54101();
        c24133.m54101();
        c24132.m53990();
        c24133.m53990();
        this.f80752 = C3296.m10871(-13158601, -1309);
        this.f80747 = C3296.m10871(-9803710, -332368);
        C24132.m53720(c24132, c24133);
        C14540 c14540 = c24132.f78066;
        C14540 c14541 = c24133.f78066;
        c14540.f45757 = 0;
        c14541.f45757 = 0;
        c14540.f45779 = true;
        c14541.f45779 = true;
        c14540.f45744 = true;
        c14541.f45744 = true;
        c14540.f45777 = true;
        c14541.f45777 = true;
        c14540.f45813 = true;
        c14541.f45813 = true;
        c14540.f45771 = true;
        c14541.f45771 = true;
        boolean z = this.f80748;
        c14540.f45816 = z;
        c14541.f45816 = true;
        c14540.f45800 = 0;
        c14541.f45800 = 0;
        c14540.f45792 = 1.0f;
        c14541.f45792 = 1.0f;
        boolean z2 = this.f80727;
        c14540.f45767 = z2;
        c14541.f45767 = z2;
        if (z) {
            int intrinsicHeight = c14540.f45772.getIntrinsicHeight() * 2;
            c14541.f45809 = intrinsicHeight;
            c14540.f45809 = intrinsicHeight;
        }
        int i2 = c14540.f45778;
        int iAlpha = (i2 & 16777215) | (((int) (Color.alpha(i2) * 0.5f)) << 24);
        c14541.f45778 = iAlpha;
        c14540.f45778 = iAlpha;
        c14540.f45791 = new C2328(this);
        c14541.f45791 = new C8294(this);
        c24132.m53906(new C19301(this));
        c24133.m53906(new InterfaceC2192() { // from class: l.᩶֨᩸
            @Override // l.InterfaceC2192
            /* JADX INFO: renamed from: ۙ */
            public final void mo7499(int i3, int i4, int i5, int i6) {
                C24943.m55663(this.f67065, i4, i5, i6);
            }
        });
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: l.ܿ֨᩸
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                C24943.m55635(this.f58926, view, z3);
            }
        };
        c24132.setOnFocusChangeListener(onFocusChangeListener);
        c24133.setOnFocusChangeListener(onFocusChangeListener);
        c24132.m53913(new InterfaceC11886() { // from class: l.֡֨᩸
            @Override // l.InterfaceC11886
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo1160(int i3, int i4) {
                C24943.m55662(this.f999, i3, i4);
            }
        });
        c24133.m53913(new InterfaceC11886() { // from class: l.۟֨᩸
            @Override // l.InterfaceC11886
            /* JADX INFO: renamed from: ۙ */
            public final void mo1160(int i3, int i4) {
                C24943.m55633(this.f24900, i3, i4);
            }
        });
        c24132.f77980 = new C1822(this, true);
        c24133.f77980 = new C1822(this, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m55634(C24943 c24943, int i, int i2, int i3) {
        if (c24943.f80757) {
            C24132 c24132 = c24943.f80725;
            C24132 c24133 = c24943.f80733;
            if (c24132.isFocused() || c24132.isPressed()) {
                if (i == i3) {
                    c24133.m53875(i2, c24133.m54026());
                    c24943.invalidate();
                    return;
                }
                C21959 c21959 = c24943.f80741;
                if (c21959.m49686(c24132, c24133, true)) {
                    float fM16189 = c24132.f78066.m16189();
                    float fM49687 = (c21959.m49687(c24132) - ((c21959.f70876 * fM16189) - i3)) / fM16189;
                    int i4 = c21959.f70879;
                    int i5 = c21959.f70877;
                    i3 = (int) (((((i4 - i5) * fM49687) + i5) * fM16189) - c21959.m49687(c24133));
                }
                c24133.m53875(i2, i3);
                c24943.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m55663(C24943 c24943, int i, int i2, int i3) {
        if (c24943.f80757) {
            C24132 c24132 = c24943.f80733;
            C24132 c24133 = c24943.f80725;
            if (c24132.isFocused() || c24132.isPressed()) {
                if (i == i3) {
                    c24133.m53875(i2, c24133.m54026());
                    c24943.invalidate();
                    return;
                }
                C21959 c21959 = c24943.f80741;
                if (c21959.m49686(c24132, c24133, false)) {
                    float fM16189 = c24132.f78066.m16189();
                    float fM49687 = (c21959.m49687(c24132) - ((c21959.f70876 * fM16189) - i3)) / fM16189;
                    int i4 = c21959.f70879;
                    int i5 = c21959.f70877;
                    i3 = (int) (((((i4 - i5) * fM49687) + i5) * fM16189) - c21959.m49687(c24133));
                }
                c24133.m53875(i2, i3);
                c24943.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m55635(C24943 c24943, View view, boolean z) {
        if (z) {
            boolean z2 = view == c24943.f80725;
            if (c24943.f80755 != z2) {
                c24943.f80755 = z2;
                c24943.f80750.mo40353(Boolean.valueOf(z2));
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m55662(C24943 c24943, int i, int i2) {
        C24132 c24132 = c24943.f80733;
        if (c24943.f80727 && c24943.f80755) {
            c24943.m55630(i, i2, true);
            c24132.invalidate();
        } else if (c24943.f80748) {
            c24132.invalidate();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m55633(C24943 c24943, int i, int i2) {
        C24132 c24132 = c24943.f80725;
        if (c24943.f80727 && !c24943.f80755) {
            c24943.m55630(i, i2, false);
            c24132.invalidate();
        } else if (c24943.f80748) {
            c24132.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m55630(int i, int i2, boolean z) {
        int iM55659;
        int iM556510;
        List list = this.f80732;
        if (list == null) {
            return;
        }
        C24132 c24132 = this.f80733;
        C24132 c24133 = this.f80725;
        C24132 c24134 = z ? c24133 : c24132;
        if (!z) {
            c24132 = c24133;
        }
        int length = c24134.m54021().length();
        int length2 = c24132.m54021().length();
        if (i == i2) {
            iM55659 = m55659(z, i, length, length2, list);
            iM556510 = iM55659;
        } else {
            iM55659 = m55659(z, i, length, length2, list);
            iM556510 = m55659(z, i2, length, length2, list);
        }
        c24132.mo52316(iM55659, iM556510);
        c24132.m53975();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a5 A[RETURN] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m55659(boolean z, int i, int i2, int i3, List list) {
        InterfaceC9711 interfaceC9711;
        int iMo9799;
        int iMo9797;
        InterfaceC9711 interfaceC9712;
        int iMo97910;
        List listMo20527;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC9711 interfaceC9713 = (InterfaceC9711) list.get(i4);
            int iMo9798 = interfaceC9713.mo9797(z);
            int iMo97911 = interfaceC9713.mo9799(z);
            if (iMo9798 > i || (i == i2 && iMo9798 == i && iMo9798 == iMo97911)) {
                if (i4 > 0 && (i = (i - interfaceC9712.mo9799(z)) + (iMo97910 = (interfaceC9712 = (InterfaceC9711) list.get(i4 - 1)).mo9799(!z))) < iMo97910) {
                    i = iMo97910;
                }
                int i5 = i4 + 1;
                if (i5 < size && i > (iMo9797 = ((InterfaceC9711) list.get(i5)).mo9797(!z))) {
                    i = iMo9797;
                }
                if (i > i3) {
                    return i3;
                }
                return i;
            }
            if (iMo97911 > i || (i == i2 && iMo97911 == i)) {
                boolean z2 = !z;
                int iMo97912 = interfaceC9713.mo9797(z2);
                int iMo97913 = interfaceC9713.mo9799(z2);
                int iM55659 = i - iMo9798;
                if ((interfaceC9713 instanceof InterfaceC8966) && (listMo20527 = ((InterfaceC8966) interfaceC9713).mo20527()) != null) {
                    iM55659 = m55659(z, iM55659, interfaceC9713.mo9799(z) - interfaceC9713.mo9797(z), iMo97913 - iMo97912, listMo20527);
                }
                int i6 = iM55659 + iMo97912;
                if (i6 < iMo97912) {
                    return iMo97912;
                }
                return i6 > iMo97913 ? iMo97913 : i6;
            }
        }
        if (size > 0 && i >= (iMo9799 = (interfaceC9711 = (InterfaceC9711) list.get(size - 1)).mo9799(z))) {
            i = (i - iMo9799) + interfaceC9711.mo9799(!z);
        }
        if (i < 0) {
            return 0;
        }
        if (i > i3) {
            return i3;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m55701() {
        return this.f80748;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m55687(boolean z) {
        if (this.f80748 != z) {
            this.f80748 = z;
            C14540 c14540 = this.f80725.f78066;
            c14540.f45816 = z;
            C24132 c24132 = this.f80733;
            if (z) {
                C14540 c14541 = c24132.f78066;
                int intrinsicHeight = c14540.f45772.getIntrinsicHeight() * 2;
                c14541.f45809 = intrinsicHeight;
                c14540.f45809 = intrinsicHeight;
            } else {
                C14540 c14542 = c24132.f78066;
                int intrinsicHeight2 = c14540.f45772.getIntrinsicHeight() * 3;
                c14542.f45809 = intrinsicHeight2;
                c14540.f45809 = intrinsicHeight2;
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m55689(boolean z) {
        this.f80757 = z;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m55681() {
        return this.f80757;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55674(ActivityC2350 activityC2350, C16519 c16519) {
        this.f80750.m40350(activityC2350, new C9784(0, c16519));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55675(C6178 c6178) {
        c6178.writeInt(631841030);
        c6178.m17789(this.f80755);
        c6178.m17789(this.f80724);
        c6178.writeByte(this.f80728.ordinal());
        c6178.mo17812(8454);
        c6178.m17789(this.f80723);
        c6178.m17789(this.f80748);
        c6178.m17789(this.f80727);
        c6178.mo17812(8454);
        c6178.m17789(this.f80757);
        if (this.f80732 == null) {
            c6178.writeByte(0);
        } else {
            c6178.m17789(true);
            c6178.writeInt(this.f80732.size());
            Iterator it = this.f80732.iterator();
            while (it.hasNext()) {
                ((InterfaceC8966) it.next()).mo9798(c6178);
            }
        }
        this.f80725.m53910(c6178, true);
        this.f80733.m53910(c6178, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55677(C20348 c20348, AbstractC22044 abstractC22044, AbstractC22044 abstractC22045) {
        C17364.m40795((InterfaceC15872) c20348, 631841030);
        List list = null;
        m55660((List) null);
        this.f80755 = c20348.m46753();
        C17930 c17930 = this.f80750;
        boolean zBooleanValue = ((Boolean) c17930.m40346()).booleanValue();
        boolean z = this.f80755;
        if (zBooleanValue != z) {
            c17930.mo40348(Boolean.valueOf(z));
        }
        this.f80724 = c20348.m46753();
        this.f80728 = EnumC15245.values()[c20348.readByte() & 255];
        boolean zM46760 = c20348.m46760(8454);
        C24132 c24132 = this.f80733;
        C24132 c24133 = this.f80725;
        if (zM46760) {
            m55683(c20348.m46753());
            m55687(c20348.m46753());
            boolean zM46753 = c20348.m46753();
            this.f80727 = zM46753;
            c24133.f78066.f45767 = zM46753;
            c24132.f78066.f45767 = zM46753;
            invalidate();
        }
        if (c20348.m46760(8454)) {
            this.f80757 = c20348.m46753();
        }
        boolean zM46754 = c20348.m46753();
        if (zM46754) {
            int i = c20348.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C7475(c20348));
            }
            list = arrayList;
        }
        c24133.mo52303(c20348);
        c24132.mo52303(c20348);
        if (zM46754) {
            m55660(list);
        } else {
            m55656();
        }
        m55646();
        if (this.f80755) {
            if (c24132.isFocused()) {
                post(new RunnableC3073(0, c24133));
            }
        } else if (c24133.isFocused()) {
            post(new RunnableC3073(0, c24132));
        }
        m55651();
        if (abstractC22044 != null) {
            c24133.m53929(abstractC22044);
        }
        if (abstractC22045 != null) {
            c24132.m53929(abstractC22045);
        }
        m55651();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0118  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:93:0x0201  */
    /* JADX WARN: Code duplicated, block: B:94:0x0205  */
    /* JADX WARN: Code duplicated, block: B:97:0x022d  */
    /* JADX WARN: Code duplicated, block: B:98:0x022f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55642(C24943 c24943, boolean z, C6909 c6909, int i, int i2, int i3, Canvas canvas, Paint paint, C14540 c14540) {
        Paint paint2;
        InterfaceC8966 interfaceC8966;
        int i4;
        int i5;
        C14763 c14763;
        C24943 c24944;
        C14763 c14764;
        float f;
        float f2;
        float f3;
        float fM33632;
        int i6;
        float f4;
        int i7;
        float f5;
        InterfaceC8966 interfaceC8967;
        int iMo9797;
        int iMo9799;
        boolean z2 = z;
        int i8 = c24943.f80747;
        C24132 c24132 = c24943.f80733;
        C24132 c24133 = c24943.f80725;
        AbstractC13753 abstractC13753 = c24943.m55671(z).f78022;
        List list = c24943.f80732;
        if (list == null || !c24943.m55671(z).m53994()) {
            return;
        }
        C19721 c19721 = z2 ? c24943.f80731 : c24943.f80740;
        C24132 c24132M55671 = c24943.m55671(z);
        c19721.getClass();
        C14763 c14765 = c19721.f63469;
        InterfaceC19106 interfaceC19106M54021 = c24132M55671.m54021();
        c19721.f63472 = interfaceC19106M54021;
        c19721.f63468 = interfaceC19106M54021.mo15344();
        c19721.f63475 = list;
        C17359.requireNonNull(c14540);
        c19721.f63470 = c14540;
        C17359.requireNonNull(c6909);
        c19721.f63474 = c6909;
        c19721.f63473 = i;
        c19721.f63476 = i2;
        c14765.clear();
        if (c24943.f80748) {
            boolean z3 = c24943.f80755;
            C24132 c24134 = z3 ? c24133 : c24132;
            int length = c24134.m54021().length();
            int iM53968 = c24134.m53968();
            if (iM53968 != c24134.m53882()) {
                paint2 = paint;
                interfaceC8966 = null;
            } else {
                if (z2) {
                    c24132 = c24133;
                }
                int size = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 <= size) {
                        if (i9 == size) {
                            iMo9799 = length;
                            iMo9797 = iMo9799;
                            interfaceC8967 = null;
                        } else {
                            interfaceC8967 = (InterfaceC8966) list.get(i9);
                            iMo9797 = interfaceC8967.mo9797(z3);
                            iMo9799 = interfaceC8967.mo9799(z3);
                        }
                        if (iMo9797 > iM53968 || (iM53968 == length && iMo9797 == iM53968 && iMo9797 == iMo9799)) {
                            if (z3 != z2 && i9 > 0) {
                                InterfaceC8966 interfaceC8968 = (InterfaceC8966) list.get(i9 - 1);
                                iM53968 = (iM53968 - interfaceC8968.mo9799(z3)) + interfaceC8968.mo9799(z2);
                            }
                            int iM33646 = c24132.f78022.m33646(iM53968);
                            if (iM33646 >= c19721.f63473 && iM33646 <= c19721.f63476) {
                                int iM19185 = c6909.m19185(iM33646);
                                int iM19179 = c6909.m19179(iM33646);
                                float fM33633 = abstractC13753.m33632(iM19185);
                                float fM33634 = abstractC13753.m33632(iM19179 + 1);
                                paint2 = paint;
                                paint2.setColor(i8);
                                canvas.drawRect(0.0f, fM33633, i3, fM33634, paint);
                                c14765.add((int) fM33633);
                                c14765.add((int) fM33634);
                                c14765.add(-1);
                                c14765.add(0);
                            }
                            interfaceC8966 = null;
                        } else if (interfaceC8967 == null || (iMo9799 <= iM53968 && !(iM53968 == length && iMo9799 == iM53968))) {
                            i9++;
                            size = size;
                        } else {
                            paint2 = paint;
                            interfaceC8966 = interfaceC8967;
                        }
                    }
                    paint2 = paint;
                    interfaceC8966 = null;
                }
            }
        } else {
            paint2 = paint;
            interfaceC8966 = null;
        }
        int iM19188 = c19721.f63474.m19188(c19721.f63473);
        int iM19189 = c19721.f63474.m19188(c19721.f63476) + 1;
        float fM16210 = c19721.f63470.m16210() / 16.0f;
        Iterator it = list.iterator();
        while (true) {
            C24943 c24945 = c24943;
            Paint paint3 = paint2;
            while (it.hasNext()) {
                InterfaceC8966 interfaceC8969 = (InterfaceC8966) it.next();
                int iMo20528 = z2 ? interfaceC8969.mo20528() : interfaceC8969.mo20524();
                Iterator it2 = it;
                int iMo20522 = z2 ? interfaceC8969.mo20522() : interfaceC8969.mo20518();
                if (iMo20522 >= iM19188) {
                    if (iMo20528 > iM19189) {
                        i4 = iM19188;
                        i5 = iM19189;
                        c14764 = c14765;
                    } else {
                        i5 = iM19189;
                        EnumC10770 enumC10770M27437 = EnumC10770.m27437(interfaceC8969);
                        i4 = iM19188;
                        int iM19186 = c6909.m19186(iMo20528, (iMo20528 - iM19188) + i);
                        c14764 = c14765;
                        if (iM19186 == -1) {
                            if (iMo20528 == c6909.m19187().f45296 + 1) {
                                iM19186 = c6909.size();
                            }
                        }
                        if (c24945.f80748) {
                            f = 0.0f;
                        } else {
                            if (z2) {
                                C14540 c14541 = c19721.f63470;
                                f2 = i3 - (c14541.f45792 * c14541.f45776);
                                f3 = 0.0f;
                            } else {
                                C14540 c14542 = c19721.f63470;
                                f = c14542.f45792 * c14542.f45776;
                            }
                            fM33632 = abstractC13753.m33632(iM19186);
                            if (iMo20528 == iMo20522) {
                                if (iM19186 == 0) {
                                    f5 = fM33632 + fM16210 + fM16210;
                                } else if (iM19186 == c6909.size()) {
                                    f4 = (fM33632 - fM16210) - fM16210;
                                } else {
                                    f5 = fM33632 + fM16210;
                                    fM33632 -= fM16210;
                                }
                                float f6 = fM33632;
                                fM33632 = f5;
                                f4 = f6;
                            } else {
                                i6 = 1;
                                while (true) {
                                    iM19186++;
                                    if (iM19186 > i2 || c6909.m19188(iM19186) >= iMo20522) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                                f4 = fM33632;
                                fM33632 = (c19721.f63470.m16189() * i6) + fM33632;
                            }
                            if (interfaceC8969 == interfaceC8966) {
                                paint3.setColor(i8);
                            } else {
                                paint3.setColor(enumC10770M27437.f34190);
                            }
                            canvas.drawRect(f3, f4, f2, fM33632, paint3);
                            c14764.add((int) f4);
                            c14764.add((int) fM33632);
                            c14764.add(enumC10770M27437.ordinal());
                            if (interfaceC8969.mo20527() == null) {
                                i7 = 0;
                            } else {
                                i7 = 1;
                            }
                            c14764.add(i7);
                            z2 = z;
                            paint2 = paint;
                            c14765 = c14764;
                            iM19189 = i5;
                            iM19188 = i4;
                            it = it2;
                        }
                        f2 = i3;
                        f3 = f;
                        fM33632 = abstractC13753.m33632(iM19186);
                        if (iMo20528 == iMo20522) {
                            if (iM19186 == 0) {
                                f5 = fM33632 + fM16210 + fM16210;
                            } else if (iM19186 == c6909.size()) {
                                f4 = (fM33632 - fM16210) - fM16210;
                            } else {
                                f5 = fM33632 + fM16210;
                                fM33632 -= fM16210;
                            }
                            float f7 = fM33632;
                            fM33632 = f5;
                            f4 = f7;
                        } else {
                            i6 = 1;
                            while (true) {
                                iM19186++;
                                if (iM19186 > i2) {
                                    break;
                                }
                                break;
                                break;
                                i6++;
                            }
                            f4 = fM33632;
                            fM33632 = (c19721.f63470.m16189() * i6) + fM33632;
                        }
                        if (interfaceC8969 == interfaceC8966) {
                            paint3.setColor(i8);
                        } else {
                            paint3.setColor(enumC10770M27437.f34190);
                        }
                        canvas.drawRect(f3, f4, f2, fM33632, paint3);
                        c14764.add((int) f4);
                        c14764.add((int) fM33632);
                        c14764.add(enumC10770M27437.ordinal());
                        if (interfaceC8969.mo20527() == null) {
                            i7 = 0;
                        } else {
                            i7 = 1;
                        }
                        c14764.add(i7);
                        z2 = z;
                        paint2 = paint;
                        c14765 = c14764;
                        iM19189 = i5;
                        iM19188 = i4;
                        it = it2;
                    }
                    c24944 = c24945;
                    c14763 = c14764;
                } else {
                    i4 = iM19188;
                    i5 = iM19189;
                    c14763 = c14765;
                    c24944 = c24943;
                    paint3 = paint;
                }
                z2 = z;
                c24945 = c24944;
                c14765 = c14763;
                iM19189 = i5;
                iM19188 = i4;
                it = it2;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01b5 A[PHI: r19 r21
      0x01b5: PHI (r19v6 int) = (r19v5 int), (r19v9 int) binds: [B:86:0x01b3, B:83:0x01a4] A[DONT_GENERATE, DONT_INLINE]
      0x01b5: PHI (r21v9 java.util.List) = (r21v8 java.util.List), (r21v12 java.util.List) binds: [B:86:0x01b3, B:83:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b7 A[PHI: r19 r21
      0x01b7: PHI (r19v8 int) = (r19v5 int), (r19v9 int) binds: [B:86:0x01b3, B:83:0x01a4] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r21v11 java.util.List) = (r21v8 java.util.List), (r21v12 java.util.List) binds: [B:86:0x01b3, B:83:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55641(C24943 c24943, boolean z, C6909 c6909, int i, int i2, float f, float f2, boolean z2, Canvas canvas, Paint paint, InterfaceC7829 interfaceC7829, C14540 c14540) {
        int i3;
        InterfaceC8966 interfaceC8966;
        List list;
        List listMo20527;
        int iM19186;
        boolean z3;
        int iMo9803;
        int iMo9804;
        int iMo9801;
        int i4;
        List list2;
        boolean z4;
        float f3;
        int iMo20524;
        int iMo20518;
        C6909 c69010 = c6909;
        int i5 = i;
        int i6 = i2;
        AbstractC13753 abstractC13753 = c24943.m55671(z).f78022;
        List list3 = c24943.f80732;
        if (list3 == null || !c24943.m55671(z).m53994()) {
            return;
        }
        C19721 c19721 = z ? c24943.f80731 : c24943.f80740;
        if (c19721.f63475 != list3 || c19721.f63470 != c14540 || c19721.f63474 != c69010 || c19721.f63473 != i5 || c19721.f63476 != i6) {
            c24943.f80725.postInvalidate();
            c24943.f80733.postInvalidate();
            c24943.postInvalidate();
            return;
        }
        C14763 c14763 = c19721.f63469;
        EnumC10770[] enumC10770ArrValues = EnumC10770.values();
        int i7 = 0;
        for (int size = c14763.size(); i7 < size; size = size) {
            int i8 = c14763.getInt(i7);
            int i9 = c14763.getInt(i7 + 1);
            int i10 = c14763.getInt(i7 + 2);
            if (i10 < 0) {
                paint.setColor(c24943.f80752);
            } else {
                EnumC10770 enumC10770 = enumC10770ArrValues[i10];
                paint.setColor(c14763.getInt(i7 + 3) != 0 ? enumC10770.f34192 : enumC10770.f34190);
            }
            canvas.drawRect(f, i8, f2, i9, paint);
            i7 += 4;
        }
        C14763 c14764 = c14540.f45794;
        float fM16189 = c14540.m16189();
        int iM19188 = c19721.f63474.m19188(c19721.f63473);
        int iM19189 = c19721.f63474.m19188(c19721.f63476);
        int i11 = i5;
        while (iM19188 <= iM19189) {
            int i12 = 1;
            int size2 = list3.size() - 1;
            int i13 = 0;
            while (true) {
                if (i13 > size2) {
                    i3 = iM19189;
                    interfaceC8966 = null;
                    break;
                }
                int i14 = (i13 + size2) >>> i12;
                interfaceC8966 = (InterfaceC8966) list3.get(i14);
                if (z) {
                    iMo20524 = interfaceC8966.mo20528();
                    iMo20518 = interfaceC8966.mo20522();
                } else {
                    iMo20524 = interfaceC8966.mo20524();
                    iMo20518 = interfaceC8966.mo20518();
                }
                i3 = iM19189;
                int i15 = iMo20518;
                if (iM19188 < iMo20524) {
                    size2 = i14 - 1;
                } else if (iM19188 < i15) {
                    break;
                } else {
                    i13 = i14 + 1;
                }
                i12 = 1;
                iM19189 = i3;
            }
            if (interfaceC8966 == null || (listMo20527 = interfaceC8966.mo20527()) == null || (iM19186 = c69010.m19186(iM19188, i11)) == -1) {
                list = list3;
            } else {
                int iM19185 = c69010.m19185(iM19186);
                int iMin = Math.min(c69010.m19179(iM19186), i6);
                if (iM19185 < i5) {
                    iM19185 = i5;
                    z3 = false;
                } else {
                    z3 = true;
                }
                int i16 = iMin + 1;
                float fM33632 = abstractC13753.m33632(iM19185);
                int size3 = c6909.size();
                C18096 c18096M19181 = c6909.m19181();
                while (iM19185 <= iMin) {
                    int i17 = (int) fM33632;
                    int iM35087 = (!z2 || z3) ? 0 : c14540.m35087();
                    C14366 c14366M42205 = c18096M19181.m42205(iM19185);
                    C18096 c18096 = c18096M19181;
                    int i18 = c14366M42205.f45295;
                    int i19 = iMin;
                    int i20 = c14366M42205.f45294;
                    int i21 = i16;
                    if (iM19185 < size3 - 1 && c69010.m19188(iM19185 + 1) != c14366M42205.f45296) {
                        i20++;
                    }
                    int size4 = listMo20527.size();
                    float fM22846 = 0.0f;
                    int i22 = i18;
                    int i23 = 0;
                    while (i23 < size4) {
                        InterfaceC9711 interfaceC9711 = (InterfaceC9711) listMo20527.get(i23);
                        if (z) {
                            iMo9803 = interfaceC9711.mo9807() + interfaceC8966.mo9807();
                            iMo9804 = interfaceC8966.mo9807();
                            iMo9801 = interfaceC9711.mo9796();
                        } else {
                            iMo9803 = interfaceC9711.mo9803() + interfaceC8966.mo9803();
                            iMo9804 = interfaceC8966.mo9803();
                            iMo9801 = interfaceC9711.mo9801();
                        }
                        List list4 = listMo20527;
                        int i24 = iMo9803;
                        int i25 = size4;
                        int i26 = iMo9801 + iMo9804;
                        if (i26 <= i18 || i20 <= i24) {
                            i4 = i18;
                            list2 = list3;
                        } else {
                            int iMax = Math.max(i24, i18);
                            int iMin2 = Math.min(i26, i20);
                            if (z) {
                                i4 = i18;
                                list2 = list3;
                                if (interfaceC9711.mo9807() == interfaceC9711.mo9796()) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                i4 = i18;
                                list2 = list3;
                                if (interfaceC9711.mo9803() == interfaceC9711.mo9801()) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            }
                            C8533 c8533 = (C8533) interfaceC7829;
                            fM22846 += c8533.m22846(i22, fM22846, iMax);
                            float f4 = iM35087;
                            float f5 = fM22846 + f4;
                            if (z4) {
                                float f6 = fM16189 / 16.0f;
                                float f7 = (int) (f5 - f6);
                                f3 = (f6 * 2.0f) + f7;
                                f5 = f7;
                            } else {
                                if (iMin2 == i20) {
                                    f3 = f2;
                                } else {
                                    fM22846 += c8533.m22846(iMax, fM22846, iMin2);
                                    f3 = fM22846 + f4;
                                    i22 = iMin2;
                                }
                                if (f5 >= f3 && f3 >= f && f5 <= f2) {
                                    c14764.add(i17);
                                    c14764.add(Float.floatToRawIntBits(f5));
                                    c14764.add(Float.floatToRawIntBits(f3));
                                    c14764.add(EnumC10770.m27438(interfaceC9711).f34190);
                                }
                            }
                            i22 = iMax;
                            if (f5 >= f3) {
                            }
                        }
                        i23++;
                        i18 = i4;
                        size4 = i25;
                        list3 = list2;
                        listMo20527 = list4;
                    }
                    iM19185++;
                    fM33632 = abstractC13753.m33632(iM19185);
                    z3 = false;
                    c69010 = c6909;
                    c18096M19181 = c18096;
                    iMin = i19;
                    i16 = i21;
                }
                list = list3;
                i11 = i16;
            }
            iM19188++;
            iM19189 = i3;
            c69010 = c6909;
            i5 = i;
            i6 = i2;
            list3 = list;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55640(C24943 c24943, boolean z, C6909 c6909, float f, float f2, float f3, float f4, Canvas canvas, Paint paint, C14540 c14540) {
        float f5;
        float f6;
        int iM19185;
        int iM19179;
        List<InterfaceC8966> list = c24943.f80732;
        if (list == null || !c24943.m55671(z).m53994() || c6909.isEmpty()) {
            return;
        }
        int i = (int) (f4 - f2);
        int size = c6909.size();
        float f7 = c14540.f18976 * 3.0f;
        if (z && !c24943.f80748) {
            f6 = c14540.f45765 + f;
            f5 = f;
        } else {
            f5 = f3 - c14540.f45765;
            f6 = f3;
        }
        for (InterfaceC8966 interfaceC8966 : list) {
            int iMo20528 = z ? interfaceC8966.mo20528() : interfaceC8966.mo20524();
            int iMo20522 = z ? interfaceC8966.mo20522() : interfaceC8966.mo20518();
            int iM19167 = c6909.m19167(iMo20528);
            if (iM19167 == -1) {
                if (iMo20528 == c6909.m19187().f45296 + 1) {
                    iM19185 = c6909.size();
                }
            } else {
                iM19185 = c6909.m19185(iM19167);
            }
            int iM19168 = c6909.m19167(iMo20522);
            if (iM19168 == -1) {
                if (iMo20522 == c6909.m19187().f45296 + 1) {
                    iM19179 = c6909.size();
                }
            } else {
                iM19179 = c6909.m19179(iM19168);
            }
            float f8 = i;
            float f9 = size;
            float f10 = (iM19185 * f8) / f9;
            float f11 = (iM19179 * f8) / f9;
            float f12 = f8 - f7;
            if (f10 > f12) {
                f10 = f12;
            }
            if (f11 - f10 < f7) {
                f11 = f10 + f7;
            }
            paint.setColor(EnumC10770.m27437(interfaceC8966).f34191);
            canvas.drawRect(f5, f2 + f10, f6, f2 + f11, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C24132 c24132 = this.f80725;
        C24132 c24133 = this.f80733;
        C24132.m53839(c24132, c24133);
        C14540 c14540 = c24132.f78066;
        c24133.computeScroll();
        c24133.f78077 = true;
        this.f80734 = true;
        try {
            super.dispatchDraw(canvas);
            this.f80734 = false;
            c24133.f78077 = false;
            List list = this.f80732;
            boolean zM55644 = m55644(list);
            this.f80736 = zM55644;
            C10232 c10232 = c14540.f45759;
            if (this.f80748) {
                int bottom = c24132.getBottom();
                int top = c24133.getTop();
                c10232.setColor(C19988.m45966((C3296.f10750 & 16777215) | (-1610612736), C3296.f10763));
                canvas.drawRect(0.0f, bottom, getWidth(), top, c10232);
                c10232.setColor(C3296.f10750);
                canvas.drawRect(0.0f, bottom + 2, getWidth(), top - 2, c10232);
            } else {
                if (zM55644) {
                    C19721 c19721 = this.f80731;
                    int iM19188 = c19721.f63474.m19188(c19721.f63473);
                    C19721 c19722 = this.f80740;
                    int iM19189 = c19722.f63474.m19188(c19722.f63473);
                    int iM191810 = c19721.f63474.m19188(c19721.f63476) + 1;
                    int iM191811 = c19722.f63474.m19188(c19722.f63476) + 1;
                    float width = getWidth() / 2.0f;
                    C14540 c14541 = c19721.f63470;
                    float f = width - (c14541.f45792 * c14541.f45776);
                    C14540 c14542 = c19722.f63470;
                    float f2 = (c14542.f45792 * c14542.f45776) + width;
                    float f3 = c14540.f45776 / 2.0f;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC8966 interfaceC8966 = (InterfaceC8966) it.next();
                        if (interfaceC8966.mo20522() >= iM19188 || interfaceC8966.mo20518() >= iM19189) {
                            if (interfaceC8966.mo20528() <= iM191810 || interfaceC8966.mo20524() <= iM191811) {
                                EnumC10770 enumC10770M27437 = EnumC10770.m27437(interfaceC8966);
                                Iterator it2 = it;
                                Path path = this.f80758;
                                path.reset();
                                int i = iM19188;
                                float[] fArr = this.f80722;
                                int i2 = iM19189;
                                int i3 = iM191810;
                                if (c19721.m45413(interfaceC8966, true, fArr, 0) && c19722.m45413(interfaceC8966, false, fArr, 2)) {
                                    int paddingTop = c24132.getPaddingTop() - c24132.m54026();
                                    int paddingTop2 = c24133.getPaddingTop() - c24133.m54026();
                                    float f4 = paddingTop;
                                    float f5 = fArr[0] + f4;
                                    fArr[0] = f5;
                                    fArr[1] = fArr[1] + f4;
                                    float f6 = paddingTop2;
                                    fArr[2] = fArr[2] + f6;
                                    fArr[3] = fArr[3] + f6;
                                    path.moveTo(f, f5);
                                    path.lineTo(f, fArr[1]);
                                    if (Math.abs(fArr[1] - fArr[3]) <= 1.0f) {
                                        path.lineTo(f2, fArr[3]);
                                    } else {
                                        float f7 = fArr[3];
                                        path.cubicTo(f + f3, fArr[1], f2 - f3, f7, f2, f7);
                                    }
                                    path.lineTo(f2, fArr[2]);
                                    if (Math.abs(fArr[2] - fArr[0]) <= 1.0f) {
                                        path.lineTo(f, fArr[0]);
                                    } else {
                                        float f8 = fArr[0];
                                        path.cubicTo(f2 - f3, fArr[2], f + f3, f8, f, f8);
                                    }
                                    path.close();
                                    c10232.setColor(enumC10770M27437.f34190);
                                    canvas.drawPath(path, c10232);
                                }
                                it = it2;
                                iM19188 = i;
                                iM19189 = i2;
                                iM191810 = i3;
                            }
                        }
                    }
                }
                if (this.f80723 || !zM55644) {
                }
                C21959 c21959 = this.f80741;
                Paint paint = c21959.f70880;
                paint.setColor(C3296.f10738);
                C24943 c24943 = c21959.f70878;
                C24132 c24134 = c24943.f80733;
                C24132 c24135 = c24943.f80725;
                if (c24943.f80748) {
                    float top2 = c24135.getTop() + ((int) c21959.m49687(c24135));
                    canvas.drawLine(0.0f, top2, c24943.getWidth(), top2, paint);
                    float top3 = c24134.getTop() + ((int) c21959.m49687(c24134));
                    canvas.drawLine(0.0f, top3, c24943.getWidth(), top3, paint);
                    return;
                }
                float fM49687 = (int) c21959.m49687(c24135);
                canvas.drawLine(0.0f, fM49687, c24943.getWidth(), fM49687, paint);
                return;
            }
            if (this.f80723) {
            }
        } catch (Throwable th) {
            this.f80734 = false;
            c24133.f78077 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55638(C24943 c24943, C19721 c19721, boolean z) {
        c19721.f63471 = z;
        if (c24943.f80734 || c24943.f80736 == c24943.m55644(c24943.f80732)) {
            return;
        }
        super.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m55644(List list) {
        if (list == null) {
            return false;
        }
        C24132 c24132 = this.f80725;
        if (!c24132.m53994()) {
            return false;
        }
        C24132 c24133 = this.f80733;
        return c24133.m53994() && this.f80731.m45414(c24132, list) && this.f80740.m45414(c24133, list);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m55654(C24943 c24943) {
        return c24943.f80725.m53994() && c24943.f80733.m53994();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0108 */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m55697(final boolean r24) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C24943.m55697(boolean):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55637(final C24943 c24943, C15508 c15508, C15508 c15509, final C11516 c11516, final EnumC15245 enumC15245, final boolean z, final InterfaceC22705 interfaceC22705, final InterfaceC19106 interfaceC19106, final InterfaceC19106 interfaceC19107, final int i, final List list, final int i2, final int i3, boolean z2) {
        try {
            try {
                C10024 c10024M25874 = C10024.m25874(c15508);
                try {
                    C10024 c10024M25875 = C10024.m25874(c15509);
                    try {
                        final ArrayList<InterfaceC8966> arrayListM55627 = m55627(c10024M25874.range(c11516.f36238, c11516.f36237), c10024M25875.range(c11516.f36234, c11516.f36236), enumC15245, z, interfaceC22705, new C15087());
                        for (InterfaceC8966 interfaceC8966 : arrayListM55627) {
                            interfaceC8966.mo20531(interfaceC8966.mo20528() + c11516.f36233);
                            interfaceC8966.mo20523(interfaceC8966.mo20522() + c11516.f36233);
                            interfaceC8966.mo9804(interfaceC8966.mo9807() + c11516.f36238);
                            interfaceC8966.mo9800(interfaceC8966.mo9796() + c11516.f36238);
                            interfaceC8966.mo20519(interfaceC8966.mo20524() + c11516.f36235);
                            interfaceC8966.mo20526(interfaceC8966.mo20518() + c11516.f36235);
                            interfaceC8966.mo9802(interfaceC8966.mo9803() + c11516.f36234);
                            interfaceC8966.mo9805(interfaceC8966.mo9801() + c11516.f36234);
                        }
                        c10024M25875.close();
                        try {
                            try {
                                c10024M25874.close();
                                c15509.close();
                                c15508.close();
                                interfaceC19106.setReadOnly(false);
                                interfaceC19107.setReadOnly(false);
                                Runnable runnable = new Runnable() { // from class: l.ۘ֨᩸
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C24943.m55636(this.f13024, enumC15245, z, interfaceC22705, i, list, interfaceC19106, interfaceC19107, i2, i3, c11516, arrayListM55627);
                                    }
                                };
                                if (z2) {
                                    runnable.run();
                                } else {
                                    c24943.post(runnable);
                                }
                            } catch (Throwable th) {
                                interfaceC19106.setReadOnly(false);
                                interfaceC19107.setReadOnly(false);
                                throw th;
                            }
                        } catch (Error | RuntimeException e) {
                            c24943.post(new Runnable() { // from class: l.᩺֨᩸
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C24943.m55661(this.f77543);
                                }
                            });
                            throw e;
                        }
                    } catch (Throwable th2) {
                        try {
                            c10024M25875.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        c10024M25874.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                try {
                    c15508.close();
                    throw th6;
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                    throw th6;
                }
            }
        } catch (Throwable th8) {
            try {
                c15509.close();
                throw th8;
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
                throw th8;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m55661(C24943 c24943) {
        c24943.f80730 = false;
        c24943.f80751 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55636(final C24943 c24943, EnumC15245 enumC15245, boolean z, InterfaceC22705 interfaceC22705, int i, List list, InterfaceC19106 interfaceC19106, InterfaceC19106 interfaceC19107, int i2, int i3, C11516 c11516, ArrayList arrayList) {
        try {
            if (c24943.f80728 == enumC15245 && c24943.f80724 == z && c24943.f80721 == interfaceC22705 && i == c24943.f80735.get() && c24943.f80732 == list && !c24943.m55655() && interfaceC19106 == c24943.f80725.m54021() && interfaceC19107 == c24943.f80733.m54021() && i2 == interfaceC19106.mo15344() && i3 == interfaceC19107.mo15344()) {
                List listM55628 = m55628(list, c11516, arrayList);
                synchronized (c24943.f80737) {
                    C13008 c13008 = c24943.f80737;
                    c13008.f41671 = -1;
                    c13008.f41673 = -1;
                    c13008.f41670 = -1;
                    c13008.f41672 = -1;
                }
                c24943.m55660(listM55628);
                c24943.invalidate();
                boolean z2 = c24943.f80755;
                C24132 c24132M55671 = c24943.m55671(z2);
                c24943.m55630(c24132M55671.m53968(), c24132M55671.m53882(), z2);
                c24943.m55658();
            } else if (!c24943.m55655()) {
                c24943.f80751 = true;
            }
            c24943.f80730 = false;
            if (c24943.f80751) {
                c24943.f80751 = false;
                c24943.post(new Runnable() { // from class: l.ܰ֨᩸
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = C24943.f80720;
                        this.f45068.m55697(false);
                    }
                });
            }
        } catch (Throwable th) {
            c24943.f80730 = false;
            if (c24943.f80751) {
                c24943.f80751 = false;
                c24943.post(new Runnable() { // from class: l.ܰ֨᩸
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = C24943.f80720;
                        this.f45068.m55697(false);
                    }
                });
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11516 m55629(List list, C15508 c15508, C15508 c15509, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int iMo20518;
        int i8;
        int i9;
        int size = list == null ? 0 : list.size();
        int iM37179 = i == -1 ? -1 : c15508.m37179(i);
        int iM371710 = i2 == -1 ? -1 : c15508.m37179(i2) + 1;
        int iM371711 = i3 == -1 ? -1 : c15509.m37179(i3);
        int iM371712 = i4 == -1 ? -1 : c15509.m37179(i4) + 1;
        int i10 = 0;
        int i11 = size;
        while (i10 < i11) {
            int i12 = (i10 + i11) >>> 1;
            InterfaceC8966 interfaceC8966 = (InterfaceC8966) list.get(i12);
            if ((iM37179 == -1 || interfaceC8966.mo20522() < iM37179) && (iM371711 == -1 || interfaceC8966.mo20518() < iM371711)) {
                i10 = i12 + 1;
            } else {
                i11 = i12;
            }
        }
        int iMax = Math.max(-1, i10 - 2);
        int i13 = 0;
        int i14 = size;
        while (i13 < i14) {
            int i15 = (i13 + i14) >>> 1;
            InterfaceC8966 interfaceC8967 = (InterfaceC8966) list.get(i15);
            if ((iM371710 == -1 || interfaceC8967.mo20528() > iM371710) && (iM371712 == -1 || interfaceC8967.mo20524() > iM371712)) {
                i14 = i15;
            } else {
                i13 = i15 + 1;
            }
        }
        int iMin = Math.min(size, i13 + 1);
        if (iMax >= 0) {
            InterfaceC8966 interfaceC8968 = (InterfaceC8966) list.get(iMax);
            int iMo9796 = interfaceC8968.mo9796();
            int iMo9801 = interfaceC8968.mo9801();
            int iMo20522 = interfaceC8968.mo20522();
            iMo20518 = interfaceC8968.mo20518();
            i5 = iMo9796;
            i6 = iMo9801;
            i7 = iMo20522;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            iMo20518 = 0;
        }
        int length = c15508.length();
        int length2 = c15509.length();
        if (iMin < size) {
            InterfaceC8966 interfaceC8969 = (InterfaceC8966) list.get(iMin);
            int iMo9807 = interfaceC8969.mo9807();
            int iMo9803 = interfaceC8969.mo9803();
            if (iMo9807 != c15508.length()) {
                iMo9807--;
            }
            if (iMo9803 != c15509.length()) {
                iMo9803--;
            }
            i9 = iMo9803;
            i8 = iMo9807;
        } else {
            i8 = length;
            i9 = length2;
        }
        return new C11516(iMax, iMin, i5, i8, i6, i9, i7, iMo20518);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m55628(List list, C11516 c11516, ArrayList arrayList) {
        if (list == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((list.size() + (arrayList.size() + (c11516.f36232 + 1))) - c11516.f36231);
        for (int i = 0; i <= c11516.f36232; i++) {
            arrayList2.add((InterfaceC8966) list.get(i));
        }
        arrayList2.addAll(arrayList);
        for (int i2 = c11516.f36231; i2 < list.size(); i2++) {
            arrayList2.add((InterfaceC8966) list.get(i2));
        }
        return arrayList2;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f80725.invalidate();
        this.f80733.invalidate();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m55690() {
        return this.f80723;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m55683(boolean z) {
        if (this.f80723 != z) {
            this.f80723 = z;
            super.invalidate();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55676(EnumC15245 enumC15245) {
        if (this.f80728 == enumC15245) {
            return;
        }
        C17359.requireNonNull(enumC15245);
        this.f80728 = enumC15245;
        if (this.f80725.m54099() > 0 || this.f80733.m54099() > 0) {
            m55656();
            invalidate();
            m55658();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC15245 m55684() {
        return this.f80728;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m55699(boolean z) {
        if (this.f80724 == z) {
            return;
        }
        this.f80724 = z;
        if (this.f80725.m54099() > 0 || this.f80733.m54099() > 0) {
            m55656();
            invalidate();
            m55658();
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m55695() {
        return this.f80724;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55678(C20995 c20995) {
        this.f80721 = c20995;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m55660(List list) {
        this.f80732 = list;
        this.f80735.incrementAndGet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24132 m55671(boolean z) {
        return z ? this.f80725 : this.f80733;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C24132 m55686() {
        return this.f80725;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C24132 m55680() {
        return this.f80733;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m55685() {
        return this.f80725.m54083() && this.f80733.m54083();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m55694(boolean z) {
        this.f80725.m54107(z);
        this.f80733.m54107(z);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55696() {
        boolean z;
        synchronized (this.f80729) {
            if (this.f80743) {
                z = false;
            } else {
                this.f80743 = true;
                this.f80739 = false;
                this.f80742 = false;
                this.f80735.incrementAndGet();
                z = true;
            }
        }
        if (z) {
            this.f80725.m53932(true, false);
            this.f80733.m53932(true, false);
            this.f80725.m54050();
            this.f80733.m54050();
            this.f80725.m54111();
            this.f80733.m54111();
        }
        C5261.m15834(this.f80737);
        synchronized (this.f80737) {
            C13008 c13008 = this.f80737;
            c13008.f41671 = -1;
            c13008.f41673 = -1;
            c13008.f41670 = -1;
            c13008.f41672 = -1;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m55698() {
        synchronized (this.f80729) {
            if (this.f80743) {
                this.f80743 = false;
                if (this.f80726 || m55624()) {
                    m55672();
                }
                this.f80725.m53960();
                this.f80733.m53960();
                if (!this.f80725.m54109()) {
                    this.f80725.m54010();
                }
                if (!this.f80733.m54109()) {
                    this.f80733.m54010();
                }
                if (this.f80742 || m55624()) {
                    return;
                }
                this.f80725.m53932(false, false);
                this.f80733.m53932(false, false);
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m55655() {
        boolean z;
        synchronized (this.f80729) {
            z = this.f80743;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        boolean z2 = this.f80748;
        C24132 c24132 = this.f80733;
        C24132 c24133 = this.f80725;
        if (z2) {
            int iM19160 = C6907.m19160(2.5f);
            int i7 = i6 / 2;
            c24133.layout(0, 0, i5, i7 - iM19160);
            c24132.layout(0, i7 + iM19160, i5, i6);
            return;
        }
        int i8 = i5 / 2;
        c24133.layout(0, 0, i8, i6);
        c24132.layout(i8, 0, i5, i6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55673(CharSequence charSequence, CharSequence charSequence2, AbstractC22044 abstractC22044, AbstractC22044 abstractC22045) {
        C24132 c24132 = this.f80725;
        if (c24132.m54109()) {
            return;
        }
        C24132 c24133 = this.f80733;
        if (c24133.m54109()) {
            return;
        }
        m55647();
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        InterfaceC19106 interfaceC19106M54022 = c24133.m54021();
        this.f80726 = false;
        this.f80753 = null;
        try {
            if (C22415.m50557()) {
                c24132.m53930(abstractC22044, charSequence);
                m55631(interfaceC19106M54021, interfaceC19106M54022);
                if (m55624()) {
                    m55672();
                    return;
                }
                c24133.m53930(abstractC22045, charSequence2);
            } else {
                this.f80726 = true;
                m55660((List) null);
                m55646();
                if (!new C7788(new C20227(this)).m21180(c24132, charSequence, abstractC22044, c24133, charSequence2, abstractC22045)) {
                    m55672();
                    return;
                }
            }
            m55631(interfaceC19106M54021, interfaceC19106M54022);
            if (m55624()) {
                m55672();
                return;
            }
            InterfaceC19106 interfaceC19106M54023 = c24132.m54021();
            InterfaceC19106 interfaceC19106M54024 = c24133.m54021();
            interfaceC19106M54023.setReadOnly(true);
            interfaceC19106M54024.setReadOnly(true);
            this.f80746 = interfaceC19106M54023;
            this.f80744 = interfaceC19106M54024;
            C15508 c15508Mo15337 = interfaceC19106M54023.mo15337();
            try {
                C15508 c15508Mo15338 = interfaceC19106M54024.mo15337();
                try {
                    this.f80745 = c15508Mo15337.m37177();
                    this.f80756 = c15508Mo15338.m37177();
                    this.f80753 = m55670(c15508Mo15337, c15508Mo15338);
                    c15508Mo15338.close();
                    c15508Mo15337.close();
                    m55651();
                    if (m55624()) {
                        m55672();
                    }
                } catch (Throwable th) {
                    try {
                        c15508Mo15338.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c15508Mo15337.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException | Error | RuntimeException e) {
            m55631(interfaceC19106M54021, interfaceC19106M54022);
            m55672();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55631(InterfaceC19106 interfaceC19106, InterfaceC19106 interfaceC19107) {
        if (this.f80726) {
            return;
        }
        if (this.f80725.m54021() == interfaceC19106 && this.f80733.m54021() == interfaceC19107) {
            return;
        }
        this.f80726 = true;
        m55660((List) null);
        m55646();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55672() {
        this.f80742 = true;
        this.f80726 = false;
        this.f80753 = null;
        try {
            this.f80725.m53895();
            this.f80733.m53895();
        } finally {
            m55647();
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m55647() {
        InterfaceC19106 interfaceC19106 = this.f80746;
        InterfaceC19106 interfaceC19107 = this.f80744;
        this.f80744 = null;
        this.f80746 = null;
        if (interfaceC19106 != null) {
            interfaceC19106.setReadOnly(false);
            interfaceC19107.setReadOnly(false);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m55668() {
        this.f80725.m53966();
        this.f80733.m53966();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m55667() {
        return this.f80725.m53884() || this.f80733.m53884();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m55693() {
        C24132 c24132 = this.f80725;
        try {
            InterfaceC19106 interfaceC19106 = this.f80746;
            InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
            C24132 c24133 = this.f80733;
            if (interfaceC19106 == interfaceC19106M54021 && this.f80744 == c24133.m54021() && this.f80745 == this.f80746.mo15344() && this.f80756 == this.f80744.mo15344()) {
                m55660(this.f80753);
            } else {
                m55660((List) null);
                post(new RunnableC6057(0, this));
            }
            this.f80753 = null;
            this.f80726 = false;
            c24132.m54093();
            c24133.m54093();
            boolean zM53953 = c24132.m53953();
            boolean zM53954 = c24133.m53953();
            if (zM53953 && !zM53954) {
                c24133.m53998(true);
            } else if (!zM53953 && zM53954) {
                c24132.m53998(true);
            }
            invalidate();
            m55658();
        } finally {
            m55647();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m55682() {
        this.f80739 = true;
        this.f80754.m36343();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean m55624() {
        return this.f80739 || this.f80725.m54109() || this.f80733.m54109();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m55651() {
        if (C22415.m50557()) {
            return;
        }
        boolean z = false;
        while (m55667()) {
            if (m55624()) {
                this.f80725.m54012();
                this.f80733.m54012();
            }
            try {
                Thread.sleep(10L);
            } catch (InterruptedException unused) {
                z = true;
                this.f80739 = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m55700() {
        return this.f80755;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C24132 m55666() {
        return this.f80755 ? this.f80725 : this.f80733;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m55688() {
        List list = this.f80732;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m55669(int i, boolean z) {
        List list = this.f80732;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            InterfaceC8966 interfaceC8966 = (InterfaceC8966) list.get(i3);
            int iMo9797 = interfaceC8966.mo9797(z);
            int iMo9799 = interfaceC8966.mo9799(z);
            if (i < iMo9797) {
                size = i3 - 1;
            } else {
                if (i <= iMo9799 && (i != iMo9799 || iMo9797 >= iMo9799)) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m55691() {
        InterfaceC8966 interfaceC8966;
        List list = this.f80732;
        if (list == null || list.isEmpty()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        boolean z = this.f80755;
        int iM53968 = (z ? this.f80725 : this.f80733).m53968();
        int i = 0;
        while (true) {
            if (i >= this.f80732.size()) {
                interfaceC8966 = null;
                break;
            }
            interfaceC8966 = (InterfaceC8966) this.f80732.get(i);
            if (interfaceC8966.mo9797(z) > iM53968) {
                break;
            } else {
                i++;
            }
        }
        if (interfaceC8966 == null) {
            interfaceC8966 = (InterfaceC8966) this.f80732.get(0);
        }
        m55643(z, (InterfaceC9711) interfaceC8966, true);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m55692() {
        InterfaceC8966 interfaceC8966;
        List list = this.f80732;
        if (list == null || list.isEmpty()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        boolean z = this.f80755;
        int iM53968 = (z ? this.f80725 : this.f80733).m53968();
        int size = this.f80732.size() - 1;
        while (true) {
            if (size < 0) {
                interfaceC8966 = null;
                break;
            }
            interfaceC8966 = (InterfaceC8966) this.f80732.get(size);
            if (interfaceC8966.mo9799(z) < iM53968) {
                break;
            } else {
                size--;
            }
        }
        if (interfaceC8966 == null) {
            interfaceC8966 = (InterfaceC8966) C7750.m21093(1, this.f80732);
            this.f80732.size();
        }
        m55643(z, (InterfaceC9711) interfaceC8966, true);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m55702() {
        List list = this.f80732;
        if (list == null || list.isEmpty()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        boolean z = this.f80755;
        C24132 c24132 = z ? this.f80725 : this.f80733;
        if (!c24132.isFocused()) {
            c24132.requestFocus();
        }
        m55643(z, (InterfaceC9711) this.f80732.get(0), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55643(boolean z, InterfaceC9711 interfaceC9711, boolean z2) {
        int iMo9797 = interfaceC9711.mo9797(z);
        C24132 c24132 = z ? this.f80725 : this.f80733;
        if (c24132.m53994()) {
            c24132.m53880();
            c24132.mo52339(iMo9797);
            c24132.m53975();
            int iM49687 = (int) this.f80741.m49687(c24132);
            int iM16189 = (int) (c24132.f78066.m16189() * c24132.f78022.m33646(iMo9797));
            if (z2) {
                c24132.m54106(0, c24132.m53873(iM16189 - iM49687));
            } else {
                c24132.scrollTo(0, c24132.m53873(iM16189 - iM49687));
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m55656() {
        C24132 c24132 = this.f80725;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        C24132 c24133 = this.f80733;
        InterfaceC19106 interfaceC19106M54022 = c24133.m54021();
        interfaceC19106M54021.setReadOnly(true);
        interfaceC19106M54022.setReadOnly(true);
        try {
            C15508 c15508Mo15337 = interfaceC19106M54021.mo15337();
            try {
                C15508 c15508Mo15338 = interfaceC19106M54022.mo15337();
                try {
                    ArrayList arrayListM55670 = m55670(c15508Mo15337, c15508Mo15338);
                    if (interfaceC19106M54021 == c24132.m54021() && interfaceC19106M54022 == c24133.m54021() && c15508Mo15337.m37177() == interfaceC19106M54021.mo15344() && c15508Mo15338.m37177() == interfaceC19106M54022.mo15344()) {
                        m55660(arrayListM55670);
                    } else {
                        m55660((List) null);
                        post(new Runnable() { // from class: l.ᩳ֨᩸
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i = C24943.f80720;
                                this.f60892.m55697(false);
                            }
                        });
                    }
                    c15508Mo15338.close();
                    c15508Mo15337.close();
                    interfaceC19106M54021.setReadOnly(false);
                    interfaceC19106M54022.setReadOnly(false);
                } catch (Throwable th) {
                    try {
                        c15508Mo15338.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c15508Mo15337.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            interfaceC19106M54021.setReadOnly(false);
            interfaceC19106M54022.setReadOnly(false);
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m55670(C15508 c15508, C15508 c15509) {
        C10024 c10024M25874 = C10024.m25874(c15508);
        try {
            C10024 c10024M25875 = C10024.m25874(c15509);
            try {
                ArrayList arrayListM55627 = m55627(c10024M25874.range(0, c10024M25874.length()), c10024M25875.range(0, c10024M25875.length()), this.f80728, this.f80724, this.f80721, this.f80754);
                c10024M25875.close();
                c10024M25874.close();
                return arrayListM55627;
            } catch (Throwable th) {
                try {
                    c10024M25875.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c10024M25874.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m55627(CharSequence charSequence, CharSequence charSequence2, EnumC15245 enumC15245, boolean z, InterfaceC22705 interfaceC22705, C15087 c15087) {
        EnumC6950 enumC6950;
        if (!z) {
            C10129 c10129 = new C10129(charSequence);
            charSequence2 = new C10129(charSequence2);
            charSequence = c10129;
        }
        int i = C4805.f16826[enumC15245.ordinal()];
        if (i == 1) {
            enumC6950 = EnumC6950.DEFAULT;
        } else if (i == 2) {
            enumC6950 = EnumC6950.TRIM_WHITESPACES;
        } else if (i == 3 || i == 4) {
            enumC6950 = EnumC6950.IGNORE_WHITESPACES;
        } else {
            throw new RuntimeException();
        }
        int i2 = 0;
        boolean z2 = enumC15245 == EnumC15245.IGNORE_WHITESPACES_AND_EMPTY_LINES;
        c15087.m36346();
        ArrayList arrayListM22626 = C8441.m22626(charSequence, charSequence2, C21801.m49449(charSequence), C21801.m49449(charSequence2), enumC6950, EnumC11203.WORDS, c15087);
        if (!c15087.m36344()) {
            if (interfaceC22705 != null) {
                Iterator it = arrayListM22626.iterator();
                while (it.hasNext()) {
                    InterfaceC8966 interfaceC8966 = (InterfaceC8966) it.next();
                    String strSubstring = TextUtils.substring(charSequence, interfaceC8966.mo9807(), interfaceC8966.mo9796());
                    String strSubstring2 = TextUtils.substring(charSequence2, interfaceC8966.mo9803(), interfaceC8966.mo9801());
                    InterfaceC15970 interfaceC15970ListIterator = ((C9829) ((C20995) interfaceC22705).f67119).listIterator(0);
                    while (interfaceC15970ListIterator.hasNext()) {
                        C4245 c4245 = (C4245) interfaceC15970ListIterator.next();
                        c4245.m13568reset((CharSequence) strSubstring);
                        if (c4245.matches()) {
                            c4245.m13568reset((CharSequence) strSubstring2);
                            if (c4245.matches()) {
                                it.remove();
                                break;
                            }
                        }
                    }
                }
            }
            if (arrayListM22626.isEmpty()) {
                return arrayListM22626;
            }
            final ArrayList arrayList = new ArrayList();
            final CharSequence charSequence3 = charSequence;
            final CharSequence charSequence4 = charSequence2;
            final EnumC6950 enumC6951 = enumC6950;
            final boolean z3 = z2;
            Consumer consumer = new Consumer() { // from class: l.ۖۛܶ
                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return C12312.$default$andThen(this, consumer2);
                }

                /* JADX WARN: Code duplicated, block: B:26:0x0090  */
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    int i3;
                    Object c7475;
                    List listSingletonList;
                    CharSequence charSequence5;
                    CharSequence charSequence6;
                    List list = (List) obj;
                    int size = list.size();
                    if (!z3) {
                        i3 = 0;
                    } else if (enumC6951 == EnumC6950.IGNORE_WHITESPACES) {
                        i3 = 0;
                        while (true) {
                            charSequence5 = charSequence3;
                            charSequence6 = charSequence4;
                            if (i3 >= size) {
                                break;
                            }
                            InterfaceC8966 interfaceC8967 = (InterfaceC8966) list.get(i3);
                            C3901 c3901 = new C3901(interfaceC8967.mo9807(), interfaceC8967.mo9796(), charSequence5);
                            C3901 c3902 = new C3901(interfaceC8967.mo9803(), interfaceC8967.mo9801(), charSequence6);
                            if ((interfaceC8967.mo20527() == null || !interfaceC8967.mo20527().isEmpty()) && !C7569.m20686(c3901, c3902)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        while (i3 < size) {
                            InterfaceC8966 interfaceC8968 = (InterfaceC8966) list.get(size - 1);
                            C3901 c3903 = new C3901(interfaceC8968.mo9807(), interfaceC8968.mo9796(), charSequence5);
                            C3901 c3904 = new C3901(interfaceC8968.mo9803(), interfaceC8968.mo9801(), charSequence6);
                            if ((interfaceC8968.mo20527() == null || !interfaceC8968.mo20527().isEmpty()) && !C7569.m20686(c3903, c3904)) {
                                break;
                            } else {
                                size--;
                            }
                        }
                    } else {
                        i3 = 0;
                    }
                    if (i3 == size) {
                        listSingletonList = Collections.EMPTY_LIST;
                    } else {
                        List<InterfaceC8966> listSubList = list.subList(i3, size);
                        if (listSubList.size() == 1) {
                            c7475 = (InterfaceC8966) listSubList.get(0);
                        } else {
                            InterfaceC8966 interfaceC8969 = (InterfaceC8966) listSubList.get(0);
                            InterfaceC8966 interfaceC89610 = (InterfaceC8966) C7750.m21093(1, listSubList);
                            ArrayList arrayList2 = new ArrayList();
                            for (InterfaceC8966 interfaceC89611 : listSubList) {
                                for (InterfaceC9711 interfaceC9711 : interfaceC89611.mo20527() != null ? interfaceC89611.mo20527() : Collections.singletonList(new C3000(0, interfaceC89611.mo9796() - interfaceC89611.mo9807(), 0, interfaceC89611.mo9801() - interfaceC89611.mo9803()))) {
                                    int iMo9807 = interfaceC89611.mo9807() - interfaceC8969.mo9807();
                                    int iMo9803 = interfaceC89611.mo9803() - interfaceC8969.mo9803();
                                    InterfaceC9711 interfaceC9712 = (InterfaceC9711) (arrayList2.isEmpty() ? null : j$$ExternalSyntheticOutline0.m(arrayList2, 1));
                                    if (interfaceC9712 != null && interfaceC9712.mo9796() == interfaceC9711.mo9807() + iMo9807 && interfaceC9712.mo9801() == interfaceC9711.mo9803() + iMo9803) {
                                        arrayList2.remove(arrayList2.size() - 1);
                                        arrayList2.add(new C3000(interfaceC9712.mo9807(), interfaceC9711.mo9796() + iMo9807, interfaceC9712.mo9803(), interfaceC9711.mo9801() + iMo9803));
                                    } else {
                                        arrayList2.add(new C3000(interfaceC9711.mo9807() + iMo9807, interfaceC9711.mo9796() + iMo9807, interfaceC9711.mo9803() + iMo9803, interfaceC9711.mo9801() + iMo9803));
                                    }
                                }
                            }
                            c7475 = new C7475(interfaceC8969.mo20528(), interfaceC89610.mo20522(), interfaceC8969.mo20524(), interfaceC89610.mo20518(), interfaceC8969.mo9807(), interfaceC89610.mo9796(), interfaceC8969.mo9803(), interfaceC89610.mo9801(), arrayList2);
                        }
                        listSingletonList = Collections.singletonList(c7475);
                    }
                    arrayList.addAll(listSingletonList);
                }
            };
            for (int i3 = 1; i3 < arrayListM22626.size(); i3++) {
                InterfaceC8966 interfaceC8967 = (InterfaceC8966) arrayListM22626.get(i3 - 1);
                InterfaceC8966 interfaceC8968 = (InterfaceC8966) arrayListM22626.get(i3);
                if (interfaceC8967.mo20522() != interfaceC8968.mo20528() || interfaceC8967.mo20518() != interfaceC8968.mo20524() || interfaceC8967.mo9796() != interfaceC8968.mo9807() || interfaceC8967.mo9801() != interfaceC8968.mo9803()) {
                    consumer.n(arrayListM22626.subList(i2, i3));
                    i2 = i3;
                }
            }
            if (i2 < arrayListM22626.size()) {
                consumer.n(arrayListM22626.subList(i2, arrayListM22626.size()));
            }
            return arrayList;
        }
        return new ArrayList();
    }

    @Override // l.InterfaceC9409
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo24787(float f, float f2) {
        return this.f80725.mo24787(f, f2) || this.f80733.mo24787(f, f2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55679(RunnableC24725 runnableC24725) {
        this.f80749 = runnableC24725;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m55658() {
        if (this.f80749 != null) {
            if (C22415.m50557()) {
                this.f80749.run();
            } else {
                C21576.m49068(this.f80749);
            }
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m55646() {
        if (C22415.m50557()) {
            invalidate();
            m55658();
        } else {
            C21576.m49068(new RunnableC12022(0, this));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m55632(C24943 c24943) {
        c24943.invalidate();
        c24943.m55658();
    }
}
