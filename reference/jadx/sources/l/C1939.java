package l;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.֫۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1939 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f6500 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final HashMap f6501 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized List m6722(String str, boolean z, boolean z2) {
        C10887 c10887 = new C10887(str, z, z2);
        HashMap map = f6501;
        List list = (List) map.get(c10887);
        if (list != null) {
            return list;
        }
        ArrayList arrayListM6721 = m6721(c10887, new C13125(z, z2, str.equals("video/mv-hevc")));
        if (z && arrayListM6721.isEmpty() && Build.VERSION.SDK_INT <= 23) {
            arrayListM6721 = m6721(c10887, new C15362());
            if (!arrayListM6721.isEmpty()) {
                C1896.m6517("MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C0251) arrayListM6721.get(0)).f1533);
            }
        }
        m6724(str, arrayListM6721);
        AbstractC1928 abstractC1928CopyOf = AbstractC1928.copyOf((Collection) arrayListM6721);
        map.put(c10887, abstractC1928CopyOf);
        return abstractC1928CopyOf;
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m6723(InterfaceC6963 interfaceC6963, C15648 c15648, boolean z, boolean z2) {
        List listMo19266;
        List listMo19267 = interfaceC6963.mo19266(c15648.f50848, z, z2);
        String strM6719 = m6719(c15648);
        if (strM6719 == null) {
            listMo19266 = AbstractC1928.of();
        } else {
            listMo19266 = interfaceC6963.mo19266(strM6719, z, z2);
        }
        C22811 c22811 = new C22811();
        c22811.m19806(listMo19267);
        c22811.m19806(listMo19266);
        return c22811.m51441();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6720(List list, final C15648 c15648) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new C4922(new InterfaceC5668() { // from class: l.۬ۜۙ
            @Override // l.InterfaceC5668
            /* JADX INFO: renamed from: ۙ */
            public final int mo16657(Object obj) {
                return ((C0251) obj).m1746(c15648) ? 1 : 0;
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m6719(C15648 c15648) {
        Pair pairM48970;
        String str = c15648.f50848;
        String str2 = c15648.f50848;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairM48970 = C21528.m48970(c15648)) != null) {
            int iIntValue = ((Integer) pairM48970.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0137 A[Catch: Exception -> 0x0187, TryCatch #4 {Exception -> 0x0187, blocks: (B:3:0x000a, B:5:0x001d, B:7:0x0027, B:77:0x0156, B:10:0x002e, B:14:0x0042, B:72:0x0131, B:74:0x0137, B:76:0x013d, B:78:0x0162, B:79:0x0185), top: B:92:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0162 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6721(C10887 c10887, InterfaceC19838 interfaceC19838) throws C22822 {
        String str;
        String str2;
        String str3;
        int i;
        boolean z;
        int i2;
        boolean zIsHardwareAccelerated;
        boolean zIsVendor;
        String str4;
        C10887 c10888 = c10887;
        boolean z2 = c10888.f34462;
        String str5 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str6 = c10888.f34460;
            boolean zMo32602 = interfaceC19838.mo32602();
            int i3 = 0;
            for (int iMo32598 = interfaceC19838.mo32598(); i3 < iMo32598; iMo32598 = i2) {
                MediaCodecInfo mediaCodecInfoMo32599 = interfaceC19838.mo32599(i3);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 29 || !mediaCodecInfoMo32599.isAlias()) {
                    String name = mediaCodecInfoMo32599.getName();
                    if (m6726(mediaCodecInfoMo32599, name, zMo32602, str6)) {
                        String strM6718 = m6718(mediaCodecInfoMo32599, name, str6);
                        if (strM6718 == null) {
                            str = str5;
                        } else {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo32599.getCapabilitiesForType(strM6718);
                                boolean zMo32601 = interfaceC19838.mo32601(str5, strM6718, capabilitiesForType);
                                boolean zMo32600 = interfaceC19838.mo32600(str5, capabilitiesForType);
                                str = str5;
                                try {
                                    boolean z3 = c10888.f34461;
                                    if (z3 || !zMo32600) {
                                        if (!z3 || zMo32601) {
                                            boolean zMo32603 = interfaceC19838.mo32601("secure-playback", strM6718, capabilitiesForType);
                                            boolean zMo32604 = interfaceC19838.mo32600("secure-playback", capabilitiesForType);
                                            if (z2 || !zMo32604) {
                                                if (!z2 || zMo32603) {
                                                    if (i4 < 29) {
                                                        zIsHardwareAccelerated = !m6725(mediaCodecInfoMo32599, str6);
                                                    } else {
                                                        zIsHardwareAccelerated = mediaCodecInfoMo32599.isHardwareAccelerated();
                                                    }
                                                    boolean z4 = zIsHardwareAccelerated;
                                                    boolean zM6725 = m6725(mediaCodecInfoMo32599, str6);
                                                    if (i4 < 29) {
                                                        String strM21453 = C7914.m21453(mediaCodecInfoMo32599.getName());
                                                        zIsVendor = (strM21453.startsWith("omx.google.") || strM21453.startsWith("c2.android.") || strM21453.startsWith("c2.google.")) ? false : true;
                                                    } else {
                                                        zIsVendor = mediaCodecInfoMo32599.isVendor();
                                                    }
                                                    if (!(zMo32602 && z2 == zMo32603) && (zMo32602 || z2)) {
                                                        str2 = strM6718;
                                                        str4 = name;
                                                        i = i3;
                                                        z = zMo32602;
                                                        i2 = iMo32598;
                                                        if (!z && zMo32603) {
                                                            StringBuilder sb = new StringBuilder();
                                                            try {
                                                                sb.append(str4);
                                                                sb.append(".secure");
                                                                str3 = str4;
                                                                try {
                                                                    arrayList.add(C0251.m1738(sb.toString(), str6, str2, capabilitiesForType, z4, zM6725, zIsVendor, true));
                                                                    break;
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    if (Build.VERSION.SDK_INT <= 23) {
                                                                    }
                                                                    C1896.m6515("Failed to query codec " + str3 + " (" + str2 + MotionUtils.EASING_TYPE_FORMAT_END);
                                                                    throw e;
                                                                }
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                str3 = str4;
                                                            }
                                                        }
                                                    } else {
                                                        str2 = strM6718;
                                                        str4 = name;
                                                        i = i3;
                                                        z = zMo32602;
                                                        i2 = iMo32598;
                                                        try {
                                                            arrayList.add(C0251.m1738(name, str6, strM6718, capabilitiesForType, z4, zM6725, zIsVendor, false));
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            str3 = str4;
                                                            if (Build.VERSION.SDK_INT <= 23 || arrayList.isEmpty()) {
                                                                C1896.m6515("Failed to query codec " + str3 + " (" + str2 + MotionUtils.EASING_TYPE_FORMAT_END);
                                                                throw e;
                                                            }
                                                            C1896.m6515("Skipping codec " + str3 + " (failed to query capabilities)");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    str2 = strM6718;
                                    str3 = name;
                                    i = i3;
                                    z = zMo32602;
                                    i2 = iMo32598;
                                    if (Build.VERSION.SDK_INT <= 23) {
                                    }
                                    C1896.m6515("Failed to query codec " + str3 + " (" + str2 + MotionUtils.EASING_TYPE_FORMAT_END);
                                    throw e;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                str = str5;
                            }
                            i3 = i + 1;
                            c10888 = c10887;
                            str5 = str;
                            zMo32602 = z;
                        }
                    }
                    i = i3;
                    z = zMo32602;
                    i2 = iMo32598;
                    i3 = i + 1;
                    c10888 = c10887;
                    str5 = str;
                    zMo32602 = z;
                }
                str = str5;
                i = i3;
                z = zMo32602;
                i2 = iMo32598;
                i3 = i + 1;
                c10888 = c10887;
                str5 = str;
                zMo32602 = z;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new C22822("Failed to query underlying media codecs", e6);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m6718(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m6726(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z && str.endsWith(".secure")) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && ManufacturerUtils.SAMSUNG.equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6724(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((C0251) arrayList.get(0)).f1533.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C0251.m1738("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C4922(new C22076()));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C0251) arrayList.get(0)).f1533)) {
            return;
        }
        arrayList.add((C0251) arrayList.remove(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m6725(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT < 29) {
            if (C9681.m25258(str)) {
                return true;
            }
            String strM21453 = C7914.m21453(mediaCodecInfo.getName());
            if (strM21453.startsWith("arc.")) {
                return false;
            }
            if (strM21453.startsWith("omx.google.") || strM21453.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((strM21453.startsWith("omx.sec.") && strM21453.contains(".sw.")) || strM21453.equals("omx.qcom.video.decoder.hevcswvdec") || strM21453.startsWith("c2.android.") || strM21453.startsWith("c2.google.")) {
                return true;
            }
            return (strM21453.startsWith("omx.") || strM21453.startsWith("c2.")) ? false : true;
        }
        return mediaCodecInfo.isSoftwareOnly();
    }
}
