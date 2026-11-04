package l;

import bin.mt.plus.R;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18FX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11312 extends AbstractC7629 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Map f35649;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C12804 f35650;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20528 f35651 = new C20528(1);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C12804 f35652;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f35653;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f35654;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f35655;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f35656;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f35657;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C7780 f35658;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f35659;

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ᩷ */
    public final String mo20842() {
        return "tar";
    }

    public C11312(String str, String str2) {
        AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
        this.f35654 = abstractC22044M35193;
        this.f35656 = str.equals(str2) ? abstractC22044M35193 : C14584.m35193(str2, new String[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11312 m28585(C20348 c20348) {
        C11312 c11312 = new C11312(c20348.m46758(), c20348.m46758());
        String strM46758 = c20348.m46758();
        if (!strM46758.isEmpty()) {
            c11312.f35659 = strM46758;
        }
        C1618 c1618 = (C1618) C0717.m3038(c20348.m46758());
        if (c1618 != null) {
            c11312.f35657 = c1618.f5573;
            c11312.f35649 = c1618.f5578;
            c11312.f35658 = c1618.f5579;
            c11312.f35653 = c1618.f5574;
            c11312.f35652 = c1618.f5575;
            c11312.f35650 = c1618.f5577;
        }
        boolean z = !c11312.f35656.equals(c11312.f35654) && (c11312.f35650 == null || (c1618 != null && c1618.f5576));
        c11312.f35655 = z;
        if (z) {
            c11312.f35657 = null;
            c11312.f35649 = null;
            c11312.f35658 = null;
            c11312.f35652 = null;
        }
        return c11312;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20837(boolean z) throws IOException {
        AbstractC22044 abstractC22044 = this.f35656;
        AbstractC22044 abstractC22045 = this.f35654;
        m28584();
        boolean z2 = true;
        while (true) {
            try {
                C12804 c12804M31756 = C12804.m31756(abstractC22045);
                try {
                    C5368 c5368M31760 = c12804M31756.m31760(this.f35659, true);
                    try {
                        this.f35657 = C4681.unmodifiableList(c5368M31760.m16033());
                        HashMap map = new HashMap();
                        for (C7450 c7450 : this.f35657) {
                            map.put(c7450.m20456(), c7450);
                        }
                        this.f35649 = C4681.unmodifiableMap(map);
                        this.f35658 = new C7780(this.f35657);
                        this.f35653 = abstractC22045.mo4286();
                        this.f35652 = c12804M31756;
                        if (!abstractC22044.equals(abstractC22045)) {
                            c12804M31756 = C12804.m31756(abstractC22044);
                        }
                        this.f35650 = c12804M31756;
                        while (true) {
                            C5368 c5368 = (C5368) this.f35651.m47061();
                            if (c5368 != null) {
                                C20244.m46520(c5368);
                            } else {
                                c5368M31760.close();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            c5368M31760.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    if (!z2 || !m28584()) {
                        throw e;
                    }
                }
            } catch (IOException e2) {
                if (!z2 || !m28584()) {
                    throw e2;
                }
            }
            z2 = false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!m20840()) {
            return;
        }
        C20528 c20528 = this.f35651;
        c20528.close();
        while (true) {
            C5368 c5368 = (C5368) c20528.m47061();
            if (c5368 == null) {
                return;
            } else {
                C20244.m46520(c5368);
            }
        }
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo20829(AbstractActivityC17204 abstractActivityC17204, InterfaceC2386 interfaceC2386) throws IOException {
        C7450 c7450M8594 = ((C2559) interfaceC2386).m8594();
        m28587();
        AbstractC22044 abstractC22044 = this.f35654;
        if (!abstractC22044.mo2934()) {
            m28584();
        }
        if (this.f35652 == null) {
            this.f35652 = C12804.m31756(abstractC22044);
        }
        this.f35652.m31763();
        C5368 c5368M28596 = m20840() ? (C5368) this.f35651.m47061() : null;
        if (c5368M28596 == null) {
            try {
                c5368M28596 = m28596();
            } catch (IOException e) {
                if (m28584()) {
                    c5368M28596 = m28596();
                } else {
                    throw e;
                }
            }
        }
        return new C5347(this, c5368M28596.m16032(c7450M8594), c5368M28596);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2386 mo20831(String str) throws IOException {
        if (this.f35649 == null) {
            mo20837(false);
        }
        boolean zEndsWith = str.endsWith("/");
        C7450 entry = getEntry(str.substring(1));
        if (entry == null || entry.m20450() != zEndsWith) {
            return null;
        }
        return new C2559(entry);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private boolean m28584() {
        C12804 c12804;
        C12804 c12805;
        AbstractC22044 abstractC22044 = this.f35656;
        AbstractC22044 abstractC22045 = this.f35654;
        if (abstractC22044 == abstractC22045 || (!this.f35655 && abstractC22045.mo2934() && ((c12805 = this.f35650) == null || c12805.m31762()))) {
            return false;
        }
        synchronized (this.f35656) {
            if (this.f35655 || !this.f35654.mo2934() || ((c12804 = this.f35650) != null && !c12804.m31762())) {
                C12804 c12804M31756 = C12804.m31756(this.f35656);
                BufferedInputStream bufferedInputStreamM31764 = c12804M31756.m31764();
                try {
                    InputStream inputStreamM25862 = C10016.m25862(bufferedInputStreamM31764);
                    if (inputStreamM25862 == null) {
                        throw new IOException(C21576.m49059(R.string.MT_Protector, this.f35656.mo4294()));
                    }
                    AbstractC22044 abstractC22044M49862 = this.f35654.m49862(".tmp");
                    try {
                        abstractC22044M49862.m49840(inputStreamM25862);
                        abstractC22044M49862.m49845(this.f35654, (Runnable) null);
                        this.f35652 = null;
                        this.f35650 = c12804M31756;
                        this.f35655 = false;
                        bufferedInputStreamM31764.close();
                    } catch (IOException e) {
                        abstractC22044M49862.mo4287();
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStreamM31764.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                throw th;
            }
        }
        return true;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20833(MessageDigest messageDigest) {
        messageDigest.update("tar".getBytes());
        C15022.m36176(messageDigest, this.f35654.mo4294());
        messageDigest.update(String.valueOf(this.f35653).getBytes());
        C12804 c12804 = this.f35652;
        if (c12804 != null) {
            c12804.m31761(messageDigest);
        }
        C12804 c12805 = this.f35650;
        if (c12805 == null || c12805 == this.f35652) {
            return;
        }
        c12805.m31761(messageDigest);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo20830(String str, boolean z) {
        if (this.f35649 == null) {
            mo20837(false);
        }
        if (C17719.f58226) {
            str = C14483.m34972(str, "/tar/");
        }
        List listM18371 = this.f35658.m18371(str.substring(1));
        ArrayList arrayList = new ArrayList(listM18371.size() + 1);
        Iterator it = listM18371.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2559((C7450) it.next()));
        }
        return arrayList;
    }

    public final C7450 getEntry(String str) {
        Map map = this.f35649;
        if (map == null) {
            return null;
        }
        C7450 c7450 = (C7450) map.get(str);
        if (c7450 != null || !str.endsWith("/")) {
            return c7450;
        }
        C7450 c7451 = (C7450) map.get(str.substring(0, str.length() - 1));
        return (c7451 == null || !c7451.m20450()) ? (C7450) this.f35658.m18364(str) : c7451;
    }

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public final List m28594() {
        return this.f35657;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m28588() {
        return this.f35654.mo4294();
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20835(C6178 c6178) {
        c6178.m17800(this.f35654.mo4294());
        c6178.m17800(this.f35656.mo4294());
        c6178.m17800(m28590());
        c6178.m17800(C0717.m3036(new C1618(this.f35657, this.f35649, this.f35658, this.f35653, this.f35652, this.f35650, this.f35655)));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m28595() {
        return this.f35654;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m28592() {
        return this.f35656.mo4294();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m28593() {
        return this.f35656;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5368 m28596() throws IOException {
        m28587();
        if (this.f35652 == null) {
            this.f35652 = C12804.m31756(this.f35654);
        }
        return this.f35652.m31760(this.f35659, false);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m28587() throws IOException {
        if (this.f35655) {
            throw new IOException(C21576.m49059(R.string.MT_Protector, this.f35654.mo4294()));
        }
        C12804 c12804 = this.f35650;
        if (c12804 == null || c12804 == this.f35652) {
            return;
        }
        c12804.m31763();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12804 m28598() {
        C12804 c12804M31756;
        if (this.f35650 == null) {
            AbstractC22044 abstractC22044 = this.f35656;
            AbstractC22044 abstractC22045 = this.f35654;
            if (abstractC22044.equals(abstractC22045)) {
                if (this.f35652 == null) {
                    this.f35652 = C12804.m31756(abstractC22045);
                }
                c12804M31756 = this.f35652;
            } else {
                c12804M31756 = C12804.m31756(abstractC22044);
            }
            this.f35650 = c12804M31756;
        }
        return this.f35650;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m28591() {
        if (this.f35655 || this.f35653 != this.f35654.mo4286()) {
            return true;
        }
        C12804 c12804 = this.f35652;
        if (c12804 != null && !c12804.m31762()) {
            return true;
        }
        C12804 c12805 = this.f35650;
        return (c12805 == null || c12805 == this.f35652 || c12805.m31762()) ? false : true;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m28589() {
        return this.f35654.mo2934();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m28597(String str) {
        this.f35659 = str;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m28590() {
        String str = this.f35659;
        return str == null ? "" : str;
    }
}
