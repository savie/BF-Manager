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

/* JADX INFO: renamed from: l.᩶ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes4.dex */
public final class C19894 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63785 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final HashMap f63786 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized List m45161(String str, boolean z, boolean z2) {
        C19188 c19188 = new C19188(str, z, z2);
        HashMap map = f63786;
        List list = (List) map.get(c19188);
        if (list != null) {
            return list;
        }
        ArrayList arrayListM45160 = m45160(c19188, new C20599(z, z2, str.equals("video/mv-hevc")));
        if (z && arrayListM45160.isEmpty() && Build.VERSION.SDK_INT <= 23) {
            arrayListM45160 = m45160(c19188, new C7193());
            if (!arrayListM45160.isEmpty()) {
                C0303.m1848("MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C5076) arrayListM45160.get(0)).f17691);
            }
        }
        m45163(str, arrayListM45160);
        AbstractC22433 abstractC22433CopyOf = AbstractC22433.copyOf((Collection) arrayListM45160);
        map.put(c19188, abstractC22433CopyOf);
        return abstractC22433CopyOf;
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m45162(InterfaceC21304 interfaceC21304, C7648 c7648, boolean z, boolean z2) {
        List listMo43763;
        List listMo43764 = interfaceC21304.mo43763(c7648.f25265, z, z2);
        String strM45158 = m45158(c7648);
        if (strM45158 == null) {
            listMo43763 = AbstractC22433.of();
        } else {
            listMo43763 = interfaceC21304.mo43763(strM45158, z, z2);
        }
        C4793 c4793 = new C4793();
        c4793.m52162(listMo43764);
        c4793.m52162(listMo43763);
        return c4793.m13309();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m45159(List list, final C7648 c7648) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new C18482(new InterfaceC15661() { // from class: l.ᩳۗۙ
            @Override // l.InterfaceC15661
            /* JADX INFO: renamed from: ۙ */
            public final int mo20907(Object obj) {
                return ((C5076) obj).m14152(c7648) ? 1 : 0;
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45158(C7648 c7648) {
        Pair pairM7349;
        String str = c7648.f25265;
        String str2 = c7648.f25265;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairM7349 = C2419.m7349(c7648)) != null) {
            int iIntValue = ((Integer) pairM7349.first).intValue();
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
    public static ArrayList m45160(C19188 c19188, InterfaceC10016 interfaceC10016) throws C8605 {
        String str;
        String str2;
        String str3;
        int i;
        boolean z;
        int i2;
        boolean zIsHardwareAccelerated;
        boolean zIsVendor;
        String str4;
        C19188 c19189 = c19188;
        boolean z2 = c19189.f61968;
        String str5 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str6 = c19189.f61966;
            boolean zMo19131 = interfaceC10016.mo19131();
            int i3 = 0;
            for (int iMo19127 = interfaceC10016.mo19127(); i3 < iMo19127; iMo19127 = i2) {
                MediaCodecInfo mediaCodecInfoMo19128 = interfaceC10016.mo19128(i3);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 29 || !mediaCodecInfoMo19128.isAlias()) {
                    String name = mediaCodecInfoMo19128.getName();
                    if (m45165(mediaCodecInfoMo19128, name, zMo19131, str6)) {
                        String strM45157 = m45157(mediaCodecInfoMo19128, name, str6);
                        if (strM45157 == null) {
                            str = str5;
                        } else {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo19128.getCapabilitiesForType(strM45157);
                                boolean zMo19130 = interfaceC10016.mo19130(str5, strM45157, capabilitiesForType);
                                boolean zMo19129 = interfaceC10016.mo19129(str5, capabilitiesForType);
                                str = str5;
                                try {
                                    boolean z3 = c19189.f61967;
                                    if (z3 || !zMo19129) {
                                        if (!z3 || zMo19130) {
                                            boolean zMo19132 = interfaceC10016.mo19130("secure-playback", strM45157, capabilitiesForType);
                                            boolean zMo191210 = interfaceC10016.mo19129("secure-playback", capabilitiesForType);
                                            if (z2 || !zMo191210) {
                                                if (!z2 || zMo19132) {
                                                    if (i4 < 29) {
                                                        zIsHardwareAccelerated = !m45164(mediaCodecInfoMo19128, str6);
                                                    } else {
                                                        zIsHardwareAccelerated = mediaCodecInfoMo19128.isHardwareAccelerated();
                                                    }
                                                    boolean z4 = zIsHardwareAccelerated;
                                                    boolean zM45164 = m45164(mediaCodecInfoMo19128, str6);
                                                    if (i4 < 29) {
                                                        String strM46672 = C20733.m46672(mediaCodecInfoMo19128.getName());
                                                        zIsVendor = (strM46672.startsWith("omx.google.") || strM46672.startsWith("c2.android.") || strM46672.startsWith("c2.google.")) ? false : true;
                                                    } else {
                                                        zIsVendor = mediaCodecInfoMo19128.isVendor();
                                                    }
                                                    if (!(zMo19131 && z2 == zMo19132) && (zMo19131 || z2)) {
                                                        str2 = strM45157;
                                                        str4 = name;
                                                        i = i3;
                                                        z = zMo19131;
                                                        i2 = iMo19127;
                                                        if (!z && zMo19132) {
                                                            StringBuilder sb = new StringBuilder();
                                                            try {
                                                                sb.append(str4);
                                                                sb.append(".secure");
                                                                str3 = str4;
                                                                try {
                                                                    arrayList.add(C5076.m14145(sb.toString(), str6, str2, capabilitiesForType, z4, zM45164, zIsVendor, true));
                                                                    break;
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    if (Build.VERSION.SDK_INT <= 23) {
                                                                    }
                                                                    C0303.m1853("Failed to query codec " + str3 + " (" + str2 + MotionUtils.EASING_TYPE_FORMAT_END);
                                                                    throw e;
                                                                }
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                str3 = str4;
                                                            }
                                                        }
                                                    } else {
                                                        str2 = strM45157;
                                                        str4 = name;
                                                        i = i3;
                                                        z = zMo19131;
                                                        i2 = iMo19127;
                                                        try {
                                                            arrayList.add(C5076.m14145(name, str6, strM45157, capabilitiesForType, z4, zM45164, zIsVendor, false));
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            str3 = str4;
                                                            if (Build.VERSION.SDK_INT <= 23 || arrayList.isEmpty()) {
                                                                C0303.m1853("Failed to query codec " + str3 + " (" + str2 + MotionUtils.EASING_TYPE_FORMAT_END);
                                                                throw e;
                                                            }
                                                            C0303.m1853("Skipping codec " + str3 + " (failed to query capabilities)");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    str2 = strM45157;
                                    str3 = name;
                                    i = i3;
                                    z = zMo19131;
                                    i2 = iMo19127;
                                    if (Build.VERSION.SDK_INT <= 23) {
                                    }
                                    C0303.m1853("Failed to query codec " + str3 + " (" + str2 + MotionUtils.EASING_TYPE_FORMAT_END);
                                    throw e;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                str = str5;
                            }
                            i3 = i + 1;
                            c19189 = c19188;
                            str5 = str;
                            zMo19131 = z;
                        }
                    }
                    i = i3;
                    z = zMo19131;
                    i2 = iMo19127;
                    i3 = i + 1;
                    c19189 = c19188;
                    str5 = str;
                    zMo19131 = z;
                }
                str = str5;
                i = i3;
                z = zMo19131;
                i2 = iMo19127;
                i3 = i + 1;
                c19189 = c19188;
                str5 = str;
                zMo19131 = z;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new C8605("Failed to query underlying media codecs", e6);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45157(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
    public static boolean m45165(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
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
    public static void m45163(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((C5076) arrayList.get(0)).f17691.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C5076.m14145("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C18482(new C7899()));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C5076) arrayList.get(0)).f17691)) {
            return;
        }
        arrayList.add((C5076) arrayList.remove(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45164(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT < 29) {
            if (C6632.m17975(str)) {
                return true;
            }
            String strM46672 = C20733.m46672(mediaCodecInfo.getName());
            if (strM46672.startsWith("arc.")) {
                return false;
            }
            if (strM46672.startsWith("omx.google.") || strM46672.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((strM46672.startsWith("omx.sec.") && strM46672.contains(".sw.")) || strM46672.equals("omx.qcom.video.decoder.hevcswvdec") || strM46672.startsWith("c2.android.") || strM46672.startsWith("c2.google.")) {
                return true;
            }
            return (strM46672.startsWith("omx.") || strM46672.startsWith("c2.")) ? false : true;
        }
        return mediaCodecInfo.isSoftwareOnly();
    }
}
