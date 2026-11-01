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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes2.dex */
public class C3040 extends ViewGroup implements InterfaceC11612 {

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f11359 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f11360;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean f11361;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f11362;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6111 f11363;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f11364;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5863 f11365;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f11366;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public EnumC10803 f11367;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f11368;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f11369;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C23503 f11370;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f11371;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f11372;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f11373;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C5863 f11374;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f11375;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f11376;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f11377;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f11378;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final Object f11379;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C16936 f11380;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6111 f11381;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f11382;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C16447 f11383;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f11384;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9285 f11385;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final float[] f11386;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public RunnableC17794 f11387;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2916 f11388;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f11389;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public boolean f11390;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f11391;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f11392;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f11393;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2916 f11394;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f11395;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final Path f11396;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f11397;

    public C3040(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3040(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11374 = new C5863();
        this.f11365 = new C5863();
        C23503 c23503 = new C23503();
        c23503.f76087 = -1;
        c23503.f76085 = -1;
        c23503.f76084 = -1;
        c23503.f76086 = -1;
        this.f11370 = c23503;
        this.f11379 = new Object();
        this.f11369 = new AtomicInteger();
        this.f11383 = new C16447(this);
        this.f11396 = new Path();
        this.f11386 = new float[4];
        this.f11380 = new C16936();
        this.f11364 = true;
        this.f11368 = new C9186(Boolean.TRUE);
        this.f11366 = true;
        this.f11367 = EnumC10803.DO_NOT_IGNORE;
        this.f11376 = false;
        this.f11361 = false;
        this.f11393 = true;
        this.f11371 = true;
        this.f11373 = 300;
        setMotionEventSplittingEnabled(false);
        C6111 c6111 = new C6111(context, null);
        this.f11381 = c6111;
        C6111 c6112 = new C6111(context, null);
        this.f11363 = c6112;
        addView(c6111);
        addView(c6112);
        c6111.m16853(new C19975(this, true));
        c6112.m16853(new C19975(this, false));
        c6111.m16917();
        c6112.m16917();
        c6111.m17059();
        c6112.m17059();
        c6111.m16953();
        c6112.m16953();
        this.f11391 = C20368.m45983(-13158601, -1309);
        this.f11360 = C20368.m45983(-9803710, -332368);
        C6111.m16666(c6111, c6112);
        C1590 c1590 = c6111.f20794;
        C1590 c1591 = c6112.f20794;
        c1590.f6436 = 0;
        c1591.f6436 = 0;
        c1590.f6384 = true;
        c1591.f6384 = true;
        c1590.f6422 = true;
        c1591.f6422 = true;
        c1590.f6393 = true;
        c1591.f6393 = true;
        c1590.f6395 = true;
        c1591.f6395 = true;
        c1590.f6407 = true;
        c1591.f6407 = true;
        boolean z = this.f11361;
        c1590.f6381 = z;
        c1591.f6381 = true;
        c1590.f6404 = 0;
        c1591.f6404 = 0;
        c1590.f6390 = 1.0f;
        c1591.f6390 = 1.0f;
        boolean z2 = this.f11393;
        c1590.f6442 = z2;
        c1591.f6442 = z2;
        if (z) {
            int intrinsicHeight = c1590.f6382.getIntrinsicHeight() * 2;
            c1591.f6412 = intrinsicHeight;
            c1590.f6412 = intrinsicHeight;
        }
        int i2 = c1590.f6394;
        int iAlpha = (i2 & 16777215) | (((int) (Color.alpha(i2) * 0.5f)) << 24);
        c1591.f6394 = iAlpha;
        c1590.f6394 = iAlpha;
        c1590.f6389 = new C7274(this);
        c1591.f6389 = new C20680(this);
        c6111.m16869(new C18280(3, this));
        c6112.m16869(new C4895(this));
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: l.ᩳۛۖ
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                C3040.m9062(this.f56549, view, z3);
            }
        };
        c6111.setOnFocusChangeListener(onFocusChangeListener);
        c6112.setOnFocusChangeListener(onFocusChangeListener);
        c6111.m16864(new InterfaceC7191() { // from class: l.ᩴۛۖ
            @Override // l.InterfaceC7191
            /* JADX INFO: renamed from: ۙ */
            public final void mo4041(int i3, int i4) {
                C3040.m9081(this.f59053, i3, i4);
            }
        });
        c6112.m16864(new InterfaceC7191() { // from class: l.۠ۛۖ
            @Override // l.InterfaceC7191
            /* JADX INFO: renamed from: ۙ */
            public final void mo4041(int i3, int i4) {
                C3040.m9060(this.f26199, i3, i4);
            }
        });
        c6111.f20704 = new C1629(this, true);
        c6112.f20704 = new C1629(this, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9061(C3040 c3040, int i, int i2, int i3) {
        if (c3040.f11371) {
            C6111 c6111 = c3040.f11381;
            C6111 c6112 = c3040.f11363;
            if (c6111.isFocused() || c6111.isPressed()) {
                if (i == i3) {
                    c6112.m16976(i2, c6112.m17066());
                    c3040.invalidate();
                    return;
                }
                C16447 c16447 = c3040.f11383;
                if (c16447.m38715(c6111, c6112, true)) {
                    float fM17870 = c6111.f20794.m17870();
                    float fM38716 = (c16447.m38716(c6111) - ((c16447.f52886 * fM17870) - i3)) / fM17870;
                    int i4 = c16447.f52889;
                    int i5 = c16447.f52888;
                    i3 = (int) (((((i4 - i5) * fM38716) + i5) * fM17870) - c16447.m38716(c6112));
                }
                c6112.m16976(i2, i3);
                c3040.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9082(C3040 c3040, int i, int i2, int i3) {
        if (c3040.f11371) {
            C6111 c6111 = c3040.f11363;
            C6111 c6112 = c3040.f11381;
            if (c6111.isFocused() || c6111.isPressed()) {
                if (i == i3) {
                    c6112.m16976(i2, c6112.m17066());
                    c3040.invalidate();
                    return;
                }
                C16447 c16447 = c3040.f11383;
                if (c16447.m38715(c6111, c6112, false)) {
                    float fM17870 = c6111.f20794.m17870();
                    float fM38716 = (c16447.m38716(c6111) - ((c16447.f52886 * fM17870) - i3)) / fM17870;
                    int i4 = c16447.f52889;
                    int i5 = c16447.f52888;
                    i3 = (int) (((((i4 - i5) * fM38716) + i5) * fM17870) - c16447.m38716(c6112));
                }
                c6112.m16976(i2, i3);
                c3040.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9062(C3040 c3040, View view, boolean z) {
        if (z) {
            boolean z2 = view == c3040.f11381;
            if (c3040.f11364 != z2) {
                c3040.f11364 = z2;
                c3040.f11368.mo23642(Boolean.valueOf(z2));
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9081(C3040 c3040, int i, int i2) {
        C6111 c6111 = c3040.f11363;
        if (c3040.f11393 && c3040.f11364) {
            c3040.m9057(i, i2, true);
            c6111.invalidate();
        } else if (c3040.f11361) {
            c6111.invalidate();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9060(C3040 c3040, int i, int i2) {
        C6111 c6111 = c3040.f11381;
        if (c3040.f11393 && !c3040.f11364) {
            c3040.m9057(i, i2, false);
            c6111.invalidate();
        } else if (c3040.f11361) {
            c6111.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m9057(int i, int i2, boolean z) {
        int iM9078;
        int iM9079;
        List list = this.f11378;
        if (list == null) {
            return;
        }
        C6111 c6111 = this.f11363;
        C6111 c6112 = this.f11381;
        C6111 c6113 = z ? c6112 : c6111;
        if (!z) {
            c6111 = c6112;
        }
        int length = c6113.m17000().length();
        int length2 = c6111.m17000().length();
        if (i == i2) {
            iM9078 = m9078(z, i, length, length2, list);
            iM9079 = iM9078;
        } else {
            iM9078 = m9078(z, i, length, length2, list);
            iM9079 = m9078(z, i2, length, length2, list);
        }
        c6111.mo16839(iM9078, iM9079);
        c6111.m16928();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a5 A[RETURN] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m9078(boolean z, int i, int i2, int i3, List list) {
        InterfaceC19053 interfaceC19053;
        int iMo22131;
        int iMo22127;
        InterfaceC19053 interfaceC19054;
        int iMo22132;
        List listMo23604;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC19053 interfaceC19055 = (InterfaceC19053) list.get(i4);
            int iMo22128 = interfaceC19055.mo22127(z);
            int iMo22133 = interfaceC19055.mo22131(z);
            if (iMo22128 > i || (i == i2 && iMo22128 == i && iMo22128 == iMo22133)) {
                if (i4 > 0 && (i = (i - interfaceC19054.mo22131(z)) + (iMo22132 = (interfaceC19054 = (InterfaceC19053) list.get(i4 - 1)).mo22131(!z))) < iMo22132) {
                    i = iMo22132;
                }
                int i5 = i4 + 1;
                if (i5 < size && i > (iMo22127 = ((InterfaceC19053) list.get(i5)).mo22127(!z))) {
                    i = iMo22127;
                }
                if (i > i3) {
                    return i3;
                }
                return i;
            }
            if (iMo22133 > i || (i == i2 && iMo22133 == i)) {
                boolean z2 = !z;
                int iMo22129 = interfaceC19055.mo22127(z2);
                int iMo22134 = interfaceC19055.mo22131(z2);
                int iM9078 = i - iMo22128;
                if ((interfaceC19055 instanceof InterfaceC19759) && (listMo23604 = ((InterfaceC19759) interfaceC19055).mo23604()) != null) {
                    iM9078 = m9078(z, iM9078, interfaceC19055.mo22131(z) - interfaceC19055.mo22127(z), iMo22134 - iMo22129, listMo23604);
                }
                int i6 = iM9078 + iMo22129;
                if (i6 < iMo22129) {
                    return iMo22129;
                }
                return i6 > iMo22134 ? iMo22134 : i6;
            }
        }
        if (size > 0 && i >= (iMo22131 = (interfaceC19053 = (InterfaceC19053) list.get(size - 1)).mo22131(z))) {
            i = (i - iMo22131) + interfaceC19053.mo22131(!z);
        }
        if (i < 0) {
            return 0;
        }
        if (i > i3) {
            return i3;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m9111() {
        return this.f11361;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m9092(boolean z) {
        if (this.f11361 != z) {
            this.f11361 = z;
            C1590 c1590 = this.f11381.f20794;
            c1590.f6381 = z;
            C6111 c6111 = this.f11363;
            if (z) {
                C1590 c1591 = c6111.f20794;
                int intrinsicHeight = c1590.f6382.getIntrinsicHeight() * 2;
                c1591.f6412 = intrinsicHeight;
                c1590.f6412 = intrinsicHeight;
            } else {
                C1590 c1592 = c6111.f20794;
                int intrinsicHeight2 = c1590.f6382.getIntrinsicHeight() * 3;
                c1592.f6412 = intrinsicHeight2;
                c1590.f6412 = intrinsicHeight2;
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m9127(boolean z) {
        this.f11371 = z;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m9114() {
        return this.f11371;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9101(ActivityC4471 activityC4471, C18500 c18500) {
        this.f11368.m44959(activityC4471, new C18126(1, c18500));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9104(C11018 c11018) {
        c11018.writeInt(631841030);
        c11018.m27784(this.f11364);
        c11018.m27784(this.f11366);
        c11018.writeByte(this.f11367.ordinal());
        c11018.mo24508(8454);
        c11018.m27784(this.f11376);
        c11018.m27784(this.f11361);
        c11018.m27784(this.f11393);
        c11018.mo24508(8454);
        c11018.m27784(this.f11371);
        if (this.f11378 == null) {
            c11018.writeByte(0);
        } else {
            c11018.m27784(true);
            c11018.writeInt(this.f11378.size());
            Iterator it = this.f11378.iterator();
            while (it.hasNext()) {
                ((InterfaceC19759) it.next()).mo22128(c11018);
            }
        }
        this.f11381.m16870(c11018, true);
        this.f11363.m16870(c11018, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9105(C17367 c17367, AbstractC20745 abstractC20745, AbstractC20745 abstractC20746) {
        C20190.m45649((InterfaceC0433) c17367, 631841030);
        List list = null;
        m9079((List) null);
        this.f11364 = c17367.m40461();
        C9186 c9186 = this.f11368;
        boolean zBooleanValue = ((Boolean) c9186.m44956()).booleanValue();
        boolean z = this.f11364;
        if (zBooleanValue != z) {
            c9186.mo23641(Boolean.valueOf(z));
        }
        this.f11366 = c17367.m40461();
        this.f11367 = EnumC10803.values()[c17367.readByte() & 255];
        boolean zM40452 = c17367.m40452(8454);
        C6111 c6111 = this.f11363;
        C6111 c6112 = this.f11381;
        if (zM40452) {
            m9116(c17367.m40461());
            m9092(c17367.m40461());
            boolean zM40461 = c17367.m40461();
            this.f11393 = zM40461;
            c6112.f20794.f6442 = zM40461;
            c6111.f20794.f6442 = zM40461;
            invalidate();
        }
        if (c17367.m40452(8454)) {
            this.f11371 = c17367.m40461();
        }
        boolean zM40462 = c17367.m40461();
        if (zM40462) {
            int i = c17367.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C9176(c17367));
            }
            list = arrayList;
        }
        c6112.mo16878(c17367);
        c6111.mo16878(c17367);
        if (zM40462) {
            m9079(list);
        } else {
            m9086();
        }
        m9076();
        if (this.f11364) {
            if (c6111.isFocused()) {
                post(new RunnableC2853(c6112, 1));
            }
        } else if (c6112.isFocused()) {
            post(new RunnableC2853(c6111, 1));
        }
        m9084();
        if (abstractC20745 != null) {
            c6112.m16882(abstractC20745);
        }
        if (abstractC20746 != null) {
            c6111.m16882(abstractC20746);
        }
        m9084();
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
    public static void m9069(C3040 c3040, boolean z, C3662 c3662, int i, int i2, int i3, Canvas canvas, Paint paint, C1590 c1590) {
        Paint paint2;
        InterfaceC19759 interfaceC19759;
        int i4;
        int i5;
        C15070 c15070;
        C3040 c3041;
        C15070 c15071;
        float f;
        float f2;
        float f3;
        float fM30748;
        int i6;
        float f4;
        int i7;
        float f5;
        InterfaceC19759 interfaceC197510;
        int iMo22127;
        int iMo22131;
        boolean z2 = z;
        int i8 = c3040.f11360;
        C6111 c6111 = c3040.f11363;
        C6111 c6112 = c3040.f11381;
        AbstractC12359 abstractC12359 = c3040.m9098(z).f20764;
        List list = c3040.f11378;
        if (list == null || !c3040.m9098(z).m16831()) {
            return;
        }
        C5863 c5863 = z2 ? c3040.f11374 : c3040.f11365;
        C6111 c6111M9098 = c3040.m9098(z);
        c5863.getClass();
        C15070 c15072 = c5863.f20012;
        InterfaceC2916 interfaceC2916M17000 = c6111M9098.m17000();
        c5863.f20009 = interfaceC2916M17000;
        c5863.f20011 = interfaceC2916M17000.mo2395();
        c5863.f20016 = list;
        C13638.requireNonNull(c1590);
        c5863.f20015 = c1590;
        C13638.requireNonNull(c3662);
        c5863.f20013 = c3662;
        c5863.f20017 = i;
        c5863.f20010 = i2;
        c15072.clear();
        if (c3040.f11361) {
            boolean z3 = c3040.f11364;
            C6111 c6113 = z3 ? c6112 : c6111;
            int length = c6113.m17000().length();
            int iM16916 = c6113.m16916();
            if (iM16916 != c6113.m17020()) {
                paint2 = paint;
                interfaceC19759 = null;
            } else {
                if (z2) {
                    c6111 = c6112;
                }
                int size = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 <= size) {
                        if (i9 == size) {
                            iMo22131 = length;
                            iMo22127 = iMo22131;
                            interfaceC197510 = null;
                        } else {
                            interfaceC197510 = (InterfaceC19759) list.get(i9);
                            iMo22127 = interfaceC197510.mo22127(z3);
                            iMo22131 = interfaceC197510.mo22131(z3);
                        }
                        if (iMo22127 > iM16916 || (iM16916 == length && iMo22127 == iM16916 && iMo22127 == iMo22131)) {
                            if (z3 != z2 && i9 > 0) {
                                InterfaceC19759 interfaceC197511 = (InterfaceC19759) list.get(i9 - 1);
                                iM16916 = (iM16916 - interfaceC197511.mo22131(z3)) + interfaceC197511.mo22131(z2);
                            }
                            int iM30744 = c6111.f20764.m30744(iM16916);
                            if (iM30744 >= c5863.f20017 && iM30744 <= c5863.f20010) {
                                int iM10801 = c3662.m10801(iM30744);
                                int iM10812 = c3662.m10812(iM30744);
                                float fM30749 = abstractC12359.m30748(iM10801);
                                float fM307410 = abstractC12359.m30748(iM10812 + 1);
                                paint2 = paint;
                                paint2.setColor(i8);
                                canvas.drawRect(0.0f, fM30749, i3, fM307410, paint);
                                c15072.add((int) fM30749);
                                c15072.add((int) fM307410);
                                c15072.add(-1);
                                c15072.add(0);
                            }
                            interfaceC19759 = null;
                        } else if (interfaceC197510 == null || (iMo22131 <= iM16916 && !(iM16916 == length && iMo22131 == iM16916))) {
                            i9++;
                            size = size;
                        } else {
                            paint2 = paint;
                            interfaceC19759 = interfaceC197510;
                        }
                    }
                    paint2 = paint;
                    interfaceC19759 = null;
                }
            }
        } else {
            paint2 = paint;
            interfaceC19759 = null;
        }
        int iM10821 = c5863.f20013.m10821(c5863.f20017);
        int iM10822 = c5863.f20013.m10821(c5863.f20010) + 1;
        float fM17880 = c5863.f20015.m17880() / 16.0f;
        Iterator it = list.iterator();
        while (true) {
            C3040 c3042 = c3040;
            Paint paint3 = paint2;
            while (it.hasNext()) {
                InterfaceC19759 interfaceC197512 = (InterfaceC19759) it.next();
                int iMo23602 = z2 ? interfaceC197512.mo23602() : interfaceC197512.mo23598();
                Iterator it2 = it;
                int iMo23600 = z2 ? interfaceC197512.mo23600() : interfaceC197512.mo23594();
                if (iMo23600 >= iM10821) {
                    if (iMo23602 > iM10822) {
                        i4 = iM10821;
                        i5 = iM10822;
                        c15071 = c15072;
                    } else {
                        i5 = iM10822;
                        EnumC12214 enumC12214M30320 = EnumC12214.m30320(interfaceC197512);
                        i4 = iM10821;
                        int iM10802 = c3662.m10802(iMo23602, (iMo23602 - iM10821) + i);
                        c15071 = c15072;
                        if (iM10802 == -1) {
                            if (iMo23602 == c3662.m10803().f47319 + 1) {
                                iM10802 = c3662.size();
                            }
                        }
                        if (c3042.f11361) {
                            f = 0.0f;
                        } else {
                            if (z2) {
                                C1590 c1591 = c5863.f20015;
                                f2 = i3 - (c1591.f6390 * c1591.f6410);
                                f3 = 0.0f;
                            } else {
                                C1590 c1592 = c5863.f20015;
                                f = c1592.f6390 * c1592.f6410;
                            }
                            fM30748 = abstractC12359.m30748(iM10802);
                            if (iMo23602 == iMo23600) {
                                if (iM10802 == 0) {
                                    f5 = fM30748 + fM17880 + fM17880;
                                } else if (iM10802 == c3662.size()) {
                                    f4 = (fM30748 - fM17880) - fM17880;
                                } else {
                                    f5 = fM30748 + fM17880;
                                    fM30748 -= fM17880;
                                }
                                float f6 = fM30748;
                                fM30748 = f5;
                                f4 = f6;
                            } else {
                                i6 = 1;
                                while (true) {
                                    iM10802++;
                                    if (iM10802 > i2 || c3662.m10821(iM10802) >= iMo23600) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                                f4 = fM30748;
                                fM30748 = (c5863.f20015.m17870() * i6) + fM30748;
                            }
                            if (interfaceC197512 == interfaceC19759) {
                                paint3.setColor(i8);
                            } else {
                                paint3.setColor(enumC12214M30320.f40826);
                            }
                            canvas.drawRect(f3, f4, f2, fM30748, paint3);
                            c15071.add((int) f4);
                            c15071.add((int) fM30748);
                            c15071.add(enumC12214M30320.ordinal());
                            if (interfaceC197512.mo23604() == null) {
                                i7 = 0;
                            } else {
                                i7 = 1;
                            }
                            c15071.add(i7);
                            z2 = z;
                            paint2 = paint;
                            c15072 = c15071;
                            iM10822 = i5;
                            iM10821 = i4;
                            it = it2;
                        }
                        f2 = i3;
                        f3 = f;
                        fM30748 = abstractC12359.m30748(iM10802);
                        if (iMo23602 == iMo23600) {
                            if (iM10802 == 0) {
                                f5 = fM30748 + fM17880 + fM17880;
                            } else if (iM10802 == c3662.size()) {
                                f4 = (fM30748 - fM17880) - fM17880;
                            } else {
                                f5 = fM30748 + fM17880;
                                fM30748 -= fM17880;
                            }
                            float f7 = fM30748;
                            fM30748 = f5;
                            f4 = f7;
                        } else {
                            i6 = 1;
                            while (true) {
                                iM10802++;
                                if (iM10802 > i2) {
                                    break;
                                }
                                break;
                                break;
                                i6++;
                            }
                            f4 = fM30748;
                            fM30748 = (c5863.f20015.m17870() * i6) + fM30748;
                        }
                        if (interfaceC197512 == interfaceC19759) {
                            paint3.setColor(i8);
                        } else {
                            paint3.setColor(enumC12214M30320.f40826);
                        }
                        canvas.drawRect(f3, f4, f2, fM30748, paint3);
                        c15071.add((int) f4);
                        c15071.add((int) fM30748);
                        c15071.add(enumC12214M30320.ordinal());
                        if (interfaceC197512.mo23604() == null) {
                            i7 = 0;
                        } else {
                            i7 = 1;
                        }
                        c15071.add(i7);
                        z2 = z;
                        paint2 = paint;
                        c15072 = c15071;
                        iM10822 = i5;
                        iM10821 = i4;
                        it = it2;
                    }
                    c3041 = c3042;
                    c15070 = c15071;
                } else {
                    i4 = iM10821;
                    i5 = iM10822;
                    c15070 = c15072;
                    c3041 = c3040;
                    paint3 = paint;
                }
                z2 = z;
                c3042 = c3041;
                c15072 = c15070;
                iM10822 = i5;
                iM10821 = i4;
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
    public static void m9068(C3040 c3040, boolean z, C3662 c3662, int i, int i2, float f, float f2, boolean z2, Canvas canvas, Paint paint, InterfaceC13855 interfaceC13855, C1590 c1590) {
        int i3;
        InterfaceC19759 interfaceC19759;
        List list;
        List listMo23604;
        int iM10802;
        boolean z3;
        int iMo22129;
        int iMo221210;
        int iMo22123;
        int i4;
        List list2;
        boolean z4;
        float f3;
        int iMo23598;
        int iMo23594;
        C3662 c3663 = c3662;
        int i5 = i;
        int i6 = i2;
        AbstractC12359 abstractC12359 = c3040.m9098(z).f20764;
        List list3 = c3040.f11378;
        if (list3 == null || !c3040.m9098(z).m16831()) {
            return;
        }
        C5863 c5863 = z ? c3040.f11374 : c3040.f11365;
        if (c5863.f20016 != list3 || c5863.f20015 != c1590 || c5863.f20013 != c3663 || c5863.f20017 != i5 || c5863.f20010 != i6) {
            c3040.f11381.postInvalidate();
            c3040.f11363.postInvalidate();
            c3040.postInvalidate();
            return;
        }
        C15070 c15070 = c5863.f20012;
        EnumC12214[] enumC12214ArrValues = EnumC12214.values();
        int i7 = 0;
        for (int size = c15070.size(); i7 < size; size = size) {
            int i8 = c15070.getInt(i7);
            int i9 = c15070.getInt(i7 + 1);
            int i10 = c15070.getInt(i7 + 2);
            if (i10 < 0) {
                paint.setColor(c3040.f11391);
            } else {
                EnumC12214 enumC12214 = enumC12214ArrValues[i10];
                paint.setColor(c15070.getInt(i7 + 3) != 0 ? enumC12214.f40827 : enumC12214.f40826);
            }
            canvas.drawRect(f, i8, f2, i9, paint);
            i7 += 4;
        }
        C15070 c15071 = c1590.f6440;
        float fM17870 = c1590.m17870();
        int iM10821 = c5863.f20013.m10821(c5863.f20017);
        int iM10822 = c5863.f20013.m10821(c5863.f20010);
        int i11 = i5;
        while (iM10821 <= iM10822) {
            int i12 = 1;
            int size2 = list3.size() - 1;
            int i13 = 0;
            while (true) {
                if (i13 > size2) {
                    i3 = iM10822;
                    interfaceC19759 = null;
                    break;
                }
                int i14 = (i13 + size2) >>> i12;
                interfaceC19759 = (InterfaceC19759) list3.get(i14);
                if (z) {
                    iMo23598 = interfaceC19759.mo23602();
                    iMo23594 = interfaceC19759.mo23600();
                } else {
                    iMo23598 = interfaceC19759.mo23598();
                    iMo23594 = interfaceC19759.mo23594();
                }
                i3 = iM10822;
                int i15 = iMo23594;
                if (iM10821 < iMo23598) {
                    size2 = i14 - 1;
                } else if (iM10821 < i15) {
                    break;
                } else {
                    i13 = i14 + 1;
                }
                i12 = 1;
                iM10822 = i3;
            }
            if (interfaceC19759 == null || (listMo23604 = interfaceC19759.mo23604()) == null || (iM10802 = c3663.m10802(iM10821, i11)) == -1) {
                list = list3;
            } else {
                int iM10801 = c3663.m10801(iM10802);
                int iMin = Math.min(c3663.m10812(iM10802), i6);
                if (iM10801 < i5) {
                    iM10801 = i5;
                    z3 = false;
                } else {
                    z3 = true;
                }
                int i16 = iMin + 1;
                float fM30748 = abstractC12359.m30748(iM10801);
                int size3 = c3662.size();
                C9496 c9496M10817 = c3662.m10817();
                while (iM10801 <= iMin) {
                    int i17 = (int) fM30748;
                    int iM5427 = (!z2 || z3) ? 0 : c1590.m5427();
                    C14435 c14435M24325 = c9496M10817.m24325(iM10801);
                    C9496 c9496 = c9496M10817;
                    int i18 = c14435M24325.f47316;
                    int i19 = iMin;
                    int i20 = c14435M24325.f47317;
                    int i21 = i16;
                    if (iM10801 < size3 - 1 && c3663.m10821(iM10801 + 1) != c14435M24325.f47319) {
                        i20++;
                    }
                    int size4 = listMo23604.size();
                    float fM2080 = 0.0f;
                    int i22 = i18;
                    int i23 = 0;
                    while (i23 < size4) {
                        InterfaceC19053 interfaceC19053 = (InterfaceC19053) listMo23604.get(i23);
                        if (z) {
                            iMo22129 = interfaceC19053.mo22124() + interfaceC19759.mo22124();
                            iMo221210 = interfaceC19759.mo22124();
                            iMo22123 = interfaceC19053.mo22126();
                        } else {
                            iMo22129 = interfaceC19053.mo22129() + interfaceC19759.mo22129();
                            iMo221210 = interfaceC19759.mo22129();
                            iMo22123 = interfaceC19053.mo22123();
                        }
                        List list4 = listMo23604;
                        int i24 = iMo22129;
                        int i25 = size4;
                        int i26 = iMo22123 + iMo221210;
                        if (i26 <= i18 || i20 <= i24) {
                            i4 = i18;
                            list2 = list3;
                        } else {
                            int iMax = Math.max(i24, i18);
                            int iMin2 = Math.min(i26, i20);
                            if (z) {
                                i4 = i18;
                                list2 = list3;
                                if (interfaceC19053.mo22124() == interfaceC19053.mo22126()) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                i4 = i18;
                                list2 = list3;
                                if (interfaceC19053.mo22129() == interfaceC19053.mo22123()) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            }
                            C0363 c0363 = (C0363) interfaceC13855;
                            fM2080 += c0363.m2080(i22, fM2080, iMax);
                            float f4 = iM5427;
                            float f5 = fM2080 + f4;
                            if (z4) {
                                float f6 = fM17870 / 16.0f;
                                float f7 = (int) (f5 - f6);
                                f3 = (f6 * 2.0f) + f7;
                                f5 = f7;
                            } else {
                                if (iMin2 == i20) {
                                    f3 = f2;
                                } else {
                                    fM2080 += c0363.m2080(iMax, fM2080, iMin2);
                                    f3 = fM2080 + f4;
                                    i22 = iMin2;
                                }
                                if (f5 >= f3 && f3 >= f && f5 <= f2) {
                                    c15071.add(i17);
                                    c15071.add(Float.floatToRawIntBits(f5));
                                    c15071.add(Float.floatToRawIntBits(f3));
                                    c15071.add(EnumC12214.m30319(interfaceC19053).f40826);
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
                        listMo23604 = list4;
                    }
                    iM10801++;
                    fM30748 = abstractC12359.m30748(iM10801);
                    z3 = false;
                    c3663 = c3662;
                    c9496M10817 = c9496;
                    iMin = i19;
                    i16 = i21;
                }
                list = list3;
                i11 = i16;
            }
            iM10821++;
            iM10822 = i3;
            c3663 = c3662;
            i5 = i;
            i6 = i2;
            list3 = list;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9067(C3040 c3040, boolean z, C3662 c3662, float f, float f2, float f3, float f4, Canvas canvas, Paint paint, C1590 c1590) {
        float f5;
        float f6;
        int iM10801;
        int iM10812;
        List<InterfaceC19759> list = c3040.f11378;
        if (list == null || !c3040.m9098(z).m16831() || c3662.isEmpty()) {
            return;
        }
        int i = (int) (f4 - f2);
        int size = c3662.size();
        float f7 = c1590.f22194 * 3.0f;
        if (z && !c3040.f11361) {
            f6 = c1590.f6369 + f;
            f5 = f;
        } else {
            f5 = f3 - c1590.f6369;
            f6 = f3;
        }
        for (InterfaceC19759 interfaceC19759 : list) {
            int iMo23602 = z ? interfaceC19759.mo23602() : interfaceC19759.mo23598();
            int iMo23600 = z ? interfaceC19759.mo23600() : interfaceC19759.mo23594();
            int iM10804 = c3662.m10804(iMo23602);
            if (iM10804 == -1) {
                if (iMo23602 == c3662.m10803().f47319 + 1) {
                    iM10801 = c3662.size();
                }
            } else {
                iM10801 = c3662.m10801(iM10804);
            }
            int iM10805 = c3662.m10804(iMo23600);
            if (iM10805 == -1) {
                if (iMo23600 == c3662.m10803().f47319 + 1) {
                    iM10812 = c3662.size();
                }
            } else {
                iM10812 = c3662.m10812(iM10805);
            }
            float f8 = i;
            float f9 = size;
            float f10 = (iM10801 * f8) / f9;
            float f11 = (iM10812 * f8) / f9;
            float f12 = f8 - f7;
            if (f10 > f12) {
                f10 = f12;
            }
            if (f11 - f10 < f7) {
                f11 = f10 + f7;
            }
            paint.setColor(EnumC12214.m30320(interfaceC19759).f40825);
            canvas.drawRect(f5, f2 + f10, f6, f2 + f11, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C6111 c6111 = this.f11381;
        C6111 c6112 = this.f11363;
        C6111.m16743(c6111, c6112);
        C1590 c1590 = c6111.f20794;
        c6112.computeScroll();
        c6112.f20818 = true;
        this.f11397 = true;
        try {
            super.dispatchDraw(canvas);
            this.f11397 = false;
            c6112.f20818 = false;
            List list = this.f11378;
            boolean zM9071 = m9071(list);
            this.f11377 = zM9071;
            C4916 c4916 = c1590.f6438;
            if (this.f11361) {
                int bottom = c6111.getBottom();
                int top = c6112.getTop();
                c4916.setColor(C3224.m9670((C20368.f65975 & 16777215) | (-1610612736), C20368.f66004));
                canvas.drawRect(0.0f, bottom, getWidth(), top, c4916);
                c4916.setColor(C20368.f65975);
                canvas.drawRect(0.0f, bottom + 2, getWidth(), top - 2, c4916);
            } else {
                if (zM9071) {
                    C5863 c5863 = this.f11374;
                    int iM10821 = c5863.f20013.m10821(c5863.f20017);
                    C5863 c5864 = this.f11365;
                    int iM10822 = c5864.f20013.m10821(c5864.f20017);
                    int iM10823 = c5863.f20013.m10821(c5863.f20010) + 1;
                    int iM10824 = c5864.f20013.m10821(c5864.f20010) + 1;
                    float width = getWidth() / 2.0f;
                    C1590 c1591 = c5863.f20015;
                    float f = width - (c1591.f6390 * c1591.f6410);
                    C1590 c1592 = c5864.f20015;
                    float f2 = (c1592.f6390 * c1592.f6410) + width;
                    float f3 = c1590.f6410 / 2.0f;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC19759 interfaceC19759 = (InterfaceC19759) it.next();
                        if (interfaceC19759.mo23600() >= iM10821 || interfaceC19759.mo23594() >= iM10822) {
                            if (interfaceC19759.mo23602() <= iM10823 || interfaceC19759.mo23598() <= iM10824) {
                                EnumC12214 enumC12214M30320 = EnumC12214.m30320(interfaceC19759);
                                Iterator it2 = it;
                                Path path = this.f11396;
                                path.reset();
                                int i = iM10821;
                                float[] fArr = this.f11386;
                                int i2 = iM10822;
                                int i3 = iM10823;
                                if (c5863.m16074(interfaceC19759, true, fArr, 0) && c5864.m16074(interfaceC19759, false, fArr, 2)) {
                                    int paddingTop = c6111.getPaddingTop() - c6111.m17066();
                                    int paddingTop2 = c6112.getPaddingTop() - c6112.m17066();
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
                                    c4916.setColor(enumC12214M30320.f40826);
                                    canvas.drawPath(path, c4916);
                                }
                                it = it2;
                                iM10821 = i;
                                iM10822 = i2;
                                iM10823 = i3;
                            }
                        }
                    }
                }
                if (this.f11376 || !zM9071) {
                }
                C16447 c16447 = this.f11383;
                Paint paint = c16447.f52885;
                paint.setColor(C20368.f65970);
                C3040 c3040 = c16447.f52887;
                C6111 c6113 = c3040.f11363;
                C6111 c6114 = c3040.f11381;
                if (c3040.f11361) {
                    float top2 = c6114.getTop() + ((int) c16447.m38716(c6114));
                    canvas.drawLine(0.0f, top2, c3040.getWidth(), top2, paint);
                    float top3 = c6113.getTop() + ((int) c16447.m38716(c6113));
                    canvas.drawLine(0.0f, top3, c3040.getWidth(), top3, paint);
                    return;
                }
                float fM38716 = (int) c16447.m38716(c6114);
                canvas.drawLine(0.0f, fM38716, c3040.getWidth(), fM38716, paint);
                return;
            }
            if (this.f11376) {
            }
        } catch (Throwable th) {
            this.f11397 = false;
            c6112.f20818 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9064(C3040 c3040, C5863 c5863, boolean z) {
        c5863.f20014 = z;
        if (c3040.f11397 || c3040.f11377 == c3040.m9071(c3040.f11378)) {
            return;
        }
        super.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m9071(List list) {
        if (list == null) {
            return false;
        }
        C6111 c6111 = this.f11381;
        if (!c6111.m16831()) {
            return false;
        }
        C6111 c6112 = this.f11363;
        return c6112.m16831() && this.f11374.m16073(c6111, list) && this.f11365.m16073(c6112, list);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m9088(C3040 c3040) {
        return c3040.f11381.m16831() && c3040.f11363.m16831();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0108 */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9119(final boolean r24) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3040.m9119(boolean):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9063(final C3040 c3040, C3329 c3329, C3329 c33210, final C9392 c9392, final EnumC10803 enumC10803, final boolean z, final InterfaceC17152 interfaceC17152, final InterfaceC2916 interfaceC2916, final InterfaceC2916 interfaceC2917, final int i, final List list, final int i2, final int i3, boolean z2) {
        try {
            try {
                C20825 c20825M46853 = C20825.m46853(c3329);
                try {
                    C20825 c20825M46854 = C20825.m46853(c33210);
                    try {
                        final ArrayList<InterfaceC19759> arrayListM9054 = m9054(c20825M46853.range(c9392.f31793, c9392.f31798), c20825M46854.range(c9392.f31792, c9392.f31795), enumC10803, z, interfaceC17152, new C16936());
                        for (InterfaceC19759 interfaceC19759 : arrayListM9054) {
                            interfaceC19759.mo23593(interfaceC19759.mo23602() + c9392.f31796);
                            interfaceC19759.mo23601(interfaceC19759.mo23600() + c9392.f31796);
                            interfaceC19759.mo22130(interfaceC19759.mo22124() + c9392.f31793);
                            interfaceC19759.mo22132(interfaceC19759.mo22126() + c9392.f31793);
                            interfaceC19759.mo23595(interfaceC19759.mo23598() + c9392.f31799);
                            interfaceC19759.mo23591(interfaceC19759.mo23594() + c9392.f31799);
                            interfaceC19759.mo22135(interfaceC19759.mo22129() + c9392.f31792);
                            interfaceC19759.mo22133(interfaceC19759.mo22123() + c9392.f31792);
                        }
                        c20825M46854.close();
                        try {
                            try {
                                c20825M46853.close();
                                c33210.close();
                                c3329.close();
                                interfaceC2916.setReadOnly(false);
                                interfaceC2917.setReadOnly(false);
                                Runnable runnable = new Runnable() { // from class: l.ܶۛۖ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C3040.m9065(this.f49020, enumC10803, z, interfaceC17152, i, list, interfaceC2916, interfaceC2917, i2, i3, c9392, arrayListM9054);
                                    }
                                };
                                if (z2) {
                                    runnable.run();
                                } else {
                                    c3040.post(runnable);
                                }
                            } catch (Throwable th) {
                                interfaceC2916.setReadOnly(false);
                                interfaceC2917.setReadOnly(false);
                                throw th;
                            }
                        } catch (Error | RuntimeException e) {
                            c3040.post(new RunnableC0860(2, c3040));
                            throw e;
                        }
                    } catch (Throwable th2) {
                        try {
                            c20825M46854.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        c20825M46853.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                try {
                    c3329.close();
                    throw th6;
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                    throw th6;
                }
            }
        } catch (Throwable th8) {
            try {
                c33210.close();
                throw th8;
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
                throw th8;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9080(C3040 c3040) {
        c3040.f11375 = false;
        c3040.f11390 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9065(C3040 c3040, EnumC10803 enumC10803, boolean z, InterfaceC17152 interfaceC17152, int i, List list, InterfaceC2916 interfaceC2916, InterfaceC2916 interfaceC2917, int i2, int i3, C9392 c9392, ArrayList arrayList) {
        try {
            if (c3040.f11367 == enumC10803 && c3040.f11366 == z && c3040.f11385 == interfaceC17152 && i == c3040.f11369.get() && c3040.f11378 == list && !c3040.m9049() && interfaceC2916 == c3040.f11381.m17000() && interfaceC2917 == c3040.f11363.m17000() && i2 == interfaceC2916.mo2395() && i3 == interfaceC2917.mo2395()) {
                List listM9055 = m9055(list, c9392, arrayList);
                synchronized (c3040.f11370) {
                    C23503 c23503 = c3040.f11370;
                    c23503.f76086 = -1;
                    c23503.f76084 = -1;
                    c23503.f76085 = -1;
                    c23503.f76087 = -1;
                }
                c3040.m9079(listM9055);
                c3040.invalidate();
                boolean z2 = c3040.f11364;
                C6111 c6111M9098 = c3040.m9098(z2);
                c3040.m9057(c6111M9098.m16916(), c6111M9098.m17020(), z2);
                c3040.m9087();
            } else if (!c3040.m9049()) {
                c3040.f11390 = true;
            }
            c3040.f11375 = false;
            if (c3040.f11390) {
                c3040.f11390 = false;
                c3040.post(new RunnableC21385(0, c3040));
            }
        } catch (Throwable th) {
            c3040.f11375 = false;
            if (c3040.f11390) {
                c3040.f11390 = false;
                c3040.post(new RunnableC21385(0, c3040));
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9392 m9056(List list, C3329 c3329, C3329 c33210, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int iMo23594;
        int i8;
        int i9;
        int size = list == null ? 0 : list.size();
        int iM9893 = i == -1 ? -1 : c3329.m9893(i);
        int iM9894 = i2 == -1 ? -1 : c3329.m9893(i2) + 1;
        int iM9895 = i3 == -1 ? -1 : c33210.m9893(i3);
        int iM9896 = i4 == -1 ? -1 : c33210.m9893(i4) + 1;
        int i10 = 0;
        int i11 = size;
        while (i10 < i11) {
            int i12 = (i10 + i11) >>> 1;
            InterfaceC19759 interfaceC19759 = (InterfaceC19759) list.get(i12);
            if ((iM9893 == -1 || interfaceC19759.mo23600() < iM9893) && (iM9895 == -1 || interfaceC19759.mo23594() < iM9895)) {
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
            InterfaceC19759 interfaceC197510 = (InterfaceC19759) list.get(i15);
            if ((iM9894 == -1 || interfaceC197510.mo23602() > iM9894) && (iM9896 == -1 || interfaceC197510.mo23598() > iM9896)) {
                i14 = i15;
            } else {
                i13 = i15 + 1;
            }
        }
        int iMin = Math.min(size, i13 + 1);
        if (iMax >= 0) {
            InterfaceC19759 interfaceC197511 = (InterfaceC19759) list.get(iMax);
            int iMo22126 = interfaceC197511.mo22126();
            int iMo22123 = interfaceC197511.mo22123();
            int iMo23600 = interfaceC197511.mo23600();
            iMo23594 = interfaceC197511.mo23594();
            i5 = iMo22126;
            i6 = iMo22123;
            i7 = iMo23600;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            iMo23594 = 0;
        }
        int length = c3329.length();
        int length2 = c33210.length();
        if (iMin < size) {
            InterfaceC19759 interfaceC197512 = (InterfaceC19759) list.get(iMin);
            int iMo22124 = interfaceC197512.mo22124();
            int iMo22129 = interfaceC197512.mo22129();
            if (iMo22124 != c3329.length()) {
                iMo22124--;
            }
            if (iMo22129 != c33210.length()) {
                iMo22129--;
            }
            i9 = iMo22129;
            i8 = iMo22124;
        } else {
            i8 = length;
            i9 = length2;
        }
        return new C9392(iMax, iMin, i5, i8, i6, i9, i7, iMo23594);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m9055(List list, C9392 c9392, ArrayList arrayList) {
        if (list == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((list.size() + (arrayList.size() + (c9392.f31797 + 1))) - c9392.f31794);
        for (int i = 0; i <= c9392.f31797; i++) {
            arrayList2.add((InterfaceC19759) list.get(i));
        }
        arrayList2.addAll(arrayList);
        for (int i2 = c9392.f31794; i2 < list.size(); i2++) {
            arrayList2.add((InterfaceC19759) list.get(i2));
        }
        return arrayList2;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f11381.invalidate();
        this.f11363.invalidate();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m9121() {
        return this.f11376;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m9116(boolean z) {
        if (this.f11376 != z) {
            this.f11376 = z;
            super.invalidate();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9103(EnumC10803 enumC10803) {
        if (this.f11367 == enumC10803) {
            return;
        }
        C13638.requireNonNull(enumC10803);
        this.f11367 = enumC10803;
        if (this.f11381.m16842() > 0 || this.f11363.m16842() > 0) {
            m9086();
            invalidate();
            m9087();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC10803 m9110() {
        return this.f11367;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m9094(boolean z) {
        if (this.f11366 == z) {
            return;
        }
        this.f11366 = z;
        if (this.f11381.m16842() > 0 || this.f11363.m16842() > 0) {
            m9086();
            invalidate();
            m9087();
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m9123() {
        return this.f11366;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9102(C9285 c9285) {
        this.f11385 = c9285;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m9079(List list) {
        this.f11378 = list;
        this.f11369.incrementAndGet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6111 m9098(boolean z) {
        return z ? this.f11381 : this.f11363;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C6111 m9091() {
        return this.f11381;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C6111 m9117() {
        return this.f11363;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m9113() {
        return this.f11381.m17004() && this.f11363.m17004();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m9109(boolean z) {
        this.f11381.m17065(z);
        this.f11363.m17065(z);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m9118() {
        boolean z;
        synchronized (this.f11379) {
            if (this.f11395) {
                z = false;
            } else {
                this.f11395 = true;
                this.f11362 = false;
                this.f11384 = false;
                this.f11369.incrementAndGet();
                z = true;
            }
        }
        if (z) {
            this.f11381.m16887(true, false);
            this.f11363.m16887(true, false);
            this.f11381.m16905();
            this.f11363.m16905();
            this.f11381.m16997();
            this.f11363.m16997();
        }
        C4716.m13053().removeCallbacksAndMessages(this.f11370);
        synchronized (this.f11370) {
            C23503 c23503 = this.f11370;
            c23503.f76086 = -1;
            c23503.f76084 = -1;
            c23503.f76085 = -1;
            c23503.f76087 = -1;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m9093() {
        synchronized (this.f11379) {
            if (this.f11395) {
                this.f11395 = false;
                if (this.f11372 || m9085()) {
                    m9099();
                }
                this.f11381.m17001();
                this.f11363.m17001();
                if (!this.f11381.m16913()) {
                    this.f11381.m16972();
                }
                if (!this.f11363.m16913()) {
                    this.f11363.m16972();
                }
                if (this.f11384 || m9085()) {
                    return;
                }
                this.f11381.m16887(false, false);
                this.f11363.m16887(false, false);
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private boolean m9049() {
        boolean z;
        synchronized (this.f11379) {
            z = this.f11395;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        boolean z2 = this.f11361;
        C6111 c6111 = this.f11363;
        C6111 c6112 = this.f11381;
        if (z2) {
            int iM33769 = C13932.m33769(2.5f);
            int i7 = i6 / 2;
            c6112.layout(0, 0, i5, i7 - iM33769);
            c6111.layout(0, i7 + iM33769, i5, i6);
            return;
        }
        int i8 = i5 / 2;
        c6112.layout(0, 0, i8, i6);
        c6111.layout(i8, 0, i5, i6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9100(CharSequence charSequence, CharSequence charSequence2, AbstractC20745 abstractC20745, AbstractC20745 abstractC20746) {
        C6111 c6111 = this.f11381;
        if (c6111.m16913()) {
            return;
        }
        C6111 c6112 = this.f11363;
        if (c6112.m16913()) {
            return;
        }
        m9073();
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        InterfaceC2916 interfaceC2916M17001 = c6112.m17000();
        this.f11372 = false;
        this.f11392 = null;
        try {
            if (C13890.m33728()) {
                c6111.m16883(abstractC20745, charSequence);
                m9058(interfaceC2916M17000, interfaceC2916M17001);
                if (m9085()) {
                    m9099();
                    return;
                }
                c6112.m16883(abstractC20746, charSequence2);
            } else {
                this.f11372 = true;
                m9079((List) null);
                m9076();
                if (!new C10242(new C6568(this)).m26039(c6111, charSequence, abstractC20745, c6112, charSequence2, abstractC20746)) {
                    m9099();
                    return;
                }
            }
            m9058(interfaceC2916M17000, interfaceC2916M17001);
            if (m9085()) {
                m9099();
                return;
            }
            InterfaceC2916 interfaceC2916M17002 = c6111.m17000();
            InterfaceC2916 interfaceC2916M17003 = c6112.m17000();
            interfaceC2916M17002.setReadOnly(true);
            interfaceC2916M17003.setReadOnly(true);
            this.f11394 = interfaceC2916M17002;
            this.f11388 = interfaceC2916M17003;
            C3329 c3329Mo2398 = interfaceC2916M17002.mo2398();
            try {
                C3329 c3329Mo2399 = interfaceC2916M17003.mo2398();
                try {
                    this.f11382 = c3329Mo2398.m9896();
                    this.f11389 = c3329Mo2399.m9896();
                    this.f11392 = m9097(c3329Mo2398, c3329Mo2399);
                    c3329Mo2399.close();
                    c3329Mo2398.close();
                    m9084();
                    if (m9085()) {
                        m9099();
                    }
                } catch (Throwable th) {
                    try {
                        c3329Mo2399.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c3329Mo2398.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException | Error | RuntimeException e) {
            m9058(interfaceC2916M17000, interfaceC2916M17001);
            m9099();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9058(InterfaceC2916 interfaceC2916, InterfaceC2916 interfaceC2917) {
        if (this.f11372) {
            return;
        }
        if (this.f11381.m17000() == interfaceC2916 && this.f11363.m17000() == interfaceC2917) {
            return;
        }
        this.f11372 = true;
        m9079((List) null);
        m9076();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9099() {
        this.f11384 = true;
        this.f11372 = false;
        this.f11392 = null;
        try {
            this.f11381.m16848();
            this.f11363.m16848();
        } finally {
            m9073();
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private void m9073() {
        InterfaceC2916 interfaceC2916 = this.f11394;
        InterfaceC2916 interfaceC2917 = this.f11388;
        this.f11388 = null;
        this.f11394 = null;
        if (interfaceC2916 != null) {
            interfaceC2916.setReadOnly(false);
            interfaceC2917.setReadOnly(false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9124() {
        this.f11381.m16940();
        this.f11363.m16940();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m9112() {
        return this.f11381.m16973() || this.f11363.m16973();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m9108() {
        C6111 c6111 = this.f11381;
        try {
            InterfaceC2916 interfaceC2916 = this.f11394;
            InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
            C6111 c6112 = this.f11363;
            if (interfaceC2916 == interfaceC2916M17000 && this.f11388 == c6112.m17000() && this.f11382 == this.f11394.mo2395() && this.f11389 == this.f11388.mo2395()) {
                m9079(this.f11392);
            } else {
                m9079((List) null);
                post(new RunnableC1442(1, this));
            }
            this.f11392 = null;
            this.f11372 = false;
            c6111.m16902();
            c6112.m16902();
            boolean zM16999 = c6111.m16999();
            boolean zM169910 = c6112.m16999();
            if (zM16999 && !zM169910) {
                c6112.m16937(true);
            } else if (!zM16999 && zM169910) {
                c6111.m16937(true);
            }
            invalidate();
            m9087();
        } finally {
            m9073();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m9115() {
        this.f11362 = true;
        this.f11380.m39629();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean m9085() {
        return this.f11362 || this.f11381.m16913() || this.f11363.m16913();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m9084() {
        if (C13890.m33728()) {
            return;
        }
        boolean z = false;
        while (m9112()) {
            if (m9085()) {
                this.f11381.m17045();
                this.f11363.m17045();
            }
            try {
                Thread.sleep(10L);
            } catch (InterruptedException unused) {
                z = true;
                this.f11362 = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m9122() {
        return this.f11364;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C6111 m9095() {
        return this.f11364 ? this.f11381 : this.f11363;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m9126() {
        List list = this.f11378;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m9096(int i, boolean z) {
        List list = this.f11378;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            InterfaceC19759 interfaceC19759 = (InterfaceC19759) list.get(i3);
            int iMo22127 = interfaceC19759.mo22127(z);
            int iMo22131 = interfaceC19759.mo22131(z);
            if (i < iMo22127) {
                size = i3 - 1;
            } else {
                if (i <= iMo22131 && (i != iMo22131 || iMo22127 >= iMo22131)) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m9120() {
        InterfaceC19759 interfaceC19759;
        List list = this.f11378;
        if (list == null || list.isEmpty()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        boolean z = this.f11364;
        int iM16916 = (z ? this.f11381 : this.f11363).m16916();
        int i = 0;
        while (true) {
            if (i >= this.f11378.size()) {
                interfaceC19759 = null;
                break;
            }
            interfaceC19759 = (InterfaceC19759) this.f11378.get(i);
            if (interfaceC19759.mo22127(z) > iM16916) {
                break;
            } else {
                i++;
            }
        }
        if (interfaceC19759 == null) {
            interfaceC19759 = (InterfaceC19759) this.f11378.get(0);
        }
        m9070(z, (InterfaceC19053) interfaceC19759, true);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m9125() {
        InterfaceC19759 interfaceC19759;
        List list = this.f11378;
        if (list == null || list.isEmpty()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        boolean z = this.f11364;
        int iM16916 = (z ? this.f11381 : this.f11363).m16916();
        int size = this.f11378.size() - 1;
        while (true) {
            if (size < 0) {
                interfaceC19759 = null;
                break;
            }
            interfaceC19759 = (InterfaceC19759) this.f11378.get(size);
            if (interfaceC19759.mo22131(z) < iM16916) {
                break;
            } else {
                size--;
            }
        }
        if (interfaceC19759 == null) {
            interfaceC19759 = (InterfaceC19759) C3012.m8974(1, this.f11378);
            this.f11378.size();
        }
        m9070(z, (InterfaceC19053) interfaceC19759, true);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m9128() {
        List list = this.f11378;
        if (list == null || list.isEmpty()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        boolean z = this.f11364;
        C6111 c6111 = z ? this.f11381 : this.f11363;
        if (!c6111.isFocused()) {
            c6111.requestFocus();
        }
        m9070(z, (InterfaceC19053) this.f11378.get(0), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9070(boolean z, InterfaceC19053 interfaceC19053, boolean z2) {
        int iMo22127 = interfaceC19053.mo22127(z);
        C6111 c6111 = z ? this.f11381 : this.f11363;
        if (c6111.m16831()) {
            c6111.m16835();
            c6111.mo17029(iMo22127);
            c6111.m16928();
            int iM38716 = (int) this.f11383.m38716(c6111);
            int iM17870 = (int) (c6111.f20794.m17870() * c6111.f20764.m30744(iMo22127));
            if (z2) {
                c6111.m16921(0, c6111.m16837(iM17870 - iM38716));
            } else {
                c6111.scrollTo(0, c6111.m16837(iM17870 - iM38716));
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m9086() {
        C6111 c6111 = this.f11381;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        C6111 c6112 = this.f11363;
        InterfaceC2916 interfaceC2916M17001 = c6112.m17000();
        interfaceC2916M17000.setReadOnly(true);
        interfaceC2916M17001.setReadOnly(true);
        try {
            C3329 c3329Mo2398 = interfaceC2916M17000.mo2398();
            try {
                C3329 c3329Mo2399 = interfaceC2916M17001.mo2398();
                try {
                    ArrayList arrayListM9097 = m9097(c3329Mo2398, c3329Mo2399);
                    if (interfaceC2916M17000 == c6111.m17000() && interfaceC2916M17001 == c6112.m17000() && c3329Mo2398.m9896() == interfaceC2916M17000.mo2395() && c3329Mo2399.m9896() == interfaceC2916M17001.mo2395()) {
                        m9079(arrayListM9097);
                    } else {
                        m9079((List) null);
                        post(new RunnableC19269(0, this));
                    }
                    c3329Mo2399.close();
                    c3329Mo2398.close();
                    interfaceC2916M17000.setReadOnly(false);
                    interfaceC2916M17001.setReadOnly(false);
                } catch (Throwable th) {
                    try {
                        c3329Mo2399.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c3329Mo2398.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            interfaceC2916M17000.setReadOnly(false);
            interfaceC2916M17001.setReadOnly(false);
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m9097(C3329 c3329, C3329 c33210) {
        C20825 c20825M46853 = C20825.m46853(c3329);
        try {
            C20825 c20825M46854 = C20825.m46853(c33210);
            try {
                ArrayList arrayListM9054 = m9054(c20825M46853.range(0, c20825M46853.length()), c20825M46854.range(0, c20825M46854.length()), this.f11367, this.f11366, this.f11385, this.f11380);
                c20825M46854.close();
                c20825M46853.close();
                return arrayListM9054;
            } catch (Throwable th) {
                try {
                    c20825M46854.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c20825M46853.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m9054(CharSequence charSequence, CharSequence charSequence2, EnumC10803 enumC10803, boolean z, InterfaceC17152 interfaceC17152, C16936 c16936) {
        EnumC8678 enumC8678;
        if (!z) {
            C14678 c14678 = new C14678(charSequence);
            charSequence2 = new C14678(charSequence2);
            charSequence = c14678;
        }
        int i = C0218.f1397[enumC10803.ordinal()];
        if (i == 1) {
            enumC8678 = EnumC8678.DEFAULT;
        } else if (i == 2) {
            enumC8678 = EnumC8678.TRIM_WHITESPACES;
        } else if (i == 3 || i == 4) {
            enumC8678 = EnumC8678.IGNORE_WHITESPACES;
        } else {
            throw new RuntimeException();
        }
        int i2 = 0;
        boolean z2 = enumC10803 == EnumC10803.IGNORE_WHITESPACES_AND_EMPTY_LINES;
        c16936.m39628();
        ArrayList arrayListM44206 = C19261.m44206(charSequence, charSequence2, C21169.m47628(charSequence), C21169.m47628(charSequence2), enumC8678, EnumC15734.WORDS, c16936);
        if (!c16936.m39630()) {
            if (interfaceC17152 != null) {
                Iterator it = arrayListM44206.iterator();
                while (it.hasNext()) {
                    InterfaceC19759 interfaceC19759 = (InterfaceC19759) it.next();
                    String strSubstring = TextUtils.substring(charSequence, interfaceC19759.mo22124(), interfaceC19759.mo22126());
                    String strSubstring2 = TextUtils.substring(charSequence2, interfaceC19759.mo22129(), interfaceC19759.mo22123());
                    InterfaceC13722 interfaceC13722ListIterator = ((C8387) ((C9285) interfaceC17152).f31543).listIterator(0);
                    while (interfaceC13722ListIterator.hasNext()) {
                        C6222 c6222 = (C6222) interfaceC13722ListIterator.next();
                        c6222.m17276reset((CharSequence) strSubstring);
                        if (c6222.matches()) {
                            c6222.m17276reset((CharSequence) strSubstring2);
                            if (c6222.matches()) {
                                it.remove();
                                break;
                            }
                        }
                    }
                }
            }
            if (arrayListM44206.isEmpty()) {
                return arrayListM44206;
            }
            final ArrayList arrayList = new ArrayList();
            final CharSequence charSequence3 = charSequence;
            final CharSequence charSequence4 = charSequence2;
            final EnumC8678 enumC8679 = enumC8678;
            final boolean z3 = z2;
            Consumer consumer = new Consumer() { // from class: l.۠ۚᩳ
                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return C1455.$default$andThen(this, consumer2);
                }

                /* JADX WARN: Code duplicated, block: B:26:0x0090  */
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    int i3;
                    Object c9176;
                    List listSingletonList;
                    CharSequence charSequence5;
                    CharSequence charSequence6;
                    List list = (List) obj;
                    int size = list.size();
                    if (!z3) {
                        i3 = 0;
                    } else if (enumC8679 == EnumC8678.IGNORE_WHITESPACES) {
                        i3 = 0;
                        while (true) {
                            charSequence5 = charSequence3;
                            charSequence6 = charSequence4;
                            if (i3 >= size) {
                                break;
                            }
                            InterfaceC19759 interfaceC197510 = (InterfaceC19759) list.get(i3);
                            C5025 c5025 = new C5025(interfaceC197510.mo22124(), interfaceC197510.mo22126(), charSequence5);
                            C5025 c5026 = new C5025(interfaceC197510.mo22129(), interfaceC197510.mo22123(), charSequence6);
                            if ((interfaceC197510.mo23604() == null || !interfaceC197510.mo23604().isEmpty()) && !C13571.m33173(c5025, c5026)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        while (i3 < size) {
                            InterfaceC19759 interfaceC197511 = (InterfaceC19759) list.get(size - 1);
                            C5025 c5027 = new C5025(interfaceC197511.mo22124(), interfaceC197511.mo22126(), charSequence5);
                            C5025 c5028 = new C5025(interfaceC197511.mo22129(), interfaceC197511.mo22123(), charSequence6);
                            if ((interfaceC197511.mo23604() == null || !interfaceC197511.mo23604().isEmpty()) && !C13571.m33173(c5027, c5028)) {
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
                        List<InterfaceC19759> listSubList = list.subList(i3, size);
                        if (listSubList.size() == 1) {
                            c9176 = (InterfaceC19759) listSubList.get(0);
                        } else {
                            InterfaceC19759 interfaceC197512 = (InterfaceC19759) listSubList.get(0);
                            InterfaceC19759 interfaceC197513 = (InterfaceC19759) C3012.m8974(1, listSubList);
                            ArrayList arrayList2 = new ArrayList();
                            for (InterfaceC19759 interfaceC197514 : listSubList) {
                                for (InterfaceC19053 interfaceC19053 : interfaceC197514.mo23604() != null ? interfaceC197514.mo23604() : Collections.singletonList(new C8470(0, interfaceC197514.mo22126() - interfaceC197514.mo22124(), 0, interfaceC197514.mo22123() - interfaceC197514.mo22129()))) {
                                    int iMo22124 = interfaceC197514.mo22124() - interfaceC197512.mo22124();
                                    int iMo22129 = interfaceC197514.mo22129() - interfaceC197512.mo22129();
                                    InterfaceC19053 interfaceC19054 = (InterfaceC19053) (arrayList2.isEmpty() ? null : C19084.m43861(arrayList2, 1));
                                    if (interfaceC19054 != null && interfaceC19054.mo22126() == interfaceC19053.mo22124() + iMo22124 && interfaceC19054.mo22123() == interfaceC19053.mo22129() + iMo22129) {
                                        arrayList2.remove(arrayList2.size() - 1);
                                        arrayList2.add(new C8470(interfaceC19054.mo22124(), interfaceC19053.mo22126() + iMo22124, interfaceC19054.mo22129(), interfaceC19053.mo22123() + iMo22129));
                                    } else {
                                        arrayList2.add(new C8470(interfaceC19053.mo22124() + iMo22124, interfaceC19053.mo22126() + iMo22124, interfaceC19053.mo22129() + iMo22129, interfaceC19053.mo22123() + iMo22129));
                                    }
                                }
                            }
                            c9176 = new C9176(interfaceC197512.mo23602(), interfaceC197513.mo23600(), interfaceC197512.mo23598(), interfaceC197513.mo23594(), interfaceC197512.mo22124(), interfaceC197513.mo22126(), interfaceC197512.mo22129(), interfaceC197513.mo22123(), arrayList2);
                        }
                        listSingletonList = Collections.singletonList(c9176);
                    }
                    arrayList.addAll(listSingletonList);
                }
            };
            for (int i3 = 1; i3 < arrayListM44206.size(); i3++) {
                InterfaceC19759 interfaceC197510 = (InterfaceC19759) arrayListM44206.get(i3 - 1);
                InterfaceC19759 interfaceC197511 = (InterfaceC19759) arrayListM44206.get(i3);
                if (interfaceC197510.mo23600() != interfaceC197511.mo23602() || interfaceC197510.mo23594() != interfaceC197511.mo23598() || interfaceC197510.mo22126() != interfaceC197511.mo22124() || interfaceC197510.mo22123() != interfaceC197511.mo22129()) {
                    consumer.n(arrayListM44206.subList(i2, i3));
                    i2 = i3;
                }
            }
            if (i2 < arrayListM44206.size()) {
                consumer.n(arrayListM44206.subList(i2, arrayListM44206.size()));
            }
            return arrayList;
        }
        return new ArrayList();
    }

    @Override // l.InterfaceC11612
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9107(float f, float f2) {
        return this.f11381.mo9107(f, f2) || this.f11363.mo9107(f, f2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9106(RunnableC17794 runnableC17794) {
        this.f11387 = runnableC17794;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m9087() {
        if (this.f11387 != null) {
            if (C13890.m33728()) {
                this.f11387.run();
            } else {
                C16737.m39273(this.f11387);
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m9076() {
        if (C13890.m33728()) {
            invalidate();
            m9087();
        } else {
            C16737.m39273(new RunnableC22797(0, this));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9059(C3040 c3040) {
        c3040.invalidate();
        c3040.m9087();
    }
}
