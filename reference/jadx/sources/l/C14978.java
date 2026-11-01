package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۘ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 24FJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14978 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f48886 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6263 f48887;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char f48888;

    public C14978(C6263 c6263) {
        this.f48887 = c6263;
        this.f48888 = (char) c6263.f21228;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22739 m35955() {
        if (this.f48886.isEmpty()) {
            return null;
        }
        return (C22739) C3012.m8974(1, this.f48886);
    }

    public final String toString() {
        if (this.f48886 == null) {
            return "empty local var";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f48887);
        sb.append(" in register ");
        sb.append((int) this.f48888);
        sb.append(" \n");
        for (C22739 c22739 : this.f48886) {
            sb.append(" starts at pc=");
            sb.append(Integer.toString(c22739.f74074));
            sb.append(" length=");
            sb.append(Integer.toString(c22739.f74073));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35954() {
        return (this.f48886.isEmpty() || m35955().f74074 == 65535) ? false : true;
    }
}
