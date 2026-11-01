package l;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;

/* JADX INFO: renamed from: l.ۚۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38M9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5076 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f17679;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f17680;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f17681;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f17682;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f17683;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f17684;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f17685;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f17686;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final MediaCodecInfo.CodecCapabilities f17687;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f17688;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f17689;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f17690;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f17691;

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5076 m14145(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
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
        return new C5076(str, str2, str3, codecCapabilities, z, z2, z3, z5, z7, z6);
    }

    public C5076(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f17691 = str;
        this.f17684 = str2;
        this.f17685 = str3;
        this.f17687 = codecCapabilities;
        this.f17683 = z;
        this.f17689 = z2;
        this.f17682 = z4;
        this.f17688 = z5;
        this.f17680 = z6;
        this.f17690 = C6632.m17982(str2);
        this.f17679 = -3.4028235E38f;
        this.f17681 = -1;
        this.f17686 = -1;
    }

    public final String toString() {
        return this.f17691;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14152(C7648 c7648) {
        String str = c7648.f25265;
        String str2 = this.f17684;
        return (str2.equals(str) || str2.equals(C19894.m45158(c7648))) && m14148(c7648, false) && m14144(c7648);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m14154(C7648 c7648) {
        int i;
        int i2;
        String str = c7648.f25265;
        String str2 = this.f17684;
        if ((!str2.equals(str) && !str2.equals(C19894.m45158(c7648))) || !m14148(c7648, true) || !m14144(c7648)) {
            return false;
        }
        if (this.f17690) {
            int i3 = c7648.f25246;
            if (i3 > 0 && (i2 = c7648.f25253) > 0) {
                return m14151(i3, i2, c7648.f25273);
            }
        } else {
            int i4 = c7648.f25260;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17687;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    m14146("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m14146("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    m14146(C8479.m22141(i4, "sampleRate.support, "));
                    return false;
                }
            }
            int i5 = c7648.f25249;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    m14146("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    m14146("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else {
                        i = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    C0303.m1848("AssumedMaxChannelAdjustment: " + this.f17691 + ", [" + maxInputChannelCount + " to " + i + "]");
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    m14146(C8479.m22141(i5, "channelCount.support, "));
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
    private boolean m14148(C7648 c7648, boolean z) {
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
        int i3 = C19894.f63785;
        Pair pairM7349 = C2419.m7349(c7648);
        String str2 = c7648.f25265;
        String str3 = this.f17685;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strM17989 = C6632.m17989(str3);
            if (!strM17989.equals("video/mv-hevc")) {
                if (strM17989.equals("video/hevc")) {
                    String strM28850 = C11551.m28850(c7648.f25268);
                    if (strM28850 == null) {
                        pairM7349 = null;
                    } else {
                        String strTrim = strM28850.trim();
                        String str4 = C17983.f57504;
                        pairM7349 = C2419.m7348(strM28850, strTrim.split("\\.", -1), c7648.f25239);
                    }
                }
                if (pairM7349 != null) {
                    iIntValue = ((Integer) pairM7349.first).intValue();
                    iIntValue2 = ((Integer) pairM7349.second).intValue();
                    zEquals = "video/dolby-vision".equals(str2);
                    i = 8;
                    str = this.f17684;
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
                    if (this.f17690) {
                        codecCapabilities = this.f17687;
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
                        m14146(C1694.m5622(new StringBuilder("codec.profileLevel, "), c7648.f25277, ", ", str3));
                        return false;
                    }
                    codecCapabilities = this.f17687;
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
                    m14146(C1694.m5622(new StringBuilder("codec.profileLevel, "), c7648.f25277, ", ", str3));
                    return false;
                }
            }
        } else if (pairM7349 != null) {
            iIntValue = ((Integer) pairM7349.first).intValue();
            iIntValue2 = ((Integer) pairM7349.second).intValue();
            zEquals = "video/dolby-vision".equals(str2);
            i = 8;
            str = this.f17684;
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
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
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
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    Method dump skipped, instruction units count: 396
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: l.C5076.m14148(l.۟ᩴۙ, boolean):boolean");
            }

            /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
            private boolean m14144(C7648 c7648) {
                return (C13638.equals(c7648.f25265, "audio/flac") && c7648.f25280 == 22 && Build.VERSION.SDK_INT < 34 && this.f17691.equals("c2.android.flac.decoder")) ? false : true;
            }

            /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
            public final boolean m14153(C7648 c7648) {
                if (this.f17690) {
                    return this.f17682;
                }
                int i = C19894.f63785;
                Pair pairM7349 = C2419.m7349(c7648);
                return pairM7349 != null && ((Integer) pairM7349.first).intValue() == 42;
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final C17567 m14150(C7648 c7648, C7648 c7649) {
                int i;
                String str = c7648.f25265;
                C4119 c4119 = c7648.f25239;
                String str2 = c7649.f25265;
                C4119 c41110 = c7649.f25239;
                int i2 = !C13638.equals(str, str2) ? 8 : 0;
                if (this.f17690) {
                    if (c7648.f25248 != c7649.f25248) {
                        i2 |= 1024;
                    }
                    boolean z = (c7648.f25246 == c7649.f25246 && c7648.f25253 == c7649.f25253) ? false : true;
                    if (!this.f17682 && z) {
                        i2 |= 512;
                    }
                    if ((!C4119.m11702(c4119) || !C4119.m11702(c41110)) && !C13638.equals(c4119, c41110)) {
                        i2 |= 2048;
                    }
                    if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f17691) && !c7648.m20202(c7649)) {
                        i2 |= 2;
                    }
                    int i3 = c7648.f25276;
                    if (i3 != -1 && (i = c7648.f25267) != -1 && i3 == c7649.f25276 && i == c7649.f25267 && z) {
                        i2 |= 2;
                    }
                    if (i2 == 0) {
                        return new C17567(this.f17691, c7648, c7649, c7648.m20202(c7649) ? 3 : 2, 0);
                    }
                } else {
                    if (c7648.f25249 != c7649.f25249) {
                        i2 |= 4096;
                    }
                    if (c7648.f25260 != c7649.f25260) {
                        i2 |= 8192;
                    }
                    if (c7648.f25280 != c7649.f25280) {
                        i2 |= 16384;
                    }
                    String str3 = this.f17684;
                    if (i2 == 0 && "audio/mp4a-latm".equals(str3)) {
                        int i4 = C19894.f63785;
                        Pair pairM7349 = C2419.m7349(c7648);
                        Pair pairM73410 = C2419.m7349(c7649);
                        if (pairM7349 != null && pairM73410 != null) {
                            int iIntValue = ((Integer) pairM7349.first).intValue();
                            int iIntValue2 = ((Integer) pairM73410.first).intValue();
                            if (iIntValue == 42 && iIntValue2 == 42) {
                                return new C17567(this.f17691, c7648, c7649, 3, 0);
                            }
                        }
                    }
                    if (!c7648.m20202(c7649)) {
                        i2 |= 32;
                    }
                    if ("audio/opus".equals(str3)) {
                        i2 |= 2;
                    }
                    if (i2 == 0) {
                        return new C17567(this.f17691, c7648, c7649, 1, 0);
                    }
                }
                return new C17567(this.f17691, c7648, c7649, 0, i2);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0044 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:21:0x0046  */
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final boolean m14151(int i, int i2, double d) {
                String str;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17687;
                if (codecCapabilities == null) {
                    m14146("sizeAndRate.caps");
                    return false;
                }
                MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
                if (videoCapabilities == null) {
                    m14146("sizeAndRate.vCaps");
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    int iM3455 = C0842.m3455(videoCapabilities, i, i2, d);
                    if (iM3455 != 2) {
                        if (iM3455 == 1) {
                            StringBuilder sbM2791 = C0589.m2791("sizeAndRate.cover, ", i, "x", "@", i2);
                            sbM2791.append(d);
                            m14146(sbM2791.toString());
                            return false;
                        }
                        if (!m14147(videoCapabilities, i, i2, d)) {
                            if (i < i2) {
                                str = this.f17691;
                                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                                    StringBuilder sbM2792 = C0589.m2791("sizeAndRate.rotated, ", i, "x", "@", i2);
                                    sbM2792.append(d);
                                    StringBuilder sbM30515 = C12278.m30515("AssumedSupport [", sbM2792.toString(), "] [", str, ", ");
                                    sbM30515.append(this.f17684);
                                    sbM30515.append("] [");
                                    sbM30515.append(C17983.f57504);
                                    sbM30515.append("]");
                                    C0303.m1849(sbM30515.toString());
                                    return true;
                                }
                                StringBuilder sbM2793 = C0589.m2791("sizeAndRate.rotated, ", i, "x", "@", i2);
                                sbM2793.append(d);
                                StringBuilder sbM30516 = C12278.m30515("AssumedSupport [", sbM2793.toString(), "] [", str, ", ");
                                sbM30516.append(this.f17684);
                                sbM30516.append("] [");
                                sbM30516.append(C17983.f57504);
                                sbM30516.append("]");
                                C0303.m1849(sbM30516.toString());
                                return true;
                            }
                            StringBuilder sbM2794 = C0589.m2791("sizeAndRate.support, ", i, "x", "@", i2);
                            sbM2794.append(d);
                            m14146(sbM2794.toString());
                            return false;
                        }
                    }
                } else if (!m14147(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        str = this.f17691;
                        if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && m14147(videoCapabilities, i2, i, d)) {
                            StringBuilder sbM2795 = C0589.m2791("sizeAndRate.rotated, ", i, "x", "@", i2);
                            sbM2795.append(d);
                            StringBuilder sbM30517 = C12278.m30515("AssumedSupport [", sbM2795.toString(), "] [", str, ", ");
                            sbM30517.append(this.f17684);
                            sbM30517.append("] [");
                            sbM30517.append(C17983.f57504);
                            sbM30517.append("]");
                            C0303.m1849(sbM30517.toString());
                            return true;
                        }
                    }
                    StringBuilder sbM2796 = C0589.m2791("sizeAndRate.support, ", i, "x", "@", i2);
                    sbM2796.append(d);
                    m14146(sbM2796.toString());
                    return false;
                }
                return true;
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final float m14149(int i, int i2) {
                if (!this.f17690) {
                    return -3.4028235E38f;
                }
                float f = this.f17679;
                if (f != -3.4028235E38f && this.f17681 == i && this.f17686 == i2) {
                    return f;
                }
                float f2 = 1024.0f;
                if (!m14151(i, i2, 1024.0f)) {
                    float f3 = 0.0f;
                    while (true) {
                        float f4 = f2 - f3;
                        if (Math.abs(f4) <= 5.0f) {
                            break;
                        }
                        float f5 = (f4 / 2.0f) + f3;
                        if (m14151(i, i2, f5)) {
                            f3 = f5;
                        } else {
                            f2 = f5;
                        }
                    }
                    f2 = f3;
                }
                this.f17679 = f2;
                this.f17681 = i;
                this.f17686 = i2;
                return f2;
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            private void m14146(String str) {
                StringBuilder sbM30914 = C12441.m30914("NoSupport [", str, "] [");
                sbM30914.append(this.f17691);
                sbM30914.append(", ");
                sbM30914.append(this.f17684);
                sbM30914.append("] [");
                sbM30914.append(C17983.f57504);
                sbM30914.append("]");
                C0303.m1849(sbM30914.toString());
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public static boolean m14147(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
                Range<Double> achievableFrameRatesFor;
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                Point point = new Point(C17983.m41812(i, widthAlignment) * widthAlignment, C17983.m41812(i2, heightAlignment) * heightAlignment);
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
