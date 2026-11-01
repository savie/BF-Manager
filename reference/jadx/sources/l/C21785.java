package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBJ8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21785 extends C13715 {
    @Override // l.C13715, l.AbstractC14730
    /* JADX INFO: renamed from: ܶ */
    public final String mo2863() {
        return "#cdata";
    }

    @Override // l.C13715, l.AbstractC14730
    /* JADX INFO: renamed from: ۙ */
    public final void mo2842(Appendable appendable, int i, C19669 c19669) throws IOException {
        appendable.append("<![CDATA[").append(m28139());
    }

    @Override // l.C13715, l.AbstractC14730
    /* JADX INFO: renamed from: ܰ */
    public final void mo2861(Appendable appendable, int i, C19669 c19669) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new C14025(e);
        }
    }

    @Override // l.C13715, l.AbstractC14730
    /* JADX INFO: renamed from: clone */
    public final Object mo2874clone() {
        return (C21785) super.mo2874clone();
    }

    @Override // l.C13715, l.AbstractC14730
    /* JADX INFO: renamed from: clone */
    public final C13715 mo2874clone() {
        return (C21785) super.mo2874clone();
    }

    @Override // l.C13715, l.AbstractC14730
    /* JADX INFO: renamed from: clone */
    public final AbstractC14730 mo2874clone() {
        return (C21785) super.mo2874clone();
    }
}
