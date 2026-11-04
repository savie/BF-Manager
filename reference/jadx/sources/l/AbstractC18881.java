package l;

import bin.mt.json.JSONObject;
import com.alipay.sdk.m.m.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ᩳۛ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: KAHM */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18881 extends AbstractC7629 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final Set f61286 = C4681.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f61287 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f61288;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC0148 f61289;

    /* JADX INFO: renamed from: ֡ */
    public boolean mo35568() {
        return true;
    }

    /* JADX INFO: renamed from: ۘ */
    public abstract String mo35569();

    /* JADX INFO: renamed from: ۙ */
    public abstract InputStream mo35570(long j, String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo35571(String str, String str2);

    /* JADX INFO: renamed from: ۚ */
    public abstract boolean mo35573(String str);

    /* JADX INFO: renamed from: ۟ */
    public abstract boolean mo35574();

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo35575(String str, boolean z);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo35576(String str);

    /* JADX INFO: renamed from: ۫ */
    public abstract String mo35577(String str);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo35578();

    /* JADX INFO: renamed from: ܶ */
    public abstract String mo35579();

    /* JADX INFO: renamed from: ܽ */
    public String mo35580() {
        return null;
    }

    /* JADX INFO: renamed from: ܿ */
    public abstract boolean mo35581();

    /* JADX INFO: renamed from: ᩴ */
    public abstract void mo35582(String str);

    /* JADX INFO: renamed from: ᩶ */
    public abstract boolean mo35583();

    /* JADX INFO: renamed from: ᩷ */
    public abstract OutputStream mo35584(long j, String str);

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ᩷ */
    public final String mo20842() {
        return b.k;
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo35585(C6178 c6178);

    /* JADX INFO: renamed from: ᩸ */
    public abstract boolean mo35586(String str);

    static {
        C21576.m49068(new RunnableC14405());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43783() {
        boolean z;
        AbstractC0148 abstractC0148M20792;
        Set<AbstractC18881> set = f61286;
        synchronized (set) {
            z = false;
            for (AbstractC18881 abstractC18881 : set) {
                if (!abstractC18881.f61287 && (abstractC0148M20792 = C7606.m20792(abstractC18881.f61289.f1127)) != null && !abstractC18881.f61289.equals(abstractC0148M20792)) {
                    abstractC18881.mo35572(abstractC0148M20792);
                    z = true;
                }
            }
        }
        if (z) {
            C8287.m22382();
        }
    }

    public AbstractC18881(int i, AbstractC0148 abstractC0148) {
        this.f61288 = i;
        this.f61289 = abstractC0148;
        f61286.add(this);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo35572(AbstractC0148 abstractC0148) {
        this.f61289 = abstractC0148;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20835(C6178 c6178) {
        c6178.writeInt(this.f61288);
        c6178.m17810(getClass().getName());
        c6178.m17786((CharSequence) C7606.m20797(this.f61289).toString());
        mo35585(c6178);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC18881 m43781(C20348 c20348) {
        int i = c20348.readInt();
        try {
            return (AbstractC18881) Class.forName(c20348.m46743()).getConstructor(Integer.TYPE, AbstractC0148.class, C20348.class).newInstance(Integer.valueOf(i), C7606.m20781(new JSONObject(c20348.m46756())), c20348);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m43792() {
        return this.f61289.f1123 ? 4 : 1;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static String m43782(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        try {
            return new URI(strTrim).getHost();
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m43784(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        String lowerCase = strTrim.toLowerCase(Locale.ROOT);
        if (lowerCase.startsWith("http://") || lowerCase.startsWith("https://")) {
            return m43782(strTrim);
        }
        char[] cArr = {'/', '?', '#'};
        int i = -1;
        for (int i2 = 0; i2 < 3; i2++) {
            int iIndexOf = strTrim.indexOf(cArr[i2]);
            if (iIndexOf >= 0 && (i < 0 || iIndexOf < i)) {
                i = iIndexOf;
            }
        }
        if (i >= 0) {
            strTrim = strTrim.substring(0, i);
        }
        if (strTrim.isEmpty()) {
            return null;
        }
        if (strTrim.startsWith("[")) {
            int iIndexOf2 = strTrim.indexOf(93);
            return iIndexOf2 > 0 ? strTrim.substring(0, iIndexOf2 + 1) : strTrim;
        }
        int iIndexOf3 = strTrim.indexOf(58);
        if (iIndexOf3 < 0 || iIndexOf3 != strTrim.lastIndexOf(58)) {
            return strTrim;
        }
        String strSubstring = strTrim.substring(iIndexOf3 + 1);
        if (strSubstring.isEmpty()) {
            return strTrim;
        }
        for (int i3 = 0; i3 < strSubstring.length(); i3++) {
            char cCharAt = strSubstring.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                return strTrim;
            }
        }
        return strTrim.substring(0, iIndexOf3);
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo43669(int i, String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo43787(int i, int i2, String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C0236 mo43785() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo43668(long j, String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m43790() {
        return this.f61289.mo1332();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC24277 mo43789(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo20829(AbstractActivityC17204 abstractActivityC17204, InterfaceC2386 interfaceC2386) {
        return mo35570(0L, interfaceC2386.getPath());
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20833(MessageDigest messageDigest) {
        messageDigest.update(b.k.getBytes());
        C15022.m36176(messageDigest, this.f61289.mo1331().toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream mo43786(String str, long j, long j2) {
        return mo35570(j, str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m43791(String str, boolean z) {
        try {
            mo35575(str, z);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo43670(String str, String str2) {
        try {
            mo35571(str, str2);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC0148 m43788() {
        return this.f61289;
    }
}
