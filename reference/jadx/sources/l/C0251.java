package l;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;

/* JADX INFO: renamed from: l.֡ۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38M9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0251 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f1521;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f1522;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f1523;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f1524;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f1525;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f1526;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f1527;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f1528;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f1529;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f1530;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final MediaCodecInfo.CodecCapabilities f1531;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f1532;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f1533;

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0251 m1738(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        if (codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (Build.VERSION.SDK_INT <= 22) {
                String str4 = Build.MODEL;
                z5 = (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) ? false : true;
            }
        }
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z7 = z4 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z6 = false;
        } else {
            String str5 = Build.MANUFACTURER;
            if (str5.equals("Xiaomi") || str5.equals("OPPO") || str5.equals("realme") || str5.equals("motorola") || str5.equals("LENOVO")) {
                z6 = false;
            } else {
                z6 = true;
            }
        }
        return new C0251(str, str2, str3, codecCapabilities, z, z2, z3, z5, z7, z6);
    }

    public C0251(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f1533 = str;
        this.f1525 = str2;
        this.f1524 = str3;
        this.f1531 = codecCapabilities;
        this.f1530 = z;
        this.f1529 = z2;
        this.f1522 = z4;
        this.f1528 = z5;
        this.f1532 = z6;
        this.f1527 = C9681.m25257(str2);
        this.f1526 = -3.4028235E38f;
        this.f1521 = -1;
        this.f1523 = -1;
    }

    public final String toString() {
        return this.f1533;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m1746(C15648 c15648) {
        String str = c15648.f50848;
        String str2 = this.f1525;
        return (str2.equals(str) || str2.equals(C1939.m6719(c15648))) && m1741(c15648, false) && m1742(c15648);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m1748(C15648 c15648) {
        int i;
        int i2;
        String str = c15648.f50848;
        String str2 = this.f1525;
        if ((!str2.equals(str) && !str2.equals(C1939.m6719(c15648))) || !m1741(c15648, true) || !m1742(c15648)) {
            return false;
        }
        if (this.f1527) {
            int i3 = c15648.f50814;
            if (i3 > 0 && (i2 = c15648.f50852) > 0) {
                return m1745(i3, i2, c15648.f50845);
            }
        } else {
            int i4 = c15648.f50829;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f1531;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    m1739("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m1739("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    m1739(C13645.m33382(i4, "sampleRate.support, "));
                    return false;
                }
            }
            int i5 = c15648.f50843;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    m1739("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    m1739("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else {
                        i = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    C1896.m6517("AssumedMaxChannelAdjustment: " + this.f1533 + ", [" + maxInputChannelCount + " to " + i + "]");
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    m1739(C13645.m33382(i5, "channelCount.support, "));
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x015e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:74:0x0100  */
    /* JADX WARN: Code duplicated, block: B:76:0x0105  */
    /* JADX WARN: Code duplicated, block: B:77:0x0108  */
    /* JADX WARN: Code duplicated, block: B:79:0x010d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0110  */
    /* JADX WARN: Code duplicated, block: B:83:0x0116  */
    /* JADX WARN: Code duplicated, block: B:85:0x011b  */
    /* JADX WARN: Code duplicated, block: B:86:0x011d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0122  */
    /* JADX WARN: Code duplicated, block: B:89:0x0124  */
    /* JADX WARN: Code duplicated, block: B:93:0x0136  */
    /* JADX WARN: Code duplicated, block: B:95:0x013c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m1741(C15648 c15648, boolean z) {
        int iIntValue;
        int iIntValue2;
        boolean zEquals;
        int i;
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int length;
        int i2;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        int iIntValue3;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i3 = C1939.f6500;
        Pair pairM48970 = C21528.m48970(c15648);
        String str2 = c15648.f50848;
        String str3 = this.f1524;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strM25264 = C9681.m25264(str3);
            if (!strM25264.equals("video/mv-hevc")) {
                if (strM25264.equals("video/hevc")) {
                    String strM34823 = C14399.m34823(c15648.f50835);
                    if (strM34823 == null) {
                        pairM48970 = null;
                    } else {
                        String strTrim = strM34823.trim();
                        String str4 = C7116.f23455;
                        pairM48970 = C21528.m48969(strM34823, strTrim.split("\\.", -1), c15648.f50832);
                    }
                }
                if (pairM48970 != null) {
                    iIntValue = ((Integer) pairM48970.first).intValue();
                    iIntValue2 = ((Integer) pairM48970.second).intValue();
                    zEquals = "video/dolby-vision".equals(str2);
                    i = 8;
                    str = this.f1525;
                    if (zEquals) {
                        str.getClass();
                        switch (str) {
                            case "video/av01":
                            case "video/hevc":
                                iIntValue2 = 0;
                                iIntValue = 2;
                                break;
                            case "video/avc":
                                iIntValue2 = 0;
                                iIntValue = 8;
                                break;
                        }
                    }
                    if (this.f1527) {
                        codecCapabilities = this.f1531;
                        if (codecCapabilities != null) {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        } else {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        }
                        if (Build.VERSION.SDK_INT <= 23) {
                            if (codecCapabilities != null) {
                                iIntValue3 = 0;
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 >= 180000000) {
                                i = 1024;
                            } else if (iIntValue3 >= 120000000) {
                                i = 512;
                            } else if (iIntValue3 >= 60000000) {
                                i = 256;
                            } else if (iIntValue3 >= 30000000) {
                                i = 128;
                            } else if (iIntValue3 >= 18000000) {
                                i = 64;
                            } else if (iIntValue3 >= 12000000) {
                                i = 32;
                            } else if (iIntValue3 >= 7200000) {
                                i = 16;
                            } else if (iIntValue3 < 3600000) {
                                if (iIntValue3 >= 1800000) {
                                    i = 4;
                                } else if (iIntValue3 >= 800000) {
                                    i = 2;
                                } else {
                                    i = 1;
                                }
                            }
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = new MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel2.profile = 1;
                            codecProfileLevel2.level = i;
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel2};
                        }
                        length = codecProfileLevelArr.length;
                        for (i2 = 0; i2 < length; i2++) {
                            codecProfileLevel = codecProfileLevelArr[i2];
                            if (codecProfileLevel.profile != iIntValue) {
                            }
                        }
                        m1739(C12669.m31438(new StringBuilder("codec.profileLevel, "), c15648.f50836, ", ", str3));
                        return false;
                    }
                    codecCapabilities = this.f1531;
                    if (codecCapabilities != null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    } else {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (Build.VERSION.SDK_INT <= 23) {
                        if (codecCapabilities != null) {
                            iIntValue3 = 0;
                        } else {
                            iIntValue3 = 0;
                        }
                        if (iIntValue3 >= 180000000) {
                            i = 1024;
                        } else if (iIntValue3 >= 120000000) {
                            i = 512;
                        } else if (iIntValue3 >= 60000000) {
                            i = 256;
                        } else if (iIntValue3 >= 30000000) {
                            i = 128;
                        } else if (iIntValue3 >= 18000000) {
                            i = 64;
                        } else if (iIntValue3 >= 12000000) {
                            i = 32;
                        } else if (iIntValue3 >= 7200000) {
                            i = 16;
                        } else if (iIntValue3 < 3600000) {
                            if (iIntValue3 >= 1800000) {
                                i = 4;
                            } else if (iIntValue3 >= 800000) {
                                i = 2;
                            } else {
                                i = 1;
                            }
                        }
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel3.profile = 1;
                        codecProfileLevel3.level = i;
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel3};
                    }
                    length = codecProfileLevelArr.length;
                    while (i2 < length) {
                        codecProfileLevel = codecProfileLevelArr[i2];
                        if (codecProfileLevel.profile != iIntValue) {
                        }
                    }
                    m1739(C12669.m31438(new StringBuilder("codec.profileLevel, "), c15648.f50836, ", ", str3));
                    return false;
                }
            }
        } else if (pairM48970 != null) {
            iIntValue = ((Integer) pairM48970.first).intValue();
            iIntValue2 = ((Integer) pairM48970.second).intValue();
            zEquals = "video/dolby-vision".equals(str2);
            i = 8;
            str = this.f1525;
            if (zEquals) {
                str.getClass();
                switch (str) {
                    case -1662735862:
                        if (str.equals("video/av01")) {
                        }
                        break;
                    case -1662541442:
                        if (str.equals("video/hevc")) {
                        }
                        break;
                    case 1331836730:
                        if (str.equals("video/avc")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instruction units count: 396
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: l.C0251.m1741(l.ܳ᩹ۙ, boolean):boolean");
            }

            /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
            private boolean m1742(C15648 c15648) {
                return (C17359.equals(c15648.f50848, "audio/flac") && c15648.f50826 == 22 && Build.VERSION.SDK_INT < 34 && this.f1533.equals("c2.android.flac.decoder")) ? false : true;
            }

            /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
            public final boolean m1747(C15648 c15648) {
                if (this.f1527) {
                    return this.f1522;
                }
                int i = C1939.f6500;
                Pair pairM48970 = C21528.m48970(c15648);
                return pairM48970 != null && ((Integer) pairM48970.first).intValue() == 42;
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final C17820 m1744(C15648 c15648, C15648 c15649) {
                int i;
                String str = c15648.f50848;
                C1259 c1259 = c15648.f50832;
                String str2 = c15649.f50848;
                C1259 c12510 = c15649.f50832;
                int i2 = !C17359.equals(str, str2) ? 8 : 0;
                if (this.f1527) {
                    if (c15648.f50819 != c15649.f50819) {
                        i2 |= 1024;
                    }
                    boolean z = (c15648.f50814 == c15649.f50814 && c15648.f50852 == c15649.f50852) ? false : true;
                    if (!this.f1522 && z) {
                        i2 |= 512;
                    }
                    if ((!C1259.m4557(c1259) || !C1259.m4557(c12510)) && !C17359.equals(c1259, c12510)) {
                        i2 |= 2048;
                    }
                    if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f1533) && !c15648.m37398(c15649)) {
                        i2 |= 2;
                    }
                    int i3 = c15648.f50840;
                    if (i3 != -1 && (i = c15648.f50839) != -1 && i3 == c15649.f50840 && i == c15649.f50839 && z) {
                        i2 |= 2;
                    }
                    if (i2 == 0) {
                        return new C17820(this.f1533, c15648, c15649, c15648.m37398(c15649) ? 3 : 2, 0);
                    }
                } else {
                    if (c15648.f50843 != c15649.f50843) {
                        i2 |= 4096;
                    }
                    if (c15648.f50829 != c15649.f50829) {
                        i2 |= 8192;
                    }
                    if (c15648.f50826 != c15649.f50826) {
                        i2 |= 16384;
                    }
                    String str3 = this.f1525;
                    if (i2 == 0 && "audio/mp4a-latm".equals(str3)) {
                        int i4 = C1939.f6500;
                        Pair pairM48970 = C21528.m48970(c15648);
                        Pair pairM48971 = C21528.m48970(c15649);
                        if (pairM48970 != null && pairM48971 != null) {
                            int iIntValue = ((Integer) pairM48970.first).intValue();
                            int iIntValue2 = ((Integer) pairM48971.first).intValue();
                            if (iIntValue == 42 && iIntValue2 == 42) {
                                return new C17820(this.f1533, c15648, c15649, 3, 0);
                            }
                        }
                    }
                    if (!c15648.m37398(c15649)) {
                        i2 |= 32;
                    }
                    if ("audio/opus".equals(str3)) {
                        i2 |= 2;
                    }
                    if (i2 == 0) {
                        return new C17820(this.f1533, c15648, c15649, 1, 0);
                    }
                }
                return new C17820(this.f1533, c15648, c15649, 0, i2);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0044 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:21:0x0046  */
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final boolean m1745(int i, int i2, double d) {
                String str;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f1531;
                if (codecCapabilities == null) {
                    m1739("sizeAndRate.caps");
                    return false;
                }
                MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
                if (videoCapabilities == null) {
                    m1739("sizeAndRate.vCaps");
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    int iM43817 = C18896.m43817(videoCapabilities, i, i2, d);
                    if (iM43817 != 2) {
                        if (iM43817 == 1) {
                            StringBuilder sbM5126 = C1402.m5126("sizeAndRate.cover, ", i, "x", "@", i2);
                            sbM5126.append(d);
                            m1739(sbM5126.toString());
                            return false;
                        }
                        if (!m1740(videoCapabilities, i, i2, d)) {
                            if (i < i2) {
                                str = this.f1533;
                                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                                    StringBuilder sbM5127 = C1402.m5126("sizeAndRate.rotated, ", i, "x", "@", i2);
                                    sbM5127.append(d);
                                    StringBuilder sbM10406 = C3188.m10406("AssumedSupport [", sbM5127.toString(), "] [", str, ", ");
                                    sbM10406.append(this.f1525);
                                    sbM10406.append("] [");
                                    sbM10406.append(C7116.f23455);
                                    sbM10406.append("]");
                                    C1896.m6511(sbM10406.toString());
                                    return true;
                                }
                                StringBuilder sbM5128 = C1402.m5126("sizeAndRate.rotated, ", i, "x", "@", i2);
                                sbM5128.append(d);
                                StringBuilder sbM10407 = C3188.m10406("AssumedSupport [", sbM5128.toString(), "] [", str, ", ");
                                sbM10407.append(this.f1525);
                                sbM10407.append("] [");
                                sbM10407.append(C7116.f23455);
                                sbM10407.append("]");
                                C1896.m6511(sbM10407.toString());
                                return true;
                            }
                            StringBuilder sbM5129 = C1402.m5126("sizeAndRate.support, ", i, "x", "@", i2);
                            sbM5129.append(d);
                            m1739(sbM5129.toString());
                            return false;
                        }
                    }
                } else if (!m1740(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        str = this.f1533;
                        if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && m1740(videoCapabilities, i2, i, d)) {
                            StringBuilder sbM51210 = C1402.m5126("sizeAndRate.rotated, ", i, "x", "@", i2);
                            sbM51210.append(d);
                            StringBuilder sbM10408 = C3188.m10406("AssumedSupport [", sbM51210.toString(), "] [", str, ", ");
                            sbM10408.append(this.f1525);
                            sbM10408.append("] [");
                            sbM10408.append(C7116.f23455);
                            sbM10408.append("]");
                            C1896.m6511(sbM10408.toString());
                            return true;
                        }
                    }
                    StringBuilder sbM51211 = C1402.m5126("sizeAndRate.support, ", i, "x", "@", i2);
                    sbM51211.append(d);
                    m1739(sbM51211.toString());
                    return false;
                }
                return true;
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final float m1743(int i, int i2) {
                if (!this.f1527) {
                    return -3.4028235E38f;
                }
                float f = this.f1526;
                if (f != -3.4028235E38f && this.f1521 == i && this.f1523 == i2) {
                    return f;
                }
                float f2 = 1024.0f;
                if (!m1745(i, i2, 1024.0f)) {
                    float f3 = 0.0f;
                    while (true) {
                        float f4 = f2 - f3;
                        if (Math.abs(f4) <= 5.0f) {
                            break;
                        }
                        float f5 = (f4 / 2.0f) + f3;
                        if (m1745(i, i2, f5)) {
                            f3 = f5;
                        } else {
                            f2 = f5;
                        }
                    }
                    f2 = f3;
                }
                this.f1526 = f2;
                this.f1521 = i;
                this.f1523 = i2;
                return f2;
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            private void m1739(String str) {
                StringBuilder sbM51387 = C22783.m51387("NoSupport [", str, "] [");
                sbM51387.append(this.f1533);
                sbM51387.append(", ");
                sbM51387.append(this.f1525);
                sbM51387.append("] [");
                sbM51387.append(C7116.f23455);
                sbM51387.append("]");
                C1896.m6511(sbM51387.toString());
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public static boolean m1740(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
                Range<Double> achievableFrameRatesFor;
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                Point point = new Point(C7116.m19459(i, widthAlignment) * widthAlignment, C7116.m19459(i2, heightAlignment) * heightAlignment);
                int i3 = point.x;
                int i4 = point.y;
                if (d == -1.0d || d < 1.0d) {
                    return videoCapabilities.isSizeSupported(i3, i4);
                }
                double dFloor = Math.floor(d);
                if (videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
                    return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
                }
                return false;
            }
        }
