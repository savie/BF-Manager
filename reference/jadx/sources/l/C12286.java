package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫۠۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H6L4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12286 implements InterfaceC8446 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16519 f41085;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2455 f41086;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9464 f41087;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f41088;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41089;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41090;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f41091;

    public C12286(C9464 c9464, C2455 c2455, C16519 c16519, int i, int i2, String str, String str2) {
        this.f41087 = c9464;
        this.f41086 = c2455;
        this.f41085 = c16519;
        this.f41089 = i;
        this.f41090 = i2;
        this.f41088 = str;
        this.f41091 = str2;
    }

    @Override // l.InterfaceC8446
    /* JADX INFO: renamed from: ۙ */
    public final void mo22107(AbstractC20745 abstractC20745) {
        C9464 c9464 = this.f41087;
        C16519 c16519 = this.f41085;
        C2455 c2455 = this.f41086;
        try {
            C22918 c22918M50704 = C22918.m50704(abstractC20745);
            if (c2455 != null) {
                try {
                    c22918M50704.m50734(c2455.m7480());
                    if (c2455.m7482()) {
                        c22918M50704.m50718();
                    }
                } catch (Throwable th) {
                    try {
                        c22918M50704.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            for (C20752 c20752 : c16519.f53064) {
                C8758.m22720();
                C12107 c12107Clone = c20752.f67511;
                String str = c20752.f67512;
                if (!c12107Clone.getName().equals(str)) {
                    c12107Clone = c12107Clone.clone();
                    c12107Clone.m30128(str);
                }
                c22918M50704.m50729(c12107Clone, c2455, C9464.f32019);
                C8758.m22720();
            }
            for (C10169 c10169 : c16519.f53063) {
                C8758.m22720();
                Object obj = c10169.f34741;
                String str2 = c10169.f34740;
                C23575 c23575 = (C23575) obj;
                C3070 c3070M8504 = c9464.f32021.m8504();
                AbstractC20745 abstractC20746 = c23575.f76372;
                boolean z = c23575.f76370;
                c3070M8504.m9209(abstractC20746.mo33986());
                C5928 c5928M22717 = C8758.m22717(c9464.f32021, abstractC20746.mo33986(), z);
                C12107 c12107 = new C12107(str2);
                c12107.setTime(c23575.f76371);
                c12107.m30096(z ? 0L : c5928M22717.m16197());
                c22918M50704.m50733(this.f41089);
                c22918M50704.m50722(this.f41090);
                C12107 entry = c2455 == null ? null : c2455.getEntry(str2);
                if (entry != null) {
                    c22918M50704.m50733(entry.m30119());
                }
                c22918M50704.m50719(this.f41088);
                c22918M50704.m50727(c12107);
                if (!z) {
                    try {
                        C17224 c17224 = new C17224(abstractC20746.mo33970());
                        try {
                            OutputStream outputStreamM50720 = c22918M50704.m50720();
                            byte[] bArr = new byte[65536];
                            while (true) {
                                C8758.m22720();
                                int i = c17224.read(bArr);
                                if (i < 0) {
                                    try {
                                        break;
                                    } catch (C1701 e) {
                                        throw C9464.m24231(c10169.f34742, e, c10169.f34740);
                                    }
                                } else if (i != 0) {
                                    outputStreamM50720.write(bArr, 0, i);
                                }
                            }
                            c17224.close();
                        } catch (Throwable th3) {
                            try {
                                c17224.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (IOException e2) {
                        throw new C1701(e2.getMessage(), e2);
                    }
                }
                c22918M50704.m50730();
            }
            c22918M50704.close();
            if (c2455 != null) {
                c2455.close();
            }
        } catch (Throwable th5) {
            if (c2455 != null) {
                try {
                    c2455.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    @Override // l.InterfaceC8446
    /* JADX INFO: renamed from: ۙ */
    public final void mo22106(C3070 c3070) throws C12731 {
        C8758.m22720();
        if (this.f41086 != null) {
            c3070.m9209(this.f41091);
        }
        Iterator it = this.f41085.f53063.iterator();
        while (it.hasNext()) {
            c3070.m9209(((C23575) ((C10169) it.next()).f34741).f76372.mo33986());
        }
    }
}
