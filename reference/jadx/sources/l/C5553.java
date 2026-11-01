package l;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
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
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۚ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes2.dex */
public final class C5553 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int f19058;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Boolean f19059;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19060 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f19061;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C18623 f19062;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static Boolean f19063;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String f19064;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static InterfaceC7566 f19065;

    static {
        String path = Environment.getExternalStorageDirectory().getPath();
        f19064 = path;
        f19058 = (int) (System.currentTimeMillis() & 16777215);
        C18623 c18623 = new C18623();
        f19062 = c18623;
        f19061 = true;
        f19065 = new C1694(0);
        c18623.add(path);
        c18623.add("/sdcard");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15305() {
        return f19064;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C18623 m15328() {
        C7817 c7817M29947;
        boolean z = f19061;
        C18623 c18623 = f19062;
        if (z && C19812.m45051() && !C12051.m29950()) {
            f19061 = false;
            LinkedList linkedList = new LinkedList(c18623);
            try {
                c7817M29947 = C12051.m29947(false);
                while (!linkedList.isEmpty()) {
                    try {
                        C5574 c5574M20595 = c7817M29947.m20595(new File((String) linkedList.removeFirst()).getPath());
                        if (c5574M20595.m15397() != null) {
                            String strM15397 = c5574M20595.m15397();
                            if (c18623.add(strM15397)) {
                                linkedList.addLast(strM15397);
                            } else {
                                continue;
                            }
                        }
                    } catch (Throwable unused) {
                        if (c7817M29947 != null) {
                            c7817M29947.m20606();
                        }
                        return c18623;
                    }
                }
                c7817M29947.m20606();
                return c18623;
            } catch (Throwable unused2) {
                c7817M29947 = null;
            }
        }
        return c18623;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15320(AbstractActivityC12483 abstractActivityC12483) {
        if (abstractActivityC12483.getIntent().getData() != null) {
            return false;
        }
        abstractActivityC12483.finish();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m15309(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            throw new NullPointerException("Intent data is null: " + intent);
        }
        return m15310(data);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m15314(ActivityC4866 activityC4866) {
        Intent intent = activityC4866.getIntent();
        Uri data = intent.getData();
        if (data == null) {
            data = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        }
        if (data == null) {
            throw new NullPointerException("Intent data is null: " + intent);
        }
        return m15310(data);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m15310(Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        String path;
        if ("file".equals(uri.getScheme())) {
            String path2 = uri.getPath();
            C13638.requireNonNull(path2);
            return m15313(C0988.m3795(path2), new String[0]);
        }
        if ("content".equals(uri.getScheme())) {
            String host = uri.getHost();
            if (C14396.f47198.equals(host)) {
                return C14396.m34658(uri);
            }
            if ("bin.mt.plus.fileprovider2".equals(host) || "bin.mt.plus.canary.fileprovider2".equals(host) || "bin.mt.plus.fp".equals(host) || "bin.mt.plus.canary.fp".equals(host)) {
                String path3 = uri.getPath();
                if (path3 != null && !path3.startsWith("/NOT_DELETE/")) {
                    return m15313(path3, new String[0]);
                }
            } else if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String strM50044 = C22529.m50044(uri);
                if (strM50044 != null) {
                    if ("primary".equals(strM50044)) {
                        return C11904.f39934.m46690(C22529.m50046(uri).getPathSegments().get(3).substring(strM50044.length() + 1));
                    }
                    for (C18149 c18149 : (ArrayList) C8272.m21693(null)) {
                        if (c18149.f58037.equals(strM50044)) {
                            return m15313(c18149.f58039.getAbsolutePath(), C22529.m50046(uri).getPathSegments().get(3).substring(strM50044.length() + 1));
                        }
                    }
                }
            } else if ("com.android.providers.downloads.ui.fileprovider".equals(uri.getAuthority()) && (path = uri.getPath()) != null && path.startsWith("/external_files/Download/")) {
                return C11904.f39934.m46690(path.substring(16));
            }
            String strM3794 = C0988.m3794(uri);
            if (strM3794 != null) {
                AbstractC20745 abstractC20745M15313 = m15313(strM3794, new String[0]);
                if (abstractC20745M15313.mo8449()) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        InterfaceC19106 interfaceC19106M45045 = C19812.m45045();
                        if (!interfaceC19106M45045.mo43871()) {
                            try {
                                if (abstractC20745M15313 instanceof C17196) {
                                    C17196 c17196 = (C17196) abstractC20745M15313;
                                    if (interfaceC19106M45045.mo43870()) {
                                        Future futureSubmit = C4716.f16636.submit(new CallableC9457(0, c17196));
                                        try {
                                            if (futureSubmit.get(1L, TimeUnit.SECONDS) == Boolean.TRUE) {
                                                if (!futureSubmit.isDone()) {
                                                    futureSubmit.cancel(true);
                                                    return abstractC20745M15313;
                                                }
                                            } else if (!futureSubmit.isDone()) {
                                                futureSubmit.cancel(true);
                                            }
                                        } catch (Exception unused) {
                                            if (!futureSubmit.isDone()) {
                                            }
                                        } catch (Throwable th) {
                                            if (!futureSubmit.isDone()) {
                                                futureSubmit.cancel(true);
                                            }
                                            throw th;
                                        }
                                    } else if (c17196.mo40126() && (parcelFileDescriptorOpenFileDescriptor = C16737.m39259().openFileDescriptor(c17196.mo40127(), "r")) != null) {
                                        parcelFileDescriptorOpenFileDescriptor.close();
                                        return abstractC20745M15313;
                                    }
                                } else if (abstractC20745M15313 instanceof C14705) {
                                    ((C14705) abstractC20745M15313).mo33970().close();
                                }
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    return abstractC20745M15313;
                }
            }
            return new C22383(uri);
        }
        throw new RuntimeException("Unsupported uri: " + uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745[] m15322(String[] strArr) {
        AbstractC20745[] abstractC20745Arr = new AbstractC20745[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            abstractC20745Arr[i] = m15313(strArr[i], new String[0]);
        }
        return abstractC20745Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15307(String str, boolean z) throws IOException {
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
                        C19028.m43762(arrayList, 1);
                    } else {
                        if (strSubstring.length() >= 2 && Character.isLetter(strSubstring.charAt(0)) && strSubstring.charAt(1) == ':') {
                            throw new IOException("Unsafe archive entry path: ".concat(str));
                        }
                        arrayList.add(m15332(strSubstring));
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m15324(String str, String str2) throws IOException {
        if (!str2.isEmpty()) {
            int i = 0;
            if (str2.indexOf(0) < 0 && !str2.startsWith("/") && !str2.startsWith("\\")) {
                if (str2.length() >= 2 && Character.isLetter(str2.charAt(0)) && str2.charAt(1) == ':') {
                    throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
                }
                String strM15307 = m15307(str, false);
                ArrayList arrayList = new ArrayList();
                int iLastIndexOf = strM15307.lastIndexOf(47);
                if (iLastIndexOf != -1) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < iLastIndexOf; i3++) {
                        if (strM15307.charAt(i3) == '/') {
                            arrayList.add(strM15307.substring(i2, i3));
                            i2 = i3 + 1;
                        }
                    }
                    arrayList.add(strM15307.substring(i2, iLastIndexOf));
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
                                C19028.m43762(arrayList2, 1);
                            } else {
                                if (strSubstring.length() >= 2 && Character.isLetter(strSubstring.charAt(0)) && strSubstring.charAt(1) == ':') {
                                    throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
                                }
                                arrayList2.add(m15332(strSubstring));
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
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m15332(String str) {
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
    public static AbstractC20745 m15313(String str, String... strArr) {
        String strM15306;
        if (str.startsWith("content://") || str.startsWith("android.resource://")) {
            if (strArr.length != 0) {
                throw new IllegalArgumentException("Children must be empty when path is context uri");
            }
            return new C22383(Uri.parse(str));
        }
        if (str.startsWith("$RECYCLE.BIN$/")) {
            str = C20370.m46020().mo33986() + str.substring(13);
            if (C19812.m45045().mo43871() && (strM15306 = m15306(str)) != null) {
                str = "/data/media/" + C11904.f39934.getName() + "/" + strM15306;
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
        return m15311(file);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00da  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m15311(File file) {
        Pair pairCreate;
        String strM59;
        String path = file.getPath();
        if (Build.VERSION.SDK_INT >= 30) {
            Iterator it = m15328().iterator();
            while (true) {
                if (!it.hasNext()) {
                    pairCreate = Pair.create(0, null);
                    break;
                }
                String str = (String) it.next();
                if (m15319(path, str)) {
                    int length = str.length();
                    int i = length + 1;
                    if (!m15318(path, i, "android", path.length(), 7)) {
                        if (path.length() == str.length()) {
                            strM59 = Features3.m59(path);
                        } else {
                            strM59 = null;
                        }
                        if (strM59 == null) {
                            strM59 = "";
                        }
                        pairCreate = Pair.create(1, strM59);
                        break;
                    }
                    int i2 = length + 9;
                    if (!m15318(path, i2, e.m, path.length(), 4)) {
                        if (!m15318(path, i2, "obb", path.length(), 3)) {
                            if (path.length() == str.length()) {
                                strM59 = Features3.m59(path);
                            } else {
                                strM59 = null;
                            }
                            if (strM59 == null) {
                                strM59 = "";
                            }
                            pairCreate = Pair.create(1, strM59);
                            break;
                        }
                        String strM39293 = C16737.m39293();
                        if (!m15318(path, length + 13, strM39293, path.length(), strM39293.length())) {
                            pairCreate = Pair.create(3, path.substring(i, path.endsWith("/") ? path.length() - 1 : path.length()));
                            break;
                        }
                        pairCreate = Pair.create(4, null);
                        break;
                    }
                    String strM39294 = C16737.m39293();
                    if (!m15318(path, length + 14, strM39294, path.length(), strM39294.length())) {
                        pairCreate = Pair.create(2, path.substring(i, path.endsWith("/") ? path.length() - 1 : path.length()));
                        break;
                    }
                    pairCreate = Pair.create(4, null);
                    break;
                }
            }
            int iIntValue = ((Integer) pairCreate.first).intValue();
            if (iIntValue == 1) {
                C15432 c15432 = new C15432(file, false);
                c15432.f50293 = (String) pairCreate.second;
                return c15432;
            }
            if (iIntValue == 2 || iIntValue == 3) {
                return m15312(file, (String) pairCreate.second, null);
            }
            if (iIntValue == 4) {
                C15432 c15433 = new C15432(file, true);
                c15433.f50293 = "";
                return c15433;
            }
        } else if (m15304(path)) {
            return new C15432(file, false);
        }
        if (m15327(path)) {
            return new C14042(file, true);
        }
        AbstractC20745 abstractC20745M18814 = C7006.m18814(file);
        if (abstractC20745M18814 != null) {
            return abstractC20745M18814;
        }
        C23235 c23235M43707 = C19001.m43707(file);
        return c23235M43707 != null ? c23235M43707 : new C14042(file, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m15312(File file, String str, C16491 c16491) {
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
        if (!C19812.m45045().mo43869() && (m15326() || (m15303() && str.equalsIgnoreCase(str2)))) {
            return new C14705(new File(f19064, C0242.m1616(7, str, new StringBuilder("\u200bAndroid"))), false);
        }
        if (m15303()) {
            return new C17196(file, C0242.m1616(7, str, new StringBuilder("\u200bAndroid")), "\u200bAndroid", c16491);
        }
        if (Build.VERSION.SDK_INT < 33 || !str.regionMatches(true, 0, str2.concat("/"), 0, str2.length() + 1)) {
            return new C17196(file, str, str2, c16491);
        }
        int iIndexOf = str.indexOf(47, i);
        return iIndexOf == -1 ? new C17196(file, str, str, c16491) : new C17196(file, str, str.substring(0, iIndexOf), c16491);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m15329(String str) {
        return C8272.m21690(str) != null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m15304(String str) {
        Iterator it = m15328().iterator();
        while (it.hasNext()) {
            if (m15319(str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m15330(String str, String str2) {
        if (!str.equals(str2)) {
            int iLastIndexOf = str.lastIndexOf(47) + 1;
            int iLastIndexOf2 = str2.lastIndexOf(47) + 1;
            int length = str.length() - iLastIndexOf;
            if (length != str2.length() - iLastIndexOf2 || !str.regionMatches(true, iLastIndexOf, str2, iLastIndexOf2, length)) {
                return false;
            }
            int i = -1;
            int i2 = -1;
            for (String str3 : m15328()) {
                int length2 = str3.endsWith("/") ? str3.length() : str3.length() + 1;
                int i3 = (i >= 0 || str.length() <= length2 || !m15319(str, str3)) ? i : length2;
                int i4 = (i2 >= 0 || str2.length() <= length2 || !m15319(str2, str3)) ? i2 : length2;
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
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15306(String str) {
        for (String str2 : m15328()) {
            if (m15319(str, str2)) {
                int length = str2.endsWith("/") ? str2.length() : str2.length() + 1;
                if (str.length() > length) {
                    return str.substring(length);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m15323(String str) {
        String strM15306 = m15306(str);
        String str2 = f19064;
        if (strM15306 != null) {
            return new File(str2, strM15306).getPath();
        }
        return m15304(str) ? str2 : str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15319(String str, String str2) {
        return m15318(str, 0, str2, str.length(), str2.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15318(String str, int i, String str2, int i2, int i3) {
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m15327(String str) {
        String lowerCase = (str.endsWith("/") ? str : str.concat("/")).toLowerCase();
        if (lowerCase.startsWith(C16737.m39258().getAbsolutePath().toLowerCase() + "/")) {
            return true;
        }
        if (!str.startsWith("/data/")) {
            return false;
        }
        String lowerCase2 = C16737.m39293().toLowerCase();
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
    public static AbstractC20745 m15315(AbstractC20745 abstractC20745, String str) {
        AbstractC20745 abstractC20745M46690;
        abstractC20745.mo33987();
        do {
            StringBuilder sb = new StringBuilder();
            int i = f19058;
            f19058 = i + 1;
            sb.append(i);
            sb.append(str);
            abstractC20745M46690 = abstractC20745.m46690(sb.toString());
        } while (abstractC20745M46690.mo33975());
        return abstractC20745M46690;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15316(InterfaceC7566 interfaceC7566) {
        f19065 = interfaceC7566;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m15331(AbstractC20745 abstractC20745) {
        InterfaceC20972 interfaceC20972;
        return ((abstractC20745.mo33979() && abstractC20745.mo33969().m33967()) || (interfaceC20972 = f19065.get()) == null || !interfaceC20972.mo38358(abstractC20745.mo33986())) ? false : true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m15325(AbstractC20745 abstractC20745) {
        InterfaceC20972 interfaceC20972 = f19065.get();
        if (interfaceC20972 != null) {
            interfaceC20972.mo38359(abstractC20745.mo33986());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15317(AbstractC20745 abstractC20745) {
        if (abstractC20745.mo33979() && abstractC20745.mo33969().m33967()) {
            return;
        }
        InterfaceC20972 interfaceC20972 = f19065.get();
        String strMo33986 = abstractC20745.mo33986();
        if (interfaceC20972 == null || !interfaceC20972.mo38358(strMo33986)) {
            return;
        }
        interfaceC20972.mo38359(strMo33986);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m15326() {
        File[] fileArrListFiles;
        Boolean bool = f19059;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = f19064;
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
                        f19059 = Boolean.FALSE;
                        f19063 = Boolean.TRUE;
                        return false;
                    }
                }
            }
            Boolean bool2 = Boolean.TRUE;
            f19059 = bool2;
            f19063 = bool2;
            return true;
        }
        Boolean bool3 = Boolean.FALSE;
        f19059 = bool3;
        f19063 = bool3;
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m15303() {
        if (f19063 == null) {
            m15326();
        }
        return f19063.booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15308(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746) {
        String name = abstractC20745.getName();
        String name2 = abstractC20746.getName();
        if (name2.equals(name)) {
            return null;
        }
        if (name2.contains("\\") || name2.contains("/")) {
            return C16737.m39288(R.string.MT_Protector);
        }
        if (name2.equalsIgnoreCase(name)) {
            if (abstractC20746.mo33975()) {
                List listMo33973 = abstractC20746.m46711().mo33973();
                if (listMo33973.contains(name) && listMo33973.contains(name2)) {
                    if (abstractC20746.mo33974()) {
                        return C16737.m39288(R.string.MT_Protector);
                    }
                    return C16737.m39288(R.string.MT_Protector);
                }
            }
            AbstractC20745 abstractC20745M46733 = abstractC20745.m46733(".tmp");
            if (abstractC20745.mo24646(abstractC20745M46733) && abstractC20745M46733.mo24646(abstractC20746)) {
                return null;
            }
            if (name2.contains(":") || name2.contains("?") || name2.contains("*") || name2.contains("\"") || name2.contains("<") || name2.contains(">") || name2.contains("|")) {
                return C16737.m39288(R.string.MT_Protector);
            }
            return C16737.m39288(R.string.MT_Protector);
        }
        if (abstractC20746.mo33975()) {
            if (abstractC20746.mo33974()) {
                return C16737.m39288(R.string.MT_Protector);
            }
            return C16737.m39288(R.string.MT_Protector);
        }
        if (abstractC20745.mo24646(abstractC20746)) {
            return null;
        }
        return C16737.m39288(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15321(AbstractC20745 abstractC20745, List list) {
        String lowerCase;
        Set<String> set = (Set) C9030.stream(list).map(new C3105(0)).collect(C1890.toUnmodifiableSet());
        if (abstractC20745.mo36912() && abstractC20745.mo32858()) {
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
                return !abstractC20745.m46690(lowerCase).mo33975();
            }
        }
        return true;
    }
}
