package l;

/* JADX INFO: renamed from: l.ۤ᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7S4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11095 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final AbstractC8639 f34984 = C12324.m30740(EnumC20046.LIST_ITEM_OPEN_TAG, EnumC20046.PARAGRAPH_OPEN_TAG, EnumC20046.HEADER_OPEN_TAG);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f34986;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f34988;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f34989;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f34990;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f34991;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f34993;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f34995;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C15570 f34997;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f34987 = new StringBuilder();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23030 f34994 = new C23030();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23030 f34996 = new C23030();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23030 f34985 = new C23030();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public EnumC22284 f34992 = EnumC22284.NONE;

    public C11095(int i) {
        this.f34995 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28019() {
        EnumC22284 enumC22284 = EnumC22284.WHITESPACE;
        EnumC22284 enumC22285 = this.f34992;
        if (enumC22284.compareTo(enumC22285) < 0) {
            enumC22284 = enumC22285;
        }
        this.f34992 = enumC22284;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28020(C15570 c15570) {
        this.f34997 = c15570;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28034() {
        this.f34987.append("/**");
        m28011(EnumC5130.AUTO_INDENT);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m28023() {
        StringBuilder sb = this.f34987;
        sb.append("\n");
        m28010(this.f34995 + 1);
        sb.append("*/");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m28028(C15570 c15570) {
        this.f34991 = false;
        this.f34994.m51934();
        this.f34996.m51934();
        this.f34985.m51934();
        if (this.f34993) {
            if (!this.f34988) {
                m28014();
            } else {
                this.f34988 = false;
                m28012();
            }
        }
        m28013(c15570);
        this.f34988 = true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m28026(C15570 c15570) {
        m28014();
        m28013(c15570);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m28022(C15570 c15570) {
        m28013(c15570);
        m28014();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m28030(C15570 c15570) {
        m28014();
        m28013(c15570);
        this.f34991 = false;
        this.f34996.m51935();
        this.f34985.m51935();
        m28012();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28025(C15570 c15570) {
        m28012();
        this.f34994.m51931();
        this.f34996.m51931();
        m28013(c15570);
        this.f34985.m51931();
        m28014();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m28040(C15570 c15570) {
        m28012();
        boolean z = this.f34991;
        C23030 c23030 = this.f34994;
        if (z) {
            this.f34991 = false;
            c23030.m51931();
        }
        m28013(c15570);
        this.f34991 = true;
        c23030.m51935();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m28021(C15570 c15570) {
        m28014();
        m28013(c15570);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m28027(C15570 c15570) {
        m28013(c15570);
        m28014();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m28038(C15570 c15570) {
        if (this.f34993) {
            m28014();
            m28013(c15570);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28035(C15570 c15570) {
        m28014();
        m28013(c15570);
        m28014();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m28033(C15570 c15570) {
        m28014();
        m28013(c15570);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m28017(C15570 c15570) {
        m28013(c15570);
        m28014();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m28032(C15570 c15570) {
        m28013(c15570);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m28037(C15570 c15570) {
        m28013(c15570);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m28018(C15570 c15570) {
        m28014();
        m28013(c15570);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m28039(C15570 c15570) {
        m28013(c15570);
        m28014();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m28029(C15570 c15570) {
        m28036();
        m28010(this.f34990);
        m28013(c15570);
        m28012();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28016(C15570 c15570) {
        m28012();
        m28013(c15570);
        m28012();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m28024(C15570 c15570) {
        m28013(c15570);
        m28012();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m28036() {
        m28011(EnumC5130.NO_AUTO_INDENT);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m28031(C15570 c15570) {
        m28013(c15570);
    }

    public final String toString() {
        return this.f34987.toString();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m28014() {
        EnumC22284 enumC22284 = EnumC22284.BLANK_LINE;
        EnumC22284 enumC22285 = this.f34992;
        if (enumC22284.compareTo(enumC22285) < 0) {
            enumC22284 = enumC22285;
        }
        this.f34992 = enumC22284;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m28012() {
        EnumC22284 enumC22284 = EnumC22284.NEWLINE;
        EnumC22284 enumC22285 = this.f34992;
        if (enumC22284.compareTo(enumC22285) < 0) {
            enumC22284 = enumC22285;
        }
        this.f34992 = enumC22284;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m28013(C15570 c15570) {
        if (this.f34997 != null) {
            m28012();
        }
        EnumC22284 enumC22284 = this.f34992;
        EnumC22284 enumC22285 = EnumC22284.BLANK_LINE;
        if (enumC22284 == enumC22285 && (this.f34985.m51936() || this.f34988)) {
            this.f34992 = EnumC22284.NEWLINE;
        }
        EnumC22284 enumC22286 = this.f34992;
        StringBuilder sb = this.f34987;
        if (enumC22286 != enumC22285) {
            if (enumC22286 == EnumC22284.NEWLINE) {
                m28011(EnumC5130.AUTO_INDENT);
                this.f34992 = EnumC22284.NONE;
            }
        } else {
            sb.append("\n");
            m28010(this.f34995 + 1);
            sb.append("*");
            m28011(EnumC5130.AUTO_INDENT);
            this.f34992 = EnumC22284.NONE;
        }
        int i = this.f34992 == EnumC22284.WHITESPACE ? 1 : 0;
        if (!this.f34986 && c15570.m37288() + i > this.f34989) {
            m28011(EnumC5130.AUTO_INDENT);
        }
        if (!this.f34986 && i != 0) {
            sb.append(" ");
            this.f34989--;
        }
        C15570 c15571 = this.f34997;
        if (c15571 != null) {
            sb.append(c15571.m37289());
            this.f34997 = null;
            this.f34990 = m28015();
            m28012();
            m28013(c15570);
            return;
        }
        sb.append(c15570.m37289());
        if (!f34984.contains(c15570.m37287())) {
            this.f34986 = false;
        }
        this.f34989 -= c15570.m37288();
        this.f34992 = EnumC22284.NONE;
        this.f34993 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28011(EnumC5130 enumC5130) {
        StringBuilder sb = this.f34987;
        sb.append("\n");
        int i = this.f34995;
        m28010(i + 1);
        sb.append("*");
        m28010(1);
        this.f34989 = 97 - i;
        if (enumC5130 == EnumC5130.AUTO_INDENT) {
            m28010(m28015());
            this.f34989 -= m28015();
        }
        this.f34986 = true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m28015() {
        int iM51933 = (this.f34996.m51933() * 2) + (this.f34994.m51933() * 4);
        return this.f34988 ? iM51933 + 4 : iM51933;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28010(int i) {
        String string;
        if (i < 0) {
            throw new IllegalArgumentException(C13645.m33382(i, "count is negative: "));
        }
        if (i != 0) {
            string = " ";
            if (i != 1) {
                if (1 > Integer.MAX_VALUE / i) {
                    throw new OutOfMemoryError(C14442.m34864(i, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(i);
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        } else {
            string = "";
        }
        this.f34987.append(string);
    }
}
