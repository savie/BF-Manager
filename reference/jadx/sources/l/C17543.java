package l;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܿ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: N9ZJ */
/* JADX INFO: loaded from: classes.dex */
public class C17543 extends AbstractC12233 implements InterfaceC11362 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f55759 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16112 f55760;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC6006 f55761;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile C6254 f55762;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f55763;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile C0609 f55764;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23189 f55765;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18062 f55766;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Object f55767;

    static {
        ApplicationC6132.m17119(140);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private native void m40809();

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo10259() {
        return false;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo10271() {
        return true;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܰ */
    public final void mo10274(C11018 c11018) {
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo10277() {
        return false;
    }

    public C17543(int i, AbstractC12068 abstractC12068) {
        super(i, abstractC12068);
        this.f55767 = new Object();
        this.f55765 = new C23189();
        this.f55761 = new C19661();
        this.f55766 = new C18062(new C21071(this), true);
        this.f55762 = C6254.m17321(i, abstractC12068);
        this.f55764 = new C0609(this.f55762);
        m40809();
    }

    public C17543(int i, AbstractC12068 abstractC12068, C17367 c17367) {
        this(i, abstractC12068);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ */
    public final void mo10266(AbstractC12068 abstractC12068) {
        super.mo10266(abstractC12068);
        C6254 c6254M17321 = C6254.m17321(this.f40872, abstractC12068);
        if (this.f55762.equals(c6254M17321)) {
            return;
        }
        C4843.m13446(m40814(c6254M17321, false).f65960);
        this.f55766.m42059();
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩳ */
    public final String mo10276() {
        return this.f55762.f21214;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩸ */
    public final String mo10279() {
        return this.f55762.f21214;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۨ */
    public final void mo30344(long j, String str) {
        m40817().mo38151(j, str);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩷ */
    public final String mo10278() {
        return TextUtils.isEmpty(this.f55762.f21213) ? "/" : AbstractC11462.m28608(this.f55762.f21213);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo10267(boolean z) {
        C20366 c20366M40814;
        this.f55766.m42059();
        if (z) {
            synchronized (this.f55767) {
                c20366M40814 = m40814(this.f55762, true);
            }
            try {
                C4843.m13446(c20366M40814.f65960);
            } finally {
                m40815(c20366M40814);
            }
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC10033 mo30351(String str) {
        return m40817().mo38154(str);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo10262(long j, String str) {
        return m40817().mo38153(j, str);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo30341(String str, long j, long j2) {
        return m40817().mo38145(str, j, j2);
    }

    @Override // l.InterfaceC11362
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo28468(String str, long j, long j2, C6422 c6422) throws IOException {
        InterfaceC21777 interfaceC21777M40817 = m40817();
        if (interfaceC21777M40817 instanceof InterfaceC11362) {
            return ((InterfaceC11362) interfaceC21777M40817).mo28468(str, j, j2, c6422);
        }
        return interfaceC21777M40817.mo38145(str, j, j2);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܰ */
    public final OutputStream mo10273(long j, String str) {
        return m40817().mo38146(j, str);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۨ */
    public final void mo10270(String str, boolean z) {
        m40817().mo38150(str, z);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ */
    public final void mo10265(String str, String str2) {
        m40817().mo38149(str, str2);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۚ */
    public final void mo10268(String str) {
        m40817().mo38152(str);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo10272(String str) {
        return this.f55766.m42062(str);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo10261(String str) {
        C18062 c18062 = this.f55766;
        c18062.getClass();
        return c18062.m42058(C6730.m18172(str), C6730.m18175(str)) != null;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ֨ */
    public final String mo10260(String str) {
        return this.f55766.m42063(str);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2557 mo10264(String str) {
        String strM18172 = C6730.m18172(str);
        C12275 c12275 = (C12275) this.f55766.m42058(strM18172, C6730.m18175(str));
        if (c12275 != null) {
            return new C17213(c12275, strM18172);
        }
        return null;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo10263(String str, boolean z) {
        String strM28608 = AbstractC11462.m28608(str);
        Collection<C12275> collectionValues = this.f55766.m42057(strM28608).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C12275 c12275 : collectionValues) {
            if (z || !c12275.f41048) {
                arrayList.add(new C17213(c12275, strM28608));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۜ */
    public final void mo10269(String str) {
        this.f55766.m42060(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC21777 m40817() throws IOException {
        C0609 c0609;
        EnumC15428 enumC15428M51216;
        while (true) {
            synchronized (this.f55767) {
                while (this.f55763 > 0) {
                    try {
                        try {
                            this.f55767.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Interrupted while waiting for SMB connection refresh to finish", e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0609 = this.f55764;
                enumC15428M51216 = this.f55765.m51216();
            }
            if (enumC15428M51216 == EnumC15428.UNKNOWN) {
                C6960 c6960M51215 = this.f55765.m51215(new C10489(c0609), new C7666(this, c0609));
                if (c6960M51215.m18710()) {
                    continue;
                } else {
                    enumC15428M51216 = c6960M51215.m18711();
                }
            }
            if (m40820(c0609)) {
                C16838 c16838 = new C16838(c0609, enumC15428M51216);
                if (c16838.f53878 == EnumC15428.SMB1_ONLY) {
                    return m40813(c16838.f53877);
                }
                try {
                    return new C16508(c16838.f53877.f2623, m40811(c16838.f53877, c16838.f53878), new C16133(this, c16838.f53877, c16838.f53878));
                } catch (C12605 unused) {
                    continue;
                } catch (IOException e2) {
                    if (m40820(c16838.f53877)) {
                        throw e2;
                    }
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20366 m40814(C6254 c6254, boolean z) {
        C20366 c20366;
        synchronized (this.f55767) {
            C6254 c6255 = this.f55762;
            this.f55764.f2624 = true;
            this.f55762 = c6254;
            if (z) {
                this.f55763++;
            }
            this.f55764 = new C0609(c6254);
            this.f55765.m51217();
            this.f55767.notifyAll();
            c20366 = new C20366(c6255, z);
        }
        return c20366;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܺ */
    public final void mo10275() {
        C20366 c20366M40814;
        synchronized (this.f55767) {
            c20366M40814 = m40814(this.f55762, false);
        }
        final C6254 c6254 = c20366M40814.f65960;
        C4716.f16635.execute(new Runnable() { // from class: l.ۡ᩵֨
            @Override // java.lang.Runnable
            public final void run() {
                int i = C17543.f55759;
                C4843.m13446(c6254);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40815(C20366 c20366) {
        if (c20366.f65959) {
            synchronized (this.f55767) {
                int i = this.f55763;
                if (i > 0) {
                    this.f55763 = i - 1;
                }
                this.f55767.notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10864 m40811(C0609 c0609, EnumC15428 enumC15428) throws IOException {
        EnumC14392 enumC14392;
        synchronized (this.f55767) {
            if (m40820(c0609)) {
                while (!c0609.f2624 && c0609 == this.f55764) {
                    if (this.f55763 != 0) {
                        try {
                            this.f55767.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Interrupted while waiting for SMB connection refresh to finish", e);
                        }
                    }
                }
                throw new C12605();
            }
            throw new C12605();
        }
        try {
            C6254 c6254 = c0609.f2623;
            int i = C4843.f17015;
            if (enumC15428 == EnumC15428.SMB2_ONLY) {
                enumC14392 = EnumC14392.SMB2_ONLY;
            } else if (enumC15428 == EnumC15428.SMB3_ONLY) {
                enumC14392 = EnumC14392.SMB3_ONLY;
            } else {
                throw new IllegalArgumentException("Unsupported SMBJ protocol state: " + enumC15428);
            }
            C10864 c10864M13434 = C4843.m13434(c6254, enumC14392, c0609.f2621, c0609.f2622);
            if (c0609.f2621 && !c10864M13434.m27219()) {
                c0609.f2621 = false;
            }
            if (c0609.f2622 && !c10864M13434.m27218()) {
                c0609.f2622 = false;
            }
            synchronized (this.f55767) {
                if (!m40820(c0609)) {
                    C4843.m13442(c10864M13434);
                    throw new C12605();
                }
                if (c10864M13434.m27218() && !c0609.f2622) {
                    c0609.f2622 = true;
                }
            }
            return c10864M13434;
        } catch (IOException e2) {
            synchronized (this.f55767) {
                if (!m40820(c0609)) {
                    throw new C12605();
                }
                if (c0609.f2622) {
                    c0609.f2622 = false;
                }
                throw e2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C16112 m40813(C0609 c0609) {
        C16112 c16112;
        synchronized (this.f55767) {
            C16112 c16113 = this.f55760;
            if (c16113 == null || !c16113.m38148().equals(c0609.f2623)) {
                C6254 c6254 = c0609.f2623;
                InterfaceC19067 interfaceC19067M4695 = C1315.m4695(c6254.f21211, c6254.f21215, c6254.f21210);
                C6254 c6255 = c0609.f2623;
                String str = c6255.f21214;
                int i = c6255.f21212;
                StringBuilder sb = new StringBuilder("smb://");
                sb.append(str);
                if (i != 445) {
                    sb.append(':');
                    sb.append(i);
                }
                this.f55760 = new C16112(c0609.f2623, interfaceC19067M4695, sb.toString());
            }
            c16112 = this.f55760;
        }
        return c16112;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m40820(C0609 c0609) {
        return !c0609.f2624 && c0609 == this.f55764;
    }
}
