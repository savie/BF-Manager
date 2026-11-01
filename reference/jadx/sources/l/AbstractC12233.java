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

/* JADX INFO: renamed from: l.۫ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: KAHM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12233 extends AbstractC9677 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Set f40871 = C0561.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f40872;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f40873 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC12068 f40874;

    /* JADX INFO: renamed from: ֡ */
    public abstract boolean mo10259();

    /* JADX INFO: renamed from: ֨ */
    public abstract String mo10260(String str);

    /* JADX INFO: renamed from: ۖ */
    public abstract boolean mo10261(String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract InputStream mo10262(long j, String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo10265(String str, String str2);

    /* JADX INFO: renamed from: ۚ */
    public abstract void mo10268(String str);

    /* JADX INFO: renamed from: ۜ */
    public abstract void mo10269(String str);

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۨ */
    public final String mo15077() {
        return b.k;
    }

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo10270(String str, boolean z);

    /* JADX INFO: renamed from: ۫ */
    public abstract boolean mo10271();

    /* JADX INFO: renamed from: ۬ */
    public abstract boolean mo10272(String str);

    /* JADX INFO: renamed from: ܰ */
    public abstract OutputStream mo10273(long j, String str);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo10274(C11018 c11018);

    /* JADX INFO: renamed from: ܺ */
    public abstract void mo10275();

    /* JADX INFO: renamed from: ܽ */
    public boolean mo19632() {
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public abstract String mo10276();

    /* JADX INFO: renamed from: ᩶ */
    public abstract boolean mo10277();

    /* JADX INFO: renamed from: ᩷ */
    public abstract String mo10278();

    /* JADX INFO: renamed from: ᩸ */
    public String mo10279() {
        return null;
    }

    static {
        C16737.m39273(new RunnableC20699());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30339() {
        boolean z;
        AbstractC12068 abstractC12068M15770;
        Set<AbstractC12233> set = f40871;
        synchronized (set) {
            z = false;
            for (AbstractC12233 abstractC12233 : set) {
                if (!abstractC12233.f40873 && (abstractC12068M15770 = C5717.m15770(abstractC12233.f40874.f40385)) != null && !abstractC12233.f40874.equals(abstractC12068M15770)) {
                    abstractC12233.mo10266(abstractC12068M15770);
                    z = true;
                }
            }
        }
        if (z) {
            C23561.m51925();
        }
    }

    public AbstractC12233(int i, AbstractC12068 abstractC12068) {
        this.f40872 = i;
        this.f40874 = abstractC12068;
        f40871.add(this);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10266(AbstractC12068 abstractC12068) {
        this.f40874 = abstractC12068;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15075(C11018 c11018) {
        c11018.writeInt(this.f40872);
        c11018.m27776(getClass().getName());
        c11018.m27782((CharSequence) C5717.m15772(this.f40874).toString());
        mo10274(c11018);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC12233 m30337(C17367 c17367) {
        int i = c17367.readInt();
        try {
            return (AbstractC12233) Class.forName(c17367.m40459()).getConstructor(Integer.TYPE, AbstractC12068.class, C17367.class).newInstance(Integer.valueOf(i), C5717.m15758(new JSONObject(c17367.m40442())), c17367);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m30349() {
        return this.f40874.f40397 ? 4 : 1;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static String m30338(String str) {
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

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static String m30340(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        String lowerCase = strTrim.toLowerCase(Locale.ROOT);
        if (lowerCase.startsWith("http://") || lowerCase.startsWith("https://")) {
            return m30338(strTrim);
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo30346(int i, String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo30342(int i, int i2, String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C0237 mo30343() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo30344(long j, String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m30350() {
        return this.f40874.mo4704();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC10033 mo30351(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo15073(AbstractActivityC12483 abstractActivityC12483, InterfaceC2557 interfaceC2557) {
        return mo10262(0L, interfaceC2557.getPath());
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15074(MessageDigest messageDigest) {
        messageDigest.update(b.k.getBytes());
        C22253.m49418(messageDigest, this.f40874.mo4706().toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream mo30341(String str, long j, long j2) {
        return mo10262(j, str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m30348(String str, boolean z) {
        try {
            mo10270(str, z);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean mo30347(String str, String str2) {
        try {
            mo10265(str, str2);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC12068 m30345() {
        return this.f40874;
    }
}
