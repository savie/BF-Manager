package l;

import com.umeng.commonsdk.debug.UMLogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ᩳ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0CMQ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17745 implements InterfaceC7359, InterfaceC11955, InterfaceC3183, InterfaceC3740 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56308;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static double m41305(double d, double d2, double d3, double d4) {
        return ((d * d2) + d3) / d4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41309(StringBuilder sb, String str) {
        sb.append(UMLogUtils.makeUrl(str));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41311(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getSimpleName());
        sb.append(str);
    }

    @Override // l.InterfaceC3183
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1619(String str) {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m41308(ArrayList arrayList, int i) {
        return arrayList.remove(arrayList.size() - i);
    }

    @Override // l.InterfaceC11955
    public Object apply(Object obj) {
        C17513 c17513 = (C17513) obj;
        switch (this.f56308) {
            case 5:
                return Long.valueOf(c17513.f55688);
            default:
                long j = c17513.f55685;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
        }
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m41306(InterfaceC16088 interfaceC16088, String str, C20321 c20321, C20321 c20322, boolean z, boolean z2) {
        if (z2) {
            return 1;
        }
        if (interfaceC16088.mo11428()) {
            interfaceC16088.mo11424(str, c20321, c20322, z);
        }
        return interfaceC16088.mo11431();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m41312() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41310() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m41307(Collection collection) {
        return collection instanceof InterfaceC18451 ? ((InterfaceC18451) collection).m42801() : collection.size();
    }

    @Override // l.InterfaceC3740
    /* JADX INFO: renamed from: ܰ */
    public Object mo1620() {
        return new LinkedHashSet();
    }
}
