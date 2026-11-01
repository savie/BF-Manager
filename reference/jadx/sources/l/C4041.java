package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۘܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4041 extends AbstractC4166 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f14937;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Pattern f14938;

    @Override // l.AbstractC4166
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2407(C0617 c0617, C0617 c0618) {
        String str = this.f14937;
        return c0618.mo28140(str) && this.f14938.matcher(c0618.mo28144(str)).find();
    }

    public final String toString() {
        return C0242.m1617("[", this.f14937, "~=", this.f14938.toString(), "]");
    }
}
