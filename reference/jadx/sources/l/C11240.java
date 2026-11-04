package l;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.alipay.sdk.m.t0.b;
import com.google.android.material.slider.BasicLabelFormatter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8T2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11240 implements Handler.Callback, InterfaceC0945, InterfaceC22265, InterfaceC24886, InterfaceC12599, InterfaceC23394, InterfaceC2159, InterfaceC19830 {

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public static final long f35430 = C7116.m19506(10000L);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f35431;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public C1546 f35432;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23011 f35433;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public long f35434;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f35437;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final boolean[] f35438;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public C12732 f35439;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final C20738 f35440;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f35441;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f35442;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f35443;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC11076 f35444;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C15934 f35445;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f35446;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f35447;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC17043 f35448;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final long f35449;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC4879 f35450;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final C7731[] f35451;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f35452;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public long f35453;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f35454;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18172[] f35455;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17207 f35456;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C1546 f35458;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public final C11328 f35459;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final Looper f35460;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f35461;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public boolean f35462;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f35463;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f35464;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22230 f35465;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C16680 f35467;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public boolean f35468;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final C1634 f35469;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f35470;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public C18566 f35471;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11853 f35472;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final C9748 f35473;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14814 f35474;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f35475;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C6634 f35476;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C9221 f35477;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C13257 f35478;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC4879 f35479;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public boolean f35482;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23175 f35483;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public boolean f35484;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C17426 f35485;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f35487;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public long f35480 = -9223372036854775807L;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f35435 = false;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C14090 f35466 = C14090.f44596;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public float f35436 = 1.0f;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public C1019 f35457 = C1019.f3686;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public long f35486 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public long f35481 = -9223372036854775807L;

    @Override // l.InterfaceC22002
    /* JADX INFO: renamed from: ۙ */
    public final void mo7501(InterfaceC10813 interfaceC10813) {
        this.f35450.mo14963(9, (InterfaceC9147) interfaceC10813).mo21395();
    }

    public C11240(Context context, InterfaceC4002[] interfaceC4002Arr, InterfaceC4002[] interfaceC4002Arr2, AbstractC11076 abstractC11076, C23011 c23011, InterfaceC23175 interfaceC23175, InterfaceC17043 interfaceC17043, int i, boolean z, InterfaceC22230 interfaceC22230, C9221 c9221, C23788 c23788, long j, Looper looper, C0404 c0404, C13257 c13257, C20738 c20738, final InterfaceC19830 interfaceC19830) {
        this.f35478 = c13257;
        this.f35444 = abstractC11076;
        this.f35433 = c23011;
        this.f35483 = interfaceC23175;
        this.f35448 = interfaceC17043;
        this.f35447 = i;
        this.f35462 = z;
        this.f35477 = c9221;
        this.f35456 = c23788;
        this.f35449 = j;
        this.f35474 = c0404;
        this.f35440 = c20738;
        this.f35465 = interfaceC22230;
        this.f35431 = interfaceC23175.mo47593();
        this.f35442 = interfaceC23175.mo47588();
        AbstractC24755 abstractC24755 = AbstractC24755.f80138;
        C17426 c17426M40917 = C17426.m40917(c23011);
        this.f35485 = c17426M40917;
        this.f35439 = new C12732(c17426M40917);
        this.f35455 = new InterfaceC18172[interfaceC4002Arr.length];
        this.f35438 = new boolean[interfaceC4002Arr.length];
        InterfaceC21156 interfaceC21156Mo27989 = abstractC11076.mo27989();
        this.f35451 = new C7731[interfaceC4002Arr.length];
        boolean z2 = false;
        for (int i2 = 0; i2 < interfaceC4002Arr.length; i2++) {
            interfaceC4002Arr[i2].mo12941(i2, c20738, c0404);
            this.f35455[i2] = interfaceC4002Arr[i2].mo12950();
            if (interfaceC21156Mo27989 != null) {
                ((AbstractC25280) this.f35455[i2]).m56446(interfaceC21156Mo27989);
            }
            InterfaceC4002 interfaceC4002 = interfaceC4002Arr2[i2];
            if (interfaceC4002 != null) {
                interfaceC4002.mo12941(i2, c20738, c0404);
                z2 = true;
            }
            this.f35451[i2] = new C7731(interfaceC4002Arr[i2], interfaceC4002Arr2[i2], i2);
        }
        this.f35446 = z2;
        this.f35476 = new C6634(this, c0404);
        this.f35487 = new ArrayList();
        this.f35459 = new C11328();
        this.f35469 = new C1634();
        abstractC11076.m27987(this, interfaceC17043);
        this.f35454 = true;
        InterfaceC4879 interfaceC4879Mo2209 = c0404.mo2209(looper, null);
        this.f35479 = interfaceC4879Mo2209;
        this.f35473 = new C9748(interfaceC22230, interfaceC4879Mo2209, new C4529(this));
        this.f35467 = new C16680(this, interfaceC22230, interfaceC4879Mo2209, c20738);
        C15934 c15934 = new C15934();
        this.f35445 = c15934;
        Looper looperM37957 = c15934.m37957();
        this.f35460 = looperM37957;
        InterfaceC4879 interfaceC4879Mo22010 = c0404.mo2209(looperM37957, this);
        this.f35450 = interfaceC4879Mo22010;
        this.f35472 = new C11853(context, looperM37957, this);
        interfaceC4879Mo22010.mo14963(35, new InterfaceC19830() { // from class: l.᩷֡ۙ
            @Override // l.InterfaceC19830
            /* JADX INFO: renamed from: ۙ */
            public final void mo24942(long j2, long j3, C15648 c15648, MediaFormat mediaFormat) {
                C11240 c11240 = this.f69209;
                c11240.getClass();
                interfaceC19830.mo24942(j2, j3, c15648, mediaFormat);
                c11240.mo24942(j2, j3, c15648, mediaFormat);
            }
        }).mo21395();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m28432(C20410 c20410) {
        synchronized (c20410) {
        }
        try {
            c20410.m46812().mo10630(c20410.m46815(), c20410.m46814());
        } finally {
            c20410.m46811(true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0054 m28373(C11240 c11240, C7512 c7512, long j) {
        InterfaceC18172[] interfaceC18172Arr = c11240.f35455;
        AbstractC11076 abstractC11076 = c11240.f35444;
        C17789 c17789Mo47590 = c11240.f35483.mo47590();
        C16680 c16680 = c11240.f35467;
        C23011 c23011 = c11240.f35433;
        c11240.f35466.getClass();
        return new C0054(interfaceC18172Arr, j, abstractC11076, c17789Mo47590, c16680, c7512, c23011);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m28459() {
        this.f35450.mo14960(29).mo21395();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28445(int i, int i2, boolean z) {
        this.f35450.mo14961(1, z ? 1 : 0, i | (i2 << 4)).mo21395();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28461(int i) {
        this.f35450.mo14961(11, i, 0).mo21395();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28463(boolean z) {
        this.f35450.mo14961(12, z ? 1 : 0, 0).mo21395();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28452(AbstractC24755 abstractC24755, int i, long j) {
        this.f35450.mo14963(3, new C1546(abstractC24755, i, j)).mo21395();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28462(C7445 c7445) {
        this.f35450.mo14963(4, c7445).mo21395();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28453(boolean z) {
        this.f35450.mo14963(36, Boolean.valueOf(z)).mo21395();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28448(C1019 c1019) {
        this.f35450.mo14963(38, c1019).mo21395();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m28455() {
        this.f35450.mo14960(6).mo21395();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28446(int i, long j, InterfaceC19764 interfaceC19764, ArrayList arrayList) {
        this.f35450.mo14963(17, new C22429(i, j, interfaceC19764, arrayList)).mo21395();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28447(int i, InterfaceC19764 interfaceC19764) {
        this.f35450.mo14962(20, i, interfaceC19764).mo21395();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28450(C18412 c18412) {
        this.f35450.mo14962(31, 0, c18412).mo21395();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m28408(int i) {
        C17426 c17426 = this.f35485;
        m28376(i, c17426.f56681, c17426.f56670, c17426.f56671);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m28423() {
        float f = this.f35436;
        this.f35436 = f;
        float fM29697 = f * this.f35472.m29697();
        for (C7731 c7731 : this.f35451) {
            c7731.m21027(fM29697);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28394(InterfaceC19830 interfaceC19830) {
        for (C7731 c7731 : this.f35451) {
            c7731.m21037(interfaceC19830);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28451(C20410 c20410) {
        if (this.f35475 || !this.f35460.getThread().isAlive()) {
            C1896.m6517("Ignoring messages sent after release.");
            c20410.m46811(false);
        } else {
            this.f35450.mo14963(14, c20410).mo21395();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28454(long j, Object obj) {
        if (this.f35475 || !this.f35460.getThread().isAlive()) {
            return true;
        }
        C0645 c0645 = new C0645(this.f35474);
        this.f35450.mo14963(30, new Pair(obj, c0645)).mo21395();
        if (j != -9223372036854775807L) {
            return c0645.m2831(j);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m28458() {
        if (this.f35475 || !this.f35460.getThread().isAlive()) {
            return true;
        }
        this.f35475 = true;
        C0645 c0645 = new C0645(this.f35474);
        this.f35450.mo14963(7, c0645).mo21395();
        return c0645.m2831(this.f35449);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Looper m28456() {
        return this.f35460;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m28464() {
        InterfaceC4879 interfaceC4879 = this.f35450;
        interfaceC4879.mo14969(2);
        interfaceC4879.mo14971(22);
    }

    @Override // l.InterfaceC0945
    /* JADX INFO: renamed from: ۙ */
    public final void mo3768(InterfaceC9147 interfaceC9147) {
        this.f35450.mo14963(8, interfaceC9147).mo21395();
    }

    @Override // l.InterfaceC22265
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28443() {
        this.f35450.mo14971(10);
    }

    @Override // l.InterfaceC22265
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo28460() {
        this.f35450.mo14971(26);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28449(C7445 c7445) {
        this.f35450.mo14963(16, c7445).mo21395();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m28457() {
        this.f35450.mo14971(34);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28444(int i) {
        this.f35450.mo14961(33, i, 0).mo21395();
    }

    @Override // l.InterfaceC19830
    /* JADX INFO: renamed from: ۙ */
    public final void mo24942(long j, long j2, C15648 c15648, MediaFormat mediaFormat) {
        if (this.f35484) {
            this.f35450.mo14960(37).mo21395();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        C8402 c8402;
        C0054 c0054M25386;
        int i2 = 1000;
        try {
            int i3 = message.what;
            C11853 c11853 = this.f35472;
            switch (i3) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    this.f35439.m31543(1);
                    m28376(c11853.m29698(this.f35485.f56668, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    m28422();
                    break;
                case 3:
                    m28384((C1546) message.obj, true);
                    break;
                case 4:
                    m28410((C7445) message.obj);
                    break;
                case 5:
                    m28387((C9221) message.obj);
                    break;
                case 6:
                    m28401(false, true);
                    break;
                case 7:
                    m28383((C0645) message.obj);
                    return true;
                case 8:
                    m28411((InterfaceC9147) message.obj);
                    break;
                case 9:
                    m28431((InterfaceC9147) message.obj);
                    break;
                case 10:
                    m28441();
                    break;
                case 11:
                    m28425(message.arg1);
                    break;
                case 12:
                    m28417(message.arg1 != 0);
                    break;
                case 13:
                    m28400(message.arg1 != 0, (C0645) message.obj);
                    break;
                case 14:
                    m28413((C20410) message.obj);
                    break;
                case 15:
                    m28437((C20410) message.obj);
                    break;
                case 16:
                    C7445 c7445 = (C7445) message.obj;
                    m28385(c7445, c7445.f24500, true, false);
                    break;
                case 17:
                    m28395((C22429) message.obj);
                    break;
                case 18:
                    m28396((C22429) message.obj, message.arg1);
                    break;
                case 19:
                    m28392((C19445) message.obj);
                    break;
                case 20:
                    m28378(message.arg1, message.arg2, (InterfaceC19764) message.obj);
                    break;
                case 21:
                    m28393((InterfaceC19764) message.obj);
                    break;
                case 22:
                    m28416();
                    break;
                case 23:
                    m28426(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    m28415();
                    break;
                case 26:
                    m28441();
                    m28438(true);
                    break;
                case 27:
                    m28377(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    m28390((C14090) message.obj);
                    break;
                case 29:
                    m28406();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    m28381(pair.first, (C0645) pair.second);
                    break;
                case 31:
                    m28391((C18412) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    float fFloatValue = ((Float) message.obj).floatValue();
                    this.f35436 = fFloatValue;
                    float fM29697 = fFloatValue * c11853.m29697();
                    for (C7731 c7731 : this.f35451) {
                        c7731.m21027(fM29697);
                    }
                    break;
                case 33:
                    m28408(message.arg1);
                    break;
                case 34:
                    m28423();
                    break;
                case 35:
                    m28394((InterfaceC19830) message.obj);
                    break;
                case 36:
                    m28420(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.f35484 = false;
                    C1546 c1546 = this.f35432;
                    if (c1546 != null) {
                        m28384(c1546, false);
                        this.f35432 = null;
                    }
                    break;
                case 38:
                    m28430((C1019) message.obj);
                    break;
            }
        } catch (RuntimeException e) {
            C18566 c18566M43144 = C18566.m43144(e, ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
            C1896.m6516("Playback error", c18566M43144);
            m28401(true, false);
            this.f35485 = this.f35485.m40925(c18566M43144);
        } catch (C2684 e2) {
            m28380(e2, b.c);
        } catch (C2970 e3) {
            boolean z2 = e3.f9662;
            int i5 = e3.f9663;
            if (i5 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else if (i5 == 4) {
                i2 = z2 ? 3002 : 3004;
            }
            m28380(e3, i2);
        } catch (C5976 e4) {
            m28380(e4, e4.f20473);
        } catch (C18566 e5) {
            C18566 c18566M43146 = e5;
            int i6 = c18566M43146.f60329;
            C9748 c9748 = this.f35473;
            if (i6 == 1 && (c0054M25386 = c9748.m25386()) != null && c18566M43146.f60326 == null) {
                c18566M43146 = c18566M43146.m43146(c0054M25386.f918.f24821);
            }
            int i7 = c18566M43146.f60329;
            InterfaceC4879 interfaceC4879 = this.f35450;
            if (i7 == 1 && (c8402 = c18566M43146.f60326) != null && m28404(c18566M43146.f60330, c8402)) {
                this.f35463 = true;
                m28442();
                C0054 c0054M25399 = c9748.m25399();
                C0054 c0054M25404 = c9748.m25404();
                if (c9748.m25404() != c0054M25399) {
                    while (c0054M25404 != null && c0054M25404.m963() != c0054M25399) {
                        c0054M25404 = c0054M25404.m963();
                    }
                }
                c9748.m25387(c0054M25404);
                if (this.f35485.f56668 != 4) {
                    m28440();
                    interfaceC4879.mo14971(2);
                }
            } else {
                C18566 c18566 = this.f35471;
                if (c18566 != null) {
                    c18566.addSuppressed(c18566M43146);
                    c18566M43146 = this.f35471;
                }
                C18566 c18567 = c18566M43146;
                if (c18567.f60329 == 1 && c9748.m25404() != c9748.m25386()) {
                    while (c9748.m25404() != c9748.m25386()) {
                        c9748.m25391();
                    }
                    C0054 c0054M25405 = c9748.m25404();
                    C20782.m47562(c0054M25405);
                    m28427();
                    C7512 c7512 = c0054M25405.f918;
                    C8402 c8403 = c7512.f24821;
                    long j = c7512.f24822;
                    this.f35485 = m28375(c8403, j, c7512.f24818, j, true, 0);
                }
                if (c18567.f60331 && (this.f35471 == null || (i = c18567.f29167) == 5004 || i == 5003)) {
                    C1896.m6514("Recoverable renderer error", c18567);
                    if (this.f35471 == null) {
                        this.f35471 = c18567;
                    }
                    interfaceC4879.mo14967(interfaceC4879.mo14963(25, c18567));
                } else {
                    C1896.m6516("Playback error", c18567);
                    m28401(true, false);
                    this.f35485 = this.f35485.m40925(c18567);
                }
            }
        } catch (C21945 e6) {
            m28380(e6, e6.f70831);
        } catch (IOException e7) {
            m28380(e7, 2000);
        }
        m28427();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28380(IOException iOException, int i) {
        C18566 c18566M43143 = C18566.m43143(iOException, i);
        C0054 c0054M25404 = this.f35473.m25404();
        if (c0054M25404 != null) {
            c18566M43143 = c18566M43143.m43146(c0054M25404.f918.f24821);
        }
        C1896.m6516("Playback error", c18566M43143);
        m28401(false, false);
        this.f35485 = this.f35485.m40925(c18566M43143);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m28419(int i) {
        C17426 c17426 = this.f35485;
        if (c17426.f56668 != i) {
            if (i != 2) {
                this.f35486 = -9223372036854775807L;
            }
            if (i != 3 && c17426.f56679) {
                this.f35485 = c17426.m40930(false);
            }
            this.f35485 = this.f35485.m40920(i);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m28427() {
        this.f35439.m31544(this.f35485);
        if (this.f35439.f40762) {
            C8782.m23535(this.f35478.f42356, this.f35439);
            this.f35439 = new C12732(this.f35485);
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private void m28406() {
        this.f35439.m31543(1);
        m28402(false, false, false, true);
        this.f35483.mo47587(this.f35440);
        m28419(this.f35485.f56676.m55264() ? 4 : 2);
        C17426 c17426 = this.f35485;
        boolean z = c17426.f56671;
        m28376(this.f35472.m29698(c17426.f56668, z), c17426.f56681, c17426.f56670, z);
        this.f35467.m39438(this.f35448.mo11743());
        this.f35450.mo14971(2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28395(C22429 c22429) throws Throwable {
        this.f35439.m31543(1);
        if (c22429.f72626 != -1) {
            this.f35458 = new C1546(new C6240(c22429.f72623, c22429.f72624), c22429.f72626, c22429.f72625);
        }
        m28399(this.f35467.m39436(c22429.f72623, c22429.f72624), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28396(C22429 c22429, int i) throws Throwable {
        this.f35439.m31543(1);
        C16680 c16680 = this.f35467;
        if (i == -1) {
            i = c16680.m39440();
        }
        m28399(c16680.m39435(i, c22429.f72623, c22429.f72624), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28392(C19445 c19445) throws Throwable {
        this.f35439.m31543(1);
        c19445.getClass();
        m28399(this.f35467.m39442(), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28378(int i, int i2, InterfaceC19764 interfaceC19764) throws Throwable {
        this.f35439.m31543(1);
        m28399(this.f35467.m39434(i, i2, interfaceC19764), false);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m28416() throws Throwable {
        m28399(this.f35467.m39432(), true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28393(InterfaceC19764 interfaceC19764) throws Throwable {
        this.f35439.m31543(1);
        m28399(this.f35467.m39437(interfaceC19764), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28377(int i, int i2, List list) throws Throwable {
        this.f35439.m31543(1);
        m28399(this.f35467.m39433(i, i2, list), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28391(C18412 c18412, boolean z) {
        this.f35444.mo27986(c18412);
        if (!z) {
            c18412 = null;
        }
        C11853 c11853 = this.f35472;
        c11853.m29699(c18412);
        C17426 c17426 = this.f35485;
        boolean z2 = c17426.f56671;
        m28376(c11853.m29698(c17426.f56668, z2), c17426.f56681, c17426.f56670, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28376(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = 0;
        }
        C17426 c17426 = this.f35485;
        if (c17426.f56671 == z2 && c17426.f56681 == i2 && c17426.f56670 == i3) {
            return;
        }
        this.f35485 = c17426.m40921(i3, i2, z2);
        m28433(false, false);
        C9748 c9748 = this.f35473;
        for (C0054 c0054M25404 = c9748.m25404(); c0054M25404 != null; c0054M25404 = c0054M25404.m963()) {
            for (InterfaceC1470 interfaceC1470 : c0054M25404.m961().f74677) {
                if (interfaceC1470 != null) {
                    interfaceC1470.mo5251(z2);
                }
            }
        }
        if (!m28418()) {
            m28424();
            m28407();
            C17426 c17427 = this.f35485;
            if (c17427.f56679) {
                this.f35485 = c17427.m40930(false);
            }
            c9748.m25397(this.f35453);
            return;
        }
        int i4 = this.f35485.f56668;
        InterfaceC4879 interfaceC4879 = this.f35450;
        if (i4 == 3) {
            this.f35476.m18569();
            m28428();
            interfaceC4879.mo14971(2);
        } else if (i4 == 2) {
            interfaceC4879.mo14971(2);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m28426(boolean z) {
        this.f35435 = z;
        m28365();
        if (this.f35470) {
            C9748 c9748 = this.f35473;
            if (c9748.m25386() != c9748.m25404()) {
                m28438(true);
                m28414(false);
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m28425(int i) {
        this.f35447 = i;
        int iM25388 = this.f35473.m25388(this.f35485.f56676, i);
        if ((iM25388 & 1) != 0) {
            m28438(true);
        } else if ((iM25388 & 2) != 0) {
            m28442();
        }
        m28414(false);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m28417(boolean z) {
        this.f35462 = z;
        int iM25390 = this.f35473.m25390(this.f35485.f56676, z);
        if ((iM25390 & 1) != 0) {
            m28438(true);
        } else if ((iM25390 & 2) != 0) {
            m28442();
        }
        m28414(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28390(C14090 c14090) {
        this.f35466 = c14090;
        this.f35473.m25398(this.f35485.f56676, c14090);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m28438(boolean z) {
        C8402 c8402 = this.f35473.m25404().f918.f24821;
        long jM28369 = m28369(c8402, this.f35485.f56674, true, false);
        if (jM28369 != this.f35485.f56674) {
            C17426 c17426 = this.f35485;
            this.f35485 = m28375(c8402, jM28369, c17426.f56672, c17426.f56677, z, 5);
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m28428() {
        C0054 c0054M25404 = this.f35473.m25404();
        if (c0054M25404 == null) {
            return;
        }
        C23011 c23011M961 = c0054M25404.m961();
        int i = 0;
        while (true) {
            C7731[] c7731Arr = this.f35451;
            if (i >= c7731Arr.length) {
                return;
            }
            if (c23011M961.m51902(i)) {
                c7731Arr[i].m21060();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m28424() {
        this.f35476.m18572();
        for (C7731 c7731 : this.f35451) {
            c7731.m21050();
        }
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, l.ۡۙ᩷] */
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m28407() {
        C0054 c0054M25404 = this.f35473.m25404();
        if (c0054M25404 == null) {
            return;
        }
        long jMo6410 = c0054M25404.f914 ? c0054M25404.f925.mo6410() : -9223372036854775807L;
        if (jMo6410 != -9223372036854775807L) {
            if (!c0054M25404.m960()) {
                this.f35473.m25387(c0054M25404);
                m28414(false);
                m28440();
            }
            m28429(jMo6410);
            if (jMo6410 != this.f35485.f56674) {
                C17426 c17426 = this.f35485;
                this.f35485 = m28375(c17426.f56675, jMo6410, c17426.f56672, jMo6410, true, 5);
            }
        } else {
            long jM18568 = this.f35476.m18568(c0054M25404 != this.f35473.m25386());
            this.f35453 = jM18568;
            long jM958 = c0054M25404.m958(jM18568);
            long j = this.f35485.f56674;
            if (!this.f35487.isEmpty() && !this.f35485.f56675.m22581()) {
                if (this.f35454) {
                    j--;
                    this.f35454 = false;
                }
                C17426 c17427 = this.f35485;
                int iMo1588 = c17427.f56676.mo1588(c17427.f56675.f27520);
                int iMin = Math.min(this.f35461, this.f35487.size());
                C14969 c14969 = iMin > 0 ? (C14969) this.f35487.get(iMin - 1) : null;
                while (c14969 != null && (iMo1588 < 0 || (iMo1588 == 0 && 0 > j))) {
                    int i = iMin - 1;
                    c14969 = i > 0 ? (C14969) this.f35487.get(iMin - 2) : null;
                    iMin = i;
                }
                if (iMin < this.f35487.size()) {
                }
                this.f35461 = iMin;
            }
            if (this.f35476.mo8398()) {
                boolean z = !this.f35439.f40761;
                C17426 c17428 = this.f35485;
                this.f35485 = m28375(c17428.f56675, jM958, c17428.f56672, jM958, z, 6);
            } else {
                C17426 c17429 = this.f35485;
                c17429.f56674 = jM958;
                c17429.f56673 = SystemClock.elapsedRealtime();
            }
        }
        this.f35485.f56664 = this.f35473.m25406().m949();
        C17426 c174210 = this.f35485;
        c174210.f56669 = m28367(c174210.f56664);
        C17426 c174211 = this.f35485;
        if (c174211.f56671 && c174211.f56668 == 3 && m28405(c174211.f56676, c174211.f56675)) {
            C17426 c174212 = this.f35485;
            if (c174212.f56662.f24500 == 1.0f) {
                float fM53060 = ((C23788) this.f35456).m53060(m28370(c174212.f56676, c174212.f56675.f27520, c174212.f56674), this.f35485.f56669);
                if (this.f35476.mo8397().f24500 != fM53060) {
                    C7445 c7445 = new C7445(fM53060, this.f35485.f56662.f24499);
                    this.f35450.mo14969(16);
                    this.f35476.mo8396(c7445);
                    m28385(this.f35485.f56662, this.f35476.mo8397().f24500, false, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m28410(C7445 c7445) {
        this.f35450.mo14969(16);
        C6634 c6634 = this.f35476;
        c6634.mo8396(c7445);
        C7445 c7445Mo8397 = c6634.mo8397();
        m28385(c7445Mo8397, c7445Mo8397.f24500, true, true);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:123:0x0203 A[LOOP:3: B:122:0x0201->B:123:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x0211 A[EDGE_INSN: B:126:0x0211->B:89:0x0160 BREAK  A[LOOP:1: B:73:0x0127->B:78:0x0133]] */
    /* JADX WARN: Code duplicated, block: B:127:0x021d A[EDGE_INSN: B:127:0x021d->B:89:0x0160 BREAK  A[LOOP:1: B:73:0x0127->B:78:0x0133]] */
    /* JADX WARN: Code duplicated, block: B:128:0x0220  */
    /* JADX WARN: Code duplicated, block: B:130:0x0225 A[LOOP:13: B:129:0x0223->B:130:0x0225, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:213:0x0364  */
    /* JADX WARN: Code duplicated, block: B:286:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:288:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:290:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:293:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:294:0x04be  */
    /* JADX WARN: Code duplicated, block: B:296:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:297:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:300:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:303:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:306:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:309:0x0502  */
    /* JADX WARN: Code duplicated, block: B:312:0x0508  */
    /* JADX WARN: Code duplicated, block: B:314:0x050b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:319:0x054c  */
    /* JADX WARN: Code duplicated, block: B:321:0x0559  */
    /* JADX WARN: Code duplicated, block: B:322:0x0565  */
    /* JADX WARN: Code duplicated, block: B:325:0x056e  */
    /* JADX WARN: Code duplicated, block: B:333:0x058a  */
    /* JADX WARN: Code duplicated, block: B:335:0x0592  */
    /* JADX WARN: Code duplicated, block: B:337:0x059c  */
    /* JADX WARN: Code duplicated, block: B:339:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:346:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:349:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:351:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:362:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:364:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:365:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:367:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:368:0x0608  */
    /* JADX WARN: Code duplicated, block: B:375:0x0626  */
    /* JADX WARN: Code duplicated, block: B:382:0x0632  */
    /* JADX WARN: Code duplicated, block: B:385:0x0639  */
    /* JADX WARN: Code duplicated, block: B:401:0x0660  */
    /* JADX WARN: Code duplicated, block: B:439:0x05d0 A[EDGE_INSN: B:439:0x05d0->B:353:0x05d0 BREAK  A[LOOP:10: B:347:0x05bd->B:352:0x05cd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x05cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x05a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x015d A[EDGE_INSN: B:88:0x015d->B:89:0x0160 BREAK  A[LOOP:1: B:73:0x0127->B:78:0x0133]] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b3 A[PHI: r2
      0x01b3: PHI (r2v48 long) = (r2v47 long), (r2v60 long) binds: [B:98:0x01b1, B:94:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x01fb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:128:0x0220, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:335:0x0592, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, l.ۡۙ᩷] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, l.ۡۙ᩷] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.Object, l.ۡۙ᩷] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, l.ۡۙ᩷] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, l.ۡۙ᩷] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m28422() {
        long j;
        ?? r0;
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        boolean z4;
        C17426 c17426;
        C0054 c0054M25404;
        int i;
        C9748 c9748;
        C0054 c0054M25405;
        long jM53061;
        C0054 c0054M25406;
        boolean z5;
        boolean z6;
        boolean zMo47589;
        boolean z7;
        boolean z8;
        C17426 c17427;
        int i2;
        int i3;
        C7731[] c7731Arr;
        C17426 c17428;
        C0054 c0054M25407;
        C0054 c0054M963;
        boolean z9;
        boolean z10;
        int i4;
        long j3;
        boolean z11;
        long jM966;
        int i5;
        int i6;
        boolean zM51902;
        C0054 c0054M25399;
        C7512 c7512M25394;
        long jMo2211 = this.f35474.mo2211();
        this.f35450.mo14969(2);
        boolean z12 = this.f35446;
        C7731[] c7731Arr2 = this.f35451;
        C9748 c9749 = this.f35473;
        if (this.f35485.f56676.m55264() || !this.f35467.m39444()) {
            j = jMo2211;
            r0 = 0;
            z = true;
        } else {
            c9749.m25397(this.f35453);
            if (c9749.m25405() && (c7512M25394 = c9749.m25394(this.f35453, this.f35485)) != null) {
                long j4 = c7512M25394.f24822;
                C0054 c0054M25392 = c9749.m25392(c7512M25394);
                if (!c0054M25392.f917) {
                    c0054M25392.f917 = true;
                    c0054M25392.f925.mo6409(this, j4);
                } else if (c0054M25392.f914) {
                    this.f35450.mo14963(8, c0054M25392.f925).mo21395();
                }
                if (c9749.m25404() == c0054M25392) {
                    m28429(j4);
                }
                m28414(false);
            }
            if (this.f35468) {
                this.f35468 = m28434(c9749.m25406());
                m28362();
            } else {
                m28440();
            }
            if (!this.f35470 && z12 && !this.f35463 && !m28363() && (c0054M25399 = c9749.m25399()) != null && c0054M25399 == c9749.m25386() && c0054M25399.m963() != null && c0054M25399.m963().f914) {
                c9749.m25407();
                C0054 c0054M253910 = c9749.m25399();
                if (c0054M253910 != null) {
                    C23011 c23011M961 = c0054M253910.m961();
                    for (int i7 = 0; i7 < c7731Arr2.length; i7++) {
                        if (c23011M961.m51902(i7) && c7731Arr2[i7].m21058() && !c7731Arr2[i7].m21047()) {
                            c7731Arr2[i7].m21049();
                            m28382(c0054M253910, i7, false, c0054M253910.m966());
                        }
                    }
                    if (m28363()) {
                        this.f35480 = c0054M253910.f925.mo6410();
                        if (!c0054M253910.m960()) {
                            c9749.m25387(c0054M253910);
                            m28414(false);
                            m28440();
                        }
                    }
                }
            }
            C0054 c0054M25386 = c9749.m25386();
            if (c0054M25386 == null) {
                j = jMo2211;
                break;
            }
            if (c0054M25386.m963() == null || this.f35470) {
                j = jMo2211;
                if (c0054M25386.f918.f24827 || this.f35470) {
                    for (C7731 c7731 : c7731Arr2) {
                        if (c7731.m21048(c0054M25386) && c7731.m21059(c0054M25386)) {
                            long j5 = c0054M25386.f918.f24819;
                            c7731.m21056(c0054M25386, (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? -9223372036854775807L : c0054M25386.m957() + c0054M25386.f918.f24819);
                        }
                    }
                }
            } else {
                C0054 c0054M25387 = c9749.m25386();
                if (!c0054M25387.f914) {
                    j = jMo2211;
                    break;
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= c7731Arr2.length) {
                        if ((!m28363() || c9749.m25399() != c9749.m25386()) && (c0054M25386.m963().f914 || this.f35453 >= c0054M25386.m963().m966())) {
                            C23011 c23011M962 = c0054M25386.m961();
                            C0054 c0054M25400 = c9749.m25400();
                            C23011 c23011M963 = c0054M25400.m961();
                            AbstractC24755 abstractC24755 = this.f35485.f56676;
                            j = jMo2211;
                            m28397(abstractC24755, c0054M25400.f918.f24821, abstractC24755, c0054M25386.f918.f24821, -9223372036854775807L, false);
                            if (!c0054M25400.f914) {
                                for (C7731 c7732 : c7731Arr2) {
                                    c7732.m21038(c23011M962, c23011M963, c0054M25400.m966());
                                }
                                break;
                            }
                            if (z12) {
                                j3 = -9223372036854775807L;
                                if (this.f35480 != -9223372036854775807L) {
                                    this.f35480 = j3;
                                    if (z12 || this.f35463) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        for (i6 = 0; i6 < c7731Arr2.length; i6++) {
                                            zM51902 = c23011M963.m51902(i6);
                                            InterfaceC1470[] interfaceC1470Arr = c23011M963.f74677;
                                            if (!zM51902 && c7731Arr2[i6].m21042() != -2 && !C9681.m25253(interfaceC1470Arr[i6].mo5254().f50848, interfaceC1470Arr[i6].mo5254().f50836) && !c7731Arr2[i6].m21047()) {
                                                z11 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z11) {
                                        jM966 = c0054M25400.m966();
                                        for (C7731 c7733 : c7731Arr2) {
                                            c7733.m21029(jM966);
                                        }
                                        if (c0054M25400.m960()) {
                                            c9749.m25387(c0054M25400);
                                            m28414(false);
                                            m28440();
                                            break;
                                        }
                                        break;
                                    }
                                    while (i4 < r1) {
                                        c7732.m21038(c23011M962, c23011M963, c0054M25400.m966());
                                    }
                                    break;
                                    break;
                                }
                            } else {
                                j3 = -9223372036854775807L;
                            }
                            if (c0054M25400.f925.mo6410() != j3) {
                                this.f35480 = j3;
                                if (z12) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    while (i6 < c7731Arr2.length) {
                                        zM51902 = c23011M963.m51902(i6);
                                        InterfaceC1470[] interfaceC1470Arr2 = c23011M963.f74677;
                                        if (!zM51902) {
                                        }
                                    }
                                }
                                if (!z11) {
                                    jM966 = c0054M25400.m966();
                                    while (i5 < r2) {
                                        c7733.m21029(jM966);
                                    }
                                    if (c0054M25400.m960()) {
                                        break;
                                        break;
                                    }
                                    c9749.m25387(c0054M25400);
                                    m28414(false);
                                    m28440();
                                    break;
                                }
                                while (i4 < r1) {
                                    c7732.m21038(c23011M962, c23011M963, c0054M25400.m966());
                                }
                                break;
                                break;
                            }
                            while (i4 < r1) {
                                c7732.m21038(c23011M962, c23011M963, c0054M25400.m966());
                            }
                            break;
                            break;
                        }
                    } else if (c7731Arr2[i8].m21043(c0054M25387)) {
                        i8++;
                    }
                    j = jMo2211;
                    break;
                }
            }
            boolean z13 = false;
            C0054 c0054M25388 = c9749.m25386();
            if (c0054M25388 != null && c9749.m25404() != c0054M25388 && !c0054M25388.f916) {
                C0054 c0054M25389 = c9749.m25386();
                C23011 c23011M964 = c0054M25389.m961();
                boolean z14 = true;
                for (int i9 = 0; i9 < c7731Arr2.length; i9++) {
                    int iM21053 = c7731Arr2[i9].m21053();
                    int iM21024 = c7731Arr2[i9].m21024(c0054M25389, c23011M964, this.f35476);
                    if ((iM21024 & 2) != 0 && (z10 = this.f35443) && z10) {
                        this.f35443 = false;
                        if (this.f35485.f56679) {
                            this.f35450.mo14971(2);
                        }
                    }
                    this.f35452 -= iM21053 - c7731Arr2[i9].m21053();
                    z14 &= (iM21024 & 1) != 0;
                }
                if (z14) {
                    for (int i10 = 0; i10 < c7731Arr2.length; i10++) {
                        if (c23011M964.m51902(i10) && !c7731Arr2[i10].m21048(c0054M25389)) {
                            m28382(c0054M25389, i10, false, c0054M25389.m966());
                        }
                    }
                }
                if (z14) {
                    c9749.m25386().f916 = true;
                }
            }
            boolean z15 = false;
            while (m28418() && !this.f35470 && (c0054M25407 = c9749.m25404()) != null && (c0054M963 = c0054M25407.m963()) != null && this.f35453 >= c0054M963.m966() && c0054M963.f916) {
                if (z15) {
                    m28427();
                }
                this.f35463 = z13;
                C0054 c0054M25391 = c9749.m25391();
                c0054M25391.getClass();
                if (this.f35485.f56675.f27520.equals(c0054M25391.f918.f24821.f27520)) {
                    C8402 c8402 = this.f35485.f56675;
                    if (c8402.f27516 == -1) {
                        C8402 c8403 = c0054M25391.f918.f24821;
                        if (c8403.f27516 != -1 || c8402.f27517 == c8403.f27517) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                    } else {
                        z9 = false;
                    }
                } else {
                    z9 = false;
                }
                C7512 c7512 = c0054M25391.f918;
                C8402 c8404 = c7512.f24821;
                long j6 = c7512.f24822;
                this.f35485 = m28375(c8404, j6, c7512.f24818, j6, !z9, 0);
                m28365();
                m28407();
                if (m28363() && c0054M25391 == c9749.m25399()) {
                    for (C7731 c7734 : c7731Arr2) {
                        c7734.m21041();
                    }
                }
                if (this.f35485.f56668 == 3) {
                    m28428();
                }
                C23011 c23011M965 = c9749.m25404().m961();
                for (int i11 = 0; i11 < c7731Arr2.length; i11++) {
                    if (c23011M965.m51902(i11)) {
                        c7731Arr2[i11].m21026();
                    }
                }
                z15 = true;
                z13 = false;
            }
            r0 = 0;
            z = true;
            this.f35466.getClass();
        }
        int i12 = this.f35485.f56668;
        if (i12 == z || i12 == 4) {
            return;
        }
        C0054 c0054M25408 = this.f35473.m25404();
        if (c0054M25408 != null) {
            long j7 = j;
            Trace.beginSection("doSomeWork");
            m28407();
            if (c0054M25408.f914) {
                this.f35434 = C7116.m19474(this.f35474.mo2210());
                c0054M25408.f925.mo6405(this.f35485.f56674 - this.f35431, this.f35442);
                int i13 = 0;
                z2 = true;
                z3 = true;
                while (true) {
                    C7731[] c7731Arr3 = this.f35451;
                    if (i13 >= c7731Arr3.length) {
                        break;
                    }
                    C7731 c7735 = c7731Arr3[i13];
                    if (c7735.m21053() == 0) {
                        m28379(i13, (boolean) r0);
                    } else {
                        c7735.m21055(this.f35453, this.f35434);
                        z3 = z3 && c7735.m21051();
                        boolean zM21040 = c7735.m21040(c0054M25408);
                        m28379(i13, zM21040);
                        z2 = z2 && zM21040;
                        if (!zM21040) {
                            m28436(i13);
                        }
                    }
                    i13++;
                }
            } else {
                c0054M25408.f925.mo6412();
                z2 = true;
                z3 = true;
            }
            long j8 = c0054M25408.f918.f24819;
            if (z3 && c0054M25408.f914) {
                j2 = -9223372036854775807L;
                z4 = j8 == -9223372036854775807L || j8 <= this.f35485.f56674;
                if (z4 && this.f35470) {
                    this.f35470 = r0;
                    int i14 = this.f35485.f56681;
                    this.f35439.m31543((int) r0);
                    m28376(this.f35472.m29698(this.f35485.f56668, (boolean) r0), i14, 5, (boolean) r0);
                }
                if (!z4 && c0054M25408.f918.f24827) {
                    m28419(4);
                    m28424();
                    j7 = j7;
                } else {
                    c17426 = this.f35485;
                    if (c17426.f56668 == 2) {
                        c9748 = this.f35473;
                        if (this.f35452 == 0) {
                            zMo47589 = m28421();
                        } else {
                            if (!z2) {
                                zMo47589 = false;
                            } else if (c17426.f56667) {
                                c0054M25405 = c9748.m25404();
                                if (m28405(this.f35485.f56676, c0054M25405.f918.f24821)) {
                                    jM53061 = ((C23788) this.f35456).m53061();
                                } else {
                                    jM53061 = j2;
                                }
                                c0054M25406 = c9748.m25406();
                                if (c0054M25406.m960() || !c0054M25406.f918.f24827) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                if (c0054M25406.f918.f24821.m22581() || c0054M25406.f914) {
                                    z6 = false;
                                } else {
                                    z6 = true;
                                }
                                if (z5 && !z6) {
                                    long jM28367 = m28367(c0054M25406.m949());
                                    InterfaceC23175 interfaceC23175 = this.f35483;
                                    C20738 c20738 = this.f35440;
                                    AbstractC24755 abstractC24756 = this.f35485.f56676;
                                    C8402 c8405 = c0054M25405.f918.f24821;
                                    long jM958 = c0054M25405.m958(this.f35453);
                                    float f = this.f35476.mo8397().f24500;
                                    boolean z16 = this.f35485.f56671;
                                    zMo47589 = interfaceC23175.mo47589(new C15715(c20738, abstractC24756, c8405, jM958, jM28367, f, this.f35441, jM53061));
                                }
                            }
                            if (zMo47589) {
                                m28419(3);
                                this.f35471 = null;
                                if (m28418()) {
                                    m28433(r0, r0);
                                    this.f35476.m18569();
                                    m28428();
                                }
                            }
                        }
                        if (zMo47589) {
                            m28419(3);
                            this.f35471 = null;
                            if (m28418()) {
                                m28433(r0, r0);
                                this.f35476.m18569();
                                m28428();
                            }
                        }
                    } else {
                        j7 = j7;
                    }
                    if (this.f35485.f56668 == 3 && (this.f35452 != 0 ? !z2 : !m28421())) {
                        m28433(m28418(), r0);
                        m28419(2);
                        if (this.f35441) {
                            for (c0054M25404 = this.f35473.m25404(); c0054M25404 != null; c0054M25404 = c0054M25404.m963()) {
                                for (InterfaceC1470 interfaceC1470 : c0054M25404.m961().f74677) {
                                    if (interfaceC1470 != null) {
                                        interfaceC1470.mo5256();
                                    }
                                }
                            }
                            ((C23788) this.f35456).m53064();
                        }
                        m28424();
                    }
                }
                if (this.f35485.f56668 == 2) {
                    i3 = 0;
                    while (true) {
                        c7731Arr = this.f35451;
                        if (i3 < c7731Arr.length) {
                            break;
                        }
                        if (c7731Arr[i3].m21048(c0054M25408)) {
                            m28436(i3);
                        }
                        i3++;
                    }
                    c17428 = this.f35485;
                    if (c17428.f56667 && c17428.f56669 < 500000 && m28434(this.f35473.m25406()) && m28418()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else {
                    z7 = false;
                }
                if (!z7) {
                    this.f35486 = j2;
                } else if (this.f35486 == j2) {
                    this.f35486 = this.f35474.mo2210();
                } else if (this.f35474.mo2210() - this.f35486 >= 4000) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
                if (m28418() || this.f35485.f56668 != 3) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (this.f35443 || !this.f35464 || !z8) {
                    z = false;
                }
                c17427 = this.f35485;
                if (c17427.f56679 != z) {
                    this.f35485 = c17427.m40930(z);
                }
                this.f35464 = r0;
                if (!z && (i2 = this.f35485.f56668) != 4 && (z8 || i2 == 2 || (i2 == 3 && this.f35452 != 0))) {
                    m28409(j7);
                }
                Trace.endSection();
                return;
            }
            j2 = -9223372036854775807L;
            if (z4) {
                this.f35470 = r0;
                int i15 = this.f35485.f56681;
                this.f35439.m31543((int) r0);
                m28376(this.f35472.m29698(this.f35485.f56668, (boolean) r0), i15, 5, (boolean) r0);
            }
            if (!z4) {
                c17426 = this.f35485;
                if (c17426.f56668 == 2) {
                    c9748 = this.f35473;
                    if (this.f35452 == 0) {
                        zMo47589 = m28421();
                    } else {
                        if (!z2) {
                            zMo47589 = false;
                        } else if (c17426.f56667) {
                            c0054M25405 = c9748.m25404();
                            if (m28405(this.f35485.f56676, c0054M25405.f918.f24821)) {
                                jM53061 = ((C23788) this.f35456).m53061();
                            } else {
                                jM53061 = j2;
                            }
                            c0054M25406 = c9748.m25406();
                            if (c0054M25406.m960()) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (c0054M25406.f918.f24821.m22581()) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            zMo47589 = z5 ? true : true;
                        }
                        if (zMo47589) {
                            m28419(3);
                            this.f35471 = null;
                            if (m28418()) {
                                m28433(r0, r0);
                                this.f35476.m18569();
                                m28428();
                            }
                        }
                    }
                    if (zMo47589) {
                        m28419(3);
                        this.f35471 = null;
                        if (m28418()) {
                            m28433(r0, r0);
                            this.f35476.m18569();
                            m28428();
                        }
                    }
                } else {
                    j7 = j7;
                }
                if (this.f35485.f56668 == 3) {
                    m28433(m28418(), r0);
                    m28419(2);
                    if (this.f35441) {
                        while (c0054M25404 != null) {
                            while (i < r5) {
                                if (interfaceC1470 != null) {
                                    interfaceC1470.mo5256();
                                }
                            }
                        }
                        ((C23788) this.f35456).m53064();
                    }
                    m28424();
                }
            } else {
                c17426 = this.f35485;
                if (c17426.f56668 == 2) {
                    c9748 = this.f35473;
                    if (this.f35452 == 0) {
                        zMo47589 = m28421();
                    } else {
                        if (!z2) {
                            zMo47589 = false;
                        } else if (c17426.f56667) {
                            c0054M25405 = c9748.m25404();
                            if (m28405(this.f35485.f56676, c0054M25405.f918.f24821)) {
                                jM53061 = ((C23788) this.f35456).m53061();
                            } else {
                                jM53061 = j2;
                            }
                            c0054M25406 = c9748.m25406();
                            if (c0054M25406.m960()) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (c0054M25406.f918.f24821.m22581()) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (z5) {
                            }
                        }
                        if (zMo47589) {
                            m28419(3);
                            this.f35471 = null;
                            if (m28418()) {
                                m28433(r0, r0);
                                this.f35476.m18569();
                                m28428();
                            }
                        }
                    }
                    if (zMo47589) {
                        m28419(3);
                        this.f35471 = null;
                        if (m28418()) {
                            m28433(r0, r0);
                            this.f35476.m18569();
                            m28428();
                        }
                    }
                } else {
                    j7 = j7;
                }
                if (this.f35485.f56668 == 3) {
                    m28433(m28418(), r0);
                    m28419(2);
                    if (this.f35441) {
                        while (c0054M25404 != null) {
                            while (i < r5) {
                                if (interfaceC1470 != null) {
                                    interfaceC1470.mo5256();
                                }
                            }
                        }
                        ((C23788) this.f35456).m53064();
                    }
                    m28424();
                }
            }
            if (this.f35485.f56668 == 2) {
                i3 = 0;
                while (true) {
                    c7731Arr = this.f35451;
                    if (i3 < c7731Arr.length) {
                        break;
                        break;
                    } else {
                        if (c7731Arr[i3].m21048(c0054M25408)) {
                            m28436(i3);
                        }
                        i3++;
                    }
                }
                c17428 = this.f35485;
                if (c17428.f56667) {
                    z7 = false;
                } else {
                    z7 = false;
                }
            } else {
                z7 = false;
            }
            if (!z7) {
                this.f35486 = j2;
            } else if (this.f35486 == j2) {
                this.f35486 = this.f35474.mo2210();
            } else if (this.f35474.mo2210() - this.f35486 >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
            if (m28418()) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (this.f35443) {
                z = false;
            } else {
                z = false;
            }
            c17427 = this.f35485;
            if (c17427.f56679 != z) {
                this.f35485 = c17427.m40930(z);
            }
            this.f35464 = r0;
            if (!z) {
                m28409(j7);
            }
            Trace.endSection();
            return;
        }
        m28409(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28379(final int i, final boolean z) {
        boolean[] zArr = this.f35438;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.f35479.mo14966(new Runnable() { // from class: l.ۜܿۙ
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    boolean z2 = z;
                    C11240 c11240 = this.f24010;
                    c11240.f35465.mo7202(i2, c11240.f35451[i2].m21042(), z2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m28370(AbstractC24755 abstractC24755, Object obj, long j) {
        long jElapsedRealtime;
        C1634 c1634 = this.f35469;
        int i = abstractC24755.mo15535(obj, c1634).f5657;
        C11328 c11328 = this.f35459;
        abstractC24755.m55263(i, c11328);
        if (c11328.f35685 == -9223372036854775807L || !c11328.m28620() || !c11328.f35695) {
            return -9223372036854775807L;
        }
        long j2 = c11328.f35688;
        if (j2 == -9223372036854775807L) {
            jElapsedRealtime = System.currentTimeMillis();
        } else {
            jElapsedRealtime = j2 + SystemClock.elapsedRealtime();
        }
        return C7116.m19474(jElapsedRealtime - c11328.f35685) - (j + c1634.f5659);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m28405(AbstractC24755 abstractC24755, C8402 c8402) {
        if (c8402.m22581() || abstractC24755.m55264()) {
            return false;
        }
        int i = abstractC24755.mo15535(c8402.f27520, this.f35469).f5657;
        C11328 c11328 = this.f35459;
        abstractC24755.m55263(i, c11328);
        return c11328.m28620() && c11328.f35695 && c11328.f35685 != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c1 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ce A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d6 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0150  */
    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, l.ۡۙ᩷] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28384(C1546 c1546, boolean z) throws Throwable {
        long j;
        long j2;
        C8402 c8402;
        long j3;
        boolean z2;
        C8402 c8403;
        boolean z3;
        long jLongValue;
        boolean z4;
        long j4;
        long j5;
        boolean z5;
        C9748 c9748;
        boolean z6;
        long jM28369;
        boolean z7;
        C0054 c0054M25404;
        long jMo6402;
        C17426 c17426;
        int i;
        int i2;
        boolean z8;
        long j6;
        this.f35439.m31543(z ? 1 : 0);
        if (this.f35484) {
            this.f35432 = c1546;
            return;
        }
        Pair pairM28372 = m28372(this.f35485.f56676, c1546, true, this.f35447, this.f35462, this.f35459, this.f35469);
        try {
            if (pairM28372 == null) {
                Pair pairM28371 = m28371(this.f35485.f56676);
                c8403 = (C8402) pairM28371.first;
                jLongValue = ((Long) pairM28371.second).longValue();
                z3 = !this.f35485.f56676.m55264();
                j = -9223372036854775807L;
            } else {
                Object obj = pairM28372.first;
                long jLongValue2 = ((Long) pairM28372.second).longValue();
                long j7 = c1546.f5348 == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
                C8402 c8402M25396 = this.f35473.m25396(this.f35485.f56676, obj, jLongValue2);
                if (c8402M25396.m22581()) {
                    this.f35485.f56676.mo15535(c8402M25396.f27520, this.f35469);
                    if (this.f35469.m5791(c8402M25396.f27516) == c8402M25396.f27519) {
                        this.f35469.f5655.getClass();
                    }
                    c8403 = c8402M25396;
                    z3 = true;
                    jLongValue = 0;
                    j = j7;
                } else if (c1546.f5348 == -9223372036854775807L) {
                    j = j7;
                    j2 = 0;
                    c8402 = c8402M25396;
                    j3 = jLongValue2;
                    z2 = true;
                } else {
                    j = j7;
                    j2 = 0;
                    c8402 = c8402M25396;
                    j3 = jLongValue2;
                    z2 = false;
                }
                if (this.f35485.f56676.m55264()) {
                    this.f35458 = c1546;
                } else if (pairM28372 == null) {
                    if (this.f35485.f56668 != 1) {
                        m28419(4);
                    }
                    m28402(false, true, false, true);
                } else {
                    try {
                        if (c8402.equals(this.f35485.f56675)) {
                            c0054M25404 = this.f35473.m25404();
                            if (c0054M25404 == null && c0054M25404.f914 && j3 != j2) {
                                ?? r1 = c0054M25404.f925;
                                long j8 = this.f35459.f35696;
                                if (this.f35482 && j8 != -9223372036854775807L) {
                                    this.f35457.getClass();
                                }
                                jMo6402 = r1.mo6402(j3, this.f35477);
                            } else {
                                jMo6402 = j3;
                            }
                            if (C7116.m19506(jMo6402) == C7116.m19506(this.f35485.f56674) || !((i = (c17426 = this.f35485).f56668) == 2 || i == 3)) {
                                j5 = jMo6402;
                            } else {
                                i2 = 2;
                                z8 = z2;
                                j6 = c17426.f56674;
                            }
                            this.f35485 = m28375(c8402, j6, j, j6, z8, i2);
                            return;
                        }
                        j5 = j3;
                        C17426 c17427 = this.f35485;
                        AbstractC24755 abstractC24755 = c17427.f56676;
                        m28397(abstractC24755, c8402, abstractC24755, c17427.f56675, j, true);
                        z2 = z4;
                        j3 = jM28369;
                    } catch (Throwable th) {
                        th = th;
                        j4 = jM28369;
                        this.f35485 = m28375(c8402, j4, j, j4, z4, 2);
                        throw th;
                    }
                    this.f35484 = this.f35482;
                    if (this.f35485.f56668 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    c9748 = this.f35473;
                    if (c9748.m25404() != c9748.m25386()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    jM28369 = m28369(c8402, j5, z6, z5);
                    if (j3 != jM28369) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z4 = z2 | z7;
                }
                z8 = z2;
                j6 = j3;
                i2 = 2;
                this.f35485 = m28375(c8402, j6, j, j6, z8, i2);
                return;
            }
            if (this.f35485.f56676.m55264()) {
                this.f35458 = c1546;
            } else if (pairM28372 == null) {
                if (this.f35485.f56668 != 1) {
                    m28419(4);
                }
                m28402(false, true, false, true);
            } else {
                if (c8402.equals(this.f35485.f56675)) {
                    c0054M25404 = this.f35473.m25404();
                    if (c0054M25404 == null) {
                        jMo6402 = j3;
                    } else {
                        jMo6402 = j3;
                    }
                    if (C7116.m19506(jMo6402) == C7116.m19506(this.f35485.f56674)) {
                    }
                    j5 = jMo6402;
                } else {
                    j5 = j3;
                }
                this.f35484 = this.f35482;
                if (this.f35485.f56668 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c9748 = this.f35473;
                if (c9748.m25404() != c9748.m25386()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                jM28369 = m28369(c8402, j5, z6, z5);
                if (j3 != jM28369) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z4 = z2 | z7;
                C17426 c17428 = this.f35485;
                AbstractC24755 abstractC24756 = c17428.f56676;
                m28397(abstractC24756, c8402, abstractC24756, c17428.f56675, j, true);
                z2 = z4;
                j3 = jM28369;
            }
            z8 = z2;
            j6 = j3;
            i2 = 2;
            this.f35485 = m28375(c8402, j6, j, j6, z8, i2);
            return;
        } catch (Throwable th2) {
            th = th2;
            z4 = z2;
            j4 = j3;
        }
        j2 = 0;
        j3 = jLongValue;
        c8402 = c8403;
        z2 = z3;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, l.ۡۙ᩷] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m28369(C8402 c8402, long j, boolean z, boolean z2) {
        C7731[] c7731Arr;
        m28424();
        m28433(false, true);
        if (z2 || this.f35485.f56668 == 3) {
            m28419(2);
        }
        C9748 c9748 = this.f35473;
        C0054 c0054M25404 = c9748.m25404();
        C0054 c0054M963 = c0054M25404;
        while (c0054M963 != null && !c8402.equals(c0054M963.f918.f24821)) {
            c0054M963 = c0054M963.m963();
        }
        if (z || c0054M25404 != c0054M963 || (c0054M963 != null && c0054M963.m967(j) < 0)) {
            int i = 0;
            while (true) {
                c7731Arr = this.f35451;
                if (i >= c7731Arr.length) {
                    break;
                }
                int iM21053 = c7731Arr[i].m21053();
                c7731Arr[i].m21036(this.f35476);
                m28379(i, false);
                this.f35452 -= iM21053;
                i++;
            }
            this.f35480 = -9223372036854775807L;
            if (c0054M963 != null) {
                while (c9748.m25404() != c0054M963) {
                    c9748.m25391();
                }
                c9748.m25387(c0054M963);
                c0054M963.m965(BasicLabelFormatter.TRILLION);
                m28403(new boolean[c7731Arr.length], c9748.m25386().m966());
                c0054M963.f916 = true;
            }
        }
        m28442();
        if (c0054M963 != null) {
            ?? r10 = c0054M963.f925;
            c9748.m25387(c0054M963);
            if (!c0054M963.f914) {
                c0054M963.f918 = c0054M963.f918.m20570(j);
            } else if (c0054M963.f926) {
                j = r10.mo6401(j);
                r10.mo6405(j - this.f35431, this.f35442);
            }
            m28429(j);
            m28440();
        } else {
            c9748.m25409();
            m28429(j);
        }
        m28414(false);
        this.f35450.mo14971(2);
        return j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m28429(long j) {
        C0054 c0054M25404 = this.f35473.m25404();
        long jM967 = c0054M25404 == null ? j + BasicLabelFormatter.TRILLION : c0054M25404.m967(j);
        this.f35453 = jM967;
        this.f35476.m18570(jM967);
        for (C7731 c7731 : this.f35451) {
            c7731.m21032(c0054M25404, this.f35453);
        }
        for (C0054 c0054M25405 = r0.m25404(); c0054M25405 != null; c0054M25405 = c0054M25405.m963()) {
            for (InterfaceC1470 interfaceC1470 : c0054M25405.m961().f74677) {
                if (interfaceC1470 != null) {
                    interfaceC1470.mo5255();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28387(C9221 c9221) {
        this.f35477 = c9221;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m28420(boolean z) throws Throwable {
        if (!z) {
            this.f35484 = false;
            this.f35450.mo14969(37);
            C1546 c1546 = this.f35432;
            if (c1546 != null) {
                m28384(c1546, false);
                this.f35432 = null;
            }
        }
        this.f35482 = z;
        for (C7731 c7731 : this.f35451) {
            c7731.m21034(this.f35482 ? this.f35457 : null);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m28430(C1019 c1019) {
        this.f35457 = c1019;
        for (C7731 c7731 : this.f35451) {
            c7731.m21034(this.f35482 ? this.f35457 : null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28400(boolean z, C0645 c0645) {
        if (this.f35437 != z) {
            this.f35437 = z;
            if (!z) {
                for (C7731 c7731 : this.f35451) {
                    c7731.m21044();
                }
            }
        }
        if (c0645 != null) {
            c0645.m2833();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28381(Object obj, C0645 c0645) {
        for (C7731 c7731 : this.f35451) {
            c7731.m21030(obj);
        }
        int i = this.f35485.f56668;
        if (i == 3 || i == 2) {
            this.f35450.mo14971(2);
        }
        if (c0645 != null) {
            c0645.m2833();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28401(boolean z, boolean z2) {
        m28402(z || !this.f35437, false, true, false);
        this.f35439.m31543(z2 ? 1 : 0);
        this.f35483.mo47591(this.f35440);
        this.f35472.m29698(1, this.f35485.f56671);
        m28419(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28383(C0645 c0645) {
        C15934 c15934 = this.f35445;
        InterfaceC4879 interfaceC4879 = this.f35450;
        try {
            m28402(true, false, true, false);
            C7731[] c7731Arr = this.f35451;
            for (int i = 0; i < c7731Arr.length; i++) {
                ((AbstractC25280) this.f35455[i]).m56447();
                c7731Arr[i].m21023();
            }
            this.f35483.mo47594(this.f35440);
            this.f35472.m29700();
            this.f35444.mo27990();
            m28419(1);
        } finally {
            interfaceC4879.mo14970();
            c15934.m37958();
            c0645.m2833();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x010e A[PHI: r0
      0x010e: PHI (r0v13 l.᩻ۗۙ) = (r0v12 l.᩻ۗۙ), (r0v12 l.᩻ۗۙ), (r0v18 l.᩻ۗۙ), (r0v18 l.᩻ۗۙ) binds: [B:39:0x00d2, B:41:0x00d6, B:43:0x00e7, B:45:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28402(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        boolean z5;
        long j2;
        long j3;
        AbstractC24755 abstractC24755;
        C8402 c8402;
        this.f35450.mo14969(2);
        this.f35484 = false;
        this.f35432 = null;
        this.f35471 = null;
        m28433(false, true);
        this.f35476.m18572();
        this.f35453 = BasicLabelFormatter.TRILLION;
        int i = 0;
        while (true) {
            try {
                C7731[] c7731Arr = this.f35451;
                if (i >= c7731Arr.length) {
                    break;
                }
                int iM21053 = c7731Arr[i].m21053();
                c7731Arr[i].m21036(this.f35476);
                m28379(i, false);
                this.f35452 -= iM21053;
                i++;
            } catch (RuntimeException | C18566 e) {
                C1896.m6516("Disable failed.", e);
            }
        }
        this.f35480 = -9223372036854775807L;
        if (z) {
            for (C7731 c7731 : this.f35451) {
                try {
                    c7731.m21044();
                } catch (RuntimeException e2) {
                    C1896.m6516("Reset failed.", e2);
                }
            }
        }
        this.f35452 = 0;
        C17426 c17426 = this.f35485;
        C8402 c8403 = c17426.f56675;
        long j4 = c17426.f56674;
        if (this.f35485.f56675.m22581()) {
            j = this.f35485.f56672;
        } else {
            C17426 c17427 = this.f35485;
            C1634 c1634 = this.f35469;
            C8402 c8404 = c17427.f56675;
            AbstractC24755 abstractC24756 = c17427.f56676;
            if (abstractC24756.m55264() || abstractC24756.mo15535(c8404.f27520, c1634).f5661) {
                j = this.f35485.f56672;
            } else {
                j = this.f35485.f56674;
            }
        }
        if (z2) {
            this.f35458 = null;
            Pair pairM28371 = m28371(this.f35485.f56676);
            c8403 = (C8402) pairM28371.first;
            long jLongValue = ((Long) pairM28371.second).longValue();
            z5 = c8403.equals(this.f35485.f56675) ? false : true;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            z5 = false;
            j2 = j4;
            j3 = j;
        }
        this.f35473.m25409();
        this.f35468 = false;
        AbstractC24755 abstractC24755M17871 = this.f35485.f56676;
        if (z3 && (abstractC24755M17871 instanceof C6240)) {
            abstractC24755M17871 = ((C6240) abstractC24755M17871).m17871(this.f35467.m39443());
            if (c8403.f27516 != -1) {
                abstractC24755M17871.mo15535(c8403.f27520, this.f35469);
                int i2 = this.f35469.f5657;
                C11328 c11328 = this.f35459;
                abstractC24755M17871.mo1592(i2, c11328, 0L);
                if (c11328.m28620()) {
                    abstractC24755 = abstractC24755M17871;
                    c8402 = new C8402(c8403.f27518, c8403.f27520);
                } else {
                    abstractC24755 = abstractC24755M17871;
                    c8402 = c8403;
                }
            } else {
                abstractC24755 = abstractC24755M17871;
                c8402 = c8403;
            }
        } else {
            abstractC24755 = abstractC24755M17871;
            c8402 = c8403;
        }
        C17426 c17428 = this.f35485;
        int i3 = c17428.f56668;
        C18566 c18566 = z4 ? null : c17428.f56665;
        C3356 c3356 = z5 ? C3356.f10962 : c17428.f56666;
        C23011 c23011 = z5 ? this.f35433 : c17428.f56680;
        List listOf = z5 ? AbstractC1928.of() : c17428.f56663;
        C17426 c17429 = this.f35485;
        this.f35485 = new C17426(abstractC24755, c8402, j3, j2, i3, c18566, false, c3356, c23011, listOf, c8402, c17429.f56671, c17429.f56670, c17429.f56681, c17429.f56662, j2, 0L, j2, 0L, false);
        if (z3) {
            this.f35473.m25410();
            this.f35467.m39441();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Pair m28371(AbstractC24755 abstractC24755) {
        long j = 0;
        if (abstractC24755.m55264()) {
            return Pair.create(C17426.m40918(), 0L);
        }
        int iMo15534 = abstractC24755.mo15534(this.f35462);
        Pair pairM55261 = abstractC24755.m55261(this.f35459, this.f35469, iMo15534, -9223372036854775807L);
        C8402 c8402M25396 = this.f35473.m25396(abstractC24755, pairM55261.first, 0L);
        long jLongValue = ((Long) pairM55261.second).longValue();
        if (c8402M25396.m22581()) {
            Object obj = c8402M25396.f27520;
            C1634 c1634 = this.f35469;
            abstractC24755.mo15535(obj, c1634);
            if (c8402M25396.f27519 == c1634.m5791(c8402M25396.f27516)) {
                c1634.f5655.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(c8402M25396, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m28413(C20410 c20410) {
        c20410.getClass();
        Looper looperM46808 = c20410.m46808();
        Looper looper = this.f35460;
        InterfaceC4879 interfaceC4879 = this.f35450;
        if (looperM46808 == looper) {
            m28432(c20410);
            int i = this.f35485.f56668;
            if (i == 3 || i == 2) {
                interfaceC4879.mo14971(2);
                return;
            }
            return;
        }
        interfaceC4879.mo14963(15, c20410).mo21395();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m28437(final C20410 c20410) {
        Looper looperM46808 = c20410.m46808();
        if (!looperM46808.getThread().isAlive()) {
            C1896.m6517("Trying to send message on a dead thread.");
            c20410.m46811(false);
        } else {
            this.f35474.mo2209(looperM46808, null).mo14966(new Runnable() { // from class: l.۬ܿۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C11240.m28389(this.f44365, c20410);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28389(C11240 c11240, C20410 c20410) {
        try {
            m28432(c20410);
        } catch (C18566 e) {
            C1896.m6516("Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28398(AbstractC24755 abstractC24755, AbstractC24755 abstractC24756) {
        if (abstractC24755.m55264() && abstractC24756.m55264()) {
            return;
        }
        ArrayList arrayList = this.f35487;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ((C14969) arrayList.get(size)).getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m28442() {
        if (this.f35446 && m28363()) {
            for (C7731 c7731 : this.f35451) {
                int iM21053 = c7731.m21053();
                c7731.m21057(this.f35476);
                this.f35452 -= iM21053 - c7731.m21053();
            }
            this.f35480 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m28404(int i, C8402 c8402) {
        C9748 c9748 = this.f35473;
        if (c9748.m25399() == null || !c9748.m25399().f918.f24821.equals(c8402)) {
            return false;
        }
        return this.f35451[i].m21052(c9748.m25399());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m28415() {
        m28441();
        m28438(true);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m28441() {
        float f = this.f35476.mo8397().f24500;
        C0054 c0054M25404 = this.f35473.m25404();
        C0054 c0054M25386 = this.f35473.m25386();
        C23011 c23011 = null;
        boolean z = true;
        while (c0054M25404 != null && c0054M25404.f914) {
            C17426 c17426 = this.f35485;
            C23011 c23011M964 = c0054M25404.m964(f, c17426.f56676, c17426.f56671);
            C23011 c23012 = c0054M25404 == this.f35473.m25404() ? c23011M964 : c23011;
            C23011 c23011M961 = c0054M25404.m961();
            InterfaceC1470[] interfaceC1470Arr = c23011M964.f74677;
            if (c23011M961 != null && c23011M961.f74677.length == interfaceC1470Arr.length) {
                int i = 0;
                while (true) {
                    if (i < interfaceC1470Arr.length) {
                        if (c23011M964.m51903(c23011M961, i)) {
                            i++;
                        }
                    } else {
                        if (c0054M25404 == c0054M25386) {
                            z = false;
                        }
                        c0054M25404 = c0054M25404.m963();
                        c23011 = c23012;
                    }
                }
            }
            if (z) {
                C0054 c0054M25405 = this.f35473.m25404();
                boolean z2 = (this.f35473.m25387(c0054M25405) & 1) != 0;
                boolean[] zArr = new boolean[this.f35451.length];
                c23012.getClass();
                long jM951 = c0054M25405.m951(c23012, this.f35485.f56674, z2, zArr);
                C17426 c17427 = this.f35485;
                boolean z3 = (c17427.f56668 == 4 || jM951 == c17427.f56674) ? false : true;
                C17426 c17428 = this.f35485;
                this.f35485 = m28375(c17428.f56675, jM951, c17428.f56672, c17428.f56677, z3, 5);
                if (z3) {
                    m28429(jM951);
                }
                m28442();
                boolean[] zArr2 = new boolean[this.f35451.length];
                int i2 = 0;
                while (true) {
                    C7731[] c7731Arr = this.f35451;
                    if (i2 >= c7731Arr.length) {
                        break;
                    }
                    int iM21053 = c7731Arr[i2].m21053();
                    zArr2[i2] = this.f35451[i2].m21046();
                    this.f35451[i2].m21035(c0054M25405.f923[i2], this.f35476, this.f35453, zArr[i2]);
                    if (iM21053 - this.f35451[i2].m21053() > 0) {
                        m28379(i2, false);
                    }
                    this.f35452 -= iM21053 - this.f35451[i2].m21053();
                    i2++;
                }
                m28403(zArr2, this.f35453);
                c0054M25405.f916 = true;
            } else {
                this.f35473.m25387(c0054M25404);
                if (c0054M25404.f914) {
                    long jMax = Math.max(c0054M25404.f918.f24822, c0054M25404.m958(this.f35453));
                    if (this.f35446 && m28363() && this.f35473.m25399() == c0054M25404) {
                        m28442();
                    }
                    c0054M25404.m950(c23011M964, jMax);
                }
            }
            m28414(true);
            if (this.f35485.f56668 != 4) {
                m28440();
                m28407();
                this.f35450.mo14971(2);
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private boolean m28421() {
        C0054 c0054M25404 = this.f35473.m25404();
        long j = c0054M25404.f918.f24819;
        if (c0054M25404.f914) {
            return j == -9223372036854775807L || this.f35485.f56674 < j || !m28418();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x033a  */
    /* JADX WARN: Code duplicated, block: B:169:0x033d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0352  */
    /* JADX WARN: Code duplicated, block: B:176:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x0371  */
    /* JADX WARN: Code duplicated, block: B:185:0x037d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0380  */
    /* JADX WARN: Code duplicated, block: B:190:0x03a7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28399(AbstractC24755 abstractC24755, boolean z) throws Throwable {
        C8402 c8402;
        Object obj;
        int i;
        int iM28366;
        Object obj2;
        long jM19476;
        ?? r21;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long j;
        long j2;
        C5275 c5275;
        int i3;
        int iMo15534;
        boolean z7;
        boolean z8;
        long j3;
        ?? r8;
        int i4;
        long jM28369;
        int i5;
        long j4;
        Object obj3;
        boolean z9;
        int i6;
        C17426 c17426 = this.f35485;
        C1546 c1546 = this.f35458;
        C9748 c9748 = this.f35473;
        int i7 = this.f35447;
        boolean z10 = this.f35462;
        C11328 c11328 = this.f35459;
        C1634 c1634 = this.f35469;
        if (abstractC24755.m55264()) {
            j3 = -9223372036854775807L;
            c5275 = new C5275(C17426.m40918(), 0L, -9223372036854775807L, false, true, false);
            i = -1;
        } else {
            C8402 c8403 = c17426.f56675;
            Object obj4 = c8403.f27520;
            AbstractC24755 abstractC24756 = c17426.f56676;
            boolean z11 = abstractC24756.m55264() || abstractC24756.mo15535(c8403.f27520, c1634).f5661;
            long j5 = (c17426.f56675.m22581() || z11) ? c17426.f56672 : c17426.f56674;
            if (c1546 != null) {
                boolean z12 = false;
                Pair pairM28372 = m28372(abstractC24755, c1546, true, i7, z10, c11328, c1634);
                if (pairM28372 == null) {
                    iMo15534 = abstractC24755.mo15534(z10);
                    jM19476 = j5;
                    obj2 = obj4;
                    z7 = false;
                    z8 = true;
                } else {
                    if (c1546.f5348 == -9223372036854775807L) {
                        iMo15534 = abstractC24755.mo15535(pairM28372.first, c1634).f5657;
                        jM19476 = j5;
                        obj2 = obj4;
                        z7 = false;
                    } else {
                        obj2 = pairM28372.first;
                        jM19476 = ((Long) pairM28372.second).longValue();
                        iMo15534 = -1;
                        z7 = true;
                    }
                    z12 = c17426.f56668 == 4;
                    z8 = false;
                }
                z4 = z7;
                z3 = z8;
                z2 = z12;
                c8402 = c8403;
                i = -1;
                i2 = iMo15534;
            } else {
                c8402 = c8403;
                if (c17426.f56676.m55264()) {
                    iM28366 = abstractC24755.mo15534(z10);
                    obj = obj4;
                    i = -1;
                } else {
                    obj = obj4;
                    if (abstractC24755.mo1588(obj) == -1) {
                        i = -1;
                        iM28366 = m28366(c11328, c1634, i7, z10, obj, c17426.f56676, abstractC24755);
                        if (iM28366 == -1) {
                            iM28366 = abstractC24755.mo15534(z10);
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z5;
                        c8402 = c8402;
                        i2 = iM28366;
                        z3 = z6;
                        obj2 = obj;
                        z2 = false;
                        jM19476 = j5;
                        z4 = false;
                    } else {
                        i = -1;
                        if (j5 == -9223372036854775807L) {
                            iM28366 = abstractC24755.mo15535(obj, c1634).f5657;
                        } else if (z11) {
                            c8402 = c8402;
                            c17426.f56676.mo15535(c8402.f27520, c1634);
                            if (c17426.f56676.mo1592(c1634.f5657, c11328, 0L).f35697 == c17426.f56676.mo1588(c8402.f27520)) {
                                Pair pairM55261 = abstractC24755.m55261(c11328, c1634, abstractC24755.mo15535(obj, c1634).f5657, j5 + c1634.f5659);
                                obj2 = pairM55261.first;
                                jM19476 = ((Long) pairM55261.second).longValue();
                            } else if (abstractC24755.mo15535(obj, c1634).f5660 != -9223372036854775807L) {
                                r21 = 0;
                                jM19476 = C7116.m19476(j5, 0L, c1634.f5660 - 1);
                                obj2 = obj;
                            } else {
                                obj2 = obj;
                                jM19476 = j5;
                            }
                            i2 = -1;
                            z2 = false;
                            z3 = false;
                            z4 = true;
                        } else {
                            iM28366 = -1;
                            z6 = false;
                            i2 = iM28366;
                            z3 = z6;
                            obj2 = obj;
                            z2 = false;
                            jM19476 = j5;
                            z4 = false;
                        }
                    }
                }
                z6 = false;
                i2 = iM28366;
                z3 = z6;
                obj2 = obj;
                z2 = false;
                jM19476 = j5;
                z4 = false;
            }
            if (i2 != i) {
                Pair pairM55262 = abstractC24755.m55261(c11328, c1634, i2, -9223372036854775807L);
                obj2 = pairM55262.first;
                jM19476 = ((Long) pairM55262.second).longValue();
                j = -9223372036854775807L;
            } else {
                j = jM19476;
            }
            C8402 c8402M25396 = c9748.m25396(abstractC24755, obj2, jM19476);
            int i8 = c8402M25396.f27517;
            boolean z13 = c8402.f27520.equals(obj2) && !c8402.m22581() && !c8402M25396.m22581() && (i8 == i || ((i3 = c8402.f27517) != i && i8 >= i3));
            C1634 c1634Mo15535 = abstractC24755.mo15535(obj2, c1634);
            if (!z11 && j5 == j) {
                Object obj5 = c8402.f27520;
                int i9 = c8402.f27516;
                if (obj5.equals(c8402M25396.f27520)) {
                    if (c8402.m22581()) {
                        c1634Mo15535.m5793(i9);
                    }
                    if (c8402M25396.m22581()) {
                        c1634Mo15535.m5793(c8402M25396.f27516);
                    }
                }
            }
            if (z13) {
                c8402M25396 = c8402;
            }
            if (!c8402M25396.m22581()) {
                j2 = jM19476;
            } else if (c8402M25396.equals(c8402)) {
                jM19476 = c17426.f56674;
                j2 = jM19476;
            } else {
                abstractC24755.mo15535(c8402M25396.f27520, c1634);
                if (c8402M25396.f27519 == c1634.m5791(c8402M25396.f27516)) {
                    c1634.f5655.getClass();
                }
                j2 = 0;
            }
            c5275 = new C5275(c8402M25396, j2, j, z2, z3, z4);
        }
        C8402 c8404 = c5275.f18581;
        long j6 = c5275.f18583;
        boolean z14 = c5275.f18584;
        long j7 = c5275.f18585;
        boolean z15 = (this.f35485.f56675.equals(c8404) && j7 == this.f35485.f56674) ? false : true;
        try {
            if (c5275.f18580) {
                if (this.f35485.f56668 != 1) {
                    m28419(4);
                }
                m28402(false, false, false, true);
            }
            for (C7731 c7731 : this.f35451) {
                c7731.m21039(abstractC24755);
            }
            try {
                if (z15) {
                    jM28369 = j7;
                    i4 = 2;
                    if (!abstractC24755.m55264()) {
                        for (C0054 c0054M25404 = this.f35473.m25404(); c0054M25404 != null; c0054M25404 = c0054M25404.m963()) {
                            if (c0054M25404.f918.f24821.equals(c8404)) {
                                c0054M25404.f918 = this.f35473.m25395(abstractC24755, c0054M25404.f918);
                                c0054M25404.m959();
                            }
                        }
                        C9748 c9749 = this.f35473;
                        jM28369 = m28369(c8404, jM28369, c9749.m25404() != c9749.m25386(), z14);
                        i5 = 2;
                    }
                    C17426 c17427 = this.f35485;
                    AbstractC24755 abstractC24757 = c17427.f56676;
                    C8402 c8405 = c17427.f56675;
                    if (c5275.f18582) {
                        j4 = jM28369;
                    } else {
                        j4 = -9223372036854775807L;
                    }
                    m28397(abstractC24755, c8404, abstractC24757, c8405, j4, false);
                    if (z15 || j6 != this.f35485.f56672) {
                        C17426 c17428 = this.f35485;
                        obj3 = c17428.f56675.f27520;
                        AbstractC24755 abstractC24758 = c17428.f56676;
                        if (z15 || !z || abstractC24758.m55264() || abstractC24758.mo15535(obj3, this.f35469).f5661) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        long j8 = this.f35485.f56677;
                        if (abstractC24755.mo1588(obj3) == i) {
                            i6 = 4;
                        } else {
                            i6 = 3;
                        }
                        this.f35485 = m28375(c8404, jM28369, j6, j8, z9, i6);
                    }
                    m28365();
                    m28398(abstractC24755, this.f35485.f56676);
                    this.f35485 = this.f35485.m40926(abstractC24755);
                    if (!abstractC24755.m55264()) {
                        this.f35458 = null;
                    }
                    m28414(false);
                    this.f35450.mo14971(i5);
                }
                try {
                    i4 = 2;
                    jM28369 = j7;
                    int iM25389 = this.f35473.m25389(abstractC24755, this.f35453, this.f35473.m25386() == null ? 0L : m28368(this.f35473.m25386()), (!m28363() || this.f35473.m25399() == null) ? 0L : m28368(this.f35473.m25399()));
                    if ((iM25389 & 1) != 0) {
                        m28438(false);
                    } else if ((iM25389 & 2) != 0) {
                        m28442();
                    }
                } catch (Throwable th) {
                    th = th;
                    j3 = j7;
                    r21 = 2;
                    r8 = r21;
                    C17426 c17429 = this.f35485;
                    ?? r37 = r8;
                    m28397(abstractC24755, c8404, c17429.f56676, c17429.f56675, c5275.f18582 ? j3 : -9223372036854775807L, false);
                    if (z15 || j6 != this.f35485.f56672) {
                        C17426 c174210 = this.f35485;
                        Object obj6 = c174210.f56675.f27520;
                        AbstractC24755 abstractC24759 = c174210.f56676;
                        this.f35485 = m28375(c8404, j3, j6, this.f35485.f56677, z15 && z && !abstractC24759.m55264() && !abstractC24759.mo15535(obj6, this.f35469).f5661, abstractC24755.mo1588(obj6) == i ? 4 : 3);
                    }
                    m28365();
                    m28398(abstractC24755, this.f35485.f56676);
                    this.f35485 = this.f35485.m40926(abstractC24755);
                    if (!abstractC24755.m55264()) {
                        this.f35458 = null;
                    }
                    m28414(false);
                    this.f35450.mo14971(r37 == true ? 1 : 0);
                    throw th;
                }
                i5 = i4;
                C17426 c174211 = this.f35485;
                AbstractC24755 abstractC247510 = c174211.f56676;
                C8402 c8406 = c174211.f56675;
                if (c5275.f18582) {
                    j4 = jM28369;
                } else {
                    j4 = -9223372036854775807L;
                }
                m28397(abstractC24755, c8404, abstractC247510, c8406, j4, false);
                if (z15) {
                    C17426 c174212 = this.f35485;
                    obj3 = c174212.f56675.f27520;
                    AbstractC24755 abstractC247511 = c174212.f56676;
                    if (z15) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    long j9 = this.f35485.f56677;
                    if (abstractC24755.mo1588(obj3) == i) {
                        i6 = 4;
                    } else {
                        i6 = 3;
                    }
                    this.f35485 = m28375(c8404, jM28369, j6, j9, z9, i6);
                } else {
                    C17426 c174213 = this.f35485;
                    obj3 = c174213.f56675.f27520;
                    AbstractC24755 abstractC247512 = c174213.f56676;
                    if (z15) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    long j10 = this.f35485.f56677;
                    if (abstractC24755.mo1588(obj3) == i) {
                        i6 = 4;
                    } else {
                        i6 = 3;
                    }
                    this.f35485 = m28375(c8404, jM28369, j6, j10, z9, i6);
                }
                m28365();
                m28398(abstractC24755, this.f35485.f56676);
                this.f35485 = this.f35485.m40926(abstractC24755);
                if (!abstractC24755.m55264()) {
                    this.f35458 = null;
                }
                m28414(false);
                this.f35450.mo14971(i5);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            j3 = j7;
            r8 = 2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28397(AbstractC24755 abstractC24755, C8402 c8402, AbstractC24755 abstractC24756, C8402 c8403, long j, boolean z) {
        boolean zM28405 = m28405(abstractC24755, c8402);
        Object obj = c8402.f27520;
        if (!zM28405) {
            C7445 c7445 = c8402.m22581() ? C7445.f24498 : this.f35485.f56662;
            C6634 c6634 = this.f35476;
            if (c6634.mo8397().equals(c7445)) {
                return;
            }
            this.f35450.mo14969(16);
            c6634.mo8396(c7445);
            m28385(this.f35485.f56662, c7445.f24500, false, false);
            return;
        }
        C1634 c1634 = this.f35469;
        int i = abstractC24755.mo15535(obj, c1634).f5657;
        C11328 c11328 = this.f35459;
        abstractC24755.m55263(i, c11328);
        C3716 c3716 = c11328.f35684;
        C23788 c23788 = (C23788) this.f35456;
        c23788.m53063(c3716);
        if (j != -9223372036854775807L) {
            c23788.m53062(m28370(abstractC24755, obj, j));
            return;
        }
        if (!C17359.equals(!abstractC24756.m55264() ? abstractC24756.mo1592(abstractC24756.mo15535(c8403.f27520, c1634).f5657, c11328, 0L).f35698 : null, c11328.f35698) || z) {
            c23788.m53062(-9223372036854775807L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m28368(C0054 c0054) {
        if (c0054 == null) {
            return 0L;
        }
        long jM957 = c0054.m957();
        if (!c0054.f914) {
            return jM957;
        }
        int i = 0;
        while (true) {
            C7731[] c7731Arr = this.f35451;
            if (i >= c7731Arr.length) {
                return jM957;
            }
            if (c7731Arr[i].m21048(c0054)) {
                long jM21054 = c7731Arr[i].m21054(c0054);
                if (jM21054 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM957 = Math.max(jM21054, jM957);
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.ۡۙ᩷, l.ۤۤ᩷] */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m28364() {
        C9748 c9748 = this.f35473;
        c9748.m25402();
        C0054 c0054M25403 = c9748.m25403();
        if (c0054M25403 != null) {
            ?? r1 = c0054M25403.f925;
            if ((!c0054M25403.f917 || c0054M25403.f914) && !r1.mo6050()) {
                AbstractC24755 abstractC24755 = this.f35485.f56676;
                if (c0054M25403.f914) {
                    r1.mo6052();
                }
                if (this.f35483.mo47596()) {
                    if (!c0054M25403.f917) {
                        long j = c0054M25403.f918.f24822;
                        c0054M25403.f917 = true;
                        r1.mo6409(this, j);
                    } else {
                        C3037 c3037 = new C3037();
                        c3037.m9876(c0054M25403.m958(this.f35453));
                        c3037.m9874(this.f35476.mo8397().f24500);
                        c3037.m9875(this.f35481);
                        c0054M25403.m955(new C20191(c3037));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m28365() {
        C0054 c0054M25404 = this.f35473.m25404();
        this.f35470 = c0054M25404 != null && c0054M25404.f918.f24823 && this.f35435;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m28411(InterfaceC9147 interfaceC9147) {
        C9748 c9748 = this.f35473;
        boolean zM25408 = c9748.m25408(interfaceC9147);
        C6634 c6634 = this.f35476;
        if (zM25408) {
            C0054 c0054M25406 = c9748.m25406();
            c0054M25406.getClass();
            if (!c0054M25406.f914) {
                float f = c6634.mo8397().f24500;
                C17426 c17426 = this.f35485;
                c0054M25406.m952(f, c17426.f56676, c17426.f56671);
            }
            m28386(c0054M25406.f918.f24821, c0054M25406.m962(), c0054M25406.m961());
            if (c0054M25406 == c9748.m25404()) {
                m28429(c0054M25406.f918.f24822);
                m28403(new boolean[this.f35451.length], c9748.m25386().m966());
                c0054M25406.f916 = true;
                C17426 c17427 = this.f35485;
                C8402 c8402 = c17427.f56675;
                long j = c0054M25406.f918.f24822;
                this.f35485 = m28375(c8402, j, c17427.f56672, j, false, 5);
            }
            m28440();
            return;
        }
        C0054 c0054M25393 = c9748.m25393(interfaceC9147);
        if (c0054M25393 != null) {
            C20782.m47568(true ^ c0054M25393.f914);
            float f2 = c6634.mo8397().f24500;
            C17426 c17428 = this.f35485;
            c0054M25393.m952(f2, c17428.f56676, c17428.f56671);
            if (c9748.m25401(interfaceC9147)) {
                m28364();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m28431(InterfaceC9147 interfaceC9147) {
        C9748 c9748 = this.f35473;
        if (c9748.m25408(interfaceC9147)) {
            c9748.m25397(this.f35453);
            m28440();
        } else if (c9748.m25401(interfaceC9147)) {
            m28364();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28385(C7445 c7445, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.f35439.m31543(1);
            }
            this.f35485 = this.f35485.m40922(c7445);
        }
        float f2 = c7445.f24500;
        C0054 c0054M25404 = this.f35473.m25404();
        while (true) {
            i = 0;
            if (c0054M25404 == null) {
                break;
            }
            InterfaceC1470[] interfaceC1470Arr = c0054M25404.m961().f74677;
            int length = interfaceC1470Arr.length;
            while (i < length) {
                InterfaceC1470 interfaceC1470 = interfaceC1470Arr[i];
                if (interfaceC1470 != null) {
                    interfaceC1470.mo5249(f2);
                }
                i++;
            }
            c0054M25404 = c0054M25404.m963();
        }
        C7731[] c7731Arr = this.f35451;
        int length2 = c7731Arr.length;
        while (i < length2) {
            c7731Arr[i].m21028(f, c7445.f24500);
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, l.ۡۙ᩷] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, l.ۤۤ᩷] */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m28440() {
        long jM958;
        boolean zMo47595 = false;
        if (m28434(this.f35473.m25406())) {
            C0054 c0054M25406 = this.f35473.m25406();
            long jM28367 = m28367(!c0054M25406.f914 ? 0L : c0054M25406.f925.mo6053());
            if (c0054M25406 == this.f35473.m25404()) {
                jM958 = c0054M25406.m958(this.f35453);
            } else {
                jM958 = c0054M25406.m958(this.f35453) - c0054M25406.f918.f24822;
            }
            long j = jM958;
            long jM53061 = m28405(this.f35485.f56676, c0054M25406.f918.f24821) ? ((C23788) this.f35456).m53061() : -9223372036854775807L;
            C20738 c20738 = this.f35440;
            AbstractC24755 abstractC24755 = this.f35485.f56676;
            C8402 c8402 = c0054M25406.f918.f24821;
            float f = this.f35476.mo8397().f24500;
            boolean z = this.f35485.f56671;
            C15715 c15715 = new C15715(c20738, abstractC24755, c8402, j, jM28367, f, this.f35441, jM53061);
            boolean zMo47596 = this.f35483.mo47595(c15715);
            C0054 c0054M25404 = this.f35473.m25404();
            if (zMo47596 || !c0054M25404.f914 || jM28367 >= 500000 || (this.f35431 <= 0 && !this.f35442)) {
                zMo47595 = zMo47596;
            } else {
                c0054M25404.f925.mo6405(this.f35485.f56674, false);
                zMo47595 = this.f35483.mo47595(c15715);
            }
        }
        this.f35468 = zMo47595;
        if (zMo47595) {
            C0054 c0054M25407 = this.f35473.m25406();
            c0054M25407.getClass();
            C3037 c3037 = new C3037();
            c3037.m9876(c0054M25407.m958(this.f35453));
            c3037.m9874(this.f35476.mo8397().f24500);
            c3037.m9875(this.f35481);
            c0054M25407.m955(new C20191(c3037));
        }
        m28362();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.ۡۙ᩷, l.ۤۤ᩷] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m28434(C0054 c0054) {
        if (c0054 != null) {
            try {
                ?? r1 = c0054.f925;
                if (!c0054.f914) {
                    r1.mo6412();
                } else {
                    for (InterfaceC4848 interfaceC4848 : c0054.f923) {
                        if (interfaceC4848 != null) {
                            interfaceC4848.mo14091();
                        }
                    }
                }
                if ((!c0054.f914 ? 0L : r1.mo6053()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, l.ۤۤ᩷] */
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m28362() {
        C0054 c0054M25406 = this.f35473.m25406();
        boolean z = this.f35468 || (c0054M25406 != null && c0054M25406.f925.mo6050());
        C17426 c17426 = this.f35485;
        if (z != c17426.f56667) {
            this.f35485 = c17426.m40927(z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17426 m28375(C8402 c8402, long j, long j2, long j3, boolean z, int i) {
        List list;
        C0054 c0054M25404;
        boolean z2;
        this.f35454 = (!this.f35454 && j == this.f35485.f56674 && c8402.equals(this.f35485.f56675)) ? false : true;
        m28365();
        C17426 c17426 = this.f35485;
        C3356 c3356M962 = c17426.f56666;
        C23011 c23011M961 = c17426.f56680;
        List listOf = c17426.f56663;
        if (this.f35467.m39444()) {
            C0054 c0054M25405 = this.f35473.m25404();
            if (c0054M25405 == null) {
                c3356M962 = C3356.f10962;
            } else {
                c3356M962 = c0054M25405.m962();
            }
            if (c0054M25405 == null) {
                c23011M961 = this.f35433;
            } else {
                c23011M961 = c0054M25405.m961();
            }
            InterfaceC1470[] interfaceC1470Arr = c23011M961.f74677;
            C22811 c22811 = new C22811();
            boolean z3 = false;
            for (InterfaceC1470 interfaceC1470 : interfaceC1470Arr) {
                if (interfaceC1470 != null) {
                    C19378 c19378 = interfaceC1470.mo17235(0).f50812;
                    if (c19378 == null) {
                        c22811.m19807(new C19378(new InterfaceC8191[0]));
                    } else {
                        c22811.m19807(c19378);
                        z3 = true;
                    }
                }
            }
            AbstractC1928 abstractC1928M51441 = z3 ? c22811.m51441() : AbstractC1928.of();
            if (c0054M25405 != null) {
                C7512 c7512 = c0054M25405.f918;
                if (c7512.f24818 != j2) {
                    c0054M25405.f918 = c7512.m20569(j2);
                }
            }
            C7731[] c7731Arr = this.f35451;
            C9748 c9748 = this.f35473;
            if (c9748.m25404() == c9748.m25386() && (c0054M25404 = c9748.m25404()) != null) {
                C23011 c23011M962 = c0054M25404.m961();
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= c7731Arr.length) {
                        z2 = true;
                        break;
                    }
                    if (c23011M962.m51902(i2)) {
                        if (c7731Arr[i2].m21042() != 1) {
                            z2 = false;
                            break;
                        }
                        if (c23011M962.f74674[i2].f1570 != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.f35443) {
                    this.f35443 = z5;
                    if (!z5 && this.f35485.f56679) {
                        this.f35450.mo14971(2);
                    }
                }
            }
            list = abstractC1928M51441;
        } else {
            if (!c8402.equals(this.f35485.f56675)) {
                c3356M962 = C3356.f10962;
                c23011M961 = this.f35433;
                listOf = AbstractC1928.of();
            }
            list = listOf;
        }
        C3356 c3356 = c3356M962;
        C23011 c23011 = c23011M961;
        if (z) {
            this.f35439.m31545(i);
        }
        C17426 c17427 = this.f35485;
        return c17427.m40924(c8402, j, j2, j3, m28367(c17427.f56664), c3356, c23011, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28403(boolean[] zArr, long j) {
        C7731[] c7731Arr;
        C0054 c0054M25386 = this.f35473.m25386();
        C23011 c23011M961 = c0054M25386.m961();
        int i = 0;
        while (true) {
            c7731Arr = this.f35451;
            if (i >= c7731Arr.length) {
                break;
            }
            if (!c23011M961.m51902(i)) {
                c7731Arr[i].m21044();
            }
            i++;
        }
        for (int i2 = 0; i2 < c7731Arr.length; i2++) {
            if (c23011M961.m51902(i2) && !c7731Arr[i2].m21048(c0054M25386)) {
                m28382(c0054M25386, i2, zArr[i2], j);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28382(C0054 c0054, int i, boolean z, long j) {
        C7731 c7731 = this.f35451[i];
        if (c7731.m21046()) {
            return;
        }
        boolean z2 = c0054 == this.f35473.m25404();
        C23011 c23011M961 = c0054.m961();
        C0273 c0273 = c23011M961.f74674[i];
        InterfaceC1470 interfaceC1470 = c23011M961.f74677[i];
        boolean z3 = m28418() && this.f35485.f56668 == 3;
        boolean z4 = !z && z3;
        this.f35452++;
        c7731.m21033(c0273, interfaceC1470, c0054.f923[i], this.f35453, z4, z2, j, c0054.m957(), c0054.f918.f24821, this.f35476);
        c7731.m21031(new C10494(this), c0054);
        if (z3 && z2) {
            c7731.m21060();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m28414(boolean z) {
        long jM949;
        C0054 c0054M25406 = this.f35473.m25406();
        C8402 c8402 = c0054M25406 == null ? this.f35485.f56675 : c0054M25406.f918.f24821;
        boolean zEquals = this.f35485.f56678.equals(c8402);
        if (!zEquals) {
            this.f35485 = this.f35485.m40923(c8402);
        }
        C17426 c17426 = this.f35485;
        if (c0054M25406 == null) {
            jM949 = c17426.f56674;
        } else {
            jM949 = c0054M25406.m949();
        }
        c17426.f56664 = jM949;
        C17426 c17427 = this.f35485;
        c17427.f56669 = m28367(c17427.f56664);
        if ((!zEquals || z) && c0054M25406 != null && c0054M25406.f914) {
            m28386(c0054M25406.f918.f24821, c0054M25406.m962(), c0054M25406.m961());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m28367(long j) {
        C0054 c0054M25406 = this.f35473.m25406();
        if (c0054M25406 == null) {
            return 0L;
        }
        return Math.max(0L, j - c0054M25406.m958(this.f35453));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28386(C8402 c8402, C3356 c3356, C23011 c23011) {
        long jM958;
        C9748 c9748 = this.f35473;
        C0054 c0054M25406 = c9748.m25406();
        c0054M25406.getClass();
        if (c0054M25406 == c9748.m25404()) {
            jM958 = c0054M25406.m958(this.f35453);
        } else {
            jM958 = c0054M25406.m958(this.f35453) - c0054M25406.f918.f24822;
        }
        long j = jM958;
        long jM28367 = m28367(c0054M25406.m949());
        long jM53061 = m28405(this.f35485.f56676, c0054M25406.f918.f24821) ? ((C23788) this.f35456).m53061() : -9223372036854775807L;
        AbstractC24755 abstractC24755 = this.f35485.f56676;
        float f = this.f35476.mo8397().f24500;
        boolean z = this.f35485.f56671;
        this.f35483.mo47586(new C15715(this.f35440, abstractC24755, c8402, j, jM28367, f, this.f35441, jM53061), c23011.f74677);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m28418() {
        C17426 c17426 = this.f35485;
        return c17426.f56671 && c17426.f56681 == 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m28436(int i) {
        C7731 c7731 = this.f35451[i];
        try {
            C0054 c0054M25404 = this.f35473.m25404();
            c0054M25404.getClass();
            c7731.m21045(c0054M25404);
        } catch (IOException | RuntimeException e) {
            int iM21042 = c7731.m21042();
            if (iM21042 == 3 || iM21042 == 5) {
                C23011 c23011M961 = this.f35473.m25404().m961();
                C1896.m6516("Disabling track due to error: " + C15648.m37395(c23011M961.f74677[i].mo5254()), e);
                C23011 c23011 = new C23011((C0273[]) c23011M961.f74674.clone(), (InterfaceC1470[]) c23011M961.f74677.clone(), c23011M961.f74675, c23011M961.f74673);
                c23011.f74674[i] = null;
                c23011.f74677[i] = null;
                C7731[] c7731Arr = this.f35451;
                int iM21053 = c7731Arr[i].m21053();
                c7731Arr[i].m21036(this.f35476);
                m28379(i, false);
                this.f35452 -= iM21053;
                this.f35473.m25404().m950(c23011, this.f35485.f56674);
                return;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m28363() {
        if (!this.f35446) {
            return false;
        }
        for (C7731 c7731 : this.f35451) {
            if (c7731.m21047()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m28409(long j) {
        boolean z = this.f35482;
        long jMin = 1000;
        long j2 = f35430;
        if (z && this.f35457.f3688) {
            jMin = this.f35485.f56668 != 3 ? j2 : 1000L;
            for (C7731 c7731 : this.f35451) {
                jMin = Math.min(jMin, C7116.m19506(c7731.m21025(this.f35453, this.f35434)));
            }
            if (this.f35485.m40928()) {
                C9748 c9748 = this.f35473;
                C0054 c0054M963 = c9748.m25404() != null ? c9748.m25404().m963() : null;
                if (c0054M963 != null) {
                    if ((C7116.m19474(jMin) * this.f35485.f56662.f24500) + this.f35453 >= c0054M963.m966()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (this.f35485.f56668 != 3 || m28418()) {
            jMin = j2;
        }
        this.f35450.mo14965(j + jMin);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m28439(C11240 c11240) {
        return c11240.f35482 && c11240.f35457.f3688;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m28433(boolean z, boolean z2) {
        this.f35441 = z;
        this.f35481 = (!z || z2) ? -9223372036854775807L : this.f35474.mo2210();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pair m28372(AbstractC24755 abstractC24755, C1546 c1546, boolean z, int i, boolean z2, C11328 c11328, C1634 c1634) {
        int iM28366;
        AbstractC24755 abstractC24756 = c1546.f5347;
        if (abstractC24755.m55264()) {
            return null;
        }
        AbstractC24755 abstractC24757 = abstractC24756.m55264() ? abstractC24755 : abstractC24756;
        try {
            Pair pairM55261 = abstractC24757.m55261(c11328, c1634, c1546.f5349, c1546.f5348);
            if (!abstractC24755.equals(abstractC24757)) {
                if (abstractC24755.mo1588(pairM55261.first) == -1) {
                    if (!z || (iM28366 = m28366(c11328, c1634, i, z2, pairM55261.first, abstractC24757, abstractC24755)) == -1) {
                        return null;
                    }
                    return abstractC24755.m55261(c11328, c1634, iM28366, -9223372036854775807L);
                }
                if (abstractC24757.mo15535(pairM55261.first, c1634).f5661 && abstractC24757.mo1592(c1634.f5657, c11328, 0L).f35697 == abstractC24757.mo1588(pairM55261.first)) {
                    return abstractC24755.m55261(c11328, c1634, abstractC24755.mo15535(pairM55261.first, c1634).f5657, c1546.f5348);
                }
            }
            return pairM55261;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28366(C11328 c11328, C1634 c1634, int i, boolean z, Object obj, AbstractC24755 abstractC24755, AbstractC24755 abstractC24756) {
        Object obj2 = abstractC24755.mo1592(abstractC24755.mo15535(obj, c1634).f5657, c11328, 0L).f35698;
        for (int i2 = 0; i2 < abstractC24756.mo16022(); i2++) {
            if (abstractC24756.mo1592(i2, c11328, 0L).f35698.equals(obj2)) {
                return i2;
            }
        }
        int iMo1588 = abstractC24755.mo1588(obj);
        int iMo16021 = abstractC24755.mo16021();
        int iM55260 = iMo1588;
        int iMo1589 = -1;
        for (int i3 = 0; i3 < iMo16021 && iMo1589 == -1; i3++) {
            iM55260 = abstractC24755.m55260(iM55260, c1634, c11328, i, z);
            if (iM55260 == -1) {
                break;
            }
            iMo1589 = abstractC24756.mo1588(abstractC24755.mo1589(iM55260));
        }
        if (iMo1589 == -1) {
            return -1;
        }
        return abstractC24756.mo1591(iMo1589, c1634, false).f5657;
    }
}
