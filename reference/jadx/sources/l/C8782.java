package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.alipay.sdk.m.t0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: l.۠ܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8TF */
/* JADX INFO: loaded from: classes4.dex */
public final class C8782 extends AbstractC7971 implements InterfaceC5054 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C0733 f28567;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f28568;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f28569;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19533 f28570;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4617 f28571;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4002[] f28572;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f28573;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC8639 f28574;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public C0733 f28575;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C5625 f28576;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f28577;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4879 f28578;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4374 f28579;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C1019 f28580;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f28581;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C18303 f28582;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C4617 f28583;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC2436 f28584;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public C18787 f28585;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C1634 f28586;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f28587;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Surface f28588;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final C5076 f28589;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Context f28590;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f28591;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17043 f28592;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final long f28593;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9527 f28594;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f28595;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f28596;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28597;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C17426 f28598;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f28599;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11076 f28600;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15582 f28601;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f28602;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C11831 f28603;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f28604;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final SurfaceHolderCallbackC1325 f28605;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f28606;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0645 f28607;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19764 f28608;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f28609;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public Object f28610;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28611;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final C6985 f28612;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C18412 f28613;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4002[] f28614;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C23011 f28615;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public SurfaceHolder f28616;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f28617;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f28618;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC22230 f28619;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C13257 f28620;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Looper f28621;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f28622;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f28623;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C5442 f28624;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C11240 f28625;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public TextureView f28626;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C0404 f28627;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final long f28628;

    static {
        C21616.m49139("media3.exoplayer");
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo23577(InterfaceC10582 interfaceC10582) {
        interfaceC10582.getClass();
        this.f28576.m16605((Object) interfaceC10582);
    }

    public C8782(C7379 c7379) throws Throwable {
        C7379 c73710;
        C0404 c0404;
        Handler.Callback callback;
        final C8782 c8782 = this;
        ContextWrapper contextWrapper = c7379.f24277;
        c8782.f28607 = new C0645();
        try {
            C1896.m6513("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + C7116.f23455 + "]");
            C0404 c0405 = c7379.f24282;
            c8782.f28590 = contextWrapper.getApplicationContext();
            c7379.f24269.getClass();
            c8782.f28619 = new C2093(c0405);
            c8782.f28622 = c7379.f24278;
            c8782.f28613 = c7379.f24285;
            c8782.f28568 = c7379.f24281;
            c8782.f28604 = false;
            c8782.f28623 = c7379.f24275;
            SurfaceHolderCallbackC1325 surfaceHolderCallbackC1325 = new SurfaceHolderCallbackC1325(c8782);
            c8782.f28605 = surfaceHolderCallbackC1325;
            c8782.f28594 = new C9527();
            Handler handler = new Handler(c7379.f24273);
            InterfaceC18918 interfaceC18918 = (InterfaceC18918) c7379.f24267.get();
            InterfaceC4002[] interfaceC4002ArrMo43927 = interfaceC18918.mo43927(handler, surfaceHolderCallbackC1325, surfaceHolderCallbackC1325, surfaceHolderCallbackC1325, surfaceHolderCallbackC1325);
            c8782.f28614 = interfaceC4002ArrMo43927;
            C20782.m47568(interfaceC4002ArrMo43927.length > 0);
            c8782.f28572 = new InterfaceC4002[interfaceC4002ArrMo43927.length];
            int i = 0;
            while (true) {
                InterfaceC4002[] interfaceC4002Arr = c8782.f28572;
                if (i >= interfaceC4002Arr.length) {
                    break;
                }
                interfaceC18918.mo43926(c8782.f28614[i]);
                interfaceC4002Arr[i] = null;
                i++;
                c8782.f28607.m2833();
                throw th;
            }
            AbstractC11076 abstractC11076 = (AbstractC11076) c7379.f24268.get();
            c8782.f28600 = abstractC11076;
            c8782.f28584 = (InterfaceC2436) c7379.f24279.get();
            C3619 c3619M11741 = C3619.m11741((ContextWrapper) c7379.f24272.f31097);
            c8782.f28592 = c3619M11741;
            c8782.f28618 = c7379.f24276;
            C9221 c9221 = c7379.f24288;
            c8782.f28593 = c7379.f24274;
            c8782.f28628 = c7379.f24271;
            c8782.f28609 = c7379.f24289;
            C1019 c1019 = c7379.f24283;
            c8782.f28580 = c1019;
            Looper looper = c7379.f24273;
            c8782.f28621 = looper;
            c8782.f28627 = c0405;
            c8782.f28570 = c8782;
            c8782.f28576 = new C5625(looper, c0405, new C2764(c8782));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            c8782.f28596 = copyOnWriteArraySet;
            c8782.f28611 = new ArrayList();
            c8782.f28608 = new C22748();
            InterfaceC4002[] interfaceC4002Arr2 = c8782.f28614;
            C23011 c23011 = new C23011(new C0273[interfaceC4002Arr2.length], new InterfaceC1470[interfaceC4002Arr2.length], C12074.f38882, null);
            c8782.f28615 = c23011;
            c8782.f28586 = new C1634();
            C14156 c14156 = new C14156();
            c14156.m34379(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            c14156.m34377(29, abstractC11076 instanceof C19369);
            c14156.m34377(23, false);
            c14156.m34377(25, false);
            c14156.m34377(33, false);
            c14156.m34377(26, false);
            c14156.m34377(34, false);
            C4617 c4617M34375 = c14156.m34375();
            c8782.f28583 = c4617M34375;
            C14156 c14157 = new C14156();
            c14157.m34378(c4617M34375);
            c14157.m34376(4);
            c14157.m34376(10);
            c8782.f28571 = c14157.m34375();
            c8782.f28578 = c0405.mo2209(looper, null);
            C13257 c13257 = new C13257(c8782);
            c8782.f28620 = c13257;
            c8782.f28598 = C17426.m40917(c23011);
            c8782.f28619.mo7235(c8782, looper);
            final C20738 c20738 = new C20738(c7379.f24280);
            Context context = c8782.f28590;
            InterfaceC4002[] interfaceC4002Arr3 = c8782.f28614;
            InterfaceC4002[] interfaceC4002Arr4 = c8782.f28572;
            c7379.f24266.getClass();
            try {
                C11240 c11240 = new C11240(context, interfaceC4002Arr3, interfaceC4002Arr4, abstractC11076, c23011, new C20804(), c3619M11741, c8782.f28602, c8782.f28606, c8782.f28619, c9221, c7379.f24270, c7379.f24287, looper, c0405, c13257, c20738, c8782.f28594);
                c8782 = this;
                c8782.f28625 = c11240;
                Looper looperM28456 = c11240.m28456();
                c8782.f28602 = 0;
                C0733 c0733 = C0733.f2667;
                c8782.f28567 = c0733;
                c8782.f28575 = c0733;
                c8782.f28599 = -1;
                c8782.f28603 = C11831.f38155;
                c8782.f28577 = true;
                c8782.mo23577(c8782.f28619);
                c3619M11741.mo11744(new Handler(looper), c8782.f28619);
                copyOnWriteArraySet.add(c8782.f28605);
                if (Build.VERSION.SDK_INT >= 31) {
                    final Context context2 = c8782.f28590;
                    c73710 = c7379;
                    final boolean z = c73710.f24284;
                    callback = null;
                    c0404 = c0405;
                    c0404.mo2209(c11240.m28456(), null).mo14966(new Runnable() { // from class: l.᩶ܿۙ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C23722 c23722M52981 = C23722.m52981(context2);
                            if (c23722M52981 == null) {
                                C1896.m6517("MediaMetricsService unavailable.");
                                return;
                            }
                            if (z) {
                                c8782.m23553(c23722M52981);
                            }
                            c20738.m47433(c23722M52981.m52991());
                        }
                    });
                } else {
                    c73710 = c7379;
                    c0404 = c0405;
                    callback = null;
                }
                Handler.Callback callback2 = callback;
                C4374 c4374 = new C4374(0, looperM28456, looper, c0404, new InterfaceC24512() { // from class: l.֫ܿۙ
                    @Override // l.InterfaceC24512
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final void mo7145(Object obj, Object obj2) {
                        ((Integer) obj).getClass();
                        C8782.m23508(this.f6893, ((Integer) obj2).intValue());
                    }
                });
                c8782.f28579 = c4374;
                c4374.m13882(new Runnable() { // from class: l.ۧܿۙ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8782.m23507(this.f38026);
                    }
                });
                C0404 c0406 = c0404;
                C15582 c15582 = new C15582(contextWrapper, looperM28456, c73710.f24273, c8782.f28605, c0404);
                c8782.f28601 = c15582;
                c15582.m37322();
                C6985 c6985 = new C6985();
                contextWrapper.getApplicationContext();
                c0406.mo2209(looperM28456, callback2);
                c8782.f28612 = c6985;
                C5076 c5076 = new C5076();
                contextWrapper.getApplicationContext();
                c0406.mo2209(looperM28456, callback2);
                c8782.f28589 = c5076;
                C8716 c8716 = C8716.f28378;
                c8782.f28585 = C18787.f61010;
                c8782.f28582 = C18303.f59691;
                c11240.m28448(c1019);
                c11240.m28450(c8782.f28613);
                c8782.m23502(1, 3, c8782.f28613);
                c8782.m23502(2, 4, Integer.valueOf(c8782.f28568));
                c8782.m23502(2, 5, (Object) 0);
                c8782.m23502(1, 9, Boolean.valueOf(c8782.f28604));
                c8782.m23502(6, 8, c8782.f28594);
                c8782.m23502(-1, 16, Integer.valueOf(c8782.f28622));
                c8782.f28607.m2833();
            } catch (Throwable th) {
                th = th;
                c8782 = this;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23535(final C8782 c8782, final C12732 c12732) {
        c8782.f28578.mo14966(new Runnable() { // from class: l.᩻ܿۙ
            @Override // java.lang.Runnable
            public final void run() {
                C8782.m23515(this.f81426, c12732);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23507(C8782 c8782) {
        C4374 c4374 = c8782.f28579;
        Context context = c8782.f28590;
        String str = C7116.f23455;
        c4374.m13881(Integer.valueOf(C8345.m22450(context).generateAudioSessionId()));
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Looper mo23557() {
        return this.f28621;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4617 mo23573() {
        m23494();
        return this.f28571;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo23580() {
        m23494();
        return this.f28598.f56668;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int mo23572() {
        m23494();
        return this.f28598.f56681;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18566 mo23569() {
        m23494();
        return this.f28598.f56665;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo23574() {
        m23494();
        C17426 c17426 = this.f28598;
        if (c17426.f56668 != 1) {
            return;
        }
        C17426 c17426M40925 = c17426.m40925((C18566) null);
        C17426 c17426M23497 = m23497(c17426M40925, c17426M40925.f56676.m55264() ? 4 : 2);
        this.f28573++;
        this.f28625.m28459();
        m23518(c17426M23497, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23549(List list) {
        m23494();
        ArrayList arrayListM23532 = m23532(list);
        m23494();
        m23506(arrayListM23532, -1, -9223372036854775807L, true);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23546(long j, List list) {
        m23494();
        ArrayList arrayListM23532 = m23532(list);
        m23494();
        m23506(arrayListM23532, 0, j, false);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void mo23559() {
        C6240 c6240;
        int i;
        Pair pairM23496;
        Pair pairM55261;
        boolean z;
        C17426 c17426M23498;
        int i2;
        m23494();
        ArrayList arrayList = this.f28611;
        int size = arrayList.size();
        int iMin = Math.min(Integer.MAX_VALUE, size);
        if (size <= 0 || iMin == 0) {
            return;
        }
        C17426 c17426 = this.f28598;
        int iM23521 = m23521(c17426);
        long jM23495 = m23495(c17426);
        AbstractC24755 abstractC24755 = c17426.f56676;
        int size2 = arrayList.size();
        this.f28573++;
        for (int i3 = iMin - 1; i3 >= 0; i3--) {
            arrayList.remove(i3);
        }
        this.f28608 = this.f28608.mo45522(iMin);
        C6240 c6241 = new C6240(arrayList, this.f28608);
        if (abstractC24755.m55264() || c6241.m55264()) {
            c6240 = c6241;
            i = size2;
            boolean z2 = !abstractC24755.m55264() && c6240.m55264();
            int i4 = z2 ? -1 : iM23521;
            if (z2) {
                jM23495 = -9223372036854775807L;
            }
            pairM23496 = m23496(c6240, i4, jM23495);
        } else {
            pairM55261 = abstractC24755.m55261(this.f26501, this.f28586, iM23521, C7116.m19474(jM23495));
            Object obj = pairM55261.first;
            if (c6241.mo1588(obj) != -1) {
                z = true;
                c6240 = c6241;
                i = size2;
            } else {
                c6240 = c6241;
                i = size2;
                int iM28366 = C11240.m28366(this.f26501, this.f28586, this.f28602, this.f28606, obj, abstractC24755, c6240);
                if (iM28366 != -1) {
                    C11328 c11328 = this.f26501;
                    c6240.mo1592(iM28366, c11328, 0L);
                    pairM23496 = m23496(c6240, iM28366, C7116.m19506(c11328.f35686));
                } else {
                    pairM23496 = m23496(c6240, -1, -9223372036854775807L);
                }
            }
            c17426M23498 = m23498(c17426, c6240, pairM55261);
            i2 = c17426M23498.f56668;
            if (i2 != z && i2 != 4 && iMin > 0 && iMin == i && iM23521 >= c17426M23498.f56676.mo16022()) {
                c17426M23498 = m23497(c17426M23498, 4);
            }
            C17426 c17427 = c17426M23498;
            this.f28625.m28447(iMin, this.f28608);
            m23518(c17427, 0, z ^ c17427.f56675.f27520.equals(this.f28598.f56675.f27520), 4, m23531(c17427), -1, false);
        }
        pairM55261 = pairM23496;
        z = true;
        c17426M23498 = m23498(c17426, c6240, pairM55261);
        i2 = c17426M23498.f56668;
        if (i2 != z) {
            c17426M23498 = m23497(c17426M23498, 4);
        }
        C17426 c17428 = c17426M23498;
        this.f28625.m28447(iMin, this.f28608);
        m23518(c17428, 0, z ^ c17428.f56675.f27520.equals(this.f28598.f56675.f27520), 4, m23531(c17428), -1, false);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23554(boolean z) {
        m23494();
        m23503(1, z);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean mo23570() {
        m23494();
        return this.f28598.f56671;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23545(int i) {
        m23494();
        if (this.f28602 != i) {
            this.f28602 = i;
            this.f28625.m28461(i);
            C8548 c8548 = new C8548(i);
            C5625 c5625 = this.f28576;
            c5625.m16604(8, c8548);
            m23526();
            c5625.m16603();
        }
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int mo23556() {
        m23494();
        return this.f28602;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo23578(final boolean z) {
        m23494();
        if (this.f28606 != z) {
            this.f28606 = z;
            this.f28625.m28463(z);
            InterfaceC19795 interfaceC19795 = new InterfaceC19795() { // from class: l.ܺܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj) {
                    ((InterfaceC10582) obj).mo7245(z);
                }
            };
            C5625 c5625 = this.f28576;
            c5625.m16604(9, interfaceC19795);
            m23526();
            c5625.m16603();
        }
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo23555() {
        m23494();
        return this.f28606;
    }

    @Override // l.AbstractC7971
    /* JADX INFO: renamed from: ۙ */
    public final void mo21693(long j, int i, boolean z) {
        m23494();
        if (i == -1) {
            return;
        }
        C20782.m47565(i >= 0);
        AbstractC24755 abstractC24755 = this.f28598.f56676;
        if (abstractC24755.m55264() || i < abstractC24755.mo16022()) {
            this.f28619.mo7240();
            this.f28573++;
            if (mo23542()) {
                C1896.m6517("seekTo ignored because an ad is playing");
                C12732 c12732 = new C12732(this.f28598);
                c12732.m31543(1);
                m23535(this.f28620.f42356, c12732);
                return;
            }
            C17426 c17426M40920 = this.f28598;
            int i2 = c17426M40920.f56668;
            if (i2 == 3 || (i2 == 4 && !abstractC24755.m55264())) {
                c17426M40920 = this.f28598.m40920(2);
            }
            int iMo23566 = mo23566();
            C17426 c17426M23498 = m23498(c17426M40920, abstractC24755, m23496(abstractC24755, i, j));
            this.f28625.m28452(abstractC24755, i, C7116.m19474(j));
            m23518(c17426M23498, 0, true, 1, m23531(c17426M23498), iMo23566, z);
        }
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final long mo23567() {
        m23494();
        return this.f28593;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long mo23560() {
        m23494();
        return this.f28628;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long mo23540() {
        m23494();
        return this.f28609;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23551(C7445 c7445) {
        m23494();
        if (this.f28598.f56662.equals(c7445)) {
            return;
        }
        C17426 c17426M40922 = this.f28598.m40922(c7445);
        this.f28573++;
        this.f28625.m28462(c7445);
        m23518(c17426M40922, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7445 mo23563() {
        m23494();
        return this.f28598.f56662;
    }

    @Override // l.InterfaceC19533
    public final void stop() {
        m23494();
        m23519((C18566) null);
        AbstractC1928 abstractC1928Of = AbstractC1928.of();
        long j = this.f28598.f56674;
        this.f28603 = new C11831(abstractC1928Of);
    }

    @Override // l.InterfaceC5054
    /* JADX INFO: renamed from: ۙ */
    public final void mo15286() {
        C1896.m6513("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + C7116.f23455 + "] [" + C21616.m49138() + "]");
        m23494();
        this.f28601.m37322();
        this.f28612.m19294(false);
        this.f28589.m15356(false);
        if (!this.f28625.m28458()) {
            this.f28576.m16608(10, new C14442());
        }
        this.f28576.m16607();
        this.f28578.mo14970();
        this.f28592.mo11745(this.f28619);
        C17426 c17426 = this.f28598;
        if (c17426.f56679) {
            this.f28598 = c17426.m40919();
        }
        C17426 c17426M23497 = m23497(this.f28598, 1);
        this.f28598 = c17426M23497;
        C17426 c17426M40923 = c17426M23497.m40923(c17426M23497.f56675);
        this.f28598 = c17426M40923;
        c17426M40923.f56664 = c17426M40923.f56674;
        this.f28598.f56669 = 0L;
        this.f28619.mo7199();
        m23529();
        Surface surface = this.f28588;
        if (surface != null) {
            surface.release();
            this.f28588 = null;
        }
        this.f28603 = C11831.f38155;
        this.f28591 = true;
    }

    @Override // l.InterfaceC5054
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo15289() {
        m23494();
        return this.f28591;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int mo23562() {
        m23494();
        if (this.f28598.f56676.m55264()) {
            return 0;
        }
        C17426 c17426 = this.f28598;
        return c17426.f56676.mo1588(c17426.f56675.f27520);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int mo23566() {
        m23494();
        int iM23521 = m23521(this.f28598);
        if (iM23521 == -1) {
            return 0;
        }
        return iM23521;
    }

    @Override // l.InterfaceC19533
    public final long getDuration() {
        m23494();
        if (mo23542()) {
            C17426 c17426 = this.f28598;
            C8402 c8402 = c17426.f56675;
            AbstractC24755 abstractC24755 = c17426.f56676;
            Object obj = c8402.f27520;
            C1634 c1634 = this.f28586;
            abstractC24755.mo15535(obj, c1634);
            return C7116.m19506(c1634.m5788(c8402.f27516, c8402.f27519));
        }
        return mo21701();
    }

    @Override // l.InterfaceC19533
    public final long getCurrentPosition() {
        m23494();
        return C7116.m19506(m23531(this.f28598));
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long mo23564() {
        m23494();
        return C7116.m19506(this.f28598.f56669);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo23542() {
        m23494();
        return this.f28598.f56675.m22581();
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int mo23544() {
        m23494();
        if (mo23542()) {
            return this.f28598.f56675.f27516;
        }
        return -1;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int mo23561() {
        m23494();
        if (mo23542()) {
            return this.f28598.f56675.f27519;
        }
        return -1;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long mo23558() {
        m23494();
        return m23495(this.f28598);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final long mo23579() {
        m23494();
        if (this.f28598.f56676.m55264()) {
            return this.f28617;
        }
        C17426 c17426 = this.f28598;
        long j = 0;
        if (c17426.f56678.f27518 != c17426.f56675.f27518) {
            return C7116.m19506(c17426.f56676.mo1592(mo23566(), this.f26501, 0L).f35696);
        }
        long j2 = c17426.f56664;
        if (this.f28598.f56678.m22581()) {
            C17426 c17427 = this.f28598;
            c17427.f56676.mo15535(c17427.f56678.f27520, this.f28586).m5787(this.f28598.f56678.f27516);
        } else {
            j = j2;
        }
        C17426 c17428 = this.f28598;
        AbstractC24755 abstractC24755 = c17428.f56676;
        Object obj = c17428.f56678.f27520;
        C1634 c1634 = this.f28586;
        abstractC24755.mo15535(obj, c1634);
        return C7116.m19506(j + c1634.f5659);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C12074 mo23568() {
        m23494();
        return this.f28598.f56680.f74675;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C3125 mo23582() {
        m23494();
        C3125 c3125Mo27991 = this.f28600.mo27991();
        return this.f28597 ? c3125Mo27991.mo10195().mo12045(this.f28574).mo12042() : c3125Mo27991;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23550(C3125 c3125) {
        C3125 c3125Mo12042;
        m23494();
        AbstractC11076 abstractC11076 = this.f28600;
        abstractC11076.getClass();
        if (abstractC11076 instanceof C19369) {
            C3125 c3125Mo23582 = mo23582();
            if (this.f28597) {
                this.f28574 = c3125.f10131;
                AbstractC8639 abstractC8639 = this.f28580.f3690;
                C23263 c23263Mo10195 = c3125.mo10195();
                AbstractC4516 it = abstractC8639.iterator();
                while (it.hasNext()) {
                    c23263Mo10195.mo12044(((Integer) it.next()).intValue(), true);
                }
                c3125Mo12042 = c23263Mo10195.mo12042();
            } else {
                c3125Mo12042 = c3125;
            }
            if (!c3125Mo12042.equals(abstractC11076.mo27991())) {
                abstractC11076.mo27985(c3125Mo12042);
            }
            if (c3125Mo23582.equals(c3125)) {
                return;
            }
            this.f28576.m16608(19, new C6330(c3125));
        }
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C0733 mo23571() {
        m23494();
        return this.f28567;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC24755 mo23565() {
        m23494();
        return this.f28598.f56676;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C18787 mo23541() {
        m23494();
        return this.f28585;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo23543() {
        m23494();
        m23529();
        m23505((Object) null);
        m23501(0, 0);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23547(SurfaceView surfaceView) {
        m23494();
        if (surfaceView instanceof InterfaceC22814) {
            m23529();
            m23505((Object) surfaceView);
            m23504(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof C5442;
        SurfaceHolderCallbackC1325 surfaceHolderCallbackC1325 = this.f28605;
        if (z) {
            m23529();
            this.f28624 = (C5442) surfaceView;
            C20410 c20410M23499 = m23499(this.f28594);
            c20410M23499.m46809(10000);
            c20410M23499.m46810(this.f28624);
            c20410M23499.m46813();
            this.f28624.m16269(surfaceHolderCallbackC1325);
            m23505(this.f28624.m16270());
            m23504(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        m23494();
        if (holder == null) {
            mo23543();
            return;
        }
        m23529();
        this.f28595 = true;
        this.f28616 = holder;
        holder.addCallback(surfaceHolderCallbackC1325);
        Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            m23505(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            m23501(surfaceFrame.width(), surfaceFrame.height());
        } else {
            m23505((Object) null);
            m23501(0, 0);
        }
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo23575(SurfaceView surfaceView) {
        m23494();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        m23494();
        if (holder == null || holder != this.f28616) {
            return;
        }
        mo23543();
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23548(TextureView textureView) {
        m23494();
        if (textureView == null) {
            mo23543();
            return;
        }
        m23529();
        this.f28626 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            C1896.m6517("Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f28605);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m23505((Object) null);
            m23501(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            m23505(surface);
            this.f28588 = surface;
            m23501(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo23576(TextureView textureView) {
        m23494();
        if (textureView == null || textureView != this.f28626) {
            return;
        }
        mo23543();
    }

    @Override // l.InterfaceC5054
    /* JADX INFO: renamed from: ۤ */
    public final void mo15288(boolean z) {
        C3125 c3125Mo12042;
        m23494();
        if (z == this.f28597) {
            return;
        }
        this.f28597 = z;
        C1019 c1019 = this.f28580;
        if (!c1019.f3690.isEmpty()) {
            AbstractC11076 abstractC11076 = this.f28600;
            abstractC11076.getClass();
            if (abstractC11076 instanceof C19369) {
                C3125 c3125Mo27991 = abstractC11076.mo27991();
                if (z) {
                    this.f28574 = c3125Mo27991.f10131;
                    AbstractC8639 abstractC8639 = c1019.f3690;
                    C23263 c23263Mo10195 = c3125Mo27991.mo10195();
                    AbstractC4516 it = abstractC8639.iterator();
                    while (it.hasNext()) {
                        c23263Mo10195.mo12044(((Integer) it.next()).intValue(), true);
                    }
                    c3125Mo12042 = c23263Mo10195.mo12042();
                } else {
                    c3125Mo12042 = c3125Mo27991.mo10195().mo12045(this.f28574).mo12042();
                    this.f28574 = null;
                }
                if (!c3125Mo12042.equals(c3125Mo27991)) {
                    abstractC11076.mo27985(c3125Mo12042);
                }
            }
        }
        this.f28625.m28453(z);
        C17426 c17426 = this.f28598;
        m23503(c17426.f56670, c17426.f56671);
    }

    @Override // l.InterfaceC5054
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo15290() {
        m23494();
        return this.f28597;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23553(C23722 c23722) {
        this.f28619.mo7237(c23722);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11831 mo23581() {
        m23494();
        return this.f28603;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23552(InterfaceC10582 interfaceC10582) {
        m23494();
        interfaceC10582.getClass();
        this.f28576.m16606(interfaceC10582);
    }

    @Override // l.InterfaceC5054
    /* JADX INFO: renamed from: ۙ */
    public final void mo15287(InterfaceC8497 interfaceC8497) {
        m23494();
        m23502(4, 15, interfaceC8497);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23519(C18566 c18566) {
        C17426 c17426 = this.f28598;
        C17426 c17426M40923 = c17426.m40923(c17426.f56675);
        c17426M40923.f56664 = c17426M40923.f56674;
        c17426M40923.f56669 = 0L;
        C17426 c17426M23497 = m23497(c17426M40923, 1);
        if (c18566 != null) {
            c17426M23497 = c17426M23497.m40925(c18566);
        }
        this.f28573++;
        this.f28625.m28455();
        m23518(c17426M23497, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m23521(C17426 c17426) {
        if (c17426.f56676.m55264()) {
            return this.f28599;
        }
        return c17426.f56676.mo15535(c17426.f56675.f27520, this.f28586).f5657;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m23495(C17426 c17426) {
        C8402 c8402 = c17426.f56675;
        long j = c17426.f56672;
        AbstractC24755 abstractC24755 = c17426.f56676;
        if (c8402.m22581()) {
            Object obj = c17426.f56675.f27520;
            C1634 c1634 = this.f28586;
            abstractC24755.mo15535(obj, c1634);
            if (j == -9223372036854775807L) {
                return C7116.m19506(abstractC24755.mo1592(m23521(c17426), this.f26501, 0L).f35686);
            }
            return C7116.m19506(j) + C7116.m19506(c1634.f5659);
        }
        return C7116.m19506(m23531(c17426));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private long m23531(C17426 c17426) {
        long jM40929;
        if (c17426.f56676.m55264()) {
            return C7116.m19474(this.f28617);
        }
        if (c17426.f56679) {
            jM40929 = c17426.m40929();
        } else {
            jM40929 = c17426.f56674;
        }
        if (c17426.f56675.m22581()) {
            return jM40929;
        }
        AbstractC24755 abstractC24755 = c17426.f56676;
        Object obj = c17426.f56675.f27520;
        C1634 c1634 = this.f28586;
        abstractC24755.mo15535(obj, c1634);
        return jM40929 + c1634.f5659;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private ArrayList m23532(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.f28584.mo8214((C14902) list.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23515(C8782 c8782, C12732 c12732) {
        boolean z;
        int i = c8782.f28573 - c12732.f40760;
        c8782.f28573 = i;
        boolean z2 = true;
        if (c12732.f40761) {
            c8782.f28587 = c12732.f40759;
            c8782.f28569 = true;
        }
        if (i == 0) {
            AbstractC24755 abstractC24755 = c12732.f40763.f56676;
            if (!c8782.f28598.f56676.m55264() && abstractC24755.m55264()) {
                c8782.f28599 = -1;
                c8782.f28617 = 0L;
            }
            if (!abstractC24755.m55264()) {
                List listM17872 = ((C6240) abstractC24755).m17872();
                C20782.m47568(listM17872.size() == c8782.f28611.size());
                for (int i2 = 0; i2 < listM17872.size(); i2++) {
                    ((C2816) c8782.f28611.get(i2)).m9290((AbstractC24755) listM17872.get(i2));
                }
            }
            long j = -9223372036854775807L;
            if (c8782.f28569) {
                if (c12732.f40763.f56675.equals(c8782.f28598.f56675) && c12732.f40763.f56677 == c8782.f28598.f56674) {
                    z2 = false;
                }
                if (z2) {
                    if (abstractC24755.m55264() || c12732.f40763.f56675.m22581()) {
                        j = c12732.f40763.f56677;
                    } else {
                        C17426 c17426 = c12732.f40763;
                        C8402 c8402 = c17426.f56675;
                        long j2 = c17426.f56677;
                        Object obj = c8402.f27520;
                        C1634 c1634 = c8782.f28586;
                        abstractC24755.mo15535(obj, c1634);
                        j = j2 + c1634.f5659;
                    }
                }
                z = z2;
            } else {
                z = false;
            }
            c8782.f28569 = false;
            c8782.m23518(c12732.f40763, 1, z, c8782.f28587, j, -1, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0272  */
    /* JADX WARN: Code duplicated, block: B:103:0x027d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x027f  */
    /* JADX WARN: Code duplicated, block: B:106:0x028a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0295  */
    /* JADX WARN: Code duplicated, block: B:110:0x029b  */
    /* JADX WARN: Code duplicated, block: B:113:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:116:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f2 A[LOOP:0: B:123:0x02ec->B:125:0x02f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:41:0x0103  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:45:0x010c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0117  */
    /* JADX WARN: Code duplicated, block: B:52:0x0126  */
    /* JADX WARN: Code duplicated, block: B:55:0x0135 A[LOOP:2: B:53:0x012f->B:55:0x0135, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0165  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0175  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:75:0x017c  */
    /* JADX WARN: Code duplicated, block: B:76:0x018a  */
    /* JADX WARN: Code duplicated, block: B:78:0x018e  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x0201  */
    /* JADX WARN: Code duplicated, block: B:87:0x0221  */
    /* JADX WARN: Code duplicated, block: B:89:0x0229  */
    /* JADX WARN: Code duplicated, block: B:92:0x0238  */
    /* JADX WARN: Code duplicated, block: B:94:0x0244  */
    /* JADX WARN: Code duplicated, block: B:97:0x0252  */
    /* JADX WARN: Code duplicated, block: B:99:0x0264  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23518(final C17426 c17426, final int i, boolean z, final int i2, long j, int i3, boolean z2) {
        boolean z3;
        C18566 c18566;
        List list;
        Pair pair;
        int i4;
        boolean zBooleanValue;
        final int iIntValue;
        final C14902 c14902;
        List list2;
        C18632 c18632M3057;
        int i5;
        C19378 c19378;
        int i6;
        boolean zEquals;
        boolean z4;
        boolean z5;
        boolean z6;
        C5625 c5625;
        C18566 c18567;
        C23011 c23011;
        C23011 c23012;
        Iterator it;
        int iMo23566;
        Object obj;
        C14902 c14903;
        Object obj2;
        int iMo1588;
        long jM19506;
        long jM19507;
        C17426 c17427 = this.f28598;
        this.f28598 = c17426;
        AbstractC24755 abstractC24755 = c17427.f56676;
        AbstractC24755 abstractC24756 = c17426.f56676;
        boolean z7 = c17426.f56679;
        C18566 c18568 = c17426.f56665;
        List list3 = c17426.f56663;
        boolean zEquals2 = abstractC24755.equals(abstractC24756);
        AbstractC24755 abstractC24757 = c17427.f56676;
        C8402 c8402 = c17427.f56675;
        AbstractC24755 abstractC24758 = c17426.f56676;
        C8402 c8403 = c17426.f56675;
        boolean zM55264 = abstractC24758.m55264();
        C11328 c11328 = this.f26501;
        C1634 c1634 = this.f28586;
        if (!zM55264 || !abstractC24757.m55264()) {
            z3 = z7;
            if (abstractC24758.m55264() != abstractC24757.m55264()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else {
                c18566 = c18568;
                list = list3;
                if (!abstractC24757.mo1592(abstractC24757.mo15535(c8402.f27520, c1634).f5657, c11328, 0L).f35698.equals(abstractC24758.mo1592(abstractC24758.mo15535(c8403.f27520, c1634).f5657, c11328, 0L).f35698)) {
                    if (z && i2 == 0) {
                        i4 = 1;
                    } else if (z && i2 == 1) {
                        i4 = 2;
                    } else {
                        if (zEquals2) {
                            throw new IllegalStateException();
                        }
                        i4 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
                } else if (z && i2 == 0 && c8402.f27518 < c8403.f27518) {
                    pair = new Pair(Boolean.TRUE, 0);
                } else {
                    pair = (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (abstractC24758.m55264()) {
                    c14902 = null;
                } else {
                    c14902 = abstractC24758.mo1592(abstractC24758.mo15535(c8403.f27520, c1634).f5657, c11328, 0L).f35699;
                }
                this.f28575 = C0733.f2667;
            } else {
                c14902 = null;
            }
            if (!zBooleanValue) {
                list2 = list;
                if (!c17427.f56663.equals(list2)) {
                }
                C0733 c0733M23528 = m23528();
                zEquals = c0733M23528.equals(this.f28567);
                this.f28567 = c0733M23528;
                if (c17427.f56671 != c17426.f56671) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c17427.f56668 != c17426.f56668) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5 || z4) {
                    m23538();
                }
                if (c17427.f56667 != c17426.f56667) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                c5625 = this.f28576;
                if (!zEquals2) {
                    c5625.m16604(0, new InterfaceC19795() { // from class: l.ۚܿۙ
                        @Override // l.InterfaceC19795
                        public final void invoke(Object obj3) {
                            ((InterfaceC10582) obj3).mo7238(c17426.f56676, i);
                        }
                    });
                }
                if (z) {
                    final C22517 c22517M23500 = m23500(i2, c17427, i3);
                    iMo23566 = mo23566();
                    if (this.f28598.f56676.m55264()) {
                        obj = null;
                        c14903 = null;
                        obj2 = null;
                        iMo1588 = -1;
                    } else {
                        C17426 c17428 = this.f28598;
                        Object obj3 = c17428.f56675.f27520;
                        c17428.f56676.mo15535(obj3, c1634);
                        iMo1588 = this.f28598.f56676.mo1588(obj3);
                        obj = this.f28598.f56676.mo1592(iMo23566, c11328, 0L).f35698;
                        c14903 = c11328.f35699;
                        obj2 = obj3;
                    }
                    jM19506 = C7116.m19506(j);
                    if (this.f28598.f56675.m22581()) {
                        jM19507 = C7116.m19506(m23536(this.f28598));
                    } else {
                        jM19507 = jM19506;
                    }
                    C8402 c8404 = this.f28598.f56675;
                    final C22517 c22517 = new C22517(obj, iMo23566, c14903, obj2, iMo1588, jM19506, jM19507, c8404.f27516, c8404.f27519);
                    c5625.m16604(11, new InterfaceC19795() { // from class: l.ۛܿۙ
                        @Override // l.InterfaceC19795
                        public final void invoke(Object obj4) {
                            InterfaceC10582 interfaceC10582 = (InterfaceC10582) obj4;
                            interfaceC10582.getClass();
                            interfaceC10582.mo7211(i2, c22517M23500, c22517);
                        }
                    });
                } else {
                    z5 = z5;
                    z6 = z6;
                }
                if (zBooleanValue) {
                    c5625.m16604(1, new InterfaceC19795() { // from class: l.᩺ܿۙ
                        @Override // l.InterfaceC19795
                        public final void invoke(Object obj4) {
                            ((InterfaceC10582) obj4).mo7229(c14902, iIntValue);
                        }
                    });
                }
                c18567 = c18566;
                if (c17427.f56665 != c18567) {
                    c5625.m16604(10, new InterfaceC19795() { // from class: l.ۘܿۙ
                        @Override // l.InterfaceC19795
                        public final void invoke(Object obj4) {
                            ((InterfaceC10582) obj4).mo7257(c17426.f56665);
                        }
                    });
                    if (c18567 != null) {
                        c5625.m16604(10, new InterfaceC19795() { // from class: l.ܰܿۙ
                            @Override // l.InterfaceC19795
                            public final void invoke(Object obj4) {
                                ((InterfaceC10582) obj4).mo7225(c17426.f56665);
                            }
                        });
                    }
                }
                c23011 = c17427.f56680;
                c23012 = c17426.f56680;
                if (c23011 != c23012) {
                    this.f28600.mo20381(c23012.f74673);
                    c5625.m16604(2, new InterfaceC19795() { // from class: l.᩷ܿۙ
                        @Override // l.InterfaceC19795
                        public final void invoke(Object obj4) {
                            ((InterfaceC10582) obj4).mo7228(c17426.f56680.f74675);
                        }
                    });
                }
                if (!zEquals) {
                    c5625.m16604(14, new C17365(this.f28567));
                }
                if (z6) {
                    c5625.m16604(3, new InterfaceC19795() { // from class: l.ۤܿۙ
                        @Override // l.InterfaceC19795
                        public final void invoke(Object obj4) {
                            InterfaceC10582 interfaceC10582 = (InterfaceC10582) obj4;
                            C17426 c17429 = c17426;
                            boolean z8 = c17429.f56667;
                            interfaceC10582.getClass();
                            interfaceC10582.mo7265(c17429.f56667);
                        }
                    });
                }
                if (z5 || z4) {
                    c5625.m16604(-1, new InterfaceC19795() { // from class: l.᩸ܿۙ
                        @Override // l.InterfaceC19795
                        public final void invoke(Object obj4) {
                            C17426 c17429 = c17426;
                            ((InterfaceC10582) obj4).mo7252(c17429.f56668, c17429.f56671);
                        }
                    });
                }
                if (z5) {
                    c5625.m16604(4, new InterfaceC19795() { // from class: l.ᩴܿۙ
                        @Override // l.InterfaceC19795
                        public final void invoke(Object obj4) {
                            ((InterfaceC10582) obj4).mo7241(c17426.f56668);
                        }
                    });
                }
                if (z4 == 0 || c17427.f56670 != c17426.f56670) {
                    c5625.m16604(5, new InterfaceC19795() { // from class: l.᩹ܿۙ
                        @Override // l.InterfaceC19795
                        public final void invoke(Object obj4) {
                            C17426 c17429 = c17426;
                            ((InterfaceC10582) obj4).mo7212(c17429.f56670, c17429.f56671);
                        }
                    });
                }
                if (c17427.f56681 != c17426.f56681) {
                    c5625.m16604(6, new InterfaceC19795() { // from class: l.ۗܿۙ
                        @Override // l.InterfaceC19795
                        public final void invoke(Object obj4) {
                            ((InterfaceC10582) obj4).mo7247(c17426.f56681);
                        }
                    });
                }
                if (c17427.m40928() != c17426.m40928()) {
                    c5625.m16604(7, new InterfaceC19795() { // from class: l.᩵ܿۙ
                        @Override // l.InterfaceC19795
                        public final void invoke(Object obj4) {
                            ((InterfaceC10582) obj4).mo7261(c17426.m40928());
                        }
                    });
                }
                if (!c17427.f56662.equals(c17426.f56662)) {
                    c5625.m16604(12, new InterfaceC19795() { // from class: l.ۨܿۙ
                        @Override // l.InterfaceC19795
                        public final void invoke(Object obj4) {
                            ((InterfaceC10582) obj4).mo7224(c17426.f56662);
                        }
                    });
                }
                m23526();
                c5625.m16603();
                if (c17427.f56679 != z3) {
                    it = this.f28596.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0667) it.next()).mo2890();
                    }
                }
            }
            list2 = list;
            c18632M3057 = this.f28575.m3057();
            i5 = 0;
            while (i5 < list2.size()) {
                c19378 = (C19378) list2.get(i5);
                List list4 = list2;
                for (i6 = 0; i6 < c19378.m44819(); i6++) {
                    c19378.m44820(i6).mo12246(c18632M3057);
                }
                i5++;
                list2 = list4;
            }
            this.f28575 = c18632M3057.m43369();
            C0733 c0733M23529 = m23528();
            zEquals = c0733M23529.equals(this.f28567);
            this.f28567 = c0733M23529;
            if (c17427.f56671 != c17426.f56671) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c17427.f56668 != c17426.f56668) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                m23538();
            } else {
                m23538();
            }
            if (c17427.f56667 != c17426.f56667) {
                z6 = true;
            } else {
                z6 = false;
            }
            c5625 = this.f28576;
            if (!zEquals2) {
                c5625.m16604(0, new InterfaceC19795() { // from class: l.ۚܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj4) {
                        ((InterfaceC10582) obj4).mo7238(c17426.f56676, i);
                    }
                });
            }
            if (z) {
                final C22517 c22517M23501 = m23500(i2, c17427, i3);
                iMo23566 = mo23566();
                if (this.f28598.f56676.m55264()) {
                    C17426 c17429 = this.f28598;
                    Object obj4 = c17429.f56675.f27520;
                    c17429.f56676.mo15535(obj4, c1634);
                    iMo1588 = this.f28598.f56676.mo1588(obj4);
                    obj = this.f28598.f56676.mo1592(iMo23566, c11328, 0L).f35698;
                    c14903 = c11328.f35699;
                    obj2 = obj4;
                } else {
                    obj = null;
                    c14903 = null;
                    obj2 = null;
                    iMo1588 = -1;
                }
                jM19506 = C7116.m19506(j);
                if (this.f28598.f56675.m22581()) {
                    jM19507 = C7116.m19506(m23536(this.f28598));
                } else {
                    jM19507 = jM19506;
                }
                C8402 c8405 = this.f28598.f56675;
                final C22517 c22518 = new C22517(obj, iMo23566, c14903, obj2, iMo1588, jM19506, jM19507, c8405.f27516, c8405.f27519);
                c5625.m16604(11, new InterfaceC19795() { // from class: l.ۛܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj5) {
                        InterfaceC10582 interfaceC10582 = (InterfaceC10582) obj5;
                        interfaceC10582.getClass();
                        interfaceC10582.mo7211(i2, c22517M23501, c22518);
                    }
                });
            } else {
                z5 = z5;
                z6 = z6;
            }
            if (zBooleanValue) {
                c5625.m16604(1, new InterfaceC19795() { // from class: l.᩺ܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj5) {
                        ((InterfaceC10582) obj5).mo7229(c14902, iIntValue);
                    }
                });
            }
            c18567 = c18566;
            if (c17427.f56665 != c18567) {
                c5625.m16604(10, new InterfaceC19795() { // from class: l.ۘܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj5) {
                        ((InterfaceC10582) obj5).mo7257(c17426.f56665);
                    }
                });
                if (c18567 != null) {
                    c5625.m16604(10, new InterfaceC19795() { // from class: l.ܰܿۙ
                        @Override // l.InterfaceC19795
                        public final void invoke(Object obj5) {
                            ((InterfaceC10582) obj5).mo7225(c17426.f56665);
                        }
                    });
                }
            }
            c23011 = c17427.f56680;
            c23012 = c17426.f56680;
            if (c23011 != c23012) {
                this.f28600.mo20381(c23012.f74673);
                c5625.m16604(2, new InterfaceC19795() { // from class: l.᩷ܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj5) {
                        ((InterfaceC10582) obj5).mo7228(c17426.f56680.f74675);
                    }
                });
            }
            if (!zEquals) {
                c5625.m16604(14, new C17365(this.f28567));
            }
            if (z6) {
                c5625.m16604(3, new InterfaceC19795() { // from class: l.ۤܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj5) {
                        InterfaceC10582 interfaceC10582 = (InterfaceC10582) obj5;
                        C17426 c174210 = c17426;
                        boolean z8 = c174210.f56667;
                        interfaceC10582.getClass();
                        interfaceC10582.mo7265(c174210.f56667);
                    }
                });
            }
            if (z5) {
                c5625.m16604(-1, new InterfaceC19795() { // from class: l.᩸ܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj5) {
                        C17426 c174210 = c17426;
                        ((InterfaceC10582) obj5).mo7252(c174210.f56668, c174210.f56671);
                    }
                });
            } else {
                c5625.m16604(-1, new InterfaceC19795() { // from class: l.᩸ܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj5) {
                        C17426 c174210 = c17426;
                        ((InterfaceC10582) obj5).mo7252(c174210.f56668, c174210.f56671);
                    }
                });
            }
            if (z5) {
                c5625.m16604(4, new InterfaceC19795() { // from class: l.ᩴܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj5) {
                        ((InterfaceC10582) obj5).mo7241(c17426.f56668);
                    }
                });
            }
            if (z4 == 0) {
                c5625.m16604(5, new InterfaceC19795() { // from class: l.᩹ܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj5) {
                        C17426 c174210 = c17426;
                        ((InterfaceC10582) obj5).mo7212(c174210.f56670, c174210.f56671);
                    }
                });
            } else {
                c5625.m16604(5, new InterfaceC19795() { // from class: l.᩹ܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj5) {
                        C17426 c174210 = c17426;
                        ((InterfaceC10582) obj5).mo7212(c174210.f56670, c174210.f56671);
                    }
                });
            }
            if (c17427.f56681 != c17426.f56681) {
                c5625.m16604(6, new InterfaceC19795() { // from class: l.ۗܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj5) {
                        ((InterfaceC10582) obj5).mo7247(c17426.f56681);
                    }
                });
            }
            if (c17427.m40928() != c17426.m40928()) {
                c5625.m16604(7, new InterfaceC19795() { // from class: l.᩵ܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj5) {
                        ((InterfaceC10582) obj5).mo7261(c17426.m40928());
                    }
                });
            }
            if (!c17427.f56662.equals(c17426.f56662)) {
                c5625.m16604(12, new InterfaceC19795() { // from class: l.ۨܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj5) {
                        ((InterfaceC10582) obj5).mo7224(c17426.f56662);
                    }
                });
            }
            m23526();
            c5625.m16603();
            if (c17427.f56679 != z3) {
                it = this.f28596.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0667) it.next()).mo2890();
                }
            }
        }
        pair = new Pair(Boolean.FALSE, -1);
        z3 = z7;
        c18566 = c18568;
        list = list3;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (abstractC24758.m55264()) {
                c14902 = abstractC24758.mo1592(abstractC24758.mo15535(c8403.f27520, c1634).f5657, c11328, 0L).f35699;
            } else {
                c14902 = null;
            }
            this.f28575 = C0733.f2667;
        } else {
            c14902 = null;
        }
        if (!zBooleanValue) {
            list2 = list;
            if (!c17427.f56663.equals(list2)) {
            }
            C0733 c0733M235210 = m23528();
            zEquals = c0733M235210.equals(this.f28567);
            this.f28567 = c0733M235210;
            if (c17427.f56671 != c17426.f56671) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c17427.f56668 != c17426.f56668) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                m23538();
            } else {
                m23538();
            }
            if (c17427.f56667 != c17426.f56667) {
                z6 = true;
            } else {
                z6 = false;
            }
            c5625 = this.f28576;
            if (!zEquals2) {
                c5625.m16604(0, new InterfaceC19795() { // from class: l.ۚܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj5) {
                        ((InterfaceC10582) obj5).mo7238(c17426.f56676, i);
                    }
                });
            }
            if (z) {
                final C22517 c22517M23502 = m23500(i2, c17427, i3);
                iMo23566 = mo23566();
                if (this.f28598.f56676.m55264()) {
                    C17426 c174210 = this.f28598;
                    Object obj5 = c174210.f56675.f27520;
                    c174210.f56676.mo15535(obj5, c1634);
                    iMo1588 = this.f28598.f56676.mo1588(obj5);
                    obj = this.f28598.f56676.mo1592(iMo23566, c11328, 0L).f35698;
                    c14903 = c11328.f35699;
                    obj2 = obj5;
                } else {
                    obj = null;
                    c14903 = null;
                    obj2 = null;
                    iMo1588 = -1;
                }
                jM19506 = C7116.m19506(j);
                if (this.f28598.f56675.m22581()) {
                    jM19507 = C7116.m19506(m23536(this.f28598));
                } else {
                    jM19507 = jM19506;
                }
                C8402 c8406 = this.f28598.f56675;
                final C22517 c22519 = new C22517(obj, iMo23566, c14903, obj2, iMo1588, jM19506, jM19507, c8406.f27516, c8406.f27519);
                c5625.m16604(11, new InterfaceC19795() { // from class: l.ۛܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj6) {
                        InterfaceC10582 interfaceC10582 = (InterfaceC10582) obj6;
                        interfaceC10582.getClass();
                        interfaceC10582.mo7211(i2, c22517M23502, c22519);
                    }
                });
            } else {
                z5 = z5;
                z6 = z6;
            }
            if (zBooleanValue) {
                c5625.m16604(1, new InterfaceC19795() { // from class: l.᩺ܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj6) {
                        ((InterfaceC10582) obj6).mo7229(c14902, iIntValue);
                    }
                });
            }
            c18567 = c18566;
            if (c17427.f56665 != c18567) {
                c5625.m16604(10, new InterfaceC19795() { // from class: l.ۘܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj6) {
                        ((InterfaceC10582) obj6).mo7257(c17426.f56665);
                    }
                });
                if (c18567 != null) {
                    c5625.m16604(10, new InterfaceC19795() { // from class: l.ܰܿۙ
                        @Override // l.InterfaceC19795
                        public final void invoke(Object obj6) {
                            ((InterfaceC10582) obj6).mo7225(c17426.f56665);
                        }
                    });
                }
            }
            c23011 = c17427.f56680;
            c23012 = c17426.f56680;
            if (c23011 != c23012) {
                this.f28600.mo20381(c23012.f74673);
                c5625.m16604(2, new InterfaceC19795() { // from class: l.᩷ܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj6) {
                        ((InterfaceC10582) obj6).mo7228(c17426.f56680.f74675);
                    }
                });
            }
            if (!zEquals) {
                c5625.m16604(14, new C17365(this.f28567));
            }
            if (z6) {
                c5625.m16604(3, new InterfaceC19795() { // from class: l.ۤܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj6) {
                        InterfaceC10582 interfaceC10582 = (InterfaceC10582) obj6;
                        C17426 c174211 = c17426;
                        boolean z8 = c174211.f56667;
                        interfaceC10582.getClass();
                        interfaceC10582.mo7265(c174211.f56667);
                    }
                });
            }
            if (z5) {
                c5625.m16604(-1, new InterfaceC19795() { // from class: l.᩸ܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj6) {
                        C17426 c174211 = c17426;
                        ((InterfaceC10582) obj6).mo7252(c174211.f56668, c174211.f56671);
                    }
                });
            } else {
                c5625.m16604(-1, new InterfaceC19795() { // from class: l.᩸ܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj6) {
                        C17426 c174211 = c17426;
                        ((InterfaceC10582) obj6).mo7252(c174211.f56668, c174211.f56671);
                    }
                });
            }
            if (z5) {
                c5625.m16604(4, new InterfaceC19795() { // from class: l.ᩴܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj6) {
                        ((InterfaceC10582) obj6).mo7241(c17426.f56668);
                    }
                });
            }
            if (z4 == 0) {
                c5625.m16604(5, new InterfaceC19795() { // from class: l.᩹ܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj6) {
                        C17426 c174211 = c17426;
                        ((InterfaceC10582) obj6).mo7212(c174211.f56670, c174211.f56671);
                    }
                });
            } else {
                c5625.m16604(5, new InterfaceC19795() { // from class: l.᩹ܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj6) {
                        C17426 c174211 = c17426;
                        ((InterfaceC10582) obj6).mo7212(c174211.f56670, c174211.f56671);
                    }
                });
            }
            if (c17427.f56681 != c17426.f56681) {
                c5625.m16604(6, new InterfaceC19795() { // from class: l.ۗܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj6) {
                        ((InterfaceC10582) obj6).mo7247(c17426.f56681);
                    }
                });
            }
            if (c17427.m40928() != c17426.m40928()) {
                c5625.m16604(7, new InterfaceC19795() { // from class: l.᩵ܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj6) {
                        ((InterfaceC10582) obj6).mo7261(c17426.m40928());
                    }
                });
            }
            if (!c17427.f56662.equals(c17426.f56662)) {
                c5625.m16604(12, new InterfaceC19795() { // from class: l.ۨܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj6) {
                        ((InterfaceC10582) obj6).mo7224(c17426.f56662);
                    }
                });
            }
            m23526();
            c5625.m16603();
            if (c17427.f56679 != z3) {
                it = this.f28596.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0667) it.next()).mo2890();
                }
            }
        }
        list2 = list;
        c18632M3057 = this.f28575.m3057();
        i5 = 0;
        while (i5 < list2.size()) {
            c19378 = (C19378) list2.get(i5);
            List list5 = list2;
            while (i6 < c19378.m44819()) {
                c19378.m44820(i6).mo12246(c18632M3057);
            }
            i5++;
            list2 = list5;
        }
        this.f28575 = c18632M3057.m43369();
        C0733 c0733M235211 = m23528();
        zEquals = c0733M235211.equals(this.f28567);
        this.f28567 = c0733M235211;
        if (c17427.f56671 != c17426.f56671) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c17427.f56668 != c17426.f56668) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            m23538();
        } else {
            m23538();
        }
        if (c17427.f56667 != c17426.f56667) {
            z6 = true;
        } else {
            z6 = false;
        }
        c5625 = this.f28576;
        if (!zEquals2) {
            c5625.m16604(0, new InterfaceC19795() { // from class: l.ۚܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj6) {
                    ((InterfaceC10582) obj6).mo7238(c17426.f56676, i);
                }
            });
        }
        if (z) {
            final C22517 c22517M23503 = m23500(i2, c17427, i3);
            iMo23566 = mo23566();
            if (this.f28598.f56676.m55264()) {
                C17426 c174211 = this.f28598;
                Object obj6 = c174211.f56675.f27520;
                c174211.f56676.mo15535(obj6, c1634);
                iMo1588 = this.f28598.f56676.mo1588(obj6);
                obj = this.f28598.f56676.mo1592(iMo23566, c11328, 0L).f35698;
                c14903 = c11328.f35699;
                obj2 = obj6;
            } else {
                obj = null;
                c14903 = null;
                obj2 = null;
                iMo1588 = -1;
            }
            jM19506 = C7116.m19506(j);
            if (this.f28598.f56675.m22581()) {
                jM19507 = C7116.m19506(m23536(this.f28598));
            } else {
                jM19507 = jM19506;
            }
            C8402 c8407 = this.f28598.f56675;
            final C22517 c225110 = new C22517(obj, iMo23566, c14903, obj2, iMo1588, jM19506, jM19507, c8407.f27516, c8407.f27519);
            c5625.m16604(11, new InterfaceC19795() { // from class: l.ۛܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj7) {
                    InterfaceC10582 interfaceC10582 = (InterfaceC10582) obj7;
                    interfaceC10582.getClass();
                    interfaceC10582.mo7211(i2, c22517M23503, c225110);
                }
            });
        } else {
            z5 = z5;
            z6 = z6;
        }
        if (zBooleanValue) {
            c5625.m16604(1, new InterfaceC19795() { // from class: l.᩺ܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj7) {
                    ((InterfaceC10582) obj7).mo7229(c14902, iIntValue);
                }
            });
        }
        c18567 = c18566;
        if (c17427.f56665 != c18567) {
            c5625.m16604(10, new InterfaceC19795() { // from class: l.ۘܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj7) {
                    ((InterfaceC10582) obj7).mo7257(c17426.f56665);
                }
            });
            if (c18567 != null) {
                c5625.m16604(10, new InterfaceC19795() { // from class: l.ܰܿۙ
                    @Override // l.InterfaceC19795
                    public final void invoke(Object obj7) {
                        ((InterfaceC10582) obj7).mo7225(c17426.f56665);
                    }
                });
            }
        }
        c23011 = c17427.f56680;
        c23012 = c17426.f56680;
        if (c23011 != c23012) {
            this.f28600.mo20381(c23012.f74673);
            c5625.m16604(2, new InterfaceC19795() { // from class: l.᩷ܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj7) {
                    ((InterfaceC10582) obj7).mo7228(c17426.f56680.f74675);
                }
            });
        }
        if (!zEquals) {
            c5625.m16604(14, new C17365(this.f28567));
        }
        if (z6) {
            c5625.m16604(3, new InterfaceC19795() { // from class: l.ۤܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj7) {
                    InterfaceC10582 interfaceC10582 = (InterfaceC10582) obj7;
                    C17426 c174212 = c17426;
                    boolean z8 = c174212.f56667;
                    interfaceC10582.getClass();
                    interfaceC10582.mo7265(c174212.f56667);
                }
            });
        }
        if (z5) {
            c5625.m16604(-1, new InterfaceC19795() { // from class: l.᩸ܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj7) {
                    C17426 c174212 = c17426;
                    ((InterfaceC10582) obj7).mo7252(c174212.f56668, c174212.f56671);
                }
            });
        } else {
            c5625.m16604(-1, new InterfaceC19795() { // from class: l.᩸ܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj7) {
                    C17426 c174212 = c17426;
                    ((InterfaceC10582) obj7).mo7252(c174212.f56668, c174212.f56671);
                }
            });
        }
        if (z5) {
            c5625.m16604(4, new InterfaceC19795() { // from class: l.ᩴܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj7) {
                    ((InterfaceC10582) obj7).mo7241(c17426.f56668);
                }
            });
        }
        if (z4 == 0) {
            c5625.m16604(5, new InterfaceC19795() { // from class: l.᩹ܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj7) {
                    C17426 c174212 = c17426;
                    ((InterfaceC10582) obj7).mo7212(c174212.f56670, c174212.f56671);
                }
            });
        } else {
            c5625.m16604(5, new InterfaceC19795() { // from class: l.᩹ܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj7) {
                    C17426 c174212 = c17426;
                    ((InterfaceC10582) obj7).mo7212(c174212.f56670, c174212.f56671);
                }
            });
        }
        if (c17427.f56681 != c17426.f56681) {
            c5625.m16604(6, new InterfaceC19795() { // from class: l.ۗܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj7) {
                    ((InterfaceC10582) obj7).mo7247(c17426.f56681);
                }
            });
        }
        if (c17427.m40928() != c17426.m40928()) {
            c5625.m16604(7, new InterfaceC19795() { // from class: l.᩵ܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj7) {
                    ((InterfaceC10582) obj7).mo7261(c17426.m40928());
                }
            });
        }
        if (!c17427.f56662.equals(c17426.f56662)) {
            c5625.m16604(12, new InterfaceC19795() { // from class: l.ۨܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj7) {
                    ((InterfaceC10582) obj7).mo7224(c17426.f56662);
                }
            });
        }
        m23526();
        c5625.m16603();
        if (c17427.f56679 != z3) {
            it = this.f28596.iterator();
            while (it.hasNext()) {
                ((InterfaceC0667) it.next()).mo2890();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22517 m23500(int i, C17426 c17426, int i2) {
        int i3;
        Object obj;
        C14902 c14902;
        Object obj2;
        int i4;
        long jM23536;
        long jM23537;
        C1634 c1634 = new C1634();
        if (c17426.f56676.m55264()) {
            i3 = i2;
            obj = null;
            c14902 = null;
            obj2 = null;
            i4 = -1;
        } else {
            Object obj3 = c17426.f56675.f27520;
            c17426.f56676.mo15535(obj3, c1634);
            int i5 = c1634.f5657;
            int iMo1588 = c17426.f56676.mo1588(obj3);
            Object obj4 = c17426.f56676.mo1592(i5, this.f26501, 0L).f35698;
            obj2 = obj3;
            i3 = i5;
            i4 = iMo1588;
            c14902 = this.f26501.f35699;
            obj = obj4;
        }
        if (i == 0) {
            if (c17426.f56675.m22581()) {
                C8402 c8402 = c17426.f56675;
                jM23536 = c1634.m5788(c8402.f27516, c8402.f27519);
                jM23537 = m23536(c17426);
            } else {
                if (c17426.f56675.f27517 != -1) {
                    jM23536 = m23536(this.f28598);
                } else {
                    jM23536 = c1634.f5659 + c1634.f5660;
                }
                jM23537 = jM23536;
            }
        } else if (c17426.f56675.m22581()) {
            jM23536 = c17426.f56674;
            jM23537 = m23536(c17426);
        } else {
            jM23536 = c1634.f5659 + c17426.f56674;
            jM23537 = jM23536;
        }
        long jM19506 = C7116.m19506(jM23536);
        long jM19507 = C7116.m19506(jM23537);
        C8402 c8403 = c17426.f56675;
        return new C22517(obj, i3, c14902, obj2, i4, jM19506, jM19507, c8403.f27516, c8403.f27519);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static long m23536(C17426 c17426) {
        C11328 c11328 = new C11328();
        C1634 c1634 = new C1634();
        c17426.f56676.mo15535(c17426.f56675.f27520, c1634);
        long j = c17426.f56672;
        if (j == -9223372036854775807L) {
            return c17426.f56676.mo1592(c1634.f5657, c11328, 0L).f35686;
        }
        return c1634.f5659 + j;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    private void m23526() {
        C4617 c4617 = this.f28571;
        String str = C7116.f23455;
        C8782 c8782 = (C8782) this.f28570;
        boolean zMo23542 = c8782.mo23542();
        boolean zM21706 = c8782.m21706();
        boolean zM21695 = c8782.m21695();
        boolean zM21698 = c8782.m21698();
        boolean zM21697 = c8782.m21697();
        boolean zM21691 = c8782.m21691();
        boolean zM55264 = c8782.mo23565().m55264();
        C14156 c14156 = new C14156();
        c14156.m34378(this.f28583);
        boolean z = !zMo23542;
        c14156.m34377(4, z);
        boolean z2 = false;
        c14156.m34377(5, zM21706 && !zMo23542);
        c14156.m34377(6, zM21695 && !zMo23542);
        c14156.m34377(7, !zM55264 && (zM21695 || !zM21697 || zM21706) && !zMo23542);
        c14156.m34377(8, zM21698 && !zMo23542);
        c14156.m34377(9, !zM55264 && (zM21698 || (zM21697 && zM21691)) && !zMo23542);
        c14156.m34377(10, z);
        c14156.m34377(11, zM21706 && !zMo23542);
        if (zM21706 && !zMo23542) {
            z2 = true;
        }
        c14156.m34377(12, z2);
        C4617 c4617M34375 = c14156.m34375();
        this.f28571 = c4617M34375;
        if (c4617M34375.equals(c4617)) {
            return;
        }
        this.f28576.m16604(13, new InterfaceC19795() { // from class: l.ܽܿۙ
            @Override // l.InterfaceC19795
            public final void invoke(Object obj) {
                ((InterfaceC10582) obj).mo7223(this.f58265.f28571);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23506(ArrayList arrayList, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        C17426 c17426M23497;
        boolean z2;
        int iMo15534 = i;
        int iM23521 = m23521(this.f28598);
        long currentPosition = getCurrentPosition();
        this.f28573++;
        ArrayList arrayList2 = this.f28611;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i4 = size - 1; i4 >= 0; i4--) {
                arrayList2.remove(i4);
            }
            this.f28608 = this.f28608.mo45522(size);
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            C11459 c11459 = new C11459((InterfaceC13622) arrayList.get(i5), this.f28618);
            arrayList3.add(c11459);
            arrayList2.add(i5, new C2816(c11459.f36040, c11459.f36042));
        }
        this.f28608 = this.f28608.mo45527(arrayList3.size());
        C6240 c6240 = new C6240(arrayList2, this.f28608);
        if (!c6240.m55264() && iMo15534 >= c6240.mo16022()) {
            throw new C13411();
        }
        if (z) {
            iMo15534 = c6240.mo15534(this.f28606);
            j2 = -9223372036854775807L;
        } else {
            if (iMo15534 == -1) {
                i2 = iM23521;
            } else {
                j2 = j;
            }
            C17426 c17426M23498 = m23498(this.f28598, c6240, m23496(c6240, i2, currentPosition));
            i3 = c17426M23498.f56668;
            if (i2 != -1 && i3 != 1) {
                if (!c6240.m55264() || i2 >= c6240.mo16022()) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            }
            c17426M23497 = m23497(c17426M23498, i3);
            this.f28625.m28446(i2, C7116.m19474(currentPosition), this.f28608, arrayList3);
            if (!this.f28598.f56675.f27520.equals(c17426M23497.f56675.f27520) || this.f28598.f56676.m55264()) {
                z2 = false;
            } else {
                z2 = true;
            }
            m23518(c17426M23497, 0, z2, 4, m23531(c17426M23497), -1, false);
        }
        i2 = iMo15534;
        currentPosition = j2;
        C17426 c17426M23499 = m23498(this.f28598, c6240, m23496(c6240, i2, currentPosition));
        i3 = c17426M23499.f56668;
        if (i2 != -1) {
            if (c6240.m55264()) {
                i3 = 4;
            } else {
                i3 = 4;
            }
        }
        c17426M23497 = m23497(c17426M23499, i3);
        this.f28625.m28446(i2, C7116.m19474(currentPosition), this.f28608, arrayList3);
        if (this.f28598.f56675.f27520.equals(c17426M23497.f56675.f27520)) {
            z2 = false;
        } else {
            z2 = false;
        }
        m23518(c17426M23497, 0, z2, 4, m23531(c17426M23497), -1, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17426 m23498(C17426 c17426, AbstractC24755 abstractC24755, Pair pair) {
        long jM5788;
        C20782.m47565(abstractC24755.m55264() || pair != null);
        AbstractC24755 abstractC24756 = c17426.f56676;
        long jM23495 = m23495(c17426);
        C17426 c17426M40926 = c17426.m40926(abstractC24755);
        if (abstractC24755.m55264()) {
            C8402 c8402M40918 = C17426.m40918();
            long jM19474 = C7116.m19474(this.f28617);
            C17426 c17426M40923 = c17426M40926.m40924(c8402M40918, jM19474, jM19474, jM19474, 0L, C3356.f10962, this.f28615, AbstractC1928.of()).m40923(c8402M40918);
            c17426M40923.f56664 = c17426M40923.f56674;
            return c17426M40923;
        }
        Object obj = c17426M40926.f56675.f27520;
        boolean zEquals = obj.equals(pair.first);
        C8402 c8402 = !zEquals ? new C8402(pair.first) : c17426M40926.f56675;
        long jLongValue = ((Long) pair.second).longValue();
        long jM19475 = C7116.m19474(jM23495);
        if (!abstractC24756.m55264()) {
            jM19475 -= abstractC24756.mo15535(obj, this.f28586).f5659;
        }
        if (!zEquals || jLongValue < jM19475) {
            C20782.m47568(!c8402.m22581());
            C17426 c17426M40924 = c17426M40926.m40924(r0, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? C3356.f10962 : c17426M40926.f56666, !zEquals ? this.f28615 : c17426M40926.f56680, !zEquals ? AbstractC1928.of() : c17426M40926.f56663).m40923(c8402);
            c17426M40924.f56664 = jLongValue;
            return c17426M40924;
        }
        if (jLongValue == jM19475) {
            int iMo1588 = abstractC24755.mo1588(c17426M40926.f56678.f27520);
            if (iMo1588 != -1 && abstractC24755.mo1591(iMo1588, this.f28586, false).f5657 == abstractC24755.mo15535(c8402.f27520, this.f28586).f5657) {
                return c17426M40926;
            }
            abstractC24755.mo15535(c8402.f27520, this.f28586);
            if (c8402.m22581()) {
                jM5788 = this.f28586.m5788(c8402.f27516, c8402.f27519);
            } else {
                jM5788 = this.f28586.f5660;
            }
            C17426 c17426M40925 = c17426M40926.m40924(c8402, c17426M40926.f56674, c17426M40926.f56674, c17426M40926.f56677, jM5788 - c17426M40926.f56674, c17426M40926.f56666, c17426M40926.f56680, c17426M40926.f56663).m40923(c8402);
            c17426M40925.f56664 = jM5788;
            return c17426M40925;
        }
        C20782.m47568(!c8402.m22581());
        long jMax = Math.max(0L, c17426M40926.f56669 - (jLongValue - jM19475));
        long j = c17426M40926.f56664;
        if (c17426M40926.f56678.equals(c17426M40926.f56675)) {
            j = jLongValue + jMax;
        }
        C17426 c17426M40927 = c17426M40926.m40924(c8402, jLongValue, jLongValue, jLongValue, jMax, c17426M40926.f56666, c17426M40926.f56680, c17426M40926.f56663);
        c17426M40927.f56664 = j;
        return c17426M40927;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17426 m23497(C17426 c17426, int i) {
        C17426 c17426M40920 = c17426.m40920(i);
        return (i == 1 || i == 4) ? c17426M40920.m40927(false) : c17426M40920;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Pair m23496(AbstractC24755 abstractC24755, int i, long j) {
        if (abstractC24755.m55264()) {
            this.f28599 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f28617 = j;
            return null;
        }
        if (i == -1 || i >= abstractC24755.mo16022()) {
            i = abstractC24755.mo15534(this.f28606);
            j = C7116.m19506(abstractC24755.mo1592(i, this.f26501, 0L).f35686);
        }
        return abstractC24755.m55261(this.f26501, this.f28586, i, C7116.m19474(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20410 m23499(InterfaceC3256 interfaceC3256) {
        int iM23521 = m23521(this.f28598);
        AbstractC24755 abstractC24755 = this.f28598.f56676;
        int i = iM23521 == -1 ? 0 : iM23521;
        C0404 c0404 = this.f28627;
        C11240 c11240 = this.f28625;
        return new C20410(c11240, interfaceC3256, abstractC24755, i, c0404, c11240.m28456());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public C0733 m23528() {
        AbstractC24755 abstractC24755Mo23565 = mo23565();
        if (abstractC24755Mo23565.m55264()) {
            return this.f28575;
        }
        C14902 c14902 = abstractC24755Mo23565.mo1592(mo23566(), this.f26501, 0L).f35699;
        C18632 c18632M3057 = this.f28575.m3057();
        c18632M3057.m43373(c14902.f48683);
        return c18632M3057.m43369();
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    private void m23529() {
        C5442 c5442 = this.f28624;
        SurfaceHolderCallbackC1325 surfaceHolderCallbackC1325 = this.f28605;
        if (c5442 != null) {
            C20410 c20410M23499 = m23499((InterfaceC3256) this.f28594);
            c20410M23499.m46809(10000);
            c20410M23499.m46810((Object) null);
            c20410M23499.m46813();
            this.f28624.m16272(surfaceHolderCallbackC1325);
            this.f28624 = null;
        }
        TextureView textureView = this.f28626;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != surfaceHolderCallbackC1325) {
                C1896.m6517("SurfaceTextureListener already unset or replaced.");
            } else {
                this.f28626.setSurfaceTextureListener(null);
            }
            this.f28626 = null;
        }
        SurfaceHolder surfaceHolder = this.f28616;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(surfaceHolderCallbackC1325);
            this.f28616 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23510(C8782 c8782, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        c8782.m23505(surface);
        c8782.f28588 = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m23505(Object obj) {
        Object obj2 = this.f28610;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        boolean zM28454 = this.f28625.m28454(z ? this.f28623 : -9223372036854775807L, obj);
        if (z) {
            Object obj3 = this.f28610;
            Surface surface = this.f28588;
            if (obj3 == surface) {
                surface.release();
                this.f28588 = null;
            }
        }
        this.f28610 = obj;
        if (zM28454) {
            return;
        }
        m23519(C18566.m43144(new C24667("Detaching surface timed out."), b.d));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23504(SurfaceHolder surfaceHolder) {
        this.f28595 = false;
        this.f28616 = surfaceHolder;
        surfaceHolder.addCallback(this.f28605);
        Surface surface = this.f28616.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.f28616.getSurfaceFrame();
            m23501(surfaceFrame.width(), surfaceFrame.height());
        } else {
            m23501(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m23501(final int i, final int i2) {
        if (i == this.f28582.m42689() && i2 == this.f28582.m42688()) {
            return;
        }
        this.f28582 = new C18303(i, i2);
        this.f28576.m16608(24, new InterfaceC19795() { // from class: l.ܳܿۙ
            @Override // l.InterfaceC19795
            public final void invoke(Object obj) {
                ((InterfaceC10582) obj).mo7201(i, i2);
            }
        });
        m23502(2, 14, new C18303(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m23503(int i, boolean z) {
        int i2;
        if (this.f28597) {
            i2 = 4;
        } else {
            i2 = (this.f28598.f56681 != 1 || z) ? 0 : 1;
        }
        C17426 c17426M40919 = this.f28598;
        if (c17426M40919.f56671 == z && c17426M40919.f56681 == i2 && c17426M40919.f56670 == i) {
            return;
        }
        this.f28573++;
        if (c17426M40919.f56679) {
            c17426M40919 = c17426M40919.m40919();
        }
        C17426 c17426M40921 = c17426M40919.m40921(i, i2, z);
        this.f28625.m28445(i, i2, z);
        m23518(c17426M40921, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public void m23538() {
        int iMo23580 = mo23580();
        C5076 c5076 = this.f28589;
        C6985 c6985 = this.f28612;
        boolean z = false;
        if (iMo23580 != 1) {
            if (iMo23580 == 2 || iMo23580 == 3) {
                m23494();
                boolean z2 = this.f28598.f56679;
                if (mo23570() && !z2) {
                    z = true;
                }
                c6985.m19294(z);
                c5076.m15356(mo23570());
                return;
            }
            if (iMo23580 != 4) {
                throw new IllegalStateException();
            }
        }
        c6985.m19294(false);
        c5076.m15356(false);
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    private void m23494() {
        this.f28607.m2834();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f28621;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = C7116.f23455;
            Locale locale = Locale.US;
            String strM10404 = C3188.m10404("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f28577) {
                throw new IllegalStateException(strM10404);
            }
            C1896.m6514(strM10404, this.f28581 ? null : new IllegalStateException());
            this.f28581 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23502(int i, int i2, Object obj) {
        for (InterfaceC4002 interfaceC4002 : this.f28614) {
            if (i == -1 || interfaceC4002.mo12952() == i) {
                C20410 c20410M23499 = m23499((InterfaceC3256) interfaceC4002);
                c20410M23499.m46809(i2);
                c20410M23499.m46810(obj);
                c20410M23499.m46813();
            }
        }
        for (InterfaceC4002 interfaceC4003 : this.f28572) {
            if (interfaceC4003 != null && (i == -1 || interfaceC4003.mo12952() == i)) {
                C20410 c20410M234910 = m23499((InterfaceC3256) interfaceC4003);
                c20410M234910.m46809(i2);
                c20410M234910.m46810(obj);
                c20410M234910.m46813();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23508(C8782 c8782, final int i) {
        c8782.m23494();
        c8782.m23502(1, 10, Integer.valueOf(i));
        c8782.m23502(2, 10, Integer.valueOf(i));
        c8782.f28576.m16608(21, new InterfaceC19795() { // from class: l.ܶܿۙ
            @Override // l.InterfaceC19795
            public final void invoke(Object obj) {
                ((InterfaceC10582) obj).mo7200(i);
            }
        });
    }
}
