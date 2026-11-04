package l;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.᩺۬۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AHU */
/* JADX INFO: loaded from: classes.dex */
public final class C24320 extends AbstractC7629 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Charset f78722;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C13244 f78723;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f78724;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f78725;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public List f78726;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f78729;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21246 f78731;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Map f78732;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f78733;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f78730 = C9498.f30777;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f78728 = true;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C20528 f78727 = new C20528(1);

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ᩷ */
    public final String mo20842() {
        return "zip";
    }

    public C24320(String str) {
        this.f78725 = C14584.m35193(str, new String[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24320 m54358(C20348 c20348) {
        C24320 c24320 = new C24320(c20348.m46758());
        c24320.f78730 = c20348.m46748();
        c24320.f78733 = c20348.m46753();
        c24320.f78724 = c20348.m46742();
        String strM46758 = c20348.m46758();
        if (!strM46758.isEmpty()) {
            c24320.m54374(strM46758);
        }
        String strM46759 = c20348.m46758();
        if (!strM46759.isEmpty()) {
            c24320.f78722 = Charset.forName(strM46759);
        }
        C6420 c6420 = (C6420) C0717.m3038(c20348.m46758());
        if (c6420 != null) {
            c24320.f78726 = c6420.f21640;
            c24320.f78732 = c6420.f21642;
            c24320.f78723 = c6420.f21643;
            c24320.f78729 = c6420.f21641;
        }
        return c24320;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20837(boolean z) {
        C22941 c22941 = new C22941(this.f78725, this.f78722);
        try {
            m54359(c22941);
            c22941.close();
        } catch (Throwable th) {
            try {
                c22941.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final List m54365() {
        C22941 c22941M51703 = C22941.m51703(this.f78725, this.f78722);
        try {
            m54359(c22941M51703);
            List listUnmodifiableList = C4681.unmodifiableList(new ArrayList(c22941M51703.m51734()));
            c22941M51703.close();
            return listUnmodifiableList;
        } catch (Throwable th) {
            try {
                c22941M51703.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54359(C22941 c22941) {
        byte[] bArrM51744 = c22941.m51744();
        if (bArrM51744 == null) {
            bArrM51744 = C9498.f30777;
        }
        this.f78730 = bArrM51744;
        this.f78726 = C4681.unmodifiableList(c22941.m51740());
        this.f78732 = c22941.m51739();
        this.f78723 = new C13244(this.f78726);
        boolean zM51736 = c22941.m51736();
        this.f78733 = zM51736;
        this.f78724 = zM51736 ? C18685.m43475(c22941) : null;
        this.f78729 = this.f78725.mo4286();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!m20840()) {
            return;
        }
        C20528 c20528 = this.f78727;
        c20528.close();
        while (true) {
            C22941 c22941 = (C22941) c20528.m47061();
            if (c22941 == null) {
                return;
            } else {
                C20244.m46520(c22941);
            }
        }
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo20829(AbstractActivityC17204 abstractActivityC17204, InterfaceC2386 interfaceC2386) {
        return m54363(abstractActivityC17204, interfaceC2386, new C8730());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:75:0x012e A[Catch: ܶܽܺ -> 0x013a, TRY_LEAVE, TryCatch #3 {ܶܽܺ -> 0x013a, blocks: (B:63:0x00fc, B:67:0x010d, B:69:0x011a, B:71:0x0120, B:73:0x0128, B:75:0x012e), top: B:89:0x00fc }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FilterInputStream m54363(AbstractActivityC17204 abstractActivityC17204, InterfaceC2386 interfaceC2386, final InterfaceC7509 interfaceC7509) throws C16227 {
        boolean zM25891;
        boolean z;
        BufferedInputStream bufferedInputStream;
        C20528 c20528;
        boolean z2;
        if (!interfaceC7509.mo924()) {
            C8002 c8002M8382 = ((C2494) interfaceC2386).m8382();
            boolean zM43879 = C18902.m43879(c8002M8382);
            C20528 c20529 = this.f78727;
            AbstractC22044 abstractC22044 = this.f78725;
            if (!zM43879) {
                Iterator itM48118 = null;
                while (!interfaceC7509.mo924()) {
                    String strM54375 = m54375();
                    try {
                        if (c8002M8382.m21856() && (strM54375 == null || strM54375.isEmpty())) {
                            if (itM48118 == null) {
                                itM48118 = C21054.m48118();
                            }
                            if (itM48118.hasNext()) {
                                m54374((String) itM48118.next());
                                zM25891 = false;
                                z = true;
                            } else {
                                C10039 c10039 = new C10039(abstractActivityC17204, new C24159(this));
                                c10039.m25890(new BooleanSupplier() { // from class: l.᩵۬۫
                                    @Override // java.util.function.BooleanSupplier
                                    public final boolean getAsBoolean() {
                                        return interfaceC7509.mo924();
                                    }
                                });
                                zM25891 = c10039.m25891();
                                if (!zM25891) {
                                    break;
                                }
                            }
                            byte[] bArr = this.f78730;
                            String strM54376 = m54375();
                            if (m20840()) {
                                c20528 = c20529;
                            } else {
                                c20528 = null;
                            }
                            bufferedInputStream = new BufferedInputStream(C18902.m43871(c8002M8382, abstractC22044, bArr, strM54376, c20528));
                            if (c8002M8382.m21856() || C18902.m43880(c8002M8382, bufferedInputStream)) {
                                if (z) {
                                    C18902.m43875(m54375(), abstractC22044.mo4294());
                                }
                                return bufferedInputStream;
                            }
                            C20244.m46520(bufferedInputStream);
                            m54374(null);
                            if (zM25891) {
                                C18902.m43874();
                            }
                        } else {
                            zM25891 = false;
                        }
                        byte[] bArr2 = this.f78730;
                        String strM54377 = m54375();
                        if (m20840()) {
                            c20528 = c20529;
                        } else {
                            c20528 = null;
                        }
                        bufferedInputStream = new BufferedInputStream(C18902.m43871(c8002M8382, abstractC22044, bArr2, strM54377, c20528));
                        if (c8002M8382.m21856()) {
                        }
                        if (z) {
                            C18902.m43875(m54375(), abstractC22044.mo4294());
                        }
                        return bufferedInputStream;
                    } catch (C16227 e) {
                        if (c8002M8382.m21856()) {
                            m54374(null);
                            if (zM25891) {
                                C18902.m43874();
                            }
                        } else {
                            throw e;
                        }
                    }
                    z = false;
                }
            } else {
                String strM54378 = m54375();
                List listM43872 = null;
                while (!interfaceC7509.mo924()) {
                    if (strM54378 == null || strM54378.isEmpty()) {
                        if (listM43872 == null) {
                            C22941 c22941M51705 = C22941.m51705(abstractC22044, this.f78730);
                            try {
                                listM43872 = C18902.m43872(c22941M51705, c8002M8382, interfaceC7509);
                                c22941M51705.close();
                            } catch (Throwable th) {
                                try {
                                    c22941M51705.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        AtomicReference atomicReference = new AtomicReference();
                        C10039 c100310 = new C10039(abstractActivityC17204, new C11398(3, atomicReference));
                        c100310.m25890(new BooleanSupplier() { // from class: l.᩵۬۫
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                return interfaceC7509.mo924();
                            }
                        });
                        if (!c100310.m25892(listM43872)) {
                            return null;
                        }
                        strM54378 = (String) atomicReference.get();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    try {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(C18902.m43871(c8002M8382, abstractC22044, this.f78730, strM54378, m20840() ? c20529 : null));
                        if (!C18902.m43880(c8002M8382, bufferedInputStream2)) {
                            C20244.m46520(bufferedInputStream2);
                            throw new C16227(c8002M8382.getName());
                        }
                        return new C12385(this, bufferedInputStream2, strM54378, z2);
                    } catch (C16227 unused) {
                        C21054.m48111(abstractC22044.mo4294(), strM54378);
                        if (z2) {
                            C18902.m43874();
                        }
                        strM54378 = null;
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2386 mo20831(String str) {
        if (this.f78732 == null) {
            mo20837(false);
        }
        C8002 entry = getEntry(str.substring(1));
        if (entry == null) {
            return null;
        }
        return new C2494(entry);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20833(MessageDigest messageDigest) {
        messageDigest.update("zip".getBytes());
        C15022.m36176(messageDigest, this.f78725.mo4294());
        messageDigest.update(String.valueOf(this.f78729).getBytes());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21246 m54364() {
        C21246 c21246 = this.f78731;
        if (c21246 != null) {
            return c21246;
        }
        if (!this.f78728) {
            return null;
        }
        this.f78728 = false;
        try {
            if (this.f78726 == null) {
                mo20837(false);
            }
            C8002 c8002 = (C8002) this.f78732.get("resources.arsc");
            if (c8002 != null && c8002.getSize() < 15728640) {
                C22941 c22941M51705 = C22941.m51705(this.f78725, this.f78730);
                try {
                    this.f78731 = new C21246(0, new C24296(c22941M51705.m51727(c8002)));
                    c22941M51705.close();
                } catch (Throwable th) {
                    try {
                        c22941M51705.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            return this.f78731;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo20830(String str, boolean z) {
        if (this.f78726 == null) {
            mo20837(false);
        }
        if (C17719.f58226) {
            str = C14483.m34972(str, "/zip/");
        }
        List listM18371 = this.f78723.m18371(str.substring(1));
        ArrayList arrayList = new ArrayList(listM18371.size() + 1);
        Iterator it = listM18371.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2494((C8002) it.next()));
        }
        return arrayList;
    }

    public final C8002 getEntry(String str) {
        Map map = this.f78732;
        if (map == null) {
            return null;
        }
        C8002 c8002 = (C8002) map.get(str);
        return (c8002 == null && str.endsWith("/")) ? (C8002) this.f78723.m18364(str) : c8002;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final byte[] m54362() {
        return this.f78730;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m54372() {
        return this.f78730.length > 0;
    }

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public final List m54370() {
        return this.f78726;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m54361() {
        return this.f78725.mo4294();
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20835(C6178 c6178) {
        c6178.m17800(this.f78725.mo4294());
        c6178.m17806(this.f78730);
        c6178.m17789(this.f78733);
        c6178.m17787(this.f78724);
        c6178.m17800(m54375());
        c6178.m17800(m54368());
        c6178.m17800(C0717.m3036(new C6420(this.f78726, this.f78732, this.f78723, this.f78729)));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m54371() {
        return this.f78725;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m54366() {
        return this.f78733;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m54367() {
        return this.f78724;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m54360() {
        return this.f78729 != this.f78725.mo4286();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m54369() {
        return this.f78725.mo2934();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m54374(String str) {
        C21054.m48119(this.f78725.mo4294(), str);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m54375() {
        return C21054.m48109(this.f78725.mo4294());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54373(Charset charset) {
        this.f78722 = charset;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m54368() {
        Charset charset = this.f78722;
        return charset == null ? "" : charset.name();
    }
}
