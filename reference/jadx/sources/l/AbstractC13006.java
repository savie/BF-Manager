package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۫ۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AWR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13006 implements InterfaceC22703, Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f41669;

    public AbstractC13006(int i) {
        this.f41669 = i;
    }

    @Override // l.InterfaceC22703
    /* JADX INFO: renamed from: ۤ */
    public final int mo2104() {
        return this.f41669;
    }

    public final String toString() {
        String strM39512 = C16735.m39512(this);
        C15243.m36591(strM39512, "renderLambdaToString(...)");
        return strM39512;
    }
}
