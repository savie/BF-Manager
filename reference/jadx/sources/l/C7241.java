package l;

import com.alipay.sdk.m.u0.b;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.۟ۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAPG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7241 extends AbstractC19942 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f24127;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5830 f24128;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f24129;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f24130;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19236 f24131;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC15709 f24132;

    @Override // l.AbstractC19942
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC19942 mo1388(String str, InterfaceC15456 interfaceC15456) {
        return this;
    }

    public C7241(Object obj, String str, String str2, C19236 c19236, EnumC15709 enumC15709) {
        Collection collectionM13617;
        C13465.m32966(obj, b.d);
        C13465.m32966(str, "tag");
        C13465.m32966(c19236, "logger");
        C13465.m32966(enumC15709, "verificationMode");
        this.f24129 = obj;
        this.f24127 = str;
        this.f24130 = str2;
        this.f24131 = c19236;
        this.f24132 = enumC15709;
        String strM45238 = AbstractC19942.m45238(obj, str2);
        C13465.m32966(strM45238, "message");
        C5830 c5830 = new C5830(strM45238);
        StackTraceElement[] stackTrace = c5830.getStackTrace();
        C13465.m32967(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(C2271.m6966(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collectionM13617 = C23238.f75405;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collectionM13617 = C1676.m5590(stackTrace);
            } else if (length == 1) {
                collectionM13617 = C4892.m13617(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i = length2 - length; i < length2; i++) {
                    arrayList.add(stackTrace[i]);
                }
                collectionM13617 = arrayList;
            }
        }
        Object[] array = collectionM13617.toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        c5830.setStackTrace((StackTraceElement[]) array);
        this.f24128 = c5830;
    }

    @Override // l.AbstractC19942
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1387() throws C5830 {
        int i = C10064.f34388[this.f24132.ordinal()];
        if (i == 1) {
            throw this.f24128;
        }
        if (i != 2) {
            if (i == 3) {
                return null;
            }
            throw new C22844();
        }
        String strM45238 = AbstractC19942.m45238(this.f24129, this.f24130);
        this.f24131.getClass();
        C13465.m32966(this.f24127, "tag");
        C13465.m32966(strM45238, "message");
        return null;
    }
}
