package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.am;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;
import org.simpleframework.xml.core.Entry;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.۠ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8229 extends C21011 {

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final int f28633 = C22253.m49425().getDigestLength();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f28634;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f28635;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Set f28636;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f28637;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9186 f28638;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f28639;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f28640;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f28641;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13626 f28642;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C7660 f28643;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9186 f28644;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f28645;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f28646;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C9186 f28647;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C16609 f28648;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21552(C8229 c8229, C19146 c19146, C11288 c11288, C21373 c21373, C5851 c5851, C2820 c2820, Map map) throws C8563 {
        String str = c19146.f61840;
        try {
            C8340 c8340M21564 = c8229.m21564(c19146);
            c11288.m28271();
            C14816.m35491(c8340M21564, c21373, c11288, c5851, c2820);
            List listM28267 = c11288.m28267();
            if (map != null) {
                map.put(str, listM28267);
            }
            c8340M21564.m21787();
        } catch (C4811 e) {
            throw new C8563(str, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m21576(String str, String str2) {
        if (!this.f28645.containsKey(str)) {
            C19146 c19146 = new C19146(str, false);
            C13626 c13626 = new C13626(new C13626(this.f28642, DocumentReader.RESERVED), str + ".xml");
            c19146.f61839 = c13626;
            c13626.m33318().m46735(str2);
            this.f28645.put(str, c19146);
            if (this.f28640) {
                this.f28636.add(str);
                this.f28638.mo23641(C0561.unmodifiableSet(this.f28636));
            }
        } else {
            throw new C8142("Xml exists: " + str);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C8229 m21560(C13626 c13626) {
        return new C8229(c13626);
    }

    public C8229(C13626 c13626) throws IOException {
        super(c13626);
        this.f28645 = new HashMap();
        this.f28646 = new ArrayList();
        Set set = Collections.EMPTY_SET;
        this.f28636 = set;
        this.f28643 = new C7660();
        this.f28647 = new C9186();
        this.f28644 = new C9186();
        this.f28638 = new C9186();
        this.f28640 = true;
        this.f28637 = false;
        this.f28648 = new C16609();
        C13626 c13627 = new C13626(c13626, "arsc");
        this.f28642 = c13627;
        C6171.m17176(c13627.m33326());
        AbstractC20745 abstractC20745M33320 = m21572().m33320("removed");
        Set set2 = set;
        if (abstractC20745M33320.mo33975()) {
            BufferedReader bufferedReaderM46734 = abstractC20745M33320.m46734();
            try {
                HashSet hashSet = new HashSet();
                while (true) {
                    String line = bufferedReaderM46734.readLine();
                    if (line == null) {
                        break;
                    } else {
                        hashSet.add(line);
                    }
                }
                bufferedReaderM46734.close();
                set2 = hashSet;
            } catch (Throwable th) {
                try {
                    bufferedReaderM46734.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C13626 c13628 = new C13626(m21592(), "xmls");
        if (!c13628.m33326()) {
            throw new IOException("File not found: " + c13628.m33319());
        }
        ArrayList<C19146> arrayListM21542 = m21542(c13628);
        this.f28639 = arrayListM21542.size();
        for (C19146 c19146 : arrayListM21542) {
            if (!set2.contains(c19146.f61840)) {
                this.f28645.put(c19146.f61840, c19146);
            }
        }
        m21604();
        ArrayList arrayList = this.f28646;
        AbstractC20745 abstractC20745M33321 = m21572().m33320("recent");
        if (abstractC20745M33321.mo33975()) {
            arrayList.clear();
            BufferedReader bufferedReaderM46735 = abstractC20745M33321.m46734();
            while (true) {
                try {
                    String line2 = bufferedReaderM46735.readLine();
                    if (line2 == null) {
                        break;
                    } else if (!line2.isEmpty()) {
                        arrayList.add(line2);
                    }
                } catch (Throwable th3) {
                    try {
                        bufferedReaderM46735.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            bufferedReaderM46735.close();
            m21567();
        }
        this.f28635 = new C13626(m21572(), "name").m33318().m46730();
        C13626 c13629 = new C13626(m21572(), "pkgsort");
        if (c13629.m33326()) {
            C17367 c17367 = new C17367(c13629.m33327());
            C20190.m45649((InterfaceC0433) c17367, -1430501583);
            while (c17367.available() > 0) {
                this.f28643.mo18019(c17367.m40462(), (Object) c17367.m40458());
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static ArrayList m21542(C13626 c13626) {
        boolean z;
        C14546 c14546 = new C14546(c13626.m33318());
        try {
            if (c14546.m35010() == 1920094587) {
                c14546.skipBytes(4);
                z = true;
            } else {
                C20190.m45649(c14546, 1920094586);
                z = false;
            }
            int i = c14546.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                String strM35011 = c14546.m35011();
                int i3 = c14546.readInt();
                int i4 = c14546.readInt();
                C19146 c19146 = new C19146(strM35011, z);
                c19146.f61844 = c13626;
                c19146.f61841 = i3;
                c19146.f61837 = i4;
                arrayList.add(c19146);
            }
            c14546.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                c14546.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C13626 m21592() {
        return new C13626(this.f28642, e.m);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C13626 m21572() {
        return new C13626(this.f28642, "config");
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m21608() {
        return this.f28635;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21587(boolean z) {
        this.f28640 = z;
        if (z) {
            m21604();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m21554(C13626 c13626, C13626 c13627, byte[] bArr) {
        if (this.f28637 || !c13626.m33326() || !c13627.m33326()) {
            return false;
        }
        try {
            C17367 c17367 = new C17367(c13627.m33327());
            C20190.m45649((InterfaceC0433) c17367, 1936945938);
            if (!Arrays.equals(c17367.m40451(), bArr)) {
                return false;
            }
            MessageDigest messageDigestM49416 = C22253.m49416();
            C22253.m49417(messageDigestM49416, c13626.m33318().mo33970());
            return Arrays.equals(c17367.m40451(), messageDigestM49416.digest());
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m21609(String str) {
        return this.f28645.containsKey(str);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Collection m21603() {
        return this.f28645.values();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5693 m21602() {
        C22627 c22627M50152 = C22627.m50152(this.f28645.keySet());
        c22627M50152.m50157(new C12119(2));
        C5693 c5693M50155 = c22627M50152.m50155();
        Collections.sort(c5693M50155.m15702(), new C22340(this));
        return c5693M50155;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m21543(C8229 c8229, C5693 c5693, C5693 c5694) {
        C7660 c7660 = c8229.f28643;
        int iMo17278 = c7660.mo17278(EnumC12167.f40715, c5693.m15697());
        int iMo17279 = c7660.mo17278(EnumC12167.f40715, c5694.m15697());
        if (iMo17278 == iMo17279) {
            return c5693.m15697().compareToIgnoreCase(c5694.m15697());
        }
        return Integer.compare(iMo17278, iMo17279);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m21604() {
        C13626[] c13626Arr;
        int i;
        int i2;
        if (!this.f28640) {
            throw new IllegalStateException();
        }
        HashMap map = this.f28645;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C19146) it.next()).f61839 = null;
        }
        C13626[] c13626ArrM33325 = new C13626(this.f28642, DocumentReader.RESERVED).m33325();
        int i3 = 0;
        if (c13626ArrM33325 == null) {
            c13626ArrM33325 = new C13626[0];
        }
        int length = c13626ArrM33325.length;
        int i4 = 0;
        while (i4 < length) {
            C13626 c13626 = c13626ArrM33325[i4];
            if (c13626.m33318().mo33974()) {
                String str = c13626.getName() + "/";
                C13626 c13627 = new C13626(c13626, "package-info.xml");
                if (c13627.m33326()) {
                    String strM37076 = C15489.m37076(str, "package-info");
                    C19146 c19146 = (C19146) map.get(strM37076);
                    if (c19146 == null) {
                        c19146 = new C19146(strM37076, i3);
                        map.put(strM37076, c19146);
                    }
                    c19146.f61839 = c13627;
                }
                C13626[] c13626ArrM33326 = c13626.m33325();
                if (c13626ArrM33326 == null) {
                    c13626ArrM33326 = new C13626[i3];
                }
                int length2 = c13626ArrM33326.length;
                int i5 = 0;
                int i6 = i3;
                while (i5 < length2) {
                    C13626 c13628 = c13626ArrM33326[i5];
                    if (c13628.m33318().mo33974()) {
                        String name = c13628.getName();
                        String strM5594 = C1679.m5594(str, name, "/");
                        C13626[] c13626ArrM33327 = c13628.m33325();
                        if (c13626ArrM33327 == null) {
                            c13626ArrM33327 = new C13626[i6];
                        }
                        int length3 = c13626ArrM33327.length;
                        int i7 = 0;
                        while (i7 < length3) {
                            C13626 c13629 = c13626ArrM33327[i7];
                            if (c13629.m33318().mo33971()) {
                                c13626Arr = c13626ArrM33325;
                                i = length3;
                                if (c13629.getName().toLowerCase().endsWith(".xml")) {
                                    i2 = length;
                                    String strM46498 = C20630.m46498(4, 0, c13629.getName());
                                    if (strM46498.startsWith(name) || strM46498.equals("type-info")) {
                                        String strM37077 = C15489.m37076(strM5594, strM46498);
                                        C19146 c19147 = (C19146) map.get(strM37077);
                                        if (c19147 == null) {
                                            c19147 = new C19146(strM37077, false);
                                            map.put(strM37077, c19147);
                                        }
                                        c19147.f61839 = c13629;
                                    }
                                }
                                i7++;
                                length3 = i;
                                c13626ArrM33325 = c13626Arr;
                                length = i2;
                            } else {
                                c13626Arr = c13626ArrM33325;
                                i = length3;
                            }
                            i2 = length;
                            i7++;
                            length3 = i;
                            c13626ArrM33325 = c13626Arr;
                            length = i2;
                        }
                    }
                    i5++;
                    i6 = 0;
                    c13626ArrM33325 = c13626ArrM33325;
                    length = length;
                }
            }
            i4++;
            i3 = 0;
            c13626ArrM33325 = c13626ArrM33325;
            length = length;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            C19146 c19148 = (C19146) ((Map.Entry) it2.next()).getValue();
            if (c19148.f61839 != null) {
                hashSet.add(c19148.f61840);
            } else if (c19148.f61844 == null) {
                it2.remove();
            }
        }
        C9186 c9186 = this.f28638;
        Set set = (Set) c9186.m44956();
        if (set != null && set.size() == hashSet.size() && set.containsAll(hashSet)) {
            return;
        }
        this.f28636 = hashSet;
        c9186.mo23641(C0561.unmodifiableSet(hashSet));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21579(ConcurrentLinkedQueue concurrentLinkedQueue, String str, boolean z, Set set) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        for (C19146 c19146 : this.f28645.values()) {
            String str2 = c19146.f61840;
            if (set == null || set.contains(str2)) {
                if (str2.startsWith(str) && (z || str2.indexOf(47, str.length()) == -1)) {
                    concurrentLinkedQueue.add(new C18812(this, c19146));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13626 m21565(C13626 c13626) {
        return new C13626(m47184(), C0252.m1693("arscBuild", c13626.m33319().substring(new C13626(this.f28642, DocumentReader.RESERVED).m33319().length()) + ".bin"));
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private C13626 m21557() {
        return new C13626(m47184(), "arscBuild/resources.arsc");
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private boolean m21556() {
        Iterator it = this.f28645.values().iterator();
        while (true) {
            boolean zM21555 = false;
            if (!it.hasNext()) {
                return false;
            }
            C13626 c13626 = ((C19146) it.next()).f61839;
            if (c13626 != null) {
                C13626 c13626M21565 = m21565(c13626);
                if (c13626M21565.m33326()) {
                    zM21555 = m21555(C22253.m49425().digest(c13626.m33327()), c13626M21565);
                }
                if (!zM21555) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C8340 m21563(C13626 c13626, C13626 c13627) throws IOException {
        byte[] bArrM33327 = c13626.m33327();
        byte[] bArrDigest = C22253.m49425().digest(bArrM33327);
        if (m21555(bArrDigest, c13627)) {
            return null;
        }
        C8340 c8340M21775 = C8340.m21775(new String(bArrM33327, StandardCharsets.UTF_8), false);
        c8340M21775.getClass();
        C11018 c11018 = new C11018();
        c8340M21775.m21781(c11018);
        c13627.m33324();
        OutputStream outputStreamMo33976 = c13627.m33318().mo33976(false);
        try {
            outputStreamMo33976.write(bArrDigest);
            outputStreamMo33976.write(c11018.m27788(), 0, c11018.size());
            outputStreamMo33976.close();
            return c8340M21775;
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21555(byte[] bArr, C13626 c13626) {
        if (c13626.m33326()) {
            try {
                InputStream inputStreamM33328 = c13626.m33328();
                try {
                    for (int i : bArr) {
                        if (inputStreamM33328.read() != (i & 255)) {
                            inputStreamM33328.close();
                            return false;
                        }
                    }
                    if (inputStreamM33328 != null) {
                        inputStreamM33328.close();
                    }
                    return true;
                } catch (Throwable th) {
                    if (inputStreamM33328 != null) {
                        try {
                            inputStreamM33328.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8340 m21547(C13626 c13626) {
        C17367 c17367 = new C17367(c13626.m33327());
        c17367.skipBytes(f28633);
        return C8340.m21776(c17367);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 m21605() {
        boolean zM21558;
        int i;
        int i2;
        int i3;
        String str;
        C15606[] c15606Arr;
        String strM35009;
        int i4 = 1;
        if (this.f28637 || this.f28641) {
            zM21558 = true;
        } else {
            try {
                zM21558 = m21558();
                this.f28641 = zM21558;
            } catch (Exception unused) {
                this.f28641 = true;
                zM21558 = true;
            }
        }
        if (zM21558) {
            try {
                this.f28637 = true;
                m21588(false, (InterfaceC24022) new C6817());
                this.f28637 = false;
            } catch (Throwable th) {
                this.f28637 = false;
                throw th;
            }
        }
        C14546 c14546 = new C14546(new C13626(m47184(), "arscBuild/records").m33318());
        C20190.m45649(c14546, -416934225);
        c14546.skipBytes(c14546.readInt());
        int i5 = c14546.readInt();
        ConcurrentMapC13783 concurrentMapC13783 = new ConcurrentMapC13783(i5);
        int i6 = 0;
        while (i6 < i5) {
            String strM35011 = c14546.m35011();
            int i7 = c14546.readInt();
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            while (i8 < i7) {
                int i9 = c14546.readByte() & 255;
                int i10 = c14546.readInt();
                int i11 = c14546.readInt();
                C15606[] c15606Arr2 = null;
                if (i9 == 0) {
                    i = i5;
                    i2 = c14546.readInt();
                    i3 = i9;
                    str = null;
                    c15606Arr = null;
                } else {
                    if (i9 == i4) {
                        i = i5;
                        strM35009 = c14546.m35009();
                    } else if (i9 == 2 || i9 == 3) {
                        i = i5;
                        i2 = c14546.readInt();
                        i3 = i9;
                        str = null;
                        c15606Arr = null;
                    } else if (i9 == 101) {
                        strM35009 = c14546.m35009();
                        int iM35013 = c14546.m35013();
                        c15606Arr2 = new C15606[iM35013];
                        int i12 = 0;
                        while (i12 < iM35013) {
                            c15606Arr2[i12] = new C15606(c14546.m35011(), c14546.readInt(), c14546.readInt());
                            i12++;
                            i5 = i5;
                        }
                        i = i5;
                        i9 = 1;
                    } else {
                        throw new RuntimeException();
                    }
                    str = strM35009;
                    i3 = i9;
                    c15606Arr = c15606Arr2;
                    i2 = 0;
                }
                arrayList.add(new C0787(i3, i2, str, c15606Arr, i10, i11));
                i8++;
                i4 = 1;
                i5 = i;
            }
            concurrentMapC13783.put(strM35011, arrayList);
            i6++;
            i4 = 1;
        }
        return concurrentMapC13783;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m21558() {
        if (!m21556()) {
            C13626 c13626 = new C13626(m47184(), "arscBuild/records");
            if (c13626.m33326()) {
                C23046 c23046 = new C23046(this);
                c23046.m50978();
                byte[] bArrM50979 = c23046.m50979();
                boolean zEquals = false;
                if (!this.f28637 && c13626.m33326()) {
                    byte[] bArr = new byte[bArrM50979.length + 8];
                    try {
                        new DataInputStream(c13626.m33328()).readFully(bArr);
                        C17367 c17367 = new C17367(bArr);
                        C20190.m45649((InterfaceC0433) c17367, -416934225);
                        C20190.m45649((InterfaceC0433) c17367, bArrM50979.length);
                        c17367.seek(4L);
                        zEquals = Arrays.equals(c17367.m40451(), bArrM50979);
                    } catch (Exception unused) {
                    }
                }
                return !zEquals;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21588(boolean z, InterfaceC24022 interfaceC24022) throws IOException, C8563 {
        HashMap map = this.f28645;
        for (C19146 c19146 : map.values()) {
            C13626 c13626 = c19146.f61839;
            String str = c19146.f61840;
            if (c13626 != null) {
                interfaceC24022.mo18422(str);
                try {
                    m21563(c13626, m21565(c13626));
                } catch (C4811 e) {
                    throw new C8563(str, e);
                }
            }
        }
        interfaceC24022.mo18423();
        C23046 c23046 = new C23046(this);
        c23046.m50978();
        C13626 c13626M21557 = m21557();
        C13626 c13627 = new C13626(m47184(), "arscBuild/resources.digest");
        C13626 c13628 = new C13626(m47184(), "arscBuild/records");
        if (c23046.f74865.isEmpty() && this.f28639 == c23046.f74866.size() && !this.f28637) {
            c13626M21557.m33323();
            c13627.m33323();
            this.f28634 = false;
            return;
        }
        if (interfaceC24022.mo2357()) {
            return;
        }
        byte[] bArrM50979 = c23046.m50979();
        if (m21554(c13626M21557, c13627, bArrM50979)) {
            this.f28634 = false;
            return;
        }
        if (interfaceC24022.mo2357()) {
            return;
        }
        ConcurrentMapC13783 concurrentMapC13783 = new ConcurrentMapC13783();
        try {
            C22785 c22785M21551 = m21551(map, interfaceC24022, concurrentMapC13783, false);
            C8340.m21777();
            if (interfaceC24022.mo2357()) {
                return;
            }
            interfaceC24022.mo18424();
            c13626M21557.m33323();
            c13627.m33323();
            if (z) {
                C8516 c8516M50444 = c22785M21551.m50444();
                c8516M50444.m22241(new C21450(3, interfaceC24022));
                c13626M21557.m33324();
                C9607 c9607 = new C9607(c13626M21557.m33318());
                try {
                    c22785M21551.m50441(c9607, c8516M50444);
                    c9607.close();
                    this.f28648.m39053(c22785M21551);
                    MessageDigest messageDigestM49416 = C22253.m49416();
                    C22253.m49417(messageDigestM49416, c13626M21557.m33328());
                    byte[] bArrDigest = messageDigestM49416.digest();
                    C11018 c11018 = new C11018();
                    c11018.writeInt(1936945938);
                    c11018.m27794(bArrM50979);
                    c11018.m27794(bArrDigest);
                    c13627.m33318().m46704(c11018.m27788(), 0, c11018.size());
                } catch (Throwable th) {
                    try {
                        c9607.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c13628.m33324();
            try {
                C9607 c9608 = new C9607(c13628.m33318());
                try {
                    c9608.writeInt(-416934225);
                    c9608.m24507(bArrM50979);
                    c9608.writeInt(concurrentMapC13783.size());
                    for (Map.Entry entry : concurrentMapC13783.entrySet()) {
                        c9608.m24504((String) entry.getKey());
                        c9608.writeInt(((List) entry.getValue()).size());
                        for (C0787 c0787 : (List) entry.getValue()) {
                            int i = c0787.f3371;
                            int i2 = c0787.f3367;
                            int i3 = c0787.f3369;
                            C15606[] c15606Arr = c0787.f3368;
                            if (i != 0) {
                                if (i == 1) {
                                    if (c15606Arr != null) {
                                        c9608.writeByte(101);
                                    } else {
                                        c9608.writeByte(1);
                                    }
                                    c9608.writeInt(i3);
                                    c9608.writeInt(i2);
                                    c9608.m24503((CharSequence) c0787.f3366);
                                    if (c15606Arr != null) {
                                        c9608.mo24508(c15606Arr.length);
                                        for (C15606 c15606 : c15606Arr) {
                                            c9608.m24504(c15606.f50740);
                                            c9608.writeInt(c15606.f50741);
                                            c9608.writeInt(c15606.f50739);
                                        }
                                    }
                                } else if (i != 2 && i != 3) {
                                    throw new RuntimeException();
                                }
                            }
                            c9608.writeByte(i);
                            c9608.writeInt(i3);
                            c9608.writeInt(i2);
                            c9608.writeInt(c0787.f3370);
                        }
                    }
                    c9608.close();
                    this.f28634 = false;
                    this.f28641 = false;
                } catch (Throwable th3) {
                    try {
                        c9608.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException | RuntimeException e2) {
                c13628.m33323();
                throw e2;
            }
        } catch (Throwable th5) {
            C8340.m21777();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21586(InterfaceC24022 interfaceC24022) {
        C13626 c13626;
        Iterator it = this.f28645.values().iterator();
        do {
            if (!it.hasNext()) {
                c13626 = null;
                break;
            }
            c13626 = ((C19146) it.next()).f61844;
        } while (c13626 == null);
        if (c13626 != null && c13626.m33318().mo33964() <= 31457280 && c13626.m33318().mo33964() <= 52428800) {
            ArrayList<C19146> arrayListM21542 = m21542(c13626);
            HashMap map = new HashMap();
            for (C19146 c19146 : arrayListM21542) {
                map.put(c19146.f61840, c19146);
            }
            try {
                m21551(map, interfaceC24022, (ConcurrentMapC13783) null, true);
            } finally {
                C8340.m21777();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v67, types: [l.ᩴᩳۨ] */
    /* JADX WARN: Type inference failed for: r35v0, types: [java.util.Map, l.ܰۧᩴ] */
    /* JADX WARN: Type inference failed for: r35v1, types: [l.ܰۧᩴ] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2, types: [l.۠ܳۘ] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22785 m21551(HashMap map, InterfaceC24022 interfaceC24022, final ConcurrentMapC13783 concurrentMapC13783, boolean z) throws IOException, C8563 {
        int i;
        C22785 c22785;
        String str;
        int iM17654;
        C8229 c8229 = this;
        String str2 = "realName";
        String str3 = "name";
        C22785 c22785M50434 = C22785.m50434(EnumC6556.CREATE);
        C11288 c11288 = new C11288(c22785M50434);
        C22627 c22627M50152 = C22627.m50152(map.keySet());
        c22627M50152.m50157(new C12119(2));
        C5693 c5693M50155 = c22627M50152.m50155();
        Collections.sort(c5693M50155.m15702(), new C22340(c8229));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = c5693M50155.m15698().iterator();
        int size = 0;
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            size += ((C5693) it.next()).m15698().size() + 1;
        }
        C8516 c8516 = new C8516(size);
        c8516.m22241(new C1172(0, interfaceC24022));
        C8229 c82210 = c8229;
        for (C5693 c5693 : c5693M50155.m15698()) {
            c8516.m22242(i);
            C14161 c14161M15699 = c5693.m15699("package-info");
            if (c14161M15699 == null) {
                throw new IOException("File not found: " + c5693.m15697() + "/package-info.xml");
            }
            try {
                C8340 c8340M21546 = c82210.m21546(c14161M15699.m34233(), map);
                if (!c8340M21546.m21779().equals("package")) {
                    throw new C4811("Expected tag: <package>", c8340M21546);
                }
                C18923 c18923M21786 = c8340M21546.m21786("id");
                C18923 c18923M21787 = c8340M21546.m21786(str3);
                try {
                    C18923 c18923M21780 = c8340M21546.m21780("prefix");
                    try {
                        C7262 c7262M50439 = c22785M50434.m50439(m21544(c18923M21786) & 255, c18923M21787.m43586());
                        C18923 c18923M21781 = c8340M21546.m21780("configLayout");
                        if (c18923M21781 != null) {
                            c7262M50439.m19388(EnumC10977.m27726(c18923M21781.m43586()));
                        }
                        if (c18923M21780 != null) {
                            c11288.m28272(c7262M50439.mo19106(), m21561(c18923M21780));
                        }
                        Iterator itM21773 = C8340.m21773(c8340M21546, "library");
                        while (itM21773.hasNext()) {
                            C8340 c8340 = (C8340) itM21773.next();
                            C18923 c18923M21788 = c8340.m21786("id");
                            C18923 c18923M21789 = c8340.m21786(str3);
                            Iterator it2 = itM21773;
                            try {
                                int iM21544 = m21544(c18923M21788);
                                C22785 c22786 = c22785M50434;
                                c7262M50439.m19386(iM21544, m21561(c18923M21789));
                                c22785M50434 = c22786;
                                itM21773 = it2;
                            } catch (RuntimeException e) {
                                throw new C4811(e.getMessage(), c8340);
                            }
                        }
                        c22785 = c22785M50434;
                        Iterator itM21774 = C8340.m21773(c8340M21546, "overlay");
                        while (itM21774.hasNext()) {
                            C8340 c8341 = (C8340) itM21774.next();
                            C18923 c18923M217810 = c8341.m21786(str3);
                            Iterator it3 = itM21774;
                            C18923 c18923M21782 = c8341.m21780("actor");
                            try {
                                C19257 c19257M19384 = c7262M50439.m19384(m21561(c18923M217810), c18923M21782 == null ? "" : c18923M21782.m43586());
                                Iterator itM21775 = C8340.m21773(c8341, am.bp);
                                while (itM21775.hasNext()) {
                                    C8340 c8342 = (C8340) itM21775.next();
                                    Iterator it4 = itM21775;
                                    int iM21545 = m21544(c8342.m21786("flags"));
                                    C11288 c11289 = c11288;
                                    C15070 c15070 = new C15070();
                                    Iterator itM21776 = C8340.m21773(c8342, "id");
                                    while (itM21776.hasNext()) {
                                        Iterator it5 = itM21776;
                                        C10457 c10457M21784 = ((C8340) itM21776.next()).m21784();
                                        ArrayList arrayList3 = arrayList2;
                                        String strM26418 = c10457M21784.m26418();
                                        if (C6461.m17655(strM26418)) {
                                            iM17654 = C6461.m17654(strM26418.substring(2));
                                        } else {
                                            if (!C6461.m17645(strM26418)) {
                                                throw new C4811(C16523.m38890("Integer value required: \"", strM26418, "\""), c10457M21784);
                                            }
                                            iM17654 = Integer.parseInt(strM26418);
                                        }
                                        c15070.add(iM17654);
                                        arrayList2 = arrayList3;
                                        itM21776 = it5;
                                    }
                                    c19257M19384.m44200(iM21545, c15070);
                                    itM21775 = it4;
                                    c11288 = c11289;
                                    arrayList2 = arrayList2;
                                }
                                itM21774 = it3;
                            } catch (RuntimeException e2) {
                                throw new C4811(e2.getMessage(), c8341);
                            }
                        }
                        ArrayList arrayList4 = arrayList2;
                        final C11288 c112810 = c11288;
                        Iterator itM21777 = C8340.m21773(c8340M21546, "stagedAlias");
                        while (true) {
                            boolean zHasNext = itM21777.hasNext();
                            str = Entry.DEFAULT_NAME;
                            if (!zHasNext) {
                                break;
                            }
                            C8340 c8343 = (C8340) itM21777.next();
                            C20668 c20668M19391 = c7262M50439.m19391();
                            c8343.getClass();
                            Iterator itM21778 = C8340.m21773(c8343, Entry.DEFAULT_NAME);
                            while (itM21778.hasNext()) {
                                C8340 c8344 = (C8340) itM21778.next();
                                c20668M19391.m46514(m21544(c8344.m21786("stagedResId")), m21544(c8344.m21786("finalizedResId")));
                                itM21777 = itM21777;
                            }
                        }
                        c8340M21546.m21787();
                        if (!interfaceC24022.mo2357()) {
                            C18597 c18597 = new C18597();
                            C18597 c18598 = new C18597();
                            C18597 c18599 = new C18597();
                            Iterator it6 = c5693.m15698().iterator();
                            ?? r9 = c82210;
                            ConcurrentMapC13783 concurrentMapC13784 = concurrentMapC13783;
                            while (it6.hasNext()) {
                                C5693 c5694 = (C5693) it6.next();
                                Iterator it7 = it6;
                                c8516.m22242(1);
                                StringBuilder sb = new StringBuilder();
                                C8516 c8517 = c8516;
                                sb.append(c5694.m15701());
                                sb.append("/type-info");
                                ?? string = sb.toString();
                                try {
                                    C8340 c8340M21547 = r9.m21546(string, map);
                                    if (!c8340M21547.m21779().equals("type")) {
                                        throw new C4811("Expected tag: <type>", c8340M21547);
                                    }
                                    C18923 c18923M21783 = c8340M21547.m21780(str2);
                                    String strM15697 = c5694.m15697();
                                    String strM43586 = c18923M21783 == null ? null : c18923M21783.m43586();
                                    int iM21546 = m21544(c8340M21547.m21786("id")) & 255;
                                    C5693 c5695 = c5693;
                                    C18923 c18923M21784 = c8340M21547.m21780("defaultPublic");
                                    try {
                                        string = c8340M21547.m21780("defaultWeak");
                                        C18923 c18923M21785 = c8340M21547.m21780("defaultCompact");
                                        try {
                                            final C0206 c0206M19392 = c7262M50439.m19392(iM21546, strM15697);
                                            if (strM43586 != null) {
                                                arrayList.add(new RunnableC10945(6, c0206M19392, strM43586));
                                            }
                                            if (c18923M21784 != null && c18923M21784.m43586().equals("true")) {
                                                c18597.add(iM21546);
                                            }
                                            if (string != 0 && string.m43586().equals("true")) {
                                                c18598.add(iM21546);
                                            }
                                            if (c18923M21785 != null && c18923M21785.m43586().equals("true")) {
                                                c18599.add(iM21546);
                                            }
                                            C18623 c18623 = new C18623(c8340M21547.m21785().size());
                                            C18597 c185910 = new C18597(c8340M21547.m21785().size());
                                            ArrayList arrayList5 = new ArrayList();
                                            Iterator itM21779 = C8340.m21773(c8340M21547, str);
                                            while (itM21779.hasNext()) {
                                                C8340 c8345 = (C8340) itM21779.next();
                                                C18923 c18923M217811 = c8345.m21786("id");
                                                C18923 c18923M217812 = c8345.m21786(str3);
                                                Iterator it8 = itM21779;
                                                String str4 = str2;
                                                C18923 c18923M217813 = c8345.m21780(str4);
                                                String str5 = str;
                                                int iM21547 = (m21544(c18923M217811) & 65535) | (c7262M50439.mo19106() << 24) | (c0206M19392.mo26942() << 16);
                                                String strM21561 = m21561(c18923M217812);
                                                final String strM43587 = c18923M217813 == null ? null : c18923M217813.m43586();
                                                if (!c18623.add(strM21561)) {
                                                    throw new C4811("Duplicate name: " + c18923M217812.m43586(), c18923M217812);
                                                }
                                                if (!c185910.add(iM21547)) {
                                                    throw new C4811("Duplicate id: " + c18923M217811.m43586(), c18923M217811);
                                                }
                                                if (strM43587 != null) {
                                                    final int i2 = iM21547 & 65535;
                                                    arrayList.add(new Runnable() { // from class: l.۬ܳۘ
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            c0206M19392.m1525(i2, strM43587);
                                                        }
                                                    });
                                                }
                                                int i3 = iM21547 & 65535;
                                                c0206M19392.m1526(i3, strM21561, false);
                                                m21553(c8345, c0206M19392, i3);
                                                arrayList5.add(new C0787(iM21547, c8345.m51157(), c8345.m51158()));
                                                itM21779 = it8;
                                                str2 = str4;
                                                str3 = str3;
                                                str = str5;
                                            }
                                            String str6 = str;
                                            String str7 = str3;
                                            String str8 = str2;
                                            if (concurrentMapC13783 != 0) {
                                                concurrentMapC13783.put(string, arrayList5);
                                            }
                                            c8340M21547.m21787();
                                            r9 = this;
                                            concurrentMapC13784 = concurrentMapC13783;
                                            it6 = it7;
                                            c8516 = c8517;
                                            c5693 = c5695;
                                            c7262M50439 = c7262M50439;
                                            str2 = str8;
                                            str3 = str7;
                                            str = str6;
                                            map = map;
                                        } catch (Exception e3) {
                                            throw new C4811(e3.getMessage(), c8340M21547.m21786("id"));
                                        }
                                    } catch (C4811 e4) {
                                        e = e4;
                                        string = string;
                                    }
                                } catch (C4811 e5) {
                                    e = e5;
                                }
                                throw new C8563(string, e);
                            }
                            C5693 c5696 = c5693;
                            C8516 c8518 = c8516;
                            C7262 c7262 = c7262M50439;
                            String str9 = str2;
                            String str10 = str3;
                            if (!interfaceC24022.mo2357()) {
                                Iterator it9 = c7262.mo19112().iterator();
                                while (it9.hasNext()) {
                                    C0206 c0206 = (C0206) it9.next();
                                    String typeName = c0206.getTypeName();
                                    boolean z2 = typeName.equals("attr") || typeName.equals("id") || typeName.equals("^attr-private");
                                    final String str11 = c5696.m15697() + "/" + typeName + "/" + typeName;
                                    List<C19146> list = (List) C9030.stream(map.entrySet()).filter(new Predicate() { // from class: l.ۘܳۘ
                                        @Override // java.util.function.Predicate
                                        public /* synthetic */ Predicate and(Predicate predicate) {
                                            return C8512.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* JADX INFO: renamed from: negate */
                                        public /* synthetic */ Predicate mo9645negate() {
                                            return C8512.$default$negate(this);
                                        }

                                        public /* synthetic */ Predicate or(Predicate predicate) {
                                            return C8512.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj) {
                                            return ((String) ((Map.Entry) obj).getKey()).startsWith(str11);
                                        }
                                    }).map(new C5008(1)).sorted().collect(C1890.toList());
                                    final C2820 c2820 = new C2820();
                                    c2820.f10704 = c18597.contains(c0206.mo26942());
                                    c2820.f10703 = c18598.contains(c0206.mo26942());
                                    c2820.f10702 = c18599.contains(c0206.mo26942());
                                    final C5851 c5851M1535 = c0206.m1535();
                                    for (final C19146 c19146 : list) {
                                        try {
                                            final C21373 c21373M1523 = c0206.m1523(C15916.m37840(c19146.f61840.substring(str11.length()), c7262.mo19107()));
                                            C0206 c0207 = c0206;
                                            ArrayList arrayList6 = arrayList4;
                                            arrayList6.add(z2 ? 0 : arrayList4.size(), new InterfaceC15285() { // from class: l.ۢ᩻ۘ
                                                @Override // l.InterfaceC15285
                                                public final void run() throws C8563 {
                                                    C8229.m21552(this.f33874, c19146, c112810, c21373M1523, c5851M1535, c2820, concurrentMapC13783);
                                                }
                                            });
                                            arrayList = arrayList;
                                            it9 = it9;
                                            c18599 = c18599;
                                            c18598 = c18598;
                                            arrayList4 = arrayList6;
                                            c0206 = c0207;
                                        } catch (Exception unused) {
                                            throw new IOException("Name format error: " + C21420.m47956(c19146.f61840));
                                        }
                                    }
                                    C18597 c185911 = c18599;
                                    C18597 c185912 = c18598;
                                    Iterator it10 = it9;
                                    ArrayList arrayList7 = arrayList4;
                                    ArrayList arrayList8 = arrayList;
                                    if (!interfaceC24022.mo2357()) {
                                        arrayList = arrayList8;
                                        it9 = it10;
                                        c18599 = c185911;
                                        c18598 = c185912;
                                        arrayList4 = arrayList7;
                                    }
                                }
                                i = 1;
                                c82210 = this;
                                arrayList2 = arrayList4;
                                c22785M50434 = c22785;
                                c8516 = c8518;
                                c11288 = c112810;
                                str2 = str9;
                                str3 = str10;
                            }
                        }
                        return c22785;
                    } catch (RuntimeException e6) {
                        throw new C4811(e6.getMessage(), c8340M21546);
                    }
                } catch (C4811 e7) {
                    e = e7;
                }
            } catch (C4811 e8) {
                e = e8;
            }
            throw new C8563(c14161M15699.m34233(), e);
        }
        ArrayList<InterfaceC15285> arrayList9 = arrayList2;
        ArrayList arrayList10 = arrayList;
        c22785 = c22785M50434;
        C8516 c8519 = new C8516(arrayList9.size());
        c8519.m22241(new C21007(2, interfaceC24022));
        for (InterfaceC15285 interfaceC15285 : arrayList9) {
            c8519.m22242(1);
            interfaceC15285.run();
            if (interfaceC24022.mo2357()) {
                return c22785;
            }
        }
        Iterator it11 = arrayList10.iterator();
        while (it11.hasNext()) {
            ((Runnable) it11.next()).run();
        }
        if (z) {
            try {
                c22785.mo10755(C22785.m50435(new C1493(m21592().m33320("resources")), EnumC6556.CREATE));
                return c22785;
            } catch (Exception e9) {
                throw new RuntimeException(e9);
            }
        }
        return c22785;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21553(C8340 c8340, C0206 c0206, int i) throws C4811 {
        C18923 c18923M21780 = c8340.m21780("stagedApi");
        if (c18923M21780 != null && !"true".equals(c18923M21780.m43586()) && !"false".equals(c18923M21780.m43586())) {
            throw new C4811("Boolean value required: stagedApi", c18923M21780);
        }
        int i2 = 0;
        c0206.m1540(i, c18923M21780 != null && "true".equals(c18923M21780.m43586()));
        C18923 c18923M21781 = c8340.m21780("extraTypeSpecFlags");
        if (c18923M21781 != null) {
            String strM43586 = c18923M21781.m43586();
            try {
                boolean zStartsWith = strM43586.startsWith("0x");
                String strSubstring = zStartsWith ? strM43586.substring(2) : strM43586;
                if (strSubstring.isEmpty() || strSubstring.charAt(0) == '-' || strSubstring.charAt(0) == '+') {
                    throw new NumberFormatException();
                }
                long j = Long.parseLong(strSubstring, zStartsWith ? 16 : 10);
                if (j < 0 || j > 4294967295L) {
                    throw new NumberFormatException();
                }
                i2 = (int) j;
                if (((c0206.m1543().mo19107().m27728() | 1610874879) & i2) != 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException unused) {
                throw new C4811(C0252.m1693("Invalid extraTypeSpecFlags: ", strM43586), c18923M21781);
            }
        }
        c0206.m1539(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m21544(C18923 c18923) throws C4811 {
        String strM43586 = c18923.m43586();
        if (C6461.m17655(strM43586)) {
            return C6461.m17654(strM43586.substring(2));
        }
        if (C6461.m17645(strM43586)) {
            return Integer.parseInt(strM43586);
        }
        throw new C4811(C0242.m1617("Integer value required: ", c18923.m43584(), "=\"", c18923.m43586(), "\""), c18923);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m21561(C18923 c18923) throws C4811 {
        String strM43586 = c18923.m43586();
        if (strM43586.isEmpty()) {
            throw new C4811(C16523.m38890("Value required: ", c18923.m43584(), "=\"\""), c18923);
        }
        return strM43586;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C8340 m21546(String str, Map map) throws C8142 {
        C19146 c19146 = (C19146) map.get(str);
        if (c19146 != null) {
            return m21564(c19146);
        }
        throw new C8142(C0252.m1693("Xml not found: ", str));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C8340 m21564(C19146 c19146) {
        return new C18812(this, c19146).m43415();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18597 m21600(String str) {
        final String strM37076 = C15489.m37076(str, "/");
        List list = (List) C9030.stream(this.f28645.entrySet()).filter(new Predicate() { // from class: l.ۙܳۘ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                String str2 = (String) ((Map.Entry) obj).getKey();
                return str2.startsWith(strM37076) && str2.endsWith("/type-info");
            }
        }).map(new C5008(1)).collect(C1890.toList());
        C18597 c18597 = new C18597();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                c18597.add(m21544(m21564((C19146) it.next()).m21786("id")) & 255);
            } catch (Exception unused) {
            }
        }
        return c18597;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC10977 m21596(String str) throws IOException {
        int iIndexOf = str.indexOf(47);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        C19146 c19146 = (C19146) this.f28645.get(str + "/package-info");
        if (c19146 == null) {
            throw new IOException(C0252.m1693("Package metadata is missing: ", str));
        }
        C8340 c8340M21564 = m21564(c19146);
        try {
            C18923 c18923M21780 = c8340M21564.m21780("configLayout");
            return c18923M21780 == null ? EnumC10977.AOSP : EnumC10977.m27726(c18923M21780.m43586());
        } finally {
            c8340M21564.m21787();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21574(int i, String str) {
        C19146 c19146 = (C19146) this.f28645.get(C15489.m37076(str, "/package-info"));
        if (c19146 == null) {
            return i;
        }
        try {
            return m21544(m21564(c19146).m21786("id")) & 255;
        } catch (Exception unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m21606(String str) {
        C19146 c19146 = (C19146) this.f28645.get(C15489.m37076(str, "/type-info"));
        if (c19146 != null) {
            C13626 c13626 = c19146.f61839;
            int iMo33991 = c13626 != null ? (int) (c13626.m33318().mo33991() / 1000) : 0;
            int i = c19146.f61843;
            if (i != -1 && c19146.f61838 == iMo33991) {
                return i;
            }
            try {
                int iM21544 = m21544(m21564(c19146).m21786("id")) & 255;
                c19146.f61843 = iM21544;
                c19146.f61838 = iMo33991;
                return iM21544;
            } catch (Exception unused) {
                c19146.f61843 = -1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m21599(String str, String str2) {
        int iM21574;
        C19146 c19146;
        C18923 c18923M21780;
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1 && (iM21574 = m21574(-1, str.substring(0, iIndexOf))) != -1 && (c19146 = (C19146) this.f28645.get(str)) != null) {
            try {
                C8340 c8340M21564 = m21564(c19146);
                int iM21544 = m21544(c8340M21564.m21786("id")) & 255;
                Iterator itM21772 = C8340.m21772(c8340M21564);
                while (itM21772.hasNext()) {
                    C8340 c8340 = (C8340) itM21772.next();
                    if (c8340.m21779().equals(Entry.DEFAULT_NAME) && (c18923M21780 = c8340.m21780("name")) != null && c18923M21780.m43586().equals(str2)) {
                        String strM43586 = c8340.m21786("id").m43586();
                        return (Integer.parseInt(strM43586.substring(strM43586.length() - 4), 16) & 65535) | (iM21574 << 24) | (iM21544 << 16);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m21590(String str) {
        C18923 c18923M21780;
        Iterator it = this.f28645.values().iterator();
        while (true) {
            C8340 c8340M43415 = null;
            if (!it.hasNext()) {
                return null;
            }
            C19146 c19146 = (C19146) it.next();
            if (c19146.f61840.endsWith("/package-info")) {
                String[] strArrSplit = c19146.f61840.split("/");
                if (strArrSplit.length != 2) {
                    continue;
                } else {
                    try {
                        c8340M43415 = new C18812(this, c19146).m43415();
                    } catch (IOException | C4811 unused) {
                    }
                    if (c8340M43415 != null && c8340M43415.m21779().equals("package") && (c18923M21780 = c8340M43415.m21780("prefix")) != null && c18923M21780.m43586().equals(str)) {
                        return strArrSplit[0];
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList m21595(String str, String str2) {
        C8340 c8340M43415;
        C18923 c18923M21780;
        ArrayList arrayList = new ArrayList();
        for (C19146 c19146 : this.f28645.values()) {
            String str3 = c19146.f61840;
            if (str3.startsWith(str)) {
                String strSubstring = str3.substring(str.length());
                if (strSubstring.indexOf(47) == -1) {
                    try {
                        c8340M43415 = new C18812(this, c19146).m43415();
                    } catch (IOException | C4811 unused) {
                        c8340M43415 = null;
                    }
                    if (c8340M43415 != null) {
                        if (c8340M43415.m21779().equals("type")) {
                            Iterator itM21772 = C8340.m21772(c8340M43415);
                            while (itM21772.hasNext()) {
                                C8340 c8340 = (C8340) itM21772.next();
                                if (c8340.m21779().equals(Entry.DEFAULT_NAME) && (c18923M21780 = c8340.m21780("name")) != null && c18923M21780.m43586().equals(str2)) {
                                    C8500 c8500M22223 = C8500.m22223(c18923M21780.m43583(), c18923M21780.m43585() - 1);
                                    c8500M22223.f29474 = true;
                                    arrayList.add(new C21634(strSubstring, str3, c8500M22223));
                                    break;
                                }
                            }
                        } else if (c8340M43415.m21779().equals("resources")) {
                            Iterator itM21773 = C8340.m21772(c8340M43415);
                            while (itM21773.hasNext()) {
                                C18923 c18923M21781 = ((C8340) itM21773.next()).m21780("name");
                                if (c18923M21781 != null && c18923M21781.m43586().equals(str2)) {
                                    C8500 c8500M22224 = C8500.m22223(c18923M21781.m43583(), c18923M21781.m43585() - 1);
                                    c8500M22224.f29474 = true;
                                    arrayList.add(new C21634(strSubstring, str3, c8500M22224));
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21580(ActivityC5677 activityC5677, C0392 c0392) {
        this.f28648.m39052(activityC5677, c0392);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m21601() {
        C13626 c13626M21557 = m21557();
        if (!c13626M21557.m33326()) {
            c13626M21557 = new C13626(m21592(), "resources");
        }
        return c13626M21557.m33318();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m21598() throws IOException {
        C13626 c13626M47188 = m47188();
        c13626M47188.m33318().m46739();
        C13626 c13626M21557 = m21557();
        if (!c13626M21557.m33326()) {
            c13626M21557 = new C13626(m21592(), "resources");
        }
        C13626 c13626 = new C13626(c13626M47188, this.f28635);
        InputStream inputStreamM33328 = c13626M21557.m33328();
        try {
            OutputStream outputStreamMo33976 = c13626.m33318().mo33976(false);
            try {
                C20010.m45301(inputStreamM33328, outputStreamMo33976);
                if (outputStreamMo33976 != null) {
                    outputStreamMo33976.close();
                }
                if (inputStreamM33328 != null) {
                    inputStreamM33328.close();
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
        } catch (Throwable th3) {
            if (inputStreamM33328 != null) {
                try {
                    inputStreamM33328.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21585(AbstractC20745 abstractC20745, boolean z) throws IOException {
        abstractC20745.mo33987();
        C13626 c13626M21557 = m21557();
        if (c13626M21557.m33326()) {
            AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(this.f28635);
            if (z) {
                abstractC20745M46690.m46687();
            }
            try {
                InputStream inputStreamM33328 = c13626M21557.m33328();
                try {
                    OutputStream outputStreamMo33976 = abstractC20745M46690.mo33976(false);
                    try {
                        C20010.m45301(inputStreamM33328, outputStreamMo33976);
                        if (outputStreamMo33976 != null) {
                            outputStreamMo33976.close();
                        }
                        if (inputStreamM33328 != null) {
                            inputStreamM33328.close();
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
                } catch (Throwable th3) {
                    if (inputStreamM33328 != null) {
                        try {
                            inputStreamM33328.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (IOException e) {
                if (z) {
                    abstractC20745M46690.m46722();
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Collection m21569() {
        int i = 0;
        InterfaceC5046 interfaceC5046Filter = C9030.stream(m21605().values()).flatMap(new C13874(i)).filter(new C11757(i));
        int i2 = 3;
        return (Collection) interfaceC5046Filter.map(new C18663(i2)).distinct().sorted(new C1522(i2)).collect(C1890.toList());
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0229  */
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList m21594() throws Throwable {
        C8340 c8340M21546;
        C8340 c8340M21547;
        Iterator it;
        String str;
        C8340 c8340;
        C19146 c19146;
        C8340 c8340M21564;
        Iterator it2;
        LinkedHashMap linkedHashMap;
        C8229 c8229 = this;
        String str2 = "id";
        HashMap map = c8229.f28645;
        ArrayList arrayList = new ArrayList();
        Iterator it3 = m21602().m15698().iterator();
        while (it3.hasNext()) {
            C5693 c5693 = (C5693) it3.next();
            C14161 c14161M15699 = c5693.m15699("package-info");
            if (c14161M15699 != null) {
                try {
                    c8340M21546 = c8229.m21546(c14161M15699.m34233(), map);
                    try {
                        try {
                            if (!c8340M21546.m21779().equals("package")) {
                                throw new C4811("Expected tag: <package>", c8340M21546);
                            }
                            int iM21544 = m21544(c8340M21546.m21786(str2)) & 255;
                            c8340M21546.m21787();
                            for (C5693 c5694 : c5693.m15698()) {
                                C14161 c14161M156910 = c5694.m15699("type-info");
                                if (c14161M156910 != null) {
                                    String strM34233 = c14161M156910.m34233();
                                    C18623 c18623 = new C18623();
                                    try {
                                        c8340M21547 = c8229.m21546(strM34233, map);
                                        try {
                                            try {
                                                if (!c8340M21547.m21779().equals("type")) {
                                                    throw new C4811("Expected tag: <type>", c8340M21547);
                                                }
                                                int iM21545 = m21544(c8340M21547.m21786(str2)) & 255;
                                                Iterator itM21773 = C8340.m21773(c8340M21547, Entry.DEFAULT_NAME);
                                                int iMax = 0;
                                                while (true) {
                                                    it = it3;
                                                    str = "name";
                                                    if (!itM21773.hasNext()) {
                                                        break;
                                                    }
                                                    C8340 c8341 = (C8340) itM21773.next();
                                                    C18923 c18923M21786 = c8341.m21786(str2);
                                                    c18623.add(m21561(c8341.m21786("name")));
                                                    iMax = Math.max(iMax, (m21544(c18923M21786) & 65535) + 1);
                                                    it3 = it;
                                                }
                                                c8340M21547.m21787();
                                                List<C19146> list = (List) C9030.stream(map.entrySet()).filter(new C3559(0, c5693.m15697() + "/" + c5694.m15697() + "/" + c5694.m15697())).map(new C5008(1)).sorted().collect(C1890.toList());
                                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                for (C19146 c19147 : list) {
                                                    try {
                                                        c8340M21564 = c8229.m21564(c19147);
                                                        try {
                                                            try {
                                                                str2 = str2;
                                                                if (c8340M21564.m21779().equals("resources")) {
                                                                    Iterator itM21772 = C8340.m21772(c8340M21564);
                                                                    while (itM21772.hasNext()) {
                                                                        C18923 c18923M21780 = ((C8340) itM21772.next()).m21780(str);
                                                                        if (c18923M21780 == null) {
                                                                            it2 = itM21772;
                                                                        } else {
                                                                            it2 = itM21772;
                                                                            String strM43586 = c18923M21780.m43586();
                                                                            if (!strM43586.isEmpty() && !c18623.contains(strM43586) && ((C18106) linkedHashMap2.get(strM43586)) == null) {
                                                                                if (iMax > 65535) {
                                                                                    c19146 = c19147;
                                                                                    throw new IOException("No available entry id: " + strM34233);
                                                                                }
                                                                                int i = (iM21544 << 24) | (iM21545 << 16) | iMax;
                                                                                c19146 = c19147;
                                                                                int i2 = iMax;
                                                                                linkedHashMap = linkedHashMap2;
                                                                                try {
                                                                                    linkedHashMap.put(strM43586, new C18106(strM34233, strM43586, i2, i, c19147.f61840, c18923M21780.m43583(), Math.max(c18923M21780.m43585() - 1, 0)));
                                                                                    iMax = i2 + 1;
                                                                                } catch (C4811 e) {
                                                                                    e = e;
                                                                                }
                                                                                e = e;
                                                                                throw new C8563(c19146.f61840, e);
                                                                            }
                                                                            c18623 = c18623;
                                                                            c19147 = c19146;
                                                                            linkedHashMap2 = linkedHashMap;
                                                                            itM21772 = it2;
                                                                            map = map;
                                                                            str = str;
                                                                            c5693 = c5693;
                                                                            iM21544 = iM21544;
                                                                            iM21545 = iM21545;
                                                                        }
                                                                        c19146 = c19147;
                                                                        linkedHashMap = linkedHashMap2;
                                                                        iMax = iMax;
                                                                        c18623 = c18623;
                                                                        c19147 = c19146;
                                                                        linkedHashMap2 = linkedHashMap;
                                                                        itM21772 = it2;
                                                                        map = map;
                                                                        str = str;
                                                                        c5693 = c5693;
                                                                        iM21544 = iM21544;
                                                                        iM21545 = iM21545;
                                                                    }
                                                                    c8340M21564.m21787();
                                                                    iM21544 = iM21544;
                                                                    c8229 = this;
                                                                } else {
                                                                    c8340M21564.m21787();
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                c8340 = c8340M21564;
                                                                if (c8340 != null) {
                                                                    c8340.m21787();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (C4811 e2) {
                                                            e = e2;
                                                            c19146 = c19147;
                                                        }
                                                    } catch (C4811 e3) {
                                                        e = e3;
                                                        c19146 = c19147;
                                                        c8340M21564 = null;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        c8340 = null;
                                                        if (c8340 != null) {
                                                            c8340.m21787();
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                arrayList.addAll(linkedHashMap2.values());
                                                c8229 = this;
                                                it3 = it;
                                                str2 = str2;
                                                iM21544 = iM21544;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                if (c8340M21547 != null) {
                                                    c8340M21547.m21787();
                                                }
                                                throw th;
                                            }
                                        } catch (C4811 e4) {
                                            e = e4;
                                            throw new C8563(strM34233, e);
                                        }
                                    } catch (C4811 e5) {
                                        e = e5;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c8340M21547 = null;
                                    }
                                }
                            }
                            c8229 = this;
                        } catch (Throwable th5) {
                            th = th5;
                            if (c8340M21546 != null) {
                                c8340M21546.m21787();
                            }
                            throw th;
                        }
                    } catch (C4811 e6) {
                        e = e6;
                        throw new C8563(c14161M15699.m34233(), e);
                    }
                } catch (C4811 e7) {
                    e = e7;
                } catch (Throwable th6) {
                    th = th6;
                    c8340M21546 = null;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21578(List list) throws IOException, C8563 {
        if (list.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18106 c18106 = (C18106) it.next();
            ((List) C9735.computeIfAbsent(linkedHashMap, c18106.f57914, new C6072(2))).add(c18106);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            C19146 c19146 = (C19146) this.f28645.get(str);
            if (c19146 == null) {
                throw new IOException(C0252.m1693("Xml not found: ", str));
            }
            String strM21545 = m21545(c19146);
            int iLastIndexOf = strM21545.lastIndexOf("</type>");
            if (iLastIndexOf < 0) {
                throw new IOException(C0252.m1693("Expected tag: </type> in ", str));
            }
            List<C18106> list2 = (List) entry.getValue();
            Collections.sort(list2, C7618.comparingInt(new C5406()));
            StringBuilder sb = new StringBuilder((list2.size() * 64) + strM21545.length());
            sb.append((CharSequence) strM21545, 0, iLastIndexOf);
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != '\n') {
                sb.append('\n');
            }
            for (C18106 c18107 : list2) {
                sb.append("    <entry id=\"");
                sb.append(String.format(Locale.ENGLISH, "0x%08x", Integer.valueOf(c18107.f57920)));
                sb.append("\" name=\"");
                sb.append(C11168.f37848.m35229(c18107.f57919));
                sb.append("\" />\n");
            }
            String strM1616 = C0242.m1616(iLastIndexOf, strM21545, sb);
            try {
                C8340 c8340M21775 = C8340.m21775(strM1616, false);
                if (c8340M21775 != null) {
                    c8340M21775.m21787();
                }
                linkedHashMap2.put(c19146, strM1616);
            } catch (C4811 e) {
                throw new C8563(str, e);
            }
        }
        boolean z = this.f28640;
        this.f28640 = false;
        try {
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                m21584((C19146) entry2.getKey(), (String) entry2.getValue());
            }
            m21587(z);
        } catch (Throwable th) {
            m21587(z);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m21597(String str) {
        C19146 c19146 = (C19146) this.f28645.get(str);
        if (c19146 == null) {
            return -268435456;
        }
        C13626 c13626 = c19146.f61839;
        if (c13626 != null) {
            return Long.valueOf(c13626.m33318().mo33991() ^ c13626.m33318().mo33964()).hashCode();
        }
        return c19146.f61844 != null ? -536870912 : -268435456;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m21570(String str) {
        C19146 c19146 = (C19146) this.f28645.get(str);
        return (c19146 == null || c19146.f61844 == null) ? "" : c19146.m43964();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m21568(String str) throws C8142 {
        C19146 c19146 = (C19146) this.f28645.get(str);
        if (c19146 != null) {
            return m21545(c19146);
        }
        throw new C8142(C0252.m1693("Xml not found: ", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21545(C19146 c19146) throws C8142 {
        C13626 c13626 = c19146.f61839;
        if (c13626 != null) {
            return c13626.m33318().m46730();
        }
        if (c19146.f61844 != null) {
            return c19146.m43964();
        }
        throw new C8142("Bad xml: " + c19146.f61840);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m21591(String str, String str2) throws IOException {
        C19146 c19146 = (C19146) this.f28645.get(str);
        if (c19146 == null) {
            throw new C8142("Xml not found: ".concat(str));
        }
        C8340 c8340M21775 = C8340.m21775(str2, false);
        m21584(c19146, str2);
        C13626 c13626M21565 = m21565(c19146.f61839);
        c13626M21565.m33324();
        byte[] bArrDigest = C22253.m49425().digest(str2.getBytes(StandardCharsets.UTF_8));
        c8340M21775.getClass();
        C11018 c11018 = new C11018();
        c8340M21775.m21781(c11018);
        OutputStream outputStreamMo33976 = c13626M21565.m33318().mo33976(false);
        try {
            outputStreamMo33976.write(bArrDigest);
            outputStreamMo33976.write(c11018.m27788(), 0, c11018.size());
            outputStreamMo33976.close();
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m21571(String str, String str2) throws C8142 {
        C19146 c19146 = (C19146) this.f28645.get(str);
        if (c19146 == null) {
            throw new C8142(C0252.m1693("Xml not found: ", str));
        }
        m21584(c19146, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21584(C19146 c19146, String str) {
        boolean z;
        C13626 c13626 = c19146.f61839;
        String str2 = c19146.f61840;
        if (c13626 == null) {
            c19146.f61839 = new C13626(new C13626(this.f28642, DocumentReader.RESERVED), C15489.m37076(str2, ".xml"));
            z = true;
        } else {
            z = false;
        }
        c19146.f61839.m33318().m46735(str);
        if (this.f28640 && z) {
            this.f28636.add(str2);
            this.f28638.mo23641(C0561.unmodifiableSet(this.f28636));
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m21573(String str) {
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        ArrayList arrayList = new ArrayList();
        for (C19146 c19146 : this.f28645.values()) {
            if (c19146.f61840.startsWith(str)) {
                arrayList.add(c19146.f61840);
            }
        }
        m21577((Collection) arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21577(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            C19146 c19146 = (C19146) this.f28645.remove(str);
            if (c19146 != null) {
                C13626 c13626 = c19146.f61839;
                if (c13626 != null) {
                    c13626.m33323();
                    if (this.f28640) {
                        this.f28636.remove(str);
                        z2 = true;
                    }
                }
                if (c19146.f61844 != null) {
                    sb.append(str);
                    sb.append('\n');
                }
                if (this.f28646.contains(str)) {
                    z = true;
                }
            }
        }
        if (sb.length() > 0) {
            AbstractC20745 abstractC20745M33320 = m21572().m33320("removed");
            try {
                abstractC20745M33320.mo46720();
                abstractC20745M33320.m46717(sb.toString());
            } catch (Throwable th) {
                this.f28647.mo23641(th);
            }
        }
        if (z) {
            m21567();
        }
        if (z2) {
            this.f28638.mo23641(C0561.unmodifiableSet(this.f28636));
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m21566() {
        AbstractC20745 abstractC20745M33320 = m21572().m33320("recent");
        try {
            abstractC20745M33320.getClass();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(abstractC20745M33320.mo33976(false), StandardCharsets.UTF_8));
            try {
                Iterator it = this.f28646.iterator();
                while (it.hasNext()) {
                    bufferedWriter.write((String) it.next());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f28647.mo23641(th3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21575(String str) {
        ArrayList arrayList = this.f28646;
        if (arrayList.isEmpty() || !((String) arrayList.get(0)).equals(str)) {
            arrayList.remove(str);
            arrayList.add(0, str);
            while (arrayList.size() > 30) {
                C19028.m43762(arrayList, 1);
            }
            m21566();
            m21567();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m21593(String str) {
        if (this.f28646.remove(str)) {
            m21566();
            m21567();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m21607() {
        this.f28646.clear();
        m21566();
        m21567();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m21567() {
        ArrayList arrayList = this.f28646;
        this.f28644.mo23641(C0561.unmodifiableList(new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 15)))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21581(ActivityC5677 activityC5677, C16450 c16450) {
        this.f28647.m44959(activityC5677, c16450);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21583(C9497 c9497, C20080 c20080) {
        this.f28644.m44959(c9497, c20080);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21582(C9497 c9497, C0323 c0323) {
        this.f28638.m44959(c9497, c0323);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21589(ActivityC5677 activityC5677, C18377 c18377) {
        boolean z;
        boolean z2;
        int i = 0;
        if (m47186()) {
            boolean zMo33975 = m21572().m33320("strings_changed").mo33975();
            int i2 = 1;
            if (activityC5677.m15665()) {
                z = true;
            } else {
                if (this.f28637 || this.f28634) {
                    z2 = true;
                } else {
                    try {
                        if (!m21556()) {
                            C23046 c23046 = new C23046(this);
                            c23046.m50978();
                            if (c23046.f74865.isEmpty() && this.f28639 == c23046.f74866.size()) {
                                z2 = false;
                            } else {
                                C13626 c13626M21557 = m21557();
                                C13626 c13626 = new C13626(m47184(), "arscBuild/resources.digest");
                                if (c13626M21557.m33326() && c13626.m33326()) {
                                    z2 = !m21554(c13626M21557, c13626, c23046.m50979());
                                }
                            }
                            this.f28634 = z2;
                        }
                        z2 = true;
                        this.f28634 = z2;
                    } catch (Exception unused) {
                        this.f28634 = true;
                        z2 = true;
                    }
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (zMo33975) {
                int i3 = DialogInterfaceC19356.f62401;
                C8067 c8067 = new C8067(activityC5677);
                c8067.m21274(R.string.MT_Protector);
                c8067.m21253(R.string.MT_Protector);
                c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2148(i, c18377));
                if (z) {
                    c8067.m21271(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2583(i, activityC5677));
                } else {
                    c8067.m21271(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6675(activityC5677, i2));
                }
                c8067.m21269();
                return true;
            }
            if (z) {
                activityC5677.m15682();
                return true;
            }
        }
        return false;
    }
}
