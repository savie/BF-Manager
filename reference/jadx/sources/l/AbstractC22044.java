package l;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22044 implements Serializable, Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final String f71089 = File.separator;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f71090;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Pattern f71091;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f71092;

    public abstract String getName();

    public abstract String getParent();

    /* JADX INFO: renamed from: ֡ */
    public abstract boolean mo4274();

    /* JADX INFO: renamed from: ֨ */
    public abstract boolean mo2934();

    /* JADX INFO: renamed from: ֨ۙ */
    public boolean mo7162() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC15475 mo4276(String str);

    /* JADX INFO: renamed from: ۗۙ */
    public boolean mo42886() {
        return false;
    }

    /* JADX INFO: renamed from: ۘ */
    public boolean mo4277() {
        return true;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo2942(long j) {
        return false;
    }

    /* JADX INFO: renamed from: ۚ */
    public abstract ParcelFileDescriptor mo4279(String str);

    /* JADX INFO: renamed from: ۚ᩷ */
    public abstract FileChannel mo4280();

    /* JADX INFO: renamed from: ۛ */
    public boolean mo37325() {
        return true;
    }

    /* JADX INFO: renamed from: ۛۙ */
    public abstract boolean mo4281();

    /* JADX INFO: renamed from: ۛ᩷ */
    public boolean mo2945() {
        return this instanceof C15593;
    }

    /* JADX INFO: renamed from: ۜۙ */
    public abstract List mo4282();

    /* JADX INFO: renamed from: ۟ */
    public abstract boolean mo4283();

    /* JADX INFO: renamed from: ۟ۙ */
    public boolean mo19981() {
        return false;
    }

    /* JADX INFO: renamed from: ۠ */
    public AbstractC22044 mo4284() {
        return this;
    }

    /* JADX INFO: renamed from: ۠ۙ */
    public abstract long mo4285();

    /* JADX INFO: renamed from: ۡۙ */
    public abstract long mo4286();

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public boolean mo49854() {
        return false;
    }

    /* JADX INFO: renamed from: ۤ */
    public abstract OutputStream mo4289(boolean z);

    /* JADX INFO: renamed from: ۧ᩷ */
    public abstract InputStream mo4290();

    /* JADX INFO: renamed from: ۨ᩷ */
    public boolean mo4292() {
        return false;
    }

    /* JADX INFO: renamed from: ܺ */
    public abstract boolean mo4293();

    /* JADX INFO: renamed from: ܺۙ */
    public abstract String mo4294();

    /* JADX INFO: renamed from: ܿۙ */
    public boolean mo4295() {
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public abstract boolean mo4296();

    /* JADX INFO: renamed from: ᩴۙ */
    public String mo2954() {
        return null;
    }

    /* JADX INFO: renamed from: ᩵ۙ */
    public abstract boolean mo4297();

    /* JADX INFO: renamed from: ᩶ۙ */
    public boolean mo7468() {
        return false;
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract List mo4299(boolean z);

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo4300(InterfaceC7509 interfaceC7509) {
        return false;
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo4301(AbstractC22044 abstractC22044);

    /* JADX INFO: renamed from: ᩹ */
    public abstract boolean mo4302();

    /* JADX INFO: renamed from: ᩺ */
    public abstract boolean mo4303();

    /* JADX INFO: renamed from: ᩺ۙ */
    public abstract boolean mo4304();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean mo49880() {
        return true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getName().compareToIgnoreCase(((AbstractC22044) obj).getName());
    }

    static {
        String str = File.pathSeparator;
        char c = File.separatorChar;
        char c2 = File.pathSeparatorChar;
        f71091 = Pattern.compile("(.*) \\((\\d+)\\)");
        f71090 = Pattern.compile("(.*)\\((\\d+)\\)");
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static String m49832(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        String strSubstring = iLastIndexOf == -1 ? "" : str.substring(iLastIndexOf);
        String[] strArr = {".1", ".apk.1", ".png", ".9.png", ".gz", ".tar.gz", ".xz", ".tar.xz", ".zst", ".tar.zst", ".zstd", ".tar.zstd", ".bz2", ".tar.bz2", ".lz4", ".tar.lz4"};
        for (int i = 0; i < 16; i += 2) {
            if (strSubstring.equals(strArr[i])) {
                int i2 = i + 1;
                String str2 = strArr[i2];
                int i3 = C24276.f78588;
                if (AbstractC21292.f67895.m48532(str2, str)) {
                    return str.substring(str.length() - strArr[i2].length());
                }
            }
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final String m49874() {
        String name = getName();
        return name.substring(0, name.length() - m49832(name).length());
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final String m49864() {
        return m49832(getName());
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final String m49881() {
        String parent = getParent();
        if (parent != null) {
            return parent;
        }
        throw new NullPointerException(C1402.m5125(this, new StringBuilder("Not parent: ")));
    }

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public final Uri m49836() {
        return Uri.fromFile(new File(mo4294()));
    }

    /* JADX INFO: renamed from: ۚۙ */
    public AbstractC22044 mo2943() {
        return m49856();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m49852() {
        String strMo2954 = mo2954();
        if (strMo2954 == null) {
            return null;
        }
        if (strMo2954.startsWith("/")) {
            return strMo2954;
        }
        AbstractC22044 abstractC22044Mo2943 = mo2943();
        while (abstractC22044Mo2943 != null) {
            if (strMo2954.isEmpty() || strMo2954.equals(".")) {
                return abstractC22044Mo2943.mo4294();
            }
            if (strMo2954.equals("..")) {
                return abstractC22044Mo2943.getParent();
            }
            if (strMo2954.startsWith("./")) {
                strMo2954 = strMo2954.substring(2);
            } else if (strMo2954.startsWith("../")) {
                strMo2954 = strMo2954.substring(3);
                abstractC22044Mo2943 = abstractC22044Mo2943.m49858();
            } else {
                return abstractC22044Mo2943.m49876(strMo2954).mo4294();
            }
        }
        return mo4294();
    }

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC11601 mo4298() {
        return new C19806(this);
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49860() {
        return mo2954() != null;
    }

    /* JADX INFO: renamed from: ܽۙ */
    public String mo2951() {
        return m49860() ? m49852() : mo4294();
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo2946(String str) {
        C14453.m34909(str, mo4294());
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m49858() {
        String parent = getParent();
        if (parent != null) {
            return C14584.m35193(parent, new String[0]);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m49856() {
        AbstractC22044 abstractC22044M49858 = m49858();
        if (abstractC22044M49858 != null) {
            return abstractC22044M49858;
        }
        throw new NullPointerException(C1402.m5125(this, new StringBuilder("Not parent: ")));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m49868(String str) {
        return C14584.m35193(m49881(), str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m49876(String str) {
        return C14584.m35193(mo4294(), str);
    }

    /* JADX INFO: renamed from: ۙۙ */
    public String mo4278() {
        return mo4284().mo4294();
    }

    /* JADX INFO: renamed from: ۤۙ */
    public Uri mo42888() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public final Uri m49878() {
        return C17568.m41230(mo4294());
    }

    /* JADX INFO: renamed from: ۢ */
    public boolean mo4287() {
        return mo4296();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m49837(InterfaceC7509 interfaceC7509) {
        if (!mo4281()) {
            return mo4285();
        }
        List listMo4299 = mo4299(true);
        long jM49837 = 0;
        for (int i = 0; i < listMo4299.size() && !interfaceC7509.mo924(); i++) {
            jM49837 += ((AbstractC22044) listMo4299.get(i)).m49837(interfaceC7509);
        }
        return jM49837;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m49870() {
        String strMo4278 = mo4278();
        int i = C14584.f45961;
        return new File(strMo4278).canRead();
    }

    /* JADX INFO: renamed from: ۨ */
    public boolean mo4291() {
        return m49870();
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC18555 mo2938(InterfaceC21539 interfaceC21539) {
        return new C9604(this, interfaceC21539);
    }

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public final BufferedInputStream m49875() {
        InputStream inputStreamMo4290 = mo4290();
        if (inputStreamMo4290 instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStreamMo4290;
        }
        return new BufferedInputStream(inputStreamMo4290);
    }

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public final BufferedReader m49863() {
        return new BufferedReader(new InputStreamReader(mo4290(), StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream m49869() {
        OutputStream outputStreamMo4289 = mo4289(false);
        if (outputStreamMo4289 instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStreamMo4289;
        }
        return new BufferedOutputStream(outputStreamMo4289);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13961 m49855(String str) {
        return C11746.m29495(mo4276(str));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00c7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.۠᩵ᩴ, l.᩶᩵ᩴ, res.Hex] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 ??, still in use, count: 2, list:
          (r4v1 ?? I:res.Hex) from 0x00b4: INVOKE (r4v1 ?? I:res.Hex), (r11v0 'this' l.￡ﾩﾷￛﾨ￡ﾩﾴ A[IMMUTABLE_TYPE, THIS]) DIRECT call: res.Hex.decode_B(java.lang.String):byte[] A[Catch: all -> 0x00c7, IOException -> 0x00c9, MD:(java.lang.String):byte[] (m)]
          (r4v1 ?? I:l.￡ﾩﾶ￡ﾩﾵ￡ﾩﾴ) from 0x00b7: INVOKE (r3v3 l.ￜ﾿￡ﾩﾵ￡ﾩﾴ) = (r12v0 l.￡ﾩﾷￛﾨ￡ﾩﾴ), (r4v1 ?? I:l.￡ﾩﾶ￡ﾩﾵ￡ﾩﾴ) VIRTUAL call: l.￡ﾩﾷￛﾨ￡ﾩﾴ.ￛﾙ(l.￡ﾩﾶ￡ﾩﾵ￡ﾩﾴ):l.ￜ﾿￡ﾩﾵ￡ﾩﾴ A[Catch: all -> 0x00c7, IOException -> 0x00c9, MD:(l.￡ﾩﾶ￡ﾩﾵ￡ﾩﾴ):l.ￜ﾿￡ﾩﾵ￡ﾩﾴ (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m49847(l.AbstractC22044 r12, l.C24523 r13, l.InterfaceC23711 r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC22044.m49847(l.᩷ۨᩴ, l.᩺᩵ᩴ, l.᩹ܿᩴ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49842(OutputStream outputStream, InterfaceC3573 interfaceC3573) throws IOException {
        try {
            InputStream inputStreamMo4290 = mo4290();
            try {
                C21298.m48534(inputStreamMo4290, outputStream, mo4285(), interfaceC3573);
                inputStreamMo4290.close();
            } catch (Throwable th) {
                if (inputStreamMo4290 != null) {
                    try {
                        inputStreamMo4290.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            C2148.m7413(this, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49846(AbstractC22044 abstractC22044, C24523 c24523) throws IOException {
        if (!mo4281()) {
            m49847(abstractC22044, c24523, (InterfaceC23711) null);
            return;
        }
        if (c24523 != null) {
            c24523.m54796(this);
            abstractC22044.m49853();
            c24523.m54797(abstractC22044);
        } else {
            abstractC22044.m49853();
        }
        for (AbstractC22044 abstractC22045 : mo4299(true)) {
            abstractC22045.m49846(abstractC22044.m49876(abstractC22045.getName()), c24523);
        }
    }

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m49865() throws IOException {
        InputStream inputStreamMo4290 = mo4290();
        try {
            byte[] bArrM46522 = C20244.m46522(inputStreamMo4290, (int) mo4285());
            if (inputStreamMo4290 != null) {
                inputStreamMo4290.close();
            }
            return bArrM46522;
        } catch (Throwable th) {
            if (inputStreamMo4290 != null) {
                try {
                    inputStreamMo4290.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m49866() {
        long jMo4285 = mo4285();
        if (jMo4285 <= 20971520) {
            return m49865();
        }
        try {
            InputStream inputStreamMo4290 = mo4290();
            try {
                byte[] bArrM46521 = C20244.m46521(jMo4285, inputStreamMo4290);
                if (inputStreamMo4290 != null) {
                    inputStreamMo4290.close();
                }
                return bArrM46521;
            } catch (Throwable th) {
                if (inputStreamMo4290 != null) {
                    try {
                        inputStreamMo4290.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused) {
            return m49865();
        }
    }

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public final C20348 m49835() {
        return new C20348(m49865());
    }

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public final String m49871() throws IOException {
        InputStream inputStreamMo4290 = mo4290();
        try {
            String strM15490 = C5125.m15490(inputStreamMo4290, Charset.defaultCharset());
            if (inputStreamMo4290 != null) {
                inputStreamMo4290.close();
            }
            return strM15490;
        } catch (Throwable th) {
            if (inputStreamMo4290 != null) {
                try {
                    inputStreamMo4290.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public final int m49882() throws IOException {
        InputStream inputStreamMo4290 = mo4290();
        try {
            int iM19208 = C6929.m19208(0, C5125.m15501(inputStreamMo4290, 4));
            inputStreamMo4290.close();
            return iM19208;
        } catch (Throwable th) {
            if (inputStreamMo4290 != null) {
                try {
                    inputStreamMo4290.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49849(byte[] bArr) {
        m49850(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49850(byte[] bArr, int i, int i2) {
        mo49834();
        mo2938(new C14079(this, bArr, i, i2, C14584.m35212(this) && !mo2934())).m43134();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49840(InputStream inputStream) {
        m49841(inputStream, -1L, (InterfaceC23711) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49841(InputStream inputStream, long j, InterfaceC23711 interfaceC23711) {
        mo49834();
        m49872(inputStream, j, interfaceC23711);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49872(InputStream inputStream, long j, InterfaceC23711 interfaceC23711) {
        mo2938(new C4890(this, inputStream, j, interfaceC23711, C14584.m35212(this) && !mo2934())).m43134();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49844(C6178 c6178) {
        m49850(c6178.m17808(), 0, c6178.size());
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m49879(String str) {
        m49849(str.getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49873(String str) throws IOException {
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        int length = bytes.length;
        mo49834();
        boolean z = C14584.m35212(this) && !mo2934();
        OutputStream outputStreamMo4289 = mo4289(true);
        try {
            outputStreamMo4289.write(bytes, 0, length);
            outputStreamMo4289.close();
            if (z) {
                C14584.m35203(this);
            }
        } catch (Throwable th) {
            if (outputStreamMo4289 != null) {
                try {
                    outputStreamMo4289.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m49857(String str) {
        return C14584.m35194(this, str);
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m49877() {
        return C14584.m35194(this, ".tmp");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m49862(String str) {
        return C14584.m35194(m49856(), str);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m49867() {
        if (!mo2934() || mo4281()) {
            return;
        }
        if (mo4285() == 0) {
            mo4296();
            return;
        }
        AbstractC22044 abstractC22044M35193 = C14584.m35193(mo4294() + ".bak", new String[0]);
        abstractC22044M35193.mo4296();
        mo4301(abstractC22044M35193);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49859() {
        AbstractC22044 abstractC22044M35193 = C14584.m35193(mo4294() + ".bak", new String[0]);
        if (abstractC22044M35193.mo2934()) {
            if (mo2934()) {
                mo4296();
            }
            abstractC22044M35193.mo4301(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49843(InterfaceC1733 interfaceC1733) throws IOException {
        try {
            new C24854(this).m55383(interfaceC1733);
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49845(AbstractC22044 abstractC22044, Runnable runnable) throws IOException {
        if (mo4301(abstractC22044)) {
            return;
        }
        if (abstractC22044.mo2934() && (mo4281() || abstractC22044.mo4281())) {
            throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Move failed, target exists: ")));
        }
        if (runnable != null) {
            runnable.run();
        }
        m49846(abstractC22044, new C24523());
        mo4296();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49848(AbstractC22044 abstractC22044, boolean z, boolean z2, Runnable runnable) throws IOException {
        AbstractC22044 abstractC22044M49862;
        if (equals(abstractC22044)) {
            throw new IOException(C1402.m5125(this, new StringBuilder("Source and target are the same file: ")));
        }
        if (mo4281()) {
            throw new IOException(C1402.m5125(this, new StringBuilder("Source file is a directory: ")));
        }
        if (abstractC22044.mo2934() && abstractC22044.mo4281()) {
            throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Target file is a directory: ")));
        }
        if (!abstractC22044.mo2934()) {
            abstractC22044M49862 = null;
        } else {
            if (abstractC22044.getParent() == null) {
                throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Target file has no parent for rollback: ")));
            }
            abstractC22044M49862 = abstractC22044.m49862(".force_replace_target");
            if (!abstractC22044.mo4301(abstractC22044M49862)) {
                throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Unable to move target file to rollback file: ")));
            }
        }
        try {
            m49845(abstractC22044, runnable);
            if (abstractC22044M49862 == null || !abstractC22044M49862.mo2934()) {
                return;
            }
            if (!z) {
                abstractC22044M49862.mo4296();
                return;
            }
            AbstractC22044 abstractC22044M35193 = C14584.m35193(abstractC22044.mo4294() + ".bak", new String[0]);
            if (abstractC22044M35193.mo2934() && !abstractC22044M35193.mo4296()) {
                abstractC22044M49862.mo4296();
            } else {
                if (abstractC22044M49862.mo4301(abstractC22044M35193)) {
                    return;
                }
                abstractC22044M49862.mo4296();
            }
        } catch (IOException e) {
            if (abstractC22044.mo2934() && !abstractC22044.mo4296()) {
                e.addSuppressed(new IOException(C1402.m5125(abstractC22044, new StringBuilder("Unable to delete failed target file: "))));
            }
            if (abstractC22044M49862 != null && abstractC22044M49862.mo2934() && !abstractC22044M49862.mo4301(abstractC22044)) {
                e.addSuppressed(new IOException(C1402.m5125(abstractC22044, new StringBuilder("Unable to restore original target file: "))));
            }
            if (z2 && mo2934() && !mo4296()) {
                e.addSuppressed(new IOException(C1402.m5125(this, new StringBuilder("Unable to delete source file after replace failure: "))));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m49853() throws IOException {
        if (!mo2934()) {
            if (!mo4274() && !mo4281()) {
                throw new IOException(C1402.m5125(this, new StringBuilder("Unable to create directory ")));
            }
        } else {
            if (mo4281()) {
                return;
            }
            throw new IOException("File " + mo4294() + " exists and is not a directory. Unable to create directory.");
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo49834() {
        m49856().m49853();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m49839(boolean z) {
        String parent;
        String strM49864;
        AbstractC22044 abstractC22044M35193;
        if (!mo2934() || (parent = getParent()) == null) {
            return this;
        }
        String name = getName();
        int i = 0;
        if (mo4281()) {
            strM49864 = "";
        } else {
            strM49864 = m49864();
            name = name.substring(0, name.length() - strM49864.length());
        }
        Matcher matcher = (z ? f71091 : f71090).matcher(name);
        if (matcher.matches()) {
            try {
                i = Integer.parseInt(matcher.group(2));
                name = matcher.group(1);
            } catch (Exception unused) {
            }
        }
        StringBuilder sbM27333 = C10732.m27333(name);
        sbM27333.append(z ? " (" : MotionUtils.EASING_TYPE_FORMAT_START);
        String string = sbM27333.toString();
        String strConcat = MotionUtils.EASING_TYPE_FORMAT_END.concat(strM49864);
        do {
            i++;
            abstractC22044M35193 = C14584.m35193(parent, string + i + strConcat);
        } while (abstractC22044M35193.mo2934());
        return abstractC22044M35193;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m49838(String str) {
        return m49868(m49874() + str + m49864());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49851(AbstractC22044 abstractC22044) {
        String lowerCase = mo4278().toLowerCase();
        String lowerCase2 = abstractC22044.mo4278().toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        if (!lowerCase2.endsWith("/")) {
            lowerCase2 = lowerCase2.concat("/");
        }
        return lowerCase.startsWith(lowerCase2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC22044) {
            return mo4294().equals(((AbstractC22044) obj).mo4294());
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f71092;
        if (i != 0) {
            return i;
        }
        int iHashCode = mo4294().hashCode();
        this.f71092 = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return mo4294();
    }

    /* JADX INFO: renamed from: ֫ */
    public C1161 mo4275() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public final C1161 m49861() {
        if (mo4295()) {
            return mo4275();
        }
        if (this instanceof C18379) {
            return new C1161(new File(mo4294()), true);
        }
        return mo19981() ? new C1161(new File(mo4294()), mo19983().m19980()) : new C1161(new File(mo4294()), false);
    }

    /* JADX INFO: renamed from: ۧ */
    public C7302 mo19983() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49833() {
        return mo49854() && !mo7162();
    }

    /* JADX INFO: renamed from: ᩴ */
    public C2170 mo7467() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۫ */
    public C0678 mo2948() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩸ */
    public C18379 mo42890() {
        throw new RuntimeException();
    }
}
