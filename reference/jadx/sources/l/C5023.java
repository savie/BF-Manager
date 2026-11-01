package l;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.alipay.sdk.m.y.q;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import moe.shizuku.server.IShizukuService;
import net.engio.mbassy.listener.MessageHandler;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۚ֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8VY */
/* JADX INFO: loaded from: classes3.dex */
public final class C5023 extends AbstractC14955 {

    /* JADX INFO: renamed from: ۠ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f17474;

    /* JADX INFO: renamed from: ᩴۖ, reason: not valid java name and contains not printable characters */
    public static final int[] f17475 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: ᩵ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f17476;

    /* JADX INFO: renamed from: ֡ۨ, reason: not valid java name and contains not printable characters */
    public boolean f17477;

    /* JADX INFO: renamed from: ֨ۖ, reason: not valid java name and contains not printable characters */
    public boolean f17478;

    /* JADX INFO: renamed from: ֨ۨ, reason: not valid java name and contains not printable characters */
    public int f17479;

    /* JADX INFO: renamed from: ֫ۨ, reason: not valid java name and contains not printable characters */
    public boolean f17480;

    /* JADX INFO: renamed from: ۖۖ, reason: not valid java name and contains not printable characters */
    public C4078 f17481;

    /* JADX INFO: renamed from: ۗۨ, reason: not valid java name and contains not printable characters */
    public C0789 f17482;

    /* JADX INFO: renamed from: ۘۖ, reason: not valid java name and contains not printable characters */
    public C2200 f17483;

    /* JADX INFO: renamed from: ۘۨ, reason: not valid java name and contains not printable characters */
    public C11374 f17484;

    /* JADX INFO: renamed from: ۙۖ, reason: not valid java name and contains not printable characters */
    public int f17485;

    /* JADX INFO: renamed from: ۚۖ, reason: not valid java name and contains not printable characters */
    public long f17486;

    /* JADX INFO: renamed from: ۛۨ, reason: not valid java name and contains not printable characters */
    public final long f17487;

    /* JADX INFO: renamed from: ۜۖ, reason: not valid java name and contains not printable characters */
    public List f17488;

    /* JADX INFO: renamed from: ۜۨ, reason: not valid java name and contains not printable characters */
    public boolean f17489;

    /* JADX INFO: renamed from: ۟ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f17490;

    /* JADX INFO: renamed from: ۠ۨ, reason: not valid java name and contains not printable characters */
    public Surface f17491;

    /* JADX INFO: renamed from: ۡۨ, reason: not valid java name and contains not printable characters */
    public long f17492;

    /* JADX INFO: renamed from: ۢۨ, reason: not valid java name and contains not printable characters */
    public long f17493;

    /* JADX INFO: renamed from: ۤۨ, reason: not valid java name and contains not printable characters */
    public int f17494;

    /* JADX INFO: renamed from: ۧۨ, reason: not valid java name and contains not printable characters */
    public int f17495;

    /* JADX INFO: renamed from: ۨۖ, reason: not valid java name and contains not printable characters */
    public int f17496;

    /* JADX INFO: renamed from: ۫ۨ, reason: not valid java name and contains not printable characters */
    public long f17497;

    /* JADX INFO: renamed from: ۬ۖ, reason: not valid java name and contains not printable characters */
    public int f17498;

    /* JADX INFO: renamed from: ۬ۨ, reason: not valid java name and contains not printable characters */
    public boolean f17499;

    /* JADX INFO: renamed from: ܰۖ, reason: not valid java name and contains not printable characters */
    public C13314 f17500;

    /* JADX INFO: renamed from: ܳۨ, reason: not valid java name and contains not printable characters */
    public final boolean f17501;

    /* JADX INFO: renamed from: ܶۖ, reason: not valid java name and contains not printable characters */
    public final C16313 f17502;

    /* JADX INFO: renamed from: ܶۨ, reason: not valid java name and contains not printable characters */
    public int f17503;

    /* JADX INFO: renamed from: ܺۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC19841 f17504;

    /* JADX INFO: renamed from: ܽۨ, reason: not valid java name and contains not printable characters */
    public boolean f17505;

    /* JADX INFO: renamed from: ܿۨ, reason: not valid java name and contains not printable characters */
    public final int f17506;

    /* JADX INFO: renamed from: ᩳۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC13136 f17507;

    /* JADX INFO: renamed from: ᩳۨ, reason: not valid java name and contains not printable characters */
    public C13314 f17508;

    /* JADX INFO: renamed from: ᩴۨ, reason: not valid java name and contains not printable characters */
    public final boolean f17509;

    /* JADX INFO: renamed from: ᩵ۨ, reason: not valid java name and contains not printable characters */
    public final PriorityQueue f17510;

    /* JADX INFO: renamed from: ᩶ۨ, reason: not valid java name and contains not printable characters */
    public boolean f17511;

    /* JADX INFO: renamed from: ᩷ۨ, reason: not valid java name and contains not printable characters */
    public final C13842 f17512;

    /* JADX INFO: renamed from: ᩸ۖ, reason: not valid java name and contains not printable characters */
    public final C0084 f17513;

    /* JADX INFO: renamed from: ᩸ۨ, reason: not valid java name and contains not printable characters */
    public final Context f17514;

    /* JADX INFO: renamed from: ᩹ۖ, reason: not valid java name and contains not printable characters */
    public long f17515;

    /* JADX INFO: renamed from: ᩹ۨ, reason: not valid java name and contains not printable characters */
    public int f17516;

    /* JADX INFO: renamed from: ᩺ۖ, reason: not valid java name and contains not printable characters */
    public int f17517;

    /* JADX INFO: renamed from: ᩺ۨ, reason: not valid java name and contains not printable characters */
    public int f17518;

    /* JADX INFO: renamed from: ᩻ۨ, reason: not valid java name and contains not printable characters */
    public C5283 f17519;

