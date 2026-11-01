package l;

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

/* JADX INFO: renamed from: l.ۚܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 18FX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5445 extends AbstractC9677 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f18772;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f18773;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19805 f18774 = new C19805(1);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f18775;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Map f18776;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C12647 f18777;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f18778;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f18779;

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String mo15077() {
        return "tar";
    }

    public C5445(String str, String str2) {
        AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
        this.f18779 = abstractC20745M15313;
        this.f18773 = str.equals(str2) ? abstractC20745M15313 : C5553.m15313(str2, new String[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5445 m15068(C17367 c17367) {
        C5445 c5445 = new C5445(c17367.m40458(), c17367.m40458());
        String strM40458 = c17367.m40458();
        if (!strM40458.isEmpty()) {
            c5445.f18778 = strM40458;
        }
        C2622 c2622 = (C2622) C12375.m30786(c17367.m40458());
        if (c2622 != null) {
            c5445.f18772 = c2622.f10247;
            c5445.f18776 = c2622.f10249;
            c5445.f18777 = c2622.f10246;
            c5445.f18775 = c2622.f10248;
        }
        return c5445;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo10267(boolean z) throws IOException {
        AbstractC20745 abstractC20745 = this.f18779;
        boolean z2 = true;
        while (true) {
            try {
                C10755 c10755 = new C10755(abstractC20745.m46710("r"), this.f18778);
                try {
                    this.f18772 = C0561.unmodifiableList(c10755.m27058());
                    HashMap map = new HashMap();
                    for (C10049 c10049 : this.f18772) {
                        map.put(c10049.m25433(), c10049);
                    }
                    this.f18776 = C0561.unmodifiableMap(map);
                    this.f18777 = new C12647(this.f18772);
                    this.f18775 = abstractC20745.mo33991();
                    c10755.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c10755.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                if (!z2 || !m15070()) {
                    throw e;
                }
                z2 = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!m24614()) {
            return;
        }
        C19805 c19805 = this.f18774;
        c19805.close();
        while (true) {
            C10755 c10755 = (C10755) c19805.m45009();
            if (c10755 == null) {
                return;
            } else {
                C19431.m44468(c10755);
            }
        }
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream mo15073(AbstractActivityC12483 abstractActivityC12483, InterfaceC2557 interfaceC2557) throws IOException {
        AbstractC20745 abstractC20745 = this.f18779;
        C10049 c10049M35382 = ((C14764) interfaceC2557).m35382();
        C10755 c10755M27052 = m24614() ? (C10755) this.f18774.m45009() : null;
        if (c10755M27052 == null) {
            try {
                c10755M27052 = C10755.m27052(abstractC20745);
            } catch (IOException e) {
                if (m15070()) {
                    c10755M27052 = C10755.m27052(abstractC20745);
                } else {
                    throw e;
                }
            }
        }
        return new C11796(this, c10755M27052.m27057(c10049M35382), c10755M27052);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2557 mo10264(String str) throws IOException {
        if (this.f18776 == null) {
            mo10267(false);
        }
        boolean zEndsWith = str.endsWith("/");
        C10049 entry = getEntry(str.substring(1));
        if (entry == null || entry.m25430() != zEndsWith) {
            return null;
        }
        return new C14764(entry);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private boolean m15070() {
        AbstractC20745 abstractC20745;
        if (this.f18779.mo33975() || (abstractC20745 = this.f18773) == this.f18779) {
            return false;
        }
        synchronized (abstractC20745) {
            if (!this.f18779.mo33975()) {
                BufferedInputStream bufferedInputStreamM46719 = this.f18773.m46719();
                try {
                    InputStream inputStreamM17374 = C6296.m17374(bufferedInputStreamM46719);
                    if (inputStreamM17374 == null) {
                        throw new IOException("Extraction fail: " + this.f18773.mo33986());
                    }
                    AbstractC20745 abstractC20745M46733 = this.f18779.m46733(".tmp");
                    try {
                        abstractC20745M46733.m46694(inputStreamM17374);
                        abstractC20745M46733.m46699(this.f18779, (Runnable) null);
                        bufferedInputStreamM46719.close();
                    } catch (IOException e) {
                        abstractC20745M46733.mo24644();
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStreamM46719.close();
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

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15074(MessageDigest messageDigest) {
        messageDigest.update("tar".getBytes());
        C22253.m49418(messageDigest, this.f18779.mo33986());
        messageDigest.update(String.valueOf(this.f18775).getBytes());
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo10263(String str, boolean z) {
        if (this.f18776 == null) {
            mo10267(false);
        }
        if (C21506.f69876) {
            str = C15489.m37076(str, "/tar/");
        }
        List listM25252 = this.f18777.m25252(str.substring(1));
        ArrayList arrayList = new ArrayList(listM25252.size() + 1);
        Iterator it = listM25252.iterator();
        while (it.hasNext()) {
            arrayList.add(new C14764((C10049) it.next()));
        }
        return arrayList;
    }

    public final C10049 getEntry(String str) {
        Map map = this.f18776;
        if (map == null) {
            return null;
        }
        C10049 c10049 = (C10049) map.get(str);
        if (c10049 != null || !str.endsWith("/")) {
            return c10049;
        }
        C10049 c100410 = (C10049) map.get(str.substring(0, str.length() - 1));
        return (c100410 == null || !c100410.m25430()) ? (C10049) this.f18777.m25250(str) : c100410;
    }

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public final List m15071() {
        return this.f18772;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15075(C11018 c11018) {
        c11018.m27786(this.f18779.mo33986());
        c11018.m27786(this.f18773.mo33986());
        c11018.m27786(m15078());
        c11018.m27786(C12375.m30784(new C2622(this.f18772, this.f18776, this.f18777, this.f18775)));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m15080() {
        return this.f18779.mo33986();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m15076() {
        return this.f18779;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m15079() {
        return this.f18773.mo33986();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m15083() {
        return this.f18773;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m15082() {
        return this.f18775 != this.f18779.mo33991();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m15081() {
        return this.f18779.mo33975();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m15072(String str) {
        this.f18778 = str;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m15078() {
        String str = this.f18778;
        return str == null ? "" : str;
    }
}
