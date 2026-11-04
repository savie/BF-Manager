package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import com.google.android.material.internal.ManufacturerUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.᩻֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C24689 extends AbstractC8454 implements InterfaceC11986 {

    /* JADX INFO: renamed from: ֫ۤ, reason: not valid java name and contains not printable characters */
    public int f79888;

    /* JADX INFO: renamed from: ۗۤ, reason: not valid java name and contains not printable characters */
    public boolean f79889;

    /* JADX INFO: renamed from: ۘۤ, reason: not valid java name and contains not printable characters */
    public int f79890;

    /* JADX INFO: renamed from: ۚۤ, reason: not valid java name and contains not printable characters */
    public boolean f79891;

    /* JADX INFO: renamed from: ۛۤ, reason: not valid java name and contains not printable characters */
    public final C20388 f79892;

    /* JADX INFO: renamed from: ۧۤ, reason: not valid java name and contains not printable characters */
    public boolean f79893;

    /* JADX INFO: renamed from: ۨۤ, reason: not valid java name and contains not printable characters */
    public boolean f79894;

    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    public final C14991 f79895;

    /* JADX INFO: renamed from: ܳۤ, reason: not valid java name and contains not printable characters */
    public boolean f79896;

    /* JADX INFO: renamed from: ܶۤ, reason: not valid java name and contains not printable characters */
    public C15648 f79897;

    /* JADX INFO: renamed from: ܺۤ, reason: not valid java name and contains not printable characters */
    public final Context f79898;

    /* JADX INFO: renamed from: ܽۤ, reason: not valid java name and contains not printable characters */
    public long f79899;

    /* JADX INFO: renamed from: ᩵ۤ, reason: not valid java name and contains not printable characters */
    public C15648 f79900;

    /* JADX INFO: renamed from: ᩹ۤ, reason: not valid java name and contains not printable characters */
    public final C22713 f79901;

    /* JADX INFO: renamed from: ᩺ۤ, reason: not valid java name and contains not printable characters */
    public long f79902;

    /* JADX INFO: renamed from: ᩻ۤ, reason: not valid java name and contains not printable characters */
    public boolean f79903;

    @Override // l.InterfaceC4002, l.InterfaceC18172
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC11986 mo12947() {
        return this;
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22679(long j, long j2, InterfaceC14420 interfaceC14420, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C15648 c15648) throws C18566 {
        byteBuffer.getClass();
        this.f79902 = -9223372036854775807L;
        if (this.f79897 != null && (i2 & 2) != 0) {
            interfaceC14420.getClass();
            interfaceC14420.mo32291(i);
            return true;
        }
        C14991 c14991 = this.f79895;
        if (z) {
            if (interfaceC14420 != null) {
                interfaceC14420.mo32291(i);
            }
            this.f27674.f55748 += i3;
            c14991.mo36071();
            return true;
        }
        try {
            if (c14991.mo36086(i3, j3, byteBuffer)) {
                if (interfaceC14420 != null) {
                    interfaceC14420.mo32291(i);
                }
                this.f27674.f55746 += i3;
                return true;
            }
            this.f79902 = j3;
            return false;
        } catch (C5559 e) {
            throw m56445(e, this.f79900, e.f19303, (!m22695() || m56442().f1570 == 0) ? 5001 : 5004);
        } catch (C24951 e2) {
            throw m56445(e2, c15648, e2.f80780, (!m22695() || m56442().f1570 == 0) ? 5002 : 5003);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final int mo22667(InterfaceC6963 interfaceC6963, C15648 c15648) {
        int iM55033;
        List listM6723;
        boolean z;
        int iM34863 = C14442.m34863(1, 0, 0, 0);
        String str = c15648.f50848;
        String str2 = c15648.f50848;
        if (!C9681.m25258(str)) {
            return C14442.m34863(0, 0, 0, 0);
        }
        int i = c15648.f50813;
        boolean z2 = i != 0;
        boolean z3 = i == 0 || i == 2;
        int i2 = 8;
        C14991 c14991 = this.f79895;
        if (z3) {
            if (z2) {
                List listM6722 = C1939.m6722("audio/raw", false, false);
                if ((listM6722.isEmpty() ? null : (C0251) listM6722.get(0)) == null) {
                    iM55033 = 0;
                }
            }
            iM55033 = m55033(c15648);
            if (c14991.mo36087(c15648)) {
                return C14442.m34863(4, 8, 32, iM55033);
            }
        } else {
            iM55033 = 0;
        }
        if ((!"audio/raw".equals(str2) || c14991.mo36087(c15648)) && c14991.mo36087(C7116.m19497(2, c15648.f50843, c15648.f50829))) {
            if (str2 == null) {
                listM6723 = AbstractC1928.of();
            } else if (c14991.mo36087(c15648)) {
                List listM6724 = C1939.m6722("audio/raw", false, false);
                C0251 c0251 = listM6724.isEmpty() ? null : (C0251) listM6724.get(0);
                if (c0251 != null) {
                    listM6723 = AbstractC1928.of((Object) c0251);
                } else {
                    listM6723 = C1939.m6723(interfaceC6963, c15648, false, false);
                }
            } else {
                listM6723 = C1939.m6723(interfaceC6963, c15648, false, false);
            }
            if (!((AbstractCollection) listM6723).isEmpty()) {
                if (!z3) {
                    return C14442.m34863(2, 0, 0, 0);
                }
                C0251 c0252 = (C0251) listM6723.get(0);
                boolean zM1748 = c0252.m1748(c15648);
                if (!zM1748) {
                    int i3 = 1;
                    while (true) {
                        if (i3 >= listM6723.size()) {
                            z = true;
                            break;
                        }
                        C0251 c0253 = (C0251) listM6723.get(i3);
                        if (c0253.m1748(c15648)) {
                            zM1748 = true;
                            c0252 = c0253;
                            z = false;
                            break;
                        }
                        i3++;
                    }
                } else {
                    z = true;
                    break;
                }
                int i4 = zM1748 ? 4 : 3;
                if (zM1748 && c0252.m1747(c15648)) {
                    i2 = 16;
                }
                return (c0252.f1530 ? 64 : 0) | i4 | i2 | 32 | (z ? 128 : 0) | iM55033;
            }
        }
        return iM34863;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24689(ContextWrapper contextWrapper, InterfaceC6218 interfaceC6218, Handler handler, InterfaceC19729 interfaceC19729, C14991 c14991) {
        super(1, interfaceC6218, InterfaceC6963.f22987, false, 44100.0f);
        C20388 c20388 = Build.VERSION.SDK_INT >= 35 ? new C20388() : null;
        this.f79898 = contextWrapper.getApplicationContext();
        this.f79895 = c14991;
        this.f79892 = c20388;
        this.f79890 = -1000;
        this.f79901 = new C22713(handler, interfaceC19729);
        this.f79902 = -9223372036854775807L;
        c14991.mo36077(new C11262(this));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m55033(C15648 c15648) {
        C9549 c9549M36090 = this.f79895.m36090(c15648);
        if (!c9549M36090.f30909) {
            return 0;
        }
        int i = c9549M36090.f30911 ? 1536 : 512;
        return c9549M36090.f30910 ? i | 2048 : i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo22668(InterfaceC6963 interfaceC6963, C15648 c15648, boolean z) {
        List listM6723;
        if (c15648.f50848 == null) {
            listM6723 = AbstractC1928.of();
        } else if (this.f79895.mo36087(c15648)) {
            List listM6722 = C1939.m6722("audio/raw", false, false);
            C0251 c0251 = listM6722.isEmpty() ? null : (C0251) listM6722.get(0);
            if (c0251 != null) {
                listM6723 = AbstractC1928.of((Object) c0251);
            } else {
                listM6723 = C1939.m6723(interfaceC6963, c15648, z, false);
            }
        } else {
            listM6723 = C1939.m6723(interfaceC6963, c15648, z, false);
        }
        return C1939.m6720(listM6723, c15648);
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo22708(C15648 c15648) {
        if (m56442().f1570 != 0) {
            int iM55033 = m55033(c15648);
            if ((iM55033 & 512) != 0) {
                if (m56442().f1570 == 2 || (iM55033 & 1024) != 0) {
                    return true;
                }
                if (c15648.f50851 == 0 && c15648.f50816 == 0) {
                    return true;
                }
            }
        }
        return this.f79895.mo36087(c15648);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final C12183 mo22669(C0251 c0251, C15648 c15648, MediaCrypto mediaCrypto, float f) {
        boolean z;
        C15648[] c15648ArrM56440 = m56440();
        int iM55028 = m55028(c0251, c15648);
        String str = c0251.f1533;
        if (c15648ArrM56440.length != 1) {
            for (C15648 c15649 : c15648ArrM56440) {
                if (c0251.m1744(c15648, c15649).f58465 != 0) {
                    iM55028 = Math.max(iM55028, m55028(c0251, c15649));
                }
            }
        }
        this.f79888 = iM55028;
        int i = Build.VERSION.SDK_INT;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && ManufacturerUtils.SAMSUNG.equals(Build.MANUFACTURER)) {
            String str2 = Build.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f79893 = z;
        this.f79903 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = c0251.f1524;
        int i2 = this.f79888;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        int i3 = c15648.f50843;
        String str4 = c15648.f50848;
        mediaFormat.setInteger("channel-count", i3);
        int i4 = c15648.f50829;
        mediaFormat.setInteger("sample-rate", i4);
        C16811.m39703(mediaFormat, c15648.f50835);
        C16811.m39702(mediaFormat, "max-input-size", i2);
        if (i >= 23) {
            mediaFormat.setInteger(MessageHandler.Properties.Priority, 0);
            if (f != -1.0f) {
                if (i != 23) {
                    mediaFormat.setFloat("operating-rate", f);
                } else {
                    String str5 = Build.MODEL;
                    if (!"ZTE B2017G".equals(str5) && !"AXON 7 mini".equals(str5)) {
                        mediaFormat.setFloat("operating-rate", f);
                    }
                }
            }
        }
        if ("audio/ac4".equals(str4)) {
            Pair pairM48970 = C21528.m48970(c15648);
            if (pairM48970 != null) {
                C16811.m39702(mediaFormat, "profile", ((Integer) pairM48970.first).intValue());
                C16811.m39702(mediaFormat, "level", ((Integer) pairM48970.second).intValue());
            }
            if (i <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (i >= 24) {
            if (this.f79895.mo36095(C7116.m19497(4, c15648.f50843, i4)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f79890));
        }
        this.f79897 = (!"audio/raw".equals(c0251.f1525) || "audio/raw".equals(str4)) ? null : c15648;
        return C12183.m30455(c0251, mediaFormat, c15648, mediaCrypto, this.f79892);
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final C17820 mo22670(C0251 c0251, C15648 c15648, C15648 c15649) {
        C17820 c17820M1744 = c0251.m1744(c15648, c15649);
        int i = c17820M1744.f58466;
        if (m22704(c15649)) {
            i |= 32768;
        }
        if (m55028(c0251, c15649) > this.f79888) {
            i |= 64;
        }
        int i2 = i;
        return new C17820(c0251.f1533, c15648, c15649, i2 != 0 ? 0 : c17820M1744.f58465, i2);
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۤ */
    public final long mo22685(long j, long j2) {
        boolean z = this.f79902 != -9223372036854775807L;
        if (!this.f79894) {
            if (z || super.mo11190()) {
                return 1000000L;
            }
        } else {
            C14991 c14991 = this.f79895;
            long jMo36098 = c14991.mo36098();
            if (z && jMo36098 != -9223372036854775807L) {
                return Math.max(10000L, ((long) ((Math.min(jMo36098, this.f79902 - j) / (c14991.mo36089() != null ? c14991.mo36089().f24500 : 1.0f)) / 2.0f)) - (C7116.m19474(m56455().mo2210()) - j2));
            }
        }
        return 10000L;
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final float mo22665(float f, C15648 c15648, C15648[] c15648Arr) {
        int iMax = -1;
        for (C15648 c15649 : c15648Arr) {
            int i = c15649.f50829;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final void mo22675(String str, long j, long j2) {
        this.f79901.m51213(str, j, j2);
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final void mo22674(String str) {
        this.f79901.m51212(str);
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final void mo22673(Exception exc) {
        C1896.m6516("Audio codec error", exc);
        this.f79901.m51211(exc);
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final C17820 mo22671(C16461 c16461) throws C18566 {
        C15648 c15648 = c16461.f53378;
        c15648.getClass();
        this.f79900 = c15648;
        C17820 c17820Mo22671 = super.mo22671(c16461);
        this.f79901.m51215(c15648, c17820Mo22671);
        return c17820Mo22671;
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۙ */
    public final void mo22676(C15648 c15648, MediaFormat mediaFormat) throws C18566 {
        int iM19463;
        C15648 c15649 = this.f79897;
        int[] iArr = null;
        if (c15649 != null) {
            c15648 = c15649;
        } else if (m22689() != null) {
            mediaFormat.getClass();
            String str = c15648.f50848;
            int i = c15648.f50843;
            if ("audio/raw".equals(str)) {
                iM19463 = c15648.f50826;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iM19463 = mediaFormat.getInteger("pcm-encoding");
            } else {
                iM19463 = mediaFormat.containsKey("v-bits-per-sample") ? C7116.m19463(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            C20124 c20124 = new C20124();
            c20124.m46315("audio/raw");
            c20124.m46293(iM19463);
            c20124.m46292(c15648.f50851);
            c20124.m46310(c15648.f50816);
            c20124.m46303(c15648.f50812);
            c20124.m46299(c15648.f50853);
            c20124.m46309(c15648.f50817);
            c20124.m46330(c15648.f50846);
            c20124.m46328(c15648.f50841);
            c20124.m46321(c15648.f50811);
            c20124.m46294(c15648.f50850);
            c20124.m46311(c15648.f50834);
            c20124.m46329(mediaFormat.getInteger("channel-count"));
            c20124.m46332(mediaFormat.getInteger("sample-rate"));
            c15648 = c20124.m46295();
            int i2 = c15648.f50843;
            if (this.f79893 && i2 == 6 && i < 6) {
                iArr = new int[i];
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.f79903) {
                if (i2 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i2 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i2 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i2 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i2 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i4 = Build.VERSION.SDK_INT;
            C14991 c14991 = this.f79895;
            if (i4 >= 29) {
                if (m22695() && m56442().f1570 != 0) {
                    c14991.m36096(m56442().f1570);
                } else {
                    c14991.m36096(0);
                }
            }
            c14991.mo36081(c15648, iArr);
        } catch (C13016 e) {
            throw m56444(e, e.f41684, 5001);
        }
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final void m55037() {
        this.f79896 = true;
    }

    @Override // l.AbstractC8454, l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo22678(boolean z, boolean z2) {
        super.mo22678(z, z2);
        this.f79901.m51220(this.f27674);
        boolean z3 = m56442().f1571;
        C14991 c14991 = this.f79895;
        if (z3) {
            c14991.mo36091();
        } else {
            c14991.mo36093();
        }
        c14991.mo36083(m56451());
        c14991.mo36080(m56455());
    }

    @Override // l.AbstractC8454, l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo11187(long j, boolean z) throws C18566 {
        super.mo11187(j, z);
        this.f79895.flush();
        this.f79899 = j;
        this.f79902 = -9223372036854775807L;
        this.f79889 = false;
        this.f79896 = true;
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۜ */
    public final void mo45800() {
        this.f79895.mo36094();
        this.f79894 = true;
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۬ */
    public final void mo45801() {
        m55030();
        this.f79894 = false;
        this.f79895.pause();
    }

    @Override // l.AbstractC8454, l.AbstractC25280
    /* JADX INFO: renamed from: ֨ */
    public final void mo11184() {
        C22713 c22713 = this.f79901;
        this.f79891 = true;
        this.f79900 = null;
        this.f79902 = -9223372036854775807L;
        try {
            this.f79895.flush();
            try {
                super.mo11184();
            } finally {
                c22713.m51216(this.f27674);
            }
        } catch (Throwable th) {
            try {
                super.mo11184();
                throw th;
            } finally {
                c22713.m51216(this.f27674);
            }
        }
    }

    @Override // l.AbstractC8454, l.AbstractC25280
    /* JADX INFO: renamed from: ۠ */
    public final void mo22684() {
        C14991 c14991 = this.f79895;
        this.f79889 = false;
        this.f79902 = -9223372036854775807L;
        try {
            super.mo22684();
        } finally {
            if (this.f79891) {
                this.f79891 = false;
                c14991.reset();
            }
        }
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۡ */
    public final void mo48644() {
        C20388 c20388;
        this.f79895.m36099();
        if (Build.VERSION.SDK_INT < 35 || (c20388 = this.f79892) == null) {
            return;
        }
        c20388.m46793();
    }

    @Override // l.AbstractC8454, l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo11190() {
        return super.mo11190() && this.f79895.mo36097();
    }

    @Override // l.AbstractC8454, l.InterfaceC4002
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo11189() {
        return this.f79895.mo36085() || super.mo11189();
    }

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ᩹ */
    public final long mo8400() {
        if (getState() == 2) {
            m55030();
        }
        return this.f79899;
    }

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8398() {
        boolean z = this.f79889;
        this.f79889 = false;
        return z;
    }

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ۙ */
    public final void mo8396(C7445 c7445) {
        this.f79895.mo36078(c7445);
    }

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ۤ */
    public final C7445 mo8397() {
        return this.f79895.mo36089();
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۗۙ */
    public final void mo22663() {
        this.f79895.mo36071();
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۨۙ */
    public final void mo22691() throws C18566 {
        try {
            this.f79895.mo36088();
            if (m22682() != -9223372036854775807L) {
                this.f79902 = m22682();
            }
        } catch (C24951 e) {
            throw m56445(e, e.f80781, e.f80780, m22695() ? 5003 : 5002);
        }
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ۤ */
    public final void mo22686(long j) {
        this.f79895.getClass();
    }

    @Override // l.AbstractC8454, l.AbstractC25280, l.InterfaceC3256
    /* JADX INFO: renamed from: ۙ */
    public final void mo10630(int i, Object obj) {
        C20388 c20388;
        C14991 c14991 = this.f79895;
        if (i == 2) {
            obj.getClass();
            c14991.mo36072(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            C18412 c18412 = (C18412) obj;
            c18412.getClass();
            c14991.mo36082(c18412);
            return;
        }
        if (i == 6) {
            C0513 c0513 = (C0513) obj;
            c0513.getClass();
            c14991.mo36076(c0513);
            return;
        }
        if (i == 12) {
            if (Build.VERSION.SDK_INT >= 23) {
                C1568.m5576(c14991, obj);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f79890 = ((Integer) obj).intValue();
            InterfaceC14420 interfaceC14420M22689 = m22689();
            if (interfaceC14420M22689 != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f79890));
                interfaceC14420M22689.mo32286(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            c14991.mo36084(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.mo10630(i, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            c14991.mo36073(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (c20388 = this.f79892) == null) {
                return;
            }
            c20388.m46794(iIntValue);
        }
    }

    @Override // l.AbstractC8454
    /* JADX INFO: renamed from: ᩷ */
    public final void mo22703(C5690 c5690) {
        C15648 c15648;
        if (Build.VERSION.SDK_INT < 29 || (c15648 = c5690.f19653) == null || !C17359.equals(c15648.f50848, "audio/opus") || !m22695()) {
            return;
        }
        ByteBuffer byteBuffer = c5690.f19655;
        byteBuffer.getClass();
        C15648 c15649 = c5690.f19653;
        c15649.getClass();
        int i = c15649.f50851;
        if (byteBuffer.remaining() == 8) {
            this.f79895.m36074(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m55028(C0251 c0251, C15648 c15648) {
        int i;
        if (!"OMX.google.raw.decoder".equals(c0251.f1533) || (i = Build.VERSION.SDK_INT) >= 24 || (i == 23 && C7116.m19498(this.f79898))) {
            return c15648.f50824;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    private void m55030() {
        mo11190();
        long jMo36092 = this.f79895.mo36092();
        if (jMo36092 != Long.MIN_VALUE) {
            if (!this.f79896) {
                jMo36092 = Math.max(this.f79899, jMo36092);
            }
            this.f79899 = jMo36092;
            this.f79896 = false;
        }
    }
}