    @Override // l.InterfaceC4784, l.InterfaceC2667
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13947(InterfaceC13544 interfaceC13544, int i) {
        Trace.beginSection("skipVideoBuffer");
        interfaceC13544.mo30204(i);
        Trace.endSection();
        this.f48813.f42202++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13948(InterfaceC13544 interfaceC13544, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC13544.mo30197(i, j);
        Trace.endSection();
        this.f48813.f42204++;
        this.f17518 = 0;
        if (this.f17507 == null) {
            C13314 c13314 = this.f17508;
            boolean zEquals = c13314.equals(C13314.f44192);
            C13842 c13842 = this.f17512;
            if (!zEquals && !c13314.equals(this.f17500)) {
                this.f17500 = c13314;
                c13842.m33687(c13314);
            }
            if (!this.f17502.m38472() || (surface = this.f17491) == null) {
                return;
            }
            c13842.m33682(surface);
            this.f17477 = true;
        }
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo13951(long j, long j2, InterfaceC13544 interfaceC13544, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C7648 c7648) {
        interfaceC13544.getClass();
        long jM35917 = j3 - m35917();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f17510;
            Long l2 = (Long) priorityQueue.peek();
            if (l2 == null || l2.longValue() >= j3) {
                break;
            }
            i4++;
            priorityQueue.poll();
        }
        m13940(i4, 0);
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 != null) {
            if (z && !z2) {
                m13947(interfaceC13544, i);
                return true;
            }
            return interfaceC13136.mo28293(j3, new C3527(this, interfaceC13544, i, jM35917));
        }
        int iM38460 = this.f17502.m38460(j3, j, j2, m35922(), z, z2, this.f17513);
        C0084 c0084 = this.f17513;
        if (iM38460 == 0) {
            long jMo28885 = m39520().mo28885();
            InterfaceC19841 interfaceC19841 = this.f17504;
            if (interfaceC19841 != null) {
                interfaceC19841.mo2526(jM35917, jMo28885, c7648, m35914());
            }
            m13948(interfaceC13544, i, jMo28885);
            m13927(c0084.m1021());
            return true;
        }
        if (iM38460 == 1) {
            long jM1022 = c0084.m1022();
            long jM1021 = c0084.m1021();
            if (jM1022 == this.f17497) {
                m13947(interfaceC13544, i);
                jM1022 = jM1022;
            } else {
                InterfaceC19841 interfaceC19842 = this.f17504;
                if (interfaceC19842 != null) {
                    interfaceC19842.mo2526(jM35917, jM1022, c7648, m35914());
                }
                m13948(interfaceC13544, i, jM1022);
            }
            m13927(jM1021);
            this.f17497 = jM1022;
            return true;
        }
        if (iM38460 == 2) {
            Trace.beginSection("dropVideoBuffer");
            interfaceC13544.mo30204(i);
            Trace.endSection();
            m13940(0, 1);
            m13927(c0084.m1021());
            return true;
        }
        if (iM38460 == 3) {
            m13947(interfaceC13544, i);
            m13927(c0084.m1021());
            return true;
        }
        if (iM38460 == 4 || iM38460 == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iM38460));
    }

    public C5023(C13491 c13491) {
        super(2, c13491.f44588, InterfaceC21304.f69311, false, 30.0f);
        Context applicationContext = c13491.f44585.getApplicationContext();
        this.f17514 = applicationContext;
        this.f17506 = c13491.f44584;
        this.f17507 = null;
        this.f17512 = new C13842(c13491.f44587, c13491.f44590);
        this.f17501 = this.f17507 == null;
        this.f17502 = new C16313(applicationContext, this, c13491.f44586);
        this.f17513 = new C0084();
        this.f17509 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f17519 = C5283.f18286;
        this.f17496 = 1;
        this.f17479 = 0;
        this.f17508 = C13314.f44192;
        this.f17498 = 0;
        this.f17500 = null;
        this.f17485 = -1000;
        this.f17486 = -9223372036854775807L;
        this.f17493 = -9223372036854775807L;
        this.f17510 = new PriorityQueue();
        this.f17487 = -9223372036854775807L;
        this.f17490 = false;
        this.f17481 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13952(long j, long j2, boolean z, boolean z2) throws C2170 {
        int iM39523;
        if (this.f17507 != null && this.f17501) {
            j2 -= -this.f17486;
        }
        if (j >= -500000 || z || (iM39523 = m39523(j2)) == 0) {
            return false;
        }
        PriorityQueue priorityQueue = this.f17510;
        if (z2) {
            C12629 c12629 = this.f48813;
            int i = c12629.f42199 + iM39523;
            c12629.f42199 = i;
            c12629.f42202 += this.f17516;
            c12629.f42199 = priorityQueue.size() + i;
        } else {
            this.f48813.f42201++;
            m13940(priorityQueue.size() + iM39523, this.f17516);
        }
        m35929();
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 != null) {
            interfaceC13136.mo28300(false);
        }
        return true;
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo13934(InterfaceC21304 interfaceC21304, C7648 c7648) {
        boolean z;
        int i = 0;
        if (!C6632.m17982(c7648.f25265)) {
            return C13958.m33811(0, 0, 0, 0);
        }
        boolean z2 = c7648.f25271 != null;
        Context context = this.f17514;
        List listM13916 = m13916(context, interfaceC21304, c7648, z2, false);
        if (z2 && listM13916.isEmpty()) {
            listM13916 = m13916(context, interfaceC21304, c7648, false, false);
        }
        if (listM13916.isEmpty()) {
            return C13958.m33811(1, 0, 0, 0);
        }
        int i2 = c7648.f25245;
        if (i2 != 0 && i2 != 2) {
            return C13958.m33811(2, 0, 0, 0);
        }
        C5076 c5076 = (C5076) listM13916.get(0);
        boolean zM14154 = c5076.m14154(c7648);
        if (!zM14154) {
            int i3 = 1;
            while (true) {
                if (i3 >= listM13916.size()) {
                    z = true;
                    break;
                }
                C5076 c5077 = (C5076) listM13916.get(i3);
                if (c5077.m14154(c7648)) {
                    z = false;
                    zM14154 = true;
                    c5076 = c5077;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            break;
        }
        int i4 = zM14154 ? 4 : 3;
        int i5 = c5076.m14153(c7648) ? 16 : 8;
        int i6 = c5076.f17683 ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(c7648.f25265) && !C4317.m12142(context)) {
            i7 = 256;
        }
        if (zM14154) {
            List listM13917 = m13916(context, interfaceC21304, c7648, z2, true);
            if (!listM13917.isEmpty()) {
                C5076 c5078 = (C5076) C19894.m45159(listM13917, c7648).get(0);
                if (c5078.m14154(c7648) && c5078.m14153(c7648)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList mo13935(InterfaceC21304 interfaceC21304, C7648 c7648, boolean z) {
        return C19894.m45159(m13916(this.f17514, interfaceC21304, c7648, z, this.f17478), c7648);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m13916(Context context, InterfaceC21304 interfaceC21304, C7648 c7648, boolean z, boolean z2) {
        List listMo43763;
        String str = c7648.f25265;
        if (str == null) {
            return AbstractC22433.of();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !C4317.m12142(context)) {
            String strM45158 = C19894.m45158(c7648);
            if (strM45158 == null) {
                listMo43763 = AbstractC22433.of();
            } else {
                listMo43763 = interfaceC21304.mo43763(strM45158, z, z2);
            }
            if (!listMo43763.isEmpty()) {
                return listMo43763;
            }
        }
        return C19894.m45162(interfaceC21304, c7648, z, z2);
    }

    @Override // l.AbstractC14955, l.AbstractC16862
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13949(boolean z, boolean z2) {
        super.mo13949(z, z2);
        boolean z3 = m39529().f18886;
        C2023.m6510((z3 && this.f17498 == 0) ? false : true);
        if (this.f17478 != z3) {
            this.f17478 = z3;
            m35933();
        }
        this.f17512.m33689(this.f48813);
        boolean z4 = this.f17511;
        C16313 c16313 = this.f17502;
        if (!z4) {
            if (this.f17488 != null && this.f17507 == null) {
                C3611 c3611 = new C3611(this.f17514, c16313);
                c3611.m10706();
                c3611.m10705(m39520());
                C9963 c9963M10704 = c3611.m10704();
                c9963M10704.m25219();
                this.f17507 = c9963M10704.m25224();
            }
            this.f17511 = true;
        }
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 == null) {
            c16313.m38465(m39520());
            c16313.m38463(!z2 ? 1 : 0);
            return;
        }
        interfaceC13136.mo28290(new C9879(this), C5978.m16274());
        InterfaceC19841 interfaceC19841 = this.f17504;
        if (interfaceC19841 != null) {
            this.f17507.mo28292(interfaceC19841);
        }
        if (this.f17491 != null && !this.f17519.equals(C5283.f18286)) {
            this.f17507.mo28288(this.f17491, this.f17519);
        }
        this.f17507.mo28285(this.f17479);
        this.f17507.mo28284(m35936());
        List list = this.f17488;
        if (list != null) {
            this.f17507.mo28289(list);
        }
        this.f17495 = !z2 ? 1 : 0;
        m35919();
    }

    @Override // l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ۬ */
    public final void mo13266() {
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 != null) {
            int i = this.f17495;
            if (i == 0 || i == 1) {
                this.f17495 = 0;
                return;
            } else {
                interfaceC13136.mo28299();
                return;
            }
        }
        this.f17502.m38461();
    }

    @Override // l.AbstractC14955, l.AbstractC16862
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13950(C7648[] c7648Arr, long j, long j2, C15274 c15274) {
        super.mo13950(c7648Arr, j, j2, c15274);
        AbstractC16511 abstractC16511M39527 = m39527();
        if (!abstractC16511M39527.m38828()) {
            c15274.getClass();
            this.f17493 = abstractC16511M39527.mo38826(c15274.f49778, new C20039()).f64173;
        } else {
            this.f17493 = -9223372036854775807L;
        }
    }

    @Override // l.AbstractC14955, l.AbstractC16862
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13942(long j, boolean z) throws C2170 {
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 != null && !z) {
            interfaceC13136.mo28300(true);
        }
        super.mo13942(j, z);
        InterfaceC13136 interfaceC13137 = this.f17507;
        C16313 c16313 = this.f17502;
        if (interfaceC13137 == null) {
            c16313.m38467();
        }
        if (z) {
            InterfaceC13136 interfaceC13138 = this.f17507;
            if (interfaceC13138 != null) {
                interfaceC13138.mo28298(false);
            } else {
                c16313.m38471(false);
            }
        }
        m13926();
        this.f17518 = 0;
    }

    @Override // l.AbstractC14955, l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13268() {
        if (!super.mo13268()) {
            return false;
        }
        InterfaceC13136 interfaceC13136 = this.f17507;
        return interfaceC13136 == null || interfaceC13136.mo28301();
    }

    @Override // l.AbstractC14955, l.InterfaceC4784
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo13264() {
        boolean zMo13264 = super.mo13264();
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 != null) {
            return interfaceC13136.mo28295(zMo13264);
        }
        if (zMo13264 && (m35926() == null || this.f17478)) {
            return true;
        }
        return this.f17502.m38466(zMo13264);
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void mo13956() {
        this.f17494 = 0;
        this.f17492 = m39520().mo28888();
        this.f17515 = 0L;
        this.f17517 = 0;
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 != null) {
            interfaceC13136.mo28297();
        } else {
            this.f17502.m38468();
        }
    }

    @Override // l.AbstractC14955, l.AbstractC16862
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo13958() {
        C13842 c13842 = this.f17512;
        this.f17500 = null;
        this.f17493 = -9223372036854775807L;
        m13926();
        this.f17477 = false;
        this.f17483 = null;
        this.f17505 = true;
        try {
            super.mo13958();
        } finally {
            c13842.m33686(this.f48813);
            c13842.m33687(C13314.f44192);
        }
    }

    @Override // l.AbstractC14955, l.AbstractC16862
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13928() {
        try {
            super.mo13928();
        } finally {
            this.f17511 = false;
            this.f17486 = -9223372036854775807L;
            C0789 c0789 = this.f17482;
            if (c0789 != null) {
                c0789.release();
                this.f17482 = null;
            }
        }
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo13967() {
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 == null || !this.f17501) {
            return;
        }
        interfaceC13136.mo28283();
    }

    @Override // l.AbstractC14955, l.AbstractC16862, l.InterfaceC23691
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13941(int i, Object obj) throws C2170 {
        if (i == 1) {
            m13917(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            InterfaceC19841 interfaceC19841 = (InterfaceC19841) obj;
            this.f17504 = interfaceC19841;
            InterfaceC13136 interfaceC13136 = this.f17507;
            if (interfaceC13136 != null) {
                interfaceC13136.mo28292(interfaceC19841);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f17498 != iIntValue) {
                this.f17498 = iIntValue;
                if (this.f17478) {
                    m35933();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            this.f17496 = ((Integer) obj).intValue();
            InterfaceC13544 interfaceC13544M35926 = m35926();
            if (interfaceC13544M35926 != null) {
                interfaceC13544M35926.mo30195(this.f17496);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f17479 = iIntValue2;
            InterfaceC13136 interfaceC13137 = this.f17507;
            if (interfaceC13137 != null) {
                interfaceC13137.mo28285(iIntValue2);
                return;
            } else {
                this.f17502.m38470(iIntValue2);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(InterfaceC5552.f19057)) {
                InterfaceC13136 interfaceC13138 = this.f17507;
                if (interfaceC13138 == null || !interfaceC13138.isInitialized()) {
                    return;
                }
                this.f17507.mo28281();
                return;
            }
            this.f17488 = list;
            InterfaceC13136 interfaceC13139 = this.f17507;
            if (interfaceC13139 != null) {
                interfaceC13139.mo28289(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            C5283 c5283 = (C5283) obj;
            if (c5283.m14575() == 0 || c5283.m14574() == 0) {
                return;
            }
            this.f17519 = c5283;
            InterfaceC13136 interfaceC131310 = this.f17507;
            if (interfaceC131310 != null) {
                Surface surface = this.f17491;
                C2023.m6508(surface);
                interfaceC131310.mo28288(surface, c5283);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.f17485 = ((Integer) obj).intValue();
                InterfaceC13544 interfaceC13544M35927 = m35926();
                if (interfaceC13544M35927 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f17485));
                    interfaceC13544M35927.mo30199(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.f17491;
                m13917((Object) null);
                obj.getClass();
                ((C5023) obj).mo13941(1, surface2);
                break;
            case 18:
                C4078 c4078 = this.f17481;
                boolean z = c4078 != null && c4078.f14989;
                C4078 c4079 = (C4078) obj;
                this.f17481 = c4079;
                if (z != (c4079 != null && c4079.f14989)) {
                    m35913();
                }
                break;
            default:
                super.mo13941(i, obj);
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13917(Object obj) throws C2170 {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f17491;
        C13842 c13842 = this.f17512;
        if (surface2 == surface) {
            if (surface != null) {
                C13314 c13314 = this.f17500;
                if (c13314 != null) {
                    c13842.m33687(c13314);
                }
                Surface surface3 = this.f17491;
                if (surface3 == null || !this.f17477) {
                    return;
                }
                c13842.m33682(surface3);
                return;
            }
            return;
        }
        this.f17491 = surface;
        InterfaceC13136 interfaceC13136 = this.f17507;
        C16313 c16313 = this.f17502;
        if (interfaceC13136 == null) {
            c16313.m38464(surface);
        }
        this.f17477 = false;
        int state = getState();
        InterfaceC13544 interfaceC13544M35926 = m35926();
        if (interfaceC13544M35926 != null && this.f17507 == null) {
            C5076 c5076M35916 = m35916();
            c5076M35916.getClass();
            boolean zM13913 = m13913(c5076M35916);
            int i = Build.VERSION.SDK_INT;
            if (i >= 23 && zM13913 && !this.f17489) {
                Surface surfaceM13921 = m13921(c5076M35916);
                if (i >= 23 && surfaceM13921 != null) {
                    interfaceC13544M35926.mo30200(surfaceM13921);
                } else {
                    if (i < 35) {
                        throw new IllegalStateException();
                    }
                    interfaceC13544M35926.mo30203();
                }
            } else {
                m35933();
                m35932();
            }
        }
        if (surface == null) {
            this.f17500 = null;
            InterfaceC13136 interfaceC13137 = this.f17507;
            if (interfaceC13137 != null) {
                interfaceC13137.mo28302();
            }
        } else {
            C13314 c13315 = this.f17500;
            if (c13315 != null) {
                c13842.m33687(c13315);
            }
        }
        if (state == 2) {
            InterfaceC13136 interfaceC13138 = this.f17507;
            if (interfaceC13138 != null) {
                interfaceC13138.mo28298(true);
            } else {
                c16313.m38471(true);
            }
        }
        m13926();
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo13953(C5076 c5076) {
        return m13913(c5076);
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo13966() {
        return this.f17478 && Build.VERSION.SDK_INT < 23;
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1735 mo13936(C5076 c5076, C7648 c7648, MediaCrypto mediaCrypto, float f) {
        C4119 c4119;
        int i;
        C11374 c11374;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z;
        int iM13914;
        String str = c5076.f17685;
        C7648[] c7648ArrM39526 = m39526();
        int i2 = c7648.f25246;
        float f2 = c7648.f25273;
        C4119 c41110 = c7648.f25239;
        int i3 = c7648.f25253;
        int iM13923 = m13923(c5076, c7648);
        if (c7648ArrM39526.length == 1) {
            if (iM13923 != -1 && (iM13914 = m13914(c5076, c7648)) != -1) {
                iM13923 = Math.min((int) (iM13923 * 1.5f), iM13914);
            }
            c11374 = new C11374(i2, i3, iM13923);
            c4119 = c41110;
            i = i3;
        } else {
            int length = c7648ArrM39526.length;
            int i4 = 0;
            boolean z2 = false;
            int iMax = i2;
            int iMax2 = i3;
            while (i4 < length) {
                int i5 = length;
                C7648 c7648M26497 = c7648ArrM39526[i4];
                C7648[] c7648Arr = c7648ArrM39526;
                if (c41110 != null && c7648M26497.f25239 == null) {
                    C10471 c10471M20201 = c7648M26497.m20201();
                    c10471M20201.m26505(c41110);
                    c7648M26497 = c10471M20201.m26497();
                }
                C17567 c17567M14150 = c5076.m14150(c7648, c7648M26497);
                int i6 = c7648M26497.f25253;
                if (c17567M14150.f55818 != 0) {
                    int i7 = c7648M26497.f25246;
                    boolean z3 = i7 == -1 || i6 == -1;
                    iMax = Math.max(iMax, i7);
                    iMax2 = Math.max(iMax2, i6);
                    iM13923 = Math.max(iM13923, m13923(c5076, c7648M26497));
                    z2 = z3 | z2;
                }
                i4++;
                length = i5;
                c7648ArrM39526 = c7648Arr;
                c41110 = c41110;
            }
            c4119 = c41110;
            if (z2) {
                C0303.m1848("Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z4 = i3 > i2;
                int i8 = z4 ? i3 : i2;
                int i9 = z4 ? i2 : i3;
                float f3 = i9 / i8;
                int i10 = 0;
                while (true) {
                    if (i10 < 9) {
                        int i11 = f17475[i10];
                        i = i3;
                        int i12 = (int) (i11 * f3);
                        if (i11 > i8 && i12 > i9) {
                            if (z4) {
                                i11 = i12;
                            }
                            if (z4) {
                                i12 = i11;
                            }
                            boolean z5 = z4;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = c5076.f17687;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point = new Point(C17983.m41812(i11, widthAlignment) * widthAlignment, C17983.m41812(i12, heightAlignment) * heightAlignment);
                            }
                            if (point != null && c5076.m14151(point.x, point.y, f2)) {
                                break;
                            }
                            i10++;
                            i3 = i;
                            z4 = z5;
                            i8 = i8;
                            i9 = i9;
                        }
                    } else {
                        i = i3;
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    C10471 c10471M20202 = c7648.m20201();
                    c10471M20202.m26525(iMax);
                    c10471M20202.m26534(iMax2);
                    iM13923 = Math.max(iM13923, m13914(c5076, c10471M20202.m26497()));
                    C0303.m1848("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                i = i3;
            }
            c11374 = new C11374(iMax, iMax2, iM13923);
        }
        this.f17484 = c11374;
        int i13 = this.f17478 ? this.f17498 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        C17237.m40176(mediaFormat, c7648.f25268);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        C17237.m40175(mediaFormat, "rotation-degrees", c7648.f25248);
        C17237.m40177(mediaFormat, c4119);
        if ("video/dolby-vision".equals(c7648.f25265)) {
            int i14 = C19894.f63785;
            Pair pairM7349 = C2419.m7349(c7648);
            if (pairM7349 != null) {
                C17237.m40175(mediaFormat, "profile", ((Integer) pairM7349.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", c11374.f38357);
        mediaFormat.setInteger("max-height", c11374.f38356);
        C17237.m40175(mediaFormat, "max-input-size", c11374.f38358);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 23) {
            mediaFormat.setInteger(MessageHandler.Properties.Priority, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.f17509) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i13 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i13);
        }
        if (i15 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f17485));
        }
        Surface surfaceM13921 = m13921(c5076);
        if (this.f17507 != null && !C17983.m41862(this.f17514)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return C1735.m5750(c5076, mediaFormat, c7648, surfaceM13921, mediaCrypto);
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17567 mo13938(C5076 c5076, C7648 c7648, C7648 c7649) {
        C17567 c17567M14150 = c5076.m14150(c7648, c7649);
        int i = c17567M14150.f55820;
        C11374 c11374 = this.f17484;
        c11374.getClass();
        if (c7649.f25246 > c11374.f38357 || c7649.f25253 > c11374.f38356) {
            i |= 256;
        }
        if (m13923(c5076, c7649) > c11374.f38358) {
            i |= 64;
        }
        int i2 = i;
        return new C17567(c5076.f17691, c7648, c7649, i2 != 0 ? 0 : c17567M14150.f55818, i2);
    }

    @Override // l.AbstractC14955, l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public final void mo13260(long j, long j2) throws C2170 {
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 != null) {
            try {
                interfaceC13136.mo28287(j, j2);
            } catch (C1140 e) {
                throw m39516(e, e.f5133, 7001);
            }
        }
        super.mo13260(j, j2);
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final void mo13957() {
        super.mo13957();
        this.f17510.clear();
        this.f17516 = 0;
        this.f17503 = 0;
        this.f17505 = false;
    }

    @Override // l.AbstractC14955, l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public final void mo13257(float f, float f2) throws C2170 {
        super.mo13257(f, f2);
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 != null) {
            interfaceC13136.mo28284(f);
        } else {
            this.f17502.m38469(f);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m13914(C5076 c5076, C7648 c7648) {
        int i = c7648.f25246;
        int i2 = c7648.f25253;
        if (i != -1 && i2 != -1) {
            String str = c7648.f25265;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                int i3 = C19894.f63785;
                Pair pairM7349 = C2419.m7349(c7648);
                if (pairM7349 == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairM7349.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i * i2) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !c5076.f17688)))) {
                        return ((C17983.m41812(i2, 16) * C17983.m41812(i, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float mo13932(float f, C7648 c7648, C7648[] c7648Arr) {
        C5076 c5076M35916;
        float fMax = -1.0f;
        for (C7648 c7649 : c7648Arr) {
            float f2 = c7649.f25273;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : f * fMax;
        if (this.f17481 == null || (c5076M35916 = m35916()) == null) {
            return f3;
        }
        float fM14149 = c5076M35916.m14149(c7648.f25246, c7648.f25253);
        return f3 != -1.0f ? Math.max(f3, fM14149) : fM14149;
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo13960(C7648 c7648) throws C2170 {
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 == null || interfaceC13136.isInitialized()) {
            return true;
        }
        try {
            return this.f17507.mo28294(c7648);
        } catch (C1140 e) {
            throw m39516(e, c7648, 7000);
        }
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13945(String str, long j, long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        this.f17512.m33684(str, j, j2);
        this.f17489 = m13925(str);
        C5076 c5076M35916 = m35916();
        c5076M35916.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(c5076M35916.f17684)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c5076M35916.f17687;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.f17499 = z;
        m13926();
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13944(String str) {
        this.f17512.m33683(str);
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13943(Exception exc) {
        C0303.m1854("Video codec error", exc);
        this.f17512.m33681(exc);
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo13964() {
        C5076 c5076M35916 = m35916();
        if (this.f17507 != null && c5076M35916 != null) {
            String str = c5076M35916.f17691;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.mo13964();
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo13963() {
        C7648 c7648M35921 = m35921();
        C4078 c4078 = this.f17481;
        if (c4078 == null || !c4078.f14990 || this.f17505 || this.f17478) {
            return true;
        }
        return (c7648M35921 != null && c7648M35921.f25270 > 0) || m35935() || m35927() != -9223372036854775807L;
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17567 mo13939(C12526 c12526) throws C2170 {
        C17567 c17567Mo13939 = super.mo13939(c12526);
        C7648 c7648 = c12526.f41899;
        c7648.getClass();
        this.f17512.m33685(c7648, c17567Mo13939);
        return c17567Mo13939;
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo13959(C16033 c16033) {
        this.f17503 = 0;
        int iMo13933 = mo13933(c16033);
        int i = Build.VERSION.SDK_INT;
        if ((i < 34 || (iMo13933 & 32) == 0) && !this.f17478) {
            this.f17516++;
        }
        if (i >= 23 || !this.f17478) {
            return;
        }
        m13965(c16033.f51910);
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo13933(C16033 c16033) {
        C4078 c4078;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f17490 || (((c4078 = this.f17481) != null && c4078.f14991) || this.f17478)) && c16033.f51910 < m39528() && !m13920(c16033)) ? 32 : 0;
        }
        return 0;
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo13930(C16033 c16033) {
        boolean z = false;
        if (!m13920(c16033)) {
            boolean z2 = c16033.f51910 < m39528();
            if (z2 && !c16033.m42268()) {
                if (c16033.m42271()) {
                    c16033.mo7();
                    z = true;
                }
                if (z) {
                    if (z2) {
                        this.f48813.f42199++;
                        return z;
                    }
                    this.f17510.add(Long.valueOf(c16033.f51910));
                    this.f17503++;
                }
                return z;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m13920(C16033 c16033) {
        if (mo13253() || c16033.m42272() || this.f17493 == -9223372036854775807L) {
            return true;
        }
        return this.f17493 - (c16033.f51910 - m35917()) <= 100000;
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13946(C7648 c7648, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        int i;
        int i2;
        InterfaceC13544 interfaceC13544M35926 = m35926();
        if (interfaceC13544M35926 != null) {
            interfaceC13544M35926.mo30195(this.f17496);
        }
        if (!this.f17478) {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i3 = integer;
            i = integer2;
            i2 = i3;
        } else {
            i2 = c7648.f25246;
            i = c7648.f25253;
        }
        float f = c7648.f25241;
        int i4 = c7648.f25248;
        if (i4 == 90 || i4 == 270) {
            f = 1.0f / f;
            int i5 = i;
            i = i2;
            i2 = i5;
        }
        this.f17508 = new C13314(i2, i, f);
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 != null && this.f17480) {
            C10471 c10471M20201 = c7648.m20201();
            c10471M20201.m26525(i2);
            c10471M20201.m26534(i);
            c10471M20201.m26519(f);
            C7648 c7648M26497 = c10471M20201.m26497();
            int i6 = this.f17495;
            List listOf = this.f17488;
            if (listOf == null) {
                listOf = AbstractC22433.of();
            }
            interfaceC13136.mo28291(c7648M26497, m35922(), i6, listOf);
            this.f17495 = 2;
        } else {
            this.f17502.m38462(c7648.f25273);
        }
        this.f17480 = false;
    }

    @Override // l.AbstractC14955
    @TargetApi(29)
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo13961(C16033 c16033) {
        if (this.f17499) {
            ByteBuffer byteBuffer = c16033.f51909;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC13544 interfaceC13544M35926 = m35926();
                        interfaceC13544M35926.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC13544M35926.mo30199(bundle);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final void mo13955() {
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 != null) {
            interfaceC13136.mo28280();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m13965(long j) {
        Surface surface;
        m35920(j);
        C13314 c13314 = this.f17508;
        boolean zEquals = c13314.equals(C13314.f44192);
        C13842 c13842 = this.f17512;
        if (!zEquals && !c13314.equals(this.f17500)) {
            this.f17500 = c13314;
            c13842.m33687(c13314);
        }
        this.f48813.f42204++;
        if (this.f17502.m38472() && (surface = this.f17491) != null) {
            c13842.m33682(surface);
            this.f17477 = true;
        }
        mo13929(j);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m13922(C5023 c5023) {
        c5023.m35934();
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo13929(long j) {
        super.mo13929(j);
        if (this.f17478) {
            return;
        }
        this.f17516--;
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13954() {
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 != null) {
            interfaceC13136.mo28280();
            if (this.f17486 == -9223372036854775807L) {
                this.f17486 = m35922();
            }
            this.f17507.mo28286(-this.f17486);
        } else {
            this.f17502.m38463(2);
        }
        this.f17480 = true;
        m13926();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13940(int i, int i2) {
        int i3;
        C12629 c12629 = this.f48813;
        c12629.f42198 += i;
        int i4 = i + i2;
        c12629.f42203 += i4;
        this.f17494 += i4;
        int i5 = this.f17518 + i4;
        this.f17518 = i5;
        c12629.f42207 = Math.max(i5, c12629.f42207);
        int i6 = this.f17506;
        if (i6 <= 0 || (i3 = this.f17494) < i6 || i3 <= 0) {
            return;
        }
        long jMo28888 = m39520().mo28888();
        this.f17512.m33680(this.f17494, jMo28888 - this.f17492);
        this.f17494 = 0;
        this.f17492 = jMo28888;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m13927(long j) {
        C12629 c12629 = this.f48813;
        c12629.f42208 += j;
        c12629.f42206++;
        this.f17515 += j;
        this.f17517++;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m13913(C5076 c5076) {
        if (this.f17507 != null) {
            return true;
        }
        Surface surface = this.f17491;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && c5076.f17680) || m13962(c5076);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private Surface m13921(C5076 c5076) {
        boolean z = c5076.f17688;
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 != null) {
            return interfaceC13136.mo28296();
        }
        Surface surface = this.f17491;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && c5076.f17680) {
            return null;
        }
        C2023.m6510(m13962(c5076));
        C0789 c0789 = this.f17482;
        if (c0789 != null && c0789.f3375 != z && c0789 != null) {
            c0789.release();
            this.f17482 = null;
        }
        if (this.f17482 == null) {
            this.f17482 = C0789.m3331(this.f17514, z);
        }
        return this.f17482;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m13962(C5076 c5076) {
        if (Build.VERSION.SDK_INT < 23 || this.f17478 || m13925(c5076.f17691)) {
            return false;
        }
        return !c5076.f17688 || C0789.m3332(this.f17514);
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    private void m13926() {
        int i;
        InterfaceC13544 interfaceC13544M35926;
        if (!this.f17478 || (i = Build.VERSION.SDK_INT) < 23 || (interfaceC13544M35926 = m35926()) == null) {
            return;
        }
        this.f17483 = new C2200(this, interfaceC13544M35926);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            interfaceC13544M35926.mo30199(bundle);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m13924(C5023 c5023) {
        c5023.f17512.m33682(c5023.f17491);
        c5023.f17477 = true;
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void mo13931() {
        int i = this.f17494;
        C13842 c13842 = this.f17512;
        if (i > 0) {
            long jMo28888 = m39520().mo28888();
            c13842.m33680(this.f17494, jMo28888 - this.f17492);
            this.f17494 = 0;
            this.f17492 = jMo28888;
        }
        int i2 = this.f17517;
        if (i2 != 0) {
            c13842.m33688(i2, this.f17515);
            this.f17515 = 0L;
            this.f17517 = 0;
        }
        InterfaceC13136 interfaceC13136 = this.f17507;
        if (interfaceC13136 != null) {
            interfaceC13136.mo28282();
        } else {
            this.f17502.m38459();
        }
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2253 mo13937(IllegalStateException illegalStateException, C5076 c5076) {
        Surface surface = this.f17491;
        C2116 c2116 = new C2116(illegalStateException, c5076);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c2116;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m13923(C5076 c5076, C7648 c7648) {
        int i = c7648.f25261;
        List list = c7648.f25268;
        if (i != -1) {
            int size = list.size();
            int length = 0;
            for (int i2 = 0; i2 < size; i2++) {
                length += ((byte[]) list.get(i2)).length;
            }
            return c7648.f25261 + length;
        }
        return m13914(c5076, c7648);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x011d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0127  */
    /* JADX WARN: Code duplicated, block: B:106:0x012b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0135  */
    /* JADX WARN: Code duplicated, block: B:110:0x0139  */
    /* JADX WARN: Code duplicated, block: B:113:0x0143  */
    /* JADX WARN: Code duplicated, block: B:114:0x0147  */
    /* JADX WARN: Code duplicated, block: B:117:0x0151  */
    /* JADX WARN: Code duplicated, block: B:118:0x0155  */
    /* JADX WARN: Code duplicated, block: B:121:0x015f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0163  */
    /* JADX WARN: Code duplicated, block: B:125:0x016d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0171  */
    /* JADX WARN: Code duplicated, block: B:129:0x017b  */
    /* JADX WARN: Code duplicated, block: B:130:0x017f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0189  */
    /* JADX WARN: Code duplicated, block: B:134:0x018d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0197  */
    /* JADX WARN: Code duplicated, block: B:138:0x019b  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:153:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:157:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:161:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:162:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:169:0x0207  */
    /* JADX WARN: Code duplicated, block: B:170:0x020b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0215  */
    /* JADX WARN: Code duplicated, block: B:174:0x0219  */
    /* JADX WARN: Code duplicated, block: B:177:0x0223  */
    /* JADX WARN: Code duplicated, block: B:178:0x0227  */
    /* JADX WARN: Code duplicated, block: B:181:0x0231  */
    /* JADX WARN: Code duplicated, block: B:182:0x0235  */
    /* JADX WARN: Code duplicated, block: B:185:0x023f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0243  */
    /* JADX WARN: Code duplicated, block: B:189:0x024d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0251  */
    /* JADX WARN: Code duplicated, block: B:193:0x025b  */
    /* JADX WARN: Code duplicated, block: B:194:0x025f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0269  */
    /* JADX WARN: Code duplicated, block: B:198:0x026d  */
    /* JADX WARN: Code duplicated, block: B:201:0x0277  */
    /* JADX WARN: Code duplicated, block: B:202:0x027b  */
    /* JADX WARN: Code duplicated, block: B:205:0x0285  */
    /* JADX WARN: Code duplicated, block: B:206:0x0289  */
    /* JADX WARN: Code duplicated, block: B:209:0x0293  */
    /* JADX WARN: Code duplicated, block: B:210:0x0297  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:217:0x02af  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:221:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:226:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:229:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:230:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:234:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:238:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:241:0x0303  */
    /* JADX WARN: Code duplicated, block: B:242:0x0307  */
    /* JADX WARN: Code duplicated, block: B:245:0x0311  */
    /* JADX WARN: Code duplicated, block: B:246:0x0315  */
    /* JADX WARN: Code duplicated, block: B:249:0x031f  */
    /* JADX WARN: Code duplicated, block: B:250:0x0323  */
    /* JADX WARN: Code duplicated, block: B:253:0x032d  */
    /* JADX WARN: Code duplicated, block: B:254:0x0331  */
    /* JADX WARN: Code duplicated, block: B:257:0x033b  */
    /* JADX WARN: Code duplicated, block: B:258:0x033f  */
    /* JADX WARN: Code duplicated, block: B:261:0x0349  */
    /* JADX WARN: Code duplicated, block: B:262:0x034d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0357  */
    /* JADX WARN: Code duplicated, block: B:266:0x035b  */
    /* JADX WARN: Code duplicated, block: B:269:0x0365  */
    /* JADX WARN: Code duplicated, block: B:270:0x0369  */
    /* JADX WARN: Code duplicated, block: B:273:0x0373  */
    /* JADX WARN: Code duplicated, block: B:274:0x0377  */
    /* JADX WARN: Code duplicated, block: B:277:0x0381  */
    /* JADX WARN: Code duplicated, block: B:278:0x0385  */
    /* JADX WARN: Code duplicated, block: B:281:0x038f  */
    /* JADX WARN: Code duplicated, block: B:282:0x0393  */
    /* JADX WARN: Code duplicated, block: B:285:0x039d  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:290:0x03af  */
    /* JADX WARN: Code duplicated, block: B:293:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:294:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:297:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:298:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:302:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:305:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:306:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:309:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:313:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:314:0x0403  */
    /* JADX WARN: Code duplicated, block: B:317:0x040d  */
    /* JADX WARN: Code duplicated, block: B:318:0x0411  */
    /* JADX WARN: Code duplicated, block: B:321:0x041b  */
    /* JADX WARN: Code duplicated, block: B:322:0x041f  */
    /* JADX WARN: Code duplicated, block: B:325:0x0429  */
    /* JADX WARN: Code duplicated, block: B:326:0x042d  */
    /* JADX WARN: Code duplicated, block: B:329:0x0437  */
    /* JADX WARN: Code duplicated, block: B:330:0x043b  */
    /* JADX WARN: Code duplicated, block: B:333:0x0445  */
    /* JADX WARN: Code duplicated, block: B:334:0x0449  */
    /* JADX WARN: Code duplicated, block: B:337:0x0453  */
    /* JADX WARN: Code duplicated, block: B:338:0x0457  */
    /* JADX WARN: Code duplicated, block: B:341:0x0461  */
    /* JADX WARN: Code duplicated, block: B:342:0x0465  */
    /* JADX WARN: Code duplicated, block: B:345:0x046f  */
    /* JADX WARN: Code duplicated, block: B:346:0x0473  */
    /* JADX WARN: Code duplicated, block: B:349:0x047d  */
    /* JADX WARN: Code duplicated, block: B:350:0x0481  */
    /* JADX WARN: Code duplicated, block: B:353:0x048b  */
    /* JADX WARN: Code duplicated, block: B:354:0x048f  */
    /* JADX WARN: Code duplicated, block: B:357:0x0499  */
    /* JADX WARN: Code duplicated, block: B:358:0x049d  */
    /* JADX WARN: Code duplicated, block: B:361:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:365:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:366:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:369:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:370:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:373:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:374:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:377:0x04df  */
    /* JADX WARN: Code duplicated, block: B:378:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:381:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:382:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:385:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:386:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:389:0x0509  */
    /* JADX WARN: Code duplicated, block: B:390:0x050d  */
    /* JADX WARN: Code duplicated, block: B:393:0x0517  */
    /* JADX WARN: Code duplicated, block: B:394:0x051b  */
    /* JADX WARN: Code duplicated, block: B:397:0x0525  */
    /* JADX WARN: Code duplicated, block: B:398:0x0529  */
    /* JADX WARN: Code duplicated, block: B:401:0x0533  */
    /* JADX WARN: Code duplicated, block: B:402:0x0537  */
    /* JADX WARN: Code duplicated, block: B:405:0x0541  */
    /* JADX WARN: Code duplicated, block: B:406:0x0545  */
    /* JADX WARN: Code duplicated, block: B:409:0x054f  */
    /* JADX WARN: Code duplicated, block: B:410:0x0553  */
    /* JADX WARN: Code duplicated, block: B:413:0x055d  */
    /* JADX WARN: Code duplicated, block: B:414:0x0561  */
    /* JADX WARN: Code duplicated, block: B:417:0x056b  */
    /* JADX WARN: Code duplicated, block: B:418:0x056f  */
    /* JADX WARN: Code duplicated, block: B:421:0x0579  */
    /* JADX WARN: Code duplicated, block: B:422:0x057d  */
    /* JADX WARN: Code duplicated, block: B:425:0x0587  */
    /* JADX WARN: Code duplicated, block: B:426:0x058b  */
    /* JADX WARN: Code duplicated, block: B:429:0x0595  */
    /* JADX WARN: Code duplicated, block: B:430:0x0599  */
    /* JADX WARN: Code duplicated, block: B:433:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:434:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:437:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:438:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:441:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:445:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:446:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:449:0x05db  */
    /* JADX WARN: Code duplicated, block: B:450:0x05df  */
    /* JADX WARN: Code duplicated, block: B:453:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:454:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:457:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:458:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:461:0x0605  */
    /* JADX WARN: Code duplicated, block: B:462:0x0609  */
    /* JADX WARN: Code duplicated, block: B:465:0x0613  */
    /* JADX WARN: Code duplicated, block: B:466:0x0617  */
    /* JADX WARN: Code duplicated, block: B:469:0x0621  */
    /* JADX WARN: Code duplicated, block: B:470:0x0625  */
    /* JADX WARN: Code duplicated, block: B:473:0x062f  */
    /* JADX WARN: Code duplicated, block: B:474:0x0633  */
    /* JADX WARN: Code duplicated, block: B:477:0x063d  */
    /* JADX WARN: Code duplicated, block: B:478:0x0641  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:481:0x064b  */
    /* JADX WARN: Code duplicated, block: B:482:0x064f  */
    /* JADX WARN: Code duplicated, block: B:485:0x0659  */
    /* JADX WARN: Code duplicated, block: B:486:0x065d  */
    /* JADX WARN: Code duplicated, block: B:489:0x0667  */
    /* JADX WARN: Code duplicated, block: B:490:0x066b  */
    /* JADX WARN: Code duplicated, block: B:493:0x0675  */
    /* JADX WARN: Code duplicated, block: B:494:0x0679  */
    /* JADX WARN: Code duplicated, block: B:497:0x0683  */
    /* JADX WARN: Code duplicated, block: B:498:0x0687  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:501:0x0691  */
    /* JADX WARN: Code duplicated, block: B:502:0x0695  */
    /* JADX WARN: Code duplicated, block: B:505:0x069f  */
    /* JADX WARN: Code duplicated, block: B:506:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:509:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:510:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:513:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:514:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:517:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:518:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:521:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:522:0x06db  */
    /* JADX WARN: Code duplicated, block: B:525:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:526:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:530:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:533:0x0701  */
    /* JADX WARN: Code duplicated, block: B:534:0x0705  */
    /* JADX WARN: Code duplicated, block: B:537:0x070f  */
    /* JADX WARN: Code duplicated, block: B:538:0x0713  */
    /* JADX WARN: Code duplicated, block: B:541:0x071d  */
    /* JADX WARN: Code duplicated, block: B:542:0x0721  */
    /* JADX WARN: Code duplicated, block: B:545:0x072b  */
    /* JADX WARN: Code duplicated, block: B:546:0x072f  */
    /* JADX WARN: Code duplicated, block: B:549:0x0739  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093 A[Catch: all -> 0x08bf, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000e, B:9:0x0012, B:11:0x0019, B:667:0x08b7, B:51:0x0087, B:54:0x0093, B:98:0x010f, B:668:0x08bb), top: B:674:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:552:0x0743  */
    /* JADX WARN: Code duplicated, block: B:553:0x0747  */
    /* JADX WARN: Code duplicated, block: B:556:0x0751  */
    /* JADX WARN: Code duplicated, block: B:557:0x0755  */
    /* JADX WARN: Code duplicated, block: B:560:0x075f  */
    /* JADX WARN: Code duplicated, block: B:561:0x0763  */
    /* JADX WARN: Code duplicated, block: B:564:0x076d  */
    /* JADX WARN: Code duplicated, block: B:565:0x0771  */
    /* JADX WARN: Code duplicated, block: B:568:0x077b  */
    /* JADX WARN: Code duplicated, block: B:569:0x077f  */
    /* JADX WARN: Code duplicated, block: B:572:0x0789  */
    /* JADX WARN: Code duplicated, block: B:573:0x078d  */
    /* JADX WARN: Code duplicated, block: B:576:0x0797  */
    /* JADX WARN: Code duplicated, block: B:577:0x079b  */
    /* JADX WARN: Code duplicated, block: B:580:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:581:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:584:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:585:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:588:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:589:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:592:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:593:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:596:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:597:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:600:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:601:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:604:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:605:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:608:0x0807  */
    /* JADX WARN: Code duplicated, block: B:609:0x080b  */
    /* JADX WARN: Code duplicated, block: B:612:0x0815  */
    /* JADX WARN: Code duplicated, block: B:613:0x0819  */
    /* JADX WARN: Code duplicated, block: B:616:0x0823  */
    /* JADX WARN: Code duplicated, block: B:617:0x0827  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:620:0x0831  */
    /* JADX WARN: Code duplicated, block: B:621:0x0835  */
    /* JADX WARN: Code duplicated, block: B:624:0x083f  */
    /* JADX WARN: Code duplicated, block: B:625:0x0843  */
    /* JADX WARN: Code duplicated, block: B:628:0x084d  */
    /* JADX WARN: Code duplicated, block: B:629:0x0851  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:632:0x085a  */
    /* JADX WARN: Code duplicated, block: B:633:0x085c  */
    /* JADX WARN: Code duplicated, block: B:636:0x0865  */
    /* JADX WARN: Code duplicated, block: B:637:0x0867  */
    /* JADX WARN: Code duplicated, block: B:640:0x0870  */
    /* JADX WARN: Code duplicated, block: B:641:0x0872  */
    /* JADX WARN: Code duplicated, block: B:644:0x087b  */
    /* JADX WARN: Code duplicated, block: B:645:0x087d  */
    /* JADX WARN: Code duplicated, block: B:648:0x0886  */
    /* JADX WARN: Code duplicated, block: B:649:0x0888  */
    /* JADX WARN: Code duplicated, block: B:652:0x0891  */
    /* JADX WARN: Code duplicated, block: B:653:0x0893  */
    /* JADX WARN: Code duplicated, block: B:656:0x089c  */
    /* JADX WARN: Code duplicated, block: B:657:0x089e  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:660:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:661:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:663:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:666:0x08b6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:96:0x010b  */
    /* JADX WARN: Code duplicated, block: B:98:0x010f A[Catch: all -> 0x08bf, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000e, B:9:0x0012, B:11:0x0019, B:667:0x08b7, B:51:0x0087, B:54:0x0093, B:98:0x010f, B:668:0x08bb), top: B:674:0x000e }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m13925(String str) {
        String str2;
        byte b;
        String str3;
        byte b2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C5023.class) {
            if (!f17476) {
                int i = Build.VERSION.SDK_INT;
                byte b3 = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                if (i <= 28) {
                    String str4 = Build.DEVICE;
                    str4.getClass();
                    switch (str4.hashCode()) {
                        case -1339091551:
                            if (!str4.equals("dangal")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case -1220081023:
                            if (!str4.equals("dangalFHD")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case -1220066608:
                            if (!str4.equals("dangalUHD")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case -1012436106:
                            if (!str4.equals("oneday")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        case -760312546:
                            if (!str4.equals("aquaman")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case -64886864:
                            if (!str4.equals("magnolia")) {
                                b2 = -1;
                            } else {
                                b2 = 5;
                            }
                            break;
                        case 3415681:
                            if (!str4.equals("once")) {
                                b2 = -1;
                            } else {
                                b2 = 6;
                            }
                            break;
                        case 825323514:
                            if (!str4.equals("machuca")) {
                                b2 = -1;
                            } else {
                                b2 = 7;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        default:
                            if (i <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                str2 = Build.MODEL;
                                str2.getClass();
                                switch (str2.hashCode()) {
                                    case -349662828:
                                        if (!str2.equals("AFTJMST12")) {
                                            b = 0;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -321033677:
                                        if (!str2.equals("AFTKMST12")) {
                                            b = 1;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 2006354:
                                        if (!str2.equals("AFTA")) {
                                            b = 2;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 2006367:
                                        if (!str2.equals("AFTN")) {
                                            b = 3;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 2006371:
                                        if (!str2.equals("AFTR")) {
                                            b = 4;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 1785421873:
                                        if (!str2.equals("AFTEU011")) {
                                            b = 5;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 1785421876:
                                        if (!str2.equals("AFTEU014")) {
                                            b = 6;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 1798172390:
                                        if (!str2.equals("AFTSO001")) {
                                            b = 7;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 2119412532:
                                        if (!str2.equals("AFTEUFF014")) {
                                            b = 8;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    default:
                                        b = -1;
                                        break;
                                }
                                switch (b) {
                                    default:
                                        if (i <= 26) {
                                            str3 = Build.DEVICE;
                                            str3.getClass();
                                            switch (str3.hashCode()) {
                                                case -2144781245:
                                                    if (!str3.equals("GIONEE_SWW1609")) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -2144781185:
                                                    if (!str3.equals("GIONEE_SWW1627")) {
                                                        b3 = 1;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -2144781160:
                                                    if (!str3.equals("GIONEE_SWW1631")) {
                                                        b3 = 2;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -2097309513:
                                                    if (!str3.equals("K50a40")) {
                                                        b3 = 3;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -2022874474:
                                                    if (!str3.equals("CP8676_I02")) {
                                                        b3 = 4;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1978993182:
                                                    if (!str3.equals("NX541J")) {
                                                        b3 = 5;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1978990237:
                                                    if (!str3.equals("NX573J")) {
                                                        b3 = 6;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1936688988:
                                                    if (!str3.equals("PGN528")) {
                                                        b3 = 7;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1936688066:
                                                    if (!str3.equals("PGN610")) {
                                                        b3 = 8;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1936688065:
                                                    if (!str3.equals("PGN611")) {
                                                        b3 = 9;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1931988508:
                                                    if (!str3.equals("AquaPowerM")) {
                                                        b3 = 10;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1885099851:
                                                    if (!str3.equals("RAIJIN")) {
                                                        b3 = 11;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1696512866:
                                                    if (!str3.equals("XT1663")) {
                                                        b3 = 12;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1680025915:
                                                    if (!str3.equals("ComioS1")) {
                                                        b3 = cb.k;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1615810839:
                                                    if (!str3.equals("Phantom6")) {
                                                        b3 = cb.f77931l;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1600724499:
                                                    if (!str3.equals("pacificrim")) {
                                                        b3 = 15;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1554255044:
                                                    if (!str3.equals("vernee_M5")) {
                                                        b3 = 16;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1481772737:
                                                    if (!str3.equals("panell_dl")) {
                                                        b3 = 17;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1481772730:
                                                    if (!str3.equals("panell_ds")) {
                                                        b3 = 18;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1481772729:
                                                    if (!str3.equals("panell_dt")) {
                                                        b3 = 19;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1320080169:
                                                    if (!str3.equals("GiONEE_GBL7319")) {
                                                        b3 = 20;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1217592143:
                                                    if (!str3.equals("BRAVIA_ATV2")) {
                                                        b3 = 21;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1180384755:
                                                    if (!str3.equals("iris60")) {
                                                        b3 = 22;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1139198265:
                                                    if (!str3.equals("Slate_Pro")) {
                                                        b3 = 23;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1052835013:
                                                    if (!str3.equals("namath")) {
                                                        b3 = 24;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -993250464:
                                                    if (!str3.equals("A10-70F")) {
                                                        b3 = 25;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -993250458:
                                                    if (!str3.equals("A10-70L")) {
                                                        b3 = 26;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -965403638:
                                                    if (!str3.equals("s905x018")) {
                                                        b3 = 27;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -958336948:
                                                    if (!str3.equals("ELUGA_Ray_X")) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -879245230:
                                                    if (!str3.equals("tcl_eu")) {
                                                        b3 = 29;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -842500323:
                                                    if (!str3.equals("nicklaus_f")) {
                                                        b3 = 30;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -821392978:
                                                    if (!str3.equals("A7000-a")) {
                                                        b3 = bo.j;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -797483286:
                                                    if (!str3.equals("SVP-DTV15")) {
                                                        b3 = UTF8.S_CS3;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -794946968:
                                                    if (!str3.equals("watson")) {
                                                        b3 = PublicSuffixDatabase.EXCEPTION_MARKER;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -788334647:
                                                    if (!str3.equals("whyred")) {
                                                        b3 = 34;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -782144577:
                                                    if (!str3.equals("OnePlus5T")) {
                                                        b3 = 35;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -575125681:
                                                    if (!str3.equals("GiONEE_CBL7513")) {
                                                        b3 = 36;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -521118391:
                                                    if (!str3.equals("GIONEE_GBL7360")) {
                                                        b3 = 37;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -430914369:
                                                    if (!str3.equals("Pixi4-7_3G")) {
                                                        b3 = 38;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -290434366:
                                                    if (!str3.equals("taido_row")) {
                                                        b3 = 39;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -282781963:
                                                    if (!str3.equals("BLACK-1X")) {
                                                        b3 = 40;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -277133239:
                                                    if (!str3.equals("Z12_PRO")) {
                                                        b3 = 41;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -173639913:
                                                    if (!str3.equals("ELUGA_A3_Pro")) {
                                                        b3 = 42;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -56598463:
                                                    if (!str3.equals("woods_fn")) {
                                                        b3 = 43;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2126:
                                                    if (!str3.equals("C1")) {
                                                        b3 = 44;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2564:
                                                    if (!str3.equals("Q5")) {
                                                        b3 = 45;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2715:
                                                    if (!str3.equals("V1")) {
                                                        b3 = 46;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2719:
                                                    if (!str3.equals("V5")) {
                                                        b3 = 47;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3091:
                                                    if (!str3.equals("b5")) {
                                                        b3 = UTF8.S_P3A;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3483:
                                                    if (!str3.equals("mh")) {
                                                        b3 = 49;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 73405:
                                                    if (!str3.equals("JGZ")) {
                                                        b3 = 50;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 75537:
                                                    if (!str3.equals("M04")) {
                                                        b3 = 51;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 75739:
                                                    if (!str3.equals("M5c")) {
                                                        b3 = 52;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 76779:
                                                    if (!str3.equals("MX6")) {
                                                        b3 = 53;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 78669:
                                                    if (!str3.equals("P85")) {
                                                        b3 = 54;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 79305:
                                                    if (!str3.equals("PLE")) {
                                                        b3 = 55;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 80618:
                                                    if (!str3.equals("QX1")) {
                                                        b3 = 56;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 88274:
                                                    if (!str3.equals("Z80")) {
                                                        b3 = 57;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 98846:
                                                    if (!str3.equals("cv1")) {
                                                        b3 = 58;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 98848:
                                                    if (!str3.equals("cv3")) {
                                                        b3 = 59;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 99329:
                                                    if (!str3.equals("deb")) {
                                                        b3 = 60;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 101481:
                                                    if (!str3.equals("flo")) {
                                                        b3 = Base32Encoder.DEFAULT_PADDING;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1513190:
                                                    if (!str3.equals("1601")) {
                                                        b3 = 62;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1514184:
                                                    if (!str3.equals("1713")) {
                                                        b3 = 63;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1514185:
                                                    if (!str3.equals("1714")) {
                                                        b3 = 64;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2133089:
                                                    if (!str3.equals("F01H")) {
                                                        b3 = 65;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2133091:
                                                    if (!str3.equals("F01J")) {
                                                        b3 = 66;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2133120:
                                                    if (!str3.equals("F02H")) {
                                                        b3 = 67;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2133151:
                                                    if (!str3.equals("F03H")) {
                                                        b3 = 68;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2133182:
                                                    if (!str3.equals("F04H")) {
                                                        b3 = 69;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2133184:
                                                    if (!str3.equals("F04J")) {
                                                        b3 = 70;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2436959:
                                                    if (!str3.equals("P681")) {
                                                        b3 = 71;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2463773:
                                                    if (!str3.equals("Q350")) {
                                                        b3 = 72;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2464648:
                                                    if (!str3.equals("Q427")) {
                                                        b3 = 73;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2689555:
                                                    if (!str3.equals("XE2X")) {
                                                        b3 = 74;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3154429:
                                                    if (!str3.equals("fugu")) {
                                                        b3 = 75;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3284551:
                                                    if (!str3.equals("kate")) {
                                                        b3 = 76;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3351335:
                                                    if (!str3.equals("mido")) {
                                                        b3 = 77;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3386211:
                                                    if (!str3.equals("p212")) {
                                                        b3 = 78;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 41325051:
                                                    if (!str3.equals("MEIZU_M5")) {
                                                        b3 = 79;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 51349633:
                                                    if (!str3.equals("601LV")) {
                                                        b3 = UTF8.S_P4A;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 51350594:
                                                    if (!str3.equals("602LV")) {
                                                        b3 = 81;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 55178625:
                                                    if (!str3.equals("Aura_Note_2")) {
                                                        b3 = 82;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 61542055:
                                                    if (!str3.equals("A1601")) {
                                                        b3 = 83;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 65355429:
                                                    if (!str3.equals("E5643")) {
                                                        b3 = 84;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 66214468:
                                                    if (!str3.equals("F3111")) {
                                                        b3 = 85;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 66214470:
                                                    if (!str3.equals("F3113")) {
                                                        b3 = 86;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 66214473:
                                                    if (!str3.equals("F3116")) {
                                                        b3 = 87;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 66215429:
                                                    if (!str3.equals("F3211")) {
                                                        b3 = 88;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 66215431:
                                                    if (!str3.equals("F3213")) {
                                                        b3 = 89;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 66215433:
                                                    if (!str3.equals("F3215")) {
                                                        b3 = 90;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 66216390:
                                                    if (!str3.equals("F3311")) {
                                                        b3 = 91;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 76402249:
                                                    if (!str3.equals("PRO7S")) {
                                                        b3 = 92;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 76404105:
                                                    if (!str3.equals("Q4260")) {
                                                        b3 = 93;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 76404911:
                                                    if (!str3.equals("Q4310")) {
                                                        b3 = 94;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 80963634:
                                                    if (!str3.equals("V23GB")) {
                                                        b3 = 95;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 82882791:
                                                    if (!str3.equals("X3_HK")) {
                                                        b3 = UTF8.S_P4B;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 98715550:
                                                    if (!str3.equals("i9031")) {
                                                        b3 = 97;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 101370885:
                                                    if (!str3.equals("l5460")) {
                                                        b3 = 98;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 102844228:
                                                    if (!str3.equals("le_x6")) {
                                                        b3 = 99;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 165221241:
                                                    if (!str3.equals("A2016a40")) {
                                                        b3 = 100;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 182191441:
                                                    if (!str3.equals("CPY83_I00")) {
                                                        b3 = 101;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 245388979:
                                                    if (!str3.equals("marino_f")) {
                                                        b3 = 102;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 287431619:
                                                    if (!str3.equals("griffin")) {
                                                        b3 = 103;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 307593612:
                                                    if (!str3.equals("A7010a48")) {
                                                        b3 = 104;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 308517133:
                                                    if (!str3.equals("A7020a48")) {
                                                        b3 = 105;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 316215098:
                                                    if (!str3.equals("TB3-730F")) {
                                                        b3 = 106;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 316215116:
                                                    if (!str3.equals("TB3-730X")) {
                                                        b3 = 107;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 316246811:
                                                    if (!str3.equals("TB3-850F")) {
                                                        b3 = 108;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 316246818:
                                                    if (!str3.equals("TB3-850M")) {
                                                        b3 = 109;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 407160593:
                                                    if (!str3.equals("Pixi5-10_4G")) {
                                                        b3 = KeyFactorySpi.x25519_type;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 507412548:
                                                    if (!str3.equals("QM16XE_U")) {
                                                        b3 = KeyFactorySpi.x448_type;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 793982701:
                                                    if (!str3.equals("GIONEE_WBL5708")) {
                                                        b3 = KeyFactorySpi.Ed25519_type;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 794038622:
                                                    if (!str3.equals("GIONEE_WBL7365")) {
                                                        b3 = KeyFactorySpi.Ed448_type;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 794040393:
                                                    if (!str3.equals("GIONEE_WBL7519")) {
                                                        b3 = 114;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 835649806:
                                                    if (!str3.equals("manning")) {
                                                        b3 = 115;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 917340916:
                                                    if (!str3.equals("A7000plus")) {
                                                        b3 = 116;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 958008161:
                                                    if (!str3.equals("j2xlteins")) {
                                                        b3 = 117;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1060579533:
                                                    if (!str3.equals("panell_d")) {
                                                        b3 = 118;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1150207623:
                                                    if (!str3.equals("LS-5017")) {
                                                        b3 = 119;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1176899427:
                                                    if (!str3.equals("itel_S41")) {
                                                        b3 = 120;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1280332038:
                                                    if (!str3.equals("hwALE-H")) {
                                                        b3 = 121;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1306947716:
                                                    if (!str3.equals("EverStar_S")) {
                                                        b3 = 122;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1349174697:
                                                    if (!str3.equals("htc_e56ml_dtul")) {
                                                        b3 = 123;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1522194893:
                                                    if (!str3.equals("woods_f")) {
                                                        b3 = 124;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1691543273:
                                                    if (!str3.equals("CPH1609")) {
                                                        b3 = 125;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1691544261:
                                                    if (!str3.equals("CPH1715")) {
                                                        b3 = 126;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1709443163:
                                                    if (!str3.equals("iball8735_9806")) {
                                                        b3 = ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1865889110:
                                                    if (!str3.equals("santoni")) {
                                                        b3 = GCMSIVBlockCipher.MASK;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1906253259:
                                                    if (!str3.equals("PB2-670M")) {
                                                        b3 = 129;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1977196784:
                                                    if (!str3.equals("Infinix-X572")) {
                                                        b3 = bo.h;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2006372676:
                                                    if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                        b3 = 131;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2019281702:
                                                    if (!str3.equals("DM-01K")) {
                                                        b3 = 132;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2029784656:
                                                    if (!str3.equals("HWBLN-H")) {
                                                        b3 = 133;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2030379515:
                                                    if (!str3.equals("HWCAM-H")) {
                                                        b3 = 134;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2033393791:
                                                    if (!str3.equals("ASUS_X00AD_2")) {
                                                        b3 = 135;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2047190025:
                                                    if (!str3.equals("ELUGA_Note")) {
                                                        b3 = 136;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2047252157:
                                                    if (!str3.equals("ELUGA_Prim")) {
                                                        b3 = 137;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2048319463:
                                                    if (!str3.equals("HWVNS-H")) {
                                                        b3 = 138;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2048855701:
                                                    if (!str3.equals("HWWAS-H")) {
                                                        b3 = 139;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                default:
                                                    if (str2.equals("JSN-L21")) {
                                                    }
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case 31:
                                                case 32:
                                                case 33:
                                                case 34:
                                                case 35:
                                                case 36:
                                                case 37:
                                                case 38:
                                                case 39:
                                                case 40:
                                                case 41:
                                                case 42:
                                                case 43:
                                                case 44:
                                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                case 46:
                                                case 47:
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                case 56:
                                                case 57:
                                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                case 70:
                                                case 71:
                                                case 72:
                                                case 73:
                                                case 74:
                                                case 75:
                                                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                                case 77:
                                                case 78:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82:
                                                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                                case 84:
                                                case 85:
                                                case HRSS1373Polynomial.K /* 86 */:
                                                case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                                case 88:
                                                case 89:
                                                case 90:
                                                case 91:
                                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                case 93:
                                                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                case 95:
                                                case 96:
                                                case 97:
                                                case 98:
                                                case q.f /* 99 */:
                                                case 100:
                                                case 101:
                                                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                                case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                                case 108:
                                                case 109:
                                                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                                case 114:
                                                case 115:
                                                case 116:
                                                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                                case 118:
                                                case 119:
                                                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                                case 122:
                                                case 123:
                                                case 124:
                                                case q.h /* 125 */:
                                                case 126:
                                                case 127:
                                                case 128:
                                                case 129:
                                                case 130:
                                                case 131:
                                                case 132:
                                                case 133:
                                                case 134:
                                                case 135:
                                                case 136:
                                                case 137:
                                                case 138:
                                                case 139:
                                                    z = true;
                                                    break;
                                            }
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z = true;
                            break;
                    }
                } else if (i <= 27) {
                    str2 = Build.MODEL;
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b = -1;
                            } else {
                                b = 7;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b = -1;
                            } else {
                                b = 8;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (i <= 26) {
                                str3 = Build.DEVICE;
                                str3.getClass();
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 0;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 1;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 2;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 3;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 4;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 5;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 6;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 7;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 8;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 9;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 10;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 11;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 12;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = cb.k;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = cb.f77931l;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 15;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 16;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 17;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 18;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 19;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 20;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 21;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 22;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 23;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 24;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 25;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 26;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 27;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b3 = -1;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 29;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 30;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b3 = -1;
                                        } else {
                                            b3 = bo.j;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b3 = -1;
                                        } else {
                                            b3 = UTF8.S_CS3;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b3 = -1;
                                        } else {
                                            b3 = PublicSuffixDatabase.EXCEPTION_MARKER;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 34;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 35;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 36;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 37;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 38;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 39;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 40;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 41;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 42;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 43;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 44;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 45;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 46;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 47;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = UTF8.S_P3A;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 49;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 50;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 51;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 52;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 53;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 54;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 55;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 56;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 57;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 58;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 59;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 60;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Base32Encoder.DEFAULT_PADDING;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 62;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 63;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 64;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 65;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 66;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 67;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 68;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 69;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 70;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 71;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 72;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 73;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 74;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 75;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 76;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 77;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 78;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 79;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = UTF8.S_P4A;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 81;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 82;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 83;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 84;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 85;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 86;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 87;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 88;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 89;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 90;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 91;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 92;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 93;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 94;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 95;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b3 = -1;
                                        } else {
                                            b3 = UTF8.S_P4B;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 97;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 98;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 99;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 100;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 101;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 102;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 103;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 104;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 105;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 106;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 107;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 108;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 109;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = KeyFactorySpi.x25519_type;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b3 = -1;
                                        } else {
                                            b3 = KeyFactorySpi.x448_type;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b3 = -1;
                                        } else {
                                            b3 = KeyFactorySpi.Ed25519_type;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b3 = -1;
                                        } else {
                                            b3 = KeyFactorySpi.Ed448_type;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 114;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 115;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 116;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 117;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 118;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 119;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 120;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 121;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 122;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 123;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 124;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 125;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 126;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b3 = -1;
                                        } else {
                                            b3 = ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b3 = -1;
                                        } else {
                                            b3 = GCMSIVBlockCipher.MASK;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 129;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b3 = -1;
                                        } else {
                                            b3 = bo.h;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 131;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 132;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 133;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 134;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 135;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 136;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 137;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 138;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 139;
                                        }
                                        break;
                                    default:
                                        b3 = -1;
                                        break;
                                }
                                switch (b3) {
                                    default:
                                        if (str2.equals("JSN-L21")) {
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                    case 56:
                                    case 57:
                                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    case 84:
                                    case 85:
                                    case HRSS1373Polynomial.K /* 86 */:
                                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                    case 93:
                                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case q.f /* 99 */:
                                    case 100:
                                    case 101:
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                    case 108:
                                    case 109:
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                    case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                    case 118:
                                    case 119:
                                    case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                    case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case q.h /* 125 */:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z = true;
                            break;
                    }
                } else {
                    str2 = Build.MODEL;
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b = 3;
                            } else {
                                b = -1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b = 4;
                            } else {
                                b = -1;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b = 5;
                            } else {
                                b = -1;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b = 6;
                            } else {
                                b = -1;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b = 7;
                            } else {
                                b = -1;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b = 8;
                            } else {
                                b = -1;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (i <= 26) {
                                str3 = Build.DEVICE;
                                str3.getClass();
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b3 = 0;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b3 = 1;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b3 = 2;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b3 = 3;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b3 = 4;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b3 = 5;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b3 = 6;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b3 = 7;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b3 = 8;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b3 = 9;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b3 = 10;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b3 = 11;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b3 = 12;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b3 = cb.k;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b3 = cb.f77931l;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b3 = 15;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b3 = 16;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b3 = 17;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b3 = 18;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b3 = 19;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b3 = 20;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b3 = 21;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b3 = 22;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b3 = 23;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b3 = 24;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b3 = 25;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b3 = 26;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b3 = 27;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b3 = -1;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b3 = 29;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b3 = 30;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b3 = bo.j;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b3 = UTF8.S_CS3;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b3 = PublicSuffixDatabase.EXCEPTION_MARKER;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b3 = 34;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b3 = 35;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b3 = 36;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b3 = 37;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b3 = 38;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b3 = 39;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b3 = 40;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b3 = 41;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b3 = 42;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b3 = 43;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b3 = 44;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b3 = 45;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b3 = 46;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b3 = 47;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b3 = UTF8.S_P3A;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b3 = 49;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b3 = 50;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b3 = 51;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b3 = 52;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b3 = 53;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b3 = 54;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b3 = 55;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b3 = 56;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b3 = 57;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b3 = 58;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b3 = 59;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b3 = 60;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b3 = Base32Encoder.DEFAULT_PADDING;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b3 = 62;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b3 = 63;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b3 = 64;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b3 = 65;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b3 = 66;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b3 = 67;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b3 = 68;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b3 = 69;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b3 = 70;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b3 = 71;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b3 = 72;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b3 = 73;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b3 = 74;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b3 = 75;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b3 = 76;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b3 = 77;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b3 = 78;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b3 = 79;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b3 = UTF8.S_P4A;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b3 = 81;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b3 = 82;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b3 = 83;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b3 = 84;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b3 = 85;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b3 = 86;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b3 = 87;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b3 = 88;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b3 = 89;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b3 = 90;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b3 = 91;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b3 = 92;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b3 = 93;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b3 = 94;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b3 = 95;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b3 = UTF8.S_P4B;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b3 = 97;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b3 = 98;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b3 = 99;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b3 = 100;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b3 = 101;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b3 = 102;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b3 = 103;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b3 = 104;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b3 = 105;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b3 = 106;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b3 = 107;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b3 = 108;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b3 = 109;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b3 = KeyFactorySpi.x25519_type;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b3 = KeyFactorySpi.x448_type;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b3 = KeyFactorySpi.Ed25519_type;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b3 = KeyFactorySpi.Ed448_type;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b3 = 114;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b3 = 115;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b3 = 116;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b3 = 117;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b3 = 118;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b3 = 119;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b3 = 120;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b3 = 121;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b3 = 122;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b3 = 123;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b3 = 124;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b3 = 125;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b3 = 126;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b3 = ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b3 = GCMSIVBlockCipher.MASK;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b3 = 129;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b3 = bo.h;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b3 = 131;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b3 = 132;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b3 = 133;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b3 = 134;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b3 = 135;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b3 = 136;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b3 = 137;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b3 = 138;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b3 = 139;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    default:
                                        b3 = -1;
                                        break;
                                }
                                switch (b3) {
                                    default:
                                        if (str2.equals("JSN-L21")) {
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                    case 56:
                                    case 57:
                                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    case 84:
                                    case 85:
                                    case HRSS1373Polynomial.K /* 86 */:
                                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                    case 93:
                                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case q.f /* 99 */:
                                    case 100:
                                    case 101:
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                    case 108:
                                    case 109:
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                    case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                    case 118:
                                    case 119:
                                    case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                    case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case q.h /* 125 */:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z = true;
                            break;
                    }
                }
                f17474 = z;
                f17476 = true;
            }
        }
        return f17474;
    }
}
