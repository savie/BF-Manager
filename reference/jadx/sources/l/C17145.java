package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: l.ܺ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6ASH */
/* JADX INFO: loaded from: classes4.dex */
public final class C17145 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25351 f55896;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC5037 f55897;

    public C17145(C25351 c25351, InterfaceC5037 interfaceC5037) {
        this.f55896 = c25351;
        this.f55897 = interfaceC5037;
    }

    public final String toString() {
        if (this.f55896.f81862 != null) {
            StringBuilder sb = new StringBuilder();
            ArrayList<C16399> arrayList = new ArrayList(this.f55896.f81860.keySet());
            Collections.sort(arrayList, new C11924());
            for (C16399 c16399 : arrayList) {
                C16399[] c16399Arr = c16399.f53216;
                int length = c16399Arr != null ? c16399Arr.length : 0;
                for (int i = 0; i < length; i++) {
                    C16399 c163910 = c16399.f53216[i];
                    if (c163910 != null && c163910.f53211 != Integer.MAX_VALUE) {
                        sb.append(m40286(c16399));
                        String strM50198 = ((C22191) this.f55897).m50198(i - 1);
                        sb.append("-");
                        sb.append(strM50198);
                        sb.append("->");
                        sb.append(m40286(c163910));
                        sb.append('\n');
                    }
                }
            }
            String string = sb.toString();
            if (string.length() != 0) {
                return string;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40286(C16399 c16399) {
        int i = c16399.f53211;
        StringBuilder sb = new StringBuilder();
        sb.append(c16399.f53212 ? ":" : "");
        sb.append(am.aB);
        sb.append(i);
        sb.append(c16399.f53213 ? "^" : "");
        String string = sb.toString();
        if (!c16399.f53212) {
            return string;
        }
        if (c16399.f53215 != null) {
            StringBuilder sbM10405 = C3188.m10405(string, "=>");
            sbM10405.append(Arrays.toString(c16399.f53215));
            return sbM10405.toString();
        }
        StringBuilder sbM10406 = C3188.m10405(string, "=>");
        sbM10406.append(c16399.f53214);
        return sbM10406.toString();
    }
}
