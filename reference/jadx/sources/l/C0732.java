package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֡᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 24FJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0732 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f2664 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5816 f2665;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char f2666;

    public C0732(C5816 c5816) {
        this.f2665 = c5816;
        this.f2666 = (char) c5816.f19998;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18631 m3056() {
        if (this.f2664.isEmpty()) {
            return null;
        }
        return (C18631) C7750.m21093(1, this.f2664);
    }

    public final String toString() {
        if (this.f2664 == null) {
            return "empty local var";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2665);
        sb.append(" in register ");
        sb.append((int) this.f2666);
        sb.append(" \n");
        for (C18631 c18631 : this.f2664) {
            sb.append(" starts at pc=");
            sb.append(Integer.toString(c18631.f60555));
            sb.append(" length=");
            sb.append(Integer.toString(c18631.f60554));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3055() {
        return (this.f2664.isEmpty() || m3056().f60555 == 65535) ? false : true;
    }
}
