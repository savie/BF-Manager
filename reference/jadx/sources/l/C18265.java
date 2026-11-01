package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ᩳ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U7TB */
/* JADX INFO: loaded from: classes5.dex */
public final class C18265 implements InterfaceC5296 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f58287 = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // l.InterfaceC5296
    /* JADX INFO: renamed from: ۙ */
    public final C16854 mo14672(C1706 c1706) {
        C6707 c6707M5679 = c1706.m5679();
        c6707M5679.m18138();
        char cM18135 = c6707M5679.m18135();
        if (cM18135 == '\n') {
            c6707M5679.m18138();
            return new C16854(new C1021(), c6707M5679.m18139());
        }
        if (!f58287.matcher(String.valueOf(cM18135)).matches()) {
            return new C16854(new C17250("\\"), c6707M5679.m18139());
        }
        c6707M5679.m18138();
        return new C16854(new C17250(String.valueOf(cM18135)), c6707M5679.m18139());
    }
}
