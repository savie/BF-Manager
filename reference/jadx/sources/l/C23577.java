package l;

import com.alipay.sdk.m.p.a;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes.dex */
public final class C23577 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f76375;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f76376 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f76377 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC8054 f76378;

    public C23577(EnumC8054 enumC8054, String str) {
        this.f76378 = null;
        this.f76375 = null;
        this.f76378 = enumC8054 == null ? EnumC8054.DESCENDANT : enumC8054;
        this.f76375 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52005(String str, EnumC21459 enumC21459, String str2) {
        if (this.f76376 == null) {
            this.f76376 = new ArrayList();
        }
        this.f76376.add(new C15110(str, enumC21459, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        EnumC8054 enumC8054 = EnumC8054.CHILD;
        EnumC8054 enumC8055 = this.f76378;
        if (enumC8055 == enumC8054) {
            sb.append("> ");
        } else if (enumC8055 == EnumC8054.FOLLOWS) {
            sb.append("+ ");
        }
        String str = this.f76375;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList<C15110> arrayList = this.f76376;
        if (arrayList != null) {
            for (C15110 c15110 : arrayList) {
                sb.append('[');
                String str2 = c15110.f49346;
                String str3 = c15110.f49347;
                sb.append(str2);
                int iOrdinal = c15110.f49348.ordinal();
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
        ArrayList<InterfaceC8760> arrayList2 = this.f76377;
        if (arrayList2 != null) {
            for (InterfaceC8760 interfaceC8760 : arrayList2) {
                sb.append(':');
                sb.append(interfaceC8760);
            }
        }
        return sb.toString();
    }
}
