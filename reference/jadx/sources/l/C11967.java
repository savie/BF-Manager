package l;

import android.content.DialogInterface;
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
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.simpleframework.xml.core.Entry;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.ۧ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes4.dex */
public final class C11967 extends C3413 {

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final int f38520 = C15022.m36183().getDigestLength();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Set f38521;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f38522;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f38523;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f38524;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17930 f38525;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f38526;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17930 f38527;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C17930 f38528;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C2329 f38529;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f38530;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f38531;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9378 f38532;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f38533;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f38534;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C0107 f38535;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29953(C11967 c11967, C16946 c16946, C12426 c12426, C20017 c20017, C6593 c6593, C1372 c1372, Map map) throws C17692 {
        String str = c16946.f55358;
        try {
            C2008 c2008M29964 = c11967.m29964(c16946);
            c12426.m30904();
            C24361.m54438(c2008M29964, c20017, c12426, c6593, c1372);
            List listM30900 = c12426.m30900();
            if (map != null) {
                map.put(str, listM30900);
            }
            c2008M29964.m6862();
        } catch (C10254 e) {
            throw new C17692(str, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m29973(String str, String str2) {
        if (!this.f38534.containsKey(str)) {
            C16946 c16946 = new C16946(str, false);
            C9378 c9378 = new C9378(new C9378(this.f38532, DocumentReader.RESERVED), str + ".xml");
            c16946.f55357 = c9378;
            c9378.m24699().m49879(str2);
            this.f38534.put(str, c16946);
            if (this.f38524) {
                this.f38521.add(str);
                this.f38525.mo40348(C4681.unmodifiableSet(this.f38521));
            }
        } else {
            throw new C3090("Xml exists: " + str);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C11967 m29958(C9378 c9378) {
        return new C11967(c9378);
    }

    public C11967(C9378 c9378) throws IOException {
        super(c9378);
        this.f38534 = new HashMap();
        this.f38530 = new ArrayList();
        Set set = Collections.EMPTY_SET;
        this.f38521 = set;
        this.f38529 = new C2329();
        this.f38527 = new C17930();
        this.f38528 = new C17930();
        this.f38525 = new C17930();
        this.f38524 = true;
        this.f38531 = false;
        this.f38535 = new C0107();
        C9378 c9379 = new C9378(c9378, "arsc");
        this.f38532 = c9379;
        C11972.m30026(c9379.m24702());
        AbstractC22044 abstractC22044M24694 = m29968().m24694("removed");
        Set set2 = set;
        if (abstractC22044M24694.mo2934()) {
            BufferedReader bufferedReaderM49863 = abstractC22044M24694.m49863();
            try {
                HashSet hashSet = new HashSet();
                while (true) {
                    String line = bufferedReaderM49863.readLine();
                    if (line == null) {
                        break;
                    } else {
                        hashSet.add(line);
                    }
                }
                bufferedReaderM49863.close();
                set2 = hashSet;
            } catch (Throwable th) {
                try {
                    bufferedReaderM49863.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C9378 c93710 = new C9378(m29991(), "xmls");
        if (!c93710.m24702()) {
            throw new IOException("File not found: " + c93710.m24693());
        }
        ArrayList<C16946> arrayListM29966 = m29966(c93710);
        this.f38522 = arrayListM29966.size();
        for (C16946 c16946 : arrayListM29966) {
            if (!set2.contains(c16946.f55358)) {
                this.f38534.put(c16946.f55358, c16946);
            }
        }
        m30002();
        ArrayList arrayList = this.f38530;
        AbstractC22044 abstractC22044M24695 = m29968().m24694("recent");
        if (abstractC22044M24695.mo2934()) {
            arrayList.clear();
            BufferedReader bufferedReaderM49864 = abstractC22044M24695.m49863();
            while (true) {
                try {
                    String line2 = bufferedReaderM49864.readLine();
                    if (line2 == null) {
                        break;
                    } else if (!line2.isEmpty()) {
                        arrayList.add(line2);
                    }
                } catch (Throwable th3) {
                    try {
                        bufferedReaderM49864.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            bufferedReaderM49864.close();
            m29942();
        }
        this.f38533 = new C9378(m29968(), "name").m24699().m49871();
        C9378 c93711 = new C9378(m29968(), "pkgsort");
        if (c93711.m24702()) {
            C20348 c20348 = new C20348(c93711.m24700());
            C17364.m40795((InterfaceC15872) c20348, -1430501583);
            while (c20348.available() > 0) {
                this.f38529.mo7845(c20348.m46749(), (Object) c20348.m46758());
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static ArrayList m29966(C9378 c9378) {
        boolean z;
        C24078 c24078 = new C24078(c9378.m24699());
        try {
            if (c24078.m53626() == 1920094587) {
                c24078.skipBytes(4);
                z = true;
            } else {
                C17364.m40795(c24078, 1920094586);
                z = false;
            }
            int i = c24078.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                String strM53630 = c24078.m53630();
                int i3 = c24078.readInt();
                int i4 = c24078.readInt();
                C16946 c16946 = new C16946(strM53630, z);
                c16946.f55363 = c9378;
                c16946.f55360 = i3;
                c16946.f55361 = i4;
                arrayList.add(c16946);
            }
            c24078.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                c24078.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9378 m29991() {
        return new C9378(this.f38532, e.m);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9378 m29968() {
        return new C9378(this.f38532, "config");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m30008() {
        return this.f38533;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29984(boolean z) {
        this.f38524 = z;
        if (z) {
            m30002();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m29954(C9378 c9378, C9378 c9379, byte[] bArr) {
        if (this.f38531 || !c9378.m24702() || !c9379.m24702()) {
            return false;
        }
        try {
            C20348 c20348 = new C20348(c9379.m24700());
            C17364.m40795((InterfaceC15872) c20348, 1936945938);
            if (!Arrays.equals(c20348.m46748(), bArr)) {
                return false;
            }
            MessageDigest messageDigestM36174 = C15022.m36174();
            C15022.m36175(messageDigestM36174, c9378.m24699().mo4290());
            return Arrays.equals(c20348.m46748(), messageDigestM36174.digest());
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m30009(String str) {
        return this.f38534.containsKey(str);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Collection m30007() {
        return this.f38534.values();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C19782 m29997() {
        C15306 c15306M36752 = C15306.m36752(this.f38534.keySet());
        c15306M36752.m36758(new C8589());
        C19782 c19782M36756 = c15306M36752.m36756();
        Collections.sort(c19782M36756.m45559(), new C7098(this));
        return c19782M36756;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m29944(C11967 c11967, C19782 c19782, C19782 c19783) {
        C2329 c2329 = c11967.f38529;
        int iMo13099 = c2329.mo13099(EnumC5810.f19964, c19782.m45562());
        int iMo130910 = c2329.mo13099(EnumC5810.f19964, c19783.m45562());
        if (iMo13099 == iMo130910) {
            return c19782.m45562().compareToIgnoreCase(c19783.m45562());
        }
        return Integer.compare(iMo13099, iMo130910);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m30002() {
        C9378[] c9378Arr;
        int i;
        int i2;
        if (!this.f38524) {
            throw new IllegalStateException();
        }
        HashMap map = this.f38534;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C16946) it.next()).f55357 = null;
        }
        C9378[] c9378ArrM24698 = new C9378(this.f38532, DocumentReader.RESERVED).m24698();
        int i3 = 0;
        if (c9378ArrM24698 == null) {
            c9378ArrM24698 = new C9378[0];
        }
        int length = c9378ArrM24698.length;
        int i4 = 0;
        while (i4 < length) {
            C9378 c9378 = c9378ArrM24698[i4];
            if (c9378.m24699().mo4281()) {
                String str = c9378.getName() + "/";
                C9378 c9379 = new C9378(c9378, "package-info.xml");
                if (c9379.m24702()) {
                    String strM34972 = C14483.m34972(str, "package-info");
                    C16946 c16946 = (C16946) map.get(strM34972);
                    if (c16946 == null) {
                        c16946 = new C16946(strM34972, i3);
                        map.put(strM34972, c16946);
                    }
                    c16946.f55357 = c9379;
                }
                C9378[] c9378ArrM24699 = c9378.m24698();
                if (c9378ArrM24699 == null) {
                    c9378ArrM24699 = new C9378[i3];
                }
                int length2 = c9378ArrM24699.length;
                int i5 = 0;
                int i6 = i3;
                while (i5 < length2) {
                    C9378 c93710 = c9378ArrM24699[i5];
                    if (c93710.m24699().mo4281()) {
                        String name = c93710.getName();
                        String strM46451 = C20196.m46451(str, name, "/");
                        C9378[] c9378ArrM246910 = c93710.m24698();
                        if (c9378ArrM246910 == null) {
                            c9378ArrM246910 = new C9378[i6];
                        }
                        int length3 = c9378ArrM246910.length;
                        int i7 = 0;
                        while (i7 < length3) {
                            C9378 c93711 = c9378ArrM246910[i7];
                            if (c93711.m24699().mo4304()) {
                                c9378Arr = c9378ArrM24698;
                                i = length3;
                                if (c93711.getName().toLowerCase().endsWith(".xml")) {
                                    i2 = length;
                                    String strM5124 = C1402.m5124(4, 0, c93711.getName());
                                    if (strM5124.startsWith(name) || strM5124.equals("type-info")) {
                                        String strM34973 = C14483.m34972(strM46451, strM5124);
                                        C16946 c16947 = (C16946) map.get(strM34973);
                                        if (c16947 == null) {
                                            c16947 = new C16946(strM34973, false);
                                            map.put(strM34973, c16947);
                                        }
                                        c16947.f55357 = c93711;
                                    }
                                }
                                i7++;
                                length3 = i;
                                c9378ArrM24698 = c9378Arr;
                                length = i2;
                            } else {
                                c9378Arr = c9378ArrM24698;
                                i = length3;
                            }
                            i2 = length;
                            i7++;
                            length3 = i;
                            c9378ArrM24698 = c9378Arr;
                            length = i2;
                        }
                    }
                    i5++;
                    i6 = 0;
                    c9378ArrM24698 = c9378ArrM24698;
                    length = length;
                }
            }
            i4++;
            i3 = 0;
            c9378ArrM24698 = c9378ArrM24698;
            length = length;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            C16946 c16948 = (C16946) ((Map.Entry) it2.next()).getValue();
            if (c16948.f55357 != null) {
                hashSet.add(c16948.f55358);
            } else if (c16948.f55363 == null) {
                it2.remove();
            }
        }
        C17930 c17930 = this.f38525;
        Set set = (Set) c17930.m40346();
        if (set != null && set.size() == hashSet.size() && set.containsAll(hashSet)) {
            return;
        }
        this.f38521 = hashSet;
        c17930.mo40348(C4681.unmodifiableSet(hashSet));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29976(ConcurrentLinkedQueue concurrentLinkedQueue, String str, boolean z, Set set) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        for (C16946 c16946 : this.f38534.values()) {
            String str2 = c16946.f55358;
            if (set == null || set.contains(str2)) {
                if (str2.startsWith(str) && (z || str2.indexOf(47, str.length()) == -1)) {
                    concurrentLinkedQueue.add(new C2273(this, c16946));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C9378 m29965(C9378 c9378) {
        return new C9378(m11158(), C25272.m56409("arscBuild", c9378.m24693().substring(new C9378(this.f38532, DocumentReader.RESERVED).m24693().length()) + ".bin"));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C9378 m29959() {
        return new C9378(m11158(), "arscBuild/resources.arsc");
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private boolean m29967() {
        Iterator it = this.f38534.values().iterator();
        while (true) {
            boolean zM29955 = false;
            if (!it.hasNext()) {
                return false;
            }
            C9378 c9378 = ((C16946) it.next()).f55357;
            if (c9378 != null) {
                C9378 c9378M29965 = m29965(c9378);
                if (c9378M29965.m24702()) {
                    zM29955 = m29955(C15022.m36183().digest(c9378.m24700()), c9378M29965);
                }
                if (!zM29955) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2008 m29963(C9378 c9378, C9378 c9379) throws IOException {
        byte[] bArrM24700 = c9378.m24700();
        byte[] bArrDigest = C15022.m36183().digest(bArrM24700);
        if (m29955(bArrDigest, c9379)) {
            return null;
        }
        C2008 c2008M6850 = C2008.m6850(new String(bArrM24700, StandardCharsets.UTF_8), false);
        c2008M6850.getClass();
        C6178 c6178 = new C6178();
        c2008M6850.m6855(c6178);
        c9379.m24701();
        OutputStream outputStreamMo4289 = c9379.m24699().mo4289(false);
        try {
            outputStreamMo4289.write(bArrDigest);
            outputStreamMo4289.write(c6178.m17808(), 0, c6178.size());
            outputStreamMo4289.close();
            return c2008M6850;
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29955(byte[] bArr, C9378 c9378) {
        if (c9378.m24702()) {
            try {
                InputStream inputStreamM24703 = c9378.m24703();
                try {
                    for (int i : bArr) {
                        if (inputStreamM24703.read() != (i & 255)) {
                            inputStreamM24703.close();
                            return false;
                        }
                    }
                    if (inputStreamM24703 != null) {
                        inputStreamM24703.close();
                    }
                    return true;
                } catch (Throwable th) {
                    if (inputStreamM24703 != null) {
                        try {
                            inputStreamM24703.close();
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
    public static C2008 m29947(C9378 c9378) {
        C20348 c20348 = new C20348(c9378.m24700());
        c20348.skipBytes(f38520);
        return C2008.m6851(c20348);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 m29999() {
        boolean zM29956;
        int i;
        int i2;
        int i3;
        String str;
        C25042[] c25042Arr;
        String strM53629;
        int i4 = 1;
        if (this.f38531 || this.f38523) {
            zM29956 = true;
        } else {
            try {
                zM29956 = m29956();
                this.f38523 = zM29956;
            } catch (Exception unused) {
                this.f38523 = true;
                zM29956 = true;
            }
        }
        if (zM29956) {
            try {
                this.f38531 = true;
                m29985(false, (InterfaceC4115) new C23156());
                this.f38531 = false;
            } catch (Throwable th) {
                this.f38531 = false;
                throw th;
            }
        }
        C24078 c24078 = new C24078(new C9378(m11158(), "arscBuild/records").m24699());
        C17364.m40795(c24078, -416934225);
        c24078.skipBytes(c24078.readInt());
        int i5 = c24078.readInt();
        ConcurrentMapC17249 concurrentMapC17249 = new ConcurrentMapC17249(i5);
        int i6 = 0;
        while (i6 < i5) {
            String strM53630 = c24078.m53630();
            int i7 = c24078.readInt();
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            while (i8 < i7) {
                int i9 = c24078.readByte() & 255;
                int i10 = c24078.readInt();
                int i11 = c24078.readInt();
                C25042[] c25042Arr2 = null;
                if (i9 == 0) {
                    i = i5;
                    i2 = c24078.readInt();
                    i3 = i9;
                    str = null;
                    c25042Arr = null;
                } else {
                    if (i9 == i4) {
                        i = i5;
                        strM53629 = c24078.m53629();
                    } else if (i9 == 2 || i9 == 3) {
                        i = i5;
                        i2 = c24078.readInt();
                        i3 = i9;
                        str = null;
                        c25042Arr = null;
                    } else if (i9 == 101) {
                        strM53629 = c24078.m53629();
                        int iM53628 = c24078.m53628();
                        c25042Arr2 = new C25042[iM53628];
                        int i12 = 0;
                        while (i12 < iM53628) {
                            c25042Arr2[i12] = new C25042(c24078.m53630(), c24078.readInt(), c24078.readInt());
                            i12++;
                            i5 = i5;
                        }
                        i = i5;
                        i9 = 1;
                    } else {
                        throw new RuntimeException();
                    }
                    str = strM53629;
                    i3 = i9;
                    c25042Arr = c25042Arr2;
                    i2 = 0;
                }
                arrayList.add(new C9442(i3, i2, str, c25042Arr, i10, i11));
                i8++;
                i4 = 1;
                i5 = i;
            }
            concurrentMapC17249.put(strM53630, arrayList);
            i6++;
            i4 = 1;
        }
        return concurrentMapC17249;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private boolean m29956() {
        if (!m29967()) {
            C9378 c9378 = new C9378(m11158(), "arscBuild/records");
            if (c9378.m24702()) {
                C20172 c20172 = new C20172(this);
                c20172.m46399();
                byte[] bArrM46400 = c20172.m46400();
                boolean zEquals = false;
                if (!this.f38531 && c9378.m24702()) {
                    byte[] bArr = new byte[bArrM46400.length + 8];
                    try {
                        new DataInputStream(c9378.m24703()).readFully(bArr);
                        C20348 c20348 = new C20348(bArr);
                        C17364.m40795((InterfaceC15872) c20348, -416934225);
                        C17364.m40795((InterfaceC15872) c20348, bArrM46400.length);
                        c20348.seek(4L);
                        zEquals = Arrays.equals(c20348.m46748(), bArrM46400);
                    } catch (Exception unused) {
                    }
                }
                return !zEquals;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29985(boolean z, InterfaceC4115 interfaceC4115) throws IOException, C17692 {
        HashMap map = this.f38534;
        for (C16946 c16946 : map.values()) {
            C9378 c9378 = c16946.f55357;
            String str = c16946.f55358;
            if (c9378 != null) {
                interfaceC4115.mo13207(str);
                try {
                    m29963(c9378, m29965(c9378));
                } catch (C10254 e) {
                    throw new C17692(str, e);
                }
            }
        }
        interfaceC4115.mo13206();
        C20172 c20172 = new C20172(this);
        c20172.m46399();
        C9378 c9378M29959 = m29959();
        C9378 c9379 = new C9378(m11158(), "arscBuild/resources.digest");
        C9378 c93710 = new C9378(m11158(), "arscBuild/records");
        if (c20172.f64787.isEmpty() && this.f38522 == c20172.f64788.size() && !this.f38531) {
            c9378M29959.m24697();
            c9379.m24697();
            this.f38526 = false;
            return;
        }
        if (interfaceC4115.mo924()) {
            return;
        }
        byte[] bArrM46400 = c20172.m46400();
        if (m29954(c9378M29959, c9379, bArrM46400)) {
            this.f38526 = false;
            return;
        }
        if (interfaceC4115.mo924()) {
            return;
        }
        ConcurrentMapC17249 concurrentMapC17249 = new ConcurrentMapC17249();
        try {
            C23001 c23001M29951 = m29951(map, interfaceC4115, concurrentMapC17249, false);
            C2008.m6852();
            if (interfaceC4115.mo924()) {
                return;
            }
            interfaceC4115.mo13208();
            c9378M29959.m24697();
            c9379.m24697();
            if (z) {
                C3374 c3374M51896 = c23001M29951.m51896();
                c3374M51896.m11078(new C13809(0, interfaceC4115));
                c9378M29959.m24701();
                C14380 c14380 = new C14380(c9378M29959.m24699());
                try {
                    c23001M29951.m51893(c14380, c3374M51896);
                    c14380.close();
                    this.f38535.m1213(c23001M29951);
                    MessageDigest messageDigestM36174 = C15022.m36174();
                    C15022.m36175(messageDigestM36174, c9378M29959.m24703());
                    byte[] bArrDigest = messageDigestM36174.digest();
                    C6178 c6178 = new C6178();
                    c6178.writeInt(1936945938);
                    c6178.m17806(bArrM46400);
                    c6178.m17806(bArrDigest);
                    c9379.m24699().m49850(c6178.m17808(), 0, c6178.size());
                } catch (Throwable th) {
                    try {
                        c14380.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c93710.m24701();
            try {
                C14380 c14381 = new C14380(c93710.m24699());
                try {
                    c14381.writeInt(-416934225);
                    c14381.m34818(bArrM46400);
                    c14381.writeInt(concurrentMapC17249.size());
                    for (Map.Entry entry : concurrentMapC17249.entrySet()) {
                        c14381.m34817((String) entry.getKey());
                        c14381.writeInt(((List) entry.getValue()).size());
                        for (C9442 c9442 : (List) entry.getValue()) {
                            int i = c9442.f30619;
                            int i2 = c9442.f30617;
                            int i3 = c9442.f30618;
                            C25042[] c25042Arr = c9442.f30620;
                            if (i != 0) {
                                if (i == 1) {
                                    if (c25042Arr != null) {
                                        c14381.writeByte(101);
                                    } else {
                                        c14381.writeByte(1);
                                    }
                                    c14381.writeInt(i3);
                                    c14381.writeInt(i2);
                                    c14381.m34816((CharSequence) c9442.f30622);
                                    if (c25042Arr != null) {
                                        c14381.mo17812(c25042Arr.length);
                                        for (C25042 c25042 : c25042Arr) {
                                            c14381.m34817(c25042.f81015);
                                            c14381.writeInt(c25042.f81016);
                                            c14381.writeInt(c25042.f81014);
                                        }
                                    }
                                } else if (i != 2 && i != 3) {
                                    throw new RuntimeException();
                                }
                            }
                            c14381.writeByte(i);
                            c14381.writeInt(i3);
                            c14381.writeInt(i2);
                            c14381.writeInt(c9442.f30621);
                        }
                    }
                    c14381.close();
                    this.f38526 = false;
                    this.f38523 = false;
                } catch (Throwable th3) {
                    try {
                        c14381.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException | RuntimeException e2) {
                c93710.m24697();
                throw e2;
            }
        } catch (Throwable th5) {
            C2008.m6852();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29979(InterfaceC4115 interfaceC4115) {
        C9378 c9378;
        Iterator it = this.f38534.values().iterator();
        do {
            if (!it.hasNext()) {
                c9378 = null;
                break;
            }
            c9378 = ((C16946) it.next()).f55363;
        } while (c9378 == null);
        if (c9378 != null && c9378.m24699().mo4285() <= 31457280 && c9378.m24699().mo4285() <= 52428800) {
            ArrayList<C16946> arrayListM29966 = m29966(c9378);
            HashMap map = new HashMap();
            for (C16946 c16946 : arrayListM29966) {
                map.put(c16946.f55358, c16946);
            }
            try {
                m29951(map, interfaceC4115, (ConcurrentMapC17249) null, true);
            } finally {
                C2008.m6852();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v67, types: [l.ۚܶۤ] */
    /* JADX WARN: Type inference failed for: r35v0, types: [java.util.Map, l.ܽ֫ۗ] */
    /* JADX WARN: Type inference failed for: r35v1, types: [l.ܽ֫ۗ] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2, types: [l.ۧ᩻ۧ] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23001 m29951(HashMap map, InterfaceC4115 interfaceC4115, final ConcurrentMapC17249 concurrentMapC17249, boolean z) throws C17692, IOException {
        int i;
        C23001 c23001;
        String str;
        int iM29456;
        C11967 c11967 = this;
        String str2 = "realName";
        String str3 = "name";
        C23001 c23001M51888 = C23001.m51888(EnumC11066.CREATE);
        C12426 c12426 = new C12426(c23001M51888);
        C15306 c15306M36752 = C15306.m36752(map.keySet());
        c15306M36752.m36758(new C8589());
        C19782 c19782M36756 = c15306M36752.m36756();
        Collections.sort(c19782M36756.m45559(), new C7098(c11967));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = c19782M36756.m45556().iterator();
        int size = 0;
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            size += ((C19782) it.next()).m45556().size() + 1;
        }
        C3374 c3374 = new C3374(size);
        c3374.m11078(new C5256(0, interfaceC4115));
        C11967 c11968 = c11967;
        for (C19782 c19782 : c19782M36756.m45556()) {
            c3374.m11079(i);
            C22020 c22020M45557 = c19782.m45557("package-info");
            if (c22020M45557 == null) {
                throw new IOException("File not found: " + c19782.m45562() + "/package-info.xml");
            }
            try {
                C2008 c2008M29946 = c11968.m29946(c22020M45557.m49804(), map);
                if (!c2008M29946.m6853().equals("package")) {
                    throw new C10254("Expected tag: <package>", c2008M29946);
                }
                C5737 c5737M6863 = c2008M29946.m6863("id");
                C5737 c5737M6864 = c2008M29946.m6863(str3);
                try {
                    C5737 c5737M6854 = c2008M29946.m6854("prefix");
                    try {
                        C25239 c25239M51891 = c23001M51888.m51891(m29943(c5737M6863) & 255, c5737M6864.m16798());
                        C5737 c5737M6855 = c2008M29946.m6854("configLayout");
                        if (c5737M6855 != null) {
                            c25239M51891.m56370(EnumC18262.m42405(c5737M6855.m16798()));
                        }
                        if (c5737M6854 != null) {
                            c12426.m30905(c25239M51891.mo27607(), m29961(c5737M6854));
                        }
                        Iterator itM6848 = C2008.m6848(c2008M29946, "library");
                        while (itM6848.hasNext()) {
                            C2008 c2008 = (C2008) itM6848.next();
                            C5737 c5737M6865 = c2008.m6863("id");
                            C5737 c5737M6866 = c2008.m6863(str3);
                            Iterator it2 = itM6848;
                            try {
                                int iM29943 = m29943(c5737M6865);
                                C23001 c23002 = c23001M51888;
                                c25239M51891.m56368(iM29943, m29961(c5737M6866));
                                c23001M51888 = c23002;
                                itM6848 = it2;
                            } catch (RuntimeException e) {
                                throw new C10254(e.getMessage(), c2008);
                            }
                        }
                        c23001 = c23001M51888;
                        Iterator itM6849 = C2008.m6848(c2008M29946, "overlay");
                        while (itM6849.hasNext()) {
                            C2008 c2009 = (C2008) itM6849.next();
                            C5737 c5737M6867 = c2009.m6863(str3);
                            Iterator it3 = itM6849;
                            C5737 c5737M6856 = c2009.m6854("actor");
                            try {
                                C2118 c2118M56366 = c25239M51891.m56366(m29961(c5737M6867), c5737M6856 == null ? "" : c5737M6856.m16798());
                                Iterator itM68410 = C2008.m6848(c2009, am.bp);
                                while (itM68410.hasNext()) {
                                    C2008 c20010 = (C2008) itM68410.next();
                                    Iterator it4 = itM68410;
                                    int iM29944 = m29943(c20010.m6863("flags"));
                                    C12426 c12427 = c12426;
                                    C14763 c14763 = new C14763();
                                    Iterator itM68411 = C2008.m6848(c20010, "id");
                                    while (itM68411.hasNext()) {
                                        Iterator it5 = itM68411;
                                        C16923 c16923M6859 = ((C2008) itM68411.next()).m6859();
                                        ArrayList arrayList3 = arrayList2;
                                        String strM39906 = c16923M6859.m39906();
                                        if (C11730.m29462(strM39906)) {
                                            iM29456 = C11730.m29456(strM39906.substring(2));
                                        } else {
                                            if (!C11730.m29464(strM39906)) {
                                                throw new C10254(C14442.m34865("Integer value required: \"", strM39906, "\""), c16923M6859);
                                            }
                                            iM29456 = Integer.parseInt(strM39906);
                                        }
                                        c14763.add(iM29456);
                                        arrayList2 = arrayList3;
                                        itM68411 = it5;
                                    }
                                    c2118M56366.m7298(iM29944, c14763);
                                    itM68410 = it4;
                                    c12426 = c12427;
                                    arrayList2 = arrayList2;
                                }
                                itM6849 = it3;
                            } catch (RuntimeException e2) {
                                throw new C10254(e2.getMessage(), c2009);
                            }
                        }
                        ArrayList arrayList4 = arrayList2;
                        final C12426 c12428 = c12426;
                        Iterator itM68412 = C2008.m6848(c2008M29946, "stagedAlias");
                        while (true) {
                            boolean zHasNext = itM68412.hasNext();
                            str = Entry.DEFAULT_NAME;
                            if (!zHasNext) {
                                break;
                            }
                            C2008 c20011 = (C2008) itM68412.next();
                            C17033 c17033M56372 = c25239M51891.m56372();
                            c20011.getClass();
                            Iterator itM68413 = C2008.m6848(c20011, Entry.DEFAULT_NAME);
                            while (itM68413.hasNext()) {
                                C2008 c20012 = (C2008) itM68413.next();
                                c17033M56372.m40125(m29943(c20012.m6863("stagedResId")), m29943(c20012.m6863("finalizedResId")));
                                itM68412 = itM68412;
                            }
                        }
                        c2008M29946.m6862();
                        if (!interfaceC4115.mo924()) {
                            C0594 c0594 = new C0594();
                            C0594 c0595 = new C0594();
                            C0594 c0596 = new C0594();
                            Iterator it6 = c19782.m45556().iterator();
                            ?? r9 = c11968;
                            ConcurrentMapC17249 concurrentMapC172410 = concurrentMapC17249;
                            while (it6.hasNext()) {
                                C19782 c19783 = (C19782) it6.next();
                                Iterator it7 = it6;
                                c3374.m11079(1);
                                StringBuilder sb = new StringBuilder();
                                C3374 c3375 = c3374;
                                sb.append(c19783.m45560());
                                sb.append("/type-info");
                                ?? string = sb.toString();
                                try {
                                    C2008 c2008M29947 = r9.m29946(string, map);
                                    if (!c2008M29947.m6853().equals("type")) {
                                        throw new C10254("Expected tag: <type>", c2008M29947);
                                    }
                                    C5737 c5737M6857 = c2008M29947.m6854(str2);
                                    String strM45562 = c19783.m45562();
                                    String strM16798 = c5737M6857 == null ? null : c5737M6857.m16798();
                                    int iM29945 = m29943(c2008M29947.m6863("id")) & 255;
                                    C19782 c19784 = c19782;
                                    C5737 c5737M6858 = c2008M29947.m6854("defaultPublic");
                                    try {
                                        string = c2008M29947.m6854("defaultWeak");
                                        C5737 c5737M6859 = c2008M29947.m6854("defaultCompact");
                                        try {
                                            final C23747 c23747M56375 = c25239M51891.m56375(iM29945, strM45562);
                                            if (strM16798 != null) {
                                                arrayList.add(new RunnableC24881(2, c23747M56375, strM16798));
                                            }
                                            if (c5737M6858 != null && c5737M6858.m16798().equals("true")) {
                                                c0594.add(iM29945);
                                            }
                                            if (string != 0 && string.m16798().equals("true")) {
                                                c0595.add(iM29945);
                                            }
                                            if (c5737M6859 != null && c5737M6859.m16798().equals("true")) {
                                                c0596.add(iM29945);
                                            }
                                            C18037 c18037 = new C18037(c2008M29947.m6858().size());
                                            C0594 c0597 = new C0594(c2008M29947.m6858().size());
                                            ArrayList arrayList5 = new ArrayList();
                                            Iterator itM68414 = C2008.m6848(c2008M29947, str);
                                            while (itM68414.hasNext()) {
                                                C2008 c20013 = (C2008) itM68414.next();
                                                C5737 c5737M6868 = c20013.m6863("id");
                                                C5737 c5737M6869 = c20013.m6863(str3);
                                                Iterator it8 = itM68414;
                                                String str4 = str2;
                                                C5737 c5737M68510 = c20013.m6854(str4);
                                                String str5 = str;
                                                int iM29946 = (m29943(c5737M6868) & 65535) | (c25239M51891.mo27607() << 24) | (c23747M56375.mo35833() << 16);
                                                String strM29961 = m29961(c5737M6869);
                                                final String strM16799 = c5737M68510 == null ? null : c5737M68510.m16798();
                                                if (!c18037.add(strM29961)) {
                                                    throw new C10254("Duplicate name: " + c5737M6869.m16798(), c5737M6869);
                                                }
                                                if (!c0597.add(iM29946)) {
                                                    throw new C10254("Duplicate id: " + c5737M6868.m16798(), c5737M6868);
                                                }
                                                if (strM16799 != null) {
                                                    final int i2 = iM29946 & 65535;
                                                    arrayList.add(new Runnable() { // from class: l.᩷᩻ۧ
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            c23747M56375.m53015(i2, strM16799);
                                                        }
                                                    });
                                                }
                                                int i3 = iM29946 & 65535;
                                                c23747M56375.m53016(i3, strM29961, false);
                                                m29952(c20013, c23747M56375, i3);
                                                arrayList5.add(new C9442(iM29946, c20013.m51624(), c20013.m51623()));
                                                itM68414 = it8;
                                                str2 = str4;
                                                str3 = str3;
                                                str = str5;
                                            }
                                            String str6 = str;
                                            String str7 = str3;
                                            String str8 = str2;
                                            if (concurrentMapC17249 != 0) {
                                                concurrentMapC17249.put(string, arrayList5);
                                            }
                                            c2008M29947.m6862();
                                            r9 = this;
                                            concurrentMapC172410 = concurrentMapC17249;
                                            it6 = it7;
                                            c3374 = c3375;
                                            c19782 = c19784;
                                            c25239M51891 = c25239M51891;
                                            str2 = str8;
                                            str3 = str7;
                                            str = str6;
                                            map = map;
                                        } catch (Exception e3) {
                                            throw new C10254(e3.getMessage(), c2008M29947.m6863("id"));
                                        }
                                    } catch (C10254 e4) {
                                        e = e4;
                                        string = string;
                                    }
                                } catch (C10254 e5) {
                                    e = e5;
                                }
                                throw new C17692(string, e);
                            }
                            C19782 c19785 = c19782;
                            C3374 c3376 = c3374;
                            C25239 c25239 = c25239M51891;
                            String str9 = str2;
                            String str10 = str3;
                            if (!interfaceC4115.mo924()) {
                                Iterator it9 = c25239.mo19822().iterator();
                                while (it9.hasNext()) {
                                    C23747 c23747 = (C23747) it9.next();
                                    String typeName = c23747.getTypeName();
                                    boolean z2 = typeName.equals("attr") || typeName.equals("id") || typeName.equals("^attr-private");
                                    String str11 = c19785.m45562() + "/" + typeName + "/" + typeName;
                                    int i4 = 0;
                                    List<C16946> list = (List) C1170.stream(map.entrySet()).filter(new C11221(i4, str11)).map(new C18285(i4)).sorted().collect(C2025.toList());
                                    final C1372 c1372 = new C1372();
                                    c1372.f4895 = c0594.contains(c23747.mo35833());
                                    c1372.f4894 = c0595.contains(c23747.mo35833());
                                    c1372.f4893 = c0596.contains(c23747.mo35833());
                                    final C6593 c6593M53020 = c23747.m53020();
                                    for (final C16946 c16946 : list) {
                                        try {
                                            final C20017 c20017M53013 = c23747.m53013(C20500.m47000(c16946.f55358.substring(str11.length()), c25239.mo27606()));
                                            C23747 c23748 = c23747;
                                            ArrayList arrayList6 = arrayList4;
                                            arrayList6.add(z2 ? 0 : arrayList4.size(), new InterfaceC15696() { // from class: l.֡ۧۧ
                                                @Override // l.InterfaceC15696
                                                public final void run() throws C17692 {
                                                    C11967.m29953(this.f1920, c16946, c12428, c20017M53013, c6593M53020, c1372, concurrentMapC17249);
                                                }
                                            });
                                            arrayList = arrayList;
                                            it9 = it9;
                                            c0596 = c0596;
                                            c0595 = c0595;
                                            arrayList4 = arrayList6;
                                            c23747 = c23748;
                                        } catch (Exception unused) {
                                            throw new IOException("Name format error: " + C7605.m20778(c16946.f55358));
                                        }
                                    }
                                    C0594 c0598 = c0596;
                                    C0594 c0599 = c0595;
                                    Iterator it10 = it9;
                                    ArrayList arrayList7 = arrayList4;
                                    ArrayList arrayList8 = arrayList;
                                    if (!interfaceC4115.mo924()) {
                                        arrayList = arrayList8;
                                        it9 = it10;
                                        c0596 = c0598;
                                        c0595 = c0599;
                                        arrayList4 = arrayList7;
                                    }
                                }
                                i = 1;
                                c11968 = this;
                                arrayList2 = arrayList4;
                                c23001M51888 = c23001;
                                c3374 = c3376;
                                c12426 = c12428;
                                str2 = str9;
                                str3 = str10;
                            }
                        }
                        return c23001;
                    } catch (RuntimeException e6) {
                        throw new C10254(e6.getMessage(), c2008M29946);
                    }
                } catch (C10254 e7) {
                    e = e7;
                }
            } catch (C10254 e8) {
                e = e8;
            }
            throw new C17692(c22020M45557.m49804(), e);
        }
        ArrayList<InterfaceC15696> arrayList9 = arrayList2;
        ArrayList arrayList10 = arrayList;
        c23001 = c23001M51888;
        C3374 c3377 = new C3374(arrayList9.size());
        c3377.m11078(new C9492(4, interfaceC4115));
        for (InterfaceC15696 interfaceC15696 : arrayList9) {
            c3377.m11079(1);
            interfaceC15696.run();
            if (interfaceC4115.mo924()) {
                return c23001;
            }
        }
        Iterator it11 = arrayList10.iterator();
        while (it11.hasNext()) {
            ((Runnable) it11.next()).run();
        }
        if (z) {
            try {
                c23001.mo6599(C23001.m51887(new C24296(m29991().m24694("resources")), EnumC11066.CREATE, false));
                return c23001;
            } catch (Exception e9) {
                throw new RuntimeException(e9);
            }
        }
        return c23001;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29952(C2008 c2008, C23747 c23747, int i) throws C10254 {
        C5737 c5737M6854 = c2008.m6854("stagedApi");
        if (c5737M6854 != null && !"true".equals(c5737M6854.m16798()) && !"false".equals(c5737M6854.m16798())) {
            throw new C10254("Boolean value required: stagedApi", c5737M6854);
        }
        int i2 = 0;
        c23747.m53027(i, c5737M6854 != null && "true".equals(c5737M6854.m16798()));
        C5737 c5737M6855 = c2008.m6854("extraTypeSpecFlags");
        if (c5737M6855 != null) {
            String strM16798 = c5737M6855.m16798();
            try {
                boolean zStartsWith = strM16798.startsWith("0x");
                String strSubstring = zStartsWith ? strM16798.substring(2) : strM16798;
                if (strSubstring.isEmpty() || strSubstring.charAt(0) == '-' || strSubstring.charAt(0) == '+') {
                    throw new NumberFormatException();
                }
                long j = Long.parseLong(strSubstring, zStartsWith ? 16 : 10);
                if (j < 0 || j > 4294967295L) {
                    throw new NumberFormatException();
                }
                i2 = (int) j;
                if (((c23747.m53029().mo27606().m42407() | 1610874879) & i2) != 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException unused) {
                throw new C10254(C25272.m56409("Invalid extraTypeSpecFlags: ", strM16798), c5737M6855);
            }
        }
        c23747.m53026(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m29943(C5737 c5737) throws C10254 {
        String strM16798 = c5737.m16798();
        if (C11730.m29462(strM16798)) {
            return C11730.m29456(strM16798.substring(2));
        }
        if (C11730.m29464(strM16798)) {
            return Integer.parseInt(strM16798);
        }
        throw new C10254(C3188.m10404("Integer value required: ", c5737.m16796(), "=\"", c5737.m16798(), "\""), c5737);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m29961(C5737 c5737) throws C10254 {
        String strM16798 = c5737.m16798();
        if (strM16798.isEmpty()) {
            throw new C10254(C14442.m34865("Value required: ", c5737.m16796(), "=\"\""), c5737);
        }
        return strM16798;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C2008 m29946(String str, Map map) throws C3090 {
        C16946 c16946 = (C16946) map.get(str);
        if (c16946 != null) {
            return m29964(c16946);
        }
        throw new C3090(C25272.m56409("Xml not found: ", str));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C2008 m29964(C16946 c16946) {
        return new C2273(this, c16946).m7712();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0594 m30004(String str) {
        List list = (List) C1170.stream(this.f38534.entrySet()).filter(new C19031(0, C14483.m34972(str, "/"))).map(new C18285(0)).collect(C2025.toList());
        C0594 c0594 = new C0594();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                c0594.add(m29943(m29964((C16946) it.next()).m6863("id")) & 255);
            } catch (Exception unused) {
            }
        }
        return c0594;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC18262 m29990(String str) throws IOException {
        int iIndexOf = str.indexOf(47);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        C16946 c16946 = (C16946) this.f38534.get(str + "/package-info");
        if (c16946 == null) {
            throw new IOException(C25272.m56409("Package metadata is missing: ", str));
        }
        C2008 c2008M29964 = m29964(c16946);
        try {
            C5737 c5737M6854 = c2008M29964.m6854("configLayout");
            return c5737M6854 == null ? EnumC18262.AOSP : EnumC18262.m42405(c5737M6854.m16798());
        } finally {
            c2008M29964.m6862();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29971(int i, String str) {
        C16946 c16946 = (C16946) this.f38534.get(C14483.m34972(str, "/package-info"));
        if (c16946 == null) {
            return i;
        }
        try {
            return m29943(m29964(c16946).m6863("id")) & 255;
        } catch (Exception unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m29995(String str) {
        C16946 c16946 = (C16946) this.f38534.get(C14483.m34972(str, "/type-info"));
        if (c16946 != null) {
            C9378 c9378 = c16946.f55357;
            int iMo4286 = c9378 != null ? (int) (c9378.m24699().mo4286() / 1000) : 0;
            int i = c16946.f55362;
            if (i != -1 && c16946.f55359 == iMo4286) {
                return i;
            }
            try {
                int iM29943 = m29943(m29964(c16946).m6863("id")) & 255;
                c16946.f55362 = iM29943;
                c16946.f55359 = iMo4286;
                return iM29943;
            } catch (Exception unused) {
                c16946.f55362 = -1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m30003(String str, String str2) {
        int iM29971;
        C16946 c16946;
        C5737 c5737M6854;
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1 && (iM29971 = m29971(-1, str.substring(0, iIndexOf))) != -1 && (c16946 = (C16946) this.f38534.get(str)) != null) {
            try {
                C2008 c2008M29964 = m29964(c16946);
                int iM29943 = m29943(c2008M29964.m6863("id")) & 255;
                Iterator itM6847 = C2008.m6847(c2008M29964);
                while (itM6847.hasNext()) {
                    C2008 c2008 = (C2008) itM6847.next();
                    if (c2008.m6853().equals(Entry.DEFAULT_NAME) && (c5737M6854 = c2008.m6854("name")) != null && c5737M6854.m16798().equals(str2)) {
                        String strM16798 = c2008.m6863("id").m16798();
                        return (Integer.parseInt(strM16798.substring(strM16798.length() - 4), 16) & 65535) | (iM29971 << 24) | (iM29943 << 16);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m30000(String str) {
        C5737 c5737M6854;
        Iterator it = this.f38534.values().iterator();
        while (true) {
            C2008 c2008M7712 = null;
            if (!it.hasNext()) {
                return null;
            }
            C16946 c16946 = (C16946) it.next();
            if (c16946.f55358.endsWith("/package-info")) {
                String[] strArrSplit = c16946.f55358.split("/");
                if (strArrSplit.length != 2) {
                    continue;
                } else {
                    try {
                        c2008M7712 = new C2273(this, c16946).m7712();
                    } catch (IOException | C10254 unused) {
                    }
                    if (c2008M7712 != null && c2008M7712.m6853().equals("package") && (c5737M6854 = c2008M7712.m6854("prefix")) != null && c5737M6854.m16798().equals(str)) {
                        return strArrSplit[0];
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList m29989(String str, String str2) {
        C2008 c2008M7712;
        C5737 c5737M6854;
        ArrayList arrayList = new ArrayList();
        for (C16946 c16946 : this.f38534.values()) {
            String str3 = c16946.f55358;
            if (str3.startsWith(str)) {
                String strSubstring = str3.substring(str.length());
                if (strSubstring.indexOf(47) == -1) {
                    try {
                        c2008M7712 = new C2273(this, c16946).m7712();
                    } catch (IOException | C10254 unused) {
                        c2008M7712 = null;
                    }
                    if (c2008M7712 != null) {
                        if (c2008M7712.m6853().equals("type")) {
                            Iterator itM6847 = C2008.m6847(c2008M7712);
                            while (itM6847.hasNext()) {
                                C2008 c2008 = (C2008) itM6847.next();
                                if (c2008.m6853().equals(Entry.DEFAULT_NAME) && (c5737M6854 = c2008.m6854("name")) != null && c5737M6854.m16798().equals(str2)) {
                                    C15301 c15301M36736 = C15301.m36736(c5737M6854.m16799(), c5737M6854.m16797() - 1);
                                    c15301M36736.f50017 = true;
                                    arrayList.add(new C13459(strSubstring, str3, c15301M36736));
                                    break;
                                }
                            }
                        } else if (c2008M7712.m6853().equals("resources")) {
                            Iterator itM6848 = C2008.m6847(c2008M7712);
                            while (itM6848.hasNext()) {
                                C5737 c5737M6855 = ((C2008) itM6848.next()).m6854("name");
                                if (c5737M6855 != null && c5737M6855.m16798().equals(str2)) {
                                    C15301 c15301M36737 = C15301.m36736(c5737M6855.m16799(), c5737M6855.m16797() - 1);
                                    c15301M36737.f50017 = true;
                                    arrayList.add(new C13459(strSubstring, str3, c15301M36737));
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
    public final void m29978(ActivityC0848 activityC0848, C17365 c17365) {
        this.f38535.m1212(activityC0848, c17365);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m29998() {
        C9378 c9378M29959 = m29959();
        if (!c9378M29959.m24702()) {
            c9378M29959 = new C9378(m29991(), "resources");
        }
        return c9378M29959.m24699();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m29988() throws IOException {
        C9378 c9378M11162 = m11162();
        c9378M11162.m24699().m49853();
        C9378 c9378M29959 = m29959();
        if (!c9378M29959.m24702()) {
            c9378M29959 = new C9378(m29991(), "resources");
        }
        C9378 c9378 = new C9378(c9378M11162, this.f38533);
        InputStream inputStreamM24703 = c9378M29959.m24703();
        try {
            OutputStream outputStreamMo4289 = c9378.m24699().mo4289(false);
            try {
                C5125.m15496(inputStreamM24703, outputStreamMo4289);
                if (outputStreamMo4289 != null) {
                    outputStreamMo4289.close();
                }
                if (inputStreamM24703 != null) {
                    inputStreamM24703.close();
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
        } catch (Throwable th3) {
            if (inputStreamM24703 != null) {
                try {
                    inputStreamM24703.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29983(AbstractC22044 abstractC22044, boolean z) throws IOException {
        abstractC22044.mo4274();
        C9378 c9378M29959 = m29959();
        if (c9378M29959.m24702()) {
            AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(this.f38533);
            if (z) {
                abstractC22044M49876.m49867();
            }
            try {
                InputStream inputStreamM24703 = c9378M29959.m24703();
                try {
                    OutputStream outputStreamMo4289 = abstractC22044M49876.mo4289(false);
                    try {
                        C5125.m15496(inputStreamM24703, outputStreamMo4289);
                        if (outputStreamMo4289 != null) {
                            outputStreamMo4289.close();
                        }
                        if (inputStreamM24703 != null) {
                            inputStreamM24703.close();
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
                } catch (Throwable th3) {
                    if (inputStreamM24703 != null) {
                        try {
                            inputStreamM24703.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (IOException e) {
                if (z) {
                    abstractC22044M49876.m49859();
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Collection m29994() {
        return (Collection) C1170.stream(m29999().values()).flatMap(new C3984(1)).filter(new C6563(2)).map(new C10080(0)).distinct().sorted(new C1132()).collect(C2025.toList());
    }

    /* JADX WARN: Code duplicated, block: B:76:0x024a  */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList m29970() throws Throwable {
        C2008 c2008M29946;
        C2008 c2008M29947;
        Iterator it;
        String str;
        C2008 c2008;
        C16946 c16946;
        C2008 c2008M29964;
        HashMap map;
        String str2;
        C19782 c19782;
        int i;
        LinkedHashMap linkedHashMap;
        int i2;
        C18037 c18037;
        Iterator it2;
        C11967 c11967 = this;
        String str3 = "id";
        HashMap map2 = c11967.f38534;
        ArrayList arrayList = new ArrayList();
        Iterator it3 = m29997().m45556().iterator();
        while (it3.hasNext()) {
            C19782 c19783 = (C19782) it3.next();
            C22020 c22020M45557 = c19783.m45557("package-info");
            if (c22020M45557 != null) {
                try {
                    c2008M29946 = c11967.m29946(c22020M45557.m49804(), map2);
                    try {
                        try {
                            if (!c2008M29946.m6853().equals("package")) {
                                throw new C10254("Expected tag: <package>", c2008M29946);
                            }
                            int iM29943 = m29943(c2008M29946.m6863(str3)) & 255;
                            c2008M29946.m6862();
                            for (C19782 c19784 : c19783.m45556()) {
                                C22020 c22020M45558 = c19784.m45557("type-info");
                                if (c22020M45558 != null) {
                                    String strM49804 = c22020M45558.m49804();
                                    C18037 c18038 = new C18037(0);
                                    try {
                                        c2008M29947 = c11967.m29946(strM49804, map2);
                                        try {
                                            try {
                                                if (!c2008M29947.m6853().equals("type")) {
                                                    throw new C10254("Expected tag: <type>", c2008M29947);
                                                }
                                                int iM29944 = m29943(c2008M29947.m6863(str3)) & 255;
                                                Iterator itM6848 = C2008.m6848(c2008M29947, Entry.DEFAULT_NAME);
                                                int iMax = 0;
                                                while (true) {
                                                    it = it3;
                                                    str = "name";
                                                    if (!itM6848.hasNext()) {
                                                        break;
                                                    }
                                                    C2008 c2009 = (C2008) itM6848.next();
                                                    C5737 c5737M6863 = c2009.m6863(str3);
                                                    c18038.add(m29961(c2009.m6863("name")));
                                                    iMax = Math.max(iMax, (m29943(c5737M6863) & 65535) + 1);
                                                    it3 = it;
                                                }
                                                c2008M29947.m6862();
                                                List<C16946> list = (List) C1170.stream(map2.entrySet()).filter(new C7844(c19783.m45562() + "/" + c19784.m45562() + "/" + c19784.m45562(), 0)).map(new C18285(0)).sorted().collect(C2025.toList());
                                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                for (C16946 c16947 : list) {
                                                    try {
                                                        c2008M29964 = c11967.m29964(c16947);
                                                        try {
                                                            try {
                                                                String str4 = str3;
                                                                if (c2008M29964.m6853().equals("resources")) {
                                                                    Iterator itM6847 = C2008.m6847(c2008M29964);
                                                                    while (itM6847.hasNext()) {
                                                                        C5737 c5737M6854 = ((C2008) itM6847.next()).m6854(str);
                                                                        if (c5737M6854 == null) {
                                                                            it2 = itM6847;
                                                                        } else {
                                                                            it2 = itM6847;
                                                                            String strM16798 = c5737M6854.m16798();
                                                                            if (!strM16798.isEmpty()) {
                                                                                if (!c18038.contains(strM16798) && ((C6002) linkedHashMap2.get(strM16798)) == null) {
                                                                                    if (iMax > 65535) {
                                                                                        c16946 = c16947;
                                                                                        throw new IOException("No available entry id: " + strM49804);
                                                                                    }
                                                                                    int i3 = (iM29943 << 24) | (iM29944 << 16) | iMax;
                                                                                    HashMap map3 = map2;
                                                                                    String str5 = str;
                                                                                    C19782 c19785 = c19783;
                                                                                    c16946 = c16947;
                                                                                    int i4 = iMax;
                                                                                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                                                                    C18037 c18039 = c18038;
                                                                                    try {
                                                                                        linkedHashMap3.put(strM16798, new C6002(strM49804, strM16798, i4, i3, c16947.f55358, c5737M6854.m16799(), Math.max(c5737M6854.m16797() - 1, 0)));
                                                                                        iMax = i4 + 1;
                                                                                        c18038 = c18039;
                                                                                        c16947 = c16946;
                                                                                        linkedHashMap2 = linkedHashMap3;
                                                                                        itM6847 = it2;
                                                                                        map2 = map3;
                                                                                        str = str5;
                                                                                        c19783 = c19785;
                                                                                    } catch (C10254 e) {
                                                                                        e = e;
                                                                                    }
                                                                                    e = e;
                                                                                    throw new C17692(c16946.f55358, e);
                                                                                }
                                                                            }
                                                                            iM29943 = iM29943;
                                                                            iM29944 = iM29944;
                                                                        }
                                                                        c18038 = c18038;
                                                                        c16947 = c16947;
                                                                        linkedHashMap2 = linkedHashMap2;
                                                                        itM6847 = it2;
                                                                        map2 = map2;
                                                                        str = str;
                                                                        c19783 = c19783;
                                                                        iMax = iMax;
                                                                        iM29943 = iM29943;
                                                                        iM29944 = iM29944;
                                                                    }
                                                                    map = map2;
                                                                    str2 = str;
                                                                    c19782 = c19783;
                                                                    i = iM29943;
                                                                    linkedHashMap = linkedHashMap2;
                                                                    i2 = iM29944;
                                                                    c18037 = c18038;
                                                                    c2008M29964.m6862();
                                                                } else {
                                                                    c2008M29964.m6862();
                                                                    map = map2;
                                                                    str2 = str;
                                                                    c19782 = c19783;
                                                                    i = iM29943;
                                                                    linkedHashMap = linkedHashMap2;
                                                                    i2 = iM29944;
                                                                    c18037 = c18038;
                                                                }
                                                                c18038 = c18037;
                                                                linkedHashMap2 = linkedHashMap;
                                                                str3 = str4;
                                                                map2 = map;
                                                                str = str2;
                                                                c19783 = c19782;
                                                                iM29943 = i;
                                                                iM29944 = i2;
                                                                c11967 = this;
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                c2008 = c2008M29964;
                                                                if (c2008 != null) {
                                                                    c2008.m6862();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (C10254 e2) {
                                                            e = e2;
                                                            c16946 = c16947;
                                                        }
                                                    } catch (C10254 e3) {
                                                        e = e3;
                                                        c16946 = c16947;
                                                        c2008M29964 = null;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        c2008 = null;
                                                        if (c2008 != null) {
                                                            c2008.m6862();
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                arrayList.addAll(linkedHashMap2.values());
                                                c11967 = this;
                                                it3 = it;
                                                str3 = str3;
                                                iM29943 = iM29943;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                if (c2008M29947 != null) {
                                                    c2008M29947.m6862();
                                                }
                                                throw th;
                                            }
                                        } catch (C10254 e4) {
                                            e = e4;
                                            throw new C17692(strM49804, e);
                                        }
                                    } catch (C10254 e5) {
                                        e = e5;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c2008M29947 = null;
                                    }
                                }
                            }
                            c11967 = this;
                        } catch (Throwable th5) {
                            th = th5;
                            if (c2008M29946 != null) {
                                c2008M29946.m6862();
                            }
                            throw th;
                        }
                    } catch (C10254 e6) {
                        e = e6;
                        throw new C17692(c22020M45557.m49804(), e);
                    }
                } catch (C10254 e7) {
                    e = e7;
                } catch (Throwable th6) {
                    th = th6;
                    c2008M29946 = null;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29975(List list) throws C17692, IOException {
        if (list.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6002 c6002 = (C6002) it.next();
            ((List) C11392.computeIfAbsent(linkedHashMap, c6002.f20531, new C3900(3))).add(c6002);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            C16946 c16946 = (C16946) this.f38534.get(str);
            if (c16946 == null) {
                throw new IOException(C25272.m56409("Xml not found: ", str));
            }
            String strM29945 = m29945(c16946);
            int iLastIndexOf = strM29945.lastIndexOf("</type>");
            if (iLastIndexOf < 0) {
                throw new IOException(C25272.m56409("Expected tag: </type> in ", str));
            }
            List<C6002> list2 = (List) entry.getValue();
            Collections.sort(list2, C2661.comparingInt(new C9334(0)));
            StringBuilder sb = new StringBuilder((list2.size() * 64) + strM29945.length());
            sb.append((CharSequence) strM29945, 0, iLastIndexOf);
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != '\n') {
                sb.append('\n');
            }
            for (C6002 c6003 : list2) {
                sb.append("    <entry id=\"");
                sb.append(String.format(Locale.ENGLISH, "0x%08x", Integer.valueOf(c6003.f20532)));
                sb.append("\" name=\"");
                sb.append(C15830.f51497.m10291(c6003.f20534));
                sb.append("\" />\n");
            }
            String strM = ExternalValue$$ExternalSyntheticOutline0.m(iLastIndexOf, strM29945, sb);
            try {
                C2008 c2008M6850 = C2008.m6850(strM, false);
                if (c2008M6850 != null) {
                    c2008M6850.m6862();
                }
                linkedHashMap2.put(c16946, strM);
            } catch (C10254 e) {
                throw new C17692(str, e);
            }
        }
        boolean z = this.f38524;
        this.f38524 = false;
        try {
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                m29980((C16946) entry2.getKey(), (String) entry2.getValue());
            }
            m29984(z);
        } catch (Throwable th) {
            m29984(z);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m29987(String str) {
        C16946 c16946 = (C16946) this.f38534.get(str);
        if (c16946 == null) {
            return -268435456;
        }
        C9378 c9378 = c16946.f55357;
        if (c9378 != null) {
            return Long.valueOf(c9378.m24699().mo4286() ^ c9378.m24699().mo4285()).hashCode();
        }
        return c16946.f55363 != null ? -536870912 : -268435456;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m30005(String str) {
        C16946 c16946 = (C16946) this.f38534.get(str);
        return (c16946 == null || c16946.f55363 == null) ? "" : c16946.m39919();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m29993(String str) throws C3090 {
        C16946 c16946 = (C16946) this.f38534.get(str);
        if (c16946 != null) {
            return m29945(c16946);
        }
        throw new C3090(C25272.m56409("Xml not found: ", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29945(C16946 c16946) throws C3090 {
        C9378 c9378 = c16946.f55357;
        if (c9378 != null) {
            return c9378.m24699().m49871();
        }
        if (c16946.f55363 != null) {
            return c16946.m39919();
        }
        throw new C3090("Bad xml: " + c16946.f55358);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m30001(String str, String str2) throws IOException {
        C16946 c16946 = (C16946) this.f38534.get(str);
        if (c16946 == null) {
            throw new C3090("Xml not found: ".concat(str));
        }
        C2008 c2008M6850 = C2008.m6850(str2, false);
        m29980(c16946, str2);
        C9378 c9378M29965 = m29965(c16946.f55357);
        c9378M29965.m24701();
        byte[] bArrDigest = C15022.m36183().digest(str2.getBytes(StandardCharsets.UTF_8));
        c2008M6850.getClass();
        C6178 c6178 = new C6178();
        c2008M6850.m6855(c6178);
        OutputStream outputStreamMo4289 = c9378M29965.m24699().mo4289(false);
        try {
            outputStreamMo4289.write(bArrDigest);
            outputStreamMo4289.write(c6178.m17808(), 0, c6178.size());
            outputStreamMo4289.close();
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m30006(String str, String str2) throws C3090 {
        C16946 c16946 = (C16946) this.f38534.get(str);
        if (c16946 == null) {
            throw new C3090(C25272.m56409("Xml not found: ", str));
        }
        m29980(c16946, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29980(C16946 c16946, String str) {
        boolean z;
        C9378 c9378 = c16946.f55357;
        String str2 = c16946.f55358;
        if (c9378 == null) {
            c16946.f55357 = new C9378(new C9378(this.f38532, DocumentReader.RESERVED), C14483.m34972(str2, ".xml"));
            z = true;
        } else {
            z = false;
        }
        c16946.f55357.m24699().m49879(str);
        if (this.f38524 && z) {
            this.f38521.add(str2);
            this.f38525.mo40348(C4681.unmodifiableSet(this.f38521));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29969(String str) {
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        ArrayList arrayList = new ArrayList();
        for (C16946 c16946 : this.f38534.values()) {
            if (c16946.f55358.startsWith(str)) {
                arrayList.add(c16946.f55358);
            }
        }
        m29974((Collection) arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29974(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            C16946 c16946 = (C16946) this.f38534.remove(str);
            if (c16946 != null) {
                C9378 c9378 = c16946.f55357;
                if (c9378 != null) {
                    c9378.m24697();
                    if (this.f38524) {
                        this.f38521.remove(str);
                        z2 = true;
                    }
                }
                if (c16946.f55363 != null) {
                    sb.append(str);
                    sb.append('\n');
                }
                if (this.f38530.contains(str)) {
                    z = true;
                }
            }
        }
        if (sb.length() > 0) {
            AbstractC22044 abstractC22044M24694 = m29968().m24694("removed");
            try {
                abstractC22044M24694.mo49834();
                abstractC22044M24694.m49873(sb.toString());
            } catch (Throwable th) {
                this.f38527.mo40348(th);
            }
        }
        if (z) {
            m29942();
        }
        if (z2) {
            this.f38525.mo40348(C4681.unmodifiableSet(this.f38521));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m29960() {
        AbstractC22044 abstractC22044M24694 = m29968().m24694("recent");
        try {
            abstractC22044M24694.getClass();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(abstractC22044M24694.mo4289(false), StandardCharsets.UTF_8));
            try {
                Iterator it = this.f38530.iterator();
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
            this.f38527.mo40348(th3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29972(String str) {
        ArrayList arrayList = this.f38530;
        if (arrayList.isEmpty() || !((String) arrayList.get(0)).equals(str)) {
            arrayList.remove(str);
            arrayList.add(0, str);
            while (arrayList.size() > 30) {
                C2764.m9138(arrayList, 1);
            }
            m29960();
            m29942();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29992(String str) {
        if (this.f38530.remove(str)) {
            m29960();
            m29942();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m29996() {
        this.f38530.clear();
        m29960();
        m29942();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m29942() {
        ArrayList arrayList = this.f38530;
        this.f38528.mo40348(C4681.unmodifiableList(new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 15)))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29977(ActivityC0848 activityC0848, C2667 c2667) {
        this.f38527.m40350(activityC0848, c2667);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29982(C19206 c19206, C15311 c15311) {
        this.f38528.m40350(c19206, c15311);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29981(C19206 c19206, C12493 c12493) {
        this.f38525.m40350(c19206, c12493);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29986(final ActivityC0848 activityC0848, C22761 c22761) {
        boolean z;
        boolean z2;
        int i = 0;
        if (m11161()) {
            boolean zMo2934 = m29968().m24694("strings_changed").mo2934();
            if (activityC0848.m3439()) {
                z = true;
            } else {
                if (this.f38531 || this.f38526) {
                    z2 = true;
                } else {
                    try {
                        if (!m29967()) {
                            C20172 c20172 = new C20172(this);
                            c20172.m46399();
                            if (c20172.f64787.isEmpty() && this.f38522 == c20172.f64788.size()) {
                                z2 = false;
                            } else {
                                C9378 c9378M29959 = m29959();
                                C9378 c9378 = new C9378(m11158(), "arscBuild/resources.digest");
                                if (c9378M29959.m24702() && c9378.m24702()) {
                                    z2 = !m29954(c9378M29959, c9378, c20172.m46400());
                                }
                            }
                            this.f38526 = z2;
                        }
                        z2 = true;
                        this.f38526 = z2;
                    } catch (Exception unused) {
                        this.f38526 = true;
                        z2 = true;
                    }
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (zMo2934) {
                int i2 = DialogInterfaceC8327.f27315;
                C2361 c2361 = new C2361(activityC0848);
                c2361.m8021(R.string.MT_Protector);
                c2361.m8000(R.string.MT_Protector);
                c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21269(i, c22761));
                if (z) {
                    c2361.m8018(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13626(activityC0848, 2));
                } else {
                    c2361.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۖۧۧ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            activityC0848.finish();
                        }
                    });
                }
                c2361.m8016();
                return true;
            }
            if (z) {
                activityC0848.m3426();
                return true;
            }
        }
        return false;
    }
}
