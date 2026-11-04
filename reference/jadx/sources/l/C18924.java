package l;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ᩳ۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: N9ZJ */
/* JADX INFO: loaded from: classes.dex */
public class C18924 extends AbstractC18881 implements InterfaceC9687 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f61387 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public volatile C18178 f61388;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C24892 f61389;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f61390;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C14754 f61391;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Object f61392;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile C9973 f61393;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC9021 f61394;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16312 f61395;

    static {
        ApplicationC23172.m52091(137);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private native void m43937();

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo35574() {
        return true;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo35581() {
        return false;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo35583() {
        return false;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩷ */
    public final void mo35585(C6178 c6178) {
    }

    public C18924(int i, AbstractC0148 abstractC0148) {
        super(i, abstractC0148);
        this.f61392 = new Object();
        this.f61389 = new C24892();
        this.f61394 = new C20416();
        this.f61395 = new C16312(new C4008(this), true);
        this.f61393 = C9973.m25816(i, abstractC0148);
        this.f61388 = new C18178(this.f61393);
        m43937();
    }

    public C18924(int i, AbstractC0148 abstractC0148, C20348 c20348) {
        this(i, abstractC0148);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ */
    public final void mo35572(AbstractC0148 abstractC0148) {
        super.mo35572(abstractC0148);
        C9973 c9973M25816 = C9973.m25816(this.f61288, abstractC0148);
        if (this.f61393.equals(c9973M25816)) {
            return;
        }
        C4754.m14669(m43934(c9973M25816, false).f67565);
        this.f61395.m38698();
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܶ */
    public final String mo35579() {
        return this.f61393.f32073;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܽ */
    public final String mo35580() {
        return this.f61393.f32073;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۤ */
    public final void mo43668(long j, String str) {
        m43929().mo1025(j, str);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۘ */
    public final String mo35569() {
        return TextUtils.isEmpty(this.f61393.f32069) ? "/" : AbstractC7364.m20187(this.f61393.f32069);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20837(boolean z) {
        C21162 c21162M43934;
        this.f61395.m38698();
        if (z) {
            synchronized (this.f61392) {
                c21162M43934 = m43934(this.f61393, true);
            }
            try {
                C4754.m14669(c21162M43934.f67565);
            } finally {
                m43935(c21162M43934);
            }
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC24277 mo43789(String str) {
        return m43929().mo1028(str);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo35570(long j, String str) {
        return m43929().mo1027(j, str);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo43786(String str, long j, long j2) {
        return m43929().mo1019(str, j, j2);
    }

    @Override // l.InterfaceC9687
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo1020(String str, long j, long j2, C10588 c10588) throws IOException {
        InterfaceC17432 interfaceC17432M43929 = m43929();
        if (interfaceC17432M43929 instanceof InterfaceC9687) {
            return ((InterfaceC9687) interfaceC17432M43929).mo1020(str, j, j2, c10588);
        }
        return interfaceC17432M43929.mo1019(str, j, j2);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩷ */
    public final OutputStream mo35584(long j, String str) {
        return m43929().mo1021(j, str);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۤ */
    public final void mo35575(String str, boolean z) {
        m43929().mo1024(str, z);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ */
    public final void mo35571(String str, String str2) {
        m43929().mo1023(str, str2);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩴ */
    public final void mo35582(String str) {
        m43929().mo1026(str);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo35573(String str) {
        return this.f61395.m38701(str);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo35586(String str) {
        C16312 c16312 = this.f61395;
        c16312.getClass();
        return c16312.m38697(C11293.m28556(str), C11293.m28558(str)) != null;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۫ */
    public final String mo35577(String str) {
        return this.f61395.m38702(str);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2386 mo20831(String str) {
        String strM28556 = C11293.m28556(str);
        C7518 c7518 = (C7518) this.f61395.m38697(strM28556, C11293.m28558(str));
        if (c7518 != null) {
            return new C18705(c7518, strM28556);
        }
        return null;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo20830(String str, boolean z) {
        String strM20187 = AbstractC7364.m20187(str);
        Collection<C7518> collectionValues = this.f61395.m38703(strM20187).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C7518 c7518 : collectionValues) {
            if (z || !c7518.f24835) {
                arrayList.add(new C18705(c7518, strM20187));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۧ */
    public final void mo35576(String str) {
        this.f61395.m38699(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC17432 m43929() throws IOException {
        C18178 c18178;
        EnumC16686 enumC16686M55425;
        while (true) {
            synchronized (this.f61392) {
                while (this.f61390 > 0) {
                    try {
                        this.f61392.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IOException("Interrupted while waiting for SMB connection refresh to finish", e);
                    }
                }
                c18178 = this.f61388;
                enumC16686M55425 = this.f61389.m55425();
            }
            if (enumC16686M55425 == EnumC16686.UNKNOWN) {
                C11465 c11465M55424 = this.f61389.m55424(new C6246(c18178), new C24146(this, c18178));
                if (c11465M55424.m28821()) {
                    continue;
                } else {
                    enumC16686M55425 = c11465M55424.m28822();
                }
            }
            if (m43940(c18178)) {
                C0279 c0279 = new C0279(c18178, enumC16686M55425);
                if (c0279.f1583 == EnumC16686.SMB1_ONLY) {
                    return m43933(c0279.f1582);
                }
                try {
                    return new C0060(c0279.f1582.f59411, m43931(c0279.f1582, c0279.f1583), new C14448(this, c0279.f1582, c0279.f1583));
                } catch (C7737 unused) {
                    continue;
                } catch (IOException e2) {
                    if (m43940(c0279.f1582)) {
                        throw e2;
                    }
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21162 m43934(C9973 c9973, boolean z) {
        C21162 c21162;
        synchronized (this.f61392) {
            C9973 c9974 = this.f61393;
            this.f61388.f59412 = true;
            this.f61393 = c9973;
            if (z) {
                this.f61390++;
            }
            this.f61388 = new C18178(c9973);
            this.f61389.m55426();
            this.f61392.notifyAll();
            c21162 = new C21162(c9974, z);
        }
        return c21162;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܰ */
    public final void mo35578() {
        C21162 c21162M43934;
        synchronized (this.f61392) {
            c21162M43934 = m43934(this.f61393, false);
        }
        final C9973 c9973 = c21162M43934.f67565;
        C5261.f18538.execute(new Runnable() { // from class: l.ۨ۟۫
            @Override // java.lang.Runnable
            public final void run() {
                int i = C18924.f61387;
                C4754.m14669(c9973);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43935(C21162 c21162) {
        if (c21162.f67564) {
            synchronized (this.f61392) {
                int i = this.f61390;
                if (i > 0) {
                    this.f61390 = i - 1;
                }
                this.f61392.notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0806 m43931(C18178 c18178, EnumC16686 enumC16686) throws IOException {
        EnumC2298 enumC2298;
        synchronized (this.f61392) {
            if (m43940(c18178)) {
                while (!c18178.f59412 && c18178 == this.f61388) {
                    if (this.f61390 != 0) {
                        try {
                            this.f61392.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Interrupted while waiting for SMB connection refresh to finish", e);
                        }
                    }
                }
                throw new C7737();
            }
            throw new C7737();
        }
        try {
            C9973 c9973 = c18178.f59411;
            int i = C4754.f16702;
            if (enumC16686 == EnumC16686.SMB2_ONLY) {
                enumC2298 = EnumC2298.SMB2_ONLY;
            } else if (enumC16686 == EnumC16686.SMB3_ONLY) {
                enumC2298 = EnumC2298.SMB3_ONLY;
            } else {
                throw new IllegalArgumentException("Unsupported SMBJ protocol state: " + enumC16686);
            }
            C0806 c0806M14656 = C4754.m14656(c9973, enumC2298, c18178.f59413, c18178.f59410);
            if (c18178.f59413 && !c0806M14656.m3244()) {
                c18178.f59413 = false;
            }
            if (c18178.f59410 && !c0806M14656.m3243()) {
                c18178.f59410 = false;
            }
            synchronized (this.f61392) {
                if (!m43940(c18178)) {
                    C4754.m14662(c0806M14656);
                    throw new C7737();
                }
                if (c0806M14656.m3243() && !c18178.f59410) {
                    c18178.f59410 = true;
                }
            }
            return c0806M14656;
        } catch (IOException e2) {
            synchronized (this.f61392) {
                if (!m43940(c18178)) {
                    throw new C7737();
                }
                if (c18178.f59410) {
                    c18178.f59410 = false;
                }
                throw e2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14754 m43933(C18178 c18178) {
        C14754 c14754;
        synchronized (this.f61392) {
            C14754 c14755 = this.f61391;
            if (c14755 == null || !c14755.m35438().equals(c18178.f59411)) {
                C9973 c9973 = c18178.f59411;
                InterfaceC23032 interfaceC23032M32345 = C12957.m32345(c9973.f32068, c9973.f32071, c9973.f32074);
                C9973 c9974 = c18178.f59411;
                String str = c9974.f32073;
                int i = c9974.f32072;
                StringBuilder sb = new StringBuilder("smb://");
                sb.append(str);
                if (i != 445) {
                    sb.append(':');
                    sb.append(i);
                }
                this.f61391 = new C14754(c18178.f59411, interfaceC23032M32345, sb.toString());
            }
            c14754 = this.f61391;
        }
        return c14754;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m43940(C18178 c18178) {
        return !c18178.f59412 && c18178 == this.f61388;
    }
}
