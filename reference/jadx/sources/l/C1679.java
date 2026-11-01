package l;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: renamed from: l.֫۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1679 implements InterfaceC7359, InterfaceC11955 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5594(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ List m5595(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int iM51269 = 0;
        while (iM51269 < length) {
            Object obj = objArr[iM51269];
            iM51269 = C23234.m51269(obj, arrayList, obj, iM51269, 1);
        }
        return C0561.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ASN1ObjectIdentifier m5596(String str) {
        return new ASN1ObjectIdentifier(str).intern();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5597(InterfaceC6025 interfaceC6025, String str, boolean z) {
        interfaceC6025.edit().putBoolean(str, z).apply();
    }

    @Override // l.InterfaceC11955
    public Object apply(Object obj) {
        return C22304.m49467((InterfaceC18735) obj, true);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }
}
