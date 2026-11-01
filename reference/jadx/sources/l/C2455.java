package l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipException;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۖۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes2.dex */
public final class C2455 implements Closeable {

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final C5756 f9767 = new C5756();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f9768;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f9769;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public List f9770;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f9771;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f9772;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public String f9773;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f9774;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f9775;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f9776;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final boolean f9777;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f9778;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public byte[] f9779;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f9780;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public List f9781;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC7739 f9782;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Charset f9783;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f9784;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f9785;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized C2455 m7479() {
        C2455 c2455;
        if (this.f9776) {
            throw new IOException("Closed");
        }
        c2455 = new C2455(this.f9782.mo4870(), null, false, null, null);
        c2455.f9779 = this.f9779;
        c2455.f9784 = this.f9784;
        c2455.f9772 = this.f9772;
        c2455.f9769 = this.f9769;
        c2455.f9768 = this.f9768;
        this.f9774.add(c2455);
        return c2455;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2455 m7448(AbstractC20745 abstractC20745, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new C2455(abstractC20745.m46710("r"), null, false, null, null);
        }
        AbstractC20745 abstractC20745M46711 = abstractC20745.m46711();
        C17367 c17367 = new C17367(bArr);
        int i = c17367.readInt();
        AbstractC20745[] abstractC20745Arr = new AbstractC20745[i];
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            abstractC20745Arr[i2] = abstractC20745M46711.m46690(c17367.m40458());
            jArr[i2] = c17367.readLong();
        }
        return new C2455(C19734.m44887(C0682.m3047(abstractC20745.getName(), jArr, new C9285(abstractC20745Arr))), null, false, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m7457(AbstractC20745 abstractC20745) {
        AbstractC20745 abstractC20745M46689 = abstractC20745.m46689();
        C11629 c11629M7449 = m7449(abstractC20745M46689, abstractC20745.getName());
        if (c11629M7449 != null) {
            return c11629M7449.f39056;
        }
        C1388 c1388M46710 = abstractC20745.m46710("r");
        try {
            C2455 c2455 = new C2455(c1388M46710, null, false, null, null);
            try {
                c2455.m7453(abstractC20745M46689, (InterfaceC17045) null, true);
                byte[] bArr = c2455.f9779;
                c2455.close();
                return bArr;
            } catch (Throwable th) {
                try {
                    c2455.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | RuntimeException e) {
            C19431.m44468(c1388M46710);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2455 m7446(AbstractC20745 abstractC20745, Charset charset) {
        return new C2455(abstractC20745.m46710("r"), abstractC20745.m46689(), true, charset, null, true, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7454(byte[] bArr, int[] iArr) {
        int iM48954 = C22037.m48954(bArr.length, bArr);
        if (iM48954 == C22037.f71424) {
            for (byte b : bArr) {
                if (b <= 0) {
                    iArr[iM48954] = iArr[iM48954] + 1;
                    return;
                }
            }
            int i = C22037.f71424;
            iArr[i] = iArr[i] + 1;
            int i2 = C22037.f71422;
            iArr[i2] = iArr[i2] + 1;
            int i3 = C22037.f71419;
            iArr[i3] = iArr[i3] + 1;
            int i4 = C22037.f71433;
            iArr[i4] = iArr[i4] + 1;
            return;
        }
        iArr[iM48954] = iArr[iM48954] + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2455 m7447(AbstractC20745 abstractC20745, boolean z) {
        C1388 c1388M46710 = abstractC20745.m46710("r");
        try {
            C2455 c2455 = new C2455(c1388M46710, null, false, null, null, z, false);
            C13746 c13746M7458 = c2455.m7458();
            if (c13746M7458 != null && (c13746M7458.f45307 != 0 || c13746M7458.f45309 != 0 || c13746M7458.f45313 != c13746M7458.f45306)) {
                throw new IOException("Split ZIP archives are not supported");
            }
            c2455.m7453((AbstractC20745) null, (InterfaceC17045) null, false);
            return c2455;
        } catch (IOException | RuntimeException e) {
            C19431.m44468(c1388M46710);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2455 m7445(C1388 c1388, C7309 c7309) {
        try {
            return new C2455(c1388, null, true, null, c7309, false, true);
        } catch (IOException | RuntimeException e) {
            C19431.m44468(c1388);
            throw e;
        }
    }

    public C2455(String str) {
        this(str, (C15489) null, 0);
    }

    public C2455(AbstractC20745 abstractC20745) {
        this(abstractC20745, (Charset) null, (InterfaceC17045) null);
    }

    public C2455(AbstractC20745 abstractC20745, Charset charset) {
        this(abstractC20745, charset, (InterfaceC17045) null);
    }

    public C2455(String str, C15489 c15489) {
        this(str, c15489, 0);
    }

    public C2455(String str, C15489 c15489, int i) {
        this(C5553.m15313(str, new String[0]), (Charset) null, c15489);
    }

    public C2455(AbstractC20745 abstractC20745, Charset charset, InterfaceC17045 interfaceC17045) {
        this(abstractC20745.m46710("r"), abstractC20745.m46689(), true, charset, interfaceC17045);
    }

    public C2455(InterfaceC7739 interfaceC7739, AbstractC20745 abstractC20745, boolean z, Charset charset, InterfaceC17045 interfaceC17045) {
        this(interfaceC7739, abstractC20745, z, charset, interfaceC17045, false, false);
    }

    public C2455(InterfaceC7739 interfaceC7739, AbstractC20745 abstractC20745, boolean z, Charset charset, InterfaceC17045 interfaceC17045, boolean z2, boolean z3) throws IOException {
        this.f9780 = new LinkedHashMap();
        List list = Collections.EMPTY_LIST;
        this.f9781 = list;
        this.f9770 = list;
        this.f9772 = "";
        this.f9776 = false;
        this.f9774 = C11445.m28558();
        this.f9777 = z2;
        this.f9778 = z3;
        this.f9782 = interfaceC7739;
        this.f9783 = charset;
        this.f9784 = C15157.m36342(interfaceC7739.getName().toLowerCase());
        if (z) {
            final C11629 c11629M7449 = m7449(abstractC20745, this.f9782.getName());
            if (c11629M7449 != null) {
                InterfaceC21850 interfaceC21850Mo4866 = this.f9782.mo4866();
                C0682 c0682M3047 = C0682.m3047(c11629M7449.f39054, c11629M7449.f39055.m52323(), new InterfaceC20439() { // from class: l.ۧ֫᩺
                    @Override // l.InterfaceC20439
                    /* JADX INFO: renamed from: ܰ */
                    public final InterfaceC21850 mo23828(int i) {
                        return ((AbstractC20745) c11629M7449.f39053.get(i)).mo33966("r");
                    }
                });
                c0682M3047.m3054(c11629M7449.f39057, interfaceC21850Mo4866);
                this.f9782 = C19734.m44887(c0682M3047);
                this.f9779 = c11629M7449.f39056;
            }
            m7453(abstractC20745, interfaceC17045, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11629 m7449(AbstractC20745 abstractC20745, String str) {
        if (abstractC20745 == null || !str.matches("(?i)(?s).*\\.zip\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C16916 c16916 = new C16916();
        int i = Integer.parseInt(str.substring(str.length() - 3));
        String strM46498 = C20630.m46498(3, 0, str);
        for (int i2 = 1; i2 <= 999; i2++) {
            AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(String.format(Locale.ENGLISH, "%s%03d", strM46498, Integer.valueOf(i2)));
            if (!abstractC20745M46690.mo33971()) {
                if (i2 >= i) {
                    break;
                }
                arrayList.clear();
                c16916.clear();
                break;
            }
            c16916.add(abstractC20745M46690.mo33964());
            arrayList.add(abstractC20745M46690);
        }
        int size = c16916.size();
        if (size <= 1) {
            return null;
        }
        arrayList.trimToSize();
        c16916.m39602();
        C11018 c11018 = new C11018();
        c11018.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            c11018.m27786(((AbstractC20745) arrayList.get(i3)).getName());
            c11018.m27791(c16916.getLong(i3));
        }
        return new C11629(str, i - 1, arrayList, c16916, c11018.m27773());
    }

    public final C12107 getEntry(String str) {
        return (C12107) this.f9780.get(str);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C12107 m7470(String str) throws IOException {
        C12107 c12107 = (C12107) this.f9780.get(str);
        if (c12107 != null) {
            return c12107;
        }
        StringBuilder sbM30914 = C12441.m30914("Entry not found: ", str, "\n(");
        sbM30914.append(this.f9782.getName());
        sbM30914.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IOException(sbM30914.toString());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map m7484() {
        return C0561.unmodifiableMap(this.f9780);
    }

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public final Collection m7466() {
        return C0561.unmodifiableCollection(this.f9780.values());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List m7468() throws IOException {
        if (!this.f9777) {
            throw new IllegalStateException("ZIP was not opened for testing");
        }
        if (this.f9773 != null) {
            throw new IOException(this.f9773);
        }
        if (this.f9775) {
            throw new IOException("ZIP central directory contains an unreadable local file header");
        }
        for (C4572 c4572 : this.f9770) {
            boolean z = true;
            boolean z2 = c4572.f16218 >= 0 && (m7455(c4572, true, c4572.f16223) || m7455(c4572, false, c4572.f16223));
            if (!z2 && c4572.f16219) {
                if (!m7455(c4572, true, false) && !m7455(c4572, false, false)) {
                    z = false;
                }
                z2 = z;
            }
            if (!z2) {
                throw new IOException("ZIP data descriptor does not match central directory");
            }
        }
        return this.f9781;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m7463(String str) {
        if (this.f9777 && this.f9773 == null) {
            this.f9773 = str;
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final byte[] m7486() {
        return this.f9779;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList m7489() {
        ArrayList arrayList = new ArrayList(this.f9780.values());
        Collections.sort(arrayList, f9767);
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m7485() {
        return this.f9780.size();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m7477() {
        return this.f9772;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7474(String str) {
        if (str == null) {
            str = "";
        }
        this.f9772 = str;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m7480() {
        return this.f9785;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m7487() {
        return this.f9772.isEmpty();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m7482() {
        return this.f9784;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m7488() {
        return this.f9769;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] m7490() throws IOException {
        if (!this.f9769) {
            throw new IllegalStateException();
        }
        m7462(this.f9768);
        C11018 c11018 = new C11018();
        long jM7464 = m7464() - 24;
        while (jM7464 > 0) {
            int iM7464 = (int) m7464();
            jM7464 -= (long) (iM7464 + 8);
            if (jM7464 >= 0) {
                int iM7460 = m7460();
                if (iM7460 != 1114793335) {
                    c11018.m27791(iM7464);
                    c11018.writeInt(iM7460);
                    byte[] bArrM7456 = m7456(iM7464 - 4);
                    c11018.write(bArrM7456, 0, bArrM7456.length);
                } else {
                    m7442(iM7464 - 4);
                }
            }
        }
        return c11018.m27773();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m7465() {
        return this.f9771;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:321:0x0688  */
    /* JADX WARN: Code duplicated, block: B:330:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:338:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:357:0x0708  */
    /* JADX WARN: Code duplicated, block: B:359:0x0711 A[Catch: EOFException -> 0x071e, TRY_LEAVE, TryCatch #4 {EOFException -> 0x071e, blocks: (B:358:0x070a, B:359:0x0711), top: B:478:0x070a }] */
    /* JADX WARN: Code duplicated, block: B:516:0x0775 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x0766 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0130  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7453(AbstractC20745 abstractC20745, InterfaceC17045 interfaceC17045, boolean z) throws IOException {
        long j;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        long j4;
        C0682 c0682;
        long jM3057;
        long j5;
        ArrayList<C12107> arrayList;
        HashSet hashSet;
        Set set;
        ArrayList arrayList2;
        Charset charset;
        C0682 c0683;
        boolean z4;
        IdentityHashMap identityHashMap;
        ArrayList arrayList3;
        long j6;
        long jM7459;
        int i;
        int i2;
        int i3;
        byte[] bArrM7456;
        ArrayList arrayList4;
        HashSet hashSet2;
        Set set2;
        Set set3;
        Charset charset2;
        Charset charset3;
        int i4;
        int i5;
        long j7;
        byte[] bArr;
        boolean z5;
        boolean z6;
        long jM30138;
        long j8;
        C2455 c2455 = this;
        C13746 c13746M7458 = m7458();
        if (c13746M7458 == null && abstractC20745 != null && c2455.f9779 == null && c2455.f9782.getName().matches("(?i)(?s).*\\.z(?:0[1-9]|[1-9][0-9]+)")) {
            String name = c2455.f9782.getName();
            AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(name.substring(0, name.length() - 3) + "zip");
            if (abstractC20745M46690.mo33971()) {
                InterfaceC7739 interfaceC7739 = c2455.f9782;
                try {
                    c2455.f9782 = abstractC20745M46690.m46710("r");
                    c13746M7458 = m7458();
                    if (c13746M7458 == null) {
                        C20010.m45299(c2455.f9782);
                        c2455.f9782 = interfaceC7739;
                    } else if (z) {
                        C20010.m45299(interfaceC7739);
                    }
                } catch (IOException unused) {
                    InterfaceC7739 interfaceC77310 = c2455.f9782;
                    if (interfaceC77310 != interfaceC7739) {
                        C20010.m45299(interfaceC77310);
                        c2455.f9782 = interfaceC7739;
                    }
                }
            }
        }
        boolean z7 = c2455.f9778;
        if (c13746M7458 != null) {
            boolean z8 = c13746M7458.f45311;
            long j9 = c13746M7458.f45310;
            int i6 = c13746M7458.f45309;
            int i7 = c13746M7458.f45307;
            long j10 = c13746M7458.f45312;
            long j11 = c13746M7458.f45308;
            long j12 = j10;
            long j13 = c13746M7458.f45306;
            if (z7 && (i7 != 0 || i6 != 0 || c13746M7458.f45313 != j13)) {
                throw new IOException("Split ZIP archives are not supported");
            }
            boolean z9 = abstractC20745 != null && i7 > 0 && c2455.f9779 == null && c2455.f9782.getName().toLowerCase().endsWith(".zip");
            if (!z || z9) {
                if (z7 || z9 || j11 < 32) {
                    j = j13;
                } else {
                    c2455.m7462(j11 - 16);
                    if (c2455.f9782.available() >= 16 && m7464() == 2334950737559900225L && m7464() == 3617552046287187010L) {
                        c2455.m7462(j11 - 24);
                        long jM7464 = m7464();
                        j = j13;
                        long j14 = (j11 - jM7464) - 8;
                        c2455.m7462(j14);
                        if (m7464() == jM7464) {
                            c2455.f9769 = true;
                            c2455.f9768 = j14;
                        }
                    } else {
                        j = j13;
                    }
                }
                if (z9) {
                    String strM47957 = C21420.m47957(c2455.f9782.getName());
                    int i8 = i7 + 1;
                    AbstractC20745[] abstractC20745Arr = new AbstractC20745[i8];
                    long[] jArr = new long[i8];
                    int i9 = 0;
                    while (i9 < i7) {
                        boolean z10 = z8;
                        Locale locale = Locale.ENGLISH;
                        int i10 = i9 + 1;
                        long j15 = j12;
                        boolean z11 = z7;
                        AbstractC20745 abstractC20745M46691 = abstractC20745.m46690(String.format(locale, "%s.z%02d", strM47957, Integer.valueOf(i10)));
                        if (abstractC20745M46691.mo33971()) {
                            abstractC20745Arr[i9] = abstractC20745M46691;
                            jArr[i9] = abstractC20745M46691.mo33964();
                        } else {
                            AbstractC20745 abstractC20745M46692 = abstractC20745.m46690(String.format(locale, "%s.Z%02d", strM47957, Integer.valueOf(i10)));
                            if (!abstractC20745M46692.mo33971()) {
                                throw new FileNotFoundException(abstractC20745M46691.getName());
                            }
                            abstractC20745Arr[i9] = abstractC20745M46692;
                            jArr[i9] = abstractC20745M46692.mo33964();
                        }
                        z7 = z11;
                        z8 = z10;
                        i9 = i10;
                        j12 = j15;
                        j9 = j9;
                    }
                    z2 = z8;
                    long j16 = j9;
                    j2 = j12;
                    z3 = z7;
                    abstractC20745Arr[i7] = abstractC20745.m46690(c2455.f9782.getName());
                    jArr[i7] = c2455.f9782.length();
                    C11018 c11018M43576 = C18917.m43576(i8);
                    for (int i11 = 0; i11 <= i7; i11++) {
                        c11018M43576.m27786(abstractC20745Arr[i11].getName());
                        c11018M43576.m27791(jArr[i11]);
                    }
                    c2455.f9779 = c11018M43576.m27773();
                    if (!z) {
                        InterfaceC21850 interfaceC21850Mo4866 = c2455.f9782.mo4866();
                        C0682 c0682M3047 = C0682.m3047(interfaceC21850Mo4866.getName(), jArr, new C23396(abstractC20745Arr));
                        c0682M3047.m3054(i7, interfaceC21850Mo4866);
                        c2455.f9782 = C19734.m44887(c0682M3047);
                        long jM3058 = c0682M3047.m3057(i6) + j11;
                        jM3057 = c0682M3047.m3057(i7) + j16;
                        c2455.m7462(jM3058);
                        c0682 = c0682M3047;
                        j11 = jM3058;
                        j4 = 0;
                    }
                } else {
                    z2 = z8;
                    j2 = j12;
                    z3 = z7;
                    if (z3) {
                        j3 = 0;
                    } else {
                        if (j < 0 || j2 < 0 || j9 < j11 || j9 - j11 == j2 || j2 > j9) {
                            j5 = j11;
                        } else {
                            j5 = j9 - j2;
                            if (j5 <= j11) {
                                j5 = j11;
                            } else if (j != 0) {
                                c2455.m7462(j5);
                                if (c2455.f9782.available() < 46 || m7460() != 33639248) {
                                    j5 = j11;
                                } else {
                                    c2455.m7462(42 + j5);
                                    long jM74510 = m7459();
                                    long j17 = j5 - j11;
                                    if (jM74510 == 4294967295L || jM74510 > C17492.FOREVER_NS - j17) {
                                        j5 = j11;
                                    } else {
                                        c2455.m7462(jM74510 + j17);
                                        if (c2455.f9782.available() < 4 || m7460() != 67324752) {
                                            j5 = j11;
                                        }
                                    }
                                }
                            } else if (j2 != 0) {
                                j5 = j11;
                            }
                        }
                        j3 = j5 - j11;
                        j11 = j5;
                    }
                    c2455.m7462(j11);
                    j4 = j3;
                    c0682 = null;
                    jM3057 = j9;
                }
                String str = "ZIP central directory size does not match EOCD";
                boolean z12 = c2455.f9777;
                if ((z12 || z3) && (j < 0 || j2 < 0 || jM3057 < j11 || jM3057 - j11 != j2)) {
                    c2455.m7443("ZIP central directory size does not match EOCD");
                }
                if (z3 && j == 0 && j2 == 0) {
                    c2455.f9771 = z2;
                    return;
                }
                boolean z13 = z2;
                String str2 = "ZIP central directory entry count does not match EOCD";
                if (c2455.f9782.available() <= 50 || m7460() != 33639248) {
                    if (z3) {
                        throw new IOException("ZIP central directory could not be parsed");
                    }
                    if (z12 && (j != 0 || j2 != 0)) {
                        c2455.m7463("ZIP central directory could not be parsed");
                    }
                    c2455.m7452(interfaceC17045, true);
                    if (z12 && interfaceC17045 == null && c2455.f9781.size() != j) {
                        c2455.m7463("ZIP central directory entry count does not match EOCD");
                        return;
                    }
                    return;
                }
                c2455.f9771 = z13;
                ArrayList arrayList5 = new ArrayList();
                IdentityHashMap identityHashMap2 = (z12 || z3) ? new IdentityHashMap() : null;
                Set setNewSetFromMap = z12 ? Collections.newSetFromMap(new IdentityHashMap()) : null;
                ArrayList arrayList6 = z12 ? new ArrayList() : null;
                int i12 = C22037.f71434;
                int[] iArr = new int[i12];
                int i13 = 50000;
                ArrayList arrayList7 = arrayList6;
                long j18 = 0;
                long filePointer = 0;
                while (true) {
                    C12107 c12107 = new C12107();
                    int i14 = i12;
                    c12107.m30100((m7441() >> 8) & 15);
                    m7441();
                    c12107.m30111(m7441());
                    c12107.m30094(m7441());
                    String str3 = str;
                    c12107.setTime(C21506.m48150(m7459()));
                    c12107.m30102(m7460());
                    c12107.m30103(m7459());
                    c12107.m30096(m7459());
                    int iM7441 = m7441();
                    int iM7442 = m7441();
                    long j19 = j11;
                    int iM7443 = m7441();
                    int iM7444 = m7441();
                    String str4 = str2;
                    c12107.m30139(m7441());
                    c12107.m30095(m7460());
                    if (z9) {
                        c12107.m30123(c0682.m3057(iM7444) + m7459());
                    } else {
                        c12107.m30123(m7459());
                    }
                    boolean zM30120 = c12107.m30120();
                    byte[] bArrM7457 = c2455.m7456(iM7441);
                    Charset charsetM48953 = c2455.f9783;
                    if (interfaceC17045 == null || interfaceC17045.mo19507(bArrM7457)) {
                        if (!zM30120 && i13 > 0 && charsetM48953 == null) {
                            m7454(bArrM7457, iArr);
                            i13--;
                        }
                        int i15 = i13;
                        c12107.m30097(bArrM7457);
                        if (z12 || z3) {
                            identityHashMap2.put(c12107, bArrM7457);
                        }
                        if (iM7442 > 0) {
                            byte[] bArrM7458 = c2455.m7456(iM7442);
                            if (c12107.m30112(bArrM7458)) {
                                bArrM7458 = C7167.m19091(1, bArrM7458);
                                if (z12) {
                                    setNewSetFromMap.add(c12107);
                                }
                            }
                            c12107.m30109(bArrM7458);
                        }
                        if (j4 != 0) {
                            long jM30137 = c12107.m30137();
                            if (jM30137 < 0 || jM30137 > C17492.FOREVER_NS - j4) {
                                c2455.m7463("ZIP local file header offset overflows archive bounds");
                                c12107.m30123(c2455.f9782.length());
                            } else {
                                c12107.m30123(jM30137 + j4);
                            }
                        }
                        if (iM7443 > 0) {
                            try {
                                byte[] bArrM7459 = c2455.m7456(iM7443);
                                if (!zM30120 && i15 > 0 && charsetM48953 == null) {
                                    m7454(bArrM7459, iArr);
                                    i15--;
                                }
                                c12107.m30129(bArrM7459);
                            } catch (IOException e) {
                                if (z3) {
                                    throw e;
                                }
                            }
                        }
                        arrayList = arrayList5;
                        arrayList.add(c12107);
                        i13 = i15;
                    } else {
                        c2455.m7442(iM7442 + iM7443);
                        arrayList = arrayList5;
                    }
                    if (z12 || z3) {
                        j18++;
                        filePointer = c2455.f9782.getFilePointer();
                    }
                    long j20 = filePointer;
                    if (m7460() != 33639248) {
                        if (z12 || z3) {
                            if (j18 != j) {
                                c2455.m7443(str4);
                            }
                            if (j20 < j19 || j2 < 0) {
                                c2455.m7443(str3);
                            } else {
                                long j21 = j2 - (j20 - j19);
                                if (j21 != 0) {
                                    if (j21 < 6) {
                                        c2455.m7443("ZIP central directory size does not match parsed records");
                                    } else {
                                        try {
                                            c2455.m7462(j20);
                                            if (m7460() != 84233040) {
                                                c2455.m7443("ZIP central directory size does not match parsed records");
                                            } else {
                                                int iM7445 = m7441();
                                                if (j21 != ((long) iM7445) + 6 || c2455.f9782.available() < iM7445) {
                                                    c2455.m7443("ZIP central directory digital signature is truncated");
                                                }
                                            }
                                        } catch (IOException e2) {
                                            if (z3) {
                                                throw e2;
                                            }
                                            c2455.m7463("ZIP central directory is truncated");
                                        }
                                    }
                                }
                            }
                        }
                        Charset charset4 = StandardCharsets.UTF_8;
                        if (charsetM48953 == null) {
                            int i16 = C22037.f71424;
                            for (int i17 = 0; i17 < i14; i17++) {
                                if (i17 != i16 && iArr[i17] > iArr[i16]) {
                                    i16 = i17;
                                }
                            }
                            charsetM48953 = C22037.m48953(i16);
                        }
                        Collections.sort(arrayList, new C14224());
                        Set setNewSetFromMap2 = z12 ? Collections.newSetFromMap(new IdentityHashMap(arrayList.size())) : null;
                        HashSet hashSet3 = z12 ? null : new HashSet(arrayList.size());
                        for (C12107 c12108 : arrayList) {
                            try {
                                long jM30139 = c12108.m30137();
                                c2455.m7462(jM30139);
                                if (c2455.f9782.available() < 30 || m7460() != 67324752) {
                                    hashSet = hashSet3;
                                    set = setNewSetFromMap2;
                                    arrayList2 = arrayList;
                                    charset = charset4;
                                    this = c2455;
                                    c0683 = c0682;
                                    z4 = z12;
                                    identityHashMap = identityHashMap2;
                                    arrayList3 = arrayList7;
                                    if (z3) {
                                        throw new IOException("ZIP central directory entry has an unreadable local file header");
                                    }
                                } else {
                                    if (z12) {
                                        m7441();
                                        int iM7446 = m7441();
                                        int iM7447 = m7441();
                                        c2455.m7442(4L);
                                        int iM7460 = m7460();
                                        long jM74511 = m7459();
                                        i = iM7446;
                                        i2 = iM7447;
                                        i3 = iM7460;
                                        jM7459 = m7459();
                                        j6 = jM74511;
                                    } else {
                                        c2455.m7462(26 + jM30139);
                                        j6 = 0;
                                        jM7459 = 0;
                                        i = 0;
                                        i2 = 0;
                                        i3 = 0;
                                    }
                                    int iM7448 = m7441();
                                    int iM7449 = m7441();
                                    if (z12 || z3) {
                                        bArrM7456 = c2455.m7456(iM7448);
                                    } else {
                                        c2455.m7442(iM7448);
                                        bArrM7456 = null;
                                    }
                                    byte[] bArrM74510 = c2455.m7456(iM7449);
                                    if (z12) {
                                        try {
                                            c0683 = c0682;
                                            i4 = iM7449;
                                            i5 = iM7448;
                                            j7 = jM30139;
                                            bArr = bArrM74510;
                                            byte[] bArr2 = bArrM7456;
                                            int i18 = i2;
                                            hashSet2 = hashSet3;
                                            int i19 = i3;
                                            arrayList4 = arrayList7;
                                            set2 = setNewSetFromMap;
                                            set3 = setNewSetFromMap2;
                                            z4 = z12;
                                            identityHashMap = identityHashMap2;
                                            charset2 = charsetM48953;
                                            charset3 = charset4;
                                            arrayList2 = arrayList;
                                            try {
                                                m7451(c12108, (byte[]) identityHashMap2.get(c12108), i, i18, i19, j6, jM7459, bArr2, bArr);
                                            } catch (EOFException e3) {
                                                e = e3;
                                                hashSet = hashSet2;
                                                arrayList3 = arrayList4;
                                                setNewSetFromMap = set2;
                                                set = set3;
                                                charsetM48953 = charset2;
                                                charset = charset3;
                                                if (!z3) {
                                                    throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                }
                                                setNewSetFromMap2 = set;
                                                hashSet3 = hashSet;
                                                charset4 = charset;
                                                arrayList7 = arrayList3;
                                                c2455 = this;
                                                identityHashMap2 = identityHashMap;
                                                z12 = z4;
                                                arrayList = arrayList2;
                                                c0682 = c0683;
                                            }
                                        } catch (EOFException e4) {
                                            e = e4;
                                            arrayList4 = arrayList7;
                                            hashSet2 = hashSet3;
                                            set2 = setNewSetFromMap;
                                            set3 = setNewSetFromMap2;
                                            arrayList2 = arrayList;
                                            charset2 = charsetM48953;
                                            charset3 = charset4;
                                            c0683 = c0682;
                                            z4 = z12;
                                            identityHashMap = identityHashMap2;
                                            hashSet = hashSet2;
                                            arrayList3 = arrayList4;
                                            setNewSetFromMap = set2;
                                            set = set3;
                                            charsetM48953 = charset2;
                                            charset = charset3;
                                            if (!z3) {
                                                throw new IOException("ZIP central directory entry local file header is truncated", e);
                                            }
                                            setNewSetFromMap2 = set;
                                            hashSet3 = hashSet;
                                            charset4 = charset;
                                            arrayList7 = arrayList3;
                                            c2455 = this;
                                            identityHashMap2 = identityHashMap;
                                            z12 = z4;
                                            arrayList = arrayList2;
                                            c0682 = c0683;
                                        }
                                    } else {
                                        arrayList4 = arrayList7;
                                        j7 = jM30139;
                                        i5 = iM7448;
                                        bArr = bArrM74510;
                                        byte[] bArr3 = bArrM7456;
                                        hashSet2 = hashSet3;
                                        set2 = setNewSetFromMap;
                                        set3 = setNewSetFromMap2;
                                        arrayList2 = arrayList;
                                        charset2 = charsetM48953;
                                        charset3 = charset4;
                                        c0683 = c0682;
                                        z4 = z12;
                                        i4 = iM7449;
                                        identityHashMap = identityHashMap2;
                                        if (z3 && !Arrays.equals((byte[]) identityHashMap.get(c12108), bArr3)) {
                                            throw new IOException("ZIP local file header name does not match central directory");
                                        }
                                    }
                                    byte[] bArr4 = bArr;
                                    c12108.m30124(C7167.m19091(1, bArr4));
                                    c12108.m30127(j7 + 30 + ((long) i5) + ((long) i4));
                                    if (z4) {
                                        try {
                                            if ((c12108.m30131() & 8) != 0) {
                                                boolean z14 = j6 == 4294967295L || jM7459 == 4294967295L;
                                                try {
                                                    try {
                                                        if (z14) {
                                                            setNewSetFromMap = set2;
                                                        } else {
                                                            setNewSetFromMap = set2;
                                                            try {
                                                                if (!setNewSetFromMap.contains(c12108)) {
                                                                    z5 = false;
                                                                }
                                                                if (z5 || z14 || C7167.m19088(1, bArr4) != null) {
                                                                    z6 = false;
                                                                } else {
                                                                    z6 = true;
                                                                }
                                                                long jM30099 = c12108.m30099();
                                                                jM30138 = c12108.m30138();
                                                                if (jM30138 >= 0 || jM30099 < 0 || jM30099 > C17492.FOREVER_NS - jM30138) {
                                                                    j8 = -1;
                                                                } else {
                                                                    j8 = jM30099 + jM30138;
                                                                }
                                                                arrayList3 = arrayList4;
                                                                arrayList3.add(new C4572(j8, c12108.m30126(), jM30138, c12108.getSize(), z5, z6));
                                                            } catch (EOFException e5) {
                                                                e = e5;
                                                                hashSet = hashSet2;
                                                                arrayList3 = arrayList4;
                                                                set = set3;
                                                                charsetM48953 = charset2;
                                                                charset = charset3;
                                                                if (!z3) {
                                                                    throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                                }
                                                                setNewSetFromMap2 = set;
                                                                hashSet3 = hashSet;
                                                                charset4 = charset;
                                                                arrayList7 = arrayList3;
                                                                c2455 = this;
                                                                identityHashMap2 = identityHashMap;
                                                                z12 = z4;
                                                                arrayList = arrayList2;
                                                                c0682 = c0683;
                                                            }
                                                        }
                                                        arrayList3.add(new C4572(j8, c12108.m30126(), jM30138, c12108.getSize(), z5, z6));
                                                    } catch (EOFException e6) {
                                                        e = e6;
                                                        hashSet = hashSet2;
                                                        set = set3;
                                                        charsetM48953 = charset2;
                                                        charset = charset3;
                                                        if (!z3) {
                                                            throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                        }
                                                        setNewSetFromMap2 = set;
                                                        hashSet3 = hashSet;
                                                        charset4 = charset;
                                                        arrayList7 = arrayList3;
                                                        c2455 = this;
                                                        identityHashMap2 = identityHashMap;
                                                        z12 = z4;
                                                        arrayList = arrayList2;
                                                        c0682 = c0683;
                                                    }
                                                    long jM300910 = c12108.m30099();
                                                    jM30138 = c12108.m30138();
                                                    if (jM30138 >= 0) {
                                                        j8 = -1;
                                                    } else {
                                                        j8 = -1;
                                                    }
                                                    arrayList3 = arrayList4;
                                                } catch (EOFException e7) {
                                                    e = e7;
                                                    arrayList3 = arrayList4;
                                                }
                                                z5 = true;
                                                if (z5) {
                                                    z6 = false;
                                                } else {
                                                    z6 = false;
                                                }
                                            } else {
                                                arrayList3 = arrayList4;
                                                setNewSetFromMap = set2;
                                            }
                                        } catch (EOFException e8) {
                                            e = e8;
                                            arrayList3 = arrayList4;
                                            setNewSetFromMap = set2;
                                        }
                                    } else {
                                        arrayList3 = arrayList4;
                                        setNewSetFromMap = set2;
                                    }
                                    if (c12108.m30120()) {
                                        this = this;
                                        try {
                                            charset = charset3;
                                            try {
                                                c12108.m30105(charset, false, this.f9784);
                                                charsetM48953 = charset2;
                                            } catch (EOFException e9) {
                                                e = e9;
                                                hashSet = hashSet2;
                                                set = set3;
                                                charsetM48953 = charset2;
                                                if (!z3) {
                                                    throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                }
                                                setNewSetFromMap2 = set;
                                                hashSet3 = hashSet;
                                                charset4 = charset;
                                                arrayList7 = arrayList3;
                                                c2455 = this;
                                                identityHashMap2 = identityHashMap;
                                                z12 = z4;
                                                arrayList = arrayList2;
                                                c0682 = c0683;
                                            }
                                        } catch (EOFException e10) {
                                            e = e10;
                                            charset = charset3;
                                        }
                                    } else {
                                        this = this;
                                        charset = charset3;
                                        charsetM48953 = charset2;
                                        c12108.m30105(charsetM48953, true, this.f9784);
                                    }
                                    if (!z9) {
                                        try {
                                            if (!this.f9784 && c12108.getName().equals("AndroidManifest.xml")) {
                                                this.f9784 = true;
                                            }
                                            if (z4) {
                                                set = set3;
                                                try {
                                                    set.add(c12108);
                                                    hashSet = hashSet2;
                                                } catch (EOFException e11) {
                                                    e = e11;
                                                    hashSet = hashSet2;
                                                    if (!z3) {
                                                        throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                    }
                                                }
                                            } else {
                                                set = set3;
                                                hashSet = hashSet2;
                                                try {
                                                    hashSet.add(c12108.getName());
                                                } catch (EOFException e12) {
                                                    e = e12;
                                                    if (!z3) {
                                                        throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                    }
                                                }
                                            }
                                        } catch (EOFException e13) {
                                            e = e13;
                                            hashSet = hashSet2;
                                            set = set3;
                                            if (!z3) {
                                                throw new IOException("ZIP central directory entry local file header is truncated", e);
                                            }
                                            setNewSetFromMap2 = set;
                                            hashSet3 = hashSet;
                                            charset4 = charset;
                                            arrayList7 = arrayList3;
                                            c2455 = this;
                                            identityHashMap2 = identityHashMap;
                                            z12 = z4;
                                            arrayList = arrayList2;
                                            c0682 = c0683;
                                        }
                                    } else if (z4) {
                                        set = set3;
                                        set.add(c12108);
                                        hashSet = hashSet2;
                                    } else {
                                        set = set3;
                                        hashSet = hashSet2;
                                        hashSet.add(c12108.getName());
                                    }
                                }
                            } catch (EOFException e14) {
                                e = e14;
                                hashSet = hashSet3;
                                set = setNewSetFromMap2;
                                arrayList2 = arrayList;
                                charset = charset4;
                                this = c2455;
                                c0683 = c0682;
                                z4 = z12;
                                identityHashMap = identityHashMap2;
                                arrayList3 = arrayList7;
                            }
                            setNewSetFromMap2 = set;
                            hashSet3 = hashSet;
                            charset4 = charset;
                            arrayList7 = arrayList3;
                            c2455 = this;
                            identityHashMap2 = identityHashMap;
                            z12 = z4;
                            arrayList = arrayList2;
                            c0682 = c0683;
                        }
                        ArrayList arrayList8 = arrayList7;
                        HashSet hashSet4 = hashSet3;
                        Set set4 = setNewSetFromMap2;
                        ArrayList<C12107> arrayList9 = arrayList;
                        C2455 c2456 = c2455;
                        C0682 c0684 = c0682;
                        boolean z15 = z12;
                        LinkedList<C12107> linkedList = new LinkedList();
                        for (C12107 c12109 : arrayList9) {
                            if (z15) {
                                if (set4.contains(c12109)) {
                                    c2456.m7440(c12109);
                                    linkedList.add(c12109);
                                }
                            } else if (hashSet4.contains(c12109.getName())) {
                                c2456.m7440(c12109);
                                linkedList.add(c12109);
                            }
                        }
                        if (z15) {
                            c2456.f9775 = linkedList.size() != arrayList9.size();
                            c2456.f9781 = C0561.unmodifiableList(new ArrayList(linkedList));
                            c2456.f9770 = C0561.unmodifiableList(arrayList8);
                        }
                        ArrayList arrayList10 = new ArrayList();
                        if (c0684 == null) {
                            long length = c2456.f9782.length() / 200;
                            for (C12107 c121010 : linkedList) {
                                if (c121010.m30119() == 0 && !c121010.m30133() && !c121010.isDirectory() && c121010.getSize() > length) {
                                    arrayList10.add(c121010);
                                }
                            }
                        }
                        boolean zIsEmpty = arrayList10.isEmpty();
                        LinkedHashMap linkedHashMap = c2456.f9780;
                        if (zIsEmpty) {
                            for (C12107 c121011 : linkedList) {
                                linkedHashMap.put(c121011.getName(), c121011);
                            }
                            return;
                        }
                        Collections.sort(arrayList10, new C1522(0));
                        int iMin = Math.min(arrayList10.size(), 10);
                        for (int i20 = 0; i20 < iMin; i20++) {
                            C12107 c121012 = (C12107) arrayList10.get(i20);
                            if (!c121012.m30130()) {
                                long jM300911 = c121012.m30099();
                                long jM301310 = c121012.m30138() + jM300911;
                                for (C12107 c121013 : linkedList) {
                                    if (c121013 != c121012 && !c121013.isDirectory() && !c121013.m30130()) {
                                        long jM300912 = c121013.m30099();
                                        long jM301311 = c121013.m30138() + jM300912;
                                        if (jM300911 <= jM300912 && jM301311 <= jM301310) {
                                            c121013.m30107(c121012);
                                        }
                                    }
                                }
                            }
                        }
                        ArrayList<C12107> arrayList11 = new ArrayList();
                        for (C12107 c121014 : linkedList) {
                            if (c121014.m30130()) {
                                arrayList11.add(c121014);
                            } else {
                                linkedHashMap.put(c121014.getName(), c121014);
                            }
                        }
                        for (C12107 c121015 : arrayList11) {
                            linkedHashMap.put(c121015.getName(), c121015);
                        }
                        return;
                    }
                    arrayList5 = arrayList;
                    j11 = j19;
                    str2 = str4;
                    filePointer = j20;
                    str = str3;
                    i12 = i14;
                }
            }
        } else if (!z) {
            if (z7) {
                throw new IOException("ZIP end of central directory is missing or unreadable");
            }
            c2455.m7463("ZIP end of central directory is missing or unreadable");
            c2455.m7452(interfaceC17045, false);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m7443(String str) throws IOException {
        if (this.f9778) {
            throw new IOException(str);
        }
        m7463(str);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00da A[Catch: IOException -> 0x00ee, TryCatch #0 {IOException -> 0x00ee, blocks: (B:22:0x0052, B:42:0x008e, B:44:0x0098, B:46:0x009d, B:48:0x00a3, B:50:0x00ad, B:51:0x00b1, B:53:0x00b7, B:55:0x00bf, B:58:0x00c6, B:64:0x00da, B:60:0x00cc, B:62:0x00d2, B:24:0x005a, B:28:0x0064, B:32:0x0070, B:38:0x007f, B:65:0x00de, B:66:0x00e5, B:67:0x00e6, B:68:0x00ed), top: B:89:0x004c }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7451(C12107 c12107, byte[] bArr, int i, int i2, int i3, long j, long j2, byte[] bArr2, byte[] bArr3) {
        long jM19093;
        long[] jArr;
        int iM30131 = c12107.m30131();
        if (((iM30131 ^ i) & 10367) != 0) {
            m7463("ZIP local file header flags do not match central directory");
        }
        if (c12107.m30119() != i2) {
            m7463("ZIP local file header method does not match central directory");
        }
        int i4 = 0;
        boolean z = ((iM30131 & 8192) == 0 || (i & 8192) == 0) ? false : true;
        if (!z && !Arrays.equals(bArr, bArr2)) {
            m7463("ZIP local file header name does not match central directory");
        }
        try {
            if (j == 4294967295L || j2 == 4294967295L) {
                C7167 c7167M19088 = C7167.m19088(1, bArr3);
                if (c7167M19088 == null) {
                    throw new IOException("Missing ZIP64 local extra data");
                }
                if (j2 == 4294967295L) {
                    jM19093 = c7167M19088.m19093(0);
                    i4 = 8;
                } else {
                    jM19093 = j2;
                }
                long jM19094 = j == 4294967295L ? c7167M19088.m19093(i4) : j;
                if (jM19094 < 0 || jM19093 < 0) {
                    throw new IOException("Unsupported unsigned ZIP64 size");
                }
                jArr = new long[]{jM19094, jM19093};
            } else {
                jArr = new long[]{j, j2};
            }
            if ((iM30131 & 8) == 0) {
                if (jArr[0] != c12107.m30138()) {
                    m7463("ZIP local file header compressed size does not match central directory");
                }
                if (!z && (i3 != c12107.m30126() || jArr[1] != c12107.getSize())) {
                    m7463("ZIP local file header CRC or size does not match central directory");
                }
            } else {
                long j3 = jArr[0];
                if (j3 != 0 && j3 != c12107.m30138()) {
                    m7463("ZIP local file header compressed size does not match central directory");
                }
                if (!z) {
                    if (i3 == 0 || i3 == c12107.m30126()) {
                        long j4 = jArr[1];
                        if (j4 != 0 && j4 != c12107.getSize()) {
                            m7463("ZIP local file header CRC or size does not match central directory");
                        }
                    } else {
                        m7463("ZIP local file header CRC or size does not match central directory");
                    }
                }
            }
        } catch (IOException unused) {
            m7463("ZIP local file header contains invalid ZIP64 sizes");
        }
        if (c12107.m30119() == 99 || i2 == 99) {
            C7167 c7167M19089 = C7167.m19088(39169, c12107.m30098());
            C7167 c7167M190810 = C7167.m19088(39169, bArr3);
            if (c7167M19089 == null || c7167M190810 == null || c7167M19089.m19094().length < 7 || c7167M190810.m19094().length < 7) {
                m7463("ZIP AES extra data is missing from a file header");
                return;
            }
            for (int i5 = 0; i5 < 7; i5++) {
                if (c7167M19089.m19094()[i5] != c7167M190810.m19094()[i5]) {
                    m7463("ZIP AES extra data does not match between file headers");
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m7455(C4572 c4572, boolean z, boolean z2) throws C9513, InterruptedIOException {
        try {
            m7462(c4572.f16218);
            if (!z || m7460() == 134695760) {
                return m7460() == c4572.f16221 && (z2 ? m7464() : m7459()) == c4572.f16222 && (z2 ? m7464() : m7459()) == c4572.f16220;
            }
            return false;
        } catch (EOFException unused) {
            return false;
        } catch (InterruptedIOException e) {
            throw e;
        } catch (IOException e2) {
            throw new C9513(e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7452(InterfaceC17045 interfaceC17045, boolean z) throws IOException {
        int i;
        long j;
        Charset charsetM48953;
        boolean zM30112;
        boolean z2;
        long jM7459;
        long jM74510;
        byte[] bArr;
        int i2;
        byte[] bArr2;
        long j2;
        int i3;
        ArrayList<C12107> arrayList = new ArrayList();
        int i4 = C22037.f71434;
        int[] iArr = new int[i4];
        long length = this.f9782.length();
        m7462(0L);
        if (m7460() != 67324752) {
            InterfaceC7739 interfaceC7739 = this.f9782;
            int i5 = 4;
            byte[] bArr3 = {UTF8.S_P4A, 75, 3, 4};
            long jMin = Math.min(interfaceC7739.length(), 52428800L);
            long j3 = 4;
            if (jMin < j3) {
                i = i4;
                j = length;
            } else {
                int[] iArr2 = new int[4];
                int i6 = 1;
                int i7 = 0;
                while (i6 < i5) {
                    while (true) {
                        if (i7 <= 0) {
                            i3 = i4;
                            break;
                        }
                        i3 = i4;
                        if (bArr3[i7] == bArr3[i6]) {
                            break;
                        }
                        i7 = iArr2[i7 - 1];
                        i4 = i3;
                    }
                    if (bArr3[i7] == bArr3[i6]) {
                        i7++;
                    }
                    iArr2[i6] = i7;
                    i6++;
                    i5 = 4;
                    i4 = i3;
                }
                i = i4;
                byte[] bArr4 = new byte[65536];
                j = length;
                interfaceC7739.seek(0L);
                int i8 = 0;
                int i9 = 0;
                long j4 = 0;
                int i10 = 0;
                while (true) {
                    if (j4 < jMin) {
                        if (i8 >= i9) {
                            int iMo4867 = interfaceC7739.mo4867(0, (int) Math.min(65536, jMin - j4), bArr4);
                            if (iMo4867 != 0) {
                                i9 = iMo4867;
                                i8 = 0;
                            }
                        }
                        int i11 = i8 + 1;
                        if (bArr4[i8] == bArr3[i10]) {
                            i10++;
                            if (i10 == 4) {
                                long j5 = j4 - j3;
                                long j6 = j5 + 1;
                                i2 = i9;
                                long filePointer = interfaceC7739.getFilePointer();
                                bArr2 = bArr3;
                                try {
                                    interfaceC7739.seek(j5 + 5);
                                    int iMo4872 = interfaceC7739.mo4872();
                                    if (iMo4872 == 45 || iMo4872 == 20 || iMo4872 == 10) {
                                        interfaceC7739.mo4872();
                                        int iMo4873 = interfaceC7739.mo4872();
                                        if (iMo4873 == 0 || iMo4873 == 8 || iMo4873 == 9 || iMo4873 == 12 || iMo4873 == 14 || iMo4873 == 95) {
                                            interfaceC7739.readInt();
                                            interfaceC7739.readInt();
                                            long j7 = ((long) interfaceC7739.readInt()) & 4294967295L;
                                            interfaceC7739.readInt();
                                            bArr = bArr4;
                                            int iMo4874 = interfaceC7739.mo4872();
                                            if (iMo4874 != 0) {
                                                if (interfaceC7739.getFilePointer() + ((long) iMo4874) + ((long) interfaceC7739.mo4872()) + j7 <= interfaceC7739.length()) {
                                                    interfaceC7739.seek(filePointer);
                                                    j2 = j6;
                                                    break;
                                                }
                                                interfaceC7739.seek(filePointer);
                                            } else {
                                                interfaceC7739.seek(filePointer);
                                            }
                                        } else {
                                            bArr = bArr4;
                                            interfaceC7739.seek(filePointer);
                                        }
                                    } else {
                                        bArr = bArr4;
                                        interfaceC7739.seek(filePointer);
                                    }
                                    i10 = 0;
                                } catch (Throwable th) {
                                    interfaceC7739.seek(filePointer);
                                    throw th;
                                }
                            } else {
                                bArr = bArr4;
                                i2 = i9;
                                bArr2 = bArr3;
                                j3 = j3;
                                i11 = i11;
                            }
                        } else {
                            bArr = bArr4;
                            i2 = i9;
                            bArr2 = bArr3;
                            j3 = j3;
                            i11 = i11;
                            if (i10 > 0) {
                                i10 = iArr2[i10 - 1];
                            }
                            bArr3 = bArr2;
                            bArr4 = bArr;
                            jMin = jMin;
                            i9 = i2;
                            j3 = j3;
                        }
                        j4++;
                        i8 = i11;
                        bArr3 = bArr2;
                        bArr4 = bArr;
                        jMin = jMin;
                        i9 = i2;
                        j3 = j3;
                    }
                }
                if (j2 != -1) {
                    m7462(j2);
                }
            }
            j2 = -1;
            if (j2 != -1) {
                m7462(j2);
            }
        } else {
            i = i4;
            j = length;
            m7462(0L);
        }
        int i12 = 50000;
        loop0: while (true) {
            int iAvailable = this.f9782.available();
            charsetM48953 = this.f9783;
            if (iAvailable <= 30 || m7460() != 67324752) {
                break;
            }
            C12107 c12107 = new C12107();
            long j8 = 4;
            c12107.m30123(this.f9782.getFilePointer() - 4);
            m7441();
            c12107.m30111(m7441());
            c12107.m30094(m7441());
            c12107.setTime(C21506.m48150(m7459()));
            c12107.m30102(m7460());
            c12107.m30103(m7459());
            c12107.m30096(m7459());
            int iM7441 = m7441();
            int iM7442 = m7441();
            boolean zM30120 = c12107.m30120();
            byte[] bArrM7456 = m7456(iM7441);
            boolean z3 = (interfaceC17045 == null || interfaceC17045.mo19507(bArrM7456)) ? false : true;
            if (!z3 && !zM30120 && i12 > 0 && charsetM48953 == null) {
                m7454(bArrM7456, iArr);
                i12--;
            }
            c12107.m30097(bArrM7456);
            if (iM7442 > 0) {
                byte[] bArrM7457 = m7456(iM7442);
                zM30112 = c12107.m30112(bArrM7457);
                if (zM30112) {
                    bArrM7457 = C7167.m19091(1, bArrM7457);
                }
                c12107.m30124(bArrM7457);
            } else {
                zM30112 = false;
            }
            c12107.m30127(this.f9782.getFilePointer());
            int i13 = 8;
            if ((c12107.m30131() & 8) == 8) {
                int i14 = 0;
                while (true) {
                    int i15 = this.f9782.read();
                    if (i15 == -1) {
                        break loop0;
                    }
                    i14 = (i14 >>> i13) | (i15 << 24);
                    if (i14 == 134695760) {
                        long filePointer2 = (this.f9782.getFilePointer() - c12107.m30099()) - j8;
                        int iM7460 = m7460();
                        if (zM30112) {
                            jM7459 = m7464();
                            jM74510 = m7464();
                        } else {
                            jM7459 = m7459();
                            jM74510 = m7459();
                        }
                        long j9 = jM7459;
                        z2 = z3;
                        long j10 = jM74510;
                        if (j9 == filePointer2) {
                            c12107.m30102(iM7460);
                            c12107.m30103(j9);
                            c12107.m30096(j10);
                            break;
                        }
                    } else {
                        z2 = z3;
                    }
                    j8 = 4;
                    z3 = z2;
                    i13 = 8;
                }
                if (!z2) {
                    arrayList.add(c12107);
                }
            } else {
                z2 = z3;
                if (j - c12107.m30099() < c12107.m30138()) {
                    break;
                }
                m7442(c12107.m30138());
                if (!z2) {
                    arrayList.add(c12107);
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                throw new ZipException("Archive is not a ZIP archive");
            }
            return;
        }
        Charset charset = StandardCharsets.UTF_8;
        if (charsetM48953 == null) {
            int i16 = C22037.f71424;
            int i17 = i;
            for (int i18 = 0; i18 < i17; i18++) {
                if (i18 != i16 && iArr[i18] > iArr[i16]) {
                    i16 = i18;
                }
            }
            charsetM48953 = C22037.m48953(i16);
        }
        for (C12107 c12108 : arrayList) {
            if (c12108.m30120()) {
                c12108.m30105(charset, false, this.f9784);
            } else {
                c12108.m30105(charsetM48953, true, this.f9784);
            }
            if (!this.f9784 && c12108.getName().equals("AndroidManifest.xml") && this.f9779 == null) {
                this.f9784 = true;
            }
        }
        LinkedHashMap linkedHashMap = this.f9780;
        linkedHashMap.clear();
        for (C12107 c12109 : arrayList) {
            m7440(c12109);
            linkedHashMap.put(c12109.getName(), c12109);
        }
        if (this.f9777) {
            this.f9781 = C0561.unmodifiableList(new ArrayList(arrayList));
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m7440(C12107 c12107) throws ZipException, EOFException {
        int iM30119;
        if (c12107.m30133()) {
            if (this.f9784) {
                c12107.m30111(c12107.m30131() & (-2));
            } else {
                C7167 c7167M19088 = C7167.m19088(39169, c12107.m30134());
                if (c7167M19088 != null) {
                    c12107.m30122(99);
                    c12107.m30106(c7167M19088);
                    byte[] bArrM19094 = c7167M19088.m19094();
                    if (bArrM19094.length < 7) {
                        throw new ZipException("Invalid aes extra data record. (" + c12107.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    boolean z = C21506.f69876;
                    if (7 > bArrM19094.length) {
                        throw new EOFException();
                    }
                    c12107.m30094(C15157.m36347(5, bArrM19094));
                } else if ((c12107.m30131() & 64) != 0) {
                    c12107.m30122(1);
                } else {
                    c12107.m30122(0);
                }
            }
        }
        if (this.f9784 && (iM30119 = c12107.m30119()) != 8 && iM30119 != 0) {
            c12107.m30094(0);
        }
        if (this.f9784 && c12107.m30119() == 0 && c12107.getSize() != c12107.m30138()) {
            c12107.m30103(c12107.getSize());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C13746 m7450(long j, int i, long j2) throws IOException {
        m7462(j);
        int iM7460 = m7460();
        if (iM7460 != 101075792) {
            throw new IOException("Invalid zip64 eocd record offset, sig=" + Integer.toHexString(iM7460) + " offset=" + j);
        }
        if (this.f9778) {
            long jM7464 = m7464();
            long j3 = j2 - 20;
            if (jM7464 < 44 || j > 9223372036854775795L || jM7464 > 9223372036854775795L - j || j + 12 + jM7464 != j3) {
                throw new IOException(C15489.m37074(jM7464, "Invalid zip64 eocd record size: "));
            }
            m7442(4L);
        } else {
            m7442(12L);
        }
        return new C13746(m7460(), m7460(), m7464(), m7464(), m7464(), m7464(), j, i, true);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C5984 m7469(C12107 c12107) {
        return new C5984(this.f9782, c12107.m30099(), c12107.m30138(), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m7471(C12107 c12107) {
        return m7444(c12107, true, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InputStream m7481(C12107 c12107) {
        return m7444(c12107, false, false);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InputStream m7478(C12107 c12107) throws IOException {
        if (c12107.getSize() < 0) {
            throw new IOException("Unknown uncompressed size (" + c12107.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (c12107.m30138() < 0) {
            throw new IOException("Unknown compressed size (" + c12107.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return m7444(c12107, true, true);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0100  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:61:0x0138  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x016b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0181  */
    /* JADX WARN: Code duplicated, block: B:71:0x0199  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b3  */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x0100, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0181, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InputStream m7444(C12107 c12107, boolean z, boolean z2) throws IOException {
        boolean z3;
        InputStream c5984;
        InputStream bufferedInputStream;
        C8101 c8101;
        InputStream c3161;
        ByteBuffer byteBufferOrder;
        long size;
        if (!z2 && c12107.getSize() == 0 && (!c12107.m30133() || !c12107.m30118() || c12107.m30119() != 0)) {
            return new C2933();
        }
        long jM30099 = c12107.m30099();
        int iM30119 = c12107.m30119();
        boolean zM30133 = c12107.m30133();
        if (zM30133 && c12107.m30114() == 99) {
            int iM30121 = c12107.m30121();
            if (iM30121 == 2) {
                z3 = false;
            } else {
                if (iM30121 != 1) {
                    StringBuilder sbM40153 = C17214.m40153(iM30121, "Unsupported AES version ", " (");
                    sbM40153.append(c12107.getName());
                    sbM40153.append(MotionUtils.EASING_TYPE_FORMAT_END);
                    throw new IOException(sbM40153.toString());
                }
                z3 = true;
            }
        } else {
            z3 = true;
        }
        if (zM30133) {
            C5984 c5985 = new C5984(this.f9782, jM30099, c12107.m30138(), z2);
            int iM30114 = c12107.m30114();
            if (iM30114 == 0) {
                c5984 = new C0339(this, c12107, c5985, this.f9772);
            } else {
                if (iM30114 != 99) {
                    throw new IOException("Unsupported encryption method " + c12107.m30114() + " (" + c12107.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                bufferedInputStream = new C8101(this, c12107, c5985, this.f9772);
                c8101 = bufferedInputStream;
            }
            if (iM30119 != 0) {
                if (iM30119 != 12) {
                    c3161 = new C3161(c12107, bufferedInputStream);
                } else if (iM30119 != 14) {
                    int i = C18497.f58937;
                    byte[] bArr = new byte[9];
                    C20010.m45306(bufferedInputStream, bArr, 9);
                    byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                    byteBufferOrder.get();
                    byteBufferOrder.get();
                    if ((byteBufferOrder.getShort() & HPKE.aead_EXPORT_ONLY) == 5) {
                        throw new UnsupportedOperationException("ZipEntry LZMA should have size 5 in header: " + c12107.getName());
                    }
                    if ((c12107.m30131() & 2) != 0) {
                        size = -1;
                    } else {
                        size = c12107.getSize();
                    }
                    bufferedInputStream = new C18497(c12107, bufferedInputStream, size, byteBufferOrder.get(), byteBufferOrder.getInt());
                } else if (iM30119 != 36) {
                    c3161 = new C21319(c12107, bufferedInputStream);
                } else if (iM30119 != 93) {
                    c3161 = new C19203(c12107, bufferedInputStream);
                } else if (iM30119 != 95) {
                    c3161 = new C7914(c12107, bufferedInputStream);
                } else if (iM30119 != 8) {
                    c3161 = new C13559(c12107, bufferedInputStream, z2);
                } else {
                    if (iM30119 == 9) {
                        throw new IOException("Unsupported compression method " + c12107.m30119() + " (" + c12107.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    c3161 = new C11442(c12107, bufferedInputStream);
                }
                bufferedInputStream = c3161;
            }
            if (z && iM30119 != 0) {
                bufferedInputStream = new BufferedInputStream(bufferedInputStream, 65536);
            }
            if (z2) {
                return new C1750(c12107, bufferedInputStream, c8101, z3);
            }
            return (this.f9784 && z3) ? new C23624(c12107, bufferedInputStream) : bufferedInputStream;
        }
        c5984 = new C5984(this.f9782, jM30099, (iM30119 != 0 || z2) ? c12107.m30138() : c12107.getSize(), z2);
        bufferedInputStream = c5984;
        c8101 = 0;
        if (iM30119 != 0) {
            if (iM30119 != 12) {
                c3161 = new C3161(c12107, bufferedInputStream);
            } else if (iM30119 != 14) {
                int i2 = C18497.f58937;
                byte[] bArr2 = new byte[9];
                C20010.m45306(bufferedInputStream, bArr2, 9);
                byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                byteBufferOrder.get();
                byteBufferOrder.get();
                if ((byteBufferOrder.getShort() & HPKE.aead_EXPORT_ONLY) == 5) {
                    throw new UnsupportedOperationException("ZipEntry LZMA should have size 5 in header: " + c12107.getName());
                }
                if ((c12107.m30131() & 2) != 0) {
                    size = -1;
                } else {
                    size = c12107.getSize();
                }
                bufferedInputStream = new C18497(c12107, bufferedInputStream, size, byteBufferOrder.get(), byteBufferOrder.getInt());
            } else if (iM30119 != 36) {
                c3161 = new C21319(c12107, bufferedInputStream);
            } else if (iM30119 != 93) {
                c3161 = new C19203(c12107, bufferedInputStream);
            } else if (iM30119 != 95) {
                c3161 = new C7914(c12107, bufferedInputStream);
            } else if (iM30119 != 8) {
                c3161 = new C13559(c12107, bufferedInputStream, z2);
            } else {
                if (iM30119 == 9) {
                    throw new IOException("Unsupported compression method " + c12107.m30119() + " (" + c12107.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                c3161 = new C11442(c12107, bufferedInputStream);
            }
            bufferedInputStream = c3161;
        }
        if (z) {
            bufferedInputStream = new BufferedInputStream(bufferedInputStream, 65536);
        }
        if (z2) {
            return new C1750(c12107, bufferedInputStream, c8101, z3);
        }
        if (this.f9784) {
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] m7491(C12107 c12107) {
        if (c12107.getSize() > 20971520) {
            try {
                InputStream inputStreamM7444 = m7444(c12107, true, false);
                try {
                    byte[] bArrM44469 = C19431.m44469(c12107.getSize(), inputStreamM7444);
                    inputStreamM7444.close();
                    return bArrM44469;
                } catch (Throwable th) {
                    try {
                        inputStreamM7444.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception unused) {
                return m7475(c12107, (C8516) null);
            }
        }
        return m7475(c12107, (C8516) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m7475(C12107 c12107, C8516 c8516) throws IOException {
        int size = (int) c12107.getSize();
        byte[] bArr = new byte[size];
        int i = 0;
        InputStream inputStreamM7444 = m7444(c12107, true, false);
        while (i < size) {
            try {
                int i2 = inputStreamM7444.read(bArr, i, size - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
                if (c8516 != null) {
                    c8516.m22242(i2);
                }
            } catch (Throwable th) {
                try {
                    inputStreamM7444.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i != size || inputStreamM7444.read() != -1) {
            throw new IOException("The length of data has been read is incorrect. (" + c12107.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        inputStreamM7444.close();
        return bArr;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2455 m7476(C12107 c12107) throws IOException {
        if (c12107.m30119() != 0) {
            throw new IOException("Entry is not stored: " + c12107.getName());
        }
        return new C2455(this.f9782.mo4868(c12107.m30099(), c12107.m30138()), null, true, null, null);
    }

    public final String getName() {
        InterfaceC7739 interfaceC7739 = this.f9782;
        if (interfaceC7739 == null) {
            return null;
        }
        return interfaceC7739.getName();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m7472(boolean z) throws IOException {
        String strM7461 = m7461(1);
        C12107 entry = getEntry(strM7461);
        if (entry == null) {
            if (z) {
                return Collections.EMPTY_LIST;
            }
            StringBuilder sbM30914 = C12441.m30914("Entry not found: ", strM7461, "\n(");
            sbM30914.append(this.f9782.getName());
            sbM30914.append(MotionUtils.EASING_TYPE_FORMAT_END);
            throw new IOException(sbM30914.toString());
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (entry != null) {
            arrayList.add(entry);
            i++;
            entry = getEntry(m7461(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m7461(int i) {
        if (i > 0) {
            return i == 1 ? "classes.dex" : C2271.m6966(i, "classes", ".dex");
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: IOException -> 0x0123, TryCatch #2 {IOException -> 0x0123, blocks: (B:28:0x007d, B:30:0x0082, B:32:0x00c0, B:36:0x00dc, B:31:0x0094), top: B:72:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0094 A[Catch: IOException -> 0x0123, TryCatch #2 {IOException -> 0x0123, blocks: (B:28:0x007d, B:30:0x0082, B:32:0x00c0, B:36:0x00dc, B:31:0x0094), top: B:72:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:45:0x0109 A[Catch: IOException -> 0x0126, TRY_LEAVE, TryCatch #1 {IOException -> 0x0126, blocks: (B:41:0x00fa, B:45:0x0109), top: B:70:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0110  */
    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x011e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private C13746 m7458() throws IOException {
        long j;
        String str;
        String str2;
        long j2;
        String str3;
        boolean z;
        int i;
        long jM7459;
        long jM74510;
        long j3;
        int i2;
        long j4;
        int iM7441;
        C13746 c13746;
        long j5;
        String str4;
        C13746 c13746M7450;
        String str5;
        long length = this.f9782.length();
        long jMax = Math.max(0L, length - 65557);
        C13746 c13747 = null;
        long j6 = length - 22;
        String str6 = null;
        String str7 = null;
        while (true) {
            boolean z2 = this.f9778;
            if (j6 < jMax) {
                String str8 = str6;
                String str9 = str7;
                if (c13747 == null) {
                    return null;
                }
                if (z2) {
                    throw new IOException(str9);
                }
                m7463(str9);
                this.f9785 = str8;
                return c13747;
            }
            m7462(j6);
            if (m7460() != 101010256) {
                j6--;
            } else if (j6 > 20) {
                try {
                    m7462(j6 - 20);
                    if (m7460() == 117853008) {
                        int iM7460 = m7460();
                        long jM7464 = m7464();
                        int iM7461 = m7460();
                        if (z2 && (iM7460 != 0 || iM7461 != 1)) {
                            throw new IOException("Split ZIP archives are not supported");
                        }
                        j = jM7464;
                    } else {
                        j = -1;
                    }
                    str3 = str6;
                    long j7 = j6 + 4;
                    if (j != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    try {
                        m7462(j7);
                        if (z) {
                            m7442(16L);
                            j4 = -1;
                            jM74510 = -1;
                            j3 = -1;
                            jM7459 = -1;
                            i2 = -1;
                            i = -1;
                        } else {
                            int iM7442 = m7441();
                            int iM7443 = m7441();
                            long jM7441 = m7441();
                            long jM7442 = m7441();
                            i = iM7443;
                            jM7459 = m7459();
                            jM74510 = m7459();
                            j3 = jM7442;
                            i2 = iM7442;
                            j4 = jM7441;
                        }
                        iM7441 = m7441();
                        c13746 = new C13746(i2, i, j4, jM74510, j3, jM7459, j6, iM7441, false);
                        j5 = j6 + 22 + ((long) iM7441);
                        if (iM7441 > 0 || j5 > length) {
                            str4 = null;
                        } else {
                            str4 = new String(m7456(iM7441), StandardCharsets.UTF_8);
                        }
                        if (j != -1) {
                            str = str3;
                            long j8 = j;
                            str2 = str7;
                            j2 = j6;
                            try {
                                c13746M7450 = m7450(j8, iM7441, j6);
                            } catch (IOException unused) {
                                str6 = str;
                                j6 = j2 - 1;
                                str7 = str2;
                            }
                        } else {
                            str = str3;
                            str2 = str7;
                            j2 = j6;
                            c13746M7450 = c13746;
                        }
                        if (j5 == length) {
                            this.f9785 = str4;
                            return c13746M7450;
                        }
                        if (c13747 == null) {
                            if (j5 > length) {
                                str5 = "ZIP end of central directory comment is truncated";
                            } else {
                                str5 = "ZIP end of central directory does not terminate the archive";
                            }
                            str7 = str5;
                            c13747 = c13746M7450;
                            str6 = str4;
                        } else {
                            str7 = str2;
                            str6 = str;
                        }
                        j6 = j2 - 1;
                    } catch (IOException unused2) {
                        str = str3;
                        str2 = str7;
                        j2 = j6;
                        str6 = str;
                        j6 = j2 - 1;
                        str7 = str2;
                    }
                } catch (IOException unused3) {
                    str = str6;
                    str2 = str7;
                    j2 = j6;
                    str6 = str;
                    j6 = j2 - 1;
                    str7 = str2;
                }
            } else {
                j = -1;
                str3 = str6;
                long j9 = j6 + 4;
                if (j != -1) {
                    z = true;
                } else {
                    z = false;
                }
                m7462(j9);
                if (z) {
                    m7442(16L);
                    j4 = -1;
                    jM74510 = -1;
                    j3 = -1;
                    jM7459 = -1;
                    i2 = -1;
                    i = -1;
                } else {
                    int iM7444 = m7441();
                    int iM7445 = m7441();
                    long jM7443 = m7441();
                    long jM7444 = m7441();
                    i = iM7445;
                    jM7459 = m7459();
                    jM74510 = m7459();
                    j3 = jM7444;
                    i2 = iM7444;
                    j4 = jM7443;
                }
                iM7441 = m7441();
                c13746 = new C13746(i2, i, j4, jM74510, j3, jM7459, j6, iM7441, false);
                j5 = j6 + 22 + ((long) iM7441);
                if (iM7441 > 0) {
                    str4 = null;
                } else {
                    str4 = null;
                }
                if (j != -1) {
                    str = str3;
                    long j10 = j;
                    str2 = str7;
                    j2 = j6;
                    c13746M7450 = m7450(j10, iM7441, j6);
                } else {
                    str = str3;
                    str2 = str7;
                    j2 = j6;
                    c13746M7450 = c13746;
                }
                if (j5 == length) {
                    this.f9785 = str4;
                    return c13746M7450;
                }
                if (c13747 == null) {
                    if (j5 > length) {
                        str5 = "ZIP end of central directory comment is truncated";
                    } else {
                        str5 = "ZIP end of central directory does not terminate the archive";
                    }
                    str7 = str5;
                    c13747 = c13746M7450;
                    str6 = str4;
                } else {
                    str7 = str2;
                    str6 = str;
                }
                j6 = j2 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m7462(long j) {
        this.f9782.seek(j);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m7442(long j) throws IOException {
        if (j < 0) {
            throw new IOException(C15489.m37074(j, "Skip "));
        }
        long filePointer = this.f9782.getFilePointer() + j;
        if (filePointer > this.f9782.length()) {
            throw new EOFException();
        }
        this.f9782.seek(filePointer);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m7456(int i) {
        byte[] bArr = new byte[i];
        this.f9782.readFully(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private int m7460() throws EOFException {
        int i = this.f9782.read();
        int i2 = this.f9782.read();
        int i3 = this.f9782.read();
        int i4 = this.f9782.read();
        if ((i | i2 | i3 | i4) >= 0) {
            return i | (i2 << 8) | (i3 << 16) | (i4 << 24);
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m7441() throws EOFException {
        int i = this.f9782.read();
        int i2 = this.f9782.read();
        if ((i | i2) >= 0) {
            return i | (i2 << 8);
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private long m7459() {
        return ((long) m7460()) & 4294967295L;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private long m7464() {
        return m7459() | (m7459() << 32);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m7473();
        if (this.f9776) {
            return;
        }
        this.f9782.close();
        this.f9776 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7473() {
        List list = this.f9774;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20010.m45299((C2455) it.next());
        }
        list.clear();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC7739 m7467() {
        return this.f9782;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22212 m7483() {
        return new C22212(this);
    }
}
