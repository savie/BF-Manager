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

/* JADX INFO: renamed from: l.֫ܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8R9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1908 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte[] f7199;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f7201;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public byte[] f7215;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f7216;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f7219;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f7220;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f7223;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f7230;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f7231;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public byte[] f7232;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f7234;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C19300 f7239;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C8354 f7240;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f7242;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f7243;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f7246;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C18594 f7248;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f7250;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f7221 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f7233 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f7228 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f7238 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7244 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f7236 = 0;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f7213 = -1;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public float f7206 = 0.0f;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public float f7200 = 0.0f;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public float f7227 = 0.0f;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f7247 = null;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f7237 = -1;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f7214 = false;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f7205 = -1;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f7212 = -1;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f7226 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f7225 = 1000;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f7235 = 200;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public float f7203 = -1.0f;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public float f7210 = -1.0f;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public float f7229 = -1.0f;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public float f7224 = -1.0f;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f7204 = -1.0f;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f7208 = -1.0f;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public float f7241 = -1.0f;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public float f7218 = -1.0f;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f7211 = -1.0f;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f7222 = -1.0f;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f7202 = 1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f7207 = -1;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f7249 = 8000;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f7209 = 0;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public long f7245 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f7217 = true;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f7198 = "eng";

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
    public final void m6214(InterfaceC15690 interfaceC15690, int i) throws C22861 {
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
        int iM41816;
        List list3;
        List list4;
        List listOf;
        List listOf2;
        int i5;
        C10471 c10471;
        int i6;
        int i7;
        int i8;
        float f;
        int iIntValue;
        int i9;
        int i10;
        int i11;
        String str8;
        C8106 c8106M21323;
        List list5;
        String str9 = this.f7246;
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
                b = cb.f77931l;
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
        C4119 c4119M32773 = null;
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
                byte[] bArr2 = this.f7199;
                str12 = "video/mp4v-es";
                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                i2 = -1;
                str = null;
                str11 = str12;
                list5 = listSingletonList;
                i3 = -1;
                list = list5;
                if (this.f7215 != null && (c8106M21323 = C8106.m21323(new C2460(this.f7215))) != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i12 = (z ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else if (C6632.m17982(str11)) {
                    if (this.f7236 == 0) {
                        i10 = this.f7238;
                        i7 = -1;
                        if (i10 == -1) {
                            i10 = this.f7221;
                        }
                        this.f7238 = i10;
                        i11 = this.f7244;
                        if (i11 == -1) {
                            i11 = this.f7233;
                        }
                        this.f7244 = i11;
                    } else {
                        i7 = -1;
                    }
                    i8 = this.f7238;
                    if (i8 != i7 || (i9 = this.f7244) == i7) {
                        f = -1.0f;
                    } else {
                        f = (this.f7233 * i8) / (this.f7221 * i9);
                    }
                    if (this.f7214) {
                        if (this.f7203 != -1.0f && this.f7210 != -1.0f && this.f7229 != -1.0f && this.f7224 != -1.0f && this.f7204 != -1.0f && this.f7208 != -1.0f && this.f7241 != -1.0f && this.f7218 != -1.0f && this.f7211 != -1.0f && this.f7222 != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.f7211 + 0.5f));
                            byteBufferOrder.putShort((short) (this.f7222 + 0.5f));
                            byteBufferOrder.putShort((short) this.f7225);
                            byteBufferOrder.putShort((short) this.f7235);
                        }
                        C13293 c13293 = new C13293();
                        c13293.m32777(this.f7205);
                        c13293.m32778(this.f7226);
                        c13293.m32772(this.f7212);
                        c13293.m32775(bArr);
                        c13293.m32776(this.f7228);
                        c13293.m32774(this.f7228);
                        c4119M32773 = c13293.m32773();
                    }
                    if (this.f7230 == null && C9671.f32512.containsKey(this.f7230)) {
                        iIntValue = ((Integer) C9671.f32512.get(this.f7230)).intValue();
                    } else {
                        iIntValue = -1;
                    }
                    if (this.f7213 == 0 && Float.compare(this.f7206, 0.0f) == 0 && Float.compare(this.f7200, 0.0f) == 0) {
                        if (Float.compare(this.f7227, 0.0f) == 0) {
                            iIntValue = 0;
                        } else if (Float.compare(this.f7227, 90.0f) == 0) {
                            iIntValue = 90;
                        } else if (Float.compare(this.f7227, -180.0f) != 0 || Float.compare(this.f7227, 180.0f) == 0) {
                            iIntValue = 180;
                        } else if (Float.compare(this.f7227, -90.0f) == 0) {
                            iIntValue = BottomAppBarTopEdgeTreatment.ANGLE_UP;
                        }
                    }
                    c10471.m26525(this.f7221);
                    c10471.m26534(this.f7233);
                    c10471.m26519(f);
                    c10471.m26514(iIntValue);
                    c10471.m26507(this.f7247);
                    c10471.m26524(this.f7237);
                    c10471.m26505(c4119M32773);
                    i6 = 2;
                } else {
                    if ("application/x-subrip".equals(str11) && !"text/x-ssa".equals(str11) && !"text/vtt".equals(str11) && !"application/vobsub".equals(str11) && !"application/pgs".equals(str11) && !"application/dvbsubs".equals(str11)) {
                        throw C22861.m50610("Unexpected MIME type.", (Throwable) null);
                    }
                    i6 = 3;
                }
                if (this.f7230 != null && !C9671.f32512.containsKey(this.f7230)) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i12);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M26497 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo7684 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo7684;
                interfaceC8011Mo7684.mo8116(c7648M26497);
                return;
            case 2:
                C2460 c2460 = new C2460(m6213(this.f7246));
                try {
                    int iM7528 = c2460.m7528();
                    if (iM7528 != 1) {
                        if (iM7528 == 65534) {
                            c2460.m7510(24);
                            if (c2460.m7529() != C9671.f32509.getMostSignificantBits() || c2460.m7529() != C9671.f32509.getLeastSignificantBits()) {
                            }
                            listSingletonList = null;
                            i2 = -1;
                            str = null;
                            str11 = str12;
                            list5 = listSingletonList;
                            i3 = -1;
                            list = list5;
                            if (this.f7215 != null) {
                                str = c8106M21323.f28384;
                                str11 = "video/dolby-vision";
                            }
                            boolean z2 = this.f7217;
                            if (this.f7220) {
                                i5 = 2;
                            } else {
                                i5 = 0;
                            }
                            int i13 = (z2 ? 1 : 0) | i5;
                            c10471 = new C10471();
                            if (C6632.m17975(str11)) {
                                c10471.m26494(this.f7202);
                                c10471.m26511(this.f7249);
                                c10471.m26512(i3);
                                i6 = 1;
                            } else {
                                if (C6632.m17982(str11)) {
                                    if (this.f7236 == 0) {
                                        i10 = this.f7238;
                                        i7 = -1;
                                        if (i10 == -1) {
                                            i10 = this.f7221;
                                        }
                                        this.f7238 = i10;
                                        i11 = this.f7244;
                                        if (i11 == -1) {
                                            i11 = this.f7233;
                                        }
                                        this.f7244 = i11;
                                    } else {
                                        i7 = -1;
                                    }
                                    i8 = this.f7238;
                                    if (i8 != i7) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (this.f7214) {
                                        if (this.f7203 != -1.0f) {
                                            bArr = new byte[25];
                                            ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                            byteBufferOrder2.put((byte) 0);
                                            byteBufferOrder2.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) (this.f7211 + 0.5f));
                                            byteBufferOrder2.putShort((short) (this.f7222 + 0.5f));
                                            byteBufferOrder2.putShort((short) this.f7225);
                                            byteBufferOrder2.putShort((short) this.f7235);
                                        }
                                        C13293 c13294 = new C13293();
                                        c13294.m32777(this.f7205);
                                        c13294.m32778(this.f7226);
                                        c13294.m32772(this.f7212);
                                        c13294.m32775(bArr);
                                        c13294.m32776(this.f7228);
                                        c13294.m32774(this.f7228);
                                        c4119M32773 = c13294.m32773();
                                    }
                                    if (this.f7230 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (this.f7213 == 0) {
                                        if (Float.compare(this.f7227, 0.0f) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    c10471.m26525(this.f7221);
                                    c10471.m26534(this.f7233);
                                    c10471.m26519(f);
                                    c10471.m26514(iIntValue);
                                    c10471.m26507(this.f7247);
                                    c10471.m26524(this.f7237);
                                    c10471.m26505(c4119M32773);
                                    i6 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str11)) {
                                    }
                                    i6 = 3;
                                }
                                break;
                            }
                            if (this.f7230 != null) {
                                c10471.m26495(this.f7230);
                            }
                            c10471.m26523(i);
                            if (this.f7242) {
                                str8 = "video/webm";
                            } else {
                                str8 = "video/x-matroska";
                            }
                            c10471.m26521(str8);
                            c10471.m26533(str11);
                            c10471.m26531(i2);
                            c10471.m26509(this.f7198);
                            c10471.m26530(i13);
                            c10471.m26503(list);
                            c10471.m26502(str);
                            c10471.m26506(this.f7240);
                            C7648 c7648M26498 = c10471.m26497();
                            InterfaceC8011 interfaceC8011Mo7685 = interfaceC15690.mo7684(this.f7201, i6);
                            this.f7219 = interfaceC8011Mo7685;
                            interfaceC8011Mo7685.mo8116(c7648M26498);
                            return;
                        }
                        C0303.m1848("Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        i2 = -1;
                        str = null;
                        str11 = str12;
                        list5 = listSingletonList;
                        i3 = -1;
                        list = list5;
                        if (this.f7215 != null) {
                            str = c8106M21323.f28384;
                            str11 = "video/dolby-vision";
                        }
                        boolean z3 = this.f7217;
                        if (this.f7220) {
                            i5 = 2;
                        } else {
                            i5 = 0;
                        }
                        int i14 = (z3 ? 1 : 0) | i5;
                        c10471 = new C10471();
                        if (C6632.m17975(str11)) {
                            c10471.m26494(this.f7202);
                            c10471.m26511(this.f7249);
                            c10471.m26512(i3);
                            i6 = 1;
                        } else {
                            if (C6632.m17982(str11)) {
                                if (this.f7236 == 0) {
                                    i10 = this.f7238;
                                    i7 = -1;
                                    if (i10 == -1) {
                                        i10 = this.f7221;
                                    }
                                    this.f7238 = i10;
                                    i11 = this.f7244;
                                    if (i11 == -1) {
                                        i11 = this.f7233;
                                    }
                                    this.f7244 = i11;
                                } else {
                                    i7 = -1;
                                }
                                i8 = this.f7238;
                                if (i8 != i7) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.f7214) {
                                    if (this.f7203 != -1.0f) {
                                        bArr = new byte[25];
                                        ByteBuffer byteBufferOrder3 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                        byteBufferOrder3.put((byte) 0);
                                        byteBufferOrder3.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) (this.f7211 + 0.5f));
                                        byteBufferOrder3.putShort((short) (this.f7222 + 0.5f));
                                        byteBufferOrder3.putShort((short) this.f7225);
                                        byteBufferOrder3.putShort((short) this.f7235);
                                    }
                                    C13293 c13295 = new C13293();
                                    c13295.m32777(this.f7205);
                                    c13295.m32778(this.f7226);
                                    c13295.m32772(this.f7212);
                                    c13295.m32775(bArr);
                                    c13295.m32776(this.f7228);
                                    c13295.m32774(this.f7228);
                                    c4119M32773 = c13295.m32773();
                                }
                                if (this.f7230 == null) {
                                    iIntValue = -1;
                                } else {
                                    iIntValue = -1;
                                }
                                if (this.f7213 == 0) {
                                    if (Float.compare(this.f7227, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                c10471.m26525(this.f7221);
                                c10471.m26534(this.f7233);
                                c10471.m26519(f);
                                c10471.m26514(iIntValue);
                                c10471.m26507(this.f7247);
                                c10471.m26524(this.f7237);
                                c10471.m26505(c4119M32773);
                                i6 = 2;
                            } else {
                                if ("application/x-subrip".equals(str11)) {
                                }
                                i6 = 3;
                            }
                            break;
                        }
                        if (this.f7230 != null) {
                            c10471.m26495(this.f7230);
                        }
                        c10471.m26523(i);
                        if (this.f7242) {
                            str8 = "video/webm";
                        } else {
                            str8 = "video/x-matroska";
                        }
                        c10471.m26521(str8);
                        c10471.m26533(str11);
                        c10471.m26531(i2);
                        c10471.m26509(this.f7198);
                        c10471.m26530(i14);
                        c10471.m26503(list);
                        c10471.m26502(str);
                        c10471.m26506(this.f7240);
                        C7648 c7648M26499 = c10471.m26497();
                        InterfaceC8011 interfaceC8011Mo7686 = interfaceC15690.mo7684(this.f7201, i6);
                        this.f7219 = interfaceC8011Mo7686;
                        interfaceC8011Mo7686.mo8116(c7648M26499);
                        return;
                    }
                    int i15 = this.f7207;
                    String str13 = C17983.f57504;
                    int iM41817 = C17983.m41816(i15, ByteOrder.LITTLE_ENDIAN);
                    if (iM41817 == 0) {
                        C0303.m1848("Unsupported PCM bit depth: " + this.f7207 + ". Setting mimeType to audio/x-unknown");
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
                        i3 = iM41817;
                        i2 = -1;
                    }
                    if (this.f7215 != null) {
                        str = c8106M21323.f28384;
                        str11 = "video/dolby-vision";
                    }
                    boolean z4 = this.f7217;
                    if (this.f7220) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    int i16 = (z4 ? 1 : 0) | i5;
                    c10471 = new C10471();
                    if (C6632.m17975(str11)) {
                        c10471.m26494(this.f7202);
                        c10471.m26511(this.f7249);
                        c10471.m26512(i3);
                        i6 = 1;
                    } else {
                        if (C6632.m17982(str11)) {
                            if (this.f7236 == 0) {
                                i10 = this.f7238;
                                i7 = -1;
                                if (i10 == -1) {
                                    i10 = this.f7221;
                                }
                                this.f7238 = i10;
                                i11 = this.f7244;
                                if (i11 == -1) {
                                    i11 = this.f7233;
                                }
                                this.f7244 = i11;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.f7238;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f7214) {
                                if (this.f7203 != -1.0f) {
                                    bArr = new byte[25];
                                    ByteBuffer byteBufferOrder4 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder4.put((byte) 0);
                                    byteBufferOrder4.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) (this.f7211 + 0.5f));
                                    byteBufferOrder4.putShort((short) (this.f7222 + 0.5f));
                                    byteBufferOrder4.putShort((short) this.f7225);
                                    byteBufferOrder4.putShort((short) this.f7235);
                                }
                                C13293 c13296 = new C13293();
                                c13296.m32777(this.f7205);
                                c13296.m32778(this.f7226);
                                c13296.m32772(this.f7212);
                                c13296.m32775(bArr);
                                c13296.m32776(this.f7228);
                                c13296.m32774(this.f7228);
                                c4119M32773 = c13296.m32773();
                            }
                            if (this.f7230 == null) {
                                iIntValue = -1;
                            } else {
                                iIntValue = -1;
                            }
                            if (this.f7213 == 0) {
                                if (Float.compare(this.f7227, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            c10471.m26525(this.f7221);
                            c10471.m26534(this.f7233);
                            c10471.m26519(f);
                            c10471.m26514(iIntValue);
                            c10471.m26507(this.f7247);
                            c10471.m26524(this.f7237);
                            c10471.m26505(c4119M32773);
                            i6 = 2;
                        } else {
                            if ("application/x-subrip".equals(str11)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.f7230 != null) {
                        c10471.m26495(this.f7230);
                    }
                    c10471.m26523(i);
                    if (this.f7242) {
                        str8 = "video/webm";
                    } else {
                        str8 = "video/x-matroska";
                    }
                    c10471.m26521(str8);
                    c10471.m26533(str11);
                    c10471.m26531(i2);
                    c10471.m26509(this.f7198);
                    c10471.m26530(i16);
                    c10471.m26503(list);
                    c10471.m26502(str);
                    c10471.m26506(this.f7240);
                    C7648 c7648M264910 = c10471.m26497();
                    InterfaceC8011 interfaceC8011Mo7687 = interfaceC15690.mo7684(this.f7201, i6);
                    this.f7219 = interfaceC8011Mo7687;
                    interfaceC8011Mo7687.mo8116(c7648M264910);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C22861.m50610("Error parsing MS/ACM codec private", (Throwable) null);
                }
            case 3:
                this.f7239 = new C19300();
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z5 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i17 = (z5 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder5 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder5.put((byte) 0);
                                byteBufferOrder5.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder5.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder5.putShort((short) this.f7225);
                                byteBufferOrder5.putShort((short) this.f7235);
                            }
                            C13293 c13297 = new C13293();
                            c13297.m32777(this.f7205);
                            c13297.m32778(this.f7226);
                            c13297.m32772(this.f7212);
                            c13297.m32775(bArr);
                            c13297.m32776(this.f7228);
                            c13297.m32774(this.f7228);
                            c4119M32773 = c13297.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i17);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M264911 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo7688 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo7688;
                interfaceC8011Mo7688.mo8116(c7648M264911);
                return;
            case 4:
                byte[] bArrM6213 = m6213(this.f7246);
                try {
                    if (bArrM6213[0] != 2) {
                        throw C22861.m50610("Error parsing vorbis codec private", (Throwable) null);
                    }
                    int i18 = 1;
                    int i19 = 0;
                    while (true) {
                        int i20 = bArrM6213[i18] & 255;
                        if (i20 == 255) {
                            i19 += 255;
                            i18++;
                        } else {
                            int i21 = i18 + 1;
                            int i22 = i19 + i20;
                            int i23 = 0;
                            while (true) {
                                int i24 = bArrM6213[i21] & 255;
                                if (i24 != 255) {
                                    int i25 = i21 + 1;
                                    int i26 = i23 + i24;
                                    if (bArrM6213[i25] != 1) {
                                        throw C22861.m50610("Error parsing vorbis codec private", (Throwable) null);
                                    }
                                    byte[] bArr3 = new byte[i22];
                                    System.arraycopy(bArrM6213, i25, bArr3, 0, i22);
                                    int i27 = i25 + i22;
                                    if (bArrM6213[i27] != 3) {
                                        throw C22861.m50610("Error parsing vorbis codec private", (Throwable) null);
                                    }
                                    int i28 = i27 + i26;
                                    if (bArrM6213[i28] != 5) {
                                        throw C22861.m50610("Error parsing vorbis codec private", (Throwable) null);
                                    }
                                    byte[] bArr4 = new byte[bArrM6213.length - i28];
                                    System.arraycopy(bArrM6213, i28, bArr4, 0, bArrM6213.length - i28);
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
                                    if (this.f7215 != null) {
                                        str = c8106M21323.f28384;
                                        str11 = "video/dolby-vision";
                                    }
                                    boolean z6 = this.f7217;
                                    if (this.f7220) {
                                        i5 = 2;
                                    } else {
                                        i5 = 0;
                                    }
                                    int i110 = (z6 ? 1 : 0) | i5;
                                    c10471 = new C10471();
                                    if (C6632.m17975(str11)) {
                                        c10471.m26494(this.f7202);
                                        c10471.m26511(this.f7249);
                                        c10471.m26512(i3);
                                        i6 = 1;
                                    } else {
                                        if (C6632.m17982(str11)) {
                                            if (this.f7236 == 0) {
                                                i10 = this.f7238;
                                                i7 = -1;
                                                if (i10 == -1) {
                                                    i10 = this.f7221;
                                                }
                                                this.f7238 = i10;
                                                i11 = this.f7244;
                                                if (i11 == -1) {
                                                    i11 = this.f7233;
                                                }
                                                this.f7244 = i11;
                                            } else {
                                                i7 = -1;
                                            }
                                            i8 = this.f7238;
                                            if (i8 != i7) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (this.f7214) {
                                                if (this.f7203 != -1.0f) {
                                                    bArr = new byte[25];
                                                    ByteBuffer byteBufferOrder6 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                                    byteBufferOrder6.put((byte) 0);
                                                    byteBufferOrder6.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) (this.f7211 + 0.5f));
                                                    byteBufferOrder6.putShort((short) (this.f7222 + 0.5f));
                                                    byteBufferOrder6.putShort((short) this.f7225);
                                                    byteBufferOrder6.putShort((short) this.f7235);
                                                }
                                                C13293 c13298 = new C13293();
                                                c13298.m32777(this.f7205);
                                                c13298.m32778(this.f7226);
                                                c13298.m32772(this.f7212);
                                                c13298.m32775(bArr);
                                                c13298.m32776(this.f7228);
                                                c13298.m32774(this.f7228);
                                                c4119M32773 = c13298.m32773();
                                            }
                                            if (this.f7230 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (this.f7213 == 0) {
                                                if (Float.compare(this.f7227, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            c10471.m26525(this.f7221);
                                            c10471.m26534(this.f7233);
                                            c10471.m26519(f);
                                            c10471.m26514(iIntValue);
                                            c10471.m26507(this.f7247);
                                            c10471.m26524(this.f7237);
                                            c10471.m26505(c4119M32773);
                                            i6 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                            }
                                            i6 = 3;
                                        }
                                        break;
                                    }
                                    if (this.f7230 != null) {
                                        c10471.m26495(this.f7230);
                                    }
                                    c10471.m26523(i);
                                    if (this.f7242) {
                                        str8 = "video/webm";
                                    } else {
                                        str8 = "video/x-matroska";
                                    }
                                    c10471.m26521(str8);
                                    c10471.m26533(str11);
                                    c10471.m26531(i2);
                                    c10471.m26509(this.f7198);
                                    c10471.m26530(i110);
                                    c10471.m26503(list);
                                    c10471.m26502(str);
                                    c10471.m26506(this.f7240);
                                    C7648 c7648M264912 = c10471.m26497();
                                    InterfaceC8011 interfaceC8011Mo7689 = interfaceC15690.mo7684(this.f7201, i6);
                                    this.f7219 = interfaceC8011Mo7689;
                                    interfaceC8011Mo7689.mo8116(c7648M264912);
                                    return;
                                }
                                i23 += 255;
                                i21++;
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    throw C22861.m50610("Error parsing vorbis codec private", (Throwable) null);
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z7 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i111 = (z7 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder7 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder7.put((byte) 0);
                                byteBufferOrder7.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder7.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder7.putShort((short) this.f7225);
                                byteBufferOrder7.putShort((short) this.f7235);
                            }
                            C13293 c13299 = new C13293();
                            c13299.m32777(this.f7205);
                            c13299.m32778(this.f7226);
                            c13299.m32772(this.f7212);
                            c13299.m32775(bArr);
                            c13299.m32776(this.f7228);
                            c13299.m32774(this.f7228);
                            c4119M32773 = c13299.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i111);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M264913 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo76810 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo76810;
                interfaceC8011Mo76810.mo8116(c7648M264913);
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z8 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i112 = (z8 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder8 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder8.put((byte) 0);
                                byteBufferOrder8.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder8.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder8.putShort((short) this.f7225);
                                byteBufferOrder8.putShort((short) this.f7235);
                            }
                            C13293 c132910 = new C13293();
                            c132910.m32777(this.f7205);
                            c132910.m32778(this.f7226);
                            c132910.m32772(this.f7212);
                            c132910.m32775(bArr);
                            c132910.m32776(this.f7228);
                            c132910.m32774(this.f7228);
                            c4119M32773 = c132910.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i112);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M264914 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo76811 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo76811;
                interfaceC8011Mo76811.mo8116(c7648M264914);
                return;
            case 7:
                C2460 c2461 = new C2460(m6213(this.f7246));
                try {
                    c2461.m7535(16);
                    long jM7524 = c2461.m7524();
                    if (jM7524 == 1482049860) {
                        pair = new Pair("video/divx", null);
                    } else if (jM7524 == 859189832) {
                        pair = new Pair("video/3gpp", null);
                    } else if (jM7524 == 826496599) {
                        int iM7500 = c2461.m7500() + 20;
                        byte[] bArrM7518 = c2461.m7518();
                        while (true) {
                            if (iM7500 < bArrM7518.length - 4) {
                                if (bArrM7518[iM7500] == 0 && bArrM7518[iM7500 + 1] == 0 && bArrM7518[iM7500 + 2] == 1 && bArrM7518[iM7500 + 3] == 15) {
                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrM7518, iM7500, bArrM7518.length)));
                                } else {
                                    iM7500++;
                                }
                            } else {
                                throw C22861.m50610("Failed to find FourCC VC1 initialization data", (Throwable) null);
                            }
                        }
                    } else {
                        C0303.m1848("Unknown FourCC. Setting mimeType to video/x-unknown");
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
                    if (this.f7215 != null) {
                        str = c8106M21323.f28384;
                        str11 = "video/dolby-vision";
                    }
                    boolean z9 = this.f7217;
                    if (this.f7220) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    int i113 = (z9 ? 1 : 0) | i5;
                    c10471 = new C10471();
                    if (C6632.m17975(str11)) {
                        c10471.m26494(this.f7202);
                        c10471.m26511(this.f7249);
                        c10471.m26512(i3);
                        i6 = 1;
                    } else {
                        if (C6632.m17982(str11)) {
                            if (this.f7236 == 0) {
                                i10 = this.f7238;
                                i7 = -1;
                                if (i10 == -1) {
                                    i10 = this.f7221;
                                }
                                this.f7238 = i10;
                                i11 = this.f7244;
                                if (i11 == -1) {
                                    i11 = this.f7233;
                                }
                                this.f7244 = i11;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.f7238;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f7214) {
                                if (this.f7203 != -1.0f) {
                                    bArr = new byte[25];
                                    ByteBuffer byteBufferOrder9 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder9.put((byte) 0);
                                    byteBufferOrder9.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) (this.f7211 + 0.5f));
                                    byteBufferOrder9.putShort((short) (this.f7222 + 0.5f));
                                    byteBufferOrder9.putShort((short) this.f7225);
                                    byteBufferOrder9.putShort((short) this.f7235);
                                }
                                C13293 c132911 = new C13293();
                                c132911.m32777(this.f7205);
                                c132911.m32778(this.f7226);
                                c132911.m32772(this.f7212);
                                c132911.m32775(bArr);
                                c132911.m32776(this.f7228);
                                c132911.m32774(this.f7228);
                                c4119M32773 = c132911.m32773();
                            }
                            if (this.f7230 == null) {
                                iIntValue = -1;
                            } else {
                                iIntValue = -1;
                            }
                            if (this.f7213 == 0) {
                                if (Float.compare(this.f7227, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            c10471.m26525(this.f7221);
                            c10471.m26534(this.f7233);
                            c10471.m26519(f);
                            c10471.m26514(iIntValue);
                            c10471.m26507(this.f7247);
                            c10471.m26524(this.f7237);
                            c10471.m26505(c4119M32773);
                            i6 = 2;
                        } else {
                            if ("application/x-subrip".equals(str11)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.f7230 != null) {
                        c10471.m26495(this.f7230);
                    }
                    c10471.m26523(i);
                    if (this.f7242) {
                        str8 = "video/webm";
                    } else {
                        str8 = "video/x-matroska";
                    }
                    c10471.m26521(str8);
                    c10471.m26533(str11);
                    c10471.m26531(i2);
                    c10471.m26509(this.f7198);
                    c10471.m26530(i113);
                    c10471.m26503(list);
                    c10471.m26502(str);
                    c10471.m26506(this.f7240);
                    C7648 c7648M264915 = c10471.m26497();
                    InterfaceC8011 interfaceC8011Mo76812 = interfaceC15690.mo7684(this.f7201, i6);
                    this.f7219 = interfaceC8011Mo76812;
                    interfaceC8011Mo76812.mo8116(c7648M264915);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused3) {
                    throw C22861.m50610("Error parsing FourCC private data", (Throwable) null);
                }
            case 8:
                byte[] bArr5 = new byte[4];
                System.arraycopy(m6213(this.f7246), 0, bArr5, 0, 4);
                str12 = "application/dvbsubs";
                listOf = AbstractC22433.of((Object) bArr5);
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z10 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i114 = (z10 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder10 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder10.put((byte) 0);
                                byteBufferOrder10.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder10.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder10.putShort((short) this.f7225);
                                byteBufferOrder10.putShort((short) this.f7235);
                            }
                            C13293 c132912 = new C13293();
                            c132912.m32777(this.f7205);
                            c132912.m32778(this.f7226);
                            c132912.m32772(this.f7212);
                            c132912.m32775(bArr);
                            c132912.m32776(this.f7228);
                            c132912.m32774(this.f7228);
                            c4119M32773 = c132912.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i114);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M264916 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo76813 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo76813;
                interfaceC8011Mo76813.mo8116(c7648M264916);
                return;
            case 10:
                C3257 c3257M9737 = C3257.m9737(new C2460(m6213(this.f7246)));
                ArrayList arrayList2 = c3257M9737.f12107;
                this.f7250 = c3257M9737.f12105;
                str5 = c3257M9737.f12106;
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z11 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i115 = (z11 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder11 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder11.put((byte) 0);
                                byteBufferOrder11.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder11.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder11.putShort((short) this.f7225);
                                byteBufferOrder11.putShort((short) this.f7235);
                            }
                            C13293 c132913 = new C13293();
                            c132913.m32777(this.f7205);
                            c132913.m32778(this.f7226);
                            c132913.m32772(this.f7212);
                            c132913.m32775(bArr);
                            c132913.m32776(this.f7228);
                            c132913.m32774(this.f7228);
                            c4119M32773 = c132913.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i115);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M264917 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo76814 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo76814;
                interfaceC8011Mo76814.mo8116(c7648M264917);
                return;
            case 11:
                str12 = "application/vobsub";
                listOf = AbstractC22433.of((Object) m6213(this.f7246));
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z12 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i116 = (z12 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder12 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder12.put((byte) 0);
                                byteBufferOrder12.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder12.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder12.putShort((short) this.f7225);
                                byteBufferOrder12.putShort((short) this.f7235);
                            }
                            C13293 c132914 = new C13293();
                            c132914.m32777(this.f7205);
                            c132914.m32778(this.f7226);
                            c132914.m32772(this.f7212);
                            c132914.m32775(bArr);
                            c132914.m32776(this.f7228);
                            c132914.m32774(this.f7228);
                            c4119M32773 = c132914.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i116);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M264918 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo76815 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo76815;
                interfaceC8011Mo76815.mo8116(c7648M264918);
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z13 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i117 = (z13 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder13 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder13.put((byte) 0);
                                byteBufferOrder13.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder13.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder13.putShort((short) this.f7225);
                                byteBufferOrder13.putShort((short) this.f7235);
                            }
                            C13293 c132915 = new C13293();
                            c132915.m32777(this.f7205);
                            c132915.m32778(this.f7226);
                            c132915.m32772(this.f7212);
                            c132915.m32775(bArr);
                            c132915.m32776(this.f7228);
                            c132915.m32774(this.f7228);
                            c4119M32773 = c132915.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i117);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M264919 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo76816 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo76816;
                interfaceC8011Mo76816.mo8116(c7648M264919);
                return;
            case 13:
                List listSingletonList2 = Collections.singletonList(m6213(this.f7246));
                byte[] bArr6 = this.f7199;
                C17369 c17369M16484 = C6080.m16484(new C11634(bArr6, bArr6.length), false);
                this.f7249 = c17369M16484.f55267;
                this.f7202 = c17369M16484.f55266;
                str7 = c17369M16484.f55268;
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z14 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i118 = (z14 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder14 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder14.put((byte) 0);
                                byteBufferOrder14.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder14.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder14.putShort((short) this.f7225);
                                byteBufferOrder14.putShort((short) this.f7235);
                            }
                            C13293 c132916 = new C13293();
                            c132916.m32777(this.f7205);
                            c132916.m32778(this.f7226);
                            c132916.m32772(this.f7212);
                            c132916.m32775(bArr);
                            c132916.m32776(this.f7228);
                            c132916.m32774(this.f7228);
                            c4119M32773 = c132916.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i118);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M2649110 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo76817 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo76817;
                interfaceC8011Mo76817.mo8116(c7648M2649110);
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z15 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i119 = (z15 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder15 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder15.put((byte) 0);
                                byteBufferOrder15.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder15.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder15.putShort((short) this.f7225);
                                byteBufferOrder15.putShort((short) this.f7235);
                            }
                            C13293 c132917 = new C13293();
                            c132917.m32777(this.f7205);
                            c132917.m32778(this.f7226);
                            c132917.m32772(this.f7212);
                            c132917.m32775(bArr);
                            c132917.m32776(this.f7228);
                            c132917.m32774(this.f7228);
                            c4119M32773 = c132917.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i119);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M2649111 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo76818 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo76818;
                interfaceC8011Mo76818.mo8116(c7648M2649111);
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z16 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1110 = (z16 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder16 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder16.put((byte) 0);
                                byteBufferOrder16.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder16.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder16.putShort((short) this.f7225);
                                byteBufferOrder16.putShort((short) this.f7235);
                            }
                            C13293 c132918 = new C13293();
                            c132918.m32777(this.f7205);
                            c132918.m32778(this.f7226);
                            c132918.m32772(this.f7212);
                            c132918.m32775(bArr);
                            c132918.m32776(this.f7228);
                            c132918.m32774(this.f7228);
                            c4119M32773 = c132918.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i1110);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M2649112 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo76819 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo76819;
                interfaceC8011Mo76819.mo8116(c7648M2649112);
                return;
            case 16:
                byte[] bArr7 = this.f7199;
                str4 = "video/av01";
                listOf2 = bArr7 == null ? null : AbstractC22433.of((Object) bArr7);
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z17 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1111 = (z17 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder17 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder17.put((byte) 0);
                                byteBufferOrder17.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder17.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder17.putShort((short) this.f7225);
                                byteBufferOrder17.putShort((short) this.f7235);
                            }
                            C13293 c132919 = new C13293();
                            c132919.m32777(this.f7205);
                            c132919.m32778(this.f7226);
                            c132919.m32772(this.f7212);
                            c132919.m32775(bArr);
                            c132919.m32776(this.f7228);
                            c132919.m32774(this.f7228);
                            c4119M32773 = c132919.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i1111);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M2649113 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo768110 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo768110;
                interfaceC8011Mo768110.mo8116(c7648M2649113);
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z18 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1112 = (z18 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder18 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder18.put((byte) 0);
                                byteBufferOrder18.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder18.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder18.putShort((short) this.f7225);
                                byteBufferOrder18.putShort((short) this.f7235);
                            }
                            C13293 c1329110 = new C13293();
                            c1329110.m32777(this.f7205);
                            c1329110.m32778(this.f7226);
                            c1329110.m32772(this.f7212);
                            c1329110.m32775(bArr);
                            c1329110.m32776(this.f7228);
                            c1329110.m32774(this.f7228);
                            c4119M32773 = c1329110.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i1112);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M2649114 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo768111 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo768111;
                interfaceC8011Mo768111.mo8116(c7648M2649114);
                return;
            case 18:
                byte[] bArr8 = this.f7199;
                str4 = "video/x-vnd.on2.vp9";
                listOf2 = bArr8 == null ? null : AbstractC22433.of((Object) bArr8);
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z19 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1113 = (z19 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder19 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder19.put((byte) 0);
                                byteBufferOrder19.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder19.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder19.putShort((short) this.f7225);
                                byteBufferOrder19.putShort((short) this.f7235);
                            }
                            C13293 c1329111 = new C13293();
                            c1329111.m32777(this.f7205);
                            c1329111.m32778(this.f7226);
                            c1329111.m32772(this.f7212);
                            c1329111.m32775(bArr);
                            c1329111.m32776(this.f7228);
                            c1329111.m32774(this.f7228);
                            c4119M32773 = c1329111.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i1113);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M2649115 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo768112 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo768112;
                interfaceC8011Mo768112.mo8116(c7648M2649115);
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z110 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1114 = (z110 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder110.put((byte) 0);
                                byteBufferOrder110.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder110.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder110.putShort((short) this.f7225);
                                byteBufferOrder110.putShort((short) this.f7235);
                            }
                            C13293 c1329112 = new C13293();
                            c1329112.m32777(this.f7205);
                            c1329112.m32778(this.f7226);
                            c1329112.m32772(this.f7212);
                            c1329112.m32775(bArr);
                            c1329112.m32776(this.f7228);
                            c1329112.m32774(this.f7228);
                            c4119M32773 = c1329112.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i1114);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M2649116 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo768113 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo768113;
                interfaceC8011Mo768113.mo8116(c7648M2649116);
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z111 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1115 = (z111 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder111.put((byte) 0);
                                byteBufferOrder111.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder111.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder111.putShort((short) this.f7225);
                                byteBufferOrder111.putShort((short) this.f7235);
                            }
                            C13293 c1329113 = new C13293();
                            c1329113.m32777(this.f7205);
                            c1329113.m32778(this.f7226);
                            c1329113.m32772(this.f7212);
                            c1329113.m32775(bArr);
                            c1329113.m32776(this.f7228);
                            c1329113.m32774(this.f7228);
                            c4119M32773 = c1329113.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i1115);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M2649117 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo768114 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo768114;
                interfaceC8011Mo768114.mo8116(c7648M2649117);
                return;
            case 22:
                if (this.f7207 == 32) {
                    list = null;
                    str = null;
                    i2 = -1;
                    i3 = 4;
                } else {
                    C0303.m1848("Unsupported floating point PCM bit depth: " + this.f7207 + ". Setting mimeType to audio/x-unknown");
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z112 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1116 = (z112 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder112.put((byte) 0);
                                byteBufferOrder112.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder112.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder112.putShort((short) this.f7225);
                                byteBufferOrder112.putShort((short) this.f7235);
                            }
                            C13293 c1329114 = new C13293();
                            c1329114.m32777(this.f7205);
                            c1329114.m32778(this.f7226);
                            c1329114.m32772(this.f7212);
                            c1329114.m32775(bArr);
                            c1329114.m32776(this.f7228);
                            c1329114.m32774(this.f7228);
                            c4119M32773 = c1329114.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i1116);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M2649118 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo768115 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo768115;
                interfaceC8011Mo768115.mo8116(c7648M2649118);
                return;
            case 23:
                int i29 = this.f7207;
                if (i29 == 8) {
                    list = null;
                    str = null;
                    i2 = -1;
                    i3 = 3;
                } else {
                    if (i29 == 16) {
                        iM41816 = 268435456;
                    } else if (i29 == 24) {
                        iM41816 = 1342177280;
                    } else if (i29 == 32) {
                        iM41816 = 1610612736;
                    } else {
                        C0303.m1848("Unsupported big endian PCM bit depth: " + this.f7207 + ". Setting mimeType to audio/x-unknown");
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
                    i3 = iM41816;
                    list = null;
                    str = null;
                }
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z113 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1117 = (z113 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder113 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder113.put((byte) 0);
                                byteBufferOrder113.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder113.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder113.putShort((short) this.f7225);
                                byteBufferOrder113.putShort((short) this.f7235);
                            }
                            C13293 c1329115 = new C13293();
                            c1329115.m32777(this.f7205);
                            c1329115.m32778(this.f7226);
                            c1329115.m32772(this.f7212);
                            c1329115.m32775(bArr);
                            c1329115.m32776(this.f7228);
                            c1329115.m32774(this.f7228);
                            c4119M32773 = c1329115.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i1117);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M2649119 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo768116 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo768116;
                interfaceC8011Mo768116.mo8116(c7648M2649119);
                return;
            case 24:
                int i30 = this.f7207;
                String str14 = C17983.f57504;
                iM41816 = C17983.m41816(i30, ByteOrder.LITTLE_ENDIAN);
                if (iM41816 == 0) {
                    C0303.m1848("Unsupported little endian PCM bit depth: " + this.f7207 + ". Setting mimeType to audio/x-unknown");
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
                    i3 = iM41816;
                    list = null;
                    str = null;
                }
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z114 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1118 = (z114 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder114 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder114.put((byte) 0);
                                byteBufferOrder114.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder114.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder114.putShort((short) this.f7225);
                                byteBufferOrder114.putShort((short) this.f7235);
                            }
                            C13293 c1329116 = new C13293();
                            c1329116.m32777(this.f7205);
                            c1329116.m32778(this.f7226);
                            c1329116.m32772(this.f7212);
                            c1329116.m32775(bArr);
                            c1329116.m32776(this.f7228);
                            c1329116.m32774(this.f7228);
                            c4119M32773 = c1329116.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i1118);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M26491110 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo768117 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo768117;
                interfaceC8011Mo768117.mo8116(c7648M26491110);
                return;
            case 25:
            case 26:
                str12 = "text/x-ssa";
                listOf = AbstractC22433.of((Object) C9671.f32507, (Object) m6213(this.f7246));
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z115 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1119 = (z115 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder115 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder115.put((byte) 0);
                                byteBufferOrder115.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder115.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder115.putShort((short) this.f7225);
                                byteBufferOrder115.putShort((short) this.f7235);
                            }
                            C13293 c1329117 = new C13293();
                            c1329117.m32777(this.f7205);
                            c1329117.m32778(this.f7226);
                            c1329117.m32772(this.f7212);
                            c1329117.m32775(bArr);
                            c1329117.m32776(this.f7228);
                            c1329117.m32774(this.f7228);
                            c4119M32773 = c1329117.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i1119);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M26491111 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo768118 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo768118;
                interfaceC8011Mo768118.mo8116(c7648M26491111);
                return;
            case 27:
                C13656 c13656M33348 = C13656.m33348(new C2460(m6213(this.f7246)));
                List list7 = c13656M33348.f45028;
                this.f7250 = c13656M33348.f45042;
                str5 = c13656M33348.f45035;
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z116 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11110 = (z116 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder116 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder116.put((byte) 0);
                                byteBufferOrder116.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder116.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder116.putShort((short) this.f7225);
                                byteBufferOrder116.putShort((short) this.f7235);
                            }
                            C13293 c1329118 = new C13293();
                            c1329118.m32777(this.f7205);
                            c1329118.m32778(this.f7226);
                            c1329118.m32772(this.f7212);
                            c1329118.m32775(bArr);
                            c1329118.m32776(this.f7228);
                            c1329118.m32774(this.f7228);
                            c4119M32773 = c1329118.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i11110);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M26491112 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo768119 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo768119;
                interfaceC8011Mo768119.mo8116(c7648M26491112);
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z117 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11111 = (z117 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder117 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder117.put((byte) 0);
                                byteBufferOrder117.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder117.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder117.putShort((short) this.f7225);
                                byteBufferOrder117.putShort((short) this.f7235);
                            }
                            C13293 c1329119 = new C13293();
                            c1329119.m32777(this.f7205);
                            c1329119.m32778(this.f7226);
                            c1329119.m32772(this.f7212);
                            c1329119.m32775(bArr);
                            c1329119.m32776(this.f7228);
                            c1329119.m32774(this.f7228);
                            c4119M32773 = c1329119.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i11111);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M26491113 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo7681110 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo7681110;
                interfaceC8011Mo7681110.mo8116(c7648M26491113);
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z118 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11112 = (z118 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder118 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder118.put((byte) 0);
                                byteBufferOrder118.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder118.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder118.putShort((short) this.f7225);
                                byteBufferOrder118.putShort((short) this.f7235);
                            }
                            C13293 c13291110 = new C13293();
                            c13291110.m32777(this.f7205);
                            c13291110.m32778(this.f7226);
                            c13291110.m32772(this.f7212);
                            c13291110.m32775(bArr);
                            c13291110.m32776(this.f7228);
                            c13291110.m32774(this.f7228);
                            c4119M32773 = c13291110.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i11112);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M26491114 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo7681111 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo7681111;
                interfaceC8011Mo7681111.mo8116(c7648M26491114);
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z119 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11113 = (z119 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder119 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder119.put((byte) 0);
                                byteBufferOrder119.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder119.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder119.putShort((short) this.f7225);
                                byteBufferOrder119.putShort((short) this.f7235);
                            }
                            C13293 c13291111 = new C13293();
                            c13291111.m32777(this.f7205);
                            c13291111.m32778(this.f7226);
                            c13291111.m32772(this.f7212);
                            c13291111.m32775(bArr);
                            c13291111.m32776(this.f7228);
                            c13291111.m32774(this.f7228);
                            c4119M32773 = c13291111.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i11113);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M26491115 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo7681112 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo7681112;
                interfaceC8011Mo7681112.mo8116(c7648M26491115);
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z1110 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11114 = (z1110 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1110.put((byte) 0);
                                byteBufferOrder1110.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder1110.putShort((short) this.f7225);
                                byteBufferOrder1110.putShort((short) this.f7235);
                            }
                            C13293 c13291112 = new C13293();
                            c13291112.m32777(this.f7205);
                            c13291112.m32778(this.f7226);
                            c13291112.m32772(this.f7212);
                            c13291112.m32775(bArr);
                            c13291112.m32776(this.f7228);
                            c13291112.m32774(this.f7228);
                            c4119M32773 = c13291112.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i11114);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M26491116 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo7681113 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo7681113;
                interfaceC8011Mo7681113.mo8116(c7648M26491116);
                return;
            case 32:
                str4 = "audio/flac";
                listOf2 = Collections.singletonList(m6213(this.f7246));
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
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z1111 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11115 = (z1111 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1111.put((byte) 0);
                                byteBufferOrder1111.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder1111.putShort((short) this.f7225);
                                byteBufferOrder1111.putShort((short) this.f7235);
                            }
                            C13293 c13291113 = new C13293();
                            c13291113.m32777(this.f7205);
                            c13291113.m32778(this.f7226);
                            c13291113.m32772(this.f7212);
                            c13291113.m32775(bArr);
                            c13291113.m32776(this.f7228);
                            c13291113.m32774(this.f7228);
                            c4119M32773 = c13291113.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i11115);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M26491117 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo7681114 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo7681114;
                interfaceC8011Mo7681114.mo8116(c7648M26491117);
                return;
            case 33:
                ArrayList arrayList3 = new ArrayList(3);
                arrayList3.add(m6213(this.f7246));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(this.f7209).array());
                arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f7245).array());
                str2 = "audio/opus";
                str = null;
                i4 = 5760;
                list2 = arrayList3;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f7215 != null) {
                    str = c8106M21323.f28384;
                    str11 = "video/dolby-vision";
                }
                boolean z1112 = this.f7217;
                if (this.f7220) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11116 = (z1112 ? 1 : 0) | i5;
                c10471 = new C10471();
                if (C6632.m17975(str11)) {
                    c10471.m26494(this.f7202);
                    c10471.m26511(this.f7249);
                    c10471.m26512(i3);
                    i6 = 1;
                } else {
                    if (C6632.m17982(str11)) {
                        if (this.f7236 == 0) {
                            i10 = this.f7238;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f7221;
                            }
                            this.f7238 = i10;
                            i11 = this.f7244;
                            if (i11 == -1) {
                                i11 = this.f7233;
                            }
                            this.f7244 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f7238;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f7214) {
                            if (this.f7203 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1112.put((byte) 0);
                                byteBufferOrder1112.putShort((short) ((this.f7203 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f7210 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f7229 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f7224 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f7204 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f7208 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f7241 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f7218 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.f7211 + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.f7222 + 0.5f));
                                byteBufferOrder1112.putShort((short) this.f7225);
                                byteBufferOrder1112.putShort((short) this.f7235);
                            }
                            C13293 c13291114 = new C13293();
                            c13291114.m32777(this.f7205);
                            c13291114.m32778(this.f7226);
                            c13291114.m32772(this.f7212);
                            c13291114.m32775(bArr);
                            c13291114.m32776(this.f7228);
                            c13291114.m32774(this.f7228);
                            c4119M32773 = c13291114.m32773();
                        }
                        if (this.f7230 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f7213 == 0) {
                            if (Float.compare(this.f7227, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7227, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7227, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c10471.m26525(this.f7221);
                        c10471.m26534(this.f7233);
                        c10471.m26519(f);
                        c10471.m26514(iIntValue);
                        c10471.m26507(this.f7247);
                        c10471.m26524(this.f7237);
                        c10471.m26505(c4119M32773);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f7230 != null) {
                    c10471.m26495(this.f7230);
                }
                c10471.m26523(i);
                if (this.f7242) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c10471.m26521(str8);
                c10471.m26533(str11);
                c10471.m26531(i2);
                c10471.m26509(this.f7198);
                c10471.m26530(i11116);
                c10471.m26503(list);
                c10471.m26502(str);
                c10471.m26506(this.f7240);
                C7648 c7648M26491118 = c10471.m26497();
                InterfaceC8011 interfaceC8011Mo7681115 = interfaceC15690.mo7684(this.f7201, i6);
                this.f7219 = interfaceC8011Mo7681115;
                interfaceC8011Mo7681115.mo8116(c7648M26491118);
                return;
            default:
                throw C22861.m50610("Unrecognized codec identifier.", (Throwable) null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m6213(String str) throws C22861 {
        byte[] bArr = this.f7199;
        if (bArr != null) {
            return bArr;
        }
        throw C22861.m50610("Missing CodecPrivate for codec " + str, (Throwable) null);
    }
}
