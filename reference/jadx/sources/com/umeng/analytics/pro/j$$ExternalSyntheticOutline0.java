package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMLogUtils;
import java.util.ArrayList;
import l.C1896;
import l.EnumC15914;
import l.EnumC19644;
import l.InterfaceC19795;
import l.InterfaceC19992;
import l.InterfaceC20390;

/* JADX INFO: compiled from: MATU */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j$$ExternalSyntheticOutline0 implements InterfaceC19795, InterfaceC20390 {
    public static String m(StringBuilder sb, String str) {
        sb.append(UMLogUtils.makeUrl(str));
        return sb.toString();
    }

    public static void m(int i, String str) {
        C1896.m6517(str + i);
    }

    @Override // l.InterfaceC20390
    public String apply(EnumC19644 enumC19644, String str, String str2) {
        return EnumC15914.m37946(enumC19644, str, str2);
    }

    public static Object m(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }
}
