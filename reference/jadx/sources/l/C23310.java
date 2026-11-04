package l;

import com.alipay.sdk.m.u0.b;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩹ۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAPG */
/* JADX INFO: loaded from: classes.dex */
public final class C23310 extends AbstractC12121 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21072 f75510;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f75511;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC20326 f75512;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object f75513;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16596 f75514;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f75515;

    @Override // l.AbstractC12121
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12121 mo17753(String str, InterfaceC3071 interfaceC3071) {
        return this;
    }

    public C23310(Object obj, String str, String str2, C16596 c16596, EnumC20326 enumC20326) {
        Collection collectionAsList;
        C15243.m36590(obj, b.d);
        C15243.m36590(str, "tag");
        C15243.m36590(c16596, "logger");
        C15243.m36590(enumC20326, "verificationMode");
        this.f75513 = obj;
        this.f75515 = str;
        this.f75511 = str2;
        this.f75514 = c16596;
        this.f75512 = enumC20326;
        String strM30289 = AbstractC12121.m30289(obj, str2);
        C15243.m36590(strM30289, "message");
        C21072 c21072 = new C21072(strM30289);
        StackTraceElement[] stackTrace = c21072.getStackTrace();
        C15243.m36591(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(C14442.m34864(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collectionAsList = C22242.f71645;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collectionAsList = C21168.m48275(stackTrace);
            } else if (length == 1) {
                collectionAsList = C7743.m21087(stackTrace[length2 - 1]);
            } else {
                collectionAsList = Arrays.asList(C21168.m48278(length2 - length, length2, stackTrace));
                C15243.m36591(collectionAsList, "asList(...)");
            }
        }
        Object[] array = collectionAsList.toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        c21072.setStackTrace((StackTraceElement[]) array);
        this.f75510 = c21072;
    }

    @Override // l.AbstractC12121
    /* JADX INFO: renamed from: ۙ */
    public final Object mo17752() throws C21072 {
        int i = C15850.f51547[this.f75512.ordinal()];
        if (i == 1) {
            throw this.f75510;
        }
        if (i != 2) {
            if (i == 3) {
                return null;
            }
            throw new C4760();
        }
        String strM30289 = AbstractC12121.m30289(this.f75513, this.f75511);
        this.f75514.getClass();
        C15243.m36590(this.f75515, "tag");
        C15243.m36590(strM30289, "message");
        return null;
    }
}
