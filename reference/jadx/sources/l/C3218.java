package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4VD */
/* JADX INFO: loaded from: classes2.dex */
public final class C3218 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C17388[] f10486 = new C17388[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedList f10487;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f10488;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC15896 f10489;

    public C3218(InterfaceC15896 interfaceC15896, C11421 c11421) {
        LinkedList linkedList = new LinkedList();
        this.f10487 = linkedList;
        linkedList.listIterator();
        this.f10489 = interfaceC15896;
        this.f10488 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17388[] m10562() {
        return (C17388[]) ((List) C1170.stream(this.f10487).map(new C22418(2, this)).filter(new C15165(3)).collect(C2025.toList())).toArray(f10486);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C17388 m10560(C3218 c3218, String str) {
        C17388 c17388Mo1715 = c3218.f10489.mo1715(str);
        return (c17388Mo1715 == null && c3218.f10488) ? new C17388(str) : c17388Mo1715;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10561(InputStream inputStream, String str) throws IOException {
        this.f10487 = new LinkedList();
        InterfaceC15896 interfaceC15896 = this.f10489;
        int i = C18046.f59088;
        Charset charsetDefaultCharset = Charset.defaultCharset();
        if (str != null) {
            charsetDefaultCharset = Charset.forName(str);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charsetDefaultCharset));
        try {
            for (String strMo19232 = interfaceC15896.mo19232(bufferedReader); strMo19232 != null; strMo19232 = interfaceC15896.mo19232(bufferedReader)) {
                this.f10487.add(strMo19232);
            }
            bufferedReader.close();
            interfaceC15896.mo1713(this.f10487);
            this.f10487.listIterator();
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
