package l;

import android.media.MediaFormat;
import android.net.Uri;
import android.util.SparseArray;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ۖ۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes2.dex */
public final class C2522 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14984 f10007;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f10008;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20723 f10010;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f10013;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC10045 f10014;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f10015;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC15785 f10016;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC6599 f10018;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashSet f10019;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f10020;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11445 f10022;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C0954 f10011 = new C0954();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5853 f10009 = new C5853();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList f10012 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final SparseArray f10021 = new SparseArray();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C11696 f10017 = new C11696();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C12526 f10006 = new C12526();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C16033 f10023 = new C16033(0, 0);

    public C2522(C11445 c11445, InterfaceC20723 interfaceC20723) {
        this.f10022 = c11445;
        this.f10010 = interfaceC20723;
        new C16033(2, 0);
        this.f10019 = new HashSet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7891(Uri uri) {
        int iMo2750;
        InterfaceC15785 interfaceC15785Mo4000 = this.f10010.mo4000();
        C16490 c16490 = new C16490();
        c16490.m38756(uri);
        c16490.m38762(0L);
        c16490.m38754(6);
        C12257 c12257M38753 = c16490.m38753();
        C0954 c0954 = this.f10011;
        C2023.m6510(!this.f10015);
        this.f10015 = true;
        this.f10008 = c12257M38753.f41009;
        this.f10016 = interfaceC15785Mo4000;
        C14984 c14984 = new C14984(this.f10016, 0L, interfaceC15785Mo4000.mo9272(c12257M38753));
        InterfaceC10045[] interfaceC10045ArrM28559 = this.f10022.m28559();
        InterfaceC10045 interfaceC10045 = interfaceC10045ArrM28559[0];
        Throwable e = null;
        try {
            if (interfaceC10045.mo2754(c14984)) {
                c14984.mo19217();
            } else {
                c14984.mo19217();
                interfaceC10045 = null;
            }
        } catch (EOFException unused) {
        } catch (Throwable th) {
            c14984.mo19217();
            throw th;
        }
        if (interfaceC10045 != null) {
            interfaceC10045.mo2753(new C9704(this));
            boolean z = true;
            while (z) {
                try {
                    iMo2750 = interfaceC10045.mo2750(c14984, c0954);
                } catch (Exception | OutOfMemoryError e2) {
                    e = e2;
                    iMo2750 = -1;
                }
                boolean z2 = !this.f10020 || this.f10013 < this.f10021.size() || this.f10018 == null;
                if (e != null || (z2 && iMo2750 == -1)) {
                    m7892();
                    throw C22861.m50610(e != null ? "Exception encountered while parsing input media." : "Reached end of input before preparation completed.", e);
                }
                if (iMo2750 == 1) {
                    c14984 = m7880(c0954.f3770);
                }
                z = z2;
            }
            this.f10007 = c14984;
            this.f10014 = interfaceC10045;
            return;
        }
        String str = "None of the available extractors (" + C13366.m32865(", ").m32867((Iterable) C3051.m9144(AbstractC22433.m49800(interfaceC10045ArrM28559), new C8550())) + ") could read the stream.";
        InterfaceC15785 interfaceC15785 = this.f10016;
        interfaceC15785.getClass();
        interfaceC15785.mo9274().getClass();
        throw new C14507(str, AbstractC22433.of());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m7892() {
        SparseArray sparseArray;
        int i = 0;
        while (true) {
            sparseArray = this.f10021;
            if (i >= sparseArray.size()) {
                break;
            }
            ((C3352) sparseArray.valueAt(i)).m42016();
            i++;
        }
        sparseArray.clear();
        InterfaceC10045 interfaceC10045 = this.f10014;
        if (interfaceC10045 != null) {
            interfaceC10045.mo2751();
            this.f10014 = null;
        }
        this.f10007 = null;
        C22851.m50584(this.f10016);
        this.f10016 = null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m7887() {
        return this.f10012.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaFormat m7889(int i) {
        C4639 c4639 = (C4639) this.f10012.get(i);
        MediaFormat mediaFormatM12810 = c4639.m12810(this.f10006, this.f10023);
        long j = c4639.f16391.f12401;
        if (j != -9223372036854775807L) {
            mediaFormatM12810.setLong("durationUs", j);
            return mediaFormatM12810;
        }
        InterfaceC6599 interfaceC6599 = this.f10018;
        if (interfaceC6599 != null && interfaceC6599.mo5383() != -9223372036854775807L) {
            mediaFormatM12810.setLong("durationUs", this.f10018.mo5383());
        }
        return mediaFormatM12810;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m7895(int i) {
        this.f10019.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7890() {
        if (m7886()) {
            m7877();
            m7886();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7888(ByteBuffer byteBuffer) {
        if (!m7886()) {
            return -1;
        }
        byteBuffer.position(0);
        byteBuffer.limit(byteBuffer.capacity());
        C16033 c16033 = this.f10023;
        c16033.f51912 = byteBuffer;
        C13813 c13813M29207 = this.f10017.m29207();
        c13813M29207.getClass();
        C3352 c3352 = ((C4639) this.f10012.get(c13813M29207.f45595)).f16391;
        C12526 c12526 = this.f10006;
        int iM41998 = c3352.m41998(c12526, c16033, 1, false);
        if (iM41998 == -5) {
            iM41998 = c3352.m41998(c12526, c16033, 1, false);
        }
        c12526.m31083();
        C2023.m6510(iM41998 == -4);
        byteBuffer.flip();
        byteBuffer.position(0);
        c16033.f51912 = null;
        return byteBuffer.remaining();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m7893() {
        if (m7886()) {
            return this.f10017.m29207().f45596;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m7894() {
        if (m7886()) {
            return this.f10017.m29207().f45594;
        }
        return -1;
    }

    @EnsuresNonNullIf(expression = {"sampleMetadataQueue.peekFirst()"}, result = true)
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m7886() {
        C0954 c0954 = this.f10011;
        boolean z = false;
        while (true) {
            C11696 c11696 = this.f10017;
            if (!c11696.m29205()) {
                C13813 c13813M29207 = c11696.m29207();
                c13813M29207.getClass();
                if (this.f10019.contains(Integer.valueOf(c13813M29207.f45595))) {
                    return true;
                }
                m7877();
            } else {
                if (z) {
                    return false;
                }
                try {
                    InterfaceC10045 interfaceC10045 = this.f10014;
                    interfaceC10045.getClass();
                    C14984 c14984 = this.f10007;
                    c14984.getClass();
                    int iMo2750 = interfaceC10045.mo2750(c14984, c0954);
                    if (iMo2750 == -1) {
                        z = true;
                    } else if (iMo2750 == 1) {
                        this.f10007 = m7880(c0954.f3770);
                    }
                } catch (Exception | OutOfMemoryError e) {
                    C0303.m1852("Treating exception as the end of input.", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m7877() {
        C4639 c4639 = (C4639) this.f10012.get(this.f10017.m29206().f45595);
        if (c4639.f16392) {
            return;
        }
        C3352 c3352 = c4639.f16391;
        c3352.m42007(1);
        c3352.m42010();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14984 m7880(long j) {
        InterfaceC15785 interfaceC15785 = this.f10016;
        interfaceC15785.getClass();
        Uri uriMo9274 = interfaceC15785.mo9274();
        uriMo9274.getClass();
        C22851.m50584(interfaceC15785);
        long j2 = this.f10008 + j;
        C16490 c16490 = new C16490();
        c16490.m38756(uriMo9274);
        c16490.m38762(j2);
        c16490.m38754(6);
        long jMo9272 = interfaceC15785.mo9272(c16490.m38753());
        if (jMo9272 != -1) {
            jMo9272 += j;
        }
        return new C14984(interfaceC15785, j, jMo9272);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7881(C2522 c2522, C3352 c3352, C7648 c7648) {
        c2522.f10013++;
        ArrayList arrayList = c2522.f10012;
        c3352.m9993(arrayList.size());
        arrayList.add(new C4639(c3352, false, null));
        String strM45158 = C19894.m45158(c7648);
        if (strM45158 != null) {
            c3352.m9992(arrayList.size());
            arrayList.add(new C4639(c3352, true, strM45158));
        }
    }
}
