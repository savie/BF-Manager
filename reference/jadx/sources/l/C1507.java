package l;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֫֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97LV */
/* JADX INFO: loaded from: classes2.dex */
public final class C1507 implements InterfaceC15524 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5741 f6154;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16325 f6155;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6102 = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6099 = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f6121 = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6101 = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6129 = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final Pattern f6150 = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6108 = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6149 = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Pattern f6141 = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6115 = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6130 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f6152 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6153 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f6147 = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f6084 = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6107 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6090 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6109 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Pattern f6139 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Pattern f6106 = m5200("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6132 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6110 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6138 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6137 = m5200("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6151 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6103 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6128 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6122 = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6094 = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6111 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6127 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6097 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6135 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f6145 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6146 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6098 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6148 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6096 = Pattern.compile("URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6089 = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6092 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6144 = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6085 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6136 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f6086 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6112 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6117 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6093 = m5200("AUTOSELECT");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f6119 = m5200("DEFAULT");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6114 = m5200("FORCED");

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6123 = m5200("INDEPENDENT");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6125 = m5200("GAP");

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6105 = m5200("PRECISE");

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6124 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6095 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6091 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final Pattern f6104 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6134 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6131 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6133 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6140 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6100 = m5200("END-ON-NEXT");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6088 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6116 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6083 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6113 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6120 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6142 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Pattern f6082 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6126 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6087 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6118 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f6143 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    @Override // l.InterfaceC15524
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo5207(Uri uri, C0261 c0261) {
        return m5208(uri, (InputStream) c0261);
    }

    public C1507() {
        this(C5741.f19525, null);
    }

    public C1507(C5741 c5741, C16325 c16325) {
        this.f6154 = c5741;
        this.f6155 = c16325;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:31:0x0068, B:33:0x006e, B:36:0x0079, B:38:0x0081, B:41:0x0095, B:43:0x009d, B:45:0x00a5, B:47:0x00ad, B:49:0x00b5, B:51:0x00bd, B:53:0x00c5, B:55:0x00cd, B:58:0x00d6, B:59:0x00da, B:64:0x00fc, B:65:0x0102, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:69:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0103, LOOP:2: B:17:0x003c->B:22:0x0048, LOOP_END, TryCatch #0 {all -> 0x0103, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:31:0x0068, B:33:0x006e, B:36:0x0079, B:38:0x0081, B:41:0x0095, B:43:0x009d, B:45:0x00a5, B:47:0x00ad, B:49:0x00b5, B:51:0x00bd, B:53:0x00c5, B:55:0x00cd, B:58:0x00d6, B:59:0x00da, B:64:0x00fc, B:65:0x0102, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:69:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:88:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0047 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10681 m5208(Uri uri, InputStream inputStream) throws C22861 {
        int i;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i2 = bufferedReader.read();
            boolean zM41809 = false;
            if (i2 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i2 = bufferedReader.read();
                    while (i2 != -1) {
                        i2 = bufferedReader.read();
                    }
                    i = 0;
                    while (true) {
                        if (i < 7) {
                            if (i2 != "#EXTM3U".charAt(i)) {
                                break;
                                break;
                            }
                            i2 = bufferedReader.read();
                            i++;
                        } else {
                            while (i2 != -1) {
                                i2 = bufferedReader.read();
                            }
                            zM41809 = C17983.m41809(i2);
                            break;
                        }
                    }
                }
            } else {
                while (i2 != -1 && Character.isWhitespace(i2)) {
                    i2 = bufferedReader.read();
                }
                i = 0;
                while (true) {
                    if (i < 7) {
                        if (i2 != "#EXTM3U".charAt(i)) {
                            break;
                        }
                        i2 = bufferedReader.read();
                        i++;
                    } else {
                        while (i2 != -1 && Character.isWhitespace(i2) && !C17983.m41809(i2)) {
                            i2 = bufferedReader.read();
                        }
                        zM41809 = C17983.m41809(i2);
                        break;
                    }
                }
            }
            if (!zM41809) {
                throw C22861.m50608("Input does not start with the #EXTM3U header.");
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    String strTrim = line.trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                            arrayDeque.add(strTrim);
                            C5741 c5741M5201 = m5201(new C14209(arrayDeque, bufferedReader), uri.toString());
                            C17983.m41837(bufferedReader);
                            return c5741M5201;
                        }
                        if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                            arrayDeque.add(strTrim);
                        }
                        arrayDeque.add(strTrim);
                        C16325 c16325M5203 = m5203(this.f6154, this.f6155, new C14209(arrayDeque, bufferedReader), uri.toString());
                        C17983.m41837(bufferedReader);
                        return c16325M5203;
                    }
                } else {
                    C17983.m41837(bufferedReader);
                    throw C22861.m50608("Failed to parse the playlist, could not identify any tags.");
                }
            }
        } catch (Throwable th) {
            C17983.m41837(bufferedReader);
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0210 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0213  */
    /* JADX WARN: Code duplicated, block: B:106:0x021c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0225  */
    /* JADX WARN: Code duplicated, block: B:110:0x0234  */
    /* JADX WARN: Code duplicated, block: B:112:0x023a  */
    /* JADX WARN: Code duplicated, block: B:117:0x024b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0250  */
    /* JADX WARN: Code duplicated, block: B:120:0x0253  */
    /* JADX WARN: Code duplicated, block: B:121:0x0258  */
    /* JADX WARN: Code duplicated, block: B:124:0x0262  */
    /* JADX WARN: Code duplicated, block: B:127:0x027b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0286  */
    /* JADX WARN: Code duplicated, block: B:131:0x028b  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:135:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:140:0x030c  */
    /* JADX WARN: Code duplicated, block: B:208:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:284:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x016c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0170  */
    /* JADX WARN: Code duplicated, block: B:55:0x0178  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d4  */
    /* JADX WARN: Failed to find 'out' block for switch in B:209:0x04de. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5741 m5201(C14209 c14209, String str) throws IOException {
        ?? r7;
        String str2;
        int i;
        String str3;
        Pattern pattern;
        ArrayList arrayList;
        ArrayList arrayList2;
        C17030 c17030;
        String strM17986;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i2;
        String str4;
        C7648 c7648M26497;
        C17030 c17031;
        String strM17987;
        C17030 c17032;
        int i3;
        int i4;
        String str5;
        int i5;
        String str6;
        String strM41860;
        int i6;
        String[] strArrM41848;
        String string;
        StringBuilder sb;
        int length;
        int i7;
        String str7;
        String strM5198;
        int i8;
        int i9;
        String strM5199;
        float f;
        Uri uriM50741;
        ArrayList arrayList5;
        String str8 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            boolean zM34300 = c14209.m34300();
            String str9 = "application/x-mpegURL";
            Pattern pattern2 = f6096;
            boolean z3 = z2;
            ArrayList arrayList14 = arrayList10;
            Pattern pattern3 = f6136;
            ArrayList arrayList15 = arrayList9;
            String str10 = ",";
            if (!zM34300) {
                ArrayList arrayList16 = arrayList11;
                ArrayList arrayList17 = arrayList7;
                ArrayList arrayList18 = arrayList8;
                ArrayList arrayList19 = arrayList13;
                ArrayList arrayList20 = arrayList12;
                ArrayList arrayList21 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i10 = 0;
                while (i10 < arrayList6.size()) {
                    C17030 c17033 = (C17030) arrayList6.get(i10);
                    Uri uri = c17033.f54408;
                    C7648 c7648 = c17033.f54409;
                    if (hashSet.add(uri)) {
                        C2023.m6510(c7648.f25258 == null);
                        ArrayList arrayList22 = (ArrayList) map.get(c17033.f54408);
                        arrayList22.getClass();
                        C0987 c0987 = new C0987(new C0801(null, null, arrayList22));
                        C10471 c10471M20201 = c7648.m20201();
                        c10471M20201.m26504(c0987);
                        arrayList21.add(new C17030(c17033.f54408, c10471M20201.m26497(), c17033.f54411, c17033.f54407, c17033.f54406, c17033.f54410));
                    }
                    i10++;
                    hashSet = hashSet;
                    z = z;
                    map = map;
                }
                boolean z4 = z;
                int i11 = 0;
                ArrayList arrayList23 = null;
                C7648 c7649 = null;
                while (i11 < arrayList16.size()) {
                    String str11 = (String) arrayList16.get(i11);
                    String strM51910 = m5199(str11, f6086, map2);
                    String strM51911 = m5199(str11, pattern3, map2);
                    C10471 c10471 = new C10471();
                    Pattern pattern4 = pattern3;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strM51910);
                    C7648 c76410 = c7649;
                    sb2.append(":");
                    sb2.append(strM51911);
                    c10471.m26516(sb2.toString());
                    c10471.m26495(strM51911);
                    c10471.m26521(str9);
                    boolean zM5205 = m5205(f6119, str11);
                    if (m5205(f6114, str11)) {
                        r7 = zM5205;
                        r7 = (zM5205 ? 1 : 0) | 2;
                    }
                    r7 = zM5205;
                    int i12 = r7;
                    if (m5205(f6093, str11)) {
                        i12 = (r7 == true ? 1 : 0) | 4;
                    }
                    c10471.m26530(i12);
                    String strM51912 = m5198(str11, f6112, (String) null, map2);
                    if (TextUtils.isEmpty(strM51912)) {
                        i = 0;
                        str2 = str10;
                    } else {
                        String str12 = C17983.f57504;
                        String[] strArrSplit = strM51912.split(str10, -1);
                        int i13 = C17983.m41842("public.accessibility.describes-video", strArrSplit) ? 512 : 0;
                        str2 = str10;
                        if (C17983.m41842("public.accessibility.transcribes-spoken-dialog", strArrSplit)) {
                            i13 |= 4096;
                        }
                        int i14 = C17983.m41842("public.accessibility.describes-music-and-sound", strArrSplit) ? i13 | 1024 : i13;
                        i = C17983.m41842("public.easy-to-read", strArrSplit) ? i14 | 8192 : i14;
                    }
                    c10471.m26513(i);
                    c10471.m26509(m5198(str11, f6085, (String) null, map2));
                    String strM51913 = m5198(str11, pattern2, (String) null, map2);
                    Uri uriM50742 = strM51913 == null ? null : C22923.m50741(str8, strM51913);
                    C0987 c0988 = new C0987(new C0801(strM51910, strM51911, Collections.EMPTY_LIST));
                    switch (m5199(str11, f6092, map2)) {
                        case "SUBTITLES":
                            str3 = str9;
                            pattern = pattern2;
                            arrayList = arrayList18;
                            arrayList2 = arrayList17;
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList6.size()) {
                                    c17030 = (C17030) arrayList6.get(i15);
                                    if (!strM51910.equals(c17030.f54406)) {
                                        i15++;
                                    }
                                } else {
                                    c17030 = null;
                                }
                            }
                            if (c17030 != null) {
                                String strM41861 = C17983.m41860(3, c17030.f54409.f25277);
                                c10471.m26502(strM41861);
                                strM17986 = C6632.m17986(strM41861);
                            } else {
                                strM17986 = null;
                            }
                            if (strM17986 == null) {
                                strM17986 = "text/vtt";
                            }
                            c10471.m26533(strM17986);
                            c10471.m26504(c0988);
                            if (uriM50742 != null) {
                                C12092 c12092 = new C12092(uriM50742, c10471.m26497(), strM51911);
                                arrayList3 = arrayList15;
                                arrayList3.add(c12092);
                            } else {
                                arrayList3 = arrayList15;
                                C0303.m1848("EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            c7648M26497 = c76410;
                            break;
                        case "CLOSED-CAPTIONS":
                            str3 = str9;
                            pattern = pattern2;
                            arrayList4 = arrayList18;
                            arrayList2 = arrayList17;
                            String strM51914 = m5199(str11, f6117, map2);
                            if (strM51914.startsWith("CC")) {
                                i2 = Integer.parseInt(strM51914.substring(2));
                                str4 = "application/cea-608";
                            } else {
                                i2 = Integer.parseInt(strM51914.substring(7));
                                str4 = "application/cea-708";
                            }
                            if (arrayList23 == null) {
                                arrayList23 = new ArrayList();
                            }
                            c10471.m26533(str4);
                            c10471.m26499(i2);
                            arrayList23.add(c10471.m26497());
                            c7648M26497 = c76410;
                            arrayList = arrayList4;
                            arrayList3 = arrayList15;
                            break;
                        case "AUDIO":
                            arrayList2 = arrayList17;
                            int i16 = 0;
                            str3 = str9;
                            while (true) {
                                if (i16 < arrayList6.size()) {
                                    c17031 = (C17030) arrayList6.get(i16);
                                    pattern = pattern2;
                                    if (!strM51910.equals(c17031.f54407)) {
                                        i16++;
                                        pattern2 = pattern;
                                    }
                                } else {
                                    pattern = pattern2;
                                    c17031 = null;
                                }
                            }
                            if (c17031 != null) {
                                String strM41862 = C17983.m41860(1, c17031.f54409.f25277);
                                c10471.m26502(strM41862);
                                strM17987 = C6632.m17986(strM41862);
                            } else {
                                strM17987 = null;
                            }
                            String strM51915 = m5198(str11, f6108, (String) null, map2);
                            if (strM51915 != null) {
                                String str13 = C17983.f57504;
                                c10471.m26494(Integer.parseInt(strM51915.split("/", 2)[0]));
                                if ("audio/eac3".equals(strM17987) && strM51915.endsWith("/JOC")) {
                                    c10471.m26502("ec+3");
                                    strM17987 = "audio/eac3-joc";
                                }
                            }
                            c10471.m26533(strM17987);
                            if (uriM50742 == null) {
                                arrayList4 = arrayList18;
                                if (c17031 != null) {
                                    c7648M26497 = c10471.m26497();
                                    arrayList = arrayList4;
                                    arrayList3 = arrayList15;
                                }
                                break;
                            } else {
                                c10471.m26504(c0988);
                                C12092 c12093 = new C12092(uriM50742, c10471.m26497(), strM51911);
                                arrayList4 = arrayList18;
                                arrayList4.add(c12093);
                            }
                            arrayList = arrayList4;
                            arrayList3 = arrayList15;
                            c7648M26497 = c76410;
                            break;
                        case "VIDEO":
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList6.size()) {
                                    c17032 = (C17030) arrayList6.get(i17);
                                    if (!strM51910.equals(c17032.f54411)) {
                                        i17++;
                                    }
                                } else {
                                    c17032 = null;
                                }
                            }
                            if (c17032 != null) {
                                C7648 c76411 = c17032.f54409;
                                String strM41863 = C17983.m41860(2, c76411.f25277);
                                c10471.m26502(strM41863);
                                c10471.m26533(C6632.m17986(strM41863));
                                c10471.m26525(c76411.f25246);
                                c10471.m26534(c76411.f25253);
                                c10471.m26498(c76411.f25273);
                            }
                            if (uriM50742 != null) {
                                c10471.m26504(c0988);
                                arrayList2 = arrayList17;
                                arrayList2.add(new C12092(uriM50742, c10471.m26497(), strM51911));
                                str3 = str9;
                                pattern = pattern2;
                                arrayList3 = arrayList15;
                                arrayList = arrayList18;
                            }
                            c7648M26497 = c76410;
                        default:
                            str3 = str9;
                            pattern = pattern2;
                            arrayList3 = arrayList15;
                            arrayList = arrayList18;
                            arrayList2 = arrayList17;
                            c7648M26497 = c76410;
                            break;
                    }
                    i11++;
                    arrayList15 = arrayList3;
                    arrayList17 = arrayList2;
                    arrayList18 = arrayList;
                    pattern3 = pattern4;
                    str10 = str2;
                    str9 = str3;
                    pattern2 = pattern;
                    c7649 = c7648M26497;
                    str8 = str;
                }
                return new C5741(str, arrayList19, arrayList21, arrayList17, arrayList18, arrayList15, arrayList14, c7649, z4 ? Collections.EMPTY_LIST : arrayList23, z3, map2, arrayList20);
            }
            String strM34301 = c14209.m34301();
            ArrayList arrayList24 = arrayList8;
            if (strM34301.startsWith("#EXT")) {
                arrayList13.add(strM34301);
            }
            boolean zStartsWith = strM34301.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList25 = arrayList13;
            if (strM34301.startsWith("#EXT-X-DEFINE")) {
                map2.put(m5199(strM34301, pattern3, map2), m5199(strM34301, f6124, map2));
            } else {
                if (strM34301.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z2 = true;
                    arrayList11 = arrayList11;
                    arrayList7 = arrayList7;
                    arrayList12 = arrayList12;
                } else if (strM34301.startsWith("#EXT-X-MEDIA")) {
                    arrayList11.add(strM34301);
                } else if (strM34301.startsWith("#EXT-X-SESSION-KEY")) {
                    C18937 c18937M5204 = m5204(strM34301, m5198(strM34301, f6098, "identity", map2), map2);
                    if (c18937M5204 != null) {
                        String strM51916 = m5199(strM34301, f6146, map2);
                        arrayList12.add(new C8354(("SAMPLE-AES-CENC".equals(strM51916) || "SAMPLE-AES-CTR".equals(strM51916)) ? "cenc" : "cbcs", c18937M5204));
                    }
                } else {
                    if (strM34301.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                        boolean zContains = z | strM34301.contains("CLOSED-CAPTIONS=NONE");
                        int i18 = zStartsWith ? 16384 : 0;
                        int i19 = Integer.parseInt(m5199(strM34301, f6150, Collections.EMPTY_MAP));
                        Matcher matcher = f6102.matcher(strM34301);
                        if (matcher.find()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            i3 = Integer.parseInt(strGroup);
                        } else {
                            i3 = -1;
                        }
                        String strM51917 = m5198(strM34301, f6149, (String) null, map2);
                        String strM51918 = m5198(strM34301, f6141, (String) null, map2);
                        HashMap map3 = map;
                        String strM51919 = m5198(strM34301, f6115, (String) null, map2);
                        if (strM51919 != null) {
                            String str14 = C17983.f57504;
                            i4 = i18;
                            String[] strArrSplit2 = strM51919.split(",", 2)[0].split("/", -1);
                            str5 = strArrSplit2[0];
                            if (strArrSplit2.length > 1) {
                                str6 = strArrSplit2[1];
                                i5 = 2;
                            }
                            strM41860 = C17983.m41860(i5, strM51918);
                            int i20 = C6632.f22408;
                            if (strM41860 == null) {
                                i6 = i19;
                            } else {
                                if (strM41860.startsWith("dvhe")) {
                                    i6 = i19;
                                } else {
                                    i6 = i19;
                                    if (!strM41860.startsWith("dvh1") || (str5 != null && ((str5.startsWith("dvhe") && strM41860.startsWith("hev1")) || ((str5.startsWith("dvh1") && strM41860.startsWith("hvc1")) || ((str5.startsWith("dvav") && strM41860.startsWith("avc3")) || ((str5.startsWith("dva1") && strM41860.startsWith("avc1")) || (str5.startsWith("dav1") && strM41860.startsWith("av01")))))))) {
                                    }
                                }
                                if (str5 != null || (strM51917 != null && str6 != null && ((!strM51917.equals("PQ") || str6.equals("db1p")) && ((!strM51917.equals("SDR") || str6.equals("db2g")) && (!strM51917.equals("HLG") || str6.startsWith("db4")))))) {
                                    if (str5 == null) {
                                        str5 = strM41860;
                                    }
                                    strArrM41848 = C17983.m41848(strM51918);
                                    if (strArrM41848.length == 0) {
                                        string = null;
                                    } else {
                                        sb = new StringBuilder();
                                        length = strArrM41848.length;
                                        i7 = 0;
                                        while (i7 < length) {
                                            str7 = strArrM41848[i7];
                                            String[] strArr = strArrM41848;
                                            if (2 != C6632.m17981(C6632.m17986(str7))) {
                                                if (sb.length() > 0) {
                                                    sb.append(",");
                                                }
                                                sb.append(str7);
                                            }
                                            i7++;
                                            strArrM41848 = strArr;
                                        }
                                        if (sb.length() > 0) {
                                            string = sb.toString();
                                        } else {
                                            string = null;
                                        }
                                    }
                                    if (string != null) {
                                        strM51918 = C1679.m5594(str5, ",", string);
                                    } else {
                                        strM51918 = str5;
                                    }
                                }
                            }
                            strM5198 = m5198(strM34301, f6130, (String) null, map2);
                            if (strM5198 != null) {
                                String[] strArrSplit3 = strM5198.split("x", -1);
                                i9 = Integer.parseInt(strArrSplit3[0]);
                                i8 = Integer.parseInt(strArrSplit3[1]);
                                if (i9 > 0 || i8 <= 0) {
                                    i8 = -1;
                                    i9 = -1;
                                }
                            } else {
                                i8 = -1;
                                i9 = -1;
                            }
                            strM5199 = m5198(strM34301, f6152, (String) null, map2);
                            if (strM5199 != null) {
                                f = Float.parseFloat(strM5199);
                            } else {
                                f = -1.0f;
                            }
                            String strM51920 = m5198(strM34301, f6099, (String) null, map2);
                            String strM51921 = m5198(strM34301, f6121, (String) null, map2);
                            String strM51922 = m5198(strM34301, f6101, (String) null, map2);
                            String strM51923 = m5198(strM34301, f6129, (String) null, map2);
                            if (zStartsWith) {
                                uriM50741 = C22923.m50741(str8, m5199(strM34301, pattern2, map2));
                            } else {
                                if (c14209.m34300()) {
                                    throw C22861.m50608("#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriM50741 = C22923.m50741(str8, m5197(c14209.m34301(), map2));
                            }
                            C10471 c10472 = new C10471();
                            c10472.m26523(arrayList6.size());
                            c10472.m26521("application/x-mpegURL");
                            c10472.m26502(strM51918);
                            c10472.m26515(i3);
                            int i21 = i6;
                            c10472.m26528(i21);
                            c10472.m26525(i9);
                            c10472.m26534(i8);
                            c10472.m26498(f);
                            c10472.m26513(i4);
                            arrayList6.add(new C17030(uriM50741, c10472.m26497(), strM51920, strM51921, strM51922, strM51923));
                            map = map3;
                            arrayList5 = (ArrayList) map.get(uriM50741);
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                                map.put(uriM50741, arrayList5);
                            }
                            arrayList5.add(new C21969(i3, i21, strM51920, strM51921, strM51922, strM51923));
                            z = zContains;
                        } else {
                            i4 = i18;
                            str5 = null;
                        }
                        i5 = 2;
                        str6 = null;
                        strM41860 = C17983.m41860(i5, strM51918);
                        int i22 = C6632.f22408;
                        if (strM41860 == null) {
                            i6 = i19;
                        } else {
                            if (strM41860.startsWith("dvhe")) {
                                i6 = i19;
                                if (!strM41860.startsWith("dvh1")) {
                                }
                            } else {
                                i6 = i19;
                            }
                            if (str5 != null) {
                                if (str5 == null) {
                                    str5 = strM41860;
                                }
                                strArrM41848 = C17983.m41848(strM51918);
                                if (strArrM41848.length == 0) {
                                    string = null;
                                } else {
                                    sb = new StringBuilder();
                                    length = strArrM41848.length;
                                    i7 = 0;
                                    while (i7 < length) {
                                        str7 = strArrM41848[i7];
                                        String[] strArr2 = strArrM41848;
                                        if (2 != C6632.m17981(C6632.m17986(str7))) {
                                            if (sb.length() > 0) {
                                                sb.append(",");
                                            }
                                            sb.append(str7);
                                        }
                                        i7++;
                                        strArrM41848 = strArr2;
                                    }
                                    if (sb.length() > 0) {
                                        string = sb.toString();
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string != null) {
                                    strM51918 = C1679.m5594(str5, ",", string);
                                } else {
                                    strM51918 = str5;
                                }
                            } else {
                                if (str5 == null) {
                                    str5 = strM41860;
                                }
                                strArrM41848 = C17983.m41848(strM51918);
                                if (strArrM41848.length == 0) {
                                    string = null;
                                } else {
                                    sb = new StringBuilder();
                                    length = strArrM41848.length;
                                    i7 = 0;
                                    while (i7 < length) {
                                        str7 = strArrM41848[i7];
                                        String[] strArr3 = strArrM41848;
                                        if (2 != C6632.m17981(C6632.m17986(str7))) {
                                            if (sb.length() > 0) {
                                                sb.append(",");
                                            }
                                            sb.append(str7);
                                        }
                                        i7++;
                                        strArrM41848 = strArr3;
                                    }
                                    if (sb.length() > 0) {
                                        string = sb.toString();
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string != null) {
                                    strM51918 = C1679.m5594(str5, ",", string);
                                } else {
                                    strM51918 = str5;
                                }
                            }
                        }
                        strM5198 = m5198(strM34301, f6130, (String) null, map2);
                        if (strM5198 != null) {
                            String[] strArrSplit4 = strM5198.split("x", -1);
                            i9 = Integer.parseInt(strArrSplit4[0]);
                            i8 = Integer.parseInt(strArrSplit4[1]);
                            if (i9 > 0) {
                                i8 = -1;
                                i9 = -1;
                            } else {
                                i8 = -1;
                                i9 = -1;
                            }
                        } else {
                            i8 = -1;
                            i9 = -1;
                        }
                        strM5199 = m5198(strM34301, f6152, (String) null, map2);
                        if (strM5199 != null) {
                            f = Float.parseFloat(strM5199);
                        } else {
                            f = -1.0f;
                        }
                        String strM51924 = m5198(strM34301, f6099, (String) null, map2);
                        String strM51925 = m5198(strM34301, f6121, (String) null, map2);
                        String strM51926 = m5198(strM34301, f6101, (String) null, map2);
                        String strM51927 = m5198(strM34301, f6129, (String) null, map2);
                        if (zStartsWith) {
                            uriM50741 = C22923.m50741(str8, m5199(strM34301, pattern2, map2));
                        } else {
                            if (c14209.m34300()) {
                                throw C22861.m50608("#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriM50741 = C22923.m50741(str8, m5197(c14209.m34301(), map2));
                        }
                        C10471 c10473 = new C10471();
                        c10473.m26523(arrayList6.size());
                        c10473.m26521("application/x-mpegURL");
                        c10473.m26502(strM51918);
                        c10473.m26515(i3);
                        int i23 = i6;
                        c10473.m26528(i23);
                        c10473.m26525(i9);
                        c10473.m26534(i8);
                        c10473.m26498(f);
                        c10473.m26513(i4);
                        arrayList6.add(new C17030(uriM50741, c10473.m26497(), strM51924, strM51925, strM51926, strM51927));
                        map = map3;
                        arrayList5 = (ArrayList) map.get(uriM50741);
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            map.put(uriM50741, arrayList5);
                        }
                        arrayList5.add(new C21969(i3, i23, strM51924, strM51925, strM51926, strM51927));
                        z = zContains;
                    }
                    z2 = z3;
                }
                arrayList10 = arrayList14;
                arrayList9 = arrayList15;
                arrayList8 = arrayList24;
                arrayList13 = arrayList25;
                arrayList12 = arrayList12;
                arrayList7 = arrayList7;
                arrayList11 = arrayList11;
            }
            arrayList12 = arrayList12;
            z2 = z3;
            arrayList10 = arrayList14;
            arrayList9 = arrayList15;
            arrayList8 = arrayList24;
            arrayList13 = arrayList25;
            arrayList12 = arrayList12;
            arrayList7 = arrayList7;
            arrayList11 = arrayList11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:205:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:212:0x0608  */
    /* JADX WARN: Code duplicated, block: B:214:0x060c  */
    /* JADX WARN: Code duplicated, block: B:215:0x060f  */
    /* JADX WARN: Code duplicated, block: B:232:0x066d  */
    /* JADX WARN: Code duplicated, block: B:235:0x067d  */
    /* JADX WARN: Code duplicated, block: B:237:0x068f  */
    /* JADX WARN: Code duplicated, block: B:238:0x0696  */
    /* JADX WARN: Code duplicated, block: B:241:0x069c  */
    /* JADX WARN: Code duplicated, block: B:247:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:251:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:293:0x07bf A[PHI: r45
      0x07bf: PHI (r45v18 int) = (r45v14 int), (r45v15 int), (r45v16 int), (r45v19 int) binds: [B:290:0x07ba, B:286:0x07ad, B:282:0x07a0, B:280:0x0795] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:350:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:359:0x0909  */
    /* JADX WARN: Code duplicated, block: B:402:0x09b1 A[PHI: r58
      0x09b1: PHI (r58v11 java.util.regex.Matcher) = 
      (r58v1 java.util.regex.Matcher)
      (r58v2 java.util.regex.Matcher)
      (r58v3 java.util.regex.Matcher)
      (r58v4 java.util.regex.Matcher)
      (r58v5 java.util.regex.Matcher)
      (r58v6 java.util.regex.Matcher)
      (r58v7 java.util.regex.Matcher)
      (r58v8 java.util.regex.Matcher)
      (r58v9 java.util.regex.Matcher)
      (r58v12 java.util.regex.Matcher)
     binds: [B:399:0x09ac, B:395:0x099f, B:391:0x0992, B:387:0x0985, B:383:0x0978, B:379:0x096b, B:375:0x095e, B:371:0x094f, B:367:0x093f, B:365:0x0933] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16325 m5203(C5741 c5741, C16325 c16325, C14209 c14209, String str) throws C22861, C23381 {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeMap treeMap;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList4;
        int i;
        String str2;
        AbstractC22433 abstractC22433;
        TreeMap treeMap2;
        String strM5198;
        String str3;
        String strM5199;
        int i2;
        String hexString;
        String str4;
        String str5;
        long j;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String str6;
        String str7;
        String str8;
        Matcher matcher;
        byte b;
        C19147 c19147;
        int i3;
        byte b2;
        String hexString2;
        String str9;
        boolean z;
        String strM51910;
        long j2;
        C18937[] c18937Arr;
        String[] strArrSplit;
        boolean z2 = c5741.f36443;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        C0096 c0096 = new C0096(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap3 = new TreeMap();
        String str10 = "";
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        boolean zM5205 = false;
        c16325 = c16325;
        C5741 c5742 = c5741;
        boolean z4 = z2;
        ArrayList arrayList11 = arrayList8;
        C0096 c0097 = c0096;
        String strM51911 = "";
        long j3 = -1;
        C7152 c7152 = null;
        String str11 = null;
        C8354 c8354M5202 = null;
        C8354 c8354 = null;
        C15620 c15620 = null;
        String str12 = null;
        int i6 = 1;
        long j4 = -9223372036854775807L;
        long j5 = 0;
        long j6 = -9223372036854775807L;
        long j7 = -9223372036854775807L;
        long j8 = 0;
        boolean z5 = false;
        char c = 0;
        long j9 = 0;
        long j10 = 0;
        boolean z6 = false;
        int i7 = 0;
        boolean z7 = false;
        long j11 = 0;
        long jLongValue = 0;
        long j12 = 0;
        String str13 = null;
        long jM41827 = 0;
        while (c14209.m34300()) {
            String strM34301 = c14209.m34301();
            if (strM34301.startsWith("#EXT")) {
                arrayList10.add(strM34301);
            }
            if (strM34301.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strM51912 = m5199(strM34301, f6109, map);
                if ("VOD".equals(strM51912)) {
                    i4 = 1;
                } else if ("EVENT".equals(strM51912)) {
                    i4 = 2;
                }
            } else if (strM34301.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else {
                if (strM34301.startsWith("#EXT-X-START")) {
                    i6 = i6;
                    long j13 = (long) (Double.parseDouble(m5199(strM34301, f6111, Collections.EMPTY_MAP)) * 1000000.0d);
                    zM5205 = m5205(f6105, strM34301);
                    j4 = j13;
                    linkedHashMap = linkedHashMap3;
                    arrayList10 = arrayList10;
                } else {
                    i6 = i6;
                    if (strM34301.startsWith("#EXT-X-SERVER-CONTROL")) {
                        linkedHashMap = linkedHashMap3;
                        arrayList10 = arrayList10;
                        double dM5196 = m5196(strM34301, f6139, -9.223372036854776E18d);
                        long j14 = dM5196 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM5196 * 1000000.0d);
                        boolean zM5206 = m5205(f6106, strM34301);
                        double dM5197 = m5196(strM34301, f6110, -9.223372036854776E18d);
                        long j15 = dM5197 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM5197 * 1000000.0d);
                        double dM5198 = m5196(strM34301, f6138, -9.223372036854776E18d);
                        c0097 = new C0096(j14, zM5206, j15, dM5198 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM5198 * 1000000.0d), m5205(f6137, strM34301));
                    } else {
                        linkedHashMap = linkedHashMap3;
                        arrayList10 = arrayList10;
                        if (strM34301.startsWith("#EXT-X-PART-INF")) {
                            j7 = (long) (Double.parseDouble(m5199(strM34301, f6107, Collections.EMPTY_MAP)) * 1000000.0d);
                        } else {
                            boolean zStartsWith = strM34301.startsWith("#EXT-X-MAP");
                            Pattern pattern = f6097;
                            linkedHashMap3 = linkedHashMap;
                            Pattern pattern2 = f6096;
                            if (zStartsWith) {
                                String strM51913 = m5199(strM34301, pattern2, map);
                                String strM51914 = m5198(strM34301, pattern, (String) null, map);
                                if (strM51914 != null) {
                                    String str14 = C17983.f57504;
                                    String[] strArrSplit2 = strM51914.split("@", -1);
                                    j3 = Long.parseLong(strArrSplit2[c]);
                                    if (strArrSplit2.length > 1) {
                                        j8 = Long.parseLong(strArrSplit2[1]);
                                    }
                                }
                                long j16 = j3;
                                long j17 = j16 == -1 ? 0L : j8;
                                if (str12 != null && str13 == null) {
                                    throw C22861.m50608("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                                }
                                C15620 c15621 = new C15620(strM51913, j17, j16, str12, str13);
                                if (j16 != -1) {
                                    j17 += j16;
                                }
                                j8 = j17;
                                arrayList10 = arrayList10;
                                c15620 = c15621;
                                j3 = -1;
                                linkedHashMap3 = linkedHashMap3;
                                i6 = i6;
                            } else {
                                map2 = map2;
                                C7152 c7153 = c7152;
                                if (strM34301.startsWith("#EXT-X-TARGETDURATION")) {
                                    j6 = ((long) Integer.parseInt(m5199(strM34301, f6153, Collections.EMPTY_MAP))) * 1000000;
                                } else if (strM34301.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                    j5 = Long.parseLong(m5199(strM34301, f6151, Collections.EMPTY_MAP));
                                    j10 = j5;
                                    treeMap3 = treeMap3;
                                    str11 = str11;
                                    arrayList10 = arrayList10;
                                    treeMap3 = treeMap3;
                                    map2 = map2;
                                    linkedHashMap3 = linkedHashMap3;
                                    i6 = i6;
                                    c7152 = c7153;
                                    c5742 = c5742;
                                } else if (strM34301.startsWith("#EXT-X-VERSION")) {
                                    i6 = Integer.parseInt(m5199(strM34301, f6090, Collections.EMPTY_MAP));
                                } else {
                                    if (strM34301.startsWith("#EXT-X-DEFINE")) {
                                        String strM51915 = m5198(strM34301, f6095, (String) null, map);
                                        if (strM51915 != null) {
                                            String str15 = (String) c5742.f19535.get(strM51915);
                                            if (str15 != null) {
                                                map.put(strM51915, str15);
                                            }
                                        } else {
                                            map.put(m5199(strM34301, f6136, map), m5199(strM34301, f6124, map));
                                        }
                                        str11 = str11;
                                        treeMap3 = treeMap3;
                                    } else if (strM34301.startsWith("#EXTINF")) {
                                        jLongValue = new BigDecimal(m5199(strM34301, f6103, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                        strM51911 = m5198(strM34301, f6128, str10, map);
                                    } else {
                                        if (strM34301.startsWith("#EXT-X-SKIP")) {
                                            int i8 = Integer.parseInt(m5199(strM34301, f6132, Collections.EMPTY_MAP));
                                            C2023.m6510(c16325 != null && arrayList7.isEmpty());
                                            String str16 = C17983.f57504;
                                            long j18 = c16325.f52591;
                                            AbstractC22433 abstractC22434 = c16325.f52586;
                                            int i9 = (int) (j5 - j18);
                                            int i10 = i8 + i9;
                                            if (i9 < 0 || i10 > abstractC22434.size()) {
                                                throw new C23381();
                                            }
                                            while (i9 < i10) {
                                                C15620 c15622 = (C15620) abstractC22434.get(i9);
                                                if (j5 != c16325.f52591) {
                                                    int i11 = (c16325.f52573 - i5) + c15622.f63683;
                                                    AbstractC22433 abstractC22435 = c15622.f50799;
                                                    ArrayList arrayList12 = new ArrayList();
                                                    long j19 = j11;
                                                    int i12 = 0;
                                                    while (i12 < abstractC22435.size()) {
                                                        C7152 c7154 = (C7152) abstractC22435.get(i12);
                                                        arrayList12.add(new C7152(c7154.f63674, c7154.f63676, c7154.f63680, i11, j19, c7154.f63673, c7154.f63681, c7154.f63677, c7154.f63682, c7154.f63679, c7154.f63675, c7154.f23910, c7154.f23909));
                                                        j19 += c7154.f63680;
                                                        i12++;
                                                        treeMap3 = treeMap3;
                                                        i10 = i10;
                                                        abstractC22434 = abstractC22434;
                                                        str11 = str11;
                                                    }
                                                    i = i10;
                                                    str2 = str11;
                                                    abstractC22433 = abstractC22434;
                                                    treeMap2 = treeMap3;
                                                    c15622 = new C15620(c15622.f63674, c15622.f63676, c15622.f50798, c15622.f63680, i11, j11, c15622.f63673, c15622.f63681, c15622.f63677, c15622.f63682, c15622.f63679, c15622.f63675, arrayList12);
                                                } else {
                                                    i = i10;
                                                    str2 = str11;
                                                    abstractC22433 = abstractC22434;
                                                    treeMap2 = treeMap3;
                                                }
                                                arrayList7.add(c15622);
                                                long j20 = c15622.f63680;
                                                String str17 = c15622.f63677;
                                                j11 += j20;
                                                long j21 = c15622.f63679;
                                                if (j21 != -1) {
                                                    j8 = c15622.f63682 + j21;
                                                }
                                                int i13 = c15622.f63683;
                                                C15620 c15623 = c15622.f63676;
                                                C8354 c8355 = c15622.f63673;
                                                String str18 = c15622.f63681;
                                                if (str17 == null || !str17.equals(Long.toHexString(j10))) {
                                                    str13 = str17;
                                                }
                                                j10++;
                                                i9++;
                                                c16325 = c16325;
                                                i7 = i13;
                                                c15620 = c15623;
                                                str12 = str18;
                                                c8354 = c8355;
                                                treeMap3 = treeMap2;
                                                i10 = i;
                                                abstractC22434 = abstractC22433;
                                                j9 = j11;
                                                str11 = str2;
                                            }
                                            c5742 = c5741;
                                            arrayList10 = arrayList10;
                                            map2 = map2;
                                            linkedHashMap3 = linkedHashMap3;
                                        } else {
                                            str11 = str11;
                                            treeMap3 = treeMap3;
                                            if (strM34301.startsWith("#EXT-X-KEY")) {
                                                String strM51916 = m5199(strM34301, f6146, map);
                                                String strM51917 = m5198(strM34301, f6098, "identity", map);
                                                if ("NONE".equals(strM51916)) {
                                                    treeMap3.clear();
                                                    str3 = null;
                                                    str11 = str11;
                                                } else {
                                                    strM5198 = m5198(strM34301, f6089, (String) null, map);
                                                    if ("identity".equals(strM51917)) {
                                                        if ("AES-128".equals(strM51916)) {
                                                            strM5199 = m5199(strM34301, pattern2, map);
                                                            str11 = str11;
                                                        } else {
                                                            str11 = str11;
                                                        }
                                                        c16325 = c16325;
                                                        str12 = strM5199;
                                                        str13 = strM5198;
                                                        c5742 = c5741;
                                                        arrayList10 = arrayList10;
                                                        treeMap3 = treeMap3;
                                                        map2 = map2;
                                                        linkedHashMap3 = linkedHashMap3;
                                                        i6 = i6;
                                                        c7152 = c7153;
                                                        c5742 = c5742;
                                                    } else {
                                                        str11 = str11 == null ? ("SAMPLE-AES-CENC".equals(strM51916) || "SAMPLE-AES-CTR".equals(strM51916)) ? "cenc" : "cbcs" : str11;
                                                        C18937 c18937M5204 = m5204(strM34301, strM51917, map);
                                                        if (c18937M5204 != null) {
                                                            treeMap3.put(strM51917, c18937M5204);
                                                            str3 = strM5198;
                                                        }
                                                    }
                                                    strM5199 = null;
                                                    c16325 = c16325;
                                                    str12 = strM5199;
                                                    str13 = strM5198;
                                                    c5742 = c5741;
                                                    arrayList10 = arrayList10;
                                                    treeMap3 = treeMap3;
                                                    map2 = map2;
                                                    linkedHashMap3 = linkedHashMap3;
                                                    i6 = i6;
                                                    c7152 = c7153;
                                                    c5742 = c5742;
                                                }
                                                c8354 = null;
                                                strM5198 = str3;
                                                strM5199 = null;
                                                c16325 = c16325;
                                                str12 = strM5199;
                                                str13 = strM5198;
                                                c5742 = c5741;
                                                arrayList10 = arrayList10;
                                                treeMap3 = treeMap3;
                                                map2 = map2;
                                                linkedHashMap3 = linkedHashMap3;
                                                i6 = i6;
                                                c7152 = c7153;
                                                c5742 = c5742;
                                            } else {
                                                if (strM34301.startsWith("#EXT-X-BYTERANGE")) {
                                                    String strM51918 = m5199(strM34301, f6127, map);
                                                    String str19 = C17983.f57504;
                                                    String[] strArrSplit3 = strM51918.split("@", -1);
                                                    j3 = Long.parseLong(strArrSplit3[c]);
                                                    if (strArrSplit3.length > 1) {
                                                        j8 = Long.parseLong(strArrSplit3[1]);
                                                    }
                                                } else {
                                                    if (strM34301.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                                        i5 = Integer.parseInt(strM34301.substring(strM34301.indexOf(58) + 1));
                                                        z3 = true;
                                                    } else if (strM34301.equals("#EXT-X-DISCONTINUITY")) {
                                                        i7++;
                                                    } else {
                                                        if (strM34301.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                            if (jM41827 == 0) {
                                                                jM41827 = C17983.m41827(C17983.m41808(strM34301.substring(strM34301.indexOf(58) + 1))) - j11;
                                                            }
                                                        } else if (strM34301.equals("#EXT-X-GAP")) {
                                                            z6 = true;
                                                        } else if (strM34301.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                            z4 = true;
                                                        } else {
                                                            if (strM34301.equals("#EXT-X-ENDLIST")) {
                                                                z5 = true;
                                                            } else {
                                                                if (strM34301.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                                    long jM5206 = m5206(f6122, strM34301);
                                                                    Matcher matcher2 = f6094.matcher(strM34301);
                                                                    if (matcher2.find()) {
                                                                        String strGroup = matcher2.group(1);
                                                                        strGroup.getClass();
                                                                        i2 = Integer.parseInt(strGroup);
                                                                    } else {
                                                                        i2 = -1;
                                                                    }
                                                                    arrayList9.add(new C20558(Uri.parse(C22923.m50738(str, m5199(strM34301, pattern2, map))), jM5206, i2));
                                                                } else {
                                                                    if (!strM34301.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                                        str5 = str11;
                                                                        if (strM34301.startsWith("#EXT-X-PART")) {
                                                                            if (str12 == null) {
                                                                                hexString2 = null;
                                                                            } else {
                                                                                if (str13 != null) {
                                                                                    str9 = str13;
                                                                                } else {
                                                                                    hexString2 = Long.toHexString(j10);
                                                                                }
                                                                                String strM51919 = m5199(strM34301, pattern2, map);
                                                                                long j22 = (long) (Double.parseDouble(m5199(strM34301, f6147, Collections.EMPTY_MAP)) * 1000000.0d);
                                                                                boolean zM5207 = m5205(f6123, strM34301);
                                                                                if (z4 || !arrayList11.isEmpty()) {
                                                                                    z = false;
                                                                                } else {
                                                                                    z = true;
                                                                                }
                                                                                boolean z8 = zM5207 | z;
                                                                                boolean zM5208 = m5205(f6125, strM34301);
                                                                                strM51910 = m5198(strM34301, pattern, (String) null, map);
                                                                                if (strM51910 != null) {
                                                                                    String str20 = C17983.f57504;
                                                                                    strArrSplit = strM51910.split("@", -1);
                                                                                    j2 = Long.parseLong(strArrSplit[0]);
                                                                                    if (strArrSplit.length > 1) {
                                                                                        j12 = Long.parseLong(strArrSplit[1]);
                                                                                    }
                                                                                } else {
                                                                                    j2 = -1;
                                                                                }
                                                                                if (j2 == -1) {
                                                                                    j12 = 0;
                                                                                }
                                                                                if (c8354 == null && !treeMap3.isEmpty()) {
                                                                                    c18937Arr = (C18937[]) treeMap3.values().toArray(new C18937[0]);
                                                                                    C8354 c8356 = new C8354(str5, c18937Arr);
                                                                                    if (c8354M5202 == null) {
                                                                                        c8354M5202 = m5202(str5, c18937Arr);
                                                                                    }
                                                                                    c8354 = c8356;
                                                                                }
                                                                                arrayList5 = arrayList11;
                                                                                arrayList5.add(new C7152(strM51919, c15620, j22, i7, j9, c8354, str12, str9, j12, j2, zM5208, z8, false));
                                                                                j9 += j22;
                                                                                if (j2 != -1) {
                                                                                    j12 += j2;
                                                                                }
                                                                                c7152 = c7153;
                                                                            }
                                                                            str9 = hexString2;
                                                                            String strM519110 = m5199(strM34301, pattern2, map);
                                                                            long j23 = (long) (Double.parseDouble(m5199(strM34301, f6147, Collections.EMPTY_MAP)) * 1000000.0d);
                                                                            boolean zM5209 = m5205(f6123, strM34301);
                                                                            if (z4) {
                                                                                z = false;
                                                                            } else {
                                                                                z = false;
                                                                            }
                                                                            boolean z9 = zM5209 | z;
                                                                            boolean zM52010 = m5205(f6125, strM34301);
                                                                            strM51910 = m5198(strM34301, pattern, (String) null, map);
                                                                            if (strM51910 != null) {
                                                                                String str21 = C17983.f57504;
                                                                                strArrSplit = strM51910.split("@", -1);
                                                                                j2 = Long.parseLong(strArrSplit[0]);
                                                                                if (strArrSplit.length > 1) {
                                                                                    j12 = Long.parseLong(strArrSplit[1]);
                                                                                }
                                                                            } else {
                                                                                j2 = -1;
                                                                            }
                                                                            if (j2 == -1) {
                                                                                j12 = 0;
                                                                            }
                                                                            if (c8354 == null) {
                                                                                c18937Arr = (C18937[]) treeMap3.values().toArray(new C18937[0]);
                                                                                C8354 c8357 = new C8354(str5, c18937Arr);
                                                                                if (c8354M5202 == null) {
                                                                                    c8354M5202 = m5202(str5, c18937Arr);
                                                                                }
                                                                                c8354 = c8357;
                                                                            }
                                                                            arrayList5 = arrayList11;
                                                                            arrayList5.add(new C7152(strM519110, c15620, j23, i7, j9, c8354, str12, str9, j12, j2, zM52010, z9, false));
                                                                            j9 += j23;
                                                                            if (j2 != -1) {
                                                                                j12 += j2;
                                                                            }
                                                                            c7152 = c7153;
                                                                        } else {
                                                                            ArrayList arrayList13 = arrayList11;
                                                                            if (strM34301.startsWith("#EXT-X-DATERANGE") && m5198(strM34301, f6104, str10, map).equals("com.apple.hls.interstitial")) {
                                                                                String strM51920 = m5199(strM34301, f6091, map);
                                                                                String strM51921 = m5198(strM34301, f6088, (String) null, map);
                                                                                Uri uri = strM51921 != null ? Uri.parse(strM51921) : null;
                                                                                String strM51922 = m5198(strM34301, f6116, (String) null, map);
                                                                                Uri uri2 = strM51922 != null ? Uri.parse(strM51922) : null;
                                                                                String strM51923 = m5198(strM34301, f6134, (String) null, map);
                                                                                long jM41828 = strM51923 != null ? C17983.m41827(C17983.m41808(strM51923)) : -9223372036854775807L;
                                                                                String strM51924 = m5198(strM34301, f6133, (String) null, map);
                                                                                long jM41829 = strM51924 != null ? C17983.m41827(C17983.m41808(strM51924)) : -9223372036854775807L;
                                                                                ArrayList arrayList14 = new ArrayList();
                                                                                String strM51925 = m5198(strM34301, f6131, (String) null, map);
                                                                                if (strM51925 != null) {
                                                                                    String str22 = C17983.f57504;
                                                                                    String[] strArrSplit4 = strM51925.split(",", -1);
                                                                                    int length = strArrSplit4.length;
                                                                                    int i14 = 0;
                                                                                    while (i14 < length) {
                                                                                        String[] strArr = strArrSplit4;
                                                                                        String strTrim = strArrSplit4[i14].trim();
                                                                                        strTrim.getClass();
                                                                                        switch (strTrim.hashCode()) {
                                                                                            case 79491:
                                                                                                i3 = length;
                                                                                                if (!strTrim.equals("PRE")) {
                                                                                                    b2 = -1;
                                                                                                } else {
                                                                                                    b2 = 0;
                                                                                                }
                                                                                                break;
                                                                                            case 2430593:
                                                                                                i3 = length;
                                                                                                if (!strTrim.equals("ONCE")) {
                                                                                                    b2 = -1;
                                                                                                } else {
                                                                                                    b2 = 1;
                                                                                                }
                                                                                                break;
                                                                                            case 2461856:
                                                                                                i3 = length;
                                                                                                if (!strTrim.equals("POST")) {
                                                                                                    b2 = -1;
                                                                                                } else {
                                                                                                    b2 = 2;
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                i3 = length;
                                                                                                b2 = -1;
                                                                                                break;
                                                                                        }
                                                                                        switch (b2) {
                                                                                            case 0:
                                                                                            case 1:
                                                                                            case 2:
                                                                                                arrayList14.add(strTrim);
                                                                                                break;
                                                                                        }
                                                                                        i14++;
                                                                                        length = i3;
                                                                                        strArrSplit4 = strArr;
                                                                                    }
                                                                                }
                                                                                arrayList6 = arrayList7;
                                                                                double dM5199 = m5196(strM34301, f6084, -1.0d);
                                                                                long j24 = dM5199 >= 0.0d ? (long) (dM5199 * 1000000.0d) : -9223372036854775807L;
                                                                                str11 = str5;
                                                                                double dM51910 = m5196(strM34301, f6140, -1.0d);
                                                                                long j25 = dM51910 >= 0.0d ? (long) (dM51910 * 1000000.0d) : -9223372036854775807L;
                                                                                boolean zM52011 = m5205(f6100, strM34301);
                                                                                arrayList = arrayList10;
                                                                                arrayList2 = arrayList9;
                                                                                double dM51911 = m5196(strM34301, f6083, Double.MIN_VALUE);
                                                                                long j26 = dM51911 != Double.MIN_VALUE ? (long) (dM51911 * 1000000.0d) : -9223372036854775807L;
                                                                                double dM51912 = m5196(strM34301, f6113, -1.0d);
                                                                                long j27 = dM51912 >= 0.0d ? (long) (dM51912 * 1000000.0d) : -9223372036854775807L;
                                                                                ArrayList arrayList15 = new ArrayList();
                                                                                arrayList4 = arrayList13;
                                                                                treeMap = treeMap3;
                                                                                String strM51926 = m5198(strM34301, f6120, (String) null, map);
                                                                                if (strM51926 != null) {
                                                                                    String str23 = C17983.f57504;
                                                                                    String[] strArrSplit5 = strM51926.split(",", -1);
                                                                                    int length2 = strArrSplit5.length;
                                                                                    int i15 = 0;
                                                                                    while (i15 < length2) {
                                                                                        String strTrim2 = strArrSplit5[i15].trim();
                                                                                        strTrim2.getClass();
                                                                                        String[] strArr2 = strArrSplit5;
                                                                                        if (strTrim2.equals("IN") || strTrim2.equals("OUT")) {
                                                                                            arrayList15.add(strTrim2);
                                                                                        }
                                                                                        i15++;
                                                                                        strArrSplit5 = strArr2;
                                                                                    }
                                                                                }
                                                                                ArrayList arrayList16 = new ArrayList();
                                                                                String strM51927 = m5198(strM34301, f6142, (String) null, map);
                                                                                if (strM51927 != null) {
                                                                                    String str24 = C17983.f57504;
                                                                                    String[] strArrSplit6 = strM51927.split(",", -1);
                                                                                    int length3 = strArrSplit6.length;
                                                                                    int i16 = 0;
                                                                                    while (i16 < length3) {
                                                                                        String strTrim3 = strArrSplit6[i16].trim();
                                                                                        strTrim3.getClass();
                                                                                        String[] strArr3 = strArrSplit6;
                                                                                        if (strTrim3.equals("JUMP") || strTrim3.equals("SKIP")) {
                                                                                            arrayList16.add(strTrim3);
                                                                                        }
                                                                                        i16++;
                                                                                        strArrSplit6 = strArr3;
                                                                                    }
                                                                                }
                                                                                String strM51928 = m5198(strM34301, f6082, (String) null, map);
                                                                                Boolean boolValueOf = strM51928 != null ? Boolean.valueOf(!strM51928.equals("NO")) : null;
                                                                                String strM51929 = m5198(strM34301, f6126, (String) null, map);
                                                                                if (strM51929 != null) {
                                                                                    str7 = "RANGE";
                                                                                    if (!strM51929.equals("RANGE")) {
                                                                                        str7 = "POINT";
                                                                                        if (!strM51929.equals("POINT")) {
                                                                                            str7 = null;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    str7 = null;
                                                                                }
                                                                                String strM51930 = m5198(strM34301, f6087, (String) null, map);
                                                                                if (strM51930 != null) {
                                                                                    str8 = "PRIMARY";
                                                                                    if (!strM51930.equals("PRIMARY")) {
                                                                                        str8 = "HIGHLIGHT";
                                                                                        if (!strM51930.equals("HIGHLIGHT")) {
                                                                                            str8 = null;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    str8 = null;
                                                                                }
                                                                                ArrayList arrayList17 = new ArrayList();
                                                                                String str25 = str8;
                                                                                String strSubstring = strM34301.substring(17);
                                                                                Matcher matcher3 = f6143.matcher(strSubstring);
                                                                                while (matcher3.find()) {
                                                                                    String str26 = str7;
                                                                                    String strGroup2 = matcher3.group();
                                                                                    strGroup2.getClass();
                                                                                    switch (strGroup2.hashCode()) {
                                                                                        case -2136701954:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-SNAP=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 0;
                                                                                            }
                                                                                            break;
                                                                                        case -1843050726:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-CONTENT-MAY-VARY=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 1;
                                                                                            }
                                                                                            break;
                                                                                        case -148960310:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-PLAYOUT-LIMIT=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 2;
                                                                                            }
                                                                                            break;
                                                                                        case -36345757:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-TIMELINE-STYLE=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 3;
                                                                                            }
                                                                                            break;
                                                                                        case 397239341:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-ASSET-LIST=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 4;
                                                                                            }
                                                                                            break;
                                                                                        case 850193465:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-TIMELINE-OCCUPIES=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 5;
                                                                                            }
                                                                                            break;
                                                                                        case 1472528844:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-RESTRICT=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 6;
                                                                                            }
                                                                                            break;
                                                                                        case 1748487807:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-RESUME-OFFSET=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 7;
                                                                                            }
                                                                                            break;
                                                                                        case 1814205923:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-ASSET-URI=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 8;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            matcher = matcher3;
                                                                                            b = -1;
                                                                                            break;
                                                                                    }
                                                                                    switch (b) {
                                                                                        case 0:
                                                                                        case 1:
                                                                                        case 2:
                                                                                        case 3:
                                                                                        case 4:
                                                                                        case 5:
                                                                                        case 6:
                                                                                        case 7:
                                                                                        case 8:
                                                                                            arrayList14 = arrayList14;
                                                                                            j25 = j25;
                                                                                            break;
                                                                                        default:
                                                                                            String strM46498 = C20630.m46498(1, 0, strGroup2);
                                                                                            String strM37076 = C15489.m37076(strM46498, "=");
                                                                                            int length4 = strM37076.length() + strSubstring.indexOf(strM37076);
                                                                                            String strSubstring2 = strSubstring.substring(length4, (strSubstring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                                            if (strSubstring2.startsWith("\"")) {
                                                                                                c19147 = new C19147(0, strM46498, m5199(strSubstring, Pattern.compile(strM46498 + "=\"((?:.|\f)+?)\""), map));
                                                                                            } else if (strSubstring2.equals("0x") || strSubstring2.equals("0X")) {
                                                                                                c19147 = new C19147(1, strM46498, m5199(strSubstring, Pattern.compile(strM46498 + "=(0[xX][A-F0-9]+)"), map));
                                                                                            } else {
                                                                                                c19147 = new C19147(strM46498, Double.parseDouble(m5199(strSubstring, Pattern.compile(strM46498 + "=([\\d\\.]+)\\b"), Collections.EMPTY_MAP)));
                                                                                            }
                                                                                            arrayList17.add(c19147);
                                                                                            break;
                                                                                    }
                                                                                    arrayList14 = arrayList14;
                                                                                    str7 = str26;
                                                                                    matcher3 = matcher;
                                                                                    boolValueOf = boolValueOf;
                                                                                    arrayList16 = arrayList16;
                                                                                    j25 = j25;
                                                                                }
                                                                                ArrayList arrayList18 = arrayList16;
                                                                                Boolean bool = boolValueOf;
                                                                                ArrayList arrayList19 = arrayList14;
                                                                                long j28 = j25;
                                                                                String str27 = str7;
                                                                                linkedHashMap2 = linkedHashMap3;
                                                                                C8564 c8564 = linkedHashMap2.containsKey(strM51920) ? (C8564) linkedHashMap2.get(strM51920) : new C8564(strM51920);
                                                                                c8564.m22335(uri);
                                                                                c8564.m22326(uri2);
                                                                                c8564.m22338(jM41828);
                                                                                c8564.m22334(jM41829);
                                                                                c8564.m22325(j24);
                                                                                c8564.m22332(j28);
                                                                                c8564.m22337(arrayList19);
                                                                                c8564.m22330(zM52011);
                                                                                c8564.m22331(j26);
                                                                                c8564.m22322(j27);
                                                                                c8564.m22323(arrayList15);
                                                                                c8564.m22333(arrayList18);
                                                                                c8564.m22329(arrayList17);
                                                                                c8564.m22327(bool);
                                                                                c8564.m22328(str27);
                                                                                c8564.m22336(str25);
                                                                                linkedHashMap2.put(strM51920, c8564);
                                                                            } else {
                                                                                arrayList = arrayList10;
                                                                                arrayList2 = arrayList9;
                                                                                str11 = str5;
                                                                                treeMap = treeMap3;
                                                                                arrayList4 = arrayList13;
                                                                                str10 = str10;
                                                                                arrayList6 = arrayList7;
                                                                                linkedHashMap2 = linkedHashMap3;
                                                                                if (!strM34301.startsWith("#")) {
                                                                                    String hexString3 = str12 == null ? null : str13 != null ? str13 : Long.toHexString(j10);
                                                                                    long j29 = j10 + 1;
                                                                                    String strM5197 = m5197(strM34301, map);
                                                                                    map2 = map2;
                                                                                    C15620 c15624 = (C15620) map2.get(strM5197);
                                                                                    if (j3 == -1) {
                                                                                        j8 = 0;
                                                                                    } else if (z7 && c15620 == null && c15624 == null) {
                                                                                        c15624 = new C15620(strM5197, 0L, j8, null, null);
                                                                                        map2.put(strM5197, c15624);
                                                                                    }
                                                                                    if (c8354 != null || treeMap.isEmpty()) {
                                                                                        str6 = str11;
                                                                                    } else {
                                                                                        C18937[] c18937Arr2 = (C18937[]) treeMap.values().toArray(new C18937[0]);
                                                                                        str6 = str11;
                                                                                        C8354 c8358 = new C8354(str6, c18937Arr2);
                                                                                        if (c8354M5202 == null) {
                                                                                            c8354M5202 = m5202(str6, c18937Arr2);
                                                                                        }
                                                                                        c8354 = c8358;
                                                                                    }
                                                                                    arrayList6.add(new C15620(strM5197, c15620 != null ? c15620 : c15624, strM51911, jLongValue, i7, j11, c8354, str12, hexString3, j8, j3, z6, arrayList4));
                                                                                    j11 += jLongValue;
                                                                                    arrayList11 = new ArrayList();
                                                                                    if (j3 != -1) {
                                                                                        j8 += j3;
                                                                                    }
                                                                                    c = 0;
                                                                                    z6 = false;
                                                                                    c5742 = c5741;
                                                                                    arrayList7 = arrayList6;
                                                                                    j10 = j29;
                                                                                    str11 = str6;
                                                                                    j3 = -1;
                                                                                    treeMap3 = treeMap;
                                                                                    str10 = str10;
                                                                                    strM51911 = str10;
                                                                                    arrayList10 = arrayList;
                                                                                    arrayList9 = arrayList2;
                                                                                    j9 = j11;
                                                                                    jLongValue = 0;
                                                                                    linkedHashMap3 = linkedHashMap2;
                                                                                }
                                                                            }
                                                                            arrayList3 = arrayList6;
                                                                        }
                                                                    } else if (c7153 == null && "PART".equals(m5199(strM34301, f6144, map))) {
                                                                        String strM51931 = m5199(strM34301, pattern2, map);
                                                                        long jM5207 = m5206(f6135, strM34301);
                                                                        long jM5208 = m5206(f6145, strM34301);
                                                                        if (str12 == null) {
                                                                            hexString = null;
                                                                        } else {
                                                                            if (str13 != null) {
                                                                                str4 = str13;
                                                                            } else {
                                                                                hexString = Long.toHexString(j10);
                                                                            }
                                                                            if (c8354 == null || treeMap3.isEmpty()) {
                                                                                str5 = str11;
                                                                            } else {
                                                                                C18937[] c18937Arr3 = (C18937[]) treeMap3.values().toArray(new C18937[0]);
                                                                                str5 = str11;
                                                                                C8354 c8359 = new C8354(str5, c18937Arr3);
                                                                                if (c8354M5202 == null) {
                                                                                    c8354M5202 = m5202(str5, c18937Arr3);
                                                                                }
                                                                                c8354 = c8359;
                                                                            }
                                                                            if (jM5207 == -1 && jM5208 == -1) {
                                                                                c7152 = c7153;
                                                                            } else {
                                                                                if (jM5207 != -1) {
                                                                                    j = jM5207;
                                                                                } else {
                                                                                    j = 0;
                                                                                }
                                                                                c7152 = new C7152(strM51931, c15620, 0L, i7, j9, c8354, str12, str4, j, jM5208, false, false, true);
                                                                            }
                                                                            arrayList5 = arrayList11;
                                                                        }
                                                                        str4 = hexString;
                                                                        if (c8354 == null) {
                                                                            str5 = str11;
                                                                        } else {
                                                                            str5 = str11;
                                                                        }
                                                                        if (jM5207 == -1) {
                                                                            if (jM5207 != -1) {
                                                                                j = jM5207;
                                                                            } else {
                                                                                j = 0;
                                                                            }
                                                                            c7152 = new C7152(strM51931, c15620, 0L, i7, j9, c8354, str12, str4, j, jM5208, false, false, true);
                                                                        } else {
                                                                            if (jM5207 != -1) {
                                                                                j = jM5207;
                                                                            } else {
                                                                                j = 0;
                                                                            }
                                                                            c7152 = new C7152(strM51931, c15620, 0L, i7, j9, c8354, str12, str4, j, jM5208, false, false, true);
                                                                        }
                                                                        arrayList5 = arrayList11;
                                                                    }
                                                                    c = 0;
                                                                    str11 = str5;
                                                                    arrayList11 = arrayList5;
                                                                }
                                                                arrayList = arrayList10;
                                                                arrayList2 = arrayList9;
                                                                treeMap = treeMap3;
                                                                str10 = str10;
                                                                arrayList3 = arrayList7;
                                                                linkedHashMap2 = linkedHashMap3;
                                                                arrayList4 = arrayList11;
                                                            }
                                                            c5742 = c5741;
                                                        }
                                                        c = 0;
                                                        c5742 = c5741;
                                                        arrayList7 = arrayList3;
                                                        linkedHashMap3 = linkedHashMap2;
                                                        str11 = str11;
                                                        arrayList11 = arrayList4;
                                                        treeMap3 = treeMap;
                                                        str10 = str10;
                                                        arrayList10 = arrayList;
                                                        arrayList9 = arrayList2;
                                                        i6 = i6;
                                                        c7152 = c7153;
                                                        c16325 = c16325;
                                                    }
                                                    c7152 = c7153;
                                                    str11 = str11;
                                                    c5742 = c5741;
                                                }
                                                c5742 = c5741;
                                                c16325 = c16325;
                                                str11 = str11;
                                                arrayList10 = arrayList10;
                                                treeMap3 = treeMap3;
                                                map2 = map2;
                                                linkedHashMap3 = linkedHashMap3;
                                                i6 = i6;
                                                c7152 = c7153;
                                                c5742 = c5742;
                                            }
                                        }
                                        c7152 = c7153;
                                    }
                                    arrayList = arrayList10;
                                    arrayList2 = arrayList9;
                                    treeMap = treeMap3;
                                    str10 = str10;
                                    arrayList3 = arrayList7;
                                    linkedHashMap2 = linkedHashMap3;
                                    arrayList4 = arrayList11;
                                    c = 0;
                                    c5742 = c5741;
                                    arrayList7 = arrayList3;
                                    linkedHashMap3 = linkedHashMap2;
                                    str11 = str11;
                                    arrayList11 = arrayList4;
                                    treeMap3 = treeMap;
                                    str10 = str10;
                                    arrayList10 = arrayList;
                                    arrayList9 = arrayList2;
                                    i6 = i6;
                                    c7152 = c7153;
                                    c16325 = c16325;
                                }
                                treeMap3 = treeMap3;
                                str11 = str11;
                                arrayList10 = arrayList10;
                                treeMap3 = treeMap3;
                                map2 = map2;
                                linkedHashMap3 = linkedHashMap3;
                                i6 = i6;
                                c7152 = c7153;
                                c5742 = c5742;
                            }
                        }
                    }
                }
                arrayList10 = arrayList10;
                linkedHashMap3 = linkedHashMap;
                i6 = i6;
            }
        }
        int i17 = i6;
        C7152 c7155 = c7152;
        ArrayList arrayList20 = arrayList9;
        LinkedHashMap linkedHashMap4 = linkedHashMap3;
        ArrayList arrayList21 = arrayList10;
        ArrayList arrayList22 = arrayList7;
        ArrayList arrayList23 = arrayList11;
        HashMap map3 = new HashMap();
        int i18 = 0;
        while (i18 < arrayList20.size()) {
            ArrayList arrayList24 = arrayList20;
            C20558 c20558 = (C20558) arrayList24.get(i18);
            long size = c20558.f66587;
            if (size == -1) {
                size = (j5 + ((long) arrayList22.size())) - (arrayList23.isEmpty() ? 1L : 0L);
            }
            int size2 = c20558.f66589;
            if (size2 == -1 && j7 != -9223372036854775807L) {
                size2 = (arrayList23.isEmpty() ? ((C15620) C22808.m50475(arrayList22)).f50799 : arrayList23).size() - 1;
            }
            Uri uri3 = c20558.f66588;
            map3.put(uri3, new C20558(uri3, size, size2));
            i18++;
            arrayList20 = arrayList24;
        }
        if (c7155 != null) {
            arrayList23.add(c7155);
        }
        ArrayList arrayList25 = new ArrayList();
        Iterator it = linkedHashMap4.values().iterator();
        while (it.hasNext()) {
            C9975 c9975M22324 = ((C8564) it.next()).m22324();
            if (c9975M22324 != null) {
                arrayList25.add(c9975M22324);
            }
        }
        return new C16325(i4, str, arrayList21, j4, zM5205, jM41827, z3, i5, j5, i17, j6, j7, z4, z5, jM41827 != 0, c8354M5202, arrayList22, arrayList23, c0097, map3, arrayList25);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8354 m5202(String str, C18937[] c18937Arr) {
        C18937[] c18937Arr2 = new C18937[c18937Arr.length];
        for (int i = 0; i < c18937Arr.length; i++) {
            C18937 c18937 = c18937Arr[i];
            c18937Arr2[i] = new C18937(c18937.f61263, c18937.f61262, c18937.f61265, null);
        }
        return new C8354(str, c18937Arr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18937 m5204(String str, String str2, HashMap map) throws C22861 {
        String strM5198 = m5198(str, f6148, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f6096;
        if (zEquals) {
            String strM5199 = m5199(str, pattern, map);
            return new C18937(C1297.f5562, null, "video/mp4", Base64.decode(strM5199.substring(strM5199.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = C1297.f5562;
            String str3 = C17983.f57504;
            return new C18937(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strM5198)) {
            return null;
        }
        String strM51910 = m5199(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strM51910.substring(strM51910.indexOf(44)), 0);
        UUID uuid2 = C1297.f5563;
        return new C18937(uuid2, null, "video/mp4", C13987.m33838(uuid2, null, bArrDecode));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m5206(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5199(String str, Pattern pattern, Map map) throws C22861 {
        String strM5198 = m5198(str, pattern, (String) null, map);
        if (strM5198 != null) {
            return strM5198;
        }
        throw C22861.m50608("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5198(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m5197(str2, map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static double m5196(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5197(String str, Map map) {
        Matcher matcher = f6118.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m5205(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pattern m5200(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }
}
