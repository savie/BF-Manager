package l;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9265 implements InterfaceC13433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20301 f30130;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile boolean f30131;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC13433 f30132;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8367 f30133;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Uri f30134;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f30135;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2554 f30136;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f30138;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C6284 f30140;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C5342 f30141;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f30137 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Map f30129 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f30139 = Collections.EMPTY_LIST;

    public C9265(C2554 c2554) {
        this.f30136 = c2554;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final void mo10894(InterfaceC4639 interfaceC4639) {
        ArrayList arrayList = this.f30137;
        if (arrayList.contains(interfaceC4639)) {
            return;
        }
        arrayList.add(interfaceC4639);
        InterfaceC13433 interfaceC13433 = this.f30132;
        if (interfaceC13433 != null) {
            interfaceC13433.mo10894(interfaceC4639);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws Throwable {
        long length;
        String str;
        String strM56409;
        C12799 c12799;
        if (this.f30132 != null || this.f30138 != null) {
            throw new IOException("Data source is already open");
        }
        this.f30131 = false;
        this.f30134 = c25368.f81907;
        this.f30129 = Collections.EMPTY_MAP;
        if (c25368.f81909 != 0 || c25368.f81910 != -1) {
            return m24454(c25368);
        }
        C24734 c24734 = this.f30136.f8204;
        if (this.f30136.f8199 == EnumC18962.f61480 && c24734 != null) {
            EnumC11307 enumC11307M55225 = c24734.m55225();
            EnumC11307 enumC11307 = EnumC11307.LIVE;
            if (enumC11307M55225 == enumC11307) {
                return m24454(c25368);
            }
            if (enumC11307M55225 == EnumC11307.UNKNOWN) {
                C8367 c8367M38629 = this.f30136.f8200.m38629();
                if (c8367M38629 != null) {
                    String strMo16748 = this.f30136.f8203.mo16748(c25368);
                    if (this.f30136.f8199.mo1994(strMo16748)) {
                        strM56409 = C25272.m56409("hls-playlist:", strMo16748);
                        str = strMo16748;
                    } else {
                        str = null;
                        strM56409 = null;
                    }
                } else {
                    str = null;
                    strM56409 = null;
                }
                if (c8367M38629 != null && str != null && strM56409 != null) {
                    C6284 c6284M13012 = this.f30136.f8205.m13012(str);
                    this.f30140 = c6284M13012;
                    try {
                        c6284M13012.m17963();
                        C18216 c18216M24446 = m24446(c8367M38629, strM56409, c25368, true);
                        c6284M13012.m17967();
                        c6284M13012.close();
                        if (this.f30140 == c6284M13012) {
                            this.f30140 = null;
                        }
                        if (c18216M24446 != null) {
                            if (!c24734.m55224()) {
                                return m24454(c25368);
                            }
                            this.f30138 = c18216M24446.f59472;
                            this.f30134 = c18216M24446.f59473;
                            this.f30135 = 0;
                            m24449(c8367M38629, c24734.m55227());
                            return c18216M24446.f59472.length;
                        }
                        if (c24734.m55225() == enumC11307) {
                            return m24454(c25368);
                        }
                    } catch (Throwable th) {
                        c6284M13012.close();
                        if (this.f30140 == c6284M13012) {
                            this.f30140 = null;
                        }
                        throw th;
                    }
                }
                InterfaceC13433 interfaceC13433Mo3996 = this.f30136.f8201.mo3996();
                this.f30132 = interfaceC13433Mo3996;
                m24450(interfaceC13433Mo3996);
                C5342 c5342 = new C5342();
                try {
                    long jMo8326 = interfaceC13433Mo3996.mo8326(c25368);
                    m24451(interfaceC13433Mo3996, c25368.f81907);
                    if (jMo8326 > 2097152) {
                        this.f30141 = c5342;
                        this.f30133 = c8367M38629;
                        return jMo8326;
                    }
                    int i = 2097153;
                    byte[] bArrCopyOf = new byte[Math.min(8192, 2097153)];
                    int i2 = 0;
                    while (!this.f30131 && !Thread.currentThread().isInterrupted()) {
                        if (i2 == bArrCopyOf.length) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, Math.min(i, bArrCopyOf.length * 2));
                        }
                        int i3 = interfaceC13433Mo3996.read(bArrCopyOf, i2, bArrCopyOf.length - i2);
                        if (i3 == -1) {
                            byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i2);
                            m24451(interfaceC13433Mo3996, c25368.f81907);
                            this.f30132 = null;
                            C18856.m43745(interfaceC13433Mo3996);
                            this.f30138 = bArrCopyOf2;
                            this.f30135 = 0;
                            if (c8367M38629 == null || str == null || strM56409 == null || bArrCopyOf2.length <= 0) {
                                c12799 = null;
                            } else {
                                Uri uri = this.f30134;
                                if (uri == null) {
                                    uri = c25368.f81907;
                                }
                                c12799 = new C12799(str, strM56409, bArrCopyOf2, uri, c25368);
                            }
                            List listM55222 = c24734.m55222(c5342.m15999(), c12799);
                            if (c8367M38629 != null) {
                                m24449(c8367M38629, listM55222);
                            }
                            return bArrCopyOf2.length;
                        }
                        if (i3 == 0) {
                            throw new IOException("HLS playlist upstream returned no data");
                        }
                        c5342.m16000(i2, i3, bArrCopyOf);
                        i2 += i3;
                        if (i2 > 2097152) {
                            this.f30138 = Arrays.copyOf(bArrCopyOf, i2);
                            this.f30135 = 0;
                            this.f30141 = c5342;
                            this.f30133 = c8367M38629;
                            return jMo8326;
                        }
                        i = 2097153;
                    }
                    throw new InterruptedIOException("Interrupted while loading HLS playlist");
                } catch (IOException e) {
                    e = e;
                    m24451(interfaceC13433Mo3996, c25368.f81907);
                    InterfaceC13433 interfaceC13433 = this.f30132;
                    this.f30132 = null;
                    C18856.m43745(interfaceC13433);
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    m24451(interfaceC13433Mo3996, c25368.f81907);
                    InterfaceC13433 interfaceC13434 = this.f30132;
                    this.f30132 = null;
                    C18856.m43745(interfaceC13434);
                    throw e;
                }
            }
        }
        C8367 c8367M386210 = this.f30136.f8200.m38629();
        if (c8367M386210 == null) {
            return m24454(c25368);
        }
        String strMo16749 = this.f30136.f8203.mo16748(c25368);
        if (!this.f30136.f8199.mo1994(strMo16749)) {
            return m24454(c25368);
        }
        String strM564010 = C25272.m56409("hls-playlist:", strMo16749);
        C6284 c6284M13013 = this.f30136.f8205.m13012(strMo16749);
        this.f30140 = c6284M13013;
        try {
            try {
                c6284M13013.m17963();
                do {
                    C18216 c18216M24447 = m24446(c8367M386210, strM564010, c25368, true);
                    if (c18216M24447 != null) {
                        c6284M13013.m17967();
                        C24734 c24735 = this.f30136.f8204;
                        if (c24735 != null) {
                            this.f30139 = c24735.m55227();
                        }
                        this.f30138 = c18216M24447.f59472;
                        this.f30134 = c18216M24447.f59473;
                        this.f30135 = 0;
                        length = c18216M24447.f59472.length;
                    }
                    c6284M13013.m17964();
                    c6284M13013.close();
                    this.f30140 = null;
                    List list = this.f30139;
                    this.f30139 = Collections.EMPTY_LIST;
                    m24449(c8367M386210, list);
                    return length;
                } while (!c6284M13013.m17966());
                length = m24445(c25368, c8367M386210, strM564010, m24452(c8367M386210, strM564010), c6284M13013);
                c6284M13013.m17964();
                c6284M13013.close();
                this.f30140 = null;
                List list2 = this.f30139;
                this.f30139 = Collections.EMPTY_LIST;
                m24449(c8367M386210, list2);
                return length;
            } catch (Throwable th2) {
                c6284M13013.m17964();
                c6284M13013.close();
                this.f30140 = null;
                List list3 = this.f30139;
                this.f30139 = Collections.EMPTY_LIST;
                m24449(c8367M386210, list3);
                throw th2;
            }
        } catch (IOException | RuntimeException e3) {
            InterfaceC13433 interfaceC13435 = this.f30132;
            this.f30132 = null;
            C18856.m43745(interfaceC13435);
            throw e3;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private long m24454(C25368 c25368) {
        InterfaceC13433 interfaceC13433Mo3996 = this.f30136.f8201.mo3996();
        this.f30132 = interfaceC13433Mo3996;
        m24450(interfaceC13433Mo3996);
        try {
            long jMo8326 = interfaceC13433Mo3996.mo8326(c25368);
            m24451(interfaceC13433Mo3996, c25368.f81907);
            return jMo8326;
        } catch (IOException | RuntimeException e) {
            m24451(interfaceC13433Mo3996, c25368.f81907);
            InterfaceC13433 interfaceC13433 = this.f30132;
            this.f30132 = null;
            C18856.m43745(interfaceC13433);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m24445(C25368 c25368, C8367 c8367, String str, boolean z, C6284 c6284) {
        C2554 c2554 = this.f30136;
        InterfaceC13433 interfaceC13433Mo3996 = c2554.f8201.mo3996();
        this.f30132 = interfaceC13433Mo3996;
        m24450(interfaceC13433Mo3996);
        C24734 c24734 = c2554.f8204;
        InterfaceC13433 interfaceC13433 = null;
        C5342 c5342 = c24734 == null ? null : new C5342();
        try {
            c6284.m17965();
            long jMo8326 = interfaceC13433Mo3996.mo8326(c25368);
            Uri uri = c25368.f81907;
            m24451(interfaceC13433Mo3996, uri);
            if (jMo8326 <= 2097152) {
                int i = 2097153;
                byte[] bArrCopyOf = new byte[Math.min(8192, 2097153)];
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    c6284.m17965();
                    if (i2 == bArrCopyOf.length) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, Math.min(i, bArrCopyOf.length * 2));
                    }
                    int i3 = interfaceC13433Mo3996.read(bArrCopyOf, i2, bArrCopyOf.length - i2);
                    if (i3 == -1) {
                        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i2);
                        m24451(interfaceC13433Mo3996, uri);
                        this.f30132 = interfaceC13433;
                        C18856.m43745(interfaceC13433Mo3996);
                        this.f30138 = bArrCopyOf2;
                        this.f30135 = 0;
                        boolean z3 = z && bArrCopyOf2.length > 0;
                        if (c24734 != null) {
                            String strMo16748 = c2554.f8203.mo16748(c25368);
                            Uri uri2 = this.f30134;
                            C12799 c12799 = new C12799(strMo16748, str, bArrCopyOf2, uri2 == null ? uri : uri2, c25368);
                            List<C12799> listM55222 = c24734.m55222(c5342.m15999(), c12799);
                            ArrayList arrayList = new ArrayList();
                            for (C12799 c127910 : listM55222) {
                                if (c127910 == c12799) {
                                    z2 = z;
                                } else {
                                    arrayList.add(c127910);
                                }
                            }
                            this.f30139 = arrayList;
                            z3 = z2;
                        }
                        if (z3) {
                            Uri uri3 = this.f30134;
                            m24448(c8367, str, bArrCopyOf2, uri3 == null ? uri : uri3, c6284);
                        }
                        return bArrCopyOf2.length;
                    }
                    if (i3 == 0) {
                        throw new IOException("HLS playlist upstream returned no data");
                    }
                    if (c5342 != null) {
                        c5342.m16000(i2, i3, bArrCopyOf);
                    }
                    i2 += i3;
                    if (i2 > 2097152) {
                        this.f30138 = Arrays.copyOf(bArrCopyOf, i2);
                        this.f30135 = 0;
                        if (c5342 == null) {
                            break;
                        }
                        this.f30141 = c5342;
                        this.f30133 = c8367;
                        break;
                    }
                    i = 2097153;
                    interfaceC13433 = null;
                }
            } else if (c5342 != null) {
                this.f30141 = c5342;
                this.f30133 = c8367;
                return jMo8326;
            }
            return jMo8326;
        } catch (IOException | RuntimeException e) {
            m24451(interfaceC13433Mo3996, c25368.f81907);
            InterfaceC13433 interfaceC13434 = this.f30132;
            this.f30132 = null;
            C18856.m43745(interfaceC13434);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C18216 m24446(C8367 c8367, String str, C25368 c25368, boolean z) {
        try {
            C21200 c21200M24447 = m24447(c8367.mo22517(str));
            if (c21200M24447 != null && c8367.m22524(str, 0L, c21200M24447.f67676)) {
                C11350 c11350 = new C11350();
                c11350.m28659(c8367);
                c11350.m28660((InterfaceC15670) null);
                c11350.m28658((C5385) null);
                c11350.m28661(new C10011(str));
                int i = 0;
                c11350.m28657(0);
                c11350.m28662();
                C24777 c24777Mo3996 = c11350.mo3996();
                if (z) {
                    m24450(c24777Mo3996);
                }
                int i2 = (int) c21200M24447.f67676;
                byte[] bArr = new byte[i2];
                try {
                    C11941 c11941M56734 = c25368.m56734();
                    c11941M56734.m29912(str);
                    c11941M56734.m29910(c21200M24447.f67676);
                    c24777Mo3996.mo8326(c11941M56734.m29908());
                    while (i < i2) {
                        int i3 = c24777Mo3996.read(bArr, i, i2 - i);
                        if (i3 == -1 || i3 == 0) {
                            C18856.m43745(c24777Mo3996);
                            return null;
                        }
                        i += i3;
                    }
                    C18856.m43745(c24777Mo3996);
                    if (c21200M24447.f67677.equals(C15022.m36182(C15022.m36179().digest(bArr)))) {
                        return new C18216(c21200M24447.f67678, bArr);
                    }
                } catch (Throwable th) {
                    C18856.m43745(c24777Mo3996);
                    throw th;
                }
            }
        } catch (IOException | RuntimeException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21200 m24447(C18809 c18809) {
        long jM43650 = c18809.m43650(Long.MIN_VALUE, "mt.hls.schema");
        C2554 c2554 = this.f30136;
        if (jM43650 != c2554.f8199.mo1992() || c18809.m43650(Long.MIN_VALUE, "mt.hls.complete") != 1) {
            return null;
        }
        long jM43651 = c18809.m43650(Long.MIN_VALUE, "mt.hls.body_length");
        String strM43654 = c18809.m43654("mt.hls.sha256");
        String strM43655 = c18809.m43654("mt.hls.final_uri");
        if (jM43651 <= 0 || jM43651 > 2097152 || strM43654 == null || strM43655 == null) {
            return null;
        }
        Uri uri = Uri.parse(strM43655);
        if (!c2554.f8199.mo1993(uri)) {
            return null;
        }
        boolean zM43653 = c18809.m43653("mt.hls.created_at_ms");
        boolean zM43654 = c18809.m43653("mt.hls.expires_at_ms");
        String strM43656 = c18809.m43654("mt.hls.stream_type");
        if (c2554.f8199 == EnumC18962.f61480) {
            if (!zM43653 || !zM43654 || !"vod".equals(strM43656)) {
                return null;
            }
            long jM43652 = c18809.m43650(Long.MIN_VALUE, "mt.hls.created_at_ms");
            long jM43653 = c18809.m43650(Long.MIN_VALUE, "mt.hls.expires_at_ms");
            long asLong = c2554.f8202.getAsLong();
            if (jM43652 < 0 || jM43653 <= jM43652 || asLong < jM43652 || asLong >= jM43653) {
                return null;
            }
        } else if (zM43653 || zM43654 || strM43656 != null) {
            return null;
        }
        return new C21200(jM43651, uri, strM43654);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24452(C8367 c8367, String str) {
        try {
            c8367.mo22520(str, m24453());
            if (c8367.mo22517(str).m43653("mt.hls.complete")) {
                return false;
            }
            c8367.m22523(str);
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24448(C8367 c8367, String str, final byte[] bArr, Uri uri, C6284 c6284) {
        C8367 c8368;
        String str2;
        long j;
        long j2;
        long jM55226;
        long j3;
        try {
            EnumC18962 enumC18962 = this.f30136.f8199;
            EnumC18962 enumC18963 = EnumC18962.f61480;
            c8368 = null;
            str2 = 0;
            if (enumC18962 == enumC18963) {
                long asLong = this.f30136.f8202.getAsLong();
                j2 = asLong + 300000;
                boolean z = true;
                boolean z2 = (300000 ^ asLong) < 0;
                if ((asLong ^ j2) < 0) {
                    z = false;
                }
                if (!z && !z2) {
                    throw new ArithmeticException();
                }
                j = asLong;
            } else {
                j = 0;
                j2 = 0;
            }
            C24734 c24734 = this.f30136.f8204;
            try {
                if (c24734 == null) {
                    jM55226 = -1;
                } else {
                    jM55226 = c24734.m55226();
                    if (jM55226 < 0) {
                        throw new IOException("HLS playlist cache was disabled for this stream");
                    }
                }
                c6284.m17965();
                C5385 c5385 = new C5385();
                c5385.m16071(c8367);
                C11350 c11350 = new C11350();
                c11350.m28659(c8367);
                c11350.m28660(new InterfaceC15670() { // from class: l.֨ۡۚ
                    @Override // l.InterfaceC15670
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final InterfaceC13433 mo3996() {
                        return new C13653(bArr);
                    }
                });
                c11350.m28658(c5385);
                c11350.m28661(new C10011(str));
                c11350.m28657(0);
                c11350.m28662();
                C24777 c24777Mo3996 = c11350.mo3996();
                C11941 c11941 = new C11941();
                c11941.m29911(C2554.f8198);
                c11941.m29912(str);
                c11941.m29910(bArr.length);
                C20301 c20301 = new C20301(c24777Mo3996, c11941.m29908());
                this.f30130 = c20301;
                try {
                    c20301.m46638();
                    this.f30130 = null;
                    c6284.m17965();
                    long j4 = jM55226;
                    try {
                        if (!c8367.m22524(str, 0L, bArr.length)) {
                            throw new IOException("HLS playlist cache write was incomplete");
                        }
                        C24734 c24735 = this.f30136.f8204;
                        if (c24735 != null && !c24735.m55228(j4)) {
                            throw new IOException("HLS playlist cache state changed while publishing");
                        }
                        C7622 c7622 = new C7622();
                        c7622.m20821(this.f30136.f8199.mo1992(), "mt.hls.schema");
                        c7622.m20821(1L, "mt.hls.complete");
                        c7622.m20821(bArr.length, "mt.hls.body_length");
                        c7622.m20823("mt.hls.sha256", C15022.m36182(C15022.m36179().digest(bArr)));
                        c7622.m20823("mt.hls.final_uri", uri.toString());
                        if (this.f30136.f8199 == enumC18963) {
                            c7622.m20821(j, "mt.hls.created_at_ms");
                            c7622.m20821(j2, "mt.hls.expires_at_ms");
                            c7622.m20823("mt.hls.stream_type", "vod");
                        } else {
                            c7622.m20822("mt.hls.created_at_ms");
                            c7622.m20822("mt.hls.expires_at_ms");
                            c7622.m20822("mt.hls.stream_type");
                        }
                        C24734 c24736 = this.f30136.f8204;
                        if (c24736 == null) {
                            j3 = j4;
                            c8367.mo22520(str, c7622);
                        } else {
                            j3 = j4;
                            synchronized (c24736) {
                                if (!c24736.m55228(j3)) {
                                    throw new IOException("HLS playlist cache state changed before publishing");
                                }
                                c8367.mo22520(str, c7622);
                            }
                        }
                        C24734 c24737 = this.f30136.f8204;
                        if (c24737 != null && !c24737.m55228(j3)) {
                            throw new IOException("HLS playlist cache state changed while publishing");
                        }
                        if (m24447(c8367.mo22517(str)) == null) {
                            throw new IOException("HLS playlist cache metadata was not published");
                        }
                    } catch (IOException | RuntimeException unused) {
                        c8368 = c8367;
                        str2 = str;
                        try {
                            c8368.mo22520(str2, m24453());
                        } catch (IOException | RuntimeException unused2) {
                        }
                        try {
                            c8367.m22523(str);
                        } catch (RuntimeException unused3) {
                        }
                    }
                } catch (Throwable th) {
                    this.f30130 = null;
                    throw th;
                }
            } catch (IOException | RuntimeException unused4) {
            }
        } catch (IOException | RuntimeException unused5) {
            c8368 = c8367;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24449(C8367 c8367, List list) throws Throwable {
        C6284 c6284M13012;
        C24734 c24734 = this.f30136.f8204;
        if (c24734 == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12799 c12799 = (C12799) it.next();
            if (this.f30131 || c24734.m55225() != EnumC11307.VOD) {
                return;
            }
            try {
                c6284M13012 = this.f30136.f8205.m13012(c12799.m31728());
                try {
                    this.f30140 = c6284M13012;
                    c6284M13012.m17963();
                    while (true) {
                        C18216 c18216M24446 = m24446(c8367, c12799.m31729(), c12799.m31730(), false);
                        if (c18216M24446 != null && Arrays.equals(c18216M24446.m42365(), c12799.m31727()) && c18216M24446.m42366().equals(c12799.m31731())) {
                            c6284M13012.m17967();
                            break;
                        } else if (c6284M13012.m17966()) {
                            if (!m24452(c8367, c12799.m31729()) || c24734.m55225() != EnumC11307.VOD) {
                                break;
                                break;
                            } else {
                                m24448(c8367, c12799.m31729(), c12799.m31727(), c12799.m31731(), c6284M13012);
                                break;
                            }
                        }
                    }
                    c6284M13012.m17964();
                    c6284M13012.close();
                    if (this.f30140 == c6284M13012) {
                        this.f30140 = null;
                    }
                } catch (IOException | RuntimeException unused) {
                    if (c6284M13012 != null) {
                        c6284M13012.m17964();
                        c6284M13012.close();
                    }
                    if (this.f30140 == c6284M13012) {
                    }
                } catch (Throwable th) {
                    th = th;
                    if (c6284M13012 != null) {
                        c6284M13012.m17964();
                        c6284M13012.close();
                    }
                    if (this.f30140 == c6284M13012) {
                        this.f30140 = null;
                    }
                    throw th;
                }
            } catch (IOException | RuntimeException unused2) {
                c6284M13012 = null;
            } catch (Throwable th2) {
                th = th2;
                c6284M13012 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C7622 m24453() {
        C7622 c7622 = new C7622();
        c7622.m20822("mt.hls.schema");
        c7622.m20822("mt.hls.complete");
        c7622.m20822("mt.hls.body_length");
        c7622.m20822("mt.hls.sha256");
        c7622.m20822("mt.hls.final_uri");
        c7622.m20822("mt.hls.created_at_ms");
        c7622.m20822("mt.hls.expires_at_ms");
        c7622.m20822("mt.hls.stream_type");
        C7622.m20818(c7622, -1L);
        C7622.m20819(c7622, (Uri) null);
        return c7622;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24450(InterfaceC13433 interfaceC13433) {
        Iterator it = this.f30137.iterator();
        while (it.hasNext()) {
            interfaceC13433.mo10894((InterfaceC4639) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24451(InterfaceC13433 interfaceC13433, Uri uri) {
        Map mapUnmodifiableMap;
        Uri uriMo8327 = interfaceC13433.mo8327();
        if (uriMo8327 != null) {
            uri = uriMo8327;
        }
        this.f30134 = uri;
        Map mapMo10893 = interfaceC13433.mo10893();
        if (mapMo10893.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            HashMap map = new HashMap();
            for (Map.Entry entry : mapMo10893.entrySet()) {
                map.put((String) entry.getKey(), C4681.unmodifiableList(new ArrayList((Collection) entry.getValue())));
            }
            mapUnmodifiableMap = C4681.unmodifiableMap(map);
        }
        this.f30129 = mapUnmodifiableMap;
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        byte[] bArr2 = this.f30138;
        if (bArr2 != null && (i3 = this.f30135) < bArr2.length) {
            int iMin = Math.min(i2, bArr2.length - i3);
            System.arraycopy(bArr2, this.f30135, bArr, i, iMin);
            this.f30135 += iMin;
            return iMin;
        }
        InterfaceC13433 interfaceC13433 = this.f30132;
        if (interfaceC13433 == null) {
            return -1;
        }
        int i4 = interfaceC13433.read(bArr, i, i2);
        C5342 c5342 = this.f30141;
        if (c5342 != null) {
            if (i4 == -1) {
                this.f30141 = null;
                C8367 c8367 = this.f30133;
                this.f30133 = null;
                C24734 c24734 = this.f30136.f8204;
                if (c24734 != null) {
                    List listM55222 = c24734.m55222(c5342.m15999(), null);
                    if (c8367 != null) {
                        m24449(c8367, listM55222);
                        return i4;
                    }
                }
            } else if (i4 > 0) {
                c5342.m16000(i, i4, bArr);
            }
        }
        return i4;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        InterfaceC13433 interfaceC13433 = this.f30132;
        Uri uriMo8327 = interfaceC13433 == null ? null : interfaceC13433.mo8327();
        return uriMo8327 == null ? this.f30134 : uriMo8327;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final Map mo10893() {
        InterfaceC13433 interfaceC13433 = this.f30132;
        return interfaceC13433 == null ? this.f30129 : interfaceC13433.mo10893();
    }

    @Override // l.InterfaceC13433
    public final void close() {
        this.f30131 = true;
        C20301 c20301 = this.f30130;
        if (c20301 != null) {
            c20301.m46639();
        }
        C6284 c6284 = this.f30140;
        this.f30140 = null;
        if (c6284 != null) {
            c6284.close();
        }
        InterfaceC13433 interfaceC13433 = this.f30132;
        this.f30132 = null;
        this.f30138 = null;
        this.f30135 = 0;
        this.f30141 = null;
        this.f30133 = null;
        this.f30139 = Collections.EMPTY_LIST;
        this.f30134 = null;
        this.f30129 = Collections.EMPTY_MAP;
        if (interfaceC13433 != null) {
            interfaceC13433.close();
        }
    }
}
