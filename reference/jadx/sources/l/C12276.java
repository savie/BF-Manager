package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12276 extends AbstractC7629 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f39465;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC20481 f39466;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C7319 f39467;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f39468;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f39469;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f39470;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C8547 f39471;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f39472;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f39473;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f39474;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f39475;

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ᩷ */
    public final String mo20842() {
        return "payload";
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C8547 m30663(boolean z) {
        if (m30662() && (z || this.f39473 == null)) {
            C8547 c8547 = new C8547();
            this.f39471 = c8547;
            return c8547;
        }
        return null;
    }

    public C12276(AbstractC22044 abstractC22044, long j, long j2) {
        this.f39465 = abstractC22044;
        this.f39472 = j;
        this.f39474 = j2;
        this.f39470 = null;
        this.f39468 = null;
        this.f39475 = 0;
        this.f39467 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12276 m30655(int i, String str, String str2) {
        return new C12276(str, str2, i, null);
    }

    public C12276(String str, String str2, int i, C7319 c7319) {
        this.f39465 = null;
        this.f39472 = 0L;
        this.f39474 = 0L;
        this.f39470 = str;
        C17359.requireNonNull(str2);
        this.f39468 = str2;
        this.f39475 = i;
        this.f39467 = c7319;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20835(C6178 c6178) {
        if (m30662()) {
            C7319 c7319 = this.f39467;
            String strM20074 = c7319 == null ? null : c7319.m20074();
            boolean z = strM20074 != null;
            c6178.m17800(!z ? "\u0001MT_REMOTE_PAYLOAD_SOURCE_V1" : "\u0001MT_REMOTE_PAYLOAD_SOURCE_V2");
            c6178.m17786((CharSequence) this.f39470);
            c6178.m17786((CharSequence) this.f39468);
            c6178.writeInt(this.f39475);
            if (z) {
                c6178.m17803(c7319.m20071());
                c6178.m17804(c7319.m20069());
                c6178.m17804(c7319.m20072());
                c6178.m17786((CharSequence) strM20074);
                return;
            }
            return;
        }
        c6178.m17800(this.f39465.mo4294());
        c6178.m17803(this.f39472);
        c6178.m17803(this.f39474);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12276 m30656(C20348 c20348) {
        String strM46758 = c20348.m46758();
        if ("\u0001MT_REMOTE_PAYLOAD_SOURCE_V1".equals(strM46758)) {
            return m30655(c20348.readInt(), c20348.m46756(), c20348.m46756());
        }
        if ("\u0001MT_REMOTE_PAYLOAD_SOURCE_V2".equals(strM46758)) {
            return new C12276(c20348.m46756(), c20348.m46756(), c20348.readInt(), new C7319(c20348.readLong(), c20348.m46757(), c20348.m46757(), c20348.m46756()));
        }
        return new C12276(C14584.m35193(strM46758, new String[0]), c20348.readLong(), c20348.readLong());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30664(C8547 c8547) {
        InterfaceC20481 interfaceC20481 = this.f39466;
        if (interfaceC20481 != null) {
            C20244.m46520(interfaceC20481);
            this.f39466 = null;
        }
        InterfaceC20481 interfaceC20481M30658 = m30658(c8547);
        this.f39466 = interfaceC20481M30658;
        this.f39473 = interfaceC20481M30658.mo8645();
        InterfaceC20481 interfaceC20482 = this.f39466;
        if (interfaceC20482 instanceof C2581) {
            this.f39467 = ((C2581) interfaceC20482).m8641();
            return;
        }
        AbstractC22044 abstractC22044 = this.f39465;
        if (abstractC22044 != null) {
            this.f39469 = abstractC22044.mo4286();
        }
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20837(boolean z) {
        C8547 c8547;
        synchronized (this) {
            c8547 = this.f39471;
            this.f39471 = null;
        }
        m30664(c8547);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo20829(AbstractActivityC17204 abstractActivityC17204, InterfaceC2386 interfaceC2386) {
        if (this.f39466 == null) {
            mo20837(false);
        }
        return this.f39466.mo8642(((C3327) interfaceC2386).m10960());
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2386 mo20831(String str) {
        if (this.f39473 == null) {
            mo20837(false);
        }
        String strSubstring = str.substring(1);
        for (C4819 c4819 : this.f39473) {
            if (c4819.m14851().equals(strSubstring)) {
                return new C3327(c4819);
            }
        }
        return null;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20833(MessageDigest messageDigest) {
        messageDigest.update("payload".getBytes());
        C15022.m36176(messageDigest, m30660());
        if (m30662()) {
            C15022.m36176(messageDigest, this.f39468);
        } else {
            messageDigest.update(String.valueOf(this.f39469).getBytes());
        }
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo20830(String str, boolean z) {
        if (this.f39473 == null) {
            mo20837(false);
        }
        ArrayList arrayList = new ArrayList(this.f39473.size() + 1);
        if ("/".equals(str)) {
            Iterator it = this.f39473.iterator();
            while (it.hasNext()) {
                arrayList.add(new C3327((C4819) it.next()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20481 m30658(C8547 c8547) throws IOException {
        if (!m30662()) {
            long j = this.f39474;
            C13961 c13961M49855 = this.f39465.m49855("r");
            long j2 = this.f39472;
            if (j2 > 0) {
                try {
                    c13961M49855 = c13961M49855.m34030(j2, j);
                } catch (IOException e) {
                    c13961M49855.close();
                    throw e;
                }
            }
            return new C23465(c13961M49855);
        }
        return C2581.m8637(this.f39470, this.f39468, this.f39475, this.f39467, c8547);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m30659() {
        return this.f39465;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m30657() {
        AbstractC22044 abstractC22044 = this.f39465;
        return (abstractC22044 == null || this.f39469 == abstractC22044.mo4286()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m30665() {
        AbstractC22044 abstractC22044 = this.f39465;
        return abstractC22044 == null || abstractC22044.mo2934();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m30662() {
        return this.f39470 != null;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m30660() {
        return m30662() ? this.f39470 : this.f39465.mo4294();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m30661() {
        if (m30662()) {
            StringBuilder sb = new StringBuilder("remote\nurlLength=");
            String str = this.f39470;
            sb.append(str.length());
            sb.append("\n");
            sb.append(str);
            return sb.toString();
        }
        String strMo4294 = this.f39465.mo4294();
        int i = C21227.f67740;
        return "pathLength=" + strMo4294.length() + "\n" + strMo4294 + "\noffset=" + this.f39472 + "\nlength=" + this.f39474;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC20481 interfaceC20481 = this.f39466;
        if (interfaceC20481 != null) {
            C20244.m46520(interfaceC20481);
            this.f39466 = null;
        }
    }
}
