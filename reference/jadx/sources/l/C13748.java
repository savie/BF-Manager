package l;

import com.alipay.sdk.m.p.a;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes4.dex */
public final class C13748 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f43621 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f43622 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC24192 f43623;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f43624;

    public C13748(EnumC24192 enumC24192, String str) {
        this.f43623 = null;
        this.f43624 = null;
        this.f43623 = enumC24192 == null ? EnumC24192.DESCENDANT : enumC24192;
        this.f43624 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33593(String str, EnumC20462 enumC20462, String str2) {
        if (this.f43621 == null) {
            this.f43621 = new ArrayList();
        }
        this.f43621.add(new C3308(str, enumC20462, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        EnumC24192 enumC24192 = EnumC24192.CHILD;
        EnumC24192 enumC24193 = this.f43623;
        if (enumC24193 == enumC24192) {
            sb.append("> ");
        } else if (enumC24193 == EnumC24192.FOLLOWS) {
            sb.append("+ ");
        }
        String str = this.f43624;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList<C3308> arrayList = this.f43621;
        if (arrayList != null) {
            for (C3308 c3308 : arrayList) {
                sb.append('[');
                String str2 = c3308.f10813;
                String str3 = c3308.f10814;
                sb.append(str2);
                int iOrdinal = c3308.f10815.ordinal();
                if (iOrdinal == 1) {
                    sb.append(a.h);
                    sb.append(str3);
                } else if (iOrdinal == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (iOrdinal == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList<InterfaceC14494> arrayList2 = this.f43622;
        if (arrayList2 != null) {
            for (InterfaceC14494 interfaceC14494 : arrayList2) {
                sb.append(':');
                sb.append(interfaceC14494);
            }
        }
        return sb.toString();
    }
}
