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

/* JADX INFO: renamed from: l.ܽۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16594 extends AbstractC14955 implements InterfaceC1941 {

    /* JADX INFO: renamed from: ֨ۨ, reason: not valid java name and contains not printable characters */
    public final C7421 f53248;

    /* JADX INFO: renamed from: ۘۨ, reason: not valid java name and contains not printable characters */
    public int f53249;

    /* JADX INFO: renamed from: ۜۨ, reason: not valid java name and contains not printable characters */
    public boolean f53250;

    /* JADX INFO: renamed from: ۟ۨ, reason: not valid java name and contains not printable characters */
    public long f53251;

    /* JADX INFO: renamed from: ۠ۨ, reason: not valid java name and contains not printable characters */
    public boolean f53252;

    /* JADX INFO: renamed from: ۡۨ, reason: not valid java name and contains not printable characters */
    public boolean f53253;

    /* JADX INFO: renamed from: ۤۨ, reason: not valid java name and contains not printable characters */
    public final C14437 f53254;

    /* JADX INFO: renamed from: ۬ۨ, reason: not valid java name and contains not printable characters */
    public boolean f53255;

    /* JADX INFO: renamed from: ܶۨ, reason: not valid java name and contains not printable characters */
    public final Context f53256;

    /* JADX INFO: renamed from: ᩳۨ, reason: not valid java name and contains not printable characters */
    public C7648 f53257;

    /* JADX INFO: renamed from: ᩴۨ, reason: not valid java name and contains not printable characters */
    public final C19271 f53258;

    /* JADX INFO: renamed from: ᩵ۨ, reason: not valid java name and contains not printable characters */
    public C7648 f53259;

    /* JADX INFO: renamed from: ᩷ۨ, reason: not valid java name and contains not printable characters */
    public int f53260;

    /* JADX INFO: renamed from: ᩸ۨ, reason: not valid java name and contains not printable characters */
    public long f53261;

    /* JADX INFO: renamed from: ᩹ۨ, reason: not valid java name and contains not printable characters */
    public boolean f53262;

    /* JADX INFO: renamed from: ᩺ۨ, reason: not valid java name and contains not printable characters */
    public boolean f53263;

    @Override // l.InterfaceC4784, l.InterfaceC2667
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC1941 mo13265() {
        return this;
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13951(long j, long j2, InterfaceC13544 interfaceC13544, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C7648 c7648) throws C2170 {
        byteBuffer.getClass();
        this.f53251 = -9223372036854775807L;
        if (this.f53257 != null && (i2 & 2) != 0) {
            interfaceC13544.getClass();
            interfaceC13544.mo30204(i);
            return true;
        }
        C7421 c7421 = this.f53248;
        if (z) {
            if (interfaceC13544 != null) {
                interfaceC13544.mo30204(i);
            }
            this.f48813.f42202 += i3;
            c7421.mo19877();
            return true;
        }
        try {
            if (c7421.mo19892(i3, j3, byteBuffer)) {
                if (interfaceC13544 != null) {
                    interfaceC13544.mo30204(i);
                }
                this.f48813.f42204 += i3;
                return true;
            }
            this.f53251 = j3;
            return false;
        } catch (C0220 e) {
            throw m39517(e, c7648, e.f1398, (!m35931() || m39529().f18885 == 0) ? 5002 : 5003);
        } catch (C20682 e2) {
            throw m39517(e2, this.f53259, e2.f67270, (!m35931() || m39529().f18885 == 0) ? 5001 : 5004);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ */
    public final int mo13934(InterfaceC21304 interfaceC21304, C7648 c7648) {
        int iM39030;
        List listM45162;
        boolean z;
        int iM33811 = C13958.m33811(1, 0, 0, 0);
        String str = c7648.f25265;
        String str2 = c7648.f25265;
        if (!C6632.m17975(str)) {
            return C13958.m33811(0, 0, 0, 0);
        }
        int i = c7648.f25245;
        boolean z2 = i != 0;
        boolean z3 = i == 0 || i == 2;
        int i2 = 8;
        C7421 c7421 = this.f53248;
        if (z3) {
            if (z2) {
                List listM45161 = C19894.m45161("audio/raw", false, false);
                if ((listM45161.isEmpty() ? null : (C5076) listM45161.get(0)) == null) {
                    iM39030 = 0;
                }
            }
            iM39030 = m39030(c7648);
            if (c7421.mo19893(c7648)) {
                return C13958.m33811(4, 8, 32, iM39030);
            }
        } else {
            iM39030 = 0;
        }
        if ((!"audio/raw".equals(str2) || c7421.mo19893(c7648)) && c7421.mo19893(C17983.m41851(2, c7648.f25249, c7648.f25260))) {
            if (str2 == null) {
                listM45162 = AbstractC22433.of();
            } else if (c7421.mo19893(c7648)) {
                List listM45163 = C19894.m45161("audio/raw", false, false);
                C5076 c5076 = listM45163.isEmpty() ? null : (C5076) listM45163.get(0);
                if (c5076 != null) {
                    listM45162 = AbstractC22433.of((Object) c5076);
                } else {
                    listM45162 = C19894.m45162(interfaceC21304, c7648, false, false);
                }
            } else {
                listM45162 = C19894.m45162(interfaceC21304, c7648, false, false);
            }
            if (!((AbstractCollection) listM45162).isEmpty()) {
                if (!z3) {
                    return C13958.m33811(2, 0, 0, 0);
                }
                C5076 c5077 = (C5076) listM45162.get(0);
                boolean zM14154 = c5077.m14154(c7648);
                if (!zM14154) {
                    int i3 = 1;
                    while (true) {
                        if (i3 >= listM45162.size()) {
                            z = true;
                            break;
                        }
                        C5076 c5078 = (C5076) listM45162.get(i3);
                        if (c5078.m14154(c7648)) {
                            zM14154 = true;
                            c5077 = c5078;
                            z = false;
                            break;
                        }
                        i3++;
                    }
                } else {
                    z = true;
                    break;
                }
                int i4 = zM14154 ? 4 : 3;
                if (zM14154 && c5077.m14153(c7648)) {
                    i2 = 16;
                }
                return (c5077.f17683 ? 64 : 0) | i4 | i2 | 32 | (z ? 128 : 0) | iM39030;
            }
        }
        return iM33811;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16594(ContextWrapper contextWrapper, InterfaceC9498 interfaceC9498, Handler handler, InterfaceC8688 interfaceC8688, C7421 c7421) {
        super(1, interfaceC9498, InterfaceC21304.f69311, false, 44100.0f);
        C14437 c14437 = Build.VERSION.SDK_INT >= 35 ? new C14437() : null;
        this.f53256 = contextWrapper.getApplicationContext();
        this.f53248 = c7421;
        this.f53254 = c14437;
        this.f53260 = -1000;
        this.f53258 = new C19271(handler, interfaceC8688);
        this.f53251 = -9223372036854775807L;
        c7421.mo19888(new C0365(this));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m39030(C7648 c7648) {
        C15038 c15038M19896 = this.f53248.m19896(c7648);
        if (!c15038M19896.f49027) {
            return 0;
        }
        int i = c15038M19896.f49029 ? 1536 : 512;
        return c15038M19896.f49028 ? i | 2048 : i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo13935(InterfaceC21304 interfaceC21304, C7648 c7648, boolean z) {
        List listM45162;
        if (c7648.f25265 == null) {
            listM45162 = AbstractC22433.of();
        } else if (this.f53248.mo19893(c7648)) {
            List listM45161 = C19894.m45161("audio/raw", false, false);
            C5076 c5076 = listM45161.isEmpty() ? null : (C5076) listM45161.get(0);
            if (c5076 != null) {
                listM45162 = AbstractC22433.of((Object) c5076);
            } else {
                listM45162 = C19894.m45162(interfaceC21304, c7648, z, false);
            }
        } else {
            listM45162 = C19894.m45162(interfaceC21304, c7648, z, false);
        }
        return C19894.m45159(listM45162, c7648);
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo35915(C7648 c7648) {
        if (m39529().f18885 != 0) {
            int iM39030 = m39030(c7648);
            if ((iM39030 & 512) != 0) {
                if (m39529().f18885 == 2 || (iM39030 & 1024) != 0) {
                    return true;
                }
                if (c7648.f25272 == 0 && c7648.f25254 == 0) {
                    return true;
                }
            }
        }
        return this.f53248.mo19893(c7648);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ */
    public final C1735 mo13936(C5076 c5076, C7648 c7648, MediaCrypto mediaCrypto, float f) {
        boolean z;
        C7648[] c7648ArrM39526 = m39526();
        int iM39028 = m39028(c5076, c7648);
        String str = c5076.f17691;
        if (c7648ArrM39526.length != 1) {
            for (C7648 c7649 : c7648ArrM39526) {
                if (c5076.m14150(c7648, c7649).f55818 != 0) {
                    iM39028 = Math.max(iM39028, m39028(c5076, c7649));
                }
            }
        }
        this.f53249 = iM39028;
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
        this.f53250 = z;
        this.f53263 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = c5076.f17685;
        int i2 = this.f53249;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        int i3 = c7648.f25249;
        String str4 = c7648.f25265;
        mediaFormat.setInteger("channel-count", i3);
        int i4 = c7648.f25260;
        mediaFormat.setInteger("sample-rate", i4);
        C17237.m40176(mediaFormat, c7648.f25268);
        C17237.m40175(mediaFormat, "max-input-size", i2);
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
            Pair pairM7349 = C2419.m7349(c7648);
            if (pairM7349 != null) {
                C17237.m40175(mediaFormat, "profile", ((Integer) pairM7349.first).intValue());
                C17237.m40175(mediaFormat, "level", ((Integer) pairM7349.second).intValue());
            }
            if (i <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (i >= 24) {
            if (this.f53248.mo19899(C17983.m41851(4, c7648.f25249, i4)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f53260));
        }
        this.f53257 = (!"audio/raw".equals(c5076.f17684) || "audio/raw".equals(str4)) ? null : c7648;
        return C1735.m5749(c5076, mediaFormat, c7648, mediaCrypto, this.f53254);
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ */
    public final C17567 mo13938(C5076 c5076, C7648 c7648, C7648 c7649) {
        C17567 c17567M14150 = c5076.m14150(c7648, c7649);
        int i = c17567M14150.f55820;
        if (m35928(c7649)) {
            i |= 32768;
        }
        if (m39028(c5076, c7649) > this.f53249) {
            i |= 64;
        }
        int i2 = i;
        return new C17567(c5076.f17691, c7648, c7649, i2 != 0 ? 0 : c17567M14150.f55818, i2);
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۨ */
    public final long mo35924(long j, long j2) {
        boolean z = this.f53251 != -9223372036854775807L;
        if (!this.f53253) {
            if (z || super.mo13268()) {
                return 1000000L;
            }
        } else {
            C7421 c7421 = this.f53248;
            long jMo19876 = c7421.mo19876();
            if (z && jMo19876 != -9223372036854775807L) {
                return Math.max(10000L, ((long) ((Math.min(jMo19876, this.f53251 - j) / (c7421.mo19897() != null ? c7421.mo19897().f69728 : 1.0f)) / 2.0f)) - (C17983.m41827(m39520().mo28888()) - j2));
            }
        }
        return 10000L;
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ */
    public final float mo13932(float f, C7648 c7648, C7648[] c7648Arr) {
        int iMax = -1;
        for (C7648 c7649 : c7648Arr) {
            int i = c7649.f25260;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ */
    public final void mo13945(String str, long j, long j2) {
        this.f53258.m44228(str, j, j2);
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ */
    public final void mo13944(String str) {
        this.f53258.m44227(str);
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ */
    public final void mo13943(Exception exc) {
        C0303.m1854("Audio codec error", exc);
        this.f53258.m44226(exc);
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ */
    public final C17567 mo13939(C12526 c12526) throws C2170 {
        C7648 c7648 = c12526.f41899;
        c7648.getClass();
        this.f53259 = c7648;
        C17567 c17567Mo13939 = super.mo13939(c12526);
        this.f53258.m44229(c7648, c17567Mo13939);
        return c17567Mo13939;
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۙ */
    public final void mo13946(C7648 c7648, MediaFormat mediaFormat) throws C2170 {
        int iM41816;
        C7648 c7649 = this.f53257;
        int[] iArr = null;
        if (c7649 != null) {
            c7648 = c7649;
        } else if (m35926() != null) {
            mediaFormat.getClass();
            String str = c7648.f25265;
            int i = c7648.f25249;
            if ("audio/raw".equals(str)) {
                iM41816 = c7648.f25280;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iM41816 = mediaFormat.getInteger("pcm-encoding");
            } else {
                iM41816 = mediaFormat.containsKey("v-bits-per-sample") ? C17983.m41816(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            C10471 c10471 = new C10471();
            c10471.m26533("audio/raw");
            c10471.m26512(iM41816);
            c10471.m26496(c7648.f25272);
            c10471.m26510(c7648.f25254);
            c10471.m26504(c7648.f25258);
            c10471.m26501(c7648.f25279);
            c10471.m26516(c7648.f25275);
            c10471.m26495(c7648.f25274);
            c10471.m26522(c7648.f25238);
            c10471.m26509(c7648.f25269);
            c10471.m26530(c7648.f25243);
            c10471.m26513(c7648.f25244);
            c10471.m26494(mediaFormat.getInteger("channel-count"));
            c10471.m26511(mediaFormat.getInteger("sample-rate"));
            c7648 = c10471.m26497();
            int i2 = c7648.f25249;
            if (this.f53250 && i2 == 6 && i < 6) {
                iArr = new int[i];
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.f53263) {
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
            C7421 c7421 = this.f53248;
            if (i4 >= 29) {
                if (m35931() && m39529().f18885 != 0) {
                    c7421.m19900(m39529().f18885);
                } else {
                    c7421.m19900(0);
                }
            }
            c7421.mo19885(c7648, iArr);
        } catch (C7276 e) {
            throw m39516(e, e.f24199, 5001);
        }
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final void m39036() {
        this.f53262 = true;
    }

    @Override // l.AbstractC14955, l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public final void mo13949(boolean z, boolean z2) {
        super.mo13949(z, z2);
        this.f53258.m44235(this.f48813);
        boolean z3 = m39529().f18886;
        C7421 c7421 = this.f53248;
        if (z3) {
            c7421.mo19895();
        } else {
            c7421.mo19902();
        }
        c7421.mo19886(m39514());
        c7421.mo19887(m39520());
    }

    @Override // l.AbstractC14955, l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public final void mo13942(long j, boolean z) throws C2170 {
        super.mo13942(j, z);
        this.f53248.flush();
        this.f53261 = j;
        this.f53251 = -9223372036854775807L;
        this.f53252 = false;
        this.f53262 = true;
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۢ */
    public final void mo13956() {
        this.f53248.mo19894();
        this.f53253 = true;
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۗ */
    public final void mo13931() {
        m39033();
        this.f53253 = false;
        this.f53248.pause();
    }

    @Override // l.AbstractC14955, l.AbstractC16862
    /* JADX INFO: renamed from: ۧ */
    public final void mo13958() {
        C19271 c19271 = this.f53258;
        this.f53255 = true;
        this.f53259 = null;
        this.f53251 = -9223372036854775807L;
        try {
            this.f53248.flush();
            try {
                super.mo13958();
            } finally {
                c19271.m44231(this.f48813);
            }
        } catch (Throwable th) {
            try {
                super.mo13958();
                throw th;
            } finally {
                c19271.m44231(this.f48813);
            }
        }
    }

    @Override // l.AbstractC14955, l.AbstractC16862
    /* JADX INFO: renamed from: ֫ */
    public final void mo13928() {
        C7421 c7421 = this.f53248;
        this.f53252 = false;
        this.f53251 = -9223372036854775807L;
        try {
            super.mo13928();
        } finally {
            if (this.f53255) {
                this.f53255 = false;
                c7421.reset();
            }
        }
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ᩻ */
    public final void mo13967() {
        C14437 c14437;
        this.f53248.m19903();
        if (Build.VERSION.SDK_INT < 35 || (c14437 = this.f53254) == null) {
            return;
        }
        c14437.m34715();
    }

    @Override // l.AbstractC14955, l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13268() {
        return super.mo13268() && this.f53248.mo19901();
    }

    @Override // l.AbstractC14955, l.InterfaceC4784
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo13264() {
        return this.f53248.mo19891() || super.mo13264();
    }

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ᩴ */
    public final long mo6304() {
        if (getState() == 2) {
            m39033();
        }
        return this.f53261;
    }

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo6302() {
        boolean z = this.f53252;
        this.f53252 = false;
        return z;
    }

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ۙ */
    public final void mo6301(C21449 c21449) {
        this.f53248.mo19889(c21449);
    }

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ۨ */
    public final C21449 mo6303() {
        return this.f53248.mo19897();
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۠ۙ */
    public final void mo13954() {
        this.f53248.mo19877();
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۡۙ */
    public final void mo13955() throws C2170 {
        try {
            this.f53248.mo19898();
            if (m35927() != -9223372036854775807L) {
                this.f53251 = m35927();
            }
        } catch (C0220 e) {
            throw m39517(e, e.f1400, e.f1398, m35931() ? 5003 : 5002);
        }
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ۨ */
    public final void mo35925(long j) {
        this.f53248.getClass();
    }

    @Override // l.AbstractC14955, l.AbstractC16862, l.InterfaceC23691
    /* JADX INFO: renamed from: ۙ */
    public final void mo13941(int i, Object obj) {
        C14437 c14437;
        C7421 c7421 = this.f53248;
        if (i == 2) {
            obj.getClass();
            c7421.mo19878(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            C2708 c2708 = (C2708) obj;
            c2708.getClass();
            c7421.mo19883(c2708);
            return;
        }
        if (i == 6) {
            C5531 c5531 = (C5531) obj;
            c5531.getClass();
            c7421.mo19884(c5531);
            return;
        }
        if (i == 12) {
            if (Build.VERSION.SDK_INT >= 23) {
                C20122.m45483(c7421, obj);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f53260 = ((Integer) obj).intValue();
            InterfaceC13544 interfaceC13544M35926 = m35926();
            if (interfaceC13544M35926 != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f53260));
                interfaceC13544M35926.mo30199(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            c7421.mo19890(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.mo13941(i, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            c7421.mo19879(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (c14437 = this.f53254) == null) {
                return;
            }
            c14437.m34716(iIntValue);
        }
    }

    @Override // l.AbstractC14955
    /* JADX INFO: renamed from: ܰ */
    public final void mo13961(C16033 c16033) {
        C7648 c7648;
        if (Build.VERSION.SDK_INT < 29 || (c7648 = c16033.f51911) == null || !C13638.equals(c7648.f25265, "audio/opus") || !m35931()) {
            return;
        }
        ByteBuffer byteBuffer = c16033.f51909;
        byteBuffer.getClass();
        C7648 c7649 = c16033.f51911;
        c7649.getClass();
        int i = c7649.f25272;
        if (byteBuffer.remaining() == 8) {
            this.f53248.m19880(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m39028(C5076 c5076, C7648 c7648) {
        int i;
        if (!"OMX.google.raw.decoder".equals(c5076.f17691) || (i = Build.VERSION.SDK_INT) >= 24 || (i == 23 && C17983.m41852(this.f53256))) {
            return c7648.f25261;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    private void m39033() {
        mo13268();
        long jMo19875 = this.f53248.mo19875();
        if (jMo19875 != Long.MIN_VALUE) {
            if (!this.f53262) {
                jMo19875 = Math.max(this.f53261, jMo19875);
            }
            this.f53261 = jMo19875;
            this.f53262 = false;
        }
    }
}
