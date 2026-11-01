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

/* JADX INFO: renamed from: l.ᩴ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18438 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f58758;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f58759;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f58762;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f58763;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C0798 f58764;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f58765;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f58766;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f58768;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f58770;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f58771;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f58772;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f58773;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f58777;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f58778;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f58767 = new Object();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f58775 = new Object();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Object f58769 = new Object();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashMap f58760 = new HashMap();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public HashMap f58774 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashSet f58776 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f58761 = -1;

    public C18438(AbstractC20745 abstractC20745) {
        this.f58763 = abstractC20745;
        this.f58766 = abstractC20745.m46690("x");
        this.f58765 = abstractC20745.m46690("y");
        this.f58771 = abstractC20745.m46690("f");
        this.f58768 = abstractC20745.m46690("complete.json");
        this.f58762 = abstractC20745.m46690("complete.json.tmp");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14911 m42770(String str, C17358 c17358) throws Throwable {
        if (m42750()) {
            return C14911.m35657(m42778());
        }
        if (!m42762()) {
            return C14911.m35657(m42778());
        }
        synchronized (this.f58767) {
            if (!this.f58778 && !this.f58758) {
                C21260 c21260 = (C21260) this.f58774.get(str);
                if (c21260 == null) {
                    return C14911.m35657(false);
                }
                try {
                    C2093 c2093 = new C2093();
                    m42757(c21260, c2093, c17358, (C6443) null);
                    return new C14911(c2093.toString(), true, false);
                } catch (Exception unused) {
                    m42768();
                    return C14911.m35657(true);
                }
            }
            return C14911.m35657(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14911 m42769(String str, C2093 c2093, C17358 c17358, C6443 c6443) throws Throwable {
        if (m42750()) {
            return C14911.m35657(m42778());
        }
        if (!m42762()) {
            return C14911.m35657(m42778());
        }
        synchronized (this.f58767) {
            if (!this.f58778 && !this.f58758) {
                C21260 c21260 = (C21260) this.f58774.get(str);
                if (c21260 == null) {
                    return C14911.m35657(false);
                }
                try {
                    m42757(c21260, c2093, c17358, c6443);
                    return new C14911(null, true, false);
                } catch (Exception unused) {
                    c2093.m6636();
                    return C14911.m35657(true);
                }
            }
            return C14911.m35657(false);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC12794 m42776(String str) {
        if (!m42762()) {
            return EnumC12794.UNAVAILABLE;
        }
        synchronized (this.f58767) {
            if (!this.f58778 && !this.f58758) {
                if (this.f58774.containsKey(str)) {
                    return EnumC12794.OFFSET;
                }
                if (this.f58776.contains(str)) {
                    return EnumC12794.FAILURE;
                }
                return EnumC12794.MISS;
            }
            return EnumC12794.UNAVAILABLE;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m42779(String str, C17358 c17358) {
        if (m42762()) {
            synchronized (this.f58767) {
                if (!this.f58778 && !this.f58758 && !this.f58774.containsKey(str)) {
                    if (c17358.m40390()) {
                        return m42772(str);
                    }
                    try {
                        c17358.m40391();
                        synchronized (this.f58775) {
                            synchronized (this.f58767) {
                                if (!this.f58778 && !this.f58758 && !this.f58774.containsKey(str)) {
                                    try {
                                        if (this.f58764 == null) {
                                            this.f58763.m46739();
                                            this.f58764 = new C0798(this);
                                        }
                                        C21260 c21260M3367 = this.f58764.m3367(str, c17358);
                                        synchronized (this.f58767) {
                                            if (!this.f58778 && !this.f58758 && !this.f58774.containsKey(str)) {
                                                this.f58774.put(str, c21260M3367);
                                                this.f58776.remove(str);
                                                return true;
                                            }
                                            return false;
                                        }
                                    } catch (IOException unused) {
                                        m42767();
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
    public final boolean m42772(String str) {
        if (m42762()) {
            synchronized (this.f58767) {
                if (!this.f58778 && !this.f58758 && !this.f58774.containsKey(str) && !this.f58776.contains(str)) {
                    synchronized (this.f58775) {
                        synchronized (this.f58767) {
                            if (!this.f58778 && !this.f58758 && !this.f58774.containsKey(str) && !this.f58776.contains(str)) {
                                try {
                                    if (this.f58764 == null) {
                                        this.f58763.m46739();
                                        this.f58764 = new C0798(this);
                                    }
                                    this.f58764.m3369(str);
                                    synchronized (this.f58767) {
                                        if (!this.f58778 && !this.f58758 && !this.f58774.containsKey(str)) {
                                            this.f58776.add(str);
                                            return true;
                                        }
                                        return false;
                                    }
                                } catch (IOException unused) {
                                    m42767();
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

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m42774() {
        synchronized (this.f58767) {
            if (this.f58758 && !this.f58778) {
                m42767();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42773(ArrayList arrayList) {
        boolean z = false;
        if (!m42762()) {
            return false;
        }
        synchronized (this.f58767) {
            if (!this.f58778 && !this.f58758 && this.f58759 && this.f58761 == arrayList.size() && m42752((List) arrayList).equals(this.f58770) && m42764((List) arrayList)) {
                z = true;
            }
            this.f58777 = z;
        }
        return z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42777(ArrayList arrayList) {
        if (m42762()) {
            synchronized (this.f58775) {
                try {
                    C0798 c0798 = this.f58764;
                    if (c0798 != null) {
                        c0798.m3368();
                        this.f58764 = null;
                    }
                    this.f58763.m46739();
                    String strM42752 = m42752((List) arrayList);
                    synchronized (this.f58767) {
                        try {
                            if (!this.f58778 && !this.f58758 && m42764((List) arrayList)) {
                                if (this.f58762.mo33975() && !this.f58762.mo24647()) {
                                    throw new IOException("Unable to delete stale complete temp file");
                                }
                                this.f58762.m46703(JSON.object().add("schemaVersion", 1).add("outputVersion", 1).add("candidateCount", arrayList.size()).add("candidateDigest", strM42752).toString().getBytes(StandardCharsets.UTF_8));
                                if (this.f58768.mo33975() && !this.f58768.mo24647()) {
                                    throw new IOException("Unable to replace complete file");
                                }
                                if (!this.f58762.mo24646(this.f58768)) {
                                    throw new IOException("Unable to publish complete file");
                                }
                                this.f58759 = true;
                                this.f58761 = arrayList.size();
                                this.f58770 = strM42752;
                                this.f58777 = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    C0798 c0799 = this.f58764;
                    if (c0799 != null) {
                        c0799.m3368();
                        this.f58764 = null;
                    }
                    AbstractC20745 abstractC20745 = this.f58762;
                    if (abstractC20745.mo33975()) {
                        abstractC20745.mo24647();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42771() {
        synchronized (this.f58775) {
            C0798 c0798 = this.f58764;
            if (c0798 != null) {
                c0798.m3368();
                this.f58764 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m42768() {
        synchronized (this.f58767) {
            if (!this.f58778 && !this.f58758) {
                this.f58758 = true;
                this.f58777 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m42778() {
        boolean z;
        synchronized (this.f58767) {
            z = this.f58758;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m42775() {
        boolean z;
        synchronized (this.f58767) {
            z = this.f58778;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m42780() {
        boolean z;
        synchronized (this.f58767) {
            z = this.f58778 || (this.f58772 && !this.f58758 && this.f58777);
        }
        return z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m42764(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C5032) it.next()).f17548;
            if (!this.f58774.containsKey(str) && !this.f58776.contains(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private boolean m42750() {
        boolean z;
        synchronized (this.f58767) {
            z = this.f58778 || this.f58758;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m42762() {
        boolean z;
        C22672 c22672M42766;
        synchronized (this.f58767) {
            while (true) {
                z = false;
                if (!this.f58773) {
                    break;
                }
                try {
                    this.f58767.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            if (this.f58778) {
                return false;
            }
            if (this.f58772) {
                return !this.f58758;
            }
            this.f58773 = true;
            try {
                c22672M42766 = m42760();
            } catch (Exception unused2) {
                c22672M42766 = m42766();
            }
            C22672 c22672 = c22672M42766;
            synchronized (this.f58767) {
                this.f58773 = false;
                if (c22672.f73826) {
                    this.f58778 = true;
                    this.f58758 = false;
                    this.f58772 = true;
                    m42748();
                } else {
                    this.f58774 = c22672.f73831;
                    this.f58776 = c22672.f73828;
                    this.f58759 = c22672.f73829;
                    this.f58761 = c22672.f73827;
                    this.f58770 = c22672.f73830;
                    this.f58772 = true;
                    this.f58758 = false;
                    this.f58777 = false;
                }
                this.f58767.notifyAll();
                if (!this.f58778 && !this.f58758) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C22672 m42760() {
        C3620 c3620M10725;
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        SparseLongArray sparseLongArray = new SparseLongArray();
        try {
            if (!C6069.m16469(this.f58763)) {
                m42765();
                return new C22672(false, map, hashSet, C3620.m10725());
            }
            m42756(this.f58766, true, map, sparseLongArray);
            m42756(this.f58765, false, map, sparseLongArray);
            m42755(hashSet);
            AbstractC20745 abstractC20745 = this.f58762;
            boolean zMo33975 = abstractC20745.mo33975();
            AbstractC20745 abstractC20746 = this.f58768;
            if (zMo33975) {
                abstractC20745.mo24647();
                if (abstractC20746.mo33975()) {
                    abstractC20746.mo24647();
                }
                c3620M10725 = C3620.m10725();
            } else if (!abstractC20746.mo33975()) {
                c3620M10725 = C3620.m10725();
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(new String(abstractC20746.m46727(), StandardCharsets.UTF_8));
                    if (jSONObject.getInt("schemaVersion", -1) != 1 || jSONObject.getInt("outputVersion", -1) != 1) {
                        abstractC20746.mo24647();
                        c3620M10725 = C3620.m10725();
                    } else {
                        int i = jSONObject.getInt("candidateCount", -1);
                        String string = jSONObject.getString("candidateDigest", null);
                        if (i < 0 || string == null || string.isEmpty()) {
                            abstractC20746.mo24647();
                            c3620M10725 = C3620.m10725();
                        } else {
                            c3620M10725 = new C3620(i, string, true);
                        }
                    }
                } catch (Exception unused) {
                    abstractC20746.mo24647();
                    c3620M10725 = C3620.m10725();
                }
            }
            return new C22672(false, map, hashSet, c3620M10725);
        } catch (IOException unused2) {
            return m42766();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C22672 m42766() {
        try {
            m42765();
            return new C22672(false, new HashMap(), new HashSet(), C3620.m10725());
        } catch (IOException unused) {
            return new C22672(true, new HashMap(), new HashSet(), C3620.m10725());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42756(AbstractC20745 abstractC20745, boolean z, HashMap map, SparseLongArray sparseLongArray) throws IOException {
        String str;
        if (abstractC20745.mo33975()) {
            byte[] bArrM46727 = abstractC20745.m46727();
            C17732 c17732 = new C17732(bArrM46727);
            try {
                DataInputStream dataInputStream = new DataInputStream(c17732);
                while (c17732.position() < bArrM46727.length) {
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
                        m42754(unsignedShort, i2, i3, sparseLongArray);
                        map.put(str, new C21260(unsignedShort, i2, i3));
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
    private void m42755(HashSet hashSet) throws IOException {
        AbstractC20745 abstractC20745 = this.f58771;
        if (abstractC20745.mo33975()) {
            byte[] bArrM46727 = abstractC20745.m46727();
            C17732 c17732 = new C17732(bArrM46727);
            try {
                DataInputStream dataInputStream = new DataInputStream(c17732);
                while (c17732.position() < bArrM46727.length) {
                    try {
                        hashSet.add(C6069.m16467(dataInputStream));
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
    private void m42754(int i, int i2, int i3, SparseLongArray sparseLongArray) throws IOException {
        long jMo33964;
        if (i2 < 0 || i3 <= 0) {
            throw new IOException("Invalid smali cache offset");
        }
        int iIndexOfKey = sparseLongArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            jMo33964 = sparseLongArray.valueAt(iIndexOfKey);
        } else {
            AbstractC20745 abstractC20745M46690 = this.f58763.m46690(String.valueOf(i));
            if (!abstractC20745M46690.mo33971()) {
                throw new IOException("Missing smali cache data file");
            }
            jMo33964 = abstractC20745M46690.mo33964();
            sparseLongArray.put(i, jMo33964);
        }
        if (((long) i2) + ((long) i3) > jMo33964) {
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
    private void m42757(C21260 c21260, C2093 c2093, C17358 c17358, C6443 c6443) throws Throwable {
        Reference reference;
        byte[] bArr;
        byte[] bArrM42758;
        int i = c21260.f69228;
        while (true) {
            if (c6443 != null) {
                bArrM42758 = c6443.m17630(i);
                if (bArrM42758 == null) {
                    synchronized (this.f58769) {
                        reference = (Reference) this.f58760.get(Integer.valueOf(i));
                        if (reference == null) {
                            bArrM42758 = null;
                        } else {
                            bArr = (byte[]) reference.get();
                            if (bArr != null) {
                                c6443.m17629(i, bArr);
                            }
                            bArrM42758 = bArr;
                        }
                        if (bArrM42758 == null) {
                            break;
                            break;
                        }
                        if (c6443 == null) {
                            bArrM42758 = m42758(i, (C6443) null);
                            break;
                        } else {
                            if (C6443.m17627(c6443, i, false)) {
                                bArrM42758 = m42758(i, c6443);
                                C6443.m17625(i, c6443);
                                break;
                            }
                            C6443.m17628(i, c6443);
                        }
                    }
                } else {
                    break;
                }
            } else {
                synchronized (this.f58769) {
                    reference = (Reference) this.f58760.get(Integer.valueOf(i));
                    if (reference == null) {
                        bArrM42758 = null;
                    } else {
                        bArr = (byte[]) reference.get();
                        if (bArr != null && c6443 != null) {
                            c6443.m17629(i, bArr);
                        }
                        bArrM42758 = bArr;
                    }
                }
                if (bArrM42758 == null) {
                    break;
                }
                if (c6443 == null) {
                    bArrM42758 = m42758(i, (C6443) null);
                    break;
                }
                if (C6443.m17627(c6443, i, false)) {
                    try {
                        bArrM42758 = m42758(i, c6443);
                        C6443.m17625(i, c6443);
                        break;
                    } catch (Throwable th) {
                        C6443.m17625(i, c6443);
                        throw th;
                    }
                }
                C6443.m17628(i, c6443);
            }
        }
        if (c6443 != null && ((long) c21260.f69229) + ((long) c21260.f69230) > bArrM42758.length) {
            int i2 = c21260.f69228;
            do {
                if (C6443.m17627(c6443, i2, true)) {
                    try {
                        bArrM42758 = m42758(i2, c6443);
                        C6443.m17625(i2, c6443);
                        break;
                    } catch (Throwable th2) {
                        C6443.m17625(i2, c6443);
                        throw th2;
                    }
                }
                C6443.m17628(i2, c6443);
                bArrM42758 = c6443.m17630(i2);
            } while (bArrM42758 == null);
        }
        int i3 = c21260.f69229;
        int i4 = c21260.f69230;
        if (((long) i3) + ((long) i4) > bArrM42758.length) {
            throw new IOException("Smali cache data range is invalid");
        }
        c17358.m40392(i3, i4, bArrM42758);
        C23967.m52800(c17358.m40396(), c17358.m40389(), c2093);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m42767() {
        synchronized (this.f58775) {
            try {
                m42765();
                synchronized (this.f58767) {
                    m42748();
                    this.f58772 = true;
                    this.f58758 = false;
                    this.f58778 = false;
                }
            } catch (IOException unused) {
                synchronized (this.f58767) {
                    m42748();
                    this.f58772 = true;
                    this.f58758 = false;
                    this.f58778 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m42748() {
        this.f58774 = new HashMap();
        this.f58776 = new HashSet();
        this.f58759 = false;
        this.f58777 = false;
        this.f58761 = -1;
        this.f58770 = null;
        synchronized (this.f58769) {
            this.f58760.clear();
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m42765() throws IOException {
        C0798 c0798 = this.f58764;
        if (c0798 != null) {
            c0798.m3368();
            this.f58764 = null;
        }
        synchronized (this.f58769) {
            this.f58760.clear();
        }
        if (this.f58763.mo33975()) {
            for (AbstractC20745 abstractC20745 : this.f58763.mo33983(true)) {
                if (abstractC20745.mo33975() && !abstractC20745.mo24647()) {
                    throw new IOException("Unable to delete smali cache file");
                }
            }
        }
        C6069.m16472(this.f58763);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m42753(C18438 c18438, int i) {
        return c18438.f58763.m46690(String.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m42758(int i, C6443 c6443) throws IOException {
        byte[] bArrM46727 = this.f58763.m46690(String.valueOf(i)).m46727();
        synchronized (this.f58769) {
            this.f58760.put(Integer.valueOf(i), new SoftReference(bArrM46727));
        }
        if (c6443 != null) {
            C6443.m17626(c6443);
            c6443.m17629(i, bArrM46727);
        }
        return bArrM46727;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42752(List list) {
        try {
            MessageDigest messageDigestM49421 = C22253.m49421();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((C5032) it.next()).f17548.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length;
                messageDigestM49421.update(new byte[]{(byte) ((length >>> 24) & 255), (byte) ((length >>> 16) & 255), (byte) ((length >>> 8) & 255), (byte) (length & 255)});
                messageDigestM49421.update(bytes);
            }
            return C22253.m49424(messageDigestM49421.digest());
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
