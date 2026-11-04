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

/* JADX INFO: renamed from: l.᩶ܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8VY */
/* JADX INFO: loaded from: classes5.dex */
public final class C21387 extends AbstractC8454 {

    /* JADX INFO: renamed from: ۗ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f68105;

    /* JADX INFO: renamed from: ᩵᩸, reason: not valid java name and contains not printable characters */
    public static boolean f68106;

    /* JADX INFO: renamed from: ᩹᩸, reason: not valid java name and contains not printable characters */
    public static final int[] f68107 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: ֡ۤ, reason: not valid java name and contains not printable characters */
    public boolean f68108;

    /* JADX INFO: renamed from: ֨ۤ, reason: not valid java name and contains not printable characters */
    public int f68109;

    /* JADX INFO: renamed from: ֫ۤ, reason: not valid java name and contains not printable characters */
    public C4233 f68110;

    /* JADX INFO: renamed from: ֫᩸, reason: not valid java name and contains not printable characters */
    public C14673 f68111;

    /* JADX INFO: renamed from: ۖۤ, reason: not valid java name and contains not printable characters */
    public final boolean f68112;

    /* JADX INFO: renamed from: ۗۤ, reason: not valid java name and contains not printable characters */
    public Surface f68113;

    /* JADX INFO: renamed from: ۘۤ, reason: not valid java name and contains not printable characters */
    public final C24306 f68114;

    /* JADX INFO: renamed from: ۙ᩸, reason: not valid java name and contains not printable characters */
    public int f68115;

    /* JADX INFO: renamed from: ۚۤ, reason: not valid java name and contains not printable characters */
    public boolean f68116;

    /* JADX INFO: renamed from: ۚ᩸, reason: not valid java name and contains not printable characters */
    public int f68117;

    /* JADX INFO: renamed from: ۛۤ, reason: not valid java name and contains not printable characters */
    public int f68118;

    /* JADX INFO: renamed from: ۜۤ, reason: not valid java name and contains not printable characters */
    public long f68119;

    /* JADX INFO: renamed from: ۟ۤ, reason: not valid java name and contains not printable characters */
    public long f68120;

    /* JADX INFO: renamed from: ۠ۤ, reason: not valid java name and contains not printable characters */
    public boolean f68121;

    /* JADX INFO: renamed from: ۡۤ, reason: not valid java name and contains not printable characters */
    public C18303 f68122;

    /* JADX INFO: renamed from: ۢۤ, reason: not valid java name and contains not printable characters */
    public final long f68123;

    /* JADX INFO: renamed from: ۤ᩸, reason: not valid java name and contains not printable characters */
    public int f68124;

    /* JADX INFO: renamed from: ۧۤ, reason: not valid java name and contains not printable characters */
    public boolean f68125;

    /* JADX INFO: renamed from: ۧ᩸, reason: not valid java name and contains not printable characters */
    public List f68126;

    /* JADX INFO: renamed from: ۨۤ, reason: not valid java name and contains not printable characters */
    public long f68127;

    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    public int f68128;

    /* JADX INFO: renamed from: ۫᩸, reason: not valid java name and contains not printable characters */
    public boolean f68129;

    /* JADX INFO: renamed from: ۬ۤ, reason: not valid java name and contains not printable characters */
    public C0504 f68130;

    /* JADX INFO: renamed from: ܰۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC19830 f68131;

    /* JADX INFO: renamed from: ܳۤ, reason: not valid java name and contains not printable characters */
    public int f68132;

    /* JADX INFO: renamed from: ܳ᩸, reason: not valid java name and contains not printable characters */
    public long f68133;

    /* JADX INFO: renamed from: ܶۤ, reason: not valid java name and contains not printable characters */
    public C18787 f68134;

    /* JADX INFO: renamed from: ܶ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC7897 f68135;

    /* JADX INFO: renamed from: ܺۤ, reason: not valid java name and contains not printable characters */
    public int f68136;

    /* JADX INFO: renamed from: ܺ᩸, reason: not valid java name and contains not printable characters */
    public final C13117 f68137;

    /* JADX INFO: renamed from: ܽۤ, reason: not valid java name and contains not printable characters */
    public final Context f68138;

    /* JADX INFO: renamed from: ܽ᩸, reason: not valid java name and contains not printable characters */
    public final C15354 f68139;

    /* JADX INFO: renamed from: ܿۤ, reason: not valid java name and contains not printable characters */
    public boolean f68140;

    /* JADX INFO: renamed from: ᩳۤ, reason: not valid java name and contains not printable characters */
    public final int f68141;

    /* JADX INFO: renamed from: ᩴ᩸, reason: not valid java name and contains not printable characters */
    public long f68142;

    /* JADX INFO: renamed from: ᩵ۤ, reason: not valid java name and contains not printable characters */
    public final PriorityQueue f68143;

    /* JADX INFO: renamed from: ᩶ۤ, reason: not valid java name and contains not printable characters */
    public boolean f68144;

