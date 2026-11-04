package l;

import android.util.SparseLongArray;
import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7667 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f25242;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f25247;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f25248;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f25249;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f25250;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f25251;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f25252;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f25253;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f25255;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f25257;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f25258;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f25259;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C12141 f25260;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f25261;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Object f25246 = new Object();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Object f25243 = new Object();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f25245 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f25241 = new HashMap();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public HashMap f25256 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashSet f25254 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f25244 = -1;

    public C7667(AbstractC22044 abstractC22044) {
        this.f25248 = abstractC22044;
        this.f25249 = abstractC22044.m49876("x");
        this.f25242 = abstractC22044.m49876("y");
        this.f25253 = abstractC22044.m49876("f");
        this.f25247 = abstractC22044.m49876("complete.json");
        this.f25255 = abstractC22044.m49876("complete.json.tmp");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21092 m20896(String str, C21105 c21105) {
        if (m20875()) {
            return C21092.m48153(m20905());
        }
        if (!m20884()) {
            return C21092.m48153(m20905());
        }
        synchronized (this.f25246) {
            if (!this.f25261 && !this.f25250) {
                C18108 c18108 = (C18108) this.f25256.get(str);
                if (c18108 == null) {
                    return C21092.m48153(false);
                }
                try {
                    C0560 c0560 = new C0560();
                    m20881(c18108, c0560, c21105, (C3938) null);
                    return new C21092(c0560.toString(), true, false);
                } catch (Exception unused) {
                    m20907();
                    return C21092.m48153(true);
                }
            }
            return C21092.m48153(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21092 m20895(String str, C0560 c0560, C21105 c21105, C3938 c3938) {
        if (m20875()) {
            return C21092.m48153(m20905());
        }
        if (!m20884()) {
            return C21092.m48153(m20905());
        }
        synchronized (this.f25246) {
            if (!this.f25261 && !this.f25250) {
                C18108 c18108 = (C18108) this.f25256.get(str);
                if (c18108 == null) {
                    return C21092.m48153(false);
                }
                try {
                    m20881(c18108, c0560, c21105, c3938);
                    return new C21092(null, true, false);
                } catch (Exception unused) {
                    c0560.m2567();
                    return C21092.m48153(true);
                }
            }
            return C21092.m48153(false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC6176 m20903(String str) {
        if (!m20884()) {
            return EnumC6176.UNAVAILABLE;
        }
        synchronized (this.f25246) {
            if (!this.f25261 && !this.f25250) {
                if (this.f25256.containsKey(str)) {
                    return EnumC6176.OFFSET;
                }
                if (this.f25254.contains(str)) {
                    return EnumC6176.FAILURE;
                }
                return EnumC6176.MISS;
            }
            return EnumC6176.UNAVAILABLE;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m20906(String str, C21105 c21105) {
        if (m20884()) {
            synchronized (this.f25246) {
                if (!this.f25261 && !this.f25250 && !this.f25256.containsKey(str)) {
                    if (c21105.m48179()) {
                        return m20898(str);
                    }
                    try {
                        c21105.m48172();
                        synchronized (this.f25243) {
                            synchronized (this.f25246) {
                                if (!this.f25261 && !this.f25250 && !this.f25256.containsKey(str)) {
                                    try {
                                        if (this.f25260 == null) {
                                            this.f25248.m49853();
                                            this.f25260 = new C12141(this);
                                        }
                                        C18108 c18108M30349 = this.f25260.m30349(str, c21105);
                                        synchronized (this.f25246) {
                                            if (!this.f25261 && !this.f25250 && !this.f25256.containsKey(str)) {
                                                this.f25256.put(str, c18108M30349);
                                                this.f25254.remove(str);
                                                return true;
                                            }
                                            return false;
                                        }
                                    } catch (IOException unused) {
                                        m20894();
                                    }
                                }
                                return false;
                            }
                        }
                    } catch (IOException unused2) {
                        return false;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20898(String str) {
        if (m20884()) {
            synchronized (this.f25246) {
                if (!this.f25261 && !this.f25250 && !this.f25256.containsKey(str) && !this.f25254.contains(str)) {
                    synchronized (this.f25243) {
                        synchronized (this.f25246) {
                            if (!this.f25261 && !this.f25250 && !this.f25256.containsKey(str) && !this.f25254.contains(str)) {
                                try {
                                    if (this.f25260 == null) {
                                        this.f25248.m49853();
                                        this.f25260 = new C12141(this);
                                    }
                                    this.f25260.m30351(str);
                                    synchronized (this.f25246) {
                                        if (!this.f25261 && !this.f25250 && !this.f25256.containsKey(str)) {
                                            this.f25254.add(str);
                                            return true;
                                        }
                                        return false;
                                    }
                                } catch (IOException unused) {
                                    m20894();
                                }
                            }
                            return false;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m20902() {
        synchronized (this.f25246) {
            if (this.f25250 && !this.f25261) {
                m20894();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20899(ArrayList arrayList) {
        boolean z = false;
        if (!m20884()) {
            return false;
        }
        synchronized (this.f25246) {
            if (!this.f25261 && !this.f25250 && this.f25258 && this.f25244 == arrayList.size() && m20877((List) arrayList).equals(this.f25257) && m20892((List) arrayList)) {
                z = true;
            }
            this.f25251 = z;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20904(ArrayList arrayList) {
        if (m20884()) {
            synchronized (this.f25243) {
                try {
                    C12141 c12141 = this.f25260;
                    if (c12141 != null) {
                        c12141.m30350();
                        this.f25260 = null;
                    }
                    this.f25248.m49853();
                    String strM20877 = m20877((List) arrayList);
                    synchronized (this.f25246) {
                        try {
                            if (!this.f25261 && !this.f25250 && m20892((List) arrayList)) {
                                if (this.f25255.mo2934() && !this.f25255.mo4296()) {
                                    throw new IOException("Unable to delete stale complete temp file");
                                }
                                this.f25255.m49849(JSON.object().add("schemaVersion", 1).add("outputVersion", 1).add("candidateCount", arrayList.size()).add("candidateDigest", strM20877).toString().getBytes(StandardCharsets.UTF_8));
                                if (this.f25247.mo2934() && !this.f25247.mo4296()) {
                                    throw new IOException("Unable to replace complete file");
                                }
                                if (!this.f25255.mo4301(this.f25247)) {
                                    throw new IOException("Unable to publish complete file");
                                }
                                this.f25258 = true;
                                this.f25244 = arrayList.size();
                                this.f25257 = strM20877;
                                this.f25251 = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    C12141 c12142 = this.f25260;
                    if (c12142 != null) {
                        c12142.m30350();
                        this.f25260 = null;
                    }
                    AbstractC22044 abstractC22044 = this.f25255;
                    if (abstractC22044.mo2934()) {
                        abstractC22044.mo4296();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20897() {
        synchronized (this.f25243) {
            C12141 c12141 = this.f25260;
            if (c12141 != null) {
                c12141.m30350();
                this.f25260 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m20907() {
        synchronized (this.f25246) {
            if (!this.f25261 && !this.f25250) {
                this.f25250 = true;
                this.f25251 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m20905() {
        boolean z;
        synchronized (this.f25246) {
            z = this.f25250;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m20900() {
        boolean z;
        synchronized (this.f25246) {
            z = this.f25261;
        }
        return z;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m20901() {
        boolean z;
        synchronized (this.f25246) {
            z = this.f25261 || (this.f25252 && !this.f25250 && this.f25251);
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m20892(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C23330) it.next()).f75565;
            if (!this.f25256.containsKey(str) && !this.f25254.contains(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20875() {
        boolean z;
        synchronized (this.f25246) {
            z = this.f25261 || this.f25250;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m20884() {
        boolean z;
        C14378 c14378M20889;
        synchronized (this.f25246) {
            while (true) {
                z = false;
                if (!this.f25259) {
                    break;
                }
                try {
                    this.f25246.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            if (this.f25261) {
                return false;
            }
            if (this.f25252) {
                return !this.f25250;
            }
            this.f25259 = true;
            try {
                c14378M20889 = m20886();
            } catch (Exception unused2) {
                c14378M20889 = m20889();
            }
            C14378 c14378 = c14378M20889;
            synchronized (this.f25246) {
                this.f25259 = false;
                if (c14378.f45332) {
                    this.f25261 = true;
                    this.f25250 = false;
                    this.f25252 = true;
                    m20887();
                } else {
                    this.f25256 = c14378.f45329;
                    this.f25254 = c14378.f45330;
                    this.f25258 = c14378.f45328;
                    this.f25244 = c14378.f45327;
                    this.f25257 = c14378.f45331;
                    this.f25252 = true;
                    this.f25250 = false;
                    this.f25251 = false;
                }
                this.f25246.notifyAll();
                if (!this.f25261 && !this.f25250) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C14378 m20886() {
        C24076 c24076M53625;
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        SparseLongArray sparseLongArray = new SparseLongArray();
        try {
            if (!C18121.m42239(this.f25248)) {
                m20888();
                return new C14378(false, map, hashSet, C24076.m53625());
            }
            m20882(this.f25249, true, map, sparseLongArray);
            m20882(this.f25242, false, map, sparseLongArray);
            m20880(hashSet);
            AbstractC22044 abstractC22044 = this.f25255;
            boolean zMo2934 = abstractC22044.mo2934();
            AbstractC22044 abstractC22045 = this.f25247;
            if (zMo2934) {
                abstractC22044.mo4296();
                if (abstractC22045.mo2934()) {
                    abstractC22045.mo4296();
                }
                c24076M53625 = C24076.m53625();
            } else if (!abstractC22045.mo2934()) {
                c24076M53625 = C24076.m53625();
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(new String(abstractC22045.m49865(), StandardCharsets.UTF_8));
                    if (jSONObject.getInt("schemaVersion", -1) != 1 || jSONObject.getInt("outputVersion", -1) != 1) {
                        abstractC22045.mo4296();
                        c24076M53625 = C24076.m53625();
                    } else {
                        int i = jSONObject.getInt("candidateCount", -1);
                        String string = jSONObject.getString("candidateDigest", null);
                        if (i < 0 || string == null || string.isEmpty()) {
                            abstractC22045.mo4296();
                            c24076M53625 = C24076.m53625();
                        } else {
                            c24076M53625 = new C24076(i, string, true);
                        }
                    }
                } catch (Exception unused) {
                    abstractC22045.mo4296();
                    c24076M53625 = C24076.m53625();
                }
            }
            return new C14378(false, map, hashSet, c24076M53625);
        } catch (IOException unused2) {
            return m20889();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C14378 m20889() {
        try {
            m20888();
            return new C14378(false, new HashMap(), new HashSet(), C24076.m53625());
        } catch (IOException unused) {
            return new C14378(true, new HashMap(), new HashSet(), C24076.m53625());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20882(AbstractC22044 abstractC22044, boolean z, HashMap map, SparseLongArray sparseLongArray) throws IOException {
        String str;
        if (abstractC22044.mo2934()) {
            byte[] bArrM49865 = abstractC22044.m49865();
            C0209 c0209 = new C0209(bArrM49865);
            try {
                DataInputStream dataInputStream = new DataInputStream(c0209);
                while (c0209.position() < bArrM49865.length) {
                    try {
                        if (z) {
                            str = dataInputStream.readUTF();
                        } else {
                            int i = dataInputStream.readInt();
                            if (i < 0 || i > 1048576) {
                                throw new IOException("Invalid smali record name length");
                            }
                            byte[] bArr = new byte[i];
                            dataInputStream.readFully(bArr);
                            str = new String(bArr, StandardCharsets.UTF_8);
                        }
                        int unsignedShort = dataInputStream.readUnsignedShort();
                        int i2 = dataInputStream.readInt();
                        int i3 = dataInputStream.readInt();
                        m20879(unsignedShort, i2, i3, sparseLongArray);
                        map.put(str, new C18108(unsignedShort, i2, i3));
                    } catch (Throwable th) {
                        try {
                            dataInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                dataInputStream.close();
            } catch (EOFException e) {
                throw new IOException("Damaged smali offset record", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20880(HashSet hashSet) throws IOException {
        AbstractC22044 abstractC22044 = this.f25253;
        if (abstractC22044.mo2934()) {
            byte[] bArrM49865 = abstractC22044.m49865();
            C0209 c0209 = new C0209(bArrM49865);
            try {
                DataInputStream dataInputStream = new DataInputStream(c0209);
                while (c0209.position() < bArrM49865.length) {
                    try {
                        hashSet.add(C18121.m42237(dataInputStream));
                    } catch (Throwable th) {
                        try {
                            dataInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                dataInputStream.close();
            } catch (EOFException e) {
                throw new IOException("Damaged smali failure record", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20879(int i, int i2, int i3, SparseLongArray sparseLongArray) throws IOException {
        long jMo4285;
        if (i2 < 0 || i3 <= 0) {
            throw new IOException("Invalid smali cache offset");
        }
        int iIndexOfKey = sparseLongArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            jMo4285 = sparseLongArray.valueAt(iIndexOfKey);
        } else {
            AbstractC22044 abstractC22044M49876 = this.f25248.m49876(String.valueOf(i));
            if (!abstractC22044M49876.mo4304()) {
                throw new IOException("Missing smali cache data file");
            }
            jMo4285 = abstractC22044M49876.mo4285();
            sparseLongArray.put(i, jMo4285);
        }
        if (((long) i2) + ((long) i3) > jMo4285) {
            throw new IOException("Smali cache offset exceeds data file");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d A[Catch: all -> 0x00a3, DONT_GENERATE, TryCatch #0 {, blocks: (B:9:0x000e, B:11:0x001d, B:13:0x0020, B:16:0x002a, B:17:0x002d), top: B:53:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0020 A[Catch: all -> 0x00a3, TryCatch #0 {, blocks: (B:9:0x000e, B:11:0x001d, B:13:0x0020, B:16:0x002a, B:17:0x002d), top: B:53:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0032 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e A[LOOP:0: B:3:0x0002->B:49:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x000e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0047 A[EDGE_INSN: B:60:0x0047->B:27:0x0047 BREAK  A[LOOP:0: B:3:0x0002->B:49:0x009e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x000b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20881(C18108 c18108, C0560 c0560, C21105 c21105, C3938 c3938) throws Throwable {
        Reference reference;
        byte[] bArr;
        byte[] bArrM20883;
        int i = c18108.f59262;
        while (true) {
            if (c3938 != null) {
                bArrM20883 = c3938.m12656(i);
                if (bArrM20883 == null) {
                    synchronized (this.f25245) {
                        reference = (Reference) this.f25241.get(Integer.valueOf(i));
                        if (reference == null) {
                            bArrM20883 = null;
                        } else {
                            bArr = (byte[]) reference.get();
                            if (bArr != null) {
                                c3938.m12655(i, bArr);
                            }
                            bArrM20883 = bArr;
                        }
                        if (bArrM20883 == null) {
                            break;
                            break;
                        }
                        if (c3938 == null) {
                            bArrM20883 = m20883(i, (C3938) null);
                            break;
                        } else {
                            if (C3938.m12653(c3938, i, false)) {
                                bArrM20883 = m20883(i, c3938);
                                C3938.m12651(i, c3938);
                                break;
                            }
                            C3938.m12654(i, c3938);
                        }
                    }
                } else {
                    break;
                }
            } else {
                synchronized (this.f25245) {
                    reference = (Reference) this.f25241.get(Integer.valueOf(i));
                    if (reference == null) {
                        bArrM20883 = null;
                    } else {
                        bArr = (byte[]) reference.get();
                        if (bArr != null && c3938 != null) {
                            c3938.m12655(i, bArr);
                        }
                        bArrM20883 = bArr;
                    }
                }
                if (bArrM20883 == null) {
                    break;
                }
                if (c3938 == null) {
                    bArrM20883 = m20883(i, (C3938) null);
                    break;
                }
                if (C3938.m12653(c3938, i, false)) {
                    try {
                        bArrM20883 = m20883(i, c3938);
                        C3938.m12651(i, c3938);
                        break;
                    } catch (Throwable th) {
                        C3938.m12651(i, c3938);
                        throw th;
                    }
                }
                C3938.m12654(i, c3938);
            }
        }
        if (c3938 != null && ((long) c18108.f59263) + ((long) c18108.f59264) > bArrM20883.length) {
            int i2 = c18108.f59262;
            do {
                if (C3938.m12653(c3938, i2, true)) {
                    try {
                        bArrM20883 = m20883(i2, c3938);
                        C3938.m12651(i2, c3938);
                        break;
                    } catch (Throwable th2) {
                        C3938.m12651(i2, c3938);
                        throw th2;
                    }
                }
                C3938.m12654(i2, c3938);
                bArrM20883 = c3938.m12656(i2);
            } while (bArrM20883 == null);
        }
        int i3 = c18108.f59263;
        int i4 = c18108.f59264;
        if (((long) i3) + ((long) i4) > bArrM20883.length) {
            throw new IOException("Smali cache data range is invalid");
        }
        c21105.m48173(i3, i4, bArrM20883);
        C21443.m48765(c21105.m48176(), c21105.m48175(), c0560);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m20894() {
        synchronized (this.f25243) {
            try {
                m20888();
                synchronized (this.f25246) {
                    m20887();
                    this.f25252 = true;
                    this.f25250 = false;
                    this.f25261 = false;
                }
            } catch (IOException unused) {
                synchronized (this.f25246) {
                    m20887();
                    this.f25252 = true;
                    this.f25250 = false;
                    this.f25261 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m20887() {
        this.f25256 = new HashMap();
        this.f25254 = new HashSet();
        this.f25258 = false;
        this.f25251 = false;
        this.f25244 = -1;
        this.f25257 = null;
        synchronized (this.f25245) {
            this.f25241.clear();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m20888() throws IOException {
        C12141 c12141 = this.f25260;
        if (c12141 != null) {
            c12141.m30350();
            this.f25260 = null;
        }
        synchronized (this.f25245) {
            this.f25241.clear();
        }
        if (this.f25248.mo2934()) {
            for (AbstractC22044 abstractC22044 : this.f25248.mo4299(true)) {
                if (abstractC22044.mo2934() && !abstractC22044.mo4296()) {
                    throw new IOException("Unable to delete smali cache file");
                }
            }
        }
        C18121.m42242(this.f25248);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m20878(C7667 c7667, int i) {
        return c7667.f25248.m49876(String.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m20883(int i, C3938 c3938) throws IOException {
        byte[] bArrM49865 = this.f25248.m49876(String.valueOf(i)).m49865();
        synchronized (this.f25245) {
            this.f25241.put(Integer.valueOf(i), new SoftReference(bArrM49865));
        }
        if (c3938 != null) {
            C3938.m12652(c3938);
            c3938.m12655(i, bArrM49865);
        }
        return bArrM49865;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20877(List list) {
        try {
            MessageDigest messageDigestM36179 = C15022.m36179();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((C23330) it.next()).f75565.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length;
                messageDigestM36179.update(new byte[]{(byte) ((length >>> 24) & 255), (byte) ((length >>> 16) & 255), (byte) ((length >>> 8) & 255), (byte) (length & 255)});
                messageDigestM36179.update(bytes);
            }
            return C15022.m36182(messageDigestM36179.digest());
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
