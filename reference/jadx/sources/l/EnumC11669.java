package l;

/* JADX INFO: renamed from: l.ۨۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Z75W */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC11669 {
    NONE,
    EXACT,
    TREE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC11669 m29115(boolean z) {
        return z ? TREE : EXACT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m29117(String str) {
        int i = C13786.f45516[ordinal()];
        if (i == 1) {
            C22252.m49404(str);
        } else {
            if (i != 2) {
                return;
            }
            C22252.m49410(str);
        }
    }
}
