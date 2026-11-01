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

/* JADX INFO: renamed from: l.᩷۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20745 implements Serializable, Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Pattern f67495;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String f67496 = File.separator;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Pattern f67497;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f67498;

    public abstract String getName();

    public abstract String getParent();

    /* JADX INFO: renamed from: ֡ۙ */
    public boolean mo36912() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC20745 mo24641() {
        return this;
    }

    /* JADX INFO: renamed from: ֫ۙ */
    public abstract long mo33964();

    /* JADX INFO: renamed from: ۘ */
    public abstract InterfaceC21850 mo33966(String str);

    /* JADX INFO: renamed from: ۙ */
    public boolean mo32855(long j) {
        return false;
    }

    /* JADX INFO: renamed from: ۚۙ */
    public String mo33968() {
        return null;
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public boolean mo46709() {
        return false;
    }

    /* JADX INFO: renamed from: ۜܰ */
    public abstract InputStream mo33970();

    /* JADX INFO: renamed from: ۟ */
    public abstract boolean mo8447();

    /* JADX INFO: renamed from: ۟ۙ */
    public abstract boolean mo33971();

    /* JADX INFO: renamed from: ۠ۙ */
    public boolean mo40126() {
        return false;
    }

    /* JADX INFO: renamed from: ۡܰ */
    public boolean mo35233() {
        return false;
    }

    /* JADX INFO: renamed from: ۢۙ */
    public abstract List mo33973();

    /* JADX INFO: renamed from: ۤ */
    public boolean mo32856() {
        return true;
    }

    /* JADX INFO: renamed from: ۤۙ */
    public abstract boolean mo33974();

    /* JADX INFO: renamed from: ۤܰ */
    public boolean mo8448() {
        return this instanceof C13357;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo33975();

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean mo46715() {
        return false;
    }

    /* JADX INFO: renamed from: ۨ */
    public abstract OutputStream mo33976(boolean z);

    /* JADX INFO: renamed from: ۫ */
    public abstract boolean mo33978();

    /* JADX INFO: renamed from: ۫ۙ */
    public boolean mo33979() {
        return false;
    }

    /* JADX INFO: renamed from: ۬ */
    public abstract ParcelFileDescriptor mo33981(String str);

    /* JADX INFO: renamed from: ۬ܰ */
    public abstract FileChannel mo33982();

    /* JADX INFO: renamed from: ܰ */
    public abstract List mo33983(boolean z);

    /* JADX INFO: renamed from: ܰ */
    public boolean mo35234(InterfaceC5614 interfaceC5614) {
        return false;
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract boolean mo24646(AbstractC20745 abstractC20745);

    /* JADX INFO: renamed from: ܶ */
    public abstract boolean mo33985();

    /* JADX INFO: renamed from: ܶۙ */
    public abstract String mo33986();

    /* JADX INFO: renamed from: ܽ */
    public abstract boolean mo33987();

    /* JADX INFO: renamed from: ܿ */
    public abstract boolean mo24647();

    /* JADX INFO: renamed from: ᩴ */
    public abstract boolean mo8449();

    /* JADX INFO: renamed from: ᩵ۙ */
    public abstract boolean mo33988();

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo46731() {
        return false;
    }

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo32858() {
        return true;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean mo46736() {
        return true;
    }

    /* JADX INFO: renamed from: ᩻ۙ */
    public abstract long mo33991();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getName().compareToIgnoreCase(((AbstractC20745) obj).getName());
    }

    static {
        String str = File.pathSeparator;
        char c = File.separatorChar;
        char c2 = File.pathSeparatorChar;
        f67497 = Pattern.compile("(.*) \\((\\d+)\\)");
        f67495 = Pattern.compile("(.*)\\((\\d+)\\)");
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static String m46686(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        String strSubstring = iLastIndexOf == -1 ? "" : str.substring(iLastIndexOf);
        String[] strArr = {".1", ".apk.1", ".png", ".9.png", ".gz", ".tar.gz", ".xz", ".tar.xz", ".zst", ".tar.zst", ".zstd", ".tar.zstd", ".bz2", ".tar.bz2", ".lz4", ".tar.lz4"};
        for (int i = 0; i < 16; i += 2) {
            if (strSubstring.equals(strArr[i])) {
                int i2 = i + 1;
                if (C6851.m18464((CharSequence) strArr[i2], str)) {
                    return str.substring(str.length() - strArr[i2].length());
                }
            }
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final String m46718() {
        String name = getName();
        return name.substring(0, name.length() - m46686(name).length());
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final String m46726() {
        return m46686(getName());
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final String m46737() {
        String parent = getParent();
        if (parent != null) {
            return parent;
        }
        throw new NullPointerException(C17922.m41615(this, new StringBuilder("Not parent: ")));
    }

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public final Uri m46732() {
        return Uri.fromFile(new File(mo33986()));
    }

    /* JADX INFO: renamed from: ۬ۙ */
    public AbstractC20745 mo40908() {
        return m46711();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m46714() {
        String strMo33968 = mo33968();
        if (strMo33968 == null) {
            return null;
        }
        if (strMo33968.startsWith("/")) {
            return strMo33968;
        }
        AbstractC20745 abstractC20745Mo40908 = mo40908();
        while (abstractC20745Mo40908 != null) {
            if (strMo33968.isEmpty() || strMo33968.equals(".")) {
                return abstractC20745Mo40908.mo33986();
            }
            if (strMo33968.equals("..")) {
                return abstractC20745Mo40908.getParent();
            }
            if (strMo33968.startsWith("./")) {
                strMo33968 = strMo33968.substring(2);
            } else if (strMo33968.startsWith("../")) {
                strMo33968 = strMo33968.substring(3);
                abstractC20745Mo40908 = abstractC20745Mo40908.m46689();
            } else {
                return abstractC20745Mo40908.m46690(strMo33968).mo33986();
            }
        }
        return mo33986();
    }

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC10868 mo33989() {
        return new C0283(this);
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46723() {
        return mo33968() != null;
    }

    /* JADX INFO: renamed from: ᩸ۙ */
    public String mo40911() {
        return m46723() ? m46714() : mo33986();
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo33977(String str) {
        C0055.m954(str, mo33986());
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m46689() {
        String parent = getParent();
        if (parent != null) {
            return C5553.m15313(parent, new String[0]);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m46711() {
        AbstractC20745 abstractC20745M46689 = m46689();
        if (abstractC20745M46689 != null) {
            return abstractC20745M46689;
        }
        throw new NullPointerException(C17922.m41615(this, new StringBuilder("Not parent: ")));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m46706(String str) {
        return C5553.m15313(m46737(), str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m46690(String str) {
        return C5553.m15313(mo33986(), str);
    }

    /* JADX INFO: renamed from: ۙۙ */
    public String mo24643() {
        return mo24641().mo33986();
    }

    /* JADX INFO: renamed from: ۨۙ */
    public Uri mo40127() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public final Uri m46712() {
        return C14396.m34656(mo33986());
    }

    /* JADX INFO: renamed from: ۛ */
    public boolean mo24644() {
        return mo24647();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m46691(InterfaceC5614 interfaceC5614) {
        if (!mo33974()) {
            return mo33964();
        }
        List listMo33983 = mo33983(true);
        long jM46691 = 0;
        for (int i = 0; i < listMo33983.size() && !interfaceC5614.mo2357(); i++) {
            jM46691 += ((AbstractC20745) listMo33983.get(i)).m46691(interfaceC5614);
        }
        return jM46691;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m46729() {
        String strMo24643 = mo24643();
        int i = C5553.f19060;
        return new File(strMo24643).canRead();
    }

    /* JADX INFO: renamed from: ۡ */
    public boolean mo33972() {
        return m46729();
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC3810 mo8444(InterfaceC12984 interfaceC12984) {
        return new C18628(this, interfaceC12984);
    }

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public final BufferedInputStream m46719() {
        InputStream inputStreamMo33970 = mo33970();
        if (inputStreamMo33970 instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStreamMo33970;
        }
        return new BufferedInputStream(inputStreamMo33970);
    }

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public final BufferedReader m46734() {
        return new BufferedReader(new InputStreamReader(mo33970(), StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream m46708() {
        OutputStream outputStreamMo33976 = mo33976(false);
        if (outputStreamMo33976 instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStreamMo33976;
        }
        return new BufferedOutputStream(outputStreamMo33976);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C1388 m46710(String str) {
        return C19734.m44887(mo33966(str));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00c7 */
    /* JADX WARN: Code duplicated, block: B:114:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:76:0x0100 A[Catch: all -> 0x0144, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0144, blocks: (B:76:0x0100, B:102:0x0143, B:101:0x0140, B:74:0x00ee, B:98:0x013b), top: B:116:0x00ee, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0118  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m46701(l.AbstractC20745 r12, l.C5222 r13, l.InterfaceC8978 r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC20745.m46701(l.᩷۠ۚ, l.ۚ۠ۚ, l.ۡܺۚ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46696(OutputStream outputStream, InterfaceC10389 interfaceC10389) throws IOException {
        try {
            InputStream inputStreamMo33970 = mo33970();
            try {
                C22487.m49992(inputStreamMo33970, outputStream, mo33964(), interfaceC10389);
                inputStreamMo33970.close();
            } catch (Throwable th) {
                if (inputStreamMo33970 != null) {
                    try {
                        inputStreamMo33970.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            C6237.m17292(this, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46700(AbstractC20745 abstractC20745, C5222 c5222) throws IOException {
        if (!mo33974()) {
            m46701(abstractC20745, c5222, (InterfaceC8978) null);
            return;
        }
        if (c5222 != null) {
            c5222.m14408(this);
            abstractC20745.m46739();
            c5222.m14402(abstractC20745);
        } else {
            abstractC20745.m46739();
        }
        for (AbstractC20745 abstractC20746 : mo33983(true)) {
            abstractC20746.m46700(abstractC20745.m46690(abstractC20746.getName()), c5222);
        }
    }

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m46727() throws IOException {
        InputStream inputStreamMo33970 = mo33970();
        try {
            byte[] bArrM44470 = C19431.m44470(inputStreamMo33970, (int) mo33964());
            if (inputStreamMo33970 != null) {
                inputStreamMo33970.close();
            }
            return bArrM44470;
        } catch (Throwable th) {
            if (inputStreamMo33970 != null) {
                try {
                    inputStreamMo33970.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m46721() {
        long jMo33964 = mo33964();
        if (jMo33964 <= 20971520) {
            return m46727();
        }
        try {
            InputStream inputStreamMo33970 = mo33970();
            try {
                byte[] bArrM44469 = C19431.m44469(jMo33964, inputStreamMo33970);
                if (inputStreamMo33970 != null) {
                    inputStreamMo33970.close();
                }
                return bArrM44469;
            } catch (Throwable th) {
                if (inputStreamMo33970 != null) {
                    try {
                        inputStreamMo33970.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused) {
            return m46727();
        }
    }

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public final C17367 m46713() {
        return new C17367(m46727());
    }

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public final String m46730() throws IOException {
        InputStream inputStreamMo33970 = mo33970();
        try {
            String strM45297 = C20010.m45297(inputStreamMo33970, Charset.defaultCharset());
            if (inputStreamMo33970 != null) {
                inputStreamMo33970.close();
            }
            return strM45297;
        } catch (Throwable th) {
            if (inputStreamMo33970 != null) {
                try {
                    inputStreamMo33970.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public final int m46738() throws IOException {
        InputStream inputStreamMo33970 = mo33970();
        try {
            byte[] bArr = new byte[4];
            C20010.m45306(inputStreamMo33970, bArr, 4);
            int iM36336 = C15157.m36336(0, bArr);
            if (inputStreamMo33970 != null) {
                inputStreamMo33970.close();
            }
            return iM36336;
        } catch (Throwable th) {
            if (inputStreamMo33970 != null) {
                try {
                    inputStreamMo33970.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46703(byte[] bArr) {
        m46704(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46704(byte[] bArr, int i, int i2) {
        mo46720();
        mo8444(new C10162(this, bArr, i, i2, C5553.m15331(this) && !mo33975())).m11099();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46694(InputStream inputStream) {
        m46695(inputStream, -1L, (InterfaceC8978) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46695(InputStream inputStream, long j, InterfaceC8978 interfaceC8978) {
        mo46720();
        m46716(inputStream, j, interfaceC8978);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46716(InputStream inputStream, long j, InterfaceC8978 interfaceC8978) {
        mo8444(new C7339(this, inputStream, j, interfaceC8978, C5553.m15331(this) && !mo33975())).m11099();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46697(C11018 c11018) {
        m46704(c11018.m27788(), 0, c11018.size());
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m46735(String str) {
        m46703(str.getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46717(String str) throws IOException {
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        int length = bytes.length;
        mo46720();
        boolean z = C5553.m15331(this) && !mo33975();
        OutputStream outputStreamMo33976 = mo33976(true);
        try {
            outputStreamMo33976.write(bytes, 0, length);
            outputStreamMo33976.close();
            if (z) {
                C5553.m15325(this);
            }
        } catch (Throwable th) {
            if (outputStreamMo33976 != null) {
                try {
                    outputStreamMo33976.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m46688(String str) {
        return C5553.m15315(this, str);
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m46728() {
        return C5553.m15315(this, ".tmp");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m46733(String str) {
        return C5553.m15315(m46711(), str);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m46687() {
        if (!mo33975() || mo33974()) {
            return;
        }
        if (mo33964() == 0) {
            mo24647();
            return;
        }
        AbstractC20745 abstractC20745M15313 = C5553.m15313(mo33986() + ".bak", new String[0]);
        abstractC20745M15313.mo24647();
        mo24646(abstractC20745M15313);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m46722() {
        AbstractC20745 abstractC20745M15313 = C5553.m15313(mo33986() + ".bak", new String[0]);
        if (abstractC20745M15313.mo33975()) {
            if (mo33975()) {
                mo24647();
            }
            abstractC20745M15313.mo24646(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46698(InterfaceC17547 interfaceC17547) throws IOException {
        try {
            new C11198(this).m28135(interfaceC17547);
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46699(AbstractC20745 abstractC20745, Runnable runnable) throws IOException {
        if (mo24646(abstractC20745)) {
            return;
        }
        if (abstractC20745.mo33975() && (mo33974() || abstractC20745.mo33974())) {
            throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Move failed, target exists: ")));
        }
        if (runnable != null) {
            runnable.run();
        }
        m46700(abstractC20745, new C5222());
        mo24647();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46702(AbstractC20745 abstractC20745, boolean z, boolean z2, Runnable runnable) throws IOException {
        AbstractC20745 abstractC20745M46733;
        if (equals(abstractC20745)) {
            throw new IOException(C17922.m41615(this, new StringBuilder("Source and target are the same file: ")));
        }
        if (mo33974()) {
            throw new IOException(C17922.m41615(this, new StringBuilder("Source file is a directory: ")));
        }
        if (abstractC20745.mo33975() && abstractC20745.mo33974()) {
            throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Target file is a directory: ")));
        }
        if (!abstractC20745.mo33975()) {
            abstractC20745M46733 = null;
        } else {
            if (abstractC20745.getParent() == null) {
                throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Target file has no parent for rollback: ")));
            }
            abstractC20745M46733 = abstractC20745.m46733(".force_replace_target");
            if (!abstractC20745.mo24646(abstractC20745M46733)) {
                throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Unable to move target file to rollback file: ")));
            }
        }
        try {
            m46699(abstractC20745, runnable);
            if (abstractC20745M46733 == null || !abstractC20745M46733.mo33975()) {
                return;
            }
            if (!z) {
                abstractC20745M46733.mo24647();
                return;
            }
            AbstractC20745 abstractC20745M15313 = C5553.m15313(abstractC20745.mo33986() + ".bak", new String[0]);
            if (abstractC20745M15313.mo33975() && !abstractC20745M15313.mo24647()) {
                abstractC20745M46733.mo24647();
            } else {
                if (abstractC20745M46733.mo24646(abstractC20745M15313)) {
                    return;
                }
                abstractC20745M46733.mo24647();
            }
        } catch (IOException e) {
            if (abstractC20745.mo33975() && !abstractC20745.mo24647()) {
                e.addSuppressed(new IOException(C17922.m41615(abstractC20745, new StringBuilder("Unable to delete failed target file: "))));
            }
            if (abstractC20745M46733 != null && abstractC20745M46733.mo33975() && !abstractC20745M46733.mo24646(abstractC20745)) {
                e.addSuppressed(new IOException(C17922.m41615(abstractC20745, new StringBuilder("Unable to restore original target file: "))));
            }
            if (z2 && mo33975() && !mo24647()) {
                e.addSuppressed(new IOException(C17922.m41615(this, new StringBuilder("Unable to delete source file after replace failure: "))));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m46739() {
        if (!mo33975()) {
            if (!mo33987() && !mo33974()) {
                throw new IOException(C17922.m41615(this, new StringBuilder("Unable to create directory ")));
            }
        } else {
            if (mo33974()) {
                return;
            }
            throw new IOException("File " + mo33986() + " exists and is not a directory. Unable to create directory.");
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void mo46720() {
        m46711().m46739();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m46693(boolean z) {
        String parent;
        String strM46726;
        AbstractC20745 abstractC20745M15313;
        if (!mo33975() || (parent = getParent()) == null) {
            return this;
        }
        String name = getName();
        int i = 0;
        if (mo33974()) {
            strM46726 = "";
        } else {
            strM46726 = m46726();
            name = name.substring(0, name.length() - strM46726.length());
        }
        Matcher matcher = (z ? f67497 : f67495).matcher(name);
        if (matcher.matches()) {
            try {
                i = Integer.parseInt(matcher.group(2));
                name = matcher.group(1);
            } catch (Exception unused) {
            }
        }
        StringBuilder sbM23356 = C9023.m23356(name);
        sbM23356.append(z ? " (" : MotionUtils.EASING_TYPE_FORMAT_START);
        String string = sbM23356.toString();
        String strConcat = MotionUtils.EASING_TYPE_FORMAT_END.concat(strM46726);
        do {
            i++;
            abstractC20745M15313 = C5553.m15313(parent, string + i + strConcat);
        } while (abstractC20745M15313.mo33975());
        return abstractC20745M15313;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m46692(String str) {
        return m46706(m46718() + str + m46726());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46705(AbstractC20745 abstractC20745) {
        String lowerCase = mo24643().toLowerCase();
        String lowerCase2 = abstractC20745.mo24643().toLowerCase();
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
        if (obj instanceof AbstractC20745) {
            return mo33986().equals(((AbstractC20745) obj).mo33986());
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f67498;
        if (i != 0) {
            return i;
        }
        int iHashCode = mo33986().hashCode();
        this.f67498 = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return mo33986();
    }

    /* JADX INFO: renamed from: ۘ */
    public C15432 mo36913() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public final C15432 m46724() {
        if (mo36912()) {
            return mo36913();
        }
        if (this instanceof C17196) {
            return new C15432(new File(mo33986()), true);
        }
        return mo33979() ? new C15432(new File(mo33986()), mo33969().m33967()) : new C15432(new File(mo33986()), false);
    }

    /* JADX INFO: renamed from: ۜ */
    public C14042 mo33969() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46725() {
        return mo46709() && !mo46715();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C23235 mo46707() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֨ */
    public C17589 mo40898() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ܰ */
    public C17196 mo40129() {
        throw new RuntimeException();
    }
}
