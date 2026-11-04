package l;

import com.alipay.sdk.m.w.a;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Comparator;

/* JADX INFO: renamed from: l.۬ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BPK */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14017 implements InterfaceC19795, InterfaceC5417 {
    @Override // l.InterfaceC5417
    public Object apply(Object obj) {
        return (C19215) obj;
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34137(Throwable th) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th.printStackTrace(new PrintStream((OutputStream) byteArrayOutputStream, true, a.D));
            return byteArrayOutputStream.toString(a.D);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Comparator m34138(InterfaceC4544 interfaceC4544, Comparator comparator) {
        return comparator instanceof InterfaceC4544 ? interfaceC4544.mo14285((InterfaceC4544) comparator) : C2661.$default$thenComparing(interfaceC4544, comparator);
    }
}
