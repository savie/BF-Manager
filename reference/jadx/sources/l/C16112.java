package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y89V */
/* JADX INFO: loaded from: classes4.dex */
public final class C16112 implements InterfaceC21777 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f52092;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19067 f52093;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6254 f52094;

    public C16112(C6254 c6254, InterfaceC19067 interfaceC19067, String str) {
        this.f52094 = c6254;
        this.f52093 = interfaceC19067;
        this.f52092 = str;
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream mo38145(String str, long j, long j2) {
        return mo38153(j, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6254 m38148() {
        return this.f52094;
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List mo38147(String str) {
        ArrayList arrayList = new ArrayList();
        C17241 c17241 = this.f52093.get(this.f52092 + str);
        try {
            InterfaceC9190 interfaceC9190M40195 = c17241.m40195();
            while (interfaceC9190M40195.hasNext()) {
                try {
                    arrayList.add(new C12275((InterfaceC11306) interfaceC9190M40195.next()));
                } catch (Throwable th) {
                    try {
                        interfaceC9190M40195.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            interfaceC9190M40195.close();
            if (str.length() == 1) {
                C9030.removeIf(arrayList, new C5269(1));
            }
            arrayList.trimToSize();
            c17241.close();
            return arrayList;
        } catch (Throwable th3) {
            try {
                c17241.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo38151(long j, String str) throws C12303 {
        this.f52093.get(m38144(str)).m40197(j, j, j);
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo38150(String str, boolean z) throws C12303 {
        this.f52093.get(m38144(str)).delete();
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo38149(String str, String str2) throws C12303 {
        String strM38144 = m38144(str);
        InterfaceC19067 interfaceC19067 = this.f52093;
        interfaceC19067.get(strM38144).m40199(interfaceC19067.get(m38144(str2)));
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo38152(String str) throws C12303 {
        this.f52093.get(m38144(str)).m40202();
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10033 mo38154(String str) {
        return new C7645(new C13755(this.f52093.get(m38144(str))));
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InputStream mo38153(long j, String str) throws IOException {
        C10892 c10892 = new C10892(this.f52093.get(m38144(str)));
        if (j > 0 && c10892.skip(j) != j) {
            C19431.m44468(c10892);
            throw new IOException("SmbFileInputStream skip failed");
        }
        return new C21050(c10892);
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OutputStream mo38146(long j, String str) {
        return new C23592(this.f52093.get(m38144(str)));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private String m38144(String str) {
        boolean zStartsWith = str.startsWith("/");
        String str2 = this.f52092;
        return zStartsWith ? C15489.m37076(str2, str) : C1679.m5594(str2, "/", str);
    }
}
