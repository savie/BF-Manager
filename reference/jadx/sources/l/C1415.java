package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBJ8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1415 extends C12513 {
    @Override // l.C12513, l.AbstractC17734
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String mo5151() {
        return "#cdata";
    }

    @Override // l.C12513, l.AbstractC17734
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5150(Appendable appendable, int i, C7381 c7381) throws IOException {
        appendable.append("<![CDATA[").append(m56171());
    }

    @Override // l.C12513, l.AbstractC17734
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo5152(Appendable appendable, int i, C7381 c7381) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new C6636(e);
        }
    }

    @Override // l.C12513, l.AbstractC17734
    /* JADX INFO: renamed from: clone */
    public final Object mo5153clone() {
        return (C1415) super.mo5153clone();
    }

    @Override // l.C12513, l.AbstractC17734
    /* JADX INFO: renamed from: clone */
    public final C12513 mo5153clone() {
        return (C1415) super.mo5153clone();
    }

    @Override // l.C12513, l.AbstractC17734
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final AbstractC17734 mo5153clone() {
        return (C1415) super.mo5153clone();
    }
}
