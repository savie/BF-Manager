package l;

import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: l.֨᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N12S */
/* JADX INFO: loaded from: classes2.dex */
public final class C1333 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m4734(C11545 c11545, int i, String str) {
        return c11545.m28771(C16737.m39288(i) + "_" + new SimpleDateFormat("yyyyMMddHHmmss").format(Long.valueOf(System.currentTimeMillis())) + "." + str, true);
    }
}
