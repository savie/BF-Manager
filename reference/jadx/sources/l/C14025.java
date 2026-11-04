package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6L4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14025 implements InterfaceC17733 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13017 f44433;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44434;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7314 f44435;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f44436;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f44437;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44438;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22941 f44439;

    public C14025(C13017 c13017, C22941 c22941, C7314 c7314, int i, int i2, String str, String str2) {
        this.f44433 = c13017;
        this.f44439 = c22941;
        this.f44435 = c7314;
        this.f44434 = i;
        this.f44438 = i2;
        this.f44437 = str;
        this.f44436 = str2;
    }

    @Override // l.InterfaceC17733
    /* JADX INFO: renamed from: ۙ */
    public final void mo29627(AbstractC22044 abstractC22044) {
        C13017 c13017 = this.f44433;
        C7314 c7314 = this.f44435;
        C22941 c22941 = this.f44439;
        try {
            C25179 c25179M56102 = C25179.m56102(abstractC22044);
            if (c22941 != null) {
                try {
                    c25179M56102.m56136(c22941.m51732());
                    if (c22941.m51736()) {
                        c25179M56102.m56130();
                    }
                } catch (Throwable th) {
                    try {
                        c25179M56102.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            for (C1348 c1348 : c7314.f24091) {
                C8060.m21953();
                C8002 c8002Clone = c1348.f4814;
                String str = c1348.f4815;
                if (!c8002Clone.getName().equals(str)) {
                    c8002Clone = c8002Clone.clone();
                    c8002Clone.m21851(str);
                }
                c25179M56102.m56127(c8002Clone, c22941, C13017.f41685);
                C8060.m21953();
            }
            for (C19247 c19247 : c7314.f24090) {
                C8060.m21953();
                Object obj = c19247.f62267;
                String str2 = c19247.f62266;
                C22714 c22714 = (C22714) obj;
                C9113 c9113M50227 = c13017.f41687.m50227();
                AbstractC22044 abstractC22045 = c22714.f73712;
                boolean z = c22714.f73710;
                c9113M50227.m24268(abstractC22045.mo4294());
                C1907 c1907M21950 = C8060.m21950(c13017.f41687, abstractC22045.mo4294(), z);
                C8002 c8002 = new C8002(str2);
                c8002.setTime(c22714.f73711);
                c8002.m21854(z ? 0L : c1907M21950.m6566());
                c25179M56102.m56135(this.f44434);
                c25179M56102.m56121(this.f44438);
                C8002 entry = c22941 == null ? null : c22941.getEntry(str2);
                if (entry != null) {
                    c25179M56102.m56135(entry.m21826());
                }
                c25179M56102.m56139(this.f44437);
                c25179M56102.m56125(c8002);
                if (!z) {
                    try {
                        C4814 c4814 = new C4814(abstractC22045.mo4290());
                        try {
                            OutputStream outputStreamM56119 = c25179M56102.m56119();
                            byte[] bArr = new byte[65536];
                            while (true) {
                                C8060.m21953();
                                int i = c4814.read(bArr);
                                if (i < 0) {
                                    try {
                                        break;
                                    } catch (C15254 e) {
                                        throw C13017.m32440(c19247.f62268, e, c19247.f62266);
                                    }
                                } else if (i != 0) {
                                    outputStreamM56119.write(bArr, 0, i);
                                }
                            }
                            c4814.close();
                        } catch (Throwable th3) {
                            try {
                                c4814.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (IOException e2) {
                        throw new C15254(e2.getMessage(), e2);
                    }
                }
                c25179M56102.m56134();
            }
            c25179M56102.close();
            if (c22941 != null) {
                c22941.close();
            }
        } catch (Throwable th5) {
            if (c22941 != null) {
                try {
                    c22941.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    @Override // l.InterfaceC17733
    /* JADX INFO: renamed from: ۙ */
    public final void mo29626(C9113 c9113) throws C10186 {
        C8060.m21953();
        if (this.f44439 != null) {
            c9113.m24268(this.f44436);
        }
        Iterator it = this.f44435.f24090.iterator();
        while (it.hasNext()) {
            c9113.m24268(((C22714) ((C19247) it.next()).f62267).f73712.mo4294());
        }
    }
}
