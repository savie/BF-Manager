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

/* JADX INFO: renamed from: l.᩹ۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes.dex */
public final class C22225 implements InterfaceC15785 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Uri f72670;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C10896 f72671;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9828 f72673;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f72674;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C15327 f72675;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC15785 f72676;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile boolean f72677;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1057 f72679;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f72681;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C8820 f72682;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f72680 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Map f72672 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f72678 = Collections.EMPTY_LIST;

    public C22225(C1057 c1057) {
        this.f72679 = c1057;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final void mo11161(InterfaceC19706 interfaceC19706) {
        ArrayList arrayList = this.f72680;
        if (arrayList.contains(interfaceC19706)) {
            return;
        }
        arrayList.add(interfaceC19706);
        InterfaceC15785 interfaceC15785 = this.f72676;
        if (interfaceC15785 != null) {
            interfaceC15785.mo11161(interfaceC19706);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) throws Throwable {
        long length;
        String str;
        String strM1693;
        C19403 c19403;
        if (this.f72676 != null || this.f72674 != null) {
            throw new IOException("Data source is already open");
        }
        this.f72677 = false;
        this.f72670 = c12257.f41015;
        this.f72672 = Collections.EMPTY_MAP;
        if (c12257.f41009 != 0 || c12257.f41017 != -1) {
            return m49347(c12257);
        }
        C20814 c20814 = this.f72679.f4905;
        if (this.f72679.f4904 == EnumC11642.f39119 && c20814 != null) {
            EnumC7408 enumC7408M46808 = c20814.m46808();
            EnumC7408 enumC7408 = EnumC7408.LIVE;
            if (enumC7408M46808 == enumC7408) {
                return m49347(c12257);
            }
            if (enumC7408M46808 == EnumC7408.UNKNOWN) {
                C15327 c15327M4583 = this.f72679.f4902.m4583();
                if (c15327M4583 != null) {
                    String strMo4141 = this.f72679.f4900.mo4141(c12257);
                    if (this.f72679.f4904.mo12735(strMo4141)) {
                        strM1693 = C0252.m1693("hls-playlist:", strMo4141);
                        str = strMo4141;
                    } else {
                        str = null;
                        strM1693 = null;
                    }
                } else {
                    str = null;
                    strM1693 = null;
                }
                if (c15327M4583 != null && str != null && strM1693 != null) {
                    C10896 c10896M34694 = this.f72679.f4906.m34694(str);
                    this.f72671 = c10896M34694;
                    try {
                        c10896M34694.m27301();
                        C3133 c3133M49340 = m49340(c15327M4583, strM1693, c12257, true);
                        c10896M34694.m27302();
                        c10896M34694.close();
                        if (this.f72671 == c10896M34694) {
                            this.f72671 = null;
                        }
                        if (c3133M49340 != null) {
                            if (!c20814.m46811()) {
                                return m49347(c12257);
                            }
                            this.f72674 = c3133M49340.f11791;
                            this.f72670 = c3133M49340.f11792;
                            this.f72681 = 0;
                            m49343(c15327M4583, c20814.m46812());
                            return c3133M49340.f11791.length;
                        }
                        if (c20814.m46808() == enumC7408) {
                            return m49347(c12257);
                        }
                    } catch (Throwable th) {
                        c10896M34694.close();
                        if (this.f72671 == c10896M34694) {
                            this.f72671 = null;
                        }
                        throw th;
                    }
                }
                InterfaceC15785 interfaceC15785Mo4000 = this.f72679.f4901.mo4000();
                this.f72676 = interfaceC15785Mo4000;
                m49344(interfaceC15785Mo4000);
                C8820 c8820 = new C8820();
                try {
                    long jMo9272 = interfaceC15785Mo4000.mo9272(c12257);
                    m49345(interfaceC15785Mo4000, c12257.f41015);
                    if (jMo9272 > 2097152) {
                        this.f72682 = c8820;
                        this.f72675 = c15327M4583;
                        return jMo9272;
                    }
                    int i = 2097153;
                    byte[] bArrCopyOf = new byte[Math.min(8192, 2097153)];
                    int i2 = 0;
                    while (!this.f72677 && !Thread.currentThread().isInterrupted()) {
                        if (i2 == bArrCopyOf.length) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, Math.min(i, bArrCopyOf.length * 2));
                        }
                        int i3 = interfaceC15785Mo4000.read(bArrCopyOf, i2, bArrCopyOf.length - i2);
                        if (i3 == -1) {
                            byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i2);
                            m49345(interfaceC15785Mo4000, c12257.f41015);
                            this.f72676 = null;
                            C22851.m50584(interfaceC15785Mo4000);
                            this.f72674 = bArrCopyOf2;
                            this.f72681 = 0;
                            if (c15327M4583 == null || str == null || strM1693 == null || bArrCopyOf2.length <= 0) {
                                c19403 = null;
                            } else {
                                Uri uri = this.f72670;
                                if (uri == null) {
                                    uri = c12257.f41015;
                                }
                                c19403 = new C19403(str, strM1693, bArrCopyOf2, uri, c12257);
                            }
                            List listM46809 = c20814.m46809(c8820.m22953(), c19403);
                            if (c15327M4583 != null) {
                                m49343(c15327M4583, listM46809);
                            }
                            return bArrCopyOf2.length;
                        }
                        if (i3 == 0) {
                            throw new IOException("HLS playlist upstream returned no data");
                        }
                        c8820.m22954(i2, i3, bArrCopyOf);
                        i2 += i3;
                        if (i2 > 2097152) {
                            this.f72674 = Arrays.copyOf(bArrCopyOf, i2);
                            this.f72681 = 0;
                            this.f72682 = c8820;
                            this.f72675 = c15327M4583;
                            return jMo9272;
                        }
                        i = 2097153;
                    }
                    throw new InterruptedIOException("Interrupted while loading HLS playlist");
                } catch (IOException e) {
                    e = e;
                    m49345(interfaceC15785Mo4000, c12257.f41015);
                    InterfaceC15785 interfaceC15785 = this.f72676;
                    this.f72676 = null;
                    C22851.m50584(interfaceC15785);
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    m49345(interfaceC15785Mo4000, c12257.f41015);
                    InterfaceC15785 interfaceC15786 = this.f72676;
                    this.f72676 = null;
                    C22851.m50584(interfaceC15786);
                    throw e;
                }
            }
        }
        C15327 c15327M4584 = this.f72679.f4902.m4583();
        if (c15327M4584 == null) {
            return m49347(c12257);
        }
        String strMo4142 = this.f72679.f4900.mo4141(c12257);
        if (!this.f72679.f4904.mo12735(strMo4142)) {
            return m49347(c12257);
        }
        String strM1694 = C0252.m1693("hls-playlist:", strMo4142);
        C10896 c10896M34695 = this.f72679.f4906.m34694(strMo4142);
        this.f72671 = c10896M34695;
        try {
            try {
                c10896M34695.m27301();
                do {
                    C3133 c3133M49341 = m49340(c15327M4584, strM1694, c12257, true);
                    if (c3133M49341 != null) {
                        c10896M34695.m27302();
                        C20814 c20815 = this.f72679.f4905;
                        if (c20815 != null) {
                            this.f72678 = c20815.m46812();
                        }
                        this.f72674 = c3133M49341.f11791;
                        this.f72670 = c3133M49341.f11792;
                        this.f72681 = 0;
                        length = c3133M49341.f11791.length;
                    }
                    c10896M34695.m27300();
                    c10896M34695.close();
                    this.f72671 = null;
                    List list = this.f72678;
                    this.f72678 = Collections.EMPTY_LIST;
                    m49343(c15327M4584, list);
                    return length;
                } while (!c10896M34695.m27303());
                length = m49339(c12257, c15327M4584, strM1694, m49346(c15327M4584, strM1694), c10896M34695);
                c10896M34695.m27300();
                c10896M34695.close();
                this.f72671 = null;
                List list2 = this.f72678;
                this.f72678 = Collections.EMPTY_LIST;
                m49343(c15327M4584, list2);
                return length;
            } catch (Throwable th2) {
                c10896M34695.m27300();
                c10896M34695.close();
                this.f72671 = null;
                List list3 = this.f72678;
                this.f72678 = Collections.EMPTY_LIST;
                m49343(c15327M4584, list3);
                throw th2;
            }
        } catch (IOException | RuntimeException e3) {
            InterfaceC15785 interfaceC15787 = this.f72676;
            this.f72676 = null;
            C22851.m50584(interfaceC15787);
            throw e3;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private long m49347(C12257 c12257) {
        InterfaceC15785 interfaceC15785Mo4000 = this.f72679.f4901.mo4000();
        this.f72676 = interfaceC15785Mo4000;
        m49344(interfaceC15785Mo4000);
        try {
            long jMo9272 = interfaceC15785Mo4000.mo9272(c12257);
            m49345(interfaceC15785Mo4000, c12257.f41015);
            return jMo9272;
        } catch (IOException | RuntimeException e) {
            m49345(interfaceC15785Mo4000, c12257.f41015);
            InterfaceC15785 interfaceC15785 = this.f72676;
            this.f72676 = null;
            C22851.m50584(interfaceC15785);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m49339(C12257 c12257, C15327 c15327, String str, boolean z, C10896 c10896) {
        C1057 c1057 = this.f72679;
        InterfaceC15785 interfaceC15785Mo4000 = c1057.f4901.mo4000();
        this.f72676 = interfaceC15785Mo4000;
        m49344(interfaceC15785Mo4000);
        C20814 c20814 = c1057.f4905;
        InterfaceC15785 interfaceC15785 = null;
        C8820 c8820 = c20814 == null ? null : new C8820();
        try {
            c10896.m27299();
            long jMo9272 = interfaceC15785Mo4000.mo9272(c12257);
            Uri uri = c12257.f41015;
            m49345(interfaceC15785Mo4000, uri);
            if (jMo9272 <= 2097152) {
                int i = 2097153;
                byte[] bArrCopyOf = new byte[Math.min(8192, 2097153)];
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    c10896.m27299();
                    if (i2 == bArrCopyOf.length) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, Math.min(i, bArrCopyOf.length * 2));
                    }
                    int i3 = interfaceC15785Mo4000.read(bArrCopyOf, i2, bArrCopyOf.length - i2);
                    if (i3 == -1) {
                        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i2);
                        m49345(interfaceC15785Mo4000, uri);
                        this.f72676 = interfaceC15785;
                        C22851.m50584(interfaceC15785Mo4000);
                        this.f72674 = bArrCopyOf2;
                        this.f72681 = 0;
                        boolean z3 = z && bArrCopyOf2.length > 0;
                        if (c20814 != null) {
                            String strMo4141 = c1057.f4900.mo4141(c12257);
                            Uri uri2 = this.f72670;
                            C19403 c19403 = new C19403(strMo4141, str, bArrCopyOf2, uri2 == null ? uri : uri2, c12257);
                            List<C19403> listM46809 = c20814.m46809(c8820.m22953(), c19403);
                            ArrayList arrayList = new ArrayList();
                            for (C19403 c19404 : listM46809) {
                                if (c19404 == c19403) {
                                    z2 = z;
                                } else {
                                    arrayList.add(c19404);
                                }
                            }
                            this.f72678 = arrayList;
                            z3 = z2;
                        }
                        if (z3) {
                            Uri uri3 = this.f72670;
                            m49342(c15327, str, bArrCopyOf2, uri3 == null ? uri : uri3, c10896);
                        }
                        return bArrCopyOf2.length;
                    }
                    if (i3 == 0) {
                        throw new IOException("HLS playlist upstream returned no data");
                    }
                    if (c8820 != null) {
                        c8820.m22954(i2, i3, bArrCopyOf);
                    }
                    i2 += i3;
                    if (i2 > 2097152) {
                        this.f72674 = Arrays.copyOf(bArrCopyOf, i2);
                        this.f72681 = 0;
                        if (c8820 == null) {
                            break;
                        }
                        this.f72682 = c8820;
                        this.f72675 = c15327;
                        break;
                    }
                    i = 2097153;
                    interfaceC15785 = null;
                }
            } else if (c8820 != null) {
                this.f72682 = c8820;
                this.f72675 = c15327;
                return jMo9272;
            }
            return jMo9272;
        } catch (IOException | RuntimeException e) {
            m49345(interfaceC15785Mo4000, c12257.f41015);
            InterfaceC15785 interfaceC15786 = this.f72676;
            this.f72676 = null;
            C22851.m50584(interfaceC15786);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3133 m49340(C15327 c15327, String str, C12257 c12257, boolean z) {
        try {
            C9485 c9485M49341 = m49341(c15327.mo36698(str));
            if (c9485M49341 != null && c15327.m36710(str, 0L, c9485M49341.f32082)) {
                C12650 c12650 = new C12650();
                c12650.m31436(c15327);
                c12650.m31437((InterfaceC20723) null);
                c12650.m31434((C0654) null);
                c12650.m31435(new C2468(str));
                int i = 0;
                c12650.m31433(0);
                c12650.m31438();
                C17588 c17588Mo4000 = c12650.mo4000();
                if (z) {
                    m49344(c17588Mo4000);
                }
                int i2 = (int) c9485M49341.f32082;
                byte[] bArr = new byte[i2];
                try {
                    C16490 c16490M30477 = c12257.m30477();
                    c16490M30477.m38757(str);
                    c16490M30477.m38755(c9485M49341.f32082);
                    c17588Mo4000.mo9272(c16490M30477.m38753());
                    while (i < i2) {
                        int i3 = c17588Mo4000.read(bArr, i, i2 - i);
                        if (i3 == -1 || i3 == 0) {
                            C22851.m50584(c17588Mo4000);
                            return null;
                        }
                        i += i3;
                    }
                    C22851.m50584(c17588Mo4000);
                    if (c9485M49341.f32083.equals(C22253.m49424(C22253.m49421().digest(bArr)))) {
                        return new C3133(c9485M49341.f32084, bArr);
                    }
                } catch (Throwable th) {
                    C22851.m50584(c17588Mo4000);
                    throw th;
                }
            }
        } catch (IOException | RuntimeException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9485 m49341(C13210 c13210) {
        long jM32695 = c13210.m32695(Long.MIN_VALUE, "mt.hls.schema");
        C1057 c1057 = this.f72679;
        if (jM32695 != c1057.f4904.mo12733() || c13210.m32695(Long.MIN_VALUE, "mt.hls.complete") != 1) {
            return null;
        }
        long jM32696 = c13210.m32695(Long.MIN_VALUE, "mt.hls.body_length");
        String strM32699 = c13210.m32699("mt.hls.sha256");
        String strM326910 = c13210.m32699("mt.hls.final_uri");
        if (jM32696 <= 0 || jM32696 > 2097152 || strM32699 == null || strM326910 == null) {
            return null;
        }
        Uri uri = Uri.parse(strM326910);
        if (!c1057.f4904.mo12734(uri)) {
            return null;
        }
        boolean zM32698 = c13210.m32698("mt.hls.created_at_ms");
        boolean zM32699 = c13210.m32698("mt.hls.expires_at_ms");
        String strM326911 = c13210.m32699("mt.hls.stream_type");
        if (c1057.f4904 == EnumC11642.f39119) {
            if (!zM32698 || !zM32699 || !"vod".equals(strM326911)) {
                return null;
            }
            long jM32697 = c13210.m32695(Long.MIN_VALUE, "mt.hls.created_at_ms");
            long jM32698 = c13210.m32695(Long.MIN_VALUE, "mt.hls.expires_at_ms");
            long asLong = c1057.f4903.getAsLong();
            if (jM32697 < 0 || jM32698 <= jM32697 || asLong < jM32697 || asLong >= jM32698) {
                return null;
            }
        } else if (zM32698 || zM32699 || strM326911 != null) {
            return null;
        }
        return new C9485(jM32696, uri, strM32699);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49346(C15327 c15327, String str) {
        try {
            c15327.mo36701(str, m49348());
            if (c15327.mo36698(str).m32698("mt.hls.complete")) {
                return false;
            }
            c15327.m36705(str);
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
    private void m49342(C15327 c15327, String str, final byte[] bArr, Uri uri, C10896 c10896) {
        C15327 c15328;
        String str2;
        long j;
        long j2;
        long jM46814;
        long j3;
        try {
            EnumC11642 enumC11642 = this.f72679.f4904;
            EnumC11642 enumC11643 = EnumC11642.f39119;
            c15328 = null;
            str2 = 0;
            if (enumC11642 == enumC11643) {
                long asLong = this.f72679.f4903.getAsLong();
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
            C20814 c20814 = this.f72679.f4905;
            try {
                if (c20814 == null) {
                    jM46814 = -1;
                } else {
                    jM46814 = c20814.m46814();
                    if (jM46814 < 0) {
                        throw new IOException("HLS playlist cache was disabled for this stream");
                    }
                }
                c10896.m27299();
                C0654 c0654 = new C0654();
                c0654.m2972(c15327);
                C12650 c12650 = new C12650();
                c12650.m31436(c15327);
                c12650.m31437(new InterfaceC20723() { // from class: l.ۚۤ۬
                    @Override // l.InterfaceC20723
                    /* JADX INFO: renamed from: ۙ */
                    public final InterfaceC15785 mo4000() {
                        return new C18606(bArr);
                    }
                });
                c12650.m31434(c0654);
                c12650.m31435(new C2468(str));
                c12650.m31433(0);
                c12650.m31438();
                C17588 c17588Mo4000 = c12650.mo4000();
                C16490 c16490 = new C16490();
                c16490.m38756(C1057.f4899);
                c16490.m38757(str);
                c16490.m38755(bArr.length);
                C9828 c9828 = new C9828(c17588Mo4000, c16490.m38753());
                this.f72673 = c9828;
                try {
                    c9828.m24933();
                    this.f72673 = null;
                    c10896.m27299();
                    long j4 = jM46814;
                    try {
                        if (!c15327.m36710(str, 0L, bArr.length)) {
                            throw new IOException("HLS playlist cache write was incomplete");
                        }
                        C20814 c20815 = this.f72679.f4905;
                        if (c20815 != null && !c20815.m46813(j4)) {
                            throw new IOException("HLS playlist cache state changed while publishing");
                        }
                        C1214 c1214 = new C1214();
                        c1214.m4408(this.f72679.f4904.mo12733(), "mt.hls.schema");
                        c1214.m4408(1L, "mt.hls.complete");
                        c1214.m4408(bArr.length, "mt.hls.body_length");
                        c1214.m4410("mt.hls.sha256", C22253.m49424(C22253.m49421().digest(bArr)));
                        c1214.m4410("mt.hls.final_uri", uri.toString());
                        if (this.f72679.f4904 == enumC11643) {
                            c1214.m4408(j, "mt.hls.created_at_ms");
                            c1214.m4408(j2, "mt.hls.expires_at_ms");
                            c1214.m4410("mt.hls.stream_type", "vod");
                        } else {
                            c1214.m4409("mt.hls.created_at_ms");
                            c1214.m4409("mt.hls.expires_at_ms");
                            c1214.m4409("mt.hls.stream_type");
                        }
                        C20814 c20816 = this.f72679.f4905;
                        if (c20816 == null) {
                            j3 = j4;
                            c15327.mo36701(str, c1214);
                        } else {
                            j3 = j4;
                            synchronized (c20816) {
                                if (!c20816.m46813(j3)) {
                                    throw new IOException("HLS playlist cache state changed before publishing");
                                }
                                c15327.mo36701(str, c1214);
                            }
                        }
                        C20814 c20817 = this.f72679.f4905;
                        if (c20817 != null && !c20817.m46813(j3)) {
                            throw new IOException("HLS playlist cache state changed while publishing");
                        }
                        if (m49341(c15327.mo36698(str)) == null) {
                            throw new IOException("HLS playlist cache metadata was not published");
                        }
                    } catch (IOException | RuntimeException unused) {
                        c15328 = c15327;
                        str2 = str;
                        try {
                            c15328.mo36701(str2, m49348());
                        } catch (IOException | RuntimeException unused2) {
                        }
                        try {
                            c15327.m36705(str);
                        } catch (RuntimeException unused3) {
                        }
                    }
                } catch (Throwable th) {
                    this.f72673 = null;
                    throw th;
                }
            } catch (IOException | RuntimeException unused4) {
            }
        } catch (IOException | RuntimeException unused5) {
            c15328 = c15327;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49343(C15327 c15327, List list) throws Throwable {
        C10896 c10896M34694;
        C20814 c20814 = this.f72679.f4905;
        if (c20814 == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C19403 c19403 = (C19403) it.next();
            if (this.f72677 || c20814.m46808() != EnumC7408.VOD) {
                return;
            }
            try {
                c10896M34694 = this.f72679.f4906.m34694(c19403.m44452());
                try {
                    this.f72671 = c10896M34694;
                    c10896M34694.m27301();
                    while (true) {
                        C3133 c3133M49340 = m49340(c15327, c19403.m44451(), c19403.m44455(), false);
                        if (c3133M49340 != null && Arrays.equals(c3133M49340.m9487(), c19403.m44453()) && c3133M49340.m9488().equals(c19403.m44454())) {
                            c10896M34694.m27302();
                            break;
                        } else if (c10896M34694.m27303()) {
                            if (!m49346(c15327, c19403.m44451()) || c20814.m46808() != EnumC7408.VOD) {
                                break;
                                break;
                            } else {
                                m49342(c15327, c19403.m44451(), c19403.m44453(), c19403.m44454(), c10896M34694);
                                break;
                            }
                        }
                    }
                    c10896M34694.m27300();
                    c10896M34694.close();
                    if (this.f72671 == c10896M34694) {
                        this.f72671 = null;
                    }
                } catch (IOException | RuntimeException unused) {
                    if (c10896M34694 != null) {
                        c10896M34694.m27300();
                        c10896M34694.close();
                    }
                    if (this.f72671 == c10896M34694) {
                    }
                } catch (Throwable th) {
                    th = th;
                    if (c10896M34694 != null) {
                        c10896M34694.m27300();
                        c10896M34694.close();
                    }
                    if (this.f72671 == c10896M34694) {
                        this.f72671 = null;
                    }
                    throw th;
                }
            } catch (IOException | RuntimeException unused2) {
                c10896M34694 = null;
            } catch (Throwable th2) {
                th = th2;
                c10896M34694 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C1214 m49348() {
        C1214 c1214 = new C1214();
        c1214.m4409("mt.hls.schema");
        c1214.m4409("mt.hls.complete");
        c1214.m4409("mt.hls.body_length");
        c1214.m4409("mt.hls.sha256");
        c1214.m4409("mt.hls.final_uri");
        c1214.m4409("mt.hls.created_at_ms");
        c1214.m4409("mt.hls.expires_at_ms");
        c1214.m4409("mt.hls.stream_type");
        C1214.m4405(c1214, -1L);
        C1214.m4406(c1214, (Uri) null);
        return c1214;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49344(InterfaceC15785 interfaceC15785) {
        Iterator it = this.f72680.iterator();
        while (it.hasNext()) {
            interfaceC15785.mo11161((InterfaceC19706) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49345(InterfaceC15785 interfaceC15785, Uri uri) {
        Map mapUnmodifiableMap;
        Uri uriMo9274 = interfaceC15785.mo9274();
        if (uriMo9274 != null) {
            uri = uriMo9274;
        }
        this.f72670 = uri;
        Map mapMo9273 = interfaceC15785.mo9273();
        if (mapMo9273.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            HashMap map = new HashMap();
            for (Map.Entry entry : mapMo9273.entrySet()) {
                map.put((String) entry.getKey(), C0561.unmodifiableList(new ArrayList((Collection) entry.getValue())));
            }
            mapUnmodifiableMap = C0561.unmodifiableMap(map);
        }
        this.f72672 = mapUnmodifiableMap;
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        byte[] bArr2 = this.f72674;
        if (bArr2 != null && (i3 = this.f72681) < bArr2.length) {
            int iMin = Math.min(i2, bArr2.length - i3);
            System.arraycopy(bArr2, this.f72681, bArr, i, iMin);
            this.f72681 += iMin;
            return iMin;
        }
        InterfaceC15785 interfaceC15785 = this.f72676;
        if (interfaceC15785 == null) {
            return -1;
        }
        int i4 = interfaceC15785.read(bArr, i, i2);
        C8820 c8820 = this.f72682;
        if (c8820 != null) {
            if (i4 == -1) {
                this.f72682 = null;
                C15327 c15327 = this.f72675;
                this.f72675 = null;
                C20814 c20814 = this.f72679.f4905;
                if (c20814 != null) {
                    List listM46809 = c20814.m46809(c8820.m22953(), null);
                    if (c15327 != null) {
                        m49343(c15327, listM46809);
                        return i4;
                    }
                }
            } else if (i4 > 0) {
                c8820.m22954(i, i4, bArr);
            }
        }
        return i4;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        InterfaceC15785 interfaceC15785 = this.f72676;
        Uri uriMo9274 = interfaceC15785 == null ? null : interfaceC15785.mo9274();
        return uriMo9274 == null ? this.f72670 : uriMo9274;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final Map mo9273() {
        InterfaceC15785 interfaceC15785 = this.f72676;
        return interfaceC15785 == null ? this.f72672 : interfaceC15785.mo9273();
    }

    @Override // l.InterfaceC15785
    public final void close() {
        this.f72677 = true;
        C9828 c9828 = this.f72673;
        if (c9828 != null) {
            c9828.m24934();
        }
        C10896 c10896 = this.f72671;
        this.f72671 = null;
        if (c10896 != null) {
            c10896.close();
        }
        InterfaceC15785 interfaceC15785 = this.f72676;
        this.f72676 = null;
        this.f72674 = null;
        this.f72681 = 0;
        this.f72682 = null;
        this.f72675 = null;
        this.f72678 = Collections.EMPTY_LIST;
        this.f72670 = null;
        this.f72672 = Collections.EMPTY_MAP;
        if (interfaceC15785 != null) {
            interfaceC15785.close();
        }
    }
}
