package l;

/* JADX INFO: renamed from: l.᩺ۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24207 extends AbstractC0078 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f78447;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f78448;

    public AbstractC24207(String str, String str2, boolean z) {
        C14838.m35755(str);
        C14838.m35755(str2);
        this.f78447 = C15300.m36733(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? C1402.m5124(1, 1, str2) : str2;
        String strM36731 = (!z && z2) ? C15300.m36731(str2) : C15300.m36733(str2);
        this.f78448 = strM36731;
    }
}
