package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܰܿ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y89V */
/* JADX INFO: loaded from: classes5.dex */
public final class C14754 implements InterfaceC17432 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23032 f48167;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f48168;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9973 f48169;

    public C14754(C9973 c9973, InterfaceC23032 interfaceC23032, String str) {
        this.f48169 = c9973;
        this.f48167 = interfaceC23032;
        this.f48168 = str;
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo1019(String str, long j, long j2) {
        return mo1027(j, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9973 m35438() {
        return this.f48169;
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ۙ */
    public final List mo1022(String str) {
        ArrayList arrayList = new ArrayList();
        C12523 c12523 = this.f48167.get(this.f48168 + str);
        try {
            InterfaceC13335 interfaceC13335M31090 = c12523.m31090();
            while (interfaceC13335M31090.hasNext()) {
                try {
                    arrayList.add(new C7518((InterfaceC12589) interfaceC13335M31090.next()));
                } catch (Throwable th) {
                    try {
                        interfaceC13335M31090.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            interfaceC13335M31090.close();
            if (str.length() == 1) {
                C1170.removeIf(arrayList, new C17547(1));
            }
            arrayList.trimToSize();
            c12523.close();
            return arrayList;
        } catch (Throwable th3) {
            try {
                c12523.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ۤ */
    public final void mo1025(long j, String str) throws C20728 {
        this.f48167.get(m35437(str)).m31092(j, j, j);
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1024(String str, boolean z) throws C20728 {
        this.f48167.get(m35437(str)).delete();
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1023(String str, String str2) throws C20728 {
        String strM35437 = m35437(str);
        InterfaceC23032 interfaceC23032 = this.f48167;
        interfaceC23032.get(strM35437).m31095(interfaceC23032.get(m35437(str2)));
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ۤ */
    public final void mo1026(String str) throws C20728 {
        this.f48167.get(m35437(str)).m31097();
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24277 mo1028(String str) {
        return new C24452(new C19236(this.f48167.get(m35437(str))));
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ᩷ */
    public final InputStream mo1027(long j, String str) throws IOException {
        C24458 c24458 = new C24458(this.f48167.get(m35437(str)));
        if (j > 0 && c24458.skip(j) != j) {
            C20244.m46520(c24458);
            throw new IOException("SmbFileInputStream skip failed");
        }
        return new C4314(c24458);
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ۙ */
    public final OutputStream mo1021(long j, String str) {
        return new C4320(this.f48167.get(m35437(str)));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private String m35437(String str) {
        boolean zStartsWith = str.startsWith("/");
        String str2 = this.f48168;
        return zStartsWith ? C14483.m34972(str2, str) : C20196.m46451(str2, "/", str);
    }
}
