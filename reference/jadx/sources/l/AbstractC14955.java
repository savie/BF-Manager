package l;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.alipay.sdk.app.OpenAuthTask;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܶۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14955 extends AbstractC16862 {

    /* JADX INFO: renamed from: ۚۨ, reason: not valid java name and contains not printable characters */
    public static final byte[] f48780 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, UTF8.S_CS3, 0, 0, 1, 101, -120, -124, cb.k, -50, KeyFactorySpi.Ed448_type, 24, -96, 0, 47, -65, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48781;

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public int f48782;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f48783;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public int f48784;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48785;

    /* JADX INFO: renamed from: ֫ܰ, reason: not valid java name and contains not printable characters */
    public boolean f48786;

    /* JADX INFO: renamed from: ۖۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC3228 f48787;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public final boolean f48788;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f48789;

    /* JADX INFO: renamed from: ۗܰ, reason: not valid java name and contains not printable characters */
    public long f48790;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final C17258 f48791;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public boolean f48792;

    /* JADX INFO: renamed from: ۙۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC19790 f48793;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public boolean f48794;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public boolean f48795;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public boolean f48796;

    /* JADX INFO: renamed from: ۛܰ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f48797;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f48798;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public boolean f48799;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48800;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public final C12361 f48801;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9498 f48802;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21304 f48803;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f48804;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public boolean f48805;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public boolean f48806;

    /* JADX INFO: renamed from: ۢܰ, reason: not valid java name and contains not printable characters */
    public boolean f48807;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19790 f48808;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public final C16033 f48809;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public float f48810;

    /* JADX INFO: renamed from: ۧܰ, reason: not valid java name and contains not printable characters */
    public C2170 f48811;

    /* JADX INFO: renamed from: ۨۨ, reason: not valid java name and contains not printable characters */
    public boolean f48812;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public C12629 f48813;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48814;

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public C22716 f48815;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final C16033 f48816;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public boolean f48817;

    /* JADX INFO: renamed from: ܰۨ, reason: not valid java name and contains not printable characters */
    public float f48818;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public float f48819;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f48820;

    /* JADX INFO: renamed from: ܳܰ, reason: not valid java name and contains not printable characters */
    public long f48821;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final C16033 f48822;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public long f48823;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public C5076 f48824;

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public final MediaCodec.BufferInfo f48825;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f48826;

    /* JADX INFO: renamed from: ܽܰ, reason: not valid java name and contains not printable characters */
    public boolean f48827;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean f48828;

    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public boolean f48829;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC13544 f48830;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public long f48831;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f48832;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public long f48833;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f48834;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public MediaCrypto f48835;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C7648 f48836;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public C7648 f48837;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public long f48838;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f48839;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48840;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public long f48841;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final float f48842;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public C7648 f48843;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48844;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public long f48845;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public MediaFormat f48846;

    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public C3664 f48847;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean mo35915(C7648 c7648) {
        return false;
    }

    /* JADX INFO: renamed from: ۖ */
    public boolean mo13930(C16033 c16033) {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract float mo13932(float f, C7648 c7648, C7648[] c7648Arr);

    /* JADX INFO: renamed from: ۙ */
    public int mo13933(C16033 c16033) {
        return 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo13934(InterfaceC21304 interfaceC21304, C7648 c7648);

    /* JADX INFO: renamed from: ۙ */
    public abstract ArrayList mo13935(InterfaceC21304 interfaceC21304, C7648 c7648, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract C1735 mo13936(C5076 c5076, C7648 c7648, MediaCrypto mediaCrypto, float f);

    /* JADX INFO: renamed from: ۙ */
    public abstract C17567 mo13938(C5076 c5076, C7648 c7648, C7648 c7649);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo13943(Exception exc);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo13944(String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo13945(String str, long j, long j2);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo13946(C7648 c7648, MediaFormat mediaFormat);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo13951(long j, long j2, InterfaceC13544 interfaceC13544, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C7648 c7648);

    /* JADX INFO: renamed from: ۙ */
    public boolean mo13953(C5076 c5076) {
        return true;
    }

    @Override // l.AbstractC16862, l.InterfaceC2667
    /* JADX INFO: renamed from: ۠ */
    public final int mo8213() {
        return 8;
    }

    /* JADX INFO: renamed from: ۠ۙ */
    public abstract void mo13954();

    /* JADX INFO: renamed from: ۡۙ */
    public abstract void mo13955();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo35925(long j) {
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo13959(C16033 c16033) {
    }

    /* JADX INFO: renamed from: ۨ */
    public boolean mo13960(C7648 c7648) {
        return true;
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo13961(C16033 c16033);

    /* JADX INFO: renamed from: ܺۙ */
    public boolean mo13963() {
        return true;
    }

    /* JADX INFO: renamed from: ᩹ۙ */
    public boolean mo13966() {
        return false;
    }

    public AbstractC14955(int i, InterfaceC9498 interfaceC9498, InterfaceC21304 interfaceC21304, boolean z, float f) {
        super(i);
        this.f48802 = interfaceC9498;
        interfaceC21304.getClass();
        this.f48803 = interfaceC21304;
        this.f48788 = z;
        this.f48842 = f;
        this.f48809 = new C16033(0, 0);
        this.f48816 = new C16033(0, 0);
        this.f48822 = new C16033(2, 0);
        C17258 c17258 = new C17258();
        this.f48791 = c17258;
        this.f48825 = new MediaCodec.BufferInfo();
        this.f48819 = 1.0f;
        this.f48818 = 1.0f;
        this.f48821 = -9223372036854775807L;
        this.f48797 = new ArrayDeque();
        this.f48815 = C22716.f74001;
        c17258.m38027(0);
        c17258.f51912.order(ByteOrder.nativeOrder());
        this.f48801 = new C12361();
        this.f48810 = -1.0f;
        this.f48832 = 0;
        this.f48789 = 0;
        this.f48784 = -1;
        this.f48782 = -1;
        this.f48838 = -9223372036854775807L;
        this.f48823 = -9223372036854775807L;
        this.f48841 = -9223372036854775807L;
        this.f48833 = -9223372036854775807L;
        this.f48831 = -9223372036854775807L;
        this.f48804 = 0;
        this.f48834 = 0;
        this.f48813 = new C12629();
        this.f48790 = -9223372036854775807L;
        this.f48845 = -9223372036854775807L;
    }

    @Override // l.InterfaceC2667
    /* JADX INFO: renamed from: ۙ */
    public final int mo8212(C7648 c7648) throws C2170 {
        try {
            return mo13934(this.f48803, c7648);
        } catch (C8605 e) {
            throw m39516(e, c7648, 4002);
        }
    }

    @Override // l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ܰ */
    public final long mo13267(long j, long j2) {
        return mo35924(j, j2);
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m35919() {
        this.f48795 = true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long mo35924(long j, long j2) {
        return super.mo13267(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c0 A[Catch: ۘۗۙ -> 0x00ef, TryCatch #0 {ۘۗۙ -> 0x00ef, blocks: (B:49:0x00bc, B:51:0x00c0, B:53:0x00c7, B:55:0x00cf, B:58:0x00db), top: B:69:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final void m35932() throws C2170 {
        C7648 c7648;
        InterfaceC19790 interfaceC19790;
        InterfaceC19790 interfaceC19791;
        if (this.f48830 != null || this.f48844 || (c7648 = this.f48843) == null) {
            return;
        }
        String str = c7648.f25265;
        boolean z = false;
        if (!m35928(c7648)) {
            m35901(this.f48793);
            if (this.f48808 == null) {
                try {
                    interfaceC19790 = this.f48808;
                    if (interfaceC19790 != null && (interfaceC19790.getState() == 3 || this.f48808.getState() == 4)) {
                        interfaceC19791 = this.f48808;
                        C2023.m6508(str);
                        if (interfaceC19791.mo28384(str)) {
                            z = true;
                        }
                    }
                    m35899(this.f48835, z);
                } catch (C3664 e) {
                    throw m39516(e, c7648, OpenAuthTask.NOT_INSTALLED);
                }
            } else {
                C2023.m6510(this.f48835 == null);
                InterfaceC19790 interfaceC19792 = this.f48808;
                InterfaceC18854 interfaceC18854Mo28385 = interfaceC19792.mo28385();
                if (!C4701.f16595 || !(interfaceC18854Mo28385 instanceof C4701)) {
                    if (interfaceC18854Mo28385 == null) {
                        if (interfaceC19792.getError() != null) {
                        }
                    } else if (interfaceC18854Mo28385 instanceof C4701) {
                        C4701 c4701 = (C4701) interfaceC18854Mo28385;
                        try {
                            this.f48835 = new MediaCrypto(c4701.f16597, c4701.f16596);
                        } catch (MediaCryptoException e2) {
                            throw m39516(e2, this.f48843, 6006);
                        }
                    }
                    interfaceC19790 = this.f48808;
                    if (interfaceC19790 != null) {
                        interfaceC19791 = this.f48808;
                        C2023.m6508(str);
                        if (interfaceC19791.mo28384(str)) {
                            z = true;
                        }
                    }
                    m35899(this.f48835, z);
                } else {
                    int state = interfaceC19792.getState();
                    if (state == 1) {
                        C8501 error = interfaceC19792.getError();
                        error.getClass();
                        throw m39516(error, this.f48843, error.f29475);
                    }
                    if (state == 4) {
                        if (interfaceC18854Mo28385 == null) {
                            if (interfaceC19792.getError() != null) {
                            }
                        } else if (interfaceC18854Mo28385 instanceof C4701) {
                            C4701 c4702 = (C4701) interfaceC18854Mo28385;
                            this.f48835 = new MediaCrypto(c4702.f16597, c4702.f16596);
                        }
                        interfaceC19790 = this.f48808;
                        if (interfaceC19790 != null) {
                            interfaceC19791 = this.f48808;
                            C2023.m6508(str);
                            if (interfaceC19791.mo28384(str)) {
                                z = true;
                            }
                        }
                        m35899(this.f48835, z);
                    }
                }
            }
            MediaCrypto mediaCrypto = this.f48835;
            if (mediaCrypto == null || this.f48830 != null) {
                return;
            }
            mediaCrypto.release();
            this.f48835 = null;
            return;
        }
        this.f48844 = false;
        this.f48823 = -9223372036854775807L;
        this.f48841 = -9223372036854775807L;
        this.f48833 = -9223372036854775807L;
        this.f48798 = false;
        C17258 c17258 = this.f48791;
        c17258.mo7();
        this.f48822.mo7();
        this.f48840 = false;
        this.f48801.m30764();
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            c17258.m40219(1);
        } else {
            c17258.m40219(32);
        }
        this.f48844 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m35928(C7648 c7648) {
        return this.f48793 == null && mo35915(c7648);
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35931() {
        return this.f48844;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35918(C2170 c2170) {
        this.f48811 = c2170;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m35920(long j) {
        C7648 c7648 = (C7648) this.f48815.f74003.m11204(j);
        if (c7648 == null && this.f48805 && this.f48846 != null) {
            c7648 = (C7648) this.f48815.f74003.m11203();
        }
        if (c7648 != null) {
            this.f48837 = c7648;
        } else if (!this.f48820 || this.f48837 == null) {
            return;
        }
        C7648 c7649 = this.f48837;
        c7649.getClass();
        mo13946(c7649, this.f48846);
        this.f48820 = false;
        this.f48805 = false;
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13544 m35926() {
        return this.f48830;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C7648 m35921() {
        return this.f48836;
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final MediaFormat m35914() {
        return this.f48846;
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C5076 m35916() {
        return this.f48824;
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public void mo13949(boolean z, boolean z2) {
        this.f48813 = new C12629();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r7 >= r5) goto L16;
     */
    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo13950(l.C7648[] r14, long r15, long r17, l.C15274 r19) {
        /*
            r13 = this;
            r0 = r13
            l.᩺ۗۙ r1 = r0.f48815
            long r1 = r1.f74002
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L27
            l.᩺ۗۙ r1 = new l.᩺ۗۙ
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r15
            r11 = r17
            r6.<init>(r7, r9, r11)
            r13.m35902(r1)
            boolean r1 = r0.f48795
            if (r1 == 0) goto L5b
            r13.mo13954()
            return
        L27:
            java.util.ArrayDeque r1 = r0.f48797
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L5c
            long r5 = r0.f48823
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L3f
            long r7 = r0.f48833
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L5c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L5c
        L3f:
            l.᩺ۗۙ r1 = new l.᩺ۗۙ
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r15
            r10 = r17
            r5.<init>(r6, r8, r10)
            r13.m35902(r1)
            l.᩺ۗۙ r1 = r0.f48815
            long r1 = r1.f74002
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L5b
            r13.mo13954()
        L5b:
            return
        L5c:
            l.᩺ۗۙ r2 = new l.᩺ۗۙ
            long r7 = r0.f48823
            r6 = r2
            r9 = r15
            r11 = r17
            r6.<init>(r7, r9, r11)
            r1.add(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC14955.mo13950(l.۟ᩴۙ[], long, long, l.ܶܰܰ):void");
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public void mo13942(long j, boolean z) throws C2170 {
        this.f48817 = false;
        this.f48827 = false;
        this.f48829 = false;
        if (!this.f48844) {
            m35929();
        } else {
            this.f48823 = -9223372036854775807L;
            this.f48841 = -9223372036854775807L;
            this.f48833 = -9223372036854775807L;
            this.f48798 = false;
            this.f48791.mo7();
            this.f48822.mo7();
            this.f48840 = false;
            this.f48801.m30764();
        }
        if (this.f48815.f74003.m11202() > 0) {
            this.f48812 = true;
        }
        this.f48815.f74003.m11200();
        this.f48797.clear();
    }

    @Override // l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public void mo13257(float f, float f2) throws C2170 {
        this.f48819 = f;
        this.f48818 = f2;
        m35905(this.f48836);
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۧ */
    public void mo13958() {
        this.f48843 = null;
        m35902(C22716.f74001);
        this.f48797.clear();
        if (!this.f48844) {
            m35906();
            return;
        }
        this.f48844 = false;
        this.f48823 = -9223372036854775807L;
        this.f48841 = -9223372036854775807L;
        this.f48833 = -9223372036854775807L;
        this.f48798 = false;
        this.f48791.mo7();
        this.f48822.mo7();
        this.f48840 = false;
        this.f48801.m30764();
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ֫ */
    public void mo13928() {
        try {
            this.f48844 = false;
            this.f48823 = -9223372036854775807L;
            this.f48841 = -9223372036854775807L;
            this.f48833 = -9223372036854775807L;
            this.f48798 = false;
            this.f48791.mo7();
            this.f48822.mo7();
            this.f48840 = false;
            this.f48801.m30764();
            m35933();
        } finally {
            C19084.m43862(this.f48793, (InterfaceC19790) null);
            this.f48793 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final void m35933() {
        try {
            InterfaceC13544 interfaceC13544 = this.f48830;
            if (interfaceC13544 != null) {
                interfaceC13544.mo30194();
                this.f48813.f42205++;
                C5076 c5076 = this.f48824;
                c5076.getClass();
                mo13944(c5076.f17691);
            }
            this.f48830 = null;
            try {
                MediaCrypto mediaCrypto = this.f48835;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f48835 = null;
                m35901((InterfaceC19790) null);
                m35923();
            }
        } catch (Throwable th) {
            this.f48830 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f48835;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f48835 = null;
                m35901((InterfaceC19790) null);
                m35923();
            }
        }
    }

    @Override // l.AbstractC16862, l.InterfaceC23691
    /* JADX INFO: renamed from: ۙ */
    public void mo13941(int i, Object obj) {
        if (i == 11) {
            InterfaceC3228 interfaceC3228 = (InterfaceC3228) obj;
            interfaceC3228.getClass();
            this.f48787 = interfaceC3228;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a2 A[Catch: IllegalStateException -> 0x00a4, CryptoException -> 0x00ec, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {CryptoException -> 0x00ec, IllegalStateException -> 0x00a4, blocks: (B:8:0x000f, B:10:0x0013, B:12:0x0017, B:14:0x001b, B:17:0x0023, B:19:0x002a, B:20:0x002f, B:23:0x0036, B:50:0x009e, B:51:0x00a1, B:52:0x00a2, B:24:0x003a, B:26:0x003e, B:27:0x004b, B:29:0x0056, B:31:0x005c, B:38:0x0070, B:40:0x0076, B:42:0x007c, B:49:0x0090), top: B:81:0x000f }] */
    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public void mo13260(long j, long j2) throws C2170 {
        boolean z = false;
        if (this.f48829) {
            this.f48829 = false;
            m35907();
        }
        C2170 c2170 = this.f48811;
        if (c2170 != null) {
            this.f48811 = null;
            throw c2170;
        }
        try {
            if (this.f48827) {
                mo13955();
                return;
            }
            if (this.f48843 != null || m35903(2)) {
                m35932();
                if (!this.f48844) {
                    if (this.f48830 != null) {
                        long jMo28888 = m39520().mo28888();
                        Trace.beginSection("drainAndFeed");
                        while (m35904(j, j2)) {
                            long j3 = this.f48821;
                            if (!(j3 == -9223372036854775807L || m39520().mo28888() - jMo28888 < j3)) {
                                break;
                            }
                        }
                        while (m35908()) {
                            long j4 = this.f48821;
                            if (!(j4 == -9223372036854775807L || m39520().mo28888() - jMo28888 < j4)) {
                                break;
                            }
                        }
                    } else {
                        this.f48813.f42199 += m39523(j);
                        m35903(1);
                    }
                    synchronized (this.f48813) {
                    }
                }
                Trace.beginSection("bypassRender");
                while (m35896(j, j2)) {
                }
                Trace.endSection();
                synchronized (this.f48813) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw m39516(e, this.f48843, C17983.m41807(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z2 = e2 instanceof MediaCodec.CodecException;
            if (!z2) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            mo13943(e2);
            if (z2 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z = true;
            }
            if (z) {
                m35933();
            }
            C2253 c2253Mo13937 = mo13937(e2, this.f48824);
            throw m39517(c2253Mo13937, this.f48843, z, c2253Mo13937.f8056 == 1101 ? 4006 : 4003);
        }
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final void m35929() throws C2170 {
        if (m35906()) {
            m35932();
        }
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    private boolean m35906() {
        if (this.f48830 != null) {
            if (mo13964()) {
                m35933();
                return true;
            }
            if (mo13963()) {
                m35910();
                return false;
            }
            if (this.f48845 != -9223372036854775807L) {
                long jM39528 = m39528();
                long j = this.f48845;
                if (jM39528 <= j && this.f48833 < j) {
                    this.f48807 = true;
                    this.f48845 = -9223372036854775807L;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩶ۙ */
    public boolean mo13964() {
        int i = this.f48834;
        if (i == 3 || ((this.f48796 && !this.f48800) || (this.f48826 && this.f48806))) {
            return true;
        }
        if (i == 2) {
            int i2 = Build.VERSION.SDK_INT;
            C2023.m6510(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m35912();
                    return false;
                } catch (C2170 e) {
                    C0303.m1852("Failed to update the DRM session, releasing the codec instead.", e);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35935() {
        return this.f48807;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    private void m35910() {
        try {
            InterfaceC13544 interfaceC13544 = this.f48830;
            C2023.m6508(interfaceC13544);
            interfaceC13544.flush();
        } finally {
            mo13957();
        }
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final void m35923() {
        mo13957();
        this.f48811 = null;
        this.f48783 = null;
        this.f48824 = null;
        this.f48836 = null;
        this.f48846 = null;
        this.f48820 = false;
        this.f48800 = false;
        this.f48810 = -1.0f;
        this.f48832 = 0;
        this.f48796 = false;
        this.f48826 = false;
        this.f48814 = false;
        this.f48828 = false;
        this.f48794 = false;
        this.f48789 = 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public C2253 mo13937(IllegalStateException illegalStateException, C5076 c5076) {
        return new C2253(illegalStateException, c5076);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m35903(int i) throws C2170 {
        C12526 c12526M39525 = m39525();
        C16033 c16033 = this.f48809;
        c16033.mo7();
        int iM39515 = m39515(c12526M39525, c16033, i | 4);
        if (iM39515 == -5) {
            mo13939(c12526M39525);
            return true;
        }
        if (iM39515 != -4 || !c16033.m42264()) {
            return false;
        }
        this.f48817 = true;
        m35907();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35899(MediaCrypto mediaCrypto, boolean z) throws C3664 {
        C7648 c7648 = this.f48843;
        c7648.getClass();
        if (this.f48783 == null) {
            try {
                List listM35897 = m35897(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f48783 = arrayDeque;
                if (this.f48788) {
                    arrayDeque.addAll(listM35897);
                } else {
                    ArrayList arrayList = (ArrayList) listM35897;
                    if (!arrayList.isEmpty()) {
                        this.f48783.add((C5076) arrayList.get(0));
                    }
                }
                this.f48847 = null;
            } catch (C8605 e) {
                throw new C3664(c7648, e, z, -49998);
            }
        }
        if (this.f48783.isEmpty()) {
            throw new C3664(c7648, (C8605) null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.f48783;
        arrayDeque2.getClass();
        while (this.f48830 == null) {
            C5076 c5076 = (C5076) arrayDeque2.peekFirst();
            c5076.getClass();
            if (!mo13960(c7648) || !mo13953(c5076)) {
                return;
            }
            try {
                m35900(c5076, mediaCrypto);
            } catch (Exception e2) {
                C0303.m1852("Failed to initialize decoder: " + c5076, e2);
                arrayDeque2.removeFirst();
                C3664 c3664 = new C3664(c7648, e2, z, c5076);
                mo13943(c3664);
                if (this.f48847 == null) {
                    this.f48847 = c3664;
                } else {
                    this.f48847 = C3664.m10822(this.f48847);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f48847;
                }
            }
        }
        this.f48783 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private List m35897(boolean z) {
        C7648 c7648 = this.f48843;
        c7648.getClass();
        InterfaceC21304 interfaceC21304 = this.f48803;
        ArrayList arrayListMo13935 = mo13935(interfaceC21304, c7648, z);
        if (!arrayListMo13935.isEmpty() || !z) {
            return arrayListMo13935;
        }
        ArrayList arrayListMo13936 = mo13935(interfaceC21304, c7648, false);
        if (!arrayListMo13936.isEmpty()) {
            C0303.m1848("Drm session requires secure decoder for " + c7648.f25265 + ", but no secure decoder available. Trying to proceed with " + arrayListMo13936 + ".");
        }
        return arrayListMo13936;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35900(C5076 c5076, MediaCrypto mediaCrypto) {
        int i;
        this.f48824 = c5076;
        C7648 c7648 = this.f48843;
        c7648.getClass();
        String str = c5076.f17691;
        int i2 = Build.VERSION.SDK_INT;
        float fMo13932 = i2 < 23 ? -1.0f : mo13932(this.f48818, c7648, m39526());
        float f = fMo13932 > this.f48842 ? fMo13932 : -1.0f;
        long jMo28888 = m39520().mo28888();
        C1735 c1735Mo13936 = mo13936(c5076, c7648, mediaCrypto, f);
        if (i2 >= 31) {
            C12838.m31833(c1735Mo13936, m39514());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            InterfaceC13544 interfaceC13544Mo16259 = this.f48802.mo16259(c1735Mo13936);
            this.f48830 = interfaceC13544Mo16259;
            interfaceC13544Mo16259.mo30202(new C6487(this));
            Trace.endSection();
            long jMo28889 = m39520().mo28888();
            if (!c5076.m14154(c7648)) {
                String strM20199 = C7648.m20199(c7648);
                Locale locale = Locale.US;
                C0303.m1848("Format exceeds selected codec's capabilities [" + strM20199 + ", " + str + "]");
            }
            this.f48810 = f;
            this.f48836 = c7648;
            if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i = 2;
                } else if (i2 < 24) {
                    i = 0;
                } else {
                    i = 0;
                }
            } else if (i2 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i = 0;
            } else {
                String str3 = Build.DEVICE;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            this.f48832 = i;
            this.f48796 = i2 == 29 && "c2.android.aac.decoder".equals(str);
            this.f48826 = i2 <= 23 && "OMX.google.vorbis.decoder".equals(str);
            this.f48814 = i2 == 21 && "OMX.google.aac.decoder".equals(str);
            String str4 = c5076.f17691;
            this.f48828 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str4)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && c5076.f17688) || mo13966());
            this.f48830.getClass();
            if (getState() == 2) {
                this.f48838 = m39520().mo28888() + 1000;
            }
            this.f48813.f42200++;
            mo13945(str, jMo28889, jMo28889 - jMo28888);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۤۙ */
    public void mo13957() {
        this.f48784 = -1;
        this.f48816.f51912 = null;
        this.f48782 = -1;
        this.f48839 = null;
        this.f48823 = -9223372036854775807L;
        this.f48841 = -9223372036854775807L;
        this.f48833 = -9223372036854775807L;
        this.f48838 = -9223372036854775807L;
        this.f48806 = false;
        this.f48831 = -9223372036854775807L;
        this.f48785 = false;
        this.f48781 = false;
        this.f48786 = false;
        this.f48792 = false;
        this.f48799 = false;
        this.f48804 = 0;
        this.f48834 = 0;
        this.f48789 = this.f48794 ? 1 : 0;
        this.f48807 = false;
        this.f48790 = -9223372036854775807L;
        this.f48845 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35901(InterfaceC19790 interfaceC19790) {
        C19084.m43862(this.f48808, interfaceC19790);
        this.f48808 = interfaceC19790;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    private boolean m35908() throws C2170 {
        InterfaceC13544 interfaceC13544 = this.f48830;
        if (interfaceC13544 == null || this.f48804 == 2 || this.f48817) {
            return false;
        }
        int i = this.f48784;
        C16033 c16033 = this.f48816;
        if (i < 0) {
            int iMo30191 = interfaceC13544.mo30191();
            this.f48784 = iMo30191;
            if (iMo30191 < 0) {
                return false;
            }
            c16033.f51912 = interfaceC13544.mo30206(iMo30191);
            c16033.mo7();
        }
        if (this.f48804 == 1) {
            if (!this.f48828) {
                this.f48806 = true;
                interfaceC13544.mo30196(this.f48784, 0, 4, 0L);
                this.f48784 = -1;
                c16033.f51912 = null;
            }
            this.f48804 = 2;
            return false;
        }
        if (this.f48781) {
            this.f48781 = false;
            ByteBuffer byteBuffer = c16033.f51912;
            byteBuffer.getClass();
            byteBuffer.put(f48780);
            interfaceC13544.mo30196(this.f48784, 38, 0, 0L);
            this.f48784 = -1;
            c16033.f51912 = null;
            this.f48785 = true;
            return true;
        }
        if (this.f48789 == 1) {
            int i2 = 0;
            while (true) {
                C7648 c7648 = this.f48836;
                c7648.getClass();
                if (i2 >= c7648.f25268.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.f48836.f25268.get(i2);
                ByteBuffer byteBuffer2 = c16033.f51912;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i2++;
            }
            this.f48789 = 2;
        }
        ByteBuffer byteBuffer3 = c16033.f51912;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        C12526 c12526M39525 = m39525();
        try {
            int iM39515 = m39515(c12526M39525, c16033, 0);
            if (iM39515 == -3) {
                if (!mo13253()) {
                    return false;
                }
                this.f48841 = this.f48823;
                return false;
            }
            if (iM39515 == -5) {
                if (this.f48789 == 2) {
                    c16033.mo7();
                    this.f48789 = 1;
                }
                mo13939(c12526M39525);
                return true;
            }
            if (c16033.m42264()) {
                this.f48841 = this.f48823;
                if (this.f48789 == 2) {
                    c16033.mo7();
                    this.f48789 = 1;
                }
                this.f48817 = true;
                if (!this.f48785) {
                    m35907();
                    return false;
                }
                if (this.f48828) {
                    return false;
                }
                this.f48806 = true;
                interfaceC13544.mo30196(this.f48784, 0, 4, 0L);
                this.f48784 = -1;
                c16033.f51912 = null;
                return false;
            }
            if (!this.f48785 && !c16033.m42269()) {
                c16033.mo7();
                if (this.f48789 == 2) {
                    this.f48789 = 1;
                    return true;
                }
            } else if (!mo13930(c16033)) {
                boolean zM38026 = c16033.m38026();
                if (zM38026) {
                    c16033.f51908.m23288(iPosition);
                }
                long j = c16033.f51910;
                if (this.f48812) {
                    ArrayDeque arrayDeque = this.f48797;
                    if (arrayDeque.isEmpty()) {
                        C3871 c3871 = this.f48815.f74003;
                        C7648 c7649 = this.f48843;
                        c7649.getClass();
                        c3871.m11201(j, c7649);
                    } else {
                        C3871 c3872 = ((C22716) arrayDeque.peekLast()).f74003;
                        C7648 c76410 = this.f48843;
                        c76410.getClass();
                        c3872.m11201(j, c76410);
                    }
                    this.f48812 = false;
                }
                this.f48823 = Math.max(this.f48823, j);
                if (mo13253() || c16033.m42272()) {
                    this.f48841 = this.f48823;
                }
                c16033.m38025();
                if (c16033.m42268()) {
                    mo13961(c16033);
                }
                mo13959(c16033);
                int iMo13933 = mo13933(c16033);
                if ((Build.VERSION.SDK_INT < 34 || (iMo13933 & 32) == 0) && !m39529().f18886) {
                    this.f48845 = Math.max(this.f48845, c16033.f51910);
                }
                if (zM38026) {
                    interfaceC13544.mo30198(this.f48784, c16033.f51908, j, iMo13933);
                } else {
                    int i3 = this.f48784;
                    ByteBuffer byteBuffer4 = c16033.f51912;
                    byteBuffer4.getClass();
                    interfaceC13544.mo30196(i3, byteBuffer4.limit(), iMo13933, j);
                }
                this.f48784 = -1;
                c16033.f51912 = null;
                this.f48785 = true;
                this.f48789 = 0;
                this.f48813.f42197++;
                return true;
            }
            return true;
        } catch (C20971 e) {
            mo13943(e);
            m35903(0);
            m35910();
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x014e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0168  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00da, code lost:
    
        if (r3.mo28384(r2) != false) goto L129;
     */
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l.C17567 mo13939(l.C12526 r13) throws l.C2170 {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC14955.mo13939(l.۫ܽۙ):l.ܿ᩶ۙ");
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final long m35927() {
        return this.f48841;
    }

    /* JADX INFO: renamed from: ۖ */
    public void mo13929(long j) {
        this.f48833 = j;
        while (true) {
            ArrayDeque arrayDeque = this.f48797;
            if (arrayDeque.isEmpty() || j < ((C22716) arrayDeque.peek()).f74005) {
                return;
            }
            C22716 c22716 = (C22716) arrayDeque.poll();
            c22716.getClass();
            m35902(c22716);
            mo13954();
        }
    }

    @Override // l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ܰ */
    public boolean mo13268() {
        return this.f48827;
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۚ */
    public boolean mo13264() {
        if (this.f48843 == null) {
            return false;
        }
        if (m39519() || this.f48782 >= 0) {
            return true;
        }
        return this.f48838 != -9223372036854775807L && m39520().mo28888() < this.f48838;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final float m35936() {
        return this.f48819;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3228 m35930() {
        return this.f48787;
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final void m35913() throws C2170 {
        m35905(this.f48836);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m35905(C7648 c7648) throws C2170 {
        if (Build.VERSION.SDK_INT >= 23 && this.f48830 != null && this.f48834 != 3 && getState() != 0) {
            float f = this.f48818;
            c7648.getClass();
            float fMo13932 = mo13932(f, c7648, m39526());
            float f2 = this.f48810;
            if (f2 != fMo13932) {
                if (fMo13932 == -1.0f) {
                    if (this.f48785) {
                        this.f48804 = 1;
                        this.f48834 = 3;
                        return false;
                    }
                    m35933();
                    m35932();
                    return false;
                }
                if (f2 != -1.0f || fMo13932 > this.f48842) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fMo13932);
                    InterfaceC13544 interfaceC13544 = this.f48830;
                    interfaceC13544.getClass();
                    interfaceC13544.mo30199(bundle);
                    this.f48810 = fMo13932;
                }
            }
        }
        return true;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    private boolean m35909() throws C2170 {
        if (this.f48785) {
            this.f48804 = 1;
            if (this.f48826) {
                this.f48834 = 3;
                return false;
            }
            this.f48834 = 2;
            return true;
        }
        m35912();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:84:0x0143  */
    /* JADX WARN: Code duplicated, block: B:86:0x0171  */
    /* JADX WARN: Code duplicated, block: B:88:0x017f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0181  */
    /* JADX WARN: Code duplicated, block: B:98:0x019e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x019f  */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m35904(long j, long j2) throws C2170 {
        boolean z;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        MediaCodec.BufferInfo bufferInfo;
        boolean zMo13951;
        boolean z5;
        boolean z6;
        long j4;
        int iMo30193;
        InterfaceC13544 interfaceC13544 = this.f48830;
        interfaceC13544.getClass();
        int i = this.f48782;
        MediaCodec.BufferInfo bufferInfo2 = this.f48825;
        if (i >= 0) {
            if (bufferInfo2.presentationTimeUs < m39528()) {
                z = true;
            } else {
                z = false;
            }
            this.f48792 = z;
            j3 = this.f48841;
            if (j3 != -9223372036854775807L) {
                z2 = false;
            } else {
                z2 = false;
            }
            this.f48799 = z2;
            if (this.f48807) {
                j4 = this.f48790;
                if (j4 != -9223372036854775807L) {
                    this.f48790 = bufferInfo2.presentationTimeUs;
                    this.f48792 = true;
                    this.f48799 = false;
                } else {
                    this.f48790 = bufferInfo2.presentationTimeUs;
                    this.f48792 = true;
                    this.f48799 = false;
                }
            }
            if (this.f48814) {
                z3 = false;
                z4 = true;
                ByteBuffer byteBuffer = this.f48839;
                int i2 = this.f48782;
                int i3 = bufferInfo2.flags;
                long j5 = bufferInfo2.presentationTimeUs;
                boolean z7 = this.f48792;
                boolean z8 = this.f48799;
                C7648 c7648 = this.f48837;
                c7648.getClass();
                bufferInfo = bufferInfo2;
                zMo13951 = mo13951(j, j2, interfaceC13544, byteBuffer, i2, i3, 1, j5, z7, z8, c7648);
            } else {
                z3 = false;
                z4 = true;
                ByteBuffer byteBuffer2 = this.f48839;
                int i4 = this.f48782;
                int i5 = bufferInfo2.flags;
                long j6 = bufferInfo2.presentationTimeUs;
                boolean z9 = this.f48792;
                boolean z10 = this.f48799;
                C7648 c7649 = this.f48837;
                c7649.getClass();
                bufferInfo = bufferInfo2;
                zMo13951 = mo13951(j, j2, interfaceC13544, byteBuffer2, i4, i5, 1, j6, z9, z10, c7649);
            }
            if (zMo13951) {
                mo13929(bufferInfo.presentationTimeUs);
                if ((bufferInfo.flags & 4) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    this.f48831 = m39520().mo28886();
                }
                this.f48782 = -1;
                this.f48839 = null;
                if (!z5) {
                    return z4;
                }
                m35907();
            }
            return z3;
        }
        if (this.f48814 && this.f48806) {
            try {
                iMo30193 = interfaceC13544.mo30193(bufferInfo2);
            } catch (IllegalStateException unused) {
                m35907();
                if (this.f48827) {
                    m35933();
                }
            }
        } else {
            iMo30193 = interfaceC13544.mo30193(bufferInfo2);
        }
        if (iMo30193 >= 0) {
            if (this.f48786) {
                this.f48786 = false;
                interfaceC13544.mo30204(iMo30193);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m35907();
                return false;
            }
            this.f48782 = iMo30193;
            ByteBuffer byteBufferMo30192 = interfaceC13544.mo30192(iMo30193);
            this.f48839 = byteBufferMo30192;
            if (byteBufferMo30192 != null) {
                byteBufferMo30192.position(bufferInfo2.offset);
                this.f48839.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            m35920(bufferInfo2.presentationTimeUs);
            if (bufferInfo2.presentationTimeUs < m39528()) {
                z = true;
            } else {
                z = false;
            }
            this.f48792 = z;
            j3 = this.f48841;
            if (j3 != -9223372036854775807L || j3 > bufferInfo2.presentationTimeUs) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f48799 = z2;
            if (this.f48807) {
                j4 = this.f48790;
                if (j4 != -9223372036854775807L || bufferInfo2.presentationTimeUs > j4) {
                    this.f48790 = bufferInfo2.presentationTimeUs;
                    this.f48792 = true;
                    this.f48799 = false;
                } else {
                    this.f48807 = false;
                    this.f48790 = -9223372036854775807L;
                }
            }
            if (this.f48814 || !this.f48806) {
                z3 = false;
                z4 = true;
                ByteBuffer byteBuffer3 = this.f48839;
                int i6 = this.f48782;
                int i7 = bufferInfo2.flags;
                long j7 = bufferInfo2.presentationTimeUs;
                boolean z11 = this.f48792;
                boolean z12 = this.f48799;
                C7648 c76410 = this.f48837;
                c76410.getClass();
                bufferInfo = bufferInfo2;
                zMo13951 = mo13951(j, j2, interfaceC13544, byteBuffer3, i6, i7, 1, j7, z11, z12, c76410);
            } else {
                try {
                    ByteBuffer byteBuffer4 = this.f48839;
                    int i8 = this.f48782;
                    int i9 = bufferInfo2.flags;
                    long j8 = bufferInfo2.presentationTimeUs;
                    boolean z13 = this.f48792;
                    boolean z14 = this.f48799;
                    C7648 c76411 = this.f48837;
                    c76411.getClass();
                    z4 = true;
                    zMo13951 = mo13951(j, j2, interfaceC13544, byteBuffer4, i8, i9, 1, j8, z13, z14, c76411);
                    bufferInfo = bufferInfo2;
                    z3 = false;
                } catch (IllegalStateException unused2) {
                    z6 = false;
                    m35907();
                    if (this.f48827) {
                        m35933();
                    }
                }
            }
            if (zMo13951) {
                mo13929(bufferInfo.presentationTimeUs);
                if ((bufferInfo.flags & 4) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5 && this.f48806 && this.f48799) {
                    this.f48831 = m39520().mo28886();
                }
                this.f48782 = -1;
                this.f48839 = null;
                if (!z5) {
                    return z4;
                }
                m35907();
            }
            return z3;
        }
        if (iMo30193 == -2) {
            this.f48800 = true;
            InterfaceC13544 interfaceC13545 = this.f48830;
            interfaceC13545.getClass();
            MediaFormat mediaFormatMo30205 = interfaceC13545.mo30205();
            if (this.f48832 != 0 && mediaFormatMo30205.getInteger("width") == 32 && mediaFormatMo30205.getInteger("height") == 32) {
                this.f48786 = true;
                return true;
            }
            this.f48846 = mediaFormatMo30205;
            this.f48820 = true;
            return true;
        }
        if (this.f48828 && (this.f48817 || this.f48804 == 2)) {
            m35907();
        }
        long j9 = this.f48831;
        if (j9 != -9223372036854775807L && j9 + 100 < m39520().mo28886()) {
            m35907();
            return false;
        }
        z6 = false;
        return z6;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    private void m35907() throws C2170 {
        int i = this.f48834;
        if (i == 1) {
            m35910();
            return;
        }
        if (i == 2) {
            m35910();
            m35912();
        } else if (i != 3) {
            this.f48827 = true;
            mo13955();
        } else {
            m35933();
            m35932();
        }
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final void m35934() {
        this.f48829 = true;
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final long m35917() {
        return this.f48815.f74002;
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final long m35922() {
        return this.f48815.f74004;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35902(C22716 c22716) {
        this.f48815 = c22716;
        long j = c22716.f74002;
        if (j != -9223372036854775807L) {
            this.f48805 = true;
            mo35925(j);
        }
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    private void m35912() throws C2170 {
        InterfaceC19790 interfaceC19790 = this.f48793;
        interfaceC19790.getClass();
        InterfaceC18854 interfaceC18854Mo28385 = interfaceC19790.mo28385();
        if (interfaceC18854Mo28385 instanceof C4701) {
            try {
                MediaCrypto mediaCrypto = this.f48835;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((C4701) interfaceC18854Mo28385).f16596);
            } catch (MediaCryptoException e) {
                throw m39516(e, this.f48843, 6006);
            }
        }
        m35901(this.f48793);
        this.f48804 = 0;
        this.f48834 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[EDGE_INSN: B:34:0x00cd->B:72:0x01a8 BREAK  A[LOOP:0: B:26:0x00b7->B:87:?]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX WARN: Code duplicated, block: B:59:0x0167  */
    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0188  */
    /* JADX WARN: Code duplicated, block: B:68:0x019c  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[LOOP:0: B:26:0x00b7->B:87:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m35896(long j, long j2) throws C2170 {
        C17258 c17258;
        C17258 c17259;
        C12526 c12526M39525;
        int iM39515;
        C7648 c7648;
        long jM39528;
        C7648 c7649;
        C2023.m6510(!this.f48827);
        C17258 c172510 = this.f48791;
        if (c172510.m40221()) {
            ByteBuffer byteBuffer = c172510.f51912;
            int i = this.f48782;
            int iM40223 = c172510.m40223();
            long j3 = c172510.f51910;
            boolean zM35911 = m35911(m39528(), c172510.m40222());
            boolean zM42264 = c172510.m42264();
            C7648 c76410 = this.f48837;
            c76410.getClass();
            c17258 = c172510;
            if (mo13951(j, j2, null, byteBuffer, i, 0, iM40223, j3, zM35911, zM42264, c76410)) {
                mo13929(c17258.m40222());
                c17258.mo7();
            }
            return false;
        }
        c17258 = c172510;
        if (this.f48817) {
            this.f48827 = true;
            return false;
        }
        boolean z = this.f48840;
        C16033 c16033 = this.f48822;
        if (z) {
            c17259 = c17258;
            C2023.m6510(c17259.m40220(c16033));
            this.f48840 = false;
        } else {
            c17259 = c17258;
        }
        boolean z2 = this.f48798;
        C12361 c12361 = this.f48801;
        if (z2) {
            if (c17259.m40221()) {
                return true;
            }
            this.f48844 = false;
            this.f48823 = -9223372036854775807L;
            this.f48841 = -9223372036854775807L;
            this.f48833 = -9223372036854775807L;
            this.f48798 = false;
            c17259.mo7();
            c16033.mo7();
            this.f48840 = false;
            c12361.m30764();
            this.f48798 = false;
            m35932();
            if (this.f48844) {
                C2023.m6510(!this.f48817);
                c12526M39525 = m39525();
                c16033.mo7();
                while (true) {
                    c16033.mo7();
                    iM39515 = m39515(c12526M39525, c16033, 0);
                    if (iM39515 != -5) {
                        mo13939(c12526M39525);
                        break;
                    }
                    if (iM39515 != -4) {
                        if (c16033.m42264()) {
                            this.f48817 = true;
                            this.f48841 = this.f48823;
                            break;
                        }
                        this.f48823 = Math.max(this.f48823, c16033.f51910);
                        if (!mo13253()) {
                            this.f48841 = this.f48823;
                        } else {
                            this.f48841 = this.f48823;
                        }
                        if (this.f48812) {
                            c7649 = this.f48843;
                            c7649.getClass();
                            this.f48837 = c7649;
                            if (C13638.equals(c7649.f25265, "audio/opus")) {
                                byte[] bArr = (byte[]) this.f48837.f25268.get(0);
                                int i2 = (bArr[10] & 255) | ((bArr[11] & 255) << 8);
                                C10471 c10471M20201 = this.f48837.m20201();
                                c10471M20201.m26496(i2);
                                this.f48837 = c10471M20201.m26497();
                            }
                            mo13946(this.f48837, (MediaFormat) null);
                            this.f48812 = false;
                        }
                        c16033.m38025();
                        c7648 = this.f48837;
                        if (c7648 != null) {
                            if (c16033.m42268()) {
                                c16033.f51911 = this.f48837;
                                mo13961(c16033);
                            }
                            if (C17874.m41464(m39528(), c16033.f51910)) {
                                c12361.m30765(c16033, this.f48837.f25268);
                            }
                        }
                        if (!c17259.m40221()) {
                            if (!c17259.m40220(c16033)) {
                            }
                        } else {
                            jM39528 = m39528();
                            if (m35911(jM39528, c17259.m40222()) == m35911(jM39528, c16033.f51910)) {
                                if (!c17259.m40220(c16033)) {
                                }
                            }
                        }
                        this.f48840 = true;
                        break;
                    }
                    if (iM39515 == -3) {
                        if (mo13253()) {
                            break;
                        }
                        this.f48841 = this.f48823;
                        break;
                    }
                    throw new IllegalStateException();
                }
                if (c17259.m40221()) {
                    c17259.m38025();
                }
                return !c17259.m40221() ? true : true;
            }
        } else {
            C2023.m6510(!this.f48817);
            c12526M39525 = m39525();
            c16033.mo7();
            while (true) {
                c16033.mo7();
                iM39515 = m39515(c12526M39525, c16033, 0);
                if (iM39515 != -5) {
                    mo13939(c12526M39525);
                    break;
                }
                if (iM39515 != -4) {
                    if (c16033.m42264()) {
                        this.f48817 = true;
                        this.f48841 = this.f48823;
                        break;
                    }
                    this.f48823 = Math.max(this.f48823, c16033.f51910);
                    if (!mo13253() || this.f48816.m42272()) {
                        this.f48841 = this.f48823;
                    }
                    if (this.f48812) {
                        c7649 = this.f48843;
                        c7649.getClass();
                        this.f48837 = c7649;
                        if (C13638.equals(c7649.f25265, "audio/opus") && !this.f48837.f25268.isEmpty()) {
                            byte[] bArr2 = (byte[]) this.f48837.f25268.get(0);
                            int i3 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                            C10471 c10471M20202 = this.f48837.m20201();
                            c10471M20202.m26496(i3);
                            this.f48837 = c10471M20202.m26497();
                        }
                        mo13946(this.f48837, (MediaFormat) null);
                        this.f48812 = false;
                    }
                    c16033.m38025();
                    c7648 = this.f48837;
                    if (c7648 != null && C13638.equals(c7648.f25265, "audio/opus")) {
                        if (c16033.m42268()) {
                            c16033.f51911 = this.f48837;
                            mo13961(c16033);
                        }
                        if (C17874.m41464(m39528(), c16033.f51910)) {
                            c12361.m30765(c16033, this.f48837.f25268);
                        }
                    }
                    if (!c17259.m40221()) {
                        if (!c17259.m40220(c16033)) {
                        }
                    } else {
                        jM39528 = m39528();
                        if (m35911(jM39528, c17259.m40222()) == m35911(jM39528, c16033.f51910)) {
                            if (!c17259.m40220(c16033)) {
                            }
                        }
                    }
                    this.f48840 = true;
                    break;
                }
                if (iM39515 == -3) {
                    if (mo13253()) {
                        break;
                    }
                    this.f48841 = this.f48823;
                    break;
                }
                throw new IllegalStateException();
            }
            if (c17259.m40221()) {
                c17259.m38025();
            }
            if (!c17259.m40221() || this.f48817 || this.f48798) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m35911(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        C7648 c7648 = this.f48837;
        return (c7648 != null && C13638.equals(c7648.f25265, "audio/opus") && C17874.m41464(j, j2)) ? false : true;
    }
}
