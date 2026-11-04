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

/* JADX INFO: renamed from: l.۠ۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8454 extends AbstractC25280 {

    /* JADX INFO: renamed from: ᩴۤ, reason: not valid java name and contains not printable characters */
    public static final byte[] f27644 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, UTF8.S_CS3, 0, 0, 1, 101, -120, -124, cb.k, -50, KeyFactorySpi.Ed448_type, 24, -96, 0, 47, -65, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean f27645;

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public boolean f27646;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public float f27647;

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public C18566 f27648;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final C17404 f27649;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public boolean f27650;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f27651;

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public long f27652;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6218 f27653;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC6963 f27654;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public long f27655;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public ByteBuffer f27656;

    /* JADX INFO: renamed from: ۙۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC10756 f27657;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public boolean f27658;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C5690 f27659;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public boolean f27660;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10756 f27661;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public final C5690 f27662;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f27663;

    /* JADX INFO: renamed from: ۜ᩷, reason: not valid java name and contains not printable characters */
    public boolean f27664;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f27665;

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public C2488 f27666;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f27667;

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public boolean f27668;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public MediaFormat f27669;

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public C0997 f27670;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public boolean f27671;

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f27672;

    /* JADX INFO: renamed from: ۤۤ, reason: not valid java name and contains not printable characters */
    public boolean f27673;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public C17074 f27674;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f27675;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public boolean f27676;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f27677;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public boolean f27678;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f27679;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public int f27680;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public int f27681;

    /* JADX INFO: renamed from: ۬᩷, reason: not valid java name and contains not printable characters */
    public long f27682;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C0251 f27683;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public final MediaCodec.BufferInfo f27684;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final float f27685;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public C15648 f27686;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC14420 f27687;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public long f27688;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final C5690 f27689;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public long f27690;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f27691;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public long f27692;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean f27693;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public int f27694;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f27695;

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public boolean f27696;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public boolean f27697;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f27698;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public MediaCrypto f27699;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C15648 f27700;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public C15648 f27701;

    /* JADX INFO: renamed from: ᩷ۤ, reason: not valid java name and contains not printable characters */
    public float f27702;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public float f27703;

    /* JADX INFO: renamed from: ᩸ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC24140 f27704;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public final boolean f27705;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f27706;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public long f27707;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f27708;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public final C16483 f27709;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f27710;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public long f27711;

    @Override // l.AbstractC25280, l.InterfaceC18172
    /* JADX INFO: renamed from: ۗ */
    public final int mo11268() {
        return 8;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo22663();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract float mo22665(float f, C15648 c15648, C15648[] c15648Arr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo22666(C5690 c5690) {
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract int mo22667(InterfaceC6963 interfaceC6963, C15648 c15648);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract ArrayList mo22668(InterfaceC6963 interfaceC6963, C15648 c15648, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract C12183 mo22669(C0251 c0251, C15648 c15648, MediaCrypto mediaCrypto, float f);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract C17820 mo22670(C0251 c0251, C15648 c15648, C15648 c15649);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo22673(Exception exc);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo22674(String str);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo22675(String str, long j, long j2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo22676(C15648 c15648, MediaFormat mediaFormat);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo22679(long j, long j2, InterfaceC14420 interfaceC14420, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C15648 c15648);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo22680(C0251 c0251) {
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo22686(long j) {
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo22687(C5690 c5690) {
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean mo22688(C15648 c15648) {
        return true;
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo22691();

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean mo22693() {
        return true;
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean mo22694() {
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo22703(C5690 c5690);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean mo22707(C5690 c5690) {
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean mo22708(C15648 c15648) {
        return false;
    }

    public AbstractC8454(int i, InterfaceC6218 interfaceC6218, InterfaceC6963 interfaceC6963, boolean z, float f) {
        super(i);
        this.f27653 = interfaceC6218;
        interfaceC6963.getClass();
        this.f27654 = interfaceC6963;
        this.f27705 = z;
        this.f27685 = f;
        this.f27662 = new C5690(0, 0);
        this.f27659 = new C5690(0, 0);
        this.f27689 = new C5690(2, 0);
        C17404 c17404 = new C17404();
        this.f27649 = c17404;
        this.f27684 = new MediaCodec.BufferInfo();
        this.f27703 = 1.0f;
        this.f27702 = 1.0f;
        this.f27652 = -9223372036854775807L;
        this.f27672 = new ArrayDeque();
        this.f27666 = C2488.f7960;
        c17404.m16711(0);
        c17404.f19651.order(ByteOrder.nativeOrder());
        this.f27709 = new C16483();
        this.f27647 = -1.0f;
        this.f27706 = 0;
        this.f27681 = 0;
        this.f27680 = -1;
        this.f27694 = -1;
        this.f27655 = -9223372036854775807L;
        this.f27690 = -9223372036854775807L;
        this.f27692 = -9223372036854775807L;
        this.f27707 = -9223372036854775807L;
        this.f27688 = -9223372036854775807L;
        this.f27677 = 0;
        this.f27698 = 0;
        this.f27674 = new C17074();
        this.f27682 = -9223372036854775807L;
        this.f27711 = -9223372036854775807L;
    }

    @Override // l.InterfaceC18172
    /* JADX INFO: renamed from: ۙ */
    public final int mo11185(C15648 c15648) throws C18566 {
        try {
            return mo22667(this.f27654, c15648);
        } catch (C22822 e) {
            throw m56444(e, c15648, 4002);
        }
    }

    @Override // l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ᩷ */
    public final long mo12954(long j, long j2) {
        return mo22685(j, j2);
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m22681() {
        this.f27697 = true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long mo22685(long j, long j2) {
        return super.mo12954(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c0 A[Catch: ֨ۜۙ -> 0x00ef, TryCatch #0 {֨ۜۙ -> 0x00ef, blocks: (B:49:0x00bc, B:51:0x00c0, B:53:0x00c7, B:55:0x00cf, B:58:0x00db), top: B:69:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final void m22710() throws C18566 {
        C15648 c15648;
        InterfaceC10756 interfaceC10756;
        InterfaceC10756 interfaceC10757;
        if (this.f27687 != null || this.f27710 || (c15648 = this.f27686) == null) {
            return;
        }
        String str = c15648.f50848;
        boolean z = false;
        if (!m22704(c15648)) {
            m22652(this.f27657);
            if (this.f27661 == null) {
                try {
                    interfaceC10756 = this.f27661;
                    if (interfaceC10756 != null && (interfaceC10756.getState() == 3 || this.f27661.getState() == 4)) {
                        interfaceC10757 = this.f27661;
                        C20782.m47566(str);
                        if (interfaceC10757.mo27413(str)) {
                            z = true;
                        }
                    }
                    m22649(this.f27699, z);
                } catch (C0997 e) {
                    throw m56444(e, c15648, OpenAuthTask.NOT_INSTALLED);
                }
            } else {
                C20782.m47568(this.f27699 == null);
                InterfaceC10756 interfaceC10758 = this.f27661;
                InterfaceC4944 interfaceC4944Mo27414 = interfaceC10758.mo27414();
                if (!C4045.f13782 || !(interfaceC4944Mo27414 instanceof C4045)) {
                    if (interfaceC4944Mo27414 == null) {
                        if (interfaceC10758.getError() != null) {
                        }
                    } else if (interfaceC4944Mo27414 instanceof C4045) {
                        C4045 c4045 = (C4045) interfaceC4944Mo27414;
                        try {
                            this.f27699 = new MediaCrypto(c4045.f13784, c4045.f13783);
                        } catch (MediaCryptoException e2) {
                            throw m56444(e2, this.f27686, 6006);
                        }
                    }
                    interfaceC10756 = this.f27661;
                    if (interfaceC10756 != null) {
                        interfaceC10757 = this.f27661;
                        C20782.m47566(str);
                        if (interfaceC10757.mo27413(str)) {
                            z = true;
                        }
                    }
                    m22649(this.f27699, z);
                } else {
                    int state = interfaceC10758.getState();
                    if (state == 1) {
                        C21945 error = interfaceC10758.getError();
                        error.getClass();
                        throw m56444(error, this.f27686, error.f70831);
                    }
                    if (state == 4) {
                        if (interfaceC4944Mo27414 == null) {
                            if (interfaceC10758.getError() != null) {
                            }
                        } else if (interfaceC4944Mo27414 instanceof C4045) {
                            C4045 c4046 = (C4045) interfaceC4944Mo27414;
                            this.f27699 = new MediaCrypto(c4046.f13784, c4046.f13783);
                        }
                        interfaceC10756 = this.f27661;
                        if (interfaceC10756 != null) {
                            interfaceC10757 = this.f27661;
                            C20782.m47566(str);
                            if (interfaceC10757.mo27413(str)) {
                                z = true;
                            }
                        }
                        m22649(this.f27699, z);
                    }
                }
            }
            MediaCrypto mediaCrypto = this.f27699;
            if (mediaCrypto == null || this.f27687 != null) {
                return;
            }
            mediaCrypto.release();
            this.f27699 = null;
            return;
        }
        this.f27710 = false;
        this.f27690 = -9223372036854775807L;
        this.f27692 = -9223372036854775807L;
        this.f27707 = -9223372036854775807L;
        this.f27675 = false;
        C17404 c17404 = this.f27649;
        c17404.mo7();
        this.f27689.mo7();
        this.f27691 = false;
        this.f27709.m39124();
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            c17404.m40876(1);
        } else {
            c17404.m40876(32);
        }
        this.f27710 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m22704(C15648 c15648) {
        return this.f27657 == null && mo22708(c15648);
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22695() {
        return this.f27710;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22677(C18566 c18566) {
        this.f27648 = c18566;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m22699(long j) {
        C15648 c15648 = (C15648) this.f27666.f7961.m26058(j);
        if (c15648 == null && this.f27678 && this.f27669 != null) {
            c15648 = (C15648) this.f27666.f7961.m26057();
        }
        if (c15648 != null) {
            this.f27701 = c15648;
        } else if (!this.f27651 || this.f27701 == null) {
            return;
        }
        C15648 c15649 = this.f27701;
        c15649.getClass();
        mo22676(c15649, this.f27669);
        this.f27651 = false;
        this.f27678 = false;
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14420 m22689() {
        return this.f27687;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C15648 m22700() {
        return this.f27700;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final MediaFormat m22692() {
        return this.f27669;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C0251 m22709() {
        return this.f27683;
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo22678(boolean z, boolean z2) {
        this.f27674 = new C17074();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r7 >= r5) goto L16;
     */
    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo11188(l.C15648[] r14, long r15, long r17, l.C8402 r19) {
        /*
            r13 = this;
            r0 = r13
            l.ۖۜۙ r1 = r0.f27666
            long r1 = r1.f7964
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L27
            l.ۖۜۙ r1 = new l.ۖۜۙ
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r15
            r11 = r17
            r6.<init>(r7, r9, r11)
            r13.m22651(r1)
            boolean r1 = r0.f27697
            if (r1 == 0) goto L5b
            r13.mo22663()
            return
        L27:
            java.util.ArrayDeque r1 = r0.f27672
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L5c
            long r5 = r0.f27690
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L3f
            long r7 = r0.f27707
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L5c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L5c
        L3f:
            l.ۖۜۙ r1 = new l.ۖۜۙ
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r15
            r10 = r17
            r5.<init>(r6, r8, r10)
            r13.m22651(r1)
            l.ۖۜۙ r1 = r0.f27666
            long r1 = r1.f7964
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L5b
            r13.mo22663()
        L5b:
            return
        L5c:
            l.ۖۜۙ r2 = new l.ۖۜۙ
            long r7 = r0.f27690
            r6 = r2
            r9 = r15
            r11 = r17
            r6.<init>(r7, r9, r11)
            r1.add(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC8454.mo11188(l.ܳ᩹ۙ[], long, long, l.۠ۙ᩷):void");
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public void mo11187(long j, boolean z) throws C18566 {
        this.f27660 = false;
        this.f27646 = false;
        this.f27696 = false;
        if (!this.f27710) {
            m22705();
        } else {
            this.f27690 = -9223372036854775807L;
            this.f27692 = -9223372036854775807L;
            this.f27707 = -9223372036854775807L;
            this.f27675 = false;
            this.f27649.mo7();
            this.f27689.mo7();
            this.f27691 = false;
            this.f27709.m39124();
        }
        if (this.f27666.f7961.m26056() > 0) {
            this.f27673 = true;
        }
        this.f27666.f7961.m26054();
        this.f27672.clear();
    }

    @Override // l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public void mo12940(float f, float f2) throws C18566 {
        this.f27703 = f;
        this.f27702 = f2;
        m22660(this.f27700);
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ֨ */
    public void mo11184() {
        this.f27686 = null;
        m22651(C2488.f7960);
        this.f27672.clear();
        if (!this.f27710) {
            m22656();
            return;
        }
        this.f27710 = false;
        this.f27690 = -9223372036854775807L;
        this.f27692 = -9223372036854775807L;
        this.f27707 = -9223372036854775807L;
        this.f27675 = false;
        this.f27649.mo7();
        this.f27689.mo7();
        this.f27691 = false;
        this.f27709.m39124();
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public void mo22684() {
        try {
            this.f27710 = false;
            this.f27690 = -9223372036854775807L;
            this.f27692 = -9223372036854775807L;
            this.f27707 = -9223372036854775807L;
            this.f27675 = false;
            this.f27649.mo7();
            this.f27689.mo7();
            this.f27691 = false;
            this.f27709.m39124();
            m22701();
        } finally {
            C4791.m14767(this.f27657, (InterfaceC10756) null);
            this.f27657 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final void m22701() {
        try {
            InterfaceC14420 interfaceC14420 = this.f27687;
            if (interfaceC14420 != null) {
                interfaceC14420.mo32281();
                this.f27674.f55753++;
                C0251 c0251 = this.f27683;
                c0251.getClass();
                mo22674(c0251.f1533);
            }
            this.f27687 = null;
            try {
                MediaCrypto mediaCrypto = this.f27699;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f27699 = null;
                m22652((InterfaceC10756) null);
                m22711();
            }
        } catch (Throwable th) {
            this.f27687 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f27699;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f27699 = null;
                m22652((InterfaceC10756) null);
                m22711();
            }
        }
    }

    @Override // l.AbstractC25280, l.InterfaceC3256
    /* JADX INFO: renamed from: ۙ */
    public void mo10630(int i, Object obj) {
        if (i == 11) {
            InterfaceC24140 interfaceC24140 = (InterfaceC24140) obj;
            interfaceC24140.getClass();
            this.f27704 = interfaceC24140;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a2 A[Catch: IllegalStateException -> 0x00a4, CryptoException -> 0x00ec, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {CryptoException -> 0x00ec, IllegalStateException -> 0x00a4, blocks: (B:8:0x000f, B:10:0x0013, B:12:0x0017, B:14:0x001b, B:17:0x0023, B:19:0x002a, B:20:0x002f, B:23:0x0036, B:50:0x009e, B:51:0x00a1, B:52:0x00a2, B:24:0x003a, B:26:0x003e, B:27:0x004b, B:29:0x0056, B:31:0x005c, B:38:0x0070, B:40:0x0076, B:42:0x007c, B:49:0x0090), top: B:81:0x000f }] */
    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public void mo11186(long j, long j2) throws C18566 {
        boolean z = false;
        if (this.f27696) {
            this.f27696 = false;
            m22646();
        }
        C18566 c18566 = this.f27648;
        if (c18566 != null) {
            this.f27648 = null;
            throw c18566;
        }
        try {
            if (this.f27646) {
                mo22691();
                return;
            }
            if (this.f27686 != null || m22653(2)) {
                m22710();
                if (!this.f27710) {
                    if (this.f27687 != null) {
                        long jMo2210 = m56455().mo2210();
                        Trace.beginSection("drainAndFeed");
                        while (m22659(j, j2)) {
                            long j3 = this.f27652;
                            if (!(j3 == -9223372036854775807L || m56455().mo2210() - jMo2210 < j3)) {
                                break;
                            }
                        }
                        while (m22654()) {
                            long j4 = this.f27652;
                            if (!(j4 == -9223372036854775807L || m56455().mo2210() - jMo2210 < j4)) {
                                break;
                            }
                        }
                    } else {
                        this.f27674.f55744 += m56454(j);
                        m22653(1);
                    }
                    synchronized (this.f27674) {
                    }
                }
                Trace.beginSection("bypassRender");
                while (m22661(j, j2)) {
                }
                Trace.endSection();
                synchronized (this.f27674) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw m56444(e, this.f27686, C7116.m19514(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z2 = e2 instanceof MediaCodec.CodecException;
            if (!z2) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            mo22673(e2);
            if (z2 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z = true;
            }
            if (z) {
                m22701();
            }
            C18150 c18150Mo22672 = mo22672(e2, this.f27683);
            throw m56445(c18150Mo22672, this.f27686, z, c18150Mo22672.f59349 == 1101 ? 4006 : 4003);
        }
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final void m22705() throws C18566 {
        if (m22656()) {
            m22710();
        }
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    private boolean m22656() {
        if (this.f27687 != null) {
            if (mo22702()) {
                m22701();
                return true;
            }
            if (mo22693()) {
                m22658();
                return false;
            }
            if (this.f27711 != -9223372036854775807L) {
                long jM56453 = m56453();
                long j = this.f27711;
                if (jM56453 <= j && this.f27707 < j) {
                    this.f27664 = true;
                    this.f27711 = -9223372036854775807L;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo22702() {
        int i = this.f27698;
        if (i == 3 || ((this.f27671 && !this.f27708) || (this.f27645 && this.f27663))) {
            return true;
        }
        if (i == 2) {
            int i2 = Build.VERSION.SDK_INT;
            C20782.m47568(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m22655();
                    return false;
                } catch (C18566 e) {
                    C1896.m6514("Failed to update the DRM session, releasing the codec instead.", e);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22697() {
        return this.f27664;
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    private void m22658() {
        try {
            InterfaceC14420 interfaceC14420 = this.f27687;
            C20782.m47566(interfaceC14420);
            interfaceC14420.flush();
        } finally {
            mo22683();
        }
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final void m22711() {
        mo22683();
        this.f27648 = null;
        this.f27679 = null;
        this.f27683 = null;
        this.f27700 = null;
        this.f27669 = null;
        this.f27651 = false;
        this.f27708 = false;
        this.f27647 = -1.0f;
        this.f27706 = 0;
        this.f27671 = false;
        this.f27645 = false;
        this.f27665 = false;
        this.f27695 = false;
        this.f27658 = false;
        this.f27681 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18150 mo22672(IllegalStateException illegalStateException, C0251 c0251) {
        return new C18150(illegalStateException, c0251);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22653(int i) throws C18566 {
        C16461 c16461M56450 = m56450();
        C5690 c5690 = this.f27662;
        c5690.mo7();
        int iM56443 = m56443(c16461M56450, c5690, i | 4);
        if (iM56443 == -5) {
            mo22671(c16461M56450);
            return true;
        }
        if (iM56443 != -4 || !c5690.m33305()) {
            return false;
        }
        this.f27660 = true;
        m22646();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22649(MediaCrypto mediaCrypto, boolean z) throws C0997 {
        C15648 c15648 = this.f27686;
        c15648.getClass();
        if (this.f27679 == null) {
            try {
                List listM22647 = m22647(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f27679 = arrayDeque;
                if (this.f27705) {
                    arrayDeque.addAll(listM22647);
                } else {
                    ArrayList arrayList = (ArrayList) listM22647;
                    if (!arrayList.isEmpty()) {
                        this.f27679.add((C0251) arrayList.get(0));
                    }
                }
                this.f27670 = null;
            } catch (C22822 e) {
                throw new C0997(c15648, e, z, -49998);
            }
        }
        if (this.f27679.isEmpty()) {
            throw new C0997(c15648, (C22822) null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.f27679;
        arrayDeque2.getClass();
        while (this.f27687 == null) {
            C0251 c0251 = (C0251) arrayDeque2.peekFirst();
            c0251.getClass();
            if (!mo22688(c15648) || !mo22680(c0251)) {
                return;
            }
            try {
                m22650(c0251, mediaCrypto);
            } catch (Exception e2) {
                C1896.m6514("Failed to initialize decoder: " + c0251, e2);
                arrayDeque2.removeFirst();
                C0997 c0997 = new C0997(c15648, e2, z, c0251);
                mo22673(c0997);
                if (this.f27670 == null) {
                    this.f27670 = c0997;
                } else {
                    this.f27670 = C0997.m3874(this.f27670);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f27670;
                }
            }
        }
        this.f27679 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private List m22647(boolean z) {
        C15648 c15648 = this.f27686;
        c15648.getClass();
        InterfaceC6963 interfaceC6963 = this.f27654;
        ArrayList arrayListMo22668 = mo22668(interfaceC6963, c15648, z);
        if (!arrayListMo22668.isEmpty() || !z) {
            return arrayListMo22668;
        }
        ArrayList arrayListMo22669 = mo22668(interfaceC6963, c15648, false);
        if (!arrayListMo22669.isEmpty()) {
            C1896.m6517("Drm session requires secure decoder for " + c15648.f50848 + ", but no secure decoder available. Trying to proceed with " + arrayListMo22669 + ".");
        }
        return arrayListMo22669;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22650(C0251 c0251, MediaCrypto mediaCrypto) {
        int i;
        this.f27683 = c0251;
        C15648 c15648 = this.f27686;
        c15648.getClass();
        String str = c0251.f1533;
        int i2 = Build.VERSION.SDK_INT;
        float fMo22665 = i2 < 23 ? -1.0f : mo22665(this.f27702, c15648, m56440());
        float f = fMo22665 > this.f27685 ? fMo22665 : -1.0f;
        long jMo2210 = m56455().mo2210();
        C12183 c12183Mo22669 = mo22669(c0251, c15648, mediaCrypto, f);
        if (i2 >= 31) {
            C9945.m25775(c12183Mo22669, m56451());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            InterfaceC14420 interfaceC14420Mo17850 = this.f27653.mo17850(c12183Mo22669);
            this.f27687 = interfaceC14420Mo17850;
            interfaceC14420Mo17850.mo32289(new C9199(this));
            Trace.endSection();
            long jMo2211 = m56455().mo2210();
            if (!c0251.m1748(c15648)) {
                String strM37395 = C15648.m37395(c15648);
                Locale locale = Locale.US;
                C1896.m6517("Format exceeds selected codec's capabilities [" + strM37395 + ", " + str + "]");
            }
            this.f27647 = f;
            this.f27700 = c15648;
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
            this.f27706 = i;
            this.f27671 = i2 == 29 && "c2.android.aac.decoder".equals(str);
            this.f27645 = i2 <= 23 && "OMX.google.vorbis.decoder".equals(str);
            this.f27665 = i2 == 21 && "OMX.google.aac.decoder".equals(str);
            String str4 = c0251.f1533;
            this.f27695 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str4)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && c0251.f1528) || mo22694());
            this.f27687.getClass();
            if (getState() == 2) {
                this.f27655 = m56455().mo2210() + 1000;
            }
            this.f27674.f55745++;
            mo22675(str, jMo2211, jMo2211 - jMo2210);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public void mo22683() {
        this.f27680 = -1;
        this.f27659.f19651 = null;
        this.f27694 = -1;
        this.f27656 = null;
        this.f27690 = -9223372036854775807L;
        this.f27692 = -9223372036854775807L;
        this.f27707 = -9223372036854775807L;
        this.f27655 = -9223372036854775807L;
        this.f27663 = false;
        this.f27688 = -9223372036854775807L;
        this.f27667 = false;
        this.f27693 = false;
        this.f27668 = false;
        this.f27650 = false;
        this.f27676 = false;
        this.f27677 = 0;
        this.f27698 = 0;
        this.f27681 = this.f27658 ? 1 : 0;
        this.f27664 = false;
        this.f27682 = -9223372036854775807L;
        this.f27711 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22652(InterfaceC10756 interfaceC10756) {
        C4791.m14767(this.f27661, interfaceC10756);
        this.f27661 = interfaceC10756;
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22654() throws C18566 {
        InterfaceC14420 interfaceC14420 = this.f27687;
        if (interfaceC14420 == null || this.f27677 == 2 || this.f27660) {
            return false;
        }
        int i = this.f27680;
        C5690 c5690 = this.f27659;
        if (i < 0) {
            int iMo32294 = interfaceC14420.mo32294();
            this.f27680 = iMo32294;
            if (iMo32294 < 0) {
                return false;
            }
            c5690.f19651 = interfaceC14420.mo32293(iMo32294);
            c5690.mo7();
        }
        if (this.f27677 == 1) {
            if (!this.f27695) {
                this.f27663 = true;
                interfaceC14420.mo32283(this.f27680, 0, 4, 0L);
                this.f27680 = -1;
                c5690.f19651 = null;
            }
            this.f27677 = 2;
            return false;
        }
        if (this.f27693) {
            this.f27693 = false;
            ByteBuffer byteBuffer = c5690.f19651;
            byteBuffer.getClass();
            byteBuffer.put(f27644);
            interfaceC14420.mo32283(this.f27680, 38, 0, 0L);
            this.f27680 = -1;
            c5690.f19651 = null;
            this.f27667 = true;
            return true;
        }
        if (this.f27681 == 1) {
            int i2 = 0;
            while (true) {
                C15648 c15648 = this.f27700;
                c15648.getClass();
                if (i2 >= c15648.f50835.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.f27700.f50835.get(i2);
                ByteBuffer byteBuffer2 = c5690.f19651;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i2++;
            }
            this.f27681 = 2;
        }
        ByteBuffer byteBuffer3 = c5690.f19651;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        C16461 c16461M56450 = m56450();
        try {
            int iM56443 = m56443(c16461M56450, c5690, 0);
            if (iM56443 == -3) {
                if (!mo12948()) {
                    return false;
                }
                this.f27692 = this.f27690;
                return false;
            }
            if (iM56443 == -5) {
                if (this.f27681 == 2) {
                    c5690.mo7();
                    this.f27681 = 1;
                }
                mo22671(c16461M56450);
                return true;
            }
            if (c5690.m33305()) {
                this.f27692 = this.f27690;
                if (this.f27681 == 2) {
                    c5690.mo7();
                    this.f27681 = 1;
                }
                this.f27660 = true;
                if (!this.f27667) {
                    m22646();
                    return false;
                }
                if (this.f27695) {
                    return false;
                }
                this.f27663 = true;
                interfaceC14420.mo32283(this.f27680, 0, 4, 0L);
                this.f27680 = -1;
                c5690.f19651 = null;
                return false;
            }
            if (!this.f27667 && !c5690.m33304()) {
                c5690.mo7();
                if (this.f27681 == 2) {
                    this.f27681 = 1;
                    return true;
                }
            } else if (!mo22707(c5690)) {
                boolean zM16712 = c5690.m16712();
                if (zM16712) {
                    c5690.f19656.m51562(iPosition);
                }
                long j = c5690.f19652;
                if (this.f27673) {
                    ArrayDeque arrayDeque = this.f27672;
                    if (arrayDeque.isEmpty()) {
                        C10098 c10098 = this.f27666.f7961;
                        C15648 c15649 = this.f27686;
                        c15649.getClass();
                        c10098.m26055(j, c15649);
                    } else {
                        C10098 c10099 = ((C2488) arrayDeque.peekLast()).f7961;
                        C15648 c156410 = this.f27686;
                        c156410.getClass();
                        c10099.m26055(j, c156410);
                    }
                    this.f27673 = false;
                }
                this.f27690 = Math.max(this.f27690, j);
                if (mo12948() || c5690.m33311()) {
                    this.f27692 = this.f27690;
                }
                c5690.m16713();
                if (c5690.m33308()) {
                    mo22703(c5690);
                }
                mo22687(c5690);
                int iMo22666 = mo22666(c5690);
                if ((Build.VERSION.SDK_INT < 34 || (iMo22666 & 32) == 0) && !m56442().f1571) {
                    this.f27711 = Math.max(this.f27711, c5690.f19652);
                }
                if (zM16712) {
                    interfaceC14420.mo32285(this.f27680, c5690.f19656, j, iMo22666);
                } else {
                    int i3 = this.f27680;
                    ByteBuffer byteBuffer4 = c5690.f19651;
                    byteBuffer4.getClass();
                    interfaceC14420.mo32283(i3, byteBuffer4.limit(), iMo22666, j);
                }
                this.f27680 = -1;
                c5690.f19651 = null;
                this.f27667 = true;
                this.f27681 = 0;
                this.f27674.f55749++;
                return true;
            }
            return true;
        } catch (C13147 e) {
            mo22673(e);
            m22653(0);
            m22658();
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x014e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0168  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00da, code lost:
    
        if (r3.mo27413(r2) != false) goto L129;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l.C17820 mo22671(l.C16461 r13) throws l.C18566 {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC8454.mo22671(l.ܺ֡ۙ):l.ܽ᩶ۙ");
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final long m22682() {
        return this.f27692;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void mo22706(long j) {
        this.f27707 = j;
        while (true) {
            ArrayDeque arrayDeque = this.f27672;
            if (arrayDeque.isEmpty() || j < ((C2488) arrayDeque.peek()).f7963) {
                return;
            }
            C2488 c2488 = (C2488) arrayDeque.poll();
            c2488.getClass();
            m22651(c2488);
            mo22663();
        }
    }

    @Override // l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ᩷ */
    public boolean mo11190() {
        return this.f27646;
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ᩴ */
    public boolean mo11189() {
        if (this.f27686 == null) {
            return false;
        }
        if (m56449() || this.f27694 >= 0) {
            return true;
        }
        return this.f27655 != -9223372036854775807L && m56455().mo2210() < this.f27655;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final float m22712() {
        return this.f27703;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24140 m22696() {
        return this.f27704;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final void m22698() throws C18566 {
        m22660(this.f27700);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m22660(C15648 c15648) throws C18566 {
        if (Build.VERSION.SDK_INT >= 23 && this.f27687 != null && this.f27698 != 3 && getState() != 0) {
            float f = this.f27702;
            c15648.getClass();
            float fMo22665 = mo22665(f, c15648, m56440());
            float f2 = this.f27647;
            if (f2 != fMo22665) {
                if (fMo22665 == -1.0f) {
                    if (this.f27667) {
                        this.f27677 = 1;
                        this.f27698 = 3;
                        return false;
                    }
                    m22701();
                    m22710();
                    return false;
                }
                if (f2 != -1.0f || fMo22665 > this.f27685) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fMo22665);
                    InterfaceC14420 interfaceC14420 = this.f27687;
                    interfaceC14420.getClass();
                    interfaceC14420.mo32286(bundle);
                    this.f27647 = fMo22665;
                }
            }
        }
        return true;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22645() throws C18566 {
        if (this.f27667) {
            this.f27677 = 1;
            if (this.f27645) {
                this.f27698 = 3;
                return false;
            }
            this.f27698 = 2;
            return true;
        }
        m22655();
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
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m22659(long j, long j2) throws C18566 {
        boolean z;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        MediaCodec.BufferInfo bufferInfo;
        boolean zMo22679;
        boolean z5;
        boolean z6;
        long j4;
        int iMo32280;
        InterfaceC14420 interfaceC14420 = this.f27687;
        interfaceC14420.getClass();
        int i = this.f27694;
        MediaCodec.BufferInfo bufferInfo2 = this.f27684;
        if (i >= 0) {
            if (bufferInfo2.presentationTimeUs < m56453()) {
                z = true;
            } else {
                z = false;
            }
            this.f27650 = z;
            j3 = this.f27692;
            if (j3 != -9223372036854775807L) {
                z2 = false;
            } else {
                z2 = false;
            }
            this.f27676 = z2;
            if (this.f27664) {
                j4 = this.f27682;
                if (j4 != -9223372036854775807L) {
                    this.f27682 = bufferInfo2.presentationTimeUs;
                    this.f27650 = true;
                    this.f27676 = false;
                } else {
                    this.f27682 = bufferInfo2.presentationTimeUs;
                    this.f27650 = true;
                    this.f27676 = false;
                }
            }
            if (this.f27665) {
                z3 = false;
                z4 = true;
                ByteBuffer byteBuffer = this.f27656;
                int i2 = this.f27694;
                int i3 = bufferInfo2.flags;
                long j5 = bufferInfo2.presentationTimeUs;
                boolean z7 = this.f27650;
                boolean z8 = this.f27676;
                C15648 c15648 = this.f27701;
                c15648.getClass();
                bufferInfo = bufferInfo2;
                zMo22679 = mo22679(j, j2, interfaceC14420, byteBuffer, i2, i3, 1, j5, z7, z8, c15648);
            } else {
                z3 = false;
                z4 = true;
                ByteBuffer byteBuffer2 = this.f27656;
                int i4 = this.f27694;
                int i5 = bufferInfo2.flags;
                long j6 = bufferInfo2.presentationTimeUs;
                boolean z9 = this.f27650;
                boolean z10 = this.f27676;
                C15648 c15649 = this.f27701;
                c15649.getClass();
                bufferInfo = bufferInfo2;
                zMo22679 = mo22679(j, j2, interfaceC14420, byteBuffer2, i4, i5, 1, j6, z9, z10, c15649);
            }
            if (zMo22679) {
                mo22706(bufferInfo.presentationTimeUs);
                if ((bufferInfo.flags & 4) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    this.f27688 = m56455().mo2208();
                }
                this.f27694 = -1;
                this.f27656 = null;
                if (!z5) {
                    return z4;
                }
                m22646();
            }
            return z3;
        }
        if (this.f27665 && this.f27663) {
            try {
                iMo32280 = interfaceC14420.mo32280(bufferInfo2);
            } catch (IllegalStateException unused) {
                m22646();
                if (this.f27646) {
                    m22701();
                }
            }
        } else {
            iMo32280 = interfaceC14420.mo32280(bufferInfo2);
        }
        if (iMo32280 >= 0) {
            if (this.f27668) {
                this.f27668 = false;
                interfaceC14420.mo32291(iMo32280);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m22646();
                return false;
            }
            this.f27694 = iMo32280;
            ByteBuffer byteBufferMo32295 = interfaceC14420.mo32295(iMo32280);
            this.f27656 = byteBufferMo32295;
            if (byteBufferMo32295 != null) {
                byteBufferMo32295.position(bufferInfo2.offset);
                this.f27656.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            m22699(bufferInfo2.presentationTimeUs);
            if (bufferInfo2.presentationTimeUs < m56453()) {
                z = true;
            } else {
                z = false;
            }
            this.f27650 = z;
            j3 = this.f27692;
            if (j3 != -9223372036854775807L || j3 > bufferInfo2.presentationTimeUs) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f27676 = z2;
            if (this.f27664) {
                j4 = this.f27682;
                if (j4 != -9223372036854775807L || bufferInfo2.presentationTimeUs > j4) {
                    this.f27682 = bufferInfo2.presentationTimeUs;
                    this.f27650 = true;
                    this.f27676 = false;
                } else {
                    this.f27664 = false;
                    this.f27682 = -9223372036854775807L;
                }
            }
            if (this.f27665 || !this.f27663) {
                z3 = false;
                z4 = true;
                ByteBuffer byteBuffer3 = this.f27656;
                int i6 = this.f27694;
                int i7 = bufferInfo2.flags;
                long j7 = bufferInfo2.presentationTimeUs;
                boolean z11 = this.f27650;
                boolean z12 = this.f27676;
                C15648 c156410 = this.f27701;
                c156410.getClass();
                bufferInfo = bufferInfo2;
                zMo22679 = mo22679(j, j2, interfaceC14420, byteBuffer3, i6, i7, 1, j7, z11, z12, c156410);
            } else {
                try {
                    ByteBuffer byteBuffer4 = this.f27656;
                    int i8 = this.f27694;
                    int i9 = bufferInfo2.flags;
                    long j8 = bufferInfo2.presentationTimeUs;
                    boolean z13 = this.f27650;
                    boolean z14 = this.f27676;
                    C15648 c156411 = this.f27701;
                    c156411.getClass();
                    z4 = true;
                    zMo22679 = mo22679(j, j2, interfaceC14420, byteBuffer4, i8, i9, 1, j8, z13, z14, c156411);
                    bufferInfo = bufferInfo2;
                    z3 = false;
                } catch (IllegalStateException unused2) {
                    z6 = false;
                    m22646();
                    if (this.f27646) {
                        m22701();
                    }
                }
            }
            if (zMo22679) {
                mo22706(bufferInfo.presentationTimeUs);
                if ((bufferInfo.flags & 4) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5 && this.f27663 && this.f27676) {
                    this.f27688 = m56455().mo2208();
                }
                this.f27694 = -1;
                this.f27656 = null;
                if (!z5) {
                    return z4;
                }
                m22646();
            }
            return z3;
        }
        if (iMo32280 == -2) {
            this.f27708 = true;
            InterfaceC14420 interfaceC14421 = this.f27687;
            interfaceC14421.getClass();
            MediaFormat mediaFormatMo32292 = interfaceC14421.mo32292();
            if (this.f27706 != 0 && mediaFormatMo32292.getInteger("width") == 32 && mediaFormatMo32292.getInteger("height") == 32) {
                this.f27668 = true;
                return true;
            }
            this.f27669 = mediaFormatMo32292;
            this.f27651 = true;
            return true;
        }
        if (this.f27695 && (this.f27660 || this.f27677 == 2)) {
            m22646();
        }
        long j9 = this.f27688;
        if (j9 != -9223372036854775807L && j9 + 100 < m56455().mo2208()) {
            m22646();
            return false;
        }
        z6 = false;
        return z6;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    private void m22646() throws C18566 {
        int i = this.f27698;
        if (i == 1) {
            m22658();
            return;
        }
        if (i == 2) {
            m22658();
            m22655();
        } else if (i != 3) {
            this.f27646 = true;
            mo22691();
        } else {
            m22701();
            m22710();
        }
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final void m22664() {
        this.f27696 = true;
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final long m22662() {
        return this.f27666.f7964;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final long m22690() {
        return this.f27666.f7962;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22651(C2488 c2488) {
        this.f27666 = c2488;
        long j = c2488.f7964;
        if (j != -9223372036854775807L) {
            this.f27678 = true;
            mo22686(j);
        }
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    private void m22655() throws C18566 {
        InterfaceC10756 interfaceC10756 = this.f27657;
        interfaceC10756.getClass();
        InterfaceC4944 interfaceC4944Mo27414 = interfaceC10756.mo27414();
        if (interfaceC4944Mo27414 instanceof C4045) {
            try {
                MediaCrypto mediaCrypto = this.f27699;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((C4045) interfaceC4944Mo27414).f13783);
            } catch (MediaCryptoException e) {
                throw m56444(e, this.f27686, 6006);
            }
        }
        m22652(this.f27657);
        this.f27677 = 0;
        this.f27698 = 0;
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
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m22661(long j, long j2) throws C18566 {
        C17404 c17404;
        C17404 c17405;
        C16461 c16461M56450;
        int iM56443;
        C15648 c15648;
        long jM56453;
        C15648 c15649;
        C20782.m47568(!this.f27646);
        C17404 c17406 = this.f27649;
        if (c17406.m40877()) {
            ByteBuffer byteBuffer = c17406.f19651;
            int i = this.f27694;
            int iM40874 = c17406.m40874();
            long j3 = c17406.f19652;
            boolean zM22657 = m22657(m56453(), c17406.m40875());
            boolean zM33305 = c17406.m33305();
            C15648 c156410 = this.f27701;
            c156410.getClass();
            c17404 = c17406;
            if (mo22679(j, j2, null, byteBuffer, i, 0, iM40874, j3, zM22657, zM33305, c156410)) {
                mo22706(c17404.m40875());
                c17404.mo7();
            }
            return false;
        }
        c17404 = c17406;
        if (this.f27660) {
            this.f27646 = true;
            return false;
        }
        boolean z = this.f27691;
        C5690 c5690 = this.f27689;
        if (z) {
            c17405 = c17404;
            C20782.m47568(c17405.m40873(c5690));
            this.f27691 = false;
        } else {
            c17405 = c17404;
        }
        boolean z2 = this.f27675;
        C16483 c16483 = this.f27709;
        if (z2) {
            if (c17405.m40877()) {
                return true;
            }
            this.f27710 = false;
            this.f27690 = -9223372036854775807L;
            this.f27692 = -9223372036854775807L;
            this.f27707 = -9223372036854775807L;
            this.f27675 = false;
            c17405.mo7();
            c5690.mo7();
            this.f27691 = false;
            c16483.m39124();
            this.f27675 = false;
            m22710();
            if (this.f27710) {
                C20782.m47568(!this.f27660);
                c16461M56450 = m56450();
                c5690.mo7();
                while (true) {
                    c5690.mo7();
                    iM56443 = m56443(c16461M56450, c5690, 0);
                    if (iM56443 != -5) {
                        mo22671(c16461M56450);
                        break;
                    }
                    if (iM56443 != -4) {
                        if (c5690.m33305()) {
                            this.f27660 = true;
                            this.f27692 = this.f27690;
                            break;
                        }
                        this.f27690 = Math.max(this.f27690, c5690.f19652);
                        if (!mo12948()) {
                            this.f27692 = this.f27690;
                        } else {
                            this.f27692 = this.f27690;
                        }
                        if (this.f27673) {
                            c15649 = this.f27686;
                            c15649.getClass();
                            this.f27701 = c15649;
                            if (C17359.equals(c15649.f50848, "audio/opus")) {
                                byte[] bArr = (byte[]) this.f27701.f50835.get(0);
                                int i2 = (bArr[10] & 255) | ((bArr[11] & 255) << 8);
                                C20124 c20124M37397 = this.f27701.m37397();
                                c20124M37397.m46292(i2);
                                this.f27701 = c20124M37397.m46295();
                            }
                            mo22676(this.f27701, (MediaFormat) null);
                            this.f27673 = false;
                        }
                        c5690.m16713();
                        c15648 = this.f27701;
                        if (c15648 != null) {
                            if (c5690.m33308()) {
                                c5690.f19653 = this.f27701;
                                mo22703(c5690);
                            }
                            if (C7569.m20685(m56453(), c5690.f19652)) {
                                c16483.m39125(c5690, this.f27701.f50835);
                            }
                        }
                        if (!c17405.m40877()) {
                            if (!c17405.m40873(c5690)) {
                            }
                        } else {
                            jM56453 = m56453();
                            if (m22657(jM56453, c17405.m40875()) == m22657(jM56453, c5690.f19652)) {
                                if (!c17405.m40873(c5690)) {
                                }
                            }
                        }
                        this.f27691 = true;
                        break;
                    }
                    if (iM56443 == -3) {
                        if (mo12948()) {
                            break;
                        }
                        this.f27692 = this.f27690;
                        break;
                    }
                    throw new IllegalStateException();
                }
                if (c17405.m40877()) {
                    c17405.m16713();
                }
                return !c17405.m40877() ? true : true;
            }
        } else {
            C20782.m47568(!this.f27660);
            c16461M56450 = m56450();
            c5690.mo7();
            while (true) {
                c5690.mo7();
                iM56443 = m56443(c16461M56450, c5690, 0);
                if (iM56443 != -5) {
                    mo22671(c16461M56450);
                    break;
                }
                if (iM56443 != -4) {
                    if (c5690.m33305()) {
                        this.f27660 = true;
                        this.f27692 = this.f27690;
                        break;
                    }
                    this.f27690 = Math.max(this.f27690, c5690.f19652);
                    if (!mo12948() || this.f27659.m33311()) {
                        this.f27692 = this.f27690;
                    }
                    if (this.f27673) {
                        c15649 = this.f27686;
                        c15649.getClass();
                        this.f27701 = c15649;
                        if (C17359.equals(c15649.f50848, "audio/opus") && !this.f27701.f50835.isEmpty()) {
                            byte[] bArr2 = (byte[]) this.f27701.f50835.get(0);
                            int i3 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                            C20124 c20124M37398 = this.f27701.m37397();
                            c20124M37398.m46292(i3);
                            this.f27701 = c20124M37398.m46295();
                        }
                        mo22676(this.f27701, (MediaFormat) null);
                        this.f27673 = false;
                    }
                    c5690.m16713();
                    c15648 = this.f27701;
                    if (c15648 != null && C17359.equals(c15648.f50848, "audio/opus")) {
                        if (c5690.m33308()) {
                            c5690.f19653 = this.f27701;
                            mo22703(c5690);
                        }
                        if (C7569.m20685(m56453(), c5690.f19652)) {
                            c16483.m39125(c5690, this.f27701.f50835);
                        }
                    }
                    if (!c17405.m40877()) {
                        if (!c17405.m40873(c5690)) {
                        }
                    } else {
                        jM56453 = m56453();
                        if (m22657(jM56453, c17405.m40875()) == m22657(jM56453, c5690.f19652)) {
                            if (!c17405.m40873(c5690)) {
                            }
                        }
                    }
                    this.f27691 = true;
                    break;
                }
                if (iM56443 == -3) {
                    if (mo12948()) {
                        break;
                    }
                    this.f27692 = this.f27690;
                    break;
                }
                throw new IllegalStateException();
            }
            if (c17405.m40877()) {
                c17405.m16713();
            }
            if (!c17405.m40877() || this.f27660 || this.f27675) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m22657(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        C15648 c15648 = this.f27701;
        return (c15648 != null && C17359.equals(c15648.f50848, "audio/opus") && C7569.m20685(j, j2)) ? false : true;
    }
}
