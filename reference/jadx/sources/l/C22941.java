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

/* JADX INFO: renamed from: l.᩸ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes.dex */
public final class C22941 implements Closeable {

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final C10238 f74522 = new C10238(0);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC17713 f74523;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f74524;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f74525;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f74526;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f74527;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f74528;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f74529;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f74530;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f74531;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final boolean f74532;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f74533;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f74534;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f74535;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Charset f74536;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public String f74537;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f74538;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f74539;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public List f74540;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C22941 m51747() {
        C22941 c22941;
        if (this.f74524) {
            throw new IOException("Closed");
        }
        c22941 = new C22941(this.f74523.mo34035(), null, false, null, null);
        c22941.f74539 = this.f74539;
        c22941.f74538 = this.f74538;
        c22941.f74526 = this.f74526;
        c22941.f74529 = this.f74529;
        c22941.f74535 = this.f74535;
        this.f74531.add(c22941);
        return c22941;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22941 m51705(AbstractC22044 abstractC22044, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new C22941(abstractC22044.m49855("r"), null, false, null, null);
        }
        AbstractC22044 abstractC22044M49856 = abstractC22044.m49856();
        C20348 c20348 = new C20348(bArr);
        int i = c20348.readInt();
        AbstractC22044[] abstractC22044Arr = new AbstractC22044[i];
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            abstractC22044Arr[i2] = abstractC22044M49856.m49876(c20348.m46758());
            jArr[i2] = c20348.readLong();
        }
        return new C22941(C11746.m29495(C20697.m47332(abstractC22044.getName(), jArr, new C7256(0, abstractC22044Arr))), null, false, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m51712(AbstractC22044 abstractC22044) {
        AbstractC22044 abstractC22044M49858 = abstractC22044.m49858();
        C11006 c11006M51700 = m51700(abstractC22044M49858, abstractC22044.getName());
        if (c11006M51700 != null) {
            return c11006M51700.f34769;
        }
        C13961 c13961M49855 = abstractC22044.m49855("r");
        try {
            C22941 c22941 = new C22941(c13961M49855, null, false, null, null);
            try {
                c22941.m51708(abstractC22044M49858, (InterfaceC19189) null, true);
                byte[] bArr = c22941.f74539;
                c22941.close();
                return bArr;
            } catch (Throwable th) {
                try {
                    c22941.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | RuntimeException e) {
            C20244.m46520(c13961M49855);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22941 m51703(AbstractC22044 abstractC22044, Charset charset) {
        return new C22941(abstractC22044.m49855("r"), abstractC22044.m49858(), true, charset, null, true, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51709(byte[] bArr, int[] iArr) {
        int iM8273 = C2448.m8273(bArr.length, bArr);
        if (iM8273 == C2448.f7850) {
            for (byte b : bArr) {
                if (b <= 0) {
                    iArr[iM8273] = iArr[iM8273] + 1;
                    return;
                }
            }
            int i = C2448.f7850;
            iArr[i] = iArr[i] + 1;
            int i2 = C2448.f7860;
            iArr[i2] = iArr[i2] + 1;
            int i3 = C2448.f7863;
            iArr[i3] = iArr[i3] + 1;
            int i4 = C2448.f7856;
            iArr[i4] = iArr[i4] + 1;
            return;
        }
        iArr[iM8273] = iArr[iM8273] + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22941 m51704(AbstractC22044 abstractC22044, boolean z) {
        C13961 c13961M49855 = abstractC22044.m49855("r");
        try {
            C22941 c22941 = new C22941(c13961M49855, null, false, null, null, z, false);
            C22195 c22195M51713 = c22941.m51713();
            if (c22195M51713 != null && (c22195M51713.f71521 != 0 || c22195M51713.f71519 != 0 || c22195M51713.f71518 != c22195M51713.f71517)) {
                throw new IOException("Split ZIP archives are not supported");
            }
            c22941.m51708((AbstractC22044) null, (InterfaceC19189) null, false);
            return c22941;
        } catch (IOException | RuntimeException e) {
            C20244.m46520(c13961M49855);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22941 m51702(C13961 c13961, C12669 c12669) {
        try {
            return new C22941(c13961, null, true, null, c12669, false, true);
        } catch (IOException | RuntimeException e) {
            C20244.m46520(c13961);
            throw e;
        }
    }

    public C22941(String str) {
        this(str, (InterfaceC19189) null, 0);
    }

    public C22941(AbstractC22044 abstractC22044) {
        this(abstractC22044, (Charset) null, (InterfaceC19189) null);
    }

    public C22941(AbstractC22044 abstractC22044, Charset charset) {
        this(abstractC22044, charset, (InterfaceC19189) null);
    }

    public C22941(String str, InterfaceC19189 interfaceC19189) {
        this(str, interfaceC19189, 0);
    }

    public C22941(AbstractC22044 abstractC22044, C14483 c14483) {
        this(abstractC22044, (Charset) null, c14483);
    }

    public C22941(String str, InterfaceC19189 interfaceC19189, int i) {
        this(C14584.m35193(str, new String[0]), (Charset) null, interfaceC19189);
    }

    public C22941(AbstractC22044 abstractC22044, Charset charset, InterfaceC19189 interfaceC19189) {
        this(abstractC22044.m49855("r"), abstractC22044.m49858(), true, charset, interfaceC19189);
    }

    public C22941(InterfaceC17713 interfaceC17713, AbstractC22044 abstractC22044, boolean z, Charset charset, InterfaceC19189 interfaceC19189) {
        this(interfaceC17713, abstractC22044, z, charset, interfaceC19189, false, false);
    }

    public C22941(InterfaceC17713 interfaceC17713, AbstractC22044 abstractC22044, boolean z, Charset charset, InterfaceC19189 interfaceC19189, boolean z2, boolean z3) throws IOException {
        this.f74525 = new LinkedHashMap();
        List list = Collections.EMPTY_LIST;
        this.f74534 = list;
        this.f74540 = list;
        this.f74526 = "";
        this.f74524 = false;
        this.f74531 = C1402.m5127();
        this.f74532 = z2;
        this.f74528 = z3;
        this.f74523 = interfaceC17713;
        this.f74536 = charset;
        this.f74538 = C16973.m40025(interfaceC17713.getName().toLowerCase());
        if (z) {
            final C11006 c11006M51700 = m51700(abstractC22044, this.f74523.getName());
            if (c11006M51700 != null) {
                InterfaceC15475 interfaceC15475Mo34028 = this.f74523.mo34028();
                C20697 c20697M47332 = C20697.m47332(c11006M51700.f34768, c11006M51700.f34770.m32835(), new InterfaceC3543() { // from class: l.֨ܺܺ
                    @Override // l.InterfaceC3543
                    /* JADX INFO: renamed from: ᩷ */
                    public final InterfaceC15475 mo1860(int i) {
                        return ((AbstractC22044) c11006M51700.f34772.get(i)).mo4276("r");
                    }
                });
                c20697M47332.m47338(c11006M51700.f34771, interfaceC15475Mo34028);
                this.f74523 = C11746.m29495(c20697M47332);
                this.f74539 = c11006M51700.f34769;
            }
            m51708(abstractC22044, interfaceC19189, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11006 m51700(AbstractC22044 abstractC22044, String str) {
        if (abstractC22044 == null || !str.matches("(?i)(?s).*\\.zip\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C21982 c21982 = new C21982();
        int i = Integer.parseInt(str.substring(str.length() - 3));
        String strM5124 = C1402.m5124(3, 0, str);
        for (int i2 = 1; i2 <= 999; i2++) {
            AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(String.format(Locale.ENGLISH, "%s%03d", strM5124, Integer.valueOf(i2)));
            if (!abstractC22044M49876.mo4304()) {
                if (i2 >= i) {
                    break;
                }
                arrayList.clear();
                c21982.clear();
                break;
            }
            c21982.add(abstractC22044M49876.mo4285());
            arrayList.add(abstractC22044M49876);
        }
        int size = c21982.size();
        if (size <= 1) {
            return null;
        }
        arrayList.trimToSize();
        c21982.m49717();
        C6178 c6178 = new C6178();
        c6178.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            c6178.m17800(((AbstractC22044) arrayList.get(i3)).getName());
            c6178.m17803(c21982.getLong(i3));
        }
        return new C11006(str, i - 1, arrayList, c21982, c6178.m17796());
    }

    public final C8002 getEntry(String str) {
        return (C8002) this.f74525.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8002 m51724(String str) throws IOException {
        C8002 c8002 = (C8002) this.f74525.get(str);
        if (c8002 != null) {
            return c8002;
        }
        StringBuilder sbM51387 = C22783.m51387("Entry not found: ", str, "\n(");
        sbM51387.append(this.f74523.getName());
        sbM51387.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IOException(sbM51387.toString());
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Map m51739() {
        return C4681.unmodifiableMap(this.f74525);
    }

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public final Collection m51742() {
        return C4681.unmodifiableCollection(this.f74525.values());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m51734() throws IOException {
        if (!this.f74532) {
            throw new IllegalStateException("ZIP was not opened for testing");
        }
        if (this.f74537 != null) {
            throw new IOException(this.f74537);
        }
        if (this.f74527) {
            throw new IOException("ZIP central directory contains an unreadable local file header");
        }
        for (C5041 c5041 : this.f74540) {
            boolean z = true;
            boolean z2 = c5041.f17463 >= 0 && (m51710(c5041, true, c5041.f17460) || m51710(c5041, false, c5041.f17460));
            if (!z2 && c5041.f17458) {
                if (!m51710(c5041, true, false) && !m51710(c5041, false, false)) {
                    z = false;
                }
                z2 = z;
            }
            if (!z2) {
                throw new IOException("ZIP data descriptor does not match central directory");
            }
        }
        return this.f74534;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m51720(String str) {
        if (this.f74532 && this.f74537 == null) {
            this.f74537 = str;
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final byte[] m51744() {
        return this.f74539;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m51740() {
        ArrayList arrayList = new ArrayList(this.f74525.values());
        Collections.sort(arrayList, f74522);
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m51749() {
        return this.f74525.size();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m51725() {
        return this.f74526;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51730(String str) {
        if (str == null) {
            str = "";
        }
        this.f74526 = str;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m51732() {
        return this.f74530;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m51745() {
        return this.f74526.isEmpty();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m51736() {
        return this.f74538;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m51726() {
        return this.f74529;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m51737() throws IOException {
        if (!this.f74529) {
            throw new IllegalStateException();
        }
        m51719(this.f74535);
        C6178 c6178 = new C6178();
        long jM51717 = m51717() - 24;
        while (jM51717 > 0) {
            int iM51717 = (int) m51717();
            jM51717 -= (long) (iM51717 + 8);
            if (jM51717 >= 0) {
                int iM51714 = m51714();
                if (iM51714 != 1114793335) {
                    c6178.m17803(iM51717);
                    c6178.writeInt(iM51714);
                    byte[] bArrM51711 = m51711(iM51717 - 4);
                    c6178.write(bArrM51711, 0, bArrM51711.length);
                } else {
                    m51721(iM51717 - 4);
                }
            }
        }
        return c6178.m17796();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m51741() {
        return this.f74533;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:320:0x0688  */
    /* JADX WARN: Code duplicated, block: B:329:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:337:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:356:0x0708  */
    /* JADX WARN: Code duplicated, block: B:358:0x0711 A[Catch: EOFException -> 0x071e, TRY_LEAVE, TryCatch #5 {EOFException -> 0x071e, blocks: (B:357:0x070a, B:358:0x0711), top: B:479:0x070a }] */
    /* JADX WARN: Code duplicated, block: B:515:0x0775 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x0766 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0130  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51708(AbstractC22044 abstractC22044, InterfaceC19189 interfaceC19189, boolean z) throws IOException {
        long j;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        long j4;
        C20697 c20697;
        long jM47339;
        long j5;
        ArrayList<C8002> arrayList;
        HashSet hashSet;
        Set set;
        ArrayList arrayList2;
        Charset charset;
        C20697 c20698;
        boolean z4;
        IdentityHashMap identityHashMap;
        ArrayList arrayList3;
        long j6;
        long jM51698;
        int i;
        int i2;
        int i3;
        byte[] bArrM51711;
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
        long jM21838;
        long j8;
        C22941 c22941 = this;
        C22195 c22195M51713 = m51713();
        if (c22195M51713 == null && abstractC22044 != null && c22941.f74539 == null && c22941.f74523.getName().matches("(?i)(?s).*\\.z(?:0[1-9]|[1-9][0-9]+)")) {
            String name = c22941.f74523.getName();
            AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(name.substring(0, name.length() - 3) + "zip");
            if (abstractC22044M49876.mo4304()) {
                InterfaceC17713 interfaceC17713 = c22941.f74523;
                try {
                    c22941.f74523 = abstractC22044M49876.m49855("r");
                    c22195M51713 = m51713();
                    if (c22195M51713 == null) {
                        C5125.m15494(c22941.f74523);
                        c22941.f74523 = interfaceC17713;
                    } else if (z) {
                        C5125.m15494(interfaceC17713);
                    }
                } catch (IOException unused) {
                    InterfaceC17713 interfaceC17714 = c22941.f74523;
                    if (interfaceC17714 != interfaceC17713) {
                        C5125.m15494(interfaceC17714);
                        c22941.f74523 = interfaceC17713;
                    }
                }
            }
        }
        boolean z7 = c22941.f74528;
        if (c22195M51713 != null) {
            boolean z8 = c22195M51713.f71515;
            long j9 = c22195M51713.f71516;
            int i6 = c22195M51713.f71519;
            int i7 = c22195M51713.f71521;
            long j10 = c22195M51713.f71520;
            long j11 = c22195M51713.f71514;
            long j12 = j10;
            long j13 = c22195M51713.f71517;
            if (z7 && (i7 != 0 || i6 != 0 || c22195M51713.f71518 != j13)) {
                throw new IOException("Split ZIP archives are not supported");
            }
            boolean z9 = abstractC22044 != null && i7 > 0 && c22941.f74539 == null && c22941.f74523.getName().toLowerCase().endsWith(".zip");
            if (!z || z9) {
                if (z7 || z9 || j11 < 32) {
                    j = j13;
                } else {
                    c22941.m51719(j11 - 16);
                    if (c22941.f74523.available() >= 16 && m51717() == 2334950737559900225L && m51717() == 3617552046287187010L) {
                        c22941.m51719(j11 - 24);
                        long jM51717 = m51717();
                        j = j13;
                        long j14 = (j11 - jM51717) - 8;
                        c22941.m51719(j14);
                        if (m51717() == jM51717) {
                            c22941.f74529 = true;
                            c22941.f74535 = j14;
                        }
                    } else {
                        j = j13;
                    }
                }
                if (z9) {
                    String strM20779 = C7605.m20779(c22941.f74523.getName());
                    int i8 = i7 + 1;
                    AbstractC22044[] abstractC22044Arr = new AbstractC22044[i8];
                    long[] jArr = new long[i8];
                    int i9 = 0;
                    while (i9 < i7) {
                        boolean z10 = z8;
                        Locale locale = Locale.ENGLISH;
                        int i10 = i9 + 1;
                        long j15 = j12;
                        boolean z11 = z7;
                        AbstractC22044 abstractC22044M49877 = abstractC22044.m49876(String.format(locale, "%s.z%02d", strM20779, Integer.valueOf(i10)));
                        if (abstractC22044M49877.mo4304()) {
                            abstractC22044Arr[i9] = abstractC22044M49877;
                            jArr[i9] = abstractC22044M49877.mo4285();
                        } else {
                            AbstractC22044 abstractC22044M49878 = abstractC22044.m49876(String.format(locale, "%s.Z%02d", strM20779, Integer.valueOf(i10)));
                            if (!abstractC22044M49878.mo4304()) {
                                throw new FileNotFoundException(abstractC22044M49877.getName());
                            }
                            abstractC22044Arr[i9] = abstractC22044M49878;
                            jArr[i9] = abstractC22044M49878.mo4285();
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
                    abstractC22044Arr[i7] = abstractC22044.m49876(c22941.f74523.getName());
                    jArr[i7] = c22941.f74523.length();
                    C6178 c6178M34975 = C14483.m34975(i8);
                    for (int i11 = 0; i11 <= i7; i11++) {
                        c6178M34975.m17800(abstractC22044Arr[i11].getName());
                        c6178M34975.m17803(jArr[i11]);
                    }
                    c22941.f74539 = c6178M34975.m17796();
                    if (!z) {
                        InterfaceC15475 interfaceC15475Mo34028 = c22941.f74523.mo34028();
                        C20697 c20697M47332 = C20697.m47332(interfaceC15475Mo34028.getName(), jArr, new C9492(0, abstractC22044Arr));
                        c20697M47332.m47338(i7, interfaceC15475Mo34028);
                        c22941.f74523 = C11746.m29495(c20697M47332);
                        long jM473310 = c20697M47332.m47339(i6) + j11;
                        jM47339 = c20697M47332.m47339(i7) + j16;
                        c22941.m51719(jM473310);
                        c20697 = c20697M47332;
                        j11 = jM473310;
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
                                c22941.m51719(j5);
                                if (c22941.f74523.available() < 46 || m51714() != 33639248) {
                                    j5 = j11;
                                } else {
                                    c22941.m51719(42 + j5);
                                    long jM51699 = m51698();
                                    long j17 = j5 - j11;
                                    if (jM51699 == 4294967295L || jM51699 > C25227.FOREVER_NS - j17) {
                                        j5 = j11;
                                    } else {
                                        c22941.m51719(jM51699 + j17);
                                        if (c22941.f74523.available() < 4 || m51714() != 67324752) {
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
                    c22941.m51719(j11);
                    j4 = j3;
                    c20697 = null;
                    jM47339 = j9;
                }
                String str = "ZIP central directory size does not match EOCD";
                boolean z12 = c22941.f74532;
                if ((z12 || z3) && (j < 0 || j2 < 0 || jM47339 < j11 || jM47339 - j11 != j2)) {
                    c22941.m51722("ZIP central directory size does not match EOCD");
                }
                if (z3 && j == 0 && j2 == 0) {
                    c22941.f74533 = z2;
                    return;
                }
                boolean z13 = z2;
                String str2 = "ZIP central directory entry count does not match EOCD";
                if (c22941.f74523.available() <= 50 || m51714() != 33639248) {
                    if (z3) {
                        throw new IOException("ZIP central directory could not be parsed");
                    }
                    if (z12 && (j != 0 || j2 != 0)) {
                        c22941.m51720("ZIP central directory could not be parsed");
                    }
                    c22941.m51707(interfaceC19189, true);
                    if (z12 && interfaceC19189 == null && c22941.f74534.size() != j) {
                        c22941.m51720("ZIP central directory entry count does not match EOCD");
                        return;
                    }
                    return;
                }
                c22941.f74533 = z13;
                ArrayList arrayList5 = new ArrayList();
                IdentityHashMap identityHashMap2 = (z12 || z3) ? new IdentityHashMap() : null;
                Set setNewSetFromMap = z12 ? Collections.newSetFromMap(new IdentityHashMap()) : null;
                ArrayList arrayList6 = z12 ? new ArrayList() : null;
                int i12 = C2448.f7865;
                int[] iArr = new int[i12];
                int i13 = 50000;
                ArrayList arrayList7 = arrayList6;
                long j18 = 0;
                long filePointer = 0;
                while (true) {
                    C8002 c8002 = new C8002();
                    int i14 = i12;
                    c8002.m21812((m51715() >> 8) & 15);
                    m51715();
                    c8002.m21845(m51715());
                    c8002.m21837(m51715());
                    String str3 = str;
                    c8002.setTime(C17719.m41494(m51698()));
                    c8002.m21817(m51714());
                    c8002.m21818(m51698());
                    c8002.m21854(m51698());
                    int iM51715 = m51715();
                    int iM51716 = m51715();
                    long j19 = j11;
                    int iM51717 = m51715();
                    int iM51718 = m51715();
                    String str4 = str2;
                    c8002.m21839(m51715());
                    c8002.m21853(m51714());
                    if (z9) {
                        c8002.m21832(c20697.m47339(iM51718) + m51698());
                    } else {
                        c8002.m21832(m51698());
                    }
                    boolean zM21810 = c8002.m21810();
                    byte[] bArrM51712 = c22941.m51711(iM51715);
                    Charset charsetM8272 = c22941.f74536;
                    if (interfaceC19189 == null || interfaceC19189.mo30502(bArrM51712)) {
                        if (!zM21810 && i13 > 0 && charsetM8272 == null) {
                            m51709(bArrM51712, iArr);
                            i13--;
                        }
                        int i15 = i13;
                        c8002.m21855(bArrM51712);
                        if (z12 || z3) {
                            identityHashMap2.put(c8002, bArrM51712);
                        }
                        if (iM51716 > 0) {
                            byte[] bArrM51713 = c22941.m51711(iM51716);
                            if (c8002.m21846(bArrM51713)) {
                                bArrM51713 = C24411.m54601(1, bArrM51713);
                                if (z12) {
                                    setNewSetFromMap.add(c8002);
                                }
                            }
                            c8002.m21824(bArrM51713);
                        }
                        if (j4 != 0) {
                            long jM21842 = c8002.m21842();
                            if (jM21842 < 0 || jM21842 > C25227.FOREVER_NS - j4) {
                                c22941.m51720("ZIP local file header offset overflows archive bounds");
                                c8002.m21832(c22941.f74523.length());
                            } else {
                                c8002.m21832(jM21842 + j4);
                            }
                        }
                        if (iM51717 > 0) {
                            try {
                                byte[] bArrM51714 = c22941.m51711(iM51717);
                                if (!zM21810 && i15 > 0 && charsetM8272 == null) {
                                    m51709(bArrM51714, iArr);
                                    i15--;
                                }
                                c8002.m21852(bArrM51714);
                            } catch (IOException e) {
                                if (z3) {
                                    throw e;
                                }
                            }
                        }
                        arrayList = arrayList5;
                        arrayList.add(c8002);
                        i13 = i15;
                    } else {
                        c22941.m51721(iM51716 + iM51717);
                        arrayList = arrayList5;
                    }
                    if (z12 || z3) {
                        j18++;
                        filePointer = c22941.f74523.getFilePointer();
                    }
                    long j20 = filePointer;
                    if (m51714() != 33639248) {
                        if (z12 || z3) {
                            if (j18 != j) {
                                c22941.m51722(str4);
                            }
                            if (j20 < j19 || j2 < 0) {
                                c22941.m51722(str3);
                            } else {
                                long j21 = j2 - (j20 - j19);
                                if (j21 != 0) {
                                    if (j21 < 6) {
                                        c22941.m51722("ZIP central directory size does not match parsed records");
                                    } else {
                                        try {
                                            c22941.m51719(j20);
                                            if (m51714() != 84233040) {
                                                c22941.m51722("ZIP central directory size does not match parsed records");
                                            } else {
                                                int iM51719 = m51715();
                                                if (j21 != ((long) iM51719) + 6 || c22941.f74523.available() < iM51719) {
                                                    c22941.m51722("ZIP central directory digital signature is truncated");
                                                }
                                            }
                                        } catch (IOException e2) {
                                            if (z3) {
                                                throw e2;
                                            }
                                            c22941.m51720("ZIP central directory is truncated");
                                        }
                                    }
                                }
                            }
                        }
                        Charset charset4 = StandardCharsets.UTF_8;
                        if (charsetM8272 == null) {
                            int i16 = C2448.f7850;
                            for (int i17 = 0; i17 < i14; i17++) {
                                if (i17 != i16 && iArr[i17] > iArr[i16]) {
                                    i16 = i17;
                                }
                            }
                            charsetM8272 = C2448.m8272(i16);
                        }
                        Collections.sort(arrayList, new C2781());
                        Set setNewSetFromMap2 = z12 ? Collections.newSetFromMap(new IdentityHashMap(arrayList.size())) : null;
                        HashSet hashSet3 = z12 ? null : new HashSet(arrayList.size());
                        for (C8002 c8003 : arrayList) {
                            try {
                                long jM21843 = c8003.m21842();
                                c22941.m51719(jM21843);
                                if (c22941.f74523.available() < 30 || m51714() != 67324752) {
                                    hashSet = hashSet3;
                                    set = setNewSetFromMap2;
                                    arrayList2 = arrayList;
                                    charset = charset4;
                                    this = c22941;
                                    c20698 = c20697;
                                    z4 = z12;
                                    identityHashMap = identityHashMap2;
                                    arrayList3 = arrayList7;
                                    if (z3) {
                                        throw new IOException("ZIP central directory entry has an unreadable local file header");
                                    }
                                } else {
                                    if (z12) {
                                        m51715();
                                        int iM517110 = m51715();
                                        int iM517111 = m51715();
                                        c22941.m51721(4L);
                                        int iM51714 = m51714();
                                        long jM516910 = m51698();
                                        i = iM517110;
                                        i2 = iM517111;
                                        i3 = iM51714;
                                        jM51698 = m51698();
                                        j6 = jM516910;
                                    } else {
                                        c22941.m51719(26 + jM21843);
                                        j6 = 0;
                                        jM51698 = 0;
                                        i = 0;
                                        i2 = 0;
                                        i3 = 0;
                                    }
                                    int iM517112 = m51715();
                                    int iM517113 = m51715();
                                    if (z12 || z3) {
                                        bArrM51711 = c22941.m51711(iM517112);
                                    } else {
                                        c22941.m51721(iM517112);
                                        bArrM51711 = null;
                                    }
                                    byte[] bArrM51715 = c22941.m51711(iM517113);
                                    if (z12) {
                                        try {
                                            c20698 = c20697;
                                            i4 = iM517113;
                                            i5 = iM517112;
                                            j7 = jM21843;
                                            bArr = bArrM51715;
                                            byte[] bArr2 = bArrM51711;
                                            int i18 = i2;
                                            hashSet2 = hashSet3;
                                            int i19 = i3;
                                            arrayList4 = arrayList7;
                                            set2 = setNewSetFromMap;
                                            set3 = setNewSetFromMap2;
                                            z4 = z12;
                                            identityHashMap = identityHashMap2;
                                            charset2 = charsetM8272;
                                            charset3 = charset4;
                                            arrayList2 = arrayList;
                                            try {
                                                m51706(c8003, (byte[]) identityHashMap2.get(c8003), i, i18, i19, j6, jM51698, bArr2, bArr);
                                            } catch (EOFException e3) {
                                                e = e3;
                                                hashSet = hashSet2;
                                                arrayList3 = arrayList4;
                                                setNewSetFromMap = set2;
                                                set = set3;
                                                charsetM8272 = charset2;
                                                charset = charset3;
                                                if (!z3) {
                                                    throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                }
                                                setNewSetFromMap2 = set;
                                                hashSet3 = hashSet;
                                                charset4 = charset;
                                                arrayList7 = arrayList3;
                                                c22941 = this;
                                                identityHashMap2 = identityHashMap;
                                                z12 = z4;
                                                arrayList = arrayList2;
                                                c20697 = c20698;
                                            }
                                        } catch (EOFException e4) {
                                            e = e4;
                                            arrayList4 = arrayList7;
                                            hashSet2 = hashSet3;
                                            set2 = setNewSetFromMap;
                                            set3 = setNewSetFromMap2;
                                            arrayList2 = arrayList;
                                            charset2 = charsetM8272;
                                            charset3 = charset4;
                                            c20698 = c20697;
                                            z4 = z12;
                                            identityHashMap = identityHashMap2;
                                            hashSet = hashSet2;
                                            arrayList3 = arrayList4;
                                            setNewSetFromMap = set2;
                                            set = set3;
                                            charsetM8272 = charset2;
                                            charset = charset3;
                                            if (!z3) {
                                                throw new IOException("ZIP central directory entry local file header is truncated", e);
                                            }
                                            setNewSetFromMap2 = set;
                                            hashSet3 = hashSet;
                                            charset4 = charset;
                                            arrayList7 = arrayList3;
                                            c22941 = this;
                                            identityHashMap2 = identityHashMap;
                                            z12 = z4;
                                            arrayList = arrayList2;
                                            c20697 = c20698;
                                        }
                                    } else {
                                        arrayList4 = arrayList7;
                                        j7 = jM21843;
                                        i5 = iM517112;
                                        bArr = bArrM51715;
                                        byte[] bArr3 = bArrM51711;
                                        hashSet2 = hashSet3;
                                        set2 = setNewSetFromMap;
                                        set3 = setNewSetFromMap2;
                                        arrayList2 = arrayList;
                                        charset2 = charsetM8272;
                                        charset3 = charset4;
                                        c20698 = c20697;
                                        z4 = z12;
                                        i4 = iM517113;
                                        identityHashMap = identityHashMap2;
                                        if (z3 && !Arrays.equals((byte[]) identityHashMap.get(c8003), bArr3)) {
                                            throw new IOException("ZIP local file header name does not match central directory");
                                        }
                                    }
                                    byte[] bArr4 = bArr;
                                    c8003.m21833(C24411.m54601(1, bArr4));
                                    c8003.m21850(j7 + 30 + ((long) i5) + ((long) i4));
                                    if (z4) {
                                        try {
                                            if ((c8003.m21841() & 8) != 0) {
                                                boolean z14 = j6 == 4294967295L || jM51698 == 4294967295L;
                                                try {
                                                    try {
                                                        if (z14) {
                                                            setNewSetFromMap = set2;
                                                        } else {
                                                            setNewSetFromMap = set2;
                                                            try {
                                                                if (!setNewSetFromMap.contains(c8003)) {
                                                                    z5 = false;
                                                                }
                                                                if (z5 || z14 || C24411.m54598(1, bArr4) != null) {
                                                                    z6 = false;
                                                                } else {
                                                                    z6 = true;
                                                                }
                                                                long jM21811 = c8003.m21811();
                                                                jM21838 = c8003.m21838();
                                                                if (jM21838 >= 0 || jM21811 < 0 || jM21811 > C25227.FOREVER_NS - jM21838) {
                                                                    j8 = -1;
                                                                } else {
                                                                    j8 = jM21811 + jM21838;
                                                                }
                                                                arrayList3 = arrayList4;
                                                                arrayList3.add(new C5041(j8, c8003.m21825(), jM21838, c8003.getSize(), z5, z6));
                                                            } catch (EOFException e5) {
                                                                e = e5;
                                                                hashSet = hashSet2;
                                                                arrayList3 = arrayList4;
                                                                set = set3;
                                                                charsetM8272 = charset2;
                                                                charset = charset3;
                                                                if (!z3) {
                                                                    throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                                }
                                                                setNewSetFromMap2 = set;
                                                                hashSet3 = hashSet;
                                                                charset4 = charset;
                                                                arrayList7 = arrayList3;
                                                                c22941 = this;
                                                                identityHashMap2 = identityHashMap;
                                                                z12 = z4;
                                                                arrayList = arrayList2;
                                                                c20697 = c20698;
                                                            }
                                                        }
                                                        arrayList3.add(new C5041(j8, c8003.m21825(), jM21838, c8003.getSize(), z5, z6));
                                                    } catch (EOFException e6) {
                                                        e = e6;
                                                        hashSet = hashSet2;
                                                        set = set3;
                                                        charsetM8272 = charset2;
                                                        charset = charset3;
                                                        if (!z3) {
                                                            throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                        }
                                                        setNewSetFromMap2 = set;
                                                        hashSet3 = hashSet;
                                                        charset4 = charset;
                                                        arrayList7 = arrayList3;
                                                        c22941 = this;
                                                        identityHashMap2 = identityHashMap;
                                                        z12 = z4;
                                                        arrayList = arrayList2;
                                                        c20697 = c20698;
                                                    }
                                                    long jM21812 = c8003.m21811();
                                                    jM21838 = c8003.m21838();
                                                    if (jM21838 >= 0) {
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
                                    if (c8003.m21810()) {
                                        this = this;
                                        try {
                                            charset = charset3;
                                            try {
                                                c8003.m21820(charset, false, this.f74538);
                                                charsetM8272 = charset2;
                                            } catch (EOFException e9) {
                                                e = e9;
                                                hashSet = hashSet2;
                                                set = set3;
                                                charsetM8272 = charset2;
                                                if (!z3) {
                                                    throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                }
                                                setNewSetFromMap2 = set;
                                                hashSet3 = hashSet;
                                                charset4 = charset;
                                                arrayList7 = arrayList3;
                                                c22941 = this;
                                                identityHashMap2 = identityHashMap;
                                                z12 = z4;
                                                arrayList = arrayList2;
                                                c20697 = c20698;
                                            }
                                        } catch (EOFException e10) {
                                            e = e10;
                                            charset = charset3;
                                        }
                                    } else {
                                        this = this;
                                        charset = charset3;
                                        charsetM8272 = charset2;
                                        c8003.m21820(charsetM8272, true, this.f74538);
                                    }
                                    if (!z9) {
                                        try {
                                            if (!this.f74538 && c8003.getName().equals("AndroidManifest.xml")) {
                                                this.f74538 = true;
                                            }
                                            if (z4) {
                                                set = set3;
                                                try {
                                                    set.add(c8003);
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
                                                    hashSet.add(c8003.getName());
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
                                            c22941 = this;
                                            identityHashMap2 = identityHashMap;
                                            z12 = z4;
                                            arrayList = arrayList2;
                                            c20697 = c20698;
                                        }
                                    } else if (z4) {
                                        set = set3;
                                        set.add(c8003);
                                        hashSet = hashSet2;
                                    } else {
                                        set = set3;
                                        hashSet = hashSet2;
                                        hashSet.add(c8003.getName());
                                    }
                                }
                            } catch (EOFException e14) {
                                e = e14;
                                hashSet = hashSet3;
                                set = setNewSetFromMap2;
                                arrayList2 = arrayList;
                                charset = charset4;
                                this = c22941;
                                c20698 = c20697;
                                z4 = z12;
                                identityHashMap = identityHashMap2;
                                arrayList3 = arrayList7;
                            }
                            setNewSetFromMap2 = set;
                            hashSet3 = hashSet;
                            charset4 = charset;
                            arrayList7 = arrayList3;
                            c22941 = this;
                            identityHashMap2 = identityHashMap;
                            z12 = z4;
                            arrayList = arrayList2;
                            c20697 = c20698;
                        }
                        ArrayList arrayList8 = arrayList7;
                        HashSet hashSet4 = hashSet3;
                        Set set4 = setNewSetFromMap2;
                        ArrayList<C8002> arrayList9 = arrayList;
                        C22941 c22942 = c22941;
                        C20697 c20699 = c20697;
                        boolean z15 = z12;
                        LinkedList<C8002> linkedList = new LinkedList();
                        for (C8002 c8004 : arrayList9) {
                            if (z15) {
                                if (set4.contains(c8004)) {
                                    c22942.m51716(c8004);
                                    linkedList.add(c8004);
                                }
                            } else if (hashSet4.contains(c8004.getName())) {
                                c22942.m51716(c8004);
                                linkedList.add(c8004);
                            }
                        }
                        if (z15) {
                            c22942.f74527 = linkedList.size() != arrayList9.size();
                            c22942.f74534 = C4681.unmodifiableList(new ArrayList(linkedList));
                            c22942.f74540 = C4681.unmodifiableList(arrayList8);
                        }
                        ArrayList arrayList10 = new ArrayList();
                        if (c20699 == null) {
                            long length = c22942.f74523.length() / 200;
                            for (C8002 c8005 : linkedList) {
                                if (c8005.m21826() == 0 && !c8005.m21856() && !c8005.isDirectory() && c8005.getSize() > length) {
                                    arrayList10.add(c8005);
                                }
                            }
                        }
                        boolean zIsEmpty = arrayList10.isEmpty();
                        LinkedHashMap linkedHashMap = c22942.f74525;
                        if (zIsEmpty) {
                            for (C8002 c8006 : linkedList) {
                                linkedHashMap.put(c8006.getName(), c8006);
                            }
                            return;
                        }
                        Collections.sort(arrayList10, new C8747(0));
                        int iMin = Math.min(arrayList10.size(), 10);
                        for (int i20 = 0; i20 < iMin; i20++) {
                            C8002 c8007 = (C8002) arrayList10.get(i20);
                            if (!c8007.m21813()) {
                                long jM21813 = c8007.m21811();
                                long jM21839 = c8007.m21838() + jM21813;
                                for (C8002 c8008 : linkedList) {
                                    if (c8008 != c8007 && !c8008.isDirectory() && !c8008.m21813()) {
                                        long jM21814 = c8008.m21811();
                                        long jM218310 = c8008.m21838() + jM21814;
                                        if (jM21813 <= jM21814 && jM218310 <= jM21839) {
                                            c8008.m21822(c8007);
                                        }
                                    }
                                }
                            }
                        }
                        ArrayList<C8002> arrayList11 = new ArrayList();
                        for (C8002 c8009 : linkedList) {
                            if (c8009.m21813()) {
                                arrayList11.add(c8009);
                            } else {
                                linkedHashMap.put(c8009.getName(), c8009);
                            }
                        }
                        for (C8002 c80010 : arrayList11) {
                            linkedHashMap.put(c80010.getName(), c80010);
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
            c22941.m51720("ZIP end of central directory is missing or unreadable");
            c22941.m51707(interfaceC19189, false);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m51722(String str) throws IOException {
        if (this.f74528) {
            throw new IOException(str);
        }
        m51720(str);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00da A[Catch: IOException -> 0x00ee, TryCatch #0 {IOException -> 0x00ee, blocks: (B:22:0x0052, B:42:0x008e, B:44:0x0098, B:46:0x009d, B:48:0x00a3, B:50:0x00ad, B:51:0x00b1, B:53:0x00b7, B:55:0x00bf, B:58:0x00c6, B:64:0x00da, B:60:0x00cc, B:62:0x00d2, B:24:0x005a, B:28:0x0064, B:32:0x0070, B:38:0x007f, B:65:0x00de, B:66:0x00e5, B:67:0x00e6, B:68:0x00ed), top: B:89:0x004c }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51706(C8002 c8002, byte[] bArr, int i, int i2, int i3, long j, long j2, byte[] bArr2, byte[] bArr3) {
        long jM54602;
        long[] jArr;
        int iM21841 = c8002.m21841();
        if (((iM21841 ^ i) & 10367) != 0) {
            m51720("ZIP local file header flags do not match central directory");
        }
        if (c8002.m21826() != i2) {
            m51720("ZIP local file header method does not match central directory");
        }
        int i4 = 0;
        boolean z = ((iM21841 & 8192) == 0 || (i & 8192) == 0) ? false : true;
        if (!z && !Arrays.equals(bArr, bArr2)) {
            m51720("ZIP local file header name does not match central directory");
        }
        try {
            if (j == 4294967295L || j2 == 4294967295L) {
                C24411 c24411M54598 = C24411.m54598(1, bArr3);
                if (c24411M54598 == null) {
                    throw new IOException("Missing ZIP64 local extra data");
                }
                if (j2 == 4294967295L) {
                    jM54602 = c24411M54598.m54602(0);
                    i4 = 8;
                } else {
                    jM54602 = j2;
                }
                long jM54603 = j == 4294967295L ? c24411M54598.m54602(i4) : j;
                if (jM54603 < 0 || jM54602 < 0) {
                    throw new IOException("Unsupported unsigned ZIP64 size");
                }
                jArr = new long[]{jM54603, jM54602};
            } else {
                jArr = new long[]{j, j2};
            }
            if ((iM21841 & 8) == 0) {
                if (jArr[0] != c8002.m21838()) {
                    m51720("ZIP local file header compressed size does not match central directory");
                }
                if (!z && (i3 != c8002.m21825() || jArr[1] != c8002.getSize())) {
                    m51720("ZIP local file header CRC or size does not match central directory");
                }
            } else {
                long j3 = jArr[0];
                if (j3 != 0 && j3 != c8002.m21838()) {
                    m51720("ZIP local file header compressed size does not match central directory");
                }
                if (!z) {
                    if (i3 == 0 || i3 == c8002.m21825()) {
                        long j4 = jArr[1];
                        if (j4 != 0 && j4 != c8002.getSize()) {
                            m51720("ZIP local file header CRC or size does not match central directory");
                        }
                    } else {
                        m51720("ZIP local file header CRC or size does not match central directory");
                    }
                }
            }
        } catch (IOException unused) {
            m51720("ZIP local file header contains invalid ZIP64 sizes");
        }
        if (c8002.m21826() == 99 || i2 == 99) {
            C24411 c24411M54599 = C24411.m54598(39169, c8002.m21834());
            C24411 c24411M545910 = C24411.m54598(39169, bArr3);
            if (c24411M54599 == null || c24411M545910 == null || c24411M54599.m54603().length < 7 || c24411M545910.m54603().length < 7) {
                m51720("ZIP AES extra data is missing from a file header");
                return;
            }
            for (int i5 = 0; i5 < 7; i5++) {
                if (c24411M54599.m54603()[i5] != c24411M545910.m54603()[i5]) {
                    m51720("ZIP AES extra data does not match between file headers");
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m51710(C5041 c5041, boolean z, boolean z2) throws C7278, InterruptedIOException {
        try {
            m51719(c5041.f17463);
            if (!z || m51714() == 134695760) {
                return m51714() == c5041.f17459 && (z2 ? m51717() : m51698()) == c5041.f17462 && (z2 ? m51717() : m51698()) == c5041.f17461;
            }
            return false;
        } catch (EOFException unused) {
            return false;
        } catch (InterruptedIOException e) {
            throw e;
        } catch (IOException e2) {
            throw new C7278(e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51707(InterfaceC19189 interfaceC19189, boolean z) throws IOException {
        int i;
        long j;
        Charset charsetM8272;
        boolean zM21846;
        boolean z2;
        long jM51698;
        long jM51699;
        byte[] bArr;
        int i2;
        byte[] bArr2;
        long j2;
        int i3;
        ArrayList<C8002> arrayList = new ArrayList();
        int i4 = C2448.f7865;
        int[] iArr = new int[i4];
        long length = this.f74523.length();
        m51719(0L);
        if (m51714() != 67324752) {
            InterfaceC17713 interfaceC17713 = this.f74523;
            int i5 = 4;
            byte[] bArr3 = {UTF8.S_P4A, 75, 3, 4};
            long jMin = Math.min(interfaceC17713.length(), 52428800L);
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
                interfaceC17713.seek(0L);
                int i8 = 0;
                int i9 = 0;
                long j4 = 0;
                int i10 = 0;
                while (true) {
                    if (j4 < jMin) {
                        if (i8 >= i9) {
                            int iMo34032 = interfaceC17713.mo34032(0, (int) Math.min(65536, jMin - j4), bArr4);
                            if (iMo34032 != 0) {
                                i9 = iMo34032;
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
                                long filePointer = interfaceC17713.getFilePointer();
                                bArr2 = bArr3;
                                try {
                                    interfaceC17713.seek(j5 + 5);
                                    int iMo34029 = interfaceC17713.mo34029();
                                    if (iMo34029 == 45 || iMo34029 == 20 || iMo34029 == 10) {
                                        interfaceC17713.mo34029();
                                        int iMo340210 = interfaceC17713.mo34029();
                                        if (iMo340210 == 0 || iMo340210 == 8 || iMo340210 == 9 || iMo340210 == 12 || iMo340210 == 14 || iMo340210 == 95) {
                                            interfaceC17713.readInt();
                                            interfaceC17713.readInt();
                                            long j7 = ((long) interfaceC17713.readInt()) & 4294967295L;
                                            interfaceC17713.readInt();
                                            bArr = bArr4;
                                            int iMo340211 = interfaceC17713.mo34029();
                                            if (iMo340211 != 0) {
                                                if (interfaceC17713.getFilePointer() + ((long) iMo340211) + ((long) interfaceC17713.mo34029()) + j7 <= interfaceC17713.length()) {
                                                    interfaceC17713.seek(filePointer);
                                                    j2 = j6;
                                                    break;
                                                }
                                                interfaceC17713.seek(filePointer);
                                            } else {
                                                interfaceC17713.seek(filePointer);
                                            }
                                        } else {
                                            bArr = bArr4;
                                            interfaceC17713.seek(filePointer);
                                        }
                                    } else {
                                        bArr = bArr4;
                                        interfaceC17713.seek(filePointer);
                                    }
                                    i10 = 0;
                                } catch (Throwable th) {
                                    interfaceC17713.seek(filePointer);
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
                    m51719(j2);
                }
            }
            j2 = -1;
            if (j2 != -1) {
                m51719(j2);
            }
        } else {
            i = i4;
            j = length;
            m51719(0L);
        }
        int i12 = 50000;
        loop0: while (true) {
            int iAvailable = this.f74523.available();
            charsetM8272 = this.f74536;
            if (iAvailable <= 30 || m51714() != 67324752) {
                break;
            }
            C8002 c8002 = new C8002();
            long j8 = 4;
            c8002.m21832(this.f74523.getFilePointer() - 4);
            m51715();
            c8002.m21845(m51715());
            c8002.m21837(m51715());
            c8002.setTime(C17719.m41494(m51698()));
            c8002.m21817(m51714());
            c8002.m21818(m51698());
            c8002.m21854(m51698());
            int iM51715 = m51715();
            int iM51716 = m51715();
            boolean zM21810 = c8002.m21810();
            byte[] bArrM51711 = m51711(iM51715);
            boolean z3 = (interfaceC19189 == null || interfaceC19189.mo30502(bArrM51711)) ? false : true;
            if (!z3 && !zM21810 && i12 > 0 && charsetM8272 == null) {
                m51709(bArrM51711, iArr);
                i12--;
            }
            c8002.m21855(bArrM51711);
            if (iM51716 > 0) {
                byte[] bArrM51712 = m51711(iM51716);
                zM21846 = c8002.m21846(bArrM51712);
                if (zM21846) {
                    bArrM51712 = C24411.m54601(1, bArrM51712);
                }
                c8002.m21833(bArrM51712);
            } else {
                zM21846 = false;
            }
            c8002.m21850(this.f74523.getFilePointer());
            int i13 = 8;
            if ((c8002.m21841() & 8) == 8) {
                int i14 = 0;
                while (true) {
                    int i15 = this.f74523.read();
                    if (i15 == -1) {
                        break loop0;
                    }
                    i14 = (i14 >>> i13) | (i15 << 24);
                    if (i14 == 134695760) {
                        long filePointer2 = (this.f74523.getFilePointer() - c8002.m21811()) - j8;
                        int iM51714 = m51714();
                        if (zM21846) {
                            jM51698 = m51717();
                            jM51699 = m51717();
                        } else {
                            jM51698 = m51698();
                            jM51699 = m51698();
                        }
                        long j9 = jM51698;
                        z2 = z3;
                        long j10 = jM51699;
                        if (j9 == filePointer2) {
                            c8002.m21817(iM51714);
                            c8002.m21818(j9);
                            c8002.m21854(j10);
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
                    arrayList.add(c8002);
                }
            } else {
                z2 = z3;
                if (j - c8002.m21811() < c8002.m21838()) {
                    break;
                }
                m51721(c8002.m21838());
                if (!z2) {
                    arrayList.add(c8002);
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
        if (charsetM8272 == null) {
            int i16 = C2448.f7850;
            int i17 = i;
            for (int i18 = 0; i18 < i17; i18++) {
                if (i18 != i16 && iArr[i18] > iArr[i16]) {
                    i16 = i18;
                }
            }
            charsetM8272 = C2448.m8272(i16);
        }
        for (C8002 c8003 : arrayList) {
            if (c8003.m21810()) {
                c8003.m21820(charset, false, this.f74538);
            } else {
                c8003.m21820(charsetM8272, true, this.f74538);
            }
            if (!this.f74538 && c8003.getName().equals("AndroidManifest.xml") && this.f74539 == null) {
                this.f74538 = true;
            }
        }
        LinkedHashMap linkedHashMap = this.f74525;
        linkedHashMap.clear();
        for (C8002 c8004 : arrayList) {
            m51716(c8004);
            linkedHashMap.put(c8004.getName(), c8004);
        }
        if (this.f74532) {
            this.f74534 = C4681.unmodifiableList(new ArrayList(arrayList));
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m51716(C8002 c8002) throws ZipException, EOFException {
        int iM21826;
        if (c8002.m21856()) {
            if (this.f74538) {
                c8002.m21845(c8002.m21841() & (-2));
            } else {
                C24411 c24411M54598 = C24411.m54598(39169, c8002.m21847());
                if (c24411M54598 != null) {
                    c8002.m21831(99);
                    c8002.m21823(c24411M54598);
                    byte[] bArrM54603 = c24411M54598.m54603();
                    if (bArrM54603.length < 7) {
                        throw new ZipException("Invalid aes extra data record. (" + c8002.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    boolean z = C17719.f58226;
                    if (7 > bArrM54603.length) {
                        throw new EOFException();
                    }
                    c8002.m21837(C6929.m19212(5, bArrM54603));
                } else if ((c8002.m21841() & 64) != 0) {
                    c8002.m21831(1);
                } else {
                    c8002.m21831(0);
                }
            }
        }
        if (this.f74538 && (iM21826 = c8002.m21826()) != 8 && iM21826 != 0) {
            c8002.m21837(0);
        }
        if (this.f74538 && c8002.m21826() == 0 && c8002.getSize() != c8002.m21838()) {
            c8002.m21818(c8002.getSize());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22195 m51701(long j, int i, long j2) throws IOException {
        m51719(j);
        int iM51714 = m51714();
        if (iM51714 != 101075792) {
            throw new IOException("Invalid zip64 eocd record offset, sig=" + Integer.toHexString(iM51714) + " offset=" + j);
        }
        if (this.f74528) {
            long jM51717 = m51717();
            long j3 = j2 - 20;
            if (jM51717 < 44 || j > 9223372036854775795L || jM51717 > 9223372036854775795L - j || j + 12 + jM51717 != j3) {
                throw new IOException(C24770.m55292(jM51717, "Invalid zip64 eocd record size: "));
            }
            m51721(4L);
        } else {
            m51721(12L);
        }
        return new C22195(m51714(), m51714(), m51717(), m51717(), m51717(), m51717(), j, i, true);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10260 m51748(C8002 c8002) {
        return new C10260(this.f74523, c8002.m21811(), c8002.m21838(), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m51727(C8002 c8002) {
        return m51699(c8002, true, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InputStream m51746(C8002 c8002) {
        return m51699(c8002, false, false);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InputStream m51733(C8002 c8002) throws IOException {
        if (c8002.getSize() < 0) {
            throw new IOException("Unknown uncompressed size (" + c8002.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (c8002.m21838() < 0) {
            throw new IOException("Unknown compressed size (" + c8002.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return m51699(c8002, true, true);
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
    /* JADX WARN: Code duplicated, block: B:64:0x015f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0180  */
    /* JADX WARN: Code duplicated, block: B:71:0x0198  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b2  */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x0100, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0180, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InputStream m51699(C8002 c8002, boolean z, boolean z2) throws IOException {
        boolean z3;
        InputStream c10260;
        InputStream bufferedInputStream;
        C3549 c3549;
        InputStream c13989;
        ByteBuffer byteBufferOrder;
        long size;
        if (!z2 && c8002.getSize() == 0 && (!c8002.m21856() || !c8002.m21827() || c8002.m21826() != 0)) {
            return new C13967();
        }
        long jM21811 = c8002.m21811();
        int iM21826 = c8002.m21826();
        boolean zM21856 = c8002.m21856();
        if (zM21856 && c8002.m21835() == 99) {
            int iM21849 = c8002.m21849();
            if (iM21849 == 2) {
                z3 = false;
            } else {
                if (iM21849 != 1) {
                    StringBuilder sbM12235 = C3769.m12235(iM21849, "Unsupported AES version ", " (");
                    sbM12235.append(c8002.getName());
                    sbM12235.append(MotionUtils.EASING_TYPE_FORMAT_END);
                    throw new IOException(sbM12235.toString());
                }
                z3 = true;
            }
        } else {
            z3 = true;
        }
        if (zM21856) {
            C10260 c10261 = new C10260(this.f74523, jM21811, c8002.m21838(), z2);
            int iM21835 = c8002.m21835();
            if (iM21835 == 0) {
                c10260 = new C18465(this, c8002, c10261, this.f74526);
            } else {
                if (iM21835 != 99) {
                    throw new IOException("Unsupported encryption method " + c8002.m21835() + " (" + c8002.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                bufferedInputStream = new C3549(this, c8002, c10261, this.f74526);
                c3549 = bufferedInputStream;
            }
            if (iM21826 != 0) {
                if (iM21826 != 12) {
                    c13989 = new C13989(c8002, bufferedInputStream);
                } else if (iM21826 != 14) {
                    int i = C23643.f76698;
                    byteBufferOrder = ByteBuffer.wrap(C5125.m15501(bufferedInputStream, 9)).order(ByteOrder.LITTLE_ENDIAN);
                    byteBufferOrder.get();
                    byteBufferOrder.get();
                    if ((byteBufferOrder.getShort() & HPKE.aead_EXPORT_ONLY) == 5) {
                        throw new UnsupportedOperationException("ZipEntry LZMA should have size 5 in header: " + c8002.getName());
                    }
                    if ((c8002.m21841() & 2) != 0) {
                        size = -1;
                    } else {
                        size = c8002.getSize();
                    }
                    bufferedInputStream = new C23643(c8002, bufferedInputStream, size, byteBufferOrder.get(), byteBufferOrder.getInt());
                } else if (iM21826 != 36) {
                    c13989 = new C17675(c8002, bufferedInputStream);
                } else if (iM21826 != 93) {
                    c13989 = new C20659(c8002, bufferedInputStream);
                } else if (iM21826 != 95) {
                    c13989 = new C3505(c8002, bufferedInputStream);
                } else if (iM21826 != 8) {
                    c13989 = new C22151(c8002, bufferedInputStream, z2);
                } else {
                    if (iM21826 == 9) {
                        throw new IOException("Unsupported compression method " + c8002.m21826() + " (" + c8002.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    c13989 = new C10962(c8002, bufferedInputStream);
                }
                bufferedInputStream = c13989;
            }
            if (z && iM21826 != 0) {
                bufferedInputStream = new BufferedInputStream(bufferedInputStream, 65536);
            }
            if (z2) {
                return new C8769(c8002, bufferedInputStream, c3549, z3);
            }
            return (this.f74538 && z3) ? new C9514(c8002, bufferedInputStream) : bufferedInputStream;
        }
        c10260 = new C10260(this.f74523, jM21811, (iM21826 != 0 || z2) ? c8002.m21838() : c8002.getSize(), z2);
        bufferedInputStream = c10260;
        c3549 = 0;
        if (iM21826 != 0) {
            if (iM21826 != 12) {
                c13989 = new C13989(c8002, bufferedInputStream);
            } else if (iM21826 != 14) {
                int i2 = C23643.f76698;
                byteBufferOrder = ByteBuffer.wrap(C5125.m15501(bufferedInputStream, 9)).order(ByteOrder.LITTLE_ENDIAN);
                byteBufferOrder.get();
                byteBufferOrder.get();
                if ((byteBufferOrder.getShort() & HPKE.aead_EXPORT_ONLY) == 5) {
                    throw new UnsupportedOperationException("ZipEntry LZMA should have size 5 in header: " + c8002.getName());
                }
                if ((c8002.m21841() & 2) != 0) {
                    size = -1;
                } else {
                    size = c8002.getSize();
                }
                bufferedInputStream = new C23643(c8002, bufferedInputStream, size, byteBufferOrder.get(), byteBufferOrder.getInt());
            } else if (iM21826 != 36) {
                c13989 = new C17675(c8002, bufferedInputStream);
            } else if (iM21826 != 93) {
                c13989 = new C20659(c8002, bufferedInputStream);
            } else if (iM21826 != 95) {
                c13989 = new C3505(c8002, bufferedInputStream);
            } else if (iM21826 != 8) {
                c13989 = new C22151(c8002, bufferedInputStream, z2);
            } else {
                if (iM21826 == 9) {
                    throw new IOException("Unsupported compression method " + c8002.m21826() + " (" + c8002.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                c13989 = new C10962(c8002, bufferedInputStream);
            }
            bufferedInputStream = c13989;
        }
        if (z) {
            bufferedInputStream = new BufferedInputStream(bufferedInputStream, 65536);
        }
        if (z2) {
            return new C8769(c8002, bufferedInputStream, c3549, z3);
        }
        if (this.f74538) {
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m51738(C8002 c8002) {
        if (c8002.getSize() > 20971520) {
            try {
                InputStream inputStreamM51699 = m51699(c8002, true, false);
                try {
                    byte[] bArrM46521 = C20244.m46521(c8002.getSize(), inputStreamM51699);
                    inputStreamM51699.close();
                    return bArrM46521;
                } catch (Throwable th) {
                    try {
                        inputStreamM51699.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception unused) {
                return m51731(c8002, (C3374) null);
            }
        }
        return m51731(c8002, (C3374) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m51731(C8002 c8002, C3374 c3374) throws IOException {
        int size = (int) c8002.getSize();
        byte[] bArr = new byte[size];
        int i = 0;
        InputStream inputStreamM51699 = m51699(c8002, true, false);
        while (i < size) {
            try {
                int i2 = inputStreamM51699.read(bArr, i, size - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
                if (c3374 != null) {
                    c3374.m11079(i2);
                }
            } catch (Throwable th) {
                try {
                    inputStreamM51699.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i != size || inputStreamM51699.read() != -1) {
            throw new IOException("The length of data has been read is incorrect. (" + c8002.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        inputStreamM51699.close();
        return bArr;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C22941 m51743(C8002 c8002) throws IOException {
        if (c8002.m21826() != 0) {
            throw new IOException("Entry is not stored: " + c8002.getName());
        }
        return new C22941(this.f74523.mo34033(c8002.m21811(), c8002.m21838()), null, true, null, null);
    }

    public final String getName() {
        InterfaceC17713 interfaceC17713 = this.f74523;
        if (interfaceC17713 == null) {
            return null;
        }
        return interfaceC17713.getName();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m51728(boolean z) throws IOException {
        String strM51718 = m51718(1);
        C8002 entry = getEntry(strM51718);
        if (entry == null) {
            if (z) {
                return Collections.EMPTY_LIST;
            }
            StringBuilder sbM51387 = C22783.m51387("Entry not found: ", strM51718, "\n(");
            sbM51387.append(this.f74523.getName());
            sbM51387.append(MotionUtils.EASING_TYPE_FORMAT_END);
            throw new IOException(sbM51387.toString());
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (entry != null) {
            arrayList.add(entry);
            i++;
            entry = getEntry(m51718(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m51718(int i) {
        if (i > 0) {
            return i == 1 ? "classes.dex" : C14442.m34864(i, "classes", ".dex");
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
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C22195 m51713() throws IOException {
        long j;
        String str;
        String str2;
        long j2;
        String str3;
        boolean z;
        int i;
        long jM51698;
        long jM51699;
        long j3;
        int i2;
        long j4;
        int iM51715;
        C22195 c22195;
        long j5;
        String str4;
        C22195 c22195M51701;
        String str5;
        long length = this.f74523.length();
        long jMax = Math.max(0L, length - 65557);
        C22195 c22196 = null;
        long j6 = length - 22;
        String str6 = null;
        String str7 = null;
        while (true) {
            boolean z2 = this.f74528;
            if (j6 < jMax) {
                String str8 = str6;
                String str9 = str7;
                if (c22196 == null) {
                    return null;
                }
                if (z2) {
                    throw new IOException(str9);
                }
                m51720(str9);
                this.f74530 = str8;
                return c22196;
            }
            m51719(j6);
            if (m51714() != 101010256) {
                j6--;
            } else if (j6 > 20) {
                try {
                    m51719(j6 - 20);
                    if (m51714() == 117853008) {
                        int iM51714 = m51714();
                        long jM51717 = m51717();
                        int iM51716 = m51714();
                        if (z2 && (iM51714 != 0 || iM51716 != 1)) {
                            throw new IOException("Split ZIP archives are not supported");
                        }
                        j = jM51717;
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
                        m51719(j7);
                        if (z) {
                            m51721(16L);
                            j4 = -1;
                            jM51699 = -1;
                            j3 = -1;
                            jM51698 = -1;
                            i2 = -1;
                            i = -1;
                        } else {
                            int iM51717 = m51715();
                            int iM51718 = m51715();
                            long jM51715 = m51715();
                            long jM51716 = m51715();
                            i = iM51718;
                            jM51698 = m51698();
                            jM51699 = m51698();
                            j3 = jM51716;
                            i2 = iM51717;
                            j4 = jM51715;
                        }
                        iM51715 = m51715();
                        c22195 = new C22195(i2, i, j4, jM51699, j3, jM51698, j6, iM51715, false);
                        j5 = j6 + 22 + ((long) iM51715);
                        if (iM51715 > 0 || j5 > length) {
                            str4 = null;
                        } else {
                            str4 = new String(m51711(iM51715), StandardCharsets.UTF_8);
                        }
                        if (j != -1) {
                            str = str3;
                            long j8 = j;
                            str2 = str7;
                            j2 = j6;
                            try {
                                c22195M51701 = m51701(j8, iM51715, j6);
                            } catch (IOException unused) {
                                str6 = str;
                                j6 = j2 - 1;
                                str7 = str2;
                            }
                        } else {
                            str = str3;
                            str2 = str7;
                            j2 = j6;
                            c22195M51701 = c22195;
                        }
                        if (j5 == length) {
                            this.f74530 = str4;
                            return c22195M51701;
                        }
                        if (c22196 == null) {
                            if (j5 > length) {
                                str5 = "ZIP end of central directory comment is truncated";
                            } else {
                                str5 = "ZIP end of central directory does not terminate the archive";
                            }
                            str7 = str5;
                            c22196 = c22195M51701;
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
                m51719(j9);
                if (z) {
                    m51721(16L);
                    j4 = -1;
                    jM51699 = -1;
                    j3 = -1;
                    jM51698 = -1;
                    i2 = -1;
                    i = -1;
                } else {
                    int iM51719 = m51715();
                    int iM517110 = m51715();
                    long jM51718 = m51715();
                    long jM51719 = m51715();
                    i = iM517110;
                    jM51698 = m51698();
                    jM51699 = m51698();
                    j3 = jM51719;
                    i2 = iM51719;
                    j4 = jM51718;
                }
                iM51715 = m51715();
                c22195 = new C22195(i2, i, j4, jM51699, j3, jM51698, j6, iM51715, false);
                j5 = j6 + 22 + ((long) iM51715);
                if (iM51715 > 0) {
                    str4 = null;
                } else {
                    str4 = null;
                }
                if (j != -1) {
                    str = str3;
                    long j10 = j;
                    str2 = str7;
                    j2 = j6;
                    c22195M51701 = m51701(j10, iM51715, j6);
                } else {
                    str = str3;
                    str2 = str7;
                    j2 = j6;
                    c22195M51701 = c22195;
                }
                if (j5 == length) {
                    this.f74530 = str4;
                    return c22195M51701;
                }
                if (c22196 == null) {
                    if (j5 > length) {
                        str5 = "ZIP end of central directory comment is truncated";
                    } else {
                        str5 = "ZIP end of central directory does not terminate the archive";
                    }
                    str7 = str5;
                    c22196 = c22195M51701;
                    str6 = str4;
                } else {
                    str7 = str2;
                    str6 = str;
                }
                j6 = j2 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m51719(long j) {
        this.f74523.seek(j);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m51721(long j) throws IOException {
        if (j < 0) {
            throw new IOException(C24770.m55292(j, "Skip "));
        }
        long filePointer = this.f74523.getFilePointer() + j;
        if (filePointer > this.f74523.length()) {
            throw new EOFException();
        }
        this.f74523.seek(filePointer);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m51711(int i) {
        byte[] bArr = new byte[i];
        this.f74523.readFully(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private int m51714() throws EOFException {
        int i = this.f74523.read();
        int i2 = this.f74523.read();
        int i3 = this.f74523.read();
        int i4 = this.f74523.read();
        if ((i | i2 | i3 | i4) >= 0) {
            return i | (i2 << 8) | (i3 << 16) | (i4 << 24);
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private int m51715() throws EOFException {
        int i = this.f74523.read();
        int i2 = this.f74523.read();
        if ((i | i2) >= 0) {
            return i | (i2 << 8);
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private long m51698() {
        return ((long) m51714()) & 4294967295L;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private long m51717() {
        return m51698() | (m51698() << 32);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m51729();
        if (this.f74524) {
            return;
        }
        this.f74523.close();
        this.f74524 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51729() {
        List list = this.f74531;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5125.m15494((C22941) it.next());
        }
        list.clear();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17713 m51735() {
        return this.f74523;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C15481 m51723() {
        return new C15481(this);
    }
}
