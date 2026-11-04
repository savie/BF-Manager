package l;

import android.util.Pair;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.util.encoders.UTF8;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ۛܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P8R9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6515 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f21868;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f21872;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte[] f21873;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f21874;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f21875;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f21880;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f21882;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f21884;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f21885;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f21887;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f21893;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f21897;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f21901;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public byte[] f21902;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C22362 f21909;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f21911;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C10835 f21917;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C4870 f21919;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f21881 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f21896 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f21912 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f21916 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f21903 = -1;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f21899 = 0;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f21890 = -1;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public float f21871 = 0.0f;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public float f21894 = 0.0f;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public float f21879 = 0.0f;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public byte[] f21898 = null;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f21900 = -1;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f21918 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f21870 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f21889 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f21878 = -1;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f21883 = 1000;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f21906 = 200;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public float f21915 = -1.0f;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public float f21908 = -1.0f;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public float f21913 = -1.0f;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public float f21888 = -1.0f;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f21895 = -1.0f;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f21877 = -1.0f;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public float f21910 = -1.0f;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public float f21892 = -1.0f;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f21886 = -1.0f;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f21869 = -1.0f;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f21914 = 1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f21876 = -1;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f21920 = 8000;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f21907 = 0;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public long f21904 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f21891 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f21905 = "eng";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:141:0x01db  */
    /* JADX WARN: Code duplicated, block: B:288:0x0565  */
    /* JADX WARN: Code duplicated, block: B:293:0x057c  */
    /* JADX WARN: Code duplicated, block: B:294:0x057e  */
    /* JADX WARN: Code duplicated, block: B:297:0x058b  */
    /* JADX WARN: Code duplicated, block: B:298:0x059b  */
    /* JADX WARN: Code duplicated, block: B:300:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:302:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:304:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:307:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:309:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:312:0x05be  */
    /* JADX WARN: Code duplicated, block: B:315:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:318:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:320:0x05da  */
    /* JADX WARN: Code duplicated, block: B:343:0x06be  */
    /* JADX WARN: Code duplicated, block: B:346:0x06db  */
    /* JADX WARN: Code duplicated, block: B:349:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:355:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:356:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:358:0x0705  */
    /* JADX WARN: Code duplicated, block: B:359:0x0708  */
    /* JADX WARN: Code duplicated, block: B:361:0x0712  */
    /* JADX WARN: Code duplicated, block: B:367:0x072a  */
    /* JADX WARN: Code duplicated, block: B:369:0x074b  */
    /* JADX WARN: Code duplicated, block: B:371:0x0751  */
    /* JADX WARN: Code duplicated, block: B:387:0x077c  */
    /* JADX WARN: Code duplicated, block: B:392:0x0796  */
    /* JADX WARN: Code duplicated, block: B:393:0x0799  */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18391(InterfaceC12789 interfaceC12789, int i) throws C2970 {
        byte b;
        List listSingletonList;
        int i2;
        String str;
        List list;
        int i3;
        String str2;
        int i4;
        String str3;
        List list2;
        Pair pair;
        String str4;
        String str5;
        String str6;
        String str7;
        int iM19463;
        List list3;
        List list4;
        List listOf;
        List listOf2;
        int i5;
        C20124 c20124;
        int i6;
        int i7;
        int i8;
        float f;
        int iIntValue;
        int i9;
        int i10;
        int i11;
        String str8;
        C4705 c4705M14596;
        List list5;
        String str9 = this.f21897;
        str9.getClass();
        switch (str9) {
            case "V_MPEG4/ISO/AP":
                b = 0;
                break;
            case "V_MPEG4/ISO/SP":
                b = 1;
                break;
            case "A_MS/ACM":
                b = 2;
                break;
            case "A_TRUEHD":
                b = 3;
                break;
            case "A_VORBIS":
                b = 4;
                break;
            case "A_MPEG/L2":
                b = 5;
                break;
            case "A_MPEG/L3":
                b = 6;
                break;
            case "V_MS/VFW/FOURCC":
                b = 7;
                break;
            case "S_DVBSUB":
                b = 8;
                break;
            case "V_MPEG4/ISO/ASP":
                b = 9;
                break;
            case "V_MPEG4/ISO/AVC":
                b = 10;
                break;
            case "S_VOBSUB":
                b = 11;
                break;
            case "A_DTS/LOSSLESS":
                b = 12;
                break;
            case "A_AAC":
                b = cb.k;
                break;
            case "A_AC3":
                b = cb.f82047l;
                break;
            case "A_DTS":
                b = 15;
                break;
            case "V_AV1":
                b = 16;
                break;
            case "V_VP8":
                b = 17;
                break;
            case "V_VP9":
                b = 18;
                break;
            case "S_HDMV/PGS":
                b = 19;
                break;
            case "V_THEORA":
                b = 20;
                break;
            case "A_DTS/EXPRESS":
                b = 21;
                break;
            case "A_PCM/FLOAT/IEEE":
                b = 22;
                break;
            case "A_PCM/INT/BIG":
                b = 23;
                break;
            case "A_PCM/INT/LIT":
                b = 24;
                break;
            case "S_TEXT/ASS":
                b = 25;
                break;
            case "S_TEXT/SSA":
                b = 26;
                break;
            case "V_MPEGH/ISO/HEVC":
                b = 27;
                break;
            case "S_TEXT/WEBVTT":
                b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                break;
            case "S_TEXT/UTF8":
                b = 29;
                break;
            case "V_MPEG2":
                b = 30;
                break;
            case "A_EAC3":
                b = bo.j;
                break;
            case "A_FLAC":
                b = UTF8.S_CS3;
                break;
            case "A_OPUS":
                b = PublicSuffixDatabase.EXCEPTION_MARKER;
                break;
            default:
                b = -1;
                break;
        }
        String str10 = "video/x-unknown";
        String str11 = "audio/raw";
        String str12 = "audio/x-unknown";
        C1259 c1259M26329 = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        byte[] bArr = null;
        switch (b) {
            case 0:
            case 1:
            case 9:
                byte[] bArr2 = this.f21893;
                str12 = "video/mp4v-es";
                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                i2 = -1;
                str = null;
                str11 = str12;
                list5 = listSingletonList;
                i3 = -1;
                list = list5;
                if (this.f21873 != null && (c4705M14596 = C4705.m14596(new C21287(this.f21873))) != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i12 = (z ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else if (C9681.m25257(str11)) {
                    if (this.f21899 == 0) {
                        i10 = this.f21916;
                        i7 = -1;
                        if (i10 == -1) {
                            i10 = this.f21881;
                        }
                        this.f21916 = i10;
                        i11 = this.f21903;
                        if (i11 == -1) {
                            i11 = this.f21896;
                        }
                        this.f21903 = i11;
                    } else {
                        i7 = -1;
                    }
                    i8 = this.f21916;
                    if (i8 != i7 || (i9 = this.f21903) == i7) {
                        f = -1.0f;
                    } else {
                        f = (this.f21896 * i8) / (this.f21881 * i9);
                    }
                    if (this.f21918) {
                        if (this.f21915 != -1.0f && this.f21908 != -1.0f && this.f21913 != -1.0f && this.f21888 != -1.0f && this.f21895 != -1.0f && this.f21877 != -1.0f && this.f21910 != -1.0f && this.f21892 != -1.0f && this.f21886 != -1.0f && this.f21869 != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.f21886 + 0.5f));
                            byteBufferOrder.putShort((short) (this.f21869 + 0.5f));
                            byteBufferOrder.putShort((short) this.f21883);
                            byteBufferOrder.putShort((short) this.f21906);
                        }
                        C10207 c10207 = new C10207();
                        c10207.m26332(this.f21870);
                        c10207.m26334(this.f21878);
                        c10207.m26335(this.f21889);
                        c10207.m26331(bArr);
                        c10207.m26333(this.f21912);
                        c10207.m26330(this.f21912);
                        c1259M26329 = c10207.m26329();
                    }
                    if (this.f21872 == null && C24415.f79224.containsKey(this.f21872)) {
                        iIntValue = ((Integer) C24415.f79224.get(this.f21872)).intValue();
                    } else {
                        iIntValue = -1;
                    }
                    if (this.f21890 == 0 && Float.compare(this.f21871, 0.0f) == 0 && Float.compare(this.f21894, 0.0f) == 0) {
                        if (Float.compare(this.f21879, 0.0f) == 0) {
                            iIntValue = 0;
                        } else if (Float.compare(this.f21879, 90.0f) == 0) {
                            iIntValue = 90;
                        } else if (Float.compare(this.f21879, -180.0f) != 0 || Float.compare(this.f21879, 180.0f) == 0) {
                            iIntValue = 180;
                        } else if (Float.compare(this.f21879, -90.0f) == 0) {
                            iIntValue = BottomAppBarTopEdgeTreatment.ANGLE_UP;
                        }
                    }
                    c20124.m46291(this.f21881);
                    c20124.m46333(this.f21896);
                    c20124.m46325(f);
                    c20124.m46307(iIntValue);
                    c20124.m46305(this.f21898);
                    c20124.m46313(this.f21900);
                    c20124.m46302(c1259M26329);
                    i6 = 2;
                } else {
                    if ("application/x-subrip".equals(str11) && !"text/x-ssa".equals(str11) && !"text/vtt".equals(str11) && !"application/vobsub".equals(str11) && !"application/pgs".equals(str11) && !"application/dvbsubs".equals(str11)) {
                        throw C2970.m9688("Unexpected MIME type.", (Throwable) null);
                    }
                    i6 = 3;
                }
                if (this.f21872 != null && !C24415.f79224.containsKey(this.f21872)) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i12);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M46295 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo16658 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo16658;
                interfaceC22024Mo16658.mo14384(c15648M46295);
                return;
            case 2:
                C21287 c21287 = new C21287(m18390(this.f21897));
                try {
                    int iM48504 = c21287.m48504();
                    if (iM48504 != 1) {
                        if (iM48504 == 65534) {
                            c21287.m48510(24);
                            if (c21287.m48518() != C24415.f79220.getMostSignificantBits() || c21287.m48518() != C24415.f79220.getLeastSignificantBits()) {
                            }
                            listSingletonList = null;
                            i2 = -1;
                            str = null;
                            str11 = str12;
                            list5 = listSingletonList;
                            i3 = -1;
                            list = list5;
                            if (this.f21873 != null) {
                                str = c4705M14596.f16606;
                                str11 = "video/dolby-vision";
                            }
                            boolean z2 = this.f21891;
                            if (this.f21880) {
                                i5 = 2;
                            } else {
                                i5 = 0;
                            }
                            int i13 = (z2 ? 1 : 0) | i5;
                            c20124 = new C20124();
                            if (C9681.m25258(str11)) {
                                c20124.m46329(this.f21914);
                                c20124.m46332(this.f21920);
                                c20124.m46293(i3);
                                i6 = 1;
                            } else {
                                if (C9681.m25257(str11)) {
                                    if (this.f21899 == 0) {
                                        i10 = this.f21916;
                                        i7 = -1;
                                        if (i10 == -1) {
                                            i10 = this.f21881;
                                        }
                                        this.f21916 = i10;
                                        i11 = this.f21903;
                                        if (i11 == -1) {
                                            i11 = this.f21896;
                                        }
                                        this.f21903 = i11;
                                    } else {
                                        i7 = -1;
                                    }
                                    i8 = this.f21916;
                                    if (i8 != i7) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (this.f21918) {
                                        if (this.f21915 != -1.0f) {
                                            bArr = new byte[25];
                                            ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                            byteBufferOrder2.put((byte) 0);
                                            byteBufferOrder2.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) (this.f21886 + 0.5f));
                                            byteBufferOrder2.putShort((short) (this.f21869 + 0.5f));
                                            byteBufferOrder2.putShort((short) this.f21883);
                                            byteBufferOrder2.putShort((short) this.f21906);
                                        }
                                        C10207 c10208 = new C10207();
                                        c10208.m26332(this.f21870);
                                        c10208.m26334(this.f21878);
                                        c10208.m26335(this.f21889);
                                        c10208.m26331(bArr);
                                        c10208.m26333(this.f21912);
                                        c10208.m26330(this.f21912);
                                        c1259M26329 = c10208.m26329();
                                    }
                                    if (this.f21872 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (this.f21890 == 0) {
                                        if (Float.compare(this.f21879, 0.0f) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    c20124.m46291(this.f21881);
                                    c20124.m46333(this.f21896);
                                    c20124.m46325(f);
                                    c20124.m46307(iIntValue);
                                    c20124.m46305(this.f21898);
                                    c20124.m46313(this.f21900);
                                    c20124.m46302(c1259M26329);
                                    i6 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str11)) {
                                    }
                                    i6 = 3;
                                }
                                break;
                            }
                            if (this.f21872 != null) {
                                c20124.m46330(this.f21872);
                            }
                            c20124.m46317(i);
                            if (this.f21911) {
                                str8 = "video/webm";
                            } else {
                                str8 = "video/x-matroska";
                            }
                            c20124.m46327(str8);
                            c20124.m46315(str11);
                            c20124.m46318(i2);
                            c20124.m46321(this.f21905);
                            c20124.m46294(i13);
                            c20124.m46301(list);
                            c20124.m46300(str);
                            c20124.m46304(this.f21909);
                            C15648 c15648M46296 = c20124.m46295();
                            InterfaceC22024 interfaceC22024Mo16659 = interfaceC12789.mo16658(this.f21884, i6);
                            this.f21882 = interfaceC22024Mo16659;
                            interfaceC22024Mo16659.mo14384(c15648M46296);
                            return;
                        }
                        C1896.m6517("Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        i2 = -1;
                        str = null;
                        str11 = str12;
                        list5 = listSingletonList;
                        i3 = -1;
                        list = list5;
                        if (this.f21873 != null) {
                            str = c4705M14596.f16606;
                            str11 = "video/dolby-vision";
                        }
                        boolean z3 = this.f21891;
                        if (this.f21880) {
                            i5 = 2;
                        } else {
                            i5 = 0;
                        }
                        int i14 = (z3 ? 1 : 0) | i5;
                        c20124 = new C20124();
                        if (C9681.m25258(str11)) {
                            c20124.m46329(this.f21914);
                            c20124.m46332(this.f21920);
                            c20124.m46293(i3);
                            i6 = 1;
                        } else {
                            if (C9681.m25257(str11)) {
                                if (this.f21899 == 0) {
                                    i10 = this.f21916;
                                    i7 = -1;
                                    if (i10 == -1) {
                                        i10 = this.f21881;
                                    }
                                    this.f21916 = i10;
                                    i11 = this.f21903;
                                    if (i11 == -1) {
                                        i11 = this.f21896;
                                    }
                                    this.f21903 = i11;
                                } else {
                                    i7 = -1;
                                }
                                i8 = this.f21916;
                                if (i8 != i7) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.f21918) {
                                    if (this.f21915 != -1.0f) {
                                        bArr = new byte[25];
                                        ByteBuffer byteBufferOrder3 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                        byteBufferOrder3.put((byte) 0);
                                        byteBufferOrder3.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) (this.f21886 + 0.5f));
                                        byteBufferOrder3.putShort((short) (this.f21869 + 0.5f));
                                        byteBufferOrder3.putShort((short) this.f21883);
                                        byteBufferOrder3.putShort((short) this.f21906);
                                    }
                                    C10207 c10209 = new C10207();
                                    c10209.m26332(this.f21870);
                                    c10209.m26334(this.f21878);
                                    c10209.m26335(this.f21889);
                                    c10209.m26331(bArr);
                                    c10209.m26333(this.f21912);
                                    c10209.m26330(this.f21912);
                                    c1259M26329 = c10209.m26329();
                                }
                                if (this.f21872 == null) {
                                    iIntValue = -1;
                                } else {
                                    iIntValue = -1;
                                }
                                if (this.f21890 == 0) {
                                    if (Float.compare(this.f21879, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                c20124.m46291(this.f21881);
                                c20124.m46333(this.f21896);
                                c20124.m46325(f);
                                c20124.m46307(iIntValue);
                                c20124.m46305(this.f21898);
                                c20124.m46313(this.f21900);
                                c20124.m46302(c1259M26329);
                                i6 = 2;
                            } else {
                                if ("application/x-subrip".equals(str11)) {
                                }
                                i6 = 3;
                            }
                            break;
                        }
                        if (this.f21872 != null) {
                            c20124.m46330(this.f21872);
                        }
                        c20124.m46317(i);
                        if (this.f21911) {
                            str8 = "video/webm";
                        } else {
                            str8 = "video/x-matroska";
                        }
                        c20124.m46327(str8);
                        c20124.m46315(str11);
                        c20124.m46318(i2);
                        c20124.m46321(this.f21905);
                        c20124.m46294(i14);
                        c20124.m46301(list);
                        c20124.m46300(str);
                        c20124.m46304(this.f21909);
                        C15648 c15648M46297 = c20124.m46295();
                        InterfaceC22024 interfaceC22024Mo166510 = interfaceC12789.mo16658(this.f21884, i6);
                        this.f21882 = interfaceC22024Mo166510;
                        interfaceC22024Mo166510.mo14384(c15648M46297);
                        return;
                    }
                    int i15 = this.f21876;
                    String str13 = C7116.f23455;
                    int iM19464 = C7116.m19463(i15, ByteOrder.LITTLE_ENDIAN);
                    if (iM19464 == 0) {
                        C1896.m6517("Unsupported PCM bit depth: " + this.f21876 + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        i2 = -1;
                        str = null;
                        str11 = str12;
                        list5 = listSingletonList;
                        i3 = -1;
                        list = list5;
                    } else {
                        list = null;
                        str = null;
                        i3 = iM19464;
                        i2 = -1;
                    }
                    if (this.f21873 != null) {
                        str = c4705M14596.f16606;
                        str11 = "video/dolby-vision";
                    }
                    boolean z4 = this.f21891;
                    if (this.f21880) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    int i16 = (z4 ? 1 : 0) | i5;
                    c20124 = new C20124();
                    if (C9681.m25258(str11)) {
                        c20124.m46329(this.f21914);
                        c20124.m46332(this.f21920);
                        c20124.m46293(i3);
                        i6 = 1;
                    } else {
                        if (C9681.m25257(str11)) {
                            if (this.f21899 == 0) {
                                i10 = this.f21916;
                                i7 = -1;
                                if (i10 == -1) {
                                    i10 = this.f21881;
                                }
                                this.f21916 = i10;
                                i11 = this.f21903;
                                if (i11 == -1) {
                                    i11 = this.f21896;
                                }
                                this.f21903 = i11;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.f21916;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f21918) {
                                if (this.f21915 != -1.0f) {
                                    bArr = new byte[25];
                                    ByteBuffer byteBufferOrder4 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder4.put((byte) 0);
                                    byteBufferOrder4.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) (this.f21886 + 0.5f));
                                    byteBufferOrder4.putShort((short) (this.f21869 + 0.5f));
                                    byteBufferOrder4.putShort((short) this.f21883);
                                    byteBufferOrder4.putShort((short) this.f21906);
                                }
                                C10207 c102010 = new C10207();
                                c102010.m26332(this.f21870);
                                c102010.m26334(this.f21878);
                                c102010.m26335(this.f21889);
                                c102010.m26331(bArr);
                                c102010.m26333(this.f21912);
                                c102010.m26330(this.f21912);
                                c1259M26329 = c102010.m26329();
                            }
                            if (this.f21872 == null) {
                                iIntValue = -1;
                            } else {
                                iIntValue = -1;
                            }
                            if (this.f21890 == 0) {
                                if (Float.compare(this.f21879, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            c20124.m46291(this.f21881);
                            c20124.m46333(this.f21896);
                            c20124.m46325(f);
                            c20124.m46307(iIntValue);
                            c20124.m46305(this.f21898);
                            c20124.m46313(this.f21900);
                            c20124.m46302(c1259M26329);
                            i6 = 2;
                        } else {
                            if ("application/x-subrip".equals(str11)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.f21872 != null) {
                        c20124.m46330(this.f21872);
                    }
                    c20124.m46317(i);
                    if (this.f21911) {
                        str8 = "video/webm";
                    } else {
                        str8 = "video/x-matroska";
                    }
                    c20124.m46327(str8);
                    c20124.m46315(str11);
                    c20124.m46318(i2);
                    c20124.m46321(this.f21905);
                    c20124.m46294(i16);
                    c20124.m46301(list);
                    c20124.m46300(str);
                    c20124.m46304(this.f21909);
                    C15648 c15648M46298 = c20124.m46295();
                    InterfaceC22024 interfaceC22024Mo166511 = interfaceC12789.mo16658(this.f21884, i6);
                    this.f21882 = interfaceC22024Mo166511;
                    interfaceC22024Mo166511.mo14384(c15648M46298);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C2970.m9688("Error parsing MS/ACM codec private", (Throwable) null);
                }
            case 3:
                this.f21917 = new C10835();
                str12 = "audio/true-hd";
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z5 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i17 = (z5 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder5 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder5.put((byte) 0);
                                byteBufferOrder5.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder5.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder5.putShort((short) this.f21883);
                                byteBufferOrder5.putShort((short) this.f21906);
                            }
                            C10207 c102011 = new C10207();
                            c102011.m26332(this.f21870);
                            c102011.m26334(this.f21878);
                            c102011.m26335(this.f21889);
                            c102011.m26331(bArr);
                            c102011.m26333(this.f21912);
                            c102011.m26330(this.f21912);
                            c1259M26329 = c102011.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i17);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M46299 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo166512 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo166512;
                interfaceC22024Mo166512.mo14384(c15648M46299);
                return;
            case 4:
                byte[] bArrM18390 = m18390(this.f21897);
                try {
                    if (bArrM18390[0] != 2) {
                        throw C2970.m9688("Error parsing vorbis codec private", (Throwable) null);
                    }
                    int i18 = 1;
                    int i19 = 0;
                    while (true) {
                        int i20 = bArrM18390[i18] & 255;
                        if (i20 == 255) {
                            i19 += 255;
                            i18++;
                        } else {
                            int i21 = i18 + 1;
                            int i22 = i19 + i20;
                            int i23 = 0;
                            while (true) {
                                int i24 = bArrM18390[i21] & 255;
                                if (i24 != 255) {
                                    int i25 = i21 + 1;
                                    int i26 = i23 + i24;
                                    if (bArrM18390[i25] != 1) {
                                        throw C2970.m9688("Error parsing vorbis codec private", (Throwable) null);
                                    }
                                    byte[] bArr3 = new byte[i22];
                                    System.arraycopy(bArrM18390, i25, bArr3, 0, i22);
                                    int i27 = i25 + i22;
                                    if (bArrM18390[i27] != 3) {
                                        throw C2970.m9688("Error parsing vorbis codec private", (Throwable) null);
                                    }
                                    int i28 = i27 + i26;
                                    if (bArrM18390[i28] != 5) {
                                        throw C2970.m9688("Error parsing vorbis codec private", (Throwable) null);
                                    }
                                    byte[] bArr4 = new byte[bArrM18390.length - i28];
                                    System.arraycopy(bArrM18390, i28, bArr4, 0, bArrM18390.length - i28);
                                    ArrayList arrayList = new ArrayList(2);
                                    arrayList.add(bArr3);
                                    arrayList.add(bArr4);
                                    str2 = "audio/vorbis";
                                    str = null;
                                    i4 = 8192;
                                    list2 = arrayList;
                                    str11 = str2;
                                    i2 = i4;
                                    list5 = list2;
                                    i3 = -1;
                                    list = list5;
                                    if (this.f21873 != null) {
                                        str = c4705M14596.f16606;
                                        str11 = "video/dolby-vision";
                                    }
                                    boolean z6 = this.f21891;
                                    if (this.f21880) {
                                        i5 = 2;
                                    } else {
                                        i5 = 0;
                                    }
                                    int i110 = (z6 ? 1 : 0) | i5;
                                    c20124 = new C20124();
                                    if (C9681.m25258(str11)) {
                                        c20124.m46329(this.f21914);
                                        c20124.m46332(this.f21920);
                                        c20124.m46293(i3);
                                        i6 = 1;
                                    } else {
                                        if (C9681.m25257(str11)) {
                                            if (this.f21899 == 0) {
                                                i10 = this.f21916;
                                                i7 = -1;
                                                if (i10 == -1) {
                                                    i10 = this.f21881;
                                                }
                                                this.f21916 = i10;
                                                i11 = this.f21903;
                                                if (i11 == -1) {
                                                    i11 = this.f21896;
                                                }
                                                this.f21903 = i11;
                                            } else {
                                                i7 = -1;
                                            }
                                            i8 = this.f21916;
                                            if (i8 != i7) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (this.f21918) {
                                                if (this.f21915 != -1.0f) {
                                                    bArr = new byte[25];
                                                    ByteBuffer byteBufferOrder6 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                                    byteBufferOrder6.put((byte) 0);
                                                    byteBufferOrder6.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) (this.f21886 + 0.5f));
                                                    byteBufferOrder6.putShort((short) (this.f21869 + 0.5f));
                                                    byteBufferOrder6.putShort((short) this.f21883);
                                                    byteBufferOrder6.putShort((short) this.f21906);
                                                }
                                                C10207 c102012 = new C10207();
                                                c102012.m26332(this.f21870);
                                                c102012.m26334(this.f21878);
                                                c102012.m26335(this.f21889);
                                                c102012.m26331(bArr);
                                                c102012.m26333(this.f21912);
                                                c102012.m26330(this.f21912);
                                                c1259M26329 = c102012.m26329();
                                            }
                                            if (this.f21872 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (this.f21890 == 0) {
                                                if (Float.compare(this.f21879, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            c20124.m46291(this.f21881);
                                            c20124.m46333(this.f21896);
                                            c20124.m46325(f);
                                            c20124.m46307(iIntValue);
                                            c20124.m46305(this.f21898);
                                            c20124.m46313(this.f21900);
                                            c20124.m46302(c1259M26329);
                                            i6 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                            }
                                            i6 = 3;
                                        }
                                        break;
                                    }
                                    if (this.f21872 != null) {
                                        c20124.m46330(this.f21872);
                                    }
                                    c20124.m46317(i);
                                    if (this.f21911) {
                                        str8 = "video/webm";
                                    } else {
                                        str8 = "video/x-matroska";
                                    }
                                    c20124.m46327(str8);
                                    c20124.m46315(str11);
                                    c20124.m46318(i2);
                                    c20124.m46321(this.f21905);
                                    c20124.m46294(i110);
                                    c20124.m46301(list);
                                    c20124.m46300(str);
                                    c20124.m46304(this.f21909);
                                    C15648 c15648M462910 = c20124.m46295();
                                    InterfaceC22024 interfaceC22024Mo166513 = interfaceC12789.mo16658(this.f21884, i6);
                                    this.f21882 = interfaceC22024Mo166513;
                                    interfaceC22024Mo166513.mo14384(c15648M462910);
                                    return;
                                }
                                i23 += 255;
                                i21++;
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    throw C2970.m9688("Error parsing vorbis codec private", (Throwable) null);
                }
                break;
            case 5:
                str3 = "audio/mpeg-L2";
                str2 = str3;
                list2 = null;
                str = null;
                i4 = 4096;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z7 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i111 = (z7 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder7 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder7.put((byte) 0);
                                byteBufferOrder7.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder7.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder7.putShort((short) this.f21883);
                                byteBufferOrder7.putShort((short) this.f21906);
                            }
                            C10207 c102013 = new C10207();
                            c102013.m26332(this.f21870);
                            c102013.m26334(this.f21878);
                            c102013.m26335(this.f21889);
                            c102013.m26331(bArr);
                            c102013.m26333(this.f21912);
                            c102013.m26330(this.f21912);
                            c1259M26329 = c102013.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i111);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M462911 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo166514 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo166514;
                interfaceC22024Mo166514.mo14384(c15648M462911);
                return;
            case 6:
                str3 = "audio/mpeg";
                str2 = str3;
                list2 = null;
                str = null;
                i4 = 4096;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z8 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i112 = (z8 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder8 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder8.put((byte) 0);
                                byteBufferOrder8.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder8.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder8.putShort((short) this.f21883);
                                byteBufferOrder8.putShort((short) this.f21906);
                            }
                            C10207 c102014 = new C10207();
                            c102014.m26332(this.f21870);
                            c102014.m26334(this.f21878);
                            c102014.m26335(this.f21889);
                            c102014.m26331(bArr);
                            c102014.m26333(this.f21912);
                            c102014.m26330(this.f21912);
                            c1259M26329 = c102014.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i112);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M462912 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo166515 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo166515;
                interfaceC22024Mo166515.mo14384(c15648M462912);
                return;
            case 7:
                C21287 c21288 = new C21287(m18390(this.f21897));
                try {
                    c21288.m48503(16);
                    long jM48505 = c21288.m48505();
                    if (jM48505 == 1482049860) {
                        pair = new Pair("video/divx", null);
                    } else if (jM48505 == 859189832) {
                        pair = new Pair("video/3gpp", null);
                    } else if (jM48505 == 826496599) {
                        int iM48516 = c21288.m48516() + 20;
                        byte[] bArrM48497 = c21288.m48497();
                        while (true) {
                            if (iM48516 < bArrM48497.length - 4) {
                                if (bArrM48497[iM48516] == 0 && bArrM48497[iM48516 + 1] == 0 && bArrM48497[iM48516 + 2] == 1 && bArrM48497[iM48516 + 3] == 15) {
                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrM48497, iM48516, bArrM48497.length)));
                                } else {
                                    iM48516++;
                                }
                            } else {
                                throw C2970.m9688("Failed to find FourCC VC1 initialization data", (Throwable) null);
                            }
                        }
                    } else {
                        C1896.m6517("Unknown FourCC. Setting mimeType to video/x-unknown");
                        pair = new Pair("video/x-unknown", null);
                    }
                    str4 = (String) pair.first;
                    listOf2 = (List) pair.second;
                    str12 = str4;
                    listOf = listOf2;
                    str7 = null;
                    list4 = listOf;
                    str = str7;
                    str2 = str12;
                    i4 = -1;
                    list2 = list4;
                    str11 = str2;
                    i2 = i4;
                    list5 = list2;
                    i3 = -1;
                    list = list5;
                    if (this.f21873 != null) {
                        str = c4705M14596.f16606;
                        str11 = "video/dolby-vision";
                    }
                    boolean z9 = this.f21891;
                    if (this.f21880) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    int i113 = (z9 ? 1 : 0) | i5;
                    c20124 = new C20124();
                    if (C9681.m25258(str11)) {
                        c20124.m46329(this.f21914);
                        c20124.m46332(this.f21920);
                        c20124.m46293(i3);
                        i6 = 1;
                    } else {
                        if (C9681.m25257(str11)) {
                            if (this.f21899 == 0) {
                                i10 = this.f21916;
                                i7 = -1;
                                if (i10 == -1) {
                                    i10 = this.f21881;
                                }
                                this.f21916 = i10;
                                i11 = this.f21903;
                                if (i11 == -1) {
                                    i11 = this.f21896;
                                }
                                this.f21903 = i11;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.f21916;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f21918) {
                                if (this.f21915 != -1.0f) {
                                    bArr = new byte[25];
                                    ByteBuffer byteBufferOrder9 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder9.put((byte) 0);
                                    byteBufferOrder9.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) (this.f21886 + 0.5f));
                                    byteBufferOrder9.putShort((short) (this.f21869 + 0.5f));
                                    byteBufferOrder9.putShort((short) this.f21883);
                                    byteBufferOrder9.putShort((short) this.f21906);
                                }
                                C10207 c102015 = new C10207();
                                c102015.m26332(this.f21870);
                                c102015.m26334(this.f21878);
                                c102015.m26335(this.f21889);
                                c102015.m26331(bArr);
                                c102015.m26333(this.f21912);
                                c102015.m26330(this.f21912);
                                c1259M26329 = c102015.m26329();
                            }
                            if (this.f21872 == null) {
                                iIntValue = -1;
                            } else {
                                iIntValue = -1;
                            }
                            if (this.f21890 == 0) {
                                if (Float.compare(this.f21879, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            c20124.m46291(this.f21881);
                            c20124.m46333(this.f21896);
                            c20124.m46325(f);
                            c20124.m46307(iIntValue);
                            c20124.m46305(this.f21898);
                            c20124.m46313(this.f21900);
                            c20124.m46302(c1259M26329);
                            i6 = 2;
                        } else {
                            if ("application/x-subrip".equals(str11)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.f21872 != null) {
                        c20124.m46330(this.f21872);
                    }
                    c20124.m46317(i);
                    if (this.f21911) {
                        str8 = "video/webm";
                    } else {
                        str8 = "video/x-matroska";
                    }
                    c20124.m46327(str8);
                    c20124.m46315(str11);
                    c20124.m46318(i2);
                    c20124.m46321(this.f21905);
                    c20124.m46294(i113);
                    c20124.m46301(list);
                    c20124.m46300(str);
                    c20124.m46304(this.f21909);
                    C15648 c15648M462913 = c20124.m46295();
                    InterfaceC22024 interfaceC22024Mo166516 = interfaceC12789.mo16658(this.f21884, i6);
                    this.f21882 = interfaceC22024Mo166516;
                    interfaceC22024Mo166516.mo14384(c15648M462913);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused3) {
                    throw C2970.m9688("Error parsing FourCC private data", (Throwable) null);
                }
            case 8:
                byte[] bArr5 = new byte[4];
                System.arraycopy(m18390(this.f21897), 0, bArr5, 0, 4);
                str12 = "application/dvbsubs";
                listOf = AbstractC1928.of((Object) bArr5);
                str7 = null;
                list4 = listOf;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z10 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i114 = (z10 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder10 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder10.put((byte) 0);
                                byteBufferOrder10.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder10.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder10.putShort((short) this.f21883);
                                byteBufferOrder10.putShort((short) this.f21906);
                            }
                            C10207 c102016 = new C10207();
                            c102016.m26332(this.f21870);
                            c102016.m26334(this.f21878);
                            c102016.m26335(this.f21889);
                            c102016.m26331(bArr);
                            c102016.m26333(this.f21912);
                            c102016.m26330(this.f21912);
                            c1259M26329 = c102016.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i114);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M462914 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo166517 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo166517;
                interfaceC22024Mo166517.mo14384(c15648M462914);
                return;
            case 10:
                C12153 c12153M30362 = C12153.m30362(new C21287(m18390(this.f21897)));
                ArrayList arrayList2 = c12153M30362.f39066;
                this.f21885 = c12153M30362.f39068;
                str5 = c12153M30362.f39067;
                str6 = "video/avc";
                list3 = arrayList2;
                str12 = str6;
                List list6 = list3;
                str7 = str5;
                list4 = list6;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z11 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i115 = (z11 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder11 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder11.put((byte) 0);
                                byteBufferOrder11.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder11.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder11.putShort((short) this.f21883);
                                byteBufferOrder11.putShort((short) this.f21906);
                            }
                            C10207 c102017 = new C10207();
                            c102017.m26332(this.f21870);
                            c102017.m26334(this.f21878);
                            c102017.m26335(this.f21889);
                            c102017.m26331(bArr);
                            c102017.m26333(this.f21912);
                            c102017.m26330(this.f21912);
                            c1259M26329 = c102017.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i115);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M462915 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo166518 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo166518;
                interfaceC22024Mo166518.mo14384(c15648M462915);
                return;
            case 11:
                str12 = "application/vobsub";
                listOf = AbstractC1928.of((Object) m18390(this.f21897));
                str7 = null;
                list4 = listOf;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z12 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i116 = (z12 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder12 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder12.put((byte) 0);
                                byteBufferOrder12.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder12.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder12.putShort((short) this.f21883);
                                byteBufferOrder12.putShort((short) this.f21906);
                            }
                            C10207 c102018 = new C10207();
                            c102018.m26332(this.f21870);
                            c102018.m26334(this.f21878);
                            c102018.m26335(this.f21889);
                            c102018.m26331(bArr);
                            c102018.m26333(this.f21912);
                            c102018.m26330(this.f21912);
                            c1259M26329 = c102018.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i116);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M462916 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo166519 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo166519;
                interfaceC22024Mo166519.mo14384(c15648M462916);
                return;
            case 12:
                str10 = "audio/vnd.dts.hd";
                str12 = str10;
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z13 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i117 = (z13 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder13 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder13.put((byte) 0);
                                byteBufferOrder13.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder13.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder13.putShort((short) this.f21883);
                                byteBufferOrder13.putShort((short) this.f21906);
                            }
                            C10207 c102019 = new C10207();
                            c102019.m26332(this.f21870);
                            c102019.m26334(this.f21878);
                            c102019.m26335(this.f21889);
                            c102019.m26331(bArr);
                            c102019.m26333(this.f21912);
                            c102019.m26330(this.f21912);
                            c1259M26329 = c102019.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i117);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M462917 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo1665110 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo1665110;
                interfaceC22024Mo1665110.mo14384(c15648M462917);
                return;
            case 13:
                List listSingletonList2 = Collections.singletonList(m18390(this.f21897));
                byte[] bArr6 = this.f21893;
                C24834 c24834M39348 = C16628.m39348(new C14573(bArr6, bArr6.length), false);
                this.f21920 = c24834M39348.f80326;
                this.f21914 = c24834M39348.f80325;
                str7 = c24834M39348.f80327;
                str12 = "audio/mp4a-latm";
                list4 = listSingletonList2;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z14 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i118 = (z14 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder14 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder14.put((byte) 0);
                                byteBufferOrder14.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder14.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder14.putShort((short) this.f21883);
                                byteBufferOrder14.putShort((short) this.f21906);
                            }
                            C10207 c1020110 = new C10207();
                            c1020110.m26332(this.f21870);
                            c1020110.m26334(this.f21878);
                            c1020110.m26335(this.f21889);
                            c1020110.m26331(bArr);
                            c1020110.m26333(this.f21912);
                            c1020110.m26330(this.f21912);
                            c1259M26329 = c1020110.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i118);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M462918 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo1665111 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo1665111;
                interfaceC22024Mo1665111.mo14384(c15648M462918);
                return;
            case 14:
                str10 = "audio/ac3";
                str12 = str10;
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z15 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i119 = (z15 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder15 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder15.put((byte) 0);
                                byteBufferOrder15.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder15.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder15.putShort((short) this.f21883);
                                byteBufferOrder15.putShort((short) this.f21906);
                            }
                            C10207 c1020111 = new C10207();
                            c1020111.m26332(this.f21870);
                            c1020111.m26334(this.f21878);
                            c1020111.m26335(this.f21889);
                            c1020111.m26331(bArr);
                            c1020111.m26333(this.f21912);
                            c1020111.m26330(this.f21912);
                            c1259M26329 = c1020111.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i119);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M462919 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo1665112 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo1665112;
                interfaceC22024Mo1665112.mo14384(c15648M462919);
                return;
            case 15:
            case 21:
                str10 = "audio/vnd.dts";
                str12 = str10;
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z16 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1110 = (z16 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder16 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder16.put((byte) 0);
                                byteBufferOrder16.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder16.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder16.putShort((short) this.f21883);
                                byteBufferOrder16.putShort((short) this.f21906);
                            }
                            C10207 c1020112 = new C10207();
                            c1020112.m26332(this.f21870);
                            c1020112.m26334(this.f21878);
                            c1020112.m26335(this.f21889);
                            c1020112.m26331(bArr);
                            c1020112.m26333(this.f21912);
                            c1020112.m26330(this.f21912);
                            c1259M26329 = c1020112.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i1110);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M4629110 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo1665113 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo1665113;
                interfaceC22024Mo1665113.mo14384(c15648M4629110);
                return;
            case 16:
                byte[] bArr7 = this.f21893;
                str4 = "video/av01";
                listOf2 = bArr7 == null ? null : AbstractC1928.of((Object) bArr7);
                str12 = str4;
                listOf = listOf2;
                str7 = null;
                list4 = listOf;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z17 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1111 = (z17 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder17 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder17.put((byte) 0);
                                byteBufferOrder17.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder17.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder17.putShort((short) this.f21883);
                                byteBufferOrder17.putShort((short) this.f21906);
                            }
                            C10207 c1020113 = new C10207();
                            c1020113.m26332(this.f21870);
                            c1020113.m26334(this.f21878);
                            c1020113.m26335(this.f21889);
                            c1020113.m26331(bArr);
                            c1020113.m26333(this.f21912);
                            c1020113.m26330(this.f21912);
                            c1259M26329 = c1020113.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i1111);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M4629111 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo1665114 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo1665114;
                interfaceC22024Mo1665114.mo14384(c15648M4629111);
                return;
            case 17:
                str10 = "video/x-vnd.on2.vp8";
                str12 = str10;
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z18 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1112 = (z18 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder18 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder18.put((byte) 0);
                                byteBufferOrder18.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder18.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder18.putShort((short) this.f21883);
                                byteBufferOrder18.putShort((short) this.f21906);
                            }
                            C10207 c1020114 = new C10207();
                            c1020114.m26332(this.f21870);
                            c1020114.m26334(this.f21878);
                            c1020114.m26335(this.f21889);
                            c1020114.m26331(bArr);
                            c1020114.m26333(this.f21912);
                            c1020114.m26330(this.f21912);
                            c1259M26329 = c1020114.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i1112);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M4629112 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo1665115 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo1665115;
                interfaceC22024Mo1665115.mo14384(c15648M4629112);
                return;
            case 18:
                byte[] bArr8 = this.f21893;
                str4 = "video/x-vnd.on2.vp9";
                listOf2 = bArr8 == null ? null : AbstractC1928.of((Object) bArr8);
                str12 = str4;
                listOf = listOf2;
                str7 = null;
                list4 = listOf;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z19 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1113 = (z19 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder19 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder19.put((byte) 0);
                                byteBufferOrder19.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder19.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder19.putShort((short) this.f21883);
                                byteBufferOrder19.putShort((short) this.f21906);
                            }
                            C10207 c1020115 = new C10207();
                            c1020115.m26332(this.f21870);
                            c1020115.m26334(this.f21878);
                            c1020115.m26335(this.f21889);
                            c1020115.m26331(bArr);
                            c1020115.m26333(this.f21912);
                            c1020115.m26330(this.f21912);
                            c1259M26329 = c1020115.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i1113);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M4629113 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo1665116 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo1665116;
                interfaceC22024Mo1665116.mo14384(c15648M4629113);
                return;
            case 19:
                str12 = "application/pgs";
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z110 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1114 = (z110 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder110.put((byte) 0);
                                byteBufferOrder110.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder110.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder110.putShort((short) this.f21883);
                                byteBufferOrder110.putShort((short) this.f21906);
                            }
                            C10207 c1020116 = new C10207();
                            c1020116.m26332(this.f21870);
                            c1020116.m26334(this.f21878);
                            c1020116.m26335(this.f21889);
                            c1020116.m26331(bArr);
                            c1020116.m26333(this.f21912);
                            c1020116.m26330(this.f21912);
                            c1259M26329 = c1020116.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i1114);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M4629114 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo1665117 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo1665117;
                interfaceC22024Mo1665117.mo14384(c15648M4629114);
                return;
            case 20:
                str12 = str10;
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z111 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1115 = (z111 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder111.put((byte) 0);
                                byteBufferOrder111.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder111.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder111.putShort((short) this.f21883);
                                byteBufferOrder111.putShort((short) this.f21906);
                            }
                            C10207 c1020117 = new C10207();
                            c1020117.m26332(this.f21870);
                            c1020117.m26334(this.f21878);
                            c1020117.m26335(this.f21889);
                            c1020117.m26331(bArr);
                            c1020117.m26333(this.f21912);
                            c1020117.m26330(this.f21912);
                            c1259M26329 = c1020117.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i1115);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M4629115 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo1665118 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo1665118;
                interfaceC22024Mo1665118.mo14384(c15648M4629115);
                return;
            case 22:
                if (this.f21876 == 32) {
                    list = null;
                    str = null;
                    i2 = -1;
                    i3 = 4;
                } else {
                    C1896.m6517("Unsupported floating point PCM bit depth: " + this.f21876 + ". Setting mimeType to audio/x-unknown");
                    list4 = null;
                    str7 = null;
                    str = str7;
                    str2 = str12;
                    i4 = -1;
                    list2 = list4;
                    str11 = str2;
                    i2 = i4;
                    list5 = list2;
                    i3 = -1;
                    list = list5;
                }
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z112 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1116 = (z112 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder112.put((byte) 0);
                                byteBufferOrder112.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder112.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder112.putShort((short) this.f21883);
                                byteBufferOrder112.putShort((short) this.f21906);
                            }
                            C10207 c1020118 = new C10207();
                            c1020118.m26332(this.f21870);
                            c1020118.m26334(this.f21878);
                            c1020118.m26335(this.f21889);
                            c1020118.m26331(bArr);
                            c1020118.m26333(this.f21912);
                            c1020118.m26330(this.f21912);
                            c1259M26329 = c1020118.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i1116);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M4629116 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo1665119 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo1665119;
                interfaceC22024Mo1665119.mo14384(c15648M4629116);
                return;
            case 23:
                int i29 = this.f21876;
                if (i29 == 8) {
                    list = null;
                    str = null;
                    i2 = -1;
                    i3 = 3;
                } else {
                    if (i29 == 16) {
                        iM19463 = 268435456;
                    } else if (i29 == 24) {
                        iM19463 = 1342177280;
                    } else if (i29 == 32) {
                        iM19463 = 1610612736;
                    } else {
                        C1896.m6517("Unsupported big endian PCM bit depth: " + this.f21876 + ". Setting mimeType to audio/x-unknown");
                        list4 = null;
                        str7 = null;
                        str = str7;
                        str2 = str12;
                        i4 = -1;
                        list2 = list4;
                        str11 = str2;
                        i2 = i4;
                        list5 = list2;
                        i3 = -1;
                        list = list5;
                    }
                    i2 = -1;
                    i3 = iM19463;
                    list = null;
                    str = null;
                }
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z113 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1117 = (z113 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder113 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder113.put((byte) 0);
                                byteBufferOrder113.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder113.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder113.putShort((short) this.f21883);
                                byteBufferOrder113.putShort((short) this.f21906);
                            }
                            C10207 c1020119 = new C10207();
                            c1020119.m26332(this.f21870);
                            c1020119.m26334(this.f21878);
                            c1020119.m26335(this.f21889);
                            c1020119.m26331(bArr);
                            c1020119.m26333(this.f21912);
                            c1020119.m26330(this.f21912);
                            c1259M26329 = c1020119.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i1117);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M4629117 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo16651110 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo16651110;
                interfaceC22024Mo16651110.mo14384(c15648M4629117);
                return;
            case 24:
                int i30 = this.f21876;
                String str14 = C7116.f23455;
                iM19463 = C7116.m19463(i30, ByteOrder.LITTLE_ENDIAN);
                if (iM19463 == 0) {
                    C1896.m6517("Unsupported little endian PCM bit depth: " + this.f21876 + ". Setting mimeType to audio/x-unknown");
                    list4 = null;
                    str7 = null;
                    str = str7;
                    str2 = str12;
                    i4 = -1;
                    list2 = list4;
                    str11 = str2;
                    i2 = i4;
                    list5 = list2;
                    i3 = -1;
                    list = list5;
                } else {
                    i2 = -1;
                    i3 = iM19463;
                    list = null;
                    str = null;
                }
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z114 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1118 = (z114 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder114 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder114.put((byte) 0);
                                byteBufferOrder114.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder114.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder114.putShort((short) this.f21883);
                                byteBufferOrder114.putShort((short) this.f21906);
                            }
                            C10207 c10201110 = new C10207();
                            c10201110.m26332(this.f21870);
                            c10201110.m26334(this.f21878);
                            c10201110.m26335(this.f21889);
                            c10201110.m26331(bArr);
                            c10201110.m26333(this.f21912);
                            c10201110.m26330(this.f21912);
                            c1259M26329 = c10201110.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i1118);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M4629118 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo16651111 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo16651111;
                interfaceC22024Mo16651111.mo14384(c15648M4629118);
                return;
            case 25:
            case 26:
                str12 = "text/x-ssa";
                listOf = AbstractC1928.of((Object) C24415.f79223, (Object) m18390(this.f21897));
                str7 = null;
                list4 = listOf;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z115 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1119 = (z115 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder115 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder115.put((byte) 0);
                                byteBufferOrder115.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder115.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder115.putShort((short) this.f21883);
                                byteBufferOrder115.putShort((short) this.f21906);
                            }
                            C10207 c10201111 = new C10207();
                            c10201111.m26332(this.f21870);
                            c10201111.m26334(this.f21878);
                            c10201111.m26335(this.f21889);
                            c10201111.m26331(bArr);
                            c10201111.m26333(this.f21912);
                            c10201111.m26330(this.f21912);
                            c1259M26329 = c10201111.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i1119);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M4629119 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo16651112 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo16651112;
                interfaceC22024Mo16651112.mo14384(c15648M4629119);
                return;
            case 27:
                C3840 c3840M12380 = C3840.m12380(new C21287(m18390(this.f21897)));
                List list7 = c3840M12380.f13078;
                this.f21885 = c3840M12380.f13090;
                str5 = c3840M12380.f13083;
                str6 = "video/hevc";
                list3 = list7;
                str12 = str6;
                List list8 = list3;
                str7 = str5;
                list4 = list8;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z116 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11110 = (z116 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder116 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder116.put((byte) 0);
                                byteBufferOrder116.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder116.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder116.putShort((short) this.f21883);
                                byteBufferOrder116.putShort((short) this.f21906);
                            }
                            C10207 c10201112 = new C10207();
                            c10201112.m26332(this.f21870);
                            c10201112.m26334(this.f21878);
                            c10201112.m26335(this.f21889);
                            c10201112.m26331(bArr);
                            c10201112.m26333(this.f21912);
                            c10201112.m26330(this.f21912);
                            c1259M26329 = c10201112.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i11110);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M46291110 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo16651113 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo16651113;
                interfaceC22024Mo16651113.mo14384(c15648M46291110);
                return;
            case 28:
                str12 = "text/vtt";
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z117 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11111 = (z117 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder117 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder117.put((byte) 0);
                                byteBufferOrder117.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder117.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder117.putShort((short) this.f21883);
                                byteBufferOrder117.putShort((short) this.f21906);
                            }
                            C10207 c10201113 = new C10207();
                            c10201113.m26332(this.f21870);
                            c10201113.m26334(this.f21878);
                            c10201113.m26335(this.f21889);
                            c10201113.m26331(bArr);
                            c10201113.m26333(this.f21912);
                            c10201113.m26330(this.f21912);
                            c1259M26329 = c10201113.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i11111);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M46291111 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo16651114 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo16651114;
                interfaceC22024Mo16651114.mo14384(c15648M46291111);
                return;
            case 29:
                str12 = "application/x-subrip";
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z118 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11112 = (z118 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder118 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder118.put((byte) 0);
                                byteBufferOrder118.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder118.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder118.putShort((short) this.f21883);
                                byteBufferOrder118.putShort((short) this.f21906);
                            }
                            C10207 c10201114 = new C10207();
                            c10201114.m26332(this.f21870);
                            c10201114.m26334(this.f21878);
                            c10201114.m26335(this.f21889);
                            c10201114.m26331(bArr);
                            c10201114.m26333(this.f21912);
                            c10201114.m26330(this.f21912);
                            c1259M26329 = c10201114.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i11112);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M46291112 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo16651115 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo16651115;
                interfaceC22024Mo16651115.mo14384(c15648M46291112);
                return;
            case 30:
                str10 = "video/mpeg2";
                str12 = str10;
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z119 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11113 = (z119 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder119 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder119.put((byte) 0);
                                byteBufferOrder119.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder119.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder119.putShort((short) this.f21883);
                                byteBufferOrder119.putShort((short) this.f21906);
                            }
                            C10207 c10201115 = new C10207();
                            c10201115.m26332(this.f21870);
                            c10201115.m26334(this.f21878);
                            c10201115.m26335(this.f21889);
                            c10201115.m26331(bArr);
                            c10201115.m26333(this.f21912);
                            c10201115.m26330(this.f21912);
                            c1259M26329 = c10201115.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i11113);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M46291113 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo16651116 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo16651116;
                interfaceC22024Mo16651116.mo14384(c15648M46291113);
                return;
            case 31:
                str10 = "audio/eac3";
                str12 = str10;
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z1110 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11114 = (z1110 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1110.put((byte) 0);
                                byteBufferOrder1110.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder1110.putShort((short) this.f21883);
                                byteBufferOrder1110.putShort((short) this.f21906);
                            }
                            C10207 c10201116 = new C10207();
                            c10201116.m26332(this.f21870);
                            c10201116.m26334(this.f21878);
                            c10201116.m26335(this.f21889);
                            c10201116.m26331(bArr);
                            c10201116.m26333(this.f21912);
                            c10201116.m26330(this.f21912);
                            c1259M26329 = c10201116.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i11114);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M46291114 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo16651117 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo16651117;
                interfaceC22024Mo16651117.mo14384(c15648M46291114);
                return;
            case 32:
                str4 = "audio/flac";
                listOf2 = Collections.singletonList(m18390(this.f21897));
                str12 = str4;
                listOf = listOf2;
                str7 = null;
                list4 = listOf;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z1111 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11115 = (z1111 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1111.put((byte) 0);
                                byteBufferOrder1111.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder1111.putShort((short) this.f21883);
                                byteBufferOrder1111.putShort((short) this.f21906);
                            }
                            C10207 c10201117 = new C10207();
                            c10201117.m26332(this.f21870);
                            c10201117.m26334(this.f21878);
                            c10201117.m26335(this.f21889);
                            c10201117.m26331(bArr);
                            c10201117.m26333(this.f21912);
                            c10201117.m26330(this.f21912);
                            c1259M26329 = c10201117.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i11115);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M46291115 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo16651118 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo16651118;
                interfaceC22024Mo16651118.mo14384(c15648M46291115);
                return;
            case 33:
                ArrayList arrayList3 = new ArrayList(3);
                arrayList3.add(m18390(this.f21897));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(this.f21907).array());
                arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f21904).array());
                str2 = "audio/opus";
                str = null;
                i4 = 5760;
                list2 = arrayList3;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f21873 != null) {
                    str = c4705M14596.f16606;
                    str11 = "video/dolby-vision";
                }
                boolean z1112 = this.f21891;
                if (this.f21880) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11116 = (z1112 ? 1 : 0) | i5;
                c20124 = new C20124();
                if (C9681.m25258(str11)) {
                    c20124.m46329(this.f21914);
                    c20124.m46332(this.f21920);
                    c20124.m46293(i3);
                    i6 = 1;
                } else {
                    if (C9681.m25257(str11)) {
                        if (this.f21899 == 0) {
                            i10 = this.f21916;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f21881;
                            }
                            this.f21916 = i10;
                            i11 = this.f21903;
                            if (i11 == -1) {
                                i11 = this.f21896;
                            }
                            this.f21903 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f21916;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f21918) {
                            if (this.f21915 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1112.put((byte) 0);
                                byteBufferOrder1112.putShort((short) ((this.f21915 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f21908 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f21913 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f21888 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f21895 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f21877 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f21910 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f21892 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.f21886 + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.f21869 + 0.5f));
                                byteBufferOrder1112.putShort((short) this.f21883);
                                byteBufferOrder1112.putShort((short) this.f21906);
                            }
                            C10207 c10201118 = new C10207();
                            c10201118.m26332(this.f21870);
                            c10201118.m26334(this.f21878);
                            c10201118.m26335(this.f21889);
                            c10201118.m26331(bArr);
                            c10201118.m26333(this.f21912);
                            c10201118.m26330(this.f21912);
                            c1259M26329 = c10201118.m26329();
                        }
                        if (this.f21872 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f21890 == 0) {
                            if (Float.compare(this.f21879, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f21879, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f21879, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c20124.m46291(this.f21881);
                        c20124.m46333(this.f21896);
                        c20124.m46325(f);
                        c20124.m46307(iIntValue);
                        c20124.m46305(this.f21898);
                        c20124.m46313(this.f21900);
                        c20124.m46302(c1259M26329);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f21872 != null) {
                    c20124.m46330(this.f21872);
                }
                c20124.m46317(i);
                if (this.f21911) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c20124.m46327(str8);
                c20124.m46315(str11);
                c20124.m46318(i2);
                c20124.m46321(this.f21905);
                c20124.m46294(i11116);
                c20124.m46301(list);
                c20124.m46300(str);
                c20124.m46304(this.f21909);
                C15648 c15648M46291116 = c20124.m46295();
                InterfaceC22024 interfaceC22024Mo16651119 = interfaceC12789.mo16658(this.f21884, i6);
                this.f21882 = interfaceC22024Mo16651119;
                interfaceC22024Mo16651119.mo14384(c15648M46291116);
                return;
            default:
                throw C2970.m9688("Unrecognized codec identifier.", (Throwable) null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m18390(String str) throws C2970 {
        byte[] bArr = this.f21893;
        if (bArr != null) {
            return bArr;
        }
        throw C2970.m9688("Missing CodecPrivate for codec " + str, (Throwable) null);
    }
}
