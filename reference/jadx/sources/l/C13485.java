package l;

import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: l.۬֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N12S */
/* JADX INFO: loaded from: classes4.dex */
public final class C13485 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m33163(C8614 c8614, int i, String str) {
        return c8614.m23170(C21576.m49088(i) + "_" + new SimpleDateFormat("yyyyMMddHHmmss").format(Long.valueOf(System.currentTimeMillis())) + "." + str, true);
    }
}
