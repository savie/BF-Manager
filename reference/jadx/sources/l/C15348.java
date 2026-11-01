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

/* JADX INFO: renamed from: l.ܶܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8TF */
/* JADX INFO: loaded from: classes5.dex */
public final class C15348 extends AbstractC22465 implements InterfaceC17693 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f49961;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public Object f49962;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f49963;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f49964;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20039 f49965;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Looper f49966;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f49967;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C17340 f49968;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C18627 f49969;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4784[] f49970;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8065 f49971;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C2708 f49972;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4784[] f49973;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Surface f49974;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C18896 f49975;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17142 f49976;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final long f49977;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C0530 f49978;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public TextureView f49979;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC23844 f49980;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C5221 f49981;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C6880 f49982;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public boolean f49983;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C18627 f49984;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f49985;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C5283 f49986;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f49987;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10161 f49988;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Context f49989;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f49990;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23035 f49991;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C13314 f49992;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C13710 f49993;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public C4078 f49994;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8313 f49995;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C20516 f49996;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f49997;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final SurfaceHolderCallbackC4057 f49998;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f49999;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f50000;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8676 f50001;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5221 f50002;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f50003;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50004;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final C21718 f50005;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16841 f50006;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f50007;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f50008;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C0435 f50009;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C10087 f50010;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public SurfaceHolder f50011;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f50012;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f50013;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20060 f50014;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f50015;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22176 f50016;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10273 f50017;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7690 f50018;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f50019;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C22217 f50020;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final long f50021;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f50022;

    static {
        C11572.m28868("media3.exoplayer");
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ܰ */
    public final void mo25839(InterfaceC19333 interfaceC19333) {
        interfaceC19333.getClass();
        this.f50014.m45426((Object) interfaceC19333);
    }

    public C15348(C14872 c14872) throws Throwable {
        C14872 c14873;
        C22217 c22217;
        Handler.Callback callback;
        final C15348 c15348 = this;
        ContextWrapper contextWrapper = c14872.f48616;
        c15348.f50016 = new C22176();
        try {
            C0303.m1851("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + C17983.f57504 + "]");
            C22217 c22218 = c14872.f48599;
            c15348.f49989 = contextWrapper.getApplicationContext();
            c14872.f48598.getClass();
            c15348.f49995 = new C0550(c22218);
            c15348.f49967 = c14872.f48610;
            c15348.f49972 = c14872.f48607;
            c15348.f50003 = c14872.f48594;
            c15348.f50007 = false;
            c15348.f50008 = c14872.f48595;
            SurfaceHolderCallbackC4057 surfaceHolderCallbackC4057 = new SurfaceHolderCallbackC4057(c15348);
            c15348.f49998 = surfaceHolderCallbackC4057;
            c15348.f49982 = new C6880();
            Handler handler = new Handler(c14872.f48600);
            InterfaceC1256 interfaceC1256 = (InterfaceC1256) c14872.f48602.get();
            InterfaceC4784[] interfaceC4784ArrMo4566 = interfaceC1256.mo4566(handler, surfaceHolderCallbackC4057, surfaceHolderCallbackC4057, surfaceHolderCallbackC4057, surfaceHolderCallbackC4057);
            c15348.f49973 = interfaceC4784ArrMo4566;
            C2023.m6510(interfaceC4784ArrMo4566.length > 0);
            c15348.f49970 = new InterfaceC4784[interfaceC4784ArrMo4566.length];
            int i = 0;
            while (true) {
                InterfaceC4784[] interfaceC4784Arr = c15348.f49970;
                if (i >= interfaceC4784Arr.length) {
                    break;
                }
                interfaceC1256.mo4565(c15348.f49973[i]);
                interfaceC4784Arr[i] = null;
                i++;
                c15348.f50016.m49198();
                throw th;
            }
            AbstractC8676 abstractC8676 = (AbstractC8676) c14872.f48614.get();
            c15348.f50001 = abstractC8676;
            c15348.f49991 = (InterfaceC23035) c14872.f48608.get();
            C14321 c14321M34551 = C14321.m34551((ContextWrapper) c14872.f48605.f8277);
            c15348.f49976 = c14321M34551;
            c15348.f50013 = c14872.f48609;
            C6901 c6901 = c14872.f48601;
            c15348.f49977 = c14872.f48603;
            c15348.f50021 = c14872.f48604;
            c15348.f49961 = c14872.f48617;
            C4078 c4078 = c14872.f48612;
            c15348.f49994 = c4078;
            Looper looper = c14872.f48600;
            c15348.f49966 = looper;
            c15348.f50020 = c22218;
            c15348.f49988 = c15348;
            c15348.f50014 = new C20060(looper, c22218, new C3012());
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            c15348.f49963 = copyOnWriteArraySet;
            c15348.f50004 = new ArrayList();
            c15348.f50017 = new C8862();
            InterfaceC4784[] interfaceC4784Arr2 = c15348.f49973;
            C10087 c10087 = new C10087(new C5490[interfaceC4784Arr2.length], new InterfaceC6558[interfaceC4784Arr2.length], C9456.f32004, null);
            c15348.f50010 = c10087;
            c15348.f49965 = new C20039();
            C17921 c17921 = new C17921();
            c17921.m41613(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            c17921.m41611(29, abstractC8676 instanceof C12909);
            c17921.m41611(23, false);
            c17921.m41611(25, false);
            c17921.m41611(33, false);
            c17921.m41611(26, false);
            c17921.m41611(34, false);
            C18627 c18627M41609 = c17921.m41609();
            c15348.f49984 = c18627M41609;
            C17921 c17922 = new C17921();
            c17922.m41612(c18627M41609);
            c17922.m41610(4);
            c17922.m41610(10);
            c15348.f49969 = c17922.m41609();
            c15348.f49971 = c22218.mo28887(looper, null);
            C20516 c20516 = new C20516(c15348);
            c15348.f49996 = c20516;
            c15348.f49968 = C17340.m40318(c10087);
            c15348.f49995.mo2603(c15348, looper);
            final C9724 c9724 = new C9724(c14872.f48615);
            Context context = c15348.f49989;
            InterfaceC4784[] interfaceC4784Arr3 = c15348.f49973;
            InterfaceC4784[] interfaceC4784Arr4 = c15348.f49970;
            c14872.f48597.getClass();
            try {
                C0530 c0530 = new C0530(context, interfaceC4784Arr3, interfaceC4784Arr4, abstractC8676, c10087, new C14746(), c14321M34551, c15348.f50019, c15348.f49999, c15348.f49995, c6901, c14872.f48606, c14872.f48611, looper, c22218, c20516, c9724, c15348.f49982);
                c15348 = this;
                c15348.f49978 = c0530;
                Looper looperM2537 = c0530.m2537();
                c15348.f50019 = 0;
                C5221 c5221 = C5221.f18078;
                c15348.f50002 = c5221;
                c15348.f49981 = c5221;
                c15348.f50000 = -1;
                c15348.f50006 = C16841.f53887;
                c15348.f50015 = true;
                c15348.mo25839(c15348.f49995);
                c14321M34551.mo34554(new Handler(looper), c15348.f49995);
                copyOnWriteArraySet.add(c15348.f49998);
                if (Build.VERSION.SDK_INT >= 31) {
                    final Context context2 = c15348.f49989;
                    c14873 = c14872;
                    final boolean z = c14873.f48613;
                    callback = null;
                    c22217 = c22218;
                    c22217.mo28887(c0530.m2537(), null).mo21243(new Runnable() { // from class: l.ۨܽۙ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C14663 c14663M35179 = C14663.m35179(context2);
                            if (c14663M35179 == null) {
                                C0303.m1848("MediaMetricsService unavailable.");
                                return;
                            }
                            if (z) {
                                c15348.m36795(c14663M35179);
                            }
                            c9724.m24677(c14663M35179.m35189());
                        }
                    });
                } else {
                    c14873 = c14872;
                    c22217 = c22218;
                    callback = null;
                }
                Handler.Callback callback2 = callback;
                C13710 c13710 = new C13710(0, looperM2537, looper, c22217, new InterfaceC4536() { // from class: l.᩶֡ۙ
                    @Override // l.InterfaceC4536
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo12663(Object obj, Object obj2) {
                        ((Integer) obj).getClass();
                        C15348.m36763(this.f63594, ((Integer) obj2).intValue());
                    }
                });
                c15348.f49993 = c13710;
                c13710.m33420(new Runnable() { // from class: l.֡֡ۙ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C15348.m36762(this.f916);
                    }
                });
                C22217 c22219 = c22217;
                C7690 c7690 = new C7690(contextWrapper, looperM2537, c14873.f48600, c15348.f49998, c22217);
                c15348.f50018 = c7690;
                c7690.m20325();
                C21718 c21718 = new C21718();
                contextWrapper.getApplicationContext();
                c22219.mo28887(looperM2537, callback2);
                c15348.f50005 = c21718;
                C18896 c18896 = new C18896();
                contextWrapper.getApplicationContext();
                c22219.mo28887(looperM2537, callback2);
                c15348.f49975 = c18896;
                C15410 c15410 = C15410.f50232;
                c15348.f49992 = C13314.f44192;
                c15348.f49986 = C5283.f18286;
                c0530.m2528(c4078);
                c0530.m2527(c15348.f49972);
                c15348.m36756(1, 3, c15348.f49972);
                c15348.m36756(2, 4, Integer.valueOf(c15348.f50003));
                c15348.m36756(2, 5, (Object) 0);
                c15348.m36756(1, 9, Boolean.valueOf(c15348.f50007));
                c15348.m36756(6, 8, c15348.f49982);
                c15348.m36756(-1, 16, Integer.valueOf(c15348.f49967));
                c15348.f50016.m49198();
            } catch (Throwable th) {
                th = th;
                c15348 = this;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36784(final C15348 c15348, final C20992 c20992) {
        c15348.f49971.mo21243(new Runnable() { // from class: l.ܽ֡ۙ
            @Override // java.lang.Runnable
            public final void run() {
                C15348.m36771(this.f52455, c20992);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36762(C15348 c15348) {
        C13710 c13710 = c15348.f49993;
        Context context = c15348.f49989;
        String str = C17983.f57504;
        c13710.m33419(Integer.valueOf(C21780.m48542(context).generateAudioSessionId()));
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۤ */
    public final Looper mo25830() {
        return this.f49966;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ᩶ */
    public final C18627 mo25850() {
        m36776();
        return this.f49969;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۖ */
    public final int mo25808() {
        m36776();
        return this.f49968.f55180;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ᩵ */
    public final int mo25849() {
        m36776();
        return this.f49968.f55194;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ᩸ */
    public final C2170 mo25852() {
        m36776();
        return this.f49968.f55186;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ܰ */
    public final void mo25836() {
        m36776();
        C17340 c17340 = this.f49968;
        if (c17340.f55180 != 1) {
            return;
        }
        C17340 c17340M40322 = c17340.m40322((C2170) null);
        C17340 c17340M36753 = m36753(c17340M40322, c17340M40322.f55191.m38828() ? 4 : 2);
        this.f49997++;
        this.f49978.m2536();
        m36773(c17340M36753, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۙ */
    public final void mo25816(List list) {
        m36776();
        ArrayList arrayListM36781 = m36781(list);
        m36776();
        m36760(arrayListM36781, -1, -9223372036854775807L, true);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۙ */
    public final void mo25813(long j, List list) {
        m36776();
        ArrayList arrayListM36781 = m36781(list);
        m36776();
        m36760(arrayListM36781, 0, j, false);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۫ */
    public final void mo25834() {
        C9580 c9580;
        int i;
        Pair pairM36750;
        Pair pairM38824;
        boolean z;
        C17340 c17340M36754;
        int i2;
        m36776();
        ArrayList arrayList = this.f50004;
        int size = arrayList.size();
        int iMin = Math.min(Integer.MAX_VALUE, size);
        if (size <= 0 || iMin == 0) {
            return;
        }
        C17340 c17340 = this.f49968;
        int iM36777 = m36777(c17340);
        long jM36749 = m36749(c17340);
        AbstractC16511 abstractC16511 = c17340.f55191;
        int size2 = arrayList.size();
        this.f49997++;
        for (int i3 = iMin - 1; i3 >= 0; i3--) {
            arrayList.remove(i3);
        }
        this.f50017 = this.f50017.mo22997(iMin);
        C9580 c9581 = new C9580(arrayList, this.f50017);
        if (abstractC16511.m38828() || c9581.m38828()) {
            c9580 = c9581;
            i = size2;
            boolean z2 = !abstractC16511.m38828() && c9580.m38828();
            int i4 = z2 ? -1 : iM36777;
            if (z2) {
                jM36749 = -9223372036854775807L;
            }
            pairM36750 = m36750(c9580, i4, jM36749);
        } else {
            pairM38824 = abstractC16511.m38824(this.f73340, this.f49965, iM36777, C17983.m41827(jM36749));
            Object obj = pairM38824.first;
            if (c9581.mo14959(obj) != -1) {
                z = true;
                c9580 = c9581;
                i = size2;
            } else {
                c9580 = c9581;
                i = size2;
                int iM2445 = C0530.m2445(this.f73340, this.f49965, this.f50019, this.f49999, obj, abstractC16511, c9580);
                if (iM2445 != -1) {
                    C0282 c0282 = this.f73340;
                    c9580.mo14810(iM2445, c0282, 0L);
                    pairM36750 = m36750(c9580, iM2445, C17983.m41856(c0282.f1582));
                } else {
                    pairM36750 = m36750(c9580, -1, -9223372036854775807L);
                }
            }
            c17340M36754 = m36754(c17340, c9580, pairM38824);
            i2 = c17340M36754.f55180;
            if (i2 != z && i2 != 4 && iMin > 0 && iMin == i && iM36777 >= c17340M36754.f55191.mo19929()) {
                c17340M36754 = m36753(c17340M36754, 4);
            }
            C17340 c17341 = c17340M36754;
            this.f49978.m2525(iMin, this.f50017);
            m36773(c17341, 0, z ^ c17341.f55179.f49778.equals(this.f49968.f55179.f49778), 4, m36780(c17341), -1, false);
        }
        pairM38824 = pairM36750;
        z = true;
        c17340M36754 = m36754(c17340, c9580, pairM38824);
        i2 = c17340M36754.f55180;
        if (i2 != z) {
            c17340M36754 = m36753(c17340M36754, 4);
        }
        C17340 c17342 = c17340M36754;
        this.f49978.m2525(iMin, this.f50017);
        m36773(c17342, 0, z ^ c17342.f55179.f49778.equals(this.f49968.f55179.f49778), 4, m36780(c17342), -1, false);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۙ */
    public final void mo25820(boolean z) {
        m36776();
        m36757(1, z);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo25806() {
        m36776();
        return this.f49968.f55193;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۙ */
    public final void mo25812(final int i) {
        m36776();
        if (this.f50019 != i) {
            this.f50019 = i;
            this.f49978.m2540(i);
            InterfaceC7359 interfaceC7359 = new InterfaceC7359() { // from class: l.۟֡ۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj) {
                    ((InterfaceC19333) obj).mo2571(i);
                }
            };
            C20060 c20060 = this.f50014;
            c20060.m45425(8, interfaceC7359);
            m36787();
            c20060.m45424();
        }
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۬ */
    public final int mo25835() {
        m36776();
        return this.f50019;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ܰ */
    public final void mo25840(final boolean z) {
        m36776();
        if (this.f49999 != z) {
            this.f49999 = z;
            this.f49978.m2542(z);
            InterfaceC7359 interfaceC7359 = new InterfaceC7359() { // from class: l.۫֡ۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj) {
                    ((InterfaceC19333) obj).mo2621(z);
                }
            };
            C20060 c20060 = this.f50014;
            c20060.m45425(9, interfaceC7359);
            m36787();
            c20060.m45424();
        }
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۙۙ */
    public final boolean mo25821() {
        m36776();
        return this.f49999;
    }

    @Override // l.AbstractC22465
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36794(long j, int i, boolean z) {
        m36776();
        if (i == -1) {
            return;
        }
        C2023.m6507(i >= 0);
        AbstractC16511 abstractC16511 = this.f49968.f55191;
        if (abstractC16511.m38828() || i < abstractC16511.mo19929()) {
            this.f49995.mo2616();
            this.f49997++;
            if (mo25811()) {
                C0303.m1848("seekTo ignored because an ad is playing");
                C20992 c20992 = new C20992(this.f49968);
                c20992.m47155(1);
                m36784(this.f49996.f66490, c20992);
                return;
            }
            C17340 c17340M40320 = this.f49968;
            int i2 = c17340M40320.f55180;
            if (i2 == 3 || (i2 == 4 && !abstractC16511.m38828())) {
                c17340M40320 = this.f49968.m40320(2);
            }
            int iMo25810 = mo25810();
            C17340 c17340M36754 = m36754(c17340M40320, abstractC16511, m36750(abstractC16511, i, j));
            this.f49978.m2531(abstractC16511, i, C17983.m41827(j));
            m36773(c17340M36754, 0, true, 1, m36780(c17340M36754), iMo25810, z);
        }
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ᩹ۙ */
    public final long mo25854() {
        m36776();
        return this.f49977;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ֫ */
    public final long mo25807() {
        m36776();
        return this.f50021;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ܽ */
    public final long mo25845() {
        m36776();
        return this.f49961;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۙ */
    public final void mo25819(C21449 c21449) {
        m36776();
        if (this.f49968.f55177.equals(c21449)) {
            return;
        }
        C17340 c17340M40326 = this.f49968.m40326(c21449);
        this.f49997++;
        this.f49978.m2541(c21449);
        m36773(c17340M40326, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۨ */
    public final C21449 mo25832() {
        m36776();
        return this.f49968.f55177;
    }

    @Override // l.InterfaceC10161
    public final void stop() {
        m36776();
        m36761((C2170) null);
        AbstractC22433 abstractC22433Of = AbstractC22433.of();
        long j = this.f49968.f55192;
        this.f50006 = new C16841(abstractC22433Of);
    }

    @Override // l.InterfaceC17693
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36793() {
        C0303.m1851("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + C17983.f57504 + "] [" + C11572.m28867() + "]");
        m36776();
        this.f50018.m20325();
        this.f50005.m48458(false);
        this.f49975.m43564(false);
        if (!this.f49978.m2543()) {
            this.f50014.m45429(10, new C0252(3));
        }
        this.f50014.m45428();
        this.f49971.mo21247();
        this.f49976.mo34555(this.f49995);
        C17340 c17340 = this.f49968;
        if (c17340.f55190) {
            this.f49968 = c17340.m40319();
        }
        C17340 c17340M36753 = m36753(this.f49968, 1);
        this.f49968 = c17340M36753;
        C17340 c17340M40323 = c17340M36753.m40323(c17340M36753.f55179);
        this.f49968 = c17340M40323;
        c17340M40323.f55178 = c17340M40323.f55192;
        this.f49968.f55183 = 0L;
        this.f49995.mo2575();
        m36789();
        Surface surface = this.f49974;
        if (surface != null) {
            surface.release();
            this.f49974 = null;
        }
        this.f50006 = C16841.f53887;
        this.f49990 = true;
    }

    @Override // l.InterfaceC17693
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean mo36792() {
        m36776();
        return this.f49990;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۛ */
    public final int mo25824() {
        m36776();
        if (this.f49968.f55191.m38828()) {
            return 0;
        }
        C17340 c17340 = this.f49968;
        return c17340.f55191.mo14959(c17340.f55179.f49778);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۗ */
    public final int mo25810() {
        m36776();
        int iM36777 = m36777(this.f49968);
        if (iM36777 == -1) {
            return 0;
        }
        return iM36777;
    }

    @Override // l.InterfaceC10161
    public final long getDuration() {
        m36776();
        if (mo25811()) {
            C17340 c17340 = this.f49968;
            C15274 c15274 = c17340.f55179;
            AbstractC16511 abstractC16511 = c17340.f55191;
            Object obj = c15274.f49778;
            C20039 c20039 = this.f49965;
            abstractC16511.mo38826(obj, c20039);
            return C17983.m41856(c20039.m45387(c15274.f49779, c15274.f49782));
        }
        return mo25846();
    }

    @Override // l.InterfaceC10161
    public final long getCurrentPosition() {
        m36776();
        return C17983.m41856(m36780(this.f49968));
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۜ */
    public final long mo25825() {
        m36776();
        return C17983.m41856(this.f49968.f55183);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo25811() {
        m36776();
        return this.f49968.f55179.m36576();
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۠ */
    public final int mo25827() {
        m36776();
        if (mo25811()) {
            return this.f49968.f55179.f49779;
        }
        return -1;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ᩻ */
    public final int mo25856() {
        m36776();
        if (mo25811()) {
            return this.f49968.f55179.f49782;
        }
        return -1;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۢ */
    public final long mo25829() {
        m36776();
        return m36749(this.f49968);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ܰۙ */
    public final long mo25842() {
        m36776();
        if (this.f49968.f55191.m38828()) {
            return this.f50012;
        }
        C17340 c17340 = this.f49968;
        long j = 0;
        if (c17340.f55176.f49780 != c17340.f55179.f49780) {
            return C17983.m41856(c17340.f55191.mo14810(mo25810(), this.f73340, 0L).f1588);
        }
        long j2 = c17340.f55178;
        if (this.f49968.f55176.m36576()) {
            C17340 c17341 = this.f49968;
            c17341.f55191.mo38826(c17341.f55176.f49778, this.f49965).m45386(this.f49968.f55176.f49779);
        } else {
            j = j2;
        }
        C17340 c17342 = this.f49968;
        AbstractC16511 abstractC16511 = c17342.f55191;
        Object obj = c17342.f55176.f49778;
        C20039 c20039 = this.f49965;
        abstractC16511.mo38826(obj, c20039);
        return C17983.m41856(j + c20039.f64171);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ᩳ */
    public final C9456 mo25847() {
        m36776();
        return this.f49968.f55181.f34442;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۟ */
    public final C14395 mo25826() {
        m36776();
        C14395 c14395Mo22500 = this.f50001.mo22500();
        return this.f49964 ? c14395Mo22500.mo5308().mo34364(this.f49980).mo34361() : c14395Mo22500;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۙ */
    public final void mo25817(C14395 c14395) {
        C14395 c14395Mo34361;
        m36776();
        AbstractC8676 abstractC8676 = this.f50001;
        abstractC8676.getClass();
        if (abstractC8676 instanceof C12909) {
            C14395 c14395Mo25826 = mo25826();
            if (this.f49964) {
                this.f49980 = c14395.f47182;
                AbstractC23844 abstractC23844 = this.f49994.f14993;
                C23567 c23567Mo5308 = c14395.mo5308();
                AbstractC0477 it = abstractC23844.iterator();
                while (it.hasNext()) {
                    c23567Mo5308.mo34363(((Integer) it.next()).intValue(), true);
                }
                c14395Mo34361 = c23567Mo5308.mo34361();
            } else {
                c14395Mo34361 = c14395;
            }
            if (!c14395Mo34361.equals(abstractC8676.mo22500())) {
                abstractC8676.mo22495(c14395Mo34361);
            }
            if (c14395Mo25826.equals(c14395)) {
                return;
            }
            this.f50014.m45429(19, new C22862(c14395));
        }
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۚۙ */
    public final C5221 mo25823() {
        m36776();
        return this.f50002;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۡ */
    public final AbstractC16511 mo25828() {
        m36776();
        return this.f49968.f55191;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۧ */
    public final C13314 mo25831() {
        m36776();
        return this.f49992;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ܳ */
    public final void mo25843() {
        m36776();
        m36789();
        m36759((Object) null);
        m36755(0, 0);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۙ */
    public final void mo25814(SurfaceView surfaceView) {
        m36776();
        if (surfaceView instanceof InterfaceC15608) {
            m36789();
            m36759((Object) surfaceView);
            m36758(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof C0435;
        SurfaceHolderCallbackC4057 surfaceHolderCallbackC4057 = this.f49998;
        if (z) {
            m36789();
            this.f50009 = (C0435) surfaceView;
            C14519 c14519M36752 = m36752(this.f49982);
            c14519M36752.m34952(10000);
            c14519M36752.m34953(this.f50009);
            c14519M36752.m34955();
            this.f50009.m2259(surfaceHolderCallbackC4057);
            m36759(this.f50009.m2260());
            m36758(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        m36776();
        if (holder == null) {
            mo25843();
            return;
        }
        m36789();
        this.f49983 = true;
        this.f50011 = holder;
        holder.addCallback(surfaceHolderCallbackC4057);
        Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            m36759(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            m36755(surfaceFrame.width(), surfaceFrame.height());
        } else {
            m36759((Object) null);
            m36755(0, 0);
        }
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ܰ */
    public final void mo25837(SurfaceView surfaceView) {
        m36776();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        m36776();
        if (holder == null || holder != this.f50011) {
            return;
        }
        mo25843();
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۙ */
    public final void mo25815(TextureView textureView) {
        m36776();
        if (textureView == null) {
            mo25843();
            return;
        }
        m36789();
        this.f49979 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            C0303.m1848("Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f49998);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m36759((Object) null);
            m36755(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            m36759(surface);
            this.f49974 = surface;
            m36755(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ܰ */
    public final void mo25838(TextureView textureView) {
        m36776();
        if (textureView == null || textureView != this.f49979) {
            return;
        }
        mo25843();
    }

    @Override // l.InterfaceC17693
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo36797(boolean z) {
        C14395 c14395Mo34361;
        m36776();
        if (z == this.f49964) {
            return;
        }
        this.f49964 = z;
        C4078 c4078 = this.f49994;
        if (!c4078.f14993.isEmpty()) {
            AbstractC8676 abstractC8676 = this.f50001;
            abstractC8676.getClass();
            if (abstractC8676 instanceof C12909) {
                C14395 c14395Mo22500 = abstractC8676.mo22500();
                if (z) {
                    this.f49980 = c14395Mo22500.f47182;
                    AbstractC23844 abstractC23844 = c4078.f14993;
                    C23567 c23567Mo5308 = c14395Mo22500.mo5308();
                    AbstractC0477 it = abstractC23844.iterator();
                    while (it.hasNext()) {
                        c23567Mo5308.mo34363(((Integer) it.next()).intValue(), true);
                    }
                    c14395Mo34361 = c23567Mo5308.mo34361();
                } else {
                    c14395Mo34361 = c14395Mo22500.mo5308().mo34364(this.f49980).mo34361();
                    this.f49980 = null;
                }
                if (!c14395Mo34361.equals(c14395Mo22500)) {
                    abstractC8676.mo22495(c14395Mo34361);
                }
            }
        }
        this.f49978.m2534(z);
        C17340 c17340 = this.f49968;
        m36757(c17340.f55175, c17340.f55193);
    }

    @Override // l.InterfaceC17693
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean mo36798() {
        m36776();
        return this.f49964;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36795(C14663 c14663) {
        this.f49995.mo2608(c14663);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ᩴ */
    public final C16841 mo25848() {
        m36776();
        return this.f50006;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۙ */
    public final void mo25818(InterfaceC19333 interfaceC19333) {
        m36776();
        interfaceC19333.getClass();
        this.f50014.m45427(interfaceC19333);
    }

    @Override // l.InterfaceC17693
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36796(InterfaceC15142 interfaceC15142) {
        m36776();
        m36756(4, 15, interfaceC15142);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36761(C2170 c2170) {
        C17340 c17340 = this.f49968;
        C17340 c17340M40323 = c17340.m40323(c17340.f55179);
        c17340M40323.f55178 = c17340M40323.f55192;
        c17340M40323.f55183 = 0L;
        C17340 c17340M36753 = m36753(c17340M40323, 1);
        if (c2170 != null) {
            c17340M36753 = c17340M36753.m40322(c2170);
        }
        this.f49997++;
        this.f49978.m2538();
        m36773(c17340M36753, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m36777(C17340 c17340) {
        if (c17340.f55191.m38828()) {
            return this.f50000;
        }
        return c17340.f55191.mo38826(c17340.f55179.f49778, this.f49965).f64168;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m36749(C17340 c17340) {
        C15274 c15274 = c17340.f55179;
        long j = c17340.f55189;
        AbstractC16511 abstractC16511 = c17340.f55191;
        if (c15274.m36576()) {
            Object obj = c17340.f55179.f49778;
            C20039 c20039 = this.f49965;
            abstractC16511.mo38826(obj, c20039);
            if (j == -9223372036854775807L) {
                return C17983.m41856(abstractC16511.mo14810(m36777(c17340), this.f73340, 0L).f1582);
            }
            return C17983.m41856(j) + C17983.m41856(c20039.f64171);
        }
        return C17983.m41856(m36780(c17340));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private long m36780(C17340 c17340) {
        long jM40329;
        if (c17340.f55191.m38828()) {
            return C17983.m41827(this.f50012);
        }
        if (c17340.f55190) {
            jM40329 = c17340.m40329();
        } else {
            jM40329 = c17340.f55192;
        }
        if (c17340.f55179.m36576()) {
            return jM40329;
        }
        AbstractC16511 abstractC16511 = c17340.f55191;
        Object obj = c17340.f55179.f49778;
        C20039 c20039 = this.f49965;
        abstractC16511.mo38826(obj, c20039);
        return jM40329 + c20039.f64171;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private ArrayList m36781(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.f49991.mo5443((C13689) list.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36771(C15348 c15348, C20992 c20992) {
        boolean z;
        int i = c15348.f49997 - c20992.f68357;
        c15348.f49997 = i;
        boolean z2 = true;
        if (c20992.f68356) {
            c15348.f50022 = c20992.f68355;
            c15348.f49987 = true;
        }
        if (i == 0) {
            AbstractC16511 abstractC16511 = c20992.f68354.f55191;
            if (!c15348.f49968.f55191.m38828() && abstractC16511.m38828()) {
                c15348.f50000 = -1;
                c15348.f50012 = 0L;
            }
            if (!abstractC16511.m38828()) {
                List listM24448 = ((C9580) abstractC16511).m24448();
                C2023.m6510(listM24448.size() == c15348.f50004.size());
                for (int i2 = 0; i2 < listM24448.size(); i2++) {
                    ((C23109) c15348.f50004.get(i2)).m51118((AbstractC16511) listM24448.get(i2));
                }
            }
            long j = -9223372036854775807L;
            if (c15348.f49987) {
                if (c20992.f68354.f55179.equals(c15348.f49968.f55179) && c20992.f68354.f55187 == c15348.f49968.f55192) {
                    z2 = false;
                }
                if (z2) {
                    if (abstractC16511.m38828() || c20992.f68354.f55179.m36576()) {
                        j = c20992.f68354.f55187;
                    } else {
                        C17340 c17340 = c20992.f68354;
                        C15274 c15274 = c17340.f55179;
                        long j2 = c17340.f55187;
                        Object obj = c15274.f49778;
                        C20039 c20039 = c15348.f49965;
                        abstractC16511.mo38826(obj, c20039);
                        j = j2 + c20039.f64171;
                    }
                }
                z = z2;
            } else {
                z = false;
            }
            c15348.f49987 = false;
            c15348.m36773(c20992.f68354, 1, z, c15348.f50022, j, -1, false);
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
    private void m36773(final C17340 c17340, final int i, boolean z, final int i2, long j, int i3, boolean z2) {
        boolean z3;
        C2170 c2170;
        List list;
        Pair pair;
        int i4;
        boolean zBooleanValue;
        final int iIntValue;
        final C13689 c13689;
        List list2;
        C2398 c2398M14400;
        int i5;
        C0987 c0987;
        int i6;
        boolean zEquals;
        boolean z4;
        boolean z5;
        boolean z6;
        C20060 c20060;
        C2170 c2171;
        C10087 c10087;
        C10087 c10088;
        Iterator it;
        int iMo25810;
        Object obj;
        C13689 c136810;
        Object obj2;
        int iMo14959;
        long jM41856;
        long jM41857;
        C17340 c17341 = this.f49968;
        this.f49968 = c17340;
        AbstractC16511 abstractC16511 = c17341.f55191;
        AbstractC16511 abstractC16512 = c17340.f55191;
        boolean z7 = c17340.f55190;
        C2170 c2172 = c17340.f55186;
        List list3 = c17340.f55182;
        boolean zEquals2 = abstractC16511.equals(abstractC16512);
        AbstractC16511 abstractC16513 = c17341.f55191;
        C15274 c15274 = c17341.f55179;
        AbstractC16511 abstractC16514 = c17340.f55191;
        C15274 c15275 = c17340.f55179;
        boolean zM38828 = abstractC16514.m38828();
        C0282 c0282 = this.f73340;
        C20039 c20039 = this.f49965;
        if (!zM38828 || !abstractC16513.m38828()) {
            z3 = z7;
            if (abstractC16514.m38828() != abstractC16513.m38828()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else {
                c2170 = c2172;
                list = list3;
                if (!abstractC16513.mo14810(abstractC16513.mo38826(c15274.f49778, c20039).f64168, c0282, 0L).f1591.equals(abstractC16514.mo14810(abstractC16514.mo38826(c15275.f49778, c20039).f64168, c0282, 0L).f1591)) {
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
                } else if (z && i2 == 0 && c15274.f49780 < c15275.f49780) {
                    pair = new Pair(Boolean.TRUE, 0);
                } else {
                    pair = (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (abstractC16514.m38828()) {
                    c13689 = null;
                } else {
                    c13689 = abstractC16514.mo14810(abstractC16514.mo38826(c15275.f49778, c20039).f64168, c0282, 0L).f1594;
                }
                this.f49981 = C5221.f18078;
            } else {
                c13689 = null;
            }
            if (!zBooleanValue) {
                list2 = list;
                if (!c17341.f55182.equals(list2)) {
                }
                C5221 c5221M36786 = m36786();
                zEquals = c5221M36786.equals(this.f50002);
                this.f50002 = c5221M36786;
                if (c17341.f55193 != c17340.f55193) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c17341.f55180 != c17340.f55180) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5 || z4) {
                    m36788();
                }
                if (c17341.f55185 != c17340.f55185) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                c20060 = this.f50014;
                if (!zEquals2) {
                    c20060.m45425(0, new InterfaceC7359() { // from class: l.ܺ֡ۙ
                        @Override // l.InterfaceC7359
                        public final void invoke(Object obj3) {
                            ((InterfaceC19333) obj3).mo2610(c17340.f55191, i);
                        }
                    });
                }
                if (z) {
                    final C8750 c8750M36751 = m36751(i2, c17341, i3);
                    iMo25810 = mo25810();
                    if (this.f49968.f55191.m38828()) {
                        obj = null;
                        c136810 = null;
                        obj2 = null;
                        iMo14959 = -1;
                    } else {
                        C17340 c17342 = this.f49968;
                        Object obj3 = c17342.f55179.f49778;
                        c17342.f55191.mo38826(obj3, c20039);
                        iMo14959 = this.f49968.f55191.mo14959(obj3);
                        obj = this.f49968.f55191.mo14810(iMo25810, c0282, 0L).f1591;
                        c136810 = c0282.f1594;
                        obj2 = obj3;
                    }
                    jM41856 = C17983.m41856(j);
                    if (this.f49968.f55179.m36576()) {
                        jM41857 = C17983.m41856(m36746(this.f49968));
                    } else {
                        jM41857 = jM41856;
                    }
                    C15274 c15276 = this.f49968.f55179;
                    final C8750 c8750 = new C8750(obj, iMo25810, c136810, obj2, iMo14959, jM41856, jM41857, c15276.f49779, c15276.f49782);
                    c20060.m45425(11, new InterfaceC7359() { // from class: l.ۢ֡ۙ
                        @Override // l.InterfaceC7359
                        public final void invoke(Object obj4) {
                            InterfaceC19333 interfaceC19333 = (InterfaceC19333) obj4;
                            interfaceC19333.getClass();
                            interfaceC19333.mo2580(i2, c8750M36751, c8750);
                        }
                    });
                } else {
                    z5 = z5;
                    z6 = z6;
                }
                if (zBooleanValue) {
                    c20060.m45425(1, new InterfaceC7359() { // from class: l.ۗ֡ۙ
                        @Override // l.InterfaceC7359
                        public final void invoke(Object obj4) {
                            ((InterfaceC19333) obj4).mo2606(c13689, iIntValue);
                        }
                    });
                }
                c2171 = c2170;
                if (c17341.f55186 != c2171) {
                    c20060.m45425(10, new InterfaceC7359() { // from class: l.ۙܽۙ
                        @Override // l.InterfaceC7359
                        public final void invoke(Object obj4) {
                            ((InterfaceC19333) obj4).mo2636(c17340.f55186);
                        }
                    });
                    if (c2171 != null) {
                        c20060.m45425(10, new InterfaceC7359() { // from class: l.ܰܽۙ
                            @Override // l.InterfaceC7359
                            public final void invoke(Object obj4) {
                                ((InterfaceC19333) obj4).mo2609(c17340.f55186);
                            }
                        });
                    }
                }
                c10087 = c17341.f55181;
                c10088 = c17340.f55181;
                if (c10087 != c10088) {
                    this.f50001.mo22493(c10088.f34441);
                    c20060.m45425(2, new InterfaceC7359() { // from class: l.ᩴ֡ۙ
                        @Override // l.InterfaceC7359
                        public final void invoke(Object obj4) {
                            ((InterfaceC19333) obj4).mo2601(c17340.f55181.f34442);
                        }
                    });
                }
                if (!zEquals) {
                    c20060.m45425(14, new C0392(this.f50002));
                }
                if (z6) {
                    c20060.m45425(3, new InterfaceC7359() { // from class: l.۠֡ۙ
                        @Override // l.InterfaceC7359
                        public final void invoke(Object obj4) {
                            InterfaceC19333 interfaceC19333 = (InterfaceC19333) obj4;
                            C17340 c17343 = c17340;
                            boolean z8 = c17343.f55185;
                            interfaceC19333.getClass();
                            interfaceC19333.mo2573(c17343.f55185);
                        }
                    });
                }
                if (z5 || z4) {
                    c20060.m45425(-1, new InterfaceC7359() { // from class: l.᩵֡ۙ
                        @Override // l.InterfaceC7359
                        public final void invoke(Object obj4) {
                            C17340 c17343 = c17340;
                            ((InterfaceC19333) obj4).mo2628(c17343.f55180, c17343.f55193);
                        }
                    });
                }
                if (z5) {
                    c20060.m45425(4, new InterfaceC7359() { // from class: l.ۡ֡ۙ
                        @Override // l.InterfaceC7359
                        public final void invoke(Object obj4) {
                            ((InterfaceC19333) obj4).mo2617(c17340.f55180);
                        }
                    });
                }
                if (z4 == 0 || c17341.f55175 != c17340.f55175) {
                    c20060.m45425(5, new InterfaceC7359() { // from class: l.ۧ֡ۙ
                        @Override // l.InterfaceC7359
                        public final void invoke(Object obj4) {
                            C17340 c17343 = c17340;
                            ((InterfaceC19333) obj4).mo2588(c17343.f55175, c17343.f55193);
                        }
                    });
                }
                if (c17341.f55194 != c17340.f55194) {
                    c20060.m45425(6, new InterfaceC7359() { // from class: l.᩻֡ۙ
                        @Override // l.InterfaceC7359
                        public final void invoke(Object obj4) {
                            ((InterfaceC19333) obj4).mo2623(c17340.f55194);
                        }
                    });
                }
                if (c17341.m40328() != c17340.m40328()) {
                    c20060.m45425(7, new InterfaceC7359() { // from class: l.ܳ֡ۙ
                        @Override // l.InterfaceC7359
                        public final void invoke(Object obj4) {
                            ((InterfaceC19333) obj4).mo2637(c17340.m40328());
                        }
                    });
                }
                if (!c17341.f55177.equals(c17340.f55177)) {
                    c20060.m45425(12, new InterfaceC7359() { // from class: l.֫֡ۙ
                        @Override // l.InterfaceC7359
                        public final void invoke(Object obj4) {
                            ((InterfaceC19333) obj4).mo2614(c17340.f55177);
                        }
                    });
                }
                m36787();
                c20060.m45424();
                if (c17341.f55190 != z3) {
                    it = this.f49963.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC4993) it.next()).mo11562();
                    }
                }
            }
            list2 = list;
            c2398M14400 = this.f49981.m14400();
            i5 = 0;
            while (i5 < list2.size()) {
                c0987 = (C0987) list2.get(i5);
                List list4 = list2;
                for (i6 = 0; i6 < c0987.m3789(); i6++) {
                    c0987.m3793(i6).mo3146(c2398M14400);
                }
                i5++;
                list2 = list4;
            }
            this.f49981 = c2398M14400.m7308();
            C5221 c5221M36787 = m36786();
            zEquals = c5221M36787.equals(this.f50002);
            this.f50002 = c5221M36787;
            if (c17341.f55193 != c17340.f55193) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c17341.f55180 != c17340.f55180) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                m36788();
            } else {
                m36788();
            }
            if (c17341.f55185 != c17340.f55185) {
                z6 = true;
            } else {
                z6 = false;
            }
            c20060 = this.f50014;
            if (!zEquals2) {
                c20060.m45425(0, new InterfaceC7359() { // from class: l.ܺ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj4) {
                        ((InterfaceC19333) obj4).mo2610(c17340.f55191, i);
                    }
                });
            }
            if (z) {
                final C8750 c8750M36752 = m36751(i2, c17341, i3);
                iMo25810 = mo25810();
                if (this.f49968.f55191.m38828()) {
                    C17340 c17343 = this.f49968;
                    Object obj4 = c17343.f55179.f49778;
                    c17343.f55191.mo38826(obj4, c20039);
                    iMo14959 = this.f49968.f55191.mo14959(obj4);
                    obj = this.f49968.f55191.mo14810(iMo25810, c0282, 0L).f1591;
                    c136810 = c0282.f1594;
                    obj2 = obj4;
                } else {
                    obj = null;
                    c136810 = null;
                    obj2 = null;
                    iMo14959 = -1;
                }
                jM41856 = C17983.m41856(j);
                if (this.f49968.f55179.m36576()) {
                    jM41857 = C17983.m41856(m36746(this.f49968));
                } else {
                    jM41857 = jM41856;
                }
                C15274 c15277 = this.f49968.f55179;
                final C8750 c8751 = new C8750(obj, iMo25810, c136810, obj2, iMo14959, jM41856, jM41857, c15277.f49779, c15277.f49782);
                c20060.m45425(11, new InterfaceC7359() { // from class: l.ۢ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj5) {
                        InterfaceC19333 interfaceC19333 = (InterfaceC19333) obj5;
                        interfaceC19333.getClass();
                        interfaceC19333.mo2580(i2, c8750M36752, c8751);
                    }
                });
            } else {
                z5 = z5;
                z6 = z6;
            }
            if (zBooleanValue) {
                c20060.m45425(1, new InterfaceC7359() { // from class: l.ۗ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj5) {
                        ((InterfaceC19333) obj5).mo2606(c13689, iIntValue);
                    }
                });
            }
            c2171 = c2170;
            if (c17341.f55186 != c2171) {
                c20060.m45425(10, new InterfaceC7359() { // from class: l.ۙܽۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj5) {
                        ((InterfaceC19333) obj5).mo2636(c17340.f55186);
                    }
                });
                if (c2171 != null) {
                    c20060.m45425(10, new InterfaceC7359() { // from class: l.ܰܽۙ
                        @Override // l.InterfaceC7359
                        public final void invoke(Object obj5) {
                            ((InterfaceC19333) obj5).mo2609(c17340.f55186);
                        }
                    });
                }
            }
            c10087 = c17341.f55181;
            c10088 = c17340.f55181;
            if (c10087 != c10088) {
                this.f50001.mo22493(c10088.f34441);
                c20060.m45425(2, new InterfaceC7359() { // from class: l.ᩴ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj5) {
                        ((InterfaceC19333) obj5).mo2601(c17340.f55181.f34442);
                    }
                });
            }
            if (!zEquals) {
                c20060.m45425(14, new C0392(this.f50002));
            }
            if (z6) {
                c20060.m45425(3, new InterfaceC7359() { // from class: l.۠֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj5) {
                        InterfaceC19333 interfaceC19333 = (InterfaceC19333) obj5;
                        C17340 c17344 = c17340;
                        boolean z8 = c17344.f55185;
                        interfaceC19333.getClass();
                        interfaceC19333.mo2573(c17344.f55185);
                    }
                });
            }
            if (z5) {
                c20060.m45425(-1, new InterfaceC7359() { // from class: l.᩵֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj5) {
                        C17340 c17344 = c17340;
                        ((InterfaceC19333) obj5).mo2628(c17344.f55180, c17344.f55193);
                    }
                });
            } else {
                c20060.m45425(-1, new InterfaceC7359() { // from class: l.᩵֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj5) {
                        C17340 c17344 = c17340;
                        ((InterfaceC19333) obj5).mo2628(c17344.f55180, c17344.f55193);
                    }
                });
            }
            if (z5) {
                c20060.m45425(4, new InterfaceC7359() { // from class: l.ۡ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj5) {
                        ((InterfaceC19333) obj5).mo2617(c17340.f55180);
                    }
                });
            }
            if (z4 == 0) {
                c20060.m45425(5, new InterfaceC7359() { // from class: l.ۧ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj5) {
                        C17340 c17344 = c17340;
                        ((InterfaceC19333) obj5).mo2588(c17344.f55175, c17344.f55193);
                    }
                });
            } else {
                c20060.m45425(5, new InterfaceC7359() { // from class: l.ۧ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj5) {
                        C17340 c17344 = c17340;
                        ((InterfaceC19333) obj5).mo2588(c17344.f55175, c17344.f55193);
                    }
                });
            }
            if (c17341.f55194 != c17340.f55194) {
                c20060.m45425(6, new InterfaceC7359() { // from class: l.᩻֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj5) {
                        ((InterfaceC19333) obj5).mo2623(c17340.f55194);
                    }
                });
            }
            if (c17341.m40328() != c17340.m40328()) {
                c20060.m45425(7, new InterfaceC7359() { // from class: l.ܳ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj5) {
                        ((InterfaceC19333) obj5).mo2637(c17340.m40328());
                    }
                });
            }
            if (!c17341.f55177.equals(c17340.f55177)) {
                c20060.m45425(12, new InterfaceC7359() { // from class: l.֫֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj5) {
                        ((InterfaceC19333) obj5).mo2614(c17340.f55177);
                    }
                });
            }
            m36787();
            c20060.m45424();
            if (c17341.f55190 != z3) {
                it = this.f49963.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4993) it.next()).mo11562();
                }
            }
        }
        pair = new Pair(Boolean.FALSE, -1);
        z3 = z7;
        c2170 = c2172;
        list = list3;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (abstractC16514.m38828()) {
                c13689 = abstractC16514.mo14810(abstractC16514.mo38826(c15275.f49778, c20039).f64168, c0282, 0L).f1594;
            } else {
                c13689 = null;
            }
            this.f49981 = C5221.f18078;
        } else {
            c13689 = null;
        }
        if (!zBooleanValue) {
            list2 = list;
            if (!c17341.f55182.equals(list2)) {
            }
            C5221 c5221M36788 = m36786();
            zEquals = c5221M36788.equals(this.f50002);
            this.f50002 = c5221M36788;
            if (c17341.f55193 != c17340.f55193) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c17341.f55180 != c17340.f55180) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                m36788();
            } else {
                m36788();
            }
            if (c17341.f55185 != c17340.f55185) {
                z6 = true;
            } else {
                z6 = false;
            }
            c20060 = this.f50014;
            if (!zEquals2) {
                c20060.m45425(0, new InterfaceC7359() { // from class: l.ܺ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj5) {
                        ((InterfaceC19333) obj5).mo2610(c17340.f55191, i);
                    }
                });
            }
            if (z) {
                final C8750 c8750M36753 = m36751(i2, c17341, i3);
                iMo25810 = mo25810();
                if (this.f49968.f55191.m38828()) {
                    C17340 c17344 = this.f49968;
                    Object obj5 = c17344.f55179.f49778;
                    c17344.f55191.mo38826(obj5, c20039);
                    iMo14959 = this.f49968.f55191.mo14959(obj5);
                    obj = this.f49968.f55191.mo14810(iMo25810, c0282, 0L).f1591;
                    c136810 = c0282.f1594;
                    obj2 = obj5;
                } else {
                    obj = null;
                    c136810 = null;
                    obj2 = null;
                    iMo14959 = -1;
                }
                jM41856 = C17983.m41856(j);
                if (this.f49968.f55179.m36576()) {
                    jM41857 = C17983.m41856(m36746(this.f49968));
                } else {
                    jM41857 = jM41856;
                }
                C15274 c15278 = this.f49968.f55179;
                final C8750 c8752 = new C8750(obj, iMo25810, c136810, obj2, iMo14959, jM41856, jM41857, c15278.f49779, c15278.f49782);
                c20060.m45425(11, new InterfaceC7359() { // from class: l.ۢ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj6) {
                        InterfaceC19333 interfaceC19333 = (InterfaceC19333) obj6;
                        interfaceC19333.getClass();
                        interfaceC19333.mo2580(i2, c8750M36753, c8752);
                    }
                });
            } else {
                z5 = z5;
                z6 = z6;
            }
            if (zBooleanValue) {
                c20060.m45425(1, new InterfaceC7359() { // from class: l.ۗ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj6) {
                        ((InterfaceC19333) obj6).mo2606(c13689, iIntValue);
                    }
                });
            }
            c2171 = c2170;
            if (c17341.f55186 != c2171) {
                c20060.m45425(10, new InterfaceC7359() { // from class: l.ۙܽۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj6) {
                        ((InterfaceC19333) obj6).mo2636(c17340.f55186);
                    }
                });
                if (c2171 != null) {
                    c20060.m45425(10, new InterfaceC7359() { // from class: l.ܰܽۙ
                        @Override // l.InterfaceC7359
                        public final void invoke(Object obj6) {
                            ((InterfaceC19333) obj6).mo2609(c17340.f55186);
                        }
                    });
                }
            }
            c10087 = c17341.f55181;
            c10088 = c17340.f55181;
            if (c10087 != c10088) {
                this.f50001.mo22493(c10088.f34441);
                c20060.m45425(2, new InterfaceC7359() { // from class: l.ᩴ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj6) {
                        ((InterfaceC19333) obj6).mo2601(c17340.f55181.f34442);
                    }
                });
            }
            if (!zEquals) {
                c20060.m45425(14, new C0392(this.f50002));
            }
            if (z6) {
                c20060.m45425(3, new InterfaceC7359() { // from class: l.۠֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj6) {
                        InterfaceC19333 interfaceC19333 = (InterfaceC19333) obj6;
                        C17340 c17345 = c17340;
                        boolean z8 = c17345.f55185;
                        interfaceC19333.getClass();
                        interfaceC19333.mo2573(c17345.f55185);
                    }
                });
            }
            if (z5) {
                c20060.m45425(-1, new InterfaceC7359() { // from class: l.᩵֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj6) {
                        C17340 c17345 = c17340;
                        ((InterfaceC19333) obj6).mo2628(c17345.f55180, c17345.f55193);
                    }
                });
            } else {
                c20060.m45425(-1, new InterfaceC7359() { // from class: l.᩵֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj6) {
                        C17340 c17345 = c17340;
                        ((InterfaceC19333) obj6).mo2628(c17345.f55180, c17345.f55193);
                    }
                });
            }
            if (z5) {
                c20060.m45425(4, new InterfaceC7359() { // from class: l.ۡ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj6) {
                        ((InterfaceC19333) obj6).mo2617(c17340.f55180);
                    }
                });
            }
            if (z4 == 0) {
                c20060.m45425(5, new InterfaceC7359() { // from class: l.ۧ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj6) {
                        C17340 c17345 = c17340;
                        ((InterfaceC19333) obj6).mo2588(c17345.f55175, c17345.f55193);
                    }
                });
            } else {
                c20060.m45425(5, new InterfaceC7359() { // from class: l.ۧ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj6) {
                        C17340 c17345 = c17340;
                        ((InterfaceC19333) obj6).mo2588(c17345.f55175, c17345.f55193);
                    }
                });
            }
            if (c17341.f55194 != c17340.f55194) {
                c20060.m45425(6, new InterfaceC7359() { // from class: l.᩻֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj6) {
                        ((InterfaceC19333) obj6).mo2623(c17340.f55194);
                    }
                });
            }
            if (c17341.m40328() != c17340.m40328()) {
                c20060.m45425(7, new InterfaceC7359() { // from class: l.ܳ֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj6) {
                        ((InterfaceC19333) obj6).mo2637(c17340.m40328());
                    }
                });
            }
            if (!c17341.f55177.equals(c17340.f55177)) {
                c20060.m45425(12, new InterfaceC7359() { // from class: l.֫֡ۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj6) {
                        ((InterfaceC19333) obj6).mo2614(c17340.f55177);
                    }
                });
            }
            m36787();
            c20060.m45424();
            if (c17341.f55190 != z3) {
                it = this.f49963.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4993) it.next()).mo11562();
                }
            }
        }
        list2 = list;
        c2398M14400 = this.f49981.m14400();
        i5 = 0;
        while (i5 < list2.size()) {
            c0987 = (C0987) list2.get(i5);
            List list5 = list2;
            while (i6 < c0987.m3789()) {
                c0987.m3793(i6).mo3146(c2398M14400);
            }
            i5++;
            list2 = list5;
        }
        this.f49981 = c2398M14400.m7308();
        C5221 c5221M36789 = m36786();
        zEquals = c5221M36789.equals(this.f50002);
        this.f50002 = c5221M36789;
        if (c17341.f55193 != c17340.f55193) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c17341.f55180 != c17340.f55180) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            m36788();
        } else {
            m36788();
        }
        if (c17341.f55185 != c17340.f55185) {
            z6 = true;
        } else {
            z6 = false;
        }
        c20060 = this.f50014;
        if (!zEquals2) {
            c20060.m45425(0, new InterfaceC7359() { // from class: l.ܺ֡ۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj6) {
                    ((InterfaceC19333) obj6).mo2610(c17340.f55191, i);
                }
            });
        }
        if (z) {
            final C8750 c8750M36754 = m36751(i2, c17341, i3);
            iMo25810 = mo25810();
            if (this.f49968.f55191.m38828()) {
                C17340 c17345 = this.f49968;
                Object obj6 = c17345.f55179.f49778;
                c17345.f55191.mo38826(obj6, c20039);
                iMo14959 = this.f49968.f55191.mo14959(obj6);
                obj = this.f49968.f55191.mo14810(iMo25810, c0282, 0L).f1591;
                c136810 = c0282.f1594;
                obj2 = obj6;
            } else {
                obj = null;
                c136810 = null;
                obj2 = null;
                iMo14959 = -1;
            }
            jM41856 = C17983.m41856(j);
            if (this.f49968.f55179.m36576()) {
                jM41857 = C17983.m41856(m36746(this.f49968));
            } else {
                jM41857 = jM41856;
            }
            C15274 c15279 = this.f49968.f55179;
            final C8750 c8753 = new C8750(obj, iMo25810, c136810, obj2, iMo14959, jM41856, jM41857, c15279.f49779, c15279.f49782);
            c20060.m45425(11, new InterfaceC7359() { // from class: l.ۢ֡ۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj7) {
                    InterfaceC19333 interfaceC19333 = (InterfaceC19333) obj7;
                    interfaceC19333.getClass();
                    interfaceC19333.mo2580(i2, c8750M36754, c8753);
                }
            });
        } else {
            z5 = z5;
            z6 = z6;
        }
        if (zBooleanValue) {
            c20060.m45425(1, new InterfaceC7359() { // from class: l.ۗ֡ۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj7) {
                    ((InterfaceC19333) obj7).mo2606(c13689, iIntValue);
                }
            });
        }
        c2171 = c2170;
        if (c17341.f55186 != c2171) {
            c20060.m45425(10, new InterfaceC7359() { // from class: l.ۙܽۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj7) {
                    ((InterfaceC19333) obj7).mo2636(c17340.f55186);
                }
            });
            if (c2171 != null) {
                c20060.m45425(10, new InterfaceC7359() { // from class: l.ܰܽۙ
                    @Override // l.InterfaceC7359
                    public final void invoke(Object obj7) {
                        ((InterfaceC19333) obj7).mo2609(c17340.f55186);
                    }
                });
            }
        }
        c10087 = c17341.f55181;
        c10088 = c17340.f55181;
        if (c10087 != c10088) {
            this.f50001.mo22493(c10088.f34441);
            c20060.m45425(2, new InterfaceC7359() { // from class: l.ᩴ֡ۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj7) {
                    ((InterfaceC19333) obj7).mo2601(c17340.f55181.f34442);
                }
            });
        }
        if (!zEquals) {
            c20060.m45425(14, new C0392(this.f50002));
        }
        if (z6) {
            c20060.m45425(3, new InterfaceC7359() { // from class: l.۠֡ۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj7) {
                    InterfaceC19333 interfaceC19333 = (InterfaceC19333) obj7;
                    C17340 c17346 = c17340;
                    boolean z8 = c17346.f55185;
                    interfaceC19333.getClass();
                    interfaceC19333.mo2573(c17346.f55185);
                }
            });
        }
        if (z5) {
            c20060.m45425(-1, new InterfaceC7359() { // from class: l.᩵֡ۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj7) {
                    C17340 c17346 = c17340;
                    ((InterfaceC19333) obj7).mo2628(c17346.f55180, c17346.f55193);
                }
            });
        } else {
            c20060.m45425(-1, new InterfaceC7359() { // from class: l.᩵֡ۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj7) {
                    C17340 c17346 = c17340;
                    ((InterfaceC19333) obj7).mo2628(c17346.f55180, c17346.f55193);
                }
            });
        }
        if (z5) {
            c20060.m45425(4, new InterfaceC7359() { // from class: l.ۡ֡ۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj7) {
                    ((InterfaceC19333) obj7).mo2617(c17340.f55180);
                }
            });
        }
        if (z4 == 0) {
            c20060.m45425(5, new InterfaceC7359() { // from class: l.ۧ֡ۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj7) {
                    C17340 c17346 = c17340;
                    ((InterfaceC19333) obj7).mo2588(c17346.f55175, c17346.f55193);
                }
            });
        } else {
            c20060.m45425(5, new InterfaceC7359() { // from class: l.ۧ֡ۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj7) {
                    C17340 c17346 = c17340;
                    ((InterfaceC19333) obj7).mo2588(c17346.f55175, c17346.f55193);
                }
            });
        }
        if (c17341.f55194 != c17340.f55194) {
            c20060.m45425(6, new InterfaceC7359() { // from class: l.᩻֡ۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj7) {
                    ((InterfaceC19333) obj7).mo2623(c17340.f55194);
                }
            });
        }
        if (c17341.m40328() != c17340.m40328()) {
            c20060.m45425(7, new InterfaceC7359() { // from class: l.ܳ֡ۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj7) {
                    ((InterfaceC19333) obj7).mo2637(c17340.m40328());
                }
            });
        }
        if (!c17341.f55177.equals(c17340.f55177)) {
            c20060.m45425(12, new InterfaceC7359() { // from class: l.֫֡ۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj7) {
                    ((InterfaceC19333) obj7).mo2614(c17340.f55177);
                }
            });
        }
        m36787();
        c20060.m45424();
        if (c17341.f55190 != z3) {
            it = this.f49963.iterator();
            while (it.hasNext()) {
                ((InterfaceC4993) it.next()).mo11562();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C8750 m36751(int i, C17340 c17340, int i2) {
        int i3;
        Object obj;
        C13689 c13689;
        Object obj2;
        int i4;
        long jM36746;
        long jM36747;
        C20039 c20039 = new C20039();
        if (c17340.f55191.m38828()) {
            i3 = i2;
            obj = null;
            c13689 = null;
            obj2 = null;
            i4 = -1;
        } else {
            Object obj3 = c17340.f55179.f49778;
            c17340.f55191.mo38826(obj3, c20039);
            int i5 = c20039.f64168;
            int iMo14959 = c17340.f55191.mo14959(obj3);
            Object obj4 = c17340.f55191.mo14810(i5, this.f73340, 0L).f1591;
            obj2 = obj3;
            i3 = i5;
            i4 = iMo14959;
            c13689 = this.f73340.f1594;
            obj = obj4;
        }
        if (i == 0) {
            if (c17340.f55179.m36576()) {
                C15274 c15274 = c17340.f55179;
                jM36746 = c20039.m45387(c15274.f49779, c15274.f49782);
                jM36747 = m36746(c17340);
            } else {
                if (c17340.f55179.f49781 != -1) {
                    jM36746 = m36746(this.f49968);
                } else {
                    jM36746 = c20039.f64171 + c20039.f64173;
                }
                jM36747 = jM36746;
            }
        } else if (c17340.f55179.m36576()) {
            jM36746 = c17340.f55192;
            jM36747 = m36746(c17340);
        } else {
            jM36746 = c20039.f64171 + c17340.f55192;
            jM36747 = jM36746;
        }
        long jM41856 = C17983.m41856(jM36746);
        long jM41857 = C17983.m41856(jM36747);
        C15274 c15275 = c17340.f55179;
        return new C8750(obj, i3, c13689, obj2, i4, jM41856, jM41857, c15275.f49779, c15275.f49782);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static long m36746(C17340 c17340) {
        C0282 c0282 = new C0282();
        C20039 c20039 = new C20039();
        c17340.f55191.mo38826(c17340.f55179.f49778, c20039);
        long j = c17340.f55189;
        if (j == -9223372036854775807L) {
            return c17340.f55191.mo14810(c20039.f64168, c0282, 0L).f1582;
        }
        return c20039.f64171 + j;
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    private void m36787() {
        C18627 c18627 = this.f49969;
        String str = C17983.f57504;
        C15348 c15348 = (C15348) this.f49988;
        boolean zMo25811 = c15348.mo25811();
        boolean zM49969 = c15348.m49969();
        boolean zM49968 = c15348.m49968();
        boolean zM49964 = c15348.m49964();
        boolean zM49967 = c15348.m49967();
        boolean zM49965 = c15348.m49965();
        boolean zM38828 = c15348.mo25828().m38828();
        C17921 c17921 = new C17921();
        c17921.m41612(this.f49984);
        boolean z = !zMo25811;
        c17921.m41611(4, z);
        boolean z2 = false;
        c17921.m41611(5, zM49969 && !zMo25811);
        c17921.m41611(6, zM49968 && !zMo25811);
        c17921.m41611(7, !zM38828 && (zM49968 || !zM49967 || zM49969) && !zMo25811);
        c17921.m41611(8, zM49964 && !zMo25811);
        c17921.m41611(9, !zM38828 && (zM49964 || (zM49967 && zM49965)) && !zMo25811);
        c17921.m41611(10, z);
        c17921.m41611(11, zM49969 && !zMo25811);
        if (zM49969 && !zMo25811) {
            z2 = true;
        }
        c17921.m41611(12, z2);
        C18627 c18627M41609 = c17921.m41609();
        this.f49969 = c18627M41609;
        if (c18627M41609.equals(c18627)) {
            return;
        }
        this.f50014.m45425(13, new InterfaceC7359() { // from class: l.ܿ֡ۙ
            @Override // l.InterfaceC7359
            public final void invoke(Object obj) {
                ((InterfaceC19333) obj).mo2612(this.f54321.f49969);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36760(ArrayList arrayList, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        C17340 c17340M36753;
        boolean z2;
        int iMo24007 = i;
        int iM36777 = m36777(this.f49968);
        long currentPosition = getCurrentPosition();
        this.f49997++;
        ArrayList arrayList2 = this.f50004;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i4 = size - 1; i4 >= 0; i4--) {
                arrayList2.remove(i4);
            }
            this.f50017 = this.f50017.mo22997(size);
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            C0406 c0406 = new C0406((InterfaceC18095) arrayList.get(i5), this.f50013);
            arrayList3.add(c0406);
            arrayList2.add(i5, new C23109(c0406.f1895, c0406.f1893));
        }
        this.f50017 = this.f50017.mo22995(arrayList3.size());
        C9580 c9580 = new C9580(arrayList2, this.f50017);
        if (!c9580.m38828() && iMo24007 >= c9580.mo19929()) {
            throw new C21053();
        }
        if (z) {
            iMo24007 = c9580.mo24007(this.f49999);
            j2 = -9223372036854775807L;
        } else {
            if (iMo24007 == -1) {
                i2 = iM36777;
            } else {
                j2 = j;
            }
            C17340 c17340M36754 = m36754(this.f49968, c9580, m36750(c9580, i2, currentPosition));
            i3 = c17340M36754.f55180;
            if (i2 != -1 && i3 != 1) {
                if (!c9580.m38828() || i2 >= c9580.mo19929()) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            }
            c17340M36753 = m36753(c17340M36754, i3);
            this.f49978.m2524(i2, C17983.m41827(currentPosition), this.f50017, arrayList3);
            if (!this.f49968.f55179.f49778.equals(c17340M36753.f55179.f49778) || this.f49968.f55191.m38828()) {
                z2 = false;
            } else {
                z2 = true;
            }
            m36773(c17340M36753, 0, z2, 4, m36780(c17340M36753), -1, false);
        }
        i2 = iMo24007;
        currentPosition = j2;
        C17340 c17340M36755 = m36754(this.f49968, c9580, m36750(c9580, i2, currentPosition));
        i3 = c17340M36755.f55180;
        if (i2 != -1) {
            if (c9580.m38828()) {
                i3 = 4;
            } else {
                i3 = 4;
            }
        }
        c17340M36753 = m36753(c17340M36755, i3);
        this.f49978.m2524(i2, C17983.m41827(currentPosition), this.f50017, arrayList3);
        if (this.f49968.f55179.f49778.equals(c17340M36753.f55179.f49778)) {
            z2 = false;
        } else {
            z2 = false;
        }
        m36773(c17340M36753, 0, z2, 4, m36780(c17340M36753), -1, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17340 m36754(C17340 c17340, AbstractC16511 abstractC16511, Pair pair) {
        long jM45387;
        C2023.m6507(abstractC16511.m38828() || pair != null);
        AbstractC16511 abstractC16512 = c17340.f55191;
        long jM36749 = m36749(c17340);
        C17340 c17340M40325 = c17340.m40325(abstractC16511);
        if (abstractC16511.m38828()) {
            C15274 c15274M40317 = C17340.m40317();
            long jM41827 = C17983.m41827(this.f50012);
            C17340 c17340M40323 = c17340M40325.m40324(c15274M40317, jM41827, jM41827, jM41827, 0L, C23679.f76611, this.f50010, AbstractC22433.of()).m40323(c15274M40317);
            c17340M40323.f55178 = c17340M40323.f55192;
            return c17340M40323;
        }
        Object obj = c17340M40325.f55179.f49778;
        boolean zEquals = obj.equals(pair.first);
        C15274 c15274 = !zEquals ? new C15274(pair.first) : c17340M40325.f55179;
        long jLongValue = ((Long) pair.second).longValue();
        long jM41828 = C17983.m41827(jM36749);
        if (!abstractC16512.m38828()) {
            jM41828 -= abstractC16512.mo38826(obj, this.f49965).f64171;
        }
        if (!zEquals || jLongValue < jM41828) {
            C2023.m6510(!c15274.m36576());
            C17340 c17340M40324 = c17340M40325.m40324(r0, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? C23679.f76611 : c17340M40325.f55184, !zEquals ? this.f50010 : c17340M40325.f55181, !zEquals ? AbstractC22433.of() : c17340M40325.f55182).m40323(c15274);
            c17340M40324.f55178 = jLongValue;
            return c17340M40324;
        }
        if (jLongValue == jM41828) {
            int iMo14959 = abstractC16511.mo14959(c17340M40325.f55176.f49778);
            if (iMo14959 != -1 && abstractC16511.mo5920(iMo14959, this.f49965, false).f64168 == abstractC16511.mo38826(c15274.f49778, this.f49965).f64168) {
                return c17340M40325;
            }
            abstractC16511.mo38826(c15274.f49778, this.f49965);
            if (c15274.m36576()) {
                jM45387 = this.f49965.m45387(c15274.f49779, c15274.f49782);
            } else {
                jM45387 = this.f49965.f64173;
            }
            C17340 c17340M40326 = c17340M40325.m40324(c15274, c17340M40325.f55192, c17340M40325.f55192, c17340M40325.f55187, jM45387 - c17340M40325.f55192, c17340M40325.f55184, c17340M40325.f55181, c17340M40325.f55182).m40323(c15274);
            c17340M40326.f55178 = jM45387;
            return c17340M40326;
        }
        C2023.m6510(!c15274.m36576());
        long jMax = Math.max(0L, c17340M40325.f55183 - (jLongValue - jM41828));
        long j = c17340M40325.f55178;
        if (c17340M40325.f55176.equals(c17340M40325.f55179)) {
            j = jLongValue + jMax;
        }
        C17340 c17340M40327 = c17340M40325.m40324(c15274, jLongValue, jLongValue, jLongValue, jMax, c17340M40325.f55184, c17340M40325.f55181, c17340M40325.f55182);
        c17340M40327.f55178 = j;
        return c17340M40327;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17340 m36753(C17340 c17340, int i) {
        C17340 c17340M40320 = c17340.m40320(i);
        return (i == 1 || i == 4) ? c17340M40320.m40327(false) : c17340M40320;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Pair m36750(AbstractC16511 abstractC16511, int i, long j) {
        if (abstractC16511.m38828()) {
            this.f50000 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f50012 = j;
            return null;
        }
        if (i == -1 || i >= abstractC16511.mo19929()) {
            i = abstractC16511.mo24007(this.f49999);
            j = C17983.m41856(abstractC16511.mo14810(i, this.f73340, 0L).f1582);
        }
        return abstractC16511.m38824(this.f73340, this.f49965, i, C17983.m41827(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14519 m36752(InterfaceC23691 interfaceC23691) {
        int iM36777 = m36777(this.f49968);
        AbstractC16511 abstractC16511 = this.f49968.f55191;
        int i = iM36777 == -1 ? 0 : iM36777;
        C22217 c22217 = this.f50020;
        C0530 c0530 = this.f49978;
        return new C14519(c0530, interfaceC23691, abstractC16511, i, c22217, c0530.m2537());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public C5221 m36786() {
        AbstractC16511 abstractC16511Mo25828 = mo25828();
        if (abstractC16511Mo25828.m38828()) {
            return this.f49981;
        }
        C13689 c13689 = abstractC16511Mo25828.mo14810(mo25810(), this.f73340, 0L).f1594;
        C2398 c2398M14400 = this.f49981.m14400();
        c2398M14400.m7312(c13689.f45156);
        return c2398M14400.m7308();
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    private void m36789() {
        C0435 c0435 = this.f50009;
        SurfaceHolderCallbackC4057 surfaceHolderCallbackC4057 = this.f49998;
        if (c0435 != null) {
            C14519 c14519M36752 = m36752((InterfaceC23691) this.f49982);
            c14519M36752.m34952(10000);
            c14519M36752.m34953((Object) null);
            c14519M36752.m34955();
            this.f50009.m2262(surfaceHolderCallbackC4057);
            this.f50009 = null;
        }
        TextureView textureView = this.f49979;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != surfaceHolderCallbackC4057) {
                C0303.m1848("SurfaceTextureListener already unset or replaced.");
            } else {
                this.f49979.setSurfaceTextureListener(null);
            }
            this.f49979 = null;
        }
        SurfaceHolder surfaceHolder = this.f50011;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(surfaceHolderCallbackC4057);
            this.f50011 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36765(C15348 c15348, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        c15348.m36759(surface);
        c15348.f49974 = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m36759(Object obj) {
        Object obj2 = this.f49962;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        boolean zM2535 = this.f49978.m2535(z ? this.f50008 : -9223372036854775807L, obj);
        if (z) {
            Object obj3 = this.f49962;
            Surface surface = this.f49974;
            if (obj3 == surface) {
                surface.release();
                this.f49974 = null;
            }
        }
        this.f49962 = obj;
        if (zM2535) {
            return;
        }
        m36761(C2170.m6757(new C16759("Detaching surface timed out."), b.d));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36758(SurfaceHolder surfaceHolder) {
        this.f49983 = false;
        this.f50011 = surfaceHolder;
        surfaceHolder.addCallback(this.f49998);
        Surface surface = this.f50011.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.f50011.getSurfaceFrame();
            m36755(surfaceFrame.width(), surfaceFrame.height());
        } else {
            m36755(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m36755(final int i, final int i2) {
        if (i == this.f49986.m14575() && i2 == this.f49986.m14574()) {
            return;
        }
        this.f49986 = new C5283(i, i2);
        this.f50014.m45429(24, new InterfaceC7359() { // from class: l.ۤ֡ۙ
            @Override // l.InterfaceC7359
            public final void invoke(Object obj) {
                ((InterfaceC19333) obj).mo2577(i, i2);
            }
        });
        m36756(2, 14, new C5283(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m36757(int i, boolean z) {
        int i2;
        if (this.f49964) {
            i2 = 4;
        } else {
            i2 = (this.f49968.f55194 != 1 || z) ? 0 : 1;
        }
        C17340 c17340M40319 = this.f49968;
        if (c17340M40319.f55193 == z && c17340M40319.f55194 == i2 && c17340M40319.f55175 == i) {
            return;
        }
        this.f49997++;
        if (c17340M40319.f55190) {
            c17340M40319 = c17340M40319.m40319();
        }
        C17340 c17340M40321 = c17340M40319.m40321(i, i2, z);
        this.f49978.m2523(i, i2, z);
        m36773(c17340M40321, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public void m36788() {
        int iMo25808 = mo25808();
        C18896 c18896 = this.f49975;
        C21718 c21718 = this.f50005;
        boolean z = false;
        if (iMo25808 != 1) {
            if (iMo25808 == 2 || iMo25808 == 3) {
                m36776();
                boolean z2 = this.f49968.f55190;
                if (mo25806() && !z2) {
                    z = true;
                }
                c21718.m48458(z);
                c18896.m43564(mo25806());
                return;
            }
            if (iMo25808 != 4) {
                throw new IllegalStateException();
            }
        }
        c21718.m48458(false);
        c18896.m43564(false);
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    private void m36776() {
        this.f50016.m49200();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f49966;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = C17983.f57504;
            Locale locale = Locale.US;
            String strM1617 = C0242.m1617("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f50015) {
                throw new IllegalStateException(strM1617);
            }
            C0303.m1852(strM1617, this.f49985 ? null : new IllegalStateException());
            this.f49985 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36756(int i, int i2, Object obj) {
        for (InterfaceC4784 interfaceC4784 : this.f49973) {
            if (i == -1 || interfaceC4784.mo13272() == i) {
                C14519 c14519M36752 = m36752((InterfaceC23691) interfaceC4784);
                c14519M36752.m34952(i2);
                c14519M36752.m34953(obj);
                c14519M36752.m34955();
            }
        }
        for (InterfaceC4784 interfaceC4785 : this.f49970) {
            if (interfaceC4785 != null && (i == -1 || interfaceC4785.mo13272() == i)) {
                C14519 c14519M36753 = m36752((InterfaceC23691) interfaceC4785);
                c14519M36753.m34952(i2);
                c14519M36753.m34953(obj);
                c14519M36753.m34955();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36763(C15348 c15348, final int i) {
        c15348.m36776();
        c15348.m36756(1, 10, Integer.valueOf(i));
        c15348.m36756(2, 10, Integer.valueOf(i));
        c15348.f50014.m45429(21, new InterfaceC7359() { // from class: l.ۛ֡ۙ
            @Override // l.InterfaceC7359
            public final void invoke(Object obj) {
                ((InterfaceC19333) obj).mo2576(i);
            }
        });
    }
}
