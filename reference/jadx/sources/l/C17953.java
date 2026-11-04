package l;

import android.media.MediaFormat;
import android.net.Uri;
import android.util.SparseArray;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ܿ֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes4.dex */
public final class C17953 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f58800;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f58803;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC22486 f58804;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f58806;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10732 f58808;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC9060 f58809;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 f58812;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f58813;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC13433 f58814;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C9169 f58815;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashSet f58816;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18756 f58805 = new C18756();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17789 f58802 = new C17789();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f58801 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final SparseArray f58811 = new SparseArray();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C20937 f58810 = new C20937();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16461 f58807 = new C16461();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C5690 f58817 = new C5690(0, 0);

    public C17953(C10732 c10732, InterfaceC15670 interfaceC15670) {
        this.f58808 = c10732;
        this.f58812 = interfaceC15670;
        new C5690(2, 0);
        this.f58816 = new HashSet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41904(Uri uri) {
        int iMo2289;
        InterfaceC13433 interfaceC13433Mo3996 = this.f58812.mo3996();
        C11941 c11941 = new C11941();
        c11941.m29911(uri);
        c11941.m29917(0L);
        c11941.m29909(6);
        C25368 c25368M29908 = c11941.m29908();
        C18756 c18756 = this.f58805;
        C20782.m47568(!this.f58803);
        this.f58803 = true;
        this.f58800 = c25368M29908.f81909;
        this.f58814 = interfaceC13433Mo3996;
        C9169 c9169 = new C9169(this.f58814, 0L, interfaceC13433Mo3996.mo8326(c25368M29908));
        InterfaceC22486[] interfaceC22486ArrM27336 = this.f58808.m27336();
        InterfaceC22486 interfaceC22486 = interfaceC22486ArrM27336[0];
        Throwable e = null;
        try {
            if (interfaceC22486.mo2294(c9169)) {
                c9169.mo10076();
            } else {
                c9169.mo10076();
                interfaceC22486 = null;
            }
        } catch (EOFException unused) {
        } catch (Throwable th) {
            c9169.mo10076();
            throw th;
        }
        if (interfaceC22486 != null) {
            interfaceC22486.mo2293(new C6021(this));
            boolean z = true;
            while (z) {
                try {
                    iMo2289 = interfaceC22486.mo2289(c9169, c18756);
                } catch (Exception | OutOfMemoryError e2) {
                    e = e2;
                    iMo2289 = -1;
                }
                boolean z2 = !this.f58813 || this.f58806 < this.f58811.size() || this.f58809 == null;
                if (e != null || (z2 && iMo2289 == -1)) {
                    m41906();
                    throw C2970.m9688(e != null ? "Exception encountered while parsing input media." : "Reached end of input before preparation completed.", e);
                }
                if (iMo2289 == 1) {
                    c9169 = m41891(c18756.f60914);
                }
                z = z2;
            }
            this.f58815 = c9169;
            this.f58804 = interfaceC22486;
            return;
        }
        String str = "None of the available extractors (" + C17349.m40726(", ").m40728((Iterable) C4583.m14373(AbstractC1928.m6615(interfaceC22486ArrM27336), new C11958())) + ") could read the stream.";
        InterfaceC13433 interfaceC13433 = this.f58814;
        interfaceC13433.getClass();
        interfaceC13433.mo8327().getClass();
        throw new C20510(str, AbstractC1928.of());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m41906() {
        SparseArray sparseArray;
        int i = 0;
        while (true) {
            sparseArray = this.f58811;
            if (i >= sparseArray.size()) {
                break;
            }
            ((C23921) sparseArray.valueAt(i)).m34319();
            i++;
        }
        sparseArray.clear();
        InterfaceC22486 interfaceC22486 = this.f58804;
        if (interfaceC22486 != null) {
            interfaceC22486.mo2291();
            this.f58804 = null;
        }
        this.f58815 = null;
        C18856.m43745(this.f58814);
        this.f58814 = null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m41909() {
        return this.f58801.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaFormat m41902(int i) {
        C3783 c3783 = (C3783) this.f58801.get(i);
        MediaFormat mediaFormatM12292 = c3783.m12292(this.f58807, this.f58817);
        long j = c3783.f12962.f77436;
        if (j != -9223372036854775807L) {
            mediaFormatM12292.setLong("durationUs", j);
            return mediaFormatM12292;
        }
        InterfaceC9060 interfaceC9060 = this.f58809;
        if (interfaceC9060 != null && interfaceC9060.mo2295() != -9223372036854775807L) {
            mediaFormatM12292.setLong("durationUs", this.f58809.mo2295());
        }
        return mediaFormatM12292;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41908(int i) {
        this.f58816.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41903() {
        if (m41897()) {
            m41896();
            m41897();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41901(ByteBuffer byteBuffer) {
        if (!m41897()) {
            return -1;
        }
        byteBuffer.position(0);
        byteBuffer.limit(byteBuffer.capacity());
        C5690 c5690 = this.f58817;
        c5690.f19651 = byteBuffer;
        C14223 c14223M47871 = this.f58810.m47871();
        c14223M47871.getClass();
        C23921 c23921 = ((C3783) this.f58801.get(c14223M47871.f44943)).f12962;
        C16461 c16461 = this.f58807;
        int iM34306 = c23921.m34306(c16461, c5690, 1, false);
        if (iM34306 == -5) {
            iM34306 = c23921.m34306(c16461, c5690, 1, false);
        }
        c16461.m39010();
        C20782.m47568(iM34306 == -4);
        byteBuffer.flip();
        byteBuffer.position(0);
        c5690.f19651 = null;
        return byteBuffer.remaining();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m41905() {
        if (m41897()) {
            return this.f58810.m47871().f44944;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m41907() {
        if (m41897()) {
            return this.f58810.m47871().f44942;
        }
        return -1;
    }

    @EnsuresNonNullIf(expression = {"sampleMetadataQueue.peekFirst()"}, result = true)
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m41897() {
        C18756 c18756 = this.f58805;
        boolean z = false;
        while (true) {
            C20937 c20937 = this.f58810;
            if (!c20937.m47869()) {
                C14223 c14223M47871 = c20937.m47871();
                c14223M47871.getClass();
                if (this.f58816.contains(Integer.valueOf(c14223M47871.f44943))) {
                    return true;
                }
                m41896();
            } else {
                if (z) {
                    return false;
                }
                try {
                    InterfaceC22486 interfaceC22486 = this.f58804;
                    interfaceC22486.getClass();
                    C9169 c9169 = this.f58815;
                    c9169.getClass();
                    int iMo2289 = interfaceC22486.mo2289(c9169, c18756);
                    if (iMo2289 == -1) {
                        z = true;
                    } else if (iMo2289 == 1) {
                        this.f58815 = m41891(c18756.f60914);
                    }
                } catch (Exception | OutOfMemoryError e) {
                    C1896.m6514("Treating exception as the end of input.", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m41896() {
        C3783 c3783 = (C3783) this.f58801.get(this.f58810.m47870().f44943);
        if (c3783.f12963) {
            return;
        }
        C23921 c23921 = c3783.f12962;
        c23921.m34314(1);
        c23921.m34323();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9169 m41891(long j) {
        InterfaceC13433 interfaceC13433 = this.f58814;
        interfaceC13433.getClass();
        Uri uriMo8327 = interfaceC13433.mo8327();
        uriMo8327.getClass();
        C18856.m43745(interfaceC13433);
        long j2 = this.f58800 + j;
        C11941 c11941 = new C11941();
        c11941.m29911(uriMo8327);
        c11941.m29917(j2);
        c11941.m29909(6);
        long jMo8326 = interfaceC13433.mo8326(c11941.m29908());
        if (jMo8326 != -1) {
            jMo8326 += j;
        }
        return new C9169(interfaceC13433, j, jMo8326);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41894(C17953 c17953, C23921 c23921, C15648 c15648) {
        c17953.f58806++;
        ArrayList arrayList = c17953.f58801;
        c23921.m53434(arrayList.size());
        arrayList.add(new C3783(c23921, false, null));
        String strM6719 = C1939.m6719(c15648);
        if (strM6719 != null) {
            c23921.m53435(arrayList.size());
            arrayList.add(new C3783(c23921, true, strM6719));
        }
    }
}
