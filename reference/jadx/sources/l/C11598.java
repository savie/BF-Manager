package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8V9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11598 extends AbstractC11202 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f38967;

    @Override // l.AbstractC11202, l.AbstractC14730
    /* JADX INFO: renamed from: ۖ */
    public final /* bridge */ /* synthetic */ int mo2831() {
        return 0;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ܰ */
    public final void mo2861(Appendable appendable, int i, C19669 c19669) {
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ܶ */
    public final String mo2863() {
        return "#declaration";
    }

    @Override // l.AbstractC11202, l.AbstractC14730
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC14730 mo2867() {
        return this;
    }

    public C11598(String str, boolean z) {
        C5557.m15341((Object) str);
        this.f37918 = str;
        this.f38967 = z;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۙ */
    public final void mo2842(Appendable appendable, int i, C19669 c19669) throws IOException {
        Appendable appendableAppend = appendable.append("<");
        boolean z = this.f38967;
        appendableAppend.append(z ? "!" : "?").append(m28139());
        C15436 c15436Mo2839 = mo2839();
        c15436Mo2839.getClass();
        int i2 = 0;
        while (true) {
            if (i2 < c15436Mo2839.f50306 && C15436.m36927(c15436Mo2839, c15436Mo2839.f50305[i2])) {
                i2++;
            } else {
                if (i2 >= c15436Mo2839.f50306) {
                    break;
                }
                C6968 c6968 = new C6968(c15436Mo2839.f50305[i2], (String) c15436Mo2839.f50304[i2], c15436Mo2839);
                int i3 = i2 + 1;
                String key = c6968.getKey();
                String value = c6968.getValue();
                if (!key.equals("#declaration")) {
                    appendable.append(' ');
                    appendable.append(key);
                    if (!value.isEmpty()) {
                        appendable.append("=\"");
                        C17551.m40822(appendable, value, c19669, true, false, false, false);
                        appendable.append('\"');
                    }
                }
                i2 = i3;
            }
        }
        appendable.append(z ? "!" : "?").append(">");
    }

    @Override // l.AbstractC14730
    public final String toString() {
        return mo26643();
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: clone */
    public final Object mo2874clone() {
        return (C11598) super.mo2874clone();
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: clone */
    public final AbstractC14730 mo2874clone() {
        return (C11598) super.mo2874clone();
    }
}
