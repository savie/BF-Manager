package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.֫ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P4VD */
/* JADX INFO: loaded from: classes2.dex */
public final class C1912 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C11086[] f7257 = new C11086[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedList f7258;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f7259;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23786 f7260;

    public C1912(InterfaceC23786 interfaceC23786, C12497 c12497) {
        LinkedList linkedList = new LinkedList();
        this.f7258 = linkedList;
        linkedList.listIterator();
        this.f7260 = interfaceC23786;
        this.f7259 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11086[] m6225() {
        return (C11086[]) ((List) C9030.stream(this.f7258).map(new C21346(2, this)).filter(new C9350(1)).collect(C1890.toList())).toArray(f7257);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C11086 m6223(C1912 c1912, String str) {
        C11086 c11086Mo4881 = c1912.f7260.mo4881(str);
        return (c11086Mo4881 == null && c1912.f7259) ? new C11086(str) : c11086Mo4881;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6224(InputStream inputStream, String str) throws IOException {
        this.f7258 = new LinkedList();
        InterfaceC23786 interfaceC23786 = this.f7260;
        int i = C22832.f74282;
        Charset charsetDefaultCharset = Charset.defaultCharset();
        if (str != null) {
            charsetDefaultCharset = Charset.forName(str);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charsetDefaultCharset));
        try {
            for (String strMo35090 = interfaceC23786.mo35090(bufferedReader); strMo35090 != null; strMo35090 = interfaceC23786.mo35090(bufferedReader)) {
                this.f7258.add(strMo35090);
            }
            bufferedReader.close();
            interfaceC23786.mo4880(this.f7258);
            this.f7258.listIterator();
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
