package l;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Pair;
import bin.mt.plus.Features3;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.google.android.material.color.MaterialColors;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ܰۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes4.dex */
public final class C14584 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45961 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Boolean f45962;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C18037 f45963;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int f45964;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20727 f45965;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean f45966;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String f45967;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Boolean f45968;

    static {
        String path = Environment.getExternalStorageDirectory().getPath();
        f45967 = path;
        f45964 = (int) (System.currentTimeMillis() & 16777215);
        C18037 c18037 = new C18037(0);
        f45963 = c18037;
        f45966 = true;
        f45965 = new C16076();
        c18037.add(path);
        c18037.add("/sdcard");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35185() {
        return f45967;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C18037 m35209() {
        C15945 c15945M21077;
        boolean z = f45966;
        C18037 c18037 = f45963;
        if (z && C4013.m12983() && !C7742.m21080()) {
            f45966 = false;
            LinkedList linkedList = new LinkedList(c18037);
            try {
                c15945M21077 = C7742.m21077(false);
                while (!linkedList.isEmpty()) {
                    try {
                        C21694 c21694M38034 = c15945M21077.m38034(new File((String) linkedList.removeFirst()).getPath());
                        if (c21694M38034.m49240() != null) {
                            String strM49240 = c21694M38034.m49240();
                            if (c18037.add(strM49240)) {
                                linkedList.addLast(strM49240);
                            } else {
                                continue;
                            }
                        }
                    } catch (Throwable unused) {
                        if (c15945M21077 != null) {
                            c15945M21077.m38061();
                        }
                        return c18037;
                    }
                }
                c15945M21077.m38061();
                return c18037;
            } catch (Throwable unused2) {
                c15945M21077 = null;
            }
        }
        return c18037;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35199(AbstractActivityC17204 abstractActivityC17204) {
        if (abstractActivityC17204.getIntent().getData() != null) {
            return false;
        }
        abstractActivityC17204.finish();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m35190(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            throw new NullPointerException("Intent data is null: " + intent);
        }
        return m35189(data).m13271();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C4144 m35208(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            data = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        }
        if (data == null) {
            throw new NullPointerException("Intent data is null: " + intent);
        }
        return m35189(data);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4144 m35189(Uri uri) {
        String path;
        if ("file".equals(uri.getScheme())) {
            String path2 = uri.getPath();
            C17359.requireNonNull(path2);
            return new C4144(m35193(C14825.m35697(path2), new String[0]), null);
        }
        if ("content".equals(uri.getScheme())) {
            String host = uri.getHost();
            if (C17568.f57086.equals(host)) {
                return new C4144(C17568.m41232(uri), null);
            }
            if ("bin.mt.plus.fileprovider2".equals(host) || "bin.mt.plus.canary.fileprovider2".equals(host) || "bin.mt.plus.fp".equals(host) || "bin.mt.plus.canary.fp".equals(host)) {
                String path3 = uri.getPath();
                if (path3 != null && !path3.startsWith("/NOT_DELETE/")) {
                    return new C4144(m35193(path3, new String[0]), null);
                }
            } else if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String strM51955 = C23053.m51955(uri);
                if (strM51955 != null) {
                    if ("primary".equals(strM51955)) {
                        return new C4144(C6382.f21566.m49876(C23053.m51956(uri).getPathSegments().get(3).substring(strM51955.length() + 1)), null);
                    }
                    for (C16997 c16997 : (ArrayList) C17743.m41557(null)) {
                        if (c16997.f55540.equals(strM51955)) {
                            return new C4144(m35193(c16997.f55538.getAbsolutePath(), C23053.m51956(uri).getPathSegments().get(3).substring(strM51955.length() + 1)), null);
                        }
                    }
                }
            } else if ("com.android.providers.downloads.ui.fileprovider".equals(uri.getAuthority()) && (path = uri.getPath()) != null && path.startsWith("/external_files/Download/")) {
                return new C4144(C6382.f21566.m49876(path.substring(16)), null);
            }
            return new C4144(new C22965(uri), C14825.m35696(uri));
        }
        throw new RuntimeException("Unsupported uri: " + uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044[] m35201(String[] strArr) {
        AbstractC22044[] abstractC22044Arr = new AbstractC22044[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            abstractC22044Arr[i] = m35193(strArr[i], new String[0]);
        }
        return abstractC22044Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35187(String str, boolean z) throws IOException {
        if (str.indexOf(0) >= 0 || str.startsWith("/") || str.startsWith("\\")) {
            throw new IOException("Unsafe archive entry path: ".concat(str));
        }
        if (str.length() >= 2 && Character.isLetter(str.charAt(0)) && str.charAt(1) == ':') {
            throw new IOException("Unsafe archive entry path: ".concat(str));
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 <= str.length(); i2++) {
            if (i2 == str.length() || str.charAt(i2) == '/' || str.charAt(i2) == '\\') {
                String strSubstring = str.substring(i, i2);
                int i3 = i2 + 1;
                if (!strSubstring.isEmpty() && !".".equals(strSubstring)) {
                    if ("..".equals(strSubstring)) {
                        if (arrayList.isEmpty()) {
                            throw new IOException("Unsafe archive entry path: ".concat(str));
                        }
                        C2764.m9138(arrayList, 1);
                    } else {
                        if (strSubstring.length() >= 2 && Character.isLetter(strSubstring.charAt(0)) && strSubstring.charAt(1) == ':') {
                            throw new IOException("Unsafe archive entry path: ".concat(str));
                        }
                        arrayList.add(m35206(strSubstring));
                    }
                }
                i = i3;
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
            }
        }
        String string = sb.toString();
        if (z || !string.isEmpty()) {
            return string;
        }
        throw new IOException("Unsafe archive entry path: ".concat(str));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m35202(String str, String str2) throws IOException {
        if (!str2.isEmpty()) {
            int i = 0;
            if (str2.indexOf(0) < 0 && !str2.startsWith("/") && !str2.startsWith("\\")) {
                if (str2.length() >= 2 && Character.isLetter(str2.charAt(0)) && str2.charAt(1) == ':') {
                    throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
                }
                String strM35187 = m35187(str, false);
                ArrayList arrayList = new ArrayList();
                int iLastIndexOf = strM35187.lastIndexOf(47);
                if (iLastIndexOf != -1) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < iLastIndexOf; i3++) {
                        if (strM35187.charAt(i3) == '/') {
                            arrayList.add(strM35187.substring(i2, i3));
                            i2 = i3 + 1;
                        }
                    }
                    arrayList.add(strM35187.substring(i2, iLastIndexOf));
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                int i4 = 0;
                for (int i5 = 0; i5 <= str2.length(); i5++) {
                    if (i5 == str2.length() || str2.charAt(i5) == '/' || str2.charAt(i5) == '\\') {
                        String strSubstring = str2.substring(i4, i5);
                        int i6 = i5 + 1;
                        if (!strSubstring.isEmpty() && !".".equals(strSubstring)) {
                            if ("..".equals(strSubstring)) {
                                if (arrayList2.isEmpty()) {
                                    throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
                                }
                                C2764.m9138(arrayList2, 1);
                            } else {
                                if (strSubstring.length() >= 2 && Character.isLetter(strSubstring.charAt(0)) && strSubstring.charAt(1) == ':') {
                                    throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
                                }
                                arrayList2.add(m35206(strSubstring));
                            }
                        }
                        i4 = i6;
                    }
                }
                while (i < arrayList.size() && i < arrayList2.size() && ((String) arrayList.get(i)).equals(arrayList2.get(i))) {
                    i++;
                }
                ArrayList arrayList3 = new ArrayList();
                for (int i7 = i; i7 < arrayList.size(); i7++) {
                    arrayList3.add("..");
                }
                while (i < arrayList2.size()) {
                    arrayList3.add((String) arrayList2.get(i));
                    i++;
                }
                if (arrayList3.isEmpty()) {
                    return ".";
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) "/");
                    }
                }
                return sb.toString();
            }
        }
        throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m35206(String str) {
        char c;
        int length = str.length();
        StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '>' && cCharAt != '?') {
                c = ' ';
                if (cCharAt != 8232 && cCharAt != 8233) {
                    switch (cCharAt) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            switch (cCharAt) {
                                case ' ':
                                case 133:
                                case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                                case 5760:
                                case 8239:
                                case 8287:
                                case 12288:
                                    break;
                                case '\"':
                                case '*':
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                case '<':
                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                case '|':
                                    c = '_';
                                    break;
                                default:
                                    if (cCharAt < 8192 || cCharAt > 8202) {
                                        c = cCharAt;
                                    }
                                    break;
                            }
                            break;
                    }
                }
            } else {
                c = '_';
            }
            if (c != cCharAt && sb == null) {
                sb = new StringBuilder(length);
                sb.append((CharSequence) str, 0, i);
            }
            if (sb != null) {
                sb.append(c);
            }
        }
        return sb == null ? str : sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m35193(String str, String... strArr) {
        String strM35186;
        if (str.startsWith("content://") || str.startsWith("android.resource://")) {
            if (strArr.length != 0) {
                throw new IllegalArgumentException("Children must be empty when path is context uri");
            }
            return new C22965(Uri.parse(str));
        }
        if (str.startsWith("$RECYCLE.BIN$/")) {
            str = C19632.m45282().mo4294() + str.substring(13);
            if (C4013.m12986().mo29539() && (strM35186 = m35186(str)) != null) {
                str = "/data/media/" + C6382.f21566.getName() + "/" + strM35186;
            }
        }
        File file = new File(str);
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            File file2 = new File(file, strArr[i]);
            i++;
            file = file2;
        }
        return m35191(file);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m35191(File file) {
        Pair pairCreate;
        String strM48;
        String path = file.getPath();
        if (Build.VERSION.SDK_INT >= 30) {
            Iterator it = m35209().iterator();
            while (true) {
                AbstractC7596 abstractC7596 = (AbstractC7596) it;
                if (!abstractC7596.hasNext()) {
                    pairCreate = Pair.create(0, null);
                    break;
                }
                String str = (String) abstractC7596.next();
                if (m35198(path, str)) {
                    int length = str.length();
                    int i = length + 1;
                    if (!m35197(path, i, "android", path.length(), 7)) {
                        if (path.length() == str.length()) {
                            strM48 = Features3.m48(path);
                        } else {
                            strM48 = null;
                        }
                        if (strM48 == null) {
                            strM48 = "";
                        }
                        pairCreate = Pair.create(1, strM48);
                        break;
                    }
                    int i2 = length + 9;
                    if (!m35197(path, i2, e.m, path.length(), 4)) {
                        if (!m35197(path, i2, "obb", path.length(), 3)) {
                            if (path.length() == str.length()) {
                                strM48 = Features3.m48(path);
                            } else {
                                strM48 = null;
                            }
                            if (strM48 == null) {
                                strM48 = "";
                            }
                            pairCreate = Pair.create(1, strM48);
                            break;
                        }
                        String strM49092 = C21576.m49092();
                        if (!m35197(path, length + 13, strM49092, path.length(), strM49092.length())) {
                            pairCreate = Pair.create(3, path.substring(i, path.endsWith("/") ? path.length() - 1 : path.length()));
                            break;
                        }
                        pairCreate = Pair.create(4, null);
                        break;
                    }
                    String strM49093 = C21576.m49092();
                    if (!m35197(path, length + 14, strM49093, path.length(), strM49093.length())) {
                        pairCreate = Pair.create(2, path.substring(i, path.endsWith("/") ? path.length() - 1 : path.length()));
                        break;
                    }
                    pairCreate = Pair.create(4, null);
                    break;
                }
            }
            int iIntValue = ((Integer) pairCreate.first).intValue();
            if (iIntValue == 1) {
                C1161 c1161 = new C1161(file, false);
                c1161.f4289 = (String) pairCreate.second;
                return c1161;
            }
            if (iIntValue == 2 || iIntValue == 3) {
                return m35192(file, (String) pairCreate.second, null);
            }
            if (iIntValue == 4) {
                C1161 c1162 = new C1161(file, true);
                c1162.f4289 = "";
                return c1162;
            }
        } else if (m35214(path)) {
            return new C1161(file, false);
        }
        if (m35205(path)) {
            return new C7302(file, true);
        }
        AbstractC22044 abstractC22044M17123 = C5899.m17123(file);
        if (abstractC22044M17123 != null) {
            return abstractC22044M17123;
        }
        C2170 c2170M40225 = C17085.m40225(file);
        return c2170M40225 != null ? c2170M40225 : new C7302(file, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m35192(File file, String str, C14649 c14649) {
        String str2;
        int i;
        if (str.regionMatches(true, 0, "Android/data", 0, 12)) {
            str2 = "Android/data";
            i = 14;
        } else {
            if (!str.regionMatches(true, 0, "Android/obb", 0, 11)) {
                throw new IllegalArgumentException("Path must be in Android/data or Android/obb: ".concat(str));
            }
            str2 = "Android/obb";
            i = 13;
        }
        if (!C4013.m12986().mo29537() && (m35204() || (m35213() && str.equalsIgnoreCase(str2)))) {
            return new C17063(new File(f45967, ExternalValue$$ExternalSyntheticOutline0.m(7, str, new StringBuilder("\u200bAndroid"))), false);
        }
        if (m35213()) {
            return new C18379(file, ExternalValue$$ExternalSyntheticOutline0.m(7, str, new StringBuilder("\u200bAndroid")), "\u200bAndroid", c14649);
        }
        if (Build.VERSION.SDK_INT < 33 || !str.regionMatches(true, 0, str2.concat("/"), 0, str2.length() + 1)) {
            return new C18379(file, str, str2, c14649);
        }
        int iIndexOf = str.indexOf(47, i);
        return iIndexOf == -1 ? new C18379(file, str, str, c14649) : new C18379(file, str, str.substring(0, iIndexOf), c14649);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m35210(String str) {
        return C17743.m41554(str) != null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m35214(String str) {
        AbstractC7596 abstractC7596;
        Iterator it = m35209().iterator();
        do {
            abstractC7596 = (AbstractC7596) it;
            if (!abstractC7596.hasNext()) {
                return false;
            }
        } while (!m35198(str, (String) abstractC7596.next()));
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m35211(String str, String str2) {
        if (!str.equals(str2)) {
            int iLastIndexOf = str.lastIndexOf(47) + 1;
            int iLastIndexOf2 = str2.lastIndexOf(47) + 1;
            int length = str.length() - iLastIndexOf;
            if (length != str2.length() - iLastIndexOf2 || !str.regionMatches(true, iLastIndexOf, str2, iLastIndexOf2, length)) {
                return false;
            }
            Iterator it = m35209().iterator();
            int i = -1;
            int i2 = -1;
            while (true) {
                AbstractC7596 abstractC7596 = (AbstractC7596) it;
                if (!abstractC7596.hasNext()) {
                    return false;
                }
                String str3 = (String) abstractC7596.next();
                int length2 = str3.endsWith("/") ? str3.length() : str3.length() + 1;
                int i3 = (i >= 0 || str.length() <= length2 || !m35198(str, str3)) ? i : length2;
                int i4 = (i2 >= 0 || str2.length() <= length2 || !m35198(str2, str3)) ? i2 : length2;
                if (i3 < 0 || i4 < 0) {
                    i = i3;
                    i2 = i4;
                } else {
                    int length3 = str.length() - i3;
                    if (length3 != str2.length() - i4 || !str.regionMatches(true, i3, str2, i4, length3 - length)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35186(String str) {
        String str2;
        Iterator it = m35209().iterator();
        do {
            AbstractC7596 abstractC7596 = (AbstractC7596) it;
            if (!abstractC7596.hasNext()) {
                return null;
            }
            str2 = (String) abstractC7596.next();
        } while (!m35198(str, str2));
        int length = str2.endsWith("/") ? str2.length() : str2.length() + 1;
        if (str.length() > length) {
            return str.substring(length);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m35207(String str) {
        String strM35186 = m35186(str);
        String str2 = f45967;
        if (strM35186 != null) {
            return new File(str2, strM35186).getPath();
        }
        return m35214(str) ? str2 : str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35198(String str, String str2) {
        return m35197(str, 0, str2, str.length(), str2.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35197(String str, int i, String str2, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > str.length() || i3 < 0 || i3 > str2.length()) {
            return false;
        }
        int i4 = i2 - i;
        if (i4 > 1 && str.charAt(i2 - 1) == '/') {
            i4--;
        }
        if (i3 > 1 && str2.charAt(i3 - 1) == '/') {
            i3--;
        }
        if (i3 <= i4 && str.regionMatches(true, i, str2, 0, i3)) {
            return i4 == i3 || (i3 == 1 && str2.charAt(0) == '/') || str.charAt(i + i3) == '/';
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m35205(String str) {
        String lowerCase = (str.endsWith("/") ? str : str.concat("/")).toLowerCase();
        if (lowerCase.startsWith(C21576.m49079().getAbsolutePath().toLowerCase() + "/")) {
            return true;
        }
        if (!str.startsWith("/data/")) {
            return false;
        }
        String lowerCase2 = C21576.m49092().toLowerCase();
        if (lowerCase.startsWith("/data/data/" + lowerCase2 + "/")) {
            return true;
        }
        if (lowerCase.startsWith("/data/user/0/" + lowerCase2 + "/")) {
            return true;
        }
        if (lowerCase.startsWith("/data/user_de/0/" + lowerCase2 + "/")) {
            return true;
        }
        if (lowerCase.startsWith("/data/user/999/" + lowerCase2 + "/")) {
            return true;
        }
        StringBuilder sb = new StringBuilder("/data/user_de/999/");
        sb.append(lowerCase2);
        sb.append("/");
        return lowerCase.startsWith(sb.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m35194(AbstractC22044 abstractC22044, String str) {
        AbstractC22044 abstractC22044M49876;
        abstractC22044.mo4274();
        do {
            StringBuilder sb = new StringBuilder();
            int i = f45964;
            f45964 = i + 1;
            sb.append(i);
            sb.append(str);
            abstractC22044M49876 = abstractC22044.m49876(sb.toString());
        } while (abstractC22044M49876.mo2934());
        return abstractC22044M49876;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35195(InterfaceC20727 interfaceC20727) {
        f45965 = interfaceC20727;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m35212(AbstractC22044 abstractC22044) {
        InterfaceC12522 interfaceC12522;
        return ((abstractC22044.mo19981() && abstractC22044.mo19983().m19980()) || (interfaceC12522 = f45965.get()) == null || !interfaceC12522.mo31081(abstractC22044.mo4294())) ? false : true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m35203(AbstractC22044 abstractC22044) {
        InterfaceC12522 interfaceC12522 = f45965.get();
        if (interfaceC12522 != null) {
            interfaceC12522.mo31082(abstractC22044.mo4294());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35196(AbstractC22044 abstractC22044) {
        if (abstractC22044.mo19981() && abstractC22044.mo19983().m19980()) {
            return;
        }
        InterfaceC12522 interfaceC12522 = f45965.get();
        String strMo4294 = abstractC22044.mo4294();
        if (interfaceC12522 == null || !interfaceC12522.mo31081(strMo4294)) {
            return;
        }
        interfaceC12522.mo31082(strMo4294);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m35204() {
        File[] fileArrListFiles;
        Boolean bool = f45968;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = f45967;
        if (Arrays.equals(new File(str, AnalyticsConstants.SDK_TYPE).list(), new File(str, "\u200bAndroid").list()) && (fileArrListFiles = new File(str, "\u200bAndroid/data").listFiles()) != null) {
            int i = 0;
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    try {
                        Os.access(file.getPath(), OsConstants.X_OK);
                        i++;
                        if (i == 20) {
                            break;
                        }
                    } catch (ErrnoException unused) {
                        f45968 = Boolean.FALSE;
                        f45962 = Boolean.TRUE;
                        return false;
                    }
                }
            }
            Boolean bool2 = Boolean.TRUE;
            f45968 = bool2;
            f45962 = bool2;
            return true;
        }
        Boolean bool3 = Boolean.FALSE;
        f45968 = bool3;
        f45962 = bool3;
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m35213() {
        if (f45962 == null) {
            m35204();
        }
        return f45962.booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35188(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045) {
        String name = abstractC22044.getName();
        String name2 = abstractC22045.getName();
        if (name2.equals(name)) {
            return null;
        }
        if (name2.contains("\\") || name2.contains("/")) {
            return C21576.m49088(R.string.MT_Protector);
        }
        if (name2.equalsIgnoreCase(name)) {
            if (abstractC22045.mo2934()) {
                List listMo4282 = abstractC22045.m49856().mo4282();
                if (listMo4282.contains(name) && listMo4282.contains(name2)) {
                    if (abstractC22045.mo4281()) {
                        return C21576.m49088(R.string.MT_Protector);
                    }
                    return C21576.m49088(R.string.MT_Protector);
                }
            }
            AbstractC22044 abstractC22044M49862 = abstractC22044.m49862(".tmp");
            if (abstractC22044.mo4301(abstractC22044M49862) && abstractC22044M49862.mo4301(abstractC22045)) {
                return null;
            }
            if (name2.contains(":") || name2.contains("?") || name2.contains("*") || name2.contains("\"") || name2.contains("<") || name2.contains(">") || name2.contains("|")) {
                return C21576.m49088(R.string.MT_Protector);
            }
            return C21576.m49088(R.string.MT_Protector);
        }
        if (abstractC22045.mo2934()) {
            if (abstractC22045.mo4281()) {
                return C21576.m49088(R.string.MT_Protector);
            }
            return C21576.m49088(R.string.MT_Protector);
        }
        if (abstractC22044.mo4301(abstractC22045)) {
            return null;
        }
        return C21576.m49088(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35200(AbstractC22044 abstractC22044, List list) {
        String lowerCase;
        Set<String> set = (Set) C1170.stream(list).map(new C3398(0)).collect(C2025.toUnmodifiableSet());
        if (abstractC22044.mo4295() && abstractC22044.mo4277()) {
            return false;
        }
        for (String str : set) {
            int length = str.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    lowerCase = null;
                    break;
                }
                char cCharAt = str.charAt(0);
                if (cCharAt >= 'a' && cCharAt <= 'z') {
                    lowerCase = str.toUpperCase();
                    break;
                }
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    lowerCase = str.toLowerCase();
                    break;
                }
                i++;
            }
            if (lowerCase != null && !set.contains(lowerCase)) {
                return !abstractC22044.m49876(lowerCase).mo2934();
            }
        }
        return true;
    }
}
