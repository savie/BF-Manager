package l;

/* JADX INFO: renamed from: l.ۖܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2630 extends AbstractC4166 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f10257;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f10258;

    public AbstractC2630(String str, String str2, boolean z) {
        C5557.m15342(str);
        C5557.m15342(str2);
        this.f10257 = C1323.m4723(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? C20630.m46498(1, 1, str2) : str2;
        String strM4722 = (!z && z2) ? C1323.m4722(str2) : C1323.m4723(str2);
        this.f10258 = strM4722;
    }
}