    /* JADX INFO: renamed from: ᩷᩸, reason: not valid java name and contains not printable characters */
    public C18787 f68145;

    /* JADX INFO: renamed from: ᩸᩸, reason: not valid java name and contains not printable characters */
    public C1019 f68146;

    /* JADX INFO: renamed from: ᩹ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f68147;

    /* JADX INFO: renamed from: ᩺ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f68148;

    /* JADX INFO: renamed from: ᩻ۤ, reason: not valid java name and contains not printable characters */
    public int f68149;

    /* JADX INFO: renamed from: ᩻᩸, reason: not valid java name and contains not printable characters */
    public int f68150;

    @Override // l.InterfaceC4002, l.InterfaceC18172
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48641(InterfaceC14420 interfaceC14420, int i) {
        Trace.beginSection("skipVideoBuffer");
        interfaceC14420.mo32291(i);
        Trace.endSection();
        this.f27674.f55748++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48642(InterfaceC14420 interfaceC14420, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC14420.mo32284(i, j);
        Trace.endSection();
        this.f27674.f55746++;
        this.f68149 = 0;
        if (this.f68135 == null) {
            C18787 c18787 = this.f68134;
            boolean zEquals = c18787.equals(C18787.f61010);
            C24306 c24306 = this.f68114;
            if (!zEquals && !c18787.equals(this.f68145)) {
                this.f68145 = c18787;
                c24306.m54333(c18787);
            }
            if (!this.f68137.m32590() || (surface = this.f68113) == null) {
                return;
            }
            c24306.m54328(surface);
            this.f68140 = true;
        }
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22679(long j, long j2, InterfaceC14420 interfaceC14420, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C15648 c15648) {
        interfaceC14420.getClass();
        long jM22662 = j3 - m22662();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f68143;
            Long l2 = (Long) priorityQueue.peek();
            if (l2 == null || l2.longValue() >= j3) {
                break;
            }
            i4++;
            priorityQueue.poll();
        }
        m48640(i4, 0);
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 != null) {
            if (z && !z2) {
                m48641(interfaceC14420, i);
                return true;
            }
            return interfaceC7897.mo4516(j3, new C12436(this, interfaceC14420, i, jM22662));
        }
        int iM32578 = this.f68137.m32578(j3, j, j2, m22690(), z, z2, this.f68139);
        C15354 c15354 = this.f68139;
        if (iM32578 == 0) {
            long jMo2212 = m56455().mo2212();
            InterfaceC19830 interfaceC19830 = this.f68131;
            if (interfaceC19830 != null) {
                interfaceC19830.mo24942(jM22662, jMo2212, c15648, m22692());
            }
            m48642(interfaceC14420, i, jMo2212);
            m48645(c15354.m36796());
            return true;
        }
        if (iM32578 == 1) {
            long jM36797 = c15354.m36797();
            long jM36796 = c15354.m36796();
            if (jM36797 == this.f68120) {
                m48641(interfaceC14420, i);
                jM36797 = jM36797;
            } else {
                InterfaceC19830 interfaceC19831 = this.f68131;
                if (interfaceC19831 != null) {
                    interfaceC19831.mo24942(jM22662, jM36797, c15648, m22692());
                }
                m48642(interfaceC14420, i, jM36797);
            }
            m48645(jM36796);
            this.f68120 = jM36797;
            return true;
        }
        if (iM32578 == 2) {
            Trace.beginSection("dropVideoBuffer");
            interfaceC14420.mo32291(i);
            Trace.endSection();
            m48640(0, 1);
            m48645(c15354.m36796());
            return true;
        }
        if (iM32578 == 3) {
            m48641(interfaceC14420, i);
            m48645(c15354.m36796());
            return true;
        }
        if (iM32578 == 4 || iM32578 == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iM32578));
    }

    public C21387(C24371 c24371) {
        super(2, c24371.f79074, InterfaceC6963.f22987, false, 30.0f);
        Context applicationContext = c24371.f79079.getApplicationContext();
        this.f68138 = applicationContext;
        this.f68141 = c24371.f79075;
        this.f68135 = null;
        this.f68114 = new C24306(c24371.f79077, c24371.f79076);
        this.f68112 = this.f68135 == null;
        this.f68137 = new C13117(applicationContext, this, c24371.f79073);
        this.f68139 = new C15354();
        this.f68147 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f68122 = C18303.f59691;
        this.f68124 = 1;
        this.f68128 = 0;
        this.f68134 = C18787.f61010;
        this.f68117 = 0;
        this.f68145 = null;
        this.f68115 = -1000;
        this.f68142 = -9223372036854775807L;
        this.f68119 = -9223372036854775807L;
        this.f68143 = new PriorityQueue();
        this.f68123 = -9223372036854775807L;
        this.f68148 = false;
        this.f68146 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48643(long j, long j2, boolean z, boolean z2) throws C18566 {
        int iM56454;
        if (this.f68135 != null && this.f68112) {
            j2 -= -this.f68142;
        }
        if (j >= -500000 || z || (iM56454 = m56454(j2)) == 0) {
            return false;
        }
        PriorityQueue priorityQueue = this.f68143;
        if (z2) {
            C17074 c17074 = this.f27674;
            int i = c17074.f55744 + iM56454;
            c17074.f55744 = i;
            c17074.f55748 += this.f68132;
            c17074.f55744 = priorityQueue.size() + i;
        } else {
            this.f27674.f55752++;
            m48640(priorityQueue.size() + iM56454, this.f68132);
        }
        m22705();
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 != null) {
            interfaceC7897.mo4526(false);
        }
        return true;
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final int mo22667(InterfaceC6963 interfaceC6963, C15648 c15648) {
        boolean z;
        int i = 0;
        if (!C9681.m25257(c15648.f50848)) {
            return C14442.m34863(0, 0, 0, 0);
        }
        boolean z2 = c15648.f50838 != null;
        Context context = this.f68138;
        List listM48628 = m48628(context, interfaceC6963, c15648, z2, false);
        if (z2 && listM48628.isEmpty()) {
            listM48628 = m48628(context, interfaceC6963, c15648, false, false);
        }
        if (listM48628.isEmpty()) {
            return C14442.m34863(1, 0, 0, 0);
        }
        int i2 = c15648.f50813;
        if (i2 != 0 && i2 != 2) {
            return C14442.m34863(2, 0, 0, 0);
        }
        C0251 c0251 = (C0251) listM48628.get(0);
        boolean zM1748 = c0251.m1748(c15648);
        if (!zM1748) {
            int i3 = 1;
            while (true) {
                if (i3 >= listM48628.size()) {
                    z = true;
                    break;
                }
                C0251 c0252 = (C0251) listM48628.get(i3);
                if (c0252.m1748(c15648)) {
                    z = false;
                    zM1748 = true;
                    c0251 = c0252;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            break;
        }
        int i4 = zM1748 ? 4 : 3;
        int i5 = c0251.m1747(c15648) ? 16 : 8;
        int i6 = c0251.f1530 ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(c15648.f50848) && !C6471.m18296(context)) {
            i7 = 256;
        }
        if (zM1748) {
            List listM48629 = m48628(context, interfaceC6963, c15648, z2, true);
            if (!listM48629.isEmpty()) {
                C0251 c0253 = (C0251) C1939.m6720(listM48629, c15648).get(0);
                if (c0253.m1748(c15648) && c0253.m1747(c15648)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo22668(InterfaceC6963 interfaceC6963, C15648 c15648, boolean z) {
        return C1939.m6720(m48628(this.f68138, interfaceC6963, c15648, z, this.f68129), c15648);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m48628(Context context, InterfaceC6963 interfaceC6963, C15648 c15648, boolean z, boolean z2) {
        List listMo19266;
        String str = c15648.f50848;
        if (str == null) {
            return AbstractC1928.of();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !C6471.m18296(context)) {
            String strM6719 = C1939.m6719(c15648);
            if (strM6719 == null) {
                listMo19266 = AbstractC1928.of();
            } else {
                listMo19266 = interfaceC6963.mo19266(strM6719, z, z2);
            }
            if (!listMo19266.isEmpty()) {
                return listMo19266;
            }
        }
        return C1939.m6723(interfaceC6963, c15648, z, z2);
    }

    @Override // l.AbstractC8454, l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo22678(boolean z, boolean z2) {
        super.mo22678(z, z2);
        boolean z3 = m56442().f1571;
        C20782.m47568((z3 && this.f68117 == 0) ? false : true);
        if (this.f68129 != z3) {
            this.f68129 = z3;
            m22701();
        }
        this.f68114.m54335(this.f27674);
        boolean z4 = this.f68144;
        C13117 c13117 = this.f68137;
        if (!z4) {
            if (this.f68126 != null && this.f68135 == null) {
                C19149 c19149 = new C19149(this.f68138, c13117);
                c19149.m44396();
                c19149.m44395(m56455());
                C4914 c4914M44394 = c19149.m44394();
                c4914M44394.m15099();
                this.f68135 = c4914M44394.m15098();
            }
            this.f68144 = true;
        }
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 == null) {
            c13117.m32583(m56455());
            c13117.m32581(!z2 ? 1 : 0);
            return;
        }
        interfaceC7897.mo4515(new C20641(this), C18466.m43012());
        InterfaceC19830 interfaceC19830 = this.f68131;
        if (interfaceC19830 != null) {
            this.f68135.mo4514(interfaceC19830);
        }
        if (this.f68113 != null && !this.f68122.equals(C18303.f59691)) {
            this.f68135.mo4510(this.f68113, this.f68122);
        }
        this.f68135.mo4507(this.f68128);
        this.f68135.mo4506(m22712());
        List list = this.f68126;
        if (list != null) {
            this.f68135.mo4511(list);
        }
        this.f68109 = !z2 ? 1 : 0;
        m22681();
    }

    @Override // l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ۚ */
    public final void mo12946() {
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 != null) {
            int i = this.f68109;
            if (i == 0 || i == 1) {
                this.f68109 = 0;
                return;
            } else {
                interfaceC7897.mo4519();
                return;
            }
        }
        this.f68137.m32579();
    }

    @Override // l.AbstractC8454, l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo11188(C15648[] c15648Arr, long j, long j2, C8402 c8402) {
        super.mo11188(c15648Arr, j, j2, c8402);
        AbstractC24755 abstractC24755M56452 = m56452();
        if (!abstractC24755M56452.m55264()) {
            c8402.getClass();
            this.f68119 = abstractC24755M56452.mo15535(c8402.f27520, new C1634()).f5660;
        } else {
            this.f68119 = -9223372036854775807L;
        }
    }

    @Override // l.AbstractC8454, l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo11187(long j, boolean z) throws C18566 {
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 != null && !z) {
            interfaceC7897.mo4526(true);
        }
        super.mo11187(j, z);
        InterfaceC7897 interfaceC7898 = this.f68135;
        C13117 c13117 = this.f68137;
        if (interfaceC7898 == null) {
            c13117.m32586();
        }
        if (z) {
            InterfaceC7897 interfaceC7899 = this.f68135;
            if (interfaceC7899 != null) {
                interfaceC7899.mo4521(false);
            } else {
                c13117.m32589(false);
            }
        }
        m48625();
        this.f68149 = 0;
    }

    @Override // l.AbstractC8454, l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo11190() {
        if (!super.mo11190()) {
            return false;
        }
        InterfaceC7897 interfaceC7897 = this.f68135;
        return interfaceC7897 == null || interfaceC7897.mo4527();
    }

    @Override // l.AbstractC8454, l.InterfaceC4002
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo11189() {
        boolean zMo11189 = super.mo11189();
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 != null) {
            return interfaceC7897.mo4518(zMo11189);
        }
        if (zMo11189 && (m22689() == null || this.f68129)) {
            return true;
        }
        return this.f68137.m32584(zMo11189);
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۜ */
    public final void mo45800() {
        this.f68118 = 0;
        this.f68127 = m56455().mo2210();
        this.f68133 = 0L;
        this.f68150 = 0;
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 != null) {
            interfaceC7897.mo4522();
        } else {
            this.f68137.m32585();
        }
    }

    @Override // l.AbstractC8454, l.AbstractC25280
    /* JADX INFO: renamed from: ֨ */
    public final void mo11184() {
        C24306 c24306 = this.f68114;
        this.f68145 = null;
        this.f68119 = -9223372036854775807L;
        m48625();
        this.f68140 = false;
        this.f68111 = null;
        this.f68108 = true;
        try {
            super.mo11184();
        } finally {
            c24306.m54332(this.f27674);
            c24306.m54333(C18787.f61010);
        }
    }

    @Override // l.AbstractC8454, l.AbstractC25280
    /* JADX INFO: renamed from: ۠ */
    public final void mo22684() {
        try {
            super.mo22684();
        } finally {
            this.f68144 = false;
            this.f68142 = -9223372036854775807L;
            C0504 c0504 = this.f68130;
            if (c0504 != null) {
                c0504.release();
                this.f68130 = null;
            }
        }
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void mo48644() {
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 == null || !this.f68112) {
            return;
        }
        interfaceC7897.mo4505();
    }

    @Override // l.AbstractC8454, l.AbstractC25280, l.InterfaceC3256
    /* JADX INFO: renamed from: ۙ */
    public final void mo10630(int i, Object obj) throws C18566 {
        if (i == 1) {
            m48629(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            InterfaceC19830 interfaceC19830 = (InterfaceC19830) obj;
            this.f68131 = interfaceC19830;
            InterfaceC7897 interfaceC7897 = this.f68135;
            if (interfaceC7897 != null) {
                interfaceC7897.mo4514(interfaceC19830);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f68117 != iIntValue) {
                this.f68117 = iIntValue;
                if (this.f68129) {
                    m22701();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            this.f68124 = ((Integer) obj).intValue();
            InterfaceC14420 interfaceC14420M22689 = m22689();
            if (interfaceC14420M22689 != null) {
                interfaceC14420M22689.mo32282(this.f68124);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f68128 = iIntValue2;
            InterfaceC7897 interfaceC7898 = this.f68135;
            if (interfaceC7898 != null) {
                interfaceC7898.mo4507(iIntValue2);
                return;
            } else {
                this.f68137.m32588(iIntValue2);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(InterfaceC18041.f59078)) {
                InterfaceC7897 interfaceC7899 = this.f68135;
                if (interfaceC7899 == null || !interfaceC7899.isInitialized()) {
                    return;
                }
                this.f68135.mo4528();
                return;
            }
            this.f68126 = list;
            InterfaceC7897 interfaceC78910 = this.f68135;
            if (interfaceC78910 != null) {
                interfaceC78910.mo4511(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            C18303 c18303 = (C18303) obj;
            if (c18303.m42689() == 0 || c18303.m42688() == 0) {
                return;
            }
            this.f68122 = c18303;
            InterfaceC7897 interfaceC78911 = this.f68135;
            if (interfaceC78911 != null) {
                Surface surface = this.f68113;
                C20782.m47566(surface);
                interfaceC78911.mo4510(surface, c18303);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.f68115 = ((Integer) obj).intValue();
                InterfaceC14420 interfaceC14420M226810 = m22689();
                if (interfaceC14420M226810 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f68115));
                    interfaceC14420M226810.mo32286(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.f68113;
                m48629((Object) null);
                obj.getClass();
                ((C21387) obj).mo10630(1, surface2);
                break;
            case 18:
                C1019 c1019 = this.f68146;
                boolean z = c1019 != null && c1019.f3691;
                C1019 c10110 = (C1019) obj;
                this.f68146 = c10110;
                if (z != (c10110 != null && c10110.f3691)) {
                    m22698();
                }
                break;
            default:
                super.mo10630(i, obj);
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48629(Object obj) throws C18566 {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f68113;
        C24306 c24306 = this.f68114;
        if (surface2 == surface) {
            if (surface != null) {
                C18787 c18787 = this.f68145;
                if (c18787 != null) {
                    c24306.m54333(c18787);
                }
                Surface surface3 = this.f68113;
                if (surface3 == null || !this.f68140) {
                    return;
                }
                c24306.m54328(surface3);
                return;
            }
            return;
        }
        this.f68113 = surface;
        InterfaceC7897 interfaceC7897 = this.f68135;
        C13117 c13117 = this.f68137;
        if (interfaceC7897 == null) {
            c13117.m32582(surface);
        }
        this.f68140 = false;
        int state = getState();
        InterfaceC14420 interfaceC14420M22689 = m22689();
        if (interfaceC14420M22689 != null && this.f68135 == null) {
            C0251 c0251M22709 = m22709();
            c0251M22709.getClass();
            boolean zM48639 = m48639(c0251M22709);
            int i = Build.VERSION.SDK_INT;
            if (i >= 23 && zM48639 && !this.f68125) {
                Surface surfaceM48631 = m48631(c0251M22709);
                if (i >= 23 && surfaceM48631 != null) {
                    interfaceC14420M22689.mo32287(surfaceM48631);
                } else {
                    if (i < 35) {
                        throw new IllegalStateException();
                    }
                    interfaceC14420M22689.mo32290();
                }
            } else {
                m22701();
                m22710();
            }
        }
        if (surface == null) {
            this.f68145 = null;
            InterfaceC7897 interfaceC7898 = this.f68135;
            if (interfaceC7898 != null) {
                interfaceC7898.mo4529();
            }
        } else {
            C18787 c18788 = this.f68145;
            if (c18788 != null) {
                c24306.m54333(c18788);
            }
        }
        if (state == 2) {
            InterfaceC7897 interfaceC7899 = this.f68135;
            if (interfaceC7899 != null) {
                interfaceC7899.mo4521(true);
            } else {
                c13117.m32589(true);
            }
        }
        m48625();
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22680(C0251 c0251) {
        return m48639(c0251);
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ܳۙ */
    public final boolean mo22694() {
        return this.f68129 && Build.VERSION.SDK_INT < 23;
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final C12183 mo22669(C0251 c0251, C15648 c15648, MediaCrypto mediaCrypto, float f) {
        C1259 c1259;
        int i;
        C4233 c4233;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z;
        int iM48626;
        String str = c0251.f1524;
        C15648[] c15648ArrM56440 = m56440();
        int i2 = c15648.f50814;
        float f2 = c15648.f50845;
        C1259 c12510 = c15648.f50832;
        int i3 = c15648.f50852;
        int iM48635 = m48635(c0251, c15648);
        if (c15648ArrM56440.length == 1) {
            if (iM48635 != -1 && (iM48626 = m48626(c0251, c15648)) != -1) {
                iM48635 = Math.min((int) (iM48635 * 1.5f), iM48626);
            }
            c4233 = new C4233(i2, i3, iM48635);
            c1259 = c12510;
            i = i3;
        } else {
            int length = c15648ArrM56440.length;
            int i4 = 0;
            boolean z2 = false;
            int iMax = i2;
            int iMax2 = i3;
            while (i4 < length) {
                int i5 = length;
                C15648 c15648M46295 = c15648ArrM56440[i4];
                C15648[] c15648Arr = c15648ArrM56440;
                if (c12510 != null && c15648M46295.f50832 == null) {
                    C20124 c20124M37397 = c15648M46295.m37397();
                    c20124M37397.m46302(c12510);
                    c15648M46295 = c20124M37397.m46295();
                }
                C17820 c17820M1744 = c0251.m1744(c15648, c15648M46295);
                int i6 = c15648M46295.f50852;
                if (c17820M1744.f58465 != 0) {
                    int i7 = c15648M46295.f50814;
                    boolean z3 = i7 == -1 || i6 == -1;
                    iMax = Math.max(iMax, i7);
                    iMax2 = Math.max(iMax2, i6);
                    iM48635 = Math.max(iM48635, m48635(c0251, c15648M46295));
                    z2 = z3 | z2;
                }
                i4++;
                length = i5;
                c15648ArrM56440 = c15648Arr;
                c12510 = c12510;
            }
            c1259 = c12510;
            if (z2) {
                C1896.m6517("Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z4 = i3 > i2;
                int i8 = z4 ? i3 : i2;
                int i9 = z4 ? i2 : i3;
                float f3 = i9 / i8;
                int i10 = 0;
                while (true) {
                    if (i10 < 9) {
                        int i11 = f68107[i10];
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
                            MediaCodecInfo.CodecCapabilities codecCapabilities = c0251.f1531;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point = new Point(C7116.m19459(i11, widthAlignment) * widthAlignment, C7116.m19459(i12, heightAlignment) * heightAlignment);
                            }
                            if (point != null && c0251.m1745(point.x, point.y, f2)) {
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
                    C20124 c20124M37398 = c15648.m37397();
                    c20124M37398.m46291(iMax);
                    c20124M37398.m46333(iMax2);
                    iM48635 = Math.max(iM48635, m48626(c0251, c20124M37398.m46295()));
                    C1896.m6517("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                i = i3;
            }
            c4233 = new C4233(iMax, iMax2, iM48635);
        }
        this.f68110 = c4233;
        int i13 = this.f68129 ? this.f68117 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        C16811.m39703(mediaFormat, c15648.f50835);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        C16811.m39702(mediaFormat, "rotation-degrees", c15648.f50819);
        C16811.m39704(mediaFormat, c1259);
        if ("video/dolby-vision".equals(c15648.f50848)) {
            int i14 = C1939.f6500;
            Pair pairM48970 = C21528.m48970(c15648);
            if (pairM48970 != null) {
                C16811.m39702(mediaFormat, "profile", ((Integer) pairM48970.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", c4233.f15446);
        mediaFormat.setInteger("max-height", c4233.f15445);
        C16811.m39702(mediaFormat, "max-input-size", c4233.f15447);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 23) {
            mediaFormat.setInteger(MessageHandler.Properties.Priority, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.f68147) {
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
            mediaFormat.setInteger("importance", Math.max(0, -this.f68115));
        }
        Surface surfaceM48631 = m48631(c0251);
        if (this.f68135 != null && !C7116.m19512(this.f68138)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return C12183.m30456(c0251, mediaFormat, c15648, surfaceM48631, mediaCrypto);
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final C17820 mo22670(C0251 c0251, C15648 c15648, C15648 c15649) {
        C17820 c17820M1744 = c0251.m1744(c15648, c15649);
        int i = c17820M1744.f58466;
        C4233 c4233 = this.f68110;
        c4233.getClass();
        if (c15649.f50814 > c4233.f15446 || c15649.f50852 > c4233.f15445) {
            i |= 256;
        }
        if (m48635(c0251, c15649) > c4233.f15447) {
            i |= 64;
        }
        int i2 = i;
        return new C17820(c0251.f1533, c15648, c15649, i2 != 0 ? 0 : c17820M1744.f58465, i2);
    }

    @Override // l.AbstractC8454, l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public final void mo11186(long j, long j2) throws C18566 {
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 != null) {
            try {
                interfaceC7897.mo4509(j, j2);
            } catch (C0439 e) {
                throw m56444(e, e.f2005, 7001);
            }
        }
        super.mo11186(j, j2);
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۛۙ */
    public final void mo22683() {
        super.mo22683();
        this.f68143.clear();
        this.f68132 = 0;
        this.f68136 = 0;
        this.f68108 = false;
    }

    @Override // l.AbstractC8454, l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public final void mo12940(float f, float f2) throws C18566 {
        super.mo12940(f, f2);
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 != null) {
            interfaceC7897.mo4506(f);
        } else {
            this.f68137.m32587(f);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48626(C0251 c0251, C15648 c15648) {
        int i = c15648.f50814;
        int i2 = c15648.f50852;
        if (i != -1 && i2 != -1) {
            String str = c15648.f50848;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                int i3 = C1939.f6500;
                Pair pairM48970 = C21528.m48970(c15648);
                if (pairM48970 == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairM48970.first).intValue();
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
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !c0251.f1528)))) {
                        return ((C7116.m19459(i2, 16) * C7116.m19459(i, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final float mo22665(float f, C15648 c15648, C15648[] c15648Arr) {
        C0251 c0251M22709;
        float fMax = -1.0f;
        for (C15648 c15649 : c15648Arr) {
            float f2 = c15649.f50845;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : f * fMax;
        if (this.f68146 == null || (c0251M22709 = m22709()) == null) {
            return f3;
        }
        float fM1743 = c0251M22709.m1743(c15648.f50814, c15648.f50852);
        return f3 != -1.0f ? Math.max(f3, fM1743) : fM1743;
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo22688(C15648 c15648) throws C18566 {
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 == null || interfaceC7897.isInitialized()) {
            return true;
        }
        try {
            return this.f68135.mo4517(c15648);
        } catch (C0439 e) {
            throw m56444(e, c15648, 7000);
        }
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final void mo22675(String str, long j, long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        this.f68114.m54330(str, j, j2);
        this.f68125 = m48637(str);
        C0251 c0251M22709 = m22709();
        c0251M22709.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(c0251M22709.f1525)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c0251M22709.f1531;
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
        this.f68116 = z;
        m48625();
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final void mo22674(String str) {
        this.f68114.m54329(str);
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final void mo22673(Exception exc) {
        C1896.m6516("Video codec error", exc);
        this.f68114.m54327(exc);
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ᩶ۙ */
    public final boolean mo22702() {
        C0251 c0251M22709 = m22709();
        if (this.f68135 != null && c0251M22709 != null) {
            String str = c0251M22709.f1533;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.mo22702();
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ܰۙ */
    public final boolean mo22693() {
        C15648 c15648M22700 = m22700();
        C1019 c1019 = this.f68146;
        if (c1019 == null || !c1019.f3687 || this.f68108 || this.f68129) {
            return true;
        }
        return (c15648M22700 != null && c15648M22700.f50842 > 0) || m22697() || m22682() != -9223372036854775807L;
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final C17820 mo22671(C16461 c16461) throws C18566 {
        C17820 c17820Mo22671 = super.mo22671(c16461);
        C15648 c15648 = c16461.f53378;
        c15648.getClass();
        this.f68114.m54331(c15648, c17820Mo22671);
        return c17820Mo22671;
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۤ */
    public final void mo22687(C5690 c5690) {
        this.f68136 = 0;
        int iMo22666 = mo22666(c5690);
        int i = Build.VERSION.SDK_INT;
        if ((i < 34 || (iMo22666 & 32) == 0) && !this.f68129) {
            this.f68132++;
        }
        if (i >= 23 || !this.f68129) {
            return;
        }
        m48646(c5690.f19652);
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final int mo22666(C5690 c5690) {
        C1019 c1019;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f68148 || (((c1019 = this.f68146) != null && c1019.f3689) || this.f68129)) && c5690.f19652 < m56453() && !m48634(c5690)) ? 32 : 0;
        }
        return 0;
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo22707(C5690 c5690) {
        boolean z = false;
        if (!m48634(c5690)) {
            boolean z2 = c5690.f19652 < m56453();
            if (z2 && !c5690.m33308()) {
                if (c5690.m33306()) {
                    c5690.mo7();
                    z = true;
                }
                if (z) {
                    if (z2) {
                        this.f27674.f55744++;
                        return z;
                    }
                    this.f68143.add(Long.valueOf(c5690.f19652));
                    this.f68136++;
                }
                return z;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m48634(C5690 c5690) {
        if (mo12948() || c5690.m33311() || this.f68119 == -9223372036854775807L) {
            return true;
        }
        return this.f68119 - (c5690.f19652 - m22662()) <= 100000;
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final void mo22676(C15648 c15648, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        int i;
        int i2;
        InterfaceC14420 interfaceC14420M22689 = m22689();
        if (interfaceC14420M22689 != null) {
            interfaceC14420M22689.mo32282(this.f68124);
        }
        if (!this.f68129) {
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
            i2 = c15648.f50814;
            i = c15648.f50852;
        }
        float f = c15648.f50825;
        int i4 = c15648.f50819;
        if (i4 == 90 || i4 == 270) {
            f = 1.0f / f;
            int i5 = i;
            i = i2;
            i2 = i5;
        }
        this.f68134 = new C18787(i2, i, f);
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 != null && this.f68121) {
            C20124 c20124M37397 = c15648.m37397();
            c20124M37397.m46291(i2);
            c20124M37397.m46333(i);
            c20124M37397.m46325(f);
            C15648 c15648M46295 = c20124M37397.m46295();
            int i6 = this.f68109;
            List listOf = this.f68126;
            if (listOf == null) {
                listOf = AbstractC1928.of();
            }
            interfaceC7897.mo4512(c15648M46295, m22690(), i6, listOf);
            this.f68109 = 2;
        } else {
            this.f68137.m32580(c15648.f50845);
        }
        this.f68121 = false;
    }

    @Override // l.AbstractC8454
    @TargetApi(29)
    /* JADX INFO: renamed from: ᩷ */
    public final void mo22703(C5690 c5690) {
        if (this.f68116) {
            ByteBuffer byteBuffer = c5690.f19655;
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
                        InterfaceC14420 interfaceC14420M22689 = m22689();
                        interfaceC14420M22689.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC14420M22689.mo32286(bundle);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۨۙ */
    public final void mo22691() {
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 != null) {
            interfaceC7897.mo4523();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m48646(long j) {
        Surface surface;
        m22699(j);
        C18787 c18787 = this.f68134;
        boolean zEquals = c18787.equals(C18787.f61010);
        C24306 c24306 = this.f68114;
        if (!zEquals && !c18787.equals(this.f68145)) {
            this.f68145 = c18787;
            c24306.m54333(c18787);
        }
        this.f27674.f55746++;
        if (this.f68137.m32590() && (surface = this.f68113) != null) {
            c24306.m54328(surface);
            this.f68140 = true;
        }
        mo22706(j);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m48632(C21387 c21387) {
        c21387.m22664();
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ᩸ */
    public final void mo22706(long j) {
        super.mo22706(j);
        if (this.f68129) {
            return;
        }
        this.f68132--;
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۗۙ */
    public final void mo22663() {
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 != null) {
            interfaceC7897.mo4523();
            if (this.f68142 == -9223372036854775807L) {
                this.f68142 = m22690();
            }
            this.f68135.mo4508(-this.f68142);
        } else {
            this.f68137.m32581(2);
        }
        this.f68121 = true;
        m48625();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48640(int i, int i2) {
        int i3;
        C17074 c17074 = this.f27674;
        c17074.f55754 += i;
        int i4 = i + i2;
        c17074.f55747 += i4;
        this.f68118 += i4;
        int i5 = this.f68149 + i4;
        this.f68149 = i5;
        c17074.f55750 = Math.max(i5, c17074.f55750);
        int i6 = this.f68141;
        if (i6 <= 0 || (i3 = this.f68118) < i6 || i3 <= 0) {
            return;
        }
        long jMo2210 = m56455().mo2210();
        this.f68114.m54326(this.f68118, jMo2210 - this.f68127);
        this.f68118 = 0;
        this.f68127 = jMo2210;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m48645(long j) {
        C17074 c17074 = this.f27674;
        c17074.f55755 += j;
        c17074.f55751++;
        this.f68133 += j;
        this.f68150++;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m48639(C0251 c0251) {
        if (this.f68135 != null) {
            return true;
        }
        Surface surface = this.f68113;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && c0251.f1532) || m48647(c0251);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private Surface m48631(C0251 c0251) {
        boolean z = c0251.f1528;
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 != null) {
            return interfaceC7897.mo4525();
        }
        Surface surface = this.f68113;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && c0251.f1532) {
            return null;
        }
        C20782.m47568(m48647(c0251));
        C0504 c0504 = this.f68130;
        if (c0504 != null && c0504.f2181 != z && c0504 != null) {
            c0504.release();
            this.f68130 = null;
        }
        if (this.f68130 == null) {
            this.f68130 = C0504.m2470(this.f68138, z);
        }
        return this.f68130;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m48647(C0251 c0251) {
        if (Build.VERSION.SDK_INT < 23 || this.f68129 || m48637(c0251.f1533)) {
            return false;
        }
        return !c0251.f1528 || C0504.m2471(this.f68138);
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    private void m48625() {
        int i;
        InterfaceC14420 interfaceC14420M22689;
        if (!this.f68129 || (i = Build.VERSION.SDK_INT) < 23 || (interfaceC14420M22689 = m22689()) == null) {
            return;
        }
        this.f68111 = new C14673(this, interfaceC14420M22689);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            interfaceC14420M22689.mo32286(bundle);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m48636(C21387 c21387) {
        c21387.f68114.m54328(c21387.f68113);
        c21387.f68140 = true;
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۬ */
    public final void mo45801() {
        int i = this.f68118;
        C24306 c24306 = this.f68114;
        if (i > 0) {
            long jMo2210 = m56455().mo2210();
            c24306.m54326(this.f68118, jMo2210 - this.f68127);
            this.f68118 = 0;
            this.f68127 = jMo2210;
        }
        int i2 = this.f68150;
        if (i2 != 0) {
            c24306.m54334(i2, this.f68133);
            this.f68133 = 0L;
            this.f68150 = 0;
        }
        InterfaceC7897 interfaceC7897 = this.f68135;
        if (interfaceC7897 != null) {
            interfaceC7897.mo4504();
        } else {
            this.f68137.m32591();
        }
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final C18150 mo22672(IllegalStateException illegalStateException, C0251 c0251) {
        Surface surface = this.f68113;
        C3487 c3487 = new C3487(illegalStateException, c0251);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c3487;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m48635(C0251 c0251, C15648 c15648) {
        int i = c15648.f50824;
        List list = c15648.f50835;
        if (i != -1) {
            int size = list.size();
            int length = 0;
            for (int i2 = 0; i2 < size; i2++) {
                length += ((byte[]) list.get(i2)).length;
            }
            return c15648.f50824 + length;
        }
        return m48626(c0251, c15648);
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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m48637(String str) {
        String str2;
        byte b;
        String str3;
        byte b2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C21387.class) {
            if (!f68106) {
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
                                                        b3 = cb.f82047l;
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
                                            b3 = cb.f82047l;
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
                                            b3 = cb.f82047l;
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
                f68105 = z;
                f68106 = true;
            }
        }
        return f68105;
    }
}
