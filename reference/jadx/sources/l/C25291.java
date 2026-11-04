package l;

import android.net.Uri;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩻᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9S8 */
/* JADX INFO: loaded from: classes.dex */
public final class C25291 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f81681 = C6382.f21568.m49876("localStorageMap");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f81684;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Uri f81685;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f81686;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f81687;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f81688;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Map f81683 = C4681.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f81682 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m56471() {
        if (this.f81682) {
            return;
        }
        AbstractC22044 abstractC22044 = this.f81688;
        try {
            abstractC22044.mo49834();
            C6178 c6178 = new C6178();
            synchronized (this.f81683) {
                c6178.writeInt(this.f81683.size());
                for (Map.Entry entry : this.f81683.entrySet()) {
                    c6178.m17786((CharSequence) entry.getKey());
                    c6178.m17786((CharSequence) entry.getValue());
                }
            }
            try {
                abstractC22044.m49844(c6178);
            } catch (IOException unused) {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m56472() {
        this.f81682 = true;
        f81681.m49876(this.f81684).mo4287();
    }

    public C25291(Uri uri, String str, String str2) {
        this.f81685 = uri;
        this.f81684 = str;
        this.f81686 = str2;
        String strConcat = uri.getPathSegments().get(1);
        if (!strConcat.endsWith("/") && !strConcat.endsWith(":")) {
            strConcat = strConcat.concat("/");
        }
        this.f81687 = strConcat;
        AbstractC22044 abstractC22044M49876 = f81681.m49876(str);
        this.f81688 = abstractC22044M49876;
        if (abstractC22044M49876.mo2934()) {
            try {
                C20348 c20348M49835 = abstractC22044M49876.m49835();
                int i = c20348M49835.readInt();
                for (int i2 = 0; i2 < i; i2++) {
                    this.f81683.put(c20348M49835.m46756(), c20348M49835.m46756());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m56470(String str, boolean z) {
        int iLastIndexOf;
        String str2;
        if (str.isEmpty()) {
            return this.f81685.getPathSegments().get(1);
        }
        String strM23910 = C8947.m23910(new StringBuilder(), this.f81687, str);
        Map map = this.f81683;
        String str3 = (String) map.get(strM23910);
        if (str3 != null) {
            return str3;
        }
        return (!z || (iLastIndexOf = strM23910.lastIndexOf(47)) == -1 || (str2 = (String) map.get(strM23910.substring(0, iLastIndexOf))) == null) ? strM23910 : ExternalValue$$ExternalSyntheticOutline0.m(iLastIndexOf, strM23910, C10732.m27333(str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m56469() {
        return "/storage/" + this.f81684;
    }
}
