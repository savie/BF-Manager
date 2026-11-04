package l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ᩳۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG2 */
/* JADX INFO: loaded from: classes5.dex */
public class C18815 extends AbstractC18881 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f61137;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f61138 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C9864 f61139;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Boolean f61140;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile Boolean f61141;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f61142;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Boolean f61143;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Boolean f61144;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16312 f61145;

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo35581() {
        return false;
    }

    public C18815(int i, AbstractC0148 abstractC0148) {
        super(i, abstractC0148);
        this.f61142 = true;
        this.f61145 = new C16312(new C3899(this), mo20839());
        this.f61139 = C9864.m25647(i, abstractC0148);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ */
    public final void mo35572(AbstractC0148 abstractC0148) {
        super.mo35572(abstractC0148);
        C9864 c9864M25647 = C9864.m25647(this.f61288, abstractC0148);
        if (this.f61139.equals(c9864M25647)) {
            return;
        }
        C1507.m5362(this.f61139);
        this.f61139 = c9864M25647;
        this.f61145.m38698();
    }

    public C18815(int i, AbstractC0148 abstractC0148, C20348 c20348) {
        this(i, abstractC0148);
        this.f61144 = c20348.m46761();
        this.f61140 = c20348.m46761();
        this.f61143 = c20348.m46761();
        this.f61141 = c20348.m46761();
        this.f61142 = c20348.m46753();
        Boolean bool = this.f61144;
        if (bool != null) {
            this.f61145.m38700(bool.booleanValue());
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩷ */
    public final void mo35585(C6178 c6178) {
        c6178.m17785(this.f61144);
        c6178.m17785(this.f61140);
        c6178.m17785(this.f61143);
        c6178.m17785(this.f61141);
        c6178.m17789(this.f61142);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܶ */
    public final String mo35579() {
        return this.f61139.f31740;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܽ */
    public final String mo35580() {
        return this.f61139.f31740;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo35583() {
        return this.f61143 != Boolean.FALSE;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo43669(final int i, final String str) throws Throwable {
        m43663(new InterfaceC7628() { // from class: l.ۗۘ۫
            @Override // l.InterfaceC7628
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo10292(InterfaceC0916 interfaceC0916) {
                C18815.m43665(this.f10218, str, i, interfaceC0916);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43665(C18815 c18815, String str, int i, InterfaceC0916 interfaceC0916) {
        if (!interfaceC0916.mo3708(C11293.m28556(str))) {
            interfaceC0916.mo3698();
            throw null;
        }
        if (interfaceC0916.m3699("CHMOD " + Integer.toOctalString(i) + " " + C11293.m28558(str))) {
            return;
        }
        if (interfaceC0916.m3707() == 550) {
            c18815.f61143 = Boolean.FALSE;
        }
        interfaceC0916.mo3698();
        throw null;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo35574() {
        return this.f61142;
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        f61137 = simpleDateFormat;
        simpleDateFormat.setTimeZone(C10646.getTimeZone("GMT"));
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo43668(final long j, final String str) throws Throwable {
        m43663(new InterfaceC7628() { // from class: l.ۛۘ۫
            @Override // l.InterfaceC7628
            /* JADX INFO: renamed from: ۙ */
            public final void mo10292(InterfaceC0916 interfaceC0916) {
                C18815.m43661(j, str, interfaceC0916);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43661(long j, String str, InterfaceC0916 interfaceC0916) {
        String str2;
        SimpleDateFormat simpleDateFormat = f61137;
        synchronized (simpleDateFormat) {
            str2 = simpleDateFormat.format(Long.valueOf(j));
        }
        if (interfaceC0916.mo3708(C11293.m28556(str)) && interfaceC0916.m3690(C11293.m28558(str), str2)) {
            return;
        }
        interfaceC0916.mo3698();
        throw null;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۘ */
    public final String mo35569() {
        return (String) m43657(new InterfaceC0170() { // from class: l.ܽۘ۫
            @Override // l.InterfaceC0170
            /* JADX INFO: renamed from: ۙ */
            public final Object mo1451(InterfaceC0916 interfaceC0916) {
                return C18815.m43658(this.f56415, interfaceC0916);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m43658(C18815 c18815, InterfaceC0916 interfaceC0916) {
        String str = c18815.f61139.f31746;
        if (!TextUtils.isEmpty(str) && interfaceC0916.mo3708(str)) {
            return interfaceC0916.getPath();
        }
        return interfaceC0916.mo3684();
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܰ */
    public final void mo35578() {
        C5261.f18538.execute(new RunnableC6915(3, this));
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20837(boolean z) {
        this.f61145.m38698();
        if (z) {
            C1507.m5362(this.f61139);
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo35568() {
        if (this.f61141 == null) {
            synchronized (this) {
                if (this.f61141 == null) {
                    this.f61141 = (Boolean) m43657(new C12102());
                }
            }
        }
        return this.f61141.booleanValue();
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo35570(long j, String str) {
        return m43656(j, str, true);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩷ */
    public final OutputStream mo35584(long j, String str) {
        return m43667(str, true);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۤ */
    public final void mo35575(final String str, final boolean z) throws Throwable {
        m43663(new InterfaceC7628() { // from class: l.᩻ۘ۫
            @Override // l.InterfaceC7628
            /* JADX INFO: renamed from: ۙ */
            public final void mo10292(InterfaceC0916 interfaceC0916) {
                int i = C18815.f61138;
                String str2 = str;
                if (!interfaceC0916.mo3708(C11293.m28556(str2))) {
                    interfaceC0916.mo3698();
                    throw null;
                }
                if (z) {
                    if (interfaceC0916.m3689(C11293.m28558(str2))) {
                        return;
                    }
                    interfaceC0916.mo3698();
                    throw null;
                }
                if (interfaceC0916.m3711(C11293.m28558(str2))) {
                    return;
                }
                interfaceC0916.mo3698();
                throw null;
            }
        });
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo43670(final String str, final String str2) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (!str2.startsWith("/")) {
            str2 = "/".concat(str2);
        }
        return ((Boolean) m43657(new InterfaceC0170() { // from class: l.᩹ۘ۫
            @Override // l.InterfaceC0170
            /* JADX INFO: renamed from: ۙ */
            public final Object mo1451(InterfaceC0916 interfaceC0916) {
                int i = C18815.f61138;
                return Boolean.valueOf(interfaceC0916.m3712(str, str2));
            }
        })).booleanValue();
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ */
    public final void mo35571(final String str, final String str2) throws Throwable {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (!str2.startsWith("/")) {
            str2 = "/".concat(str2);
        }
        m43663(new InterfaceC7628() { // from class: l.ܶۘ۫
            @Override // l.InterfaceC7628
            /* JADX INFO: renamed from: ۙ */
            public final void mo10292(InterfaceC0916 interfaceC0916) {
                int i = C18815.f61138;
                if (interfaceC0916.m3712(str, str2)) {
                    return;
                }
                interfaceC0916.mo3698();
                throw null;
            }
        });
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩴ */
    public final void mo35582(final String str) throws Throwable {
        m43663(new InterfaceC7628() { // from class: l.᩺ۘ۫
            @Override // l.InterfaceC7628
            /* JADX INFO: renamed from: ۙ */
            public final void mo10292(InterfaceC0916 interfaceC0916) {
                int i = C18815.f61138;
                String str2 = str;
                if (interfaceC0916.mo3708(C11293.m28556(str2)) && interfaceC0916.m3685(C11293.m28558(str2))) {
                    return;
                }
                interfaceC0916.mo3698();
                throw null;
            }
        });
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo35573(String str) {
        return this.f61145.m38701(str);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo35586(String str) {
        C16312 c16312 = this.f61145;
        c16312.getClass();
        return c16312.m38697(C11293.m28556(str), C11293.m28558(str)) != null;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۫ */
    public final String mo35577(String str) {
        return this.f61145.m38702(str);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2386 mo20831(String str) {
        String strM28556 = C11293.m28556(str);
        C17388 c17388 = (C17388) this.f61145.m38697(strM28556, C11293.m28558(str));
        if (c17388 != null) {
            return new C9709(c17388, strM28556);
        }
        return null;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo20830(String str, boolean z) {
        String strM20187 = AbstractC7364.m20187(str);
        Collection<C17388> collectionValues = this.f61145.m38703(strM20187).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C17388 c17388 : collectionValues) {
            if (z || !c17388.m40834().startsWith(".")) {
                arrayList.add(new C9709(c17388, strM20187));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۧ */
    public final void mo35576(String str) {
        this.f61145.m38699(str);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo20839() {
        return this.f61144 == Boolean.TRUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43662(InterfaceC0916 interfaceC0916, C17388[] c17388Arr, String str) {
        String lowerCase;
        HashSet hashSet = new HashSet();
        for (C17388 c17388 : c17388Arr) {
            hashSet.add(c17388.m40834());
        }
        for (C17388 c17389 : c17388Arr) {
            if (c17389.m40836()) {
                String strM40834 = c17389.m40834();
                char cCharAt = strM40834.charAt(0);
                if ('a' <= cCharAt && cCharAt <= 'z') {
                    lowerCase = strM40834.toUpperCase();
                } else if ('A' <= cCharAt && cCharAt <= 'Z') {
                    lowerCase = strM40834.toLowerCase();
                }
                if (!hashSet.contains(lowerCase)) {
                    if (interfaceC0916.mo3708(str)) {
                        int iM3700 = interfaceC0916.m3700(lowerCase);
                        if (iM3700 == 213) {
                            this.f61144 = Boolean.TRUE;
                        } else if (iM3700 == 550 || iM3700 == 502) {
                            this.f61144 = Boolean.FALSE;
                        }
                        Boolean bool = this.f61144;
                        if (bool != null) {
                            this.f61145.m38700(bool.booleanValue());
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m43659(final C18815 c18815, String str) {
        final String strM20187 = AbstractC7364.m20187(str);
        return (List) c18815.m43657(new InterfaceC0170() { // from class: l.᩵ۘ۫
            @Override // l.InterfaceC0170
            /* JADX INFO: renamed from: ۙ */
            public final Object mo1451(InterfaceC0916 interfaceC0916) {
                return C18815.m43660(this.f65176, strM20187, interfaceC0916);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m43660(C18815 c18815, String str, InterfaceC0916 interfaceC0916) {
        C17388[] c17388ArrM3706;
        boolean z;
        String strM40841;
        String absolutePath;
        if (c18815.f61140 == null) {
            c18815.f61140 = Boolean.valueOf(interfaceC0916.m3691(EnumC24848.MLST));
            c18815.f61142 = interfaceC0916.m3691(EnumC24848.MFMT);
        }
        if (!interfaceC0916.mo3708(str)) {
            interfaceC0916.mo3698();
            throw null;
        }
        if (c18815.f61140.booleanValue()) {
            c17388ArrM3706 = interfaceC0916.m3696();
            for (int i = 0; i < c17388ArrM3706.length; i++) {
                if (c17388ArrM3706[i].m40843().toLowerCase(Locale.ENGLISH).contains("type=cdir;")) {
                    C17388[] c17388Arr = new C17388[c17388ArrM3706.length - 1];
                    System.arraycopy(c17388ArrM3706, 0, c17388Arr, 0, i);
                    System.arraycopy(c17388ArrM3706, i + 1, c17388Arr, i, (c17388ArrM3706.length - i) - 1);
                    c17388ArrM3706 = c17388Arr;
                    break;
                }
            }
            if (c18815.f61143 == null && c17388ArrM3706.length > 0) {
                for (C17388 c17388 : c17388ArrM3706) {
                    if (c17388.m40834().indexOf(61) == -1) {
                        String strM40843 = c17388.m40843();
                        c18815.f61143 = Boolean.valueOf(strM40843.contains("UNIX.mode=") || strM40843.contains("perm="));
                        break;
                    }
                }
            }
        } else {
            c17388ArrM3706 = interfaceC0916.m3706();
            ArrayList arrayList = new ArrayList();
            for (final C17388 c17389 : c17388ArrM3706) {
                if (c17389.m40845() && (strM40841 = c17389.m40841()) != null) {
                    if (strM40841.indexOf(47) != -1) {
                        if (strM40841.startsWith("/")) {
                            absolutePath = new File(strM40841).getAbsolutePath();
                        } else {
                            absolutePath = new File(str, strM40841).getAbsolutePath();
                        }
                        strM40841 = str.equals(C11293.m28556(absolutePath)) ? C11293.m28558(absolutePath) : null;
                    }
                    if (strM40841 != null) {
                        for (final C17388 c173810 : c17388ArrM3706) {
                            if (c173810.m40834().equals(strM40841)) {
                                arrayList.add(new BooleanSupplier() { // from class: l.ܺۘ۫
                                    @Override // java.util.function.BooleanSupplier
                                    public final boolean getAsBoolean() {
                                        int i2 = C18815.f61138;
                                        C17388 c173811 = c17389;
                                        int iM40837 = c173811.m40837();
                                        C17388 c173812 = c173810;
                                        if (iM40837 == c173812.m40837()) {
                                            return false;
                                        }
                                        c173811.m40827(c173812.m40837());
                                        return true;
                                    }
                                });
                                break;
                            }
                        }
                    }
                }
            }
            do {
                Iterator it = arrayList.iterator();
                z = false;
                while (it.hasNext()) {
                    if (((BooleanSupplier) it.next()).getAsBoolean()) {
                        z = true;
                    }
                }
            } while (z);
        }
        if (c18815.f61144 == null && c17388ArrM3706.length > 0) {
            try {
                c18815.m43662(interfaceC0916, c17388ArrM3706, str);
            } catch (IOException unused) {
            }
        }
        return Arrays.asList(c17388ArrM3706);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InputStream m43656(long j, String str, boolean z) throws Throwable {
        InterfaceC0916 interfaceC0916M5359 = C1507.m5359(this.f61139);
        try {
            if (!interfaceC0916M5359.mo3708(C11293.m28556(str))) {
                interfaceC0916M5359.mo3698();
                throw null;
            }
            interfaceC0916M5359.m3688(j);
            C11200 c11200M3705 = interfaceC0916M5359.m3705(C11293.m28558(str));
            if (c11200M3705 == null) {
                interfaceC0916M5359.mo3698();
                throw null;
            }
            return new C21053(this, c11200M3705, interfaceC0916M5359);
        } catch (IOException e) {
            interfaceC0916M5359.m3688(0L);
            if (!z || !m43666(e)) {
                C1507.m5361(interfaceC0916M5359);
                throw e;
            }
            C1507.m5360(interfaceC0916M5359);
            return m43656(j, str, false);
        } catch (Error e2) {
            e = e2;
            interfaceC0916M5359.m3688(0L);
            C1507.m5361(interfaceC0916M5359);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            interfaceC0916M5359.m3688(0L);
            C1507.m5361(interfaceC0916M5359);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0032  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m43657(InterfaceC0170 interfaceC0170) throws Throwable {
        InterfaceC0916 interfaceC0916M5359 = C1507.m5359(this.f61139);
        try {
            try {
                Object objMo1451 = interfaceC0170.mo1451(interfaceC0916M5359);
                if (interfaceC0916M5359 != null) {
                    C1507.m5361(interfaceC0916M5359);
                }
                return objMo1451;
            } catch (IOException e) {
                if (m43666(e)) {
                    C1507.m5360(interfaceC0916M5359);
                    try {
                        InterfaceC0916 interfaceC0916M53510 = C1507.m5359(this.f61139);
                        Object objMo1452 = interfaceC0170.mo1451(interfaceC0916M53510);
                        if (interfaceC0916M53510 != null) {
                            C1507.m5361(interfaceC0916M53510);
                        }
                        return objMo1452;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC0916M5359 = null;
                        if (interfaceC0916M5359 != null) {
                            C1507.m5361(interfaceC0916M5359);
                        }
                        throw th;
                    }
                }
                throw e;
            }
        } catch (Throwable th2) {
            th = th2;
            if (interfaceC0916M5359 != null) {
                C1507.m5361(interfaceC0916M5359);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0030  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43663(InterfaceC7628 interfaceC7628) throws Throwable {
        InterfaceC0916 interfaceC0916M5359 = C1507.m5359(this.f61139);
        try {
            try {
                interfaceC7628.mo10292(interfaceC0916M5359);
                if (interfaceC0916M5359 != null) {
                    C1507.m5361(interfaceC0916M5359);
                }
            } catch (IOException e) {
                if (m43666(e)) {
                    C1507.m5360(interfaceC0916M5359);
                    try {
                        InterfaceC0916 interfaceC0916M53510 = C1507.m5359(this.f61139);
                        interfaceC7628.mo10292(interfaceC0916M53510);
                        if (interfaceC0916M53510 != null) {
                            C1507.m5361(interfaceC0916M53510);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC0916M5359 = null;
                        if (interfaceC0916M5359 != null) {
                            C1507.m5361(interfaceC0916M5359);
                        }
                        throw th;
                    }
                }
                throw e;
            }
        } catch (Throwable th2) {
            th = th2;
            if (interfaceC0916M5359 != null) {
                C1507.m5361(interfaceC0916M5359);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private OutputStream m43667(String str, boolean z) throws Throwable {
        InterfaceC0916 interfaceC0916M5359 = C1507.m5359(this.f61139);
        try {
            if (!interfaceC0916M5359.mo3708(C11293.m28556(str))) {
                interfaceC0916M5359.mo3698();
                throw null;
            }
            OutputStream outputStreamMo3695 = interfaceC0916M5359.mo3695(C11293.m28558(str));
            if (outputStreamMo3695 == null) {
                interfaceC0916M5359.mo3698();
                throw null;
            }
            return new C18069(this, outputStreamMo3695, interfaceC0916M5359, outputStreamMo3695);
        } catch (IOException e) {
            if (!z || !m43666(e)) {
                C1507.m5361(interfaceC0916M5359);
                throw e;
            }
            C1507.m5360(interfaceC0916M5359);
            return m43667(str, false);
        } catch (Error e2) {
            e = e2;
            C1507.m5361(interfaceC0916M5359);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            C1507.m5361(interfaceC0916M5359);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43666(IOException iOException) {
        if (iOException instanceof C16642) {
            return true;
        }
        String message = iOException.getMessage();
        if (message == null) {
            return false;
        }
        String lowerCase = message.toLowerCase(Locale.ENGLISH);
        return (lowerCase.contains("connection") && (lowerCase.contains("closed") || lowerCase.contains("reset"))) || lowerCase.contains("broken pipe") || lowerCase.contains("connection abort");
    }
}
