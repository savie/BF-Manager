package l;

import java.io.IOException;
import java.lang.reflect.Executable;
import java.util.HashMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;

/* JADX INFO: renamed from: l.ۧ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11958 implements InterfaceC5417, InterfaceC19795, InterfaceC16643, InterfaceC4501 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m29929(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m29931() {
        return Executable.class;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29932(IOException iOException, StringBuilder sb) {
        sb.append(iOException.getMessage());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29933(int i, int i2, ASN1ObjectIdentifier aSN1ObjectIdentifier, HashMap map, Integer num) {
        map.put(num, new XMSSMTParameters(i, i2, aSN1ObjectIdentifier));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29934(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }

    @Override // l.InterfaceC4501
    /* JADX INFO: renamed from: ۙ */
    public int mo12193(String str, boolean z) {
        return z ? 2 : 1;
    }

    @Override // l.InterfaceC5417
    public Object apply(Object obj) {
        return ((InterfaceC22486) obj).mo2296().getClass().getSimpleName();
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    @Override // l.InterfaceC16643
    /* JADX INFO: renamed from: ۙ */
    public String mo16881(String str) {
        try {
            InterfaceC16318[] interfaceC16318ArrM33890 = ((RunnableC13904) C10351.m26627().mo2872()).m33890(str);
            if (interfaceC16318ArrM33890.length > 0) {
                return interfaceC16318ArrM33890[0].mo28044();
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }
}
