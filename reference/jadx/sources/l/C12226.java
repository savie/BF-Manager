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

/* JADX INFO: renamed from: l.ۨ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97LV */
/* JADX INFO: loaded from: classes4.dex */
public final class C12226 implements InterfaceC9584 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15955 f39353;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24907 f39354;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39312 = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f39337 = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39295 = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39308 = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39320 = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f39351 = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39314 = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f39324 = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Pattern f39340 = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39284 = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39321 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39305 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39306 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39322 = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f39316 = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39290 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f39346 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39315 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Pattern f39338 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39289 = m30507("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39282 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39299 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39348 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f39347 = m30507("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39352 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39313 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39328 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39296 = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39286 = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39300 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39327 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39335 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39325 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39329 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39330 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39336 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39323 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f39294 = Pattern.compile("URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39345 = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39319 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39292 = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39317 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39326 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Pattern f39303 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39297 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39310 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f39285 = m30507("AUTOSELECT");

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final Pattern f39301 = m30507("DEFAULT");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f39283 = m30507("FORCED");

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39342 = m30507("INDEPENDENT");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39287 = m30507("GAP");

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39350 = m30507("PRECISE");

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f39343 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39293 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f39318 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final Pattern f39349 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39334 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Pattern f39281 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39333 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39339 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39307 = m30507("END-ON-NEXT");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f39344 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39309 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39332 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39298 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39302 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39341 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39331 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39288 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39304 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f39311 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39291 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    @Override // l.InterfaceC9584
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo21443(Uri uri, C2247 c2247) {
        return m30514(uri, (InputStream) c2247);
    }

    public C12226() {
        this(C15955.f51795, null);
    }

    public C12226(C15955 c15955, C24907 c24907) {
        this.f39353 = c15955;
        this.f39354 = c24907;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:31:0x0068, B:33:0x006e, B:36:0x0079, B:38:0x0081, B:41:0x0095, B:43:0x009d, B:45:0x00a5, B:47:0x00ad, B:49:0x00b5, B:51:0x00bd, B:53:0x00c5, B:55:0x00cd, B:58:0x00d6, B:59:0x00da, B:64:0x00fc, B:65:0x0102, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:69:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0103, LOOP:2: B:17:0x003c->B:22:0x0048, LOOP_END, TryCatch #0 {all -> 0x0103, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:31:0x0068, B:33:0x006e, B:36:0x0079, B:38:0x0081, B:41:0x0095, B:43:0x009d, B:45:0x00a5, B:47:0x00ad, B:49:0x00b5, B:51:0x00bd, B:53:0x00c5, B:55:0x00cd, B:58:0x00d6, B:59:0x00da, B:64:0x00fc, B:65:0x0102, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:69:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:88:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0047 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23415 m30514(Uri uri, InputStream inputStream) throws C2970 {
        int i;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i2 = bufferedReader.read();
            boolean zM19456 = false;
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
                            zM19456 = C7116.m19456(i2);
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
                        while (i2 != -1 && Character.isWhitespace(i2) && !C7116.m19456(i2)) {
                            i2 = bufferedReader.read();
                        }
                        zM19456 = C7116.m19456(i2);
                        break;
                    }
                }
            }
            if (!zM19456) {
                throw C2970.m9686("Input does not start with the #EXTM3U header.");
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    String strTrim = line.trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                            arrayDeque.add(strTrim);
                            C15955 c15955M30509 = m30509(new C20431(arrayDeque, bufferedReader), uri.toString());
                            C7116.m19484(bufferedReader);
                            return c15955M30509;
                        }
                        if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                            arrayDeque.add(strTrim);
                        }
                        arrayDeque.add(strTrim);
                        C24907 c24907M30511 = m30511(this.f39353, this.f39354, new C20431(arrayDeque, bufferedReader), uri.toString());
                        C7116.m19484(bufferedReader);
                        return c24907M30511;
                    }
                } else {
                    C7116.m19484(bufferedReader);
                    throw C2970.m9686("Failed to parse the playlist, could not identify any tags.");
                }
            }
        } catch (Throwable th) {
            C7116.m19484(bufferedReader);
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
    public static C15955 m30509(C20431 c20431, String str) throws IOException {
        ?? r7;
        String str2;
        int i;
        String str3;
        Pattern pattern;
        ArrayList arrayList;
        ArrayList arrayList2;
        C17447 c17447;
        String strM25261;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i2;
        String str4;
        C15648 c15648M46295;
        C17447 c17448;
        String strM25262;
        C17447 c17449;
        int i3;
        int i4;
        String str5;
        int i5;
        String str6;
        String strM19510;
        int i6;
        String[] strArrM19503;
        String string;
        StringBuilder sb;
        int length;
        int i7;
        String str7;
        String strM30505;
        int i8;
        int i9;
        String strM30506;
        float f;
        Uri uriM24651;
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
            boolean zM46857 = c20431.m46857();
            String str9 = "application/x-mpegURL";
            Pattern pattern2 = f39294;
            boolean z3 = z2;
            ArrayList arrayList14 = arrayList10;
            Pattern pattern3 = f39326;
            ArrayList arrayList15 = arrayList9;
            String str10 = ",";
            if (!zM46857) {
                ArrayList arrayList16 = arrayList11;
                ArrayList arrayList17 = arrayList7;
                ArrayList arrayList18 = arrayList8;
                ArrayList arrayList19 = arrayList13;
                ArrayList arrayList20 = arrayList12;
                ArrayList arrayList21 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i10 = 0;
                while (i10 < arrayList6.size()) {
                    C17447 c174410 = (C17447) arrayList6.get(i10);
                    Uri uri = c174410.f56744;
                    C15648 c15648 = c174410.f56742;
                    if (hashSet.add(uri)) {
                        C20782.m47568(c15648.f50812 == null);
                        ArrayList arrayList22 = (ArrayList) map.get(c174410.f56744);
                        arrayList22.getClass();
                        C19378 c19378 = new C19378(new C9814(null, null, arrayList22));
                        C20124 c20124M37397 = c15648.m37397();
                        c20124M37397.m46303(c19378);
                        arrayList21.add(new C17447(c174410.f56744, c20124M37397.m46295(), c174410.f56743, c174410.f56741, c174410.f56746, c174410.f56745));
                    }
                    i10++;
                    hashSet = hashSet;
                    z = z;
                    map = map;
                }
                boolean z4 = z;
                int i11 = 0;
                ArrayList arrayList23 = null;
                C15648 c15649 = null;
                while (i11 < arrayList16.size()) {
                    String str11 = (String) arrayList16.get(i11);
                    String strM30507 = m30506(str11, f39303, map2);
                    String strM30508 = m30506(str11, pattern3, map2);
                    C20124 c20124 = new C20124();
                    Pattern pattern4 = pattern3;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strM30507);
                    C15648 c156410 = c15649;
                    sb2.append(":");
                    sb2.append(strM30508);
                    c20124.m46309(sb2.toString());
                    c20124.m46330(strM30508);
                    c20124.m46327(str9);
                    boolean zM30512 = m30512(f39301, str11);
                    if (m30512(f39283, str11)) {
                        r7 = zM30512;
                        r7 = (zM30512 ? 1 : 0) | 2;
                    }
                    r7 = zM30512;
                    int i12 = r7;
                    if (m30512(f39285, str11)) {
                        i12 = (r7 == true ? 1 : 0) | 4;
                    }
                    c20124.m46294(i12);
                    String strM30509 = m30505(str11, f39297, (String) null, map2);
                    if (TextUtils.isEmpty(strM30509)) {
                        i = 0;
                        str2 = str10;
                    } else {
                        String str12 = C7116.f23455;
                        String[] strArrSplit = strM30509.split(str10, -1);
                        int i13 = C7116.m19489("public.accessibility.describes-video", strArrSplit) ? 512 : 0;
                        str2 = str10;
                        if (C7116.m19489("public.accessibility.transcribes-spoken-dialog", strArrSplit)) {
                            i13 |= 4096;
                        }
                        int i14 = C7116.m19489("public.accessibility.describes-music-and-sound", strArrSplit) ? i13 | 1024 : i13;
                        i = C7116.m19489("public.easy-to-read", strArrSplit) ? i14 | 8192 : i14;
                    }
                    c20124.m46311(i);
                    c20124.m46321(m30505(str11, f39317, (String) null, map2));
                    String strM305010 = m30505(str11, pattern2, (String) null, map2);
                    Uri uriM24652 = strM305010 == null ? null : C9352.m24651(str8, strM305010);
                    C19378 c19379 = new C19378(new C9814(strM30507, strM30508, Collections.EMPTY_LIST));
                    switch (m30506(str11, f39319, map2)) {
                        case "SUBTITLES":
                            str3 = str9;
                            pattern = pattern2;
                            arrayList = arrayList18;
                            arrayList2 = arrayList17;
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList6.size()) {
                                    c17447 = (C17447) arrayList6.get(i15);
                                    if (!strM30507.equals(c17447.f56746)) {
                                        i15++;
                                    }
                                } else {
                                    c17447 = null;
                                }
                            }
                            if (c17447 != null) {
                                String strM19511 = C7116.m19510(3, c17447.f56742.f50836);
                                c20124.m46300(strM19511);
                                strM25261 = C9681.m25261(strM19511);
                            } else {
                                strM25261 = null;
                            }
                            if (strM25261 == null) {
                                strM25261 = "text/vtt";
                            }
                            c20124.m46315(strM25261);
                            c20124.m46303(c19379);
                            if (uriM24652 != null) {
                                C16701 c16701 = new C16701(uriM24652, c20124.m46295(), strM30508);
                                arrayList3 = arrayList15;
                                arrayList3.add(c16701);
                            } else {
                                arrayList3 = arrayList15;
                                C1896.m6517("EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            c15648M46295 = c156410;
                            break;
                        case "CLOSED-CAPTIONS":
                            str3 = str9;
                            pattern = pattern2;
                            arrayList4 = arrayList18;
                            arrayList2 = arrayList17;
                            String strM305011 = m30506(str11, f39310, map2);
                            if (strM305011.startsWith("CC")) {
                                i2 = Integer.parseInt(strM305011.substring(2));
                                str4 = "application/cea-608";
                            } else {
                                i2 = Integer.parseInt(strM305011.substring(7));
                                str4 = "application/cea-708";
                            }
                            if (arrayList23 == null) {
                                arrayList23 = new ArrayList();
                            }
                            c20124.m46315(str4);
                            c20124.m46297(i2);
                            arrayList23.add(c20124.m46295());
                            c15648M46295 = c156410;
                            arrayList = arrayList4;
                            arrayList3 = arrayList15;
                            break;
                        case "AUDIO":
                            arrayList2 = arrayList17;
                            int i16 = 0;
                            str3 = str9;
                            while (true) {
                                if (i16 < arrayList6.size()) {
                                    c17448 = (C17447) arrayList6.get(i16);
                                    pattern = pattern2;
                                    if (!strM30507.equals(c17448.f56741)) {
                                        i16++;
                                        pattern2 = pattern;
                                    }
                                } else {
                                    pattern = pattern2;
                                    c17448 = null;
                                }
                            }
                            if (c17448 != null) {
                                String strM19512 = C7116.m19510(1, c17448.f56742.f50836);
                                c20124.m46300(strM19512);
                                strM25262 = C9681.m25261(strM19512);
                            } else {
                                strM25262 = null;
                            }
                            String strM305012 = m30505(str11, f39314, (String) null, map2);
                            if (strM305012 != null) {
                                String str13 = C7116.f23455;
                                c20124.m46329(Integer.parseInt(strM305012.split("/", 2)[0]));
                                if ("audio/eac3".equals(strM25262) && strM305012.endsWith("/JOC")) {
                                    c20124.m46300("ec+3");
                                    strM25262 = "audio/eac3-joc";
                                }
                            }
                            c20124.m46315(strM25262);
                            if (uriM24652 == null) {
                                arrayList4 = arrayList18;
                                if (c17448 != null) {
                                    c15648M46295 = c20124.m46295();
                                    arrayList = arrayList4;
                                    arrayList3 = arrayList15;
                                }
                                break;
                            } else {
                                c20124.m46303(c19379);
                                C16701 c16702 = new C16701(uriM24652, c20124.m46295(), strM30508);
                                arrayList4 = arrayList18;
                                arrayList4.add(c16702);
                            }
                            arrayList = arrayList4;
                            arrayList3 = arrayList15;
                            c15648M46295 = c156410;
                            break;
                        case "VIDEO":
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList6.size()) {
                                    c17449 = (C17447) arrayList6.get(i17);
                                    if (!strM30507.equals(c17449.f56743)) {
                                        i17++;
                                    }
                                } else {
                                    c17449 = null;
                                }
                            }
                            if (c17449 != null) {
                                C15648 c156411 = c17449.f56742;
                                String strM19513 = C7116.m19510(2, c156411.f50836);
                                c20124.m46300(strM19513);
                                c20124.m46315(C9681.m25261(strM19513));
                                c20124.m46291(c156411.f50814);
                                c20124.m46333(c156411.f50852);
                                c20124.m46296(c156411.f50845);
                            }
                            if (uriM24652 != null) {
                                c20124.m46303(c19379);
                                arrayList2 = arrayList17;
                                arrayList2.add(new C16701(uriM24652, c20124.m46295(), strM30508));
                                str3 = str9;
                                pattern = pattern2;
                                arrayList3 = arrayList15;
                                arrayList = arrayList18;
                            }
                            c15648M46295 = c156410;
                        default:
                            str3 = str9;
                            pattern = pattern2;
                            arrayList3 = arrayList15;
                            arrayList = arrayList18;
                            arrayList2 = arrayList17;
                            c15648M46295 = c156410;
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
                    c15649 = c15648M46295;
                    str8 = str;
                }
                return new C15955(str, arrayList19, arrayList21, arrayList17, arrayList18, arrayList15, arrayList14, c15649, z4 ? Collections.EMPTY_LIST : arrayList23, z3, map2, arrayList20);
            }
            String strM46858 = c20431.m46858();
            ArrayList arrayList24 = arrayList8;
            if (strM46858.startsWith("#EXT")) {
                arrayList13.add(strM46858);
            }
            boolean zStartsWith = strM46858.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList25 = arrayList13;
            if (strM46858.startsWith("#EXT-X-DEFINE")) {
                map2.put(m30506(strM46858, pattern3, map2), m30506(strM46858, f39343, map2));
            } else {
                if (strM46858.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z2 = true;
                    arrayList11 = arrayList11;
                    arrayList7 = arrayList7;
                    arrayList12 = arrayList12;
                } else if (strM46858.startsWith("#EXT-X-MEDIA")) {
                    arrayList11.add(strM46858);
                } else if (strM46858.startsWith("#EXT-X-SESSION-KEY")) {
                    C5208 c5208M30508 = m30508(strM46858, m30505(strM46858, f39336, "identity", map2), map2);
                    if (c5208M30508 != null) {
                        String strM305013 = m30506(strM46858, f39330, map2);
                        arrayList12.add(new C22362(("SAMPLE-AES-CENC".equals(strM305013) || "SAMPLE-AES-CTR".equals(strM305013)) ? "cenc" : "cbcs", c5208M30508));
                    }
                } else {
                    if (strM46858.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                        boolean zContains = z | strM46858.contains("CLOSED-CAPTIONS=NONE");
                        int i18 = zStartsWith ? 16384 : 0;
                        int i19 = Integer.parseInt(m30506(strM46858, f39351, Collections.EMPTY_MAP));
                        Matcher matcher = f39312.matcher(strM46858);
                        if (matcher.find()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            i3 = Integer.parseInt(strGroup);
                        } else {
                            i3 = -1;
                        }
                        String strM305014 = m30505(strM46858, f39324, (String) null, map2);
                        String strM305015 = m30505(strM46858, f39340, (String) null, map2);
                        HashMap map3 = map;
                        String strM305016 = m30505(strM46858, f39284, (String) null, map2);
                        if (strM305016 != null) {
                            String str14 = C7116.f23455;
                            i4 = i18;
                            String[] strArrSplit2 = strM305016.split(",", 2)[0].split("/", -1);
                            str5 = strArrSplit2[0];
                            if (strArrSplit2.length > 1) {
                                str6 = strArrSplit2[1];
                                i5 = 2;
                            }
                            strM19510 = C7116.m19510(i5, strM305015);
                            int i20 = C9681.f31256;
                            if (strM19510 == null) {
                                i6 = i19;
                            } else {
                                if (strM19510.startsWith("dvhe")) {
                                    i6 = i19;
                                } else {
                                    i6 = i19;
                                    if (!strM19510.startsWith("dvh1") || (str5 != null && ((str5.startsWith("dvhe") && strM19510.startsWith("hev1")) || ((str5.startsWith("dvh1") && strM19510.startsWith("hvc1")) || ((str5.startsWith("dvav") && strM19510.startsWith("avc3")) || ((str5.startsWith("dva1") && strM19510.startsWith("avc1")) || (str5.startsWith("dav1") && strM19510.startsWith("av01")))))))) {
                                    }
                                }
                                if (str5 != null || (strM305014 != null && str6 != null && ((!strM305014.equals("PQ") || str6.equals("db1p")) && ((!strM305014.equals("SDR") || str6.equals("db2g")) && (!strM305014.equals("HLG") || str6.startsWith("db4")))))) {
                                    if (str5 == null) {
                                        str5 = strM19510;
                                    }
                                    strArrM19503 = C7116.m19503(strM305015);
                                    if (strArrM19503.length == 0) {
                                        string = null;
                                    } else {
                                        sb = new StringBuilder();
                                        length = strArrM19503.length;
                                        i7 = 0;
                                        while (i7 < length) {
                                            str7 = strArrM19503[i7];
                                            String[] strArr = strArrM19503;
                                            if (2 != C9681.m25260(C9681.m25261(str7))) {
                                                if (sb.length() > 0) {
                                                    sb.append(",");
                                                }
                                                sb.append(str7);
                                            }
                                            i7++;
                                            strArrM19503 = strArr;
                                        }
                                        if (sb.length() > 0) {
                                            string = sb.toString();
                                        } else {
                                            string = null;
                                        }
                                    }
                                    if (string != null) {
                                        strM305015 = C20196.m46451(str5, ",", string);
                                    } else {
                                        strM305015 = str5;
                                    }
                                }
                            }
                            strM30505 = m30505(strM46858, f39321, (String) null, map2);
                            if (strM30505 != null) {
                                String[] strArrSplit3 = strM30505.split("x", -1);
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
                            strM30506 = m30505(strM46858, f39305, (String) null, map2);
                            if (strM30506 != null) {
                                f = Float.parseFloat(strM30506);
                            } else {
                                f = -1.0f;
                            }
                            String strM305017 = m30505(strM46858, f39337, (String) null, map2);
                            String strM305018 = m30505(strM46858, f39295, (String) null, map2);
                            String strM305019 = m30505(strM46858, f39308, (String) null, map2);
                            String strM305020 = m30505(strM46858, f39320, (String) null, map2);
                            if (zStartsWith) {
                                uriM24651 = C9352.m24651(str8, m30506(strM46858, pattern2, map2));
                            } else {
                                if (c20431.m46857()) {
                                    throw C2970.m9686("#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriM24651 = C9352.m24651(str8, m30504(c20431.m46858(), map2));
                            }
                            C20124 c20125 = new C20124();
                            c20125.m46317(arrayList6.size());
                            c20125.m46327("application/x-mpegURL");
                            c20125.m46300(strM305015);
                            c20125.m46308(i3);
                            int i21 = i6;
                            c20125.m46322(i21);
                            c20125.m46291(i9);
                            c20125.m46333(i8);
                            c20125.m46296(f);
                            c20125.m46311(i4);
                            arrayList6.add(new C17447(uriM24651, c20125.m46295(), strM305017, strM305018, strM305019, strM305020));
                            map = map3;
                            arrayList5 = (ArrayList) map.get(uriM24651);
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                                map.put(uriM24651, arrayList5);
                            }
                            arrayList5.add(new C18765(i3, i21, strM305017, strM305018, strM305019, strM305020));
                            z = zContains;
                        } else {
                            i4 = i18;
                            str5 = null;
                        }
                        i5 = 2;
                        str6 = null;
                        strM19510 = C7116.m19510(i5, strM305015);
                        int i22 = C9681.f31256;
                        if (strM19510 == null) {
                            i6 = i19;
                        } else {
                            if (strM19510.startsWith("dvhe")) {
                                i6 = i19;
                                if (!strM19510.startsWith("dvh1")) {
                                }
                            } else {
                                i6 = i19;
                            }
                            if (str5 != null) {
                                if (str5 == null) {
                                    str5 = strM19510;
                                }
                                strArrM19503 = C7116.m19503(strM305015);
                                if (strArrM19503.length == 0) {
                                    string = null;
                                } else {
                                    sb = new StringBuilder();
                                    length = strArrM19503.length;
                                    i7 = 0;
                                    while (i7 < length) {
                                        str7 = strArrM19503[i7];
                                        String[] strArr2 = strArrM19503;
                                        if (2 != C9681.m25260(C9681.m25261(str7))) {
                                            if (sb.length() > 0) {
                                                sb.append(",");
                                            }
                                            sb.append(str7);
                                        }
                                        i7++;
                                        strArrM19503 = strArr2;
                                    }
                                    if (sb.length() > 0) {
                                        string = sb.toString();
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string != null) {
                                    strM305015 = C20196.m46451(str5, ",", string);
                                } else {
                                    strM305015 = str5;
                                }
                            } else {
                                if (str5 == null) {
                                    str5 = strM19510;
                                }
                                strArrM19503 = C7116.m19503(strM305015);
                                if (strArrM19503.length == 0) {
                                    string = null;
                                } else {
                                    sb = new StringBuilder();
                                    length = strArrM19503.length;
                                    i7 = 0;
                                    while (i7 < length) {
                                        str7 = strArrM19503[i7];
                                        String[] strArr3 = strArrM19503;
                                        if (2 != C9681.m25260(C9681.m25261(str7))) {
                                            if (sb.length() > 0) {
                                                sb.append(",");
                                            }
                                            sb.append(str7);
                                        }
                                        i7++;
                                        strArrM19503 = strArr3;
                                    }
                                    if (sb.length() > 0) {
                                        string = sb.toString();
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string != null) {
                                    strM305015 = C20196.m46451(str5, ",", string);
                                } else {
                                    strM305015 = str5;
                                }
                            }
                        }
                        strM30505 = m30505(strM46858, f39321, (String) null, map2);
                        if (strM30505 != null) {
                            String[] strArrSplit4 = strM30505.split("x", -1);
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
                        strM30506 = m30505(strM46858, f39305, (String) null, map2);
                        if (strM30506 != null) {
                            f = Float.parseFloat(strM30506);
                        } else {
                            f = -1.0f;
                        }
                        String strM3050110 = m30505(strM46858, f39337, (String) null, map2);
                        String strM3050111 = m30505(strM46858, f39295, (String) null, map2);
                        String strM3050112 = m30505(strM46858, f39308, (String) null, map2);
                        String strM305021 = m30505(strM46858, f39320, (String) null, map2);
                        if (zStartsWith) {
                            uriM24651 = C9352.m24651(str8, m30506(strM46858, pattern2, map2));
                        } else {
                            if (c20431.m46857()) {
                                throw C2970.m9686("#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriM24651 = C9352.m24651(str8, m30504(c20431.m46858(), map2));
                        }
                        C20124 c20126 = new C20124();
                        c20126.m46317(arrayList6.size());
                        c20126.m46327("application/x-mpegURL");
                        c20126.m46300(strM305015);
                        c20126.m46308(i3);
                        int i23 = i6;
                        c20126.m46322(i23);
                        c20126.m46291(i9);
                        c20126.m46333(i8);
                        c20126.m46296(f);
                        c20126.m46311(i4);
                        arrayList6.add(new C17447(uriM24651, c20126.m46295(), strM3050110, strM3050111, strM3050112, strM305021));
                        map = map3;
                        arrayList5 = (ArrayList) map.get(uriM24651);
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            map.put(uriM24651, arrayList5);
                        }
                        arrayList5.add(new C18765(i3, i23, strM3050110, strM3050111, strM3050112, strM305021));
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
    public static C24907 m30511(C15955 c15955, C24907 c24907, C20431 c20431, String str) throws C2970, C3277 {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeMap treeMap;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList4;
        int i;
        String str2;
        AbstractC1928 abstractC1928;
        TreeMap treeMap2;
        String strM30505;
        String str3;
        String strM30506;
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
        C10734 c10734;
        int i3;
        byte b2;
        String hexString2;
        String str9;
        boolean z;
        String strM30507;
        long j2;
        C5208[] c5208Arr;
        String[] strArrSplit;
        boolean z2 = c15955.f75796;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        C11480 c11480 = new C11480(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap3 = new TreeMap();
        String str10 = "";
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        boolean zM30512 = false;
        c24907 = c24907;
        C15955 c15956 = c15955;
        boolean z4 = z2;
        ArrayList arrayList11 = arrayList8;
        C11480 c11481 = c11480;
        String strM30508 = "";
        long j3 = -1;
        C15209 c15209 = null;
        String str11 = null;
        C22362 c22362M30510 = null;
        C22362 c22362 = null;
        C5515 c5515 = null;
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
        long jM19474 = 0;
        while (c20431.m46857()) {
            String strM46858 = c20431.m46858();
            if (strM46858.startsWith("#EXT")) {
                arrayList10.add(strM46858);
            }
            if (strM46858.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strM30509 = m30506(strM46858, f39315, map);
                if ("VOD".equals(strM30509)) {
                    i4 = 1;
                } else if ("EVENT".equals(strM30509)) {
                    i4 = 2;
                }
            } else if (strM46858.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else {
                if (strM46858.startsWith("#EXT-X-START")) {
                    i6 = i6;
                    long j13 = (long) (Double.parseDouble(m30506(strM46858, f39300, Collections.EMPTY_MAP)) * 1000000.0d);
                    zM30512 = m30512(f39350, strM46858);
                    j4 = j13;
                    linkedHashMap = linkedHashMap3;
                    arrayList10 = arrayList10;
                } else {
                    i6 = i6;
                    if (strM46858.startsWith("#EXT-X-SERVER-CONTROL")) {
                        linkedHashMap = linkedHashMap3;
                        arrayList10 = arrayList10;
                        double dM30503 = m30503(strM46858, f39338, -9.223372036854776E18d);
                        long j14 = dM30503 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM30503 * 1000000.0d);
                        boolean zM30513 = m30512(f39289, strM46858);
                        double dM30504 = m30503(strM46858, f39299, -9.223372036854776E18d);
                        long j15 = dM30504 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM30504 * 1000000.0d);
                        double dM30505 = m30503(strM46858, f39348, -9.223372036854776E18d);
                        c11481 = new C11480(j14, zM30513, j15, dM30505 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM30505 * 1000000.0d), m30512(f39347, strM46858));
                    } else {
                        linkedHashMap = linkedHashMap3;
                        arrayList10 = arrayList10;
                        if (strM46858.startsWith("#EXT-X-PART-INF")) {
                            j7 = (long) (Double.parseDouble(m30506(strM46858, f39290, Collections.EMPTY_MAP)) * 1000000.0d);
                        } else {
                            boolean zStartsWith = strM46858.startsWith("#EXT-X-MAP");
                            Pattern pattern = f39335;
                            linkedHashMap3 = linkedHashMap;
                            Pattern pattern2 = f39294;
                            if (zStartsWith) {
                                String strM305010 = m30506(strM46858, pattern2, map);
                                String strM305011 = m30505(strM46858, pattern, (String) null, map);
                                if (strM305011 != null) {
                                    String str14 = C7116.f23455;
                                    String[] strArrSplit2 = strM305011.split("@", -1);
                                    j3 = Long.parseLong(strArrSplit2[c]);
                                    if (strArrSplit2.length > 1) {
                                        j8 = Long.parseLong(strArrSplit2[1]);
                                    }
                                }
                                long j16 = j3;
                                long j17 = j16 == -1 ? 0L : j8;
                                if (str12 != null && str13 == null) {
                                    throw C2970.m9686("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                                }
                                C5515 c5516 = new C5515(strM305010, j17, j16, str12, str13);
                                if (j16 != -1) {
                                    j17 += j16;
                                }
                                j8 = j17;
                                arrayList10 = arrayList10;
                                c5515 = c5516;
                                j3 = -1;
                                linkedHashMap3 = linkedHashMap3;
                                i6 = i6;
                            } else {
                                map2 = map2;
                                C15209 c152010 = c15209;
                                if (strM46858.startsWith("#EXT-X-TARGETDURATION")) {
                                    j6 = ((long) Integer.parseInt(m30506(strM46858, f39306, Collections.EMPTY_MAP))) * 1000000;
                                } else if (strM46858.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                    j5 = Long.parseLong(m30506(strM46858, f39352, Collections.EMPTY_MAP));
                                    j10 = j5;
                                    treeMap3 = treeMap3;
                                    str11 = str11;
                                    arrayList10 = arrayList10;
                                    treeMap3 = treeMap3;
                                    map2 = map2;
                                    linkedHashMap3 = linkedHashMap3;
                                    i6 = i6;
                                    c15209 = c152010;
                                    c15956 = c15956;
                                } else if (strM46858.startsWith("#EXT-X-VERSION")) {
                                    i6 = Integer.parseInt(m30506(strM46858, f39346, Collections.EMPTY_MAP));
                                } else {
                                    if (strM46858.startsWith("#EXT-X-DEFINE")) {
                                        String strM305012 = m30505(strM46858, f39293, (String) null, map);
                                        if (strM305012 != null) {
                                            String str15 = (String) c15956.f51805.get(strM305012);
                                            if (str15 != null) {
                                                map.put(strM305012, str15);
                                            }
                                        } else {
                                            map.put(m30506(strM46858, f39326, map), m30506(strM46858, f39343, map));
                                        }
                                        str11 = str11;
                                        treeMap3 = treeMap3;
                                    } else if (strM46858.startsWith("#EXTINF")) {
                                        jLongValue = new BigDecimal(m30506(strM46858, f39313, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                        strM30508 = m30505(strM46858, f39328, str10, map);
                                    } else {
                                        if (strM46858.startsWith("#EXT-X-SKIP")) {
                                            int i8 = Integer.parseInt(m30506(strM46858, f39282, Collections.EMPTY_MAP));
                                            C20782.m47568(c24907 != null && arrayList7.isEmpty());
                                            String str16 = C7116.f23455;
                                            long j18 = c24907.f80612;
                                            AbstractC1928 abstractC1929 = c24907.f80607;
                                            int i9 = (int) (j5 - j18);
                                            int i10 = i8 + i9;
                                            if (i9 < 0 || i10 > abstractC1929.size()) {
                                                throw new C3277();
                                            }
                                            while (i9 < i10) {
                                                C5515 c5517 = (C5515) abstractC1929.get(i9);
                                                if (j5 != c24907.f80612) {
                                                    int i11 = (c24907.f80609 - i5) + c5517.f6098;
                                                    AbstractC1928 abstractC19210 = c5517.f19195;
                                                    ArrayList arrayList12 = new ArrayList();
                                                    long j19 = j11;
                                                    int i12 = 0;
                                                    while (i12 < abstractC19210.size()) {
                                                        C15209 c152011 = (C15209) abstractC19210.get(i12);
                                                        arrayList12.add(new C15209(c152011.f6097, c152011.f6094, c152011.f6093, i11, j19, c152011.f6101, c152011.f6102, c152011.f6096, c152011.f6103, c152011.f6100, c152011.f6099, c152011.f49638, c152011.f49639));
                                                        j19 += c152011.f6093;
                                                        i12++;
                                                        treeMap3 = treeMap3;
                                                        i10 = i10;
                                                        abstractC1929 = abstractC1929;
                                                        str11 = str11;
                                                    }
                                                    i = i10;
                                                    str2 = str11;
                                                    abstractC1928 = abstractC1929;
                                                    treeMap2 = treeMap3;
                                                    c5517 = new C5515(c5517.f6097, c5517.f6094, c5517.f19196, c5517.f6093, i11, j11, c5517.f6101, c5517.f6102, c5517.f6096, c5517.f6103, c5517.f6100, c5517.f6099, arrayList12);
                                                } else {
                                                    i = i10;
                                                    str2 = str11;
                                                    abstractC1928 = abstractC1929;
                                                    treeMap2 = treeMap3;
                                                }
                                                arrayList7.add(c5517);
                                                long j20 = c5517.f6093;
                                                String str17 = c5517.f6096;
                                                j11 += j20;
                                                long j21 = c5517.f6100;
                                                if (j21 != -1) {
                                                    j8 = c5517.f6103 + j21;
                                                }
                                                int i13 = c5517.f6098;
                                                C5515 c5518 = c5517.f6094;
                                                C22362 c22363 = c5517.f6101;
                                                String str18 = c5517.f6102;
                                                if (str17 == null || !str17.equals(Long.toHexString(j10))) {
                                                    str13 = str17;
                                                }
                                                j10++;
                                                i9++;
                                                c24907 = c24907;
                                                i7 = i13;
                                                c5515 = c5518;
                                                str12 = str18;
                                                c22362 = c22363;
                                                treeMap3 = treeMap2;
                                                i10 = i;
                                                abstractC1929 = abstractC1928;
                                                j9 = j11;
                                                str11 = str2;
                                            }
                                            c15956 = c15955;
                                            arrayList10 = arrayList10;
                                            map2 = map2;
                                            linkedHashMap3 = linkedHashMap3;
                                        } else {
                                            str11 = str11;
                                            treeMap3 = treeMap3;
                                            if (strM46858.startsWith("#EXT-X-KEY")) {
                                                String strM305013 = m30506(strM46858, f39330, map);
                                                String strM305014 = m30505(strM46858, f39336, "identity", map);
                                                if ("NONE".equals(strM305013)) {
                                                    treeMap3.clear();
                                                    str3 = null;
                                                    str11 = str11;
                                                } else {
                                                    strM30505 = m30505(strM46858, f39345, (String) null, map);
                                                    if ("identity".equals(strM305014)) {
                                                        if ("AES-128".equals(strM305013)) {
                                                            strM30506 = m30506(strM46858, pattern2, map);
                                                            str11 = str11;
                                                        } else {
                                                            str11 = str11;
                                                        }
                                                        c24907 = c24907;
                                                        str12 = strM30506;
                                                        str13 = strM30505;
                                                        c15956 = c15955;
                                                        arrayList10 = arrayList10;
                                                        treeMap3 = treeMap3;
                                                        map2 = map2;
                                                        linkedHashMap3 = linkedHashMap3;
                                                        i6 = i6;
                                                        c15209 = c152010;
                                                        c15956 = c15956;
                                                    } else {
                                                        str11 = str11 == null ? ("SAMPLE-AES-CENC".equals(strM305013) || "SAMPLE-AES-CTR".equals(strM305013)) ? "cenc" : "cbcs" : str11;
                                                        C5208 c5208M30508 = m30508(strM46858, strM305014, map);
                                                        if (c5208M30508 != null) {
                                                            treeMap3.put(strM305014, c5208M30508);
                                                            str3 = strM30505;
                                                        }
                                                    }
                                                    strM30506 = null;
                                                    c24907 = c24907;
                                                    str12 = strM30506;
                                                    str13 = strM30505;
                                                    c15956 = c15955;
                                                    arrayList10 = arrayList10;
                                                    treeMap3 = treeMap3;
                                                    map2 = map2;
                                                    linkedHashMap3 = linkedHashMap3;
                                                    i6 = i6;
                                                    c15209 = c152010;
                                                    c15956 = c15956;
                                                }
                                                c22362 = null;
                                                strM30505 = str3;
                                                strM30506 = null;
                                                c24907 = c24907;
                                                str12 = strM30506;
                                                str13 = strM30505;
                                                c15956 = c15955;
                                                arrayList10 = arrayList10;
                                                treeMap3 = treeMap3;
                                                map2 = map2;
                                                linkedHashMap3 = linkedHashMap3;
                                                i6 = i6;
                                                c15209 = c152010;
                                                c15956 = c15956;
                                            } else {
                                                if (strM46858.startsWith("#EXT-X-BYTERANGE")) {
                                                    String strM305015 = m30506(strM46858, f39327, map);
                                                    String str19 = C7116.f23455;
                                                    String[] strArrSplit3 = strM305015.split("@", -1);
                                                    j3 = Long.parseLong(strArrSplit3[c]);
                                                    if (strArrSplit3.length > 1) {
                                                        j8 = Long.parseLong(strArrSplit3[1]);
                                                    }
                                                } else {
                                                    if (strM46858.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                                        i5 = Integer.parseInt(strM46858.substring(strM46858.indexOf(58) + 1));
                                                        z3 = true;
                                                    } else if (strM46858.equals("#EXT-X-DISCONTINUITY")) {
                                                        i7++;
                                                    } else {
                                                        if (strM46858.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                            if (jM19474 == 0) {
                                                                jM19474 = C7116.m19474(C7116.m19515(strM46858.substring(strM46858.indexOf(58) + 1))) - j11;
                                                            }
                                                        } else if (strM46858.equals("#EXT-X-GAP")) {
                                                            z6 = true;
                                                        } else if (strM46858.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                            z4 = true;
                                                        } else {
                                                            if (strM46858.equals("#EXT-X-ENDLIST")) {
                                                                z5 = true;
                                                            } else {
                                                                if (strM46858.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                                    long jM30513 = m30513(f39296, strM46858);
                                                                    Matcher matcher2 = f39286.matcher(strM46858);
                                                                    if (matcher2.find()) {
                                                                        String strGroup = matcher2.group(1);
                                                                        strGroup.getClass();
                                                                        i2 = Integer.parseInt(strGroup);
                                                                    } else {
                                                                        i2 = -1;
                                                                    }
                                                                    arrayList9.add(new C12972(Uri.parse(C9352.m24648(str, m30506(strM46858, pattern2, map))), jM30513, i2));
                                                                } else {
                                                                    if (!strM46858.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                                        str5 = str11;
                                                                        if (strM46858.startsWith("#EXT-X-PART")) {
                                                                            if (str12 == null) {
                                                                                hexString2 = null;
                                                                            } else {
                                                                                if (str13 != null) {
                                                                                    str9 = str13;
                                                                                } else {
                                                                                    hexString2 = Long.toHexString(j10);
                                                                                }
                                                                                String strM305016 = m30506(strM46858, pattern2, map);
                                                                                long j22 = (long) (Double.parseDouble(m30506(strM46858, f39322, Collections.EMPTY_MAP)) * 1000000.0d);
                                                                                boolean zM30514 = m30512(f39342, strM46858);
                                                                                if (z4 || !arrayList11.isEmpty()) {
                                                                                    z = false;
                                                                                } else {
                                                                                    z = true;
                                                                                }
                                                                                boolean z8 = zM30514 | z;
                                                                                boolean zM30515 = m30512(f39287, strM46858);
                                                                                strM30507 = m30505(strM46858, pattern, (String) null, map);
                                                                                if (strM30507 != null) {
                                                                                    String str20 = C7116.f23455;
                                                                                    strArrSplit = strM30507.split("@", -1);
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
                                                                                if (c22362 == null && !treeMap3.isEmpty()) {
                                                                                    c5208Arr = (C5208[]) treeMap3.values().toArray(new C5208[0]);
                                                                                    C22362 c22364 = new C22362(str5, c5208Arr);
                                                                                    if (c22362M30510 == null) {
                                                                                        c22362M30510 = m30510(str5, c5208Arr);
                                                                                    }
                                                                                    c22362 = c22364;
                                                                                }
                                                                                arrayList5 = arrayList11;
                                                                                arrayList5.add(new C15209(strM305016, c5515, j22, i7, j9, c22362, str12, str9, j12, j2, zM30515, z8, false));
                                                                                j9 += j22;
                                                                                if (j2 != -1) {
                                                                                    j12 += j2;
                                                                                }
                                                                                c15209 = c152010;
                                                                            }
                                                                            str9 = hexString2;
                                                                            String strM305017 = m30506(strM46858, pattern2, map);
                                                                            long j23 = (long) (Double.parseDouble(m30506(strM46858, f39322, Collections.EMPTY_MAP)) * 1000000.0d);
                                                                            boolean zM30516 = m30512(f39342, strM46858);
                                                                            if (z4) {
                                                                                z = false;
                                                                            } else {
                                                                                z = false;
                                                                            }
                                                                            boolean z9 = zM30516 | z;
                                                                            boolean zM30517 = m30512(f39287, strM46858);
                                                                            strM30507 = m30505(strM46858, pattern, (String) null, map);
                                                                            if (strM30507 != null) {
                                                                                String str21 = C7116.f23455;
                                                                                strArrSplit = strM30507.split("@", -1);
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
                                                                            if (c22362 == null) {
                                                                                c5208Arr = (C5208[]) treeMap3.values().toArray(new C5208[0]);
                                                                                C22362 c22365 = new C22362(str5, c5208Arr);
                                                                                if (c22362M30510 == null) {
                                                                                    c22362M30510 = m30510(str5, c5208Arr);
                                                                                }
                                                                                c22362 = c22365;
                                                                            }
                                                                            arrayList5 = arrayList11;
                                                                            arrayList5.add(new C15209(strM305017, c5515, j23, i7, j9, c22362, str12, str9, j12, j2, zM30517, z9, false));
                                                                            j9 += j23;
                                                                            if (j2 != -1) {
                                                                                j12 += j2;
                                                                            }
                                                                            c15209 = c152010;
                                                                        } else {
                                                                            ArrayList arrayList13 = arrayList11;
                                                                            if (strM46858.startsWith("#EXT-X-DATERANGE") && m30505(strM46858, f39349, str10, map).equals("com.apple.hls.interstitial")) {
                                                                                String strM305018 = m30506(strM46858, f39318, map);
                                                                                String strM305019 = m30505(strM46858, f39344, (String) null, map);
                                                                                Uri uri = strM305019 != null ? Uri.parse(strM305019) : null;
                                                                                String strM305020 = m30505(strM46858, f39309, (String) null, map);
                                                                                Uri uri2 = strM305020 != null ? Uri.parse(strM305020) : null;
                                                                                String strM305021 = m30505(strM46858, f39334, (String) null, map);
                                                                                long jM19475 = strM305021 != null ? C7116.m19474(C7116.m19515(strM305021)) : -9223372036854775807L;
                                                                                String strM305022 = m30505(strM46858, f39333, (String) null, map);
                                                                                long jM19476 = strM305022 != null ? C7116.m19474(C7116.m19515(strM305022)) : -9223372036854775807L;
                                                                                ArrayList arrayList14 = new ArrayList();
                                                                                String strM305023 = m30505(strM46858, f39281, (String) null, map);
                                                                                if (strM305023 != null) {
                                                                                    String str22 = C7116.f23455;
                                                                                    String[] strArrSplit4 = strM305023.split(",", -1);
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
                                                                                double dM30506 = m30503(strM46858, f39316, -1.0d);
                                                                                long j24 = dM30506 >= 0.0d ? (long) (dM30506 * 1000000.0d) : -9223372036854775807L;
                                                                                str11 = str5;
                                                                                double dM30507 = m30503(strM46858, f39339, -1.0d);
                                                                                long j25 = dM30507 >= 0.0d ? (long) (dM30507 * 1000000.0d) : -9223372036854775807L;
                                                                                boolean zM30518 = m30512(f39307, strM46858);
                                                                                arrayList = arrayList10;
                                                                                arrayList2 = arrayList9;
                                                                                double dM30508 = m30503(strM46858, f39332, Double.MIN_VALUE);
                                                                                long j26 = dM30508 != Double.MIN_VALUE ? (long) (dM30508 * 1000000.0d) : -9223372036854775807L;
                                                                                double dM30509 = m30503(strM46858, f39298, -1.0d);
                                                                                long j27 = dM30509 >= 0.0d ? (long) (dM30509 * 1000000.0d) : -9223372036854775807L;
                                                                                ArrayList arrayList15 = new ArrayList();
                                                                                arrayList4 = arrayList13;
                                                                                treeMap = treeMap3;
                                                                                String strM305024 = m30505(strM46858, f39302, (String) null, map);
                                                                                if (strM305024 != null) {
                                                                                    String str23 = C7116.f23455;
                                                                                    String[] strArrSplit5 = strM305024.split(",", -1);
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
                                                                                String strM305025 = m30505(strM46858, f39341, (String) null, map);
                                                                                if (strM305025 != null) {
                                                                                    String str24 = C7116.f23455;
                                                                                    String[] strArrSplit6 = strM305025.split(",", -1);
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
                                                                                String strM305026 = m30505(strM46858, f39331, (String) null, map);
                                                                                Boolean boolValueOf = strM305026 != null ? Boolean.valueOf(!strM305026.equals("NO")) : null;
                                                                                String strM305027 = m30505(strM46858, f39288, (String) null, map);
                                                                                if (strM305027 != null) {
                                                                                    str7 = "RANGE";
                                                                                    if (!strM305027.equals("RANGE")) {
                                                                                        str7 = "POINT";
                                                                                        if (!strM305027.equals("POINT")) {
                                                                                            str7 = null;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    str7 = null;
                                                                                }
                                                                                String strM305028 = m30505(strM46858, f39304, (String) null, map);
                                                                                if (strM305028 != null) {
                                                                                    str8 = "PRIMARY";
                                                                                    if (!strM305028.equals("PRIMARY")) {
                                                                                        str8 = "HIGHLIGHT";
                                                                                        if (!strM305028.equals("HIGHLIGHT")) {
                                                                                            str8 = null;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    str8 = null;
                                                                                }
                                                                                ArrayList arrayList17 = new ArrayList();
                                                                                String str25 = str8;
                                                                                String strSubstring = strM46858.substring(17);
                                                                                Matcher matcher3 = f39291.matcher(strSubstring);
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
                                                                                            String strM5124 = C1402.m5124(1, 0, strGroup2);
                                                                                            String strM34972 = C14483.m34972(strM5124, "=");
                                                                                            int length4 = strM34972.length() + strSubstring.indexOf(strM34972);
                                                                                            String strSubstring2 = strSubstring.substring(length4, (strSubstring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                                            if (strSubstring2.startsWith("\"")) {
                                                                                                c10734 = new C10734(0, strM5124, m30506(strSubstring, Pattern.compile(strM5124 + "=\"((?:.|\f)+?)\""), map));
                                                                                            } else if (strSubstring2.equals("0x") || strSubstring2.equals("0X")) {
                                                                                                c10734 = new C10734(1, strM5124, m30506(strSubstring, Pattern.compile(strM5124 + "=(0[xX][A-F0-9]+)"), map));
                                                                                            } else {
                                                                                                c10734 = new C10734(strM5124, Double.parseDouble(m30506(strSubstring, Pattern.compile(strM5124 + "=([\\d\\.]+)\\b"), Collections.EMPTY_MAP)));
                                                                                            }
                                                                                            arrayList17.add(c10734);
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
                                                                                C22669 c22669 = linkedHashMap2.containsKey(strM305018) ? (C22669) linkedHashMap2.get(strM305018) : new C22669(strM305018);
                                                                                c22669.m51144(uri);
                                                                                c22669.m51134(uri2);
                                                                                c22669.m51141(jM19475);
                                                                                c22669.m51143(jM19476);
                                                                                c22669.m51133(j24);
                                                                                c22669.m51139(j28);
                                                                                c22669.m51146(arrayList19);
                                                                                c22669.m51138(zM30518);
                                                                                c22669.m51142(j26);
                                                                                c22669.m51147(j27);
                                                                                c22669.m51148(arrayList15);
                                                                                c22669.m51140(arrayList18);
                                                                                c22669.m51137(arrayList17);
                                                                                c22669.m51135(bool);
                                                                                c22669.m51136(str27);
                                                                                c22669.m51145(str25);
                                                                                linkedHashMap2.put(strM305018, c22669);
                                                                            } else {
                                                                                arrayList = arrayList10;
                                                                                arrayList2 = arrayList9;
                                                                                str11 = str5;
                                                                                treeMap = treeMap3;
                                                                                arrayList4 = arrayList13;
                                                                                str10 = str10;
                                                                                arrayList6 = arrayList7;
                                                                                linkedHashMap2 = linkedHashMap3;
                                                                                if (!strM46858.startsWith("#")) {
                                                                                    String hexString3 = str12 == null ? null : str13 != null ? str13 : Long.toHexString(j10);
                                                                                    long j29 = j10 + 1;
                                                                                    String strM30504 = m30504(strM46858, map);
                                                                                    map2 = map2;
                                                                                    C5515 c5519 = (C5515) map2.get(strM30504);
                                                                                    if (j3 == -1) {
                                                                                        j8 = 0;
                                                                                    } else if (z7 && c5515 == null && c5519 == null) {
                                                                                        c5519 = new C5515(strM30504, 0L, j8, null, null);
                                                                                        map2.put(strM30504, c5519);
                                                                                    }
                                                                                    if (c22362 != null || treeMap.isEmpty()) {
                                                                                        str6 = str11;
                                                                                    } else {
                                                                                        C5208[] c5208Arr2 = (C5208[]) treeMap.values().toArray(new C5208[0]);
                                                                                        str6 = str11;
                                                                                        C22362 c22366 = new C22362(str6, c5208Arr2);
                                                                                        if (c22362M30510 == null) {
                                                                                            c22362M30510 = m30510(str6, c5208Arr2);
                                                                                        }
                                                                                        c22362 = c22366;
                                                                                    }
                                                                                    arrayList6.add(new C5515(strM30504, c5515 != null ? c5515 : c5519, strM30508, jLongValue, i7, j11, c22362, str12, hexString3, j8, j3, z6, arrayList4));
                                                                                    j11 += jLongValue;
                                                                                    arrayList11 = new ArrayList();
                                                                                    if (j3 != -1) {
                                                                                        j8 += j3;
                                                                                    }
                                                                                    c = 0;
                                                                                    z6 = false;
                                                                                    c15956 = c15955;
                                                                                    arrayList7 = arrayList6;
                                                                                    j10 = j29;
                                                                                    str11 = str6;
                                                                                    j3 = -1;
                                                                                    treeMap3 = treeMap;
                                                                                    str10 = str10;
                                                                                    strM30508 = str10;
                                                                                    arrayList10 = arrayList;
                                                                                    arrayList9 = arrayList2;
                                                                                    j9 = j11;
                                                                                    jLongValue = 0;
                                                                                    linkedHashMap3 = linkedHashMap2;
                                                                                }
                                                                            }
                                                                            arrayList3 = arrayList6;
                                                                        }
                                                                    } else if (c152010 == null && "PART".equals(m30506(strM46858, f39292, map))) {
                                                                        String strM305029 = m30506(strM46858, pattern2, map);
                                                                        long jM30514 = m30513(f39325, strM46858);
                                                                        long jM30515 = m30513(f39329, strM46858);
                                                                        if (str12 == null) {
                                                                            hexString = null;
                                                                        } else {
                                                                            if (str13 != null) {
                                                                                str4 = str13;
                                                                            } else {
                                                                                hexString = Long.toHexString(j10);
                                                                            }
                                                                            if (c22362 == null || treeMap3.isEmpty()) {
                                                                                str5 = str11;
                                                                            } else {
                                                                                C5208[] c5208Arr3 = (C5208[]) treeMap3.values().toArray(new C5208[0]);
                                                                                str5 = str11;
                                                                                C22362 c22367 = new C22362(str5, c5208Arr3);
                                                                                if (c22362M30510 == null) {
                                                                                    c22362M30510 = m30510(str5, c5208Arr3);
                                                                                }
                                                                                c22362 = c22367;
                                                                            }
                                                                            if (jM30514 == -1 && jM30515 == -1) {
                                                                                c15209 = c152010;
                                                                            } else {
                                                                                if (jM30514 != -1) {
                                                                                    j = jM30514;
                                                                                } else {
                                                                                    j = 0;
                                                                                }
                                                                                c15209 = new C15209(strM305029, c5515, 0L, i7, j9, c22362, str12, str4, j, jM30515, false, false, true);
                                                                            }
                                                                            arrayList5 = arrayList11;
                                                                        }
                                                                        str4 = hexString;
                                                                        if (c22362 == null) {
                                                                            str5 = str11;
                                                                        } else {
                                                                            str5 = str11;
                                                                        }
                                                                        if (jM30514 == -1) {
                                                                            if (jM30514 != -1) {
                                                                                j = jM30514;
                                                                            } else {
                                                                                j = 0;
                                                                            }
                                                                            c15209 = new C15209(strM305029, c5515, 0L, i7, j9, c22362, str12, str4, j, jM30515, false, false, true);
                                                                        } else {
                                                                            if (jM30514 != -1) {
                                                                                j = jM30514;
                                                                            } else {
                                                                                j = 0;
                                                                            }
                                                                            c15209 = new C15209(strM305029, c5515, 0L, i7, j9, c22362, str12, str4, j, jM30515, false, false, true);
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
                                                            c15956 = c15955;
                                                        }
                                                        c = 0;
                                                        c15956 = c15955;
                                                        arrayList7 = arrayList3;
                                                        linkedHashMap3 = linkedHashMap2;
                                                        str11 = str11;
                                                        arrayList11 = arrayList4;
                                                        treeMap3 = treeMap;
                                                        str10 = str10;
                                                        arrayList10 = arrayList;
                                                        arrayList9 = arrayList2;
                                                        i6 = i6;
                                                        c15209 = c152010;
                                                        c24907 = c24907;
                                                    }
                                                    c15209 = c152010;
                                                    str11 = str11;
                                                    c15956 = c15955;
                                                }
                                                c15956 = c15955;
                                                c24907 = c24907;
                                                str11 = str11;
                                                arrayList10 = arrayList10;
                                                treeMap3 = treeMap3;
                                                map2 = map2;
                                                linkedHashMap3 = linkedHashMap3;
                                                i6 = i6;
                                                c15209 = c152010;
                                                c15956 = c15956;
                                            }
                                        }
                                        c15209 = c152010;
                                    }
                                    arrayList = arrayList10;
                                    arrayList2 = arrayList9;
                                    treeMap = treeMap3;
                                    str10 = str10;
                                    arrayList3 = arrayList7;
                                    linkedHashMap2 = linkedHashMap3;
                                    arrayList4 = arrayList11;
                                    c = 0;
                                    c15956 = c15955;
                                    arrayList7 = arrayList3;
                                    linkedHashMap3 = linkedHashMap2;
                                    str11 = str11;
                                    arrayList11 = arrayList4;
                                    treeMap3 = treeMap;
                                    str10 = str10;
                                    arrayList10 = arrayList;
                                    arrayList9 = arrayList2;
                                    i6 = i6;
                                    c15209 = c152010;
                                    c24907 = c24907;
                                }
                                treeMap3 = treeMap3;
                                str11 = str11;
                                arrayList10 = arrayList10;
                                treeMap3 = treeMap3;
                                map2 = map2;
                                linkedHashMap3 = linkedHashMap3;
                                i6 = i6;
                                c15209 = c152010;
                                c15956 = c15956;
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
        C15209 c152012 = c15209;
        ArrayList arrayList20 = arrayList9;
        LinkedHashMap linkedHashMap4 = linkedHashMap3;
        ArrayList arrayList21 = arrayList10;
        ArrayList arrayList22 = arrayList7;
        ArrayList arrayList23 = arrayList11;
        HashMap map3 = new HashMap();
        int i18 = 0;
        while (i18 < arrayList20.size()) {
            ArrayList arrayList24 = arrayList20;
            C12972 c12972 = (C12972) arrayList24.get(i18);
            long size = c12972.f41589;
            if (size == -1) {
                size = (j5 + ((long) arrayList22.size())) - (arrayList23.isEmpty() ? 1L : 0L);
            }
            int size2 = c12972.f41591;
            if (size2 == -1 && j7 != -9223372036854775807L) {
                size2 = (arrayList23.isEmpty() ? ((C5515) C16625.m39339(arrayList22)).f19195 : arrayList23).size() - 1;
            }
            Uri uri3 = c12972.f41590;
            map3.put(uri3, new C12972(uri3, size, size2));
            i18++;
            arrayList20 = arrayList24;
        }
        if (c152012 != null) {
            arrayList23.add(c152012);
        }
        ArrayList arrayList25 = new ArrayList();
        Iterator it = linkedHashMap4.values().iterator();
        while (it.hasNext()) {
            C19685 c19685M51132 = ((C22669) it.next()).m51132();
            if (c19685M51132 != null) {
                arrayList25.add(c19685M51132);
            }
        }
        return new C24907(i4, str, arrayList21, j4, zM30512, jM19474, z3, i5, j5, i17, j6, j7, z4, z5, jM19474 != 0, c22362M30510, arrayList22, arrayList23, c11481, map3, arrayList25);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22362 m30510(String str, C5208[] c5208Arr) {
        C5208[] c5208Arr2 = new C5208[c5208Arr.length];
        for (int i = 0; i < c5208Arr.length; i++) {
            C5208 c5208 = c5208Arr[i];
            c5208Arr2[i] = new C5208(c5208.f18371, c5208.f18373, c5208.f18370, null);
        }
        return new C22362(str, c5208Arr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5208 m30508(String str, String str2, HashMap map) throws C2970 {
        String strM30505 = m30505(str, f39323, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f39294;
        if (zEquals) {
            String strM30506 = m30506(str, pattern, map);
            return new C5208(C19158.f61988, null, "video/mp4", Base64.decode(strM30506.substring(strM30506.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = C19158.f61988;
            String str3 = C7116.f23455;
            return new C5208(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strM30505)) {
            return null;
        }
        String strM30507 = m30506(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strM30507.substring(strM30507.indexOf(44)), 0);
        UUID uuid2 = C19158.f61987;
        return new C5208(uuid2, null, "video/mp4", C21453.m48807(uuid2, null, bArrDecode));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m30513(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30506(String str, Pattern pattern, Map map) throws C2970 {
        String strM30505 = m30505(str, pattern, (String) null, map);
        if (strM30505 != null) {
            return strM30505;
        }
        throw C2970.m9686("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30505(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m30504(str2, map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static double m30503(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30504(String str, Map map) {
        Matcher matcher = f39311.matcher(str);
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
    public static boolean m30512(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pattern m30507(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }
}
