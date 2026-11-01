package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J5JL */
/* JADX INFO: loaded from: classes5.dex */
public final class C21690 implements InterfaceC18993 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f70368;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f70369;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9449 f70370;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f70371;

    @Override // l.InterfaceC18993
    /* JADX INFO: renamed from: ۙ */
    public final C13930 mo21702(String str, EnumC11959 enumC11959) {
        if (this.f70371 == null) {
            this.f70371 = new ArrayList(5);
        }
        C13930 c13930 = new C13930(str, enumC11959);
        this.f70371.add(c13930);
        return c13930;
    }
}
