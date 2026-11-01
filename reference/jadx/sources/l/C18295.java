package l;

import android.net.Uri;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9S8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18295 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f58373 = C11904.f39938.m46690("localStorageMap");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f58374;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f58375;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f58377;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f58379;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Uri f58380;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Map f58378 = C0561.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f58376 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42505() {
        if (this.f58376) {
            return;
        }
        AbstractC20745 abstractC20745 = this.f58375;
        try {
            abstractC20745.mo46720();
            C11018 c11018 = new C11018();
            synchronized (this.f58378) {
                c11018.writeInt(this.f58378.size());
                for (Map.Entry entry : this.f58378.entrySet()) {
                    c11018.m27782((CharSequence) entry.getKey());
                    c11018.m27782((CharSequence) entry.getValue());
                }
            }
            try {
                abstractC20745.m46697(c11018);
            } catch (IOException unused) {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42506() {
        this.f58376 = true;
        f58373.m46690(this.f58374).mo24644();
    }

    public C18295(Uri uri, String str, String str2) {
        this.f58380 = uri;
        this.f58374 = str;
        this.f58377 = str2;
        String strConcat = uri.getPathSegments().get(1);
        if (!strConcat.endsWith("/") && !strConcat.endsWith(":")) {
            strConcat = strConcat.concat("/");
        }
        this.f58379 = strConcat;
        AbstractC20745 abstractC20745M46690 = f58373.m46690(str);
        this.f58375 = abstractC20745M46690;
        if (abstractC20745M46690.mo33975()) {
            try {
                C17367 c17367M46713 = abstractC20745M46690.m46713();
                int i = c17367M46713.readInt();
                for (int i2 = 0; i2 < i; i2++) {
                    this.f58378.put(c17367M46713.m40442(), c17367M46713.m40442());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m42504(String str, boolean z) {
        int iLastIndexOf;
        String str2;
        if (str.isEmpty()) {
            return this.f58380.getPathSegments().get(1);
        }
        String strM50267 = C22697.m50267(new StringBuilder(), this.f58379, str);
        Map map = this.f58378;
        String str3 = (String) map.get(strM50267);
        if (str3 != null) {
            return str3;
        }
        return (!z || (iLastIndexOf = strM50267.lastIndexOf(47)) == -1 || (str2 = (String) map.get(strM50267.substring(0, iLastIndexOf))) == null) ? strM50267 : C0242.m1616(iLastIndexOf, strM50267, C9023.m23356(str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m42503() {
        return "/storage/" + this.f58374;
    }
}
